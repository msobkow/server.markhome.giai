// Description: Java 25 Protected Schema Object interface for SecureProt.

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

package server.markhome.ycf.v3_1.secure.secureprotobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;

public interface ISecureProtSchemaObj
{
	ISecureProtAuthorization getAuthorization();
	void setAuthorization( ISecureProtAuthorization value );

	String getSchemaName();

	void setSecClusterName( String value );
	ISecureProtClusterObj getSecCluster();
	void setSecCluster( ISecureProtClusterObj value );

	void setSecTenantName( String value );
	ISecureProtTenantObj getSecTenant();
	void setSecTenant( ISecureProtTenantObj value );

	void setSecUserName( String value );
	ISecurePubSecUserObj getSecUser();
	void setSecUser( ISecurePubSecUserObj value );

	void setSecSessionId( CFDbKeyHash256 value );
	ISecurePubSecSessionObj getSecSession();
	void setSecSession( ISecurePubSecSessionObj value );

	void logout();

	void minimizeMemory();

	public ISecureProtSchema getSecureProtBackingStore();
	public void setSecureProtBackingStore(ISecureProtSchema secureprotBackingStore);

	/**
	 *	Get the Cluster interface for the schema.
	 *
	 *	@return	The ISecureProtClusterTableObj interface implementation for the schema.
	 */
	ISecureProtClusterTableObj getClusterTableObj();

	/**
	 *	Get the ISOCcy interface for the schema.
	 *
	 *	@return	The ISecureProtISOCcyTableObj interface implementation for the schema.
	 */
	ISecureProtISOCcyTableObj getISOCcyTableObj();

	/**
	 *	Get the ISOCtry interface for the schema.
	 *
	 *	@return	The ISecureProtISOCtryTableObj interface implementation for the schema.
	 */
	ISecureProtISOCtryTableObj getISOCtryTableObj();

	/**
	 *	Get the ISOCtryCcy interface for the schema.
	 *
	 *	@return	The ISecureProtISOCtryCcyTableObj interface implementation for the schema.
	 */
	ISecureProtISOCtryCcyTableObj getISOCtryCcyTableObj();

	/**
	 *	Get the ISOCtryLang interface for the schema.
	 *
	 *	@return	The ISecureProtISOCtryLangTableObj interface implementation for the schema.
	 */
	ISecureProtISOCtryLangTableObj getISOCtryLangTableObj();

	/**
	 *	Get the ISOLang interface for the schema.
	 *
	 *	@return	The ISecureProtISOLangTableObj interface implementation for the schema.
	 */
	ISecureProtISOLangTableObj getISOLangTableObj();

	/**
	 *	Get the ISOTZone interface for the schema.
	 *
	 *	@return	The ISecureProtISOTZoneTableObj interface implementation for the schema.
	 */
	ISecureProtISOTZoneTableObj getISOTZoneTableObj();

	/**
	 *	Get the SecClusGrp interface for the schema.
	 *
	 *	@return	The ISecureProtSecClusGrpTableObj interface implementation for the schema.
	 */
	ISecureProtSecClusGrpTableObj getSecClusGrpTableObj();

	/**
	 *	Get the SecClusGrpMemb interface for the schema.
	 *
	 *	@return	The ISecureProtSecClusGrpMembTableObj interface implementation for the schema.
	 */
	ISecureProtSecClusGrpMembTableObj getSecClusGrpMembTableObj();

	/**
	 *	Get the SecClusRole interface for the schema.
	 *
	 *	@return	The ISecureProtSecClusRoleTableObj interface implementation for the schema.
	 */
	ISecureProtSecClusRoleTableObj getSecClusRoleTableObj();

	/**
	 *	Get the SecClusRoleMemb interface for the schema.
	 *
	 *	@return	The ISecureProtSecClusRoleMembTableObj interface implementation for the schema.
	 */
	ISecureProtSecClusRoleMembTableObj getSecClusRoleMembTableObj();

	/**
	 *	Get the SecSession interface for the schema.
	 *
	 *	@return	The ISecureProtSecSessionTableObj interface implementation for the schema.
	 */
	ISecureProtSecSessionTableObj getSecSessionTableObj();

	/**
	 *	Get the SecSysGrp interface for the schema.
	 *
	 *	@return	The ISecureProtSecSysGrpTableObj interface implementation for the schema.
	 */
	ISecureProtSecSysGrpTableObj getSecSysGrpTableObj();

	/**
	 *	Get the SecSysGrpInc interface for the schema.
	 *
	 *	@return	The ISecureProtSecSysGrpIncTableObj interface implementation for the schema.
	 */
	ISecureProtSecSysGrpIncTableObj getSecSysGrpIncTableObj();

	/**
	 *	Get the SecSysGrpMemb interface for the schema.
	 *
	 *	@return	The ISecureProtSecSysGrpMembTableObj interface implementation for the schema.
	 */
	ISecureProtSecSysGrpMembTableObj getSecSysGrpMembTableObj();

	/**
	 *	Get the SecSysRole interface for the schema.
	 *
	 *	@return	The ISecureProtSecSysRoleTableObj interface implementation for the schema.
	 */
	ISecureProtSecSysRoleTableObj getSecSysRoleTableObj();

	/**
	 *	Get the SecSysRoleEnables interface for the schema.
	 *
	 *	@return	The ISecureProtSecSysRoleEnablesTableObj interface implementation for the schema.
	 */
	ISecureProtSecSysRoleEnablesTableObj getSecSysRoleEnablesTableObj();

	/**
	 *	Get the SecSysRoleMemb interface for the schema.
	 *
	 *	@return	The ISecureProtSecSysRoleMembTableObj interface implementation for the schema.
	 */
	ISecureProtSecSysRoleMembTableObj getSecSysRoleMembTableObj();

	/**
	 *	Get the SecTentGrp interface for the schema.
	 *
	 *	@return	The ISecureProtSecTentGrpTableObj interface implementation for the schema.
	 */
	ISecureProtSecTentGrpTableObj getSecTentGrpTableObj();

	/**
	 *	Get the SecTentGrpMemb interface for the schema.
	 *
	 *	@return	The ISecureProtSecTentGrpMembTableObj interface implementation for the schema.
	 */
	ISecureProtSecTentGrpMembTableObj getSecTentGrpMembTableObj();

	/**
	 *	Get the SecTentRole interface for the schema.
	 *
	 *	@return	The ISecureProtSecTentRoleTableObj interface implementation for the schema.
	 */
	ISecureProtSecTentRoleTableObj getSecTentRoleTableObj();

	/**
	 *	Get the SecTentRoleMemb interface for the schema.
	 *
	 *	@return	The ISecureProtSecTentRoleMembTableObj interface implementation for the schema.
	 */
	ISecureProtSecTentRoleMembTableObj getSecTentRoleMembTableObj();

	/**
	 *	Get the SecUser interface for the schema.
	 *
	 *	@return	The ISecureProtSecUserTableObj interface implementation for the schema.
	 */
	ISecureProtSecUserTableObj getSecUserTableObj();

	/**
	 *	Get the SecUserEMConf interface for the schema.
	 *
	 *	@return	The ISecureProtSecUserEMConfTableObj interface implementation for the schema.
	 */
	ISecureProtSecUserEMConfTableObj getSecUserEMConfTableObj();

	/**
	 *	Get the SecUserPWReset interface for the schema.
	 *
	 *	@return	The ISecureProtSecUserPWResetTableObj interface implementation for the schema.
	 */
	ISecureProtSecUserPWResetTableObj getSecUserPWResetTableObj();

	/**
	 *	Get the SysCluster interface for the schema.
	 *
	 *	@return	The ISecureProtSysClusterTableObj interface implementation for the schema.
	 */
	ISecureProtSysClusterTableObj getSysClusterTableObj();

	/**
	 *	Get the TableInfo interface for the schema.
	 *
	 *	@return	The ISecureProtTableInfoTableObj interface implementation for the schema.
	 */
	ISecureProtTableInfoTableObj getTableInfoTableObj();

	/**
	 *	Get the Tenant interface for the schema.
	 *
	 *	@return	The ISecureProtTenantTableObj interface implementation for the schema.
	 */
	ISecureProtTenantTableObj getTenantTableObj();
}
