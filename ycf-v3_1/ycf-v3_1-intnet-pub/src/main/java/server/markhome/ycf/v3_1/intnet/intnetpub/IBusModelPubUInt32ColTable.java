
// Description: Java 25 public DbIO interface for UInt32Col.

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

package server.markhome.ycf.v3_1.intnet.intnetpub;

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
 *	BusModelPubUInt32ColTable public database interface for UInt32Col has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPubUInt32ColTable
{
	public static final String TABLE_NAME = "UInt32Col";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelPubUInt32Col pubcreateUInt32Col( ISecurePubAuthorization Authorization,
		IBusModelPubUInt32Col rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelPubUInt32Col pubupdateUInt32Col( ISecurePubAuthorization Authorization,
		IBusModelPubUInt32Col rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void pubdeleteUInt32Col( ISecurePubAuthorization Authorization,
		IBusModelPubUInt32Col rec );
	/**
	 *	Delete the UInt32Col instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The UInt32Col key attribute of the instance generating the id.
	 */
	public void pubdeleteUInt32ColByTableIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argTableId );

	/**
	 *	Delete the UInt32Col instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteUInt32ColByTableIdx( ISecurePubAuthorization Authorization,
		IBusModelPubUInt32ColByTableIdxKey argKey );
	/**
	 *	Delete the UInt32Col instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void pubdeleteUInt32ColByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argKey );
	/**
	 *	Delete the UInt32Col instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Col key attribute of the instance generating the id.
	 */
	public void pubdeleteUInt32ColByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the UInt32Col instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteUInt32ColByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the UInt32Col instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 */
	public void pubdeleteUInt32ColByScopeIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argScopeId );

	/**
	 *	Delete the UInt32Col instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteUInt32ColByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the UInt32Col instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 */
	public void pubdeleteUInt32ColByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the UInt32Col instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteUInt32ColByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the UInt32Col instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 */
	public void pubdeleteUInt32ColByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the UInt32Col instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteUInt32ColByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the UInt32Col instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 */
	public void pubdeleteUInt32ColByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the UInt32Col instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteUInt32ColByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByNextIdxKey argKey );
	/**
	 *	Delete the UInt32Col instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 */
	public void pubdeleteUInt32ColByContPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argScopeId,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the UInt32Col instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteUInt32ColByContPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the UInt32Col instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 */
	public void pubdeleteUInt32ColByContNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argScopeId,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the UInt32Col instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteUInt32ColByContNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContNextIdxKey argKey );


	/**
	 *	Read the derived UInt32Col record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the UInt32Col instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubUInt32Col pubreadDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the derived UInt32Col record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the UInt32Col instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubUInt32Col publockDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all UInt32Col instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelPubUInt32Col[] pubreadPubAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived UInt32Col record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubUInt32Col pubreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read the derived UInt32Col record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubUInt32Col pubreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived UInt32Col record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubUInt32Col[] pubreadDerivedByScopeIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived UInt32Col record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubUInt32Col[] pubreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived UInt32Col record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubUInt32Col[] pubreadDerivedByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived UInt32Col record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubUInt32Col[] pubreadDerivedByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived UInt32Col record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubUInt32Col[] pubreadDerivedByContPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived UInt32Col record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubUInt32Col[] pubreadDerivedByContNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived UInt32Col record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubUInt32Col[] pubreadDerivedByTableIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TableId );

	/**
	 *	Read the specific UInt32Col record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the UInt32Col instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col pubreadRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the specific UInt32Col record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the UInt32Col instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col publockRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all the specific UInt32Col record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific UInt32Col instances in the database accessible for the Authorization.
	 */
	public IBusModelPubUInt32Col[] pubreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific UInt32Col record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col pubreadRecByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read the specific UInt32Col record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col pubreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific UInt32Col record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col[] pubreadRecByScopeIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific UInt32Col record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col[] pubreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific UInt32Col record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col[] pubreadRecByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific UInt32Col record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col[] pubreadRecByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific UInt32Col record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col[] pubreadRecByContPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific UInt32Col record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col[] pubreadRecByContNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific UInt32Col record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubUInt32Col[] pubreadRecByTableIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TableId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelPubUInt32Col pubmoveRecUp( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelPubUInt32Col pubmoveRecDown( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
