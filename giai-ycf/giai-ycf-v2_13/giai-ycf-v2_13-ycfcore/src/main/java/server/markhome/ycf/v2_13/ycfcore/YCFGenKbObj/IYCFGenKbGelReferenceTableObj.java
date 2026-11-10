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

public interface IYCFGenKbGelReferenceTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelReference instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelReferenceObj newInstance();

	/**
	 *	Instantiate a new GelReference edition of the specified GelReference instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelReferenceEditObj newEditInstance( IYCFGenKbGelReferenceObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelReferenceObj realiseGelReference( IYCFGenKbGelReferenceObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelReferenceObj createGelReference( IYCFGenKbGelReferenceObj Obj );

	/**
	 *	Read a GelReference-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelReference-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelReferenceObj readGelReference( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelReference-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelReference-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelReferenceObj readGelReference( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelReferenceObj readCachedGelReference( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelReference( IYCFGenKbGelReferenceObj obj );

	void deepDisposeGelReference( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelReferenceObj lockGelReference( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelReference-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelReferenceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readAllGelReference();

	/**
	 *	Return a sorted map of all the GelReference-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelReferenceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readAllGelReference( boolean forceRead );

	List<IYCFGenKbGelReferenceObj> readCachedAllGelReference();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelReferenceObj readGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelReferenceObj readGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readGelReferenceByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readGelReferenceByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Get the map of YCFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelReferenceObj> readGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead );

	IYCFGenKbGelReferenceObj readCachedGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelReferenceObj> readCachedGelReferenceByTenantIdx( long TenantId );

	List<IYCFGenKbGelReferenceObj> readCachedGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelReferenceObj> readCachedGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<IYCFGenKbGelReferenceObj> readCachedGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	void deepDisposeGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelReferenceByTenantIdx( long TenantId );

	void deepDisposeGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelReferenceObj updateGelReference( IYCFGenKbGelReferenceObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelReference( IYCFGenKbGelReferenceObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRemainderTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );
}
