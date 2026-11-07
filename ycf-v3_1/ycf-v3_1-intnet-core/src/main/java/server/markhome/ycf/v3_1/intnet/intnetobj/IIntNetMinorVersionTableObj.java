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

public interface IIntNetMinorVersionTableObj
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
	 *	Instantiate a new MinorVersion instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetMinorVersionObj newInstance();

	/**
	 *	Instantiate a new MinorVersion edition of the specified MinorVersion instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetMinorVersionEditObj newEditInstance( IIntNetMinorVersionObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetMinorVersionObj instance, which may be a subclass of a MinorVersion instance.
	 */
	IIntNetMinorVersionObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetMinorVersionObj realiseMinorVersion( IIntNetMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetMinorVersionObj createMinorVersion( IIntNetMinorVersionObj Obj );

	/**
	 *	Read a MinorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MinorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetMinorVersionObj readMinorVersion( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a MinorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MinorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetMinorVersionObj readMinorVersion( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IIntNetMinorVersionObj readCachedMinorVersion( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeMinorVersion( IIntNetMinorVersionObj obj );

	void deepDisposeMinorVersion( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetMinorVersionObj lockMinorVersion( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the MinorVersion-derived instances in the database.
	 *
	 *	@return	List of IIntNetMinorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetMinorVersionObj> readAllMinorVersion();

	/**
	 *	Return a sorted map of all the MinorVersion-derived instances in the database.
	 *
	 *	@return	List of IIntNetMinorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetMinorVersionObj> readAllMinorVersion( boolean forceRead );

	List<IIntNetMinorVersionObj> readCachedAllMinorVersion();

	/**
	 *	Get the IntNetMinorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IntNetMinorVersionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetMinorVersionObj readMinorVersionByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IntNetMinorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IntNetMinorVersionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetMinorVersionObj readMinorVersionByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IntNetMinorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetMinorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetMinorVersionObj> readMinorVersionByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IntNetMinorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetMinorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetMinorVersionObj> readMinorVersionByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IntNetMinorVersionObj instances sorted by their primary keys for the duplicate MajorVerIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetMinorVersionObj cached instances sorted by their primary keys for the duplicate MajorVerIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetMinorVersionObj> readMinorVersionByMajorVerIdx( ICFKeyHash256 MajorVersionId );

	/**
	 *	Get the map of IntNetMinorVersionObj instances sorted by their primary keys for the duplicate MajorVerIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of IntNetMinorVersionObj cached instances sorted by their primary keys for the duplicate MajorVerIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetMinorVersionObj> readMinorVersionByMajorVerIdx( ICFKeyHash256 MajorVersionId,
		boolean forceRead );

	/**
	 *	Get the IntNetMinorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IntNetMinorVersionObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetMinorVersionObj readMinorVersionByNameIdx(ICFKeyHash256 MajorVersionId,
		String Name );

	/**
	 *	Get the IntNetMinorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IntNetMinorVersionObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetMinorVersionObj readMinorVersionByNameIdx(ICFKeyHash256 MajorVersionId,
		String Name,
		boolean forceRead );

	IIntNetMinorVersionObj readCachedMinorVersionByIdIdx( ICFKeyHash256 Id );

	List<IIntNetMinorVersionObj> readCachedMinorVersionByTenantIdx( ICFKeyHash256 TenantId );

	List<IIntNetMinorVersionObj> readCachedMinorVersionByMajorVerIdx( ICFKeyHash256 MajorVersionId );

	IIntNetMinorVersionObj readCachedMinorVersionByNameIdx( ICFKeyHash256 MajorVersionId,
		String Name );

	void deepDisposeMinorVersionByIdIdx( ICFKeyHash256 Id );

	void deepDisposeMinorVersionByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeMinorVersionByMajorVerIdx( ICFKeyHash256 MajorVersionId );

	void deepDisposeMinorVersionByNameIdx( ICFKeyHash256 MajorVersionId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetMinorVersionObj updateMinorVersion( IIntNetMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMinorVersion( IIntNetMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByMajorVerIdx( ICFKeyHash256 MajorVersionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByNameIdx(ICFKeyHash256 MajorVersionId,
		String Name );
}
