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

public interface IYCFGenKbTSecGrpIncTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TSecGrpInc instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbTSecGrpIncObj newInstance();

	/**
	 *	Instantiate a new TSecGrpInc edition of the specified TSecGrpInc instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbTSecGrpIncEditObj newEditInstance( IYCFGenKbTSecGrpIncObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGrpIncObj realiseTSecGrpInc( IYCFGenKbTSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGrpIncObj createTSecGrpInc( IYCFGenKbTSecGrpIncObj Obj );

	/**
	 *	Read a TSecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbTSecGrpIncObj readTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey );

	/**
	 *	Read a TSecGrpInc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGrpInc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbTSecGrpIncObj readTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey,
		boolean forceRead );

	IYCFGenKbTSecGrpIncObj readCachedTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey );

	public void reallyDeepDisposeTSecGrpInc( IYCFGenKbTSecGrpIncObj obj );

	void deepDisposeTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGrpIncObj lockTSecGrpInc( YCFGenKbTSecGrpIncPKey pkey );

	/**
	 *	Return a sorted list of all the TSecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> readAllTSecGrpInc();

	/**
	 *	Return a sorted map of all the TSecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> readAllTSecGrpInc( boolean forceRead );

	List<IYCFGenKbTSecGrpIncObj> readCachedAllTSecGrpInc();

	/**
	 *	Return a sorted map of a page of the TSecGrpInc-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> pageAllTSecGrpInc(Long priorTenantId,
		Long priorTSecGrpIncId );

	/**
	 *	Get the YCFGenKbTSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpIncId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGrpIncObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId );

	/**
	 *	Get the YCFGenKbTSecGrpIncObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpIncId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGrpIncObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbTSecGrpIncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpIncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbTSecGrpIncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpIncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbTSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Get the map of YCFGenKbTSecGrpIncObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpIncObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbTSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId );

	/**
	 *	Get the map of YCFGenKbTSecGrpIncObj instances sorted by their primary keys for the duplicate IncludeIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGrpIncObj cached instances sorted by their primary keys for the duplicate IncludeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbTSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGrpIncObj cached instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGrpIncObj readTSecGrpIncByUIncludeIdx(long TenantId,
		int TSecGroupId,
		int IncludeGroupId );

	/**
	 *	Get the YCFGenKbTSecGrpIncObj instance for the unique UIncludeIdx key.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGrpIncObj refreshed instance for the unique UIncludeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGrpIncObj readTSecGrpIncByUIncludeIdx(long TenantId,
		int TSecGroupId,
		int IncludeGroupId,
		boolean forceRead );

	IYCFGenKbTSecGrpIncObj readCachedTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId );

	List<IYCFGenKbTSecGrpIncObj> readCachedTSecGrpIncByTenantIdx( long TenantId );

	List<IYCFGenKbTSecGrpIncObj> readCachedTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId );

	List<IYCFGenKbTSecGrpIncObj> readCachedTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId );

	IYCFGenKbTSecGrpIncObj readCachedTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId );

	void deepDisposeTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId );

	void deepDisposeTSecGrpIncByTenantIdx( long TenantId );

	void deepDisposeTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId );

	void deepDisposeTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId );

	void deepDisposeTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId );

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate TenantIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> pageTSecGrpIncByTenantIdx( long TenantId,
		Long priorTenantId,
		Long priorTSecGrpIncId );

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> pageTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId );

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate IncludeIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFGenKbTSecGrpIncObj> pageTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGrpIncObj updateTSecGrpInc( IYCFGenKbTSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTSecGrpInc( IYCFGenKbTSecGrpIncObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGrpIncId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 */
	void deleteTSecGrpIncByUIncludeIdx(long TenantId,
		int TSecGroupId,
		int IncludeGroupId );
}
