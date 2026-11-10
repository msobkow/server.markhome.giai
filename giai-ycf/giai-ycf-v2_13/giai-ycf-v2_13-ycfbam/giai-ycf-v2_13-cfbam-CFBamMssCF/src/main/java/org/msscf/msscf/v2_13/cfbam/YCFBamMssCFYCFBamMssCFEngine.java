
// Description: Java 11 MssYCF YCFEngine for YCFBam

/*
 *	org.mssycf.mssycf.YCFBam
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
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamMssYCF;

import java.sql.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

public abstract class YCFBamMssYCFEngine
	extends MssYCFEngine
{
	private static final long serialVersionUID = 1L;
	public static final String ITEMNAME_TOP = "top";
	protected IYCFBamSchemaObj cFBamSchema = null;

	public YCFBamMssYCFEngine() {
		super();
		setTargetRuleName( ITEMNAME_TOP );
	}

	public abstract String fixGenDefName( String rawName );

	public IYCFBamSchemaObj getYCFBamSchema() {
		return( cFBamSchema );
	}

	public void setYCFBamSchema( IYCFBamSchemaObj value ) {
		cFBamSchema = value;
	}

	public void init( String generatingBuild,
		IYCFGenKbSchemaObj argYCFGenKbSchema,
		IYCFGenKbTenantObj argTenant,
		IYCFBamSchemaObj argYCFBamSchema,
		String strRootGenDir )
	{
		setYCFBamSchema( argYCFBamSchema );
		init( generatingBuild, argYCFGenKbSchema, argTenant, strRootGenDir );
	}

	public void init( String generatingBuild,
		IYCFGenKbSchemaObj argYCFGenKbSchema,
		IYCFGenKbTenantObj argTenant,
		String strRootGenDir )
	{
		super.init( generatingBuild, argYCFGenKbSchema, argTenant, strRootGenDir );
		setGenContext( getGenContextFactory().newGenContext( generatingBuild,
			this,
			strRootGenDir,
			"any",
			"Object",
			"Object",
			getTargetRuleName() ) );
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

	public void bootstrapDefClasses() {
		IYCFGenKbDefClassObj defClassObject = bootstrapDefClass( "Object", null );
		IYCFGenKbDefClassObj defClassChain = bootstrapDefClass( "Chain", defClassObject );
		IYCFGenKbDefClassObj defClassCluster = bootstrapDefClass( "Cluster", defClassObject );
		IYCFGenKbDefClassObj defClassEnumTag = bootstrapDefClass( "EnumTag", defClassObject );
		IYCFGenKbDefClassObj defClassHostNode = bootstrapDefClass( "HostNode", defClassObject );
		IYCFGenKbDefClassObj defClassISOCcy = bootstrapDefClass( "ISOCcy", defClassObject );
		IYCFGenKbDefClassObj defClassISOCtry = bootstrapDefClass( "ISOCtry", defClassObject );
		IYCFGenKbDefClassObj defClassISOCtryCcy = bootstrapDefClass( "ISOCtryCcy", defClassObject );
		IYCFGenKbDefClassObj defClassISOCtryLang = bootstrapDefClass( "ISOCtryLang", defClassObject );
		IYCFGenKbDefClassObj defClassISOLang = bootstrapDefClass( "ISOLang", defClassObject );
		IYCFGenKbDefClassObj defClassISOTZone = bootstrapDefClass( "ISOTZone", defClassObject );
		IYCFGenKbDefClassObj defClassIndexCol = bootstrapDefClass( "IndexCol", defClassObject );
		IYCFGenKbDefClassObj defClassLicense = bootstrapDefClass( "License", defClassObject );
		IYCFGenKbDefClassObj defClassMajorVersion = bootstrapDefClass( "MajorVersion", defClassObject );
		IYCFGenKbDefClassObj defClassMimeType = bootstrapDefClass( "MimeType", defClassObject );
		IYCFGenKbDefClassObj defClassMinorVersion = bootstrapDefClass( "MinorVersion", defClassObject );
		IYCFGenKbDefClassObj defClassParam = bootstrapDefClass( "Param", defClassObject );
		IYCFGenKbDefClassObj defClassRelationCol = bootstrapDefClass( "RelationCol", defClassObject );
		IYCFGenKbDefClassObj defClassRoleDef = bootstrapDefClass( "RoleDef", defClassObject );
		IYCFGenKbDefClassObj defClassSchemaRole = bootstrapDefClass( "SchemaRole", defClassRoleDef );
		IYCFGenKbDefClassObj defClassScope = bootstrapDefClass( "Scope", defClassObject );
		IYCFGenKbDefClassObj defClassSchemaDef = bootstrapDefClass( "SchemaDef", defClassScope );
		IYCFGenKbDefClassObj defClassSchemaRef = bootstrapDefClass( "SchemaRef", defClassScope );
		IYCFGenKbDefClassObj defClassServerMethod = bootstrapDefClass( "ServerMethod", defClassScope );
		IYCFGenKbDefClassObj defClassServerObjFunc = bootstrapDefClass( "ServerObjFunc", defClassServerMethod );
		IYCFGenKbDefClassObj defClassServerProc = bootstrapDefClass( "ServerProc", defClassServerMethod );
		IYCFGenKbDefClassObj defClassServerListFunc = bootstrapDefClass( "ServerListFunc", defClassServerMethod );
		IYCFGenKbDefClassObj defClassTable = bootstrapDefClass( "Table", defClassScope );
		IYCFGenKbDefClassObj defClassClearDep = bootstrapDefClass( "ClearDep", defClassScope );
		IYCFGenKbDefClassObj defClassClearSubDep1 = bootstrapDefClass( "ClearSubDep1", defClassClearDep );
		IYCFGenKbDefClassObj defClassClearSubDep2 = bootstrapDefClass( "ClearSubDep2", defClassClearDep );
		IYCFGenKbDefClassObj defClassClearSubDep3 = bootstrapDefClass( "ClearSubDep3", defClassClearDep );
		IYCFGenKbDefClassObj defClassClearTopDep = bootstrapDefClass( "ClearTopDep", defClassClearDep );
		IYCFGenKbDefClassObj defClassDelDep = bootstrapDefClass( "DelDep", defClassScope );
		IYCFGenKbDefClassObj defClassDelSubDep1 = bootstrapDefClass( "DelSubDep1", defClassDelDep );
		IYCFGenKbDefClassObj defClassDelSubDep2 = bootstrapDefClass( "DelSubDep2", defClassDelDep );
		IYCFGenKbDefClassObj defClassDelSubDep3 = bootstrapDefClass( "DelSubDep3", defClassDelDep );
		IYCFGenKbDefClassObj defClassDelTopDep = bootstrapDefClass( "DelTopDep", defClassDelDep );
		IYCFGenKbDefClassObj defClassIndex = bootstrapDefClass( "Index", defClassScope );
		IYCFGenKbDefClassObj defClassPopDep = bootstrapDefClass( "PopDep", defClassScope );
		IYCFGenKbDefClassObj defClassPopSubDep1 = bootstrapDefClass( "PopSubDep1", defClassPopDep );
		IYCFGenKbDefClassObj defClassPopSubDep2 = bootstrapDefClass( "PopSubDep2", defClassPopDep );
		IYCFGenKbDefClassObj defClassPopSubDep3 = bootstrapDefClass( "PopSubDep3", defClassPopDep );
		IYCFGenKbDefClassObj defClassPopTopDep = bootstrapDefClass( "PopTopDep", defClassPopDep );
		IYCFGenKbDefClassObj defClassRelation = bootstrapDefClass( "Relation", defClassScope );
		IYCFGenKbDefClassObj defClassSecApp = bootstrapDefClass( "SecApp", defClassObject );
		IYCFGenKbDefClassObj defClassSecDevice = bootstrapDefClass( "SecDevice", defClassObject );
		IYCFGenKbDefClassObj defClassSecForm = bootstrapDefClass( "SecForm", defClassObject );
		IYCFGenKbDefClassObj defClassSecGroup = bootstrapDefClass( "SecGroup", defClassObject );
		IYCFGenKbDefClassObj defClassSecGroupForm = bootstrapDefClass( "SecGroupForm", defClassObject );
		IYCFGenKbDefClassObj defClassSecGrpInc = bootstrapDefClass( "SecGrpInc", defClassObject );
		IYCFGenKbDefClassObj defClassSecGrpMemb = bootstrapDefClass( "SecGrpMemb", defClassObject );
		IYCFGenKbDefClassObj defClassSecSession = bootstrapDefClass( "SecSession", defClassObject );
		IYCFGenKbDefClassObj defClassSecUser = bootstrapDefClass( "SecUser", defClassObject );
		IYCFGenKbDefClassObj defClassService = bootstrapDefClass( "Service", defClassObject );
		IYCFGenKbDefClassObj defClassServiceType = bootstrapDefClass( "ServiceType", defClassObject );
		IYCFGenKbDefClassObj defClassSubProject = bootstrapDefClass( "SubProject", defClassObject );
		IYCFGenKbDefClassObj defClassSysCluster = bootstrapDefClass( "SysCluster", defClassObject );
		IYCFGenKbDefClassObj defClassTSecGroup = bootstrapDefClass( "TSecGroup", defClassObject );
		IYCFGenKbDefClassObj defClassTSecGrpInc = bootstrapDefClass( "TSecGrpInc", defClassObject );
		IYCFGenKbDefClassObj defClassTSecGrpMemb = bootstrapDefClass( "TSecGrpMemb", defClassObject );
		IYCFGenKbDefClassObj defClassTenant = bootstrapDefClass( "Tenant", defClassObject );
		IYCFGenKbDefClassObj defClassTld = bootstrapDefClass( "Tld", defClassObject );
		IYCFGenKbDefClassObj defClassTopDomain = bootstrapDefClass( "TopDomain", defClassObject );
		IYCFGenKbDefClassObj defClassTopProject = bootstrapDefClass( "TopProject", defClassObject );
		IYCFGenKbDefClassObj defClassTweak = bootstrapDefClass( "Tweak", defClassObject );
		IYCFGenKbDefClassObj defClassTableTweak = bootstrapDefClass( "TableTweak", defClassTweak );
		IYCFGenKbDefClassObj defClassSchemaTweak = bootstrapDefClass( "SchemaTweak", defClassTweak );
		IYCFGenKbDefClassObj defClassIndexTweak = bootstrapDefClass( "IndexTweak", defClassTweak );
		IYCFGenKbDefClassObj defClassURLProtocol = bootstrapDefClass( "URLProtocol", defClassObject );
		IYCFGenKbDefClassObj defClassValue = bootstrapDefClass( "Value", defClassObject );
		IYCFGenKbDefClassObj defClassAtom = bootstrapDefClass( "Atom", defClassValue );
		IYCFGenKbDefClassObj defClassBlobDef = bootstrapDefClass( "BlobDef", defClassAtom );
		IYCFGenKbDefClassObj defClassBlobType = bootstrapDefClass( "BlobType", defClassBlobDef );
		IYCFGenKbDefClassObj defClassBlobCol = bootstrapDefClass( "BlobCol", defClassBlobDef );
		IYCFGenKbDefClassObj defClassBoolDef = bootstrapDefClass( "BoolDef", defClassAtom );
		IYCFGenKbDefClassObj defClassBoolType = bootstrapDefClass( "BoolType", defClassBoolDef );
		IYCFGenKbDefClassObj defClassBoolCol = bootstrapDefClass( "BoolCol", defClassBoolDef );
		IYCFGenKbDefClassObj defClassDateDef = bootstrapDefClass( "DateDef", defClassAtom );
		IYCFGenKbDefClassObj defClassDateType = bootstrapDefClass( "DateType", defClassDateDef );
		IYCFGenKbDefClassObj defClassDateCol = bootstrapDefClass( "DateCol", defClassDateDef );
		IYCFGenKbDefClassObj defClassDoubleDef = bootstrapDefClass( "DoubleDef", defClassAtom );
		IYCFGenKbDefClassObj defClassDoubleType = bootstrapDefClass( "DoubleType", defClassDoubleDef );
		IYCFGenKbDefClassObj defClassDoubleCol = bootstrapDefClass( "DoubleCol", defClassDoubleDef );
		IYCFGenKbDefClassObj defClassFloatDef = bootstrapDefClass( "FloatDef", defClassAtom );
		IYCFGenKbDefClassObj defClassFloatType = bootstrapDefClass( "FloatType", defClassFloatDef );
		IYCFGenKbDefClassObj defClassFloatCol = bootstrapDefClass( "FloatCol", defClassFloatDef );
		IYCFGenKbDefClassObj defClassInt16Def = bootstrapDefClass( "Int16Def", defClassAtom );
		IYCFGenKbDefClassObj defClassInt16Type = bootstrapDefClass( "Int16Type", defClassInt16Def );
		IYCFGenKbDefClassObj defClassId16Gen = bootstrapDefClass( "Id16Gen", defClassInt16Type );
		IYCFGenKbDefClassObj defClassEnumDef = bootstrapDefClass( "EnumDef", defClassInt16Def );
		IYCFGenKbDefClassObj defClassEnumType = bootstrapDefClass( "EnumType", defClassEnumDef );
		IYCFGenKbDefClassObj defClassInt16Col = bootstrapDefClass( "Int16Col", defClassInt16Def );
		IYCFGenKbDefClassObj defClassInt32Def = bootstrapDefClass( "Int32Def", defClassAtom );
		IYCFGenKbDefClassObj defClassInt32Type = bootstrapDefClass( "Int32Type", defClassInt32Def );
		IYCFGenKbDefClassObj defClassId32Gen = bootstrapDefClass( "Id32Gen", defClassInt32Type );
		IYCFGenKbDefClassObj defClassInt32Col = bootstrapDefClass( "Int32Col", defClassInt32Def );
		IYCFGenKbDefClassObj defClassInt64Def = bootstrapDefClass( "Int64Def", defClassAtom );
		IYCFGenKbDefClassObj defClassInt64Type = bootstrapDefClass( "Int64Type", defClassInt64Def );
		IYCFGenKbDefClassObj defClassId64Gen = bootstrapDefClass( "Id64Gen", defClassInt64Type );
		IYCFGenKbDefClassObj defClassInt64Col = bootstrapDefClass( "Int64Col", defClassInt64Def );
		IYCFGenKbDefClassObj defClassNmTokenDef = bootstrapDefClass( "NmTokenDef", defClassAtom );
		IYCFGenKbDefClassObj defClassNmTokenType = bootstrapDefClass( "NmTokenType", defClassNmTokenDef );
		IYCFGenKbDefClassObj defClassNmTokenCol = bootstrapDefClass( "NmTokenCol", defClassNmTokenDef );
		IYCFGenKbDefClassObj defClassNmTokensDef = bootstrapDefClass( "NmTokensDef", defClassAtom );
		IYCFGenKbDefClassObj defClassNmTokensType = bootstrapDefClass( "NmTokensType", defClassNmTokensDef );
		IYCFGenKbDefClassObj defClassNmTokensCol = bootstrapDefClass( "NmTokensCol", defClassNmTokensDef );
		IYCFGenKbDefClassObj defClassNumberDef = bootstrapDefClass( "NumberDef", defClassAtom );
		IYCFGenKbDefClassObj defClassNumberType = bootstrapDefClass( "NumberType", defClassNumberDef );
		IYCFGenKbDefClassObj defClassNumberCol = bootstrapDefClass( "NumberCol", defClassNumberDef );
		IYCFGenKbDefClassObj defClassDbKeyHash128Def = bootstrapDefClass( "DbKeyHash128Def", defClassAtom );
		IYCFGenKbDefClassObj defClassDbKeyHash128Col = bootstrapDefClass( "DbKeyHash128Col", defClassDbKeyHash128Def );
		IYCFGenKbDefClassObj defClassDbKeyHash128Type = bootstrapDefClass( "DbKeyHash128Type", defClassDbKeyHash128Def );
		IYCFGenKbDefClassObj defClassDbKeyHash128Gen = bootstrapDefClass( "DbKeyHash128Gen", defClassDbKeyHash128Type );
		IYCFGenKbDefClassObj defClassDbKeyHash160Def = bootstrapDefClass( "DbKeyHash160Def", defClassAtom );
		IYCFGenKbDefClassObj defClassDbKeyHash160Col = bootstrapDefClass( "DbKeyHash160Col", defClassDbKeyHash160Def );
		IYCFGenKbDefClassObj defClassDbKeyHash160Type = bootstrapDefClass( "DbKeyHash160Type", defClassDbKeyHash160Def );
		IYCFGenKbDefClassObj defClassDbKeyHash160Gen = bootstrapDefClass( "DbKeyHash160Gen", defClassDbKeyHash160Type );
		IYCFGenKbDefClassObj defClassDbKeyHash224Def = bootstrapDefClass( "DbKeyHash224Def", defClassAtom );
		IYCFGenKbDefClassObj defClassDbKeyHash224Col = bootstrapDefClass( "DbKeyHash224Col", defClassDbKeyHash224Def );
		IYCFGenKbDefClassObj defClassDbKeyHash224Type = bootstrapDefClass( "DbKeyHash224Type", defClassDbKeyHash224Def );
		IYCFGenKbDefClassObj defClassDbKeyHash224Gen = bootstrapDefClass( "DbKeyHash224Gen", defClassDbKeyHash224Type );
		IYCFGenKbDefClassObj defClassDbKeyHash256Def = bootstrapDefClass( "DbKeyHash256Def", defClassAtom );
		IYCFGenKbDefClassObj defClassDbKeyHash256Col = bootstrapDefClass( "DbKeyHash256Col", defClassDbKeyHash256Def );
		IYCFGenKbDefClassObj defClassDbKeyHash256Type = bootstrapDefClass( "DbKeyHash256Type", defClassDbKeyHash256Def );
		IYCFGenKbDefClassObj defClassDbKeyHash256Gen = bootstrapDefClass( "DbKeyHash256Gen", defClassDbKeyHash256Type );
		IYCFGenKbDefClassObj defClassDbKeyHash384Def = bootstrapDefClass( "DbKeyHash384Def", defClassAtom );
		IYCFGenKbDefClassObj defClassDbKeyHash384Col = bootstrapDefClass( "DbKeyHash384Col", defClassDbKeyHash384Def );
		IYCFGenKbDefClassObj defClassDbKeyHash384Type = bootstrapDefClass( "DbKeyHash384Type", defClassDbKeyHash384Def );
		IYCFGenKbDefClassObj defClassDbKeyHash384Gen = bootstrapDefClass( "DbKeyHash384Gen", defClassDbKeyHash384Type );
		IYCFGenKbDefClassObj defClassDbKeyHash512Def = bootstrapDefClass( "DbKeyHash512Def", defClassAtom );
		IYCFGenKbDefClassObj defClassDbKeyHash512Col = bootstrapDefClass( "DbKeyHash512Col", defClassDbKeyHash512Def );
		IYCFGenKbDefClassObj defClassDbKeyHash512Type = bootstrapDefClass( "DbKeyHash512Type", defClassDbKeyHash512Def );
		IYCFGenKbDefClassObj defClassDbKeyHash512Gen = bootstrapDefClass( "DbKeyHash512Gen", defClassDbKeyHash512Type );
		IYCFGenKbDefClassObj defClassStringDef = bootstrapDefClass( "StringDef", defClassAtom );
		IYCFGenKbDefClassObj defClassStringType = bootstrapDefClass( "StringType", defClassStringDef );
		IYCFGenKbDefClassObj defClassStringCol = bootstrapDefClass( "StringCol", defClassStringDef );
		IYCFGenKbDefClassObj defClassTZDateDef = bootstrapDefClass( "TZDateDef", defClassAtom );
		IYCFGenKbDefClassObj defClassTZDateType = bootstrapDefClass( "TZDateType", defClassTZDateDef );
		IYCFGenKbDefClassObj defClassTZDateCol = bootstrapDefClass( "TZDateCol", defClassTZDateDef );
		IYCFGenKbDefClassObj defClassTZTimeDef = bootstrapDefClass( "TZTimeDef", defClassAtom );
		IYCFGenKbDefClassObj defClassTZTimeType = bootstrapDefClass( "TZTimeType", defClassTZTimeDef );
		IYCFGenKbDefClassObj defClassTZTimeCol = bootstrapDefClass( "TZTimeCol", defClassTZTimeDef );
		IYCFGenKbDefClassObj defClassTZTimestampDef = bootstrapDefClass( "TZTimestampDef", defClassAtom );
		IYCFGenKbDefClassObj defClassTZTimestampType = bootstrapDefClass( "TZTimestampType", defClassTZTimestampDef );
		IYCFGenKbDefClassObj defClassTZTimestampCol = bootstrapDefClass( "TZTimestampCol", defClassTZTimestampDef );
		IYCFGenKbDefClassObj defClassTextDef = bootstrapDefClass( "TextDef", defClassAtom );
		IYCFGenKbDefClassObj defClassTextType = bootstrapDefClass( "TextType", defClassTextDef );
		IYCFGenKbDefClassObj defClassTextCol = bootstrapDefClass( "TextCol", defClassTextDef );
		IYCFGenKbDefClassObj defClassTimeDef = bootstrapDefClass( "TimeDef", defClassAtom );
		IYCFGenKbDefClassObj defClassTimeType = bootstrapDefClass( "TimeType", defClassTimeDef );
		IYCFGenKbDefClassObj defClassTimeCol = bootstrapDefClass( "TimeCol", defClassTimeDef );
		IYCFGenKbDefClassObj defClassTimestampDef = bootstrapDefClass( "TimestampDef", defClassAtom );
		IYCFGenKbDefClassObj defClassTimestampType = bootstrapDefClass( "TimestampType", defClassTimestampDef );
		IYCFGenKbDefClassObj defClassTimestampCol = bootstrapDefClass( "TimestampCol", defClassTimestampDef );
		IYCFGenKbDefClassObj defClassTokenDef = bootstrapDefClass( "TokenDef", defClassAtom );
		IYCFGenKbDefClassObj defClassTokenType = bootstrapDefClass( "TokenType", defClassTokenDef );
		IYCFGenKbDefClassObj defClassTokenCol = bootstrapDefClass( "TokenCol", defClassTokenDef );
		IYCFGenKbDefClassObj defClassUInt16Def = bootstrapDefClass( "UInt16Def", defClassAtom );
		IYCFGenKbDefClassObj defClassUInt16Type = bootstrapDefClass( "UInt16Type", defClassUInt16Def );
		IYCFGenKbDefClassObj defClassUInt16Col = bootstrapDefClass( "UInt16Col", defClassUInt16Def );
		IYCFGenKbDefClassObj defClassUInt32Def = bootstrapDefClass( "UInt32Def", defClassAtom );
		IYCFGenKbDefClassObj defClassUInt32Type = bootstrapDefClass( "UInt32Type", defClassUInt32Def );
		IYCFGenKbDefClassObj defClassUInt32Col = bootstrapDefClass( "UInt32Col", defClassUInt32Def );
		IYCFGenKbDefClassObj defClassUInt64Def = bootstrapDefClass( "UInt64Def", defClassAtom );
		IYCFGenKbDefClassObj defClassUInt64Type = bootstrapDefClass( "UInt64Type", defClassUInt64Def );
		IYCFGenKbDefClassObj defClassUInt64Col = bootstrapDefClass( "UInt64Col", defClassUInt64Def );
		IYCFGenKbDefClassObj defClassUuidDef = bootstrapDefClass( "UuidDef", defClassAtom );
		IYCFGenKbDefClassObj defClassUuidType = bootstrapDefClass( "UuidType", defClassUuidDef );
		IYCFGenKbDefClassObj defClassUuidGen = bootstrapDefClass( "UuidGen", defClassUuidType );
		IYCFGenKbDefClassObj defClassUuidCol = bootstrapDefClass( "UuidCol", defClassUuidDef );
		IYCFGenKbDefClassObj defClassUuid6Def = bootstrapDefClass( "Uuid6Def", defClassAtom );
		IYCFGenKbDefClassObj defClassUuid6Type = bootstrapDefClass( "Uuid6Type", defClassUuid6Def );
		IYCFGenKbDefClassObj defClassUuid6Gen = bootstrapDefClass( "Uuid6Gen", defClassUuid6Type );
		IYCFGenKbDefClassObj defClassUuid6Col = bootstrapDefClass( "Uuid6Col", defClassUuid6Def );
		IYCFGenKbDefClassObj defClassTableCol = bootstrapDefClass( "TableCol", defClassValue );
	}

	public void bootstrapBindings() {
		IYCFGenKbRuleCartObj ruleCart = this.getInternalRuleCart();
		IYCFGenKbRuleTypeObj ruleTypeBind = this.getRuleTypeTableObj().readRuleTypeByNameIdx("Bind");

		bootstrapAtomBindings(ruleCart, ruleTypeBind);
		bootstrapBlobColBindings(ruleCart, ruleTypeBind);
		bootstrapBlobDefBindings(ruleCart, ruleTypeBind);
		bootstrapBlobTypeBindings(ruleCart, ruleTypeBind);
		bootstrapBoolColBindings(ruleCart, ruleTypeBind);
		bootstrapBoolDefBindings(ruleCart, ruleTypeBind);
		bootstrapBoolTypeBindings(ruleCart, ruleTypeBind);
		bootstrapChainBindings(ruleCart, ruleTypeBind);
		bootstrapClearDepBindings(ruleCart, ruleTypeBind);
		bootstrapClearSubDep1Bindings(ruleCart, ruleTypeBind);
		bootstrapClearSubDep2Bindings(ruleCart, ruleTypeBind);
		bootstrapClearSubDep3Bindings(ruleCart, ruleTypeBind);
		bootstrapClearTopDepBindings(ruleCart, ruleTypeBind);
		bootstrapClusterBindings(ruleCart, ruleTypeBind);
		bootstrapDateColBindings(ruleCart, ruleTypeBind);
		bootstrapDateDefBindings(ruleCart, ruleTypeBind);
		bootstrapDateTypeBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash128ColBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash128DefBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash128GenBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash128TypeBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash160ColBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash160DefBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash160GenBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash160TypeBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash224ColBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash224DefBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash224GenBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash224TypeBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash256ColBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash256DefBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash256GenBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash256TypeBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash384ColBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash384DefBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash384GenBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash384TypeBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash512ColBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash512DefBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash512GenBindings(ruleCart, ruleTypeBind);
		bootstrapDbKeyHash512TypeBindings(ruleCart, ruleTypeBind);
		bootstrapDelDepBindings(ruleCart, ruleTypeBind);
		bootstrapDelSubDep1Bindings(ruleCart, ruleTypeBind);
		bootstrapDelSubDep2Bindings(ruleCart, ruleTypeBind);
		bootstrapDelSubDep3Bindings(ruleCart, ruleTypeBind);
		bootstrapDelTopDepBindings(ruleCart, ruleTypeBind);
		bootstrapDoubleColBindings(ruleCart, ruleTypeBind);
		bootstrapDoubleDefBindings(ruleCart, ruleTypeBind);
		bootstrapDoubleTypeBindings(ruleCart, ruleTypeBind);
		bootstrapEnumDefBindings(ruleCart, ruleTypeBind);
		bootstrapEnumTagBindings(ruleCart, ruleTypeBind);
		bootstrapEnumTypeBindings(ruleCart, ruleTypeBind);
		bootstrapFloatColBindings(ruleCart, ruleTypeBind);
		bootstrapFloatDefBindings(ruleCart, ruleTypeBind);
		bootstrapFloatTypeBindings(ruleCart, ruleTypeBind);
		bootstrapHostNodeBindings(ruleCart, ruleTypeBind);
		bootstrapISOCcyBindings(ruleCart, ruleTypeBind);
		bootstrapISOCtryBindings(ruleCart, ruleTypeBind);
		bootstrapISOCtryCcyBindings(ruleCart, ruleTypeBind);
		bootstrapISOCtryLangBindings(ruleCart, ruleTypeBind);
		bootstrapISOLangBindings(ruleCart, ruleTypeBind);
		bootstrapISOTZoneBindings(ruleCart, ruleTypeBind);
		bootstrapId16GenBindings(ruleCart, ruleTypeBind);
		bootstrapId32GenBindings(ruleCart, ruleTypeBind);
		bootstrapId64GenBindings(ruleCart, ruleTypeBind);
		bootstrapIndexBindings(ruleCart, ruleTypeBind);
		bootstrapIndexColBindings(ruleCart, ruleTypeBind);
		bootstrapIndexTweakBindings(ruleCart, ruleTypeBind);
		bootstrapInt16ColBindings(ruleCart, ruleTypeBind);
		bootstrapInt16DefBindings(ruleCart, ruleTypeBind);
		bootstrapInt16TypeBindings(ruleCart, ruleTypeBind);
		bootstrapInt32ColBindings(ruleCart, ruleTypeBind);
		bootstrapInt32DefBindings(ruleCart, ruleTypeBind);
		bootstrapInt32TypeBindings(ruleCart, ruleTypeBind);
		bootstrapInt64ColBindings(ruleCart, ruleTypeBind);
		bootstrapInt64DefBindings(ruleCart, ruleTypeBind);
		bootstrapInt64TypeBindings(ruleCart, ruleTypeBind);
		bootstrapLicenseBindings(ruleCart, ruleTypeBind);
		bootstrapMajorVersionBindings(ruleCart, ruleTypeBind);
		bootstrapMimeTypeBindings(ruleCart, ruleTypeBind);
		bootstrapMinorVersionBindings(ruleCart, ruleTypeBind);
		bootstrapNmTokenColBindings(ruleCart, ruleTypeBind);
		bootstrapNmTokenDefBindings(ruleCart, ruleTypeBind);
		bootstrapNmTokenTypeBindings(ruleCart, ruleTypeBind);
		bootstrapNmTokensColBindings(ruleCart, ruleTypeBind);
		bootstrapNmTokensDefBindings(ruleCart, ruleTypeBind);
		bootstrapNmTokensTypeBindings(ruleCart, ruleTypeBind);
		bootstrapNumberColBindings(ruleCart, ruleTypeBind);
		bootstrapNumberDefBindings(ruleCart, ruleTypeBind);
		bootstrapNumberTypeBindings(ruleCart, ruleTypeBind);
		bootstrapParamBindings(ruleCart, ruleTypeBind);
		bootstrapPopDepBindings(ruleCart, ruleTypeBind);
		bootstrapPopSubDep1Bindings(ruleCart, ruleTypeBind);
		bootstrapPopSubDep2Bindings(ruleCart, ruleTypeBind);
		bootstrapPopSubDep3Bindings(ruleCart, ruleTypeBind);
		bootstrapPopTopDepBindings(ruleCart, ruleTypeBind);
		bootstrapRelationBindings(ruleCart, ruleTypeBind);
		bootstrapRelationColBindings(ruleCart, ruleTypeBind);
		bootstrapRoleDefBindings(ruleCart, ruleTypeBind);
		bootstrapSchemaDefBindings(ruleCart, ruleTypeBind);
		bootstrapSchemaRefBindings(ruleCart, ruleTypeBind);
		bootstrapSchemaRoleBindings(ruleCart, ruleTypeBind);
		bootstrapSchemaTweakBindings(ruleCart, ruleTypeBind);
		bootstrapScopeBindings(ruleCart, ruleTypeBind);
		bootstrapSecAppBindings(ruleCart, ruleTypeBind);
		bootstrapSecDeviceBindings(ruleCart, ruleTypeBind);
		bootstrapSecFormBindings(ruleCart, ruleTypeBind);
		bootstrapSecGroupBindings(ruleCart, ruleTypeBind);
		bootstrapSecGroupFormBindings(ruleCart, ruleTypeBind);
		bootstrapSecGrpIncBindings(ruleCart, ruleTypeBind);
		bootstrapSecGrpMembBindings(ruleCart, ruleTypeBind);
		bootstrapSecSessionBindings(ruleCart, ruleTypeBind);
		bootstrapSecUserBindings(ruleCart, ruleTypeBind);
		bootstrapServerListFuncBindings(ruleCart, ruleTypeBind);
		bootstrapServerMethodBindings(ruleCart, ruleTypeBind);
		bootstrapServerObjFuncBindings(ruleCart, ruleTypeBind);
		bootstrapServerProcBindings(ruleCart, ruleTypeBind);
		bootstrapServiceBindings(ruleCart, ruleTypeBind);
		bootstrapServiceTypeBindings(ruleCart, ruleTypeBind);
		bootstrapStringColBindings(ruleCart, ruleTypeBind);
		bootstrapStringDefBindings(ruleCart, ruleTypeBind);
		bootstrapStringTypeBindings(ruleCart, ruleTypeBind);
		bootstrapSubProjectBindings(ruleCart, ruleTypeBind);
		bootstrapSysClusterBindings(ruleCart, ruleTypeBind);
		bootstrapTSecGroupBindings(ruleCart, ruleTypeBind);
		bootstrapTSecGrpIncBindings(ruleCart, ruleTypeBind);
		bootstrapTSecGrpMembBindings(ruleCart, ruleTypeBind);
		bootstrapTZDateColBindings(ruleCart, ruleTypeBind);
		bootstrapTZDateDefBindings(ruleCart, ruleTypeBind);
		bootstrapTZDateTypeBindings(ruleCart, ruleTypeBind);
		bootstrapTZTimeColBindings(ruleCart, ruleTypeBind);
		bootstrapTZTimeDefBindings(ruleCart, ruleTypeBind);
		bootstrapTZTimeTypeBindings(ruleCart, ruleTypeBind);
		bootstrapTZTimestampColBindings(ruleCart, ruleTypeBind);
		bootstrapTZTimestampDefBindings(ruleCart, ruleTypeBind);
		bootstrapTZTimestampTypeBindings(ruleCart, ruleTypeBind);
		bootstrapTableBindings(ruleCart, ruleTypeBind);
		bootstrapTableColBindings(ruleCart, ruleTypeBind);
		bootstrapTableTweakBindings(ruleCart, ruleTypeBind);
		bootstrapTenantBindings(ruleCart, ruleTypeBind);
		bootstrapTextColBindings(ruleCart, ruleTypeBind);
		bootstrapTextDefBindings(ruleCart, ruleTypeBind);
		bootstrapTextTypeBindings(ruleCart, ruleTypeBind);
		bootstrapTimeColBindings(ruleCart, ruleTypeBind);
		bootstrapTimeDefBindings(ruleCart, ruleTypeBind);
		bootstrapTimeTypeBindings(ruleCart, ruleTypeBind);
		bootstrapTimestampColBindings(ruleCart, ruleTypeBind);
		bootstrapTimestampDefBindings(ruleCart, ruleTypeBind);
		bootstrapTimestampTypeBindings(ruleCart, ruleTypeBind);
		bootstrapTldBindings(ruleCart, ruleTypeBind);
		bootstrapTokenColBindings(ruleCart, ruleTypeBind);
		bootstrapTokenDefBindings(ruleCart, ruleTypeBind);
		bootstrapTokenTypeBindings(ruleCart, ruleTypeBind);
		bootstrapTopDomainBindings(ruleCart, ruleTypeBind);
		bootstrapTopProjectBindings(ruleCart, ruleTypeBind);
		bootstrapTweakBindings(ruleCart, ruleTypeBind);
		bootstrapUInt16ColBindings(ruleCart, ruleTypeBind);
		bootstrapUInt16DefBindings(ruleCart, ruleTypeBind);
		bootstrapUInt16TypeBindings(ruleCart, ruleTypeBind);
		bootstrapUInt32ColBindings(ruleCart, ruleTypeBind);
		bootstrapUInt32DefBindings(ruleCart, ruleTypeBind);
		bootstrapUInt32TypeBindings(ruleCart, ruleTypeBind);
		bootstrapUInt64ColBindings(ruleCart, ruleTypeBind);
		bootstrapUInt64DefBindings(ruleCart, ruleTypeBind);
		bootstrapUInt64TypeBindings(ruleCart, ruleTypeBind);
		bootstrapURLProtocolBindings(ruleCart, ruleTypeBind);
		bootstrapUuid6ColBindings(ruleCart, ruleTypeBind);
		bootstrapUuid6DefBindings(ruleCart, ruleTypeBind);
		bootstrapUuid6GenBindings(ruleCart, ruleTypeBind);
		bootstrapUuid6TypeBindings(ruleCart, ruleTypeBind);
		bootstrapUuidColBindings(ruleCart, ruleTypeBind);
		bootstrapUuidDefBindings(ruleCart, ruleTypeBind);
		bootstrapUuidGenBindings(ruleCart, ruleTypeBind);
		bootstrapUuidTypeBindings(ruleCart, ruleTypeBind);
		bootstrapValueBindings(ruleCart, ruleTypeBind);
	}

	protected void bootstrapAtomBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindAtomDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasAtomDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapBlobColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindBlobColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapBlobDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindBlobDefMaxLen( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindBlobDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasBlobDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapBlobTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindBlobTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapBoolColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindBoolColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapBoolDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindBoolDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasBoolDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindBoolDefFalseString( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasBoolDefFalseString( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindBoolDefTrueString( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasBoolDefTrueString( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindBoolDefNullString( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasBoolDefNullString( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapBoolTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindBoolTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapChainBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindChainTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasChainDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasChainDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasChainShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasChainLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasChainShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasChainDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainSuffix( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasChainSuffix( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainPrevRelationTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainPrevRelationId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainNextRelationTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindChainNextRelationId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasChainDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapClearDepBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindClearDepRelationId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearDepDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasClearDepDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearDepDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasClearDepDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasClearDepDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapClearSubDep1Bindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindClearSubDep1ClearTopDepTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearSubDep1ClearTopDepId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearSubDep1Name( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapClearSubDep2Bindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindClearSubDep2ClearSubDep1TenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearSubDep2ClearSubDep1Id( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearSubDep2Name( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapClearSubDep3Bindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindClearSubDep3ClearSubDep2TenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearSubDep3ClearSubDep2Id( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearSubDep3Name( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapClearTopDepBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindClearTopDepTableTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearTopDepTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearTopDepName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearTopDepPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasClearTopDepPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearTopDepPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasClearTopDepPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearTopDepNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasClearTopDepNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClearTopDepNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasClearTopDepNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasClearTopDepPrev( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasClearTopDepNext( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapClusterBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClusterFullDomName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindClusterDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDateColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDateColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDateDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDateDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDateDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDateTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDateTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash128ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash128ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash128DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash128DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash128DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash128GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash128GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash128GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash128GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash128GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash128GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash128GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash128GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash128TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash128TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash160ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash160ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash160DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash160DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash160DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash160GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash160GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash160GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash160GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash160GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash160GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash160GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash160GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash160TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash160TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash224ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash224ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash224DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash224DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash224DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash224GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash224GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash224GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash224GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash224GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash224GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash224GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash224GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash224TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash224TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash256ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash256ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash256DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash256DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash256DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash256GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash256GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash256GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash256GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash256GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash256GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash256GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash256GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash256TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash256TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash384ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash384ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash384DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash384DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash384DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash384GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash384GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash384GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash384GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash384GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash384GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash384GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash384GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash384TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash384TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash512ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash512ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash512DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash512DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash512DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash512GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash512GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash512GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash512GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash512GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash512GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash512GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDbKeyHash512GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDbKeyHash512TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDbKeyHash512TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDelDepBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDelDepDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDelDepDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelDepDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDelDepDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelDepRelationTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelDepRelationId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDelDepDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDelSubDep1Bindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDelSubDep1DelTopDepTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelSubDep1DelTopDepId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelSubDep1Name( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDelSubDep2Bindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDelSubDep2DelSubDep1TenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelSubDep2DelSubDep1Id( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelSubDep2Name( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDelSubDep3Bindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDelSubDep3DelSubDep2TenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelSubDep3DelSubDep2Id( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelSubDep3Name( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDelTopDepBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDelTopDepName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelTopDepTableTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelTopDepTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelTopDepPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDelTopDepPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelTopDepPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDelTopDepPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelTopDepNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDelTopDepNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDelTopDepNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDelTopDepNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDelTopDepPrev( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDelTopDepNext( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDoubleColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDoubleColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDoubleDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDoubleDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDoubleDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDoubleDefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDoubleDefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindDoubleDefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasDoubleDefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapDoubleTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindDoubleTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapEnumDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

	}

	protected void bootstrapEnumTagBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindEnumTagTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagEnumId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagEnumCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagEnumCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindEnumTagNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagPrev( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasEnumTagNext( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapEnumTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindEnumTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapFloatColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindFloatColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapFloatDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindFloatDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasFloatDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindFloatDefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasFloatDefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindFloatDefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasFloatDefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapFloatTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindFloatTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapHostNodeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindHostNodeClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHostNodeHostNodeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHostNodeDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHostNodeHostName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapISOCcyBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindISOCcyISOCcyId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOCcyISOCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOCcyName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOCcyUnitSymbol( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasISOCcyUnitSymbol( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOCcyPrecis( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapISOCtryBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindISOCtryISOCtryId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOCtryISOCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOCtryName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapISOCtryCcyBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindISOCtryCcyISOCtryId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOCtryCcyISOCcyId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapISOCtryLangBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindISOCtryLangISOCtryId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOCtryLangISOLangId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapISOLangBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindISOLangISOLangId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOLangISO6392Code( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOLangISO6391Code( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasISOLangISO6391Code( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOLangEnglishName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapISOTZoneBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindISOTZoneISOTZoneId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOTZoneIso8601( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOTZoneTZName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOTZoneTZHourOffset( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOTZoneTZMinOffset( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOTZoneDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindISOTZoneVisible( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapId16GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindId16GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasId16GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindId16GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasId16GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindId16GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindId16GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasId16GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapId32GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindId32GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasId32GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindId32GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasId32GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindId32GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindId32GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasId32GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapId64GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindId64GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasId64GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindId64GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasId64GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindId64GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindId64GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasId64GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapIndexBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindIndexTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexSuffix( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexSuffix( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexIsUnique( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexIsDbMapped( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexCodeVis( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapIndexColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindIndexColTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColColumnId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColIsAscending( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindIndexColNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColPrev( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasIndexColNext( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapIndexTweakBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindIndexTweakIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapInt16ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindInt16ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapInt16DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindInt16DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasInt16DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindInt16DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasInt16DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindInt16DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasInt16DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapInt16TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindInt16TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapInt32ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindInt32ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapInt32DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindInt32DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasInt32DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindInt32DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasInt32DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindInt32DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasInt32DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapInt32TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindInt32TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapInt64ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindInt64ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapInt64DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindInt64DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasInt64DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindInt64DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasInt64DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindInt64DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasInt64DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapInt64TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindInt64TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapLicenseBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindLicenseTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindLicenseId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindLicenseTopDomainId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindLicenseDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasLicenseDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindLicenseEmbeddedText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasLicenseEmbeddedText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindLicenseFullText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasLicenseFullText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapMajorVersionBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindMajorVersionTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMajorVersionId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMajorVersionSubProjectId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMajorVersionName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMajorVersionDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasMajorVersionDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapMimeTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindMimeTypeMimeTypeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMimeTypeName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMimeTypeFileTypes( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasMimeTypeFileTypes( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapMinorVersionBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindMinorVersionTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMinorVersionId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMinorVersionMajorVersionId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMinorVersionName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindMinorVersionDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasMinorVersionDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapNmTokenColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindNmTokenColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapNmTokenDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindNmTokenDefMaxLen( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindNmTokenDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasNmTokenDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapNmTokenTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindNmTokenTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapNmTokensColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindNmTokensColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapNmTokensDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindNmTokensDefMaxLen( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindNmTokensDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasNmTokensDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapNmTokensTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindNmTokensTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapNumberColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindNumberColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapNumberDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindNumberDefDigits( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindNumberDefPrecis( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindNumberDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasNumberDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindNumberDefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasNumberDefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindNumberDefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasNumberDefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapNumberTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindNumberTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapParamBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindParamTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamServerMethodId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamIsNullable( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamTypeTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamTypeTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamTypeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamTypeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindParamNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamPrev( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasParamNext( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapPopDepBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindPopDepDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasPopDepDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopDepDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasPopDepDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopDepRelationTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopDepRelationId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasPopDepDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapPopSubDep1Bindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindPopSubDep1PopTopDepTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopSubDep1PopTopDepId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopSubDep1Name( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapPopSubDep2Bindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindPopSubDep2PopSubDep1TenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopSubDep2PopSubDep1Id( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopSubDep2Name( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapPopSubDep3Bindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindPopSubDep3PopSubDep2TenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopSubDep3PopSubDep2Id( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopSubDep3Name( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapPopTopDepBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindPopTopDepContRelationTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopTopDepContRelationId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindPopTopDepName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapRelationBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindRelationTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationRelationType( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationSuffix( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationSuffix( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationFromIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationToTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationToIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationIsRequired( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationIsXsdContainer( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationIsLateResolver( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationAllowAddendum( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationNarrowedTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationNarrowedTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationNarrowedId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationNarrowedId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationCodeVis( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationNarrowed( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapRelationColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindRelationColTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColRelationId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColFromColId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColToColId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRelationColNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColPrev( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRelationColNext( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapRoleDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindRoleDefTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRoleDefScopeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRoleDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRoleDefDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRoleDefDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRoleDefDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRoleDefDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRoleDefName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRoleDefEnables( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindRoleDefIncludes( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasRoleDefDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSchemaDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefMinorVersionId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCopyrightPeriod( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCopyrightHolder( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefAuthorEMail( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefProjectURL( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefPublishURI( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCommonLicenseCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCommonLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCommonLicenseText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefClientXFaceLicenseCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefClientXFaceLicenseCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefClientXFaceLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefClientXFaceLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefClientXFaceLicenseText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefClientXFaceLicenseText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefClientImplLicenseCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefClientImplLicenseCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefClientImplLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefClientImplLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefClientImplLicenseText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefClientImplLicenseText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefServerXFaceLicenseCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefServerXFaceLicenseCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefServerXFaceLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefServerXFaceLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefServerXFaceLicenseText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefServerXFaceLicenseText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefServerImplLicenseCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefServerImplLicenseCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefServerImplLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefServerImplLicenseName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefServerImplLicenseText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefServerImplLicenseText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJSchemaObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJSchemaObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJSchemaObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJSchemaObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJDb2LUWSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJDb2LUWSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJDb2LUWSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJDb2LUWSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJDb2LUWSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJDb2LUWSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJMSSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJMSSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJMSSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJMSSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJMSSqlSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJMSSqlSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJMySqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJMySqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJMySqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJMySqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJMySqlSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJMySqlSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJOracleSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJOracleSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJOracleSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJOracleSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJOracleSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJOracleSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJPgSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJPgSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJPgSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJPgSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJPgSqlSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJPgSqlSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJRamSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJRamSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJRamSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJRamSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJRamSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJRamSchemaObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgSchemaImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgSchemaImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgSchemaFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgSchemaFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgClientSchemaImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgClientSchemaImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgClientSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgClientSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRqstSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRqstSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRqstSchemaImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRqstSchemaImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRqstSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRqstSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRqstSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRqstSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRqstSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRqstSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRspnSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRspnSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRspnSchemaImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRspnSchemaImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRspnSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRspnSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRspnSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRspnSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefJXMsgRspnSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefJXMsgRspnSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppSchemaObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppSchemaObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppSchemaObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppSchemaObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppDb2LUWSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppDb2LUWSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppDb2LUWSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppDb2LUWSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppDb2LUWSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppDb2LUWSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppMSSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppMSSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppMSSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppMSSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppMSSqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppMSSqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppMySqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppMySqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppMySqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppMySqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppMySqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppMySqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppOracleSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppOracleSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppOracleSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppOracleSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppOracleSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppOracleSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppPgSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppPgSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppPgSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppPgSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppPgSqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppPgSqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppRamSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppRamSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppRamSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppRamSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppRamSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppRamSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgSchemaFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgSchemaFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgClientSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgClientSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgClientSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgClientSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRqstSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRqstSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRqstSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRqstSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRqstSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRqstSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRqstSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRqstSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRqstSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRqstSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRspnSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRspnSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRspnSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRspnSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRspnSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRspnSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRspnSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRspnSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCppXMsgRspnSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCppXMsgRspnSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppSchemaObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppSchemaObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppSchemaObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppSchemaObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppDb2LUWSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppDb2LUWSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppDb2LUWSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppDb2LUWSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppDb2LUWSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppDb2LUWSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppMSSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppMSSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppMSSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppMSSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppMSSqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppMSSqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppMySqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppMySqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppMySqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppMySqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppMySqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppMySqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppOracleSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppOracleSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppOracleSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppOracleSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppOracleSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppOracleSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppPgSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppPgSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppPgSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppPgSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppPgSqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppPgSqlSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppRamSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppRamSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppRamSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppRamSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppRamSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppRamSchemaObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgSchemaFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgSchemaFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgClientSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgClientSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgClientSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgClientSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRqstSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRqstSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRqstSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRqstSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRqstSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRqstSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRqstSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRqstSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRqstSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRqstSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRspnSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRspnSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRspnSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRspnSchemaInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRspnSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRspnSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRspnSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRspnSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefHppXMsgRspnSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefHppXMsgRspnSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsSchemaObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsSchemaObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsSchemaObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsSchemaObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsDb2LUWSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsDb2LUWSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsDb2LUWSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsDb2LUWSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsDb2LUWSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsDb2LUWSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsMSSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsMSSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsMSSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsMSSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsMSSqlSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsMSSqlSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsMySqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsMySqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsMySqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsMySqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsMySqlSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsMySqlSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsOracleSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsOracleSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsOracleSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsOracleSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsOracleSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsOracleSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsPgSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsPgSqlSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsPgSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsPgSqlSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsPgSqlSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsPgSqlSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsRamSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsRamSchemaObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsRamSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsRamSchemaObjImpl( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsRamSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsRamSchemaObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgSchemaUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgSchemaUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgSchemaFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgSchemaFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgClientSchemaUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgClientSchemaUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgClientSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgClientSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRqstSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRqstSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRqstSchemaUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRqstSchemaUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRqstSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRqstSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRqstSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRqstSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRqstSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRqstSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRspnSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRspnSchemaBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRspnSchemaUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRspnSchemaUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRspnSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRspnSchemaWireParsers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRspnSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRspnSchemaXsdElementList( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaDefCsXMsgRspnSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaDefCsXMsgRspnSchemaXsdSpec( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSchemaRefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefRefModelName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefIncludeRoot( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefRefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaRefRefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefRefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaRefRefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaRefPrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaRefPrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaRefNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRefNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaRefNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaRefRefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaRefPrev( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSchemaRefNext( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSchemaRoleBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSchemaRoleSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSchemaRoleRoleScope( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSchemaTweakBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSchemaTweakSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapScopeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindScopeTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindScopeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSecAppBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSecAppClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecAppSecAppId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecAppJEEMountName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSecDeviceBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSecDeviceSecUserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecDeviceDevName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecDevicePubKey( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSecDevicePubKey( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSecFormBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSecFormClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecFormSecFormId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecFormSecAppId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecFormJEEServletMapName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSecGroupBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSecGroupClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGroupSecGroupId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGroupName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGroupIsVisible( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSecGroupFormBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSecGroupFormClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGroupFormSecGroupFormId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGroupFormSecGroupId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGroupFormSecAppId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGroupFormSecFormId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSecGrpIncBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSecGrpIncClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGrpIncSecGrpIncId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGrpIncSecGroupId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGrpIncIncludeGroupId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSecGrpMembBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSecGrpMembClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGrpMembSecGrpMembId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGrpMembSecGroupId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecGrpMembSecUserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSecSessionBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSecSessionSecSessionId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecSessionSecUserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecSessionSecDevName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSecSessionSecDevName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecSessionStart( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecSessionFinish( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSecSessionFinish( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecSessionSecProxyId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSecSessionSecProxyId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSecUserBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSecUserSecUserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecUserLoginId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecUserEMailAddress( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecUserEMailConfirmUuid( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSecUserEMailConfirmUuid( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecUserDfltDevUserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSecUserDfltDevUserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecUserDfltDevName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSecUserDfltDevName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecUserPasswordHash( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSecUserPasswordResetUuid( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSecUserPasswordResetUuid( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSecUserDefDev( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapServerListFuncBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindServerListFuncRetTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerListFuncRetTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerListFuncRetTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerListFuncRetTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerListFuncRetTable( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapServerMethodBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindServerMethodTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerMethodDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerMethodDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerMethodShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerMethodLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerMethodShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerMethodDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodSuffix( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerMethodSuffix( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodIsInstanceMethod( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodIsServerOnly( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodCodeVis( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodJMethodBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodCppMethodBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerMethodCsMethodBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerMethodDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapServerObjFuncBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindServerObjFuncRetTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerObjFuncRetTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServerObjFuncRetTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerObjFuncRetTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerObjFuncRetTable( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapServerProcBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindServerProcDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServerProcDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapServiceBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindServiceClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServiceServiceId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServiceHostNodeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServiceServiceTypeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServiceHostPort( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServiceHost( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasServiceServiceType( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapServiceTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindServiceTypeServiceTypeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindServiceTypeDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapStringColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindStringColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapStringDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindStringDefMaxLen( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindStringDefIsPolymorph( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindStringDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasStringDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapStringTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindStringTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSubProjectBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSubProjectTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSubProjectId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSubProjectTopProjectId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSubProjectName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSubProjectDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasSubProjectDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapSysClusterBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindSysClusterSingletonId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindSysClusterClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTSecGroupBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTSecGroupTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTSecGroupTSecGroupId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTSecGroupName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTSecGroupIsVisible( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTSecGrpIncBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTSecGrpIncTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTSecGrpIncTSecGrpIncId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTSecGrpIncTSecGroupId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTSecGrpIncIncludeGroupId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTSecGrpMembBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTSecGrpMembTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTSecGrpMembTSecGrpMembId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTSecGrpMembTSecGroupId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTSecGrpMembSecUserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTZDateColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTZDateColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTZDateDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTZDateDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTZDateDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTZDateTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTZDateTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTZTimeColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTZTimeColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTZTimeDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTZTimeDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTZTimeDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTZTimeTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTZTimeTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTZTimestampColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTZTimestampColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTZTimestampDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTZTimestampDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTZTimestampDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTZTimestampTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTZTimestampTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTableBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTableSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTablePageData( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTablePrimaryIndexTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTablePrimaryIndexTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTablePrimaryIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTablePrimaryIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableTableClassCode( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableLookupIndexTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableLookupIndexTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableLookupIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableLookupIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableAltIndexTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableAltIndexTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableAltIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableAltIndexId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableQualifyingTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableQualifyingTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableQualifyingTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableQualifyingTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableIsInstantiable( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHasHistory( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHasAuditColumns( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableIsMutable( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableIsServerOnly( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableLoaderBehaviour( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableSecScope( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCodeVis( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJEditObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJEditObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJEditObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJEditObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJEditObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJEditObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJEditObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJEditObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJTableInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJTableInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJTableObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJTableObjImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJTableObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJTableObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJTableObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJTableObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJTableObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJTableObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJDb2LUWTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJDb2LUWTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJDb2LUWTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJDb2LUWTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJDb2LUWTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJDb2LUWTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJMSSqlTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJMSSqlTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJMSSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJMSSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJMSSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJMSSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJMySqlTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJMySqlTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJMySqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJMySqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJMySqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJMySqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJOracleTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJOracleTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJOracleTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJOracleTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJOracleTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJOracleTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJPgSqlTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJPgSqlTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJPgSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJPgSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJPgSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJPgSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJRamTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJRamTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJRamTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJRamTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJRamTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJRamTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJSaxLoaderImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJSaxLoaderImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJSaxLoaderStartElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJSaxLoaderStartElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJSaxLoaderEndElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJSaxLoaderEndElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJXMsgTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJXMsgTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJXMsgTableFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJXMsgTableFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJXMsgRqstTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJXMsgRqstTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJXMsgRspnTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJXMsgRspnTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJXMsgClientTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJXMsgClientTableImport( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJXMsgRqstTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJXMsgRqstTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJXMsgRspnTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJXMsgRspnTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableJXMsgClientTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableJXMsgClientTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppEditObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppEditObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppEditObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppEditObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppEditObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppEditObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppEditObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppEditObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppTableInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppTableInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppTableObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppTableObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppTableObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppTableObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppTableObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppTableObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppTableObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppTableObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppDb2LUWTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppDb2LUWTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppDb2LUWTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppDb2LUWTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppDb2LUWTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppDb2LUWTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppMSSqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppMSSqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppMSSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppMSSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppMSSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppMSSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppMySqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppMySqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppMySqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppMySqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppMySqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppMySqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppOracleTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppOracleTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppOracleTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppOracleTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppOracleTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppOracleTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppPgSqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppPgSqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppPgSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppPgSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppPgSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppPgSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppRamTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppRamTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppRamTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppRamTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppRamTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppRamTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppSaxLoaderInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppSaxLoaderInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppSaxLoaderStartElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppSaxLoaderStartElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppSaxLoaderEndElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppSaxLoaderEndElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppXMsgTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppXMsgTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppXMsgTableFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppXMsgTableFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppXMsgRqstTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppXMsgRqstTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppXMsgRspnTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppXMsgRspnTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppXMsgClientTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppXMsgClientTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppXMsgRqstTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppXMsgRqstTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppXMsgRspnTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppXMsgRspnTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCppXMsgClientTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCppXMsgClientTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppEditObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppEditObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppEditObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppEditObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppEditObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppEditObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppEditObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppEditObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppTableInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppTableInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppTableObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppTableObjInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppTableObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppTableObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppTableObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppTableObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppTableObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppTableObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppDb2LUWTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppDb2LUWTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppDb2LUWTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppDb2LUWTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppDb2LUWTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppDb2LUWTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppMSSqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppMSSqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppMSSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppMSSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppMSSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppMSSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppMySqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppMySqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppMySqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppMySqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppMySqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppMySqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppOracleTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppOracleTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppOracleTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppOracleTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppOracleTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppOracleTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppPgSqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppPgSqlTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppPgSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppPgSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppPgSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppPgSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppRamTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppRamTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppRamTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppRamTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppRamTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppRamTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppSaxLoaderInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppSaxLoaderInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppSaxLoaderStartElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppSaxLoaderStartElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppSaxLoaderEndElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppSaxLoaderEndElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppXMsgTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppXMsgTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppXMsgTableFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppXMsgTableFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppXMsgRqstTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppXMsgRqstTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppXMsgRspnTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppXMsgRspnTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppXMsgClientTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppXMsgClientTableInclude( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppXMsgRqstTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppXMsgRqstTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppXMsgRspnTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppXMsgRspnTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableHppXMsgClientTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableHppXMsgClientTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsEditObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsEditObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsEditObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsEditObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsEditObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsEditObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsEditObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsEditObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsTableInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsTableInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsTableObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsTableObjUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsTableObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsTableObjMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsTableObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsTableObjInterface( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsTableObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsTableObjImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsDb2LUWTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsDb2LUWTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsDb2LUWTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsDb2LUWTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsDb2LUWTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsDb2LUWTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsMSSqlTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsMSSqlTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsMSSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsMSSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsMSSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsMSSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsMySqlTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsMySqlTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsMySqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsMySqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsMySqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsMySqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsOracleTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsOracleTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsOracleTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsOracleTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsOracleTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsOracleTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsPgSqlTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsPgSqlTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsPgSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsPgSqlTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsPgSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsPgSqlTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsRamTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsRamTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsRamTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsRamTableMembers( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsRamTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsRamTableImplementation( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsSaxLoaderUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsSaxLoaderUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsSaxLoaderStartElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsSaxLoaderStartElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsSaxLoaderEndElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsSaxLoaderEndElement( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsXMsgTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsXMsgTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsXMsgTableFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsXMsgTableFormatters( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsXMsgRqstTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsXMsgRqstTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsXMsgRspnTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsXMsgRspnTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsXMsgClientTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsXMsgClientTableUsing( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsXMsgRqstTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsXMsgRqstTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsXMsgRspnTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsXMsgRspnTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableCsXMsgClientTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableCsXMsgClientTableBody( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableLookupIndex( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableAltIndex( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableQualTable( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTablePrimaryIndex( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTableColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTableColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableColDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableColDbName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableColDataTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableColDataTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableColDataId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableColDataId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTableColXmlElementName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTableColXmlElementName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTableTweakBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTableTweakTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTenantBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTenantClusterId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTenantTenantName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTextColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTextColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTextDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTextDefMaxLen( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTextDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTextDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTextDefXmlElementName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTextDefXmlElementName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTextTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTextTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTimeColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTimeColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTimeDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTimeDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTimeDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTimeTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTimeTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTimestampColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTimestampColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTimestampDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTimestampDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTimestampDefDummy( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTimestampTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTimestampTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTldBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTldTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTldId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTldName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTldDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTldDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTokenColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTokenColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTokenDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTokenDefMaxLen( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTokenDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTokenDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTokenTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTokenTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTopDomainBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTopDomainTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTopDomainId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTopDomainTldId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTopDomainName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTopDomainDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTopDomainDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTopProjectBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTopProjectTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTopProjectId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTopProjectTopDomainId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTopProjectName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTopProjectDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTopProjectDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapTweakBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindTweakTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTweakScopeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTweakId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTweakDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTweakDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTweakDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTweakDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTweakName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTweakReplacesInherited( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindTweakTweakGelText( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasTweakDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUInt16ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUInt16ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUInt16DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUInt16DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUInt16DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUInt16DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUInt16DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUInt16DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUInt16DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUInt16TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUInt16TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUInt32ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUInt32ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUInt32DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUInt32DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUInt32DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUInt32DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUInt32DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUInt32DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUInt32DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUInt32TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUInt32TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUInt64ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUInt64ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUInt64DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUInt64DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUInt64DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUInt64DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUInt64DefMinValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUInt64DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUInt64DefMaxValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUInt64TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUInt64TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapURLProtocolBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindURLProtocolURLProtocolId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindURLProtocolName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindURLProtocolDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindURLProtocolIsSecure( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUuid6ColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUuid6ColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUuid6DefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUuid6DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUuid6DefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUuid6GenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUuid6GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUuid6GenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUuid6GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUuid6GenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUuid6GenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUuid6GenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUuid6GenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUuid6TypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUuid6TypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUuidColBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUuidColTableId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUuidDefBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUuidDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUuidDefInitValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUuidGenBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUuidGenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUuidGenDispenserTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUuidGenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUuidGenDispenserId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUuidGenSlice( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindUuidGenBlockSize( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasUuidGenDispenser( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapUuidTypeBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindUuidTypeSchemaDefId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	protected void bootstrapValueBindings(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeBind) {
		IYCFGenKbGenBindObj bind = null;
		IYCFGenKbGenBindEditObj editBind = null;

		bind = new YCFBamMssYCFBindValueTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueScopeId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueDefSchemaTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueDefSchemaId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueShortName( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueLabel( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueShortDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueDescription( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueDefaultXmlValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueDefaultXmlValue( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueIsNullable( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueGenerateId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueGenerateId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueImplementsPolymorph( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValuePrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValuePrevTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValuePrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValuePrevId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueNextTenantId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueNextId( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindValueCodeVis( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueDefSchema( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValuePrev( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

		bind = new YCFBamMssYCFBindHasValueNext( this );
		editBind = (IYCFGenKbGenBindEditObj)bind.beginEdit();
		editBind.setRequiredContainerCartridge( ruleCart );
		editBind.setRequiredLookupRuleType( ruleTypeBind );
		editBind.create();
		editBind = null;

	}

	public void bootstrapIterators() {
		IYCFGenKbRuleCartObj ruleCart = this.getInternalRuleCart();
		IYCFGenKbRuleTypeObj ruleTypeIterator = this.getRuleTypeTableObj().readRuleTypeByNameIdx("Iterator");

		bootstrapAtomIterators(ruleCart, ruleTypeIterator);
		bootstrapBlobColIterators(ruleCart, ruleTypeIterator);
		bootstrapBlobDefIterators(ruleCart, ruleTypeIterator);
		bootstrapBlobTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapBoolColIterators(ruleCart, ruleTypeIterator);
		bootstrapBoolDefIterators(ruleCart, ruleTypeIterator);
		bootstrapBoolTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapChainIterators(ruleCart, ruleTypeIterator);
		bootstrapClearDepIterators(ruleCart, ruleTypeIterator);
		bootstrapClearSubDep1Iterators(ruleCart, ruleTypeIterator);
		bootstrapClearSubDep2Iterators(ruleCart, ruleTypeIterator);
		bootstrapClearSubDep3Iterators(ruleCart, ruleTypeIterator);
		bootstrapClearTopDepIterators(ruleCart, ruleTypeIterator);
		bootstrapClusterIterators(ruleCart, ruleTypeIterator);
		bootstrapDateColIterators(ruleCart, ruleTypeIterator);
		bootstrapDateDefIterators(ruleCart, ruleTypeIterator);
		bootstrapDateTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash128ColIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash128DefIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash128GenIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash128TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash160ColIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash160DefIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash160GenIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash160TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash224ColIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash224DefIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash224GenIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash224TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash256ColIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash256DefIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash256GenIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash256TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash384ColIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash384DefIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash384GenIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash384TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash512ColIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash512DefIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash512GenIterators(ruleCart, ruleTypeIterator);
		bootstrapDbKeyHash512TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapDelDepIterators(ruleCart, ruleTypeIterator);
		bootstrapDelSubDep1Iterators(ruleCart, ruleTypeIterator);
		bootstrapDelSubDep2Iterators(ruleCart, ruleTypeIterator);
		bootstrapDelSubDep3Iterators(ruleCart, ruleTypeIterator);
		bootstrapDelTopDepIterators(ruleCart, ruleTypeIterator);
		bootstrapDoubleColIterators(ruleCart, ruleTypeIterator);
		bootstrapDoubleDefIterators(ruleCart, ruleTypeIterator);
		bootstrapDoubleTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapEnumDefIterators(ruleCart, ruleTypeIterator);
		bootstrapEnumTagIterators(ruleCart, ruleTypeIterator);
		bootstrapEnumTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapFloatColIterators(ruleCart, ruleTypeIterator);
		bootstrapFloatDefIterators(ruleCart, ruleTypeIterator);
		bootstrapFloatTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapHostNodeIterators(ruleCart, ruleTypeIterator);
		bootstrapISOCcyIterators(ruleCart, ruleTypeIterator);
		bootstrapISOCtryIterators(ruleCart, ruleTypeIterator);
		bootstrapISOCtryCcyIterators(ruleCart, ruleTypeIterator);
		bootstrapISOCtryLangIterators(ruleCart, ruleTypeIterator);
		bootstrapISOLangIterators(ruleCart, ruleTypeIterator);
		bootstrapISOTZoneIterators(ruleCart, ruleTypeIterator);
		bootstrapId16GenIterators(ruleCart, ruleTypeIterator);
		bootstrapId32GenIterators(ruleCart, ruleTypeIterator);
		bootstrapId64GenIterators(ruleCart, ruleTypeIterator);
		bootstrapIndexIterators(ruleCart, ruleTypeIterator);
		bootstrapIndexColIterators(ruleCart, ruleTypeIterator);
		bootstrapIndexTweakIterators(ruleCart, ruleTypeIterator);
		bootstrapInt16ColIterators(ruleCart, ruleTypeIterator);
		bootstrapInt16DefIterators(ruleCart, ruleTypeIterator);
		bootstrapInt16TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapInt32ColIterators(ruleCart, ruleTypeIterator);
		bootstrapInt32DefIterators(ruleCart, ruleTypeIterator);
		bootstrapInt32TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapInt64ColIterators(ruleCart, ruleTypeIterator);
		bootstrapInt64DefIterators(ruleCart, ruleTypeIterator);
		bootstrapInt64TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapLicenseIterators(ruleCart, ruleTypeIterator);
		bootstrapMajorVersionIterators(ruleCart, ruleTypeIterator);
		bootstrapMimeTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapMinorVersionIterators(ruleCart, ruleTypeIterator);
		bootstrapNmTokenColIterators(ruleCart, ruleTypeIterator);
		bootstrapNmTokenDefIterators(ruleCart, ruleTypeIterator);
		bootstrapNmTokenTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapNmTokensColIterators(ruleCart, ruleTypeIterator);
		bootstrapNmTokensDefIterators(ruleCart, ruleTypeIterator);
		bootstrapNmTokensTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapNumberColIterators(ruleCart, ruleTypeIterator);
		bootstrapNumberDefIterators(ruleCart, ruleTypeIterator);
		bootstrapNumberTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapParamIterators(ruleCart, ruleTypeIterator);
		bootstrapPopDepIterators(ruleCart, ruleTypeIterator);
		bootstrapPopSubDep1Iterators(ruleCart, ruleTypeIterator);
		bootstrapPopSubDep2Iterators(ruleCart, ruleTypeIterator);
		bootstrapPopSubDep3Iterators(ruleCart, ruleTypeIterator);
		bootstrapPopTopDepIterators(ruleCart, ruleTypeIterator);
		bootstrapRelationIterators(ruleCart, ruleTypeIterator);
		bootstrapRelationColIterators(ruleCart, ruleTypeIterator);
		bootstrapRoleDefIterators(ruleCart, ruleTypeIterator);
		bootstrapSchemaDefIterators(ruleCart, ruleTypeIterator);
		bootstrapSchemaRefIterators(ruleCart, ruleTypeIterator);
		bootstrapSchemaRoleIterators(ruleCart, ruleTypeIterator);
		bootstrapSchemaTweakIterators(ruleCart, ruleTypeIterator);
		bootstrapScopeIterators(ruleCart, ruleTypeIterator);
		bootstrapSecAppIterators(ruleCart, ruleTypeIterator);
		bootstrapSecDeviceIterators(ruleCart, ruleTypeIterator);
		bootstrapSecFormIterators(ruleCart, ruleTypeIterator);
		bootstrapSecGroupIterators(ruleCart, ruleTypeIterator);
		bootstrapSecGroupFormIterators(ruleCart, ruleTypeIterator);
		bootstrapSecGrpIncIterators(ruleCart, ruleTypeIterator);
		bootstrapSecGrpMembIterators(ruleCart, ruleTypeIterator);
		bootstrapSecSessionIterators(ruleCart, ruleTypeIterator);
		bootstrapSecUserIterators(ruleCart, ruleTypeIterator);
		bootstrapServerListFuncIterators(ruleCart, ruleTypeIterator);
		bootstrapServerMethodIterators(ruleCart, ruleTypeIterator);
		bootstrapServerObjFuncIterators(ruleCart, ruleTypeIterator);
		bootstrapServerProcIterators(ruleCart, ruleTypeIterator);
		bootstrapServiceIterators(ruleCart, ruleTypeIterator);
		bootstrapServiceTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapStringColIterators(ruleCart, ruleTypeIterator);
		bootstrapStringDefIterators(ruleCart, ruleTypeIterator);
		bootstrapStringTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapSubProjectIterators(ruleCart, ruleTypeIterator);
		bootstrapSysClusterIterators(ruleCart, ruleTypeIterator);
		bootstrapTSecGroupIterators(ruleCart, ruleTypeIterator);
		bootstrapTSecGrpIncIterators(ruleCart, ruleTypeIterator);
		bootstrapTSecGrpMembIterators(ruleCart, ruleTypeIterator);
		bootstrapTZDateColIterators(ruleCart, ruleTypeIterator);
		bootstrapTZDateDefIterators(ruleCart, ruleTypeIterator);
		bootstrapTZDateTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapTZTimeColIterators(ruleCart, ruleTypeIterator);
		bootstrapTZTimeDefIterators(ruleCart, ruleTypeIterator);
		bootstrapTZTimeTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapTZTimestampColIterators(ruleCart, ruleTypeIterator);
		bootstrapTZTimestampDefIterators(ruleCart, ruleTypeIterator);
		bootstrapTZTimestampTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapTableIterators(ruleCart, ruleTypeIterator);
		bootstrapTableColIterators(ruleCart, ruleTypeIterator);
		bootstrapTableTweakIterators(ruleCart, ruleTypeIterator);
		bootstrapTenantIterators(ruleCart, ruleTypeIterator);
		bootstrapTextColIterators(ruleCart, ruleTypeIterator);
		bootstrapTextDefIterators(ruleCart, ruleTypeIterator);
		bootstrapTextTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapTimeColIterators(ruleCart, ruleTypeIterator);
		bootstrapTimeDefIterators(ruleCart, ruleTypeIterator);
		bootstrapTimeTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapTimestampColIterators(ruleCart, ruleTypeIterator);
		bootstrapTimestampDefIterators(ruleCart, ruleTypeIterator);
		bootstrapTimestampTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapTldIterators(ruleCart, ruleTypeIterator);
		bootstrapTokenColIterators(ruleCart, ruleTypeIterator);
		bootstrapTokenDefIterators(ruleCart, ruleTypeIterator);
		bootstrapTokenTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapTopDomainIterators(ruleCart, ruleTypeIterator);
		bootstrapTopProjectIterators(ruleCart, ruleTypeIterator);
		bootstrapTweakIterators(ruleCart, ruleTypeIterator);
		bootstrapUInt16ColIterators(ruleCart, ruleTypeIterator);
		bootstrapUInt16DefIterators(ruleCart, ruleTypeIterator);
		bootstrapUInt16TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapUInt32ColIterators(ruleCart, ruleTypeIterator);
		bootstrapUInt32DefIterators(ruleCart, ruleTypeIterator);
		bootstrapUInt32TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapUInt64ColIterators(ruleCart, ruleTypeIterator);
		bootstrapUInt64DefIterators(ruleCart, ruleTypeIterator);
		bootstrapUInt64TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapURLProtocolIterators(ruleCart, ruleTypeIterator);
		bootstrapUuid6ColIterators(ruleCart, ruleTypeIterator);
		bootstrapUuid6DefIterators(ruleCart, ruleTypeIterator);
		bootstrapUuid6GenIterators(ruleCart, ruleTypeIterator);
		bootstrapUuid6TypeIterators(ruleCart, ruleTypeIterator);
		bootstrapUuidColIterators(ruleCart, ruleTypeIterator);
		bootstrapUuidDefIterators(ruleCart, ruleTypeIterator);
		bootstrapUuidGenIterators(ruleCart, ruleTypeIterator);
		bootstrapUuidTypeIterators(ruleCart, ruleTypeIterator);
		bootstrapValueIterators(ruleCart, ruleTypeIterator);
	}

	protected void bootstrapAtomIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapBlobColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapBlobDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapBlobTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapBoolColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapBoolDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapBoolTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapChainIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapClearDepIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapClearSubDep1Iterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateClearSubDep1ClearDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapClearSubDep2Iterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateClearSubDep2ClearDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapClearSubDep3Iterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapClearTopDepIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateClearTopDepClearDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapClusterIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateClusterHostNode( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateClusterTenant( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateClusterSecApp( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateClusterSecGroup( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateClusterSysCluster( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapDateColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDateDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDateTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash128ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash128DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash128GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash128TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash160ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash160DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash160GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash160TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash224ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash224DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash224GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash224TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash256ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash256DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash256GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash256TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash384ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash384DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash384GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash384TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash512ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash512DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash512GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDbKeyHash512TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDelDepIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDelSubDep1Iterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateDelSubDep1DelDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapDelSubDep2Iterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateDelSubDep2DelDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapDelSubDep3Iterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDelTopDepIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateDelTopDepDelDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapDoubleColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDoubleDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapDoubleTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapEnumDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateEnumDefTag( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapEnumTagIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapEnumTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapFloatColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapFloatDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapFloatTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapHostNodeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateHostNodeService( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapISOCcyIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateISOCcyCtry( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapISOCtryIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateISOCtryCcy( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateISOCtryLang( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapISOCtryCcyIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapISOCtryLangIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapISOLangIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateISOLangCtry( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapISOTZoneIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapId16GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapId32GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapId64GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapIndexIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateIndexColumns( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateIndexTweaks( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapIndexColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateIndexColRefRelFromCol( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateIndexColRefRelToCol( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapIndexTweakIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapInt16ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapInt16DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapInt16TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapInt32ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapInt32DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapInt32TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapInt64ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapInt64DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapInt64TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapLicenseIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapMajorVersionIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateMajorVersionMinorVer( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapMimeTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapMinorVersionIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateMinorVersionSchemaDef( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapNmTokenColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapNmTokenDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapNmTokenTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapNmTokensColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapNmTokensDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapNmTokensTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapNumberColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapNumberDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapNumberTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapParamIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapPopDepIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapPopSubDep1Iterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIteratePopSubDep1PopDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapPopSubDep2Iterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIteratePopSubDep2PopDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapPopSubDep3Iterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapPopTopDepIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIteratePopTopDepPopDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapRelationIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateRelationColumns( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateRelationPopDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapRelationColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapRoleDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSchemaDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateSchemaDefTables( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSchemaDefTypes( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSchemaDefSchemaRefs( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSchemaDefTweaks( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSchemaDefRoles( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapSchemaRefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSchemaRoleIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSchemaTweakIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapScopeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSecAppIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateSecAppForm( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapSecDeviceIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSecFormIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSecGroupIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateSecGroupInclude( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSecGroupMember( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSecGroupIncByGroup( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSecGroupForm( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapSecGroupFormIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSecGrpIncIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSecGrpMembIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSecSessionIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSecUserIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateSecUserSecDev( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSecUserSecSess( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSecUserSecProxy( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSecUserSecGrpMemb( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateSecUserTSecGrpMemb( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapServerListFuncIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapServerMethodIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateServerMethodParams( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapServerObjFuncIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapServerProcIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapServiceIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapServiceTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateServiceTypeDeployed( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapStringColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapStringDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapStringTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapSubProjectIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateSubProjectMajorVer( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapSysClusterIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTSecGroupIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateTSecGroupInclude( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTSecGroupMember( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTSecGroupIncByGroup( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapTSecGrpIncIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTSecGrpMembIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTZDateColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTZDateDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTZDateTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTZTimeColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTZTimeDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTZTimeTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTZTimestampColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTZTimestampDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTZTimestampTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTableIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateTableRelation( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableIndex( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableColumns( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableReverseRelations( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableChains( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableDelDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableClearDep( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableDispId16Gen( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableDispId32Gen( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableDispId64Gen( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableServerMethods( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTableTweaks( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapTableColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTableTweakIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTenantIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateTenantTSecGroup( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTenantTld( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTenantSchema( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapTextColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTextDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTextTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTimeColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTimeDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTimeTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTimestampColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTimestampDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTimestampTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTldIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateTldTopDomain( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapTokenColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTokenDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTokenTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapTopDomainIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateTopDomainLicense( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateTopDomainTopProject( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapTopProjectIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateTopProjectSubProject( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	protected void bootstrapTweakIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUInt16ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUInt16DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUInt16TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUInt32ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUInt32DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUInt32TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUInt64ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUInt64DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUInt64TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapURLProtocolIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUuid6ColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUuid6DefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUuid6GenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUuid6TypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUuidColIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUuidDefIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUuidGenIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapUuidTypeIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

	}

	protected void bootstrapValueIterators(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeIterator) {
		IYCFGenKbGenIteratorObj iterator = null;
		IYCFGenKbGenIteratorEditObj editIterator = null;

		iterator = new YCFBamMssYCFIterateValueRefTableCol( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

		iterator = new YCFBamMssYCFIterateValueRefIndexCol( this );
		editIterator = (IYCFGenKbGenIteratorEditObj)iterator.beginEdit();
		editIterator.setRequiredContainerCartridge( ruleCart );
		editIterator.setRequiredLookupRuleType( ruleTypeIterator );
		editIterator.create();
		editIterator = null;

	}

	public void bootstrapReferences() {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;
		IYCFGenKbRuleCartObj ruleCart = this.getInternalRuleCart();
		IYCFGenKbRuleTypeObj ruleTypeReference = this.getRuleTypeTableObj().readRuleTypeByNameIdx("Reference");

		bootstrapAtomReferences(ruleCart, ruleTypeReference);
		bootstrapBlobColReferences(ruleCart, ruleTypeReference);
		bootstrapBlobDefReferences(ruleCart, ruleTypeReference);
		bootstrapBlobTypeReferences(ruleCart, ruleTypeReference);
		bootstrapBoolColReferences(ruleCart, ruleTypeReference);
		bootstrapBoolDefReferences(ruleCart, ruleTypeReference);
		bootstrapBoolTypeReferences(ruleCart, ruleTypeReference);
		bootstrapChainReferences(ruleCart, ruleTypeReference);
		bootstrapClearDepReferences(ruleCart, ruleTypeReference);
		bootstrapClearSubDep1References(ruleCart, ruleTypeReference);
		bootstrapClearSubDep2References(ruleCart, ruleTypeReference);
		bootstrapClearSubDep3References(ruleCart, ruleTypeReference);
		bootstrapClearTopDepReferences(ruleCart, ruleTypeReference);
		bootstrapClusterReferences(ruleCart, ruleTypeReference);
		bootstrapDateColReferences(ruleCart, ruleTypeReference);
		bootstrapDateDefReferences(ruleCart, ruleTypeReference);
		bootstrapDateTypeReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash128ColReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash128DefReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash128GenReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash128TypeReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash160ColReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash160DefReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash160GenReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash160TypeReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash224ColReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash224DefReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash224GenReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash224TypeReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash256ColReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash256DefReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash256GenReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash256TypeReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash384ColReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash384DefReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash384GenReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash384TypeReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash512ColReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash512DefReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash512GenReferences(ruleCart, ruleTypeReference);
		bootstrapDbKeyHash512TypeReferences(ruleCart, ruleTypeReference);
		bootstrapDelDepReferences(ruleCart, ruleTypeReference);
		bootstrapDelSubDep1References(ruleCart, ruleTypeReference);
		bootstrapDelSubDep2References(ruleCart, ruleTypeReference);
		bootstrapDelSubDep3References(ruleCart, ruleTypeReference);
		bootstrapDelTopDepReferences(ruleCart, ruleTypeReference);
		bootstrapDoubleColReferences(ruleCart, ruleTypeReference);
		bootstrapDoubleDefReferences(ruleCart, ruleTypeReference);
		bootstrapDoubleTypeReferences(ruleCart, ruleTypeReference);
		bootstrapEnumDefReferences(ruleCart, ruleTypeReference);
		bootstrapEnumTagReferences(ruleCart, ruleTypeReference);
		bootstrapEnumTypeReferences(ruleCart, ruleTypeReference);
		bootstrapFloatColReferences(ruleCart, ruleTypeReference);
		bootstrapFloatDefReferences(ruleCart, ruleTypeReference);
		bootstrapFloatTypeReferences(ruleCart, ruleTypeReference);
		bootstrapHostNodeReferences(ruleCart, ruleTypeReference);
		bootstrapISOCcyReferences(ruleCart, ruleTypeReference);
		bootstrapISOCtryReferences(ruleCart, ruleTypeReference);
		bootstrapISOCtryCcyReferences(ruleCart, ruleTypeReference);
		bootstrapISOCtryLangReferences(ruleCart, ruleTypeReference);
		bootstrapISOLangReferences(ruleCart, ruleTypeReference);
		bootstrapISOTZoneReferences(ruleCart, ruleTypeReference);
		bootstrapId16GenReferences(ruleCart, ruleTypeReference);
		bootstrapId32GenReferences(ruleCart, ruleTypeReference);
		bootstrapId64GenReferences(ruleCart, ruleTypeReference);
		bootstrapIndexReferences(ruleCart, ruleTypeReference);
		bootstrapIndexColReferences(ruleCart, ruleTypeReference);
		bootstrapIndexTweakReferences(ruleCart, ruleTypeReference);
		bootstrapInt16ColReferences(ruleCart, ruleTypeReference);
		bootstrapInt16DefReferences(ruleCart, ruleTypeReference);
		bootstrapInt16TypeReferences(ruleCart, ruleTypeReference);
		bootstrapInt32ColReferences(ruleCart, ruleTypeReference);
		bootstrapInt32DefReferences(ruleCart, ruleTypeReference);
		bootstrapInt32TypeReferences(ruleCart, ruleTypeReference);
		bootstrapInt64ColReferences(ruleCart, ruleTypeReference);
		bootstrapInt64DefReferences(ruleCart, ruleTypeReference);
		bootstrapInt64TypeReferences(ruleCart, ruleTypeReference);
		bootstrapLicenseReferences(ruleCart, ruleTypeReference);
		bootstrapMajorVersionReferences(ruleCart, ruleTypeReference);
		bootstrapMimeTypeReferences(ruleCart, ruleTypeReference);
		bootstrapMinorVersionReferences(ruleCart, ruleTypeReference);
		bootstrapNmTokenColReferences(ruleCart, ruleTypeReference);
		bootstrapNmTokenDefReferences(ruleCart, ruleTypeReference);
		bootstrapNmTokenTypeReferences(ruleCart, ruleTypeReference);
		bootstrapNmTokensColReferences(ruleCart, ruleTypeReference);
		bootstrapNmTokensDefReferences(ruleCart, ruleTypeReference);
		bootstrapNmTokensTypeReferences(ruleCart, ruleTypeReference);
		bootstrapNumberColReferences(ruleCart, ruleTypeReference);
		bootstrapNumberDefReferences(ruleCart, ruleTypeReference);
		bootstrapNumberTypeReferences(ruleCart, ruleTypeReference);
		bootstrapParamReferences(ruleCart, ruleTypeReference);
		bootstrapPopDepReferences(ruleCart, ruleTypeReference);
		bootstrapPopSubDep1References(ruleCart, ruleTypeReference);
		bootstrapPopSubDep2References(ruleCart, ruleTypeReference);
		bootstrapPopSubDep3References(ruleCart, ruleTypeReference);
		bootstrapPopTopDepReferences(ruleCart, ruleTypeReference);
		bootstrapRelationReferences(ruleCart, ruleTypeReference);
		bootstrapRelationColReferences(ruleCart, ruleTypeReference);
		bootstrapRoleDefReferences(ruleCart, ruleTypeReference);
		bootstrapSchemaDefReferences(ruleCart, ruleTypeReference);
		bootstrapSchemaRefReferences(ruleCart, ruleTypeReference);
		bootstrapSchemaRoleReferences(ruleCart, ruleTypeReference);
		bootstrapSchemaTweakReferences(ruleCart, ruleTypeReference);
		bootstrapScopeReferences(ruleCart, ruleTypeReference);
		bootstrapSecAppReferences(ruleCart, ruleTypeReference);
		bootstrapSecDeviceReferences(ruleCart, ruleTypeReference);
		bootstrapSecFormReferences(ruleCart, ruleTypeReference);
		bootstrapSecGroupReferences(ruleCart, ruleTypeReference);
		bootstrapSecGroupFormReferences(ruleCart, ruleTypeReference);
		bootstrapSecGrpIncReferences(ruleCart, ruleTypeReference);
		bootstrapSecGrpMembReferences(ruleCart, ruleTypeReference);
		bootstrapSecSessionReferences(ruleCart, ruleTypeReference);
		bootstrapSecUserReferences(ruleCart, ruleTypeReference);
		bootstrapServerListFuncReferences(ruleCart, ruleTypeReference);
		bootstrapServerMethodReferences(ruleCart, ruleTypeReference);
		bootstrapServerObjFuncReferences(ruleCart, ruleTypeReference);
		bootstrapServerProcReferences(ruleCart, ruleTypeReference);
		bootstrapServiceReferences(ruleCart, ruleTypeReference);
		bootstrapServiceTypeReferences(ruleCart, ruleTypeReference);
		bootstrapStringColReferences(ruleCart, ruleTypeReference);
		bootstrapStringDefReferences(ruleCart, ruleTypeReference);
		bootstrapStringTypeReferences(ruleCart, ruleTypeReference);
		bootstrapSubProjectReferences(ruleCart, ruleTypeReference);
		bootstrapSysClusterReferences(ruleCart, ruleTypeReference);
		bootstrapTSecGroupReferences(ruleCart, ruleTypeReference);
		bootstrapTSecGrpIncReferences(ruleCart, ruleTypeReference);
		bootstrapTSecGrpMembReferences(ruleCart, ruleTypeReference);
		bootstrapTZDateColReferences(ruleCart, ruleTypeReference);
		bootstrapTZDateDefReferences(ruleCart, ruleTypeReference);
		bootstrapTZDateTypeReferences(ruleCart, ruleTypeReference);
		bootstrapTZTimeColReferences(ruleCart, ruleTypeReference);
		bootstrapTZTimeDefReferences(ruleCart, ruleTypeReference);
		bootstrapTZTimeTypeReferences(ruleCart, ruleTypeReference);
		bootstrapTZTimestampColReferences(ruleCart, ruleTypeReference);
		bootstrapTZTimestampDefReferences(ruleCart, ruleTypeReference);
		bootstrapTZTimestampTypeReferences(ruleCart, ruleTypeReference);
		bootstrapTableReferences(ruleCart, ruleTypeReference);
		bootstrapTableColReferences(ruleCart, ruleTypeReference);
		bootstrapTableTweakReferences(ruleCart, ruleTypeReference);
		bootstrapTenantReferences(ruleCart, ruleTypeReference);
		bootstrapTextColReferences(ruleCart, ruleTypeReference);
		bootstrapTextDefReferences(ruleCart, ruleTypeReference);
		bootstrapTextTypeReferences(ruleCart, ruleTypeReference);
		bootstrapTimeColReferences(ruleCart, ruleTypeReference);
		bootstrapTimeDefReferences(ruleCart, ruleTypeReference);
		bootstrapTimeTypeReferences(ruleCart, ruleTypeReference);
		bootstrapTimestampColReferences(ruleCart, ruleTypeReference);
		bootstrapTimestampDefReferences(ruleCart, ruleTypeReference);
		bootstrapTimestampTypeReferences(ruleCart, ruleTypeReference);
		bootstrapTldReferences(ruleCart, ruleTypeReference);
		bootstrapTokenColReferences(ruleCart, ruleTypeReference);
		bootstrapTokenDefReferences(ruleCart, ruleTypeReference);
		bootstrapTokenTypeReferences(ruleCart, ruleTypeReference);
		bootstrapTopDomainReferences(ruleCart, ruleTypeReference);
		bootstrapTopProjectReferences(ruleCart, ruleTypeReference);
		bootstrapTweakReferences(ruleCart, ruleTypeReference);
		bootstrapUInt16ColReferences(ruleCart, ruleTypeReference);
		bootstrapUInt16DefReferences(ruleCart, ruleTypeReference);
		bootstrapUInt16TypeReferences(ruleCart, ruleTypeReference);
		bootstrapUInt32ColReferences(ruleCart, ruleTypeReference);
		bootstrapUInt32DefReferences(ruleCart, ruleTypeReference);
		bootstrapUInt32TypeReferences(ruleCart, ruleTypeReference);
		bootstrapUInt64ColReferences(ruleCart, ruleTypeReference);
		bootstrapUInt64DefReferences(ruleCart, ruleTypeReference);
		bootstrapUInt64TypeReferences(ruleCart, ruleTypeReference);
		bootstrapURLProtocolReferences(ruleCart, ruleTypeReference);
		bootstrapUuid6ColReferences(ruleCart, ruleTypeReference);
		bootstrapUuid6DefReferences(ruleCart, ruleTypeReference);
		bootstrapUuid6GenReferences(ruleCart, ruleTypeReference);
		bootstrapUuid6TypeReferences(ruleCart, ruleTypeReference);
		bootstrapUuidColReferences(ruleCart, ruleTypeReference);
		bootstrapUuidDefReferences(ruleCart, ruleTypeReference);
		bootstrapUuidGenReferences(ruleCart, ruleTypeReference);
		bootstrapUuidTypeReferences(ruleCart, ruleTypeReference);
		bootstrapValueReferences(ruleCart, ruleTypeReference);
	}

	protected void bootstrapAtomReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapBlobColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceBlobColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapBlobDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapBlobTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceBlobTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapBoolColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceBoolColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapBoolDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapBoolTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceBoolTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapChainReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceChainTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceChainTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceChainDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceChainPrevRel( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceChainNextRel( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapClearDepReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceClearDepRelation( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceClearDepDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapClearSubDep1References(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceClearSubDep1ClearTopDep( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapClearSubDep2References(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceClearSubDep2ClearSubDep1( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapClearSubDep3References(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceClearSubDep3ClearSubDep2( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapClearTopDepReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceClearTopDepTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceClearTopDepPrev( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceClearTopDepNext( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapClusterReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapDateColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDateColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDateDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapDateTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDateTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash128ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash128ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash128DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapDbKeyHash128GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash128GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash128TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash128TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash160ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash160ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash160DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapDbKeyHash160GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash160GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash160TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash160TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash224ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash224ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash224DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapDbKeyHash224GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash224GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash224TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash224TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash256ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash256ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash256DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapDbKeyHash256GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash256GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash256TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash256TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash384ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash384ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash384DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapDbKeyHash384GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash384GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash384TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash384TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash512ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash512ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash512DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapDbKeyHash512GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash512GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDbKeyHash512TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDbKeyHash512TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDelDepReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDelDepRelation( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceDelDepDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDelSubDep1References(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDelSubDep1DelTopDep( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDelSubDep2References(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDelSubDep2DelSubDep1( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDelSubDep3References(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDelSubDep3DelSubDep2( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDelTopDepReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDelTopDepTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceDelTopDepPrev( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceDelTopDepNext( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDoubleColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDoubleColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapDoubleDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapDoubleTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceDoubleTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapEnumDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapEnumTagReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceEnumTagTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceEnumTagEnumDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceEnumTagDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceEnumTagPrev( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceEnumTagNext( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapEnumTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceEnumTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapFloatColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceFloatColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapFloatDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapFloatTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceFloatTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapHostNodeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceHostNodeCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapISOCcyReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapISOCtryReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapISOCtryCcyReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceISOCtryCcyCtry( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceISOCtryCcyCcy( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapISOCtryLangReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceISOCtryLangCtry( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceISOCtryLangLang( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapISOLangReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapISOTZoneReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapId16GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceId16GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapId32GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceId32GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapId64GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceId64GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapIndexReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexIdxTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapIndexColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexColTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexColIndex( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexColDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexColPrev( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexColNext( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexColColumn( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapIndexTweakReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceIndexTweakIndexDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapInt16ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceInt16ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapInt16DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapInt16TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceInt16TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapInt32ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceInt32ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapInt32DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapInt32TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceInt32TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapInt64ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceInt64ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapInt64DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapInt64TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceInt64TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapLicenseReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceLicenseTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceLicenseTopDomain( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapMajorVersionReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceMajorVersionTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceMajorVersionParentSPrj( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapMimeTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapMinorVersionReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceMinorVersionTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceMinorVersionParentMajVer( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapNmTokenColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceNmTokenColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapNmTokenDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapNmTokenTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceNmTokenTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapNmTokensColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceNmTokensColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapNmTokensDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapNmTokensTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceNmTokensTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapNumberColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceNumberColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapNumberDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapNumberTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceNumberTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapParamReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceParamServerMeth( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceParamTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceParamDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceParamPrev( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceParamNext( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceParamType( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapPopDepReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferencePopDepRelation( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferencePopDepDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapPopSubDep1References(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferencePopSubDep1ContPopTopDep( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapPopSubDep2References(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferencePopSubDep2PopSubDep1( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapPopSubDep3References(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferencePopSubDep3PopSubDep2( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapPopTopDepReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferencePopTopDepContRelation( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapRelationReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationFromTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationRelTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationFromIndex( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationToTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationToIndex( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationNarrowed( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapRelationColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationColRelation( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationColTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationColDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationColPrev( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationColNext( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationColFromCol( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRelationColToCol( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapRoleDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceRoleDefTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRoleDefScopeDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceRoleDefDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSchemaDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSchemaDefMinorVersion( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSchemaDefCTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSchemaRefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSchemaRefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSchemaRefRefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSchemaRefPrev( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSchemaRefNext( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSchemaRoleReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSchemaRoleSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSchemaTweakReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSchemaTweakSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapScopeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceScopeTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSecAppReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSecAppCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSecDeviceReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSecDeviceSecUser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSecFormReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSecFormCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSecFormApplication( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSecGroupReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGroupCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSecGroupFormReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGroupFormCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGroupFormGroup( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGroupFormApp( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGroupFormForm( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSecGrpIncReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGrpIncCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGrpIncGroup( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGrpIncSubGroup( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSecGrpMembReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGrpMembCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGrpMembGroup( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSecGrpMembUser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSecSessionReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSecSessionSecUser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSecSessionSecProxy( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSecUserReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSecUserDefDev( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapServerListFuncReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceServerListFuncRetTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapServerMethodReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceServerMethodDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceServerMethodForTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapServerObjFuncReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceServerObjFuncRetTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapServerProcReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapServiceReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceServiceCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceServiceHost( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceServiceServiceType( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapServiceTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapStringColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceStringColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapStringDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapStringTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceStringTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSubProjectReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSubProjectTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceSubProjectParentTPrj( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapSysClusterReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceSysClusterCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTSecGroupReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTSecGroupTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTSecGrpIncReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTSecGrpIncTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTSecGrpIncGroup( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTSecGrpIncSubGroup( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTSecGrpMembReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTSecGrpMembTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTSecGrpMembGroup( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTSecGrpMembUser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTZDateColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTZDateColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTZDateDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapTZDateTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTZDateTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTZTimeColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTZTimeColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTZTimeDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapTZTimeTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTZTimeTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTZTimestampColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTZTimestampColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTZTimestampDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapTZTimestampTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTZTimestampTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTableReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTableSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTableDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTableLookupIndex( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTableAltIndex( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTableQualTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTablePrimaryIndex( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTableColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTableColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTableColDataType( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTableTweakReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTableTweakTableDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTenantReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTenantCluster( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTextColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTextColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTextDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapTextTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTextTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTimeColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTimeColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTimeDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapTimeTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTimeTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTimestampColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTimestampColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTimestampDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapTimestampTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTimestampTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTldReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTldTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTokenColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTokenColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTokenDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapTokenTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTokenTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTopDomainReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTopDomainTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTopDomainParentTld( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTopProjectReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTopProjectTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTopProjectParentSDom( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapTweakReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceTweakTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTweakScopeDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceTweakDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUInt16ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUInt16ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUInt16DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapUInt16TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUInt16TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUInt32ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUInt32ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUInt32DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapUInt32TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUInt32TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUInt64ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUInt64ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUInt64DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapUInt64TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUInt64TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapURLProtocolReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapUuid6ColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUuid6ColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUuid6DefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapUuid6GenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUuid6GenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUuid6TypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUuid6TypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUuidColReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUuidColTable( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUuidDefReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

	}

	protected void bootstrapUuidGenReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUuidGenDispenser( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapUuidTypeReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceUuidTypeSchemaDef( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

	protected void bootstrapValueReferences(IYCFGenKbRuleCartObj ruleCart, IYCFGenKbRuleTypeObj ruleTypeReference) {
		IYCFGenKbGenReferenceObj refer = null;
		IYCFGenKbGenReferenceEditObj editRefer = null;

		refer = new YCFBamMssYCFReferenceValueTenant( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceValueScope( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceValueDefSchema( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceValuePrev( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

		refer = new YCFBamMssYCFReferenceValueNext( this );
		editRefer = (IYCFGenKbGenReferenceEditObj)refer.beginEdit();
		editRefer.setRequiredContainerCartridge( ruleCart );
		editRefer.setRequiredLookupRuleType( ruleTypeReference );
		editRefer.create();
		editRefer = null;

	}

}
