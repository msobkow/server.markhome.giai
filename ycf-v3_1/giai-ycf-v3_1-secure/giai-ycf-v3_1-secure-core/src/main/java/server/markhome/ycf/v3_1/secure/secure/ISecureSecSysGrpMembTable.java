
// Description: Java 25 DbIO interface for SecSysGrpMemb.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.secure.secure;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	SecureSecSysGrpMembTable database interface for SecSysGrpMemb has CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 */
public interface ISecureSecSysGrpMembTable
{
	public static final String TABLE_NAME = "SecSysGrpMemb";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	ISecureSecSysGrpMemb createSecSysGrpMemb( ISecureAuthorization Authorization,
		ISecureSecSysGrpMemb rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	ISecureSecSysGrpMemb updateSecSysGrpMemb( ISecureAuthorization Authorization,
		ISecureSecSysGrpMemb rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteSecSysGrpMemb( ISecureAuthorization Authorization,
		ISecureSecSysGrpMemb rec );
	/**
	 *	Delete the SecSysGrpMemb instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpMembByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argLoginId );
	/**
	 *	Delete the SecSysGrpMemb instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecSysGrpMembByIdIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey argKey );
	/**
	 *	Delete the SecSysGrpMemb instances identified by the key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpMembBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId );

	/**
	 *	Delete the SecSysGrpMemb instances identified by the key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSysGrpMembBySysGrpIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembBySysGrpIdxKey argKey );
	/**
	 *	Delete the SecSysGrpMemb instances identified by the key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpMembByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId );

	/**
	 *	Delete the SecSysGrpMemb instances identified by the key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSysGrpMembByLoginIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembByLoginIdxKey argKey );


	/**
	 *	Read the derived SecSysGrpMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrpMemb readDerived( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey PKey );

	/**
	 *	Read the derived SecSysGrpMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrpMemb readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId,
		String LoginId );

	/**
	 *	Lock the derived SecSysGrpMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrpMemb lockDerived( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey PKey );

	/**
	 *	Read all SecSysGrpMemb instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	ISecureSecSysGrpMemb[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived SecSysGrpMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrpMemb readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId,
		String LoginId );

	/**
	 *	Read an array of the derived SecSysGrpMemb record instances identified by the duplicate key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ISecureSecSysGrpMemb[] readDerivedBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId );

	/**
	 *	Read an array of the derived SecSysGrpMemb record instances identified by the duplicate key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ISecureSecSysGrpMemb[] readDerivedByLoginIdx( ISecureAuthorization Authorization,
		String LoginId );

	/**
	 *	Read the specific SecSysGrpMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpMemb readRec( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey PKey );

	/**
	 *	Read the specific SecSysGrpMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpMemb readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId,
		String LoginId );

	/**
	 *	Lock the specific SecSysGrpMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpMemb lockRec( ISecureAuthorization Authorization,
		ISecureSecSysGrpMembPKey PKey );

	/**
	 *	Read all the specific SecSysGrpMemb record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSysGrpMemb instances in the database accessible for the Authorization.
	 */
	ISecureSecSysGrpMemb[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific SecSysGrpMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpMemb readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId,
		String LoginId );

	/**
	 *	Read an array of the specific SecSysGrpMemb record instances identified by the duplicate key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpMemb[] readRecBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId );

	/**
	 *	Read an array of the specific SecSysGrpMemb record instances identified by the duplicate key LoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecSysGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpMemb[] readRecByLoginIdx( ISecureAuthorization Authorization,
		String LoginId );
}
