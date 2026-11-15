// Description: Java 25 implementation of an in-memory RAM Secure schema.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.secure.secureram;

import java.lang.reflect.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.secure.secure.buff.*;
import server.markhome.ycf.v3_1.secure.securesaxloader.*;

import server.markhome.ycf.v3_1.secure.secure.buff.SecureBuffSchema;
import server.markhome.ycf.v3_1.secure.secure.buff.SecureBuffFactoryService;
import server.markhome.ycf.v3_1.intnet.intnet.buff.IntNetBuffSchema;
import server.markhome.ycf.v3_1.intnet.intnet.buff.IntNetBuffFactoryService;
//import server.markhome.ycf.v3_1.secure.securepub.buff.SecurePubBuffFactoryService;

public class SecureRamSchema
	extends SecureBuffSchema
	implements ISecureSchema
{
	protected short nextISOCcyIdGenValue = 1;
	protected short nextISOCtryIdGenValue = 1;
	protected short nextISOLangIdGenValue = 1;
	protected short nextISOTZoneIdGenValue = 1;
	protected int nextTableInfoIdGenValue = 1;


	public SecureRamSchema() {
		super();
		tableCluster = new SecureRamClusterTable( this );
		tableISOCcy = new SecureRamISOCcyTable( this );
		tableISOCtry = new SecureRamISOCtryTable( this );
		tableISOCtryCcy = new SecureRamISOCtryCcyTable( this );
		tableISOCtryLang = new SecureRamISOCtryLangTable( this );
		tableISOLang = new SecureRamISOLangTable( this );
		tableISOTZone = new SecureRamISOTZoneTable( this );
		tableSecClusGrp = new SecureRamSecClusGrpTable( this );
		tableSecClusGrpMemb = new SecureRamSecClusGrpMembTable( this );
		tableSecClusRole = new SecureRamSecClusRoleTable( this );
		tableSecClusRoleMemb = new SecureRamSecClusRoleMembTable( this );
		tableSecSession = new SecureRamSecSessionTable( this );
		tableSecSysGrp = new SecureRamSecSysGrpTable( this );
		tableSecSysGrpInc = new SecureRamSecSysGrpIncTable( this );
		tableSecSysGrpMemb = new SecureRamSecSysGrpMembTable( this );
		tableSecSysRole = new SecureRamSecSysRoleTable( this );
		tableSecSysRoleEnables = new SecureRamSecSysRoleEnablesTable( this );
		tableSecSysRoleMemb = new SecureRamSecSysRoleMembTable( this );
		tableSecTentGrp = new SecureRamSecTentGrpTable( this );
		tableSecTentGrpMemb = new SecureRamSecTentGrpMembTable( this );
		tableSecTentRole = new SecureRamSecTentRoleTable( this );
		tableSecTentRoleMemb = new SecureRamSecTentRoleMembTable( this );
		tableSecUser = new SecureRamSecUserTable( this );
		tableSecUserEMConf = new SecureRamSecUserEMConfTable( this );
		tableSecUserPWHistory = new SecureRamSecUserPWHistoryTable( this );
		tableSecUserPWReset = new SecureRamSecUserPWResetTable( this );
		tableSecUserPassword = new SecureRamSecUserPasswordTable( this );
		tableSysCluster = new SecureRamSysClusterTable( this );
		tableTableInfo = new SecureRamTableInfoTable( this );
		tableTenant = new SecureRamTenantTable( this );
	}

	@Override
	public ISecureSchema newSchema() {
		throw new CFMustOverrideException( getClass(), "newSchema" );
	}

	@Override
	public short nextISOCcyIdGen() {
		short next = nextISOCcyIdGenValue++;
		return( next );
	}

	@Override
	public short nextISOCtryIdGen() {
		short next = nextISOCtryIdGenValue++;
		return( next );
	}

	@Override
	public short nextISOLangIdGen() {
		short next = nextISOLangIdGenValue++;
		return( next );
	}

	@Override
	public short nextISOTZoneIdGen() {
		short next = nextISOTZoneIdGenValue++;
		return( next );
	}

	@Override
	public int nextTableInfoIdGen() {
		int next = nextTableInfoIdGenValue++;
		return( next );
	}

	@Override
	public CFDbKeyHash256 nextClusterIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecSessionIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecUserIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextTenantIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecSysGrpIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecClusGrpIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecClusRoleIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecTentGrpIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFDbKeyHash256 nextSecTentRoleIdGen() {
		CFDbKeyHash256 retval = new CFDbKeyHash256(0);
		return( retval );
	}

	public String fileImport( SecureAuthorization Authorization,
		String fileName,
		String fileContent )
	{
		final String S_ProcName = "fileImport";
		if( ( fileName == null ) || ( fileName.length() <= 0 ) ) {
			throw new CFNullArgumentException( getClass(),
				S_ProcName,
				1,
				"fileName" );
		}
		if( ( fileContent == null ) || ( fileContent.length() <= 0 ) ) {
			throw new CFNullArgumentException( getClass(),
				S_ProcName,
				2,
				"fileContent" );
		}

		SecureSaxLoader saxLoader = new SecureSaxLoader();
		ISecureSchemaObj schemaObj = new SecureSchemaObj();
		schemaObj.setSecureBackingStore( this );
		saxLoader.setSchemaObj( schemaObj );
		ISecureClusterObj useCluster = schemaObj.getClusterTableObj().readClusterByIdIdx( Authorization.getSecClusterId() );
		ISecureTenantObj useTenant = schemaObj.getTenantTableObj().readTenantByIdIdx( Authorization.getSecTenantId() );
		CFCachedMessageLog runlog = new CFCachedMessageLog();
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

		
	@Override
	public void wireTableTableInstances() {
		if (tableCluster == null || !(tableCluster instanceof SecureRamClusterTable)) {
			tableCluster = new SecureRamClusterTable(this);
		}
		if (tableTenant == null || !(tableTenant instanceof SecureRamTenantTable)) {
			tableTenant = new SecureRamTenantTable(this);
		}
		if (tableTableInfo == null || !(tableTableInfo instanceof SecureRamTableInfoTable)) {
			tableTableInfo = new SecureRamTableInfoTable(this);
		}
		if (tableISOCcy == null || !(tableISOCcy instanceof SecureRamISOCcyTable)) {
			tableISOCcy = new SecureRamISOCcyTable(this);
		}
		if (tableISOCtry == null || !(tableISOCtry instanceof SecureRamISOCtryTable)) {
			tableISOCtry = new SecureRamISOCtryTable(this);
		}
		if (tableISOCtryCcy == null || !(tableISOCtryCcy instanceof SecureRamISOCtryCcyTable)) {
			tableISOCtryCcy = new SecureRamISOCtryCcyTable(this);
		}
		if (tableISOCtryLang == null || !(tableISOCtryLang instanceof SecureRamISOCtryLangTable)) {
			tableISOCtryLang = new SecureRamISOCtryLangTable(this);
		}
		if (tableISOLang == null || !(tableISOLang instanceof SecureRamISOLangTable)) {
			tableISOLang = new SecureRamISOLangTable(this);
		}
		if (tableISOTZone == null || !(tableISOTZone instanceof SecureRamISOTZoneTable)) {
			tableISOTZone = new SecureRamISOTZoneTable(this);
		}
		if (tableSecUser == null || !(tableSecUser instanceof SecureRamSecUserTable)) {
			tableSecUser = new SecureRamSecUserTable(this);
		}
		if (tableSecUserPassword == null || !(tableSecUserPassword instanceof SecureRamSecUserPasswordTable)) {
			tableSecUserPassword = new SecureRamSecUserPasswordTable(this);
		}
		if (tableSecUserEMConf == null || !(tableSecUserEMConf instanceof SecureRamSecUserEMConfTable)) {
			tableSecUserEMConf = new SecureRamSecUserEMConfTable(this);
		}
		if (tableSecUserPWReset == null || !(tableSecUserPWReset instanceof SecureRamSecUserPWResetTable)) {
			tableSecUserPWReset = new SecureRamSecUserPWResetTable(this);
		}
		if (tableSecUserPWHistory == null || !(tableSecUserPWHistory instanceof SecureRamSecUserPWHistoryTable)) {
			tableSecUserPWHistory = new SecureRamSecUserPWHistoryTable(this);
		}
		if (tableSecSysGrp == null || !(tableSecSysGrp instanceof SecureRamSecSysGrpTable)) {
			tableSecSysGrp = new SecureRamSecSysGrpTable(this);
		}
		if (tableSecSysGrpInc == null || !(tableSecSysGrpInc instanceof SecureRamSecSysGrpIncTable)) {
			tableSecSysGrpInc = new SecureRamSecSysGrpIncTable(this);
		}
		if (tableSecSysGrpMemb == null || !(tableSecSysGrpMemb instanceof SecureRamSecSysGrpMembTable)) {
			tableSecSysGrpMemb = new SecureRamSecSysGrpMembTable(this);
		}
		if (tableSecClusGrp == null || !(tableSecClusGrp instanceof SecureRamSecClusGrpTable)) {
			tableSecClusGrp = new SecureRamSecClusGrpTable(this);
		}
		if (tableSecClusGrpMemb == null || !(tableSecClusGrpMemb instanceof SecureRamSecClusGrpMembTable)) {
			tableSecClusGrpMemb = new SecureRamSecClusGrpMembTable(this);
		}
		if (tableSecTentGrp == null || !(tableSecTentGrp instanceof SecureRamSecTentGrpTable)) {
			tableSecTentGrp = new SecureRamSecTentGrpTable(this);
		}
		if (tableSecTentGrpMemb == null || !(tableSecTentGrpMemb instanceof SecureRamSecTentGrpMembTable)) {
			tableSecTentGrpMemb = new SecureRamSecTentGrpMembTable(this);
		}
		if (tableSecSysRole == null || !(tableSecSysRole instanceof SecureRamSecSysRoleTable)) {
			tableSecSysRole = new SecureRamSecSysRoleTable(this);
		}
		if (tableSecSysRoleEnables == null || !(tableSecSysRoleEnables instanceof SecureRamSecSysRoleEnablesTable)) {
			tableSecSysRoleEnables = new SecureRamSecSysRoleEnablesTable(this);
		}
		if (tableSecSysRoleMemb == null || !(tableSecSysRoleMemb instanceof SecureRamSecSysRoleMembTable)) {
			tableSecSysRoleMemb = new SecureRamSecSysRoleMembTable(this);
		}
		if (tableSecClusRole == null || !(tableSecClusRole instanceof SecureRamSecClusRoleTable)) {
			tableSecClusRole = new SecureRamSecClusRoleTable(this);
		}
		if (tableSecClusRoleMemb == null || !(tableSecClusRoleMemb instanceof SecureRamSecClusRoleMembTable)) {
			tableSecClusRoleMemb = new SecureRamSecClusRoleMembTable(this);
		}
		if (tableSecTentRole == null || !(tableSecTentRole instanceof SecureRamSecTentRoleTable)) {
			tableSecTentRole = new SecureRamSecTentRoleTable(this);
		}
		if (tableSecTentRoleMemb == null || !(tableSecTentRoleMemb instanceof SecureRamSecTentRoleMembTable)) {
			tableSecTentRoleMemb = new SecureRamSecTentRoleMembTable(this);
		}
		if (tableSecSession == null || !(tableSecSession instanceof SecureRamSecSessionTable)) {
			tableSecSession = new SecureRamSecSessionTable(this);
		}
		if (tableSysCluster == null || !(tableSysCluster instanceof SecureRamSysClusterTable)) {
			tableSysCluster = new SecureRamSysClusterTable(this);
		}
	}
}
