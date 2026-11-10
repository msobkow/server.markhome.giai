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

public interface IYCFSecSecGroupTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecGroup instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecSecGroupObj newInstance();

	/**
	 *	Instantiate a new SecGroup edition of the specified SecGroup instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecSecGroupEditObj newEditInstance( IYCFSecSecGroupObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGroupObj realiseSecGroup( IYCFSecSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGroupObj createSecGroup( IYCFSecSecGroupObj Obj );

	/**
	 *	Read a SecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecGroupObj readSecGroup( YCFSecSecGroupPKey pkey );

	/**
	 *	Read a SecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecSecGroupObj readSecGroup( YCFSecSecGroupPKey pkey,
		boolean forceRead );

	IYCFSecSecGroupObj readCachedSecGroup( YCFSecSecGroupPKey pkey );

	public void reallyDeepDisposeSecGroup( IYCFSecSecGroupObj obj );

	void deepDisposeSecGroup( YCFSecSecGroupPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGroupObj lockSecGroup( YCFSecSecGroupPKey pkey );

	/**
	 *	Return a sorted list of all the SecGroup-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGroupObj> readAllSecGroup();

	/**
	 *	Return a sorted map of all the SecGroup-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecSecGroupObj> readAllSecGroup( boolean forceRead );

	List<IYCFSecSecGroupObj> readCachedAllSecGroup();

	/**
	 *	Get the YCFSecSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGroupObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Get the YCFSecSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGroupObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGroupObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupObj> readSecGroupByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFSecSecGroupObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupObj> readSecGroupByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFSecSecGroupObj instances sorted by their primary keys for the duplicate ClusterVisIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible );

	/**
	 *	Get the map of YCFSecSecGroupObj instances sorted by their primary keys for the duplicate ClusterVisIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFSecSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFSecSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible,
		boolean forceRead );

	/**
	 *	Get the YCFSecSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGroupObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGroupObj readSecGroupByUNameIdx(long ClusterId,
		String Name );

	/**
	 *	Get the YCFSecSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecSecGroupObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecSecGroupObj readSecGroupByUNameIdx(long ClusterId,
		String Name,
		boolean forceRead );

	IYCFSecSecGroupObj readCachedSecGroupByIdIdx( long ClusterId,
		int SecGroupId );

	List<IYCFSecSecGroupObj> readCachedSecGroupByClusterIdx( long ClusterId );

	List<IYCFSecSecGroupObj> readCachedSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible );

	IYCFSecSecGroupObj readCachedSecGroupByUNameIdx( long ClusterId,
		String Name );

	void deepDisposeSecGroupByIdIdx( long ClusterId,
		int SecGroupId );

	void deepDisposeSecGroupByClusterIdx( long ClusterId );

	void deepDisposeSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible );

	void deepDisposeSecGroupByUNameIdx( long ClusterId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFSecSecGroupObj updateSecGroup( IYCFSecSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGroup( IYCFSecSecGroupObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByIdIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByUNameIdx(long ClusterId,
		String Name );
}
