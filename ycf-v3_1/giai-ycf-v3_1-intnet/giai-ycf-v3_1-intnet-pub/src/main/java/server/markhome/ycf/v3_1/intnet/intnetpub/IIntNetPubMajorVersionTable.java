
// Description: Java 25 public DbIO interface for MajorVersion.

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
 *	IntNetPubMajorVersionTable public database interface for MajorVersion has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IIntNetPubMajorVersionTable
{
	public static final String TABLE_NAME = "MajorVersion";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IIntNetPubMajorVersion pubcreateMajorVersion( ISecurePubAuthorization Authorization,
		IIntNetPubMajorVersion rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IIntNetPubMajorVersion pubupdateMajorVersion( ISecurePubAuthorization Authorization,
		IIntNetPubMajorVersion rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void pubdeleteMajorVersion( ISecurePubAuthorization Authorization,
		IIntNetPubMajorVersion rec );
	/**
	 *	Delete the MajorVersion instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void pubdeleteMajorVersionByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argKey );
	/**
	 *	Delete the MajorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 */
	public void pubdeleteMajorVersionByTenantIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argTenantId );

	/**
	 *	Delete the MajorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteMajorVersionByTenantIdx( ISecurePubAuthorization Authorization,
		IIntNetPubMajorVersionByTenantIdxKey argKey );
	/**
	 *	Delete the MajorVersion instances identified by the key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 */
	public void pubdeleteMajorVersionBySubProjectIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argSubProjectId );

	/**
	 *	Delete the MajorVersion instances identified by the key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteMajorVersionBySubProjectIdx( ISecurePubAuthorization Authorization,
		IIntNetPubMajorVersionBySubProjectIdxKey argKey );
	/**
	 *	Delete the MajorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 */
	public void pubdeleteMajorVersionByNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argSubProjectId,
		String argName );

	/**
	 *	Delete the MajorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteMajorVersionByNameIdx( ISecurePubAuthorization Authorization,
		IIntNetPubMajorVersionByNameIdxKey argKey );


	/**
	 *	Read the derived MajorVersion record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetPubMajorVersion pubreadDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the derived MajorVersion record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetPubMajorVersion publockDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all MajorVersion instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IIntNetPubMajorVersion[] pubreadPubAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived MajorVersion record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetPubMajorVersion pubreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read an array of the derived MajorVersion record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IIntNetPubMajorVersion[] pubreadDerivedByTenantIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId );

	/**
	 *	Read an array of the derived MajorVersion record instances identified by the duplicate key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IIntNetPubMajorVersion[] pubreadDerivedBySubProjectIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SubProjectId );

	/**
	 *	Read the derived MajorVersion record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetPubMajorVersion pubreadDerivedByNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SubProjectId,
		String Name );

	/**
	 *	Read the specific MajorVersion record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubMajorVersion pubreadRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the specific MajorVersion record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MajorVersion instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubMajorVersion publockRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all the specific MajorVersion record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific MajorVersion instances in the database accessible for the Authorization.
	 */
	public IIntNetPubMajorVersion[] pubreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific MajorVersion record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubMajorVersion pubreadRecByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read an array of the specific MajorVersion record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubMajorVersion[] pubreadRecByTenantIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId );

	/**
	 *	Read an array of the specific MajorVersion record instances identified by the duplicate key SubProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubMajorVersion[] pubreadRecBySubProjectIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SubProjectId );

	/**
	 *	Read the specific MajorVersion record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubMajorVersion pubreadRecByNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SubProjectId,
		String Name );
}
