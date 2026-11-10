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

public interface IYCFGenKbGelInstructionTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelInstruction instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelInstructionObj newInstance();

	/**
	 *	Instantiate a new GelInstruction edition of the specified GelInstruction instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelInstructionEditObj newEditInstance( IYCFGenKbGelInstructionObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	argClassCode	The class code used to identify the proposed instance class.
	 *
	 *	@return	IYCFGenKbGelInstructionObj instance, which may be a subclass of a GelInstruction instance.
	 */
	IYCFGenKbGelInstructionObj constructByClassCode( String argClassCode );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelInstructionObj realiseGelInstruction( IYCFGenKbGelInstructionObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelInstructionObj createGelInstruction( IYCFGenKbGelInstructionObj Obj );

	/**
	 *	Read a GelInstruction-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelInstruction-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelInstructionObj readGelInstruction( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelInstruction-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelInstruction-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelInstructionObj readGelInstruction( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelInstructionObj readCachedGelInstruction( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelInstruction( IYCFGenKbGelInstructionObj obj );

	void deepDisposeGelInstruction( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelInstructionObj lockGelInstruction( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelInstruction-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelInstructionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelInstructionObj> readAllGelInstruction();

	/**
	 *	Return a sorted map of all the GelInstruction-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelInstructionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelInstructionObj> readAllGelInstruction( boolean forceRead );

	List<IYCFGenKbGelInstructionObj> readCachedAllGelInstruction();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelInstructionObj readGelInstructionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelInstructionObj readGelInstructionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelInstructionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelInstructionObj> readGelInstructionByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelInstructionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelInstructionObj> readGelInstructionByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelInstructionObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelInstructionObj> readGelInstructionByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelInstructionObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelInstructionObj> readGelInstructionByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelInstructionObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelInstructionObj> readGelInstructionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelInstructionObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelInstructionObj> readGelInstructionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	IYCFGenKbGelInstructionObj readCachedGelInstructionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelInstructionObj> readCachedGelInstructionByTenantIdx( long TenantId );

	List<IYCFGenKbGelInstructionObj> readCachedGelInstructionByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelInstructionObj> readCachedGelInstructionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelInstructionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelInstructionByTenantIdx( long TenantId );

	void deepDisposeGelInstructionByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelInstructionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelInstructionObj updateGelInstruction( IYCFGenKbGelInstructionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelInstruction( IYCFGenKbGelInstructionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelInstruction key attribute of the instance generating the id.
	 */
	void deleteGelInstructionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelInstruction key attribute of the instance generating the id.
	 */
	void deleteGelInstructionByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelInstruction key attribute of the instance generating the id.
	 */
	void deleteGelInstructionByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelInstruction key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelInstruction key attribute of the instance generating the id.
	 */
	void deleteGelInstructionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
