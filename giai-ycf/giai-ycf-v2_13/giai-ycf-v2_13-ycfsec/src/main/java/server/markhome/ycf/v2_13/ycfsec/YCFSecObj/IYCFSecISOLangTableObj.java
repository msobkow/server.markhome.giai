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

public interface IYCFSecISOLangTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ISOLang instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecISOLangObj newInstance();

	/**
	 *	Instantiate a new ISOLang edition of the specified ISOLang instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecISOLangEditObj newEditInstance( IYCFSecISOLangObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOLangObj realiseISOLang( IYCFSecISOLangObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOLangObj createISOLang( IYCFSecISOLangObj Obj );

	/**
	 *	Read a ISOLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOLangObj readISOLang( YCFSecISOLangPKey pkey );

	/**
	 *	Read a ISOLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOLangObj readISOLang( YCFSecISOLangPKey pkey,
		boolean forceRead );

	IYCFSecISOLangObj readCachedISOLang( YCFSecISOLangPKey pkey );

	public void reallyDeepDisposeISOLang( IYCFSecISOLangObj obj );

	void deepDisposeISOLang( YCFSecISOLangPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOLangObj lockISOLang( YCFSecISOLangPKey pkey );

	/**
	 *	Return a sorted list of all the ISOLang-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOLangObj> readAllISOLang();

	/**
	 *	Return a sorted map of all the ISOLang-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOLangObj> readAllISOLang( boolean forceRead );

	List<IYCFSecISOLangObj> readCachedAllISOLang();

	/**
	 *	Get the YCFSecISOLangObj instance for the primary key attributes.
	 *
	 *	@param	argISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOLangObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOLangObj readISOLangByIdIdx( short ISOLangId );

	/**
	 *	Get the YCFSecISOLangObj instance for the primary key attributes.
	 *
	 *	@param	argISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOLangObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOLangObj readISOLangByIdIdx( short ISOLangId,
		boolean forceRead );

	/**
	 *	Get the YCFSecISOLangObj instance for the unique Code3Idx key.
	 *
	 *	@param	argISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOLangObj cached instance for the unique Code3Idx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOLangObj readISOLangByCode3Idx(String ISO6392Code );

	/**
	 *	Get the YCFSecISOLangObj instance for the unique Code3Idx key.
	 *
	 *	@param	argISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOLangObj refreshed instance for the unique Code3Idx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOLangObj readISOLangByCode3Idx(String ISO6392Code,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecISOLangObj instances sorted by their primary keys for the duplicate Code2Idx key.
	 *
	 *	@param	argISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOLangObj cached instances sorted by their primary keys for the duplicate Code2Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOLangObj> readISOLangByCode2Idx( String ISO6391Code );

	/**
	 *	Get the map of YCFSecISOLangObj instances sorted by their primary keys for the duplicate Code2Idx key.
	 *
	 *	@param	argISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOLangObj cached instances sorted by their primary keys for the duplicate Code2Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOLangObj> readISOLangByCode2Idx( String ISO6391Code,
		boolean forceRead );

	IYCFSecISOLangObj readCachedISOLangByIdIdx( short ISOLangId );

	IYCFSecISOLangObj readCachedISOLangByCode3Idx( String ISO6392Code );

	List<IYCFSecISOLangObj> readCachedISOLangByCode2Idx( String ISO6391Code );

	void deepDisposeISOLangByIdIdx( short ISOLangId );

	void deepDisposeISOLangByCode3Idx( String ISO6392Code );

	void deepDisposeISOLangByCode2Idx( String ISO6391Code );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOLangObj updateISOLang( IYCFSecISOLangObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOLang( IYCFSecISOLangObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOLangId	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByIdIdx( short ISOLangId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISO6392Code	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByCode3Idx(String ISO6392Code );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISO6391Code	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByCode2Idx( String ISO6391Code );
}
