// Description: Java 11 Table Object interface for YCFSec.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public interface IYCFSecISOCtryTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ISOCtry instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecISOCtryObj newInstance();

	/**
	 *	Instantiate a new ISOCtry edition of the specified ISOCtry instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecISOCtryEditObj newEditInstance( IYCFSecISOCtryObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryObj realiseISOCtry( IYCFSecISOCtryObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryObj createISOCtry( IYCFSecISOCtryObj Obj );

	/**
	 *	Read a ISOCtry-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtry-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOCtryObj readISOCtry( YCFSecISOCtryPKey pkey );

	/**
	 *	Read a ISOCtry-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtry-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOCtryObj readISOCtry( YCFSecISOCtryPKey pkey,
		boolean forceRead );

	IYCFSecISOCtryObj readCachedISOCtry( YCFSecISOCtryPKey pkey );

	public void reallyDeepDisposeISOCtry( IYCFSecISOCtryObj obj );

	void deepDisposeISOCtry( YCFSecISOCtryPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryObj lockISOCtry( YCFSecISOCtryPKey pkey );

	/**
	 *	Return a sorted list of all the ISOCtry-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOCtryObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOCtryObj> readAllISOCtry();

	/**
	 *	Return a sorted map of all the ISOCtry-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOCtryObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOCtryObj> readAllISOCtry( boolean forceRead );

	List<IYCFSecISOCtryObj> readCachedAllISOCtry();

	/**
	 *	Get the YCFSecISOCtryObj instance for the primary key attributes.
	 *
	 *	@param	argISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryObj readISOCtryByIdIdx( short ISOCtryId );

	/**
	 *	Get the YCFSecISOCtryObj instance for the primary key attributes.
	 *
	 *	@param	argISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryObj readISOCtryByIdIdx( short ISOCtryId,
		boolean forceRead );

	/**
	 *	Get the YCFSecISOCtryObj instance for the unique ISOCodeIdx key.
	 *
	 *	@param	argISOCode	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryObj cached instance for the unique ISOCodeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryObj readISOCtryByISOCodeIdx(String ISOCode );

	/**
	 *	Get the YCFSecISOCtryObj instance for the unique ISOCodeIdx key.
	 *
	 *	@param	argISOCode	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryObj refreshed instance for the unique ISOCodeIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryObj readISOCtryByISOCodeIdx(String ISOCode,
		boolean forceRead );

	/**
	 *	Get the YCFSecISOCtryObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryObj readISOCtryByNameIdx(String Name );

	/**
	 *	Get the YCFSecISOCtryObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The ISOCtry key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryObj readISOCtryByNameIdx(String Name,
		boolean forceRead );

	IYCFSecISOCtryObj readCachedISOCtryByIdIdx( short ISOCtryId );

	IYCFSecISOCtryObj readCachedISOCtryByISOCodeIdx( String ISOCode );

	IYCFSecISOCtryObj readCachedISOCtryByNameIdx( String Name );

	void deepDisposeISOCtryByIdIdx( short ISOCtryId );

	void deepDisposeISOCtryByISOCodeIdx( String ISOCode );

	void deepDisposeISOCtryByNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryObj updateISOCtry( IYCFSecISOCtryObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCtry( IYCFSecISOCtryObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCtryId	The ISOCtry key attribute of the instance generating the id.
	 */
	void deleteISOCtryByIdIdx( short ISOCtryId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCode	The ISOCtry key attribute of the instance generating the id.
	 */
	void deleteISOCtryByISOCodeIdx(String ISOCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The ISOCtry key attribute of the instance generating the id.
	 */
	void deleteISOCtryByNameIdx(String Name );
}
