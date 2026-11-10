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

public interface IYCFGenKbGelCacheTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelCache instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelCacheObj newInstance();

	/**
	 *	Instantiate a new GelCache edition of the specified GelCache instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelCacheEditObj newEditInstance( IYCFGenKbGelCacheObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCacheObj realiseGelCache( IYCFGenKbGelCacheObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCacheObj createGelCache( IYCFGenKbGelCacheObj Obj );

	/**
	 *	Read a GelCache-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCache-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelCacheObj readGelCache( YCFGenKbGelCachePKey pkey );

	/**
	 *	Read a GelCache-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCache-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelCacheObj readGelCache( YCFGenKbGelCachePKey pkey,
		boolean forceRead );

	IYCFGenKbGelCacheObj readCachedGelCache( YCFGenKbGelCachePKey pkey );

	public void reallyDeepDisposeGelCache( IYCFGenKbGelCacheObj obj );

	void deepDisposeGelCache( YCFGenKbGelCachePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCacheObj lockGelCache( YCFGenKbGelCachePKey pkey );

	/**
	 *	Return a sorted list of all the GelCache-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelCacheObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelCacheObj> readAllGelCache();

	/**
	 *	Return a sorted map of all the GelCache-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelCacheObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelCacheObj> readAllGelCache( boolean forceRead );

	List<IYCFGenKbGelCacheObj> readCachedAllGelCache();

	/**
	 *	Get the YCFGenKbGelCacheObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelCacheObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelCacheObj readGelCacheByIdIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the YCFGenKbGelCacheObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelCacheObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelCacheObj readGelCacheByIdIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelCacheObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCacheObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCacheObj> readGelCacheByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelCacheObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCacheObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCacheObj> readGelCacheByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbGelCacheObj instance for the unique AltIdx key.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argCacheName	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelCacheObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelCacheObj readGelCacheByAltIdx(long TenantId,
		String CacheName );

	/**
	 *	Get the YCFGenKbGelCacheObj instance for the unique AltIdx key.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argCacheName	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelCacheObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelCacheObj readGelCacheByAltIdx(long TenantId,
		String CacheName,
		boolean forceRead );

	IYCFGenKbGelCacheObj readCachedGelCacheByIdIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelCacheObj> readCachedGelCacheByTenantIdx( long TenantId );

	IYCFGenKbGelCacheObj readCachedGelCacheByAltIdx( long TenantId,
		String CacheName );

	void deepDisposeGelCacheByIdIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelCacheByTenantIdx( long TenantId );

	void deepDisposeGelCacheByAltIdx( long TenantId,
		String CacheName );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCacheObj updateGelCache( IYCFGenKbGelCacheObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelCache( IYCFGenKbGelCacheObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCache key attribute of the instance generating the id.
	 */
	void deleteGelCacheByIdIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 */
	void deleteGelCacheByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argCacheName	The GelCache key attribute of the instance generating the id.
	 */
	void deleteGelCacheByAltIdx(long TenantId,
		String CacheName );
}
