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

public interface IYCFGenKbGelBoilerplateTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelBoilerplate instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelBoilerplateObj newInstance();

	/**
	 *	Instantiate a new GelBoilerplate edition of the specified GelBoilerplate instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelBoilerplateEditObj newEditInstance( IYCFGenKbGelBoilerplateObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelBoilerplateObj realiseGelBoilerplate( IYCFGenKbGelBoilerplateObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelBoilerplateObj createGelBoilerplate( IYCFGenKbGelBoilerplateObj Obj );

	/**
	 *	Read a GelBoilerplate-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelBoilerplate-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelBoilerplateObj readGelBoilerplate( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelBoilerplate-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelBoilerplate-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelBoilerplateObj readGelBoilerplate( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelBoilerplateObj readCachedGelBoilerplate( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelBoilerplate( IYCFGenKbGelBoilerplateObj obj );

	void deepDisposeGelBoilerplate( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelBoilerplateObj lockGelBoilerplate( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelBoilerplate-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelBoilerplateObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelBoilerplateObj> readAllGelBoilerplate();

	/**
	 *	Return a sorted map of all the GelBoilerplate-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelBoilerplateObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelBoilerplateObj> readAllGelBoilerplate( boolean forceRead );

	List<IYCFGenKbGelBoilerplateObj> readCachedAllGelBoilerplate();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelBoilerplateObj readGelBoilerplateByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelBoilerplateObj readGelBoilerplateByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBoilerplateObj> readGelBoilerplateByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelBoilerplateObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBoilerplateObj> readGelBoilerplateByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBoilerplateObj> readGelBoilerplateByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelBoilerplateObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBoilerplateObj> readGelBoilerplateByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBoilerplateObj> readGelBoilerplateByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelBoilerplateObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelBoilerplate key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelBoilerplateObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelBoilerplateObj> readGelBoilerplateByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	IYCFGenKbGelBoilerplateObj readCachedGelBoilerplateByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelBoilerplateObj> readCachedGelBoilerplateByTenantIdx( long TenantId );

	List<IYCFGenKbGelBoilerplateObj> readCachedGelBoilerplateByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelBoilerplateObj> readCachedGelBoilerplateByChainIdx( Long ChainInstTenantId,
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
	IYCFGenKbGelBoilerplateObj updateGelBoilerplate( IYCFGenKbGelBoilerplateObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelBoilerplate( IYCFGenKbGelBoilerplateObj Obj );

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
