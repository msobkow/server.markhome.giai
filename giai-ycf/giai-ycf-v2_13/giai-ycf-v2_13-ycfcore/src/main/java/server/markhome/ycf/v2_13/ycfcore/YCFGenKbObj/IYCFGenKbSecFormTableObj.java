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

public interface IYCFGenKbSecFormTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecForm instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSecFormObj newInstance();

	/**
	 *	Instantiate a new SecForm edition of the specified SecForm instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSecFormEditObj newEditInstance( IYCFGenKbSecFormObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecFormObj realiseSecForm( IYCFGenKbSecFormObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecFormObj createSecForm( IYCFGenKbSecFormObj Obj );

	/**
	 *	Read a SecForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecFormObj readSecForm( YCFGenKbSecFormPKey pkey );

	/**
	 *	Read a SecForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecFormObj readSecForm( YCFGenKbSecFormPKey pkey,
		boolean forceRead );

	IYCFGenKbSecFormObj readCachedSecForm( YCFGenKbSecFormPKey pkey );

	public void reallyDeepDisposeSecForm( IYCFGenKbSecFormObj obj );

	void deepDisposeSecForm( YCFGenKbSecFormPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecFormObj lockSecForm( YCFGenKbSecFormPKey pkey );

	/**
	 *	Return a sorted list of all the SecForm-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecFormObj> readAllSecForm();

	/**
	 *	Return a sorted map of all the SecForm-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecFormObj> readAllSecForm( boolean forceRead );

	List<IYCFGenKbSecFormObj> readCachedAllSecForm();

	/**
	 *	Return a sorted map of a page of the SecForm-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecFormObj> pageAllSecForm(Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Get the YCFGenKbSecFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecFormObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Get the YCFGenKbSecFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecFormObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecFormObj> readSecFormByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFGenKbSecFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecFormObj> readSecFormByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecFormObj instances sorted by their primary keys for the duplicate SecAppIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecFormObj cached instances sorted by their primary keys for the duplicate SecAppIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the map of YCFGenKbSecFormObj instances sorted by their primary keys for the duplicate SecAppIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecFormObj cached instances sorted by their primary keys for the duplicate SecAppIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbSecFormObj instance for the unique UJEEServletIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecFormObj cached instance for the unique UJEEServletIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecFormObj readSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	/**
	 *	Get the YCFGenKbSecFormObj instance for the unique UJEEServletIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecFormObj refreshed instance for the unique UJEEServletIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecFormObj readSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName,
		boolean forceRead );

	IYCFGenKbSecFormObj readCachedSecFormByIdIdx( long ClusterId,
		int SecFormId );

	List<IYCFGenKbSecFormObj> readCachedSecFormByClusterIdx( long ClusterId );

	List<IYCFGenKbSecFormObj> readCachedSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	IYCFGenKbSecFormObj readCachedSecFormByUJEEServletIdx( long ClusterId,
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
	List<IYCFGenKbSecFormObj> pageSecFormByClusterIdx( long ClusterId,
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
	List<IYCFGenKbSecFormObj> pageSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecFormObj updateSecForm( IYCFGenKbSecFormObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecForm( IYCFGenKbSecFormObj Obj );

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
