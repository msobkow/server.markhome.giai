
// Description: Java 25 protlic DbIO interface for ISOCtryCcy.

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

package server.markhome.ycf.v3_1.secure.secureprot;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	SecureProtISOCtryCcyTable protlic database interface for ISOCtryCcy has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecureProtISOCtryCcyTable
extends ISecurePubISOCtryCcyTable
{
	public static final String TABLE_NAME = "ISOCtryCcy";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ISecureProtISOCtryCcy protcreateISOCtryCcy( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcy rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ISecureProtISOCtryCcy protcreateISOCtryCcy( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryCcy rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ISecureProtISOCtryCcy protupdateISOCtryCcy( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcy rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ISecureProtISOCtryCcy protupdateISOCtryCcy( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryCcy rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteISOCtryCcy( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcy rec );
	/**
	 *	Delete the ISOCtryCcy instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	public void protdeleteISOCtryCcyByIdIdx( ISecurePubAuthorization Authorization,
		short argISOCtryId,
		short argISOCcyId );
	/**
	 *	Delete the ISOCtryCcy instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteISOCtryCcyByIdIdx( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyPKey argKey );
	/**
	 *	Delete the ISOCtryCcy instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	public void protdeleteISOCtryCcyByCtryIdx( ISecurePubAuthorization Authorization,
		short argISOCtryId );

	/**
	 *	Delete the ISOCtryCcy instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteISOCtryCcyByCtryIdx( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyByCtryIdxKey argKey );
	/**
	 *	Delete the ISOCtryCcy instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteISOCtryCcyByCtryIdx( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryCcyByCtryIdxKey argKey );
	/**
	 *	Delete the ISOCtryCcy instances identified by the key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	public void protdeleteISOCtryCcyByCcyIdx( ISecurePubAuthorization Authorization,
		short argISOCcyId );

	/**
	 *	Delete the ISOCtryCcy instances identified by the key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteISOCtryCcyByCcyIdx( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyByCcyIdxKey argKey );
	/**
	 *	Delete the ISOCtryCcy instances identified by the key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteISOCtryCcyByCcyIdx( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryCcyByCcyIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteISOCtryCcy( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryCcy rec );


	/**
	 *	Read the derived ISOCtryCcy record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtISOCtryCcy protreadDerived( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyPKey PKey );
	/**
	 *	Read the derived ISOCtryCcy record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCtryCcy pubreadDerived( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyPKey PKey );

	/**
	 *	Read the derived ISOCtryCcy record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtISOCtryCcy protreadDerived( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryCcyPKey PKey );


	/**
	 *	Read the derived ISOCtryCcy record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtISOCtryCcy protreadDerived( ISecurePubAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Lock the derived ISOCtryCcy record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtISOCtryCcy protlockDerived( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyPKey PKey );
	/**
	 *	Lock the derived ISOCtryCcy record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubISOCtryCcy publockDerived( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyPKey PKey );

	/**
	 *	Lock the derived ISOCtryCcy record instance by public primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtISOCtryCcy protlockDerived( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryCcyPKey PKey );


	/**
	 *	Read all ISOCtryCcy instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ISecureProtISOCtryCcy[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived ISOCtryCcy record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtISOCtryCcy protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Read an array of the derived ISOCtryCcy record instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ISecureProtISOCtryCcy[] protreadDerivedByCtryIdx( ISecurePubAuthorization Authorization,
		short ISOCtryId );

	/**
	 *	Read an array of the derived ISOCtryCcy record instances identified by the duplicate key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ISecureProtISOCtryCcy[] protreadDerivedByCcyIdx( ISecurePubAuthorization Authorization,
		short ISOCcyId );

	/**
	 *	Read the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtISOCtryCcy protreadRec( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyPKey PKey );

	/**
	 *	Read the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtISOCtryCcy protreadRec( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryCcyPKey PKey );

	/**
	 *	Read the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCtryCcy pubreadRec( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyPKey PKey );

	/**
	 *	Read the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtISOCtryCcy protreadRec( ISecurePubAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Lock the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtISOCtryCcy protlockRec( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyPKey PKey );

	/**
	 *	Lock the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubISOCtryCcy publockRec( ISecurePubAuthorization Authorization,
		ISecureProtISOCtryCcyPKey PKey );

	/**
	 *	Lock the specific ISOCtryCcy record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtISOCtryCcy protlockRec( ISecurePubAuthorization Authorization,
		ISecurePubISOCtryCcyPKey PKey );

	/**
	 *	Read all the specific ISOCtryCcy record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCtryCcy instances in the database accessible for the Authorization.
	 */
	public ISecureProtISOCtryCcy[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific ISOCtryCcy record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtISOCtryCcy protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Read an array of the specific ISOCtryCcy record instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtISOCtryCcy[] protreadRecByCtryIdx( ISecurePubAuthorization Authorization,
		short ISOCtryId );

	/**
	 *	Read an array of the specific ISOCtryCcy record instances identified by the duplicate key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtISOCtryCcy[] protreadRecByCcyIdx( ISecurePubAuthorization Authorization,
		short ISOCcyId );
}
