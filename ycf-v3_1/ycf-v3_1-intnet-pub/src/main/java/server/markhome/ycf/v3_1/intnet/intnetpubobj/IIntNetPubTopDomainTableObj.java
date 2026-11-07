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

public interface IIntNetPubTopDomainTableObj
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
	 *	Instantiate a new TopDomain instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetPubTopDomainObj newInstance();

	/**
	 *	Instantiate a new TopDomain edition of the specified TopDomain instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetPubTopDomainEditObj newEditInstance( IIntNetPubTopDomainObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetPubTopDomainObj instance, which may be a subclass of a TopDomain instance.
	 */
	IIntNetPubTopDomainObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTopDomainObj realiseTopDomain( IIntNetPubTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTopDomainObj createTopDomain( IIntNetPubTopDomainObj Obj );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubTopDomainObj readTopDomain( ICFKeyHash256 pkey );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubTopDomainObj readTopDomain( ICFKeyHash256 pkey,
		boolean forceRead );

	IIntNetPubTopDomainObj readCachedTopDomain( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTopDomain( IIntNetPubTopDomainObj obj );

	void deepDisposeTopDomain( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTopDomainObj lockTopDomain( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubTopDomainObj> readAllTopDomain();

	/**
	 *	Return a sorted map of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubTopDomainObj> readAllTopDomain( boolean forceRead );

	List<IIntNetPubTopDomainObj> readCachedAllTopDomain();

	/**
	 *	Get the IntNetPubTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTopDomainObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTopDomainObj readTopDomainByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the IntNetPubTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTopDomainObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTopDomainObj readTopDomainByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTopDomainObj> readTopDomainByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of IntNetPubTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTopDomainObj> readTopDomainByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTopDomainObj> readTopDomainByTldIdx( CFDbKeyHash256 TldId );

	/**
	 *	Get the map of IntNetPubTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTopDomainObj> readTopDomainByTldIdx( CFDbKeyHash256 TldId,
		boolean forceRead );

	/**
	 *	Get the IntNetPubTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTopDomainObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTopDomainObj readTopDomainByNameIdx(CFDbKeyHash256 TldId,
		String Name );

	/**
	 *	Get the IntNetPubTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTopDomainObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTopDomainObj readTopDomainByNameIdx(CFDbKeyHash256 TldId,
		String Name,
		boolean forceRead );

	IIntNetPubTopDomainObj readCachedTopDomainByIdIdx( CFDbKeyHash256 Id );

	List<IIntNetPubTopDomainObj> readCachedTopDomainByTenantIdx( CFDbKeyHash256 TenantId );

	List<IIntNetPubTopDomainObj> readCachedTopDomainByTldIdx( CFDbKeyHash256 TldId );

	IIntNetPubTopDomainObj readCachedTopDomainByNameIdx( CFDbKeyHash256 TldId,
		String Name );

	void deepDisposeTopDomainByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTopDomainByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeTopDomainByTldIdx( CFDbKeyHash256 TldId );

	void deepDisposeTopDomainByNameIdx( CFDbKeyHash256 TldId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTopDomainObj updateTopDomain( IIntNetPubTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopDomain( IIntNetPubTopDomainObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTldIdx( CFDbKeyHash256 TldId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByNameIdx(CFDbKeyHash256 TldId,
		String Name );
}
