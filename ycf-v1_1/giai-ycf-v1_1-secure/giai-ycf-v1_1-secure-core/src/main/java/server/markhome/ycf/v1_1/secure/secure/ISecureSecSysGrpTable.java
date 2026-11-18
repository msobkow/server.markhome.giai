
// Description: Java 25 DbIO interface for SecSysGrp.

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
 *	SecureSecSysGrpTable database interface for SecSysGrp has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecureSecSysGrpTable
{
	public static final String TABLE_NAME = "SecSysGrp";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	ISecureSecSysGrp createSecSysGrp( ISecureAuthorization Authorization,
		ISecureSecSysGrp rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	ISecureSecSysGrp updateSecSysGrp( ISecureAuthorization Authorization,
		ISecureSecSysGrp rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteSecSysGrp( ISecureAuthorization Authorization,
		ISecureSecSysGrp rec );
	/**
	 *	Delete the SecSysGrp instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecSysGrpByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the SecSysGrp instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpByUNameIdx( ISecureAuthorization Authorization,
		String argName );

	/**
	 *	Delete the SecSysGrp instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSysGrpByUNameIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpByUNameIdxKey argKey );
	/**
	 *	Delete the SecSysGrp instances identified by the key SecLevelIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 */
	void deleteSecSysGrpBySecLevelIdx( ISecureAuthorization Authorization,
		ISecurePubSchema.SecLevelEnum argSecLevel );

	/**
	 *	Delete the SecSysGrp instances identified by the key SecLevelIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSysGrpBySecLevelIdx( ISecureAuthorization Authorization,
		ISecureSecSysGrpBySecLevelIdxKey argKey );


	/**
	 *	Read the derived SecSysGrp record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrp instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrp readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived SecSysGrp record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrp instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrp lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all SecSysGrp instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	ISecureSecSysGrp[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived SecSysGrp record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrp readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId );

	/**
	 *	Read the derived SecSysGrp record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecSysGrp readDerivedByUNameIdx( ISecureAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the derived SecSysGrp record instances identified by the duplicate key SecLevelIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ISecureSecSysGrp[] readDerivedBySecLevelIdx( ISecureAuthorization Authorization,
		ISecurePubSchema.SecLevelEnum SecLevel );

	/**
	 *	Read the specific SecSysGrp record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrp instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrp readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific SecSysGrp record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysGrp instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrp lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific SecSysGrp record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSysGrp instances in the database accessible for the Authorization.
	 */
	ISecureSecSysGrp[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific SecSysGrp record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysGrpId	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrp readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecSysGrpId );

	/**
	 *	Read the specific SecSysGrp record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrp readRecByUNameIdx( ISecureAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the specific SecSysGrp record instances identified by the duplicate key SecLevelIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecLevel	The SecSysGrp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecSysGrp[] readRecBySecLevelIdx( ISecureAuthorization Authorization,
		ISecurePubSchema.SecLevelEnum SecLevel );
}
