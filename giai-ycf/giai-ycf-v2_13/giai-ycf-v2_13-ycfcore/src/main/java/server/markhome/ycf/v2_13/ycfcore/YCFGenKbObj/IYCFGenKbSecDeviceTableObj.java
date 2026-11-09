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

public interface ICFGenKbSecDeviceTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecDevice instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbSecDeviceObj newInstance();

	/**
	 *	Instantiate a new SecDevice edition of the specified SecDevice instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbSecDeviceEditObj newEditInstance( ICFGenKbSecDeviceObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecDeviceObj realiseSecDevice( ICFGenKbSecDeviceObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecDeviceObj createSecDevice( ICFGenKbSecDeviceObj Obj );

	/**
	 *	Read a SecDevice-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecDevice-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbSecDeviceObj readSecDevice( CFGenKbSecDevicePKey pkey );

	/**
	 *	Read a SecDevice-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecDevice-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbSecDeviceObj readSecDevice( CFGenKbSecDevicePKey pkey,
		boolean forceRead );

	ICFGenKbSecDeviceObj readCachedSecDevice( CFGenKbSecDevicePKey pkey );

	public void reallyDeepDisposeSecDevice( ICFGenKbSecDeviceObj obj );

	void deepDisposeSecDevice( CFGenKbSecDevicePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecDeviceObj lockSecDevice( CFGenKbSecDevicePKey pkey );

	/**
	 *	Return a sorted list of all the SecDevice-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecDeviceObj> readAllSecDevice();

	/**
	 *	Return a sorted map of all the SecDevice-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecDeviceObj> readAllSecDevice( boolean forceRead );

	List<ICFGenKbSecDeviceObj> readCachedAllSecDevice();

	/**
	 *	Return a sorted map of a page of the SecDevice-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecDeviceObj> pageAllSecDevice(UUID priorSecUserId,
		String priorDevName );

	/**
	 *	Get the CFGenKbSecDeviceObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecDeviceObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName );

	/**
	 *	Get the CFGenKbSecDeviceObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecDeviceObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName,
		boolean forceRead );

	/**
	 *	Get the CFGenKbSecDeviceObj instance for the unique NameIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecDeviceObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecDeviceObj readSecDeviceByNameIdx(UUID SecUserId,
		String DevName );

	/**
	 *	Get the CFGenKbSecDeviceObj instance for the unique NameIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecDeviceObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecDeviceObj readSecDeviceByNameIdx(UUID SecUserId,
		String DevName,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecDeviceObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecDeviceObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId );

	/**
	 *	Get the map of CFGenKbSecDeviceObj instances sorted by their primary keys for the duplicate UserIdx key.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecDeviceObj cached instances sorted by their primary keys for the duplicate UserIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId,
		boolean forceRead );

	ICFGenKbSecDeviceObj readCachedSecDeviceByIdIdx( UUID SecUserId,
		String DevName );

	ICFGenKbSecDeviceObj readCachedSecDeviceByNameIdx( UUID SecUserId,
		String DevName );

	List<ICFGenKbSecDeviceObj> readCachedSecDeviceByUserIdx( UUID SecUserId );

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
	List<ICFGenKbSecDeviceObj> pageSecDeviceByUserIdx( UUID SecUserId,
		UUID priorSecUserId,
		String priorDevName );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecDeviceObj updateSecDevice( ICFGenKbSecDeviceObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecDevice( ICFGenKbSecDeviceObj Obj );

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
