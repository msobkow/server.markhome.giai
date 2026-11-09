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

public interface ICFGenKbGelBoilerplateTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelBoilerplate instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelBoilerplateObj newInstance();

	/**
	 *	Instantiate a new GelBoilerplate edition of the specified GelBoilerplate instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelBoilerplateEditObj newEditInstance( ICFGenKbGelBoilerplateObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelBoilerplateObj realiseGelBoilerplate( ICFGenKbGelBoilerplateObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelBoilerplateObj createGelBoilerplate( ICFGenKbGelBoilerplateObj Obj );

	/**
	 *	Read a GelBoilerplate-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelBoilerplate-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelBoilerplateObj readGelBoilerplate( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelBoilerplate-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelBoilerplate-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelBoilerplateObj readGelBoilerplate( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelBoilerplateObj readCachedGelBoilerplate( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelBoilerplate( ICFGenKbGelBoilerplateObj obj );

	void deepDisposeGelBoilerplate( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelBoilerplateObj lockGelBoilerplate( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelBoilerplate-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelBoilerplateObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelBoilerplateObj> readAllGelBoilerplate();

	/**
	 *	Return a sorted map of all the GelBoilerplate-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelBoilerplateObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelBoilerplateObj> readAllGelBoilerplate( boolean forceRead );

	List<ICFGenKbGelBoilerplateObj> readCachedAllGelBoilerplate();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelBoilerplateObj readGelBoilerplateByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelBoilerplateObj readGelBoilerplateByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelBoilerplateObj> readGelBoilerplateByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelBoilerplateObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelBoilerplateObj> readGelBoilerplateByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelBoilerplateObj> readGelBoilerplateByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelBoilerplateObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelBoilerplateObj> readGelBoilerplateByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelBoilerplateObj> readGelBoilerplateByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelBoilerplateObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelBoilerplateObj> readGelBoilerplateByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	ICFGenKbGelBoilerplateObj readCachedGelBoilerplateByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelBoilerplateObj> readCachedGelBoilerplateByTenantIdx( long TenantId );

	List<ICFGenKbGelBoilerplateObj> readCachedGelBoilerplateByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelBoilerplateObj> readCachedGelBoilerplateByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelBoilerplateByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelBoilerplateByTenantIdx( long TenantId );

	void deepDisposeGelBoilerplateByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelBoilerplateByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelBoilerplateObj updateGelBoilerplate( ICFGenKbGelBoilerplateObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelBoilerplate( ICFGenKbGelBoilerplateObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 */
	void deleteGelBoilerplateByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 */
	void deleteGelBoilerplateByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 */
	void deleteGelBoilerplateByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 */
	void deleteGelBoilerplateByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
