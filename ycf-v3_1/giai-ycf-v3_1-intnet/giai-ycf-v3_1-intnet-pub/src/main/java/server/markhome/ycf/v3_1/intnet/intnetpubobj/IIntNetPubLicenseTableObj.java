// Description: Java 25 Public Table Object interface for IntNetPub.

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

package server.markhome.ycf.v3_1.intnet.intnetpubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IIntNetPubLicenseTableObj
{
	public IIntNetPubSchemaObj getSchema();
	public void setSchema( IIntNetPubSchemaObj value );

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
	IIntNetPubLicenseObj newInstance();

	/**
	 *	Instantiate a new License edition of the specified License instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetPubLicenseEditObj newEditInstance( IIntNetPubLicenseObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetPubLicenseObj instance, which may be a subclass of a License instance.
	 */
	IIntNetPubLicenseObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetPubLicenseObj realiseLicense( IIntNetPubLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetPubLicenseObj createLicense( IIntNetPubLicenseObj Obj );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubLicenseObj readLicense( ICFKeyHash256 pkey );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubLicenseObj readLicense( ICFKeyHash256 pkey,
		boolean forceRead );

	IIntNetPubLicenseObj readCachedLicense( ICFKeyHash256 pkey );

	public void reallyDeepDisposeLicense( IIntNetPubLicenseObj obj );

	void deepDisposeLicense( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetPubLicenseObj lockLicense( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the License-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubLicenseObj> readAllLicense();

	/**
	 *	Return a sorted map of all the License-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubLicenseObj> readAllLicense( boolean forceRead );

	List<IIntNetPubLicenseObj> readCachedAllLicense();

	/**
	 *	Get the IntNetPubLicenseObj instance for the primary key attributes.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubLicenseObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubLicenseObj readLicenseByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the IntNetPubLicenseObj instance for the primary key attributes.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubLicenseObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubLicenseObj readLicenseByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubLicenseObj instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubLicenseObj cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubLicenseObj> readLicenseByLicnTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of IntNetPubLicenseObj instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubLicenseObj cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubLicenseObj> readLicenseByLicnTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubLicenseObj instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubLicenseObj cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubLicenseObj> readLicenseByDomainIdx( CFDbKeyHash256 TopDomainId );

	/**
	 *	Get the map of IntNetPubLicenseObj instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubLicenseObj cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubLicenseObj> readLicenseByDomainIdx( CFDbKeyHash256 TopDomainId,
		boolean forceRead );

	/**
	 *	Get the IntNetPubLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubLicenseObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubLicenseObj readLicenseByUNameIdx(CFDbKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Get the IntNetPubLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubLicenseObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubLicenseObj readLicenseByUNameIdx(CFDbKeyHash256 TopDomainId,
		String Name,
		boolean forceRead );

	IIntNetPubLicenseObj readCachedLicenseByIdIdx( CFDbKeyHash256 Id );

	List<IIntNetPubLicenseObj> readCachedLicenseByLicnTenantIdx( CFDbKeyHash256 TenantId );

	List<IIntNetPubLicenseObj> readCachedLicenseByDomainIdx( CFDbKeyHash256 TopDomainId );

	IIntNetPubLicenseObj readCachedLicenseByUNameIdx( CFDbKeyHash256 TopDomainId,
		String Name );

	void deepDisposeLicenseByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeLicenseByLicnTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeLicenseByDomainIdx( CFDbKeyHash256 TopDomainId );

	void deepDisposeLicenseByUNameIdx( CFDbKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetPubLicenseObj updateLicense( IIntNetPubLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteLicense( IIntNetPubLicenseObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByLicnTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByDomainIdx( CFDbKeyHash256 TopDomainId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByUNameIdx(CFDbKeyHash256 TopDomainId,
		String Name );
}
