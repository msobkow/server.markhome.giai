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

public interface IYCFGenKbSecUserTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecUser instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSecUserObj newInstance();

	/**
	 *	Instantiate a new SecUser edition of the specified SecUser instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSecUserEditObj newEditInstance( IYCFGenKbSecUserObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecUserObj realiseSecUser( IYCFGenKbSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecUserObj createSecUser( IYCFGenKbSecUserObj Obj );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecUserObj readSecUser( YCFGenKbSecUserPKey pkey );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecUserObj readSecUser( YCFGenKbSecUserPKey pkey,
		boolean forceRead );

	IYCFGenKbSecUserObj readCachedSecUser( YCFGenKbSecUserPKey pkey );

	public void reallyDeepDisposeSecUser( IYCFGenKbSecUserObj obj );

	void deepDisposeSecUser( YCFGenKbSecUserPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecUserObj lockSecUser( YCFGenKbSecUserPKey pkey );

	/**
	 *	Return a sorted list of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecUserObj> readAllSecUser();

	/**
	 *	Return a sorted map of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecUserObj> readAllSecUser( boolean forceRead );

	List<IYCFGenKbSecUserObj> readCachedAllSecUser();

	/**
	 *	Return a sorted map of a page of the SecUser-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecUserObj> pageAllSecUser(UUID priorSecUserId );

	/**
	 *	Get the YCFGenKbSecUserObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecUserObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecUserObj readSecUserByIdIdx( UUID SecUserId );

	/**
	 *	Get the YCFGenKbSecUserObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecUserObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecUserObj readSecUserByIdIdx( UUID SecUserId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecUserObj cached instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecUserObj readSecUserByULoginIdx(String LoginId );

	/**
	 *	Get the YCFGenKbSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecUserObj refreshed instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecUserObj readSecUserByULoginIdx(String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecUserObj instances sorted by their primary keys for the duplicate EMConfIdx key.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate EMConfIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid );

	/**
	 *	Get the map of YCFGenKbSecUserObj instances sorted by their primary keys for the duplicate EMConfIdx key.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate EMConfIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecUserObj instances sorted by their primary keys for the duplicate PwdResetIdx key.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate PwdResetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid );

	/**
	 *	Get the map of YCFGenKbSecUserObj instances sorted by their primary keys for the duplicate PwdResetIdx key.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate PwdResetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecUserObj instances sorted by their primary keys for the duplicate DefDevIdx key.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate DefDevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName );

	/**
	 *	Get the map of YCFGenKbSecUserObj instances sorted by their primary keys for the duplicate DefDevIdx key.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecUserObj cached instances sorted by their primary keys for the duplicate DefDevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		boolean forceRead );

	IYCFGenKbSecUserObj readCachedSecUserByIdIdx( UUID SecUserId );

	IYCFGenKbSecUserObj readCachedSecUserByULoginIdx( String LoginId );

	List<IYCFGenKbSecUserObj> readCachedSecUserByEMConfIdx( UUID EMailConfirmUuid );

	List<IYCFGenKbSecUserObj> readCachedSecUserByPwdResetIdx( UUID PasswordResetUuid );

	List<IYCFGenKbSecUserObj> readCachedSecUserByDefDevIdx( UUID DfltDevUserId,
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
	List<IYCFGenKbSecUserObj> pageSecUserByEMConfIdx( UUID EMailConfirmUuid,
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
	List<IYCFGenKbSecUserObj> pageSecUserByPwdResetIdx( UUID PasswordResetUuid,
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
	List<IYCFGenKbSecUserObj> pageSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecUserObj updateSecUser( IYCFGenKbSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUser( IYCFGenKbSecUserObj Obj );

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

	IYCFGenKbSecUserObj getSystemUser();
}
