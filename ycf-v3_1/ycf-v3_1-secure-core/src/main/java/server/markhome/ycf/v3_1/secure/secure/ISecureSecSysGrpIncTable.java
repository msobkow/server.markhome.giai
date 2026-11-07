
// Description: Java 25 DbIO interface for SecSysGrpInc.

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
 *	SecureSecSysGrpIncTable database interface for SecSysGrpInc has CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 */
public interface ISecureSecSysGrpIncTable
{
	public static final String TABLE_NAME = "SecSysGrpInc";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	ISecureSecSysGrpInc createSecSysGrpInc( ISecureAuthorization Authorization,
		ISecureSecSysGrpInc rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	ISecureSecSysGrpInc updateSecSysGrpInc( ISecureAuthorization Authorization,
		ISecureSecSysGrpInc rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteSecSysGrpInc( ISecureAuthorization Authorization,
		ISecureSecSysGrpInc rec );
	/**
	 *	Delete the SecSysGrpInc instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpIncByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId,
		String argInclName );
	/**
	 *	Delete the SecSysGrpInc instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecSysGrpIncByIdIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey argKey );
	/**
	 *	Delete the SecSysGrpInc instances identified by the key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpIncBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecSysGrpId );

	/**
	 *	Delete the SecSysGrpInc instances identified by the key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSysGrpIncBySysGrpIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncBySysGrpIdxKey argKey );
	/**
	 *	Delete the SecSysGrpInc instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpIncByNameIdx( ISecureAuthorization Authorization,
		String argInclName );

	/**
	 *	Delete the SecSysGrpInc instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSysGrpIncByNameIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncByNameIdxKey argKey );


	/**
	 *	Read the derived SecSysGrpInc record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrpInc readDerived( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey PKey );

	/**
	 *	Read the derived SecSysGrpInc record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrpInc readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId,
		String InclName );

	/**
	 *	Lock the derived SecSysGrpInc record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrpInc lockDerived( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey PKey );

	/**
	 *	Read all SecSysGrpInc instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	ISecureSecSysGrpInc[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived SecSysGrpInc record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrpInc readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId,
		String InclName );

	/**
	 *	Read an array of the derived SecSysGrpInc record instances identified by the duplicate key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ISecureSecSysGrpInc[] readDerivedBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId );

	/**
	 *	Read an array of the derived SecSysGrpInc record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ISecureSecSysGrpInc[] readDerivedByNameIdx( ISecureAuthorization Authorization,
		String InclName );

	/**
	 *	Read the specific SecSysGrpInc record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpInc readRec( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey PKey );

	/**
	 *	Read the specific SecSysGrpInc record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpInc readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId,
		String InclName );

	/**
	 *	Lock the specific SecSysGrpInc record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrpInc instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpInc lockRec( ISecureAuthorization Authorization,
		ISecureSecSysGrpIncPKey PKey );

	/**
	 *	Read all the specific SecSysGrpInc record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSysGrpInc instances in the database accessible for the Authorization.
	 */
	ISecureSecSysGrpInc[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific SecSysGrpInc record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpInc readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId,
		String InclName );

	/**
	 *	Read an array of the specific SecSysGrpInc record instances identified by the duplicate key SysGrpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpInc[] readRecBySysGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId );

	/**
	 *	Read an array of the specific SecSysGrpInc record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	InclName	The SecSysGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrpInc[] readRecByNameIdx( ISecureAuthorization Authorization,
		String InclName );
}
