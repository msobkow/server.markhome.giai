// Description: Java 25 Public Schema Object interface for SecurePub.

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

package server.markhome.ycf.v3_1.secure.securepubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface ISecurePubSchemaObj
{
	ISecurePubAuthorization getAuthorization();
	void setAuthorization( ISecurePubAuthorization value );

	String getSchemaName();

	void setSecClusterName( String value );
	ISecurePubClusterObj getSecCluster();
	void setSecCluster( ISecurePubClusterObj value );

	void setSecTenantName( String value );
	ISecurePubTenantObj getSecTenant();
	void setSecTenant( ISecurePubTenantObj value );

	void setSecUserName( String value );
	ISecurePubSecUserObj getSecUser();
	void setSecUser( ISecurePubSecUserObj value );

	void setSecSessionId( CFDbKeyHash256 value );
	ISecurePubSecSessionObj getSecSession();
	void setSecSession( ISecurePubSecSessionObj value );

	void logout();

	void minimizeMemory();

	public ISecurePubSchema getSecurePubBackingStore();
	public void setSecurePubBackingStore(ISecurePubSchema securepubBackingStore);

	/**
	 *	Get the Cluster interface for the schema.
	 *
	 *	@return	The ISecurePubClusterTableObj interface implementation for the schema.
	 */
	ISecurePubClusterTableObj getClusterTableObj();

	/**
	 *	Get the ISOCcy interface for the schema.
	 *
	 *	@return	The ISecurePubISOCcyTableObj interface implementation for the schema.
	 */
	ISecurePubISOCcyTableObj getISOCcyTableObj();

	/**
	 *	Get the ISOCtry interface for the schema.
	 *
	 *	@return	The ISecurePubISOCtryTableObj interface implementation for the schema.
	 */
	ISecurePubISOCtryTableObj getISOCtryTableObj();

	/**
	 *	Get the ISOCtryCcy interface for the schema.
	 *
	 *	@return	The ISecurePubISOCtryCcyTableObj interface implementation for the schema.
	 */
	ISecurePubISOCtryCcyTableObj getISOCtryCcyTableObj();

	/**
	 *	Get the ISOCtryLang interface for the schema.
	 *
	 *	@return	The ISecurePubISOCtryLangTableObj interface implementation for the schema.
	 */
	ISecurePubISOCtryLangTableObj getISOCtryLangTableObj();

	/**
	 *	Get the ISOLang interface for the schema.
	 *
	 *	@return	The ISecurePubISOLangTableObj interface implementation for the schema.
	 */
	ISecurePubISOLangTableObj getISOLangTableObj();

	/**
	 *	Get the ISOTZone interface for the schema.
	 *
	 *	@return	The ISecurePubISOTZoneTableObj interface implementation for the schema.
	 */
	ISecurePubISOTZoneTableObj getISOTZoneTableObj();

	/**
	 *	Get the SecSession interface for the schema.
	 *
	 *	@return	The ISecurePubSecSessionTableObj interface implementation for the schema.
	 */
	ISecurePubSecSessionTableObj getSecSessionTableObj();

	/**
	 *	Get the SecSysGrp interface for the schema.
	 *
	 *	@return	The ISecurePubSecSysGrpTableObj interface implementation for the schema.
	 */
	ISecurePubSecSysGrpTableObj getSecSysGrpTableObj();

	/**
	 *	Get the SecSysRole interface for the schema.
	 *
	 *	@return	The ISecurePubSecSysRoleTableObj interface implementation for the schema.
	 */
	ISecurePubSecSysRoleTableObj getSecSysRoleTableObj();

	/**
	 *	Get the SecUser interface for the schema.
	 *
	 *	@return	The ISecurePubSecUserTableObj interface implementation for the schema.
	 */
	ISecurePubSecUserTableObj getSecUserTableObj();

	/**
	 *	Get the SysCluster interface for the schema.
	 *
	 *	@return	The ISecurePubSysClusterTableObj interface implementation for the schema.
	 */
	ISecurePubSysClusterTableObj getSysClusterTableObj();

	/**
	 *	Get the TableInfo interface for the schema.
	 *
	 *	@return	The ISecurePubTableInfoTableObj interface implementation for the schema.
	 */
	ISecurePubTableInfoTableObj getTableInfoTableObj();

	/**
	 *	Get the Tenant interface for the schema.
	 *
	 *	@return	The ISecurePubTenantTableObj interface implementation for the schema.
	 */
	ISecurePubTenantTableObj getTenantTableObj();
}
