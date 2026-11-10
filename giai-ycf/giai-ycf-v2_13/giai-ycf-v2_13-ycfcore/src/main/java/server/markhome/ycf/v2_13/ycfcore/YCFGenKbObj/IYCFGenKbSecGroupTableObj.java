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

public interface IYCFGenKbSecGroupTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecGroup instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSecGroupObj newInstance();

	/**
	 *	Instantiate a new SecGroup edition of the specified SecGroup instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSecGroupEditObj newEditInstance( IYCFGenKbSecGroupObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGroupObj realiseSecGroup( IYCFGenKbSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGroupObj createSecGroup( IYCFGenKbSecGroupObj Obj );

	/**
	 *	Read a SecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecGroupObj readSecGroup( YCFGenKbSecGroupPKey pkey );

	/**
	 *	Read a SecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecGroupObj readSecGroup( YCFGenKbSecGroupPKey pkey,
		boolean forceRead );

	IYCFGenKbSecGroupObj readCachedSecGroup( YCFGenKbSecGroupPKey pkey );

	public void reallyDeepDisposeSecGroup( IYCFGenKbSecGroupObj obj );

	void deepDisposeSecGroup( YCFGenKbSecGroupPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGroupObj lockSecGroup( YCFGenKbSecGroupPKey pkey );

	/**
	 *	Return a sorted list of all the SecGroup-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGroupObj> readAllSecGroup();

	/**
	 *	Return a sorted map of all the SecGroup-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGroupObj> readAllSecGroup( boolean forceRead );

	List<IYCFGenKbSecGroupObj> readCachedAllSecGroup();

	/**
	 *	Get the YCFGenKbSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGroupObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Get the YCFGenKbSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGroupObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGroupObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupObj> readSecGroupByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFGenKbSecGroupObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupObj> readSecGroupByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGroupObj instances sorted by their primary keys for the duplicate ClusterVisIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible );

	/**
	 *	Get the map of YCFGenKbSecGroupObj instances sorted by their primary keys for the duplicate ClusterVisIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupObj cached instances sorted by their primary keys for the duplicate ClusterVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGroupObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGroupObj readSecGroupByUNameIdx(long ClusterId,
		String Name );

	/**
	 *	Get the YCFGenKbSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGroupObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGroupObj readSecGroupByUNameIdx(long ClusterId,
		String Name,
		boolean forceRead );

	IYCFGenKbSecGroupObj readCachedSecGroupByIdIdx( long ClusterId,
		int SecGroupId );

	List<IYCFGenKbSecGroupObj> readCachedSecGroupByClusterIdx( long ClusterId );

	List<IYCFGenKbSecGroupObj> readCachedSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible );

	IYCFGenKbSecGroupObj readCachedSecGroupByUNameIdx( long ClusterId,
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
	IYCFGenKbSecGroupObj updateSecGroup( IYCFGenKbSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGroup( IYCFGenKbSecGroupObj Obj );

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
