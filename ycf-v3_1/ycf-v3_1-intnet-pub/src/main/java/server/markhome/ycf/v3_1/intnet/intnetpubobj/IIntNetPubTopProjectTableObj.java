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

public interface IIntNetPubTopProjectTableObj
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
	 *	Instantiate a new TopProject instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetPubTopProjectObj newInstance();

	/**
	 *	Instantiate a new TopProject edition of the specified TopProject instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetPubTopProjectEditObj newEditInstance( IIntNetPubTopProjectObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetPubTopProjectObj instance, which may be a subclass of a TopProject instance.
	 */
	IIntNetPubTopProjectObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTopProjectObj realiseTopProject( IIntNetPubTopProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTopProjectObj createTopProject( IIntNetPubTopProjectObj Obj );

	/**
	 *	Read a TopProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubTopProjectObj readTopProject( ICFKeyHash256 pkey );

	/**
	 *	Read a TopProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubTopProjectObj readTopProject( ICFKeyHash256 pkey,
		boolean forceRead );

	IIntNetPubTopProjectObj readCachedTopProject( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTopProject( IIntNetPubTopProjectObj obj );

	void deepDisposeTopProject( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTopProjectObj lockTopProject( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TopProject-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubTopProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubTopProjectObj> readAllTopProject();

	/**
	 *	Return a sorted map of all the TopProject-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubTopProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubTopProjectObj> readAllTopProject( boolean forceRead );

	List<IIntNetPubTopProjectObj> readCachedAllTopProject();

	/**
	 *	Get the IntNetPubTopProjectObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTopProjectObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTopProjectObj readTopProjectByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the IntNetPubTopProjectObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTopProjectObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTopProjectObj readTopProjectByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubTopProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTopProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTopProjectObj> readTopProjectByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of IntNetPubTopProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTopProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTopProjectObj> readTopProjectByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubTopProjectObj instances sorted by their primary keys for the duplicate TopDomainIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTopProjectObj cached instances sorted by their primary keys for the duplicate TopDomainIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTopProjectObj> readTopProjectByTopDomainIdx( CFDbKeyHash256 TopDomainId );

	/**
	 *	Get the map of IntNetPubTopProjectObj instances sorted by their primary keys for the duplicate TopDomainIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubTopProjectObj cached instances sorted by their primary keys for the duplicate TopDomainIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubTopProjectObj> readTopProjectByTopDomainIdx( CFDbKeyHash256 TopDomainId,
		boolean forceRead );

	/**
	 *	Get the IntNetPubTopProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTopProjectObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTopProjectObj readTopProjectByNameIdx(CFDbKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Get the IntNetPubTopProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubTopProjectObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubTopProjectObj readTopProjectByNameIdx(CFDbKeyHash256 TopDomainId,
		String Name,
		boolean forceRead );

	IIntNetPubTopProjectObj readCachedTopProjectByIdIdx( CFDbKeyHash256 Id );

	List<IIntNetPubTopProjectObj> readCachedTopProjectByTenantIdx( CFDbKeyHash256 TenantId );

	List<IIntNetPubTopProjectObj> readCachedTopProjectByTopDomainIdx( CFDbKeyHash256 TopDomainId );

	IIntNetPubTopProjectObj readCachedTopProjectByNameIdx( CFDbKeyHash256 TopDomainId,
		String Name );

	void deepDisposeTopProjectByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTopProjectByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeTopProjectByTopDomainIdx( CFDbKeyHash256 TopDomainId );

	void deepDisposeTopProjectByNameIdx( CFDbKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetPubTopProjectObj updateTopProject( IIntNetPubTopProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopProject( IIntNetPubTopProjectObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByTopDomainIdx( CFDbKeyHash256 TopDomainId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByNameIdx(CFDbKeyHash256 TopDomainId,
		String Name );
}
