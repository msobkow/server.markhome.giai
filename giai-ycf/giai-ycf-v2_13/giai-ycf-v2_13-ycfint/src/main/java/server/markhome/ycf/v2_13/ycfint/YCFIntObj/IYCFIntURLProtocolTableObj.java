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

public interface IYCFIntURLProtocolTableObj
{
	IYCFIntSchemaObj getSchema();
	void setSchema( IYCFIntSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new URLProtocol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFIntURLProtocolObj newInstance();

	/**
	 *	Instantiate a new URLProtocol edition of the specified URLProtocol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFIntURLProtocolEditObj newEditInstance( IYCFIntURLProtocolObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFIntURLProtocolObj realiseURLProtocol( IYCFIntURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFIntURLProtocolObj createURLProtocol( IYCFIntURLProtocolObj Obj );

	/**
	 *	Read a URLProtocol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The URLProtocol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntURLProtocolObj readURLProtocol( YCFIntURLProtocolPKey pkey );

	/**
	 *	Read a URLProtocol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The URLProtocol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFIntURLProtocolObj readURLProtocol( YCFIntURLProtocolPKey pkey,
		boolean forceRead );

	IYCFIntURLProtocolObj readCachedURLProtocol( YCFIntURLProtocolPKey pkey );

	public void reallyDeepDisposeURLProtocol( IYCFIntURLProtocolObj obj );

	void deepDisposeURLProtocol( YCFIntURLProtocolPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFIntURLProtocolObj lockURLProtocol( YCFIntURLProtocolPKey pkey );

	/**
	 *	Return a sorted list of all the URLProtocol-derived instances in the database.
	 *
	 *	@return	List of IYCFIntURLProtocolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntURLProtocolObj> readAllURLProtocol();

	/**
	 *	Return a sorted map of all the URLProtocol-derived instances in the database.
	 *
	 *	@return	List of IYCFIntURLProtocolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFIntURLProtocolObj> readAllURLProtocol( boolean forceRead );

	List<IYCFIntURLProtocolObj> readCachedAllURLProtocol();

	/**
	 *	Get the YCFIntURLProtocolObj instance for the primary key attributes.
	 *
	 *	@param	argURLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntURLProtocolObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId );

	/**
	 *	Get the YCFIntURLProtocolObj instance for the primary key attributes.
	 *
	 *	@param	argURLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntURLProtocolObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFIntURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId,
		boolean forceRead );

	/**
	 *	Get the YCFIntURLProtocolObj instance for the unique UNameIdx key.
	 *
	 *	@param	argName	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntURLProtocolObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntURLProtocolObj readURLProtocolByUNameIdx(String Name );

	/**
	 *	Get the YCFIntURLProtocolObj instance for the unique UNameIdx key.
	 *
	 *	@param	argName	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	YCFIntURLProtocolObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFIntURLProtocolObj readURLProtocolByUNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFIntURLProtocolObj instances sorted by their primary keys for the duplicate IsSecureIdx key.
	 *
	 *	@param	argIsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntURLProtocolObj cached instances sorted by their primary keys for the duplicate IsSecureIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure );

	/**
	 *	Get the map of YCFIntURLProtocolObj instances sorted by their primary keys for the duplicate IsSecureIdx key.
	 *
	 *	@param	argIsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFIntURLProtocolObj cached instances sorted by their primary keys for the duplicate IsSecureIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFIntURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure,
		boolean forceRead );

	IYCFIntURLProtocolObj readCachedURLProtocolByIdIdx( int URLProtocolId );

	IYCFIntURLProtocolObj readCachedURLProtocolByUNameIdx( String Name );

	List<IYCFIntURLProtocolObj> readCachedURLProtocolByIsSecureIdx( boolean IsSecure );

	void deepDisposeURLProtocolByIdIdx( int URLProtocolId );

	void deepDisposeURLProtocolByUNameIdx( String Name );

	void deepDisposeURLProtocolByIsSecureIdx( boolean IsSecure );

	/**
	 *	Internal use only.
	 */
	IYCFIntURLProtocolObj updateURLProtocol( IYCFIntURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteURLProtocol( IYCFIntURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argURLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByIdIdx( int URLProtocolId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByUNameIdx(String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argIsSecure	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByIsSecureIdx( boolean IsSecure );
}
