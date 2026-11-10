// Description: Java 11 Schema Object implementation for YCFGenKb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
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
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
public class YCFGenKbSchemaObj
	implements IYCFGenKbSchemaObj
{
	public static String SCHEMA_NAME = "YCFGenKb";
	public static String SCHEMA_DBNAME = "genkb213";
	protected YCFGenKbAuthorization authorization = null;
	protected IYCFGenKbSchema backingStore = null;
	protected String secClusterName = "system";
	protected String secTenantName = "system";
	protected String secUserName = "system";
	protected IYCFGenKbClusterObj secCluster = null;
	protected long secClusterId = 0L;
	protected IYCFGenKbTenantObj secTenant = null;
	protected long secTenantId = 0L;
	protected IYCFGenKbSecUserObj secUser = null;
	protected UUID secSessionUserId = null;
	protected IYCFGenKbSecSessionObj secSession = null;
	protected UUID secSessionSessionId = null;
	protected String schemaDbName = SCHEMA_DBNAME;
	protected String lowerDbSchemaName = SCHEMA_DBNAME.toLowerCase();
	protected IYCFGenKbClusterTableObj clusterTableObj;
	protected IYCFGenKbDefClassTableObj defClassTableObj;
	protected IYCFGenKbGelBoilerplateTableObj gelBoilerplateTableObj;
	protected IYCFGenKbGelBuiltinTableObj gelBuiltinTableObj;
	protected IYCFGenKbGelCacheTableObj gelCacheTableObj;
	protected IYCFGenKbGelCallTableObj gelCallTableObj;
	protected IYCFGenKbGelConstrainTableObj gelConstrainTableObj;
	protected IYCFGenKbGelCounterTableObj gelCounterTableObj;
	protected IYCFGenKbGelErrorTableObj gelErrorTableObj;
	protected IYCFGenKbGelExecutableTableObj gelExecutableTableObj;
	protected IYCFGenKbGelExpansionTableObj gelExpansionTableObj;
	protected IYCFGenKbGelInstructionTableObj gelInstructionTableObj;
	protected IYCFGenKbGelIteratorTableObj gelIteratorTableObj;
	protected IYCFGenKbGelModifierTableObj gelModifierTableObj;
	protected IYCFGenKbGelPopTableObj gelPopTableObj;
	protected IYCFGenKbGelPushContextTableObj gelPushContextTableObj;
	protected IYCFGenKbGelPopContextTableObj gelPopContextTableObj;
	protected IYCFGenKbGelPrefixLineTableObj gelPrefixLineTableObj;
	protected IYCFGenKbGelReferenceTableObj gelReferenceTableObj;
	protected IYCFGenKbGelSequenceTableObj gelSequenceTableObj;
	protected IYCFGenKbGelSpreadTableObj gelSpreadTableObj;
	protected IYCFGenKbGelSwitchTableObj gelSwitchTableObj;
	protected IYCFGenKbGelSwitchLimbTableObj gelSwitchLimbTableObj;
	protected IYCFGenKbGenBindTableObj genBindTableObj;
	protected IYCFGenKbGenFileTableObj genFileTableObj;
	protected IYCFGenKbGenItemTableObj genItemTableObj;
	protected IYCFGenKbGenIteratorTableObj genIteratorTableObj;
	protected IYCFGenKbGenReferenceTableObj genReferenceTableObj;
	protected IYCFGenKbGenRuleTableObj genRuleTableObj;
	protected IYCFGenKbGenTruncTableObj genTruncTableObj;
	protected IYCFGenKbHostNodeTableObj hostNodeTableObj;
	protected IYCFGenKbRuleCartTableObj ruleCartTableObj;
	protected IYCFGenKbRuleTypeTableObj ruleTypeTableObj;
	protected IYCFGenKbSecAppTableObj secAppTableObj;
	protected IYCFGenKbSecDeviceTableObj secDeviceTableObj;
	protected IYCFGenKbSecFormTableObj secFormTableObj;
	protected IYCFGenKbSecGroupTableObj secGroupTableObj;
	protected IYCFGenKbSecGroupFormTableObj secGroupFormTableObj;
	protected IYCFGenKbSecGrpIncTableObj secGrpIncTableObj;
	protected IYCFGenKbSecGrpMembTableObj secGrpMembTableObj;
	protected IYCFGenKbSecSessionTableObj secSessionTableObj;
	protected IYCFGenKbSecUserTableObj secUserTableObj;
	protected IYCFGenKbSysClusterTableObj sysClusterTableObj;
	protected IYCFGenKbTSecGroupTableObj tSecGroupTableObj;
	protected IYCFGenKbTSecGrpIncTableObj tSecGrpIncTableObj;
	protected IYCFGenKbTSecGrpMembTableObj tSecGrpMembTableObj;
	protected IYCFGenKbTenantTableObj tenantTableObj;
	protected IYCFGenKbToolTableObj toolTableObj;
	protected IYCFGenKbToolSetTableObj toolSetTableObj;

	public YCFGenKbSchemaObj() {
		clusterTableObj = new YCFGenKbClusterTableObj( this );
		defClassTableObj = new YCFGenKbDefClassTableObj( this );
		gelBoilerplateTableObj = new YCFGenKbGelBoilerplateTableObj( this );
		gelBuiltinTableObj = new YCFGenKbGelBuiltinTableObj( this );
		gelCacheTableObj = new YCFGenKbGelCacheTableObj( this );
		gelCallTableObj = new YCFGenKbGelCallTableObj( this );
		gelConstrainTableObj = new YCFGenKbGelConstrainTableObj( this );
		gelCounterTableObj = new YCFGenKbGelCounterTableObj( this );
		gelErrorTableObj = new YCFGenKbGelErrorTableObj( this );
		gelExecutableTableObj = new YCFGenKbGelExecutableTableObj( this );
		gelExpansionTableObj = new YCFGenKbGelExpansionTableObj( this );
		gelInstructionTableObj = new YCFGenKbGelInstructionTableObj( this );
		gelIteratorTableObj = new YCFGenKbGelIteratorTableObj( this );
		gelModifierTableObj = new YCFGenKbGelModifierTableObj( this );
		gelPopTableObj = new YCFGenKbGelPopTableObj( this );
		gelPushContextTableObj = new YCFGenKbGelPushContextTableObj( this );
		gelPopContextTableObj = new YCFGenKbGelPopContextTableObj( this );
		gelPrefixLineTableObj = new YCFGenKbGelPrefixLineTableObj( this );
		gelReferenceTableObj = new YCFGenKbGelReferenceTableObj( this );
		gelSequenceTableObj = new YCFGenKbGelSequenceTableObj( this );
		gelSpreadTableObj = new YCFGenKbGelSpreadTableObj( this );
		gelSwitchTableObj = new YCFGenKbGelSwitchTableObj( this );
		gelSwitchLimbTableObj = new YCFGenKbGelSwitchLimbTableObj( this );
		genBindTableObj = new YCFGenKbGenBindTableObj( this );
		genFileTableObj = new YCFGenKbGenFileTableObj( this );
		genItemTableObj = new YCFGenKbGenItemTableObj( this );
		genIteratorTableObj = new YCFGenKbGenIteratorTableObj( this );
		genReferenceTableObj = new YCFGenKbGenReferenceTableObj( this );
		genRuleTableObj = new YCFGenKbGenRuleTableObj( this );
		genTruncTableObj = new YCFGenKbGenTruncTableObj( this );
		hostNodeTableObj = new YCFGenKbHostNodeTableObj( this );
		ruleCartTableObj = new YCFGenKbRuleCartTableObj( this );
		ruleTypeTableObj = new YCFGenKbRuleTypeTableObj( this );
		secAppTableObj = new YCFGenKbSecAppTableObj( this );
		secDeviceTableObj = new YCFGenKbSecDeviceTableObj( this );
		secFormTableObj = new YCFGenKbSecFormTableObj( this );
		secGroupTableObj = new YCFGenKbSecGroupTableObj( this );
		secGroupFormTableObj = new YCFGenKbSecGroupFormTableObj( this );
		secGrpIncTableObj = new YCFGenKbSecGrpIncTableObj( this );
		secGrpMembTableObj = new YCFGenKbSecGrpMembTableObj( this );
		secSessionTableObj = new YCFGenKbSecSessionTableObj( this );
		secUserTableObj = new YCFGenKbSecUserTableObj( this );
		sysClusterTableObj = new YCFGenKbSysClusterTableObj( this );
		tSecGroupTableObj = new YCFGenKbTSecGroupTableObj( this );
		tSecGrpIncTableObj = new YCFGenKbTSecGrpIncTableObj( this );
		tSecGrpMembTableObj = new YCFGenKbTSecGrpMembTableObj( this );
		tenantTableObj = new YCFGenKbTenantTableObj( this );
		toolTableObj = new YCFGenKbToolTableObj( this );
		toolSetTableObj = new YCFGenKbToolSetTableObj( this );
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

	public IYCFGenKbClusterObj getSecCluster() {
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

	public void setSecCluster( IYCFGenKbClusterObj value ) {
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

	public IYCFGenKbTenantObj getSecTenant() {
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

	public void setSecTenant( IYCFGenKbTenantObj value ) {
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

	public IYCFGenKbSecUserObj getSecUser() {
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

	public void setSecUser( IYCFGenKbSecUserObj value ) {
		secUser = value;
		if( secUser != null ) {
			secUserName = secUser.getRequiredLoginId();
			secSessionUserId = secUser.getRequiredSecUserId();
		}
	}
	public IYCFGenKbSecSessionObj getSecSession() {
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

	public void setSecSession( IYCFGenKbSecSessionObj value ) {
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

	/**
	 *	Release any prepared statements acquired by this connection.
	 *	<p>
	 *	Resets the prepared statements so they can acquire the new value of
	 *	<tt>setDbSchemaName()</tt>.
	 */
	public void releasePreparedStatements() {
	}
	public YCFGenKbAuthorization getAuthorization() {
		return( authorization );
	}

	public void setAuthorization( YCFGenKbAuthorization value ) {
		authorization = value;
	}

	public IYCFGenKbSchema getBackingStore() {
		return( backingStore );
	}

	public void setBackingStore( IYCFGenKbSchema value ) {
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
				IYCFGenKbClusterEditObj editCluster = secCluster.getEdit();
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
				IYCFGenKbTenantEditObj editTenant = secTenant.getEdit();
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
				IYCFGenKbSecUserEditObj editSecUser = secUser.getEdit();
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
			IYCFGenKbClusterObj cluster = getSecCluster();
			IYCFGenKbTenantObj tenant = getSecTenant();
			IYCFGenKbSecUserObj user = getSecUser();
			IYCFGenKbSecSessionObj session;
			if( ( cluster != null ) && ( tenant != null ) && ( user != null ) ) {
				session = getSecSessionTableObj().newInstance();
				IYCFGenKbSecSessionEditObj sessionEdit = session.beginEdit();
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
				authorization = new YCFGenKbAuthorization();
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
		IYCFGenKbClusterObj cluster = getSecCluster();
		IYCFGenKbTenantObj tenant = getSecTenant();
		IYCFGenKbSecUserObj user = getSecUser();
		IYCFGenKbSecSessionObj session;
		if( ( cluster != null ) && ( tenant != null ) && ( user != null ) ) {
			session = getSecSessionTableObj().newInstance();
			IYCFGenKbSecSessionEditObj sessionEdit = session.beginEdit();
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
			authorization = new YCFGenKbAuthorization();
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
					IYCFGenKbSecSessionObj secSession = getSecSessionTableObj().readSecSessionByIdIdx( secSessionId );
					if( secSession != null ) {
						if( secSession.getOptionalFinish() == null ) {
							IYCFGenKbSecSessionEditObj editSecSession = secSession.beginEdit();
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
		if( defClassTableObj != null ) {
			defClassTableObj.minimizeMemory();
		}
		if( gelBoilerplateTableObj != null ) {
			gelBoilerplateTableObj.minimizeMemory();
		}
		if( gelBuiltinTableObj != null ) {
			gelBuiltinTableObj.minimizeMemory();
		}
		if( gelCacheTableObj != null ) {
			gelCacheTableObj.minimizeMemory();
		}
		if( gelCallTableObj != null ) {
			gelCallTableObj.minimizeMemory();
		}
		if( gelConstrainTableObj != null ) {
			gelConstrainTableObj.minimizeMemory();
		}
		if( gelCounterTableObj != null ) {
			gelCounterTableObj.minimizeMemory();
		}
		if( gelErrorTableObj != null ) {
			gelErrorTableObj.minimizeMemory();
		}
		if( gelExecutableTableObj != null ) {
			gelExecutableTableObj.minimizeMemory();
		}
		if( gelExpansionTableObj != null ) {
			gelExpansionTableObj.minimizeMemory();
		}
		if( gelInstructionTableObj != null ) {
			gelInstructionTableObj.minimizeMemory();
		}
		if( gelIteratorTableObj != null ) {
			gelIteratorTableObj.minimizeMemory();
		}
		if( gelModifierTableObj != null ) {
			gelModifierTableObj.minimizeMemory();
		}
		if( gelPopTableObj != null ) {
			gelPopTableObj.minimizeMemory();
		}
		if( gelPushContextTableObj != null ) {
			gelPushContextTableObj.minimizeMemory();
		}
		if( gelPopContextTableObj != null ) {
			gelPopContextTableObj.minimizeMemory();
		}
		if( gelPrefixLineTableObj != null ) {
			gelPrefixLineTableObj.minimizeMemory();
		}
		if( gelReferenceTableObj != null ) {
			gelReferenceTableObj.minimizeMemory();
		}
		if( gelSequenceTableObj != null ) {
			gelSequenceTableObj.minimizeMemory();
		}
		if( gelSpreadTableObj != null ) {
			gelSpreadTableObj.minimizeMemory();
		}
		if( gelSwitchTableObj != null ) {
			gelSwitchTableObj.minimizeMemory();
		}
		if( gelSwitchLimbTableObj != null ) {
			gelSwitchLimbTableObj.minimizeMemory();
		}
		if( genBindTableObj != null ) {
			genBindTableObj.minimizeMemory();
		}
		if( genFileTableObj != null ) {
			genFileTableObj.minimizeMemory();
		}
		if( genItemTableObj != null ) {
			genItemTableObj.minimizeMemory();
		}
		if( genIteratorTableObj != null ) {
			genIteratorTableObj.minimizeMemory();
		}
		if( genReferenceTableObj != null ) {
			genReferenceTableObj.minimizeMemory();
		}
		if( genRuleTableObj != null ) {
			genRuleTableObj.minimizeMemory();
		}
		if( genTruncTableObj != null ) {
			genTruncTableObj.minimizeMemory();
		}
		if( hostNodeTableObj != null ) {
			hostNodeTableObj.minimizeMemory();
		}
		if( ruleCartTableObj != null ) {
			ruleCartTableObj.minimizeMemory();
		}
		if( ruleTypeTableObj != null ) {
			ruleTypeTableObj.minimizeMemory();
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
		if( toolTableObj != null ) {
			toolTableObj.minimizeMemory();
		}
		if( toolSetTableObj != null ) {
			toolSetTableObj.minimizeMemory();
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
	public IYCFGenKbClusterTableObj getClusterTableObj() {
		return( clusterTableObj );
	}

	public IYCFGenKbDefClassTableObj getDefClassTableObj() {
		return( defClassTableObj );
	}

	public IYCFGenKbGelBoilerplateTableObj getGelBoilerplateTableObj() {
		return( gelBoilerplateTableObj );
	}

	public IYCFGenKbGelBuiltinTableObj getGelBuiltinTableObj() {
		return( gelBuiltinTableObj );
	}

	public IYCFGenKbGelCacheTableObj getGelCacheTableObj() {
		return( gelCacheTableObj );
	}

	public IYCFGenKbGelCallTableObj getGelCallTableObj() {
		return( gelCallTableObj );
	}

	public IYCFGenKbGelConstrainTableObj getGelConstrainTableObj() {
		return( gelConstrainTableObj );
	}

	public IYCFGenKbGelCounterTableObj getGelCounterTableObj() {
		return( gelCounterTableObj );
	}

	public IYCFGenKbGelErrorTableObj getGelErrorTableObj() {
		return( gelErrorTableObj );
	}

	public IYCFGenKbGelExecutableTableObj getGelExecutableTableObj() {
		return( gelExecutableTableObj );
	}

	public IYCFGenKbGelExpansionTableObj getGelExpansionTableObj() {
		return( gelExpansionTableObj );
	}

	public IYCFGenKbGelInstructionTableObj getGelInstructionTableObj() {
		return( gelInstructionTableObj );
	}

	public IYCFGenKbGelIteratorTableObj getGelIteratorTableObj() {
		return( gelIteratorTableObj );
	}

	public IYCFGenKbGelModifierTableObj getGelModifierTableObj() {
		return( gelModifierTableObj );
	}

	public IYCFGenKbGelPopTableObj getGelPopTableObj() {
		return( gelPopTableObj );
	}

	public IYCFGenKbGelPushContextTableObj getGelPushContextTableObj() {
		return( gelPushContextTableObj );
	}

	public IYCFGenKbGelPopContextTableObj getGelPopContextTableObj() {
		return( gelPopContextTableObj );
	}

	public IYCFGenKbGelPrefixLineTableObj getGelPrefixLineTableObj() {
		return( gelPrefixLineTableObj );
	}

	public IYCFGenKbGelReferenceTableObj getGelReferenceTableObj() {
		return( gelReferenceTableObj );
	}

	public IYCFGenKbGelSequenceTableObj getGelSequenceTableObj() {
		return( gelSequenceTableObj );
	}

	public IYCFGenKbGelSpreadTableObj getGelSpreadTableObj() {
		return( gelSpreadTableObj );
	}

	public IYCFGenKbGelSwitchTableObj getGelSwitchTableObj() {
		return( gelSwitchTableObj );
	}

	public IYCFGenKbGelSwitchLimbTableObj getGelSwitchLimbTableObj() {
		return( gelSwitchLimbTableObj );
	}

	public IYCFGenKbGenBindTableObj getGenBindTableObj() {
		return( genBindTableObj );
	}

	public IYCFGenKbGenFileTableObj getGenFileTableObj() {
		return( genFileTableObj );
	}

	public IYCFGenKbGenItemTableObj getGenItemTableObj() {
		return( genItemTableObj );
	}

	public IYCFGenKbGenIteratorTableObj getGenIteratorTableObj() {
		return( genIteratorTableObj );
	}

	public IYCFGenKbGenReferenceTableObj getGenReferenceTableObj() {
		return( genReferenceTableObj );
	}

	public IYCFGenKbGenRuleTableObj getGenRuleTableObj() {
		return( genRuleTableObj );
	}

	public IYCFGenKbGenTruncTableObj getGenTruncTableObj() {
		return( genTruncTableObj );
	}

	public IYCFGenKbHostNodeTableObj getHostNodeTableObj() {
		return( hostNodeTableObj );
	}

	public IYCFGenKbRuleCartTableObj getRuleCartTableObj() {
		return( ruleCartTableObj );
	}

	public IYCFGenKbRuleTypeTableObj getRuleTypeTableObj() {
		return( ruleTypeTableObj );
	}

	public IYCFGenKbSecAppTableObj getSecAppTableObj() {
		return( secAppTableObj );
	}

	public IYCFGenKbSecDeviceTableObj getSecDeviceTableObj() {
		return( secDeviceTableObj );
	}

	public IYCFGenKbSecFormTableObj getSecFormTableObj() {
		return( secFormTableObj );
	}

	public IYCFGenKbSecGroupTableObj getSecGroupTableObj() {
		return( secGroupTableObj );
	}

	public IYCFGenKbSecGroupFormTableObj getSecGroupFormTableObj() {
		return( secGroupFormTableObj );
	}

	public IYCFGenKbSecGrpIncTableObj getSecGrpIncTableObj() {
		return( secGrpIncTableObj );
	}

	public IYCFGenKbSecGrpMembTableObj getSecGrpMembTableObj() {
		return( secGrpMembTableObj );
	}

	public IYCFGenKbSecSessionTableObj getSecSessionTableObj() {
		return( secSessionTableObj );
	}

	public IYCFGenKbSecUserTableObj getSecUserTableObj() {
		return( secUserTableObj );
	}

	public IYCFGenKbSysClusterTableObj getSysClusterTableObj() {
		return( sysClusterTableObj );
	}

	public IYCFGenKbTSecGroupTableObj getTSecGroupTableObj() {
		return( tSecGroupTableObj );
	}

	public IYCFGenKbTSecGrpIncTableObj getTSecGrpIncTableObj() {
		return( tSecGrpIncTableObj );
	}

	public IYCFGenKbTSecGrpMembTableObj getTSecGrpMembTableObj() {
		return( tSecGrpMembTableObj );
	}

	public IYCFGenKbTenantTableObj getTenantTableObj() {
		return( tenantTableObj );
	}

	public IYCFGenKbToolTableObj getToolTableObj() {
		return( toolTableObj );
	}

	public IYCFGenKbToolSetTableObj getToolSetTableObj() {
		return( toolSetTableObj );
	}
}
