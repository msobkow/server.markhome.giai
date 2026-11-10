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

public interface IYCFSecSecFormTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecForm instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSecFormObj newInstance();

	/**
	 *	Instantiate a new SecForm edition of the specified SecForm instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSecFormEditObj newEditInstance( IYCFSecSecFormObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecFormObj realiseSecForm( IYCFSecSecFormObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecFormObj createSecForm( IYCFSecSecFormObj Obj );

	/**
	 *	Read a SecForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecFormObj readSecForm( YCFSecSecFormPKey pkey );

	/**
	 *	Read a SecForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecFormObj readSecForm( YCFSecSecFormPKey pkey,
		boolean forceRead );

	IYCFSecSecFormObj readCachedSecForm( YCFSecSecFormPKey pkey );

	public void reallyDeepDisposeSecForm( IYCFSecSecFormObj obj );

	void deepDisposeSecForm( YCFSecSecFormPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecFormObj lockSecForm( YCFSecSecFormPKey pkey );

	/**
	 *	Return a sorted list of all the SecForm-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecFormObj> readAllSecForm();

	/**
	 *	Return a sorted map of all the SecForm-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecFormObj> readAllSecForm( boolean forceRead );

	List<IYCFSecSecFormObj> readCachedAllSecForm();

	/**
	 *	Return a sorted map of a page of the SecForm-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecFormObj> pageAllSecForm(Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Get the YCFSecSecFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecFormObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Get the YCFSecSecFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecFormObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecFormObj> readSecFormByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecSecFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecFormObj> readSecFormByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecFormObj instances sorted by their primary keys for the duplicate SecAppIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecFormObj cached instances sorted by their primary keys for the duplicate SecAppIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the map of YCFSecSecFormObj instances sorted by their primary keys for the duplicate SecAppIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecFormObj cached instances sorted by their primary keys for the duplicate SecAppIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the YCFSecSecFormObj instance for the unique UJEEServletIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecFormObj cached instance for the unique UJEEServletIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecFormObj readSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	/**
	 *	Get the YCFSecSecFormObj instance for the unique UJEEServletIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecFormObj refreshed instance for the unique UJEEServletIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecFormObj readSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName,
		boolean forceRead );

	IYCFSecSecFormObj readCachedSecFormByIdIdx( long ClusterId,
		int SecFormId );

	List<IYCFSecSecFormObj> readCachedSecFormByClusterIdx( long ClusterId );

	List<IYCFSecSecFormObj> readCachedSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	IYCFSecSecFormObj readCachedSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	void deepDisposeSecFormByIdIdx( long ClusterId,
		int SecFormId );

	void deepDisposeSecFormByClusterIdx( long ClusterId );

	void deepDisposeSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	void deepDisposeSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecFormObj> pageSecFormByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecAppIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecFormObj> pageSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecFormObj updateSecForm( IYCFSecSecFormObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecForm( IYCFSecSecFormObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByIdIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName );
}
