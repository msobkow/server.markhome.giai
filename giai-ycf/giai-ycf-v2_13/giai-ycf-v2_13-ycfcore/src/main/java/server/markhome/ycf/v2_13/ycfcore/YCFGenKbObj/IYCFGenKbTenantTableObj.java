// Description: Java 11 Table Object interface for YCFGenKb.

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

public interface IYCFGenKbTenantTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Tenant instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbTenantObj newInstance();

	/**
	 *	Instantiate a new Tenant edition of the specified Tenant instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbTenantEditObj newEditInstance( IYCFGenKbTenantObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTenantObj realiseTenant( IYCFGenKbTenantObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTenantObj createTenant( IYCFGenKbTenantObj Obj );

	/**
	 *	Read a Tenant-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tenant-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbTenantObj readTenant( YCFGenKbTenantPKey pkey );

	/**
	 *	Read a Tenant-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tenant-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbTenantObj readTenant( YCFGenKbTenantPKey pkey,
		boolean forceRead );

	IYCFGenKbTenantObj readCachedTenant( YCFGenKbTenantPKey pkey );

	public void reallyDeepDisposeTenant( IYCFGenKbTenantObj obj );

	void deepDisposeTenant( YCFGenKbTenantPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTenantObj lockTenant( YCFGenKbTenantPKey pkey );

	/**
	 *	Return a sorted list of all the Tenant-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTenantObj> readAllTenant();

	/**
	 *	Return a sorted map of all the Tenant-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTenantObj> readAllTenant( boolean forceRead );

	List<IYCFGenKbTenantObj> readCachedAllTenant();

	/**
	 *	Return a sorted map of a page of the Tenant-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTenantObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTenantObj> pageAllTenant(Long priorId );

	/**
	 *	Get the YCFGenKbTenantObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTenantObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTenantObj readTenantByIdIdx( long Id );

	/**
	 *	Get the YCFGenKbTenantObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTenantObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTenantObj readTenantByIdIdx( long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbTenantObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTenantObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTenantObj> readTenantByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFGenKbTenantObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTenantObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTenantObj> readTenantByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbTenantObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	argTenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTenantObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTenantObj readTenantByUNameIdx(long ClusterId,
		String TenantName );

	/**
	 *	Get the YCFGenKbTenantObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@param	argTenantName	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTenantObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTenantObj readTenantByUNameIdx(long ClusterId,
		String TenantName,
		boolean forceRead );

	IYCFGenKbTenantObj readCachedTenantByIdIdx( long Id );

	List<IYCFGenKbTenantObj> readCachedTenantByClusterIdx( long ClusterId );

	IYCFGenKbTenantObj readCachedTenantByUNameIdx( long ClusterId,
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
	List<IYCFGenKbTenantObj> pageTenantByClusterIdx( long ClusterId,
		Long priorId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTenantObj updateTenant( IYCFGenKbTenantObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTenant( IYCFGenKbTenantObj Obj );

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

	IYCFGenKbTenantObj getSystemTenant();
}
