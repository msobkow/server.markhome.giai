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

public interface IYCFGenKbSecDeviceTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecDevice instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSecDeviceObj newInstance();

	/**
	 *	Instantiate a new SecDevice edition of the specified SecDevice instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSecDeviceEditObj newEditInstance( IYCFGenKbSecDeviceObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecDeviceObj realiseSecDevice( IYCFGenKbSecDeviceObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecDeviceObj createSecDevice( IYCFGenKbSecDeviceObj Obj );

	/**
	 *	Read a SecDevice-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecDevice-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecDeviceObj readSecDevice( YCFGenKbSecDevicePKey pkey );

	/**
	 *	Read a SecDevice-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecDevice-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecDeviceObj readSecDevice( YCFGenKbSecDevicePKey pkey,
		boolean forceRead );

	IYCFGenKbSecDeviceObj readCachedSecDevice( YCFGenKbSecDevicePKey pkey );

	public void reallyDeepDisposeSecDevice( IYCFGenKbSecDeviceObj obj );

	void deepDisposeSecDevice( YCFGenKbSecDevicePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecDeviceObj lockSecDevice( YCFGenKbSecDevicePKey pkey );

	/**
	 *	Return a sorted list of all the SecDevice-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecDeviceObj> readAllSecDevice();

	/**
	 *	Return a sorted map of all the SecDevice-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecDeviceObj> readAllSecDevice( boolean forceRead );

	List<IYCFGenKbSecDeviceObj> readCachedAllSecDevice();

	/**
	 *	Return a sorted map of a page of the SecDevice-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecDeviceObj> pageAllSecDevice(UUID priorSecUserId,
		String priorDevName );

	/**
	 *	Get the YCFGenKbSecDeviceObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecDeviceObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName );

	/**
	 *	Get the YCFGenKbSecDeviceObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecDeviceObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbSecDeviceObj instance for the unique NameIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecDeviceObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecDeviceObj readSecDeviceByNameIdx(UUID SecUserId,
		String DevName );

	/**
	 *	Get the YCFGenKbSecDeviceObj instance for the unique NameIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecDeviceObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecDeviceObj readSecDeviceByNameIdx(UUID SecUserId,
		String DevName,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecDeviceObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecDeviceObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId );

	/**
	 *	Get the map of YCFGenKbSecDeviceObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecDeviceObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId,
		boolean forceRead );

	IYCFGenKbSecDeviceObj readCachedSecDeviceByIdIdx( UUID SecUserId,
		String DevName );

	IYCFGenKbSecDeviceObj readCachedSecDeviceByNameIdx( UUID SecUserId,
		String DevName );

	List<IYCFGenKbSecDeviceObj> readCachedSecDeviceByUserIdx( UUID SecUserId );

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
	List<IYCFGenKbSecDeviceObj> pageSecDeviceByUserIdx( UUID SecUserId,
		UUID priorSecUserId,
		String priorDevName );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecDeviceObj updateSecDevice( IYCFGenKbSecDeviceObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecDevice( IYCFGenKbSecDeviceObj Obj );

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
