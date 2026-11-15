// Description: Java 25 Schema Object implementation for Secure.

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

package server.markhome.ycf.v3_1.secure.secureobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

public class SecureSchemaObj
	implements ISecureSchemaObj
{
	public static final String SCHEMA_NAME = ISecureSchema.SCHEMA_NAME;
	public static final String SCHEMA_DBNAME = ISecureSchema.DBSCHEMA_NAME;
	protected ISecureAuthorization authorization = null;
	protected String secClusterName = "system";
	protected String secTenantName = "system";
	protected String secUserName = "system";
	protected ISecureClusterObj secCluster = null;
	protected CFDbKeyHash256 secClusterId = null;
	protected ISecureTenantObj secTenant = null;
	protected CFDbKeyHash256 secTenantId = null;
	protected ISecureSecUserObj secUser = null;
	protected CFDbKeyHash256 secSessionUserId = null;
	protected ISecureSecSessionObj secSession = null;
	protected CFDbKeyHash256 secSessionSessionId = null;
	protected String schemaDbName = SCHEMA_DBNAME;
	protected String lowerDbSchemaName = SCHEMA_DBNAME.toLowerCase();

	protected ISecureSchema secureBackingStore;
	protected ISecureClusterTableObj clusterTableObj;
	protected ISecureISOCcyTableObj iSOCcyTableObj;
	protected ISecureISOCtryTableObj iSOCtryTableObj;
	protected ISecureISOCtryCcyTableObj iSOCtryCcyTableObj;
	protected ISecureISOCtryLangTableObj iSOCtryLangTableObj;
	protected ISecureISOLangTableObj iSOLangTableObj;
	protected ISecureISOTZoneTableObj iSOTZoneTableObj;
	protected ISecureSecClusGrpTableObj secClusGrpTableObj;
	protected ISecureSecClusGrpMembTableObj secClusGrpMembTableObj;
	protected ISecureSecClusRoleTableObj secClusRoleTableObj;
	protected ISecureSecClusRoleMembTableObj secClusRoleMembTableObj;
	protected ISecureSecSessionTableObj secSessionTableObj;
	protected ISecureSecSysGrpTableObj secSysGrpTableObj;
	protected ISecureSecSysGrpIncTableObj secSysGrpIncTableObj;
	protected ISecureSecSysGrpMembTableObj secSysGrpMembTableObj;
	protected ISecureSecSysRoleTableObj secSysRoleTableObj;
	protected ISecureSecSysRoleEnablesTableObj secSysRoleEnablesTableObj;
	protected ISecureSecSysRoleMembTableObj secSysRoleMembTableObj;
	protected ISecureSecTentGrpTableObj secTentGrpTableObj;
	protected ISecureSecTentGrpMembTableObj secTentGrpMembTableObj;
	protected ISecureSecTentRoleTableObj secTentRoleTableObj;
	protected ISecureSecTentRoleMembTableObj secTentRoleMembTableObj;
	protected ISecureSecUserTableObj secUserTableObj;
	protected ISecureSecUserEMConfTableObj secUserEMConfTableObj;
	protected ISecureSecUserPWHistoryTableObj secUserPWHistoryTableObj;
	protected ISecureSecUserPWResetTableObj secUserPWResetTableObj;
	protected ISecureSecUserPasswordTableObj secUserPasswordTableObj;
	protected ISecureSysClusterTableObj sysClusterTableObj;
	protected ISecureTableInfoTableObj tableInfoTableObj;
	protected ISecureTenantTableObj tenantTableObj;

	public SecureSchemaObj() {

		secureBackingStore = null;
		clusterTableObj = new SecureClusterTableObj( this );
		iSOCcyTableObj = new SecureISOCcyTableObj( this );
		iSOCtryTableObj = new SecureISOCtryTableObj( this );
		iSOCtryCcyTableObj = new SecureISOCtryCcyTableObj( this );
		iSOCtryLangTableObj = new SecureISOCtryLangTableObj( this );
		iSOLangTableObj = new SecureISOLangTableObj( this );
		iSOTZoneTableObj = new SecureISOTZoneTableObj( this );
		secClusGrpTableObj = new SecureSecClusGrpTableObj( this );
		secClusGrpMembTableObj = new SecureSecClusGrpMembTableObj( this );
		secClusRoleTableObj = new SecureSecClusRoleTableObj( this );
		secClusRoleMembTableObj = new SecureSecClusRoleMembTableObj( this );
		secSessionTableObj = new SecureSecSessionTableObj( this );
		secSysGrpTableObj = new SecureSecSysGrpTableObj( this );
		secSysGrpIncTableObj = new SecureSecSysGrpIncTableObj( this );
		secSysGrpMembTableObj = new SecureSecSysGrpMembTableObj( this );
		secSysRoleTableObj = new SecureSecSysRoleTableObj( this );
		secSysRoleEnablesTableObj = new SecureSecSysRoleEnablesTableObj( this );
		secSysRoleMembTableObj = new SecureSecSysRoleMembTableObj( this );
		secTentGrpTableObj = new SecureSecTentGrpTableObj( this );
		secTentGrpMembTableObj = new SecureSecTentGrpMembTableObj( this );
		secTentRoleTableObj = new SecureSecTentRoleTableObj( this );
		secTentRoleMembTableObj = new SecureSecTentRoleMembTableObj( this );
		secUserTableObj = new SecureSecUserTableObj( this );
		secUserEMConfTableObj = new SecureSecUserEMConfTableObj( this );
		secUserPWHistoryTableObj = new SecureSecUserPWHistoryTableObj( this );
		secUserPWResetTableObj = new SecureSecUserPWResetTableObj( this );
		secUserPasswordTableObj = new SecureSecUserPasswordTableObj( this );
		sysClusterTableObj = new SecureSysClusterTableObj( this );
		tableInfoTableObj = new SecureTableInfoTableObj( this );
		tenantTableObj = new SecureTenantTableObj( this );
		}

	public void setSecClusterName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new CFNullArgumentException( getClass(),
				"setClusterName",
				1,
				"value" );
		}
		secClusterName = value;
		secCluster = null;
	}

	public String getSecClusterName() {
		return( secClusterName );
	}

	public ISecureClusterObj getSecCluster() {
		if( secCluster == null ) {
			if( authorization != null ) {
				secCluster = getClusterTableObj().readClusterByIdIdx( authorization.getSecClusterId() );
			}
			else {
				secCluster = getClusterTableObj().readClusterByUDomNameIdx( secClusterName );
				if( secCluster == null && secClusterId != null && !secClusterId.isNull() ) {
					secCluster = getClusterTableObj().readClusterByIdIdx( secClusterId );
				}
			}
			if( secCluster != null ) {
				secClusterName = secCluster.getRequiredFullDomName();
				secClusterId = secCluster.getRequiredId();
				if( authorization != null ) {
					authorization.setSecCluster( secCluster );
				}
			}
		}
		return( secCluster );
	}

	public void setSecCluster( ISecureClusterObj value ) {
		secCluster = value;
		if( secCluster == null ) {
			return;
		}
		secClusterId = secCluster.getRequiredId();
		secClusterName = secCluster.getRequiredFullDomName();
		if( authorization != null ) {
			authorization.setSecCluster( secCluster );
		}
	}

	public CFDbKeyHash256 getSecClusterId() {
		return( secClusterId );
	}

	public void setSecTenantName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new CFNullArgumentException( getClass(),
				"setTenantName",
				1,
				"value" );
		}
		secTenantName = value;
		secTenant = null;
	}

	public String getSecTenantName() {
		return( secTenantName );
	}

	public ISecureTenantObj getSecTenant() {
		if( secTenant == null ) {
			if( authorization != null ) {
				secTenant = getTenantTableObj().readTenantByIdIdx( authorization.getSecTenantId() );
			}
			else {
				secTenant = getTenantTableObj().readTenantByUNameIdx( getSecCluster().getRequiredId(), secTenantName );
				if( ( secTenant == null && secTenantId != null && !secTenantId.isNull() ) ) {
					secTenant = getTenantTableObj().readTenantByIdIdx( secTenantId );
				}
			}
			if( secTenant != null ) {
				secTenantName = secTenant.getRequiredTenantName();
				secTenantId = secTenant.getRequiredId();
				if( authorization != null ) {
					authorization.setSecTenant( secTenant );
				}
			}
		}
		return( secTenant );
	}

	public void setSecTenant( ISecureTenantObj value ) {
		secTenant = value;
		if( secTenant == null ) {
			return;
		}
		secTenantId = secTenant.getRequiredId();
		secTenantName = secTenant.getRequiredTenantName();
		if( authorization != null ) {
			authorization.setSecTenant( secTenant );
		}
	}

	public CFDbKeyHash256 getSecTenantId() {
		return( secTenantId );
	}

	public void setSecUserName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new CFNullArgumentException( getClass(),
				"setUserName",
				1,
				"value" );
		}
		secUserName = value;
		secUser = null;
	}

	public String getSecUserName() {
		return( secUserName );
	}

	public ISecureSecUserObj getSecUser() {
		if( secUser == null ) {
			if( authorization != null ) {
				secUser = getSecUserTableObj().readSecUserByIdIdx( authorization.getSecUserId() );
			}
			else {
				secUser = getSecUserTableObj().readSecUserByULoginIdx( secUserName );
				if( ( secUser == null ) && ( secSessionUserId != null ) ) {
					secUser = getSecUserTableObj().readSecUserByIdIdx( secSessionUserId );
				}
			}
			if( secUser != null ) {
				secUserName = secUser.getRequiredLoginId();
				secSessionUserId = secUser.getRequiredSecUserId();
			}
		}
		return( secUser );
	}

	public void setSecUser( ISecureSecUserObj value ) {
		secUser = value;
		if( secUser != null ) {
			secUserName = secUser.getRequiredLoginId();
			secSessionUserId = secUser.getRequiredSecUserId();
		}
	}
	public ISecureSecSessionObj getSecSession() {
		if( secSession == null ) {
			if( authorization != null ) {
				secSession = getSecSessionTableObj().readSecSessionByIdIdx( authorization.getSecSessionId() );
			}
			else if( secSessionSessionId != null ) {
				secSession = getSecSessionTableObj().readSecSessionByIdIdx( secSessionSessionId );
			}
			if( secSession != null ) {
				secSessionSessionId = secSession.getRequiredSecSessionId();
				secSessionUserId = secSession.getRequiredSecUserId();
			}
		}
		return( secSession );
	}

	public void setSecSession( ISecureSecSessionObj value ) {
		secSession = value;
		if( secSession == null ) {
			return;
		}
		secSessionSessionId = secSession.getRequiredSecSessionId();
		secSessionUserId = secSession.getRequiredSecUserId();
		if( authorization != null ) {
			authorization.setSecSession( secSession );
		}
	}

	public void setSecSessionId( CFDbKeyHash256 value ) {
		secSessionSessionId = value;
	}

	public CFDbKeyHash256 getSecSessionSessionId() {
		return( secSessionSessionId );
	}

	public CFDbKeyHash256 getSecSessionUserId() {
		return( secSessionUserId );
	}

	public ISecureAuthorization getAuthorization() {
		return( authorization );
	}

	public void setAuthorization( ISecureAuthorization value ) {
		authorization = value;
	}

	@Override
	public ISecureSchema getSecureBackingStore() {
		return( secureBackingStore );
	}

	@Override
	public void setSecureBackingStore(ISecureSchema secureBackingStore) {
		if (secureBackingStore == null) {
			throw new CFNullArgumentException(getClass(), "setSecureBackingStore", 1, "secureBackingStore");
		}
		this.secureBackingStore = secureBackingStore;
	}

	public String getSchemaName() {
		return( SCHEMA_NAME );
	}

	public void minimizeMemory() {
		if( clusterTableObj != null ) {
			clusterTableObj.minimizeMemory();
		}
		if( iSOCcyTableObj != null ) {
			iSOCcyTableObj.minimizeMemory();
		}
		if( iSOCtryTableObj != null ) {
			iSOCtryTableObj.minimizeMemory();
		}
		if( iSOCtryCcyTableObj != null ) {
			iSOCtryCcyTableObj.minimizeMemory();
		}
		if( iSOCtryLangTableObj != null ) {
			iSOCtryLangTableObj.minimizeMemory();
		}
		if( iSOLangTableObj != null ) {
			iSOLangTableObj.minimizeMemory();
		}
		if( iSOTZoneTableObj != null ) {
			iSOTZoneTableObj.minimizeMemory();
		}
		if( secClusGrpTableObj != null ) {
			secClusGrpTableObj.minimizeMemory();
		}
		if( secClusGrpMembTableObj != null ) {
			secClusGrpMembTableObj.minimizeMemory();
		}
		if( secClusRoleTableObj != null ) {
			secClusRoleTableObj.minimizeMemory();
		}
		if( secClusRoleMembTableObj != null ) {
			secClusRoleMembTableObj.minimizeMemory();
		}
		if( secSessionTableObj != null ) {
			secSessionTableObj.minimizeMemory();
		}
		if( secSysGrpTableObj != null ) {
			secSysGrpTableObj.minimizeMemory();
		}
		if( secSysGrpIncTableObj != null ) {
			secSysGrpIncTableObj.minimizeMemory();
		}
		if( secSysGrpMembTableObj != null ) {
			secSysGrpMembTableObj.minimizeMemory();
		}
		if( secSysRoleTableObj != null ) {
			secSysRoleTableObj.minimizeMemory();
		}
		if( secSysRoleEnablesTableObj != null ) {
			secSysRoleEnablesTableObj.minimizeMemory();
		}
		if( secSysRoleMembTableObj != null ) {
			secSysRoleMembTableObj.minimizeMemory();
		}
		if( secTentGrpTableObj != null ) {
			secTentGrpTableObj.minimizeMemory();
		}
		if( secTentGrpMembTableObj != null ) {
			secTentGrpMembTableObj.minimizeMemory();
		}
		if( secTentRoleTableObj != null ) {
			secTentRoleTableObj.minimizeMemory();
		}
		if( secTentRoleMembTableObj != null ) {
			secTentRoleMembTableObj.minimizeMemory();
		}
		if( secUserTableObj != null ) {
			secUserTableObj.minimizeMemory();
		}
		if( secUserEMConfTableObj != null ) {
			secUserEMConfTableObj.minimizeMemory();
		}
		if( secUserPWHistoryTableObj != null ) {
			secUserPWHistoryTableObj.minimizeMemory();
		}
		if( secUserPWResetTableObj != null ) {
			secUserPWResetTableObj.minimizeMemory();
		}
		if( secUserPasswordTableObj != null ) {
			secUserPasswordTableObj.minimizeMemory();
		}
		if( sysClusterTableObj != null ) {
			sysClusterTableObj.minimizeMemory();
		}
		if( tableInfoTableObj != null ) {
			tableInfoTableObj.minimizeMemory();
		}
		if( tenantTableObj != null ) {
			tenantTableObj.minimizeMemory();
		}
	}

	public void logout() {
		if( authorization == null ) {
			return;
		}
		setAuthorization( null );
		CFDbKeyHash256 secSessionId = authorization.getSecSessionId();
		if( secSessionId != null ) {
			ISecureSecSessionObj secSession = getSecSessionTableObj().readSecSessionByIdIdx( secSessionId );
			if( secSession != null ) {
				if( secSession.getOptionalFinish() == null ) {
					ISecureSecSessionEditObj editSecSession = secSession.beginEdit();
					editSecSession.setOptionalFinish( LocalDateTime.now() );
					editSecSession.update();
					editSecSession = null;
				}
			}
		}
	}

	public ISecureClusterTableObj getClusterTableObj() {
		return( clusterTableObj );
	}

	public ISecureISOCcyTableObj getISOCcyTableObj() {
		return( iSOCcyTableObj );
	}

	public ISecureISOCtryTableObj getISOCtryTableObj() {
		return( iSOCtryTableObj );
	}

	public ISecureISOCtryCcyTableObj getISOCtryCcyTableObj() {
		return( iSOCtryCcyTableObj );
	}

	public ISecureISOCtryLangTableObj getISOCtryLangTableObj() {
		return( iSOCtryLangTableObj );
	}

	public ISecureISOLangTableObj getISOLangTableObj() {
		return( iSOLangTableObj );
	}

	public ISecureISOTZoneTableObj getISOTZoneTableObj() {
		return( iSOTZoneTableObj );
	}

	public ISecureSecClusGrpTableObj getSecClusGrpTableObj() {
		return( secClusGrpTableObj );
	}

	public ISecureSecClusGrpMembTableObj getSecClusGrpMembTableObj() {
		return( secClusGrpMembTableObj );
	}

	public ISecureSecClusRoleTableObj getSecClusRoleTableObj() {
		return( secClusRoleTableObj );
	}

	public ISecureSecClusRoleMembTableObj getSecClusRoleMembTableObj() {
		return( secClusRoleMembTableObj );
	}

	public ISecureSecSessionTableObj getSecSessionTableObj() {
		return( secSessionTableObj );
	}

	public ISecureSecSysGrpTableObj getSecSysGrpTableObj() {
		return( secSysGrpTableObj );
	}

	public ISecureSecSysGrpIncTableObj getSecSysGrpIncTableObj() {
		return( secSysGrpIncTableObj );
	}

	public ISecureSecSysGrpMembTableObj getSecSysGrpMembTableObj() {
		return( secSysGrpMembTableObj );
	}

	public ISecureSecSysRoleTableObj getSecSysRoleTableObj() {
		return( secSysRoleTableObj );
	}

	public ISecureSecSysRoleEnablesTableObj getSecSysRoleEnablesTableObj() {
		return( secSysRoleEnablesTableObj );
	}

	public ISecureSecSysRoleMembTableObj getSecSysRoleMembTableObj() {
		return( secSysRoleMembTableObj );
	}

	public ISecureSecTentGrpTableObj getSecTentGrpTableObj() {
		return( secTentGrpTableObj );
	}

	public ISecureSecTentGrpMembTableObj getSecTentGrpMembTableObj() {
		return( secTentGrpMembTableObj );
	}

	public ISecureSecTentRoleTableObj getSecTentRoleTableObj() {
		return( secTentRoleTableObj );
	}

	public ISecureSecTentRoleMembTableObj getSecTentRoleMembTableObj() {
		return( secTentRoleMembTableObj );
	}

	public ISecureSecUserTableObj getSecUserTableObj() {
		return( secUserTableObj );
	}

	public ISecureSecUserEMConfTableObj getSecUserEMConfTableObj() {
		return( secUserEMConfTableObj );
	}

	public ISecureSecUserPWHistoryTableObj getSecUserPWHistoryTableObj() {
		return( secUserPWHistoryTableObj );
	}

	public ISecureSecUserPWResetTableObj getSecUserPWResetTableObj() {
		return( secUserPWResetTableObj );
	}

	public ISecureSecUserPasswordTableObj getSecUserPasswordTableObj() {
		return( secUserPasswordTableObj );
	}

	public ISecureSysClusterTableObj getSysClusterTableObj() {
		return( sysClusterTableObj );
	}

	public ISecureTableInfoTableObj getTableInfoTableObj() {
		return( tableInfoTableObj );
	}

	public ISecureTenantTableObj getTenantTableObj() {
		return( tenantTableObj );
	}
}
