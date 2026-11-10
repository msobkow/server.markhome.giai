// Description: Java 11 Schema Object implementation for YCFSec.

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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
public class YCFSecSchemaObj
	implements IYCFSecSchemaObj
{
	public static String SCHEMA_NAME = "YCFSec";
	public static String SCHEMA_DBNAME = "ycfsec213";
	protected YCFSecAuthorization authorization = null;
	protected IYCFSecSchema backingStore = null;
	protected String secClusterName = "system";
	protected String secTenantName = "system";
	protected String secUserName = "system";
	protected IYCFSecClusterObj secCluster = null;
	protected long secClusterId = 0L;
	protected IYCFSecTenantObj secTenant = null;
	protected long secTenantId = 0L;
	protected IYCFSecSecUserObj secUser = null;
	protected UUID secSessionUserId = null;
	protected IYCFSecSecSessionObj secSession = null;
	protected UUID secSessionSessionId = null;
	protected String schemaDbName = SCHEMA_DBNAME;
	protected String lowerDbSchemaName = SCHEMA_DBNAME.toLowerCase();
	protected IYCFSecClusterTableObj clusterTableObj;
	protected IYCFSecHostNodeTableObj hostNodeTableObj;
	protected IYCFSecISOCcyTableObj iSOCcyTableObj;
	protected IYCFSecISOCtryTableObj iSOCtryTableObj;
	protected IYCFSecISOCtryCcyTableObj iSOCtryCcyTableObj;
	protected IYCFSecISOCtryLangTableObj iSOCtryLangTableObj;
	protected IYCFSecISOLangTableObj iSOLangTableObj;
	protected IYCFSecISOTZoneTableObj iSOTZoneTableObj;
	protected IYCFSecSecAppTableObj secAppTableObj;
	protected IYCFSecSecDeviceTableObj secDeviceTableObj;
	protected IYCFSecSecFormTableObj secFormTableObj;
	protected IYCFSecSecGroupTableObj secGroupTableObj;
	protected IYCFSecSecGroupFormTableObj secGroupFormTableObj;
	protected IYCFSecSecGrpIncTableObj secGrpIncTableObj;
	protected IYCFSecSecGrpMembTableObj secGrpMembTableObj;
	protected IYCFSecSecSessionTableObj secSessionTableObj;
	protected IYCFSecSecUserTableObj secUserTableObj;
	protected IYCFSecServiceTableObj serviceTableObj;
	protected IYCFSecServiceTypeTableObj serviceTypeTableObj;
	protected IYCFSecSysClusterTableObj sysClusterTableObj;
	protected IYCFSecTSecGroupTableObj tSecGroupTableObj;
	protected IYCFSecTSecGrpIncTableObj tSecGrpIncTableObj;
	protected IYCFSecTSecGrpMembTableObj tSecGrpMembTableObj;
	protected IYCFSecTenantTableObj tenantTableObj;

	public YCFSecSchemaObj() {
		clusterTableObj = new YCFSecClusterTableObj( this );
		hostNodeTableObj = new YCFSecHostNodeTableObj( this );
		iSOCcyTableObj = new YCFSecISOCcyTableObj( this );
		iSOCtryTableObj = new YCFSecISOCtryTableObj( this );
		iSOCtryCcyTableObj = new YCFSecISOCtryCcyTableObj( this );
		iSOCtryLangTableObj = new YCFSecISOCtryLangTableObj( this );
		iSOLangTableObj = new YCFSecISOLangTableObj( this );
		iSOTZoneTableObj = new YCFSecISOTZoneTableObj( this );
		secAppTableObj = new YCFSecSecAppTableObj( this );
		secDeviceTableObj = new YCFSecSecDeviceTableObj( this );
		secFormTableObj = new YCFSecSecFormTableObj( this );
		secGroupTableObj = new YCFSecSecGroupTableObj( this );
		secGroupFormTableObj = new YCFSecSecGroupFormTableObj( this );
		secGrpIncTableObj = new YCFSecSecGrpIncTableObj( this );
		secGrpMembTableObj = new YCFSecSecGrpMembTableObj( this );
		secSessionTableObj = new YCFSecSecSessionTableObj( this );
		secUserTableObj = new YCFSecSecUserTableObj( this );
		serviceTableObj = new YCFSecServiceTableObj( this );
		serviceTypeTableObj = new YCFSecServiceTypeTableObj( this );
		sysClusterTableObj = new YCFSecSysClusterTableObj( this );
		tSecGroupTableObj = new YCFSecTSecGroupTableObj( this );
		tSecGrpIncTableObj = new YCFSecTSecGrpIncTableObj( this );
		tSecGrpMembTableObj = new YCFSecTSecGrpMembTableObj( this );
		tenantTableObj = new YCFSecTenantTableObj( this );
		}

	public void setSecClusterName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
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

	public IYCFSecClusterObj getSecCluster() {
		if( secCluster == null ) {
			if( authorization != null ) {
				secCluster = getClusterTableObj().readClusterByIdIdx( authorization.getSecClusterId() );
			}
			else {
				secCluster = getClusterTableObj().readClusterByUDomNameIdx( secClusterName );
				if( ( secCluster == null ) && ( secClusterId > 0 ) ) {
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

	public void setSecCluster( IYCFSecClusterObj value ) {
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

	public long getSecClusterId() {
		return( secClusterId );
	}

	public void setSecTenantName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
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

	public IYCFSecTenantObj getSecTenant() {
		if( secTenant == null ) {
			if( authorization != null ) {
				secTenant = getTenantTableObj().readTenantByIdIdx( authorization.getSecTenantId() );
			}
			else {
				secTenant = getTenantTableObj().readTenantByUNameIdx( getSecCluster().getRequiredId(), secTenantName );
				if( ( secTenant == null ) && ( secTenantId > 0 ) ) {
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

	public void setSecTenant( IYCFSecTenantObj value ) {
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

	public long getSecTenantId() {
		return( secTenantId );
	}

	public void setSecUserName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
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

	public IYCFSecSecUserObj getSecUser() {
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

	public void setSecUser( IYCFSecSecUserObj value ) {
		secUser = value;
		if( secUser != null ) {
			secUserName = secUser.getRequiredLoginId();
			secSessionUserId = secUser.getRequiredSecUserId();
		}
	}
	public IYCFSecSecSessionObj getSecSession() {
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

	public void setSecSession( IYCFSecSecSessionObj value ) {
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

	public void setSecSessionId( UUID value ) {
		secSessionSessionId = value;
	}

	public UUID getSecSessionSessionId() {
		return( secSessionSessionId );
	}

	public UUID getSecSessionUserId() {
		return( secSessionUserId );
	}

	/**
	 *	When you first connect to a database, you can opt to specify a database
	 *	schema name to be used by the session.  The implementation code must always
	 *	be dynamically based on the invocation of <tt>String getDbSchemaName()</tt>
	 *	at runtime.
	 *	<p>
	 *	The initial value is defined by the implementing schema model which has inherited
	 *	the expression of the current schema model being expanded.  That is, it is specified
	 *	in the DbSchemaName attribute of a SchemaDef instance.
	 */
	public String getDbSchemaName() {
		return( schemaDbName );
	}

	/**
	 *	PostgreSQL coerces database schema names to lowercase for consistency.
	 */
	public String getLowerDbSchemaName() {
		return( lowerDbSchemaName );
	}

	/**
	 *	The database is expected to override this implementation and invoke the
	 *	<tt>super.setDbSchemaName( String argDbSchemaName )</tt> early
	 *	on in the implementation of the cust body.  You should let the exceptions
	 *	which can be thrown by this implementation pass unimpeded.
	 *	<pg>
	 *	When you set the database schema name, the database-specific implementation
	 *	of this method does a "commit; use database"-type sequence to change
	 *	to the target database.  This should be specified globally for all
	 *	database connections in a given cluster, so that all of
	 *	the application implementation clients are using the same database instance
	 *	regardless of what's been provided by the cust client implementation,
	 *	be it as a Java application or a web interface written using JEE.
	 */
	public void setDbSchemaName( String argDbSchemaName ) {
		final String S_ProcName = "setDbSchemaName";

		rollback();

		if( ( argDbSchemaName == null ) || ( argDbSchemaName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"argDbSchemaName" );
		}

		if( backingStore != null ) {
			backingStore.setDbSchemaName( argDbSchemaName );
		}

		schemaDbName = argDbSchemaName;
		lowerDbSchemaName = schemaDbName.toLowerCase();

		releasePreparedStatements();
	}

	public String fileImport( String fileName, String fileContent ) {
		String logContent = backingStore.fileImport( getAuthorization(), fileName, fileContent );
		return( logContent );
	}

	/**
	 *	Release any prepared statements acquired by this connection.
	 *	<p>
	 *	Resets the prepared statements so they can acquire the new value of
	 *	<tt>setDbSchemaName()</tt>.
	 */
	public void releasePreparedStatements() {
	}
	public YCFSecAuthorization getAuthorization() {
		return( authorization );
	}

	public void setAuthorization( YCFSecAuthorization value ) {
		authorization = value;
	}

	public IYCFSecSchema getBackingStore() {
		return( backingStore );
	}

	public void setBackingStore( IYCFSecSchema value ) {
		backingStore = value;
	}

	public String getSchemaName() {
		return( SCHEMA_NAME );
	}

	public boolean isConnected() {
		if( backingStore == null ) {
			return( false );
		}
		else {
			return( backingStore.isConnected() );
		}
	}

	public boolean connect() {
		return( backingStore.connect() );
	}

	public boolean connect( String username, String password ) {
		return( backingStore.connect( username, password ) );
	}

	public boolean connect( String clusterName, String tenantName, String secUserName, String password ) {
		final String S_ProcName = "connect-full";
		if( ( clusterName == null ) || ( clusterName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"clusterName" );
		}
		if( ( tenantName == null ) || ( tenantName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"tenantName" );
		}
		if( ( secUserName == null ) || ( secUserName.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				3,
				"secUserName" );
		}
		if( ( password == null ) || ( password.length() <= 0 ) ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				5,
				"password" );
		}
		if( ! backingStore.connect( secUserName, password, clusterName, tenantName ) ) {
			authorization = null;
			return( false );
		}
		if( authorization != null ) {
			// The login was established as an XMsg client, which automatically sets the Authorization
			// information based on the return message.  You only need to do the remaining SecSession
			// and authorization creation if you're using a direct client-server model instead of
			// an XMsg client-server model.
			setSecClusterName( clusterName );
			setSecTenantName( tenantName );
			setSecUserName( secUserName );
			return( true );
		}

		if( clusterName.equals( "system" )
		 && tenantName.equals( "system" )
		 && secUserName.equals( "system" ) )
		{
			if( secCluster == null ) {
				secCluster = getClusterTableObj().newInstance();
				IYCFSecClusterEditObj editCluster = secCluster.getEdit();
				if( editCluster == null ) {
					editCluster = secCluster.beginEdit();
					editCluster.setRequiredDescription( "system" );
					editCluster.setRequiredFullDomName( "system" );
					secCluster = editCluster.create();
					editCluster = null;
				}
			}
			if( secTenant == null ) {
				secTenant = getTenantTableObj().newInstance();
				IYCFSecTenantEditObj editTenant = secTenant.getEdit();
				if( editTenant == null ) {
					editTenant = secTenant.beginEdit();
					editTenant.setRequiredContainerCluster( secCluster);
					editTenant.setRequiredTenantName( "system" );
					secTenant = editTenant.create();
					editTenant = null;
				}
			}
			if( secUser == null ) {
				secUser = getSecUserTableObj().newInstance();
				IYCFSecSecUserEditObj editSecUser = secUser.getEdit();
				if( editSecUser == null ) {
					editSecUser = secUser.beginEdit();
					editSecUser.setRequiredEMailAddress( "system" );
					editSecUser.setRequiredLoginId( "system" );
					secUser = editSecUser.create();
					editSecUser = null;
				}
			}
			setSecClusterName( clusterName );
			setSecTenantName( tenantName );
			setSecUserName( secUserName );
			secCluster = null;
			secTenant = null;
			secUser = null;
			secSession = null;
			IYCFSecClusterObj cluster = getSecCluster();
			IYCFSecTenantObj tenant = getSecTenant();
			IYCFSecSecUserObj user = getSecUser();
			IYCFSecSecSessionObj session;
			if( ( cluster != null ) && ( tenant != null ) && ( user != null ) ) {
				session = getSecSessionTableObj().newInstance();
				IYCFSecSecSessionEditObj sessionEdit = session.beginEdit();
				sessionEdit.setRequiredContainerSecUser( user );
				sessionEdit.setRequiredStart( Calendar.getInstance() );
				sessionEdit.setOptionalFinish( null );
				session = sessionEdit.create();
				sessionEdit = null;
				setSecSession( session );
			}
			else {
				session = null;
			}
			if( ( cluster == null ) || ( tenant == null ) || ( user == null ) || ( session == null ) ) {
				disconnect( false );
				authorization = null;
				throw new YCFLibRuntimeException( getClass(),
					S_ProcName,
					"Could not resolve cluster name, tenant name, user name, or session.  Login cancelled" );
			}
			if( authorization == null ) {
				authorization = new YCFSecAuthorization();
			}
			authorization.setSecCluster( cluster );
			authorization.setSecTenant( tenant );
			authorization.setSecSession( session );
			return( true );
		}
		setSecClusterName( clusterName );
		setSecTenantName( tenantName );
		setSecUserName( secUserName );
		boolean transactionStarted = beginTransaction();
		secCluster = null;
		secTenant = null;
		secUser = null;
		secSession = null;
		IYCFSecClusterObj cluster = getSecCluster();
		IYCFSecTenantObj tenant = getSecTenant();
		IYCFSecSecUserObj user = getSecUser();
		IYCFSecSecSessionObj session;
		if( ( cluster != null ) && ( tenant != null ) && ( user != null ) ) {
			session = getSecSessionTableObj().newInstance();
			IYCFSecSecSessionEditObj sessionEdit = session.beginEdit();
			sessionEdit.setRequiredContainerSecUser( user );
			sessionEdit.setRequiredStart( Calendar.getInstance() );
			sessionEdit.setOptionalFinish( null );
			session = sessionEdit.create();
			sessionEdit = null;
			setSecSession( session );
		}
		else {
			session = null;
		}
		if( transactionStarted ) {
			commit();
		}
		if( ( cluster == null ) || ( tenant == null ) || ( user == null ) || ( session == null ) ) {
			disconnect( false );
			authorization = null;
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Could not resolve cluster name, tenant name, user name, or session.  Login cancelled" );
		}
		if( authorization == null ) {
			authorization = new YCFSecAuthorization();
		}
		authorization.setSecCluster( cluster );
		authorization.setSecTenant( tenant );
		authorization.setSecSession( session );
		return( true );
	}

	public void disconnect( boolean doCommit ) {
		backingStore.disconnect( doCommit );
	}

	public void logout() {
		if( authorization == null ) {
			if( isConnected() ) {
				disconnect( false );
			}
			return;
		}
		if( isConnected() ) {
			try {
				boolean transactionStarted = beginTransaction();
				if( ! transactionStarted ) {
					rollback();
					transactionStarted = beginTransaction();
					if( ! transactionStarted ) {
						setAuthorization( null );
						return;
					}
				}
				UUID secSessionId = authorization.getSecSessionId();
				if( secSessionId != null ) {
					IYCFSecSecSessionObj secSession = getSecSessionTableObj().readSecSessionByIdIdx( secSessionId );
					if( secSession != null ) {
						if( secSession.getOptionalFinish() == null ) {
							IYCFSecSecSessionEditObj editSecSession = secSession.beginEdit();
							editSecSession.setOptionalFinish( Calendar.getInstance() );
							editSecSession.update();
							editSecSession = null;
						}
					}
				}
				commit();
			}
			finally {
				setAuthorization( null );
				try {
					disconnect( false );
				}
				catch( RuntimeException e ) {
				}
			}
		}
	}

	public void minimizeMemory() {
		if( clusterTableObj != null ) {
			clusterTableObj.minimizeMemory();
		}
		if( hostNodeTableObj != null ) {
			hostNodeTableObj.minimizeMemory();
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
		if( secAppTableObj != null ) {
			secAppTableObj.minimizeMemory();
		}
		if( secDeviceTableObj != null ) {
			secDeviceTableObj.minimizeMemory();
		}
		if( secFormTableObj != null ) {
			secFormTableObj.minimizeMemory();
		}
		if( secGroupTableObj != null ) {
			secGroupTableObj.minimizeMemory();
		}
		if( secGroupFormTableObj != null ) {
			secGroupFormTableObj.minimizeMemory();
		}
		if( secGrpIncTableObj != null ) {
			secGrpIncTableObj.minimizeMemory();
		}
		if( secGrpMembTableObj != null ) {
			secGrpMembTableObj.minimizeMemory();
		}
		if( secSessionTableObj != null ) {
			secSessionTableObj.minimizeMemory();
		}
		if( secUserTableObj != null ) {
			secUserTableObj.minimizeMemory();
		}
		if( serviceTableObj != null ) {
			serviceTableObj.minimizeMemory();
		}
		if( serviceTypeTableObj != null ) {
			serviceTypeTableObj.minimizeMemory();
		}
		if( sysClusterTableObj != null ) {
			sysClusterTableObj.minimizeMemory();
		}
		if( tSecGroupTableObj != null ) {
			tSecGroupTableObj.minimizeMemory();
		}
		if( tSecGrpIncTableObj != null ) {
			tSecGrpIncTableObj.minimizeMemory();
		}
		if( tSecGrpMembTableObj != null ) {
			tSecGrpMembTableObj.minimizeMemory();
		}
		if( tenantTableObj != null ) {
			tenantTableObj.minimizeMemory();
		}
	}

	public boolean isTransactionOpen() {
		boolean txnOpen = backingStore.isTransactionOpen();
		return( txnOpen );
	}

	public boolean beginTransaction() {
		boolean txnInitiated = backingStore.beginTransaction();
		return( txnInitiated );
	}

	public void commit() {
		backingStore.commit();
	}

	public void rollback() {
		backingStore.rollback();
	}
	public IYCFSecClusterTableObj getClusterTableObj() {
		return( clusterTableObj );
	}

	public IYCFSecHostNodeTableObj getHostNodeTableObj() {
		return( hostNodeTableObj );
	}

	public IYCFSecISOCcyTableObj getISOCcyTableObj() {
		return( iSOCcyTableObj );
	}

	public IYCFSecISOCtryTableObj getISOCtryTableObj() {
		return( iSOCtryTableObj );
	}

	public IYCFSecISOCtryCcyTableObj getISOCtryCcyTableObj() {
		return( iSOCtryCcyTableObj );
	}

	public IYCFSecISOCtryLangTableObj getISOCtryLangTableObj() {
		return( iSOCtryLangTableObj );
	}

	public IYCFSecISOLangTableObj getISOLangTableObj() {
		return( iSOLangTableObj );
	}

	public IYCFSecISOTZoneTableObj getISOTZoneTableObj() {
		return( iSOTZoneTableObj );
	}

	public IYCFSecSecAppTableObj getSecAppTableObj() {
		return( secAppTableObj );
	}

	public IYCFSecSecDeviceTableObj getSecDeviceTableObj() {
		return( secDeviceTableObj );
	}

	public IYCFSecSecFormTableObj getSecFormTableObj() {
		return( secFormTableObj );
	}

	public IYCFSecSecGroupTableObj getSecGroupTableObj() {
		return( secGroupTableObj );
	}

	public IYCFSecSecGroupFormTableObj getSecGroupFormTableObj() {
		return( secGroupFormTableObj );
	}

	public IYCFSecSecGrpIncTableObj getSecGrpIncTableObj() {
		return( secGrpIncTableObj );
	}

	public IYCFSecSecGrpMembTableObj getSecGrpMembTableObj() {
		return( secGrpMembTableObj );
	}

	public IYCFSecSecSessionTableObj getSecSessionTableObj() {
		return( secSessionTableObj );
	}

	public IYCFSecSecUserTableObj getSecUserTableObj() {
		return( secUserTableObj );
	}

	public IYCFSecServiceTableObj getServiceTableObj() {
		return( serviceTableObj );
	}

	public IYCFSecServiceTypeTableObj getServiceTypeTableObj() {
		return( serviceTypeTableObj );
	}

	public IYCFSecSysClusterTableObj getSysClusterTableObj() {
		return( sysClusterTableObj );
	}

	public IYCFSecTSecGroupTableObj getTSecGroupTableObj() {
		return( tSecGroupTableObj );
	}

	public IYCFSecTSecGrpIncTableObj getTSecGrpIncTableObj() {
		return( tSecGrpIncTableObj );
	}

	public IYCFSecTSecGrpMembTableObj getTSecGrpMembTableObj() {
		return( tSecGrpMembTableObj );
	}

	public IYCFSecTenantTableObj getTenantTableObj() {
		return( tenantTableObj );
	}
}
