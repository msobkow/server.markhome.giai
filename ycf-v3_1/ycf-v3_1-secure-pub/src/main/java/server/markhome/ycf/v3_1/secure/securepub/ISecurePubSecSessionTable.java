
// Description: Java 25 public DbIO interface for SecSession.

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
 *	SecurePubSecSessionTable public database interface for SecSession has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecurePubSecSessionTable
{
	public static final String TABLE_NAME = "SecSession";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ISecurePubSecSession pubcreateSecSession( ISecurePubAuthorization Authorization,
		ISecurePubSecSession rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ISecurePubSecSession pubupdateSecSession( ISecurePubAuthorization Authorization,
		ISecurePubSecSession rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void pubdeleteSecSession( ISecurePubAuthorization Authorization,
		ISecurePubSecSession rec );
	/**
	 *	Delete the SecSession instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void pubdeleteSecSessionByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argKey );
	/**
	 *	Delete the SecSession instances identified by the key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 */
	public void pubdeleteSecSessionBySecUserIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argSecUserId );

	/**
	 *	Delete the SecSession instances identified by the key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteSecSessionBySecUserIdx( ISecurePubAuthorization Authorization,
		ISecurePubSecSessionBySecUserIdxKey argKey );
	/**
	 *	Delete the SecSession instances identified by the key StartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Start	The SecSession key attribute of the instance generating the id.
	 */
	public void pubdeleteSecSessionByStartIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argSecUserId,
		LocalDateTime argStart );

	/**
	 *	Delete the SecSession instances identified by the key StartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteSecSessionByStartIdx( ISecurePubAuthorization Authorization,
		ISecurePubSecSessionByStartIdxKey argKey );
	/**
	 *	Delete the SecSession instances identified by the key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Finish	The SecSession key attribute of the instance generating the id.
	 */
	public void pubdeleteSecSessionByFinishIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argSecUserId,
		LocalDateTime argFinish );

	/**
	 *	Delete the SecSession instances identified by the key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteSecSessionByFinishIdx( ISecurePubAuthorization Authorization,
		ISecurePubSecSessionByFinishIdxKey argKey );


	/**
	 *	Read the derived SecSession record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSession instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubSecSession pubreadDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the derived SecSession record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSession instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubSecSession publockDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all SecSession instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ISecurePubSecSession[] pubreadPubAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived SecSession record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubSecSession pubreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SecSessionId );

	/**
	 *	Read an array of the derived SecSession record instances identified by the duplicate key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ISecurePubSecSession[] pubreadDerivedBySecUserIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SecUserId );

	/**
	 *	Read the derived SecSession record instance identified by the unique key StartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Start	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecurePubSecSession pubreadDerivedByStartIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SecUserId,
		LocalDateTime Start );

	/**
	 *	Read an array of the derived SecSession record instances identified by the duplicate key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Finish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ISecurePubSecSession[] pubreadDerivedByFinishIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SecUserId,
		LocalDateTime Finish );

	/**
	 *	Read the specific SecSession record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSession instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubSecSession pubreadRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the specific SecSession record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSession instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubSecSession publockRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all the specific SecSession record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSession instances in the database accessible for the Authorization.
	 */
	public ISecurePubSecSession[] pubreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific SecSession record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubSecSession pubreadRecByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SecSessionId );

	/**
	 *	Read an array of the specific SecSession record instances identified by the duplicate key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubSecSession[] pubreadRecBySecUserIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SecUserId );

	/**
	 *	Read the specific SecSession record instance identified by the unique key StartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Start	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubSecSession pubreadRecByStartIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SecUserId,
		LocalDateTime Start );

	/**
	 *	Read an array of the specific SecSession record instances identified by the duplicate key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	Finish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecurePubSecSession[] pubreadRecByFinishIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SecUserId,
		LocalDateTime Finish );
}
