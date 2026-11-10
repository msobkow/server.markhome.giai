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

public interface IYCFSecSecDeviceTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecDevice instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSecDeviceObj newInstance();

	/**
	 *	Instantiate a new SecDevice edition of the specified SecDevice instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSecDeviceEditObj newEditInstance( IYCFSecSecDeviceObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecDeviceObj realiseSecDevice( IYCFSecSecDeviceObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecDeviceObj createSecDevice( IYCFSecSecDeviceObj Obj );

	/**
	 *	Read a SecDevice-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecDevice-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecDeviceObj readSecDevice( YCFSecSecDevicePKey pkey );

	/**
	 *	Read a SecDevice-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecDevice-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecDeviceObj readSecDevice( YCFSecSecDevicePKey pkey,
		boolean forceRead );

	IYCFSecSecDeviceObj readCachedSecDevice( YCFSecSecDevicePKey pkey );

	public void reallyDeepDisposeSecDevice( IYCFSecSecDeviceObj obj );

	void deepDisposeSecDevice( YCFSecSecDevicePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecDeviceObj lockSecDevice( YCFSecSecDevicePKey pkey );

	/**
	 *	Return a sorted list of all the SecDevice-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecDeviceObj> readAllSecDevice();

	/**
	 *	Return a sorted map of all the SecDevice-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecDeviceObj> readAllSecDevice( boolean forceRead );

	List<IYCFSecSecDeviceObj> readCachedAllSecDevice();

	/**
	 *	Return a sorted map of a page of the SecDevice-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecDeviceObj> pageAllSecDevice(UUID priorSecUserId,
		String priorDevName );

	/**
	 *	Get the YCFSecSecDeviceObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecDeviceObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName );

	/**
	 *	Get the YCFSecSecDeviceObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecDeviceObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName,
		boolean forceRead );

	/**
	 *	Get the YCFSecSecDeviceObj instance for the unique NameIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecDeviceObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecDeviceObj readSecDeviceByNameIdx(UUID SecUserId,
		String DevName );

	/**
	 *	Get the YCFSecSecDeviceObj instance for the unique NameIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecDeviceObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecDeviceObj readSecDeviceByNameIdx(UUID SecUserId,
		String DevName,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecDeviceObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecDeviceObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId );

	/**
	 *	Get the map of YCFSecSecDeviceObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecDeviceObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId,
		boolean forceRead );

	IYCFSecSecDeviceObj readCachedSecDeviceByIdIdx( UUID SecUserId,
		String DevName );

	IYCFSecSecDeviceObj readCachedSecDeviceByNameIdx( UUID SecUserId,
		String DevName );

	List<IYCFSecSecDeviceObj> readCachedSecDeviceByUserIdx( UUID SecUserId );

	void deepDisposeSecDeviceByIdIdx( UUID SecUserId,
		String DevName );

	void deepDisposeSecDeviceByNameIdx( UUID SecUserId,
		String DevName );

	void deepDisposeSecDeviceByUserIdx( UUID SecUserId );

	/**
	 *	Read a page of data as a List of SecDevice-derived instances sorted by their primary keys,
	 *	as identified by the duplicate UserIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecDevice-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecDeviceObj> pageSecDeviceByUserIdx( UUID SecUserId,
		UUID priorSecUserId,
		String priorDevName );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecDeviceObj updateSecDevice( IYCFSecSecDeviceObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecDevice( IYCFSecSecDeviceObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 */
	void deleteSecDeviceByIdIdx( UUID SecUserId,
		String DevName );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 */
	void deleteSecDeviceByNameIdx(UUID SecUserId,
		String DevName );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 */
	void deleteSecDeviceByUserIdx( UUID SecUserId );
}
