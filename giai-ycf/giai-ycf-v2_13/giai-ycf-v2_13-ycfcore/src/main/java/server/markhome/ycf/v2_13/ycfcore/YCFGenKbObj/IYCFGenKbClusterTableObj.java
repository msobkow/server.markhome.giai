// Description: Java 11 Table Object interface for YCFGenKb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public interface IYCFGenKbClusterTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Cluster instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbClusterObj newInstance();

	/**
	 *	Instantiate a new Cluster edition of the specified Cluster instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbClusterEditObj newEditInstance( IYCFGenKbClusterObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbClusterObj realiseCluster( IYCFGenKbClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbClusterObj createCluster( IYCFGenKbClusterObj Obj );

	/**
	 *	Read a Cluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Cluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbClusterObj readCluster( YCFGenKbClusterPKey pkey );

	/**
	 *	Read a Cluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Cluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbClusterObj readCluster( YCFGenKbClusterPKey pkey,
		boolean forceRead );

	IYCFGenKbClusterObj readCachedCluster( YCFGenKbClusterPKey pkey );

	public void reallyDeepDisposeCluster( IYCFGenKbClusterObj obj );

	void deepDisposeCluster( YCFGenKbClusterPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbClusterObj lockCluster( YCFGenKbClusterPKey pkey );

	/**
	 *	Return a sorted list of all the Cluster-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbClusterObj> readAllCluster();

	/**
	 *	Return a sorted map of all the Cluster-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbClusterObj> readAllCluster( boolean forceRead );

	List<IYCFGenKbClusterObj> readCachedAllCluster();

	/**
	 *	Return a sorted map of a page of the Cluster-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbClusterObj> pageAllCluster(Long priorId );

	/**
	 *	Get the YCFGenKbClusterObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbClusterObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbClusterObj readClusterByIdIdx( long Id );

	/**
	 *	Get the YCFGenKbClusterObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbClusterObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbClusterObj readClusterByIdIdx( long Id,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbClusterObj instance for the unique UDomNameIdx key.
	 *
	 *	@param	argFullDomName	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbClusterObj cached instance for the unique UDomNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbClusterObj readClusterByUDomNameIdx(String FullDomName );

	/**
	 *	Get the YCFGenKbClusterObj instance for the unique UDomNameIdx key.
	 *
	 *	@param	argFullDomName	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbClusterObj refreshed instance for the unique UDomNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbClusterObj readClusterByUDomNameIdx(String FullDomName,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbClusterObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argDescription	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbClusterObj cached instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbClusterObj readClusterByUDescrIdx(String Description );

	/**
	 *	Get the YCFGenKbClusterObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argDescription	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbClusterObj refreshed instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbClusterObj readClusterByUDescrIdx(String Description,
		boolean forceRead );

	IYCFGenKbClusterObj readCachedClusterByIdIdx( long Id );

	IYCFGenKbClusterObj readCachedClusterByUDomNameIdx( String FullDomName );

	IYCFGenKbClusterObj readCachedClusterByUDescrIdx( String Description );

	void deepDisposeClusterByIdIdx( long Id );

	void deepDisposeClusterByUDomNameIdx( String FullDomName );

	void deepDisposeClusterByUDescrIdx( String Description );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbClusterObj updateCluster( IYCFGenKbClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteCluster( IYCFGenKbClusterObj Obj );

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

	IYCFGenKbClusterObj getSystemCluster();
}
