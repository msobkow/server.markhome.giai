
// Description: Java 25 protlic DbIO interface for License.

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
 *	IntNetProtLicenseTable protlic database interface for License has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IIntNetProtLicenseTable
extends IIntNetPubLicenseTable
{
	public static final String TABLE_NAME = "License";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IIntNetProtLicense protcreateLicense( ISecurePubAuthorization Authorization,
		IIntNetProtLicense rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IIntNetProtLicense protcreateLicense( ISecurePubAuthorization Authorization,
		IIntNetPubLicense rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IIntNetProtLicense protupdateLicense( ISecurePubAuthorization Authorization,
		IIntNetProtLicense rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IIntNetProtLicense protupdateLicense( ISecurePubAuthorization Authorization,
		IIntNetPubLicense rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteLicense( ISecurePubAuthorization Authorization,
		IIntNetProtLicense rec );
	/**
	 *	Delete the License instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteLicenseByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argKey );
	/**
	 *	Delete the License instances identified by the key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 */
	public void protdeleteLicenseByLicnTenantIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argTenantId );

	/**
	 *	Delete the License instances identified by the key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteLicenseByLicnTenantIdx( ISecurePubAuthorization Authorization,
		IIntNetProtLicenseByLicnTenantIdxKey argKey );
	/**
	 *	Delete the License instances identified by the key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteLicenseByLicnTenantIdx( ISecurePubAuthorization Authorization,
		IIntNetPubLicenseByLicnTenantIdxKey argKey );
	/**
	 *	Delete the License instances identified by the key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 */
	public void protdeleteLicenseByDomainIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argTopDomainId );

	/**
	 *	Delete the License instances identified by the key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteLicenseByDomainIdx( ISecurePubAuthorization Authorization,
		IIntNetProtLicenseByDomainIdxKey argKey );
	/**
	 *	Delete the License instances identified by the key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteLicenseByDomainIdx( ISecurePubAuthorization Authorization,
		IIntNetPubLicenseByDomainIdxKey argKey );
	/**
	 *	Delete the License instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 */
	public void protdeleteLicenseByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argTopDomainId,
		String argName );

	/**
	 *	Delete the License instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteLicenseByUNameIdx( ISecurePubAuthorization Authorization,
		IIntNetProtLicenseByUNameIdxKey argKey );
	/**
	 *	Delete the License instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteLicenseByUNameIdx( ISecurePubAuthorization Authorization,
		IIntNetPubLicenseByUNameIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteLicense( ISecurePubAuthorization Authorization,
		IIntNetPubLicense rec );


	/**
	 *	Read the derived License record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetProtLicense protreadDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the derived License record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetProtLicense protlockDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all License instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IIntNetProtLicense[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived License record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetProtLicense protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read an array of the derived License record instances identified by the duplicate key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IIntNetProtLicense[] protreadDerivedByLicnTenantIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the derived License record instances identified by the duplicate key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IIntNetProtLicense[] protreadDerivedByDomainIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TopDomainId );

	/**
	 *	Read the derived License record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IIntNetProtLicense protreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Read the specific License record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtLicense protreadRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the specific License record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtLicense protlockRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all the specific License record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific License instances in the database accessible for the Authorization.
	 */
	public IIntNetProtLicense[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific License record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtLicense protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read an array of the specific License record instances identified by the duplicate key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtLicense[] protreadRecByLicnTenantIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the specific License record instances identified by the duplicate key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtLicense[] protreadRecByDomainIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TopDomainId );

	/**
	 *	Read the specific License record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetProtLicense protreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TopDomainId,
		String Name );
}
