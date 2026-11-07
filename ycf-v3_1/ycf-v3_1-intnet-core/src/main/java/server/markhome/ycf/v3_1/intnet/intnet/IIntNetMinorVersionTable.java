
// Description: Java 25 DbIO interface for MinorVersion.

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

package server.markhome.ycf.v3_1.intnet.intnet;

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

import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

/*
 *	IntNetMinorVersionTable database interface for MinorVersion has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IIntNetMinorVersionTable
{
	public static final String TABLE_NAME = "MinorVersion";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	IIntNetMinorVersion createMinorVersion( ISecureAuthorization Authorization,
		IIntNetMinorVersion rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	IIntNetMinorVersion updateMinorVersion( ISecureAuthorization Authorization,
		IIntNetMinorVersion rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteMinorVersion( ISecureAuthorization Authorization,
		IIntNetMinorVersion rec );
	/**
	 *	Delete the MinorVersion instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteMinorVersionByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the MinorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId );

	/**
	 *	Delete the MinorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMinorVersionByTenantIdx( ISecureAuthorization Authorization,
		IIntNetMinorVersionByTenantIdxKey argKey );
	/**
	 *	Delete the MinorVersion instances identified by the key MajorVerIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByMajorVerIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argMajorVersionId );

	/**
	 *	Delete the MinorVersion instances identified by the key MajorVerIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMinorVersionByMajorVerIdx( ISecureAuthorization Authorization,
		IIntNetMinorVersionByMajorVerIdxKey argKey );
	/**
	 *	Delete the MinorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argMajorVersionId,
		String argName );

	/**
	 *	Delete the MinorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMinorVersionByNameIdx( ISecureAuthorization Authorization,
		IIntNetMinorVersionByNameIdxKey argKey );


	/**
	 *	Read the derived MinorVersion record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MinorVersion instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IIntNetMinorVersion readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived MinorVersion record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MinorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IIntNetMinorVersion lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all MinorVersion instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	IIntNetMinorVersion[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived MinorVersion record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IIntNetMinorVersion readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read an array of the derived MinorVersion record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IIntNetMinorVersion[] readDerivedByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the derived MinorVersion record instances identified by the duplicate key MajorVerIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IIntNetMinorVersion[] readDerivedByMajorVerIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 MajorVersionId );

	/**
	 *	Read the derived MinorVersion record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IIntNetMinorVersion readDerivedByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 MajorVersionId,
		String Name );

	/**
	 *	Read the specific MinorVersion record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MinorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetMinorVersion readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific MinorVersion record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MinorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetMinorVersion lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific MinorVersion record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific MinorVersion instances in the database accessible for the Authorization.
	 */
	IIntNetMinorVersion[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific MinorVersion record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetMinorVersion readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read an array of the specific MinorVersion record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetMinorVersion[] readRecByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the specific MinorVersion record instances identified by the duplicate key MajorVerIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetMinorVersion[] readRecByMajorVerIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 MajorVersionId );

	/**
	 *	Read the specific MinorVersion record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetMinorVersion readRecByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 MajorVersionId,
		String Name );
}
