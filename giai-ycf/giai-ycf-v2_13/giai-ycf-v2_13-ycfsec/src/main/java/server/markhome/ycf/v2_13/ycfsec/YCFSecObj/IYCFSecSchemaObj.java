// Description: Java 11 Schema Object interface for YCFSec.

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

public interface IYCFSecSchemaObj
{
	YCFSecAuthorization getAuthorization();
	void setAuthorization( YCFSecAuthorization value );

	IYCFSecSchema getBackingStore();
	void setBackingStore( IYCFSecSchema value );

	String getSchemaName();

	void setSecClusterName( String value );
	IYCFSecClusterObj getSecCluster();
	void setSecCluster( IYCFSecClusterObj value );

	void setSecTenantName( String value );
	IYCFSecTenantObj getSecTenant();
	void setSecTenant( IYCFSecTenantObj value );

	void setSecUserName( String value );
	IYCFSecSecUserObj getSecUser();
	void setSecUser( IYCFSecSecUserObj value );

	void setSecSessionId( UUID value );
	IYCFSecSecSessionObj getSecSession();
	void setSecSession( IYCFSecSecSessionObj value );

	boolean isConnected();
	boolean connect();
	boolean connect( String username, String password );
	boolean connect( String clusterName, String tenantName, String secUserName, String password );
	void disconnect( boolean doCommit );
	void logout();

	void minimizeMemory();

	String fileImport( String fileName, String fileContent );

	/**
	 *	When you first connect to a database, you can opt to specify a database
	 *	name to be used by the session.
	 */
	String getDbSchemaName();

	/**
	 *	PostgreSQL coerces database schema names to lowercase for consistency.
	 */
	String getLowerDbSchemaName();

	/**
	 *	When you set the database name, the database-specific implementation
	 *	of this method does a "commit; use database"-type sequence to change
	 *	to the target database.  This should be specified globally for all
	 *	database connections in a given cluster, so that all of
	 *	the application implementation clients are using the same database instance
	 *	regardless of what's been provided by the cust client implementation,
	 *	be it as a Java application or a web interface written using JEE.
	 */
	void setDbSchemaName( String argDbSchemaName );

	/**
	 *	If a transaction is already opened for the schema connection,
	 *	return false.  If a new transaction is successfully opened,
	 *	return true.  Otherwise throw a RuntimeException detailing
	 *	why a transaction could not be initiated.
	 *
	 *	This permits the database persistence implementations to
	 *	switch between participating in an existing transaction
	 *	or implementing an implicit atomic transaction that is
	 *	committed or rolled back before the method returns:
	 *
	 *		boolean txnInitiated = false;
	 *		try {
	 *			txnInitiated = schema.beginTransaction();
	 *			... business logic and presentation code ...
	 *			if( txnInitiated ) {
	 *				schema.commit();
	 *			}
	 *		}
	 *		catch( RuntimeException e ) {
	 *			if( txnInitiated ) {
	 *				try {
	 *					schema.rollback();
	 *				}
	 *				catch( RuntimeException e ) {
	 *				}
	 *			}
	 *			... report exception or throw exception with cause ...
	 *		}
	 *
	 *	As the current web-form focused implementation will be managing
	 *	the transactions in the Servlet page response, I don't need to
	 *	implement the atomic transaction wrappers yet.
	 */
	boolean isTransactionOpen();
	boolean beginTransaction();
	void commit();
	void rollback();

	/**
	 *	Release any prepared statements acquired by this connection.
	 *	<p>
	 *	Resets the prepared statements so they can acquire the new value of
	 *	<tt>setDbSchemaName()</tt>.
	 */
	void releasePreparedStatements();
	/**
	 *	Get the Cluster interface for the schema.
	 *
	 *	@return	The IYCFSecClusterTableObj interface implementation for the schema.
	 */
	IYCFSecClusterTableObj getClusterTableObj();

	/**
	 *	Get the HostNode interface for the schema.
	 *
	 *	@return	The IYCFSecHostNodeTableObj interface implementation for the schema.
	 */
	IYCFSecHostNodeTableObj getHostNodeTableObj();

	/**
	 *	Get the ISOCcy interface for the schema.
	 *
	 *	@return	The IYCFSecISOCcyTableObj interface implementation for the schema.
	 */
	IYCFSecISOCcyTableObj getISOCcyTableObj();

	/**
	 *	Get the ISOCtry interface for the schema.
	 *
	 *	@return	The IYCFSecISOCtryTableObj interface implementation for the schema.
	 */
	IYCFSecISOCtryTableObj getISOCtryTableObj();

	/**
	 *	Get the ISOCtryCcy interface for the schema.
	 *
	 *	@return	The IYCFSecISOCtryCcyTableObj interface implementation for the schema.
	 */
	IYCFSecISOCtryCcyTableObj getISOCtryCcyTableObj();

	/**
	 *	Get the ISOCtryLang interface for the schema.
	 *
	 *	@return	The IYCFSecISOCtryLangTableObj interface implementation for the schema.
	 */
	IYCFSecISOCtryLangTableObj getISOCtryLangTableObj();

	/**
	 *	Get the ISOLang interface for the schema.
	 *
	 *	@return	The IYCFSecISOLangTableObj interface implementation for the schema.
	 */
	IYCFSecISOLangTableObj getISOLangTableObj();

	/**
	 *	Get the ISOTZone interface for the schema.
	 *
	 *	@return	The IYCFSecISOTZoneTableObj interface implementation for the schema.
	 */
	IYCFSecISOTZoneTableObj getISOTZoneTableObj();

	/**
	 *	Get the SecApp interface for the schema.
	 *
	 *	@return	The IYCFSecSecAppTableObj interface implementation for the schema.
	 */
	IYCFSecSecAppTableObj getSecAppTableObj();

	/**
	 *	Get the SecDevice interface for the schema.
	 *
	 *	@return	The IYCFSecSecDeviceTableObj interface implementation for the schema.
	 */
	IYCFSecSecDeviceTableObj getSecDeviceTableObj();

	/**
	 *	Get the SecForm interface for the schema.
	 *
	 *	@return	The IYCFSecSecFormTableObj interface implementation for the schema.
	 */
	IYCFSecSecFormTableObj getSecFormTableObj();

	/**
	 *	Get the SecGroup interface for the schema.
	 *
	 *	@return	The IYCFSecSecGroupTableObj interface implementation for the schema.
	 */
	IYCFSecSecGroupTableObj getSecGroupTableObj();

	/**
	 *	Get the SecGroupForm interface for the schema.
	 *
	 *	@return	The IYCFSecSecGroupFormTableObj interface implementation for the schema.
	 */
	IYCFSecSecGroupFormTableObj getSecGroupFormTableObj();

	/**
	 *	Get the SecGrpInc interface for the schema.
	 *
	 *	@return	The IYCFSecSecGrpIncTableObj interface implementation for the schema.
	 */
	IYCFSecSecGrpIncTableObj getSecGrpIncTableObj();

	/**
	 *	Get the SecGrpMemb interface for the schema.
	 *
	 *	@return	The IYCFSecSecGrpMembTableObj interface implementation for the schema.
	 */
	IYCFSecSecGrpMembTableObj getSecGrpMembTableObj();

	/**
	 *	Get the SecSession interface for the schema.
	 *
	 *	@return	The IYCFSecSecSessionTableObj interface implementation for the schema.
	 */
	IYCFSecSecSessionTableObj getSecSessionTableObj();

	/**
	 *	Get the SecUser interface for the schema.
	 *
	 *	@return	The IYCFSecSecUserTableObj interface implementation for the schema.
	 */
	IYCFSecSecUserTableObj getSecUserTableObj();

	/**
	 *	Get the Service interface for the schema.
	 *
	 *	@return	The IYCFSecServiceTableObj interface implementation for the schema.
	 */
	IYCFSecServiceTableObj getServiceTableObj();

	/**
	 *	Get the ServiceType interface for the schema.
	 *
	 *	@return	The IYCFSecServiceTypeTableObj interface implementation for the schema.
	 */
	IYCFSecServiceTypeTableObj getServiceTypeTableObj();

	/**
	 *	Get the SysCluster interface for the schema.
	 *
	 *	@return	The IYCFSecSysClusterTableObj interface implementation for the schema.
	 */
	IYCFSecSysClusterTableObj getSysClusterTableObj();

	/**
	 *	Get the TSecGroup interface for the schema.
	 *
	 *	@return	The IYCFSecTSecGroupTableObj interface implementation for the schema.
	 */
	IYCFSecTSecGroupTableObj getTSecGroupTableObj();

	/**
	 *	Get the TSecGrpInc interface for the schema.
	 *
	 *	@return	The IYCFSecTSecGrpIncTableObj interface implementation for the schema.
	 */
	IYCFSecTSecGrpIncTableObj getTSecGrpIncTableObj();

	/**
	 *	Get the TSecGrpMemb interface for the schema.
	 *
	 *	@return	The IYCFSecTSecGrpMembTableObj interface implementation for the schema.
	 */
	IYCFSecTSecGrpMembTableObj getTSecGrpMembTableObj();

	/**
	 *	Get the Tenant interface for the schema.
	 *
	 *	@return	The IYCFSecTenantTableObj interface implementation for the schema.
	 */
	IYCFSecTenantTableObj getTenantTableObj();
}
