
// Description: Java 25 public DbIO interface for ISOCcy.

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
 *	SecurePubISOCcyTable public database interface for ISOCcy has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecurePubISOCcyTable
{
	public static final String TABLE_NAME = "ISOCcy";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ISecurePubISOCcy pubcreateISOCcy( ISecurePubAuthorization Authorization,
		ISecurePubISOCcy rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ISecurePubISOCcy pubupdateISOCcy( ISecurePubAuthorization Authorization,
		ISecurePubISOCcy rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void pubdeleteISOCcy( ISecurePubAuthorization Authorization,
		ISecurePubISOCcy rec );
	/**
	 *	Delete the ISOCcy instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void pubdeleteISOCcyByIdIdx( ISecurePubAuthorization Authorization,
		Short argKey );
	/**
	 *	Delete the ISOCcy instances identified by the key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 */
	public void pubdeleteISOCcyByCcyCdIdx( ISecurePubAuthorization Authorization,
		String argISOCode );

	/**
	 *	Delete the ISOCcy instances identified by the key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteISOCcyByCcyCdIdx( ISecurePubAuthorization Authorization,
		ISecurePubISOCcyByCcyCdIdxKey argKey );
	/**
	 *	Delete the ISOCcy instances identified by the key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 */
	public void pubdeleteISOCcyByCcyNmIdx( ISecurePubAuthorization Authorization,
		String argName );

	/**
	 *	Delete the ISOCcy instances identified by the key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteISOCcyByCcyNmIdx( ISecurePubAuthorization Authorization,
		ISecurePubISOCcyByCcyNmIdxKey argKey );


	/**
	 *	Read the derived ISOCcy record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCcy pubreadDerived( ISecurePubAuthorization Authorization,
		Short PKey );

	/**
	 *	Lock the derived ISOCcy record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCcy publockDerived( ISecurePubAuthorization Authorization,
		Short PKey );

	/**
	 *	Read all ISOCcy instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ISecurePubISOCcy[] pubreadPubAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived ISOCcy record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCcy pubreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		short ISOCcyId );

	/**
	 *	Read the derived ISOCcy record instance identified by the unique key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCcy pubreadDerivedByCcyCdIdx( ISecurePubAuthorization Authorization,
		String ISOCode );

	/**
	 *	Read the derived ISOCcy record instance identified by the unique key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCcy pubreadDerivedByCcyNmIdx( ISecurePubAuthorization Authorization,
		String Name );

	/**
	 *	Read the specific ISOCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCcy pubreadRec( ISecurePubAuthorization Authorization,
		Short PKey );

	/**
	 *	Lock the specific ISOCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCcy publockRec( ISecurePubAuthorization Authorization,
		Short PKey );

	/**
	 *	Read all the specific ISOCcy record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCcy instances in the database accessible for the Authorization.
	 */
	public ISecurePubISOCcy[] pubreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific ISOCcy record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCcy pubreadRecByIdIdx( ISecurePubAuthorization Authorization,
		short ISOCcyId );

	/**
	 *	Read the specific ISOCcy record instance identified by the unique key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCcy pubreadRecByCcyCdIdx( ISecurePubAuthorization Authorization,
		String ISOCode );

	/**
	 *	Read the specific ISOCcy record instance identified by the unique key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCcy pubreadRecByCcyNmIdx( ISecurePubAuthorization Authorization,
		String Name );
}
