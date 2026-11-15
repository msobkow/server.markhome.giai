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

public interface IIntNetPubSubProjectTableObj
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
	 *	Instantiate a new SubProject instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetPubSubProjectObj newInstance();

	/**
	 *	Instantiate a new SubProject edition of the specified SubProject instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetPubSubProjectEditObj newEditInstance( IIntNetPubSubProjectObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetPubSubProjectObj instance, which may be a subclass of a SubProject instance.
	 */
	IIntNetPubSubProjectObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetPubSubProjectObj realiseSubProject( IIntNetPubSubProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetPubSubProjectObj createSubProject( IIntNetPubSubProjectObj Obj );

	/**
	 *	Read a SubProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SubProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubSubProjectObj readSubProject( ICFKeyHash256 pkey );

	/**
	 *	Read a SubProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SubProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubSubProjectObj readSubProject( ICFKeyHash256 pkey,
		boolean forceRead );

	IIntNetPubSubProjectObj readCachedSubProject( ICFKeyHash256 pkey );

	public void reallyDeepDisposeSubProject( IIntNetPubSubProjectObj obj );

	void deepDisposeSubProject( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetPubSubProjectObj lockSubProject( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SubProject-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubSubProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubSubProjectObj> readAllSubProject();

	/**
	 *	Return a sorted map of all the SubProject-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubSubProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubSubProjectObj> readAllSubProject( boolean forceRead );

	List<IIntNetPubSubProjectObj> readCachedAllSubProject();

	/**
	 *	Get the IntNetPubSubProjectObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubSubProjectObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubSubProjectObj readSubProjectByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the IntNetPubSubProjectObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubSubProjectObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubSubProjectObj readSubProjectByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubSubProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubSubProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubSubProjectObj> readSubProjectByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of IntNetPubSubProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubSubProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubSubProjectObj> readSubProjectByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubSubProjectObj instances sorted by their primary keys for the duplicate TopProjectIdx key.
	 *
	 *	@param	TopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubSubProjectObj cached instances sorted by their primary keys for the duplicate TopProjectIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubSubProjectObj> readSubProjectByTopProjectIdx( CFDbKeyHash256 TopProjectId );

	/**
	 *	Get the map of IntNetPubSubProjectObj instances sorted by their primary keys for the duplicate TopProjectIdx key.
	 *
	 *	@param	TopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubSubProjectObj cached instances sorted by their primary keys for the duplicate TopProjectIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubSubProjectObj> readSubProjectByTopProjectIdx( CFDbKeyHash256 TopProjectId,
		boolean forceRead );

	/**
	 *	Get the IntNetPubSubProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	TopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubSubProjectObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubSubProjectObj readSubProjectByNameIdx(CFDbKeyHash256 TopProjectId,
		String Name );

	/**
	 *	Get the IntNetPubSubProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	TopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubSubProjectObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubSubProjectObj readSubProjectByNameIdx(CFDbKeyHash256 TopProjectId,
		String Name,
		boolean forceRead );

	IIntNetPubSubProjectObj readCachedSubProjectByIdIdx( CFDbKeyHash256 Id );

	List<IIntNetPubSubProjectObj> readCachedSubProjectByTenantIdx( CFDbKeyHash256 TenantId );

	List<IIntNetPubSubProjectObj> readCachedSubProjectByTopProjectIdx( CFDbKeyHash256 TopProjectId );

	IIntNetPubSubProjectObj readCachedSubProjectByNameIdx( CFDbKeyHash256 TopProjectId,
		String Name );

	void deepDisposeSubProjectByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeSubProjectByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeSubProjectByTopProjectIdx( CFDbKeyHash256 TopProjectId );

	void deepDisposeSubProjectByNameIdx( CFDbKeyHash256 TopProjectId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetPubSubProjectObj updateSubProject( IIntNetPubSubProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSubProject( IIntNetPubSubProjectObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopProjectId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByTopProjectIdx( CFDbKeyHash256 TopProjectId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByNameIdx(CFDbKeyHash256 TopProjectId,
		String Name );
}
