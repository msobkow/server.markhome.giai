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

public interface IYCFGenKbGelIteratorTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelIterator instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelIteratorObj newInstance();

	/**
	 *	Instantiate a new GelIterator edition of the specified GelIterator instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelIteratorEditObj newEditInstance( IYCFGenKbGelIteratorObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelIteratorObj realiseGelIterator( IYCFGenKbGelIteratorObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelIteratorObj createGelIterator( IYCFGenKbGelIteratorObj Obj );

	/**
	 *	Read a GelIterator-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelIterator-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelIteratorObj readGelIterator( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelIterator-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelIterator-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelIteratorObj readGelIterator( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelIteratorObj readCachedGelIterator( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelIterator( IYCFGenKbGelIteratorObj obj );

	void deepDisposeGelIterator( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelIteratorObj lockGelIterator( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelIterator-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelIteratorObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readAllGelIterator();

	/**
	 *	Return a sorted map of all the GelIterator-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelIteratorObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readAllGelIterator( boolean forceRead );

	List<IYCFGenKbGelIteratorObj> readCachedAllGelIterator();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelIteratorObj readGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelIteratorObj readGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate BeforeIdx key.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate BeforeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByBeforeIdx( String ExpandBefore );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate BeforeIdx key.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate BeforeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByBeforeIdx( String ExpandBefore,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate FirstIdx key.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate FirstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByFirstIdx( String ExpandFirst );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate FirstIdx key.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate FirstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByFirstIdx( String ExpandFirst,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate EachIdx key.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate EachIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByEachIdx( String ExpandEach );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate EachIdx key.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate EachIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByEachIdx( String ExpandEach,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate LastIdx key.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate LastIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByLastIdx( String ExpandLast );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate LastIdx key.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate LastIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByLastIdx( String ExpandLast,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate LoneIdx key.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate LoneIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByLoneIdx( String ExpandLone );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate LoneIdx key.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate LoneIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByLoneIdx( String ExpandLone,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate EmptyIdx key.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate EmptyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByEmptyIdx( String ExpandEmpty );

	/**
	 *	Get the map of YCFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate EmptyIdx key.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate EmptyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelIteratorObj> readGelIteratorByEmptyIdx( String ExpandEmpty,
		boolean forceRead );

	IYCFGenKbGelIteratorObj readCachedGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByTenantIdx( long TenantId );

	List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByBeforeIdx( String ExpandBefore );

	List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByFirstIdx( String ExpandFirst );

	List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByEachIdx( String ExpandEach );

	List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByLastIdx( String ExpandLast );

	List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByLoneIdx( String ExpandLone );

	List<IYCFGenKbGelIteratorObj> readCachedGelIteratorByEmptyIdx( String ExpandEmpty );

	void deepDisposeGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelIteratorByTenantIdx( long TenantId );

	void deepDisposeGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelIteratorByBeforeIdx( String ExpandBefore );

	void deepDisposeGelIteratorByFirstIdx( String ExpandFirst );

	void deepDisposeGelIteratorByEachIdx( String ExpandEach );

	void deepDisposeGelIteratorByLastIdx( String ExpandLast );

	void deepDisposeGelIteratorByLoneIdx( String ExpandLone );

	void deepDisposeGelIteratorByEmptyIdx( String ExpandEmpty );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelIteratorObj updateGelIterator( IYCFGenKbGelIteratorObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelIterator( IYCFGenKbGelIteratorObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByBeforeIdx( String ExpandBefore );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByFirstIdx( String ExpandFirst );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByEachIdx( String ExpandEach );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByLastIdx( String ExpandLast );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByLoneIdx( String ExpandLone );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByEmptyIdx( String ExpandEmpty );
}
