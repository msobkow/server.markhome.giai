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

public interface IYCFGenKbGelCounterTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelCounter instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelCounterObj newInstance();

	/**
	 *	Instantiate a new GelCounter edition of the specified GelCounter instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelCounterEditObj newEditInstance( IYCFGenKbGelCounterObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCounterObj realiseGelCounter( IYCFGenKbGelCounterObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCounterObj createGelCounter( IYCFGenKbGelCounterObj Obj );

	/**
	 *	Read a GelCounter-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCounter-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelCounterObj readGelCounter( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelCounter-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCounter-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelCounterObj readGelCounter( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelCounterObj readCachedGelCounter( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelCounter( IYCFGenKbGelCounterObj obj );

	void deepDisposeGelCounter( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCounterObj lockGelCounter( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelCounter-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelCounterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelCounterObj> readAllGelCounter();

	/**
	 *	Return a sorted map of all the GelCounter-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelCounterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelCounterObj> readAllGelCounter( boolean forceRead );

	List<IYCFGenKbGelCounterObj> readCachedAllGelCounter();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelCounterObj readGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelCounterObj readGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCounterObj> readGelCounterByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelCounterObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCounterObj> readGelCounterByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCounterObj> readGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelCounterObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCounterObj> readGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCounterObj> readGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelCounterObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCounterObj> readGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	IYCFGenKbGelCounterObj readCachedGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelCounterObj> readCachedGelCounterByTenantIdx( long TenantId );

	List<IYCFGenKbGelCounterObj> readCachedGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelCounterObj> readCachedGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelCounterByTenantIdx( long TenantId );

	void deepDisposeGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCounterObj updateGelCounter( IYCFGenKbGelCounterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelCounter( IYCFGenKbGelCounterObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCounter key attribute of the instance generating the id.
	 */
	void deleteGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 */
	void deleteGelCounterByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 */
	void deleteGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCounter key attribute of the instance generating the id.
	 */
	void deleteGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
