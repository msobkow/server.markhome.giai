
// Description: Java 25 public DbIO interface for ISOCtry.

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

package server.markhome.ycf.v3_1.secure.securepub;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

/*
 *	SecurePubISOCtryTable public database interface for ISOCtry has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecurePubISOCtryTable
{
	public static final String TABLE_NAME = "ISOCtry";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ISecurePubISOCtry pubcreateISOCtry( ISecurePubAuthorization Authorization,
		ISecurePubISOCtry rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ISecurePubISOCtry pubupdateISOCtry( ISecurePubAuthorization Authorization,
		ISecurePubISOCtry rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void pubdeleteISOCtry( ISecurePubAuthorization Authorization,
		ISecurePubISOCtry rec );
	/**
	 *	Delete the ISOCtry instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void pubdeleteISOCtryByIdIdx( ISecurePubAuthorization Authorization,
		Short argKey );
	/**
	 *	Delete the ISOCtry instances identified by the key ISOCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCode	The ISOCtry key attribute of the instance generating the id.
	 */
	public void pubdeleteISOCtryByISOCodeIdx( ISecurePubAuthorization Authorization,
		String argISOCode );

	/**
	 *	Delete the ISOCtry instances identified by the key ISOCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteISOCtryByISOCodeIdx( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryByISOCodeIdxKey argKey );
	/**
	 *	Delete the ISOCtry instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The ISOCtry key attribute of the instance generating the id.
	 */
	public void pubdeleteISOCtryByNameIdx( ISecurePubAuthorization Authorization,
		String argName );

	/**
	 *	Delete the ISOCtry instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteISOCtryByNameIdx( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryByNameIdxKey argKey );


	/**
	 *	Read the derived ISOCtry record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtry instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCtry pubreadDerived( ISecurePubAuthorization Authorization,
		Short PKey );

	/**
	 *	Lock the derived ISOCtry record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtry instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCtry publockDerived( ISecurePubAuthorization Authorization,
		Short PKey );

	/**
	 *	Read all ISOCtry instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ISecurePubISOCtry[] pubreadPubAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived ISOCtry record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCtry pubreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		short ISOCtryId );

	/**
	 *	Read the derived ISOCtry record instance identified by the unique key ISOCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCode	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCtry pubreadDerivedByISOCodeIdx( ISecurePubAuthorization Authorization,
		String ISOCode );

	/**
	 *	Read the derived ISOCtry record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCtry pubreadDerivedByNameIdx( ISecurePubAuthorization Authorization,
		String Name );

	/**
	 *	Read the specific ISOCtry record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtry instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCtry pubreadRec( ISecurePubAuthorization Authorization,
		Short PKey );

	/**
	 *	Lock the specific ISOCtry record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtry instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCtry publockRec( ISecurePubAuthorization Authorization,
		Short PKey );

	/**
	 *	Read all the specific ISOCtry record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCtry instances in the database accessible for the Authorization.
	 */
	public ISecurePubISOCtry[] pubreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific ISOCtry record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCtry pubreadRecByIdIdx( ISecurePubAuthorization Authorization,
		short ISOCtryId );

	/**
	 *	Read the specific ISOCtry record instance identified by the unique key ISOCodeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCode	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCtry pubreadRecByISOCodeIdx( ISecurePubAuthorization Authorization,
		String ISOCode );

	/**
	 *	Read the specific ISOCtry record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCtry pubreadRecByNameIdx( ISecurePubAuthorization Authorization,
		String Name );
}
