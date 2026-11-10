// Description: Java 11 Schema Object interface for YCFBam.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamSchemaObj
	extends IYCFSecSchemaObj,
		IYCFIntSchemaObj
{
	/**
	 *	Get the Atom interface for the schema.
	 *
	 *	@return	The IYCFBamAtomTableObj interface implementation for the schema.
	 */
	IYCFBamAtomTableObj getAtomTableObj();

	/**
	 *	Get the BlobCol interface for the schema.
	 *
	 *	@return	The IYCFBamBlobColTableObj interface implementation for the schema.
	 */
	IYCFBamBlobColTableObj getBlobColTableObj();

	/**
	 *	Get the BlobDef interface for the schema.
	 *
	 *	@return	The IYCFBamBlobDefTableObj interface implementation for the schema.
	 */
	IYCFBamBlobDefTableObj getBlobDefTableObj();

	/**
	 *	Get the BlobType interface for the schema.
	 *
	 *	@return	The IYCFBamBlobTypeTableObj interface implementation for the schema.
	 */
	IYCFBamBlobTypeTableObj getBlobTypeTableObj();

	/**
	 *	Get the BoolCol interface for the schema.
	 *
	 *	@return	The IYCFBamBoolColTableObj interface implementation for the schema.
	 */
	IYCFBamBoolColTableObj getBoolColTableObj();

	/**
	 *	Get the BoolDef interface for the schema.
	 *
	 *	@return	The IYCFBamBoolDefTableObj interface implementation for the schema.
	 */
	IYCFBamBoolDefTableObj getBoolDefTableObj();

	/**
	 *	Get the BoolType interface for the schema.
	 *
	 *	@return	The IYCFBamBoolTypeTableObj interface implementation for the schema.
	 */
	IYCFBamBoolTypeTableObj getBoolTypeTableObj();

	/**
	 *	Get the Chain interface for the schema.
	 *
	 *	@return	The IYCFBamChainTableObj interface implementation for the schema.
	 */
	IYCFBamChainTableObj getChainTableObj();

	/**
	 *	Get the ClearDep interface for the schema.
	 *
	 *	@return	The IYCFBamClearDepTableObj interface implementation for the schema.
	 */
	IYCFBamClearDepTableObj getClearDepTableObj();

	/**
	 *	Get the ClearSubDep1 interface for the schema.
	 *
	 *	@return	The IYCFBamClearSubDep1TableObj interface implementation for the schema.
	 */
	IYCFBamClearSubDep1TableObj getClearSubDep1TableObj();

	/**
	 *	Get the ClearSubDep2 interface for the schema.
	 *
	 *	@return	The IYCFBamClearSubDep2TableObj interface implementation for the schema.
	 */
	IYCFBamClearSubDep2TableObj getClearSubDep2TableObj();

	/**
	 *	Get the ClearSubDep3 interface for the schema.
	 *
	 *	@return	The IYCFBamClearSubDep3TableObj interface implementation for the schema.
	 */
	IYCFBamClearSubDep3TableObj getClearSubDep3TableObj();

	/**
	 *	Get the ClearTopDep interface for the schema.
	 *
	 *	@return	The IYCFBamClearTopDepTableObj interface implementation for the schema.
	 */
	IYCFBamClearTopDepTableObj getClearTopDepTableObj();

	/**
	 *	Get the DateCol interface for the schema.
	 *
	 *	@return	The IYCFBamDateColTableObj interface implementation for the schema.
	 */
	IYCFBamDateColTableObj getDateColTableObj();

	/**
	 *	Get the DateDef interface for the schema.
	 *
	 *	@return	The IYCFBamDateDefTableObj interface implementation for the schema.
	 */
	IYCFBamDateDefTableObj getDateDefTableObj();

	/**
	 *	Get the DateType interface for the schema.
	 *
	 *	@return	The IYCFBamDateTypeTableObj interface implementation for the schema.
	 */
	IYCFBamDateTypeTableObj getDateTypeTableObj();

	/**
	 *	Get the DbKeyHash128Col interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash128ColTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash128ColTableObj getDbKeyHash128ColTableObj();

	/**
	 *	Get the DbKeyHash128Def interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash128DefTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash128DefTableObj getDbKeyHash128DefTableObj();

	/**
	 *	Get the DbKeyHash128Gen interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash128GenTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash128GenTableObj getDbKeyHash128GenTableObj();

	/**
	 *	Get the DbKeyHash128Type interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash128TypeTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash128TypeTableObj getDbKeyHash128TypeTableObj();

	/**
	 *	Get the DbKeyHash160Col interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash160ColTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash160ColTableObj getDbKeyHash160ColTableObj();

	/**
	 *	Get the DbKeyHash160Def interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash160DefTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash160DefTableObj getDbKeyHash160DefTableObj();

	/**
	 *	Get the DbKeyHash160Gen interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash160GenTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash160GenTableObj getDbKeyHash160GenTableObj();

	/**
	 *	Get the DbKeyHash160Type interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash160TypeTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash160TypeTableObj getDbKeyHash160TypeTableObj();

	/**
	 *	Get the DbKeyHash224Col interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash224ColTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash224ColTableObj getDbKeyHash224ColTableObj();

	/**
	 *	Get the DbKeyHash224Def interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash224DefTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash224DefTableObj getDbKeyHash224DefTableObj();

	/**
	 *	Get the DbKeyHash224Gen interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash224GenTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash224GenTableObj getDbKeyHash224GenTableObj();

	/**
	 *	Get the DbKeyHash224Type interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash224TypeTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash224TypeTableObj getDbKeyHash224TypeTableObj();

	/**
	 *	Get the DbKeyHash256Col interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash256ColTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash256ColTableObj getDbKeyHash256ColTableObj();

	/**
	 *	Get the DbKeyHash256Def interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash256DefTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash256DefTableObj getDbKeyHash256DefTableObj();

	/**
	 *	Get the DbKeyHash256Gen interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash256GenTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash256GenTableObj getDbKeyHash256GenTableObj();

	/**
	 *	Get the DbKeyHash256Type interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash256TypeTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash256TypeTableObj getDbKeyHash256TypeTableObj();

	/**
	 *	Get the DbKeyHash384Col interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash384ColTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash384ColTableObj getDbKeyHash384ColTableObj();

	/**
	 *	Get the DbKeyHash384Def interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash384DefTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash384DefTableObj getDbKeyHash384DefTableObj();

	/**
	 *	Get the DbKeyHash384Gen interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash384GenTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash384GenTableObj getDbKeyHash384GenTableObj();

	/**
	 *	Get the DbKeyHash384Type interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash384TypeTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash384TypeTableObj getDbKeyHash384TypeTableObj();

	/**
	 *	Get the DbKeyHash512Col interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash512ColTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash512ColTableObj getDbKeyHash512ColTableObj();

	/**
	 *	Get the DbKeyHash512Def interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash512DefTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash512DefTableObj getDbKeyHash512DefTableObj();

	/**
	 *	Get the DbKeyHash512Gen interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash512GenTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash512GenTableObj getDbKeyHash512GenTableObj();

	/**
	 *	Get the DbKeyHash512Type interface for the schema.
	 *
	 *	@return	The IYCFBamDbKeyHash512TypeTableObj interface implementation for the schema.
	 */
	IYCFBamDbKeyHash512TypeTableObj getDbKeyHash512TypeTableObj();

	/**
	 *	Get the DelDep interface for the schema.
	 *
	 *	@return	The IYCFBamDelDepTableObj interface implementation for the schema.
	 */
	IYCFBamDelDepTableObj getDelDepTableObj();

	/**
	 *	Get the DelSubDep1 interface for the schema.
	 *
	 *	@return	The IYCFBamDelSubDep1TableObj interface implementation for the schema.
	 */
	IYCFBamDelSubDep1TableObj getDelSubDep1TableObj();

	/**
	 *	Get the DelSubDep2 interface for the schema.
	 *
	 *	@return	The IYCFBamDelSubDep2TableObj interface implementation for the schema.
	 */
	IYCFBamDelSubDep2TableObj getDelSubDep2TableObj();

	/**
	 *	Get the DelSubDep3 interface for the schema.
	 *
	 *	@return	The IYCFBamDelSubDep3TableObj interface implementation for the schema.
	 */
	IYCFBamDelSubDep3TableObj getDelSubDep3TableObj();

	/**
	 *	Get the DelTopDep interface for the schema.
	 *
	 *	@return	The IYCFBamDelTopDepTableObj interface implementation for the schema.
	 */
	IYCFBamDelTopDepTableObj getDelTopDepTableObj();

	/**
	 *	Get the DoubleCol interface for the schema.
	 *
	 *	@return	The IYCFBamDoubleColTableObj interface implementation for the schema.
	 */
	IYCFBamDoubleColTableObj getDoubleColTableObj();

	/**
	 *	Get the DoubleDef interface for the schema.
	 *
	 *	@return	The IYCFBamDoubleDefTableObj interface implementation for the schema.
	 */
	IYCFBamDoubleDefTableObj getDoubleDefTableObj();

	/**
	 *	Get the DoubleType interface for the schema.
	 *
	 *	@return	The IYCFBamDoubleTypeTableObj interface implementation for the schema.
	 */
	IYCFBamDoubleTypeTableObj getDoubleTypeTableObj();

	/**
	 *	Get the EnumDef interface for the schema.
	 *
	 *	@return	The IYCFBamEnumDefTableObj interface implementation for the schema.
	 */
	IYCFBamEnumDefTableObj getEnumDefTableObj();

	/**
	 *	Get the EnumTag interface for the schema.
	 *
	 *	@return	The IYCFBamEnumTagTableObj interface implementation for the schema.
	 */
	IYCFBamEnumTagTableObj getEnumTagTableObj();

	/**
	 *	Get the EnumType interface for the schema.
	 *
	 *	@return	The IYCFBamEnumTypeTableObj interface implementation for the schema.
	 */
	IYCFBamEnumTypeTableObj getEnumTypeTableObj();

	/**
	 *	Get the FloatCol interface for the schema.
	 *
	 *	@return	The IYCFBamFloatColTableObj interface implementation for the schema.
	 */
	IYCFBamFloatColTableObj getFloatColTableObj();

	/**
	 *	Get the FloatDef interface for the schema.
	 *
	 *	@return	The IYCFBamFloatDefTableObj interface implementation for the schema.
	 */
	IYCFBamFloatDefTableObj getFloatDefTableObj();

	/**
	 *	Get the FloatType interface for the schema.
	 *
	 *	@return	The IYCFBamFloatTypeTableObj interface implementation for the schema.
	 */
	IYCFBamFloatTypeTableObj getFloatTypeTableObj();

	/**
	 *	Get the Id16Gen interface for the schema.
	 *
	 *	@return	The IYCFBamId16GenTableObj interface implementation for the schema.
	 */
	IYCFBamId16GenTableObj getId16GenTableObj();

	/**
	 *	Get the Id32Gen interface for the schema.
	 *
	 *	@return	The IYCFBamId32GenTableObj interface implementation for the schema.
	 */
	IYCFBamId32GenTableObj getId32GenTableObj();

	/**
	 *	Get the Id64Gen interface for the schema.
	 *
	 *	@return	The IYCFBamId64GenTableObj interface implementation for the schema.
	 */
	IYCFBamId64GenTableObj getId64GenTableObj();

	/**
	 *	Get the Index interface for the schema.
	 *
	 *	@return	The IYCFBamIndexTableObj interface implementation for the schema.
	 */
	IYCFBamIndexTableObj getIndexTableObj();

	/**
	 *	Get the IndexCol interface for the schema.
	 *
	 *	@return	The IYCFBamIndexColTableObj interface implementation for the schema.
	 */
	IYCFBamIndexColTableObj getIndexColTableObj();

	/**
	 *	Get the IndexTweak interface for the schema.
	 *
	 *	@return	The IYCFBamIndexTweakTableObj interface implementation for the schema.
	 */
	IYCFBamIndexTweakTableObj getIndexTweakTableObj();

	/**
	 *	Get the Int16Col interface for the schema.
	 *
	 *	@return	The IYCFBamInt16ColTableObj interface implementation for the schema.
	 */
	IYCFBamInt16ColTableObj getInt16ColTableObj();

	/**
	 *	Get the Int16Def interface for the schema.
	 *
	 *	@return	The IYCFBamInt16DefTableObj interface implementation for the schema.
	 */
	IYCFBamInt16DefTableObj getInt16DefTableObj();

	/**
	 *	Get the Int16Type interface for the schema.
	 *
	 *	@return	The IYCFBamInt16TypeTableObj interface implementation for the schema.
	 */
	IYCFBamInt16TypeTableObj getInt16TypeTableObj();

	/**
	 *	Get the Int32Col interface for the schema.
	 *
	 *	@return	The IYCFBamInt32ColTableObj interface implementation for the schema.
	 */
	IYCFBamInt32ColTableObj getInt32ColTableObj();

	/**
	 *	Get the Int32Def interface for the schema.
	 *
	 *	@return	The IYCFBamInt32DefTableObj interface implementation for the schema.
	 */
	IYCFBamInt32DefTableObj getInt32DefTableObj();

	/**
	 *	Get the Int32Type interface for the schema.
	 *
	 *	@return	The IYCFBamInt32TypeTableObj interface implementation for the schema.
	 */
	IYCFBamInt32TypeTableObj getInt32TypeTableObj();

	/**
	 *	Get the Int64Col interface for the schema.
	 *
	 *	@return	The IYCFBamInt64ColTableObj interface implementation for the schema.
	 */
	IYCFBamInt64ColTableObj getInt64ColTableObj();

	/**
	 *	Get the Int64Def interface for the schema.
	 *
	 *	@return	The IYCFBamInt64DefTableObj interface implementation for the schema.
	 */
	IYCFBamInt64DefTableObj getInt64DefTableObj();

	/**
	 *	Get the Int64Type interface for the schema.
	 *
	 *	@return	The IYCFBamInt64TypeTableObj interface implementation for the schema.
	 */
	IYCFBamInt64TypeTableObj getInt64TypeTableObj();

	/**
	 *	Get the NmTokenCol interface for the schema.
	 *
	 *	@return	The IYCFBamNmTokenColTableObj interface implementation for the schema.
	 */
	IYCFBamNmTokenColTableObj getNmTokenColTableObj();

	/**
	 *	Get the NmTokenDef interface for the schema.
	 *
	 *	@return	The IYCFBamNmTokenDefTableObj interface implementation for the schema.
	 */
	IYCFBamNmTokenDefTableObj getNmTokenDefTableObj();

	/**
	 *	Get the NmTokenType interface for the schema.
	 *
	 *	@return	The IYCFBamNmTokenTypeTableObj interface implementation for the schema.
	 */
	IYCFBamNmTokenTypeTableObj getNmTokenTypeTableObj();

	/**
	 *	Get the NmTokensCol interface for the schema.
	 *
	 *	@return	The IYCFBamNmTokensColTableObj interface implementation for the schema.
	 */
	IYCFBamNmTokensColTableObj getNmTokensColTableObj();

	/**
	 *	Get the NmTokensDef interface for the schema.
	 *
	 *	@return	The IYCFBamNmTokensDefTableObj interface implementation for the schema.
	 */
	IYCFBamNmTokensDefTableObj getNmTokensDefTableObj();

	/**
	 *	Get the NmTokensType interface for the schema.
	 *
	 *	@return	The IYCFBamNmTokensTypeTableObj interface implementation for the schema.
	 */
	IYCFBamNmTokensTypeTableObj getNmTokensTypeTableObj();

	/**
	 *	Get the NumberCol interface for the schema.
	 *
	 *	@return	The IYCFBamNumberColTableObj interface implementation for the schema.
	 */
	IYCFBamNumberColTableObj getNumberColTableObj();

	/**
	 *	Get the NumberDef interface for the schema.
	 *
	 *	@return	The IYCFBamNumberDefTableObj interface implementation for the schema.
	 */
	IYCFBamNumberDefTableObj getNumberDefTableObj();

	/**
	 *	Get the NumberType interface for the schema.
	 *
	 *	@return	The IYCFBamNumberTypeTableObj interface implementation for the schema.
	 */
	IYCFBamNumberTypeTableObj getNumberTypeTableObj();

	/**
	 *	Get the Param interface for the schema.
	 *
	 *	@return	The IYCFBamParamTableObj interface implementation for the schema.
	 */
	IYCFBamParamTableObj getParamTableObj();

	/**
	 *	Get the PopDep interface for the schema.
	 *
	 *	@return	The IYCFBamPopDepTableObj interface implementation for the schema.
	 */
	IYCFBamPopDepTableObj getPopDepTableObj();

	/**
	 *	Get the PopSubDep1 interface for the schema.
	 *
	 *	@return	The IYCFBamPopSubDep1TableObj interface implementation for the schema.
	 */
	IYCFBamPopSubDep1TableObj getPopSubDep1TableObj();

	/**
	 *	Get the PopSubDep2 interface for the schema.
	 *
	 *	@return	The IYCFBamPopSubDep2TableObj interface implementation for the schema.
	 */
	IYCFBamPopSubDep2TableObj getPopSubDep2TableObj();

	/**
	 *	Get the PopSubDep3 interface for the schema.
	 *
	 *	@return	The IYCFBamPopSubDep3TableObj interface implementation for the schema.
	 */
	IYCFBamPopSubDep3TableObj getPopSubDep3TableObj();

	/**
	 *	Get the PopTopDep interface for the schema.
	 *
	 *	@return	The IYCFBamPopTopDepTableObj interface implementation for the schema.
	 */
	IYCFBamPopTopDepTableObj getPopTopDepTableObj();

	/**
	 *	Get the Relation interface for the schema.
	 *
	 *	@return	The IYCFBamRelationTableObj interface implementation for the schema.
	 */
	IYCFBamRelationTableObj getRelationTableObj();

	/**
	 *	Get the RelationCol interface for the schema.
	 *
	 *	@return	The IYCFBamRelationColTableObj interface implementation for the schema.
	 */
	IYCFBamRelationColTableObj getRelationColTableObj();

	/**
	 *	Get the RoleDef interface for the schema.
	 *
	 *	@return	The IYCFBamRoleDefTableObj interface implementation for the schema.
	 */
	IYCFBamRoleDefTableObj getRoleDefTableObj();

	/**
	 *	Get the SchemaDef interface for the schema.
	 *
	 *	@return	The IYCFBamSchemaDefTableObj interface implementation for the schema.
	 */
	IYCFBamSchemaDefTableObj getSchemaDefTableObj();

	/**
	 *	Get the SchemaRef interface for the schema.
	 *
	 *	@return	The IYCFBamSchemaRefTableObj interface implementation for the schema.
	 */
	IYCFBamSchemaRefTableObj getSchemaRefTableObj();

	/**
	 *	Get the SchemaRole interface for the schema.
	 *
	 *	@return	The IYCFBamSchemaRoleTableObj interface implementation for the schema.
	 */
	IYCFBamSchemaRoleTableObj getSchemaRoleTableObj();

	/**
	 *	Get the SchemaTweak interface for the schema.
	 *
	 *	@return	The IYCFBamSchemaTweakTableObj interface implementation for the schema.
	 */
	IYCFBamSchemaTweakTableObj getSchemaTweakTableObj();

	/**
	 *	Get the Scope interface for the schema.
	 *
	 *	@return	The IYCFBamScopeTableObj interface implementation for the schema.
	 */
	IYCFBamScopeTableObj getScopeTableObj();

	/**
	 *	Get the ServerListFunc interface for the schema.
	 *
	 *	@return	The IYCFBamServerListFuncTableObj interface implementation for the schema.
	 */
	IYCFBamServerListFuncTableObj getServerListFuncTableObj();

	/**
	 *	Get the ServerMethod interface for the schema.
	 *
	 *	@return	The IYCFBamServerMethodTableObj interface implementation for the schema.
	 */
	IYCFBamServerMethodTableObj getServerMethodTableObj();

	/**
	 *	Get the ServerObjFunc interface for the schema.
	 *
	 *	@return	The IYCFBamServerObjFuncTableObj interface implementation for the schema.
	 */
	IYCFBamServerObjFuncTableObj getServerObjFuncTableObj();

	/**
	 *	Get the ServerProc interface for the schema.
	 *
	 *	@return	The IYCFBamServerProcTableObj interface implementation for the schema.
	 */
	IYCFBamServerProcTableObj getServerProcTableObj();

	/**
	 *	Get the StringCol interface for the schema.
	 *
	 *	@return	The IYCFBamStringColTableObj interface implementation for the schema.
	 */
	IYCFBamStringColTableObj getStringColTableObj();

	/**
	 *	Get the StringDef interface for the schema.
	 *
	 *	@return	The IYCFBamStringDefTableObj interface implementation for the schema.
	 */
	IYCFBamStringDefTableObj getStringDefTableObj();

	/**
	 *	Get the StringType interface for the schema.
	 *
	 *	@return	The IYCFBamStringTypeTableObj interface implementation for the schema.
	 */
	IYCFBamStringTypeTableObj getStringTypeTableObj();

	/**
	 *	Get the TZDateCol interface for the schema.
	 *
	 *	@return	The IYCFBamTZDateColTableObj interface implementation for the schema.
	 */
	IYCFBamTZDateColTableObj getTZDateColTableObj();

	/**
	 *	Get the TZDateDef interface for the schema.
	 *
	 *	@return	The IYCFBamTZDateDefTableObj interface implementation for the schema.
	 */
	IYCFBamTZDateDefTableObj getTZDateDefTableObj();

	/**
	 *	Get the TZDateType interface for the schema.
	 *
	 *	@return	The IYCFBamTZDateTypeTableObj interface implementation for the schema.
	 */
	IYCFBamTZDateTypeTableObj getTZDateTypeTableObj();

	/**
	 *	Get the TZTimeCol interface for the schema.
	 *
	 *	@return	The IYCFBamTZTimeColTableObj interface implementation for the schema.
	 */
	IYCFBamTZTimeColTableObj getTZTimeColTableObj();

	/**
	 *	Get the TZTimeDef interface for the schema.
	 *
	 *	@return	The IYCFBamTZTimeDefTableObj interface implementation for the schema.
	 */
	IYCFBamTZTimeDefTableObj getTZTimeDefTableObj();

	/**
	 *	Get the TZTimeType interface for the schema.
	 *
	 *	@return	The IYCFBamTZTimeTypeTableObj interface implementation for the schema.
	 */
	IYCFBamTZTimeTypeTableObj getTZTimeTypeTableObj();

	/**
	 *	Get the TZTimestampCol interface for the schema.
	 *
	 *	@return	The IYCFBamTZTimestampColTableObj interface implementation for the schema.
	 */
	IYCFBamTZTimestampColTableObj getTZTimestampColTableObj();

	/**
	 *	Get the TZTimestampDef interface for the schema.
	 *
	 *	@return	The IYCFBamTZTimestampDefTableObj interface implementation for the schema.
	 */
	IYCFBamTZTimestampDefTableObj getTZTimestampDefTableObj();

	/**
	 *	Get the TZTimestampType interface for the schema.
	 *
	 *	@return	The IYCFBamTZTimestampTypeTableObj interface implementation for the schema.
	 */
	IYCFBamTZTimestampTypeTableObj getTZTimestampTypeTableObj();

	/**
	 *	Get the Table interface for the schema.
	 *
	 *	@return	The IYCFBamTableTableObj interface implementation for the schema.
	 */
	IYCFBamTableTableObj getTableTableObj();

	/**
	 *	Get the TableCol interface for the schema.
	 *
	 *	@return	The IYCFBamTableColTableObj interface implementation for the schema.
	 */
	IYCFBamTableColTableObj getTableColTableObj();

	/**
	 *	Get the TableTweak interface for the schema.
	 *
	 *	@return	The IYCFBamTableTweakTableObj interface implementation for the schema.
	 */
	IYCFBamTableTweakTableObj getTableTweakTableObj();

	/**
	 *	Get the TextCol interface for the schema.
	 *
	 *	@return	The IYCFBamTextColTableObj interface implementation for the schema.
	 */
	IYCFBamTextColTableObj getTextColTableObj();

	/**
	 *	Get the TextDef interface for the schema.
	 *
	 *	@return	The IYCFBamTextDefTableObj interface implementation for the schema.
	 */
	IYCFBamTextDefTableObj getTextDefTableObj();

	/**
	 *	Get the TextType interface for the schema.
	 *
	 *	@return	The IYCFBamTextTypeTableObj interface implementation for the schema.
	 */
	IYCFBamTextTypeTableObj getTextTypeTableObj();

	/**
	 *	Get the TimeCol interface for the schema.
	 *
	 *	@return	The IYCFBamTimeColTableObj interface implementation for the schema.
	 */
	IYCFBamTimeColTableObj getTimeColTableObj();

	/**
	 *	Get the TimeDef interface for the schema.
	 *
	 *	@return	The IYCFBamTimeDefTableObj interface implementation for the schema.
	 */
	IYCFBamTimeDefTableObj getTimeDefTableObj();

	/**
	 *	Get the TimeType interface for the schema.
	 *
	 *	@return	The IYCFBamTimeTypeTableObj interface implementation for the schema.
	 */
	IYCFBamTimeTypeTableObj getTimeTypeTableObj();

	/**
	 *	Get the TimestampCol interface for the schema.
	 *
	 *	@return	The IYCFBamTimestampColTableObj interface implementation for the schema.
	 */
	IYCFBamTimestampColTableObj getTimestampColTableObj();

	/**
	 *	Get the TimestampDef interface for the schema.
	 *
	 *	@return	The IYCFBamTimestampDefTableObj interface implementation for the schema.
	 */
	IYCFBamTimestampDefTableObj getTimestampDefTableObj();

	/**
	 *	Get the TimestampType interface for the schema.
	 *
	 *	@return	The IYCFBamTimestampTypeTableObj interface implementation for the schema.
	 */
	IYCFBamTimestampTypeTableObj getTimestampTypeTableObj();

	/**
	 *	Get the TokenCol interface for the schema.
	 *
	 *	@return	The IYCFBamTokenColTableObj interface implementation for the schema.
	 */
	IYCFBamTokenColTableObj getTokenColTableObj();

	/**
	 *	Get the TokenDef interface for the schema.
	 *
	 *	@return	The IYCFBamTokenDefTableObj interface implementation for the schema.
	 */
	IYCFBamTokenDefTableObj getTokenDefTableObj();

	/**
	 *	Get the TokenType interface for the schema.
	 *
	 *	@return	The IYCFBamTokenTypeTableObj interface implementation for the schema.
	 */
	IYCFBamTokenTypeTableObj getTokenTypeTableObj();

	/**
	 *	Get the Tweak interface for the schema.
	 *
	 *	@return	The IYCFBamTweakTableObj interface implementation for the schema.
	 */
	IYCFBamTweakTableObj getTweakTableObj();

	/**
	 *	Get the UInt16Col interface for the schema.
	 *
	 *	@return	The IYCFBamUInt16ColTableObj interface implementation for the schema.
	 */
	IYCFBamUInt16ColTableObj getUInt16ColTableObj();

	/**
	 *	Get the UInt16Def interface for the schema.
	 *
	 *	@return	The IYCFBamUInt16DefTableObj interface implementation for the schema.
	 */
	IYCFBamUInt16DefTableObj getUInt16DefTableObj();

	/**
	 *	Get the UInt16Type interface for the schema.
	 *
	 *	@return	The IYCFBamUInt16TypeTableObj interface implementation for the schema.
	 */
	IYCFBamUInt16TypeTableObj getUInt16TypeTableObj();

	/**
	 *	Get the UInt32Col interface for the schema.
	 *
	 *	@return	The IYCFBamUInt32ColTableObj interface implementation for the schema.
	 */
	IYCFBamUInt32ColTableObj getUInt32ColTableObj();

	/**
	 *	Get the UInt32Def interface for the schema.
	 *
	 *	@return	The IYCFBamUInt32DefTableObj interface implementation for the schema.
	 */
	IYCFBamUInt32DefTableObj getUInt32DefTableObj();

	/**
	 *	Get the UInt32Type interface for the schema.
	 *
	 *	@return	The IYCFBamUInt32TypeTableObj interface implementation for the schema.
	 */
	IYCFBamUInt32TypeTableObj getUInt32TypeTableObj();

	/**
	 *	Get the UInt64Col interface for the schema.
	 *
	 *	@return	The IYCFBamUInt64ColTableObj interface implementation for the schema.
	 */
	IYCFBamUInt64ColTableObj getUInt64ColTableObj();

	/**
	 *	Get the UInt64Def interface for the schema.
	 *
	 *	@return	The IYCFBamUInt64DefTableObj interface implementation for the schema.
	 */
	IYCFBamUInt64DefTableObj getUInt64DefTableObj();

	/**
	 *	Get the UInt64Type interface for the schema.
	 *
	 *	@return	The IYCFBamUInt64TypeTableObj interface implementation for the schema.
	 */
	IYCFBamUInt64TypeTableObj getUInt64TypeTableObj();

	/**
	 *	Get the Uuid6Col interface for the schema.
	 *
	 *	@return	The IYCFBamUuid6ColTableObj interface implementation for the schema.
	 */
	IYCFBamUuid6ColTableObj getUuid6ColTableObj();

	/**
	 *	Get the Uuid6Def interface for the schema.
	 *
	 *	@return	The IYCFBamUuid6DefTableObj interface implementation for the schema.
	 */
	IYCFBamUuid6DefTableObj getUuid6DefTableObj();

	/**
	 *	Get the Uuid6Gen interface for the schema.
	 *
	 *	@return	The IYCFBamUuid6GenTableObj interface implementation for the schema.
	 */
	IYCFBamUuid6GenTableObj getUuid6GenTableObj();

	/**
	 *	Get the Uuid6Type interface for the schema.
	 *
	 *	@return	The IYCFBamUuid6TypeTableObj interface implementation for the schema.
	 */
	IYCFBamUuid6TypeTableObj getUuid6TypeTableObj();

	/**
	 *	Get the UuidCol interface for the schema.
	 *
	 *	@return	The IYCFBamUuidColTableObj interface implementation for the schema.
	 */
	IYCFBamUuidColTableObj getUuidColTableObj();

	/**
	 *	Get the UuidDef interface for the schema.
	 *
	 *	@return	The IYCFBamUuidDefTableObj interface implementation for the schema.
	 */
	IYCFBamUuidDefTableObj getUuidDefTableObj();

	/**
	 *	Get the UuidGen interface for the schema.
	 *
	 *	@return	The IYCFBamUuidGenTableObj interface implementation for the schema.
	 */
	IYCFBamUuidGenTableObj getUuidGenTableObj();

	/**
	 *	Get the UuidType interface for the schema.
	 *
	 *	@return	The IYCFBamUuidTypeTableObj interface implementation for the schema.
	 */
	IYCFBamUuidTypeTableObj getUuidTypeTableObj();

	/**
	 *	Get the Value interface for the schema.
	 *
	 *	@return	The IYCFBamValueTableObj interface implementation for the schema.
	 */
	IYCFBamValueTableObj getValueTableObj();
}
