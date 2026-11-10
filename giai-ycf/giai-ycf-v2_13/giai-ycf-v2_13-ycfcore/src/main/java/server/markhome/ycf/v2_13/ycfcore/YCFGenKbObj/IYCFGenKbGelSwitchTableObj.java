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

public interface IYCFGenKbGelSwitchTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelSwitch instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelSwitchObj newInstance();

	/**
	 *	Instantiate a new GelSwitch edition of the specified GelSwitch instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelSwitchEditObj newEditInstance( IYCFGenKbGelSwitchObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSwitchObj realiseGelSwitch( IYCFGenKbGelSwitchObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSwitchObj createGelSwitch( IYCFGenKbGelSwitchObj Obj );

	/**
	 *	Read a GelSwitch-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelSwitch-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelSwitchObj readGelSwitch( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelSwitch-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelSwitch-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelSwitchObj readGelSwitch( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelSwitchObj readCachedGelSwitch( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelSwitch( IYCFGenKbGelSwitchObj obj );

	void deepDisposeGelSwitch( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSwitchObj lockGelSwitch( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelSwitch-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelSwitchObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelSwitchObj> readAllGelSwitch();

	/**
	 *	Return a sorted map of all the GelSwitch-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelSwitchObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelSwitchObj> readAllGelSwitch( boolean forceRead );

	List<IYCFGenKbGelSwitchObj> readCachedAllGelSwitch();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelSwitchObj readGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelSwitchObj readGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchObj> readGelSwitchByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelSwitchObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchObj> readGelSwitchByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchObj> readGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelSwitchObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchObj> readGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchObj> readGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelSwitchObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSwitchObj> readGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	IYCFGenKbGelSwitchObj readCachedGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelSwitchObj> readCachedGelSwitchByTenantIdx( long TenantId );

	List<IYCFGenKbGelSwitchObj> readCachedGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelSwitchObj> readCachedGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelSwitchByTenantIdx( long TenantId );

	void deepDisposeGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSwitchObj updateGelSwitch( IYCFGenKbGelSwitchObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelSwitch( IYCFGenKbGelSwitchObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitch key attribute of the instance generating the id.
	 */
	void deleteGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 */
	void deleteGelSwitchByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 */
	void deleteGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelSwitch key attribute of the instance generating the id.
	 */
	void deleteGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
