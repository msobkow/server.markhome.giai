// Description: Java 11 Schema Object interface for YCFGenKb.

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

public interface IYCFGenKbSchemaObj
{
	YCFGenKbAuthorization getAuthorization();
	void setAuthorization( YCFGenKbAuthorization value );

	IYCFGenKbSchema getBackingStore();
	void setBackingStore( IYCFGenKbSchema value );

	String getSchemaName();

	void setSecClusterName( String value );
	IYCFGenKbClusterObj getSecCluster();
	void setSecCluster( IYCFGenKbClusterObj value );

	void setSecTenantName( String value );
	IYCFGenKbTenantObj getSecTenant();
	void setSecTenant( IYCFGenKbTenantObj value );

	void setSecUserName( String value );
	IYCFGenKbSecUserObj getSecUser();
	void setSecUser( IYCFGenKbSecUserObj value );

	void setSecSessionId( UUID value );
	IYCFGenKbSecSessionObj getSecSession();
	void setSecSession( IYCFGenKbSecSessionObj value );

	boolean isConnected();
	boolean connect();
	boolean connect( String username, String password );
	boolean connect( String clusterName, String tenantName, String secUserName, String password );
	void disconnect( boolean doCommit );
	void logout();

	void minimizeMemory();

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
	 *	@return	The IYCFGenKbClusterTableObj interface implementation for the schema.
	 */
	IYCFGenKbClusterTableObj getClusterTableObj();

	/**
	 *	Get the DefClass interface for the schema.
	 *
	 *	@return	The IYCFGenKbDefClassTableObj interface implementation for the schema.
	 */
	IYCFGenKbDefClassTableObj getDefClassTableObj();

	/**
	 *	Get the GelBoilerplate interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelBoilerplateTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelBoilerplateTableObj getGelBoilerplateTableObj();

	/**
	 *	Get the GelBuiltin interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelBuiltinTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelBuiltinTableObj getGelBuiltinTableObj();

	/**
	 *	Get the GelCache interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelCacheTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelCacheTableObj getGelCacheTableObj();

	/**
	 *	Get the GelCall interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelCallTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelCallTableObj getGelCallTableObj();

	/**
	 *	Get the GelConstrain interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelConstrainTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelConstrainTableObj getGelConstrainTableObj();

	/**
	 *	Get the GelCounter interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelCounterTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelCounterTableObj getGelCounterTableObj();

	/**
	 *	Get the GelError interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelErrorTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelErrorTableObj getGelErrorTableObj();

	/**
	 *	Get the GelExecutable interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelExecutableTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelExecutableTableObj getGelExecutableTableObj();

	/**
	 *	Get the GelExpansion interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelExpansionTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelExpansionTableObj getGelExpansionTableObj();

	/**
	 *	Get the GelInstruction interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelInstructionTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelInstructionTableObj getGelInstructionTableObj();

	/**
	 *	Get the GelIterator interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelIteratorTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelIteratorTableObj getGelIteratorTableObj();

	/**
	 *	Get the GelModifier interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelModifierTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelModifierTableObj getGelModifierTableObj();

	/**
	 *	Get the GelPop interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelPopTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelPopTableObj getGelPopTableObj();

	/**
	 *	Get the GelPrefixLine interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelPrefixLineTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelPrefixLineTableObj getGelPrefixLineTableObj();

	/**
	 *	Get the GelPushContext interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelPushContextTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelPushContextTableObj getGelPushContextTableObj();

	/**
	 *	Get the GelPopContext interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelPopContextTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelPopContextTableObj getGelPopContextTableObj();

	/**
	 *	Get the GelReference interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelReferenceTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelReferenceTableObj getGelReferenceTableObj();

	/**
	 *	Get the GelSequence interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelSequenceTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelSequenceTableObj getGelSequenceTableObj();

	/**
	 *	Get the GelSpread interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelSpreadTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelSpreadTableObj getGelSpreadTableObj();

	/**
	 *	Get the GelSwitch interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelSwitchTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelSwitchTableObj getGelSwitchTableObj();

	/**
	 *	Get the GelSwitchLimb interface for the schema.
	 *
	 *	@return	The IYCFGenKbGelSwitchLimbTableObj interface implementation for the schema.
	 */
	IYCFGenKbGelSwitchLimbTableObj getGelSwitchLimbTableObj();

	/**
	 *	Get the GenBind interface for the schema.
	 *
	 *	@return	The IYCFGenKbGenBindTableObj interface implementation for the schema.
	 */
	IYCFGenKbGenBindTableObj getGenBindTableObj();

	/**
	 *	Get the GenFile interface for the schema.
	 *
	 *	@return	The IYCFGenKbGenFileTableObj interface implementation for the schema.
	 */
	IYCFGenKbGenFileTableObj getGenFileTableObj();

	/**
	 *	Get the GenItem interface for the schema.
	 *
	 *	@return	The IYCFGenKbGenItemTableObj interface implementation for the schema.
	 */
	IYCFGenKbGenItemTableObj getGenItemTableObj();

	/**
	 *	Get the GenIterator interface for the schema.
	 *
	 *	@return	The IYCFGenKbGenIteratorTableObj interface implementation for the schema.
	 */
	IYCFGenKbGenIteratorTableObj getGenIteratorTableObj();

	/**
	 *	Get the GenReference interface for the schema.
	 *
	 *	@return	The IYCFGenKbGenReferenceTableObj interface implementation for the schema.
	 */
	IYCFGenKbGenReferenceTableObj getGenReferenceTableObj();

	/**
	 *	Get the GenRule interface for the schema.
	 *
	 *	@return	The IYCFGenKbGenRuleTableObj interface implementation for the schema.
	 */
	IYCFGenKbGenRuleTableObj getGenRuleTableObj();

	/**
	 *	Get the GenTrunc interface for the schema.
	 *
	 *	@return	The IYCFGenKbGenTruncTableObj interface implementation for the schema.
	 */
	IYCFGenKbGenTruncTableObj getGenTruncTableObj();

	/**
	 *	Get the HostNode interface for the schema.
	 *
	 *	@return	The IYCFGenKbHostNodeTableObj interface implementation for the schema.
	 */
	IYCFGenKbHostNodeTableObj getHostNodeTableObj();

	/**
	 *	Get the RuleCart interface for the schema.
	 *
	 *	@return	The IYCFGenKbRuleCartTableObj interface implementation for the schema.
	 */
	IYCFGenKbRuleCartTableObj getRuleCartTableObj();

	/**
	 *	Get the RuleType interface for the schema.
	 *
	 *	@return	The IYCFGenKbRuleTypeTableObj interface implementation for the schema.
	 */
	IYCFGenKbRuleTypeTableObj getRuleTypeTableObj();

	/**
	 *	Get the SecApp interface for the schema.
	 *
	 *	@return	The IYCFGenKbSecAppTableObj interface implementation for the schema.
	 */
	IYCFGenKbSecAppTableObj getSecAppTableObj();

	/**
	 *	Get the SecDevice interface for the schema.
	 *
	 *	@return	The IYCFGenKbSecDeviceTableObj interface implementation for the schema.
	 */
	IYCFGenKbSecDeviceTableObj getSecDeviceTableObj();

	/**
	 *	Get the SecForm interface for the schema.
	 *
	 *	@return	The IYCFGenKbSecFormTableObj interface implementation for the schema.
	 */
	IYCFGenKbSecFormTableObj getSecFormTableObj();

	/**
	 *	Get the SecGroup interface for the schema.
	 *
	 *	@return	The IYCFGenKbSecGroupTableObj interface implementation for the schema.
	 */
	IYCFGenKbSecGroupTableObj getSecGroupTableObj();

	/**
	 *	Get the SecGroupForm interface for the schema.
	 *
	 *	@return	The IYCFGenKbSecGroupFormTableObj interface implementation for the schema.
	 */
	IYCFGenKbSecGroupFormTableObj getSecGroupFormTableObj();

	/**
	 *	Get the SecGrpInc interface for the schema.
	 *
	 *	@return	The IYCFGenKbSecGrpIncTableObj interface implementation for the schema.
	 */
	IYCFGenKbSecGrpIncTableObj getSecGrpIncTableObj();

	/**
	 *	Get the SecGrpMemb interface for the schema.
	 *
	 *	@return	The IYCFGenKbSecGrpMembTableObj interface implementation for the schema.
	 */
	IYCFGenKbSecGrpMembTableObj getSecGrpMembTableObj();

	/**
	 *	Get the SecSession interface for the schema.
	 *
	 *	@return	The IYCFGenKbSecSessionTableObj interface implementation for the schema.
	 */
	IYCFGenKbSecSessionTableObj getSecSessionTableObj();

	/**
	 *	Get the SecUser interface for the schema.
	 *
	 *	@return	The IYCFGenKbSecUserTableObj interface implementation for the schema.
	 */
	IYCFGenKbSecUserTableObj getSecUserTableObj();

	/**
	 *	Get the SysCluster interface for the schema.
	 *
	 *	@return	The IYCFGenKbSysClusterTableObj interface implementation for the schema.
	 */
	IYCFGenKbSysClusterTableObj getSysClusterTableObj();

	/**
	 *	Get the TSecGroup interface for the schema.
	 *
	 *	@return	The IYCFGenKbTSecGroupTableObj interface implementation for the schema.
	 */
	IYCFGenKbTSecGroupTableObj getTSecGroupTableObj();

	/**
	 *	Get the TSecGrpInc interface for the schema.
	 *
	 *	@return	The IYCFGenKbTSecGrpIncTableObj interface implementation for the schema.
	 */
	IYCFGenKbTSecGrpIncTableObj getTSecGrpIncTableObj();

	/**
	 *	Get the TSecGrpMemb interface for the schema.
	 *
	 *	@return	The IYCFGenKbTSecGrpMembTableObj interface implementation for the schema.
	 */
	IYCFGenKbTSecGrpMembTableObj getTSecGrpMembTableObj();

	/**
	 *	Get the Tenant interface for the schema.
	 *
	 *	@return	The IYCFGenKbTenantTableObj interface implementation for the schema.
	 */
	IYCFGenKbTenantTableObj getTenantTableObj();

	/**
	 *	Get the Tool interface for the schema.
	 *
	 *	@return	The IYCFGenKbToolTableObj interface implementation for the schema.
	 */
	IYCFGenKbToolTableObj getToolTableObj();

	/**
	 *	Get the ToolSet interface for the schema.
	 *
	 *	@return	The IYCFGenKbToolSetTableObj interface implementation for the schema.
	 */
	IYCFGenKbToolSetTableObj getToolSetTableObj();
}
