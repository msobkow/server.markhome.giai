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

public interface IYCFGenKbGelSwitchLimbTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelSwitchLimb instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelSwitchLimbObj newInstance();

	/**
	 *	Instantiate a new GelSwitchLimb edition of the specified GelSwitchLimb instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelSwitchLimbEditObj newEditInstance( IYCFGenKbGelSwitchLimbObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSwitchLimbObj realiseGelSwitchLimb( IYCFGenKbGelSwitchLimbObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSwitchLimbObj createGelSwitchLimb( IYCFGenKbGelSwitchLimbObj Obj );

	/**
	 *	Read a GelSwitchLimb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelSwitchLimb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelSwitchLimbObj readGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey );

	/**
	 *	Read a GelSwitchLimb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelSwitchLimb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelSwitchLimbObj readGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey,
		boolean forceRead );

	IYCFGenKbGelSwitchLimbObj readCachedGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey );

	public void reallyDeepDisposeGelSwitchLimb( IYCFGenKbGelSwitchLimbObj obj );

	void deepDisposeGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSwitchLimbObj lockGelSwitchLimb( YCFGenKbGelSwitchLimbPKey pkey );

	/**
	 *	Return a sorted list of all the GelSwitchLimb-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelSwitchLimbObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelSwitchLimbObj> readAllGelSwitchLimb();

	/**
	 *	Return a sorted map of all the GelSwitchLimb-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelSwitchLimbObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelSwitchLimbObj> readAllGelSwitchLimb( boolean forceRead );

	List<IYCFGenKbGelSwitchLimbObj> readCachedAllGelSwitchLimb();

	/**
	 *	Get the YCFGenKbGelSwitchLimbObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argLimbName	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelSwitchLimbObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelSwitchLimbObj readGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName );

	/**
	 *	Get the YCFGenKbGelSwitchLimbObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argLimbName	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelSwitchLimbObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelSwitchLimbObj readGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelSwitchLimbObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchLimbObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchLimbObj> readGelSwitchLimbByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelSwitchLimbObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchLimbObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchLimbObj> readGelSwitchLimbByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelSwitchLimbObj instances sorted by their primary keys for the duplicate SwitchIdx key.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchLimbObj cached instances sorted by their primary keys for the duplicate SwitchIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchLimbObj> readGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the map of YCFGenKbGelSwitchLimbObj instances sorted by their primary keys for the duplicate SwitchIdx key.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchLimbObj cached instances sorted by their primary keys for the duplicate SwitchIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchLimbObj> readGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	IYCFGenKbGelSwitchLimbObj readCachedGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName );

	List<IYCFGenKbGelSwitchLimbObj> readCachedGelSwitchLimbByTenantIdx( long TenantId );

	List<IYCFGenKbGelSwitchLimbObj> readCachedGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName );

	void deepDisposeGelSwitchLimbByTenantIdx( long TenantId );

	void deepDisposeGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSwitchLimbObj updateGelSwitchLimb( IYCFGenKbGelSwitchLimbObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelSwitchLimb( IYCFGenKbGelSwitchLimbObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argLimbName	The GelSwitchLimb key attribute of the instance generating the id.
	 */
	void deleteGelSwitchLimbByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 */
	void deleteGelSwitchLimbByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 */
	void deleteGelSwitchLimbBySwitchIdx( long TenantId,
		long GelCacheId,
		long GelInstId );
}
