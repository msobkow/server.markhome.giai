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

public interface IYCFSecClusterTableObj
{
	IYCFSecSchemaObj getSchema();
	void setSchema( IYCFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Cluster instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFSecClusterObj newInstance();

	/**
	 *	Instantiate a new Cluster edition of the specified Cluster instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFSecClusterEditObj newEditInstance( IYCFSecClusterObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFSecClusterObj realiseCluster( IYCFSecClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFSecClusterObj createCluster( IYCFSecClusterObj Obj );

	/**
	 *	Read a Cluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Cluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecClusterObj readCluster( YCFSecClusterPKey pkey );

	/**
	 *	Read a Cluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Cluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFSecClusterObj readCluster( YCFSecClusterPKey pkey,
		boolean forceRead );

	IYCFSecClusterObj readCachedCluster( YCFSecClusterPKey pkey );

	public void reallyDeepDisposeCluster( IYCFSecClusterObj obj );

	void deepDisposeCluster( YCFSecClusterPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFSecClusterObj lockCluster( YCFSecClusterPKey pkey );

	/**
	 *	Return a sorted list of all the Cluster-derived instances in the database.
	 *
	 *	@return	List of IYCFSecClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecClusterObj> readAllCluster();

	/**
	 *	Return a sorted map of all the Cluster-derived instances in the database.
	 *
	 *	@return	List of IYCFSecClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecClusterObj> readAllCluster( boolean forceRead );

	List<IYCFSecClusterObj> readCachedAllCluster();

	/**
	 *	Return a sorted map of a page of the Cluster-derived instances in the database.
	 *
	 *	@return	List of IYCFSecClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFSecClusterObj> pageAllCluster(Long priorId );

	/**
	 *	Get the YCFSecClusterObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecClusterObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecClusterObj readClusterByIdIdx( long Id );

	/**
	 *	Get the YCFSecClusterObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecClusterObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFSecClusterObj readClusterByIdIdx( long Id,
		boolean forceRead );

	/**
	 *	Get the YCFSecClusterObj instance for the unique UDomNameIdx key.
	 *
	 *	@param	argFullDomName	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecClusterObj cached instance for the unique UDomNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecClusterObj readClusterByUDomNameIdx(String FullDomName );

	/**
	 *	Get the YCFSecClusterObj instance for the unique UDomNameIdx key.
	 *
	 *	@param	argFullDomName	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecClusterObj refreshed instance for the unique UDomNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecClusterObj readClusterByUDomNameIdx(String FullDomName,
		boolean forceRead );

	/**
	 *	Get the YCFSecClusterObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argDescription	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecClusterObj cached instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecClusterObj readClusterByUDescrIdx(String Description );

	/**
	 *	Get the YCFSecClusterObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argDescription	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFSecClusterObj refreshed instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFSecClusterObj readClusterByUDescrIdx(String Description,
		boolean forceRead );

	IYCFSecClusterObj readCachedClusterByIdIdx( long Id );

	IYCFSecClusterObj readCachedClusterByUDomNameIdx( String FullDomName );

	IYCFSecClusterObj readCachedClusterByUDescrIdx( String Description );

	void deepDisposeClusterByIdIdx( long Id );

	void deepDisposeClusterByUDomNameIdx( String FullDomName );

	void deepDisposeClusterByUDescrIdx( String Description );

	/**
	 *	Internal use only.
	 */
	IYCFSecClusterObj updateCluster( IYCFSecClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteCluster( IYCFSecClusterObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The Cluster key attribute of the instance generating the id.
	 */
	void deleteClusterByIdIdx( long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argFullDomName	The Cluster key attribute of the instance generating the id.
	 */
	void deleteClusterByUDomNameIdx(String FullDomName );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDescription	The Cluster key attribute of the instance generating the id.
	 */
	void deleteClusterByUDescrIdx(String Description );

	IYCFSecClusterObj getSystemCluster();
}
