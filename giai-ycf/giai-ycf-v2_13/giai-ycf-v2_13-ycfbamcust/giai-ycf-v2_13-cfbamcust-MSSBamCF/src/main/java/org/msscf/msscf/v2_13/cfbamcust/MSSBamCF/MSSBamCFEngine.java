/*
 *	MSS Code Factory YCFBam 2.13 CustMSSBamYCF
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycfbamcust.MSSBamYCF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamMssYCF.*;

public class MSSBamYCFEngine
	extends YCFBamMssYCFEngine
{
	public final static String		LinkName = "MSSBamYCF";
	public final static String		LinkVersion = "2.13.42-alpha15-202611010900";

	public final static String		GeneratorName = "MSS Code Factory";
	public final static String		GeneratorVersion = LinkVersion;

	public final static String		ITEMNAME_TOP = "top";

	protected String rootGenDir = null;

	protected final HashMap<String,String> schemaTweakNames = new HashMap<>();
	protected final HashMap<String,String> tableTweakNames = new HashMap<>();
	protected final HashMap<String,String> indexTweakNames = new HashMap<>();

	public void resetSchemaTweakNames() {
		schemaTweakNames.clear();
	}

	public void defineSchemaTweakName(String tweakName) {
		if (!schemaTweakNames.containsKey(tweakName)) {
			schemaTweakNames.put(tweakName, tweakName);
		}
	}

	public List<String> getSchemaTweakNames() {
		ArrayList<String> tweakNames = new ArrayList<>(schemaTweakNames.keySet());
		tweakNames.sort((o1, o2) -> {
			return o1.compareTo(o2);
		});
		return tweakNames;
	}

	public void resetTableTweakNames() {
		tableTweakNames.clear();
	}

	public void defineTableTweakName(String tweakName) {
		if (!tableTweakNames.containsKey(tweakName)) {
			tableTweakNames.put(tweakName, tweakName);
		}
	}

	public List<String> getTableTweakNames() {
		ArrayList<String> tweakNames = new ArrayList<>(tableTweakNames.keySet());
		tweakNames.sort((o1, o2) -> {
			return o1.compareTo(o2);
		});
		return tweakNames;
	}

	public void resetIndexTweakNames() {
		indexTweakNames.clear();
	}

	public void defineIndexTweakName(String tweakName) {
		if (!indexTweakNames.containsKey(tweakName)) {
			indexTweakNames.put(tweakName, tweakName);
		}
	}

	public List<String> getIndexTweakNames() {
		ArrayList<String> tweakNames = new ArrayList<>(indexTweakNames.keySet());
		tweakNames.sort((o1, o2) -> {
			return o1.compareTo(o2);
		});
		return tweakNames;
	}

	public String getRootGenDir() {
		return( rootGenDir );
	}

	public MssYCFGelCompiler getGelCompiler() {
		if( gelCompiler == null ) {
			gelCompiler = new MSSBamYCFGelCompiler( this );
		}
		return( gelCompiler );
	}

	/**
	 *	Get the display name for the engine.
	 *	<p>
	 *	Overload this with proper tool name.
	 */
	public String getGeneratorName() {
		return( GeneratorName );
	}

	public void generate(
		String					generatingBuild,
		String					rootGenDir,
		IYCFLibAnyObj			anyDef,
		List<String>			toolsDesired,
		String					initialRuleName )
	{
		List<IYCFBamSchemaDefObj> schemaList;
		MSSBamYCFModelValidator validator = new MSSBamYCFModelValidator();
		if( anyDef instanceof IYCFBamMinorVersionObj ) {
			schemaList = ((IYCFBamMinorVersionObj)anyDef).getOptionalComponentsSchemaDef();
		}
		else if( anyDef instanceof IYCFBamSchemaDefObj ) {
			schemaList = new LinkedList<IYCFBamSchemaDefObj>();
			schemaList.add( (IYCFBamSchemaDefObj)anyDef );
		}
		else {
			getLog().message( "Cannot expand \"" + anyDef.getGenDefName() + "\" named \"" + anyDef.getObjFullName() + "\" -- only versions, projects, or schema defs can be manufactured" );
			return;
		}

		getLog().message( "Validating schemas..." );

		StringBuffer buff = new StringBuffer();
		boolean allSchemasValid = true;
		boolean schemaValid;
		IYCFBamSchemaDefObj schemaDef;
		Iterator<IYCFBamSchemaDefObj> iterSchema = schemaList.iterator();
		while( iterSchema.hasNext() ) {
			schemaDef = iterSchema.next();
			schemaValid = validator.validateSchemaDef( schemaDef );
			if( buff.length() > 0 ) {
				buff.append( "\n" );
				buff.append( validator.getValidationResults() );
			}
			else {
				buff.append( validator.getValidationResults() );
			}
			if( ! schemaValid ) {
				allSchemasValid = false;
			}
		}

		if( allSchemasValid ) {
			getLog().message( "Schema validation was successful" );
			super.generate( generatingBuild, rootGenDir, anyDef, toolsDesired, initialRuleName );
		}
		else {
			getLog().message( "Schema validation FAILED\n" + buff.toString() );
			getLog().message( "ERROR: Cannot generate code -- schema validation FAILED" );
			YCFLib.beep();
		}
	}

	/*
	 *	Normally you'll want to overload this.
	 */
	public String getAnyClassName() {
		return( "Object" );
	}

	public String fixGenDefName( String rawName ) {
		return( rawName );
	}

	public void bootstrapFirst() {
		defineToolSet( "any" );
		getYCFBamSchema().getId16GenTableObj().readId16GenByDispIdx( 0L, 0L );
		getYCFBamSchema().getId32GenTableObj().readId32GenByDispIdx( 0L, 0L );
		getYCFBamSchema().getId64GenTableObj().readId64GenByDispIdx( 0L, 0L );
	}

	// Constructors

	public MSSBamYCFEngine() {
		super();
		setTargetRuleName( ITEMNAME_TOP );
	}

	public void init( String generatingBuild,
		IYCFGenKbSchemaObj argYCFGenKbSchema,
		IYCFGenKbTenantObj	argTenant,
		IYCFBamSchemaObj argBamSchema,
		String strRootGenDir )
	{
		setYCFBamSchema( argBamSchema );
		init( generatingBuild, argYCFGenKbSchema, argTenant, strRootGenDir );
	}

	/**
	 *	Initialize the generation engine and its knowledge base
	 */
	public void init( String generatingBuild, IYCFGenKbSchemaObj argYCFGenKbSchema, IYCFGenKbTenantObj argTenant, String strRootGenDir ) {
		super.init( generatingBuild, argYCFGenKbSchema, argTenant, strRootGenDir );
		setGenContext( getGenContextFactory().newGenContext( generatingBuild,
			this,
			strRootGenDir,
			"any",
			"Object",
			"Object",
			getTargetRuleName()));
	}

	public IYCFGenKbGenFileTableObj getGenFileTableObj() {
		if( genFileTableObj == null ) {
			genFileTableObj = new MSSBamYCFGenFileTableObj( this );
		}
		return( genFileTableObj );
	}

	public MssYCFGenContextFactory getGenContextFactory() {
		if( genContextFactory == null ) {
			genContextFactory = new MSSBamYCFGenContextFactory();
		}
		return( genContextFactory );
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
		return(
			super.defineFile( definedNear,
				toolsetName,
				fixGenDefName(scopeDefClassName),
				fixGenDefName(genDefClassName),
				itemName,
				expansionBody,
				generateOnce,
				sourceBundle,
				moduleName,
				basePackageName,
				subPackageName,
				expansionClassName,
				expansionKeyName,
				expansionFileName) );
	}

	public IYCFGenKbGenRuleObj defineRule(
		String	definedNear,
		String	toolsetName,
		String	scopeDefClassName,
		String	genDefClassName,
		String	itemName,
		String	expansionBody )
	{
		return(
			super.defineRule( definedNear,
				toolsetName,
				fixGenDefName(scopeDefClassName),
				fixGenDefName(genDefClassName),
				itemName,
				expansionBody ) );
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
		return(
			super.defineTrunc( definedNear,
				toolsetName,
				fixGenDefName(scopeDefClassName),
				fixGenDefName(genDefClassName),
				itemName,
				expansionBody,
				truncAt) );
	}

	public void bootstrapBindings() {
		super.bootstrapBindings();

		IYCFGenKbGenBindObj	bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

        IYCFGenKbRuleCartObj ruleCart = getInternalRuleCart();
        IYCFGenKbRuleTypeObj ruleTypeBind = getRuleTypeTableObj().readRuleTypeByNameIdx("Bind");

		bind = new MSSBamYCFGenBindSchemaName(this,
			"any", null, "Object", "SchemaName");
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

		bind = new MSSBamYCFGenBindSchemaProjectName(this,
			"any", null, "Object", "SchemaProjectName");
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

		bind = new MSSBamYCFGenBindTopProjectMfgVersion(this,
			"any", null, "Object", "TopProjectMfgVersion");
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

		bind = new MSSBamYCFGenBindTopProjectDomainName(this,
			"any", null, "Object", "TopProjectDomainName");
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

		bind = new MSSBamYCFGenBindIsPublic(this,
			"any", null, "Object", "IsPublic");
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

		bind = new MSSBamYCFGenBindIsProtected(this,
			"any", null, "Object", "IsProtected");
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

		bind = new MSSBamYCFGenBindIsPrivate(this,
			"any", null, "Object", "IsPrivate");
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

		bind = new MSSBamYCFGenBindIsSpecificallyProtected(this,
			"any", null, "Object", "IsSpecificallyProtected");
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

		bind = new MSSBamYCFGenBindIsSpecificallyPrivate(this,
			"any", null, "Object", "IsSpecificallyPrivate");
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasSuperiorRelationCol( this,
            "any", null, "Value", "HasSuperiorRelationCol" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasSuperiorCandidateRelationCol( this,
            "any", null, "Value", "HasSuperiorCandidateRelationCol" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasReverseRelation( this,
            "any", null, "Relation", "HasReverseRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindHasFirstSuperiorCandidateRelation( this,
            "any", null, "Value", "HasFirstSuperiorCandidateRelationship" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasFirstSuperiorNonCandidateRelation( this,
            "any", null, "Value", "HasFirstSuperiorNonCandidateRelationship" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindHasFirstSuperiorRelation( this,
            "any", null, "Value", "HasFirstSuperiorRelationship" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindAllRelationFromColsInPrimaryKey( this,
            "any", null, "Relation", "AllRelationFromColsInPrimaryKey" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInPrimaryKeyRelation( this,
	        "any", null, "Value", "InPrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSuperiorRelation( this,
	        "any", null, "Value", "InSuperiorRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInDataRelation( this,
	        "any", null, "Value", "InDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
    
        bind = new MSSBamYCFGenBindInSuperiorCandidateRelation( this,
	        "any", null, "Value", "InSuperiorCandidateRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindInSuperiorNonCandidateRelation( this,
	        "any", null, "Value", "InSuperiorNonCandidateRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSuperiorPrimaryKeyRelation( this,
	        "any", null, "Value", "InSuperiorPrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSuperiorCandidatePrimaryKeyRelation( this,
	        "any", null, "Value", "InSuperiorCandidatePrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindInSuperiorNonCandidatePrimaryKeyRelation( this,
	        "any", null, "Value", "InSuperiorNonCandidatePrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSuperiorDataRelation( this,
	        "any", null, "Value", "InSuperiorDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSuperiorCandidateDataRelation( this,
	        "any", null, "Value", "InSuperiorCandidateDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindInSuperiorNonCandidateDataRelation( this,
	        "any", null, "Value", "InSuperiorNonCandidateDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSubservientRelation( this,
	        "any", null, "Value", "InSubservientRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSubservientCandidateRelation( this,
	        "any", null, "Value", "InSubservientCandidateRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSubservientCandidateDataRelation( this,
	        "any", null, "Value", "InSubservientCandidateDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSubservientCandidatePrimaryKeyRelation( this,
	        "any", null, "Value", "InSubservientCandidatePrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSubservientNonCandidateRelation( this,
	        "any", null, "Value", "InSubservientNonCandidateRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSubservientNonCandidateDataRelation( this,
	        "any", null, "Value", "InSubservientNonCandidateDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSubservientNonCandidatePrimaryKeyRelation( this,
	        "any", null, "Value", "InSubservientNonCandidatePrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSubservientDataRelation( this,
	        "any", null, "Value", "InSubservientDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSubservientPrimaryKeyRelation( this,
	        "any", null, "Value", "InSubservientPrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInSuperClassRelation( this,
	        "any", null, "Value", "InSuperClassRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindHasFirstSuperiorCandidatePKeyRelation( this,
            "any", null, "Relation", "HasFirstSuperiorCandidatePKeyRelationship" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCommonLicense( this, 
	        "any", null, "SchemaDef", "CommonLicense" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindClientImplLicense( this, 
	        "any", null, "SchemaDef", "ClientImplLicense" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindClientXFaceLicense( this, 
	        "any", null, "SchemaDef", "ClientXFaceLicense" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindServerImplLicense( this, 
	        "any", null, "SchemaDef", "ServerImplLicense" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindServerXFaceLicense( this, 
	        "any", null, "SchemaDef", "ServerXFaceLicense" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindEffLicenseBody( this, 
	        "any", null, "License", "EffLicenseBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindDefDomainName( this, 
	        "any", null, "Object", "DefDomainName" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindTopDomainName( this, 
	        "any", null, "Object", "TopDomainName" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindDefTopProjectName( this, 
	        "any", null, "Object", "DefTopProjectName" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        // bind = new MSSBamYCFGenBindDefSubProjectName( this, 
	    //     "any", null, "Object", "DefSubProjectName" );
        // editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        // editBind.setRequiredContainerCartridge( ruleCart );
        // editBind.setRequiredLookupRuleType( ruleTypeBind );
        // editBind.create();
        // editBind = null;

        bind = new MSSBamYCFGenBindDefProjectName( this, 
	        "any", null, "Object", "DefProjectName" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasScope( this, 
	        "any", null, "Object", "HasScope" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsRelationInPrimaryIndex( this,
            "any", null, "Relation", "IsRelationInPrimaryIndex" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSelfReferencingRelation( this, 
	        "any", null, "Relation", "IsSelfReferencingRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSuperiorRelation( this, 
	        "any", null, "Relation", "IsSuperiorRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSuperiorCandidateRelation( this, 
	        "any", null, "Relation", "IsSuperiorCandidateRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSuperiorNonCandidateRelation( this, 
	        "any", null, "Relation", "IsSuperiorNonCandidateRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSuperiorDataRelation( this, 
	        "any", null, "Relation", "IsSuperiorDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSuperiorCandidateDataRelation( this, 
	        "any", null, "Relation", "IsSuperiorCandidateDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSuperiorNonCandidateDataRelation( this, 
	        "any", null, "Relation", "IsSuperiorNonCandidateDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSuperiorPrimaryKeyRelation( this, 
	        "any", null, "Relation", "IsSuperiorPrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSuperiorCandidatePrimaryKeyRelation( this, 
	        "any", null, "Relation", "IsSuperiorCandidatePrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSuperiorNonCandidatePrimaryKeyRelation( this, 
	        "any", null, "Relation", "IsSuperiorNonCandidatePrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSubservientRelation( this, 
	        "any", null, "Relation", "IsSubservientRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSubservientDataRelation( this, 
	        "any", null, "Relation", "IsSubservientDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSubservientPrimaryKeyRelation( this, 
	        "any", null, "Relation", "IsSubservientPrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSubservientCandidateRelation( this, 
	        "any", null, "Relation", "IsSubservientCandidateRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSubservientCandidateDataRelation( this, 
	        "any", null, "Relation", "IsSubservientCandidateDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSubservientCandidatePrimaryKeyRelation( this, 
	        "any", null, "Relation", "IsSubservientCandidatePrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
        
        bind = new MSSBamYCFGenBindIsSubservientNonCandidateRelation( this, 
	        "any", null, "Relation", "IsSubservientNonCandidateRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSubservientNonCandidateDataRelation( this, 
	        "any", null, "Relation", "IsSubservientNonCandidateDataRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSubservientNonCandidatePrimaryKeyRelation( this, 
	        "any", null, "Relation", "IsSubservientNonCandidatePrimaryKeyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMethodBody( this, 
	        "any", null, "ServerMethod", "JavaMethodBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMethodBody( this, 
	        "any", null, "ServerMethod", "CPlusMethodBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMethodBody( this, 
	        "any", null, "ServerMethod", "CSharpMethodBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasServerMethod( this, 
	        "any", null, "Table", "HasServerMethod" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasParam( this, 
	        "any", null, "ServerMethod", "HasParam" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasPopDep( this, 
	        "any", null, "Relation", "HasPopDep" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasNullableColumns( this, 
	        "any", null, "Index", "HasNullableColumns" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsSubObjectLookup( this, 
	        "any", null, "Relation", "IsSubObjectLookup" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindStripPrevNextColumnName( this, 
	        "any", null, "Value", "StripPrevNextColumnName" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasDelSubDep( this, 
	        "any", null, "DelDep", "HasDelSubDep" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasClearSubDep( this, 
	        "any", null, "ClearDep", "HasClearSubDep" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasPopSubDep( this, 
	        "any", null, "PopDep", "HasPopSubDep" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasSubObjectLookup( this, 
	        "any", null, "Table", "HasSubObjectLookup" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindColumnInChainNext( this, 
	        "any", null, "Value", "ColumnInChainNext" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindColumnInChainPrev( this, 
	        "any", null, "Value", "ColumnInChainPrev" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasOwner( this, 
	        "any", null, "Object", "HasOwner" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindProjectDescription( this, 
	        "any", null, "Object", "ProjectDescription" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasVersion( this, 
	        "any", null, "Object", "HasVersion" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindPackedVersion( this, 
	        "any", null, "Object", "PackedVersion" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindPackageName( this, 
	        "any", null, "Object", "PackageName" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsPrimaryIndex( this, 
	        "any", null, "Index", "IsPrimaryIndex" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsChainRelation( this, 
	        "any", null, "Relation", "IsChainRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindColumnInComponentsRelation( this, 
	        "any", null, "Value", "ColumnInComponentsRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindColumnInContainerOrNamedLookupRelation( this, 
	        "any", null, "Value", "ColumnInContainerOrNamedLookupRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInheritsBlob( this, 
	        "any", null, "Table", "InheritsBlob" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindInheritsText( this, 
	        "any", null, "Table", "InheritsText" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasAlternateIndex( this, 
	        "any", null, "Table", "HasAlternateIndex" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasInheritedLookupIndex( this, 
	        "any", null, "Table", "HasInheritedLookupIndex" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasChain( this, 
	        "any", null, "Table", "HasChain" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasContainer( this, 
	        "any", null, "Table", "HasContainer" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasPrimaryKey( this, 
	        "any", null, "Table", "HasPrimaryKey" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasSubClasses( this, 
	        "any", null, "Table", "HasSubClasses" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHasSuperClassRelation( this, 
	        "any", null, "Table", "HasSuperClassRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindIsBaseTable( this, 
	        "any", null, "Table", "IsBaseTable" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindPrimaryKeyIsConstEnum( this, 
	        "any", null, "Table", "PrimaryKeyIsConstEnum" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindBaseModelAtomClass( this, 
	        "any", null, "Value", "BaseModelAtomClass" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindColumnInAnyRelation( this, 
	        "any", null, "Value", "ColumnInAnyRelation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindColumnInPrimaryIndex( this, 
	        "any", null, "Value", "ColumnInPrimaryIndex" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaDb2LUWSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "JavaDb2LUWSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaDb2LUWSchemaObjImport( this, 
	        "any", null, "SchemaDef", "JavaDb2LUWSchemaObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaDb2LUWSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "JavaDb2LUWSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMSSqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "JavaMSSqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMSSqlSchemaObjImport( this, 
	        "any", null, "SchemaDef", "JavaMSSqlSchemaObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMSSqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "JavaMSSqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMySqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "JavaMySqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMySqlSchemaObjImport( this, 
	        "any", null, "SchemaDef", "JavaMySqlSchemaObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMySqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "JavaMySqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaOracleSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "JavaOracleSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaOracleSchemaObjImport( this, 
	        "any", null, "SchemaDef", "JavaOracleSchemaObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaOracleSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "JavaOracleSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaPgSqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "JavaPgSqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaPgSqlSchemaObjImport( this, 
	        "any", null, "SchemaDef", "JavaPgSqlSchemaObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaPgSqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "JavaPgSqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaRamSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "JavaRamSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaRamSchemaObjImport( this, 
	        "any", null, "SchemaDef", "JavaRamSchemaObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaRamSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "JavaRamSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaSchemaObjImplementation( this, 
	        "any", null, "SchemaDef", "JavaSchemaObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaSchemaObjImport( this, 
	        "any", null, "SchemaDef", "JavaSchemaObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaSchemaObjInterface( this, 
	        "any", null, "SchemaDef", "JavaSchemaObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "JavaSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgClientSchemaImport( this, 
	        "any", null, "SchemaDef", "JavaXMsgClientSchemaImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgClientSchemaBody( this, 
	        "any", null, "SchemaDef", "JavaXMsgClientSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRqstSchemaBody( this, 
	        "any", null, "SchemaDef", "JavaXMsgRqstSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRqstSchemaImport( this, 
	        "any", null, "SchemaDef", "JavaXMsgRqstSchemaImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRqstSchemaWireParsers( this, 
	        "any", null, "SchemaDef", "JavaXMsgRqstSchemaWireParsers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRqstSchemaXsdElementList( this, 
	        "any", null, "SchemaDef", "JavaXMsgRqstSchemaXsdElementList" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRqstSchemaXsdSpec( this, 
	        "any", null, "SchemaDef", "JavaXMsgRqstSchemaXsdSpec" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRspnSchemaBody( this, 
	        "any", null, "SchemaDef", "JavaXMsgRspnSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRspnSchemaImport( this, 
	        "any", null, "SchemaDef", "JavaXMsgRspnSchemaImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRspnSchemaWireParsers( this, 
	        "any", null, "SchemaDef", "JavaXMsgRspnSchemaWireParsers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRspnSchemaXsdElementList( this, 
	        "any", null, "SchemaDef", "JavaXMsgRspnSchemaXsdElementList" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRspnSchemaXsdSpec( this, 
	        "any", null, "SchemaDef", "JavaXMsgRspnSchemaXsdSpec" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgSchemaFormatters( this, 
	        "any", null, "SchemaDef", "JavaXMsgSchemaFormatters" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgSchemaImport( this, 
	        "any", null, "SchemaDef", "JavaXMsgSchemaImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaDb2LUWTableImplementation( this, 
	        "any", null, "Table", "JavaDb2LUWTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaDb2LUWTableImport( this, 
	        "any", null, "Table", "JavaDb2LUWTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaDb2LUWTableMembers( this, 
	        "any", null, "Table", "JavaDb2LUWTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaEditObjImplementation( this, 
	        "any", null, "Table", "JavaEditObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaEditObjImport( this, 
	        "any", null, "Table", "JavaEditObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaEditObjInterface( this, 
	        "any", null, "Table", "JavaEditObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaEditObjMembers( this, 
	        "any", null, "Table", "JavaEditObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMSSqlTableImplementation( this, 
	        "any", null, "Table", "JavaMSSqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMSSqlTableImport( this, 
	        "any", null, "Table", "JavaMSSqlTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMSSqlTableMembers( this, 
	        "any", null, "Table", "JavaMSSqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMySqlTableImplementation( this, 
	        "any", null, "Table", "JavaMySqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMySqlTableImport( this, 
	        "any", null, "Table", "JavaMySqlTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaMySqlTableMembers( this, 
	        "any", null, "Table", "JavaMySqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaObjImplementation( this, 
	        "any", null, "Table", "JavaObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaObjImport( this, 
	        "any", null, "Table", "JavaObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaObjInterface( this, 
	        "any", null, "Table", "JavaObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaObjMembers( this, 
	        "any", null, "Table", "JavaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaOracleTableImplementation( this, 
	        "any", null, "Table", "JavaOracleTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaOracleTableImport( this, 
	        "any", null, "Table", "JavaOracleTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaOracleTableMembers( this, 
	        "any", null, "Table", "JavaOracleTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaPgSqlTableImplementation( this, 
	        "any", null, "Table", "JavaPgSqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaPgSqlTableImport( this, 
	        "any", null, "Table", "JavaPgSqlTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaPgSqlTableMembers( this, 
	        "any", null, "Table", "JavaPgSqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaRamTableImplementation( this, 
	        "any", null, "Table", "JavaRamTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaRamTableImport( this, 
	        "any", null, "Table", "JavaRamTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaRamTableMembers( this, 
	        "any", null, "Table", "JavaRamTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaSaxLoaderEndElement( this, 
	        "any", null, "Table", "JavaSaxLoaderEndElement" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaSaxLoaderImport( this, 
	        "any", null, "Table", "JavaSaxLoaderImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaSaxLoaderStartElement( this, 
	        "any", null, "Table", "JavaSaxLoaderStartElement" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaTableImplementation( this, 
	        "any", null, "Table", "JavaTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaTableImport( this, 
	        "any", null, "Table", "JavaTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaTableInterface( this, 
	        "any", null, "Table", "JavaTableInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaTableMembers( this, 
	        "any", null, "Table", "JavaTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaTableObjImplementation( this, 
	        "any", null, "Table", "JavaTableObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaTableObjImport( this, 
	        "any", null, "Table", "JavaTableObjImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaTableObjInterface( this, 
	        "any", null, "Table", "JavaTableObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaTableObjMembers( this, 
	        "any", null, "Table", "JavaTableObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgClientTableBody( this, 
	        "any", null, "Table", "JavaXMsgClientTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgClientTableImport( this, 
	        "any", null, "Table", "JavaXMsgClientTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRqstTableBody( this, 
	        "any", null, "Table", "JavaXMsgRqstTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRqstTableImport( this, 
	        "any", null, "Table", "JavaXMsgRqstTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRspnTableBody( this, 
	        "any", null, "Table", "JavaXMsgRspnTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgRspnTableImport( this, 
	        "any", null, "Table", "JavaXMsgRspnTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgTableFormatters( this, 
	        "any", null, "Table", "JavaXMsgTableFormatters" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindJavaXMsgTableImport( this, 
	        "any", null, "Table", "JavaXMsgTableImport" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusDb2LUWSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CPlusDb2LUWSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusDb2LUWSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "CPlusDb2LUWSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusDb2LUWSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CPlusDb2LUWSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMSSqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CPlusMSSqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMSSqlSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "CPlusMSSqlSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMSSqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CPlusMSSqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMySqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CPlusMySqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMySqlSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "CPlusMySqlSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMySqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CPlusMySqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusOracleSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CPlusOracleSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusOracleSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "CPlusOracleSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusOracleSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CPlusOracleSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusPgSqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CPlusPgSqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusPgSqlSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "CPlusPgSqlSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusPgSqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CPlusPgSqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusRamSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CPlusRamSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusRamSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "CPlusRamSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusRamSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CPlusRamSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusSchemaObjImplementation( this, 
	        "any", null, "SchemaDef", "CPlusSchemaObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "CPlusSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusSchemaObjInterface( this, 
	        "any", null, "SchemaDef", "CPlusSchemaObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CPlusSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgClientSchemaInclude( this, 
	        "any", null, "SchemaDef", "CPlusXMsgClientSchemaInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgClientSchemaBody( this, 
	        "any", null, "SchemaDef", "CPlusXMsgClientSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRqstSchemaBody( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRqstSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRqstSchemaInclude( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRqstSchemaInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRqstSchemaWireParsers( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRqstSchemaWireParsers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRqstSchemaXsdElementList( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRqstSchemaXsdElementList" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRqstSchemaXsdSpec( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRqstSchemaXsdSpec" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRspnSchemaBody( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRspnSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRspnSchemaInclude( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRspnSchemaInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRspnSchemaWireParsers( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRspnSchemaWireParsers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRspnSchemaXsdElementList( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRspnSchemaXsdElementList" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRspnSchemaXsdSpec( this, 
	        "any", null, "SchemaDef", "CPlusXMsgRspnSchemaXsdSpec" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgSchemaFormatters( this, 
	        "any", null, "SchemaDef", "CPlusXMsgSchemaFormatters" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgSchemaInclude( this, 
	        "any", null, "SchemaDef", "CPlusXMsgSchemaInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusDb2LUWTableImplementation( this, 
	        "any", null, "Table", "CPlusDb2LUWTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusDb2LUWTableInclude( this, 
	        "any", null, "Table", "CPlusDb2LUWTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusDb2LUWTableMembers( this, 
	        "any", null, "Table", "CPlusDb2LUWTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusEditObjImplementation( this, 
	        "any", null, "Table", "CPlusEditObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusEditObjInclude( this, 
	        "any", null, "Table", "CPlusEditObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusEditObjInterface( this, 
	        "any", null, "Table", "CPlusEditObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusEditObjMembers( this, 
	        "any", null, "Table", "CPlusEditObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMSSqlTableImplementation( this, 
	        "any", null, "Table", "CPlusMSSqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMSSqlTableInclude( this, 
	        "any", null, "Table", "CPlusMSSqlTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMSSqlTableMembers( this, 
	        "any", null, "Table", "CPlusMSSqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMySqlTableImplementation( this, 
	        "any", null, "Table", "CPlusMySqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMySqlTableInclude( this, 
	        "any", null, "Table", "CPlusMySqlTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusMySqlTableMembers( this, 
	        "any", null, "Table", "CPlusMySqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusObjImplementation( this, 
	        "any", null, "Table", "CPlusObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusObjInclude( this, 
	        "any", null, "Table", "CPlusObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusObjInterface( this, 
	        "any", null, "Table", "CPlusObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusObjMembers( this, 
	        "any", null, "Table", "CPlusObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusOracleTableImplementation( this, 
	        "any", null, "Table", "CPlusOracleTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusOracleTableInclude( this, 
	        "any", null, "Table", "CPlusOracleTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusOracleTableMembers( this, 
	        "any", null, "Table", "CPlusOracleTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusPgSqlTableImplementation( this, 
	        "any", null, "Table", "CPlusPgSqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusPgSqlTableInclude( this, 
	        "any", null, "Table", "CPlusPgSqlTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusPgSqlTableMembers( this, 
	        "any", null, "Table", "CPlusPgSqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusRamTableImplementation( this, 
	        "any", null, "Table", "CPlusRamTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusRamTableInclude( this, 
	        "any", null, "Table", "CPlusRamTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusRamTableMembers( this, 
	        "any", null, "Table", "CPlusRamTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusSaxLoaderEndElement( this, 
	        "any", null, "Table", "CPlusSaxLoaderEndElement" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusSaxLoaderInclude( this, 
	        "any", null, "Table", "CPlusSaxLoaderInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusSaxLoaderStartElement( this, 
	        "any", null, "Table", "CPlusSaxLoaderStartElement" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusTableImplementation( this, 
	        "any", null, "Table", "CPlusTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusTableInclude( this, 
	        "any", null, "Table", "CPlusTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusTableInterface( this, 
	        "any", null, "Table", "CPlusTableInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusTableMembers( this, 
	        "any", null, "Table", "CPlusTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusTableObjImplementation( this, 
	        "any", null, "Table", "CPlusTableObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusTableObjInclude( this, 
	        "any", null, "Table", "CPlusTableObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusTableObjInterface( this, 
	        "any", null, "Table", "CPlusTableObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusTableObjMembers( this, 
	        "any", null, "Table", "CPlusTableObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgClientTableBody( this, 
	        "any", null, "Table", "CPlusXMsgClientTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgClientTableInclude( this, 
	        "any", null, "Table", "CPlusXMsgClientTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRqstTableBody( this, 
	        "any", null, "Table", "CPlusXMsgRqstTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRqstTableInclude( this, 
	        "any", null, "Table", "CPlusXMsgRqstTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRspnTableBody( this, 
	        "any", null, "Table", "CPlusXMsgRspnTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgRspnTableInclude( this, 
	        "any", null, "Table", "CPlusXMsgRspnTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgTableFormatters( this, 
	        "any", null, "Table", "CPlusXMsgTableFormatters" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCPlusXMsgTableInclude( this, 
	        "any", null, "Table", "CPlusXMsgTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusDb2LUWSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "HPlusDb2LUWSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusDb2LUWSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "HPlusDb2LUWSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusDb2LUWSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "HPlusDb2LUWSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMSSqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "HPlusMSSqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMSSqlSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "HPlusMSSqlSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMSSqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "HPlusMSSqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMySqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "HPlusMySqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMySqlSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "HPlusMySqlSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMySqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "HPlusMySqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusOracleSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "HPlusOracleSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusOracleSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "HPlusOracleSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusOracleSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "HPlusOracleSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusPgSqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "HPlusPgSqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusPgSqlSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "HPlusPgSqlSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusPgSqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "HPlusPgSqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusRamSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "HPlusRamSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusRamSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "HPlusRamSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusRamSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "HPlusRamSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusSchemaObjImplementation( this, 
	        "any", null, "SchemaDef", "HPlusSchemaObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusSchemaObjInclude( this, 
	        "any", null, "SchemaDef", "HPlusSchemaObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusSchemaObjInterface( this, 
	        "any", null, "SchemaDef", "HPlusSchemaObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "HPlusSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgClientSchemaInclude( this, 
	        "any", null, "SchemaDef", "HPlusXMsgClientSchemaInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgClientSchemaBody( this, 
	        "any", null, "SchemaDef", "HPlusXMsgClientSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRqstSchemaBody( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRqstSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRqstSchemaInclude( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRqstSchemaInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRqstSchemaWireParsers( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRqstSchemaWireParsers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRqstSchemaXsdElementList( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRqstSchemaXsdElementList" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRqstSchemaXsdSpec( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRqstSchemaXsdSpec" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRspnSchemaBody( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRspnSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRspnSchemaInclude( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRspnSchemaInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRspnSchemaWireParsers( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRspnSchemaWireParsers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRspnSchemaXsdElementList( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRspnSchemaXsdElementList" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRspnSchemaXsdSpec( this, 
	        "any", null, "SchemaDef", "HPlusXMsgRspnSchemaXsdSpec" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgSchemaFormatters( this, 
	        "any", null, "SchemaDef", "HPlusXMsgSchemaFormatters" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgSchemaInclude( this, 
	        "any", null, "SchemaDef", "HPlusXMsgSchemaInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusDb2LUWTableImplementation( this, 
	        "any", null, "Table", "HPlusDb2LUWTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusDb2LUWTableInclude( this, 
	        "any", null, "Table", "HPlusDb2LUWTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusDb2LUWTableMembers( this, 
	        "any", null, "Table", "HPlusDb2LUWTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusEditObjImplementation( this, 
	        "any", null, "Table", "HPlusEditObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusEditObjInclude( this, 
	        "any", null, "Table", "HPlusEditObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusEditObjInterface( this, 
	        "any", null, "Table", "HPlusEditObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusEditObjMembers( this, 
	        "any", null, "Table", "HPlusEditObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMSSqlTableImplementation( this, 
	        "any", null, "Table", "HPlusMSSqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMSSqlTableInclude( this, 
	        "any", null, "Table", "HPlusMSSqlTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMSSqlTableMembers( this, 
	        "any", null, "Table", "HPlusMSSqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMySqlTableImplementation( this, 
	        "any", null, "Table", "HPlusMySqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMySqlTableInclude( this, 
	        "any", null, "Table", "HPlusMySqlTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusMySqlTableMembers( this, 
	        "any", null, "Table", "HPlusMySqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusObjImplementation( this, 
	        "any", null, "Table", "HPlusObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusObjInclude( this, 
	        "any", null, "Table", "HPlusObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusObjInterface( this, 
	        "any", null, "Table", "HPlusObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusObjMembers( this, 
	        "any", null, "Table", "HPlusObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusOracleTableImplementation( this, 
	        "any", null, "Table", "HPlusOracleTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusOracleTableInclude( this, 
	        "any", null, "Table", "HPlusOracleTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusOracleTableMembers( this, 
	        "any", null, "Table", "HPlusOracleTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusPgSqlTableImplementation( this, 
	        "any", null, "Table", "HPlusPgSqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusPgSqlTableInclude( this, 
	        "any", null, "Table", "HPlusPgSqlTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusPgSqlTableMembers( this, 
	        "any", null, "Table", "HPlusPgSqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusRamTableImplementation( this, 
	        "any", null, "Table", "HPlusRamTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusRamTableInclude( this, 
	        "any", null, "Table", "HPlusRamTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusRamTableMembers( this, 
	        "any", null, "Table", "HPlusRamTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusSaxLoaderEndElement( this, 
	        "any", null, "Table", "HPlusSaxLoaderEndElement" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusSaxLoaderInclude( this, 
	        "any", null, "Table", "HPlusSaxLoaderInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusSaxLoaderStartElement( this, 
	        "any", null, "Table", "HPlusSaxLoaderStartElement" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusTableImplementation( this, 
	        "any", null, "Table", "HPlusTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusTableInclude( this, 
	        "any", null, "Table", "HPlusTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusTableInterface( this, 
	        "any", null, "Table", "HPlusTableInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusTableMembers( this, 
	        "any", null, "Table", "HPlusTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusTableObjImplementation( this, 
	        "any", null, "Table", "HPlusTableObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusTableObjInclude( this, 
	        "any", null, "Table", "HPlusTableObjInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusTableObjInterface( this, 
	        "any", null, "Table", "HPlusTableObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusTableObjMembers( this, 
	        "any", null, "Table", "HPlusTableObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgClientTableBody( this, 
	        "any", null, "Table", "HPlusXMsgClientTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgClientTableInclude( this, 
	        "any", null, "Table", "HPlusXMsgClientTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRqstTableBody( this, 
	        "any", null, "Table", "HPlusXMsgRqstTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRqstTableInclude( this, 
	        "any", null, "Table", "HPlusXMsgRqstTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRspnTableBody( this, 
	        "any", null, "Table", "HPlusXMsgRspnTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgRspnTableInclude( this, 
	        "any", null, "Table", "HPlusXMsgRspnTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgTableFormatters( this, 
	        "any", null, "Table", "HPlusXMsgTableFormatters" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindHPlusXMsgTableInclude( this, 
	        "any", null, "Table", "HPlusXMsgTableInclude" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpDb2LUWSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CSharpDb2LUWSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpDb2LUWSchemaObjUsing( this, 
	        "any", null, "SchemaDef", "CSharpDb2LUWSchemaObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpDb2LUWSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CSharpDb2LUWSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMSSqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CSharpMSSqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMSSqlSchemaObjUsing( this, 
	        "any", null, "SchemaDef", "CSharpMSSqlSchemaObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMSSqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CSharpMSSqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMySqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CSharpMySqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMySqlSchemaObjUsing( this, 
	        "any", null, "SchemaDef", "CSharpMySqlSchemaObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMySqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CSharpMySqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpOracleSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CSharpOracleSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpOracleSchemaObjUsing( this, 
	        "any", null, "SchemaDef", "CSharpOracleSchemaObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpOracleSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CSharpOracleSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpPgSqlSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CSharpPgSqlSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpPgSqlSchemaObjUsing( this, 
	        "any", null, "SchemaDef", "CSharpPgSqlSchemaObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpPgSqlSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CSharpPgSqlSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpRamSchemaObjImpl( this, 
	        "any", null, "SchemaDef", "CSharpRamSchemaObjImpl" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpRamSchemaObjUsing( this, 
	        "any", null, "SchemaDef", "CSharpRamSchemaObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpRamSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CSharpRamSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpSchemaObjImplementation( this, 
	        "any", null, "SchemaDef", "CSharpSchemaObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpSchemaObjUsing( this, 
	        "any", null, "SchemaDef", "CSharpSchemaObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpSchemaObjInterface( this, 
	        "any", null, "SchemaDef", "CSharpSchemaObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpSchemaObjMembers( this, 
	        "any", null, "SchemaDef", "CSharpSchemaObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgClientSchemaUsing( this, 
	        "any", null, "SchemaDef", "CSharpXMsgClientSchemaUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgClientSchemaBody( this, 
	        "any", null, "SchemaDef", "CSharpXMsgClientSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRqstSchemaBody( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRqstSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRqstSchemaUsing( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRqstSchemaUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRqstSchemaWireParsers( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRqstSchemaWireParsers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRqstSchemaXsdElementList( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRqstSchemaXsdElementList" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRqstSchemaXsdSpec( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRqstSchemaXsdSpec" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRspnSchemaBody( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRspnSchemaBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRspnSchemaUsing( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRspnSchemaUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRspnSchemaWireParsers( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRspnSchemaWireParsers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRspnSchemaXsdElementList( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRspnSchemaXsdElementList" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRspnSchemaXsdSpec( this, 
	        "any", null, "SchemaDef", "CSharpXMsgRspnSchemaXsdSpec" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgSchemaFormatters( this, 
	        "any", null, "SchemaDef", "CSharpXMsgSchemaFormatters" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgSchemaUsing( this, 
	        "any", null, "SchemaDef", "CSharpXMsgSchemaUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpDb2LUWTableImplementation( this, 
	        "any", null, "Table", "CSharpDb2LUWTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpDb2LUWTableUsing( this, 
	        "any", null, "Table", "CSharpDb2LUWTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpDb2LUWTableMembers( this, 
	        "any", null, "Table", "CSharpDb2LUWTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpEditObjImplementation( this, 
	        "any", null, "Table", "CSharpEditObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpEditObjUsing( this, 
	        "any", null, "Table", "CSharpEditObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpEditObjInterface( this, 
	        "any", null, "Table", "CSharpEditObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpEditObjMembers( this, 
	        "any", null, "Table", "CSharpEditObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMSSqlTableImplementation( this, 
	        "any", null, "Table", "CSharpMSSqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMSSqlTableUsing( this, 
	        "any", null, "Table", "CSharpMSSqlTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMSSqlTableMembers( this, 
	        "any", null, "Table", "CSharpMSSqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMySqlTableImplementation( this, 
	        "any", null, "Table", "CSharpMySqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMySqlTableUsing( this, 
	        "any", null, "Table", "CSharpMySqlTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpMySqlTableMembers( this, 
	        "any", null, "Table", "CSharpMySqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpObjImplementation( this, 
	        "any", null, "Table", "CSharpObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpObjUsing( this, 
	        "any", null, "Table", "CSharpObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpObjInterface( this, 
	        "any", null, "Table", "CSharpObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpObjMembers( this, 
	        "any", null, "Table", "CSharpObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpOracleTableImplementation( this, 
	        "any", null, "Table", "CSharpOracleTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpOracleTableUsing( this, 
	        "any", null, "Table", "CSharpOracleTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpOracleTableMembers( this, 
	        "any", null, "Table", "CSharpOracleTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpPgSqlTableImplementation( this, 
	        "any", null, "Table", "CSharpPgSqlTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpPgSqlTableUsing( this, 
	        "any", null, "Table", "CSharpPgSqlTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpPgSqlTableMembers( this, 
	        "any", null, "Table", "CSharpPgSqlTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpRamTableImplementation( this, 
	        "any", null, "Table", "CSharpRamTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpRamTableUsing( this, 
	        "any", null, "Table", "CSharpRamTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpRamTableMembers( this, 
	        "any", null, "Table", "CSharpRamTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpSaxLoaderEndElement( this, 
	        "any", null, "Table", "CSharpSaxLoaderEndElement" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpSaxLoaderUsing( this, 
	        "any", null, "Table", "CSharpSaxLoaderUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpSaxLoaderStartElement( this, 
	        "any", null, "Table", "CSharpSaxLoaderStartElement" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpTableImplementation( this, 
	        "any", null, "Table", "CSharpTableImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpTableUsing( this, 
	        "any", null, "Table", "CSharpTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpTableInterface( this, 
	        "any", null, "Table", "CSharpTableInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpTableMembers( this, 
	        "any", null, "Table", "CSharpTableMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpTableObjImplementation( this, 
	        "any", null, "Table", "CSharpTableObjImplementation" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpTableObjUsing( this, 
	        "any", null, "Table", "CSharpTableObjUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpTableObjInterface( this, 
	        "any", null, "Table", "CSharpTableObjInterface" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpTableObjMembers( this, 
	        "any", null, "Table", "CSharpTableObjMembers" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgClientTableBody( this, 
	        "any", null, "Table", "CSharpXMsgClientTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgClientTableUsing( this, 
	        "any", null, "Table", "CSharpXMsgClientTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRqstTableBody( this, 
	        "any", null, "Table", "CSharpXMsgRqstTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRqstTableUsing( this, 
	        "any", null, "Table", "CSharpXMsgRqstTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRspnTableBody( this, 
	        "any", null, "Table", "CSharpXMsgRspnTableBody" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgRspnTableUsing( this, 
	        "any", null, "Table", "CSharpXMsgRspnTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgTableFormatters( this, 
	        "any", null, "Table", "CSharpXMsgTableFormatters" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;

        bind = new MSSBamYCFGenBindCSharpXMsgTableUsing( this, 
	        "any", null, "Table", "CSharpXMsgTableUsing" );
        editBind = (IYCFGenKbGenBindEditObj)(bind.beginEdit());
        editBind.setRequiredContainerCartridge( ruleCart );
        editBind.setRequiredLookupRuleType( ruleTypeBind );
        editBind.create();
        editBind = null;
}

	public void bootstrapIterators() {
		super.bootstrapIterators();

		IYCFGenKbGenIteratorObj	iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

        IYCFGenKbRuleCartObj ruleCart = getInternalRuleCart();
        IYCFGenKbRuleTypeObj ruleTypeIterator = getRuleTypeTableObj().readRuleTypeByNameIdx("Iterator");

        iterator = new MSSBamYCFGenIterateSchemaProtectedRootTables(this,  "any", null, "SchemaDef", "SchemaProtectedRootTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSchemaProtectedTables(this,  "any", null, "SchemaDef", "SchemaProtectedTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSchemaSpecificallyProtectedRootTables(this,  "any", null, "SchemaDef", "SchemaSpecificallyProtectedRootTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSchemaSpecificallyProtectedTables(this,  "any", null, "SchemaDef", "SchemaSpecificallyProtectedTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSchemaPublicRootTables(this,  "any", null, "SchemaDef", "SchemaPublicRootTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSchemaPublicTables(this,  "any", null, "SchemaDef", "SchemaPublicTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDefSchemaProtectedRootTables(this,  "any", null, "SchemaDef", "DefSchemaProtectedRootTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDefSchemaProtectedTables(this,  "any", null, "SchemaDef", "DefSchemaProtectedTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDefSchemaSpecificallyProtectedRootTables(this,  "any", null, "SchemaDef", "DefSchemaSpecificallyProtectedRootTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDefSchemaSpecificallyProtectedTables(this,  "any", null, "SchemaDef", "DefSchemaSpecificallyProtectedTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDefSchemaPublicRootTables(this,  "any", null, "SchemaDef", "DefSchemaPublicRootTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDefSchemaPublicTables(this,  "any", null, "SchemaDef", "DefSchemaPublicTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateTableRefs(this,  "any", null, "Table", "TableRefs" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSubTableRefs(this,  "any", null, "Table", "SubTableRefs" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSuperiorCandidateRelations(this,  "any", null, "Table", "SuperiorCandidateRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;
        
        iterator = new MSSBamYCFGenIterateSuperiorNonCandidateRelations(this,  "any", null, "Table", "SuperiorNonCandidateRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIteratePrimaryKeyRelations(this,  "any", null, "Table", "PrimaryKeyRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDataRelations(this,  "any", null, "Table", "DataRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSuperiorRelations(this,  "any", null, "Table", "SuperiorRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSubservientRelations(this,  "any", null, "Table", "SubservientRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSuperiorDataRelations(this,  "any", null, "Table", "SuperiorDataRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;
        
        iterator = new MSSBamYCFGenIterateSuperiorPrimaryKeyRelations(this,  "any", null, "Table", "SuperiorPrimaryKeyRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSuperiorCandidateDataRelations(this,  "any", null, "Table", "SuperiorCandidateDataRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;
        
        iterator = new MSSBamYCFGenIterateSuperiorNonCandidateDataRelations(this,  "any", null, "Table", "SuperiorNonCandidateDataRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSuperiorCandidatePrimaryKeyRelations(this,  "any", null, "Table", "SuperiorCandidatePrimaryKeyRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;
        
        iterator = new MSSBamYCFGenIterateSuperiorNonCandidatePrimaryKeyRelations(this,  "any", null, "Table", "SuperiorNonCandidatePrimaryKeyRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSubservientCandidateRelations(this,  "any", null, "Table", "SubservientCandidateRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSubservientCandidateDataRelations(this,  "any", null, "Table", "SubservientCandidateDataRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSubservientCandidatePrimaryKeyRelations(this,  "any", null, "Table", "SubservientCandidatePrimaryKeyRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;
        
        iterator = new MSSBamYCFGenIterateSubservientNonCandidateRelations(this,  "any", null, "Table", "SubservientNonCandidateRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSubservientNonCandidateDataRelations(this,  "any", null, "Table", "SubservientNonCandidateDataRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSubservientNonCandidatePrimaryKeyRelations(this,  "any", null, "Table", "SubservientNonCandidatePrimaryKeyRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSubservientDataRelations(this,  "any", null, "Table", "SubservientDataRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSubservientPrimaryKeyRelations(this,  "any", null, "Table", "SubservientPrimaryKeyRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateReverseClearDeps(this,  "any", null, "Table", "ReverseClearDeps" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateReverseDelDeps(this,  "any", null, "Table", "ReverseDelDeps" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSchemaTables(this,  "any", null, "SchemaDef", "SchemaTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSchemaOrderedRoles(this,  "any", null, "SchemaDef", "OrderedRoles" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateSchemaSchemaOrderedRoles(this,  "any", null, "SchemaDef", "SchemaOrderedRoles" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDefSchemaTables(this,  "any", null, "SchemaDef", "DefSchemaTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDefSchemaRootTables(this,  "any", null, "SchemaDef", "DefSchemaRootTables" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateId16Generators(this,  "any", null, "SchemaDef", "Id16Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateId32Generators(this,  "any", null, "SchemaDef", "Id32Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateId64Generators(this,  "any", null, "SchemaDef", "Id64Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateUuidGenerators(this,  "any", null, "SchemaDef", "UuidGenerators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateUuid6Generators(this,  "any", null, "SchemaDef", "Uuid6Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDbKeyHash128Generators(this,  "any", null, "SchemaDef", "DbKeyHash128Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDbKeyHash160Generators(this,  "any", null, "SchemaDef", "DbKeyHash160Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDbKeyHash224Generators(this,  "any", null, "SchemaDef", "DbKeyHash224Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDbKeyHash256Generators(this,  "any", null, "SchemaDef", "DbKeyHash256Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDbKeyHash384Generators(this,  "any", null, "SchemaDef", "DbKeyHash384Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDbKeyHash512Generators(this,  "any", null, "SchemaDef", "DbKeyHash512Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateContainerRelations(this,  "any", null, "Table", "ContainerRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateGeneratedTableColumns(this,  "any", null, "Table", "GeneratedTableColumns" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateComponentCandidates(this,  "any", null, "Relation", "ComponentCandidates" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateReverseRelationships(this,  "any", null, "Relation", "ReverseRelationships" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDispensedId16Generators(this,  "any", null, "Table", "DispensedId16Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDispensedId32Generators(this,  "any", null, "Table", "DispensedId32Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDispensedId64Generators(this,  "any", null, "Table", "DispensedId64Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDispensedDbKeyHash128Generators(this,  "any", null, "Table", "DispensedDbKeyHash128Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDispensedDbKeyHash224Generators(this,  "any", null, "Table", "DispensedDbKeyHash224Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDispensedDbKeyHash256Generators(this,  "any", null, "Table", "DispensedDbKeyHash256Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDispensedDbKeyHash384Generators(this,  "any", null, "Table", "DispensedDbKeyHash384Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDispensedDbKeyHash512Generators(this,  "any", null, "Table", "DispensedDbKeyHash512Generators" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateOnlyOwnerRelations(this,  "any", null, "Table", "OnlyOwnerRelations" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateDataColumns(this,  "any", null, "Table", "DataColumns" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateTableSubClasses(this,  "any", null, "Table", "TableSubClasses" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;

        iterator = new MSSBamYCFGenIterateTableDeepSubClasses(this,  "any", null, "Table", "TableDeepSubClasses" );
        editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editIterator).setRequiredLookupRuleType( ruleTypeIterator );
        editIterator.create();
        editIterator = null;
	}

	public void bootstrapReferences() {
		super.bootstrapReferences();
		IYCFGenKbGenReferenceObj	reference = null;
		IYCFGenKbGenReferenceEditObj editReference = null;

        IYCFGenKbRuleCartObj ruleCart = this.getInternalRuleCart();
        IYCFGenKbRuleTypeObj ruleTypeReference = this.getRuleTypeTableObj().readRuleTypeByNameIdx("Reference");

        reference = new MSSBamYCFGenReferencePushManufacturingSchema(this,  "any", null, "Object", "PushManufacturingSchema" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferencePopManufacturingSchema(this,  "any", null, "Object", "PopManufacturingSchema" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceScope(this,  "any", null, "Object", "Scope" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceChainContainerComponents(this,  "any", null, "Table", "ChainContainerComponents" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferencePopTopDep(this,  "any", null, "Relation", "PopTopDep" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceDelSubDep(this,  "any", null, "DelDep", "DelSubDep" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceClearSubDep(this,  "any", null, "ClearDep", "ClearSubDep" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferencePopSubDep(this,  "any", null, "PopDep", "PopSubDep" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceIdGenResolverRelation(this,  "any", null, "TableCol", "IdGenResolverRelation" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceSatisfyWidestLookupColumn(this,  "any", null, "IndexCol", "SatisfyWidestLookupColumn" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceManufacturingSchema(this,  "any", null, "Object", "ManufacturingSchema" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceClusterIdColumn(this,  "any", null, "Table", "ClusterIdColumn" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceTenantIdColumn(this,  "any", null, "Table", "TenantIdColumn" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceSuperClassRelation(this,  "any", null, "Table", "SuperClassRelation" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceAlternateIndex(this,  "any", null, "Table", "AlternateIndex" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceInheritedLookupIndex(this,  "any", null, "Table", "InheritedLookupIndex" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceContainerRelation(this,  "any", null, "Table", "ContainerRelation" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceOwnerRelation(this,  "any", null, "Table", "OwnerRelation" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceBaseClass(this,  "any", null, "Table", "BaseClass" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferencePrimaryKeyIndex(this,  "any", null, "Table", "PrimaryKeyIndex" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceOwnerContainerOrNamedLookupRelationCol(this,  "any", null, "Object", "OwnerContainerOrNamedLookupRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceSuperiorCandidateRelationCol(this,  "any", null, "Object", "SuperiorCandidateRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceSuperiorRelationCol(this,  "any", null, "Object", "SuperiorRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
	
        reference = new MSSBamYCFGenReferenceSuperiorPrimaryKeyRelationCol(this,  "any", null, "Object", "SuperiorPrimaryKeyRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
	
        reference = new MSSBamYCFGenReferenceSuperiorCandidatePrimaryKeyRelationCol(this,  "any", null, "Object", "SuperiorCandidatePrimaryKeyRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
	
        reference = new MSSBamYCFGenReferenceSuperiorNonCandidatePrimaryKeyRelationCol(this,  "any", null, "Object", "SuperiorNonCandidatePrimaryKeyRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
	
        reference = new MSSBamYCFGenReferenceSuperiorDataRelationCol(this,  "any", null, "Object", "SuperiorDataRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
	
        reference = new MSSBamYCFGenReferenceSuperiorCandidateDataRelationCol(this,  "any", null, "Object", "SuperiorCandidateDataRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
	
        reference = new MSSBamYCFGenReferenceSuperiorNonCandidateRelationCol(this,  "any", null, "Object", "SuperiorNonCandidateRelationRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSuperiorNonCandidateDataRelationCol(this,  "any", null, "Object", "SuperiorNonCandidateDataRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSubservientRelationCol(this,  "any", null, "Object", "SubservientRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSubservientDataRelationCol(this,  "any", null, "Object", "SubservientDataRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSubservientPrimaryKeyRelationCol(this,  "any", null, "Object", "SubservientPrimaryKeyRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSubservientCandidateRelationCol(this,  "any", null, "Object", "SubservientCandidateRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSubservientCandidateDataRelationCol(this,  "any", null, "Object", "SubservientCandidateDataRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSubservientCandidatePrimaryKeyRelationCol(this,  "any", null, "Object", "SubservientCandidatePrimaryKeyRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSubservientNonCandidateRelationCol(this,  "any", null, "Object", "SubservientNonCandidateRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSubservientNonCandidateDataRelationCol(this,  "any", null, "Object", "SubservientNonCandidateDataRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
    
        reference = new MSSBamYCFGenReferenceSubservientNonCandidatePrimaryKeyRelationCol(this,  "any", null, "Object", "SubservientNonCandidatePrimaryKeyRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceObjNameColumn(this,  "any", null, "Value", "ObjNameColumn" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceObjNameColumn(this,  "any", null, "Table", "ObjNameColumn" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceChain(this,  "any", null, "Table", "Chain" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceObjNameColumn(this,  "any", null, "Index", "ObjNameColumn" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceObjNameColumn(this,  "any", null, "IndexCol", "ObjNameColumn" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceFirstSuperiorCandidateRelationship(this,  "any", null, "Value", "FirstSuperiorCandidateRelationship" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
        
        reference = new MSSBamYCFGenReferenceFirstSuperiorNonCandidateRelationship(this,  "any", null, "Value", "FirstSuperiorNonCandidateRelationship" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;
        
        reference = new MSSBamYCFGenReferenceFirstSuperiorRelationship(this,  "any", null, "Value", "FirstSuperiorRelationship" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceFirstSuperiorCandidateRelationCol(this,  "any", null, "Value", "FirstSuperiorCandidateRelationCol" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

        reference = new MSSBamYCFGenReferenceReverseRelationship(this,  "any", null, "Relation", "ReverseRelationship" );
        editReference = (IYCFGenKbGenReferenceEditObj)reference.beginEdit();
		((IYCFGenKbGenItemEditObj)editReference).setRequiredContainerCartridge( ruleCart );
		((IYCFGenKbGenItemEditObj)editReference).setRequiredLookupRuleType( ruleTypeReference );
        editReference.create();
        editReference = null;

	}
}
