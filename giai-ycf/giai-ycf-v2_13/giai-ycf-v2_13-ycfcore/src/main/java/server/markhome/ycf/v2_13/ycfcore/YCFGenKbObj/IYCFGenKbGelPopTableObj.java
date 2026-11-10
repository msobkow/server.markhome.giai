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

public interface IYCFGenKbGelPopTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelPop instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelPopObj newInstance();

	/**
	 *	Instantiate a new GelPop edition of the specified GelPop instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelPopEditObj newEditInstance( IYCFGenKbGelPopObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelPopObj realiseGelPop( IYCFGenKbGelPopObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelPopObj createGelPop( IYCFGenKbGelPopObj Obj );

	/**
	 *	Read a GelPop-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPop-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelPopObj readGelPop( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelPop-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPop-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelPopObj readGelPop( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelPopObj readCachedGelPop( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelPop( IYCFGenKbGelPopObj obj );

	void deepDisposeGelPop( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelPopObj lockGelPop( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelPop-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelPopObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelPopObj> readAllGelPop();

	/**
	 *	Return a sorted map of all the GelPop-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelPopObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelPopObj> readAllGelPop( boolean forceRead );

	List<IYCFGenKbGelPopObj> readCachedAllGelPop();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelPopObj readGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelPopObj readGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelPopObj> readGelPopByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelPopObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelPopObj> readGelPopByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelPopObj> readGelPopByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelPopObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelPopObj> readGelPopByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelPopObj> readGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelPopObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelPopObj> readGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelPopObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelPopObj> readGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Get the map of YCFGenKbGelPopObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelPopObj> readGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead );

	IYCFGenKbGelPopObj readCachedGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelPopObj> readCachedGelPopByTenantIdx( long TenantId );

	List<IYCFGenKbGelPopObj> readCachedGelPopByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelPopObj> readCachedGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<IYCFGenKbGelPopObj> readCachedGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	void deepDisposeGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelPopByTenantIdx( long TenantId );

	void deepDisposeGelPopByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelPopObj updateGelPop( IYCFGenKbGelPopObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelPop( IYCFGenKbGelPopObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRemainderTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );
}
