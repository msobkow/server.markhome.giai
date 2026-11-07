
// Description: Java 25 protlic DbIO interface for URLProtocol.

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

package server.markhome.ycf.v3_1.intnet.intnetprot;

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
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

/*
 *	IntNetProtURLProtocolTable protlic database interface for URLProtocol has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IIntNetProtURLProtocolTable
extends IIntNetPubURLProtocolTable
{
	public static final String TABLE_NAME = "URLProtocol";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IIntNetProtURLProtocol protcreateURLProtocol( ISecurePubAuthorization Authorization,
		IIntNetProtURLProtocol rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IIntNetProtURLProtocol protcreateURLProtocol( ISecurePubAuthorization Authorization,
		IIntNetPubURLProtocol rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IIntNetProtURLProtocol protupdateURLProtocol( ISecurePubAuthorization Authorization,
		IIntNetProtURLProtocol rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IIntNetProtURLProtocol protupdateURLProtocol( ISecurePubAuthorization Authorization,
		IIntNetPubURLProtocol rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteURLProtocol( ISecurePubAuthorization Authorization,
		IIntNetProtURLProtocol rec );
	/**
	 *	Delete the URLProtocol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteURLProtocolByIdIdx( ISecurePubAuthorization Authorization,
		Integer argKey );
	/**
	 *	Delete the URLProtocol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 */
	public void protdeleteURLProtocolByUNameIdx( ISecurePubAuthorization Authorization,
		String argName );

	/**
	 *	Delete the URLProtocol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteURLProtocolByUNameIdx( ISecurePubAuthorization Authorization,
		IIntNetProtURLProtocolByUNameIdxKey argKey );
	/**
	 *	Delete the URLProtocol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteURLProtocolByUNameIdx( ISecurePubAuthorization Authorization,
		IIntNetPubURLProtocolByUNameIdxKey argKey );
	/**
	 *	Delete the URLProtocol instances identified by the key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 */
	public void protdeleteURLProtocolByIsSecureIdx( ISecurePubAuthorization Authorization,
		boolean argIsSecure );

	/**
	 *	Delete the URLProtocol instances identified by the key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteURLProtocolByIsSecureIdx( ISecurePubAuthorization Authorization,
		IIntNetProtURLProtocolByIsSecureIdxKey argKey );
	/**
	 *	Delete the URLProtocol instances identified by the key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteURLProtocolByIsSecureIdx( ISecurePubAuthorization Authorization,
		IIntNetPubURLProtocolByIsSecureIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteURLProtocol( ISecurePubAuthorization Authorization,
		IIntNetPubURLProtocol rec );


	/**
	 *	Read the derived URLProtocol record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetProtURLProtocol protreadDerived( ISecurePubAuthorization Authorization,
		Integer PKey );

	/**
	 *	Lock the derived URLProtocol record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetProtURLProtocol protlockDerived( ISecurePubAuthorization Authorization,
		Integer PKey );

	/**
	 *	Read all URLProtocol instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IIntNetProtURLProtocol[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived URLProtocol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetProtURLProtocol protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		int URLProtocolId );

	/**
	 *	Read the derived URLProtocol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetProtURLProtocol protreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the derived URLProtocol record instances identified by the duplicate key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IIntNetProtURLProtocol[] protreadDerivedByIsSecureIdx( ISecurePubAuthorization Authorization,
		boolean IsSecure );

	/**
	 *	Read the specific URLProtocol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtURLProtocol protreadRec( ISecurePubAuthorization Authorization,
		Integer PKey );

	/**
	 *	Lock the specific URLProtocol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtURLProtocol protlockRec( ISecurePubAuthorization Authorization,
		Integer PKey );

	/**
	 *	Read all the specific URLProtocol record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific URLProtocol instances in the database accessible for the Authorization.
	 */
	public IIntNetProtURLProtocol[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific URLProtocol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtURLProtocol protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		int URLProtocolId );

	/**
	 *	Read the specific URLProtocol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtURLProtocol protreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the specific URLProtocol record instances identified by the duplicate key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtURLProtocol[] protreadRecByIsSecureIdx( ISecurePubAuthorization Authorization,
		boolean IsSecure );
}
