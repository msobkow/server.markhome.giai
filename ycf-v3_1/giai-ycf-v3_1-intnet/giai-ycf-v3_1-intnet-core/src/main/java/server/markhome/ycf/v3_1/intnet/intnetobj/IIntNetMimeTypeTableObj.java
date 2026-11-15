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

public interface IIntNetMimeTypeTableObj
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
	 *	Instantiate a new MimeType instance.
	 *
	 *	@return	A new instance.
	 */
	IIntNetMimeTypeObj newInstance();

	/**
	 *	Instantiate a new MimeType edition of the specified MimeType instance.
	 *
	 *	@return	A new edition.
	 */
	IIntNetMimeTypeEditObj newEditInstance( IIntNetMimeTypeObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IIntNetMimeTypeObj instance, which may be a subclass of a MimeType instance.
	 */
	IIntNetMimeTypeObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IIntNetMimeTypeObj realiseMimeType( IIntNetMimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IIntNetMimeTypeObj createMimeType( IIntNetMimeTypeObj Obj );

	/**
	 *	Read a MimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetMimeTypeObj readMimeType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a MimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IIntNetMimeTypeObj readMimeType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IIntNetMimeTypeObj readCachedMimeType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeMimeType( IIntNetMimeTypeObj obj );

	void deepDisposeMimeType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IIntNetMimeTypeObj lockMimeType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the MimeType-derived instances in the database.
	 *
	 *	@return	List of IIntNetMimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetMimeTypeObj> readAllMimeType();

	/**
	 *	Return a sorted map of all the MimeType-derived instances in the database.
	 *
	 *	@return	List of IIntNetMimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IIntNetMimeTypeObj> readAllMimeType( boolean forceRead );

	List<IIntNetMimeTypeObj> readCachedAllMimeType();

	/**
	 *	Get the IntNetMimeTypeObj instance for the primary key attributes.
	 *
	 *	@param	MimeTypeId	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return	IntNetMimeTypeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetMimeTypeObj readMimeTypeByIdIdx( int MimeTypeId );

	/**
	 *	Get the IntNetMimeTypeObj instance for the primary key attributes.
	 *
	 *	@param	MimeTypeId	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return	IntNetMimeTypeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IIntNetMimeTypeObj readMimeTypeByIdIdx( int MimeTypeId,
		boolean forceRead );

	/**
	 *	Get the IntNetMimeTypeObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return	IntNetMimeTypeObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetMimeTypeObj readMimeTypeByUNameIdx(String Name );

	/**
	 *	Get the IntNetMimeTypeObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return	IntNetMimeTypeObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IIntNetMimeTypeObj readMimeTypeByUNameIdx(String Name,
		boolean forceRead );

	IIntNetMimeTypeObj readCachedMimeTypeByIdIdx( int MimeTypeId );

	IIntNetMimeTypeObj readCachedMimeTypeByUNameIdx( String Name );

	void deepDisposeMimeTypeByIdIdx( int MimeTypeId );

	void deepDisposeMimeTypeByUNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	IIntNetMimeTypeObj updateMimeType( IIntNetMimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMimeType( IIntNetMimeTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	MimeTypeId	The MimeType key attribute of the instance generating the id.
	 */
	void deleteMimeTypeByIdIdx( int MimeTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The MimeType key attribute of the instance generating the id.
	 */
	void deleteMimeTypeByUNameIdx(String Name );
}
