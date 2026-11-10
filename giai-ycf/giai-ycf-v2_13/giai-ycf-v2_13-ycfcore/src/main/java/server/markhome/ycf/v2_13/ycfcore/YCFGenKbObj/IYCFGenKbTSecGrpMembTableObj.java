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

public interface IYCFGenKbTSecGrpMembTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TSecGrpMemb instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbTSecGrpMembObj newInstance();

	/**
	 *	Instantiate a new TSecGrpMemb edition of the specified TSecGrpMemb instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbTSecGrpMembEditObj newEditInstance( IYCFGenKbTSecGrpMembObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGrpMembObj realiseTSecGrpMemb( IYCFGenKbTSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGrpMembObj createTSecGrpMemb( IYCFGenKbTSecGrpMembObj Obj );

	/**
	 *	Read a TSecGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbTSecGrpMembObj readTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey );

	/**
	 *	Read a TSecGrpMemb-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGrpMemb-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbTSecGrpMembObj readTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey,
		boolean forceRead );

	IYCFGenKbTSecGrpMembObj readCachedTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey );

	public void reallyDeepDisposeTSecGrpMemb( IYCFGenKbTSecGrpMembObj obj );

	void deepDisposeTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGrpMembObj lockTSecGrpMemb( YCFGenKbTSecGrpMembPKey pkey );

	/**
	 *	Return a sorted list of all the TSecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> readAllTSecGrpMemb();

	/**
	 *	Return a sorted map of all the TSecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> readAllTSecGrpMemb( boolean forceRead );

	List<IYCFGenKbTSecGrpMembObj> readCachedAllTSecGrpMemb();

	/**
	 *	Return a sorted map of a page of the TSecGrpMemb-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTSecGrpMembObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> pageAllTSecGrpMemb(Long priorTenantId,
		Long priorTSecGrpMembId );

	/**
	 *	Get the YCFGenKbTSecGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpMembId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGrpMembObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGrpMembObj readTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId );

	/**
	 *	Get the YCFGenKbTSecGrpMembObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpMembId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGrpMembObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGrpMembObj readTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbTSecGrpMembObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpMembObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbTSecGrpMembObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpMembObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbTSecGrpMembObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpMembObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Get the map of YCFGenKbTSecGrpMembObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpMembObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbTSecGrpMembObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpMembObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByUserIdx( UUID SecUserId );

	/**
	 *	Get the map of YCFGenKbTSecGrpMembObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpMembObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> readTSecGrpMembByUserIdx( UUID SecUserId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbTSecGrpMembObj instance for the unique UUserIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGrpMembObj cached instance for the unique UUserIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGrpMembObj readTSecGrpMembByUUserIdx(long TenantId,
		int TSecGroupId,
		UUID SecUserId );

	/**
	 *	Get the YCFGenKbTSecGrpMembObj instance for the unique UUserIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGrpMembObj refreshed instance for the unique UUserIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGrpMembObj readTSecGrpMembByUUserIdx(long TenantId,
		int TSecGroupId,
		UUID SecUserId,
		boolean forceRead );

	IYCFGenKbTSecGrpMembObj readCachedTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId );

	List<IYCFGenKbTSecGrpMembObj> readCachedTSecGrpMembByTenantIdx( long TenantId );

	List<IYCFGenKbTSecGrpMembObj> readCachedTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId );

	List<IYCFGenKbTSecGrpMembObj> readCachedTSecGrpMembByUserIdx( UUID SecUserId );

	IYCFGenKbTSecGrpMembObj readCachedTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId );

	void deepDisposeTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId );

	void deepDisposeTSecGrpMembByTenantIdx( long TenantId );

	void deepDisposeTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId );

	void deepDisposeTSecGrpMembByUserIdx( UUID SecUserId );

	void deepDisposeTSecGrpMembByUUserIdx( long TenantId,
		int TSecGroupId,
		UUID SecUserId );

	/**
	 *	Read a page of data as a List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate TenantIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> pageTSecGrpMembByTenantIdx( long TenantId,
		Long priorTenantId,
		Long priorTSecGrpMembId );

	/**
	 *	Read a page of data as a List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> pageTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpMembId );

	/**
	 *	Read a page of data as a List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *	as identified by the duplicate UserIdx key attributes.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpMemb-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpMembObj> pageTSecGrpMembByUserIdx( UUID SecUserId,
		Long priorTenantId,
		Long priorTSecGrpMembId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGrpMembObj updateTSecGrpMemb( IYCFGenKbTSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTSecGrpMemb( IYCFGenKbTSecGrpMembObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpMembId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByIdIdx( long TenantId,
		long TSecGrpMembId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByGroupIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByUserIdx( UUID SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteTSecGrpMembByUUserIdx(long TenantId,
		int TSecGroupId,
		UUID SecUserId );
}
