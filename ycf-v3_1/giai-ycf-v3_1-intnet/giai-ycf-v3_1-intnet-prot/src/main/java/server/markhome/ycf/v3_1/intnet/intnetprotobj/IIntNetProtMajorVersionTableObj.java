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

public interface IIntNetProtMajorVersionTableObj
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
	 *	Instantiate a new MajorVersion instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetProtMajorVersionObj newInstance();

	/**
	 *	Instantiate a new MajorVersion edition of the specified MajorVersion instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetProtMajorVersionEditObj newEditInstance( IIntNetProtMajorVersionObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetProtMajorVersionEditObj instance, which may be a subclass of a MajorVersion instance.
	 */
	IIntNetProtMajorVersionObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetProtMajorVersionObj realiseMajorVersion( IIntNetProtMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetProtMajorVersionObj createMajorVersion( IIntNetProtMajorVersionObj Obj );

	/**
	 *	Read a MajorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MajorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetProtMajorVersionObj readMajorVersion( CFDbKeyHash256 pkey );

	/**
	 *	Read a MajorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MajorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetProtMajorVersionObj readMajorVersion( CFDbKeyHash256 pkey,
		boolean forceRead );

	IIntNetProtMajorVersionObj readCachedMajorVersion( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeMajorVersion( IIntNetProtMajorVersionObj obj );

	void deepDisposeMajorVersion( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetProtMajorVersionObj lockMajorVersion( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the MajorVersion-derived instances in the database.
	 *
	 *	@return	List of IIntNetProtMajorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetProtMajorVersionObj> readAllMajorVersion();

	/**
	 *	Return a sorted map of all the MajorVersion-derived instances in the database.
	 *
	 *	@return	List of IIntNetProtMajorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetProtMajorVersionObj> readAllMajorVersion( boolean forceRead );

	List<IIntNetProtMajorVersionObj> readCachedAllMajorVersion();

	/**
	 *	Get the IIntNetProtMajorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtMajorVersionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtMajorVersionObj readMajorVersionByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IIntNetProtMajorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtMajorVersionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtMajorVersionObj readMajorVersionByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of List<IIntNetProtMajorVersionObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtMajorVersionObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtMajorVersionObj> readMajorVersionByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of List<IIntNetProtMajorVersionObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtMajorVersionObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtMajorVersionObj> readMajorVersionByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of List<IIntNetProtMajorVersionObj> instances sorted by their primary keys for the duplicate SubProjectIdx key.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtMajorVersionObj> cached instances sorted by their primary keys for the duplicate SubProjectIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtMajorVersionObj> readMajorVersionBySubProjectIdx( ICFKeyHash256 SubProjectId );

	/**
	 *	Get the map of List<IIntNetProtMajorVersionObj> instances sorted by their primary keys for the duplicate SubProjectIdx key.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IIntNetProtMajorVersionObj> cached instances sorted by their primary keys for the duplicate SubProjectIdx key,
	 *		which may be an empty set.
	 */
	List<IIntNetProtMajorVersionObj> readMajorVersionBySubProjectIdx( ICFKeyHash256 SubProjectId,
		boolean forceRead );

	/**
	 *	Get the IIntNetProtMajorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtMajorVersionObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtMajorVersionObj readMajorVersionByNameIdx(ICFKeyHash256 SubProjectId,
		String Name );

	/**
	 *	Get the IIntNetProtMajorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	IIntNetProtMajorVersionObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetProtMajorVersionObj readMajorVersionByNameIdx(ICFKeyHash256 SubProjectId,
		String Name,
		boolean forceRead );

	IIntNetProtMajorVersionObj readCachedMajorVersionByIdIdx( ICFKeyHash256 Id );

	List<List<IIntNetProtMajorVersionObj>> readCachedMajorVersionByTenantIdx( ICFKeyHash256 TenantId );

	List<List<IIntNetProtMajorVersionObj>> readCachedMajorVersionBySubProjectIdx( ICFKeyHash256 SubProjectId );

	IIntNetProtMajorVersionObj readCachedMajorVersionByNameIdx( ICFKeyHash256 SubProjectId,
		String Name );

	void deepDisposeMajorVersionByIdIdx( ICFKeyHash256 Id );

	void deepDisposeMajorVersionByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeMajorVersionBySubProjectIdx( ICFKeyHash256 SubProjectId );

	void deepDisposeMajorVersionByNameIdx( ICFKeyHash256 SubProjectId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetProtMajorVersionObj updateMajorVersion( IIntNetProtMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMajorVersion( IIntNetProtMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionBySubProjectIdx( ICFKeyHash256 SubProjectId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByNameIdx(ICFKeyHash256 SubProjectId,
		String Name );
}
