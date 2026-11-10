// Description: Java 11 Table Object interface for YCFSec.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public interface IYCFSecISOTZoneTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ISOTZone instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecISOTZoneObj newInstance();

	/**
	 *	Instantiate a new ISOTZone edition of the specified ISOTZone instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecISOTZoneEditObj newEditInstance( IYCFSecISOTZoneObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOTZoneObj realiseISOTZone( IYCFSecISOTZoneObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOTZoneObj createISOTZone( IYCFSecISOTZoneObj Obj );

	/**
	 *	Read a ISOTZone-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOTZone-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOTZoneObj readISOTZone( YCFSecISOTZonePKey pkey );

	/**
	 *	Read a ISOTZone-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOTZone-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOTZoneObj readISOTZone( YCFSecISOTZonePKey pkey,
		boolean forceRead );

	IYCFSecISOTZoneObj readCachedISOTZone( YCFSecISOTZonePKey pkey );

	public void reallyDeepDisposeISOTZone( IYCFSecISOTZoneObj obj );

	void deepDisposeISOTZone( YCFSecISOTZonePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOTZoneObj lockISOTZone( YCFSecISOTZonePKey pkey );

	/**
	 *	Return a sorted list of all the ISOTZone-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOTZoneObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOTZoneObj> readAllISOTZone();

	/**
	 *	Return a sorted map of all the ISOTZone-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOTZoneObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOTZoneObj> readAllISOTZone( boolean forceRead );

	List<IYCFSecISOTZoneObj> readCachedAllISOTZone();

	/**
	 *	Get the YCFSecISOTZoneObj instance for the primary key attributes.
	 *
	 *	@param	argISOTZoneId	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOTZoneObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOTZoneObj readISOTZoneByIdIdx( short ISOTZoneId );

	/**
	 *	Get the YCFSecISOTZoneObj instance for the primary key attributes.
	 *
	 *	@param	argISOTZoneId	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOTZoneObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOTZoneObj readISOTZoneByIdIdx( short ISOTZoneId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecISOTZoneObj instances sorted by their primary keys for the duplicate OffsetIdx key.
	 *
	 *	@param	argTZHourOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@param	argTZMinOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOTZoneObj cached instances sorted by their primary keys for the duplicate OffsetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOTZoneObj> readISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset );

	/**
	 *	Get the map of YCFSecISOTZoneObj instances sorted by their primary keys for the duplicate OffsetIdx key.
	 *
	 *	@param	argTZHourOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@param	argTZMinOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOTZoneObj cached instances sorted by their primary keys for the duplicate OffsetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOTZoneObj> readISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset,
		boolean forceRead );

	/**
	 *	Get the YCFSecISOTZoneObj instance for the unique UTZNameIdx key.
	 *
	 *	@param	argTZName	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOTZoneObj cached instance for the unique UTZNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOTZoneObj readISOTZoneByUTZNameIdx(String TZName );

	/**
	 *	Get the YCFSecISOTZoneObj instance for the unique UTZNameIdx key.
	 *
	 *	@param	argTZName	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOTZoneObj refreshed instance for the unique UTZNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOTZoneObj readISOTZoneByUTZNameIdx(String TZName,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecISOTZoneObj instances sorted by their primary keys for the duplicate Iso8601Idx key.
	 *
	 *	@param	argIso8601	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOTZoneObj cached instances sorted by their primary keys for the duplicate Iso8601Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOTZoneObj> readISOTZoneByIso8601Idx( String Iso8601 );

	/**
	 *	Get the map of YCFSecISOTZoneObj instances sorted by their primary keys for the duplicate Iso8601Idx key.
	 *
	 *	@param	argIso8601	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOTZoneObj cached instances sorted by their primary keys for the duplicate Iso8601Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOTZoneObj> readISOTZoneByIso8601Idx( String Iso8601,
		boolean forceRead );

	IYCFSecISOTZoneObj readCachedISOTZoneByIdIdx( short ISOTZoneId );

	List<IYCFSecISOTZoneObj> readCachedISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset );

	IYCFSecISOTZoneObj readCachedISOTZoneByUTZNameIdx( String TZName );

	List<IYCFSecISOTZoneObj> readCachedISOTZoneByIso8601Idx( String Iso8601 );

	void deepDisposeISOTZoneByIdIdx( short ISOTZoneId );

	void deepDisposeISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset );

	void deepDisposeISOTZoneByUTZNameIdx( String TZName );

	void deepDisposeISOTZoneByIso8601Idx( String Iso8601 );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOTZoneObj updateISOTZone( IYCFSecISOTZoneObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOTZone( IYCFSecISOTZoneObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOTZoneId	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByIdIdx( short ISOTZoneId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTZHourOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@param	argTZMinOffset	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTZName	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByUTZNameIdx(String TZName );

	/**
	 *	Internal use only.
	 *
	 *	@param	argIso8601	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByIso8601Idx( String Iso8601 );
}
