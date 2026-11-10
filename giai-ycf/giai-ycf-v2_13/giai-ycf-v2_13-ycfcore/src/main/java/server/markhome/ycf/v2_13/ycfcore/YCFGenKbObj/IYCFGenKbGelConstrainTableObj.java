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

public interface IYCFGenKbGelConstrainTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelConstrain instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelConstrainObj newInstance();

	/**
	 *	Instantiate a new GelConstrain edition of the specified GelConstrain instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelConstrainEditObj newEditInstance( IYCFGenKbGelConstrainObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelConstrainObj realiseGelConstrain( IYCFGenKbGelConstrainObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelConstrainObj createGelConstrain( IYCFGenKbGelConstrainObj Obj );

	/**
	 *	Read a GelConstrain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelConstrain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelConstrainObj readGelConstrain( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelConstrain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelConstrain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelConstrainObj readGelConstrain( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelConstrainObj readCachedGelConstrain( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelConstrain( IYCFGenKbGelConstrainObj obj );

	void deepDisposeGelConstrain( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelConstrainObj lockGelConstrain( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelConstrain-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelConstrainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readAllGelConstrain();

	/**
	 *	Return a sorted map of all the GelConstrain-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelConstrainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readAllGelConstrain( boolean forceRead );

	List<IYCFGenKbGelConstrainObj> readCachedAllGelConstrain();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelConstrainObj readGelConstrainByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelConstrainObj readGelConstrainByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelConstrainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readGelConstrainByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelConstrainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelConstrainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readGelConstrainByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelConstrainObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readGelConstrainByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelConstrainObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelConstrainObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readGelConstrainByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelConstrainObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readGelConstrainByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelConstrainObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelConstrainObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readGelConstrainByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelConstrainObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelConstrainObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readGelConstrainByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Get the map of YCFGenKbGelConstrainObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelConstrainObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelConstrainObj> readGelConstrainByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead );

	IYCFGenKbGelConstrainObj readCachedGelConstrainByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelConstrainObj> readCachedGelConstrainByTenantIdx( long TenantId );

	List<IYCFGenKbGelConstrainObj> readCachedGelConstrainByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelConstrainObj> readCachedGelConstrainByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<IYCFGenKbGelConstrainObj> readCachedGelConstrainByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	void deepDisposeGelConstrainByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelConstrainByTenantIdx( long TenantId );

	void deepDisposeGelConstrainByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelConstrainByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelConstrainByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelConstrainObj updateGelConstrain( IYCFGenKbGelConstrainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelConstrain( IYCFGenKbGelConstrainObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRemainderTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );
}
