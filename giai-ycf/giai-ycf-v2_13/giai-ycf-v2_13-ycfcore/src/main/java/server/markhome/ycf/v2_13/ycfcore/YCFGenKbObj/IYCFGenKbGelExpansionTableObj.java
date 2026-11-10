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

public interface IYCFGenKbGelExpansionTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelExpansion instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelExpansionObj newInstance();

	/**
	 *	Instantiate a new GelExpansion edition of the specified GelExpansion instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelExpansionEditObj newEditInstance( IYCFGenKbGelExpansionObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelExpansionObj realiseGelExpansion( IYCFGenKbGelExpansionObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelExpansionObj createGelExpansion( IYCFGenKbGelExpansionObj Obj );

	/**
	 *	Read a GelExpansion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelExpansion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelExpansionObj readGelExpansion( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelExpansion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelExpansion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelExpansionObj readGelExpansion( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelExpansionObj readCachedGelExpansion( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelExpansion( IYCFGenKbGelExpansionObj obj );

	void deepDisposeGelExpansion( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelExpansionObj lockGelExpansion( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelExpansion-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelExpansionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelExpansionObj> readAllGelExpansion();

	/**
	 *	Return a sorted map of all the GelExpansion-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelExpansionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelExpansionObj> readAllGelExpansion( boolean forceRead );

	List<IYCFGenKbGelExpansionObj> readCachedAllGelExpansion();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelExpansionObj readGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelExpansionObj readGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelExpansionObj> readGelExpansionByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelExpansionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelExpansionObj> readGelExpansionByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelExpansionObj> readGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelExpansionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelExpansionObj> readGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelExpansionObj> readGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelExpansionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelExpansionObj> readGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	IYCFGenKbGelExpansionObj readCachedGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelExpansionObj> readCachedGelExpansionByTenantIdx( long TenantId );

	List<IYCFGenKbGelExpansionObj> readCachedGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelExpansionObj> readCachedGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelExpansionByTenantIdx( long TenantId );

	void deepDisposeGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelExpansionObj updateGelExpansion( IYCFGenKbGelExpansionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelExpansion( IYCFGenKbGelExpansionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExpansion key attribute of the instance generating the id.
	 */
	void deleteGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 */
	void deleteGelExpansionByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 */
	void deleteGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExpansion key attribute of the instance generating the id.
	 */
	void deleteGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
