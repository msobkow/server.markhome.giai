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

public interface IIntNetTopProjectTableObj
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
	 *	Instantiate a new TopProject instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetTopProjectObj newInstance();

	/**
	 *	Instantiate a new TopProject edition of the specified TopProject instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetTopProjectEditObj newEditInstance( IIntNetTopProjectObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetTopProjectObj instance, which may be a subclass of a TopProject instance.
	 */
	IIntNetTopProjectObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetTopProjectObj realiseTopProject( IIntNetTopProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetTopProjectObj createTopProject( IIntNetTopProjectObj Obj );

	/**
	 *	Read a TopProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetTopProjectObj readTopProject( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TopProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetTopProjectObj readTopProject( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IIntNetTopProjectObj readCachedTopProject( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTopProject( IIntNetTopProjectObj obj );

	void deepDisposeTopProject( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetTopProjectObj lockTopProject( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TopProject-derived instances in the database.
	 *
	 *	@return	List of IIntNetTopProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetTopProjectObj> readAllTopProject();

	/**
	 *	Return a sorted map of all the TopProject-derived instances in the database.
	 *
	 *	@return	List of IIntNetTopProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetTopProjectObj> readAllTopProject( boolean forceRead );

	List<IIntNetTopProjectObj> readCachedAllTopProject();

	/**
	 *	Get the IntNetTopProjectObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetTopProjectObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetTopProjectObj readTopProjectByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IntNetTopProjectObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetTopProjectObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetTopProjectObj readTopProjectByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IntNetTopProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetTopProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetTopProjectObj> readTopProjectByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IntNetTopProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetTopProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetTopProjectObj> readTopProjectByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IntNetTopProjectObj instances sorted by their primary keys for the duplicate TopDomainIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetTopProjectObj cached instances sorted by their primary keys for the duplicate TopDomainIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetTopProjectObj> readTopProjectByTopDomainIdx( ICFKeyHash256 TopDomainId );

	/**
	 *	Get the map of IntNetTopProjectObj instances sorted by their primary keys for the duplicate TopDomainIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetTopProjectObj cached instances sorted by their primary keys for the duplicate TopDomainIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetTopProjectObj> readTopProjectByTopDomainIdx( ICFKeyHash256 TopDomainId,
		boolean forceRead );

	/**
	 *	Get the IntNetTopProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetTopProjectObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetTopProjectObj readTopProjectByNameIdx(ICFKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Get the IntNetTopProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetTopProjectObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetTopProjectObj readTopProjectByNameIdx(ICFKeyHash256 TopDomainId,
		String Name,
		boolean forceRead );

	IIntNetTopProjectObj readCachedTopProjectByIdIdx( ICFKeyHash256 Id );

	List<IIntNetTopProjectObj> readCachedTopProjectByTenantIdx( ICFKeyHash256 TenantId );

	List<IIntNetTopProjectObj> readCachedTopProjectByTopDomainIdx( ICFKeyHash256 TopDomainId );

	IIntNetTopProjectObj readCachedTopProjectByNameIdx( ICFKeyHash256 TopDomainId,
		String Name );

	void deepDisposeTopProjectByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTopProjectByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeTopProjectByTopDomainIdx( ICFKeyHash256 TopDomainId );

	void deepDisposeTopProjectByNameIdx( ICFKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetTopProjectObj updateTopProject( IIntNetTopProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopProject( IIntNetTopProjectObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByTopDomainIdx( ICFKeyHash256 TopDomainId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByNameIdx(ICFKeyHash256 TopDomainId,
		String Name );
}
