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

public interface IYCFGenKbGelCallTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelCall instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelCallObj newInstance();

	/**
	 *	Instantiate a new GelCall edition of the specified GelCall instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelCallEditObj newEditInstance( IYCFGenKbGelCallObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCallObj realiseGelCall( IYCFGenKbGelCallObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCallObj createGelCall( IYCFGenKbGelCallObj Obj );

	/**
	 *	Read a GelCall-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCall-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelCallObj readGelCall( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelCall-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCall-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelCallObj readGelCall( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelCallObj readCachedGelCall( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelCall( IYCFGenKbGelCallObj obj );

	void deepDisposeGelCall( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCallObj lockGelCall( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelCall-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelCallObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelCallObj> readAllGelCall();

	/**
	 *	Return a sorted map of all the GelCall-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelCallObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelCallObj> readAllGelCall( boolean forceRead );

	List<IYCFGenKbGelCallObj> readCachedAllGelCall();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelCallObj readGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelCallObj readGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate CacheIdx key.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate CacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate CacheIdx key.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate CacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate SeqIdx key.
	 *
	 *	@param	argSeqInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate SeqIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate SeqIdx key.
	 *
	 *	@param	argSeqInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate SeqIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate CallInstIdx key.
	 *
	 *	@param	argCallInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate CallInstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate CallInstIdx key.
	 *
	 *	@param	argCallInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate CallInstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate PrevInstIdx key.
	 *
	 *	@param	argPrevInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate PrevInstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate PrevInstIdx key.
	 *
	 *	@param	argPrevInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate PrevInstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate NextInstIdx key.
	 *
	 *	@param	argNextInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate NextInstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelCallObj instances sorted by their primary keys for the duplicate NextInstIdx key.
	 *
	 *	@param	argNextInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelCallObj cached instances sorted by their primary keys for the duplicate NextInstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelCallObj> readGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId,
		boolean forceRead );

	IYCFGenKbGelCallObj readCachedGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelCallObj> readCachedGelCallByTenantIdx( long TenantId );

	List<IYCFGenKbGelCallObj> readCachedGelCallByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelCallObj> readCachedGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<IYCFGenKbGelCallObj> readCachedGelCallByCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelCallObj> readCachedGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId );

	List<IYCFGenKbGelCallObj> readCachedGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId );

	List<IYCFGenKbGelCallObj> readCachedGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId );

	List<IYCFGenKbGelCallObj> readCachedGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId );

	void deepDisposeGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelCallByTenantIdx( long TenantId );

	void deepDisposeGelCallByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelCallByCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId );

	void deepDisposeGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId );

	void deepDisposeGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId );

	void deepDisposeGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelCallObj updateGelCall( IYCFGenKbGelCallObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelCall( IYCFGenKbGelCallObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSeqInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallBySeqIdx( Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCallInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByCallInstIdx( Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByPrevInstIdx( Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByNextInstIdx( Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId );
}
