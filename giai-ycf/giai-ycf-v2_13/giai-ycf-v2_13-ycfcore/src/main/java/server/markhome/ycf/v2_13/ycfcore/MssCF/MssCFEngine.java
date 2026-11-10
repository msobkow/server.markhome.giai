/*
 *  MSS Code Factory YCFCore 2.13 MssYCF
 *
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycfcore.MssYCF;

import java.util.*;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

public abstract class MssYCFEngine
extends YCFGenKbSchemaObj
{
	public final static String		LinkName = "MssYCFEngine";
	public final static String		LinkVersion = "2.13.42-alpha15-202611010900";

	public final static String		GeneratorName = "MssYCFEngine";
	public final static String		GeneratorVersion = LinkVersion;

	protected static boolean		debugMode = false;

	protected IYCFGenKbGelCacheObj	gelCache = null;

	protected static ArrayList<MssYCFGenContext> contextStack = new ArrayList<>();

	public static MssYCFGenContext pushContext(MssYCFGenContext value) {
		if (value != null) {
			contextStack.add(value);
			return(value);
		}
		else {
			if (!contextStack.isEmpty()) {
				return(contextStack.getLast());
			}
			else {
				return(null);
			}
		}
	}

	public static MssYCFGenContext popContext() {
		MssYCFGenContext retval;
		if (!contextStack.isEmpty()) {
			retval = contextStack.getLast();
			contextStack.removeLast();
		}
		else {
			retval = null;
		}
		return(retval);
	}

	public IYCFGenKbGelCacheObj getGelCache() {
		if( gelCache == null ) {
			IYCFGenKbGelCacheObj cacheObj = (IYCFGenKbGelCacheObj)( getGelCacheTableObj().newInstance() );
			IYCFGenKbGelCacheEditObj cacheEdit = (IYCFGenKbGelCacheEditObj)( cacheObj.beginEdit() );
			IYCFGenKbTenantObj mySecTenant = getSecTenant();
			cacheEdit.setRequiredOwnerTenant( mySecTenant );
			gelCache = (IYCFGenKbGelCacheObj)( cacheEdit.create() );
			cacheEdit = null;
		}
		return( gelCache );
	}

	public void setGelCache( IYCFGenKbGelCacheObj value ) {
		if( gelCache != value ) {
			gelCache = value;
		}
	}

	public static boolean getDebugMode() {
		return( debugMode );
	}

	public static void enableDebugMode() {
		debugMode = true;
	}

	public static void disableDebugMode() {
		debugMode = false;
	}

	IYCFGenKbTenantObj internalTenant = null;

	public abstract String fixGenDefName( String rawName );
	public abstract void bootstrapDefClasses();
	public abstract void bootstrapFirst();
	public abstract void bootstrapBindings();
	public abstract void bootstrapIterators();
	public abstract void bootstrapReferences();

	protected MssYCFGelCompiler gelCompiler = null;

	public MssYCFGelCompiler getGelCompiler() {
		if( gelCompiler == null ) {
			gelCompiler = new MssYCFGelCompiler( this );
		}
		return( gelCompiler );
	}

	/**
	 *	Normally you'll want to overload this.
	 */
	public String getAnyClassName() {
		return( "Object" );
	}

	public IYCFGenKbDefClassObj bootstrapDefClass( String name, IYCFGenKbDefClassObj baseDefClass ) {
		IYCFGenKbDefClassTableObj tblDefClass = getDefClassTableObj();
		IYCFGenKbDefClassObj defClass = tblDefClass.readDefClassByNameIdx( name );
		if( defClass == null ) {
			defClass = tblDefClass.newInstance();
			IYCFGenKbDefClassEditObj editDefClass = defClass.beginEdit();
			editDefClass.setRequiredName( name );
			editDefClass.setOptionalParentBaseDefClass( baseDefClass );
			defClass = editDefClass.create();
			editDefClass = null;
		}
		return( defClass );
	}

	/**
	 *	Get the display name for the engine.
	 *	<p>
	 *	Overload this with proper tool name.
	 */
	public String getGeneratorName()
	{
		return( GeneratorName );
	}

	public void libInitTools()
	{
		defineTool( "any" );
	}

	public void libInitToolSets()
	{
		defineToolSet( "any" );
	}


	protected TreeMap<YCFGenKbDefClassPKey, TreeMap<YCFGenKbDefClassPKey,Boolean>> derivationMap = null;


	public void libInitDerivationMap()
	{
		if( derivationMap != null ) {
			return;
		}

		derivationMap = new TreeMap<YCFGenKbDefClassPKey, TreeMap<YCFGenKbDefClassPKey,Boolean>>();

		IYCFGenKbDefClassObj defClass;
		IYCFGenKbDefClassObj inhClass;
		Boolean boolTrue = Boolean.valueOf( true );
		TreeMap<YCFGenKbDefClassPKey,Boolean> subMap;
		Iterator<IYCFGenKbDefClassObj> defClassIter = getDefClassTableObj().readAllDefClass().iterator();
		while( defClassIter.hasNext() ) {
			defClass = defClassIter.next();
			subMap = new TreeMap<YCFGenKbDefClassPKey,Boolean>();
			derivationMap.put( defClass.getPKey(), subMap );
			inhClass = defClass;
			while( inhClass != null ) {
				subMap.put( inhClass.getPKey(), boolTrue );
				inhClass = inhClass.getOptionalParentBaseDefClass();
			}
		}
	}


	public boolean derivesFrom( IYCFGenKbDefClassObj obj, IYCFGenKbDefClassObj target )
	{
		// AnyObj is always inherited
		if( target == null ) {
			return( true );
		}

		TreeMap<YCFGenKbDefClassPKey, Boolean> subMap = derivationMap.get( obj.getPKey() );
		if( subMap == null ) {
			throw new YCFLibRuntimeException( getClass(), "derivesFrom", "Could not find subMap for DefClass" + obj.getRequiredName() );
		}

		Boolean entry = subMap.get( target.getPKey() );
		if( entry != null ) {
			return( true );
		}
		else {
			return( false );
		}
	}

	protected TreeMap<YCFGenKbToolSetPKey, TreeMap<String,IYCFGenKbGenItemObj>> toolSetRuleMap = null;


	public void initToolSetRuleMap() {
		if( toolSetRuleMap != null ) {
			return;
		}

		libInitDerivationMap();

		log.message( "Initializing tool set rule map" );

		toolSetRuleMap = new TreeMap<YCFGenKbToolSetPKey, TreeMap<String, IYCFGenKbGenItemObj>>();

		IYCFGenKbToolSetObj toolSet;
		Iterator<IYCFGenKbToolSetObj> toolSetIter = getToolSetTableObj().readAllToolSet().iterator();
		while( toolSetIter.hasNext() ) {
			toolSet = toolSetIter.next();
			initRuleMap( toolSet );
		}

		log.message( "Tool set rule map initialized" );
	}


	private class SortByProbeOrder implements Comparator {
		MssYCFEngine engine;

		public SortByProbeOrder( MssYCFEngine ref) {
			engine = ref;
		}

		public int compare(Object arg0, Object arg1) {
			IYCFGenKbGenItemObj lhs = (IYCFGenKbGenItemObj)arg0;
			IYCFGenKbGenItemObj rhs = (IYCFGenKbGenItemObj)arg1;
			IYCFGenKbDefClassObj lhsScope = lhs.getOptionalLookupScopeDef();
			IYCFGenKbDefClassObj rhsScope = rhs.getOptionalLookupScopeDef();
			IYCFGenKbDefClassObj lhsGenDef;
			IYCFGenKbDefClassObj rhsGenDef;
			if( lhsScope == rhsScope ) {
				lhsGenDef = lhs.getRequiredLookupGenDef();
				rhsGenDef = rhs.getRequiredLookupGenDef();
				if( lhsGenDef == rhsGenDef ) {
					return( 0 );
				}
				else if( engine.derivesFrom( lhsGenDef, rhsGenDef ) ) {
					return( -1 );
				}
				else if( engine.derivesFrom( rhsGenDef, lhsGenDef ) ) {
					return( 1 );
				}
				else {
					return( 0 );
				}
			}
			else if( lhsScope == null ) {
				return( -1 );
			}
			else if( rhsScope == null ) {
				return( 1 );
			}
			else {
				if( engine.derivesFrom( lhsScope, rhsScope ) ) {
					return( -1 );
				}
				else if( engine.derivesFrom( rhsScope, lhsScope ) ) {
					return( 1 );
				}
				else {
					lhsGenDef = lhs.getRequiredLookupGenDef();
					rhsGenDef = rhs.getRequiredLookupGenDef();
					if( lhsGenDef == rhsGenDef ) {
						return( 0 );
					}
					else if( engine.derivesFrom( lhsGenDef, rhsGenDef ) ) {
						return( -1 );
					}
					else if( engine.derivesFrom( rhsGenDef, lhsGenDef ) ) {
						return( 1 );
					}
					else {
						return( 0 );
					}
				}
			}
		}
	}


	private void initRuleMap( IYCFGenKbToolSetObj toolSet ) {
		TreeMap<String,IYCFGenKbGenItemObj> subMap = toolSetRuleMap.get( toolSet.getPKey() );
		if( subMap != null ) {
			return;
		}

		log.message( "Initializing rule map for tool set " + toolSet.getRequiredName() );

		// Build a list of the rules in the set grouped by name
		TreeMap<String,Collection<IYCFGenKbGenItemObj>> rulesByName = new TreeMap<String,Collection<IYCFGenKbGenItemObj>>();
		Collection<IYCFGenKbGenItemObj> cltn;
		Iterator<IYCFGenKbGenItemObj> genItemIter = getGenItemTableObj().readGenItemByToolSetIdx( toolSet.getRequiredId() ).iterator();
		IYCFGenKbGenItemObj genItem;
		while( genItemIter.hasNext() ) {
			genItem = genItemIter.next();
			cltn = rulesByName.get( genItem.getRequiredName() );
			if( cltn == null ) {
				cltn = new ArrayList<IYCFGenKbGenItemObj>();
				rulesByName.put( genItem.getRequiredName(), cltn );
			}
			cltn.add( genItem );
		}

		// Instantiate a subMap by name to hold the head entries of the sorted lists below
		subMap = new TreeMap<String,IYCFGenKbGenItemObj>();

		// For each name, build an array of the entries and sort based on probe sequence
		// Iterate through the probe-sequenced array and establish the linkages
		// Add the head of the linkage list to the subMap
		IYCFGenKbGenItemObj[] genItemArray;
		int idx;
		IYCFGenKbGenItemObj probeNext;
		IYCFGenKbGenItemEditObj edit;
		@SuppressWarnings("unchecked")
		Comparator<IYCFGenKbGenItemObj> sortByProbeOrder = new SortByProbeOrder( this );
		Iterator<Collection<IYCFGenKbGenItemObj>> cltnIter = rulesByName.values().iterator();
		while( cltnIter.hasNext() ) {
			cltn = cltnIter.next();
			genItemArray = new IYCFGenKbGenItemObj[ cltn.size() ];
			genItemIter = cltn.iterator();
			idx = 0;
			while( genItemIter.hasNext() ) {
				genItemArray[idx++] = genItemIter.next();
			}
			Arrays.sort( genItemArray, sortByProbeOrder );

			int len = genItemArray.length - 1;
			for( idx = 0; idx < len; idx ++ ) {
				genItem = genItemArray[ idx ];
				probeNext = genItemArray[ idx + 1];
				edit = genItem.beginEdit();
				edit.setOptionalLookupProbe( probeNext );
				edit.update();
				edit = null;
			}

			genItem = genItemArray[0];
			subMap.put( genItem.getRequiredName(), genItem );
		}

		// Register the subMap with the tool set's rule map
		toolSetRuleMap.put( toolSet.getPKey(), subMap );
	}



	public void init( String generatingBuild, IYCFGenKbSchemaObj argYCFGenKbSchema, IYCFGenKbTenantObj argInternalTenant, String strRootGenDir )
	{
		genkbSchema = argYCFGenKbSchema;
		setBackingStore( genkbSchema.getBackingStore() );
		internalTenant = argInternalTenant;
		rootGenDir = strRootGenDir;

	//	Construct the initial contents of the knowledge base,
	//	including the tools, toolsets, and definition class names.

		bootstrapDefClasses();
		libInitRuleTypes();
		libInitTools();
		libInitToolSets();
		genContext = null;

	//	Bootstrap the engine internals first

		bootstrapFirst();
		bootstrapBindings();
		bootstrapIterators();
		bootstrapReferences();
	}

	public IYCFGenKbDefClassTableObj getDefClassTableObj() {
		if( defClassTableObj == null ) {
			defClassTableObj = new MssYCFDefClassTableObj( (MssYCFEngine)this );
		}
		return( defClassTableObj );
	}

	public IYCFGenKbGenBindTableObj getGenBindTableObj() {
		if( genBindTableObj == null ) {
			genBindTableObj = new MssYCFGenBindTableObj( (MssYCFEngine)this );
		}
		return( genBindTableObj );
	}

	public IYCFGenKbGenFileTableObj getGenFileTableObj() {
		if( genFileTableObj == null ) {
			genFileTableObj = new MssYCFGenFileTableObj( (MssYCFEngine)this );
		}
		return( genFileTableObj );
	}

	public IYCFGenKbGenItemTableObj getGenItemTableObj() {
		if( genItemTableObj == null ) {
			genItemTableObj = new MssYCFGenItemTableObj( (MssYCFEngine)this );
		}
		return( genItemTableObj );
	}

	public IYCFGenKbGenIteratorTableObj getGenIteratorTableObj() {
		if( genIteratorTableObj == null ) {
			genIteratorTableObj = new MssYCFGenIteratorTableObj( (MssYCFEngine)this );
		}
		return( genIteratorTableObj );
	}

	public IYCFGenKbGenReferenceTableObj getGenReferenceTableObj() {
		if( genReferenceTableObj == null ) {
			genReferenceTableObj = new MssYCFGenReferenceTableObj( (MssYCFEngine)this );
		}
		return( genReferenceTableObj );
	}

	public IYCFGenKbGenRuleTableObj getGenRuleTableObj() {
		if( genRuleTableObj == null ) {
			genRuleTableObj = new MssYCFGenRuleTableObj( (MssYCFEngine)this );
		}
		return( genRuleTableObj );
	}

	public IYCFGenKbGenTruncTableObj getGenTruncTableObj() {
		if( genTruncTableObj == null ) {
			genTruncTableObj = new MssYCFGenTruncTableObj( (MssYCFEngine)this );
		}
		return( genTruncTableObj );
	}

	public IYCFGenKbRuleCartTableObj getRuleCartTableObj() {
		if( ruleCartTableObj == null ) {
			ruleCartTableObj = new MssYCFRuleCartTableObj( (MssYCFEngine)this );
		}
		return( ruleCartTableObj );
	}

	public IYCFGenKbRuleTypeTableObj getRuleTypeTableObj() {
		if( ruleTypeTableObj == null ) {
			ruleTypeTableObj = new MssYCFRuleTypeTableObj( (MssYCFEngine)this );
		}
		return( ruleTypeTableObj );
	}

	public IYCFGenKbToolTableObj getToolTableObj() {
		if( toolTableObj == null ) {
			toolTableObj = new MssYCFToolTableObj( (MssYCFEngine)this );
		}
		return( toolTableObj );
	}

	public IYCFGenKbToolSetTableObj getToolSetTableObj() {
		if( toolSetTableObj == null ) {
			toolSetTableObj = new MssYCFToolSetTableObj( (MssYCFEngine)this );
		}
		return( toolSetTableObj );
	}

	public Calendar GenTimestamp = Calendar.getInstance();
	public String			GenTimestampString = null;

	public static long				GenNextSerializableUID = 0L;

	protected IYCFLibMessageLog log = null;
	public IYCFLibMessageLog getLog() {
		return( log );
	}

	public void setLog( IYCFLibMessageLog value ) {
		log = value;
	}

	private MssYCFGenContext	genContext = null;
	public MssYCFGenContext getGenContext() {
		return( genContext );
	}

	public void setGenContext( MssYCFGenContext value ) {
		genContext = value;
	}

	protected String rootGenDir = null;
	public String getRootGenDir() {
		return( rootGenDir );
	}

	protected IYCFGenKbSchemaObj genkbSchema = null;

	public IYCFGenKbSchemaObj getYCFGenKbSchema() {
		return (genkbSchema);
	}

	public MssYCFEngine() {
		super();
		defClassTableObj = null;
		genBindTableObj = null;
		genFileTableObj = null;
		genItemTableObj = null;
		genIteratorTableObj = null;
		genReferenceTableObj = null;
		genRuleTableObj = null;
		genTruncTableObj = null;
		ruleCartTableObj = null;
		ruleTypeTableObj = null;
		toolTableObj = null;
		toolSetTableObj = null;
	}

	protected MssYCFGenContextFactory genContextFactory = null;

	public MssYCFGenContextFactory getGenContextFactory() {
		if( genContextFactory == null )
		{
			genContextFactory = new MssYCFGenContextFactory();
		}
		return( genContextFactory );
	}

	public void setGenContextFactory( MssYCFGenContextFactory value ) {
		genContextFactory = value;
	}

	protected String targetRuleName = null;

	public String getTargetRuleName() {
		return( targetRuleName );
	}

	public void setTargetRuleName( String value ) {
		targetRuleName = value;
	}

	private IYCFGenKbRuleCartObj internalRuleCart = null;

	public IYCFGenKbRuleCartObj getInternalRuleCart() {
		if (internalRuleCart == null)
		{
			internalRuleCart = getRuleCartTableObj().newInstance();
			IYCFGenKbRuleCartEditObj editRuleCart = internalRuleCart.beginEdit();
			editRuleCart.setRequiredContainerTenant( internalTenant );
			editRuleCart.setRequiredName( "Internal" );
			internalRuleCart = editRuleCart.create();
			editRuleCart = null;
		}
		return (internalRuleCart);
	}

	public IYCFGenKbGenFileObj defineFile(
		String	definedNear,
		String	toolsetName,
		String	scopeDefClassName,
		String	genDefClassName,
		String	itemName,
		String	expansionBody,
		String	generateOnce,
		String	sourceBundle,
		String	moduleName,
		String	basePackageName,
		String	subPackageName,
		String	expansionClassName,
		String	expansionKeyName,
		String	expansionFileName )
	{
		final String S_ProcName = "MssYCFEngine.defineFile() ";
		if( definedNear == null ) {
			throw new YCFLibNullArgumentException( getClass(), "defineFile", 1, "definedNear" );
		}
		IYCFGenKbRuleCartObj ruleCart = getInternalRuleCart();
		IYCFGenKbGenFileObj genFile = getGenFileTableObj().newInstance();
		IYCFGenKbGenFileEditObj editFile = (IYCFGenKbGenFileEditObj)genFile.beginEdit();
		editFile.setRequiredLookupToolSet( getToolSetTableObj().readToolSetByNameIdx(toolsetName) );
		editFile.setRequiredDefinedNear( definedNear );
		if ((scopeDefClassName != null) && (scopeDefClassName.length() > 0))
		{
			if (scopeDefClassName.equals("*"))
			{
				scopeDefClassName = getAnyClassName();
			}
			else {
				scopeDefClassName = fixGenDefName( scopeDefClassName );
			}
			IYCFGenKbDefClassObj scopeDef = getDefClassTableObj().readDefClassByNameIdx(scopeDefClassName);
			if( scopeDef == null )
			{
				throw new RuntimeException( S_ProcName + "Could not resolve ScopeDef " + scopeDefClassName );
			}
			editFile.setOptionalLookupScopeDef( scopeDef );
		}
		else
		{
			editFile.setOptionalLookupScopeDef( null );
		}
		editFile.setRequiredContainerCartridge( ruleCart );
		editFile.setRequiredLookupRuleType( getRuleTypeTableObj().readRuleTypeByNameIdx("File") );

		genDefClassName = fixGenDefName( genDefClassName );
		IYCFGenKbDefClassObj genDef = getDefClassTableObj().readDefClassByNameIdx(genDefClassName);
		if( genDef == null )
		{
			throw new RuntimeException( S_ProcName + "Could not resolve GenDef " + genDefClassName );
		}
		editFile.setRequiredLookupGenDef( genDef );
		editFile.setRequiredName( itemName );
		editFile.setRequiredBody( expansionBody );
		editFile.setOptionalGenerateOnce( generateOnce );
		editFile.setOptionalSourceBundle( sourceBundle );
		editFile.setOptionalModuleName( moduleName );
		editFile.setOptionalBasePackageName( basePackageName );
		editFile.setOptionalSubPackageName( subPackageName );
		editFile.setOptionalExpansionClassName( expansionClassName );
		editFile.setOptionalExpansionKeyName( expansionKeyName );
		editFile.setOptionalExpansionFileName( expansionFileName );
		IYCFGenKbGenFileObj created = (IYCFGenKbGenFileObj)editFile.create();
		editFile = null;

		MssYCFGelCompiler compiler = getGelCompiler();
		YCFGenKbGenFileObj.getBodyBin( compiler, created );
		YCFGenKbGenFileObj.getSrcBundleBin( compiler, created );
		YCFGenKbGenFileObj.getModuleNameBin( compiler, created );
		YCFGenKbGenFileObj.getBasePackageBin( compiler, created );
		YCFGenKbGenFileObj.getSubPackageBin( compiler, created );
		YCFGenKbGenFileObj.getExpClassBin( compiler, created );
		YCFGenKbGenFileObj.getExpKeyNameBin( compiler, created );
		YCFGenKbGenFileObj.getExpFileNameBin( compiler, created );

		return (created);
	}


	public IYCFGenKbGenRuleObj defineRule(
		String	definedNear,
		String	toolsetName,
		String	scopeDefClassName,
		String	genDefClassName,
		String	itemName,
		String	expansionBody )
	{
		final String S_ProcName = "defineRule";
		if( definedNear == null ) {
			throw new YCFLibNullArgumentException( getClass(), S_ProcName, 1, "definedNear" );
		}
		if( toolsetName == null ) {
			throw new YCFLibNullArgumentException( getClass(), S_ProcName, 2, "toolsetName" );
		}
		if( ( genDefClassName == null ) || ( genDefClassName.length() <= 0 ) )  {
			throw new YCFLibEmptyArgumentException( getClass(), S_ProcName, 4, "genDefClassName" );
		}
		if( ( itemName == null ) || ( itemName.length() <= 0 ) ) {
			throw new YCFLibEmptyArgumentException( getClass(), S_ProcName, 5, "itemName" );
		}
		if( expansionBody == null ) {
			throw new YCFLibNullArgumentException( getClass(), S_ProcName, 6, "expansionBody" );
		}

		IYCFGenKbRuleCartObj ruleCart = getInternalRuleCart();
		assert ruleCart != null : "ruleCart is null!";
		IYCFGenKbGenRuleObj genRule = getGenRuleTableObj().newInstance();
		IYCFGenKbGenRuleEditObj editRule = (IYCFGenKbGenRuleEditObj)genRule.beginEdit();
		editRule.setRequiredDefinedNear( definedNear );
		IYCFGenKbToolSetObj toolset = getToolSetTableObj().readToolSetByNameIdx( toolsetName );
		assert toolset != null : "Could not resolve toolset " + toolsetName;
		editRule.setRequiredLookupToolSet( toolset );
		if ((scopeDefClassName != null) && (scopeDefClassName.length() > 0)) {
			if (scopeDefClassName.equals("*")) {
				scopeDefClassName = getAnyClassName();
			}
			else {
				scopeDefClassName = fixGenDefName( scopeDefClassName );
			}
			IYCFGenKbDefClassObj scopeDef = getDefClassTableObj().readDefClassByNameIdx( scopeDefClassName );
			if( scopeDef == null ) {
				throw new YCFLibRuntimeException( getClass(), S_ProcName, "Could not resolve ScopeDef " + scopeDefClassName );
			}
			editRule.setOptionalLookupScopeDef( scopeDef );
		}
		else {
			editRule.setOptionalLookupScopeDef( null );
		}
		editRule.setRequiredContainerCartridge( ruleCart );
		IYCFGenKbRuleTypeObj ruleType = getRuleTypeTableObj().readRuleTypeByNameIdx( "Rule" );
		assert ruleType != null : "ruleType \"Rule\" could not be resolved";
		editRule.setRequiredLookupRuleType( ruleType );
		genDefClassName = fixGenDefName( genDefClassName );
		assert genDefClassName != null && genDefClassName.length() > 0 : "fixed genDefClassName is null or empty";
		IYCFGenKbDefClassObj genDef = getDefClassTableObj().readDefClassByNameIdx(genDefClassName);
		if( genDef == null ) {
			throw new YCFLibRuntimeException( getClass(), S_ProcName, "Could not resolve GenDef " + genDefClassName );
		}
		editRule.setRequiredLookupGenDef( genDef );
		editRule.setRequiredName( itemName );
		editRule.setRequiredBody( expansionBody );
		IYCFGenKbGenRuleObj created = (IYCFGenKbGenRuleObj)editRule.create();
		editRule = null;

		MssYCFGelCompiler compiler = getGelCompiler();

		YCFGenKbGenRuleObj.getBodyBin( compiler, created );

		return ( created );
	}


	public IYCFGenKbGenTruncObj defineTrunc(
		String	definedNear,
		String	toolsetName,
		String	scopeDefClassName,
		String	genDefClassName,
		String	itemName,
		String	expansionBody,
		int		truncAt  )
	{
		final String S_ProcName = "MssYCFEngine.defineTrunc() ";
		if( definedNear == null ) {
			throw new YCFLibNullArgumentException( getClass().getSimpleName(), "defineTrunc", 1, "definedNear" );
		}
		IYCFGenKbRuleCartObj ruleCart = getInternalRuleCart();
		IYCFGenKbGenTruncObj genTrunc = getGenTruncTableObj().newInstance();
		IYCFGenKbGenTruncEditObj editTrunc = (IYCFGenKbGenTruncEditObj)genTrunc.beginEdit();
		editTrunc.setRequiredDefinedNear( definedNear );
		editTrunc.setRequiredLookupToolSet( getToolSetTableObj().readToolSetByNameIdx(toolsetName) );
		if ((scopeDefClassName != null) && (scopeDefClassName.length() > 0))
		{
			if (scopeDefClassName.equals("*"))
			{
				scopeDefClassName = getAnyClassName();
			}
			else {
				scopeDefClassName = fixGenDefName( scopeDefClassName );
			}
			IYCFGenKbDefClassObj scopeDef = getDefClassTableObj().readDefClassByNameIdx(scopeDefClassName);
			if( scopeDef == null )
			{
				throw new RuntimeException( S_ProcName + "Could not resolve ScopeDef " + scopeDefClassName );
			}
			editTrunc.setOptionalLookupScopeDef( scopeDef );
		}
		else
		{
			editTrunc.setOptionalLookupScopeDef( null );
		}
		editTrunc.setRequiredContainerCartridge( ruleCart );
		editTrunc.setRequiredLookupRuleType(
			getRuleTypeTableObj().readRuleTypeByNameIdx("Trunc") );
		genDefClassName = fixGenDefName( genDefClassName );
		IYCFGenKbDefClassObj genDef = getDefClassTableObj().readDefClassByNameIdx(genDefClassName);
		if( genDef == null )
		{
			throw new RuntimeException( S_ProcName + "Could not resolve GenDef " + genDefClassName );
		}
		editTrunc.setRequiredLookupGenDef( genDef );
		editTrunc.setRequiredName( itemName );
		editTrunc.setRequiredBody( expansionBody );
		editTrunc.setRequiredTruncateAt( truncAt );
		IYCFGenKbGenTruncObj created = (IYCFGenKbGenTruncObj)editTrunc.create();
		editTrunc = null;

		MssYCFGelCompiler compiler = getGelCompiler();
		YCFGenKbGenTruncObj.getBodyBin( compiler, created );

		return (created);
	}


	/**
	 *	Find an expansion item in the engine based on the generation context
	 *	and an item name.
	 *	<p>
	 *	Finding the proper expansion item can be CPU intensive as I have
	 *	not tuned it by implementing any form of hashing or BTree keys.
	 *	When I have time...
	 *	<p>
	 *	Generally, the approach is to start with the classes of the scope
	 *	and generation definitions of the current context as the search
	 *	keys.  The initial toolset is that of the context.
	 *	<p>
	 *	We gradually search using the superclasses of the generation object,
	 *	the superclasses of the scope object, and by reducing the detail
	 *	level of the toolset.  If no match is found, $itemName$ is
	 *	eventually returned.
	 *
	 *	@param		genContext		MssYCFGenContext
	 *	@param		itemName		String
	 *	@return	String				Either the string returned by
	 *								expanding the match item or $itemName$
	 */
	public IYCFGenKbGenItemObj findContextItem(
		MssYCFGenContext	genContext,
		String			itemName )
	{
//		IYCFGenKbGenItemObj	matchItem;
//		int					lastSeparator;
//		String				priorNames;
//		String				toolNames = null;
//		String			 	eliminatingToolName = null;

		final String S_ProcName = "MssYCFEngine.findContextItem() ";

		//	Validate parameters

		if( ( itemName == null ) || ( 0 == itemName.length() ) ) {
			throw new RuntimeException(S_ProcName + "itemName is null or empty");
		}

		IYCFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			return( null );
		}

		MssYCFDefClassObj genClass = (MssYCFDefClassObj)(getDefClassTableObj().readDefClassByNameIdx(
			genDef.getGenDefName() ));
		if( genClass.getRequiredName().equals( "Object" ) ) {
			genClass = null;
		}

		IYCFLibAnyObj scopeDef = genContext.getScopeDef();
		MssYCFDefClassObj scopeClass;
		if( scopeDef != null ) {
			scopeClass = (MssYCFDefClassObj)(getDefClassTableObj().readDefClassByNameIdx(
				scopeDef.getGenDefName() ));
			if( scopeClass.getRequiredName().equals( "Object" ) ) {
				scopeClass = null;
			}
		}
		else {
			scopeClass = null;
		}

		TreeMap<String,IYCFGenKbGenItemObj> subMap = this.toolSetRuleMap.get( genContext.getRequiredLookupToolSet().getPKey() );
		IYCFGenKbGenItemObj genItem = subMap.get( itemName );
		MssYCFDefClassObj genItemClass;
		MssYCFDefClassObj genItemScope;
		while( genItem != null ) {
			genItemClass = (MssYCFDefClassObj)genItem.getRequiredLookupGenDef();
			if( genItemClass.getRequiredName().equals( "Object" ) ) {
				genItemClass = null;
			}

			genItemScope = (MssYCFDefClassObj)genItem.getOptionalLookupScopeDef();
			if( ( genItemScope != null ) && genItemScope.getRequiredName().equals( "Object" ) ) {
				genItemScope = null;
			}

			if( derivesFrom( scopeClass, genItemScope ) ) {
				if( derivesFrom( genClass, genItemClass ) ) {
					return( genItem );
				}
				else {
					genItem = genItem.getOptionalLookupProbe();
				}
			}
			else {
				genItem = genItem.getOptionalLookupProbe();
			}
		}

		// The exact probe didn't work, so try pruning the toolset until there is no more to prune

		String toolsetName = genContext.getRequiredLookupToolSet().getRequiredName();
		int lastPlus = toolsetName.lastIndexOf( '+' );

		String inheritsFromName;
		String inheritsFromFirst;
		IYCFGenKbToolSetObj toolset;

		while( lastPlus >= 0 ) {

			inheritsFromName = toolsetName.substring( 0, lastPlus );
			inheritsFromFirst = toolsetName.substring( lastPlus + 1 );

			// First we probe the rules for the tool that is being trimmed from the search

			toolset = getToolSetTableObj().readToolSetByNameIdx( inheritsFromFirst );
			subMap = this.toolSetRuleMap.get( toolset.getPKey() );
			genItem = subMap.get( itemName );
			while( genItem != null ) {
				genItemClass = (MssYCFDefClassObj)genItem.getRequiredLookupGenDef();
				if( genItemClass.getRequiredName().equals( "Object" ) ) {
					genItemClass = null;
				}

				genItemScope = (MssYCFDefClassObj)genItem.getOptionalLookupScopeDef();
				if( ( genItemScope != null ) && genItemScope.getRequiredName().equals( "Object" ) ) {
					genItemScope = null;
				}

				if( derivesFrom( scopeClass, genItemScope ) ) {
					if( derivesFrom( genClass, genItemClass ) ) {
						return( genItem );
					}
					else {
						genItem = genItem.getOptionalLookupProbe();
					}
				}
				else {
					genItem = genItem.getOptionalLookupProbe();
				}
			}

			// Next we probe the rules for the remaining toolset after trimming a tool

			toolset = getToolSetTableObj().readToolSetByNameIdx( inheritsFromName );
			subMap = this.toolSetRuleMap.get( toolset.getPKey() );
			genItem = subMap.get( itemName );
			while( genItem != null ) {
				genItemClass = (MssYCFDefClassObj)genItem.getRequiredLookupGenDef();
				if( genItemClass.getRequiredName().equals( "Object" ) ) {
					genItemClass = null;
				}

				genItemScope = (MssYCFDefClassObj)genItem.getOptionalLookupScopeDef();
				if( ( genItemScope != null ) && genItemScope.getRequiredName().equals( "Object" ) ) {
					genItemScope = null;
				}

				if( derivesFrom( scopeClass, genItemScope ) ) {
					if( derivesFrom( genClass, genItemClass ) ) {
						return( genItem );
					}
					else {
						genItem = genItem.getOptionalLookupProbe();
					}
				}
				else {
					genItem = genItem.getOptionalLookupProbe();
				}
			}

			// If we still didn't find a match, we try to prune another toolset
			toolsetName = inheritsFromName;
			lastPlus = toolsetName.lastIndexOf( '+' );
		}

		// Finally we probe the "any" rules

		toolset = getToolSetTableObj().readToolSetByNameIdx( "any" );
		subMap = this.toolSetRuleMap.get( toolset.getPKey() );
		genItem = subMap.get( itemName );
		while( genItem != null ) {
			genItemClass = (MssYCFDefClassObj)genItem.getRequiredLookupGenDef();
			if( genItemClass.getRequiredName().equals( "Object" ) ) {
				genItemClass = null;
			}

			genItemScope = (MssYCFDefClassObj)genItem.getOptionalLookupScopeDef();
			if( ( genItemScope != null ) && genItemScope.getRequiredName().equals( "Object" ) ) {
				genItemScope = null;
			}

			if( derivesFrom( scopeClass, genItemScope ) ) {
				if( derivesFrom( genClass, genItemClass ) ) {
					return( genItem );
				}
				else {
					genItem = genItem.getOptionalLookupProbe();
				}
			}
			else {
				genItem = genItem.getOptionalLookupProbe();
			}
		}

		return( null );
	}


	/**
	 *	Generate all source code for the definition.
	 *
	 *	@param		buildString		String	The string that identifies the build being produced
	 *	@param		rootGenDir		String		The root generation directory
	 *	@param		anyDef			IYCFLibAnyObj	The definition to generate code for.
	 *	@param		toolsDesired	List<String>	The tools to generate code for
	 */
	public void generate(
		String					buildString,
		String					rootGenDir,
		IYCFLibAnyObj			anyDef,
		List<String>			toolsDesired,
		String					initialRuleName )
	{
		final String S_ProcName = "MssYCFEngine.generate() ";

		int						idx;
		int						num;
		String					toolsetName = null;
		IYCFGenKbGenItemObj		matchItem = null;
		MssYCFGenContext			genContext = null;
		String					generated = null;

		MssYCFToolSetObj			toolset = null;
		MssYCFDefClassObj		genDefClass = null;
		String					genDefClassName = null;

		//	Validate

		if( ( rootGenDir == null ) || ( rootGenDir.length() == 0 ) ) {
			throw new RuntimeException( S_ProcName + "rootGenDir is null or empty" );
		}

		if( anyDef == null ) {
			throw new RuntimeException(S_ProcName + "anyDef is null");
		}

		initToolSetRuleMap();

		//	Initialize

		GenNextSerializableUID = 0L;
		GenTimestamp = Calendar.getInstance();
		GenTimestampString = GenTimestamp.toString();

		//	LOOP each supported toolset

		Iterator<String> iterToolsDesired = toolsDesired.iterator();
		while( iterToolsDesired.hasNext() ) {

		//		Try to find an item for expanding the item.  This is the
		//		only case where the search does NOT broaden the scope of
		//		it's search until a match is found.  Such scoping is
		//		instead implemented by the expansion of the top level
		//		items which can then rely on scope broadening to complete
		//		their expansion.

			toolsetName = iterToolsDesired.next();

			toolset = null;
			genDefClass = null;
			genDefClassName = null;
			matchItem = null;

		//		Resolve the toolset

			toolset = (MssYCFToolSetObj)getToolSetTableObj().readToolSetByNameIdx(toolsetName);
			if (toolset == null) {
				throw new RuntimeException(S_ProcName + "Could not resolve toolset \"" + toolsetName + "\"");
			}

		//		Resolve the generation class

			genDefClassName = anyDef.getGenDefName();
			genDefClass = (MssYCFDefClassObj)getDefClassTableObj().readDefClassByNameIdx(genDefClassName);
			if (genDefClass == null) {
				throw new RuntimeException(S_ProcName + "Could not resolve gen DefClass \"" + genDefClassName + "\"");
			}

		//	  Probe knowledge base

			Short scopeDefId = null;
			matchItem = getGenItemTableObj().readGenItemByAltIdx(initialRuleName,
				 toolset.getRequiredId(),
				 scopeDefId,
				 genDefClass.getRequiredId());
			if (matchItem == null) {
				continue;
			}

		//		If we found an item, create a generation context for
		//		expanding the body of the item based on the definition
		//		being generated.

			genContext = getGenContextFactory().newGenContext( buildString,
				this,
				rootGenDir,
				toolsetName,
				null,
				anyDef.getGenDefName(),
				rootGenDir,
				anyDef,
				null );

		//		Generate the expansion of the item.  If the expansion
		//		returns a single-line string, we log it.

			if( matchItem instanceof MssYCFGenFileObj ) {
				if (debugMode) {
					System.err.println("Expand " + ((MssYCFGenFileObj)matchItem).getRequiredName());
				}
				generated = ((MssYCFGenFileObj)matchItem).expandBody( genContext );
			}
			else if (matchItem instanceof MssYCFGenTruncObj) {
				if (debugMode) {
					System.err.println("Expand " + ((MssYCFGenTruncObj)matchItem).getRequiredName());
				}
				generated = ((MssYCFGenTruncObj)matchItem).expandBody( genContext );
			}
			else if (matchItem instanceof MssYCFGenBindObj) {
				if (debugMode) {
					System.err.println("Expand " + ((MssYCFGenBindObj)matchItem).getRequiredName());
				}
				generated = ((MssYCFGenBindObj)matchItem).expandBody( genContext );
			}
			else if (matchItem instanceof MssYCFGenIteratorObj) {
				if (debugMode) {
					System.err.println("Expand " + ((MssYCFGenIteratorObj)matchItem).getRequiredName());
				}
				generated = ((MssYCFGenIteratorObj)matchItem).expandBody( genContext );
			}
			else if (matchItem instanceof MssYCFGenReferenceObj) {
				generated = ""; // ((YCFGenReferenceObj)matchItem).expandBody( genContext );
			}
			else if (matchItem instanceof MssYCFGenRuleObj) {
				if (debugMode) {
					System.err.println("Expand " + ((MssYCFGenRuleObj)matchItem).getRequiredName());
				}
				generated = ((MssYCFGenRuleObj)matchItem).expandBody( genContext );
			}
			else {
				throw new RuntimeException( S_ProcName + "Unsupported knowledge class " 
					+ matchItem.getClass().getSimpleName() );
			}
		}
	}

	/**
	 *	Get the version string for the engine.
	 */
	public String getGeneratorVersion() {
		return( GeneratorVersion );
	}



	public long getNextGenSerializableUID() {
		if( GenNextSerializableUID <= 0L ) {
			getGenTimestampString();
		}
		long uid = GenNextSerializableUID++;
		return( uid );
	}

	public String getNextGenSerializableUIDString() {
		long uid = getNextGenSerializableUID();
		String str = Long.toString(uid);
		return( str );
	}

	public String getGenTimestampString() {

		if( GenTimestamp == null ) {
			GenTimestamp = Calendar.getInstance();
			GenTimestampString = null;
			GenNextSerializableUID = // YYYYMMDDHHMI00001
				  (GenTimestamp.get(Calendar.YEAR) * 10000000000000L)
				+ ((GenTimestamp.get(Calendar.MONTH) + 1) * 100000000000L)
				+ (GenTimestamp.get(Calendar.DAY_OF_MONTH) * 1000000000L)
				+ (GenTimestamp.get(Calendar.HOUR) * 10000000L)
				+ (GenTimestamp.get(Calendar.MINUTE) * 100000L)
				+ 1L;
		}

		if( GenTimestampString == null ) {
			GenTimestampString = GenTimestamp.toString();
		}

		return( GenTimestampString );
	}

	public String getLinkName() {
		return( LinkName );
	}

	public String getLinkVersion() {
		return( LinkVersion );
	}

	/**
	 *	Initialize the rule type, toolset, scope class, genclass, and item name
	 *	of a generation item.
	 */
	protected void initGenItem(
		YCFGenKbGenItemEditObj	genItem,
		MssYCFRuleTypeObj   		ruleType,
		String					toolsetName,
		String					scopeDefClassName,
		String					genDefClassName,
		String					itemName )
	{
		final String			S_ProcName = "MssYCFEngine.initGenItem() ";

		MssYCFToolSetObj			toolset = null;
		MssYCFDefClassObj		defclassScope = null;
		MssYCFDefClassObj		defclassGenDef = null;

		toolset = (MssYCFToolSetObj)getToolSetTableObj().readToolSetByNameIdx(toolsetName);
		if (toolset == null) {
			throw new RuntimeException(S_ProcName + "Could not resolve toolset \"" + toolsetName + "\"");
		}

		if( ( scopeDefClassName != null ) && ( 0 < scopeDefClassName.length() ) ) {
			if (scopeDefClassName.equals("*")) {
				defclassScope = (MssYCFDefClassObj)getDefClassTableObj().readDefClassByNameIdx(getAnyClassName());
				if (defclassScope == null) {
					throw new RuntimeException(S_ProcName + "Could not resolve scope DefClass \"" + getAnyClassName() + "\"");
				}
			}
			else {
				scopeDefClassName = fixGenDefName( scopeDefClassName );
				defclassScope = (MssYCFDefClassObj)getDefClassTableObj().readDefClassByNameIdx(scopeDefClassName);
				if (defclassScope == null) {
					throw new RuntimeException(S_ProcName + "Could not resolve scope DefClass \"" + scopeDefClassName + "\"");
				}
			}
		}

		if( genDefClassName.equals( "*" ) ) {
			defclassGenDef = (MssYCFDefClassObj)getDefClassTableObj().readDefClassByNameIdx(getAnyClassName());
			if (defclassGenDef == null) {
				throw new RuntimeException(S_ProcName + "Could not resolve gen DefClass \"" + getAnyClassName() + "\"");
			}
		}
		else {
			genDefClassName = fixGenDefName( genDefClassName );
			defclassScope = (MssYCFDefClassObj)getDefClassTableObj().readDefClassByNameIdx(genDefClassName);
			if (defclassScope == null) {
				throw new RuntimeException(S_ProcName + "Could not resolve gen DefClass \"" + genDefClassName + "\"");
			}
		}

		genItem.setRequiredLookupRuleType( ruleType );
		genItem.setRequiredLookupToolSet( toolset );
		genItem.setOptionalLookupScopeDef( defclassScope );
		genItem.setRequiredLookupGenDef( defclassGenDef );
		genItem.setRequiredName( itemName );
	}

	public IYCFGenKbToolObj defineTool( String toolName )
	{
		IYCFGenKbToolObj tool;
		tool = getToolTableObj().readToolByNameIdx(toolName);
		if( tool == null ) {
			IYCFGenKbToolEditObj editTool;
			tool = getToolTableObj().newInstance();
			editTool = tool.beginEdit();
			editTool.setRequiredName( toolName );
			tool = editTool.create();
			editTool = null;
		}
		return( tool );
	}

	public IYCFGenKbToolSetObj defineToolSet( String toolSetName )
	{
		// TODO Lots of work to be done here
		IYCFGenKbToolSetObj toolSet;
		toolSet = getToolSetTableObj().readToolSetByNameIdx(toolSetName);
		if( toolSet == null ) {
			IYCFGenKbToolSetEditObj editToolSet;
			toolSet = getToolSetTableObj().newInstance();
			editToolSet = toolSet.beginEdit();
			editToolSet.setRequiredName( toolSetName );
            //editToolSet.setOptionalDescr( descr );
            //editToolSet.setOptionalRevisionString( revisionString );

            String remainder;
            String toolname;
            int idxPlus = toolSetName.indexOf('+');
            if (idxPlus > 0) {
                toolname = toolSetName.substring(0, idxPlus);
                remainder = toolSetName.substring(idxPlus + 1);
            }
            else {
                toolname = toolSetName;
                remainder = "";
            }
            editToolSet.setRequiredLookupTool0( defineTool(toolname) );

            if (remainder.length() > 0) {
                idxPlus = remainder.indexOf('+');
                if (idxPlus > 0) {
                    toolname = remainder.substring(0, idxPlus);
                    remainder = remainder.substring(idxPlus + 1);
                }
                else {
                    toolname = remainder;
                    remainder = "";
                }
                editToolSet.setOptionalLookupTool1( defineTool(toolname) );

                if (remainder.length() > 0) {
                    idxPlus = remainder.indexOf('+');
                    if (idxPlus > 0) {
                        toolname = remainder.substring(0, idxPlus);
                        remainder = remainder.substring(idxPlus + 1);
                    }
                    else {
                        toolname = remainder;
                        remainder = "";
                    }
                    editToolSet.setOptionalLookupTool2( defineTool(toolname) );

                    if (remainder.length() > 0) {
                        idxPlus = remainder.indexOf('+');
                        if (idxPlus > 0) {
                            toolname = remainder.substring(0, idxPlus);
                            remainder = remainder.substring(idxPlus + 1);
                        }
                        else {
                            toolname = remainder;
                            remainder = "";
                        }
                        editToolSet.setOptionalLookupTool3( defineTool(toolname) );

                        if (remainder.length() > 0) {
                            idxPlus = remainder.indexOf('+');
                            if (idxPlus > 0) {
                                toolname = remainder.substring(0, idxPlus);
                                remainder = remainder.substring(idxPlus + 1);
                            }
                            else {
                                toolname = remainder;
                                remainder = "";
                            }
                            editToolSet.setOptionalLookupTool4( defineTool(toolname) );

                            if (remainder.length() > 0) {
                                idxPlus = remainder.indexOf('+');
                                if (idxPlus > 0) {
                                    toolname = remainder.substring(0, idxPlus);
                                    remainder = remainder.substring(idxPlus + 1);
                                }
                                else {
                                    toolname = remainder;
                                    remainder = "";
                                }
                                editToolSet.setOptionalLookupTool5( defineTool(toolname) );

                                if (remainder.length() > 0) {
                                    idxPlus = remainder.indexOf('+');
                                    if (idxPlus > 0) {
                                        toolname = remainder.substring(0, idxPlus);
                                        remainder = remainder.substring(idxPlus + 1);
                                    }
                                    else {
                                        toolname = remainder;
                                        remainder = "";
                                    }
                                    editToolSet.setOptionalLookupTool6( defineTool(toolname) );

                                    if (remainder.length() > 0) {
                                        idxPlus = remainder.indexOf('+');
                                        if (idxPlus > 0) {
                                            toolname = remainder.substring(0, idxPlus);
                                            remainder = remainder.substring(idxPlus + 1);
                                        }
                                        else {
                                            toolname = remainder;
                                            remainder = "";
                                        }
                                        editToolSet.setOptionalLookupTool7( defineTool(toolname) );
                                    }
                                }
                            }
                        }
                    }
                }
            }
            toolSet = editToolSet.create();
            editToolSet = null;
		}
        return( toolSet );
	}

	private void libInitRuleTypes()
	{
		IYCFGenKbRuleTypeObj ruleTypeBind = getRuleTypeTableObj().newInstance();
		IYCFGenKbRuleTypeEditObj editRuleType = ruleTypeBind.beginEdit();
		editRuleType.setRequiredName( "Bind" );
		ruleTypeBind = editRuleType.create();
		editRuleType = null;

		IYCFGenKbRuleTypeObj ruleTypeIterator = getRuleTypeTableObj().newInstance();
		editRuleType = ruleTypeIterator.beginEdit();
		editRuleType.setRequiredName( "Iterator" );
		ruleTypeIterator = editRuleType.create();
		editRuleType = null;

		IYCFGenKbRuleTypeObj ruleTypeReference = getRuleTypeTableObj().newInstance();
		editRuleType = ruleTypeReference.beginEdit();
		editRuleType.setRequiredName( "Reference" );
		ruleTypeReference = editRuleType.create();
		editRuleType = null;

		IYCFGenKbRuleTypeObj ruleTypeRule = getRuleTypeTableObj().newInstance();
		editRuleType = ruleTypeRule.beginEdit();
		editRuleType.setRequiredName( "Rule" );
		ruleTypeRule = editRuleType.create();
		editRuleType = null;

		IYCFGenKbRuleTypeObj ruleTypeFile = getRuleTypeTableObj().newInstance();
		editRuleType = ruleTypeFile.beginEdit();
		editRuleType.setRequiredName( "File" );
		ruleTypeFile = editRuleType.create();
		editRuleType = null;

		IYCFGenKbRuleTypeObj ruleTypeTrunc = getRuleTypeTableObj().newInstance();
		editRuleType = ruleTypeTrunc.beginEdit();
		editRuleType.setRequiredName( "Trunc" );
		ruleTypeTrunc = editRuleType.create();
		editRuleType = null;
	}

	public void logMessage( String msg ) {
		if( msg == null ) {
			return;
		}
		System.out.append( msg + "\n" );
	}

	public void logMessage( String msg, Exception e ) {
		if( e == null ) {
			logMessage( msg );
			return;
		}

		if( msg == null ) {
			return;
		}

		String buff = msg + ": " + e.getMessage() + "\n";
		System.out.append( buff );
	}
}
