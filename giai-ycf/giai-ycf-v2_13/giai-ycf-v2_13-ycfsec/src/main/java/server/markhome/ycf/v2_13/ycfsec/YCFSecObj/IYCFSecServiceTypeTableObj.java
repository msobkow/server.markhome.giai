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

public interface IYCFSecServiceTypeTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ServiceType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecServiceTypeObj newInstance();

	/**
	 *	Instantiate a new ServiceType edition of the specified ServiceType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecServiceTypeEditObj newEditInstance( IYCFSecServiceTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecServiceTypeObj realiseServiceType( IYCFSecServiceTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecServiceTypeObj createServiceType( IYCFSecServiceTypeObj Obj );

	/**
	 *	Read a ServiceType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServiceType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecServiceTypeObj readServiceType( YCFSecServiceTypePKey pkey );

	/**
	 *	Read a ServiceType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServiceType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecServiceTypeObj readServiceType( YCFSecServiceTypePKey pkey,
		boolean forceRead );

	IYCFSecServiceTypeObj readCachedServiceType( YCFSecServiceTypePKey pkey );

	public void reallyDeepDisposeServiceType( IYCFSecServiceTypeObj obj );

	void deepDisposeServiceType( YCFSecServiceTypePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecServiceTypeObj lockServiceType( YCFSecServiceTypePKey pkey );

	/**
	 *	Return a sorted list of all the ServiceType-derived instances in the database.
	 *
	 *	@return	List of IYCFSecServiceTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecServiceTypeObj> readAllServiceType();

	/**
	 *	Return a sorted map of all the ServiceType-derived instances in the database.
	 *
	 *	@return	List of IYCFSecServiceTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecServiceTypeObj> readAllServiceType( boolean forceRead );

	List<IYCFSecServiceTypeObj> readCachedAllServiceType();

	/**
	 *	Get the YCFSecServiceTypeObj instance for the primary key attributes.
	 *
	 *	@param	argServiceTypeId	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceTypeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceTypeObj readServiceTypeByIdIdx( int ServiceTypeId );

	/**
	 *	Get the YCFSecServiceTypeObj instance for the primary key attributes.
	 *
	 *	@param	argServiceTypeId	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceTypeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceTypeObj readServiceTypeByIdIdx( int ServiceTypeId,
		boolean forceRead );

	/**
	 *	Get the YCFSecServiceTypeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argDescription	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceTypeObj cached instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceTypeObj readServiceTypeByUDescrIdx(String Description );

	/**
	 *	Get the YCFSecServiceTypeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argDescription	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecServiceTypeObj refreshed instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecServiceTypeObj readServiceTypeByUDescrIdx(String Description,
		boolean forceRead );

	IYCFSecServiceTypeObj readCachedServiceTypeByIdIdx( int ServiceTypeId );

	IYCFSecServiceTypeObj readCachedServiceTypeByUDescrIdx( String Description );

	void deepDisposeServiceTypeByIdIdx( int ServiceTypeId );

	void deepDisposeServiceTypeByUDescrIdx( String Description );

	/**
	 *	Internal use only.
	 */
	IYCFSecServiceTypeObj updateServiceType( IYCFSecServiceTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServiceType( IYCFSecServiceTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argServiceTypeId	The ServiceType key attribute of the instance generating the id.
	 */
	void deleteServiceTypeByIdIdx( int ServiceTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDescription	The ServiceType key attribute of the instance generating the id.
	 */
	void deleteServiceTypeByUDescrIdx(String Description );
}
