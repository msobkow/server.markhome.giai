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

public interface IYCFSecSecGroupFormTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecGroupForm instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSecGroupFormObj newInstance();

	/**
	 *	Instantiate a new SecGroupForm edition of the specified SecGroupForm instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSecGroupFormEditObj newEditInstance( IYCFSecSecGroupFormObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGroupFormObj realiseSecGroupForm( IYCFSecSecGroupFormObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGroupFormObj createSecGroupForm( IYCFSecSecGroupFormObj Obj );

	/**
	 *	Read a SecGroupForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroupForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecGroupFormObj readSecGroupForm( YCFSecSecGroupFormPKey pkey );

	/**
	 *	Read a SecGroupForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroupForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecGroupFormObj readSecGroupForm( YCFSecSecGroupFormPKey pkey,
		boolean forceRead );

	IYCFSecSecGroupFormObj readCachedSecGroupForm( YCFSecSecGroupFormPKey pkey );

	public void reallyDeepDisposeSecGroupForm( IYCFSecSecGroupFormObj obj );

	void deepDisposeSecGroupForm( YCFSecSecGroupFormPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGroupFormObj lockSecGroupForm( YCFSecSecGroupFormPKey pkey );

	/**
	 *	Return a sorted list of all the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readAllSecGroupForm();

	/**
	 *	Return a sorted map of all the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readAllSecGroupForm( boolean forceRead );

	List<IYCFSecSecGroupFormObj> readCachedAllSecGroupForm();

	/**
	 *	Return a sorted map of a page of the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGroupFormObj> pageAllSecGroupForm(Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Get the YCFSecSecGroupFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGroupFormObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId );

	/**
	 *	Get the YCFSecSecGroupFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGroupFormObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGroupFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecSecGroupFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGroupFormObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupFormObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Get the map of YCFSecSecGroupFormObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupFormObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGroupFormObj instances sorted by their primary keys for the duplicate AppIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupFormObj cached instances sorted by their primary keys for the duplicate AppIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the map of YCFSecSecGroupFormObj instances sorted by their primary keys for the duplicate AppIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupFormObj cached instances sorted by their primary keys for the duplicate AppIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGroupFormObj instances sorted by their primary keys for the duplicate FormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupFormObj cached instances sorted by their primary keys for the duplicate FormIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Get the map of YCFSecSecGroupFormObj instances sorted by their primary keys for the duplicate FormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupFormObj cached instances sorted by their primary keys for the duplicate FormIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		boolean forceRead );

	/**
	 *	Get the YCFSecSecGroupFormObj instance for the unique UFormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGroupFormObj cached instance for the unique UFormIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGroupFormObj readSecGroupFormByUFormIdx(long ClusterId,
		int SecGroupId,
		int SecFormId );

	/**
	 *	Get the YCFSecSecGroupFormObj instance for the unique UFormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGroupFormObj refreshed instance for the unique UFormIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGroupFormObj readSecGroupFormByUFormIdx(long ClusterId,
		int SecGroupId,
		int SecFormId,
		boolean forceRead );

	IYCFSecSecGroupFormObj readCachedSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId );

	List<IYCFSecSecGroupFormObj> readCachedSecGroupFormByClusterIdx( long ClusterId );

	List<IYCFSecSecGroupFormObj> readCachedSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId );

	List<IYCFSecSecGroupFormObj> readCachedSecGroupFormByAppIdx( long ClusterId,
		int SecAppId );

	List<IYCFSecSecGroupFormObj> readCachedSecGroupFormByFormIdx( long ClusterId,
		int SecFormId );

	IYCFSecSecGroupFormObj readCachedSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId );

	void deepDisposeSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId );

	void deepDisposeSecGroupFormByClusterIdx( long ClusterId );

	void deepDisposeSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId );

	void deepDisposeSecGroupFormByAppIdx( long ClusterId,
		int SecAppId );

	void deepDisposeSecGroupFormByFormIdx( long ClusterId,
		int SecFormId );

	void deepDisposeSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId );

	/**
	 *	Read a page of data as a List of SecGroupForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGroupForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> pageSecGroupFormByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Read a page of data as a List of SecGroupForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGroupForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> pageSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Read a page of data as a List of SecGroupForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate AppIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGroupForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> pageSecGroupFormByAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Read a page of data as a List of SecGroupForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate FormIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGroupForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFSecSecGroupFormObj> pageSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGroupFormObj updateSecGroupForm( IYCFSecSecGroupFormObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGroupForm( IYCFSecSecGroupFormObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByFormIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByUFormIdx(long ClusterId,
		int SecGroupId,
		int SecFormId );
}
