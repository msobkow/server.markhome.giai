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

public interface IYCFSecISOCtryCcyTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ISOCtryCcy instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecISOCtryCcyObj newInstance();

	/**
	 *	Instantiate a new ISOCtryCcy edition of the specified ISOCtryCcy instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecISOCtryCcyEditObj newEditInstance( IYCFSecISOCtryCcyObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryCcyObj realiseISOCtryCcy( IYCFSecISOCtryCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryCcyObj createISOCtryCcy( IYCFSecISOCtryCcyObj Obj );

	/**
	 *	Read a ISOCtryCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOCtryCcyObj readISOCtryCcy( YCFSecISOCtryCcyPKey pkey );

	/**
	 *	Read a ISOCtryCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecISOCtryCcyObj readISOCtryCcy( YCFSecISOCtryCcyPKey pkey,
		boolean forceRead );

	IYCFSecISOCtryCcyObj readCachedISOCtryCcy( YCFSecISOCtryCcyPKey pkey );

	public void reallyDeepDisposeISOCtryCcy( IYCFSecISOCtryCcyObj obj );

	void deepDisposeISOCtryCcy( YCFSecISOCtryCcyPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryCcyObj lockISOCtryCcy( YCFSecISOCtryCcyPKey pkey );

	/**
	 *	Return a sorted list of all the ISOCtryCcy-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOCtryCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOCtryCcyObj> readAllISOCtryCcy();

	/**
	 *	Return a sorted map of all the ISOCtryCcy-derived instances in the database.
	 *
	 *	@return	List of IYCFSecISOCtryCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecISOCtryCcyObj> readAllISOCtryCcy( boolean forceRead );

	List<IYCFSecISOCtryCcyObj> readCachedAllISOCtryCcy();

	/**
	 *	Get the YCFSecISOCtryCcyObj instance for the primary key attributes.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryCcyObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryCcyObj readISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Get the YCFSecISOCtryCcyObj instance for the primary key attributes.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecISOCtryCcyObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecISOCtryCcyObj readISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecISOCtryCcyObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOCtryCcyObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOCtryCcyObj> readISOCtryCcyByCtryIdx( short ISOCtryId );

	/**
	 *	Get the map of YCFSecISOCtryCcyObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOCtryCcyObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOCtryCcyObj> readISOCtryCcyByCtryIdx( short ISOCtryId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecISOCtryCcyObj instances sorted by their primary keys for the duplicate CcyIdx key.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOCtryCcyObj cached instances sorted by their primary keys for the duplicate CcyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOCtryCcyObj> readISOCtryCcyByCcyIdx( short ISOCcyId );

	/**
	 *	Get the map of YCFSecISOCtryCcyObj instances sorted by their primary keys for the duplicate CcyIdx key.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecISOCtryCcyObj cached instances sorted by their primary keys for the duplicate CcyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecISOCtryCcyObj> readISOCtryCcyByCcyIdx( short ISOCcyId,
		boolean forceRead );

	IYCFSecISOCtryCcyObj readCachedISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId );

	List<IYCFSecISOCtryCcyObj> readCachedISOCtryCcyByCtryIdx( short ISOCtryId );

	List<IYCFSecISOCtryCcyObj> readCachedISOCtryCcyByCcyIdx( short ISOCcyId );

	void deepDisposeISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId );

	void deepDisposeISOCtryCcyByCtryIdx( short ISOCtryId );

	void deepDisposeISOCtryCcyByCcyIdx( short ISOCcyId );

	/**
	 *	Internal use only.
	 */
	IYCFSecISOCtryCcyObj updateISOCtryCcy( IYCFSecISOCtryCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCtryCcy( IYCFSecISOCtryCcyObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	void deleteISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	void deleteISOCtryCcyByCtryIdx( short ISOCtryId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	void deleteISOCtryCcyByCcyIdx( short ISOCcyId );
}
