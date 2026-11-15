// Description: Java 25 Table Object interface for IntNet.

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

package server.markhome.ycf.v3_1.intnet.intnetobj;

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
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

public interface IIntNetTopDomainTableObj
{
	public IIntNetSchemaObj getSchema();
	public void setSchema( IIntNetSchemaObj value );

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
	IIntNetTopDomainObj newInstance();

	/**
	 *	Instantiate a new TopDomain edition of the specified TopDomain instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetTopDomainEditObj newEditInstance( IIntNetTopDomainObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetTopDomainObj instance, which may be a subclass of a TopDomain instance.
	 */
	IIntNetTopDomainObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetTopDomainObj realiseTopDomain( IIntNetTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetTopDomainObj createTopDomain( IIntNetTopDomainObj Obj );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetTopDomainObj readTopDomain( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetTopDomainObj readTopDomain( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IIntNetTopDomainObj readCachedTopDomain( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTopDomain( IIntNetTopDomainObj obj );

	void deepDisposeTopDomain( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetTopDomainObj lockTopDomain( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of IIntNetTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetTopDomainObj> readAllTopDomain();

	/**
	 *	Return a sorted map of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of IIntNetTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetTopDomainObj> readAllTopDomain( boolean forceRead );

	List<IIntNetTopDomainObj> readCachedAllTopDomain();

	/**
	 *	Get the IntNetTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	IntNetTopDomainObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetTopDomainObj readTopDomainByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IntNetTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	IntNetTopDomainObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetTopDomainObj readTopDomainByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IntNetTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetTopDomainObj> readTopDomainByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IntNetTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetTopDomainObj> readTopDomainByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IntNetTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetTopDomainObj> readTopDomainByTldIdx( ICFKeyHash256 TldId );

	/**
	 *	Get the map of IntNetTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetTopDomainObj> readTopDomainByTldIdx( ICFKeyHash256 TldId,
		boolean forceRead );

	/**
	 *	Get the IntNetTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	IntNetTopDomainObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetTopDomainObj readTopDomainByNameIdx(ICFKeyHash256 TldId,
		String Name );

	/**
	 *	Get the IntNetTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	IntNetTopDomainObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetTopDomainObj readTopDomainByNameIdx(ICFKeyHash256 TldId,
		String Name,
		boolean forceRead );

	IIntNetTopDomainObj readCachedTopDomainByIdIdx( ICFKeyHash256 Id );

	List<IIntNetTopDomainObj> readCachedTopDomainByTenantIdx( ICFKeyHash256 TenantId );

	List<IIntNetTopDomainObj> readCachedTopDomainByTldIdx( ICFKeyHash256 TldId );

	IIntNetTopDomainObj readCachedTopDomainByNameIdx( ICFKeyHash256 TldId,
		String Name );

	void deepDisposeTopDomainByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTopDomainByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeTopDomainByTldIdx( ICFKeyHash256 TldId );

	void deepDisposeTopDomainByNameIdx( ICFKeyHash256 TldId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetTopDomainObj updateTopDomain( IIntNetTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopDomain( IIntNetTopDomainObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTldIdx( ICFKeyHash256 TldId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByNameIdx(ICFKeyHash256 TldId,
		String Name );
}
