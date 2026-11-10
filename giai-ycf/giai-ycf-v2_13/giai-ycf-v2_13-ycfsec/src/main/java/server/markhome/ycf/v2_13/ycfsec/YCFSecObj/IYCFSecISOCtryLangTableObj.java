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

public interface IYCFSecISOCtryLangTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ISOCtryLang instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecISOCtryLangObj newInstance();

	/**
	 *	Instantiate a new ISOCtryLang edition of the specified ISOCtryLang instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecISOCtryLangEditObj newEditInstance( IYCFSecISOCtryLangObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryLangObj realiseISOCtryLang( IYCFSecISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryLangObj createISOCtryLang( IYCFSecISOCtryLangObj Obj );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOCtryLangObj readISOCtryLang( YCFSecISOCtryLangPKey pkey );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOCtryLangObj readISOCtryLang( YCFSecISOCtryLangPKey pkey,
		boolean forceRead );

	IYCFSecISOCtryLangObj readCachedISOCtryLang( YCFSecISOCtryLangPKey pkey );

	public void reallyDeepDisposeISOCtryLang( IYCFSecISOCtryLangObj obj );

	void deepDisposeISOCtryLang( YCFSecISOCtryLangPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryLangObj lockISOCtryLang( YCFSecISOCtryLangPKey pkey );

	/**
	 *	Return a sorted list of all the ISOCtryLang-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOCtryLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOCtryLangObj> readAllISOCtryLang();

	/**
	 *	Return a sorted map of all the ISOCtryLang-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOCtryLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOCtryLangObj> readAllISOCtryLang( boolean forceRead );

	List<IYCFSecISOCtryLangObj> readCachedAllISOCtryLang();

	/**
	 *	Get the YCFSecISOCtryLangObj instance for the primary key attributes.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryLangObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	/**
	 *	Get the YCFSecISOCtryLangObj instance for the primary key attributes.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryLangObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecISOCtryLangObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOCtryLangObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId );

	/**
	 *	Get the map of YCFSecISOCtryLangObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOCtryLangObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecISOCtryLangObj instances sorted by their primary keys for the duplicate LangIdx key.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOCtryLangObj cached instances sorted by their primary keys for the duplicate LangIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId );

	/**
	 *	Get the map of YCFSecISOCtryLangObj instances sorted by their primary keys for the duplicate LangIdx key.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOCtryLangObj cached instances sorted by their primary keys for the duplicate LangIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId,
		boolean forceRead );

	IYCFSecISOCtryLangObj readCachedISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	List<IYCFSecISOCtryLangObj> readCachedISOCtryLangByCtryIdx( short ISOCtryId );

	List<IYCFSecISOCtryLangObj> readCachedISOCtryLangByLangIdx( short ISOLangId );

	void deepDisposeISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	void deepDisposeISOCtryLangByCtryIdx( short ISOCtryId );

	void deepDisposeISOCtryLangByLangIdx( short ISOLangId );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryLangObj updateISOCtryLang( IYCFSecISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCtryLang( IYCFSecISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByCtryIdx( short ISOCtryId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByLangIdx( short ISOLangId );
}
