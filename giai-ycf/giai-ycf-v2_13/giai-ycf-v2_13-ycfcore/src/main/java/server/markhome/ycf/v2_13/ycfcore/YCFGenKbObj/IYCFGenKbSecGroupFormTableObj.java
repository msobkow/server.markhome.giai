// Description: Java 11 Table Object interface for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbSecGroupFormTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecGroupForm instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbSecGroupFormObj newInstance();

	/**
	 *	Instantiate a new SecGroupForm edition of the specified SecGroupForm instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbSecGroupFormEditObj newEditInstance( ICFGenKbSecGroupFormObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecGroupFormObj realiseSecGroupForm( ICFGenKbSecGroupFormObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecGroupFormObj createSecGroupForm( ICFGenKbSecGroupFormObj Obj );

	/**
	 *	Read a SecGroupForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroupForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbSecGroupFormObj readSecGroupForm( CFGenKbSecGroupFormPKey pkey );

	/**
	 *	Read a SecGroupForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecGroupForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbSecGroupFormObj readSecGroupForm( CFGenKbSecGroupFormPKey pkey,
		boolean forceRead );

	ICFGenKbSecGroupFormObj readCachedSecGroupForm( CFGenKbSecGroupFormPKey pkey );

	public void reallyDeepDisposeSecGroupForm( ICFGenKbSecGroupFormObj obj );

	void deepDisposeSecGroupForm( CFGenKbSecGroupFormPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecGroupFormObj lockSecGroupForm( CFGenKbSecGroupFormPKey pkey );

	/**
	 *	Return a sorted list of all the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readAllSecGroupForm();

	/**
	 *	Return a sorted map of all the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readAllSecGroupForm( boolean forceRead );

	List<ICFGenKbSecGroupFormObj> readCachedAllSecGroupForm();

	/**
	 *	Return a sorted map of a page of the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> pageAllSecGroupForm(Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Get the CFGenKbSecGroupFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecGroupFormObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId );

	/**
	 *	Get the CFGenKbSecGroupFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecGroupFormObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId );

	/**
	 *	Get the map of CFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId );

	/**
	 *	Get the map of CFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate GroupIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate GroupIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate AppIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate AppIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the map of CFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate AppIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate AppIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate FormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate FormIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Get the map of CFGenKbSecGroupFormObj instances sorted by their primary keys for the duplicate FormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecGroupFormObj cached instances sorted by their primary keys for the duplicate FormIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbSecGroupFormObj instance for the unique UFormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecGroupFormObj cached instance for the unique UFormIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecGroupFormObj readSecGroupFormByUFormIdx(long ClusterId,
		int SecGroupId,
		int SecFormId );

	/**
	 *	Get the CFGenKbSecGroupFormObj instance for the unique UFormIdx key.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecGroupFormObj refreshed instance for the unique UFormIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecGroupFormObj readSecGroupFormByUFormIdx(long ClusterId,
		int SecGroupId,
		int SecFormId,
		boolean forceRead );

	ICFGenKbSecGroupFormObj readCachedSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId );

	List<ICFGenKbSecGroupFormObj> readCachedSecGroupFormByClusterIdx( long ClusterId );

	List<ICFGenKbSecGroupFormObj> readCachedSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId );

	List<ICFGenKbSecGroupFormObj> readCachedSecGroupFormByAppIdx( long ClusterId,
		int SecAppId );

	List<ICFGenKbSecGroupFormObj> readCachedSecGroupFormByFormIdx( long ClusterId,
		int SecFormId );

	ICFGenKbSecGroupFormObj readCachedSecGroupFormByUFormIdx( long ClusterId,
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
	List<ICFGenKbSecGroupFormObj> pageSecGroupFormByClusterIdx( long ClusterId,
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
	List<ICFGenKbSecGroupFormObj> pageSecGroupFormByGroupIdx( long ClusterId,
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
	List<ICFGenKbSecGroupFormObj> pageSecGroupFormByAppIdx( long ClusterId,
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
	List<ICFGenKbSecGroupFormObj> pageSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecGroupFormObj updateSecGroupForm( ICFGenKbSecGroupFormObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecGroupForm( ICFGenKbSecGroupFormObj Obj );

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
