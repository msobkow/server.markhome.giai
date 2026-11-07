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

public interface IIntNetPubMinorVersionTableObj
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
	 *	Instantiate a new MinorVersion instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetPubMinorVersionObj newInstance();

	/**
	 *	Instantiate a new MinorVersion edition of the specified MinorVersion instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetPubMinorVersionEditObj newEditInstance( IIntNetPubMinorVersionObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetPubMinorVersionObj instance, which may be a subclass of a MinorVersion instance.
	 */
	IIntNetPubMinorVersionObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetPubMinorVersionObj realiseMinorVersion( IIntNetPubMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetPubMinorVersionObj createMinorVersion( IIntNetPubMinorVersionObj Obj );

	/**
	 *	Read a MinorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MinorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubMinorVersionObj readMinorVersion( ICFKeyHash256 pkey );

	/**
	 *	Read a MinorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MinorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetPubMinorVersionObj readMinorVersion( ICFKeyHash256 pkey,
		boolean forceRead );

	IIntNetPubMinorVersionObj readCachedMinorVersion( ICFKeyHash256 pkey );

	public void reallyDeepDisposeMinorVersion( IIntNetPubMinorVersionObj obj );

	void deepDisposeMinorVersion( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetPubMinorVersionObj lockMinorVersion( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the MinorVersion-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubMinorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubMinorVersionObj> readAllMinorVersion();

	/**
	 *	Return a sorted map of all the MinorVersion-derived instances in the database.
	 *
	 *	@return	List of IIntNetPubMinorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetPubMinorVersionObj> readAllMinorVersion( boolean forceRead );

	List<IIntNetPubMinorVersionObj> readCachedAllMinorVersion();

	/**
	 *	Get the IntNetPubMinorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubMinorVersionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubMinorVersionObj readMinorVersionByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the IntNetPubMinorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubMinorVersionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubMinorVersionObj readMinorVersionByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubMinorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubMinorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubMinorVersionObj> readMinorVersionByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of IntNetPubMinorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubMinorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubMinorVersionObj> readMinorVersionByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IntNetPubMinorVersionObj instances sorted by their primary keys for the duplicate MajorVerIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubMinorVersionObj cached instances sorted by their primary keys for the duplicate MajorVerIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubMinorVersionObj> readMinorVersionByMajorVerIdx( CFDbKeyHash256 MajorVersionId );

	/**
	 *	Get the map of IntNetPubMinorVersionObj instances sorted by their primary keys for the duplicate MajorVerIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetPubMinorVersionObj cached instances sorted by their primary keys for the duplicate MajorVerIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetPubMinorVersionObj> readMinorVersionByMajorVerIdx( CFDbKeyHash256 MajorVersionId,
		boolean forceRead );

	/**
	 *	Get the IntNetPubMinorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubMinorVersionObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubMinorVersionObj readMinorVersionByNameIdx(CFDbKeyHash256 MajorVersionId,
		String Name );

	/**
	 *	Get the IntNetPubMinorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IntNetPubMinorVersionObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetPubMinorVersionObj readMinorVersionByNameIdx(CFDbKeyHash256 MajorVersionId,
		String Name,
		boolean forceRead );

	IIntNetPubMinorVersionObj readCachedMinorVersionByIdIdx( CFDbKeyHash256 Id );

	List<IIntNetPubMinorVersionObj> readCachedMinorVersionByTenantIdx( CFDbKeyHash256 TenantId );

	List<IIntNetPubMinorVersionObj> readCachedMinorVersionByMajorVerIdx( CFDbKeyHash256 MajorVersionId );

	IIntNetPubMinorVersionObj readCachedMinorVersionByNameIdx( CFDbKeyHash256 MajorVersionId,
		String Name );

	void deepDisposeMinorVersionByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeMinorVersionByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeMinorVersionByMajorVerIdx( CFDbKeyHash256 MajorVersionId );

	void deepDisposeMinorVersionByNameIdx( CFDbKeyHash256 MajorVersionId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetPubMinorVersionObj updateMinorVersion( IIntNetPubMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMinorVersion( IIntNetPubMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByMajorVerIdx( CFDbKeyHash256 MajorVersionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByNameIdx(CFDbKeyHash256 MajorVersionId,
		String Name );
}
