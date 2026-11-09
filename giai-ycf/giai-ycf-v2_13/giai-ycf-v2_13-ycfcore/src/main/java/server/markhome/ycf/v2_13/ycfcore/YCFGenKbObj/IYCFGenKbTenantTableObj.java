// Description: Java 11 Table Object interface for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbTenantTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Tenant instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbTenantObj newInstance();

	/**
	 *	Instantiate a new Tenant edition of the specified Tenant instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbTenantEditObj newEditInstance( ICFGenKbTenantObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbTenantObj realiseTenant( ICFGenKbTenantObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbTenantObj createTenant( ICFGenKbTenantObj Obj );

	/**
	 *	Read a Tenant-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tenant-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbTenantObj readTenant( CFGenKbTenantPKey pkey );

	/**
	 *	Read a Tenant-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tenant-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbTenantObj readTenant( CFGenKbTenantPKey pkey,
		boolean forceRead );

	ICFGenKbTenantObj readCachedTenant( CFGenKbTenantPKey pkey );

	public void reallyDeepDisposeTenant( ICFGenKbTenantObj obj );

	void deepDisposeTenant( CFGenKbTenantPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbTenantObj lockTenant( CFGenKbTenantPKey pkey );

	/**
	 *	Return a sorted list of all the Tenant-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbTenantObj> readAllTenant();

	/**
	 *	Return a sorted map of all the Tenant-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbTenantObj> readAllTenant( boolean forceRead );

	List<ICFGenKbTenantObj> readCachedAllTenant();

	/**
	 *	Return a sorted map of a page of the Tenant-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbTenantObj> pageAllTenant(Long priorId );

	/**
	 *	Get the CFGenKbTenantObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbTenantObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbTenantObj readTenantByIdIdx( long Id );

	/**
	 *	Get the CFGenKbTenantObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbTenantObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbTenantObj readTenantByIdIdx( long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbTenantObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbTenantObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbTenantObj> readTenantByClusterIdx( long ClusterId );

	/**
	 *	Get the map of CFGenKbTenantObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbTenantObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbTenantObj> readTenantByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbTenantObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	argTenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbTenantObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbTenantObj readTenantByUNameIdx(long ClusterId,
		String TenantName );

	/**
	 *	Get the CFGenKbTenantObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	argTenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbTenantObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbTenantObj readTenantByUNameIdx(long ClusterId,
		String TenantName,
		boolean forceRead );

	ICFGenKbTenantObj readCachedTenantByIdIdx( long Id );

	List<ICFGenKbTenantObj> readCachedTenantByClusterIdx( long ClusterId );

	ICFGenKbTenantObj readCachedTenantByUNameIdx( long ClusterId,
		String TenantName );

	void deepDisposeTenantByIdIdx( long Id );

	void deepDisposeTenantByClusterIdx( long ClusterId );

	void deepDisposeTenantByUNameIdx( long ClusterId,
		String TenantName );

	/**
	 *	Read a page of data as a List of Tenant-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	A List of Tenant-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFGenKbTenantObj> pageTenantByClusterIdx( long ClusterId,
		Long priorId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbTenantObj updateTenant( ICFGenKbTenantObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTenant( ICFGenKbTenantObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The Tenant key attribute of the instance generating the id.
	 */
	void deleteTenantByIdIdx( long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 */
	void deleteTenantByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	argTenantName	The Tenant key attribute of the instance generating the id.
	 */
	void deleteTenantByUNameIdx(long ClusterId,
		String TenantName );

	ICFGenKbTenantObj getSystemTenant();
}
