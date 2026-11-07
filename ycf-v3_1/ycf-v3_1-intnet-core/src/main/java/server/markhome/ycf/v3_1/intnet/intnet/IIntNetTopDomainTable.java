
// Description: Java 25 DbIO interface for TopDomain.

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
 *	IntNetTopDomainTable database interface for TopDomain has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IIntNetTopDomainTable
{
	public static final String TABLE_NAME = "TopDomain";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	IIntNetTopDomain createTopDomain( ISecureAuthorization Authorization,
		IIntNetTopDomain rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	IIntNetTopDomain updateTopDomain( ISecureAuthorization Authorization,
		IIntNetTopDomain rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteTopDomain( ISecureAuthorization Authorization,
		IIntNetTopDomain rec );
	/**
	 *	Delete the TopDomain instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTopDomainByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the TopDomain instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId );

	/**
	 *	Delete the TopDomain instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTopDomainByTenantIdx( ISecureAuthorization Authorization,
		IIntNetTopDomainByTenantIdxKey argKey );
	/**
	 *	Delete the TopDomain instances identified by the key TldIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTldIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTldId );

	/**
	 *	Delete the TopDomain instances identified by the key TldIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTopDomainByTldIdx( ISecureAuthorization Authorization,
		IIntNetTopDomainByTldIdxKey argKey );
	/**
	 *	Delete the TopDomain instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTldId,
		String argName );

	/**
	 *	Delete the TopDomain instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTopDomainByNameIdx( ISecureAuthorization Authorization,
		IIntNetTopDomainByNameIdxKey argKey );


	/**
	 *	Read the derived TopDomain record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TopDomain instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IIntNetTopDomain readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived TopDomain record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TopDomain instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IIntNetTopDomain lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all TopDomain instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	IIntNetTopDomain[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived TopDomain record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IIntNetTopDomain readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read an array of the derived TopDomain record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IIntNetTopDomain[] readDerivedByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the derived TopDomain record instances identified by the duplicate key TldIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IIntNetTopDomain[] readDerivedByTldIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TldId );

	/**
	 *	Read the derived TopDomain record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IIntNetTopDomain readDerivedByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TldId,
		String Name );

	/**
	 *	Read the specific TopDomain record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TopDomain instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetTopDomain readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific TopDomain record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TopDomain instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetTopDomain lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific TopDomain record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TopDomain instances in the database accessible for the Authorization.
	 */
	IIntNetTopDomain[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific TopDomain record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetTopDomain readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read an array of the specific TopDomain record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetTopDomain[] readRecByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the specific TopDomain record instances identified by the duplicate key TldIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetTopDomain[] readRecByTldIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TldId );

	/**
	 *	Read the specific TopDomain record instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IIntNetTopDomain readRecByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TldId,
		String Name );
}
