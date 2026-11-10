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

public interface IYCFSecISOCcyTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ISOCcy instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecISOCcyObj newInstance();

	/**
	 *	Instantiate a new ISOCcy edition of the specified ISOCcy instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecISOCcyEditObj newEditInstance( IYCFSecISOCcyObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCcyObj realiseISOCcy( IYCFSecISOCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCcyObj createISOCcy( IYCFSecISOCcyObj Obj );

	/**
	 *	Read a ISOCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOCcyObj readISOCcy( YCFSecISOCcyPKey pkey );

	/**
	 *	Read a ISOCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOCcyObj readISOCcy( YCFSecISOCcyPKey pkey,
		boolean forceRead );

	IYCFSecISOCcyObj readCachedISOCcy( YCFSecISOCcyPKey pkey );

	public void reallyDeepDisposeISOCcy( IYCFSecISOCcyObj obj );

	void deepDisposeISOCcy( YCFSecISOCcyPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCcyObj lockISOCcy( YCFSecISOCcyPKey pkey );

	/**
	 *	Return a sorted list of all the ISOCcy-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOCcyObj> readAllISOCcy();

	/**
	 *	Return a sorted map of all the ISOCcy-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOCcyObj> readAllISOCcy( boolean forceRead );

	List<IYCFSecISOCcyObj> readCachedAllISOCcy();

	/**
	 *	Get the YCFSecISOCcyObj instance for the primary key attributes.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCcyObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCcyObj readISOCcyByIdIdx( short ISOCcyId );

	/**
	 *	Get the YCFSecISOCcyObj instance for the primary key attributes.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCcyObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCcyObj readISOCcyByIdIdx( short ISOCcyId,
		boolean forceRead );

	/**
	 *	Get the YCFSecISOCcyObj instance for the unique CcyCdIdx key.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCcyObj cached instance for the unique CcyCdIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCcyObj readISOCcyByCcyCdIdx(String ISOCode );

	/**
	 *	Get the YCFSecISOCcyObj instance for the unique CcyCdIdx key.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCcyObj refreshed instance for the unique CcyCdIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCcyObj readISOCcyByCcyCdIdx(String ISOCode,
		boolean forceRead );

	/**
	 *	Get the YCFSecISOCcyObj instance for the unique CcyNmIdx key.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCcyObj cached instance for the unique CcyNmIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCcyObj readISOCcyByCcyNmIdx(String Name );

	/**
	 *	Get the YCFSecISOCcyObj instance for the unique CcyNmIdx key.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCcyObj refreshed instance for the unique CcyNmIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCcyObj readISOCcyByCcyNmIdx(String Name,
		boolean forceRead );

	IYCFSecISOCcyObj readCachedISOCcyByIdIdx( short ISOCcyId );

	IYCFSecISOCcyObj readCachedISOCcyByCcyCdIdx( String ISOCode );

	IYCFSecISOCcyObj readCachedISOCcyByCcyNmIdx( String Name );

	void deepDisposeISOCcyByIdIdx( short ISOCcyId );

	void deepDisposeISOCcyByCcyCdIdx( String ISOCode );

	void deepDisposeISOCcyByCcyNmIdx( String Name );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCcyObj updateISOCcy( IYCFSecISOCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCcy( IYCFSecISOCcyObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByIdIdx( short ISOCcyId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyCdIdx(String ISOCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyNmIdx(String Name );
}
