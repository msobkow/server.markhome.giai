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

public interface IYCFGenKbHostNodeTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new HostNode instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbHostNodeObj newInstance();

	/**
	 *	Instantiate a new HostNode edition of the specified HostNode instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbHostNodeEditObj newEditInstance( IYCFGenKbHostNodeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbHostNodeObj realiseHostNode( IYCFGenKbHostNodeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbHostNodeObj createHostNode( IYCFGenKbHostNodeObj Obj );

	/**
	 *	Read a HostNode-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The HostNode-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbHostNodeObj readHostNode( YCFGenKbHostNodePKey pkey );

	/**
	 *	Read a HostNode-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The HostNode-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbHostNodeObj readHostNode( YCFGenKbHostNodePKey pkey,
		boolean forceRead );

	IYCFGenKbHostNodeObj readCachedHostNode( YCFGenKbHostNodePKey pkey );

	public void reallyDeepDisposeHostNode( IYCFGenKbHostNodeObj obj );

	void deepDisposeHostNode( YCFGenKbHostNodePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbHostNodeObj lockHostNode( YCFGenKbHostNodePKey pkey );

	/**
	 *	Return a sorted list of all the HostNode-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbHostNodeObj> readAllHostNode();

	/**
	 *	Return a sorted map of all the HostNode-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbHostNodeObj> readAllHostNode( boolean forceRead );

	List<IYCFGenKbHostNodeObj> readCachedAllHostNode();

	/**
	 *	Return a sorted map of a page of the HostNode-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbHostNodeObj> pageAllHostNode(Long priorClusterId,
		Long priorHostNodeId );

	/**
	 *	Get the YCFGenKbHostNodeObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbHostNodeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	/**
	 *	Get the YCFGenKbHostNodeObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbHostNodeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbHostNodeObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbHostNodeObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbHostNodeObj> readHostNodeByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFGenKbHostNodeObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbHostNodeObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbHostNodeObj> readHostNodeByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbHostNodeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbHostNodeObj cached instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbHostNodeObj readHostNodeByUDescrIdx(long ClusterId,
		String Description );

	/**
	 *	Get the YCFGenKbHostNodeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbHostNodeObj refreshed instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbHostNodeObj readHostNodeByUDescrIdx(long ClusterId,
		String Description,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbHostNodeObj instance for the unique HostNameIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbHostNodeObj cached instance for the unique HostNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbHostNodeObj readHostNodeByHostNameIdx(long ClusterId,
		String HostName );

	/**
	 *	Get the YCFGenKbHostNodeObj instance for the unique HostNameIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbHostNodeObj refreshed instance for the unique HostNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbHostNodeObj readHostNodeByHostNameIdx(long ClusterId,
		String HostName,
		boolean forceRead );

	IYCFGenKbHostNodeObj readCachedHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	List<IYCFGenKbHostNodeObj> readCachedHostNodeByClusterIdx( long ClusterId );

	IYCFGenKbHostNodeObj readCachedHostNodeByUDescrIdx( long ClusterId,
		String Description );

	IYCFGenKbHostNodeObj readCachedHostNodeByHostNameIdx( long ClusterId,
		String HostName );

	void deepDisposeHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	void deepDisposeHostNodeByClusterIdx( long ClusterId );

	void deepDisposeHostNodeByUDescrIdx( long ClusterId,
		String Description );

	void deepDisposeHostNodeByHostNameIdx( long ClusterId,
		String HostName );

	/**
	 *	Read a page of data as a List of HostNode-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	A List of HostNode-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<IYCFGenKbHostNodeObj> pageHostNodeByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorHostNodeId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbHostNodeObj updateHostNode( IYCFGenKbHostNodeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteHostNode( IYCFGenKbHostNodeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByUDescrIdx(long ClusterId,
		String Description );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByHostNameIdx(long ClusterId,
		String HostName );
}
