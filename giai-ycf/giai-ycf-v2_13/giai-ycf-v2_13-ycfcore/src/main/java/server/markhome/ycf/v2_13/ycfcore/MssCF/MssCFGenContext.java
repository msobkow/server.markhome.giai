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

import java.io.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

public class MssYCFGenContext
extends YCFGenKbGenItemEditObj
{
	protected MssYCFEngine				genEngine;

	/**
	 *	Generation contexts form a simple stack.
	 */
	protected MssYCFGenContext			prevContext = null;

	/**
	 *	The generation context needs to track information about the file being
	 *	generated.
	 */
	protected String					generatingBuild = "1";
	protected String					rootGenDir = null;
	protected String					outputDirName = null;
	protected String					outputGenerateOnce = null;
	protected String					outputModuleName = null;
	protected String					outputBaseName = null;
	protected String					outputName = null;
	protected String					outputFullName = null;
	protected PrintStream				output = null;
	protected MssYCFGenFileObj			genFile = null;
	protected MssYCFGenContext			genFileContext = null;
	protected String					genGenerateOnce = null;
	protected String					genModuleName = null;
	protected String					genBasePackageName = null;
	protected String					genSubPackageName = null;
	protected String					genDefClassName = null;
	protected String					sourceBundle = null;
	protected String					sourcePackage = null;

	/**
	 *	The generation context also tracks the current generation definition,
	 *	scope definition, and classes of them.
	 */
	protected IYCFLibAnyObj			genDef = null;
	protected IYCFLibAnyObj			scopeDef = null;

	/**
	 *	In order to support positional/indexed parameter binding, counters are
	 *	provided that can be created and used within a context.  They're automatically
	 *	disposed when the context stack pops.
	 */
	protected Map<String,MssYCFCounter> counterMap;

	public String getGeneratingBuild() {
		return( generatingBuild );
	}

	public void setGeneratingBuild( String buildString ) {
		if( ( buildString == null ) || ( buildString.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setGeneratingBuild",
				1,
				"buildString" );
		}
		if( buildString != generatingBuild ) {
			generatingBuild = buildString;
		}
	}

	public String getSourceBundle() {
		return( sourceBundle );
	}

	public IYCFLibAnyObj getGenDef() {
		return (genDef);
	}

	public void setGenDef( IYCFLibAnyObj value ) {
		final String S_ProcName = "setGenDef";
		genDef = value;
		if( genDef != null ) {
			String genDefClassName = genDef.getGenDefName();
			if( genDefClassName == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					"genDef.getGenDefName() returned null" );
			}
			IYCFGenKbDefClassObj optionalLookupGenDef = getSchema().getDefClassTableObj().readDefClassByNameIdx( genDefClassName );
			if( optionalLookupGenDef == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					"Could not resolve optionalLookupGenDef for \"" + genDefClassName + "\"" );
			}
			setRequiredLookupGenDef( optionalLookupGenDef );
			if( optionalLookupGenDef != getRequiredLookupGenDef() ) {
				throw new YCFLibRuntimeException( getClass(),
					S_ProcName,
					"getRequiredLookupGenDef() is out of sync with what we just set!" );
			}
		}
	}

	public IYCFLibAnyObj getScopeDef() {
		return (scopeDef);
	}

	public MssYCFEngine getGenEngine() {
		return( genEngine );
	}

	public void setGenEngine( MssYCFEngine value ) {
		genEngine = value;
	}

	public MssYCFGenContext getGenFileContext() {
		return( genFileContext );
	}

	public String getGenFileGenerateOnce() {
		return( outputGenerateOnce );
	}

	public String getGenFileModuleName() {
		return( outputModuleName );
	}

	public String getGenFileBaseName() {
		return( outputBaseName );
	}

	public String getGenFileName() {
		return( outputName );
	}

	public String getGenFileFullName() {
		return( outputFullName );
	}

	public String getSourcePackage() {
		return( sourceBundle );
	}

	public String getGeneratorName() {
		String retval = genEngine.getGeneratorName();
		return( retval );
	}

	public String getGeneratorVersion() {
		String retval = genEngine.getGeneratorVersion();
		return( retval );
	}

	public String getGenDate() {
		String retval = genEngine.getGenTimestampString();
		return( retval );
	}

	public String getGenTime() {
		String retval = null; // genEngine.getGenTimeString();
		return( retval );
	}

	public String getGenTimestamp() {
		String retval = genEngine.getGenTimestampString();
		return( retval );
	}

	public String getGenSerializableUID() {
		String retval = genEngine.getNextGenSerializableUIDString();
		return( retval );
	}

	protected IYCFGenKbGelInstructionObj genBasePackageBin = null;

	public String getGenBasePackageName() {
		if (genBasePackageName == null) {
			if( genBasePackageBin == null ) {
				if (genFile != null) {
					StringBuffer execName = new StringBuffer( genFile.getGenDefName() );
					execName.append( "::" );
					if( genFile.getOptionalLookupScopeDef() != null ) {
						execName.append( genFile.getOptionalLookupScopeDef().getRequiredName() );
						execName.append( "::" );
					}
					else {
						execName.append( "Object::" );
					}
					execName.append( genFile.getRequiredLookupGenDef().getRequiredName() );
					execName.append( ".BasePackageName" );
					String src = genFile.getOptionalBasePackageName();
					genBasePackageBin = genEngine.getGelCompiler().compileExecutable( execName.toString(), src, genFile );
				}
			}
			if( genBasePackageBin != null ) {
				genBasePackageName = genBasePackageBin.expand( this );
			}
		}
		return (genBasePackageName);
	}

	protected String getGenGenerateOnce() {
		if( genFile != null ) {
			genGenerateOnce = genFile.getOptionalGenerateOnce();
		}
		return( genGenerateOnce );
	}

	protected IYCFGenKbGelInstructionObj genModuleNameBin = null;

	public String getGenModuleName() {
		if (genModuleName == null) {
			if( genModuleNameBin == null ) {
				if (genFile != null) {
					StringBuffer execName = new StringBuffer( genFile.getGenDefName() );
					execName.append( "::" );
					if( genFile.getOptionalLookupScopeDef() != null ) {
						execName.append( genFile.getOptionalLookupScopeDef().getRequiredName() );
						execName.append( "::" );
					}
					else {
						execName.append( "Object::" );
					}
					execName.append( genFile.getRequiredLookupGenDef().getRequiredName() );
					execName.append( ".ModuleName" );
					String src = genFile.getOptionalModuleName();
					genModuleNameBin = genEngine.getGelCompiler().compileExecutable( execName.toString(), src, genFile );
				}
			}
			if( genModuleNameBin != null ) {
				genModuleName = genModuleNameBin.expand( this );
			}
		}
		return (genModuleName);
	}

	public MssYCFGenFileObj getGenFile() {
		return (genFile);
	}

	public String getGenSubPackageName() {
		if (genSubPackageName == null) {
			if (genFile != null) {
				genSubPackageName = genFile.getSubPackage( this );
			}
		}
		return (genSubPackageName);
	}

	public MssYCFGenContext getPrevContext() {
		return (prevContext);
	}

	public String getRootGenDir() {
		return (rootGenDir);
	}

	/**
	 *	Construct an expansion context for the stack that pushes a sub class and definition.
	 */
	public MssYCFGenContext(
		String				buildString,
		MssYCFGenContext		genContext,
		String				subClassGenDefName,
		IYCFLibAnyObj		subObject )
	{
		super( new YCFGenKbGenItemObj( genContext.getGenEngine().getYCFGenKbSchema() ) );
		final String S_ProcName = "MssYCFGenContext.MssYCFGenContext(3 args): ";

		genEngine = genContext.getGenEngine();
		setGeneratingBuild( buildString );
		setRequiredLookupToolSet( genContext.getRequiredLookupToolSet() );
		setRequiredName( genContext.getRequiredName() );

		setRequiredLookupGenDef( genEngine.getYCFGenKbSchema().getDefClassTableObj().readDefClassByNameIdx(subClassGenDefName) );
		if (getRequiredLookupGenDef() == null ) {
			throw new RuntimeException(S_ProcName + "Could not resolve RequiredLookupGenDef name " + subClassGenDefName);
		}
		rootGenDir = genContext.rootGenDir;
		prevContext = genContext;

		output = genContext.output;
		outputDirName = genContext.outputDirName;
		outputGenerateOnce = genContext.outputGenerateOnce;
		outputModuleName = genContext.outputModuleName;
		outputBaseName = genContext.outputBaseName;
		outputName = genContext.outputName;
		outputFullName = genContext.outputFullName;
		genFile = genContext.genFile;
		if( genFile != null ) {
			outputGenerateOnce = genFile.getOptionalGenerateOnce();
		}
		genFileContext = genContext.genFileContext;
		genDefClassName = getRequiredLookupGenDef().getRequiredName();
		genGenerateOnce = genContext.genGenerateOnce;
		genModuleName = genContext.genModuleName;
		genBasePackageName = genContext.genBasePackageName;
		genSubPackageName = genContext.genSubPackageName;
		sourceBundle = genContext.sourceBundle;
		sourcePackage = genContext.sourcePackage;

		counterMap = new HashMap<String,MssYCFCounter>();

		scopeDef = genContext.getGenDef();
		genDef = subObject;
	}



	/**
	 *	Construct an instance.  Only invoked to create binding entries.
	 */
	public MssYCFGenContext(
		String				generatingBuild,
		MssYCFEngine			engine,
		String				argRootGenDir,
		String				toolset,
		String				scopeDefClassName,
		String				genDefClassName,
		String				itemName )
	{
		super(new YCFGenKbGenItemObj(engine.getYCFGenKbSchema()));

		final String S_ProcName = "MssYCFGenContext.MssYCFGenContext(5 args) ";

		setGeneratingBuild( generatingBuild );

		setGenEngine( engine );

		setRequiredLookupToolSet( genEngine.getYCFGenKbSchema().getToolSetTableObj().readToolSetByNameIdx(toolset) );
		if( scopeDefClassName != null && scopeDefClassName.length() > 0 ) {
			setOptionalLookupScopeDef( genEngine.getYCFGenKbSchema().getDefClassTableObj().readDefClassByNameIdx(scopeDefClassName) );
		}
		else {
			setOptionalLookupScopeDef( null );
		}
		setRequiredLookupGenDef( genEngine.getYCFGenKbSchema().getDefClassTableObj().readDefClassByNameIdx(genDefClassName) );
		if (getRequiredLookupGenDef() == null) {
			throw new RuntimeException(S_ProcName + "RequiredLookupGenDef could not be resolved for name " + genDefClassName);
		}

		setRequiredName( itemName );

		rootGenDir = argRootGenDir;
		prevContext = null;

		output = null;
		outputDirName = null;
		outputGenerateOnce = null;
		outputModuleName = null;
		outputBaseName = null;
		outputName = null;
		outputFullName = null;

		genFile = null;
		genFileContext = null;
		genGenerateOnce = null;
		genModuleName = null;
		genBasePackageName = null;
		genSubPackageName = null;
		genDefClassName = null;

		counterMap = new HashMap<String,MssYCFCounter>();

		sourceBundle = null;
		sourcePackage = null;

		genDef = null;
		scopeDef = null;
	}



	/**
	 *	Construct an expansion context for the stack.
	 */
	public MssYCFGenContext(
		String				generatingBuild,
		MssYCFEngine			engine,
		String				argRootGenDir,
		String				toolset,
		String				scopeDefClassName,
		String				genDefClassName,
		String				itemName,
		IYCFLibAnyObj		argGenDef,
		IYCFLibAnyObj		argScopeDef )
	{
		super(new YCFGenKbGenItemObj(engine.getYCFGenKbSchema()));

		final String S_ProcName = "MssYCFGenContext.MssYCFGenContext(7 args) ";

		setGeneratingBuild( generatingBuild );

		setGenEngine( engine );

		setRequiredLookupToolSet( genEngine.getYCFGenKbSchema().getToolSetTableObj().readToolSetByNameIdx(toolset) );
		if( scopeDefClassName != null && scopeDefClassName.length() > 0 ) {
			setOptionalLookupScopeDef( genEngine.getYCFGenKbSchema().getDefClassTableObj().readDefClassByNameIdx(scopeDefClassName) );
		}
		else {
			setOptionalLookupScopeDef( null );
		}
		setRequiredLookupGenDef( genEngine.getYCFGenKbSchema().getDefClassTableObj().readDefClassByNameIdx(genDefClassName) );
		if (getRequiredLookupGenDef() == null) {
			throw new RuntimeException(S_ProcName + "RequiredLookupGenDef could not be resolved for name " + genDefClassName);
		}
		setRequiredName( itemName );

		rootGenDir = argRootGenDir;
		prevContext = null;

		output = null;
		outputDirName = null;
		outputGenerateOnce = null;
		outputModuleName = null;
		outputBaseName = null;
		outputName = null;
		outputFullName = null;

		genFile = null;
		genFileContext = null;
		genGenerateOnce = null;
		genModuleName = null;
		genBasePackageName = null;
		genSubPackageName = null;
		genDefClassName = null;

		counterMap = new HashMap<String,MssYCFCounter>();

		sourceBundle = null;
		sourcePackage = null;

		genDefClassName = getRequiredLookupGenDef().getRequiredName();

		genDef = argGenDef;
		scopeDef = argScopeDef;
	}

	/**
	 *	Build a reference context
	 */
	public MssYCFGenContext buildRefContext( String generatingBuild, IYCFLibAnyObj genDef ) {
		MssYCFGenContext		priorContext = null;
		IYCFLibAnyObj		scopeDef = null;
		MssYCFGenContext		ret = null;

		if( ( generatingBuild == null ) || ( generatingBuild.length() <= 0 ) ) {
			generatingBuild = getGeneratingBuild();
		}

	//	If we have more scope available, follow it first

		scopeDef = genDef.getObjScope();
		if( scopeDef != null ) {
			priorContext = buildRefContext( generatingBuild, scopeDef );
		}

	//	"Call" the current scope from the prior scope.  If we have no
	//	prior context, we have to treat the current artificial context
	//	as being the top.

		if( priorContext != null ) {
			ret = priorContext.getGenEngine().getGenContextFactory().newGenContext( generatingBuild,
				priorContext,
				genDef.getGenDefName(),
				genDef );
		}
		else {
			ret = getGenEngine().getGenContextFactory().newGenContext( generatingBuild,
				genEngine,
				rootGenDir,
				this.getRequiredLookupToolSet().getRequiredName(),
				null,
				genDef.getGenDefName(),
				genEngine.getTargetRuleName() );

			ret.rootGenDir = rootGenDir;
			ret.prevContext = this;

			ret.output = output;
			ret.outputDirName = outputDirName;
			ret.outputGenerateOnce = outputGenerateOnce;
			ret.outputModuleName = outputModuleName;
			ret.outputBaseName = outputBaseName;
			ret.outputName = outputName;
			ret.outputFullName = outputFullName;
			ret.genFile = genFile;
			if( ret.genFile != null ) {
				ret.outputGenerateOnce = ret.genFile.getOptionalGenerateOnce();
			}
			ret.genFileContext = genFileContext;
			ret.genSubPackageName = genSubPackageName;
			ret.genDefClassName = genDefClassName;
			ret.sourceBundle = sourceBundle;
			ret.sourcePackage = sourcePackage;
			ret.genDef = genDef;
		}

		return( ret );
	}

	public void setRootGenDir( String value ) {
		rootGenDir = value;
	}

	public void setPrevContext( MssYCFGenContext value ) {
		prevContext = value;
	}

	public void setOutput( PrintStream value ) {
		output = value;
	}

	public void setOutputDirName( String value ) {
		outputDirName = value;
	}

	public void setOutputGenerateOnce( String value ) {
		outputGenerateOnce = value;
	}

	public void setOutputModuleName( String value ) {
		outputModuleName = value;
	}

	public void setOutputBaseName( String value ) {
		outputBaseName = value;
	}

	public void setOutputName( String value ) {
		outputName = value;
	}

	public void setOutputFullName( String value ) {
		outputFullName = value;
	}

	public void setGenFile( MssYCFGenFileObj value ) {
		genFile = value;
		if( genFile != null ) {
			outputGenerateOnce = genFile.getOptionalGenerateOnce();
			outputModuleName = genFile.getModuleName( this );
		}
		else {
			outputGenerateOnce = null;
			outputModuleName = null;
		}
	}

	public void setGenFileContext( MssYCFGenContext value ) {
		genFileContext = value;
	}

	public void setGenSubPackageName( String value ) {
		genSubPackageName = value;
	}

	public void setGenDefClassName( String value ) {
		genDefClassName = value;
	}

	public void setSourceBundle( String value ) {
		sourceBundle = value;
	}

	public void setSourcePackage( String value ) {
		sourcePackage = value;
	}

	/**
	 *	Close the source file
	 */
	public void closeSourceFile() {
		if( output != null ) {
			output.close();
		}

		output = null;
		outputDirName = null;
		outputGenerateOnce = null;
		outputModuleName = null;
		outputBaseName = null;
		outputName = null;
		outputFullName = null;

		genFile = null;
		genFileContext = null;
		genDefClassName = null;
		genSubPackageName = null;

		sourceBundle = null;
		sourcePackage = null;
	}


	/**
	 *	Expand the body of an item
	 */
	public String expandItemBody( IYCFGenKbGenItemObj genItem )
	{
		String ret = null;
		final String S_ProcName = "MssYCFGenContext.expandItemBody() ";

		if( this.getGenEngine().getDebugMode() ) {
			String tbe = genItem.getRequiredName();
			if( tbe != null ) {
				System.err.println( "Expanding " + tbe + "..." );
			}
			else {
				System.err.println( "Expanding ?null?..." );
			}
		}

		if( genItem instanceof MssYCFGenFileObj ) {
			ret = ((MssYCFGenFileObj)genItem).expandBody( this );
		}
		else if( genItem instanceof MssYCFGenRuleObj ) {
   			ret = ((MssYCFGenRuleObj)genItem).expandBody( this );
		}
		else if (genItem instanceof MssYCFGenTruncObj)
		{
			ret = ((MssYCFGenTruncObj)genItem).expandBody(this);
		}
		else if (genItem instanceof MssYCFGenBindObj)
		{
			ret = ((MssYCFGenBindObj)genItem).expandBody( this );
		}
		else if( genItem instanceof MssYCFGenReferenceObj ) {
			throw new RuntimeException(S_ProcName + "Cannot expand reference " + genItem.getRequiredName() + " directly");
		}
		else if( genItem instanceof MssYCFGenIteratorObj ) {
   			ret = ((MssYCFGenIteratorObj)genItem).expandBody( this );
		}
		else {
			throw new RuntimeException( S_ProcName +  "Unsupported generation item class" );
		}

		return( ret );
	}

	public void flush()
	{
		output.flush();
	}

	public void newLine()
	{
		output.append("\n");
	}

	public void openSourceFile(
		MssYCFGenFileObj			argGenFile,
		String					argGenDefClassName,
		String					argSourceBundle,
		String					moduleName,
		String					fullPackage,
		String					baseGenDir,
		String					baseWorkDir,
		String					srcFileDir,
		String					fileName,
		String					generateOnce )
	{
		FileOutputStream		fileWriter = null;
		FileOutputStream		outputFile = null;
		String					fileSep = null;
		String					sysDirName = null;

		final String S_ProcName = "MssYCFGenContext.openSourceFile() ";

		if( argGenFile == null ) {
			throw new RuntimeException( S_ProcName + "argGenFile is null" );
		}

		if( ( argGenDefClassName == null ) || ( argGenDefClassName.length() == 0 ) ) {
			throw new RuntimeException( S_ProcName + "argGenDefClassName is null or empty" );
		}

		if( argSourceBundle == null ) {
			throw new RuntimeException( S_ProcName + "argSourceBundle is null or empty" );
		}

		if( moduleName == null ) {
			throw new RuntimeException( S_ProcName + "moduleName is null" );
		}

		if( fullPackage == null ) {
			throw new RuntimeException( S_ProcName + "fullPackage is null" );
		}

		if( ( baseGenDir == null ) || ( baseGenDir.length() == 0 ) ) {
			throw new RuntimeException( S_ProcName + "baseGenDir is null or empty" );
		}

		if( ( baseWorkDir == null ) || ( baseWorkDir.length() == 0 ) ) {
			throw new RuntimeException( S_ProcName + "baseWorkDir is null or empty" );
		}

		if( ( fileName == null ) || ( fileName.length() == 0 ) ) {
			throw new RuntimeException( S_ProcName + "fileName is null or empty" );
		}

		if( output != null ) {
			throw new RuntimeException( S_ProcName + "Generation context is already writing \""
				+ outputName
				+ "\"" );
		}

		//	Save the generation context

		setGenFile( argGenFile );
		genFileContext = this;
		genDefClassName = argGenDefClassName; 
		int lastDot = fileName.lastIndexOf( '.' );
		if( lastDot >= 0 ) {
			outputDirName = fileName.substring( 0, lastDot );
		}
		else {
			outputDirName = fileName;
		}
		outputName = fileName;
		if (srcFileDir != null) {
			outputDirName = baseGenDir + File.separator + srcFileDir;
		}
		else {
			outputDirName = baseGenDir;
		}
		sourceBundle = argSourceBundle;
		sourcePackage = fullPackage;

		outputModuleName = moduleName;

		/*
		 *	Internally the code always uses forward slashes to separate file names,
		 *	so we need to switch them over to backslashes on DOS derived file systems
		 *	such as DOS, Win95, WinNT, and OS/2.
		 */
		String outputWorkName;
		fileSep = File.separator;
		if (fileSep.length() == 1) {
			outputWorkName = ( baseWorkDir + fileSep + srcFileDir + fileSep + outputName ).replace('/', fileSep.charAt(0));
			outputFullName = ( outputDirName + fileSep + outputName ).replace('/', fileSep.charAt(0));
			sysDirName = outputDirName.replace( '/', fileSep.charAt(0) );
		}
		else {
			outputWorkName = baseWorkDir + fileSep + srcFileDir + fileSep + outputName;
			outputFullName = outputDirName + fileSep + outputName;
			sysDirName = outputDirName;
		}

		createDirectory(sysDirName);

		final String S_Empty = "";
		final String S_False = "false";
		final String S_No = "no";
		final String S_True = "true";
		final String S_Yes = "yes";

		try {
			File file = new File( outputFullName );
			if( file.exists() ) {
				// Fully validate the value of generateOnce
				if( ( generateOnce == null )
				 	|| generateOnce.equals( S_Empty )
				 	|| generateOnce.equals( S_False )
				 	|| generateOnce.equals( S_No ) )
				{
					outputFile = new FileOutputStream(outputFullName, false);
				}
				else if( S_True.equals( generateOnce )
					|| S_Yes.equals( generateOnce ) )
				{
					outputFile = null;
				}
				else {
					outputFile = new FileOutputStream(outputFullName, false);
				}
			}
			else {
				outputFile = new FileOutputStream(outputFullName);
			}

			if( outputFile != null ) {	
				fileWriter = outputFile;
				output = new PrintStream( fileWriter );
			}
			else {
				fileWriter = null;
				output = null;
			}

			if( outputFullName.endsWith( ".bash" ) ) {
				file.setExecutable( true );
				file.setExecutable( true, false );
			}
		}
		catch( FileNotFoundException e ) {
			System.err.append( S_ProcName + "Could not resolve part of the file name \"" + outputFullName + "\"\n");
			YCFLib.beep();
			fileWriter = null;
			output = null;
		}

		genEngine.getLog().message( "Manufacturing " + outputWorkName );
	}

	public static void createDirectory(String fullDirPath)
	{
		File ultimateGoal = new File( fullDirPath );
		ultimateGoal.mkdirs();
	}


	/**
	 *	Wrapper for the BufferedWriter output stream
	 */
	public void write( int c)
	{
		if( output != null ) {
			output.append( Integer.toString(c) );
		}
	}

	public void write( String s )
	{
		if( output != null ) {
			output.append( s );
		}
	}


	public MssYCFCounter addCounter( String name ) {
		final String S_ProcName = "MssYCFGenContext.addCounter() ";
		if( ( name == null ) || ( name.length() == 0 ) ) {
			throw new RuntimeException( S_ProcName + "Parameter 1 \"name\" is null or empty" );
		}

		if( counterMap.containsKey( name ) ) {
			throw new RuntimeException( S_ProcName + "Counter \"" + name + "\" already exists" );
		}

		MssYCFCounter newCounter = new MssYCFCounter( name );
		counterMap.put( newCounter.getName(), newCounter );

		return( newCounter );
	}

	public MssYCFCounter getCounter( String name ) {
		final String S_ProcName = "MssYCFGenContext.getCounter() ";
		if ((name == null) || (name.length() == 0))
		{
			throw new RuntimeException(S_ProcName + "Parameter 1 \"name\" is null or empty");
		}

		MssYCFCounter found = null;
		if (counterMap.containsKey(name))
		{
			found = counterMap.get( name );
		}
		else
		{
			MssYCFGenContext probe = this;
			while( ( found == null ) && ( probe.prevContext != null ) ) {
				probe = probe.prevContext;
				found = probe.getCounter( name );
			}
		}

		return( found );
	}
}
