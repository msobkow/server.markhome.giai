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

public interface IYCFGenKbSecGroupFormTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecGroupForm instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbSecGroupFormObj newInstance();

	/**
	 *	Instantiate a new SecGroupForm edition of the specified SecGroupForm instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbSecGroupFormEditObj newEditInstance( IYCFGenKbSecGroupFormObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGroupFormObj realiseSecGroupForm( IYCFGenKbSecGroupFormObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGroupFormObj createSecGroupForm( IYCFGenKbSecGroupFormObj Obj );

	/**
	 *	Read a SecGroupForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroupForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecGroupFormObj readSecGroupForm( YCFGenKbSecGroupFormPKey pkey );

	/**
	 *	Read a SecGroupForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroupForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbSecGroupFormObj readSecGroupForm( YCFGenKbSecGroupFormPKey pkey,
		boolean forceRead );

	IYCFGenKbSecGroupFormObj readCachedSecGroupForm( YCFGenKbSecGroupFormPKey pkey );

	public void reallyDeepDisposeSecGroupForm( IYCFGenKbSecGroupFormObj obj );

	void deepDisposeSecGroupForm( YCFGenKbSecGroupFormPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGroupFormObj lockSecGroupForm( YCFGenKbSecGroupFormPKey pkey );

	/**
	 *	Return a sorted list of all the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readAllSecGroupForm();

	/**
	 *	Return a sorted map of all the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readAllSecGroupForm( boolean forceRead );

	List<IYCFGenKbSecGroupFormObj> readCachedAllSecGroupForm();

	/**
	 *	Return a sorted map of a page of the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> pageAllSecGroupForm(Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Get the YCFGenKbSecGroupFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGroupFormObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId );

	/**
	 *	Get the YCFGenKbSecGroupFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGroupFormObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId );

	/**
	 *	Get the map of YCFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Get the map of YCFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate AppIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate AppIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the map of YCFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate AppIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate AppIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate FormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate FormIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Get the map of YCFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate FormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate FormIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbSecGroupFormObj instance for the unique UFormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGroupFormObj cached instance for the unique UFormIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGroupFormObj readSecGroupFormByUFormIdx(long ClusterId,
		int SecGroupId,
		int SecFormId );

	/**
	 *	Get the YCFGenKbSecGroupFormObj instance for the unique UFormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbSecGroupFormObj refreshed instance for the unique UFormIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbSecGroupFormObj readSecGroupFormByUFormIdx(long ClusterId,
		int SecGroupId,
		int SecFormId,
		boolean forceRead );

	IYCFGenKbSecGroupFormObj readCachedSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId );

	List<IYCFGenKbSecGroupFormObj> readCachedSecGroupFormByClusterIdx( long ClusterId );

	List<IYCFGenKbSecGroupFormObj> readCachedSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId );

	List<IYCFGenKbSecGroupFormObj> readCachedSecGroupFormByAppIdx( long ClusterId,
		int SecAppId );

	List<IYCFGenKbSecGroupFormObj> readCachedSecGroupFormByFormIdx( long ClusterId,
		int SecFormId );

	IYCFGenKbSecGroupFormObj readCachedSecGroupFormByUFormIdx( long ClusterId,
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
	List<IYCFGenKbSecGroupFormObj> pageSecGroupFormByClusterIdx( long ClusterId,
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
	List<IYCFGenKbSecGroupFormObj> pageSecGroupFormByGroupIdx( long ClusterId,
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
	List<IYCFGenKbSecGroupFormObj> pageSecGroupFormByAppIdx( long ClusterId,
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
	List<IYCFGenKbSecGroupFormObj> pageSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbSecGroupFormObj updateSecGroupForm( IYCFGenKbSecGroupFormObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGroupForm( IYCFGenKbSecGroupFormObj Obj );

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
