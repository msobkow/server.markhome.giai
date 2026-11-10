// Description: Java 11 implementation of an in-memory RAM YCFSec schema.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecRam;

import java.lang.reflect.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecSaxLoader.*;

public class YCFSecRamSchema
	extends YCFSecSchema
	implements IYCFSecSchema
{
		protected short nextISOCcyIdGenValue = 1;
		protected short nextISOCtryIdGenValue = 1;
		protected short nextISOLangIdGenValue = 1;
		protected short nextISOTZoneIdGenValue = 1;
		protected int nextServiceTypeIdGenValue = 1;
		protected long nextClusterIdGenValue = 1;
		protected long nextTenantIdGenValue = 1;


	public YCFSecRamSchema() {
		super();
		tableCluster = new YCFSecRamClusterTable( this );
		tableHostNode = new YCFSecRamHostNodeTable( this );
		tableISOCcy = new YCFSecRamISOCcyTable( this );
		tableISOCtry = new YCFSecRamISOCtryTable( this );
		tableISOCtryCcy = new YCFSecRamISOCtryCcyTable( this );
		tableISOCtryLang = new YCFSecRamISOCtryLangTable( this );
		tableISOLang = new YCFSecRamISOLangTable( this );
		tableISOTZone = new YCFSecRamISOTZoneTable( this );
		tableSecApp = new YCFSecRamSecAppTable( this );
		tableSecDevice = new YCFSecRamSecDeviceTable( this );
		tableSecForm = new YCFSecRamSecFormTable( this );
		tableSecGroup = new YCFSecRamSecGroupTable( this );
		tableSecGroupForm = new YCFSecRamSecGroupFormTable( this );
		tableSecGrpInc = new YCFSecRamSecGrpIncTable( this );
		tableSecGrpMemb = new YCFSecRamSecGrpMembTable( this );
		tableSecSession = new YCFSecRamSecSessionTable( this );
		tableSecUser = new YCFSecRamSecUserTable( this );
		tableService = new YCFSecRamServiceTable( this );
		tableServiceType = new YCFSecRamServiceTypeTable( this );
		tableSysCluster = new YCFSecRamSysClusterTable( this );
		tableTSecGroup = new YCFSecRamTSecGroupTable( this );
		tableTSecGrpInc = new YCFSecRamTSecGrpIncTable( this );
		tableTSecGrpMemb = new YCFSecRamTSecGrpMembTable( this );
		tableTenant = new YCFSecRamTenantTable( this );
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

	public IYCFSecSchema newSchema() {
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

		YCFSecSaxLoader saxLoader = new YCFSecSaxLoader();
		IYCFSecSchemaObj schemaObj = new YCFSecSchemaObj();
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
