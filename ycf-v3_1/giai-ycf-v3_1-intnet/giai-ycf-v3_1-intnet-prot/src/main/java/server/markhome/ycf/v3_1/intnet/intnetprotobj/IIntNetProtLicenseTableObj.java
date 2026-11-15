// Description: Java 25 Protected Table Object interface for IntNetProt.

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

package server.markhome.ycf.v3_1.intnet.intnetprotobj;

import java.math.*;
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
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IIntNetProtLicenseTableObj
{
	public IIntNetProtSchemaObj getSchema();
	public void setSchema( IIntNetProtSchemaObj value );

	public void minimizeMemory();

	public String getTableName();
	public String getTableDbName();

	/**
	 *	Get class code always returns the runtime class code for the objects, which is not stable until the application is done initializing and registering its objects.
	 *
	 *	@return runtime classcode
	 */ 
	public int getClassCode();

	/**
	 *	Get the backing store schema's class code, which is hard-coded into the object hierarchy.
	 *
	 *	@return The hardcoded backing store class code for this object, which is only valid in that schema.
	 */
	// public static int getBackingClassCode();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new License instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetProtLicenseObj newInstance();

	/**
	 *	Instantiate a new License edition of the specified License instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetProtLicenseEditObj newEditInstance( IIntNetProtLicenseObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetProtLicenseEditObj instance, which may be a subclass of a License instance.
	 */
	IIntNetProtLicenseObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetProtLicenseObj realiseLicense( IIntNetProtLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetProtLicenseObj createLicense( IIntNetProtLicenseObj Obj );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetProtLicenseObj readLicense( CFDbKeyHash256 pkey );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetProtLicenseObj readLicense( CFDbKeyHash256 pkey,
		boolean forceRead );

	IIntNetProtLicenseObj readCachedLicense( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeLicense( IIntNetProtLicenseObj obj );

	void deepDisposeLicense( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetProtLicenseObj lockLicense( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the License-derived instances in the database.
	 *
	 *	@return	List of IIntNetProtLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetProtLicenseObj> readAllLicense();

	/**
	 *	Return a sorted map of all the License-derived instances in the database.
	 *
	 *	@return	List of IIntNetProtLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetProtLicenseObj> readAllLicense( boolean forceRead );

	List<IIntNetProtLicenseObj> readCachedAllLicense();

	/**
	 *	Get the IIntNetProtLicenseObj instance for the primary key attributes.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtLicenseObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtLicenseObj readLicenseByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IIntNetProtLicenseObj instance for the primary key attributes.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtLicenseObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtLicenseObj readLicenseByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of List<IIntNetProtLicenseObj> instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtLicenseObj> cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtLicenseObj> readLicenseByLicnTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of List<IIntNetProtLicenseObj> instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtLicenseObj> cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtLicenseObj> readLicenseByLicnTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of List<IIntNetProtLicenseObj> instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtLicenseObj> cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtLicenseObj> readLicenseByDomainIdx( ICFKeyHash256 TopDomainId );

	/**
	 *	Get the map of List<IIntNetProtLicenseObj> instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtLicenseObj> cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtLicenseObj> readLicenseByDomainIdx( ICFKeyHash256 TopDomainId,
		boolean forceRead );

	/**
	 *	Get the IIntNetProtLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtLicenseObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtLicenseObj readLicenseByUNameIdx(ICFKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Get the IIntNetProtLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtLicenseObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtLicenseObj readLicenseByUNameIdx(ICFKeyHash256 TopDomainId,
		String Name,
		boolean forceRead );

	IIntNetProtLicenseObj readCachedLicenseByIdIdx( ICFKeyHash256 Id );

	List<List<IIntNetProtLicenseObj>> readCachedLicenseByLicnTenantIdx( ICFKeyHash256 TenantId );

	List<List<IIntNetProtLicenseObj>> readCachedLicenseByDomainIdx( ICFKeyHash256 TopDomainId );

	IIntNetProtLicenseObj readCachedLicenseByUNameIdx( ICFKeyHash256 TopDomainId,
		String Name );

	void deepDisposeLicenseByIdIdx( ICFKeyHash256 Id );

	void deepDisposeLicenseByLicnTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeLicenseByDomainIdx( ICFKeyHash256 TopDomainId );

	void deepDisposeLicenseByUNameIdx( ICFKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetProtLicenseObj updateLicense( IIntNetProtLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteLicense( IIntNetProtLicenseObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByLicnTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByDomainIdx( ICFKeyHash256 TopDomainId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByUNameIdx(ICFKeyHash256 TopDomainId,
		String Name );
}
