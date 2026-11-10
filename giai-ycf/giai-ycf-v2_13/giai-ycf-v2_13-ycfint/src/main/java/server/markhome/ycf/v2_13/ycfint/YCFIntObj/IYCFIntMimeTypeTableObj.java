// Description: Java 11 Table Object interface for YCFInt.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFIntMimeTypeTableObj
{
	IYCFIntSchemaObj getSchema();
	void setSchema( IYCFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new MimeType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFIntMimeTypeObj newInstance();

	/**
	 *	Instantiate a new MimeType edition of the specified MimeType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFIntMimeTypeEditObj newEditInstance( IYCFIntMimeTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFIntMimeTypeObj realiseMimeType( IYCFIntMimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFIntMimeTypeObj createMimeType( IYCFIntMimeTypeObj Obj );

	/**
	 *	Read a MimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntMimeTypeObj readMimeType( YCFIntMimeTypePKey pkey );

	/**
	 *	Read a MimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntMimeTypeObj readMimeType( YCFIntMimeTypePKey pkey,
		boolean forceRead );

	IYCFIntMimeTypeObj readCachedMimeType( YCFIntMimeTypePKey pkey );

	public void reallyDeepDisposeMimeType( IYCFIntMimeTypeObj obj );

	void deepDisposeMimeType( YCFIntMimeTypePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFIntMimeTypeObj lockMimeType( YCFIntMimeTypePKey pkey );

	/**
	 *	Return a sorted list of all the MimeType-derived instances in the database.
	 *
	 *	@return	List of IYCFIntMimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntMimeTypeObj> readAllMimeType();

	/**
	 *	Return a sorted map of all the MimeType-derived instances in the database.
	 *
	 *	@return	List of IYCFIntMimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntMimeTypeObj> readAllMimeType( boolean forceRead );

	List<IYCFIntMimeTypeObj> readCachedAllMimeType();

	/**
	 *	Get the YCFIntMimeTypeObj instance for the primary key attributes.
	 *
	 *	@param	argMimeTypeId	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMimeTypeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMimeTypeObj readMimeTypeByIdIdx( int MimeTypeId );

	/**
	 *	Get the YCFIntMimeTypeObj instance for the primary key attributes.
	 *
	 *	@param	argMimeTypeId	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMimeTypeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMimeTypeObj readMimeTypeByIdIdx( int MimeTypeId,
		boolean forceRead );

	/**
	 *	Get the YCFIntMimeTypeObj instance for the unique UNameIdx key.
	 *
	 *	@param	argName	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMimeTypeObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMimeTypeObj readMimeTypeByUNameIdx(String Name );

	/**
	 *	Get the YCFIntMimeTypeObj instance for the unique UNameIdx key.
	 *
	 *	@param	argName	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntMimeTypeObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntMimeTypeObj readMimeTypeByUNameIdx(String Name,
		boolean forceRead );

	IYCFIntMimeTypeObj readCachedMimeTypeByIdIdx( int MimeTypeId );

	IYCFIntMimeTypeObj readCachedMimeTypeByUNameIdx( String Name );

	void deepDisposeMimeTypeByIdIdx( int MimeTypeId );

	void deepDisposeMimeTypeByUNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	IYCFIntMimeTypeObj updateMimeType( IYCFIntMimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMimeType( IYCFIntMimeTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argMimeTypeId	The MimeType key attribute of the instance generating the id.
	 */
	void deleteMimeTypeByIdIdx( int MimeTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The MimeType key attribute of the instance generating the id.
	 */
	void deleteMimeTypeByUNameIdx(String Name );
}
