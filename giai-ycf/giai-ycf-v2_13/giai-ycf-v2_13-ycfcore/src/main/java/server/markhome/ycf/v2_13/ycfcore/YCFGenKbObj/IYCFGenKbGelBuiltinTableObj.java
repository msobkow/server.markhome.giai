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

public interface IYCFGenKbGelBuiltinTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelBuiltin instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelBuiltinObj newInstance();

	/**
	 *	Instantiate a new GelBuiltin edition of the specified GelBuiltin instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelBuiltinEditObj newEditInstance( IYCFGenKbGelBuiltinObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelBuiltinObj realiseGelBuiltin( IYCFGenKbGelBuiltinObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelBuiltinObj createGelBuiltin( IYCFGenKbGelBuiltinObj Obj );

	/**
	 *	Read a GelBuiltin-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelBuiltin-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelBuiltinObj readGelBuiltin( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelBuiltin-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelBuiltin-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelBuiltinObj readGelBuiltin( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelBuiltinObj readCachedGelBuiltin( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelBuiltin( IYCFGenKbGelBuiltinObj obj );

	void deepDisposeGelBuiltin( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelBuiltinObj lockGelBuiltin( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelBuiltin-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelBuiltinObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelBuiltinObj> readAllGelBuiltin();

	/**
	 *	Return a sorted map of all the GelBuiltin-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelBuiltinObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelBuiltinObj> readAllGelBuiltin( boolean forceRead );

	List<IYCFGenKbGelBuiltinObj> readCachedAllGelBuiltin();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelBuiltinObj readGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelBuiltinObj readGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBuiltinObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBuiltinObj> readGelBuiltinByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelBuiltinObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBuiltinObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBuiltinObj> readGelBuiltinByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBuiltinObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBuiltinObj> readGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelBuiltinObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBuiltinObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBuiltinObj> readGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBuiltinObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBuiltinObj> readGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelBuiltinObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBuiltinObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBuiltinObj> readGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	IYCFGenKbGelBuiltinObj readCachedGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelBuiltinObj> readCachedGelBuiltinByTenantIdx( long TenantId );

	List<IYCFGenKbGelBuiltinObj> readCachedGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelBuiltinObj> readCachedGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelBuiltinByTenantIdx( long TenantId );

	void deepDisposeGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelBuiltinObj updateGelBuiltin( IYCFGenKbGelBuiltinObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelBuiltin( IYCFGenKbGelBuiltinObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelBuiltin key attribute of the instance generating the id.
	 */
	void deleteGelBuiltinByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelBuiltin key attribute of the instance generating the id.
	 */
	void deleteGelBuiltinByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBuiltin key attribute of the instance generating the id.
	 */
	void deleteGelBuiltinByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelBuiltin key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelBuiltin key attribute of the instance generating the id.
	 */
	void deleteGelBuiltinByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
