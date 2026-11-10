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

public interface IYCFSecSecUserTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecUser instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSecUserObj newInstance();

	/**
	 *	Instantiate a new SecUser edition of the specified SecUser instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSecUserEditObj newEditInstance( IYCFSecSecUserObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecUserObj realiseSecUser( IYCFSecSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecUserObj createSecUser( IYCFSecSecUserObj Obj );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecUserObj readSecUser( YCFSecSecUserPKey pkey );

	/**
	 *	Read a SecUser-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecUser-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecUserObj readSecUser( YCFSecSecUserPKey pkey,
		boolean forceRead );

	IYCFSecSecUserObj readCachedSecUser( YCFSecSecUserPKey pkey );

	public void reallyDeepDisposeSecUser( IYCFSecSecUserObj obj );

	void deepDisposeSecUser( YCFSecSecUserPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecUserObj lockSecUser( YCFSecSecUserPKey pkey );

	/**
	 *	Return a sorted list of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecUserObj> readAllSecUser();

	/**
	 *	Return a sorted map of all the SecUser-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecUserObj> readAllSecUser( boolean forceRead );

	List<IYCFSecSecUserObj> readCachedAllSecUser();

	/**
	 *	Return a sorted map of a page of the SecUser-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecUserObj> pageAllSecUser(UUID priorSecUserId );

	/**
	 *	Get the YCFSecSecUserObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecUserObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecUserObj readSecUserByIdIdx( UUID SecUserId );

	/**
	 *	Get the YCFSecSecUserObj instance for the primary key attributes.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecUserObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecUserObj readSecUserByIdIdx( UUID SecUserId,
		boolean forceRead );

	/**
	 *	Get the YCFSecSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecUserObj cached instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecUserObj readSecUserByULoginIdx(String LoginId );

	/**
	 *	Get the YCFSecSecUserObj instance for the unique ULoginIdx key.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecUserObj refreshed instance for the unique ULoginIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecUserObj readSecUserByULoginIdx(String LoginId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecUserObj instances sorted by their primary keys for the duplicate EMConfIdx key.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecUserObj cached instances sorted by their primary keys for the duplicate EMConfIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid );

	/**
	 *	Get the map of YCFSecSecUserObj instances sorted by their primary keys for the duplicate EMConfIdx key.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecUserObj cached instances sorted by their primary keys for the duplicate EMConfIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecUserObj instances sorted by their primary keys for the duplicate PwdResetIdx key.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecUserObj cached instances sorted by their primary keys for the duplicate PwdResetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid );

	/**
	 *	Get the map of YCFSecSecUserObj instances sorted by their primary keys for the duplicate PwdResetIdx key.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecUserObj cached instances sorted by their primary keys for the duplicate PwdResetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecUserObj instances sorted by their primary keys for the duplicate DefDevIdx key.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecUserObj cached instances sorted by their primary keys for the duplicate DefDevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName );

	/**
	 *	Get the map of YCFSecSecUserObj instances sorted by their primary keys for the duplicate DefDevIdx key.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecUserObj cached instances sorted by their primary keys for the duplicate DefDevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		boolean forceRead );

	IYCFSecSecUserObj readCachedSecUserByIdIdx( UUID SecUserId );

	IYCFSecSecUserObj readCachedSecUserByULoginIdx( String LoginId );

	List<IYCFSecSecUserObj> readCachedSecUserByEMConfIdx( UUID EMailConfirmUuid );

	List<IYCFSecSecUserObj> readCachedSecUserByPwdResetIdx( UUID PasswordResetUuid );

	List<IYCFSecSecUserObj> readCachedSecUserByDefDevIdx( UUID DfltDevUserId,
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
	List<IYCFSecSecUserObj> pageSecUserByEMConfIdx( UUID EMailConfirmUuid,
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
	List<IYCFSecSecUserObj> pageSecUserByPwdResetIdx( UUID PasswordResetUuid,
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
	List<IYCFSecSecUserObj> pageSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecUserObj updateSecUser( IYCFSecSecUserObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecUser( IYCFSecSecUserObj Obj );

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

	IYCFSecSecUserObj getSystemUser();
}
