// Description: Java 11 implementation of an in-memory RAM YCFBam schema.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamRam;

import java.lang.reflect.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamSaxLoader.*;

public class YCFBamRamSchema
	extends YCFBamSchema
	implements IYCFBamSchema
{
		protected short nextISOCcyIdGenValue = 1;
		protected short nextISOCtryIdGenValue = 1;
		protected short nextISOLangIdGenValue = 1;
		protected short nextISOTZoneIdGenValue = 1;
		protected int nextServiceTypeIdGenValue = 1;
		protected int nextMimeTypeIdGenValue = 1;
		protected int nextURLProtocolIdGenValue = 1;
		protected long nextClusterIdGenValue = 1;
		protected long nextTenantIdGenValue = 1;


	public YCFBamRamSchema() {
		super();
		tableAtom = new YCFBamRamAtomTable( this );
		tableBlobCol = new YCFBamRamBlobColTable( this );
		tableBlobDef = new YCFBamRamBlobDefTable( this );
		tableBlobType = new YCFBamRamBlobTypeTable( this );
		tableBoolCol = new YCFBamRamBoolColTable( this );
		tableBoolDef = new YCFBamRamBoolDefTable( this );
		tableBoolType = new YCFBamRamBoolTypeTable( this );
		tableChain = new YCFBamRamChainTable( this );
		tableClearDep = new YCFBamRamClearDepTable( this );
		tableClearSubDep1 = new YCFBamRamClearSubDep1Table( this );
		tableClearSubDep2 = new YCFBamRamClearSubDep2Table( this );
		tableClearSubDep3 = new YCFBamRamClearSubDep3Table( this );
		tableClearTopDep = new YCFBamRamClearTopDepTable( this );
		tableCluster = new YCFBamRamClusterTable( this );
		tableDateCol = new YCFBamRamDateColTable( this );
		tableDateDef = new YCFBamRamDateDefTable( this );
		tableDateType = new YCFBamRamDateTypeTable( this );
		tableDbKeyHash128Col = new YCFBamRamDbKeyHash128ColTable( this );
		tableDbKeyHash128Def = new YCFBamRamDbKeyHash128DefTable( this );
		tableDbKeyHash128Gen = new YCFBamRamDbKeyHash128GenTable( this );
		tableDbKeyHash128Type = new YCFBamRamDbKeyHash128TypeTable( this );
		tableDbKeyHash160Col = new YCFBamRamDbKeyHash160ColTable( this );
		tableDbKeyHash160Def = new YCFBamRamDbKeyHash160DefTable( this );
		tableDbKeyHash160Gen = new YCFBamRamDbKeyHash160GenTable( this );
		tableDbKeyHash160Type = new YCFBamRamDbKeyHash160TypeTable( this );
		tableDbKeyHash224Col = new YCFBamRamDbKeyHash224ColTable( this );
		tableDbKeyHash224Def = new YCFBamRamDbKeyHash224DefTable( this );
		tableDbKeyHash224Gen = new YCFBamRamDbKeyHash224GenTable( this );
		tableDbKeyHash224Type = new YCFBamRamDbKeyHash224TypeTable( this );
		tableDbKeyHash256Col = new YCFBamRamDbKeyHash256ColTable( this );
		tableDbKeyHash256Def = new YCFBamRamDbKeyHash256DefTable( this );
		tableDbKeyHash256Gen = new YCFBamRamDbKeyHash256GenTable( this );
		tableDbKeyHash256Type = new YCFBamRamDbKeyHash256TypeTable( this );
		tableDbKeyHash384Col = new YCFBamRamDbKeyHash384ColTable( this );
		tableDbKeyHash384Def = new YCFBamRamDbKeyHash384DefTable( this );
		tableDbKeyHash384Gen = new YCFBamRamDbKeyHash384GenTable( this );
		tableDbKeyHash384Type = new YCFBamRamDbKeyHash384TypeTable( this );
		tableDbKeyHash512Col = new YCFBamRamDbKeyHash512ColTable( this );
		tableDbKeyHash512Def = new YCFBamRamDbKeyHash512DefTable( this );
		tableDbKeyHash512Gen = new YCFBamRamDbKeyHash512GenTable( this );
		tableDbKeyHash512Type = new YCFBamRamDbKeyHash512TypeTable( this );
		tableDelDep = new YCFBamRamDelDepTable( this );
		tableDelSubDep1 = new YCFBamRamDelSubDep1Table( this );
		tableDelSubDep2 = new YCFBamRamDelSubDep2Table( this );
		tableDelSubDep3 = new YCFBamRamDelSubDep3Table( this );
		tableDelTopDep = new YCFBamRamDelTopDepTable( this );
		tableDoubleCol = new YCFBamRamDoubleColTable( this );
		tableDoubleDef = new YCFBamRamDoubleDefTable( this );
		tableDoubleType = new YCFBamRamDoubleTypeTable( this );
		tableEnumDef = new YCFBamRamEnumDefTable( this );
		tableEnumTag = new YCFBamRamEnumTagTable( this );
		tableEnumType = new YCFBamRamEnumTypeTable( this );
		tableFloatCol = new YCFBamRamFloatColTable( this );
		tableFloatDef = new YCFBamRamFloatDefTable( this );
		tableFloatType = new YCFBamRamFloatTypeTable( this );
		tableHostNode = new YCFBamRamHostNodeTable( this );
		tableISOCcy = new YCFBamRamISOCcyTable( this );
		tableISOCtry = new YCFBamRamISOCtryTable( this );
		tableISOCtryCcy = new YCFBamRamISOCtryCcyTable( this );
		tableISOCtryLang = new YCFBamRamISOCtryLangTable( this );
		tableISOLang = new YCFBamRamISOLangTable( this );
		tableISOTZone = new YCFBamRamISOTZoneTable( this );
		tableId16Gen = new YCFBamRamId16GenTable( this );
		tableId32Gen = new YCFBamRamId32GenTable( this );
		tableId64Gen = new YCFBamRamId64GenTable( this );
		tableIndex = new YCFBamRamIndexTable( this );
		tableIndexCol = new YCFBamRamIndexColTable( this );
		tableIndexTweak = new YCFBamRamIndexTweakTable( this );
		tableInt16Col = new YCFBamRamInt16ColTable( this );
		tableInt16Def = new YCFBamRamInt16DefTable( this );
		tableInt16Type = new YCFBamRamInt16TypeTable( this );
		tableInt32Col = new YCFBamRamInt32ColTable( this );
		tableInt32Def = new YCFBamRamInt32DefTable( this );
		tableInt32Type = new YCFBamRamInt32TypeTable( this );
		tableInt64Col = new YCFBamRamInt64ColTable( this );
		tableInt64Def = new YCFBamRamInt64DefTable( this );
		tableInt64Type = new YCFBamRamInt64TypeTable( this );
		tableLicense = new YCFBamRamLicenseTable( this );
		tableMajorVersion = new YCFBamRamMajorVersionTable( this );
		tableMimeType = new YCFBamRamMimeTypeTable( this );
		tableMinorVersion = new YCFBamRamMinorVersionTable( this );
		tableNmTokenCol = new YCFBamRamNmTokenColTable( this );
		tableNmTokenDef = new YCFBamRamNmTokenDefTable( this );
		tableNmTokenType = new YCFBamRamNmTokenTypeTable( this );
		tableNmTokensCol = new YCFBamRamNmTokensColTable( this );
		tableNmTokensDef = new YCFBamRamNmTokensDefTable( this );
		tableNmTokensType = new YCFBamRamNmTokensTypeTable( this );
		tableNumberCol = new YCFBamRamNumberColTable( this );
		tableNumberDef = new YCFBamRamNumberDefTable( this );
		tableNumberType = new YCFBamRamNumberTypeTable( this );
		tableParam = new YCFBamRamParamTable( this );
		tablePopDep = new YCFBamRamPopDepTable( this );
		tablePopSubDep1 = new YCFBamRamPopSubDep1Table( this );
		tablePopSubDep2 = new YCFBamRamPopSubDep2Table( this );
		tablePopSubDep3 = new YCFBamRamPopSubDep3Table( this );
		tablePopTopDep = new YCFBamRamPopTopDepTable( this );
		tableRelation = new YCFBamRamRelationTable( this );
		tableRelationCol = new YCFBamRamRelationColTable( this );
		tableRoleDef = new YCFBamRamRoleDefTable( this );
		tableSchemaDef = new YCFBamRamSchemaDefTable( this );
		tableSchemaRef = new YCFBamRamSchemaRefTable( this );
		tableSchemaRole = new YCFBamRamSchemaRoleTable( this );
		tableSchemaTweak = new YCFBamRamSchemaTweakTable( this );
		tableScope = new YCFBamRamScopeTable( this );
		tableSecApp = new YCFBamRamSecAppTable( this );
		tableSecDevice = new YCFBamRamSecDeviceTable( this );
		tableSecForm = new YCFBamRamSecFormTable( this );
		tableSecGroup = new YCFBamRamSecGroupTable( this );
		tableSecGroupForm = new YCFBamRamSecGroupFormTable( this );
		tableSecGrpInc = new YCFBamRamSecGrpIncTable( this );
		tableSecGrpMemb = new YCFBamRamSecGrpMembTable( this );
		tableSecSession = new YCFBamRamSecSessionTable( this );
		tableSecUser = new YCFBamRamSecUserTable( this );
		tableServerListFunc = new YCFBamRamServerListFuncTable( this );
		tableServerMethod = new YCFBamRamServerMethodTable( this );
		tableServerObjFunc = new YCFBamRamServerObjFuncTable( this );
		tableServerProc = new YCFBamRamServerProcTable( this );
		tableService = new YCFBamRamServiceTable( this );
		tableServiceType = new YCFBamRamServiceTypeTable( this );
		tableStringCol = new YCFBamRamStringColTable( this );
		tableStringDef = new YCFBamRamStringDefTable( this );
		tableStringType = new YCFBamRamStringTypeTable( this );
		tableSubProject = new YCFBamRamSubProjectTable( this );
		tableSysCluster = new YCFBamRamSysClusterTable( this );
		tableTSecGroup = new YCFBamRamTSecGroupTable( this );
		tableTSecGrpInc = new YCFBamRamTSecGrpIncTable( this );
		tableTSecGrpMemb = new YCFBamRamTSecGrpMembTable( this );
		tableTZDateCol = new YCFBamRamTZDateColTable( this );
		tableTZDateDef = new YCFBamRamTZDateDefTable( this );
		tableTZDateType = new YCFBamRamTZDateTypeTable( this );
		tableTZTimeCol = new YCFBamRamTZTimeColTable( this );
		tableTZTimeDef = new YCFBamRamTZTimeDefTable( this );
		tableTZTimeType = new YCFBamRamTZTimeTypeTable( this );
		tableTZTimestampCol = new YCFBamRamTZTimestampColTable( this );
		tableTZTimestampDef = new YCFBamRamTZTimestampDefTable( this );
		tableTZTimestampType = new YCFBamRamTZTimestampTypeTable( this );
		tableTable = new YCFBamRamTableTable( this );
		tableTableCol = new YCFBamRamTableColTable( this );
		tableTableTweak = new YCFBamRamTableTweakTable( this );
		tableTenant = new YCFBamRamTenantTable( this );
		tableTextCol = new YCFBamRamTextColTable( this );
		tableTextDef = new YCFBamRamTextDefTable( this );
		tableTextType = new YCFBamRamTextTypeTable( this );
		tableTimeCol = new YCFBamRamTimeColTable( this );
		tableTimeDef = new YCFBamRamTimeDefTable( this );
		tableTimeType = new YCFBamRamTimeTypeTable( this );
		tableTimestampCol = new YCFBamRamTimestampColTable( this );
		tableTimestampDef = new YCFBamRamTimestampDefTable( this );
		tableTimestampType = new YCFBamRamTimestampTypeTable( this );
		tableTld = new YCFBamRamTldTable( this );
		tableTokenCol = new YCFBamRamTokenColTable( this );
		tableTokenDef = new YCFBamRamTokenDefTable( this );
		tableTokenType = new YCFBamRamTokenTypeTable( this );
		tableTopDomain = new YCFBamRamTopDomainTable( this );
		tableTopProject = new YCFBamRamTopProjectTable( this );
		tableTweak = new YCFBamRamTweakTable( this );
		tableUInt16Col = new YCFBamRamUInt16ColTable( this );
		tableUInt16Def = new YCFBamRamUInt16DefTable( this );
		tableUInt16Type = new YCFBamRamUInt16TypeTable( this );
		tableUInt32Col = new YCFBamRamUInt32ColTable( this );
		tableUInt32Def = new YCFBamRamUInt32DefTable( this );
		tableUInt32Type = new YCFBamRamUInt32TypeTable( this );
		tableUInt64Col = new YCFBamRamUInt64ColTable( this );
		tableUInt64Def = new YCFBamRamUInt64DefTable( this );
		tableUInt64Type = new YCFBamRamUInt64TypeTable( this );
		tableURLProtocol = new YCFBamRamURLProtocolTable( this );
		tableUuid6Col = new YCFBamRamUuid6ColTable( this );
		tableUuid6Def = new YCFBamRamUuid6DefTable( this );
		tableUuid6Gen = new YCFBamRamUuid6GenTable( this );
		tableUuid6Type = new YCFBamRamUuid6TypeTable( this );
		tableUuidCol = new YCFBamRamUuidColTable( this );
		tableUuidDef = new YCFBamRamUuidDefTable( this );
		tableUuidGen = new YCFBamRamUuidGenTable( this );
		tableUuidType = new YCFBamRamUuidTypeTable( this );
		tableValue = new YCFBamRamValueTable( this );
	}

	protected boolean sessConnected = false;

	public boolean isConnected() {
		return( sessConnected );
	}

	public boolean connect() {
		if( sessConnected ) {
			return( false );
		}
		else {
			sessConnected = true;
			tranOpen = false;
			return( true );
		}
	}

	public boolean connect( String username, String password ) {
		final String S_ProcName = "connect";
		if( ( username == null ) || ( username.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"username" );
		}
		if( password == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"password" );
		}
		if( ! username.equals( "system" ) ) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Only 'system' is authorized to use a RAM database" );
		}
		if( sessConnected ) {
			return( false );
		}
		else {
			sessConnected = true;
			tranOpen = false;
			return( true );
		}
	}

	public boolean connect( String loginId, String password, String clusterName, String tenantName ) {
		final String S_ProcName = "connect";
		if( ( loginId == null ) || ( loginId.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"loginId" );
		}
		if( password == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"password" );
		}
		if( clusterName == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				3,
				"clusterName" );
		}
		if( tenantName == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				4,
				"tenantName" );
		}
		if( ! loginId.equals( "system" ) ) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Only 'system' is authorized to use a RAM database" );
		}
		if( ! clusterName.equals( "system" ) ) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Only the 'system' Cluster is authorized to use a RAM database" );
		}
		if( ! tenantName.equals( "system" ) ) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Only the 'system' Tenant is authorized to use a RAM database" );
		}
		if( sessConnected ) {
			return( false );
		}
		else {
			sessConnected = true;
			tranOpen = false;
			return( true );
		}
	}

	public void disconnect( boolean doCommit ) {
		tranOpen = false;
		sessConnected = false;
	}

	//	Transactions are not supported, so pretend there is always one open

	protected boolean tranOpen = false;

	public boolean isTransactionOpen() {
		return( tranOpen );
	}

	public boolean beginTransaction() {
		if( tranOpen ) {
			return( false );
		}
		tranOpen = true;
		return( true );
	}

	public void commit() {
		tranOpen = false;
	}

	public void rollback() {
		tranOpen = false;
	}

	public IYCFBamSchema newSchema() {
		throw new YCFLibMustOverrideException( getClass(), "newSchema" );
	}

	public short nextISOCcyIdGen() {
		short next = nextISOCcyIdGenValue++;
		return( next );
	}

	public short nextISOCtryIdGen() {
		short next = nextISOCtryIdGenValue++;
		return( next );
	}

	public short nextISOLangIdGen() {
		short next = nextISOLangIdGenValue++;
		return( next );
	}

	public short nextISOTZoneIdGen() {
		short next = nextISOTZoneIdGenValue++;
		return( next );
	}

	public int nextServiceTypeIdGen() {
		int next = nextServiceTypeIdGenValue++;
		return( next );
	}

	public int nextMimeTypeIdGen() {
		int next = nextMimeTypeIdGenValue++;
		return( next );
	}

	public int nextURLProtocolIdGen() {
		int next = nextURLProtocolIdGenValue++;
		return( next );
	}

	public long nextClusterIdGen() {
		long next = nextClusterIdGenValue++;
		return( next );
	}

	public long nextTenantIdGen() {
		long next = nextTenantIdGenValue++;
		return( next );
	}

	public UUID nextSecSessionIdGen() {
		UUID next = UUID.randomUUID();
		return( next );
	}

	public UUID nextSecUserIdGen() {
		UUID next = UUID.randomUUID();
		return( next );
	}

	public void releasePreparedStatements() {
	}

	public String fileImport( YCFSecAuthorization Authorization,
		String fileName,
		String fileContent )
	{
		final String S_ProcName = "fileImport";
		if( ( fileName == null ) || ( fileName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"fileName" );
		}
		if( ( fileContent == null ) || ( fileContent.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"fileContent" );
		}

		YCFBamSaxLoader saxLoader = new YCFBamSaxLoader();
		IYCFBamSchemaObj schemaObj = new YCFBamSchemaObj();
		schemaObj.setBackingStore( this );
		saxLoader.setSchemaObj( schemaObj );
		IYCFSecClusterObj useCluster = schemaObj.getClusterTableObj().readClusterByIdIdx( Authorization.getSecClusterId() );
		IYCFSecTenantObj useTenant = schemaObj.getTenantTableObj().readTenantByIdIdx( Authorization.getSecTenantId() );
		YCFLibCachedMessageLog runlog = new YCFLibCachedMessageLog();
		saxLoader.setLog( runlog );
		saxLoader.setUseCluster( useCluster );
		saxLoader.setUseTenant( useTenant );
		saxLoader.parseStringContents( fileContent );
		String logFileContent = runlog.getCacheContents();
		if( logFileContent == null ) {
			logFileContent = "";
		}

		return( logFileContent );
	}
}
