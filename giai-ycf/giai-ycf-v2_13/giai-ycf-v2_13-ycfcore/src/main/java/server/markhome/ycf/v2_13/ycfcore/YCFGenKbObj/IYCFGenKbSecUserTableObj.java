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

public interface ICFGenKbSecUserTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecUser instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbSecUserObj newInstance();

	/**
	 *	Instantiate a new SecUser edition of the specified SecUser instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbSecUserEditObj newEditInstance( ICFGenKbSecUserObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecUserObj realiseSecUser( ICFGenKbSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecUserObj createSecUser( ICFGenKbSecUserObj Obj );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbSecUserObj readSecUser( CFGenKbSecUserPKey pkey );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbSecUserObj readSecUser( CFGenKbSecUserPKey pkey,
		boolean forceRead );

	ICFGenKbSecUserObj readCachedSecUser( CFGenKbSecUserPKey pkey );

	public void reallyDeepDisposeSecUser( ICFGenKbSecUserObj obj );

	void deepDisposeSecUser( CFGenKbSecUserPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecUserObj lockSecUser( CFGenKbSecUserPKey pkey );

	/**
	 *	Return a sorted list of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecUserObj> readAllSecUser();

	/**
	 *	Return a sorted map of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecUserObj> readAllSecUser( boolean forceRead );

	List<ICFGenKbSecUserObj> readCachedAllSecUser();

	/**
	 *	Return a sorted map of a page of the SecUser-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecUserObj> pageAllSecUser(UUID priorSecUserId );

	/**
	 *	Get the CFGenKbSecUserObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecUserObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecUserObj readSecUserByIdIdx( UUID SecUserId );

	/**
	 *	Get the CFGenKbSecUserObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecUserObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecUserObj readSecUserByIdIdx( UUID SecUserId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecUserObj cached instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecUserObj readSecUserByULoginIdx(String LoginId );

	/**
	 *	Get the CFGenKbSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecUserObj refreshed instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecUserObj readSecUserByULoginIdx(String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecUserObj instances sorted by their primary keys for the duplicate EMConfIdx key.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate EMConfIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid );

	/**
	 *	Get the map of CFGenKbSecUserObj instances sorted by their primary keys for the duplicate EMConfIdx key.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate EMConfIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecUserObj instances sorted by their primary keys for the duplicate PwdResetIdx key.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate PwdResetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid );

	/**
	 *	Get the map of CFGenKbSecUserObj instances sorted by their primary keys for the duplicate PwdResetIdx key.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate PwdResetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecUserObj instances sorted by their primary keys for the duplicate DefDevIdx key.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate DefDevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName );

	/**
	 *	Get the map of CFGenKbSecUserObj instances sorted by their primary keys for the duplicate DefDevIdx key.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate DefDevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		boolean forceRead );

	ICFGenKbSecUserObj readCachedSecUserByIdIdx( UUID SecUserId );

	ICFGenKbSecUserObj readCachedSecUserByULoginIdx( String LoginId );

	List<ICFGenKbSecUserObj> readCachedSecUserByEMConfIdx( UUID EMailConfirmUuid );

	List<ICFGenKbSecUserObj> readCachedSecUserByPwdResetIdx( UUID PasswordResetUuid );

	List<ICFGenKbSecUserObj> readCachedSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName );

	void deepDisposeSecUserByIdIdx( UUID SecUserId );

	void deepDisposeSecUserByULoginIdx( String LoginId );

	void deepDisposeSecUserByEMConfIdx( UUID EMailConfirmUuid );

	void deepDisposeSecUserByPwdResetIdx( UUID PasswordResetUuid );

	void deepDisposeSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName );

	/**
	 *	Read a page of data as a List of SecUser-derived instances sorted by their primary keys,
	 *	as identified by the duplicate EMConfIdx key attributes.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecUser-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFGenKbSecUserObj> pageSecUserByEMConfIdx( UUID EMailConfirmUuid,
		UUID priorSecUserId );

	/**
	 *	Read a page of data as a List of SecUser-derived instances sorted by their primary keys,
	 *	as identified by the duplicate PwdResetIdx key attributes.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecUser-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFGenKbSecUserObj> pageSecUserByPwdResetIdx( UUID PasswordResetUuid,
		UUID priorSecUserId );

	/**
	 *	Read a page of data as a List of SecUser-derived instances sorted by their primary keys,
	 *	as identified by the duplicate DefDevIdx key attributes.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecUser-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFGenKbSecUserObj> pageSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecUserObj updateSecUser( ICFGenKbSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUser( ICFGenKbSecUserObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByIdIdx( UUID SecUserId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByULoginIdx(String LoginId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByEMConfIdx( UUID EMailConfirmUuid );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByPwdResetIdx( UUID PasswordResetUuid );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName );

	ICFGenKbSecUserObj getSystemUser();
}
