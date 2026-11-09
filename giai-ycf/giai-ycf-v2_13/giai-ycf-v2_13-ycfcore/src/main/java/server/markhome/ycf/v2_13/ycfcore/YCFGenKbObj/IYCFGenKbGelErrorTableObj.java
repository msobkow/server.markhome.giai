// Description: Java 11 Table Object interface for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbGelErrorTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelError instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelErrorObj newInstance();

	/**
	 *	Instantiate a new GelError edition of the specified GelError instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelErrorEditObj newEditInstance( ICFGenKbGelErrorObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelErrorObj realiseGelError( ICFGenKbGelErrorObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelErrorObj createGelError( ICFGenKbGelErrorObj Obj );

	/**
	 *	Read a GelError-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelError-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelErrorObj readGelError( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelError-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelError-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelErrorObj readGelError( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelErrorObj readCachedGelError( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelError( ICFGenKbGelErrorObj obj );

	void deepDisposeGelError( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelErrorObj lockGelError( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelError-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelErrorObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelErrorObj> readAllGelError();

	/**
	 *	Return a sorted map of all the GelError-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelErrorObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelErrorObj> readAllGelError( boolean forceRead );

	List<ICFGenKbGelErrorObj> readCachedAllGelError();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelError key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelErrorObj readGelErrorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelError key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelErrorObj readGelErrorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelErrorObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelErrorObj> readGelErrorByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelErrorObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelErrorObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelErrorObj> readGelErrorByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelError key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelErrorObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelErrorObj> readGelErrorByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelErrorObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelError key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelErrorObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelErrorObj> readGelErrorByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelError key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelErrorObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelErrorObj> readGelErrorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelErrorObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelError key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelErrorObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelErrorObj> readGelErrorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	ICFGenKbGelErrorObj readCachedGelErrorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelErrorObj> readCachedGelErrorByTenantIdx( long TenantId );

	List<ICFGenKbGelErrorObj> readCachedGelErrorByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelErrorObj> readCachedGelErrorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelErrorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelErrorByTenantIdx( long TenantId );

	void deepDisposeGelErrorByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelErrorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelErrorObj updateGelError( ICFGenKbGelErrorObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelError( ICFGenKbGelErrorObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelError key attribute of the instance generating the id.
	 */
	void deleteGelErrorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelError key attribute of the instance generating the id.
	 */
	void deleteGelErrorByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelError key attribute of the instance generating the id.
	 */
	void deleteGelErrorByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelError key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelError key attribute of the instance generating the id.
	 */
	void deleteGelErrorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
