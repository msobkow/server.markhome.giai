/*
 *	MSS Code Factory YCFBam 2.13 CustXmlLoader
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

package org.mssycf.mssycf.v2_13.ycfbamcust.YCFBamXmlLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

import org.xml.sax.*;

import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfbamcust.MSSBamYCF.MSSBamYCFEngine;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFSaxParser;

public class YCFBamXmlLoader
	extends MssYCFSaxParser
	implements ContentHandler
{

	// The namespace URI of the supported schema
	public final static String	SCHEMA_XMLNS = "http://mssycf.org/mssycf/2.0.13/xsd/mssbam-2.13";

	// The source for loading the supported schema
	public final static String	SCHEMA_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/mssbam-2.13.xsd";
	public final static String	SCHEMA_ROOT_URI = "http://mycf.markhome.server/mssycf/2.0.13/xsd/mssbam-2.13.xsd";

	// The schema instance to load in to

	private IYCFBamSchemaObj schemaObj = null;
	// Loader behaviour configuration attributes

	// Constructors

	public YCFBamXmlLoader( MSSBamYCFEngine engine, IYCFLibMessageLog jLogger ) {
		super( engine, jLogger );
		bamEngine = engine;
		setRootElementHandler( getSaxRootHandler() );
		initParser();
	}

	/**
	 *	The directories containing XML Models
	 */
	protected static ArrayList<String> modelPath = new ArrayList<String>();

	protected IYCFBamTenantObj tenant = null;

	protected IYCFLibAnyObj definedProjectVersion = null;

	protected MSSBamYCFEngine bamEngine = null;

	public MSSBamYCFEngine getBamEngine() {
		return( bamEngine );
	}

//	JVM Config: ModelPath

	/**
	 *	Add an XML repository model directory the model path.
	 */
	public static void addModelPath( String dirname ) {
		assert ( ( dirname != null ) && ( dirname.length() > 0 ) ) : "dirname (arg 1) is null or empty";
		Iterator<String> iter = modelPath.iterator();
		while( iter.hasNext() ) {
			String match = iter.next();
			if( dirname.equals( match ) ) {
				return;
			}
		}
		modelPath.add( new String( dirname ) );
	}

	/**
	 *	Get an iteration of the model path directories.
	 *
	 *	@return Iteration of Strings.
	 */
	public static Iterator<String> getModelPathIterator() {
		Iterator<String> iter = modelPath.iterator();
		return( iter );
	}

//	Results: Produced by a successful parse

	/**
	 *	Get the tenant that contains the parse.
	 *
	 *	@return	The parsed MSSBam
	 */
	public IYCFBamTenantObj getTenant() {
		return( tenant );
	}

	/**
	 *	Set the tenant to receive the parse
	 */
	public void setTenant( IYCFBamTenantObj value ) {
		tenant = value;
	}

	/**
	 *	Get the project version defined by the repository model.
	 *
	 *	@return	The ProjectVersion defined by the model.
	 */
	public IYCFLibAnyObj getDefinedProjectVersion() {
		return( definedProjectVersion );
	}

//	Runtime: Load a MSSBam

	/**
	 *	Load a MSSBam.
	 *
	 *	@param	modelName	The name of the model to be loaded
	 */
	public IYCFBamTenantObj loadTenant( String modelName ) {

//		Get the model path to be searched

		String modelNameDotXml;
		if( modelName.endsWith( ".xml" ) ) {
			modelNameDotXml = modelName;
		}
		else {
			modelNameDotXml = modelName + ".xml";
		}

		String tenantFileName = null;
		String tenantRootDir = null;
		InputStream tenantXml = null;

		Iterator<String> iterPath = getModelPathIterator();
		while( ( tenantXml == null ) && iterPath.hasNext() ) {

			String modelDir = iterPath.next();
			int modelDirLen = modelDir.length();
			assert modelDirLen > 0 : "ModelPath directory entry is empty";
			char modelDirTail = modelDir.charAt( modelDirLen - 1 );
			if( ( modelDirTail == '/' ) || ( modelDirTail ==  '\\' ) ) {
				tenantRootDir = modelDir;
			}
			else {
				tenantRootDir = modelDir + File.separator;
			}

			tenantFileName = tenantRootDir + modelNameDotXml;
			try {
				tenantXml = new FileInputStream( tenantFileName );
			}
			catch( FileNotFoundException e ) {
				tenantXml = null;
				tenantFileName = null;
				tenantRootDir = null;
			}
		}

//		Did we find the model?

		if( tenantXml == null ) {
			throw new YCFLibRuntimeException( getClass(),
				"loadTenant",
				getLocationInfo() + " Could not locate Repository Model \"" + modelName + "\"" ); 
		}
		else {
			getBamEngine().getLog().message( "Loading " + modelName );
		}

//		Parse the model

		try {
			parse( tenantXml, tenantRootDir );
		}
		finally {
			try {
				tenantXml.close();
			}
			catch( Exception e ) {
				throw new YCFLibRuntimeException( getClass(),
					"loadTenant",
					getLocationInfo() + " Could not close Business Application Model \"" + modelName + "\"", e ); 
			}
		}

		return( tenant );
	}

	public static boolean getProcessSchema( YCFLibXmlCoreContext curContext ) {
		final String S_ProcName = "getProcessSchema";
		boolean retval = false;
		YCFLibXmlCoreContext workContext = curContext;

		Object obj = null;
		while( ( obj == null ) && ( workContext != null ) ) {
			obj = workContext.getNamedValue( "ProcessSchema" );
			if( obj == null ) {
				workContext = workContext.getPrevContext();
			}
		}

		if( obj == null ) {
			retval = false;
		}
		else if( obj instanceof String ) {
			String strval = (String)obj;
			if( "true".equals( strval ) ) {
				retval = true;
			}
			else if( "false".equals( strval ) ) {
				retval = false;
			}
			else {
				throw new YCFLibInvalidArgumentException( YCFBamXmlLoader.class,
					S_ProcName,
					0,
					"ProcessSchema",
					"Invalid argument, must be one of true or false, not " + strval );
			}
		}
		else {
			new YCFLibUnsupportedClassException( YCFBamXmlLoader.class,
					S_ProcName,
					"ProcessSchema",
					obj,
					"String" );
		}

		return( retval );
	}

	// Element Handler instances

	private YCFBamXmlLoaderCommonLicenseHandler commonLicenseHandler = null;
	private YCFBamXmlLoaderClientImplLicenseHandler clientImplLicenseHandler = null;
	private YCFBamXmlLoaderClientXFaceLicenseHandler clientXFaceLicenseHandler = null;
	private YCFBamXmlLoaderServerImplLicenseHandler serverImplLicenseHandler = null;
	private YCFBamXmlLoaderServerXFaceLicenseHandler serverXFaceLicenseHandler = null;
	private YCFBamXmlLoaderBlobColHandler blobColHandler = null;
	private YCFBamXmlLoaderBlobTypeHandler blobTypeHandler = null;
	private YCFBamXmlLoaderBoolColHandler boolColHandler = null;
	private YCFBamXmlLoaderBoolTypeHandler boolTypeHandler = null;
	private YCFBamXmlLoaderChainHandler chainHandler = null;
	private YCFBamXmlLoaderClearDepHandler clearDepHandler = null;
	private YCFBamXmlLoaderDateColHandler dateColHandler = null;
	private YCFBamXmlLoaderDateTypeHandler dateTypeHandler = null;
	private YCFBamXmlLoaderDelDepHandler delDepHandler = null;
	private YCFBamXmlLoaderDoubleColHandler doubleColHandler = null;
	private YCFBamXmlLoaderDoubleTypeHandler doubleTypeHandler = null;
	private YCFBamXmlLoaderEnumTagHandler enumTagHandler = null;
	private YCFBamXmlLoaderEnumTypeHandler enumTypeHandler = null;
	private YCFBamXmlLoaderFloatColHandler floatColHandler = null;
	private YCFBamXmlLoaderFloatTypeHandler floatTypeHandler = null;
	private YCFBamXmlLoaderId16GenHandler id16GenHandler = null;
	private YCFBamXmlLoaderId32GenHandler id32GenHandler = null;
	private YCFBamXmlLoaderId64GenHandler id64GenHandler = null;
	private YCFBamXmlLoaderIndexHandler indexHandler = null;
	private YCFBamXmlLoaderIndexColHandler indexColHandler = null;
	private YCFBamXmlLoaderIndexTweakHandler indexTweakHandler = null;
	private YCFBamXmlLoaderIndexAddendumHandler indexAddendumHandler = null;
	private YCFBamXmlLoaderInt16ColHandler int16ColHandler = null;
	private YCFBamXmlLoaderInt16TypeHandler int16TypeHandler = null;
	private YCFBamXmlLoaderInt32ColHandler int32ColHandler = null;
	private YCFBamXmlLoaderInt32TypeHandler int32TypeHandler = null;
	private YCFBamXmlLoaderInt64ColHandler int64ColHandler = null;
	private YCFBamXmlLoaderInt64TypeHandler int64TypeHandler = null;
	private YCFBamXmlLoaderCafeMethodBodyHandler cafeMethodBodyHandler = null;
	private YCFBamXmlLoaderCafeSchemaObjInterfaceHandler cafeSchemaObjInterfaceHandler = null;
	private YCFBamXmlLoaderCafeSchemaObjMembersHandler cafeSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCafeSchemaObjImportHandler cafeSchemaObjImportHandler = null;
	private YCFBamXmlLoaderCafeSchemaObjImplementationHandler cafeSchemaObjImplementationHandler = null;
	private YCFBamXmlLoaderCafeDb2LUWSchemaObjMembersHandler cafeDb2LUWSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCafeDb2LUWSchemaObjImplHandler cafeDb2LUWSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCafeDb2LUWSchemaObjImportHandler cafeDb2LUWSchemaObjImportHandler = null;
	private YCFBamXmlLoaderCafeMSSqlSchemaObjMembersHandler cafeMSSqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCafeMSSqlSchemaObjImplHandler cafeMSSqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCafeMSSqlSchemaObjImportHandler cafeMSSqlSchemaObjImportHandler = null;
	private YCFBamXmlLoaderCafeMySqlSchemaObjMembersHandler cafeMySqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCafeMySqlSchemaObjImplHandler cafeMySqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCafeMySqlSchemaObjImportHandler cafeMySqlSchemaObjImportHandler = null;
	private YCFBamXmlLoaderCafeOracleSchemaObjMembersHandler cafeOracleSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCafeOracleSchemaObjImplHandler cafeOracleSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCafeOracleSchemaObjImportHandler cafeOracleSchemaObjImportHandler = null;
	private YCFBamXmlLoaderCafePgSqlSchemaObjMembersHandler cafePgSqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCafePgSqlSchemaObjImplHandler cafePgSqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCafePgSqlSchemaObjImportHandler cafePgSqlSchemaObjImportHandler = null;
	private YCFBamXmlLoaderCafeRamSchemaObjMembersHandler cafeRamSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCafeRamSchemaObjImplHandler cafeRamSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCafeRamSchemaObjImportHandler cafeRamSchemaObjImportHandler = null;
	private YCFBamXmlLoaderCafeXMsgSchemaImportHandler cafeXMsgSchemaImportHandler = null;
	private YCFBamXmlLoaderCafeXMsgSchemaFormattersHandler cafeXMsgSchemaFormattersHandler = null;
	private YCFBamXmlLoaderCafeXMsgClientSchemaImportHandler cafeXMsgClientSchemaImportHandler = null;
	private YCFBamXmlLoaderCafeXMsgClientSchemaBodyHandler cafeXMsgClientSchemaBodyHandler = null;
	private YCFBamXmlLoaderCafeXMsgRqstSchemaBodyHandler cafeXMsgRqstSchemaBodyHandler = null;
	private YCFBamXmlLoaderCafeXMsgRqstSchemaImportHandler cafeXMsgRqstSchemaImportHandler = null;
	private YCFBamXmlLoaderCafeXMsgRqstSchemaWireParsersHandler cafeXMsgRqstSchemaWireParsersHandler = null;
	private YCFBamXmlLoaderCafeXMsgRqstSchemaXsdElementListHandler cafeXMsgRqstSchemaXsdElementListHandler = null;
	private YCFBamXmlLoaderCafeXMsgRqstSchemaXsdSpecHandler cafeXMsgRqstSchemaXsdSpecHandler = null;
	private YCFBamXmlLoaderCafeXMsgRspnSchemaBodyHandler cafeXMsgRspnSchemaBodyHandler = null;
	private YCFBamXmlLoaderCafeXMsgRspnSchemaImportHandler cafeXMsgRspnSchemaImportHandler = null;
	private YCFBamXmlLoaderCafeXMsgRspnSchemaWireParsersHandler cafeXMsgRspnSchemaWireParsersHandler = null;
	private YCFBamXmlLoaderCafeXMsgRspnSchemaXsdElementListHandler cafeXMsgRspnSchemaXsdElementListHandler = null;
	private YCFBamXmlLoaderCafeXMsgRspnSchemaXsdSpecHandler cafeXMsgRspnSchemaXsdSpecHandler = null;
	private YCFBamXmlLoaderCafeObjMembersHandler cafeObjMembersHandler = null;
	private YCFBamXmlLoaderCafeObjInterfaceHandler cafeObjInterfaceHandler = null;
	private YCFBamXmlLoaderCafeObjImplementationHandler cafeObjImplementationHandler = null;
	private YCFBamXmlLoaderCafeEditObjMembersHandler cafeEditObjMembersHandler = null;
	private YCFBamXmlLoaderCafeEditObjInterfaceHandler cafeEditObjInterfaceHandler = null;
	private YCFBamXmlLoaderCafeEditObjImplementationHandler cafeEditObjImplementationHandler = null;
	private YCFBamXmlLoaderCafeDb2LUWTableImportHandler cafeDb2LUWTableImportHandler = null;
	private YCFBamXmlLoaderCafeMSSqlTableImportHandler cafeMSSqlTableImportHandler = null;
	private YCFBamXmlLoaderCafeMySqlTableImportHandler cafeMySqlTableImportHandler = null;
	private YCFBamXmlLoaderCafeOracleTableImportHandler cafeOracleTableImportHandler = null;
	private YCFBamXmlLoaderCafePgSqlTableImportHandler cafePgSqlTableImportHandler = null;
	private YCFBamXmlLoaderCafeRamTableImportHandler cafeRamTableImportHandler = null;
	private YCFBamXmlLoaderCafeObjImportHandler cafeObjImportHandler = null;
	private YCFBamXmlLoaderCafeEditObjImportHandler cafeEditObjImportHandler = null;
	private YCFBamXmlLoaderCafeSaxLoaderImportHandler cafeSaxLoaderImportHandler = null;
	private YCFBamXmlLoaderCafeTableImportHandler cafeTableImportHandler = null;
	private YCFBamXmlLoaderCafeTableObjImportHandler cafeTableObjImportHandler = null;
	private YCFBamXmlLoaderCafeTableMembersHandler cafeTableMembersHandler = null;
	private YCFBamXmlLoaderCafeTableInterfaceHandler cafeTableInterfaceHandler = null;
	private YCFBamXmlLoaderCafeTableImplementationHandler cafeTableImplementationHandler = null;
	private YCFBamXmlLoaderCafeTableObjMembersHandler cafeTableObjMembersHandler = null;
	private YCFBamXmlLoaderCafeTableObjInterfaceHandler cafeTableObjInterfaceHandler = null;
	private YCFBamXmlLoaderCafeTableObjImplementationHandler cafeTableObjImplementationHandler = null;
	private YCFBamXmlLoaderCafeDb2LUWTableMembersHandler cafeDb2LUWTableMembersHandler = null;
	private YCFBamXmlLoaderCafeDb2LUWTableImplementationHandler cafeDb2LUWTableImplementationHandler = null;
	private YCFBamXmlLoaderCafeMSSqlTableMembersHandler cafeMSSqlTableMembersHandler = null;
	private YCFBamXmlLoaderCafeMSSqlTableImplementationHandler cafeMSSqlTableImplementationHandler = null;
	private YCFBamXmlLoaderCafeMySqlTableMembersHandler cafeMySqlTableMembersHandler = null;
	private YCFBamXmlLoaderCafeMySqlTableImplementationHandler cafeMySqlTableImplementationHandler = null;
	private YCFBamXmlLoaderCafeOracleTableMembersHandler cafeOracleTableMembersHandler = null;
	private YCFBamXmlLoaderCafeOracleTableImplementationHandler cafeOracleTableImplementationHandler = null;
	private YCFBamXmlLoaderCafePgSqlTableMembersHandler cafePgSqlTableMembersHandler = null;
	private YCFBamXmlLoaderCafePgSqlTableImplementationHandler cafePgSqlTableImplementationHandler = null;
	private YCFBamXmlLoaderCafeRamTableMembersHandler cafeRamTableMembersHandler = null;
	private YCFBamXmlLoaderCafeRamTableImplementationHandler cafeRamTableImplementationHandler = null;
	private YCFBamXmlLoaderCafeSaxLoaderStartElementHandler cafeSaxLoaderStartElementHandler = null;
	private YCFBamXmlLoaderCafeSaxLoaderEndElementHandler cafeSaxLoaderEndElementHandler = null;
	private YCFBamXmlLoaderCafeXMsgTableImportHandler cafeXMsgTableImportHandler = null;
	private YCFBamXmlLoaderCafeXMsgTableFormattersHandler cafeXMsgTableFormattersHandler = null;
	private YCFBamXmlLoaderCafeXMsgRqstTableImportHandler cafeXMsgRqstTableImportHandler = null;
	private YCFBamXmlLoaderCafeXMsgRspnTableImportHandler cafeXMsgRspnTableImportHandler = null;
	private YCFBamXmlLoaderCafeXMsgClientTableImportHandler cafeXMsgClientTableImportHandler = null;
	private YCFBamXmlLoaderCafeXMsgRqstTableBodyHandler cafeXMsgRqstTableBodyHandler = null;
	private YCFBamXmlLoaderCafeXMsgRspnTableBodyHandler cafeXMsgRspnTableBodyHandler = null;
	private YCFBamXmlLoaderCafeXMsgClientTableBodyHandler cafeXMsgClientTableBodyHandler = null;
	private YCFBamXmlLoaderCPlusMethodBodyHandler cplusMethodBodyHandler = null;
	private YCFBamXmlLoaderCPlusSchemaObjInterfaceHandler cplusSchemaObjInterfaceHandler = null;
	private YCFBamXmlLoaderCPlusSchemaObjMembersHandler cplusSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusSchemaObjIncludeHandler cplusSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusSchemaObjImplementationHandler cplusSchemaObjImplementationHandler = null;
	private YCFBamXmlLoaderCPlusDb2LUWSchemaObjMembersHandler cplusDb2LUWSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusDb2LUWSchemaObjImplHandler cplusDb2LUWSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCPlusDb2LUWSchemaObjIncludeHandler cplusDb2LUWSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusMSSqlSchemaObjMembersHandler cplusMSSqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusMSSqlSchemaObjImplHandler cplusMSSqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCPlusMSSqlSchemaObjIncludeHandler cplusMSSqlSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusMySqlSchemaObjMembersHandler cplusMySqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusMySqlSchemaObjImplHandler cplusMySqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCPlusMySqlSchemaObjIncludeHandler cplusMySqlSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusOracleSchemaObjMembersHandler cplusOracleSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusOracleSchemaObjImplHandler cplusOracleSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCPlusOracleSchemaObjIncludeHandler cplusOracleSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusPgSqlSchemaObjMembersHandler cplusPgSqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusPgSqlSchemaObjImplHandler cplusPgSqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCPlusPgSqlSchemaObjIncludeHandler cplusPgSqlSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusRamSchemaObjMembersHandler cplusRamSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusRamSchemaObjImplHandler cplusRamSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCPlusRamSchemaObjIncludeHandler cplusRamSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusXMsgSchemaIncludeHandler cplusXMsgSchemaIncludeHandler = null;
	private YCFBamXmlLoaderCPlusXMsgSchemaFormattersHandler cplusXMsgSchemaFormattersHandler = null;
	private YCFBamXmlLoaderCPlusXMsgClientSchemaIncludeHandler cplusXMsgClientSchemaIncludeHandler = null;
	private YCFBamXmlLoaderCPlusXMsgClientSchemaBodyHandler cplusXMsgClientSchemaBodyHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRqstSchemaBodyHandler cplusXMsgRqstSchemaBodyHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRqstSchemaIncludeHandler cplusXMsgRqstSchemaIncludeHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRqstSchemaWireParsersHandler cplusXMsgRqstSchemaWireParsersHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRqstSchemaXsdElementListHandler cplusXMsgRqstSchemaXsdElementListHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRqstSchemaXsdSpecHandler cplusXMsgRqstSchemaXsdSpecHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRspnSchemaBodyHandler cplusXMsgRspnSchemaBodyHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRspnSchemaIncludeHandler cplusXMsgRspnSchemaIncludeHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRspnSchemaWireParsersHandler cplusXMsgRspnSchemaWireParsersHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRspnSchemaXsdElementListHandler cplusXMsgRspnSchemaXsdElementListHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRspnSchemaXsdSpecHandler cplusXMsgRspnSchemaXsdSpecHandler = null;
	private YCFBamXmlLoaderCPlusObjMembersHandler cplusObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusObjInterfaceHandler cplusObjInterfaceHandler = null;
	private YCFBamXmlLoaderCPlusObjImplementationHandler cplusObjImplementationHandler = null;
	private YCFBamXmlLoaderCPlusEditObjMembersHandler cplusEditObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusEditObjInterfaceHandler cplusEditObjInterfaceHandler = null;
	private YCFBamXmlLoaderCPlusEditObjImplementationHandler cplusEditObjImplementationHandler = null;
	private YCFBamXmlLoaderCPlusDb2LUWTableIncludeHandler cplusDb2LUWTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusMSSqlTableIncludeHandler cplusMSSqlTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusMySqlTableIncludeHandler cplusMySqlTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusOracleTableIncludeHandler cplusOracleTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusPgSqlTableIncludeHandler cplusPgSqlTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusRamTableIncludeHandler cplusRamTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusObjIncludeHandler cplusObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusEditObjIncludeHandler cplusEditObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusSaxLoaderIncludeHandler cplusSaxLoaderIncludeHandler = null;
	private YCFBamXmlLoaderCPlusTableIncludeHandler cplusTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusTableObjIncludeHandler cplusTableObjIncludeHandler = null;
	private YCFBamXmlLoaderCPlusTableMembersHandler cplusTableMembersHandler = null;
	private YCFBamXmlLoaderCPlusTableInterfaceHandler cplusTableInterfaceHandler = null;
	private YCFBamXmlLoaderCPlusTableImplementationHandler cplusTableImplementationHandler = null;
	private YCFBamXmlLoaderCPlusTableObjMembersHandler cplusTableObjMembersHandler = null;
	private YCFBamXmlLoaderCPlusTableObjInterfaceHandler cplusTableObjInterfaceHandler = null;
	private YCFBamXmlLoaderCPlusTableObjImplementationHandler cplusTableObjImplementationHandler = null;
	private YCFBamXmlLoaderCPlusDb2LUWTableMembersHandler cplusDb2LUWTableMembersHandler = null;
	private YCFBamXmlLoaderCPlusDb2LUWTableImplementationHandler cplusDb2LUWTableImplementationHandler = null;
	private YCFBamXmlLoaderCPlusMSSqlTableMembersHandler cplusMSSqlTableMembersHandler = null;
	private YCFBamXmlLoaderCPlusMSSqlTableImplementationHandler cplusMSSqlTableImplementationHandler = null;
	private YCFBamXmlLoaderCPlusMySqlTableMembersHandler cplusMySqlTableMembersHandler = null;
	private YCFBamXmlLoaderCPlusMySqlTableImplementationHandler cplusMySqlTableImplementationHandler = null;
	private YCFBamXmlLoaderCPlusOracleTableMembersHandler cplusOracleTableMembersHandler = null;
	private YCFBamXmlLoaderCPlusOracleTableImplementationHandler cplusOracleTableImplementationHandler = null;
	private YCFBamXmlLoaderCPlusPgSqlTableMembersHandler cplusPgSqlTableMembersHandler = null;
	private YCFBamXmlLoaderCPlusPgSqlTableImplementationHandler cplusPgSqlTableImplementationHandler = null;
	private YCFBamXmlLoaderCPlusRamTableMembersHandler cplusRamTableMembersHandler = null;
	private YCFBamXmlLoaderCPlusRamTableImplementationHandler cplusRamTableImplementationHandler = null;
	private YCFBamXmlLoaderCPlusSaxLoaderStartElementHandler cplusSaxLoaderStartElementHandler = null;
	private YCFBamXmlLoaderCPlusSaxLoaderEndElementHandler cplusSaxLoaderEndElementHandler = null;
	private YCFBamXmlLoaderCPlusXMsgTableIncludeHandler cplusXMsgTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusXMsgTableFormattersHandler cplusXMsgTableFormattersHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRqstTableIncludeHandler cplusXMsgRqstTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRspnTableIncludeHandler cplusXMsgRspnTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusXMsgClientTableIncludeHandler cplusXMsgClientTableIncludeHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRqstTableBodyHandler cplusXMsgRqstTableBodyHandler = null;
	private YCFBamXmlLoaderCPlusXMsgRspnTableBodyHandler cplusXMsgRspnTableBodyHandler = null;
	private YCFBamXmlLoaderCPlusXMsgClientTableBodyHandler cplusXMsgClientTableBodyHandler = null;
	private YCFBamXmlLoaderHPlusSchemaObjInterfaceHandler hplusSchemaObjInterfaceHandler = null;
	private YCFBamXmlLoaderHPlusSchemaObjMembersHandler hplusSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusSchemaObjIncludeHandler hplusSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusSchemaObjImplementationHandler hplusSchemaObjImplementationHandler = null;
	private YCFBamXmlLoaderHPlusDb2LUWSchemaObjMembersHandler hplusDb2LUWSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusDb2LUWSchemaObjImplHandler hplusDb2LUWSchemaObjImplHandler = null;
	private YCFBamXmlLoaderHPlusDb2LUWSchemaObjIncludeHandler hplusDb2LUWSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusMSSqlSchemaObjMembersHandler hplusMSSqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusMSSqlSchemaObjImplHandler hplusMSSqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderHPlusMSSqlSchemaObjIncludeHandler hplusMSSqlSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusMySqlSchemaObjMembersHandler hplusMySqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusMySqlSchemaObjImplHandler hplusMySqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderHPlusMySqlSchemaObjIncludeHandler hplusMySqlSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusOracleSchemaObjMembersHandler hplusOracleSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusOracleSchemaObjImplHandler hplusOracleSchemaObjImplHandler = null;
	private YCFBamXmlLoaderHPlusOracleSchemaObjIncludeHandler hplusOracleSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusPgSqlSchemaObjMembersHandler hplusPgSqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusPgSqlSchemaObjImplHandler hplusPgSqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderHPlusPgSqlSchemaObjIncludeHandler hplusPgSqlSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusRamSchemaObjMembersHandler hplusRamSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusRamSchemaObjImplHandler hplusRamSchemaObjImplHandler = null;
	private YCFBamXmlLoaderHPlusRamSchemaObjIncludeHandler hplusRamSchemaObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusXMsgSchemaIncludeHandler hplusXMsgSchemaIncludeHandler = null;
	private YCFBamXmlLoaderHPlusXMsgSchemaFormattersHandler hplusXMsgSchemaFormattersHandler = null;
	private YCFBamXmlLoaderHPlusXMsgClientSchemaIncludeHandler hplusXMsgClientSchemaIncludeHandler = null;
	private YCFBamXmlLoaderHPlusXMsgClientSchemaBodyHandler hplusXMsgClientSchemaBodyHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRqstSchemaBodyHandler hplusXMsgRqstSchemaBodyHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRqstSchemaIncludeHandler hplusXMsgRqstSchemaIncludeHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRqstSchemaWireParsersHandler hplusXMsgRqstSchemaWireParsersHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRqstSchemaXsdElementListHandler hplusXMsgRqstSchemaXsdElementListHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRqstSchemaXsdSpecHandler hplusXMsgRqstSchemaXsdSpecHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRspnSchemaBodyHandler hplusXMsgRspnSchemaBodyHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRspnSchemaIncludeHandler hplusXMsgRspnSchemaIncludeHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRspnSchemaWireParsersHandler hplusXMsgRspnSchemaWireParsersHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRspnSchemaXsdElementListHandler hplusXMsgRspnSchemaXsdElementListHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRspnSchemaXsdSpecHandler hplusXMsgRspnSchemaXsdSpecHandler = null;
	private YCFBamXmlLoaderHPlusObjMembersHandler hplusObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusObjInterfaceHandler hplusObjInterfaceHandler = null;
	private YCFBamXmlLoaderHPlusObjImplementationHandler hplusObjImplementationHandler = null;
	private YCFBamXmlLoaderHPlusEditObjMembersHandler hplusEditObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusEditObjInterfaceHandler hplusEditObjInterfaceHandler = null;
	private YCFBamXmlLoaderHPlusEditObjImplementationHandler hplusEditObjImplementationHandler = null;
	private YCFBamXmlLoaderHPlusDb2LUWTableIncludeHandler hplusDb2LUWTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusMSSqlTableIncludeHandler hplusMSSqlTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusMySqlTableIncludeHandler hplusMySqlTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusOracleTableIncludeHandler hplusOracleTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusPgSqlTableIncludeHandler hplusPgSqlTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusRamTableIncludeHandler hplusRamTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusObjIncludeHandler hplusObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusEditObjIncludeHandler hplusEditObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusSaxLoaderIncludeHandler hplusSaxLoaderIncludeHandler = null;
	private YCFBamXmlLoaderHPlusTableIncludeHandler hplusTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusTableObjIncludeHandler hplusTableObjIncludeHandler = null;
	private YCFBamXmlLoaderHPlusTableMembersHandler hplusTableMembersHandler = null;
	private YCFBamXmlLoaderHPlusTableInterfaceHandler hplusTableInterfaceHandler = null;
	private YCFBamXmlLoaderHPlusTableImplementationHandler hplusTableImplementationHandler = null;
	private YCFBamXmlLoaderHPlusTableObjMembersHandler hplusTableObjMembersHandler = null;
	private YCFBamXmlLoaderHPlusTableObjInterfaceHandler hplusTableObjInterfaceHandler = null;
	private YCFBamXmlLoaderHPlusTableObjImplementationHandler hplusTableObjImplementationHandler = null;
	private YCFBamXmlLoaderHPlusDb2LUWTableMembersHandler hplusDb2LUWTableMembersHandler = null;
	private YCFBamXmlLoaderHPlusDb2LUWTableImplementationHandler hplusDb2LUWTableImplementationHandler = null;
	private YCFBamXmlLoaderHPlusMSSqlTableMembersHandler hplusMSSqlTableMembersHandler = null;
	private YCFBamXmlLoaderHPlusMSSqlTableImplementationHandler hplusMSSqlTableImplementationHandler = null;
	private YCFBamXmlLoaderHPlusMySqlTableMembersHandler hplusMySqlTableMembersHandler = null;
	private YCFBamXmlLoaderHPlusMySqlTableImplementationHandler hplusMySqlTableImplementationHandler = null;
	private YCFBamXmlLoaderHPlusOracleTableMembersHandler hplusOracleTableMembersHandler = null;
	private YCFBamXmlLoaderHPlusOracleTableImplementationHandler hplusOracleTableImplementationHandler = null;
	private YCFBamXmlLoaderHPlusPgSqlTableMembersHandler hplusPgSqlTableMembersHandler = null;
	private YCFBamXmlLoaderHPlusPgSqlTableImplementationHandler hplusPgSqlTableImplementationHandler = null;
	private YCFBamXmlLoaderHPlusRamTableMembersHandler hplusRamTableMembersHandler = null;
	private YCFBamXmlLoaderHPlusRamTableImplementationHandler hplusRamTableImplementationHandler = null;
	private YCFBamXmlLoaderHPlusSaxLoaderStartElementHandler hplusSaxLoaderStartElementHandler = null;
	private YCFBamXmlLoaderHPlusSaxLoaderEndElementHandler hplusSaxLoaderEndElementHandler = null;
	private YCFBamXmlLoaderHPlusXMsgTableIncludeHandler hplusXMsgTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusXMsgTableFormattersHandler hplusXMsgTableFormattersHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRqstTableIncludeHandler hplusXMsgRqstTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRspnTableIncludeHandler hplusXMsgRspnTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusXMsgClientTableIncludeHandler hplusXMsgClientTableIncludeHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRqstTableBodyHandler hplusXMsgRqstTableBodyHandler = null;
	private YCFBamXmlLoaderHPlusXMsgRspnTableBodyHandler hplusXMsgRspnTableBodyHandler = null;
	private YCFBamXmlLoaderHPlusXMsgClientTableBodyHandler hplusXMsgClientTableBodyHandler = null;
	private YCFBamXmlLoaderCSharpMethodBodyHandler csharpMethodBodyHandler = null;
	private YCFBamXmlLoaderCSharpSchemaObjInterfaceHandler csharpSchemaObjInterfaceHandler = null;
	private YCFBamXmlLoaderCSharpSchemaObjMembersHandler csharpSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpSchemaObjUsingHandler csharpSchemaObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpSchemaObjImplementationHandler csharpSchemaObjImplementationHandler = null;
	private YCFBamXmlLoaderCSharpDb2LUWSchemaObjMembersHandler csharpDb2LUWSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpDb2LUWSchemaObjImplHandler csharpDb2LUWSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCSharpDb2LUWSchemaObjUsingHandler csharpDb2LUWSchemaObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpMSSqlSchemaObjMembersHandler csharpMSSqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpMSSqlSchemaObjImplHandler csharpMSSqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCSharpMSSqlSchemaObjUsingHandler csharpMSSqlSchemaObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpMySqlSchemaObjMembersHandler csharpMySqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpMySqlSchemaObjImplHandler csharpMySqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCSharpMySqlSchemaObjUsingHandler csharpMySqlSchemaObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpOracleSchemaObjMembersHandler csharpOracleSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpOracleSchemaObjImplHandler csharpOracleSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCSharpOracleSchemaObjUsingHandler csharpOracleSchemaObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpPgSqlSchemaObjMembersHandler csharpPgSqlSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpPgSqlSchemaObjImplHandler csharpPgSqlSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCSharpPgSqlSchemaObjUsingHandler csharpPgSqlSchemaObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpRamSchemaObjMembersHandler csharpRamSchemaObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpRamSchemaObjImplHandler csharpRamSchemaObjImplHandler = null;
	private YCFBamXmlLoaderCSharpRamSchemaObjUsingHandler csharpRamSchemaObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpXMsgSchemaUsingHandler csharpXMsgSchemaUsingHandler = null;
	private YCFBamXmlLoaderCSharpXMsgSchemaFormattersHandler csharpXMsgSchemaFormattersHandler = null;
	private YCFBamXmlLoaderCSharpXMsgClientSchemaUsingHandler csharpXMsgClientSchemaUsingHandler = null;
	private YCFBamXmlLoaderCSharpXMsgClientSchemaBodyHandler csharpXMsgClientSchemaBodyHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRqstSchemaBodyHandler csharpXMsgRqstSchemaBodyHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRqstSchemaUsingHandler csharpXMsgRqstSchemaUsingHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRqstSchemaWireParsersHandler csharpXMsgRqstSchemaWireParsersHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRqstSchemaXsdElementListHandler csharpXMsgRqstSchemaXsdElementListHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRqstSchemaXsdSpecHandler csharpXMsgRqstSchemaXsdSpecHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRspnSchemaBodyHandler csharpXMsgRspnSchemaBodyHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRspnSchemaUsingHandler csharpXMsgRspnSchemaUsingHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRspnSchemaWireParsersHandler csharpXMsgRspnSchemaWireParsersHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRspnSchemaXsdElementListHandler csharpXMsgRspnSchemaXsdElementListHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRspnSchemaXsdSpecHandler csharpXMsgRspnSchemaXsdSpecHandler = null;
	private YCFBamXmlLoaderCSharpObjMembersHandler csharpObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpObjInterfaceHandler csharpObjInterfaceHandler = null;
	private YCFBamXmlLoaderCSharpObjImplementationHandler csharpObjImplementationHandler = null;
	private YCFBamXmlLoaderCSharpEditObjMembersHandler csharpEditObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpEditObjInterfaceHandler csharpEditObjInterfaceHandler = null;
	private YCFBamXmlLoaderCSharpEditObjImplementationHandler csharpEditObjImplementationHandler = null;
	private YCFBamXmlLoaderCSharpDb2LUWTableUsingHandler csharpDb2LUWTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpMSSqlTableUsingHandler csharpMSSqlTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpMySqlTableUsingHandler csharpMySqlTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpOracleTableUsingHandler csharpOracleTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpPgSqlTableUsingHandler csharpPgSqlTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpRamTableUsingHandler csharpRamTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpObjUsingHandler csharpObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpEditObjUsingHandler csharpEditObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpSaxLoaderUsingHandler csharpSaxLoaderUsingHandler = null;
	private YCFBamXmlLoaderCSharpTableUsingHandler csharpTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpTableObjUsingHandler csharpTableObjUsingHandler = null;
	private YCFBamXmlLoaderCSharpTableMembersHandler csharpTableMembersHandler = null;
	private YCFBamXmlLoaderCSharpTableInterfaceHandler csharpTableInterfaceHandler = null;
	private YCFBamXmlLoaderCSharpTableImplementationHandler csharpTableImplementationHandler = null;
	private YCFBamXmlLoaderCSharpTableObjMembersHandler csharpTableObjMembersHandler = null;
	private YCFBamXmlLoaderCSharpTableObjInterfaceHandler csharpTableObjInterfaceHandler = null;
	private YCFBamXmlLoaderCSharpTableObjImplementationHandler csharpTableObjImplementationHandler = null;
	private YCFBamXmlLoaderCSharpDb2LUWTableMembersHandler csharpDb2LUWTableMembersHandler = null;
	private YCFBamXmlLoaderCSharpDb2LUWTableImplementationHandler csharpDb2LUWTableImplementationHandler = null;
	private YCFBamXmlLoaderCSharpMSSqlTableMembersHandler csharpMSSqlTableMembersHandler = null;
	private YCFBamXmlLoaderCSharpMSSqlTableImplementationHandler csharpMSSqlTableImplementationHandler = null;
	private YCFBamXmlLoaderCSharpMySqlTableMembersHandler csharpMySqlTableMembersHandler = null;
	private YCFBamXmlLoaderCSharpMySqlTableImplementationHandler csharpMySqlTableImplementationHandler = null;
	private YCFBamXmlLoaderCSharpOracleTableMembersHandler csharpOracleTableMembersHandler = null;
	private YCFBamXmlLoaderCSharpOracleTableImplementationHandler csharpOracleTableImplementationHandler = null;
	private YCFBamXmlLoaderCSharpPgSqlTableMembersHandler csharpPgSqlTableMembersHandler = null;
	private YCFBamXmlLoaderCSharpPgSqlTableImplementationHandler csharpPgSqlTableImplementationHandler = null;
	private YCFBamXmlLoaderCSharpRamTableMembersHandler csharpRamTableMembersHandler = null;
	private YCFBamXmlLoaderCSharpRamTableImplementationHandler csharpRamTableImplementationHandler = null;
	private YCFBamXmlLoaderCSharpSaxLoaderStartElementHandler csharpSaxLoaderStartElementHandler = null;
	private YCFBamXmlLoaderCSharpSaxLoaderEndElementHandler csharpSaxLoaderEndElementHandler = null;
	private YCFBamXmlLoaderCSharpXMsgTableUsingHandler csharpXMsgTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpXMsgTableFormattersHandler csharpXMsgTableFormattersHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRqstTableUsingHandler csharpXMsgRqstTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRspnTableUsingHandler csharpXMsgRspnTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpXMsgClientTableUsingHandler csharpXMsgClientTableUsingHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRqstTableBodyHandler csharpXMsgRqstTableBodyHandler = null;
	private YCFBamXmlLoaderCSharpXMsgRspnTableBodyHandler csharpXMsgRspnTableBodyHandler = null;
	private YCFBamXmlLoaderCSharpXMsgClientTableBodyHandler csharpXMsgClientTableBodyHandler = null;
	private YCFBamXmlLoaderLicenseHandler licenseHandler = null;
	private YCFBamXmlLoaderMajorVersionHandler majorVersionHandler = null;
	private YCFBamXmlLoaderMinorVersionHandler minorVersionHandler = null;
	private YCFBamXmlLoaderNmTokenColHandler nmTokenColHandler = null;
	private YCFBamXmlLoaderNmTokenTypeHandler nmTokenTypeHandler = null;
	private YCFBamXmlLoaderNmTokensColHandler nmTokensColHandler = null;
	private YCFBamXmlLoaderNmTokensTypeHandler nmTokensTypeHandler = null;
	private YCFBamXmlLoaderNumberColHandler numberColHandler = null;
	private YCFBamXmlLoaderNumberTypeHandler numberTypeHandler = null;
	private YCFBamXmlLoaderParamHandler paramHandler = null;
	private YCFBamXmlLoaderPrimaryIndexHandler primaryIndexHandler = null;
	private YCFBamXmlLoaderRelationHandler relationHandler = null;
	private YCFBamXmlLoaderRelationColHandler relationColHandler = null;
	private YCFBamXmlLoaderSchemaDefHandler schemaDefHandler = null;
	private YCFBamXmlLoaderSchemaRefHandler schemaRefHandler = null;
	private YCFBamXmlLoaderSchemaRoleHandler schemaRoleHandler = null;
	private YCFBamXmlLoaderSchemaTweakHandler schemaTweakHandler = null;
	private YCFBamXmlLoaderServerListFuncHandler serverListFuncHandler = null;
	private YCFBamXmlLoaderServerObjFuncHandler serverObjFuncHandler = null;
	private YCFBamXmlLoaderServerProcHandler serverProcHandler = null;
	private YCFBamXmlLoaderSuperClassRelationHandler superClassRelationHandler = null;
	private YCFBamXmlLoaderStringColHandler stringColHandler = null;
	private YCFBamXmlLoaderStringTypeHandler stringTypeHandler = null;
	private YCFBamXmlLoaderSubProjectHandler subProjectHandler = null;
	private YCFBamXmlLoaderTZDateColHandler tZDateColHandler = null;
	private YCFBamXmlLoaderTZDateTypeHandler tZDateTypeHandler = null;
	private YCFBamXmlLoaderTZTimeColHandler tZTimeColHandler = null;
	private YCFBamXmlLoaderTZTimeTypeHandler tZTimeTypeHandler = null;
	private YCFBamXmlLoaderTZTimestampColHandler tZTimestampColHandler = null;
	private YCFBamXmlLoaderTZTimestampTypeHandler tZTimestampTypeHandler = null;
	private YCFBamXmlLoaderTableHandler tableHandler = null;
	private YCFBamXmlLoaderTableAddendumHandler tableAddendumHandler = null;
	private YCFBamXmlLoaderTableColHandler tableColHandler = null;
	private YCFBamXmlLoaderTableTweakHandler tableTweakHandler = null;
	private YCFBamXmlLoaderTextColHandler textColHandler = null;
	private YCFBamXmlLoaderTextTypeHandler textTypeHandler = null;
	private YCFBamXmlLoaderTimeColHandler timeColHandler = null;
	private YCFBamXmlLoaderTimeTypeHandler timeTypeHandler = null;
	private YCFBamXmlLoaderTimestampColHandler timestampColHandler = null;
	private YCFBamXmlLoaderTimestampTypeHandler timestampTypeHandler = null;
	private YCFBamXmlLoaderTldHandler tldHandler = null;
	private YCFBamXmlLoaderTokenColHandler tokenColHandler = null;
	private YCFBamXmlLoaderTokenTypeHandler tokenTypeHandler = null;
	private YCFBamXmlLoaderTopDomainHandler topDomainHandler = null;
	private YCFBamXmlLoaderTopProjectHandler topProjectHandler = null;
	private YCFBamXmlLoaderUInt16ColHandler uInt16ColHandler = null;
	private YCFBamXmlLoaderUInt16TypeHandler uInt16TypeHandler = null;
	private YCFBamXmlLoaderUInt32ColHandler uInt32ColHandler = null;
	private YCFBamXmlLoaderUInt32TypeHandler uInt32TypeHandler = null;
	private YCFBamXmlLoaderUInt64ColHandler uInt64ColHandler = null;
	private YCFBamXmlLoaderUInt64TypeHandler uInt64TypeHandler = null;
	private YCFBamXmlLoaderUuidColHandler uuidColHandler = null;
	private YCFBamXmlLoaderUuidGenHandler uuidGenHandler = null;
	private YCFBamXmlLoaderUuidTypeHandler uuidTypeHandler = null;
	private YCFBamXmlLoaderUuid6ColHandler uuid6ColHandler = null;
	private YCFBamXmlLoaderUuid6GenHandler uuid6GenHandler = null;
	private YCFBamXmlLoaderUuid6TypeHandler uuid6TypeHandler = null;
	private YCFBamXmlLoaderDbKeyHash128ColHandler dbKeyHash128ColHandler = null;
	private YCFBamXmlLoaderDbKeyHash128GenHandler dbKeyHash128GenHandler = null;
	private YCFBamXmlLoaderDbKeyHash128TypeHandler dbKeyHash128TypeHandler = null;
	private YCFBamXmlLoaderDbKeyHash160ColHandler dbKeyHash160ColHandler = null;
	private YCFBamXmlLoaderDbKeyHash160GenHandler dbKeyHash160GenHandler = null;
	private YCFBamXmlLoaderDbKeyHash160TypeHandler dbKeyHash160TypeHandler = null;
	private YCFBamXmlLoaderDbKeyHash224ColHandler dbKeyHash224ColHandler = null;
	private YCFBamXmlLoaderDbKeyHash224GenHandler dbKeyHash224GenHandler = null;
	private YCFBamXmlLoaderDbKeyHash224TypeHandler dbKeyHash224TypeHandler = null;
	private YCFBamXmlLoaderDbKeyHash256ColHandler dbKeyHash256ColHandler = null;
	private YCFBamXmlLoaderDbKeyHash256GenHandler dbKeyHash256GenHandler = null;
	private YCFBamXmlLoaderDbKeyHash256TypeHandler dbKeyHash256TypeHandler = null;
	private YCFBamXmlLoaderDbKeyHash384ColHandler dbKeyHash384ColHandler = null;
	private YCFBamXmlLoaderDbKeyHash384GenHandler dbKeyHash384GenHandler = null;
	private YCFBamXmlLoaderDbKeyHash384TypeHandler dbKeyHash384TypeHandler = null;
	private YCFBamXmlLoaderDbKeyHash512ColHandler dbKeyHash512ColHandler = null;
	private YCFBamXmlLoaderDbKeyHash512GenHandler dbKeyHash512GenHandler = null;
	private YCFBamXmlLoaderDbKeyHash512TypeHandler dbKeyHash512TypeHandler = null;
	private YCFBamSaxRootHandler saxRootHandler = null;

	private YCFBamSaxDocHandler saxDocHandler = null;

	// Schema object accessors

	// SchemaObj accessors

	public IYCFBamSchemaObj getSchemaObj() {
		return( schemaObj );
	}

	public void setSchemaObj( IYCFBamSchemaObj value ) {
		schemaObj = value;
	}

	// Element Handler Resolver Factories

	protected YCFBamXmlLoaderCommonLicenseHandler getCommonLicenseHandler() {
		if( commonLicenseHandler == null ) {
			commonLicenseHandler = new YCFBamXmlLoaderCommonLicenseHandler( this );
		}
		return( commonLicenseHandler );
	}

	protected YCFBamXmlLoaderClientImplLicenseHandler getClientImplLicenseHandler() {
		if( clientImplLicenseHandler == null ) {
			clientImplLicenseHandler = new YCFBamXmlLoaderClientImplLicenseHandler( this );
		}
		return( clientImplLicenseHandler );
	}

	protected YCFBamXmlLoaderClientXFaceLicenseHandler getClientXFaceLicenseHandler() {
		if( clientXFaceLicenseHandler == null ) {
			clientXFaceLicenseHandler = new YCFBamXmlLoaderClientXFaceLicenseHandler( this );
		}
		return( clientXFaceLicenseHandler );
	}

	protected YCFBamXmlLoaderServerImplLicenseHandler getServerImplLicenseHandler() {
		if( serverImplLicenseHandler == null ) {
			serverImplLicenseHandler = new YCFBamXmlLoaderServerImplLicenseHandler( this );
		}
		return( serverImplLicenseHandler );
	}

	protected YCFBamXmlLoaderServerXFaceLicenseHandler getServerXFaceLicenseHandler() {
		if( serverXFaceLicenseHandler == null ) {
			serverXFaceLicenseHandler = new YCFBamXmlLoaderServerXFaceLicenseHandler( this );
		}
		return( serverXFaceLicenseHandler );
	}

	protected YCFBamXmlLoaderBlobColHandler getBlobColHandler() {
		if( blobColHandler == null ) {
			blobColHandler = new YCFBamXmlLoaderBlobColHandler( this );
		}
		return( blobColHandler );
	}

	protected YCFBamXmlLoaderBlobTypeHandler getBlobTypeHandler() {
		if( blobTypeHandler == null ) {
			blobTypeHandler = new YCFBamXmlLoaderBlobTypeHandler( this );
		}
		return( blobTypeHandler );
	}

	protected YCFBamXmlLoaderBoolColHandler getBoolColHandler() {
		if( boolColHandler == null ) {
			boolColHandler = new YCFBamXmlLoaderBoolColHandler( this );
		}
		return( boolColHandler );
	}

	protected YCFBamXmlLoaderBoolTypeHandler getBoolTypeHandler() {
		if( boolTypeHandler == null ) {
			boolTypeHandler = new YCFBamXmlLoaderBoolTypeHandler( this );
		}
		return( boolTypeHandler );
	}

	protected YCFBamXmlLoaderChainHandler getChainHandler() {
		if( chainHandler == null ) {
			chainHandler = new YCFBamXmlLoaderChainHandler( this );
		}
		return( chainHandler );
	}

	protected YCFBamXmlLoaderClearDepHandler getClearDepHandler() {
		if( clearDepHandler == null ) {
			clearDepHandler = new YCFBamXmlLoaderClearDepHandler( this );
		}
		return( clearDepHandler );
	}

	protected YCFBamXmlLoaderDateColHandler getDateColHandler() {
		if( dateColHandler == null ) {
			dateColHandler = new YCFBamXmlLoaderDateColHandler( this );
		}
		return( dateColHandler );
	}

	protected YCFBamXmlLoaderDateTypeHandler getDateTypeHandler() {
		if( dateTypeHandler == null ) {
			dateTypeHandler = new YCFBamXmlLoaderDateTypeHandler( this );
		}
		return( dateTypeHandler );
	}

	protected YCFBamXmlLoaderDelDepHandler getDelDepHandler() {
		if( delDepHandler == null ) {
			delDepHandler = new YCFBamXmlLoaderDelDepHandler( this );
		}
		return( delDepHandler );
	}

	protected YCFBamXmlLoaderDoubleColHandler getDoubleColHandler() {
		if( doubleColHandler == null ) {
			doubleColHandler = new YCFBamXmlLoaderDoubleColHandler( this );
		}
		return( doubleColHandler );
	}

	protected YCFBamXmlLoaderDoubleTypeHandler getDoubleTypeHandler() {
		if( doubleTypeHandler == null ) {
			doubleTypeHandler = new YCFBamXmlLoaderDoubleTypeHandler( this );
		}
		return( doubleTypeHandler );
	}

	protected YCFBamXmlLoaderEnumTagHandler getEnumTagHandler() {
		if( enumTagHandler == null ) {
			enumTagHandler = new YCFBamXmlLoaderEnumTagHandler( this );
		}
		return( enumTagHandler );
	}

	protected YCFBamXmlLoaderEnumTypeHandler getEnumTypeHandler() {
		if( enumTypeHandler == null ) {
			enumTypeHandler = new YCFBamXmlLoaderEnumTypeHandler( this );
			enumTypeHandler.addElementHandler( "EnumTag", getEnumTagHandler() );
		}
		return( enumTypeHandler );
	}

	protected YCFBamXmlLoaderFloatColHandler getFloatColHandler() {
		if( floatColHandler == null ) {
			floatColHandler = new YCFBamXmlLoaderFloatColHandler( this );
		}
		return( floatColHandler );
	}

	protected YCFBamXmlLoaderFloatTypeHandler getFloatTypeHandler() {
		if( floatTypeHandler == null ) {
			floatTypeHandler = new YCFBamXmlLoaderFloatTypeHandler( this );
		}
		return( floatTypeHandler );
	}

	protected YCFBamXmlLoaderId16GenHandler getId16GenHandler() {
		if( id16GenHandler == null ) {
			id16GenHandler = new YCFBamXmlLoaderId16GenHandler( this );
		}
		return( id16GenHandler );
	}

	protected YCFBamXmlLoaderId32GenHandler getId32GenHandler() {
		if( id32GenHandler == null ) {
			id32GenHandler = new YCFBamXmlLoaderId32GenHandler( this );
		}
		return( id32GenHandler );
	}

	protected YCFBamXmlLoaderId64GenHandler getId64GenHandler() {
		if( id64GenHandler == null ) {
			id64GenHandler = new YCFBamXmlLoaderId64GenHandler( this );
		}
		return( id64GenHandler );
	}

	protected YCFBamXmlLoaderIndexHandler getIndexHandler() {
		if( indexHandler == null ) {
			indexHandler = new YCFBamXmlLoaderIndexHandler( this );
			indexHandler.addElementHandler( "IndexCol", getIndexColHandler() );
			indexHandler.addElementHandler( "IndexTweak", getIndexTweakHandler() );
		}
		return( indexHandler );
	}

	protected YCFBamXmlLoaderIndexTweakHandler getIndexTweakHandler() {
		if( indexTweakHandler == null ) {
			indexTweakHandler = new YCFBamXmlLoaderIndexTweakHandler( this );
		}
		return( indexTweakHandler );
	}

	protected YCFBamXmlLoaderIndexColHandler getIndexColHandler() {
		if( indexColHandler == null ) {
			indexColHandler = new YCFBamXmlLoaderIndexColHandler( this );
		}
		return( indexColHandler );
	}

	protected YCFBamXmlLoaderInt16ColHandler getInt16ColHandler() {
		if( int16ColHandler == null ) {
			int16ColHandler = new YCFBamXmlLoaderInt16ColHandler( this );
		}
		return( int16ColHandler );
	}

	protected YCFBamXmlLoaderInt16TypeHandler getInt16TypeHandler() {
		if( int16TypeHandler == null ) {
			int16TypeHandler = new YCFBamXmlLoaderInt16TypeHandler( this );
		}
		return( int16TypeHandler );
	}

	protected YCFBamXmlLoaderInt32ColHandler getInt32ColHandler() {
		if( int32ColHandler == null ) {
			int32ColHandler = new YCFBamXmlLoaderInt32ColHandler( this );
		}
		return( int32ColHandler );
	}

	protected YCFBamXmlLoaderInt32TypeHandler getInt32TypeHandler() {
		if( int32TypeHandler == null ) {
			int32TypeHandler = new YCFBamXmlLoaderInt32TypeHandler( this );
		}
		return( int32TypeHandler );
	}

	protected YCFBamXmlLoaderInt64ColHandler getInt64ColHandler() {
		if( int64ColHandler == null ) {
			int64ColHandler = new YCFBamXmlLoaderInt64ColHandler( this );
		}
		return( int64ColHandler );
	}

	protected YCFBamXmlLoaderInt64TypeHandler getInt64TypeHandler() {
		if( int64TypeHandler == null ) {
			int64TypeHandler = new YCFBamXmlLoaderInt64TypeHandler( this );
		}
		return( int64TypeHandler );
	}

	protected YCFBamXmlLoaderCafeMethodBodyHandler getCafeMethodBodyHandler() {
		if( cafeMethodBodyHandler == null ) {
			cafeMethodBodyHandler = new YCFBamXmlLoaderCafeMethodBodyHandler( this );
		}
		return( cafeMethodBodyHandler );
	}

	protected YCFBamXmlLoaderCafeSchemaObjInterfaceHandler getCafeSchemaObjInterfaceHandler() {
		if( cafeSchemaObjInterfaceHandler == null ) {
			cafeSchemaObjInterfaceHandler = new YCFBamXmlLoaderCafeSchemaObjInterfaceHandler( this );
		}
		return( cafeSchemaObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCafeSchemaObjMembersHandler getCafeSchemaObjMembersHandler() {
		if( cafeSchemaObjMembersHandler == null ) {
			cafeSchemaObjMembersHandler = new YCFBamXmlLoaderCafeSchemaObjMembersHandler( this );
		}
		return( cafeSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafeSchemaObjImportHandler getCafeSchemaObjImportHandler() {
		if( cafeSchemaObjImportHandler == null ) {
			cafeSchemaObjImportHandler = new YCFBamXmlLoaderCafeSchemaObjImportHandler( this );
		}
		return( cafeSchemaObjImportHandler );
	}

	protected YCFBamXmlLoaderCafeSchemaObjImplementationHandler getCafeSchemaObjImplementationHandler() {
		if( cafeSchemaObjImplementationHandler == null ) {
			cafeSchemaObjImplementationHandler = new YCFBamXmlLoaderCafeSchemaObjImplementationHandler( this );
		}
		return( cafeSchemaObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeDb2LUWSchemaObjMembersHandler getCafeDb2LUWSchemaObjMembersHandler() {
		if( cafeDb2LUWSchemaObjMembersHandler == null ) {
			cafeDb2LUWSchemaObjMembersHandler = new YCFBamXmlLoaderCafeDb2LUWSchemaObjMembersHandler( this );
		}
		return( cafeDb2LUWSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafeDb2LUWSchemaObjImplHandler getCafeDb2LUWSchemaObjImplHandler() {
		if( cafeDb2LUWSchemaObjImplHandler == null ) {
			cafeDb2LUWSchemaObjImplHandler = new YCFBamXmlLoaderCafeDb2LUWSchemaObjImplHandler( this );
		}
		return( cafeDb2LUWSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCafeDb2LUWSchemaObjImportHandler getCafeDb2LUWSchemaObjImportHandler() {
		if( cafeDb2LUWSchemaObjImportHandler == null ) {
			cafeDb2LUWSchemaObjImportHandler = new YCFBamXmlLoaderCafeDb2LUWSchemaObjImportHandler( this );
		}
		return( cafeDb2LUWSchemaObjImportHandler );
	}

	protected YCFBamXmlLoaderCafeMSSqlSchemaObjMembersHandler getCafeMSSqlSchemaObjMembersHandler() {
		if( cafeMSSqlSchemaObjMembersHandler == null ) {
			cafeMSSqlSchemaObjMembersHandler = new YCFBamXmlLoaderCafeMSSqlSchemaObjMembersHandler( this );
		}
		return( cafeMSSqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafeMSSqlSchemaObjImplHandler getCafeMSSqlSchemaObjImplHandler() {
		if( cafeMSSqlSchemaObjImplHandler == null ) {
			cafeMSSqlSchemaObjImplHandler = new YCFBamXmlLoaderCafeMSSqlSchemaObjImplHandler( this );
		}
		return( cafeMSSqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCafeMSSqlSchemaObjImportHandler getCafeMSSqlSchemaObjImportHandler() {
		if( cafeMSSqlSchemaObjImportHandler == null ) {
			cafeMSSqlSchemaObjImportHandler = new YCFBamXmlLoaderCafeMSSqlSchemaObjImportHandler( this );
		}
		return( cafeMSSqlSchemaObjImportHandler );
	}

	protected YCFBamXmlLoaderCafeMySqlSchemaObjMembersHandler getCafeMySqlSchemaObjMembersHandler() {
		if( cafeMySqlSchemaObjMembersHandler == null ) {
			cafeMySqlSchemaObjMembersHandler = new YCFBamXmlLoaderCafeMySqlSchemaObjMembersHandler( this );
		}
		return( cafeMySqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafeMySqlSchemaObjImplHandler getCafeMySqlSchemaObjImplHandler() {
		if( cafeMySqlSchemaObjImplHandler == null ) {
			cafeMySqlSchemaObjImplHandler = new YCFBamXmlLoaderCafeMySqlSchemaObjImplHandler( this );
		}
		return( cafeMySqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCafeMySqlSchemaObjImportHandler getCafeMySqlSchemaObjImportHandler() {
		if( cafeMySqlSchemaObjImportHandler == null ) {
			cafeMySqlSchemaObjImportHandler = new YCFBamXmlLoaderCafeMySqlSchemaObjImportHandler( this );
		}
		return( cafeMySqlSchemaObjImportHandler );
	}

	protected YCFBamXmlLoaderCafeOracleSchemaObjMembersHandler getCafeOracleSchemaObjMembersHandler() {
		if( cafeOracleSchemaObjMembersHandler == null ) {
			cafeOracleSchemaObjMembersHandler = new YCFBamXmlLoaderCafeOracleSchemaObjMembersHandler( this );
		}
		return( cafeOracleSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafeOracleSchemaObjImplHandler getCafeOracleSchemaObjImplHandler() {
		if( cafeOracleSchemaObjImplHandler == null ) {
			cafeOracleSchemaObjImplHandler = new YCFBamXmlLoaderCafeOracleSchemaObjImplHandler( this );
		}
		return( cafeOracleSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCafeOracleSchemaObjImportHandler getCafeOracleSchemaObjImportHandler() {
		if( cafeOracleSchemaObjImportHandler == null ) {
			cafeOracleSchemaObjImportHandler = new YCFBamXmlLoaderCafeOracleSchemaObjImportHandler( this );
		}
		return( cafeOracleSchemaObjImportHandler );
	}

	protected YCFBamXmlLoaderCafePgSqlSchemaObjMembersHandler getCafePgSqlSchemaObjMembersHandler() {
		if( cafePgSqlSchemaObjMembersHandler == null ) {
			cafePgSqlSchemaObjMembersHandler = new YCFBamXmlLoaderCafePgSqlSchemaObjMembersHandler( this );
		}
		return( cafePgSqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafePgSqlSchemaObjImplHandler getCafePgSqlSchemaObjImplHandler() {
		if( cafePgSqlSchemaObjImplHandler == null ) {
			cafePgSqlSchemaObjImplHandler = new YCFBamXmlLoaderCafePgSqlSchemaObjImplHandler( this );
		}
		return( cafePgSqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCafePgSqlSchemaObjImportHandler getCafePgSqlSchemaObjImportHandler() {
		if( cafePgSqlSchemaObjImportHandler == null ) {
			cafePgSqlSchemaObjImportHandler = new YCFBamXmlLoaderCafePgSqlSchemaObjImportHandler( this );
		}
		return( cafePgSqlSchemaObjImportHandler );
	}

	protected YCFBamXmlLoaderCafeRamSchemaObjMembersHandler getCafeRamSchemaObjMembersHandler() {
		if( cafeRamSchemaObjMembersHandler == null ) {
			cafeRamSchemaObjMembersHandler = new YCFBamXmlLoaderCafeRamSchemaObjMembersHandler( this );
		}
		return( cafeRamSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafeRamSchemaObjImplHandler getCafeRamSchemaObjImplHandler() {
		if( cafeRamSchemaObjImplHandler == null ) {
			cafeRamSchemaObjImplHandler = new YCFBamXmlLoaderCafeRamSchemaObjImplHandler( this );
		}
		return( cafeRamSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCafeRamSchemaObjImportHandler getCafeRamSchemaObjImportHandler() {
		if( cafeRamSchemaObjImportHandler == null ) {
			cafeRamSchemaObjImportHandler = new YCFBamXmlLoaderCafeRamSchemaObjImportHandler( this );
		}
		return( cafeRamSchemaObjImportHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgSchemaImportHandler getCafeXMsgSchemaImportHandler() {
		if( cafeXMsgSchemaImportHandler == null ) {
			cafeXMsgSchemaImportHandler = new YCFBamXmlLoaderCafeXMsgSchemaImportHandler( this );
		}
		return( cafeXMsgSchemaImportHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgSchemaFormattersHandler getCafeXMsgSchemaFormattersHandler() {
		if( cafeXMsgSchemaFormattersHandler == null ) {
			cafeXMsgSchemaFormattersHandler = new YCFBamXmlLoaderCafeXMsgSchemaFormattersHandler( this );
		}
		return( cafeXMsgSchemaFormattersHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgClientSchemaImportHandler getCafeXMsgClientSchemaImportHandler() {
		if( cafeXMsgClientSchemaImportHandler == null ) {
			cafeXMsgClientSchemaImportHandler = new YCFBamXmlLoaderCafeXMsgClientSchemaImportHandler( this );
		}
		return( cafeXMsgClientSchemaImportHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgClientSchemaBodyHandler getCafeXMsgClientSchemaBodyHandler() {
		if( cafeXMsgClientSchemaBodyHandler == null ) {
			cafeXMsgClientSchemaBodyHandler = new YCFBamXmlLoaderCafeXMsgClientSchemaBodyHandler( this );
		}
		return( cafeXMsgClientSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRqstSchemaBodyHandler getCafeXMsgRqstSchemaBodyHandler() {
		if( cafeXMsgRqstSchemaBodyHandler == null ) {
			cafeXMsgRqstSchemaBodyHandler = new YCFBamXmlLoaderCafeXMsgRqstSchemaBodyHandler( this );
		}
		return( cafeXMsgRqstSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRqstSchemaImportHandler getCafeXMsgRqstSchemaImportHandler() {
		if( cafeXMsgRqstSchemaImportHandler == null ) {
			cafeXMsgRqstSchemaImportHandler = new YCFBamXmlLoaderCafeXMsgRqstSchemaImportHandler( this );
		}
		return( cafeXMsgRqstSchemaImportHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRqstSchemaWireParsersHandler getCafeXMsgRqstSchemaWireParsersHandler() {
		if( cafeXMsgRqstSchemaWireParsersHandler == null ) {
			cafeXMsgRqstSchemaWireParsersHandler = new YCFBamXmlLoaderCafeXMsgRqstSchemaWireParsersHandler( this );
		}
		return( cafeXMsgRqstSchemaWireParsersHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRqstSchemaXsdElementListHandler getCafeXMsgRqstSchemaXsdElementListHandler() {
		if( cafeXMsgRqstSchemaXsdElementListHandler == null ) {
			cafeXMsgRqstSchemaXsdElementListHandler = new YCFBamXmlLoaderCafeXMsgRqstSchemaXsdElementListHandler( this );
		}
		return( cafeXMsgRqstSchemaXsdElementListHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRqstSchemaXsdSpecHandler getCafeXMsgRqstSchemaXsdSpecHandler() {
		if( cafeXMsgRqstSchemaXsdSpecHandler == null ) {
			cafeXMsgRqstSchemaXsdSpecHandler = new YCFBamXmlLoaderCafeXMsgRqstSchemaXsdSpecHandler( this );
		}
		return( cafeXMsgRqstSchemaXsdSpecHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRspnSchemaBodyHandler getCafeXMsgRspnSchemaBodyHandler() {
		if( cafeXMsgRspnSchemaBodyHandler == null ) {
			cafeXMsgRspnSchemaBodyHandler = new YCFBamXmlLoaderCafeXMsgRspnSchemaBodyHandler( this );
		}
		return( cafeXMsgRspnSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRspnSchemaImportHandler getCafeXMsgRspnSchemaImportHandler() {
		if( cafeXMsgRspnSchemaImportHandler == null ) {
			cafeXMsgRspnSchemaImportHandler = new YCFBamXmlLoaderCafeXMsgRspnSchemaImportHandler( this );
		}
		return( cafeXMsgRspnSchemaImportHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRspnSchemaWireParsersHandler getCafeXMsgRspnSchemaWireParsersHandler() {
		if( cafeXMsgRspnSchemaWireParsersHandler == null ) {
			cafeXMsgRspnSchemaWireParsersHandler = new YCFBamXmlLoaderCafeXMsgRspnSchemaWireParsersHandler( this );
		}
		return( cafeXMsgRspnSchemaWireParsersHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRspnSchemaXsdElementListHandler getCafeXMsgRspnSchemaXsdElementListHandler() {
		if( cafeXMsgRspnSchemaXsdElementListHandler == null ) {
			cafeXMsgRspnSchemaXsdElementListHandler = new YCFBamXmlLoaderCafeXMsgRspnSchemaXsdElementListHandler( this );
		}
		return( cafeXMsgRspnSchemaXsdElementListHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRspnSchemaXsdSpecHandler getCafeXMsgRspnSchemaXsdSpecHandler() {
		if( cafeXMsgRspnSchemaXsdSpecHandler == null ) {
			cafeXMsgRspnSchemaXsdSpecHandler = new YCFBamXmlLoaderCafeXMsgRspnSchemaXsdSpecHandler( this );
		}
		return( cafeXMsgRspnSchemaXsdSpecHandler );
	}

	protected YCFBamXmlLoaderCafeObjMembersHandler getCafeObjMembersHandler() {
		if( cafeObjMembersHandler == null ) {
			cafeObjMembersHandler = new YCFBamXmlLoaderCafeObjMembersHandler( this );
		}
		return( cafeObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafeObjInterfaceHandler getCafeObjInterfaceHandler() {
		if( cafeObjInterfaceHandler == null ) {
			cafeObjInterfaceHandler = new YCFBamXmlLoaderCafeObjInterfaceHandler( this );
		}
		return( cafeObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCafeObjImplementationHandler getCafeObjImplementationHandler() {
		if( cafeObjImplementationHandler == null ) {
			cafeObjImplementationHandler = new YCFBamXmlLoaderCafeObjImplementationHandler( this );
		}
		return( cafeObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeEditObjMembersHandler getCafeEditObjMembersHandler() {
		if( cafeEditObjMembersHandler == null ) {
			cafeEditObjMembersHandler = new YCFBamXmlLoaderCafeEditObjMembersHandler( this );
		}
		return( cafeEditObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafeEditObjInterfaceHandler getCafeEditObjInterfaceHandler() {
		if( cafeEditObjInterfaceHandler == null ) {
			cafeEditObjInterfaceHandler = new YCFBamXmlLoaderCafeEditObjInterfaceHandler( this );
		}
		return( cafeEditObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCafeEditObjImplementationHandler getCafeEditObjImplementationHandler() {
		if( cafeEditObjImplementationHandler == null ) {
			cafeEditObjImplementationHandler = new YCFBamXmlLoaderCafeEditObjImplementationHandler( this );
		}
		return( cafeEditObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeDb2LUWTableImportHandler getCafeDb2LUWTableImportHandler() {
		if( cafeDb2LUWTableImportHandler == null ) {
			cafeDb2LUWTableImportHandler = new YCFBamXmlLoaderCafeDb2LUWTableImportHandler( this );
		}
		return( cafeDb2LUWTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeMSSqlTableImportHandler getCafeMSSqlTableImportHandler() {
		if( cafeMSSqlTableImportHandler == null ) {
			cafeMSSqlTableImportHandler = new YCFBamXmlLoaderCafeMSSqlTableImportHandler( this );
		}
		return( cafeMSSqlTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeMySqlTableImportHandler getCafeMySqlTableImportHandler() {
		if( cafeMySqlTableImportHandler == null ) {
			cafeMySqlTableImportHandler = new YCFBamXmlLoaderCafeMySqlTableImportHandler( this );
		}
		return( cafeMySqlTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeOracleTableImportHandler getCafeOracleTableImportHandler() {
		if( cafeOracleTableImportHandler == null ) {
			cafeOracleTableImportHandler = new YCFBamXmlLoaderCafeOracleTableImportHandler( this );
		}
		return( cafeOracleTableImportHandler );
	}

	protected YCFBamXmlLoaderCafePgSqlTableImportHandler getCafePgSqlTableImportHandler() {
		if( cafePgSqlTableImportHandler == null ) {
			cafePgSqlTableImportHandler = new YCFBamXmlLoaderCafePgSqlTableImportHandler( this );
		}
		return( cafePgSqlTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeRamTableImportHandler getCafeRamTableImportHandler() {
		if( cafeRamTableImportHandler == null ) {
			cafeRamTableImportHandler = new YCFBamXmlLoaderCafeRamTableImportHandler( this );
		}
		return( cafeRamTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeObjImportHandler getCafeObjImportHandler() {
		if( cafeObjImportHandler == null ) {
			cafeObjImportHandler = new YCFBamXmlLoaderCafeObjImportHandler( this );
		}
		return( cafeObjImportHandler );
	}

	protected YCFBamXmlLoaderCafeEditObjImportHandler getCafeEditObjImportHandler() {
		if( cafeEditObjImportHandler == null ) {
			cafeEditObjImportHandler = new YCFBamXmlLoaderCafeEditObjImportHandler( this );
		}
		return( cafeEditObjImportHandler );
	}

	protected YCFBamXmlLoaderCafeSaxLoaderImportHandler getCafeSaxLoaderImportHandler() {
		if( cafeSaxLoaderImportHandler == null ) {
			cafeSaxLoaderImportHandler = new YCFBamXmlLoaderCafeSaxLoaderImportHandler( this );
		}
		return( cafeSaxLoaderImportHandler );
	}

	protected YCFBamXmlLoaderCafeTableImportHandler getCafeTableImportHandler() {
		if( cafeTableImportHandler == null ) {
			cafeTableImportHandler = new YCFBamXmlLoaderCafeTableImportHandler( this );
		}
		return( cafeTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeTableObjImportHandler getCafeTableObjImportHandler() {
		if( cafeTableObjImportHandler == null ) {
			cafeTableObjImportHandler = new YCFBamXmlLoaderCafeTableObjImportHandler( this );
		}
		return( cafeTableObjImportHandler );
	}

	protected YCFBamXmlLoaderCafeTableMembersHandler getCafeTableMembersHandler() {
		if( cafeTableMembersHandler == null ) {
			cafeTableMembersHandler = new YCFBamXmlLoaderCafeTableMembersHandler( this );
		}
		return( cafeTableMembersHandler );
	}

	protected YCFBamXmlLoaderCafeTableInterfaceHandler getCafeTableInterfaceHandler() {
		if( cafeTableInterfaceHandler == null ) {
			cafeTableInterfaceHandler = new YCFBamXmlLoaderCafeTableInterfaceHandler( this );
		}
		return( cafeTableInterfaceHandler );
	}

	protected YCFBamXmlLoaderCafeTableImplementationHandler getCafeTableImplementationHandler() {
		if( cafeTableImplementationHandler == null ) {
			cafeTableImplementationHandler = new YCFBamXmlLoaderCafeTableImplementationHandler( this );
		}
		return( cafeTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeTableObjMembersHandler getCafeTableObjMembersHandler() {
		if( cafeTableObjMembersHandler == null ) {
			cafeTableObjMembersHandler = new YCFBamXmlLoaderCafeTableObjMembersHandler( this );
		}
		return( cafeTableObjMembersHandler );
	}

	protected YCFBamXmlLoaderCafeTableObjInterfaceHandler getCafeTableObjInterfaceHandler() {
		if( cafeTableObjInterfaceHandler == null ) {
			cafeTableObjInterfaceHandler = new YCFBamXmlLoaderCafeTableObjInterfaceHandler( this );
		}
		return( cafeTableObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCafeTableObjImplementationHandler getCafeTableObjImplementationHandler() {
		if( cafeTableObjImplementationHandler == null ) {
			cafeTableObjImplementationHandler = new YCFBamXmlLoaderCafeTableObjImplementationHandler( this );
		}
		return( cafeTableObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeDb2LUWTableMembersHandler getCafeDb2LUWTableMembersHandler() {
		if( cafeDb2LUWTableMembersHandler == null ) {
			cafeDb2LUWTableMembersHandler = new YCFBamXmlLoaderCafeDb2LUWTableMembersHandler( this );
		}
		return( cafeDb2LUWTableMembersHandler );
	}

	protected YCFBamXmlLoaderCafeDb2LUWTableImplementationHandler getCafeDb2LUWTableImplementationHandler() {
		if( cafeDb2LUWTableImplementationHandler == null ) {
			cafeDb2LUWTableImplementationHandler = new YCFBamXmlLoaderCafeDb2LUWTableImplementationHandler( this );
		}
		return( cafeDb2LUWTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeMSSqlTableMembersHandler getCafeMSSqlTableMembersHandler() {
		if( cafeMSSqlTableMembersHandler == null ) {
			cafeMSSqlTableMembersHandler = new YCFBamXmlLoaderCafeMSSqlTableMembersHandler( this );
		}
		return( cafeMSSqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderCafeMSSqlTableImplementationHandler getCafeMSSqlTableImplementationHandler() {
		if( cafeMSSqlTableImplementationHandler == null ) {
			cafeMSSqlTableImplementationHandler = new YCFBamXmlLoaderCafeMSSqlTableImplementationHandler( this );
		}
		return( cafeMSSqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeMySqlTableMembersHandler getCafeMySqlTableMembersHandler() {
		if( cafeMySqlTableMembersHandler == null ) {
			cafeMySqlTableMembersHandler = new YCFBamXmlLoaderCafeMySqlTableMembersHandler( this );
		}
		return( cafeMySqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderCafeMySqlTableImplementationHandler getCafeMySqlTableImplementationHandler() {
		if( cafeMySqlTableImplementationHandler == null ) {
			cafeMySqlTableImplementationHandler = new YCFBamXmlLoaderCafeMySqlTableImplementationHandler( this );
		}
		return( cafeMySqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeOracleTableMembersHandler getCafeOracleTableMembersHandler() {
		if( cafeOracleTableMembersHandler == null ) {
			cafeOracleTableMembersHandler = new YCFBamXmlLoaderCafeOracleTableMembersHandler( this );
		}
		return( cafeOracleTableMembersHandler );
	}

	protected YCFBamXmlLoaderCafeOracleTableImplementationHandler getCafeOracleTableImplementationHandler() {
		if( cafeOracleTableImplementationHandler == null ) {
			cafeOracleTableImplementationHandler = new YCFBamXmlLoaderCafeOracleTableImplementationHandler( this );
		}
		return( cafeOracleTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCafePgSqlTableMembersHandler getCafePgSqlTableMembersHandler() {
		if( cafePgSqlTableMembersHandler == null ) {
			cafePgSqlTableMembersHandler = new YCFBamXmlLoaderCafePgSqlTableMembersHandler( this );
		}
		return( cafePgSqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderCafePgSqlTableImplementationHandler getCafePgSqlTableImplementationHandler() {
		if( cafePgSqlTableImplementationHandler == null ) {
			cafePgSqlTableImplementationHandler = new YCFBamXmlLoaderCafePgSqlTableImplementationHandler( this );
		}
		return( cafePgSqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeRamTableMembersHandler getCafeRamTableMembersHandler() {
		if( cafeRamTableMembersHandler == null ) {
			cafeRamTableMembersHandler = new YCFBamXmlLoaderCafeRamTableMembersHandler( this );
		}
		return( cafeRamTableMembersHandler );
	}

	protected YCFBamXmlLoaderCafeRamTableImplementationHandler getCafeRamTableImplementationHandler() {
		if( cafeRamTableImplementationHandler == null ) {
			cafeRamTableImplementationHandler = new YCFBamXmlLoaderCafeRamTableImplementationHandler( this );
		}
		return( cafeRamTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCafeSaxLoaderStartElementHandler getCafeSaxLoaderStartElementHandler() {
		if( cafeSaxLoaderStartElementHandler == null ) {
			cafeSaxLoaderStartElementHandler = new YCFBamXmlLoaderCafeSaxLoaderStartElementHandler( this );
		}
		return( cafeSaxLoaderStartElementHandler );
	}

	protected YCFBamXmlLoaderCafeSaxLoaderEndElementHandler getCafeSaxLoaderEndElementHandler() {
		if( cafeSaxLoaderEndElementHandler == null ) {
			cafeSaxLoaderEndElementHandler = new YCFBamXmlLoaderCafeSaxLoaderEndElementHandler( this );
		}
		return( cafeSaxLoaderEndElementHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgTableImportHandler getCafeXMsgTableImportHandler() {
		if( cafeXMsgTableImportHandler == null ) {
			cafeXMsgTableImportHandler = new YCFBamXmlLoaderCafeXMsgTableImportHandler( this );
		}
		return( cafeXMsgTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgTableFormattersHandler getCafeXMsgTableFormattersHandler() {
		if( cafeXMsgTableFormattersHandler == null ) {
			cafeXMsgTableFormattersHandler = new YCFBamXmlLoaderCafeXMsgTableFormattersHandler( this );
		}
		return( cafeXMsgTableFormattersHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRqstTableImportHandler getCafeXMsgRqstTableImportHandler() {
		if( cafeXMsgRqstTableImportHandler == null ) {
			cafeXMsgRqstTableImportHandler = new YCFBamXmlLoaderCafeXMsgRqstTableImportHandler( this );
		}
		return( cafeXMsgRqstTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRspnTableImportHandler getCafeXMsgRspnTableImportHandler() {
		if( cafeXMsgRspnTableImportHandler == null ) {
			cafeXMsgRspnTableImportHandler = new YCFBamXmlLoaderCafeXMsgRspnTableImportHandler( this );
		}
		return( cafeXMsgRspnTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgClientTableImportHandler getCafeXMsgClientTableImportHandler() {
		if( cafeXMsgClientTableImportHandler == null ) {
			cafeXMsgClientTableImportHandler = new YCFBamXmlLoaderCafeXMsgClientTableImportHandler( this );
		}
		return( cafeXMsgClientTableImportHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRqstTableBodyHandler getCafeXMsgRqstTableBodyHandler() {
		if( cafeXMsgRqstTableBodyHandler == null ) {
			cafeXMsgRqstTableBodyHandler = new YCFBamXmlLoaderCafeXMsgRqstTableBodyHandler( this );
		}
		return( cafeXMsgRqstTableBodyHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgRspnTableBodyHandler getCafeXMsgRspnTableBodyHandler() {
		if( cafeXMsgRspnTableBodyHandler == null ) {
			cafeXMsgRspnTableBodyHandler = new YCFBamXmlLoaderCafeXMsgRspnTableBodyHandler( this );
		}
		return( cafeXMsgRspnTableBodyHandler );
	}

	protected YCFBamXmlLoaderCafeXMsgClientTableBodyHandler getCafeXMsgClientTableBodyHandler() {
		if( cafeXMsgClientTableBodyHandler == null ) {
			cafeXMsgClientTableBodyHandler = new YCFBamXmlLoaderCafeXMsgClientTableBodyHandler( this );
		}
		return( cafeXMsgClientTableBodyHandler );
	}

	protected YCFBamXmlLoaderCPlusMethodBodyHandler getCPlusMethodBodyHandler() {
		if( cplusMethodBodyHandler == null ) {
			cplusMethodBodyHandler = new YCFBamXmlLoaderCPlusMethodBodyHandler( this );
		}
		return( cplusMethodBodyHandler );
	}

	protected YCFBamXmlLoaderCPlusSchemaObjInterfaceHandler getCPlusSchemaObjInterfaceHandler() {
		if( cplusSchemaObjInterfaceHandler == null ) {
			cplusSchemaObjInterfaceHandler = new YCFBamXmlLoaderCPlusSchemaObjInterfaceHandler( this );
		}
		return( cplusSchemaObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCPlusSchemaObjMembersHandler getCPlusSchemaObjMembersHandler() {
		if( cplusSchemaObjMembersHandler == null ) {
			cplusSchemaObjMembersHandler = new YCFBamXmlLoaderCPlusSchemaObjMembersHandler( this );
		}
		return( cplusSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusSchemaObjIncludeHandler getCPlusSchemaObjIncludeHandler() {
		if( cplusSchemaObjIncludeHandler == null ) {
			cplusSchemaObjIncludeHandler = new YCFBamXmlLoaderCPlusSchemaObjIncludeHandler( this );
		}
		return( cplusSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusSchemaObjImplementationHandler getCPlusSchemaObjImplementationHandler() {
		if( cplusSchemaObjImplementationHandler == null ) {
			cplusSchemaObjImplementationHandler = new YCFBamXmlLoaderCPlusSchemaObjImplementationHandler( this );
		}
		return( cplusSchemaObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusDb2LUWSchemaObjMembersHandler getCPlusDb2LUWSchemaObjMembersHandler() {
		if( cplusDb2LUWSchemaObjMembersHandler == null ) {
			cplusDb2LUWSchemaObjMembersHandler = new YCFBamXmlLoaderCPlusDb2LUWSchemaObjMembersHandler( this );
		}
		return( cplusDb2LUWSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusDb2LUWSchemaObjImplHandler getCPlusDb2LUWSchemaObjImplHandler() {
		if( cplusDb2LUWSchemaObjImplHandler == null ) {
			cplusDb2LUWSchemaObjImplHandler = new YCFBamXmlLoaderCPlusDb2LUWSchemaObjImplHandler( this );
		}
		return( cplusDb2LUWSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCPlusDb2LUWSchemaObjIncludeHandler getCPlusDb2LUWSchemaObjIncludeHandler() {
		if( cplusDb2LUWSchemaObjIncludeHandler == null ) {
			cplusDb2LUWSchemaObjIncludeHandler = new YCFBamXmlLoaderCPlusDb2LUWSchemaObjIncludeHandler( this );
		}
		return( cplusDb2LUWSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusMSSqlSchemaObjMembersHandler getCPlusMSSqlSchemaObjMembersHandler() {
		if( cplusMSSqlSchemaObjMembersHandler == null ) {
			cplusMSSqlSchemaObjMembersHandler = new YCFBamXmlLoaderCPlusMSSqlSchemaObjMembersHandler( this );
		}
		return( cplusMSSqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusMSSqlSchemaObjImplHandler getCPlusMSSqlSchemaObjImplHandler() {
		if( cplusMSSqlSchemaObjImplHandler == null ) {
			cplusMSSqlSchemaObjImplHandler = new YCFBamXmlLoaderCPlusMSSqlSchemaObjImplHandler( this );
		}
		return( cplusMSSqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCPlusMSSqlSchemaObjIncludeHandler getCPlusMSSqlSchemaObjIncludeHandler() {
		if( cplusMSSqlSchemaObjIncludeHandler == null ) {
			cplusMSSqlSchemaObjIncludeHandler = new YCFBamXmlLoaderCPlusMSSqlSchemaObjIncludeHandler( this );
		}
		return( cplusMSSqlSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusMySqlSchemaObjMembersHandler getCPlusMySqlSchemaObjMembersHandler() {
		if( cplusMySqlSchemaObjMembersHandler == null ) {
			cplusMySqlSchemaObjMembersHandler = new YCFBamXmlLoaderCPlusMySqlSchemaObjMembersHandler( this );
		}
		return( cplusMySqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusMySqlSchemaObjImplHandler getCPlusMySqlSchemaObjImplHandler() {
		if( cplusMySqlSchemaObjImplHandler == null ) {
			cplusMySqlSchemaObjImplHandler = new YCFBamXmlLoaderCPlusMySqlSchemaObjImplHandler( this );
		}
		return( cplusMySqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCPlusMySqlSchemaObjIncludeHandler getCPlusMySqlSchemaObjIncludeHandler() {
		if( cplusMySqlSchemaObjIncludeHandler == null ) {
			cplusMySqlSchemaObjIncludeHandler = new YCFBamXmlLoaderCPlusMySqlSchemaObjIncludeHandler( this );
		}
		return( cplusMySqlSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusOracleSchemaObjMembersHandler getCPlusOracleSchemaObjMembersHandler() {
		if( cplusOracleSchemaObjMembersHandler == null ) {
			cplusOracleSchemaObjMembersHandler = new YCFBamXmlLoaderCPlusOracleSchemaObjMembersHandler( this );
		}
		return( cplusOracleSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusOracleSchemaObjImplHandler getCPlusOracleSchemaObjImplHandler() {
		if( cplusOracleSchemaObjImplHandler == null ) {
			cplusOracleSchemaObjImplHandler = new YCFBamXmlLoaderCPlusOracleSchemaObjImplHandler( this );
		}
		return( cplusOracleSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCPlusOracleSchemaObjIncludeHandler getCPlusOracleSchemaObjIncludeHandler() {
		if( cplusOracleSchemaObjIncludeHandler == null ) {
			cplusOracleSchemaObjIncludeHandler = new YCFBamXmlLoaderCPlusOracleSchemaObjIncludeHandler( this );
		}
		return( cplusOracleSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusPgSqlSchemaObjMembersHandler getCPlusPgSqlSchemaObjMembersHandler() {
		if( cplusPgSqlSchemaObjMembersHandler == null ) {
			cplusPgSqlSchemaObjMembersHandler = new YCFBamXmlLoaderCPlusPgSqlSchemaObjMembersHandler( this );
		}
		return( cplusPgSqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusPgSqlSchemaObjImplHandler getCPlusPgSqlSchemaObjImplHandler() {
		if( cplusPgSqlSchemaObjImplHandler == null ) {
			cplusPgSqlSchemaObjImplHandler = new YCFBamXmlLoaderCPlusPgSqlSchemaObjImplHandler( this );
		}
		return( cplusPgSqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCPlusPgSqlSchemaObjIncludeHandler getCPlusPgSqlSchemaObjIncludeHandler() {
		if( cplusPgSqlSchemaObjIncludeHandler == null ) {
			cplusPgSqlSchemaObjIncludeHandler = new YCFBamXmlLoaderCPlusPgSqlSchemaObjIncludeHandler( this );
		}
		return( cplusPgSqlSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusRamSchemaObjMembersHandler getCPlusRamSchemaObjMembersHandler() {
		if( cplusRamSchemaObjMembersHandler == null ) {
			cplusRamSchemaObjMembersHandler = new YCFBamXmlLoaderCPlusRamSchemaObjMembersHandler( this );
		}
		return( cplusRamSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusRamSchemaObjImplHandler getCPlusRamSchemaObjImplHandler() {
		if( cplusRamSchemaObjImplHandler == null ) {
			cplusRamSchemaObjImplHandler = new YCFBamXmlLoaderCPlusRamSchemaObjImplHandler( this );
		}
		return( cplusRamSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCPlusRamSchemaObjIncludeHandler getCPlusRamSchemaObjIncludeHandler() {
		if( cplusRamSchemaObjIncludeHandler == null ) {
			cplusRamSchemaObjIncludeHandler = new YCFBamXmlLoaderCPlusRamSchemaObjIncludeHandler( this );
		}
		return( cplusRamSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgSchemaIncludeHandler getCPlusXMsgSchemaIncludeHandler() {
		if( cplusXMsgSchemaIncludeHandler == null ) {
			cplusXMsgSchemaIncludeHandler = new YCFBamXmlLoaderCPlusXMsgSchemaIncludeHandler( this );
		}
		return( cplusXMsgSchemaIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgSchemaFormattersHandler getCPlusXMsgSchemaFormattersHandler() {
		if( cplusXMsgSchemaFormattersHandler == null ) {
			cplusXMsgSchemaFormattersHandler = new YCFBamXmlLoaderCPlusXMsgSchemaFormattersHandler( this );
		}
		return( cplusXMsgSchemaFormattersHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgClientSchemaIncludeHandler getCPlusXMsgClientSchemaIncludeHandler() {
		if( cplusXMsgClientSchemaIncludeHandler == null ) {
			cplusXMsgClientSchemaIncludeHandler = new YCFBamXmlLoaderCPlusXMsgClientSchemaIncludeHandler( this );
		}
		return( cplusXMsgClientSchemaIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgClientSchemaBodyHandler getCPlusXMsgClientSchemaBodyHandler() {
		if( cplusXMsgClientSchemaBodyHandler == null ) {
			cplusXMsgClientSchemaBodyHandler = new YCFBamXmlLoaderCPlusXMsgClientSchemaBodyHandler( this );
		}
		return( cplusXMsgClientSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRqstSchemaBodyHandler getCPlusXMsgRqstSchemaBodyHandler() {
		if( cplusXMsgRqstSchemaBodyHandler == null ) {
			cplusXMsgRqstSchemaBodyHandler = new YCFBamXmlLoaderCPlusXMsgRqstSchemaBodyHandler( this );
		}
		return( cplusXMsgRqstSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRqstSchemaIncludeHandler getCPlusXMsgRqstSchemaIncludeHandler() {
		if( cplusXMsgRqstSchemaIncludeHandler == null ) {
			cplusXMsgRqstSchemaIncludeHandler = new YCFBamXmlLoaderCPlusXMsgRqstSchemaIncludeHandler( this );
		}
		return( cplusXMsgRqstSchemaIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRqstSchemaWireParsersHandler getCPlusXMsgRqstSchemaWireParsersHandler() {
		if( cplusXMsgRqstSchemaWireParsersHandler == null ) {
			cplusXMsgRqstSchemaWireParsersHandler = new YCFBamXmlLoaderCPlusXMsgRqstSchemaWireParsersHandler( this );
		}
		return( cplusXMsgRqstSchemaWireParsersHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRqstSchemaXsdElementListHandler getCPlusXMsgRqstSchemaXsdElementListHandler() {
		if( cplusXMsgRqstSchemaXsdElementListHandler == null ) {
			cplusXMsgRqstSchemaXsdElementListHandler = new YCFBamXmlLoaderCPlusXMsgRqstSchemaXsdElementListHandler( this );
		}
		return( cplusXMsgRqstSchemaXsdElementListHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRqstSchemaXsdSpecHandler getCPlusXMsgRqstSchemaXsdSpecHandler() {
		if( cplusXMsgRqstSchemaXsdSpecHandler == null ) {
			cplusXMsgRqstSchemaXsdSpecHandler = new YCFBamXmlLoaderCPlusXMsgRqstSchemaXsdSpecHandler( this );
		}
		return( cplusXMsgRqstSchemaXsdSpecHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRspnSchemaBodyHandler getCPlusXMsgRspnSchemaBodyHandler() {
		if( cplusXMsgRspnSchemaBodyHandler == null ) {
			cplusXMsgRspnSchemaBodyHandler = new YCFBamXmlLoaderCPlusXMsgRspnSchemaBodyHandler( this );
		}
		return( cplusXMsgRspnSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRspnSchemaIncludeHandler getCPlusXMsgRspnSchemaIncludeHandler() {
		if( cplusXMsgRspnSchemaIncludeHandler == null ) {
			cplusXMsgRspnSchemaIncludeHandler = new YCFBamXmlLoaderCPlusXMsgRspnSchemaIncludeHandler( this );
		}
		return( cplusXMsgRspnSchemaIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRspnSchemaWireParsersHandler getCPlusXMsgRspnSchemaWireParsersHandler() {
		if( cplusXMsgRspnSchemaWireParsersHandler == null ) {
			cplusXMsgRspnSchemaWireParsersHandler = new YCFBamXmlLoaderCPlusXMsgRspnSchemaWireParsersHandler( this );
		}
		return( cplusXMsgRspnSchemaWireParsersHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRspnSchemaXsdElementListHandler getCPlusXMsgRspnSchemaXsdElementListHandler() {
		if( cplusXMsgRspnSchemaXsdElementListHandler == null ) {
			cplusXMsgRspnSchemaXsdElementListHandler = new YCFBamXmlLoaderCPlusXMsgRspnSchemaXsdElementListHandler( this );
		}
		return( cplusXMsgRspnSchemaXsdElementListHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRspnSchemaXsdSpecHandler getCPlusXMsgRspnSchemaXsdSpecHandler() {
		if( cplusXMsgRspnSchemaXsdSpecHandler == null ) {
			cplusXMsgRspnSchemaXsdSpecHandler = new YCFBamXmlLoaderCPlusXMsgRspnSchemaXsdSpecHandler( this );
		}
		return( cplusXMsgRspnSchemaXsdSpecHandler );
	}

	protected YCFBamXmlLoaderCPlusObjMembersHandler getCPlusObjMembersHandler() {
		if( cplusObjMembersHandler == null ) {
			cplusObjMembersHandler = new YCFBamXmlLoaderCPlusObjMembersHandler( this );
		}
		return( cplusObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusObjInterfaceHandler getCPlusObjInterfaceHandler() {
		if( cplusObjInterfaceHandler == null ) {
			cplusObjInterfaceHandler = new YCFBamXmlLoaderCPlusObjInterfaceHandler( this );
		}
		return( cplusObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCPlusObjImplementationHandler getCPlusObjImplementationHandler() {
		if( cplusObjImplementationHandler == null ) {
			cplusObjImplementationHandler = new YCFBamXmlLoaderCPlusObjImplementationHandler( this );
		}
		return( cplusObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusEditObjMembersHandler getCPlusEditObjMembersHandler() {
		if( cplusEditObjMembersHandler == null ) {
			cplusEditObjMembersHandler = new YCFBamXmlLoaderCPlusEditObjMembersHandler( this );
		}
		return( cplusEditObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusEditObjInterfaceHandler getCPlusEditObjInterfaceHandler() {
		if( cplusEditObjInterfaceHandler == null ) {
			cplusEditObjInterfaceHandler = new YCFBamXmlLoaderCPlusEditObjInterfaceHandler( this );
		}
		return( cplusEditObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCPlusEditObjImplementationHandler getCPlusEditObjImplementationHandler() {
		if( cplusEditObjImplementationHandler == null ) {
			cplusEditObjImplementationHandler = new YCFBamXmlLoaderCPlusEditObjImplementationHandler( this );
		}
		return( cplusEditObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusDb2LUWTableIncludeHandler getCPlusDb2LUWTableIncludeHandler() {
		if( cplusDb2LUWTableIncludeHandler == null ) {
			cplusDb2LUWTableIncludeHandler = new YCFBamXmlLoaderCPlusDb2LUWTableIncludeHandler( this );
		}
		return( cplusDb2LUWTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusMSSqlTableIncludeHandler getCPlusMSSqlTableIncludeHandler() {
		if( cplusMSSqlTableIncludeHandler == null ) {
			cplusMSSqlTableIncludeHandler = new YCFBamXmlLoaderCPlusMSSqlTableIncludeHandler( this );
		}
		return( cplusMSSqlTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusMySqlTableIncludeHandler getCPlusMySqlTableIncludeHandler() {
		if( cplusMySqlTableIncludeHandler == null ) {
			cplusMySqlTableIncludeHandler = new YCFBamXmlLoaderCPlusMySqlTableIncludeHandler( this );
		}
		return( cplusMySqlTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusOracleTableIncludeHandler getCPlusOracleTableIncludeHandler() {
		if( cplusOracleTableIncludeHandler == null ) {
			cplusOracleTableIncludeHandler = new YCFBamXmlLoaderCPlusOracleTableIncludeHandler( this );
		}
		return( cplusOracleTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusPgSqlTableIncludeHandler getCPlusPgSqlTableIncludeHandler() {
		if( cplusPgSqlTableIncludeHandler == null ) {
			cplusPgSqlTableIncludeHandler = new YCFBamXmlLoaderCPlusPgSqlTableIncludeHandler( this );
		}
		return( cplusPgSqlTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusRamTableIncludeHandler getCPlusRamTableIncludeHandler() {
		if( cplusRamTableIncludeHandler == null ) {
			cplusRamTableIncludeHandler = new YCFBamXmlLoaderCPlusRamTableIncludeHandler( this );
		}
		return( cplusRamTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusObjIncludeHandler getCPlusObjIncludeHandler() {
		if( cplusObjIncludeHandler == null ) {
			cplusObjIncludeHandler = new YCFBamXmlLoaderCPlusObjIncludeHandler( this );
		}
		return( cplusObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusEditObjIncludeHandler getCPlusEditObjIncludeHandler() {
		if( cplusEditObjIncludeHandler == null ) {
			cplusEditObjIncludeHandler = new YCFBamXmlLoaderCPlusEditObjIncludeHandler( this );
		}
		return( cplusEditObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusSaxLoaderIncludeHandler getCPlusSaxLoaderIncludeHandler() {
		if( cplusSaxLoaderIncludeHandler == null ) {
			cplusSaxLoaderIncludeHandler = new YCFBamXmlLoaderCPlusSaxLoaderIncludeHandler( this );
		}
		return( cplusSaxLoaderIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusTableIncludeHandler getCPlusTableIncludeHandler() {
		if( cplusTableIncludeHandler == null ) {
			cplusTableIncludeHandler = new YCFBamXmlLoaderCPlusTableIncludeHandler( this );
		}
		return( cplusTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusTableObjIncludeHandler getCPlusTableObjIncludeHandler() {
		if( cplusTableObjIncludeHandler == null ) {
			cplusTableObjIncludeHandler = new YCFBamXmlLoaderCPlusTableObjIncludeHandler( this );
		}
		return( cplusTableObjIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusTableMembersHandler getCPlusTableMembersHandler() {
		if( cplusTableMembersHandler == null ) {
			cplusTableMembersHandler = new YCFBamXmlLoaderCPlusTableMembersHandler( this );
		}
		return( cplusTableMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusTableInterfaceHandler getCPlusTableInterfaceHandler() {
		if( cplusTableInterfaceHandler == null ) {
			cplusTableInterfaceHandler = new YCFBamXmlLoaderCPlusTableInterfaceHandler( this );
		}
		return( cplusTableInterfaceHandler );
	}

	protected YCFBamXmlLoaderCPlusTableImplementationHandler getCPlusTableImplementationHandler() {
		if( cplusTableImplementationHandler == null ) {
			cplusTableImplementationHandler = new YCFBamXmlLoaderCPlusTableImplementationHandler( this );
		}
		return( cplusTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusTableObjMembersHandler getCPlusTableObjMembersHandler() {
		if( cplusTableObjMembersHandler == null ) {
			cplusTableObjMembersHandler = new YCFBamXmlLoaderCPlusTableObjMembersHandler( this );
		}
		return( cplusTableObjMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusTableObjInterfaceHandler getCPlusTableObjInterfaceHandler() {
		if( cplusTableObjInterfaceHandler == null ) {
			cplusTableObjInterfaceHandler = new YCFBamXmlLoaderCPlusTableObjInterfaceHandler( this );
		}
		return( cplusTableObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCPlusTableObjImplementationHandler getCPlusTableObjImplementationHandler() {
		if( cplusTableObjImplementationHandler == null ) {
			cplusTableObjImplementationHandler = new YCFBamXmlLoaderCPlusTableObjImplementationHandler( this );
		}
		return( cplusTableObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusDb2LUWTableMembersHandler getCPlusDb2LUWTableMembersHandler() {
		if( cplusDb2LUWTableMembersHandler == null ) {
			cplusDb2LUWTableMembersHandler = new YCFBamXmlLoaderCPlusDb2LUWTableMembersHandler( this );
		}
		return( cplusDb2LUWTableMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusDb2LUWTableImplementationHandler getCPlusDb2LUWTableImplementationHandler() {
		if( cplusDb2LUWTableImplementationHandler == null ) {
			cplusDb2LUWTableImplementationHandler = new YCFBamXmlLoaderCPlusDb2LUWTableImplementationHandler( this );
		}
		return( cplusDb2LUWTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusMSSqlTableMembersHandler getCPlusMSSqlTableMembersHandler() {
		if( cplusMSSqlTableMembersHandler == null ) {
			cplusMSSqlTableMembersHandler = new YCFBamXmlLoaderCPlusMSSqlTableMembersHandler( this );
		}
		return( cplusMSSqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusMSSqlTableImplementationHandler getCPlusMSSqlTableImplementationHandler() {
		if( cplusMSSqlTableImplementationHandler == null ) {
			cplusMSSqlTableImplementationHandler = new YCFBamXmlLoaderCPlusMSSqlTableImplementationHandler( this );
		}
		return( cplusMSSqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusMySqlTableMembersHandler getCPlusMySqlTableMembersHandler() {
		if( cplusMySqlTableMembersHandler == null ) {
			cplusMySqlTableMembersHandler = new YCFBamXmlLoaderCPlusMySqlTableMembersHandler( this );
		}
		return( cplusMySqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusMySqlTableImplementationHandler getCPlusMySqlTableImplementationHandler() {
		if( cplusMySqlTableImplementationHandler == null ) {
			cplusMySqlTableImplementationHandler = new YCFBamXmlLoaderCPlusMySqlTableImplementationHandler( this );
		}
		return( cplusMySqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusOracleTableMembersHandler getCPlusOracleTableMembersHandler() {
		if( cplusOracleTableMembersHandler == null ) {
			cplusOracleTableMembersHandler = new YCFBamXmlLoaderCPlusOracleTableMembersHandler( this );
		}
		return( cplusOracleTableMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusOracleTableImplementationHandler getCPlusOracleTableImplementationHandler() {
		if( cplusOracleTableImplementationHandler == null ) {
			cplusOracleTableImplementationHandler = new YCFBamXmlLoaderCPlusOracleTableImplementationHandler( this );
		}
		return( cplusOracleTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusPgSqlTableMembersHandler getCPlusPgSqlTableMembersHandler() {
		if( cplusPgSqlTableMembersHandler == null ) {
			cplusPgSqlTableMembersHandler = new YCFBamXmlLoaderCPlusPgSqlTableMembersHandler( this );
		}
		return( cplusPgSqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusPgSqlTableImplementationHandler getCPlusPgSqlTableImplementationHandler() {
		if( cplusPgSqlTableImplementationHandler == null ) {
			cplusPgSqlTableImplementationHandler = new YCFBamXmlLoaderCPlusPgSqlTableImplementationHandler( this );
		}
		return( cplusPgSqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusRamTableMembersHandler getCPlusRamTableMembersHandler() {
		if( cplusRamTableMembersHandler == null ) {
			cplusRamTableMembersHandler = new YCFBamXmlLoaderCPlusRamTableMembersHandler( this );
		}
		return( cplusRamTableMembersHandler );
	}

	protected YCFBamXmlLoaderCPlusRamTableImplementationHandler getCPlusRamTableImplementationHandler() {
		if( cplusRamTableImplementationHandler == null ) {
			cplusRamTableImplementationHandler = new YCFBamXmlLoaderCPlusRamTableImplementationHandler( this );
		}
		return( cplusRamTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCPlusSaxLoaderStartElementHandler getCPlusSaxLoaderStartElementHandler() {
		if( cplusSaxLoaderStartElementHandler == null ) {
			cplusSaxLoaderStartElementHandler = new YCFBamXmlLoaderCPlusSaxLoaderStartElementHandler( this );
		}
		return( cplusSaxLoaderStartElementHandler );
	}

	protected YCFBamXmlLoaderCPlusSaxLoaderEndElementHandler getCPlusSaxLoaderEndElementHandler() {
		if( cplusSaxLoaderEndElementHandler == null ) {
			cplusSaxLoaderEndElementHandler = new YCFBamXmlLoaderCPlusSaxLoaderEndElementHandler( this );
		}
		return( cplusSaxLoaderEndElementHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgTableIncludeHandler getCPlusXMsgTableIncludeHandler() {
		if( cplusXMsgTableIncludeHandler == null ) {
			cplusXMsgTableIncludeHandler = new YCFBamXmlLoaderCPlusXMsgTableIncludeHandler( this );
		}
		return( cplusXMsgTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgTableFormattersHandler getCPlusXMsgTableFormattersHandler() {
		if( cplusXMsgTableFormattersHandler == null ) {
			cplusXMsgTableFormattersHandler = new YCFBamXmlLoaderCPlusXMsgTableFormattersHandler( this );
		}
		return( cplusXMsgTableFormattersHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRqstTableIncludeHandler getCPlusXMsgRqstTableIncludeHandler() {
		if( cplusXMsgRqstTableIncludeHandler == null ) {
			cplusXMsgRqstTableIncludeHandler = new YCFBamXmlLoaderCPlusXMsgRqstTableIncludeHandler( this );
		}
		return( cplusXMsgRqstTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRspnTableIncludeHandler getCPlusXMsgRspnTableIncludeHandler() {
		if( cplusXMsgRspnTableIncludeHandler == null ) {
			cplusXMsgRspnTableIncludeHandler = new YCFBamXmlLoaderCPlusXMsgRspnTableIncludeHandler( this );
		}
		return( cplusXMsgRspnTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgClientTableIncludeHandler getCPlusXMsgClientTableIncludeHandler() {
		if( cplusXMsgClientTableIncludeHandler == null ) {
			cplusXMsgClientTableIncludeHandler = new YCFBamXmlLoaderCPlusXMsgClientTableIncludeHandler( this );
		}
		return( cplusXMsgClientTableIncludeHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRqstTableBodyHandler getCPlusXMsgRqstTableBodyHandler() {
		if( cplusXMsgRqstTableBodyHandler == null ) {
			cplusXMsgRqstTableBodyHandler = new YCFBamXmlLoaderCPlusXMsgRqstTableBodyHandler( this );
		}
		return( cplusXMsgRqstTableBodyHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgRspnTableBodyHandler getCPlusXMsgRspnTableBodyHandler() {
		if( cplusXMsgRspnTableBodyHandler == null ) {
			cplusXMsgRspnTableBodyHandler = new YCFBamXmlLoaderCPlusXMsgRspnTableBodyHandler( this );
		}
		return( cplusXMsgRspnTableBodyHandler );
	}

	protected YCFBamXmlLoaderCPlusXMsgClientTableBodyHandler getCPlusXMsgClientTableBodyHandler() {
		if( cplusXMsgClientTableBodyHandler == null ) {
			cplusXMsgClientTableBodyHandler = new YCFBamXmlLoaderCPlusXMsgClientTableBodyHandler( this );
		}
		return( cplusXMsgClientTableBodyHandler );
	}

	protected YCFBamXmlLoaderHPlusSchemaObjInterfaceHandler getHPlusSchemaObjInterfaceHandler() {
		if( hplusSchemaObjInterfaceHandler == null ) {
			hplusSchemaObjInterfaceHandler = new YCFBamXmlLoaderHPlusSchemaObjInterfaceHandler( this );
		}
		return( hplusSchemaObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderHPlusSchemaObjMembersHandler getHPlusSchemaObjMembersHandler() {
		if( hplusSchemaObjMembersHandler == null ) {
			hplusSchemaObjMembersHandler = new YCFBamXmlLoaderHPlusSchemaObjMembersHandler( this );
		}
		return( hplusSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusSchemaObjIncludeHandler getHPlusSchemaObjIncludeHandler() {
		if( hplusSchemaObjIncludeHandler == null ) {
			hplusSchemaObjIncludeHandler = new YCFBamXmlLoaderHPlusSchemaObjIncludeHandler( this );
		}
		return( hplusSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusSchemaObjImplementationHandler getHPlusSchemaObjImplementationHandler() {
		if( hplusSchemaObjImplementationHandler == null ) {
			hplusSchemaObjImplementationHandler = new YCFBamXmlLoaderHPlusSchemaObjImplementationHandler( this );
		}
		return( hplusSchemaObjImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusDb2LUWSchemaObjMembersHandler getHPlusDb2LUWSchemaObjMembersHandler() {
		if( hplusDb2LUWSchemaObjMembersHandler == null ) {
			hplusDb2LUWSchemaObjMembersHandler = new YCFBamXmlLoaderHPlusDb2LUWSchemaObjMembersHandler( this );
		}
		return( hplusDb2LUWSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusDb2LUWSchemaObjImplHandler getHPlusDb2LUWSchemaObjImplHandler() {
		if( hplusDb2LUWSchemaObjImplHandler == null ) {
			hplusDb2LUWSchemaObjImplHandler = new YCFBamXmlLoaderHPlusDb2LUWSchemaObjImplHandler( this );
		}
		return( hplusDb2LUWSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderHPlusDb2LUWSchemaObjIncludeHandler getHPlusDb2LUWSchemaObjIncludeHandler() {
		if( hplusDb2LUWSchemaObjIncludeHandler == null ) {
			hplusDb2LUWSchemaObjIncludeHandler = new YCFBamXmlLoaderHPlusDb2LUWSchemaObjIncludeHandler( this );
		}
		return( hplusDb2LUWSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusMSSqlSchemaObjMembersHandler getHPlusMSSqlSchemaObjMembersHandler() {
		if( hplusMSSqlSchemaObjMembersHandler == null ) {
			hplusMSSqlSchemaObjMembersHandler = new YCFBamXmlLoaderHPlusMSSqlSchemaObjMembersHandler( this );
		}
		return( hplusMSSqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusMSSqlSchemaObjImplHandler getHPlusMSSqlSchemaObjImplHandler() {
		if( hplusMSSqlSchemaObjImplHandler == null ) {
			hplusMSSqlSchemaObjImplHandler = new YCFBamXmlLoaderHPlusMSSqlSchemaObjImplHandler( this );
		}
		return( hplusMSSqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderHPlusMSSqlSchemaObjIncludeHandler getHPlusMSSqlSchemaObjIncludeHandler() {
		if( hplusMSSqlSchemaObjIncludeHandler == null ) {
			hplusMSSqlSchemaObjIncludeHandler = new YCFBamXmlLoaderHPlusMSSqlSchemaObjIncludeHandler( this );
		}
		return( hplusMSSqlSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusMySqlSchemaObjMembersHandler getHPlusMySqlSchemaObjMembersHandler() {
		if( hplusMySqlSchemaObjMembersHandler == null ) {
			hplusMySqlSchemaObjMembersHandler = new YCFBamXmlLoaderHPlusMySqlSchemaObjMembersHandler( this );
		}
		return( hplusMySqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusMySqlSchemaObjImplHandler getHPlusMySqlSchemaObjImplHandler() {
		if( hplusMySqlSchemaObjImplHandler == null ) {
			hplusMySqlSchemaObjImplHandler = new YCFBamXmlLoaderHPlusMySqlSchemaObjImplHandler( this );
		}
		return( hplusMySqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderHPlusMySqlSchemaObjIncludeHandler getHPlusMySqlSchemaObjIncludeHandler() {
		if( hplusMySqlSchemaObjIncludeHandler == null ) {
			hplusMySqlSchemaObjIncludeHandler = new YCFBamXmlLoaderHPlusMySqlSchemaObjIncludeHandler( this );
		}
		return( hplusMySqlSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusOracleSchemaObjMembersHandler getHPlusOracleSchemaObjMembersHandler() {
		if( hplusOracleSchemaObjMembersHandler == null ) {
			hplusOracleSchemaObjMembersHandler = new YCFBamXmlLoaderHPlusOracleSchemaObjMembersHandler( this );
		}
		return( hplusOracleSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusOracleSchemaObjImplHandler getHPlusOracleSchemaObjImplHandler() {
		if( hplusOracleSchemaObjImplHandler == null ) {
			hplusOracleSchemaObjImplHandler = new YCFBamXmlLoaderHPlusOracleSchemaObjImplHandler( this );
		}
		return( hplusOracleSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderHPlusOracleSchemaObjIncludeHandler getHPlusOracleSchemaObjIncludeHandler() {
		if( hplusOracleSchemaObjIncludeHandler == null ) {
			hplusOracleSchemaObjIncludeHandler = new YCFBamXmlLoaderHPlusOracleSchemaObjIncludeHandler( this );
		}
		return( hplusOracleSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusPgSqlSchemaObjMembersHandler getHPlusPgSqlSchemaObjMembersHandler() {
		if( hplusPgSqlSchemaObjMembersHandler == null ) {
			hplusPgSqlSchemaObjMembersHandler = new YCFBamXmlLoaderHPlusPgSqlSchemaObjMembersHandler( this );
		}
		return( hplusPgSqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusPgSqlSchemaObjImplHandler getHPlusPgSqlSchemaObjImplHandler() {
		if( hplusPgSqlSchemaObjImplHandler == null ) {
			hplusPgSqlSchemaObjImplHandler = new YCFBamXmlLoaderHPlusPgSqlSchemaObjImplHandler( this );
		}
		return( hplusPgSqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderHPlusPgSqlSchemaObjIncludeHandler getHPlusPgSqlSchemaObjIncludeHandler() {
		if( hplusPgSqlSchemaObjIncludeHandler == null ) {
			hplusPgSqlSchemaObjIncludeHandler = new YCFBamXmlLoaderHPlusPgSqlSchemaObjIncludeHandler( this );
		}
		return( hplusPgSqlSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusRamSchemaObjMembersHandler getHPlusRamSchemaObjMembersHandler() {
		if( hplusRamSchemaObjMembersHandler == null ) {
			hplusRamSchemaObjMembersHandler = new YCFBamXmlLoaderHPlusRamSchemaObjMembersHandler( this );
		}
		return( hplusRamSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusRamSchemaObjImplHandler getHPlusRamSchemaObjImplHandler() {
		if( hplusRamSchemaObjImplHandler == null ) {
			hplusRamSchemaObjImplHandler = new YCFBamXmlLoaderHPlusRamSchemaObjImplHandler( this );
		}
		return( hplusRamSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderHPlusRamSchemaObjIncludeHandler getHPlusRamSchemaObjIncludeHandler() {
		if( hplusRamSchemaObjIncludeHandler == null ) {
			hplusRamSchemaObjIncludeHandler = new YCFBamXmlLoaderHPlusRamSchemaObjIncludeHandler( this );
		}
		return( hplusRamSchemaObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgSchemaIncludeHandler getHPlusXMsgSchemaIncludeHandler() {
		if( hplusXMsgSchemaIncludeHandler == null ) {
			hplusXMsgSchemaIncludeHandler = new YCFBamXmlLoaderHPlusXMsgSchemaIncludeHandler( this );
		}
		return( hplusXMsgSchemaIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgSchemaFormattersHandler getHPlusXMsgSchemaFormattersHandler() {
		if( hplusXMsgSchemaFormattersHandler == null ) {
			hplusXMsgSchemaFormattersHandler = new YCFBamXmlLoaderHPlusXMsgSchemaFormattersHandler( this );
		}
		return( hplusXMsgSchemaFormattersHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgClientSchemaIncludeHandler getHPlusXMsgClientSchemaIncludeHandler() {
		if( hplusXMsgClientSchemaIncludeHandler == null ) {
			hplusXMsgClientSchemaIncludeHandler = new YCFBamXmlLoaderHPlusXMsgClientSchemaIncludeHandler( this );
		}
		return( hplusXMsgClientSchemaIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgClientSchemaBodyHandler getHPlusXMsgClientSchemaBodyHandler() {
		if( hplusXMsgClientSchemaBodyHandler == null ) {
			hplusXMsgClientSchemaBodyHandler = new YCFBamXmlLoaderHPlusXMsgClientSchemaBodyHandler( this );
		}
		return( hplusXMsgClientSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRqstSchemaBodyHandler getHPlusXMsgRqstSchemaBodyHandler() {
		if( hplusXMsgRqstSchemaBodyHandler == null ) {
			hplusXMsgRqstSchemaBodyHandler = new YCFBamXmlLoaderHPlusXMsgRqstSchemaBodyHandler( this );
		}
		return( hplusXMsgRqstSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRqstSchemaIncludeHandler getHPlusXMsgRqstSchemaIncludeHandler() {
		if( hplusXMsgRqstSchemaIncludeHandler == null ) {
			hplusXMsgRqstSchemaIncludeHandler = new YCFBamXmlLoaderHPlusXMsgRqstSchemaIncludeHandler( this );
		}
		return( hplusXMsgRqstSchemaIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRqstSchemaWireParsersHandler getHPlusXMsgRqstSchemaWireParsersHandler() {
		if( hplusXMsgRqstSchemaWireParsersHandler == null ) {
			hplusXMsgRqstSchemaWireParsersHandler = new YCFBamXmlLoaderHPlusXMsgRqstSchemaWireParsersHandler( this );
		}
		return( hplusXMsgRqstSchemaWireParsersHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRqstSchemaXsdElementListHandler getHPlusXMsgRqstSchemaXsdElementListHandler() {
		if( hplusXMsgRqstSchemaXsdElementListHandler == null ) {
			hplusXMsgRqstSchemaXsdElementListHandler = new YCFBamXmlLoaderHPlusXMsgRqstSchemaXsdElementListHandler( this );
		}
		return( hplusXMsgRqstSchemaXsdElementListHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRqstSchemaXsdSpecHandler getHPlusXMsgRqstSchemaXsdSpecHandler() {
		if( hplusXMsgRqstSchemaXsdSpecHandler == null ) {
			hplusXMsgRqstSchemaXsdSpecHandler = new YCFBamXmlLoaderHPlusXMsgRqstSchemaXsdSpecHandler( this );
		}
		return( hplusXMsgRqstSchemaXsdSpecHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRspnSchemaBodyHandler getHPlusXMsgRspnSchemaBodyHandler() {
		if( hplusXMsgRspnSchemaBodyHandler == null ) {
			hplusXMsgRspnSchemaBodyHandler = new YCFBamXmlLoaderHPlusXMsgRspnSchemaBodyHandler( this );
		}
		return( hplusXMsgRspnSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRspnSchemaIncludeHandler getHPlusXMsgRspnSchemaIncludeHandler() {
		if( hplusXMsgRspnSchemaIncludeHandler == null ) {
			hplusXMsgRspnSchemaIncludeHandler = new YCFBamXmlLoaderHPlusXMsgRspnSchemaIncludeHandler( this );
		}
		return( hplusXMsgRspnSchemaIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRspnSchemaWireParsersHandler getHPlusXMsgRspnSchemaWireParsersHandler() {
		if( hplusXMsgRspnSchemaWireParsersHandler == null ) {
			hplusXMsgRspnSchemaWireParsersHandler = new YCFBamXmlLoaderHPlusXMsgRspnSchemaWireParsersHandler( this );
		}
		return( hplusXMsgRspnSchemaWireParsersHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRspnSchemaXsdElementListHandler getHPlusXMsgRspnSchemaXsdElementListHandler() {
		if( hplusXMsgRspnSchemaXsdElementListHandler == null ) {
			hplusXMsgRspnSchemaXsdElementListHandler = new YCFBamXmlLoaderHPlusXMsgRspnSchemaXsdElementListHandler( this );
		}
		return( hplusXMsgRspnSchemaXsdElementListHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRspnSchemaXsdSpecHandler getHPlusXMsgRspnSchemaXsdSpecHandler() {
		if( hplusXMsgRspnSchemaXsdSpecHandler == null ) {
			hplusXMsgRspnSchemaXsdSpecHandler = new YCFBamXmlLoaderHPlusXMsgRspnSchemaXsdSpecHandler( this );
		}
		return( hplusXMsgRspnSchemaXsdSpecHandler );
	}

	protected YCFBamXmlLoaderHPlusObjMembersHandler getHPlusObjMembersHandler() {
		if( hplusObjMembersHandler == null ) {
			hplusObjMembersHandler = new YCFBamXmlLoaderHPlusObjMembersHandler( this );
		}
		return( hplusObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusObjInterfaceHandler getHPlusObjInterfaceHandler() {
		if( hplusObjInterfaceHandler == null ) {
			hplusObjInterfaceHandler = new YCFBamXmlLoaderHPlusObjInterfaceHandler( this );
		}
		return( hplusObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderHPlusObjImplementationHandler getHPlusObjImplementationHandler() {
		if( hplusObjImplementationHandler == null ) {
			hplusObjImplementationHandler = new YCFBamXmlLoaderHPlusObjImplementationHandler( this );
		}
		return( hplusObjImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusEditObjMembersHandler getHPlusEditObjMembersHandler() {
		if( hplusEditObjMembersHandler == null ) {
			hplusEditObjMembersHandler = new YCFBamXmlLoaderHPlusEditObjMembersHandler( this );
		}
		return( hplusEditObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusEditObjInterfaceHandler getHPlusEditObjInterfaceHandler() {
		if( hplusEditObjInterfaceHandler == null ) {
			hplusEditObjInterfaceHandler = new YCFBamXmlLoaderHPlusEditObjInterfaceHandler( this );
		}
		return( hplusEditObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderHPlusEditObjImplementationHandler getHPlusEditObjImplementationHandler() {
		if( hplusEditObjImplementationHandler == null ) {
			hplusEditObjImplementationHandler = new YCFBamXmlLoaderHPlusEditObjImplementationHandler( this );
		}
		return( hplusEditObjImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusDb2LUWTableIncludeHandler getHPlusDb2LUWTableIncludeHandler() {
		if( hplusDb2LUWTableIncludeHandler == null ) {
			hplusDb2LUWTableIncludeHandler = new YCFBamXmlLoaderHPlusDb2LUWTableIncludeHandler( this );
		}
		return( hplusDb2LUWTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusMSSqlTableIncludeHandler getHPlusMSSqlTableIncludeHandler() {
		if( hplusMSSqlTableIncludeHandler == null ) {
			hplusMSSqlTableIncludeHandler = new YCFBamXmlLoaderHPlusMSSqlTableIncludeHandler( this );
		}
		return( hplusMSSqlTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusMySqlTableIncludeHandler getHPlusMySqlTableIncludeHandler() {
		if( hplusMySqlTableIncludeHandler == null ) {
			hplusMySqlTableIncludeHandler = new YCFBamXmlLoaderHPlusMySqlTableIncludeHandler( this );
		}
		return( hplusMySqlTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusOracleTableIncludeHandler getHPlusOracleTableIncludeHandler() {
		if( hplusOracleTableIncludeHandler == null ) {
			hplusOracleTableIncludeHandler = new YCFBamXmlLoaderHPlusOracleTableIncludeHandler( this );
		}
		return( hplusOracleTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusPgSqlTableIncludeHandler getHPlusPgSqlTableIncludeHandler() {
		if( hplusPgSqlTableIncludeHandler == null ) {
			hplusPgSqlTableIncludeHandler = new YCFBamXmlLoaderHPlusPgSqlTableIncludeHandler( this );
		}
		return( hplusPgSqlTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusRamTableIncludeHandler getHPlusRamTableIncludeHandler() {
		if( hplusRamTableIncludeHandler == null ) {
			hplusRamTableIncludeHandler = new YCFBamXmlLoaderHPlusRamTableIncludeHandler( this );
		}
		return( hplusRamTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusObjIncludeHandler getHPlusObjIncludeHandler() {
		if( hplusObjIncludeHandler == null ) {
			hplusObjIncludeHandler = new YCFBamXmlLoaderHPlusObjIncludeHandler( this );
		}
		return( hplusObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusEditObjIncludeHandler getHPlusEditObjIncludeHandler() {
		if( hplusEditObjIncludeHandler == null ) {
			hplusEditObjIncludeHandler = new YCFBamXmlLoaderHPlusEditObjIncludeHandler( this );
		}
		return( hplusEditObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusSaxLoaderIncludeHandler getHPlusSaxLoaderIncludeHandler() {
		if( hplusSaxLoaderIncludeHandler == null ) {
			hplusSaxLoaderIncludeHandler = new YCFBamXmlLoaderHPlusSaxLoaderIncludeHandler( this );
		}
		return( hplusSaxLoaderIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusTableIncludeHandler getHPlusTableIncludeHandler() {
		if( hplusTableIncludeHandler == null ) {
			hplusTableIncludeHandler = new YCFBamXmlLoaderHPlusTableIncludeHandler( this );
		}
		return( hplusTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusTableObjIncludeHandler getHPlusTableObjIncludeHandler() {
		if( hplusTableObjIncludeHandler == null ) {
			hplusTableObjIncludeHandler = new YCFBamXmlLoaderHPlusTableObjIncludeHandler( this );
		}
		return( hplusTableObjIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusTableMembersHandler getHPlusTableMembersHandler() {
		if( hplusTableMembersHandler == null ) {
			hplusTableMembersHandler = new YCFBamXmlLoaderHPlusTableMembersHandler( this );
		}
		return( hplusTableMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusTableInterfaceHandler getHPlusTableInterfaceHandler() {
		if( hplusTableInterfaceHandler == null ) {
			hplusTableInterfaceHandler = new YCFBamXmlLoaderHPlusTableInterfaceHandler( this );
		}
		return( hplusTableInterfaceHandler );
	}

	protected YCFBamXmlLoaderHPlusTableImplementationHandler getHPlusTableImplementationHandler() {
		if( hplusTableImplementationHandler == null ) {
			hplusTableImplementationHandler = new YCFBamXmlLoaderHPlusTableImplementationHandler( this );
		}
		return( hplusTableImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusTableObjMembersHandler getHPlusTableObjMembersHandler() {
		if( hplusTableObjMembersHandler == null ) {
			hplusTableObjMembersHandler = new YCFBamXmlLoaderHPlusTableObjMembersHandler( this );
		}
		return( hplusTableObjMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusTableObjInterfaceHandler getHPlusTableObjInterfaceHandler() {
		if( hplusTableObjInterfaceHandler == null ) {
			hplusTableObjInterfaceHandler = new YCFBamXmlLoaderHPlusTableObjInterfaceHandler( this );
		}
		return( hplusTableObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderHPlusTableObjImplementationHandler getHPlusTableObjImplementationHandler() {
		if( hplusTableObjImplementationHandler == null ) {
			hplusTableObjImplementationHandler = new YCFBamXmlLoaderHPlusTableObjImplementationHandler( this );
		}
		return( hplusTableObjImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusDb2LUWTableMembersHandler getHPlusDb2LUWTableMembersHandler() {
		if( hplusDb2LUWTableMembersHandler == null ) {
			hplusDb2LUWTableMembersHandler = new YCFBamXmlLoaderHPlusDb2LUWTableMembersHandler( this );
		}
		return( hplusDb2LUWTableMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusDb2LUWTableImplementationHandler getHPlusDb2LUWTableImplementationHandler() {
		if( hplusDb2LUWTableImplementationHandler == null ) {
			hplusDb2LUWTableImplementationHandler = new YCFBamXmlLoaderHPlusDb2LUWTableImplementationHandler( this );
		}
		return( hplusDb2LUWTableImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusMSSqlTableMembersHandler getHPlusMSSqlTableMembersHandler() {
		if( hplusMSSqlTableMembersHandler == null ) {
			hplusMSSqlTableMembersHandler = new YCFBamXmlLoaderHPlusMSSqlTableMembersHandler( this );
		}
		return( hplusMSSqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusMSSqlTableImplementationHandler getHPlusMSSqlTableImplementationHandler() {
		if( hplusMSSqlTableImplementationHandler == null ) {
			hplusMSSqlTableImplementationHandler = new YCFBamXmlLoaderHPlusMSSqlTableImplementationHandler( this );
		}
		return( hplusMSSqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusMySqlTableMembersHandler getHPlusMySqlTableMembersHandler() {
		if( hplusMySqlTableMembersHandler == null ) {
			hplusMySqlTableMembersHandler = new YCFBamXmlLoaderHPlusMySqlTableMembersHandler( this );
		}
		return( hplusMySqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusMySqlTableImplementationHandler getHPlusMySqlTableImplementationHandler() {
		if( hplusMySqlTableImplementationHandler == null ) {
			hplusMySqlTableImplementationHandler = new YCFBamXmlLoaderHPlusMySqlTableImplementationHandler( this );
		}
		return( hplusMySqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusOracleTableMembersHandler getHPlusOracleTableMembersHandler() {
		if( hplusOracleTableMembersHandler == null ) {
			hplusOracleTableMembersHandler = new YCFBamXmlLoaderHPlusOracleTableMembersHandler( this );
		}
		return( hplusOracleTableMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusOracleTableImplementationHandler getHPlusOracleTableImplementationHandler() {
		if( hplusOracleTableImplementationHandler == null ) {
			hplusOracleTableImplementationHandler = new YCFBamXmlLoaderHPlusOracleTableImplementationHandler( this );
		}
		return( hplusOracleTableImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusPgSqlTableMembersHandler getHPlusPgSqlTableMembersHandler() {
		if( hplusPgSqlTableMembersHandler == null ) {
			hplusPgSqlTableMembersHandler = new YCFBamXmlLoaderHPlusPgSqlTableMembersHandler( this );
		}
		return( hplusPgSqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusPgSqlTableImplementationHandler getHPlusPgSqlTableImplementationHandler() {
		if( hplusPgSqlTableImplementationHandler == null ) {
			hplusPgSqlTableImplementationHandler = new YCFBamXmlLoaderHPlusPgSqlTableImplementationHandler( this );
		}
		return( hplusPgSqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusRamTableMembersHandler getHPlusRamTableMembersHandler() {
		if( hplusRamTableMembersHandler == null ) {
			hplusRamTableMembersHandler = new YCFBamXmlLoaderHPlusRamTableMembersHandler( this );
		}
		return( hplusRamTableMembersHandler );
	}

	protected YCFBamXmlLoaderHPlusRamTableImplementationHandler getHPlusRamTableImplementationHandler() {
		if( hplusRamTableImplementationHandler == null ) {
			hplusRamTableImplementationHandler = new YCFBamXmlLoaderHPlusRamTableImplementationHandler( this );
		}
		return( hplusRamTableImplementationHandler );
	}

	protected YCFBamXmlLoaderHPlusSaxLoaderStartElementHandler getHPlusSaxLoaderStartElementHandler() {
		if( hplusSaxLoaderStartElementHandler == null ) {
			hplusSaxLoaderStartElementHandler = new YCFBamXmlLoaderHPlusSaxLoaderStartElementHandler( this );
		}
		return( hplusSaxLoaderStartElementHandler );
	}

	protected YCFBamXmlLoaderHPlusSaxLoaderEndElementHandler getHPlusSaxLoaderEndElementHandler() {
		if( hplusSaxLoaderEndElementHandler == null ) {
			hplusSaxLoaderEndElementHandler = new YCFBamXmlLoaderHPlusSaxLoaderEndElementHandler( this );
		}
		return( hplusSaxLoaderEndElementHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgTableIncludeHandler getHPlusXMsgTableIncludeHandler() {
		if( hplusXMsgTableIncludeHandler == null ) {
			hplusXMsgTableIncludeHandler = new YCFBamXmlLoaderHPlusXMsgTableIncludeHandler( this );
		}
		return( hplusXMsgTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgTableFormattersHandler getHPlusXMsgTableFormattersHandler() {
		if( hplusXMsgTableFormattersHandler == null ) {
			hplusXMsgTableFormattersHandler = new YCFBamXmlLoaderHPlusXMsgTableFormattersHandler( this );
		}
		return( hplusXMsgTableFormattersHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRqstTableIncludeHandler getHPlusXMsgRqstTableIncludeHandler() {
		if( hplusXMsgRqstTableIncludeHandler == null ) {
			hplusXMsgRqstTableIncludeHandler = new YCFBamXmlLoaderHPlusXMsgRqstTableIncludeHandler( this );
		}
		return( hplusXMsgRqstTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRspnTableIncludeHandler getHPlusXMsgRspnTableIncludeHandler() {
		if( hplusXMsgRspnTableIncludeHandler == null ) {
			hplusXMsgRspnTableIncludeHandler = new YCFBamXmlLoaderHPlusXMsgRspnTableIncludeHandler( this );
		}
		return( hplusXMsgRspnTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgClientTableIncludeHandler getHPlusXMsgClientTableIncludeHandler() {
		if( hplusXMsgClientTableIncludeHandler == null ) {
			hplusXMsgClientTableIncludeHandler = new YCFBamXmlLoaderHPlusXMsgClientTableIncludeHandler( this );
		}
		return( hplusXMsgClientTableIncludeHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRqstTableBodyHandler getHPlusXMsgRqstTableBodyHandler() {
		if( hplusXMsgRqstTableBodyHandler == null ) {
			hplusXMsgRqstTableBodyHandler = new YCFBamXmlLoaderHPlusXMsgRqstTableBodyHandler( this );
		}
		return( hplusXMsgRqstTableBodyHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgRspnTableBodyHandler getHPlusXMsgRspnTableBodyHandler() {
		if( hplusXMsgRspnTableBodyHandler == null ) {
			hplusXMsgRspnTableBodyHandler = new YCFBamXmlLoaderHPlusXMsgRspnTableBodyHandler( this );
		}
		return( hplusXMsgRspnTableBodyHandler );
	}

	protected YCFBamXmlLoaderHPlusXMsgClientTableBodyHandler getHPlusXMsgClientTableBodyHandler() {
		if( hplusXMsgClientTableBodyHandler == null ) {
			hplusXMsgClientTableBodyHandler = new YCFBamXmlLoaderHPlusXMsgClientTableBodyHandler( this );
		}
		return( hplusXMsgClientTableBodyHandler );
	}

	protected YCFBamXmlLoaderCSharpMethodBodyHandler getCSharpMethodBodyHandler() {
		if( csharpMethodBodyHandler == null ) {
			csharpMethodBodyHandler = new YCFBamXmlLoaderCSharpMethodBodyHandler( this );
		}
		return( csharpMethodBodyHandler );
	}

	protected YCFBamXmlLoaderCSharpSchemaObjInterfaceHandler getCSharpSchemaObjInterfaceHandler() {
		if( csharpSchemaObjInterfaceHandler == null ) {
			csharpSchemaObjInterfaceHandler = new YCFBamXmlLoaderCSharpSchemaObjInterfaceHandler( this );
		}
		return( csharpSchemaObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCSharpSchemaObjMembersHandler getCSharpSchemaObjMembersHandler() {
		if( csharpSchemaObjMembersHandler == null ) {
			csharpSchemaObjMembersHandler = new YCFBamXmlLoaderCSharpSchemaObjMembersHandler( this );
		}
		return( csharpSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpSchemaObjUsingHandler getCSharpSchemaObjUsingHandler() {
		if( csharpSchemaObjUsingHandler == null ) {
			csharpSchemaObjUsingHandler = new YCFBamXmlLoaderCSharpSchemaObjUsingHandler( this );
		}
		return( csharpSchemaObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpSchemaObjImplementationHandler getCSharpSchemaObjImplementationHandler() {
		if( csharpSchemaObjImplementationHandler == null ) {
			csharpSchemaObjImplementationHandler = new YCFBamXmlLoaderCSharpSchemaObjImplementationHandler( this );
		}
		return( csharpSchemaObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpDb2LUWSchemaObjMembersHandler getCSharpDb2LUWSchemaObjMembersHandler() {
		if( csharpDb2LUWSchemaObjMembersHandler == null ) {
			csharpDb2LUWSchemaObjMembersHandler = new YCFBamXmlLoaderCSharpDb2LUWSchemaObjMembersHandler( this );
		}
		return( csharpDb2LUWSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpDb2LUWSchemaObjImplHandler getCSharpDb2LUWSchemaObjImplHandler() {
		if( csharpDb2LUWSchemaObjImplHandler == null ) {
			csharpDb2LUWSchemaObjImplHandler = new YCFBamXmlLoaderCSharpDb2LUWSchemaObjImplHandler( this );
		}
		return( csharpDb2LUWSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCSharpDb2LUWSchemaObjUsingHandler getCSharpDb2LUWSchemaObjUsingHandler() {
		if( csharpDb2LUWSchemaObjUsingHandler == null ) {
			csharpDb2LUWSchemaObjUsingHandler = new YCFBamXmlLoaderCSharpDb2LUWSchemaObjUsingHandler( this );
		}
		return( csharpDb2LUWSchemaObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpMSSqlSchemaObjMembersHandler getCSharpMSSqlSchemaObjMembersHandler() {
		if( csharpMSSqlSchemaObjMembersHandler == null ) {
			csharpMSSqlSchemaObjMembersHandler = new YCFBamXmlLoaderCSharpMSSqlSchemaObjMembersHandler( this );
		}
		return( csharpMSSqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpMSSqlSchemaObjImplHandler getCSharpMSSqlSchemaObjImplHandler() {
		if( csharpMSSqlSchemaObjImplHandler == null ) {
			csharpMSSqlSchemaObjImplHandler = new YCFBamXmlLoaderCSharpMSSqlSchemaObjImplHandler( this );
		}
		return( csharpMSSqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCSharpMSSqlSchemaObjUsingHandler getCSharpMSSqlSchemaObjUsingHandler() {
		if( csharpMSSqlSchemaObjUsingHandler == null ) {
			csharpMSSqlSchemaObjUsingHandler = new YCFBamXmlLoaderCSharpMSSqlSchemaObjUsingHandler( this );
		}
		return( csharpMSSqlSchemaObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpMySqlSchemaObjMembersHandler getCSharpMySqlSchemaObjMembersHandler() {
		if( csharpMySqlSchemaObjMembersHandler == null ) {
			csharpMySqlSchemaObjMembersHandler = new YCFBamXmlLoaderCSharpMySqlSchemaObjMembersHandler( this );
		}
		return( csharpMySqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpMySqlSchemaObjImplHandler getCSharpMySqlSchemaObjImplHandler() {
		if( csharpMySqlSchemaObjImplHandler == null ) {
			csharpMySqlSchemaObjImplHandler = new YCFBamXmlLoaderCSharpMySqlSchemaObjImplHandler( this );
		}
		return( csharpMySqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCSharpMySqlSchemaObjUsingHandler getCSharpMySqlSchemaObjUsingHandler() {
		if( csharpMySqlSchemaObjUsingHandler == null ) {
			csharpMySqlSchemaObjUsingHandler = new YCFBamXmlLoaderCSharpMySqlSchemaObjUsingHandler( this );
		}
		return( csharpMySqlSchemaObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpOracleSchemaObjMembersHandler getCSharpOracleSchemaObjMembersHandler() {
		if( csharpOracleSchemaObjMembersHandler == null ) {
			csharpOracleSchemaObjMembersHandler = new YCFBamXmlLoaderCSharpOracleSchemaObjMembersHandler( this );
		}
		return( csharpOracleSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpOracleSchemaObjImplHandler getCSharpOracleSchemaObjImplHandler() {
		if( csharpOracleSchemaObjImplHandler == null ) {
			csharpOracleSchemaObjImplHandler = new YCFBamXmlLoaderCSharpOracleSchemaObjImplHandler( this );
		}
		return( csharpOracleSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCSharpOracleSchemaObjUsingHandler getCSharpOracleSchemaObjUsingHandler() {
		if( csharpOracleSchemaObjUsingHandler == null ) {
			csharpOracleSchemaObjUsingHandler = new YCFBamXmlLoaderCSharpOracleSchemaObjUsingHandler( this );
		}
		return( csharpOracleSchemaObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpPgSqlSchemaObjMembersHandler getCSharpPgSqlSchemaObjMembersHandler() {
		if( csharpPgSqlSchemaObjMembersHandler == null ) {
			csharpPgSqlSchemaObjMembersHandler = new YCFBamXmlLoaderCSharpPgSqlSchemaObjMembersHandler( this );
		}
		return( csharpPgSqlSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpPgSqlSchemaObjImplHandler getCSharpPgSqlSchemaObjImplHandler() {
		if( csharpPgSqlSchemaObjImplHandler == null ) {
			csharpPgSqlSchemaObjImplHandler = new YCFBamXmlLoaderCSharpPgSqlSchemaObjImplHandler( this );
		}
		return( csharpPgSqlSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCSharpPgSqlSchemaObjUsingHandler getCSharpPgSqlSchemaObjUsingHandler() {
		if( csharpPgSqlSchemaObjUsingHandler == null ) {
			csharpPgSqlSchemaObjUsingHandler = new YCFBamXmlLoaderCSharpPgSqlSchemaObjUsingHandler( this );
		}
		return( csharpPgSqlSchemaObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpRamSchemaObjMembersHandler getCSharpRamSchemaObjMembersHandler() {
		if( csharpRamSchemaObjMembersHandler == null ) {
			csharpRamSchemaObjMembersHandler = new YCFBamXmlLoaderCSharpRamSchemaObjMembersHandler( this );
		}
		return( csharpRamSchemaObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpRamSchemaObjImplHandler getCSharpRamSchemaObjImplHandler() {
		if( csharpRamSchemaObjImplHandler == null ) {
			csharpRamSchemaObjImplHandler = new YCFBamXmlLoaderCSharpRamSchemaObjImplHandler( this );
		}
		return( csharpRamSchemaObjImplHandler );
	}

	protected YCFBamXmlLoaderCSharpRamSchemaObjUsingHandler getCSharpRamSchemaObjUsingHandler() {
		if( csharpRamSchemaObjUsingHandler == null ) {
			csharpRamSchemaObjUsingHandler = new YCFBamXmlLoaderCSharpRamSchemaObjUsingHandler( this );
		}
		return( csharpRamSchemaObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgSchemaUsingHandler getCSharpXMsgSchemaUsingHandler() {
		if( csharpXMsgSchemaUsingHandler == null ) {
			csharpXMsgSchemaUsingHandler = new YCFBamXmlLoaderCSharpXMsgSchemaUsingHandler( this );
		}
		return( csharpXMsgSchemaUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgSchemaFormattersHandler getCSharpXMsgSchemaFormattersHandler() {
		if( csharpXMsgSchemaFormattersHandler == null ) {
			csharpXMsgSchemaFormattersHandler = new YCFBamXmlLoaderCSharpXMsgSchemaFormattersHandler( this );
		}
		return( csharpXMsgSchemaFormattersHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgClientSchemaUsingHandler getCSharpXMsgClientSchemaUsingHandler() {
		if( csharpXMsgClientSchemaUsingHandler == null ) {
			csharpXMsgClientSchemaUsingHandler = new YCFBamXmlLoaderCSharpXMsgClientSchemaUsingHandler( this );
		}
		return( csharpXMsgClientSchemaUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgClientSchemaBodyHandler getCSharpXMsgClientSchemaBodyHandler() {
		if( csharpXMsgClientSchemaBodyHandler == null ) {
			csharpXMsgClientSchemaBodyHandler = new YCFBamXmlLoaderCSharpXMsgClientSchemaBodyHandler( this );
		}
		return( csharpXMsgClientSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRqstSchemaBodyHandler getCSharpXMsgRqstSchemaBodyHandler() {
		if( csharpXMsgRqstSchemaBodyHandler == null ) {
			csharpXMsgRqstSchemaBodyHandler = new YCFBamXmlLoaderCSharpXMsgRqstSchemaBodyHandler( this );
		}
		return( csharpXMsgRqstSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRqstSchemaUsingHandler getCSharpXMsgRqstSchemaUsingHandler() {
		if( csharpXMsgRqstSchemaUsingHandler == null ) {
			csharpXMsgRqstSchemaUsingHandler = new YCFBamXmlLoaderCSharpXMsgRqstSchemaUsingHandler( this );
		}
		return( csharpXMsgRqstSchemaUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRqstSchemaWireParsersHandler getCSharpXMsgRqstSchemaWireParsersHandler() {
		if( csharpXMsgRqstSchemaWireParsersHandler == null ) {
			csharpXMsgRqstSchemaWireParsersHandler = new YCFBamXmlLoaderCSharpXMsgRqstSchemaWireParsersHandler( this );
		}
		return( csharpXMsgRqstSchemaWireParsersHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRqstSchemaXsdElementListHandler getCSharpXMsgRqstSchemaXsdElementListHandler() {
		if( csharpXMsgRqstSchemaXsdElementListHandler == null ) {
			csharpXMsgRqstSchemaXsdElementListHandler = new YCFBamXmlLoaderCSharpXMsgRqstSchemaXsdElementListHandler( this );
		}
		return( csharpXMsgRqstSchemaXsdElementListHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRqstSchemaXsdSpecHandler getCSharpXMsgRqstSchemaXsdSpecHandler() {
		if( csharpXMsgRqstSchemaXsdSpecHandler == null ) {
			csharpXMsgRqstSchemaXsdSpecHandler = new YCFBamXmlLoaderCSharpXMsgRqstSchemaXsdSpecHandler( this );
		}
		return( csharpXMsgRqstSchemaXsdSpecHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRspnSchemaBodyHandler getCSharpXMsgRspnSchemaBodyHandler() {
		if( csharpXMsgRspnSchemaBodyHandler == null ) {
			csharpXMsgRspnSchemaBodyHandler = new YCFBamXmlLoaderCSharpXMsgRspnSchemaBodyHandler( this );
		}
		return( csharpXMsgRspnSchemaBodyHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRspnSchemaUsingHandler getCSharpXMsgRspnSchemaUsingHandler() {
		if( csharpXMsgRspnSchemaUsingHandler == null ) {
			csharpXMsgRspnSchemaUsingHandler = new YCFBamXmlLoaderCSharpXMsgRspnSchemaUsingHandler( this );
		}
		return( csharpXMsgRspnSchemaUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRspnSchemaWireParsersHandler getCSharpXMsgRspnSchemaWireParsersHandler() {
		if( csharpXMsgRspnSchemaWireParsersHandler == null ) {
			csharpXMsgRspnSchemaWireParsersHandler = new YCFBamXmlLoaderCSharpXMsgRspnSchemaWireParsersHandler( this );
		}
		return( csharpXMsgRspnSchemaWireParsersHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRspnSchemaXsdElementListHandler getCSharpXMsgRspnSchemaXsdElementListHandler() {
		if( csharpXMsgRspnSchemaXsdElementListHandler == null ) {
			csharpXMsgRspnSchemaXsdElementListHandler = new YCFBamXmlLoaderCSharpXMsgRspnSchemaXsdElementListHandler( this );
		}
		return( csharpXMsgRspnSchemaXsdElementListHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRspnSchemaXsdSpecHandler getCSharpXMsgRspnSchemaXsdSpecHandler() {
		if( csharpXMsgRspnSchemaXsdSpecHandler == null ) {
			csharpXMsgRspnSchemaXsdSpecHandler = new YCFBamXmlLoaderCSharpXMsgRspnSchemaXsdSpecHandler( this );
		}
		return( csharpXMsgRspnSchemaXsdSpecHandler );
	}

	protected YCFBamXmlLoaderCSharpObjMembersHandler getCSharpObjMembersHandler() {
		if( csharpObjMembersHandler == null ) {
			csharpObjMembersHandler = new YCFBamXmlLoaderCSharpObjMembersHandler( this );
		}
		return( csharpObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpObjInterfaceHandler getCSharpObjInterfaceHandler() {
		if( csharpObjInterfaceHandler == null ) {
			csharpObjInterfaceHandler = new YCFBamXmlLoaderCSharpObjInterfaceHandler( this );
		}
		return( csharpObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCSharpObjImplementationHandler getCSharpObjImplementationHandler() {
		if( csharpObjImplementationHandler == null ) {
			csharpObjImplementationHandler = new YCFBamXmlLoaderCSharpObjImplementationHandler( this );
		}
		return( csharpObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpEditObjMembersHandler getCSharpEditObjMembersHandler() {
		if( csharpEditObjMembersHandler == null ) {
			csharpEditObjMembersHandler = new YCFBamXmlLoaderCSharpEditObjMembersHandler( this );
		}
		return( csharpEditObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpEditObjInterfaceHandler getCSharpEditObjInterfaceHandler() {
		if( csharpEditObjInterfaceHandler == null ) {
			csharpEditObjInterfaceHandler = new YCFBamXmlLoaderCSharpEditObjInterfaceHandler( this );
		}
		return( csharpEditObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCSharpEditObjImplementationHandler getCSharpEditObjImplementationHandler() {
		if( csharpEditObjImplementationHandler == null ) {
			csharpEditObjImplementationHandler = new YCFBamXmlLoaderCSharpEditObjImplementationHandler( this );
		}
		return( csharpEditObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpDb2LUWTableUsingHandler getCSharpDb2LUWTableUsingHandler() {
		if( csharpDb2LUWTableUsingHandler == null ) {
			csharpDb2LUWTableUsingHandler = new YCFBamXmlLoaderCSharpDb2LUWTableUsingHandler( this );
		}
		return( csharpDb2LUWTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpMSSqlTableUsingHandler getCSharpMSSqlTableUsingHandler() {
		if( csharpMSSqlTableUsingHandler == null ) {
			csharpMSSqlTableUsingHandler = new YCFBamXmlLoaderCSharpMSSqlTableUsingHandler( this );
		}
		return( csharpMSSqlTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpMySqlTableUsingHandler getCSharpMySqlTableUsingHandler() {
		if( csharpMySqlTableUsingHandler == null ) {
			csharpMySqlTableUsingHandler = new YCFBamXmlLoaderCSharpMySqlTableUsingHandler( this );
		}
		return( csharpMySqlTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpOracleTableUsingHandler getCSharpOracleTableUsingHandler() {
		if( csharpOracleTableUsingHandler == null ) {
			csharpOracleTableUsingHandler = new YCFBamXmlLoaderCSharpOracleTableUsingHandler( this );
		}
		return( csharpOracleTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpPgSqlTableUsingHandler getCSharpPgSqlTableUsingHandler() {
		if( csharpPgSqlTableUsingHandler == null ) {
			csharpPgSqlTableUsingHandler = new YCFBamXmlLoaderCSharpPgSqlTableUsingHandler( this );
		}
		return( csharpPgSqlTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpRamTableUsingHandler getCSharpRamTableUsingHandler() {
		if( csharpRamTableUsingHandler == null ) {
			csharpRamTableUsingHandler = new YCFBamXmlLoaderCSharpRamTableUsingHandler( this );
		}
		return( csharpRamTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpObjUsingHandler getCSharpObjUsingHandler() {
		if( csharpObjUsingHandler == null ) {
			csharpObjUsingHandler = new YCFBamXmlLoaderCSharpObjUsingHandler( this );
		}
		return( csharpObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpEditObjUsingHandler getCSharpEditObjUsingHandler() {
		if( csharpEditObjUsingHandler == null ) {
			csharpEditObjUsingHandler = new YCFBamXmlLoaderCSharpEditObjUsingHandler( this );
		}
		return( csharpEditObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpSaxLoaderUsingHandler getCSharpSaxLoaderUsingHandler() {
		if( csharpSaxLoaderUsingHandler == null ) {
			csharpSaxLoaderUsingHandler = new YCFBamXmlLoaderCSharpSaxLoaderUsingHandler( this );
		}
		return( csharpSaxLoaderUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpTableUsingHandler getCSharpTableUsingHandler() {
		if( csharpTableUsingHandler == null ) {
			csharpTableUsingHandler = new YCFBamXmlLoaderCSharpTableUsingHandler( this );
		}
		return( csharpTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpTableObjUsingHandler getCSharpTableObjUsingHandler() {
		if( csharpTableObjUsingHandler == null ) {
			csharpTableObjUsingHandler = new YCFBamXmlLoaderCSharpTableObjUsingHandler( this );
		}
		return( csharpTableObjUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpTableMembersHandler getCSharpTableMembersHandler() {
		if( csharpTableMembersHandler == null ) {
			csharpTableMembersHandler = new YCFBamXmlLoaderCSharpTableMembersHandler( this );
		}
		return( csharpTableMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpTableInterfaceHandler getCSharpTableInterfaceHandler() {
		if( csharpTableInterfaceHandler == null ) {
			csharpTableInterfaceHandler = new YCFBamXmlLoaderCSharpTableInterfaceHandler( this );
		}
		return( csharpTableInterfaceHandler );
	}

	protected YCFBamXmlLoaderCSharpTableImplementationHandler getCSharpTableImplementationHandler() {
		if( csharpTableImplementationHandler == null ) {
			csharpTableImplementationHandler = new YCFBamXmlLoaderCSharpTableImplementationHandler( this );
		}
		return( csharpTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpTableObjMembersHandler getCSharpTableObjMembersHandler() {
		if( csharpTableObjMembersHandler == null ) {
			csharpTableObjMembersHandler = new YCFBamXmlLoaderCSharpTableObjMembersHandler( this );
		}
		return( csharpTableObjMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpTableObjInterfaceHandler getCSharpTableObjInterfaceHandler() {
		if( csharpTableObjInterfaceHandler == null ) {
			csharpTableObjInterfaceHandler = new YCFBamXmlLoaderCSharpTableObjInterfaceHandler( this );
		}
		return( csharpTableObjInterfaceHandler );
	}

	protected YCFBamXmlLoaderCSharpTableObjImplementationHandler getCSharpTableObjImplementationHandler() {
		if( csharpTableObjImplementationHandler == null ) {
			csharpTableObjImplementationHandler = new YCFBamXmlLoaderCSharpTableObjImplementationHandler( this );
		}
		return( csharpTableObjImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpDb2LUWTableMembersHandler getCSharpDb2LUWTableMembersHandler() {
		if( csharpDb2LUWTableMembersHandler == null ) {
			csharpDb2LUWTableMembersHandler = new YCFBamXmlLoaderCSharpDb2LUWTableMembersHandler( this );
		}
		return( csharpDb2LUWTableMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpDb2LUWTableImplementationHandler getCSharpDb2LUWTableImplementationHandler() {
		if( csharpDb2LUWTableImplementationHandler == null ) {
			csharpDb2LUWTableImplementationHandler = new YCFBamXmlLoaderCSharpDb2LUWTableImplementationHandler( this );
		}
		return( csharpDb2LUWTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpMSSqlTableMembersHandler getCSharpMSSqlTableMembersHandler() {
		if( csharpMSSqlTableMembersHandler == null ) {
			csharpMSSqlTableMembersHandler = new YCFBamXmlLoaderCSharpMSSqlTableMembersHandler( this );
		}
		return( csharpMSSqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpMSSqlTableImplementationHandler getCSharpMSSqlTableImplementationHandler() {
		if( csharpMSSqlTableImplementationHandler == null ) {
			csharpMSSqlTableImplementationHandler = new YCFBamXmlLoaderCSharpMSSqlTableImplementationHandler( this );
		}
		return( csharpMSSqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpMySqlTableMembersHandler getCSharpMySqlTableMembersHandler() {
		if( csharpMySqlTableMembersHandler == null ) {
			csharpMySqlTableMembersHandler = new YCFBamXmlLoaderCSharpMySqlTableMembersHandler( this );
		}
		return( csharpMySqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpMySqlTableImplementationHandler getCSharpMySqlTableImplementationHandler() {
		if( csharpMySqlTableImplementationHandler == null ) {
			csharpMySqlTableImplementationHandler = new YCFBamXmlLoaderCSharpMySqlTableImplementationHandler( this );
		}
		return( csharpMySqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpOracleTableMembersHandler getCSharpOracleTableMembersHandler() {
		if( csharpOracleTableMembersHandler == null ) {
			csharpOracleTableMembersHandler = new YCFBamXmlLoaderCSharpOracleTableMembersHandler( this );
		}
		return( csharpOracleTableMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpOracleTableImplementationHandler getCSharpOracleTableImplementationHandler() {
		if( csharpOracleTableImplementationHandler == null ) {
			csharpOracleTableImplementationHandler = new YCFBamXmlLoaderCSharpOracleTableImplementationHandler( this );
		}
		return( csharpOracleTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpPgSqlTableMembersHandler getCSharpPgSqlTableMembersHandler() {
		if( csharpPgSqlTableMembersHandler == null ) {
			csharpPgSqlTableMembersHandler = new YCFBamXmlLoaderCSharpPgSqlTableMembersHandler( this );
		}
		return( csharpPgSqlTableMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpPgSqlTableImplementationHandler getCSharpPgSqlTableImplementationHandler() {
		if( csharpPgSqlTableImplementationHandler == null ) {
			csharpPgSqlTableImplementationHandler = new YCFBamXmlLoaderCSharpPgSqlTableImplementationHandler( this );
		}
		return( csharpPgSqlTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpRamTableMembersHandler getCSharpRamTableMembersHandler() {
		if( csharpRamTableMembersHandler == null ) {
			csharpRamTableMembersHandler = new YCFBamXmlLoaderCSharpRamTableMembersHandler( this );
		}
		return( csharpRamTableMembersHandler );
	}

	protected YCFBamXmlLoaderCSharpRamTableImplementationHandler getCSharpRamTableImplementationHandler() {
		if( csharpRamTableImplementationHandler == null ) {
			csharpRamTableImplementationHandler = new YCFBamXmlLoaderCSharpRamTableImplementationHandler( this );
		}
		return( csharpRamTableImplementationHandler );
	}

	protected YCFBamXmlLoaderCSharpSaxLoaderStartElementHandler getCSharpSaxLoaderStartElementHandler() {
		if( csharpSaxLoaderStartElementHandler == null ) {
			csharpSaxLoaderStartElementHandler = new YCFBamXmlLoaderCSharpSaxLoaderStartElementHandler( this );
		}
		return( csharpSaxLoaderStartElementHandler );
	}

	protected YCFBamXmlLoaderCSharpSaxLoaderEndElementHandler getCSharpSaxLoaderEndElementHandler() {
		if( csharpSaxLoaderEndElementHandler == null ) {
			csharpSaxLoaderEndElementHandler = new YCFBamXmlLoaderCSharpSaxLoaderEndElementHandler( this );
		}
		return( csharpSaxLoaderEndElementHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgTableUsingHandler getCSharpXMsgTableUsingHandler() {
		if( csharpXMsgTableUsingHandler == null ) {
			csharpXMsgTableUsingHandler = new YCFBamXmlLoaderCSharpXMsgTableUsingHandler( this );
		}
		return( csharpXMsgTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgTableFormattersHandler getCSharpXMsgTableFormattersHandler() {
		if( csharpXMsgTableFormattersHandler == null ) {
			csharpXMsgTableFormattersHandler = new YCFBamXmlLoaderCSharpXMsgTableFormattersHandler( this );
		}
		return( csharpXMsgTableFormattersHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRqstTableUsingHandler getCSharpXMsgRqstTableUsingHandler() {
		if( csharpXMsgRqstTableUsingHandler == null ) {
			csharpXMsgRqstTableUsingHandler = new YCFBamXmlLoaderCSharpXMsgRqstTableUsingHandler( this );
		}
		return( csharpXMsgRqstTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRspnTableUsingHandler getCSharpXMsgRspnTableUsingHandler() {
		if( csharpXMsgRspnTableUsingHandler == null ) {
			csharpXMsgRspnTableUsingHandler = new YCFBamXmlLoaderCSharpXMsgRspnTableUsingHandler( this );
		}
		return( csharpXMsgRspnTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgClientTableUsingHandler getCSharpXMsgClientTableUsingHandler() {
		if( csharpXMsgClientTableUsingHandler == null ) {
			csharpXMsgClientTableUsingHandler = new YCFBamXmlLoaderCSharpXMsgClientTableUsingHandler( this );
		}
		return( csharpXMsgClientTableUsingHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRqstTableBodyHandler getCSharpXMsgRqstTableBodyHandler() {
		if( csharpXMsgRqstTableBodyHandler == null ) {
			csharpXMsgRqstTableBodyHandler = new YCFBamXmlLoaderCSharpXMsgRqstTableBodyHandler( this );
		}
		return( csharpXMsgRqstTableBodyHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgRspnTableBodyHandler getCSharpXMsgRspnTableBodyHandler() {
		if( csharpXMsgRspnTableBodyHandler == null ) {
			csharpXMsgRspnTableBodyHandler = new YCFBamXmlLoaderCSharpXMsgRspnTableBodyHandler( this );
		}
		return( csharpXMsgRspnTableBodyHandler );
	}

	protected YCFBamXmlLoaderCSharpXMsgClientTableBodyHandler getCSharpXMsgClientTableBodyHandler() {
		if( csharpXMsgClientTableBodyHandler == null ) {
			csharpXMsgClientTableBodyHandler = new YCFBamXmlLoaderCSharpXMsgClientTableBodyHandler( this );
		}
		return( csharpXMsgClientTableBodyHandler );
	}

	protected YCFBamXmlLoaderLicenseHandler getLicenseHandler() {
		if( licenseHandler == null ) {
			licenseHandler = new YCFBamXmlLoaderLicenseHandler( this );
		}
		return( licenseHandler );
	}

	protected YCFBamXmlLoaderMajorVersionHandler getMajorVersionHandler() {
		if( majorVersionHandler == null ) {
			majorVersionHandler = new YCFBamXmlLoaderMajorVersionHandler( this );
			majorVersionHandler.addElementHandler( "MinorVersion", getMinorVersionHandler() );
		}
		return( majorVersionHandler );
	}

	protected YCFBamXmlLoaderMinorVersionHandler getMinorVersionHandler() {
		if( minorVersionHandler == null ) {
			minorVersionHandler = new YCFBamXmlLoaderMinorVersionHandler( this );
			minorVersionHandler.addElementHandler( "SchemaDef", getSchemaDefHandler() );
		}
		return( minorVersionHandler );
	}

	protected YCFBamXmlLoaderNmTokenColHandler getNmTokenColHandler() {
		if( nmTokenColHandler == null ) {
			nmTokenColHandler = new YCFBamXmlLoaderNmTokenColHandler( this );
		}
		return( nmTokenColHandler );
	}

	protected YCFBamXmlLoaderNmTokenTypeHandler getNmTokenTypeHandler() {
		if( nmTokenTypeHandler == null ) {
			nmTokenTypeHandler = new YCFBamXmlLoaderNmTokenTypeHandler( this );
		}
		return( nmTokenTypeHandler );
	}

	protected YCFBamXmlLoaderNmTokensColHandler getNmTokensColHandler() {
		if( nmTokensColHandler == null ) {
			nmTokensColHandler = new YCFBamXmlLoaderNmTokensColHandler( this );
		}
		return( nmTokensColHandler );
	}

	protected YCFBamXmlLoaderNmTokensTypeHandler getNmTokensTypeHandler() {
		if( nmTokensTypeHandler == null ) {
			nmTokensTypeHandler = new YCFBamXmlLoaderNmTokensTypeHandler( this );
		}
		return( nmTokensTypeHandler );
	}

	protected YCFBamXmlLoaderNumberColHandler getNumberColHandler() {
		if( numberColHandler == null ) {
			numberColHandler = new YCFBamXmlLoaderNumberColHandler( this );
		}
		return( numberColHandler );
	}

	protected YCFBamXmlLoaderNumberTypeHandler getNumberTypeHandler() {
		if( numberTypeHandler == null ) {
			numberTypeHandler = new YCFBamXmlLoaderNumberTypeHandler( this );
		}
		return( numberTypeHandler );
	}

	protected YCFBamXmlLoaderParamHandler getParamHandler() {
		if( paramHandler == null ) {
			paramHandler = new YCFBamXmlLoaderParamHandler( this );
		}
		return( paramHandler );
	}

	protected YCFBamXmlLoaderPrimaryIndexHandler getPrimaryIndexHandler() {
		if( primaryIndexHandler == null ) {
			primaryIndexHandler = new YCFBamXmlLoaderPrimaryIndexHandler( this );
			primaryIndexHandler.addElementHandler( "IndexCol", getIndexColHandler() );
		}
		return( primaryIndexHandler );
	}

	protected YCFBamXmlLoaderRelationHandler getRelationHandler() {
		if( relationHandler == null ) {
			relationHandler = new YCFBamXmlLoaderRelationHandler( this );
			relationHandler.addElementHandler( "RelationCol", getRelationColHandler() );
		}
		return( relationHandler );
	}

	protected YCFBamXmlLoaderRelationColHandler getRelationColHandler() {
		if( relationColHandler == null ) {
			relationColHandler = new YCFBamXmlLoaderRelationColHandler( this );
		}
		return( relationColHandler );
	}

	protected YCFBamXmlLoaderSchemaDefHandler getSchemaDefHandler() {
		if( schemaDefHandler == null ) {
			schemaDefHandler = new YCFBamXmlLoaderSchemaDefHandler( this );
			schemaDefHandler.addElementHandler( "CommonLicense", getCommonLicenseHandler() );
			schemaDefHandler.addElementHandler( "ClientImplLicense", getClientImplLicenseHandler() );
			schemaDefHandler.addElementHandler( "ClientXFaceLicense", getClientXFaceLicenseHandler() );
			schemaDefHandler.addElementHandler( "ServerImplLicense", getServerImplLicenseHandler() );
			schemaDefHandler.addElementHandler( "ServerXFaceLicense", getServerXFaceLicenseHandler() );
			schemaDefHandler.addElementHandler( "SchemaRef", getSchemaRefHandler() );
			schemaDefHandler.addElementHandler( "SchemaRole", getSchemaRoleHandler() );
			schemaDefHandler.addElementHandler( "SchemaTweak", getSchemaTweakHandler() );
			schemaDefHandler.addElementHandler( "Table", getTableHandler() );
			schemaDefHandler.addElementHandler( "TableAddendum", getTableAddendumHandler() );
			schemaDefHandler.addElementHandler( "IndexAddendum", getIndexAddendumHandler() );
			schemaDefHandler.addElementHandler( "BlobType", getBlobTypeHandler() );
			schemaDefHandler.addElementHandler( "BoolType", getBoolTypeHandler() );
			schemaDefHandler.addElementHandler( "Int16Type", getInt16TypeHandler() );
			schemaDefHandler.addElementHandler( "Id16Gen", getId16GenHandler() );
			schemaDefHandler.addElementHandler( "EnumType", getEnumTypeHandler() );
			schemaDefHandler.addElementHandler( "Int32Type", getInt32TypeHandler() );
			schemaDefHandler.addElementHandler( "Id32Gen", getId32GenHandler() );
			schemaDefHandler.addElementHandler( "Int64Type", getInt64TypeHandler() );
			schemaDefHandler.addElementHandler( "Id64Gen", getId64GenHandler() );
			schemaDefHandler.addElementHandler( "UInt16Type", getUInt16TypeHandler() );
			schemaDefHandler.addElementHandler( "UInt32Type", getUInt32TypeHandler() );
			schemaDefHandler.addElementHandler( "UInt64Type", getUInt64TypeHandler() );
			schemaDefHandler.addElementHandler( "FloatType", getFloatTypeHandler() );
			schemaDefHandler.addElementHandler( "DoubleType", getDoubleTypeHandler() );
			schemaDefHandler.addElementHandler( "NumberType", getNumberTypeHandler() );
			schemaDefHandler.addElementHandler( "StringType", getStringTypeHandler() );
			schemaDefHandler.addElementHandler( "TextType", getTextTypeHandler() );
			schemaDefHandler.addElementHandler( "NmTokenType", getNmTokenTypeHandler() );
			schemaDefHandler.addElementHandler( "NmTokensType", getNmTokensTypeHandler() );
			schemaDefHandler.addElementHandler( "TokenType", getTokenTypeHandler() );
			schemaDefHandler.addElementHandler( "DateType", getDateTypeHandler() );
			schemaDefHandler.addElementHandler( "TimeType", getTimeTypeHandler() );
			schemaDefHandler.addElementHandler( "TimestampType", getTimestampTypeHandler() );
			schemaDefHandler.addElementHandler( "TZDateType", getTZDateTypeHandler() );
			schemaDefHandler.addElementHandler( "TZTimeType", getTZTimeTypeHandler() );
			schemaDefHandler.addElementHandler( "TZTimestampType", getTZTimestampTypeHandler() );
			schemaDefHandler.addElementHandler( "UuidType", getUuidTypeHandler() );
			schemaDefHandler.addElementHandler( "UuidGen", getUuidGenHandler() );
			schemaDefHandler.addElementHandler( "Uuid6Type", getUuid6TypeHandler() );
			schemaDefHandler.addElementHandler( "Uuid6Gen", getUuid6GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash128Type", getDbKeyHash128TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash128Gen", getDbKeyHash128GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash160Type", getDbKeyHash160TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash160Gen", getDbKeyHash160GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash224Type", getDbKeyHash224TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash224Gen", getDbKeyHash224GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash256Type", getDbKeyHash256TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash256Gen", getDbKeyHash256GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash384Type", getDbKeyHash384TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash384Gen", getDbKeyHash384GenHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash512Type", getDbKeyHash512TypeHandler() );
			schemaDefHandler.addElementHandler( "DbKeyHash512Gen", getDbKeyHash512GenHandler() );
			schemaDefHandler.addElementHandler( "CafeSchemaObjInterface", getCafeSchemaObjInterfaceHandler() );
			schemaDefHandler.addElementHandler( "CafeSchemaObjMembers", getCafeSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeSchemaObjImport", getCafeSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeSchemaObjImplementation", getCafeSchemaObjImplementationHandler() );
			schemaDefHandler.addElementHandler( "CafeDb2LUWSchemaObjMembers", getCafeDb2LUWSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeDb2LUWSchemaObjImpl", getCafeDb2LUWSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeDb2LUWSchemaObjImport", getCafeDb2LUWSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeMSSqlSchemaObjMembers", getCafeMSSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeMSSqlSchemaObjImpl", getCafeMSSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeMSSqlSchemaObjImport", getCafeMSSqlSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeMySqlSchemaObjMembers", getCafeMySqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeMySqlSchemaObjImpl", getCafeMySqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeMySqlSchemaObjImport", getCafeMySqlSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeOracleSchemaObjMembers", getCafeOracleSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeOracleSchemaObjImpl", getCafeOracleSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeOracleSchemaObjImport", getCafeOracleSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafePgSqlSchemaObjMembers", getCafePgSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafePgSqlSchemaObjImpl", getCafePgSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafePgSqlSchemaObjImport", getCafePgSqlSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeRamSchemaObjMembers", getCafeRamSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CafeRamSchemaObjImpl", getCafeRamSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CafeRamSchemaObjImport", getCafeRamSchemaObjImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgSchemaImport", getCafeXMsgSchemaImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgSchemaFormatters", getCafeXMsgSchemaFormattersHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgClientSchemaImport", getCafeXMsgClientSchemaImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgClientSchemaBody", getCafeXMsgClientSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRqstSchemaBody", getCafeXMsgRqstSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRqstSchemaImport", getCafeXMsgRqstSchemaImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRqstSchemaWireParsers", getCafeXMsgRqstSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRqstSchemaXsdElementList", getCafeXMsgRqstSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRqstSchemaXsdSpec", getCafeXMsgRqstSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaBody", getCafeXMsgRspnSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaImport", getCafeXMsgRspnSchemaImportHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaWireParsers", getCafeXMsgRspnSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaXsdElementList", getCafeXMsgRspnSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CafeXMsgRspnSchemaXsdSpec", getCafeXMsgRspnSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CPlusSchemaObjInterface", getCPlusSchemaObjInterfaceHandler() );
			schemaDefHandler.addElementHandler( "CPlusSchemaObjMembers", getCPlusSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusSchemaObjInclude", getCPlusSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusSchemaObjImplementation", getCPlusSchemaObjImplementationHandler() );
			schemaDefHandler.addElementHandler( "CPlusDb2LUWSchemaObjMembers", getCPlusDb2LUWSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusDb2LUWSchemaObjImpl", getCPlusDb2LUWSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusDb2LUWSchemaObjInclude", getCPlusDb2LUWSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusMSSqlSchemaObjMembers", getCPlusMSSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusMSSqlSchemaObjImpl", getCPlusMSSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusMSSqlSchemaObjInclude", getCPlusMSSqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusMySqlSchemaObjMembers", getCPlusMySqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusMySqlSchemaObjImpl", getCPlusMySqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusMySqlSchemaObjInclude", getCPlusMySqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusOracleSchemaObjMembers", getCPlusOracleSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusOracleSchemaObjImpl", getCPlusOracleSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusOracleSchemaObjInclude", getCPlusOracleSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusPgSqlSchemaObjMembers", getCPlusPgSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusPgSqlSchemaObjImpl", getCPlusPgSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusPgSqlSchemaObjInclude", getCPlusPgSqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusRamSchemaObjMembers", getCPlusRamSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CPlusRamSchemaObjImpl", getCPlusRamSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CPlusRamSchemaObjInclude", getCPlusRamSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgSchemaInclude", getCPlusXMsgSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgSchemaFormatters", getCPlusXMsgSchemaFormattersHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgClientSchemaInclude", getCPlusXMsgClientSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgClientSchemaBody", getCPlusXMsgClientSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaBody", getCPlusXMsgRqstSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaInclude", getCPlusXMsgRqstSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaWireParsers", getCPlusXMsgRqstSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaXsdElementList", getCPlusXMsgRqstSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRqstSchemaXsdSpec", getCPlusXMsgRqstSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRspnSchemaBody", getCPlusXMsgRspnSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRspnSchemaInclude", getCPlusXMsgRspnSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRspnSchemaWireParsers", getCPlusXMsgRspnSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRspnSchemaXsdElementList", getCPlusXMsgRspnSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CPlusXMsgRspnSchemaXsdSpec", getCPlusXMsgRspnSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "HPlusSchemaObjInterface", getHPlusSchemaObjInterfaceHandler() );
			schemaDefHandler.addElementHandler( "HPlusSchemaObjMembers", getHPlusSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusSchemaObjInclude", getHPlusSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusSchemaObjImplementation", getHPlusSchemaObjImplementationHandler() );
			schemaDefHandler.addElementHandler( "HPlusDb2LUWSchemaObjMembers", getHPlusDb2LUWSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusDb2LUWSchemaObjImpl", getHPlusDb2LUWSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusDb2LUWSchemaObjInclude", getHPlusDb2LUWSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusMSSqlSchemaObjMembers", getHPlusMSSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusMSSqlSchemaObjImpl", getHPlusMSSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusMSSqlSchemaObjInclude", getHPlusMSSqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusMySqlSchemaObjMembers", getHPlusMySqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusMySqlSchemaObjImpl", getHPlusMySqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusMySqlSchemaObjInclude", getHPlusMySqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusOracleSchemaObjMembers", getHPlusOracleSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusOracleSchemaObjImpl", getHPlusOracleSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusOracleSchemaObjInclude", getHPlusOracleSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusPgSqlSchemaObjMembers", getHPlusPgSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusPgSqlSchemaObjImpl", getHPlusPgSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusPgSqlSchemaObjInclude", getHPlusPgSqlSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusRamSchemaObjMembers", getHPlusRamSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "HPlusRamSchemaObjImpl", getHPlusRamSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "HPlusRamSchemaObjInclude", getHPlusRamSchemaObjIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgSchemaInclude", getHPlusXMsgSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgSchemaFormatters", getHPlusXMsgSchemaFormattersHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgClientSchemaInclude", getHPlusXMsgClientSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgClientSchemaBody", getHPlusXMsgClientSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaBody", getHPlusXMsgRqstSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaInclude", getHPlusXMsgRqstSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaWireParsers", getHPlusXMsgRqstSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaXsdElementList", getHPlusXMsgRqstSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRqstSchemaXsdSpec", getHPlusXMsgRqstSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaBody", getHPlusXMsgRspnSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaInclude", getHPlusXMsgRspnSchemaIncludeHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaWireParsers", getHPlusXMsgRspnSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaXsdElementList", getHPlusXMsgRspnSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "HPlusXMsgRspnSchemaXsdSpec", getHPlusXMsgRspnSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CSharpSchemaObjInterface", getCSharpSchemaObjInterfaceHandler() );
			schemaDefHandler.addElementHandler( "CSharpSchemaObjMembers", getCSharpSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpSchemaObjUsing", getCSharpSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpSchemaObjImplementation", getCSharpSchemaObjImplementationHandler() );
			schemaDefHandler.addElementHandler( "CSharpDb2LUWSchemaObjMembers", getCSharpDb2LUWSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpDb2LUWSchemaObjImpl", getCSharpDb2LUWSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpDb2LUWSchemaObjUsing", getCSharpDb2LUWSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpMSSqlSchemaObjMembers", getCSharpMSSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpMSSqlSchemaObjImpl", getCSharpMSSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpMSSqlSchemaObjUsing", getCSharpMSSqlSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpMySqlSchemaObjMembers", getCSharpMySqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpMySqlSchemaObjImpl", getCSharpMySqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpMySqlSchemaObjUsing", getCSharpMySqlSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpOracleSchemaObjMembers", getCSharpOracleSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpOracleSchemaObjImpl", getCSharpOracleSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpOracleSchemaObjUsing", getCSharpOracleSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpPgSqlSchemaObjMembers", getCSharpPgSqlSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpPgSqlSchemaObjImpl", getCSharpPgSqlSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpPgSqlSchemaObjUsing", getCSharpPgSqlSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpRamSchemaObjMembers", getCSharpRamSchemaObjMembersHandler() );
			schemaDefHandler.addElementHandler( "CSharpRamSchemaObjImpl", getCSharpRamSchemaObjImplHandler() );
			schemaDefHandler.addElementHandler( "CSharpRamSchemaObjUsing", getCSharpRamSchemaObjUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgSchemaUsing", getCSharpXMsgSchemaUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgSchemaFormatters", getCSharpXMsgSchemaFormattersHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgClientSchemaUsing", getCSharpXMsgClientSchemaUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgClientSchemaBody", getCSharpXMsgClientSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaBody", getCSharpXMsgRqstSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaUsing", getCSharpXMsgRqstSchemaUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaWireParsers", getCSharpXMsgRqstSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaXsdElementList", getCSharpXMsgRqstSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRqstSchemaXsdSpec", getCSharpXMsgRqstSchemaXsdSpecHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaBody", getCSharpXMsgRspnSchemaBodyHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaUsing", getCSharpXMsgRspnSchemaUsingHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaWireParsers", getCSharpXMsgRspnSchemaWireParsersHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaXsdElementList", getCSharpXMsgRspnSchemaXsdElementListHandler() );
			schemaDefHandler.addElementHandler( "CSharpXMsgRspnSchemaXsdSpec", getCSharpXMsgRspnSchemaXsdSpecHandler() );
		}
		return( schemaDefHandler );
	}

	public YCFBamXmlLoaderSchemaRefHandler getSchemaRefHandler() {
		if( schemaRefHandler == null ) {
			schemaRefHandler = new YCFBamXmlLoaderSchemaRefHandler( this );
		}
		return( schemaRefHandler );
	}

	public YCFBamXmlLoaderSchemaRoleHandler getSchemaRoleHandler() {
		if( schemaRoleHandler == null ) {
			schemaRoleHandler = new YCFBamXmlLoaderSchemaRoleHandler( this );
		}
		return( schemaRoleHandler );
	}

	public YCFBamXmlLoaderSchemaTweakHandler getSchemaTweakHandler() {
		if( schemaTweakHandler == null ) {
			schemaTweakHandler = new YCFBamXmlLoaderSchemaTweakHandler( this );
		}
		return( schemaTweakHandler );
	}

	protected YCFBamXmlLoaderServerListFuncHandler getServerListFuncHandler() {
		if( serverListFuncHandler == null ) {
			serverListFuncHandler = new YCFBamXmlLoaderServerListFuncHandler( this );
			serverListFuncHandler.addElementHandler( "Param", getParamHandler() );
			serverListFuncHandler.addElementHandler( "CafeMethodBody", getCafeMethodBodyHandler() );
			serverListFuncHandler.addElementHandler( "CPlusMethodBody", getCPlusMethodBodyHandler() );
			serverListFuncHandler.addElementHandler( "CSharpMethodBody", getCSharpMethodBodyHandler() );
		}
		return( serverListFuncHandler );
	}

	protected YCFBamXmlLoaderServerObjFuncHandler getServerObjFuncHandler() {
		if( serverObjFuncHandler == null ) {
			serverObjFuncHandler = new YCFBamXmlLoaderServerObjFuncHandler( this );
			serverObjFuncHandler.addElementHandler( "Param", getParamHandler() );
			serverObjFuncHandler.addElementHandler( "CafeMethodBody", getCafeMethodBodyHandler() );
			serverObjFuncHandler.addElementHandler( "CPlusMethodBody", getCPlusMethodBodyHandler() );
			serverObjFuncHandler.addElementHandler( "CSharpMethodBody", getCSharpMethodBodyHandler() );
		}
		return( serverObjFuncHandler );
	}

	protected YCFBamXmlLoaderServerProcHandler getServerProcHandler() {
		if( serverProcHandler == null ) {
			serverProcHandler = new YCFBamXmlLoaderServerProcHandler( this );
			serverProcHandler.addElementHandler( "Param", getParamHandler() );
			serverProcHandler.addElementHandler( "CafeMethodBody", getCafeMethodBodyHandler() );
			serverProcHandler.addElementHandler( "CPlusMethodBody", getCPlusMethodBodyHandler() );
			serverProcHandler.addElementHandler( "CSharpMethodBody", getCSharpMethodBodyHandler() );
		}
		return( serverProcHandler );
	}

	protected YCFBamXmlLoaderStringColHandler getStringColHandler() {
		if( stringColHandler == null ) {
			stringColHandler = new YCFBamXmlLoaderStringColHandler( this );
		}
		return( stringColHandler );
	}

	protected YCFBamXmlLoaderStringTypeHandler getStringTypeHandler() {
		if( stringTypeHandler == null ) {
			stringTypeHandler = new YCFBamXmlLoaderStringTypeHandler( this );
		}
		return( stringTypeHandler );
	}

	protected YCFBamXmlLoaderSubProjectHandler getSubProjectHandler() {
		if( subProjectHandler == null ) {
			subProjectHandler = new YCFBamXmlLoaderSubProjectHandler( this );
			subProjectHandler.addElementHandler( "MajorVersion", getMajorVersionHandler() );
		}
		return( subProjectHandler );
	}

	protected YCFBamXmlLoaderSuperClassRelationHandler getSuperClassRelationHandler() {
		if( superClassRelationHandler == null ) {
			superClassRelationHandler = new YCFBamXmlLoaderSuperClassRelationHandler( this );
			superClassRelationHandler.addElementHandler( "RelationCol", getRelationColHandler() );
		}
		return( superClassRelationHandler );
	}

	protected YCFBamXmlLoaderTZDateColHandler getTZDateColHandler() {
		if( tZDateColHandler == null ) {
			tZDateColHandler = new YCFBamXmlLoaderTZDateColHandler( this );
		}
		return( tZDateColHandler );
	}

	protected YCFBamXmlLoaderTZDateTypeHandler getTZDateTypeHandler() {
		if( tZDateTypeHandler == null ) {
			tZDateTypeHandler = new YCFBamXmlLoaderTZDateTypeHandler( this );
		}
		return( tZDateTypeHandler );
	}

	protected YCFBamXmlLoaderTZTimeColHandler getTZTimeColHandler() {
		if( tZTimeColHandler == null ) {
			tZTimeColHandler = new YCFBamXmlLoaderTZTimeColHandler( this );
		}
		return( tZTimeColHandler );
	}

	protected YCFBamXmlLoaderTZTimeTypeHandler getTZTimeTypeHandler() {
		if( tZTimeTypeHandler == null ) {
			tZTimeTypeHandler = new YCFBamXmlLoaderTZTimeTypeHandler( this );
		}
		return( tZTimeTypeHandler );
	}

	protected YCFBamXmlLoaderTZTimestampColHandler getTZTimestampColHandler() {
		if( tZTimestampColHandler == null ) {
			tZTimestampColHandler = new YCFBamXmlLoaderTZTimestampColHandler( this );
		}
		return( tZTimestampColHandler );
	}

	protected YCFBamXmlLoaderTZTimestampTypeHandler getTZTimestampTypeHandler() {
		if( tZTimestampTypeHandler == null ) {
			tZTimestampTypeHandler = new YCFBamXmlLoaderTZTimestampTypeHandler( this );
		}
		return( tZTimestampTypeHandler );
	}

	protected YCFBamXmlLoaderTableHandler getTableHandler() {
		if( tableHandler == null ) {
			tableHandler = new YCFBamXmlLoaderTableHandler( this );
			tableHandler.addElementHandler( "ServerListFunc", getServerListFuncHandler() );
			tableHandler.addElementHandler( "ServerObjFunc", getServerObjFuncHandler() );
			tableHandler.addElementHandler( "ServerProc", getServerProcHandler() );
			tableHandler.addElementHandler( "Relation", getRelationHandler() );
			tableHandler.addElementHandler( "SuperClassRelation", getSuperClassRelationHandler() );
			tableHandler.addElementHandler( "TableTweak", getTableTweakHandler() );
			tableHandler.addElementHandler( "TableCol", getTableColHandler() );
			tableHandler.addElementHandler( "BlobCol", getBlobColHandler() );
			tableHandler.addElementHandler( "BoolCol", getBoolColHandler() );
			tableHandler.addElementHandler( "Int16Col", getInt16ColHandler() );
			tableHandler.addElementHandler( "Int32Col", getInt32ColHandler() );
			tableHandler.addElementHandler( "Int64Col", getInt64ColHandler() );
			tableHandler.addElementHandler( "UInt16Col", getUInt16ColHandler() );
			tableHandler.addElementHandler( "UInt32Col", getUInt32ColHandler() );
			tableHandler.addElementHandler( "UInt64Col", getUInt64ColHandler() );
			tableHandler.addElementHandler( "FloatCol", getFloatColHandler() );
			tableHandler.addElementHandler( "DoubleCol", getDoubleColHandler() );
			tableHandler.addElementHandler( "NumberCol", getNumberColHandler() );
			tableHandler.addElementHandler( "StringCol", getStringColHandler() );
			tableHandler.addElementHandler( "TextCol", getTextColHandler() );
			tableHandler.addElementHandler( "NmTokenCol", getNmTokenColHandler() );
			tableHandler.addElementHandler( "NmTokensCol", getNmTokensColHandler() );
			tableHandler.addElementHandler( "TokenCol", getTokenColHandler() );
			tableHandler.addElementHandler( "DateCol", getDateColHandler() );
			tableHandler.addElementHandler( "TimeCol", getTimeColHandler() );
			tableHandler.addElementHandler( "TimestampCol", getTimestampColHandler() );
			tableHandler.addElementHandler( "TZDateCol", getTZDateColHandler() );
			tableHandler.addElementHandler( "TZTimeCol", getTZTimeColHandler() );
			tableHandler.addElementHandler( "TZTimestampCol", getTZTimestampColHandler() );
			tableHandler.addElementHandler( "UuidCol", getUuidColHandler() );
			tableHandler.addElementHandler( "Uuid6Col", getUuid6ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash128Col", getDbKeyHash128ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash160Col", getDbKeyHash160ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash224Col", getDbKeyHash224ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash256Col", getDbKeyHash256ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash384Col", getDbKeyHash384ColHandler() );
			tableHandler.addElementHandler( "DbKeyHash512Col", getDbKeyHash512ColHandler() );
			tableHandler.addElementHandler( "Index", getIndexHandler() );
			tableHandler.addElementHandler( "PrimaryIndex", getPrimaryIndexHandler() );
			tableHandler.addElementHandler( "Chain", getChainHandler() );
			tableHandler.addElementHandler( "ClearDep", getClearDepHandler() );
			tableHandler.addElementHandler( "DelDep", getDelDepHandler() );
			tableHandler.addElementHandler( "CafeObjMembers", getCafeObjMembersHandler() );
			tableHandler.addElementHandler( "CafeObjInterface", getCafeObjInterfaceHandler() );
			tableHandler.addElementHandler( "CafeObjImplementation", getCafeObjImplementationHandler() );
			tableHandler.addElementHandler( "CafeEditObjMembers", getCafeEditObjMembersHandler() );
			tableHandler.addElementHandler( "CafeEditObjInterface", getCafeEditObjInterfaceHandler() );
			tableHandler.addElementHandler( "CafeEditObjImplementation", getCafeEditObjImplementationHandler() );
			tableHandler.addElementHandler( "CafeDb2LUWTableImport", getCafeDb2LUWTableImportHandler() );
			tableHandler.addElementHandler( "CafeMSSqlTableImport", getCafeMSSqlTableImportHandler() );
			tableHandler.addElementHandler( "CafeMySqlTableImport", getCafeMySqlTableImportHandler() );
			tableHandler.addElementHandler( "CafeOracleTableImport", getCafeOracleTableImportHandler() );
			tableHandler.addElementHandler( "CafePgSqlTableImport", getCafePgSqlTableImportHandler() );
			tableHandler.addElementHandler( "CafeRamTableImport", getCafeRamTableImportHandler() );
			tableHandler.addElementHandler( "CafeObjImport", getCafeObjImportHandler() );
			tableHandler.addElementHandler( "CafeEditObjImport", getCafeEditObjImportHandler() );
			tableHandler.addElementHandler( "CafeSaxLoaderImport", getCafeSaxLoaderImportHandler() );
			tableHandler.addElementHandler( "CafeTableImport", getCafeTableImportHandler() );
			tableHandler.addElementHandler( "CafeTableObjImport", getCafeTableObjImportHandler() );
			tableHandler.addElementHandler( "CafeTableMembers", getCafeTableMembersHandler() );
			tableHandler.addElementHandler( "CafeTableInterface", getCafeTableInterfaceHandler() );
			tableHandler.addElementHandler( "CafeTableImplementation", getCafeTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeTableObjMembers", getCafeTableObjMembersHandler() );
			tableHandler.addElementHandler( "CafeTableObjInterface", getCafeTableObjInterfaceHandler() );
			tableHandler.addElementHandler( "CafeTableObjImplementation", getCafeTableObjImplementationHandler() );
			tableHandler.addElementHandler( "CafeDb2LUWTableMembers", getCafeDb2LUWTableMembersHandler() );
			tableHandler.addElementHandler( "CafeDb2LUWTableImplementation", getCafeDb2LUWTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeMSSqlTableMembers", getCafeMSSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CafeMSSqlTableImplementation", getCafeMSSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeMySqlTableMembers", getCafeMySqlTableMembersHandler() );
			tableHandler.addElementHandler( "CafeMySqlTableImplementation", getCafeMySqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeOracleTableMembers", getCafeOracleTableMembersHandler() );
			tableHandler.addElementHandler( "CafeOracleTableImplementation", getCafeOracleTableImplementationHandler() );
			tableHandler.addElementHandler( "CafePgSqlTableMembers", getCafePgSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CafePgSqlTableImplementation", getCafePgSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeRamTableMembers", getCafeRamTableMembersHandler() );
			tableHandler.addElementHandler( "CafeRamTableImplementation", getCafeRamTableImplementationHandler() );
			tableHandler.addElementHandler( "CafeSaxLoaderStartElement", getCafeSaxLoaderStartElementHandler() );
			tableHandler.addElementHandler( "CafeSaxLoaderEndElement", getCafeSaxLoaderEndElementHandler() );
			tableHandler.addElementHandler( "CafeXMsgTableImport", getCafeXMsgTableImportHandler() );
			tableHandler.addElementHandler( "CafeXMsgTableFormatters", getCafeXMsgTableFormattersHandler() );
			tableHandler.addElementHandler( "CafeXMsgRqstTableImport", getCafeXMsgRqstTableImportHandler() );
			tableHandler.addElementHandler( "CafeXMsgRspnTableImport", getCafeXMsgRspnTableImportHandler() );
			tableHandler.addElementHandler( "CafeXMsgClientTableImport", getCafeXMsgClientTableImportHandler() );
			tableHandler.addElementHandler( "CafeXMsgRqstTableBody", getCafeXMsgRqstTableBodyHandler() );
			tableHandler.addElementHandler( "CafeXMsgRspnTableBody", getCafeXMsgRspnTableBodyHandler() );
			tableHandler.addElementHandler( "CafeXMsgClientTableBody", getCafeXMsgClientTableBodyHandler() );
			tableHandler.addElementHandler( "CPlusObjMembers", getCPlusObjMembersHandler() );
			tableHandler.addElementHandler( "CPlusObjInterface", getCPlusObjInterfaceHandler() );
			tableHandler.addElementHandler( "CPlusObjImplementation", getCPlusObjImplementationHandler() );
			tableHandler.addElementHandler( "CPlusEditObjMembers", getCPlusEditObjMembersHandler() );
			tableHandler.addElementHandler( "CPlusEditObjInterface", getCPlusEditObjInterfaceHandler() );
			tableHandler.addElementHandler( "CPlusEditObjImplementation", getCPlusEditObjImplementationHandler() );
			tableHandler.addElementHandler( "CPlusDb2LUWTableInclude", getCPlusDb2LUWTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusMSSqlTableInclude", getCPlusMSSqlTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusMySqlTableInclude", getCPlusMySqlTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusOracleTableInclude", getCPlusOracleTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusPgSqlTableInclude", getCPlusPgSqlTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusRamTableInclude", getCPlusRamTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusObjInclude", getCPlusObjIncludeHandler() );
			tableHandler.addElementHandler( "CPlusEditObjInclude", getCPlusEditObjIncludeHandler() );
			tableHandler.addElementHandler( "CPlusSaxLoaderInclude", getCPlusSaxLoaderIncludeHandler() );
			tableHandler.addElementHandler( "CPlusTableInclude", getCPlusTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusTableObjInclude", getCPlusTableObjIncludeHandler() );
			tableHandler.addElementHandler( "CPlusTableMembers", getCPlusTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusTableInterface", getCPlusTableInterfaceHandler() );
			tableHandler.addElementHandler( "CPlusTableImplementation", getCPlusTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusTableObjMembers", getCPlusTableObjMembersHandler() );
			tableHandler.addElementHandler( "CPlusTableObjInterface", getCPlusTableObjInterfaceHandler() );
			tableHandler.addElementHandler( "CPlusTableObjImplementation", getCPlusTableObjImplementationHandler() );
			tableHandler.addElementHandler( "CPlusDb2LUWTableMembers", getCPlusDb2LUWTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusDb2LUWTableImplementation", getCPlusDb2LUWTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusMSSqlTableMembers", getCPlusMSSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusMSSqlTableImplementation", getCPlusMSSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusMySqlTableMembers", getCPlusMySqlTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusMySqlTableImplementation", getCPlusMySqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusOracleTableMembers", getCPlusOracleTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusOracleTableImplementation", getCPlusOracleTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusPgSqlTableMembers", getCPlusPgSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusPgSqlTableImplementation", getCPlusPgSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusRamTableMembers", getCPlusRamTableMembersHandler() );
			tableHandler.addElementHandler( "CPlusRamTableImplementation", getCPlusRamTableImplementationHandler() );
			tableHandler.addElementHandler( "CPlusSaxLoaderStartElement", getCPlusSaxLoaderStartElementHandler() );
			tableHandler.addElementHandler( "CPlusSaxLoaderEndElement", getCPlusSaxLoaderEndElementHandler() );
			tableHandler.addElementHandler( "CPlusXMsgTableInclude", getCPlusXMsgTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusXMsgTableFormatters", getCPlusXMsgTableFormattersHandler() );
			tableHandler.addElementHandler( "CPlusXMsgRqstTableInclude", getCPlusXMsgRqstTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusXMsgRspnTableInclude", getCPlusXMsgRspnTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusXMsgClientTableInclude", getCPlusXMsgClientTableIncludeHandler() );
			tableHandler.addElementHandler( "CPlusXMsgRqstTableBody", getCPlusXMsgRqstTableBodyHandler() );
			tableHandler.addElementHandler( "CPlusXMsgRspnTableBody", getCPlusXMsgRspnTableBodyHandler() );
			tableHandler.addElementHandler( "CPlusXMsgClientTableBody", getCPlusXMsgClientTableBodyHandler() );
			tableHandler.addElementHandler( "HPlusObjMembers", getHPlusObjMembersHandler() );
			tableHandler.addElementHandler( "HPlusObjInterface", getHPlusObjInterfaceHandler() );
			tableHandler.addElementHandler( "HPlusObjImplementation", getHPlusObjImplementationHandler() );
			tableHandler.addElementHandler( "HPlusEditObjMembers", getHPlusEditObjMembersHandler() );
			tableHandler.addElementHandler( "HPlusEditObjInterface", getHPlusEditObjInterfaceHandler() );
			tableHandler.addElementHandler( "HPlusEditObjImplementation", getHPlusEditObjImplementationHandler() );
			tableHandler.addElementHandler( "HPlusDb2LUWTableInclude", getHPlusDb2LUWTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusMSSqlTableInclude", getHPlusMSSqlTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusMySqlTableInclude", getHPlusMySqlTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusOracleTableInclude", getHPlusOracleTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusPgSqlTableInclude", getHPlusPgSqlTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusRamTableInclude", getHPlusRamTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusObjInclude", getHPlusObjIncludeHandler() );
			tableHandler.addElementHandler( "HPlusEditObjInclude", getHPlusEditObjIncludeHandler() );
			tableHandler.addElementHandler( "HPlusSaxLoaderInclude", getHPlusSaxLoaderIncludeHandler() );
			tableHandler.addElementHandler( "HPlusTableInclude", getHPlusTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusTableObjInclude", getHPlusTableObjIncludeHandler() );
			tableHandler.addElementHandler( "HPlusTableMembers", getHPlusTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusTableInterface", getHPlusTableInterfaceHandler() );
			tableHandler.addElementHandler( "HPlusTableImplementation", getHPlusTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusTableObjMembers", getHPlusTableObjMembersHandler() );
			tableHandler.addElementHandler( "HPlusTableObjInterface", getHPlusTableObjInterfaceHandler() );
			tableHandler.addElementHandler( "HPlusTableObjImplementation", getHPlusTableObjImplementationHandler() );
			tableHandler.addElementHandler( "HPlusDb2LUWTableMembers", getHPlusDb2LUWTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusDb2LUWTableImplementation", getHPlusDb2LUWTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusMSSqlTableMembers", getHPlusMSSqlTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusMSSqlTableImplementation", getHPlusMSSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusMySqlTableMembers", getHPlusMySqlTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusMySqlTableImplementation", getHPlusMySqlTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusOracleTableMembers", getHPlusOracleTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusOracleTableImplementation", getHPlusOracleTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusPgSqlTableMembers", getHPlusPgSqlTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusPgSqlTableImplementation", getHPlusPgSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusRamTableMembers", getHPlusRamTableMembersHandler() );
			tableHandler.addElementHandler( "HPlusRamTableImplementation", getHPlusRamTableImplementationHandler() );
			tableHandler.addElementHandler( "HPlusSaxLoaderStartElement", getHPlusSaxLoaderStartElementHandler() );
			tableHandler.addElementHandler( "HPlusSaxLoaderEndElement", getHPlusSaxLoaderEndElementHandler() );
			tableHandler.addElementHandler( "HPlusXMsgTableInclude", getHPlusXMsgTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusXMsgTableFormatters", getHPlusXMsgTableFormattersHandler() );
			tableHandler.addElementHandler( "HPlusXMsgRqstTableInclude", getHPlusXMsgRqstTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusXMsgRspnTableInclude", getHPlusXMsgRspnTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusXMsgClientTableInclude", getHPlusXMsgClientTableIncludeHandler() );
			tableHandler.addElementHandler( "HPlusXMsgRqstTableBody", getHPlusXMsgRqstTableBodyHandler() );
			tableHandler.addElementHandler( "HPlusXMsgRspnTableBody", getHPlusXMsgRspnTableBodyHandler() );
			tableHandler.addElementHandler( "HPlusXMsgClientTableBody", getHPlusXMsgClientTableBodyHandler() );
			tableHandler.addElementHandler( "CSharpObjMembers", getCSharpObjMembersHandler() );
			tableHandler.addElementHandler( "CSharpObjInterface", getCSharpObjInterfaceHandler() );
			tableHandler.addElementHandler( "CSharpObjImplementation", getCSharpObjImplementationHandler() );
			tableHandler.addElementHandler( "CSharpEditObjMembers", getCSharpEditObjMembersHandler() );
			tableHandler.addElementHandler( "CSharpEditObjInterface", getCSharpEditObjInterfaceHandler() );
			tableHandler.addElementHandler( "CSharpEditObjImplementation", getCSharpEditObjImplementationHandler() );
			tableHandler.addElementHandler( "CSharpDb2LUWTableUsing", getCSharpDb2LUWTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpMSSqlTableUsing", getCSharpMSSqlTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpMySqlTableUsing", getCSharpMySqlTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpOracleTableUsing", getCSharpOracleTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpPgSqlTableUsing", getCSharpPgSqlTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpRamTableUsing", getCSharpRamTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpObjUsing", getCSharpObjUsingHandler() );
			tableHandler.addElementHandler( "CSharpEditObjUsing", getCSharpEditObjUsingHandler() );
			tableHandler.addElementHandler( "CSharpSaxLoaderUsing", getCSharpSaxLoaderUsingHandler() );
			tableHandler.addElementHandler( "CSharpTableUsing", getCSharpTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpTableObjUsing", getCSharpTableObjUsingHandler() );
			tableHandler.addElementHandler( "CSharpTableMembers", getCSharpTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpTableInterface", getCSharpTableInterfaceHandler() );
			tableHandler.addElementHandler( "CSharpTableImplementation", getCSharpTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpTableObjMembers", getCSharpTableObjMembersHandler() );
			tableHandler.addElementHandler( "CSharpTableObjInterface", getCSharpTableObjInterfaceHandler() );
			tableHandler.addElementHandler( "CSharpTableObjImplementation", getCSharpTableObjImplementationHandler() );
			tableHandler.addElementHandler( "CSharpDb2LUWTableMembers", getCSharpDb2LUWTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpDb2LUWTableImplementation", getCSharpDb2LUWTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpMSSqlTableMembers", getCSharpMSSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpMSSqlTableImplementation", getCSharpMSSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpMySqlTableMembers", getCSharpMySqlTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpMySqlTableImplementation", getCSharpMySqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpOracleTableMembers", getCSharpOracleTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpOracleTableImplementation", getCSharpOracleTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpPgSqlTableMembers", getCSharpPgSqlTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpPgSqlTableImplementation", getCSharpPgSqlTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpRamTableMembers", getCSharpRamTableMembersHandler() );
			tableHandler.addElementHandler( "CSharpRamTableImplementation", getCSharpRamTableImplementationHandler() );
			tableHandler.addElementHandler( "CSharpSaxLoaderStartElement", getCSharpSaxLoaderStartElementHandler() );
			tableHandler.addElementHandler( "CSharpSaxLoaderEndElement", getCSharpSaxLoaderEndElementHandler() );
			tableHandler.addElementHandler( "CSharpXMsgTableUsing", getCSharpXMsgTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpXMsgTableFormatters", getCSharpXMsgTableFormattersHandler() );
			tableHandler.addElementHandler( "CSharpXMsgRqstTableUsing", getCSharpXMsgRqstTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpXMsgRspnTableUsing", getCSharpXMsgRspnTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpXMsgClientTableUsing", getCSharpXMsgClientTableUsingHandler() );
			tableHandler.addElementHandler( "CSharpXMsgRqstTableBody", getCSharpXMsgRqstTableBodyHandler() );
			tableHandler.addElementHandler( "CSharpXMsgRspnTableBody", getCSharpXMsgRspnTableBodyHandler() );
			tableHandler.addElementHandler( "CSharpXMsgClientTableBody", getCSharpXMsgClientTableBodyHandler() );
		}
		return( tableHandler );
	}

	protected YCFBamXmlLoaderTableAddendumHandler getTableAddendumHandler() {
		if( tableAddendumHandler == null ) {
			tableAddendumHandler = new YCFBamXmlLoaderTableAddendumHandler( this );
			tableAddendumHandler.addElementHandler( "ServerListFunc", getServerListFuncHandler() );
			tableAddendumHandler.addElementHandler( "ServerObjFunc", getServerObjFuncHandler() );
			tableAddendumHandler.addElementHandler( "ServerProc", getServerProcHandler() );
			tableAddendumHandler.addElementHandler( "SuperClassRelation", getSuperClassRelationHandler() );
			tableAddendumHandler.addElementHandler( "Relation", getRelationHandler() );
			tableAddendumHandler.addElementHandler( "Index", getIndexHandler() );
			tableAddendumHandler.addElementHandler( "Chain", getChainHandler() );
			tableAddendumHandler.addElementHandler( "ClearDep", getClearDepHandler() );
			tableAddendumHandler.addElementHandler( "DelDep", getDelDepHandler() );
			tableAddendumHandler.addElementHandler( "TableTweak", getTableTweakHandler() );
		}
		return( tableAddendumHandler );
	}

	protected YCFBamXmlLoaderIndexAddendumHandler getIndexAddendumHandler() {
		if( indexAddendumHandler == null ) {
			indexAddendumHandler = new YCFBamXmlLoaderIndexAddendumHandler( this );
			indexAddendumHandler.addElementHandler( "IndexTweak", getIndexTweakHandler() );
		}
		return( indexAddendumHandler );
	}

	protected YCFBamXmlLoaderTableColHandler getTableColHandler() {
		if( tableColHandler == null ) {
			tableColHandler = new YCFBamXmlLoaderTableColHandler( this );
		}
		return( tableColHandler );
	}

	protected YCFBamXmlLoaderTableTweakHandler getTableTweakHandler() {
		if( tableTweakHandler == null ) {
			tableTweakHandler = new YCFBamXmlLoaderTableTweakHandler( this );
		}
		return( tableTweakHandler );
	}

	protected YCFBamXmlLoaderTextColHandler getTextColHandler() {
		if( textColHandler == null ) {
			textColHandler = new YCFBamXmlLoaderTextColHandler( this );
		}
		return( textColHandler );
	}

	protected YCFBamXmlLoaderTextTypeHandler getTextTypeHandler() {
		if( textTypeHandler == null ) {
			textTypeHandler = new YCFBamXmlLoaderTextTypeHandler( this );
		}
		return( textTypeHandler );
	}

	protected YCFBamXmlLoaderTimeColHandler getTimeColHandler() {
		if( timeColHandler == null ) {
			timeColHandler = new YCFBamXmlLoaderTimeColHandler( this );
		}
		return( timeColHandler );
	}

	protected YCFBamXmlLoaderTimeTypeHandler getTimeTypeHandler() {
		if( timeTypeHandler == null ) {
			timeTypeHandler = new YCFBamXmlLoaderTimeTypeHandler( this );
		}
		return( timeTypeHandler );
	}

	protected YCFBamXmlLoaderTimestampColHandler getTimestampColHandler() {
		if( timestampColHandler == null ) {
			timestampColHandler = new YCFBamXmlLoaderTimestampColHandler( this );
		}
		return( timestampColHandler );
	}

	protected YCFBamXmlLoaderTimestampTypeHandler getTimestampTypeHandler() {
		if( timestampTypeHandler == null ) {
			timestampTypeHandler = new YCFBamXmlLoaderTimestampTypeHandler( this );
		}
		return( timestampTypeHandler );
	}

	protected YCFBamXmlLoaderTldHandler getTldHandler() {
		if( tldHandler == null ) {
			tldHandler = new YCFBamXmlLoaderTldHandler( this );
			tldHandler.addElementHandler( "TopDomain", getTopDomainHandler() );
		}
		return( tldHandler );
	}

	protected YCFBamXmlLoaderTokenColHandler getTokenColHandler() {
		if( tokenColHandler == null ) {
			tokenColHandler = new YCFBamXmlLoaderTokenColHandler( this );
		}
		return( tokenColHandler );
	}

	protected YCFBamXmlLoaderTokenTypeHandler getTokenTypeHandler() {
		if( tokenTypeHandler == null ) {
			tokenTypeHandler = new YCFBamXmlLoaderTokenTypeHandler( this );
		}
		return( tokenTypeHandler );
	}

	protected YCFBamXmlLoaderTopDomainHandler getTopDomainHandler() {
		if( topDomainHandler == null ) {
			topDomainHandler = new YCFBamXmlLoaderTopDomainHandler( this );
			topDomainHandler.addElementHandler( "TopProject", getTopProjectHandler() );
			topDomainHandler.addElementHandler( "License", getLicenseHandler() );
		}
		return( topDomainHandler );
	}

	protected YCFBamXmlLoaderTopProjectHandler getTopProjectHandler() {
		if( topProjectHandler == null ) {
			topProjectHandler = new YCFBamXmlLoaderTopProjectHandler( this );
			topProjectHandler.addElementHandler( "SubProject", getSubProjectHandler() );
		}
		return( topProjectHandler );
	}

	protected YCFBamXmlLoaderUInt16ColHandler getUInt16ColHandler() {
		if( uInt16ColHandler == null ) {
			uInt16ColHandler = new YCFBamXmlLoaderUInt16ColHandler( this );
		}
		return( uInt16ColHandler );
	}

	protected YCFBamXmlLoaderUInt16TypeHandler getUInt16TypeHandler() {
		if( uInt16TypeHandler == null ) {
			uInt16TypeHandler = new YCFBamXmlLoaderUInt16TypeHandler( this );
		}
		return( uInt16TypeHandler );
	}

	protected YCFBamXmlLoaderUInt32ColHandler getUInt32ColHandler() {
		if( uInt32ColHandler == null ) {
			uInt32ColHandler = new YCFBamXmlLoaderUInt32ColHandler( this );
		}
		return( uInt32ColHandler );
	}

	protected YCFBamXmlLoaderUInt32TypeHandler getUInt32TypeHandler() {
		if( uInt32TypeHandler == null ) {
			uInt32TypeHandler = new YCFBamXmlLoaderUInt32TypeHandler( this );
		}
		return( uInt32TypeHandler );
	}

	protected YCFBamXmlLoaderUInt64ColHandler getUInt64ColHandler() {
		if( uInt64ColHandler == null ) {
			uInt64ColHandler = new YCFBamXmlLoaderUInt64ColHandler( this );
		}
		return( uInt64ColHandler );
	}

	protected YCFBamXmlLoaderUInt64TypeHandler getUInt64TypeHandler() {
		if( uInt64TypeHandler == null ) {
			uInt64TypeHandler = new YCFBamXmlLoaderUInt64TypeHandler( this );
		}
		return( uInt64TypeHandler );
	}

	protected YCFBamXmlLoaderUuidColHandler getUuidColHandler() {
		if( uuidColHandler == null ) {
			uuidColHandler = new YCFBamXmlLoaderUuidColHandler( this );
		}
		return( uuidColHandler );
	}

	protected YCFBamXmlLoaderUuidGenHandler getUuidGenHandler() {
		if( uuidGenHandler == null ) {
			uuidGenHandler = new YCFBamXmlLoaderUuidGenHandler( this );
		}
		return( uuidGenHandler );
	}

	protected YCFBamXmlLoaderUuidTypeHandler getUuidTypeHandler() {
		if( uuidTypeHandler == null ) {
			uuidTypeHandler = new YCFBamXmlLoaderUuidTypeHandler( this );
		}
		return( uuidTypeHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash128ColHandler getDbKeyHash128ColHandler() {
		if( dbKeyHash128ColHandler == null ) {
			dbKeyHash128ColHandler = new YCFBamXmlLoaderDbKeyHash128ColHandler( this );
		}
		return( dbKeyHash128ColHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash128GenHandler getDbKeyHash128GenHandler() {
		if( dbKeyHash128GenHandler == null ) {
			dbKeyHash128GenHandler = new YCFBamXmlLoaderDbKeyHash128GenHandler( this );
		}
		return( dbKeyHash128GenHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash128TypeHandler getDbKeyHash128TypeHandler() {
		if( dbKeyHash128TypeHandler == null ) {
			dbKeyHash128TypeHandler = new YCFBamXmlLoaderDbKeyHash128TypeHandler( this );
		}
		return( dbKeyHash128TypeHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash160ColHandler getDbKeyHash160ColHandler() {
		if( dbKeyHash160ColHandler == null ) {
			dbKeyHash160ColHandler = new YCFBamXmlLoaderDbKeyHash160ColHandler( this );
		}
		return( dbKeyHash160ColHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash160GenHandler getDbKeyHash160GenHandler() {
		if( dbKeyHash160GenHandler == null ) {
			dbKeyHash160GenHandler = new YCFBamXmlLoaderDbKeyHash160GenHandler( this );
		}
		return( dbKeyHash160GenHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash160TypeHandler getDbKeyHash160TypeHandler() {
		if( dbKeyHash160TypeHandler == null ) {
			dbKeyHash160TypeHandler = new YCFBamXmlLoaderDbKeyHash160TypeHandler( this );
		}
		return( dbKeyHash160TypeHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash224ColHandler getDbKeyHash224ColHandler() {
		if( dbKeyHash224ColHandler == null ) {
			dbKeyHash224ColHandler = new YCFBamXmlLoaderDbKeyHash224ColHandler( this );
		}
		return( dbKeyHash224ColHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash224GenHandler getDbKeyHash224GenHandler() {
		if( dbKeyHash224GenHandler == null ) {
			dbKeyHash224GenHandler = new YCFBamXmlLoaderDbKeyHash224GenHandler( this );
		}
		return( dbKeyHash224GenHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash224TypeHandler getDbKeyHash224TypeHandler() {
		if( dbKeyHash224TypeHandler == null ) {
			dbKeyHash224TypeHandler = new YCFBamXmlLoaderDbKeyHash224TypeHandler( this );
		}
		return( dbKeyHash224TypeHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash256ColHandler getDbKeyHash256ColHandler() {
		if( dbKeyHash256ColHandler == null ) {
			dbKeyHash256ColHandler = new YCFBamXmlLoaderDbKeyHash256ColHandler( this );
		}
		return( dbKeyHash256ColHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash256GenHandler getDbKeyHash256GenHandler() {
		if( dbKeyHash256GenHandler == null ) {
			dbKeyHash256GenHandler = new YCFBamXmlLoaderDbKeyHash256GenHandler( this );
		}
		return( dbKeyHash256GenHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash256TypeHandler getDbKeyHash256TypeHandler() {
		if( dbKeyHash256TypeHandler == null ) {
			dbKeyHash256TypeHandler = new YCFBamXmlLoaderDbKeyHash256TypeHandler( this );
		}
		return( dbKeyHash256TypeHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash384ColHandler getDbKeyHash384ColHandler() {
		if( dbKeyHash384ColHandler == null ) {
			dbKeyHash384ColHandler = new YCFBamXmlLoaderDbKeyHash384ColHandler( this );
		}
		return( dbKeyHash384ColHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash384GenHandler getDbKeyHash384GenHandler() {
		if( dbKeyHash384GenHandler == null ) {
			dbKeyHash384GenHandler = new YCFBamXmlLoaderDbKeyHash384GenHandler( this );
		}
		return( dbKeyHash384GenHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash384TypeHandler getDbKeyHash384TypeHandler() {
		if( dbKeyHash384TypeHandler == null ) {
			dbKeyHash384TypeHandler = new YCFBamXmlLoaderDbKeyHash384TypeHandler( this );
		}
		return( dbKeyHash384TypeHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash512ColHandler getDbKeyHash512ColHandler() {
		if( dbKeyHash512ColHandler == null ) {
			dbKeyHash512ColHandler = new YCFBamXmlLoaderDbKeyHash512ColHandler( this );
		}
		return( dbKeyHash512ColHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash512GenHandler getDbKeyHash512GenHandler() {
		if( dbKeyHash512GenHandler == null ) {
			dbKeyHash512GenHandler = new YCFBamXmlLoaderDbKeyHash512GenHandler( this );
		}
		return( dbKeyHash512GenHandler );
	}

	protected YCFBamXmlLoaderDbKeyHash512TypeHandler getDbKeyHash512TypeHandler() {
		if( dbKeyHash512TypeHandler == null ) {
			dbKeyHash512TypeHandler = new YCFBamXmlLoaderDbKeyHash512TypeHandler( this );
		}
		return( dbKeyHash512TypeHandler );
	}

	protected YCFBamXmlLoaderUuid6ColHandler getUuid6ColHandler() {
		if( uuid6ColHandler == null ) {
			uuid6ColHandler = new YCFBamXmlLoaderUuid6ColHandler( this );
		}
		return( uuid6ColHandler );
	}

	protected YCFBamXmlLoaderUuid6GenHandler getUuid6GenHandler() {
		if( uuid6GenHandler == null ) {
			uuid6GenHandler = new YCFBamXmlLoaderUuid6GenHandler( this );
		}
		return( uuid6GenHandler );
	}

	protected YCFBamXmlLoaderUuid6TypeHandler getUuid6TypeHandler() {
		if( uuid6TypeHandler == null ) {
			uuid6TypeHandler = new YCFBamXmlLoaderUuid6TypeHandler( this );
		}
		return( uuid6TypeHandler );
	}

	// Root Element Handler Resolver Factory

	protected YCFBamSaxRootHandler getSaxRootHandler() {
		if( saxRootHandler == null ) {
			saxRootHandler = new YCFBamSaxRootHandler( this );
			saxRootHandler.addElementHandler( "MSSBam", getSaxDocHandler() );
		}
		return( saxRootHandler );
	}

	// Root Element Handler

	/*
	 *	YCFBamSaxRootHandler XML SAX Root Element Handler implementation
	 */
	public class YCFBamSaxRootHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFBamSaxRootHandler( YCFBamXmlLoader saxLoader ) {
			super( saxLoader );
		}

		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
		}

		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
		}
	}

	// Document Element Handler Resolver Factory

	protected YCFBamSaxDocHandler getSaxDocHandler() {
		if( saxDocHandler == null ) {
			saxDocHandler = new YCFBamSaxDocHandler( this );
			saxDocHandler.addElementHandler( "Tld", getTldHandler() );
		}
		return( saxDocHandler );
	}

	// Document Element Handler

	/*
	 *	YCFBamSaxDocHandler XML SAX Doc Element Handler implementation
	 */
	public class YCFBamSaxDocHandler
		extends YCFLibXmlCoreElementHandler
	{
		public YCFBamSaxDocHandler( YCFBamXmlLoader saxLoader ) {
			super( saxLoader );
		}

		public void startElement(
			String		uri,
			String		localName,
			String		qName,
			Attributes	attrs )
		throws SAXException
		{
			// AnyObj attributes
			String	attrId = null;
			String	attrDescription = null;
			String	attrName = null;
			String	attrRevision = null;
			String	attrProjectRoot = null;

			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;

			final String S_ProcName = "startElement";
			final String S_LocalNameIndex = "LocalName";

			assert qName.equals( "MSSBam" );

			YCFBamXmlLoader saxLoader = (YCFBamXmlLoader)getParser();
			if( saxLoader == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			IYCFBamSchemaObj schemaObj = saxLoader.getSchemaObj();
			if( schemaObj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getSchemaObj()" );
			}

			numAttrs = attrs.getLength();
			for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
				attrLocalName = attrs.getLocalName( idxAttr );
				if( attrLocalName.equals( "Id" ) ) {
					if( attrId != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalNameIndex,
							attrLocalName );
					}
					attrId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Description" ) ) {
					if( attrDescription != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalNameIndex,
							attrLocalName );
					}
					attrDescription = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Name" ) ) {
					if( attrName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalNameIndex,
							attrLocalName );
					}
					attrName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Revision" ) ) {
					if( attrRevision != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalNameIndex,
							attrLocalName );
					}
					attrRevision = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ProjectRoot" ) ) {
					if( attrProjectRoot != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalNameIndex,
							attrLocalName );
					}
					attrProjectRoot = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else {
					throw new YCFLibUnrecognizedAttributeException( getClass(),
						S_ProcName,
						getLocationInfo(),
						attrLocalName );
				}
			}

			if( ( attrName == null ) || ( attrName.length() <= 0 ) ) {
				throw new YCFLibEmptyArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
			}

			if( ( attrRevision == null ) || ( attrRevision.length() <= 0 ) ) {
				throw new YCFLibEmptyArgumentException( getClass(),
					S_ProcName,
					0,
					"Revision" );
			}

			if( ( attrDescription == null ) || ( attrDescription.length() <= 0 ) ) {
				throw new YCFLibEmptyArgumentException( getClass(),
					S_ProcName,
					0,
					"Description" );
			}

			if( ( attrProjectRoot == null ) || ( attrProjectRoot.length() <= 0 ) ) {
				throw new YCFLibEmptyArgumentException( getClass(),
					S_ProcName,
					0,
					"ProjectRoot" );
			}

			getLog().message( "Loading MSSBam Name=\"" + attrName
				+ "\", Revision = \"" + attrRevision
				+ "\", Description=\"" + attrDescription
				+ "\", ProjectRoot=\"" + attrProjectRoot + "\"\n" ); 

			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "Description", attrDescription );
			curContext.putNamedValue( "Name", attrName );
			curContext.putNamedValue( "Revision", attrRevision );
			curContext.putNamedValue( "ProjectRoot", attrProjectRoot );

			curContext.putNamedValue( "Object", getTenant() );
		}

		public void endElement(
			String		uri,
			String		localName,
			String		qName )
		throws SAXException
		{
			final String S_ProcName = "endElement";
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			String projectRootName = (String)curContext.getNamedValue( "ProjectRoot" );
			String name = (String)curContext.getNamedValue( "Name" );
			String description = (String)curContext.getNamedValue( "Description" );
			IYCFBamTenantObj tenant = (IYCFBamTenantObj)curContext.getNamedValue( "Object" );
			if( tenant != null ) {
				IYCFLibAnyObj rootDef;
				try {
					rootDef = tenant.getNamedObject( projectRootName );
				}
				catch( RuntimeException e ) {
					rootDef = null;
				}

				if( rootDef instanceof IYCFBamMajorVersionObj ) {
					definedProjectVersion = rootDef;
					getLog().message( "Parsed " + name + " " + description );
				}
				else if( rootDef instanceof IYCFBamMinorVersionObj ) {
					definedProjectVersion = rootDef;
					getLog().message( "Parsed " + name + " " + description );
				}
				else {
					definedProjectVersion = null;
					throw new YCFLibRuntimeException( getClass(),
						S_ProcName,
						getLocationInfo() + " Loaded Business Application Model does not define Project Root \"" + projectRootName + "\"" );
				}
			}
		}
	}

	// Parse a file

	public void parseFile( String url ) {
		parse( url );
	}
}
