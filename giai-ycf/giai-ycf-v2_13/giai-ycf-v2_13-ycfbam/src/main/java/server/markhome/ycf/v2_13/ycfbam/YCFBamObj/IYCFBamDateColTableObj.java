// Description: Java 11 Table Object interface for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamDateColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DateCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDateColObj newInstance();

	/**
	 *	Instantiate a new DateCol edition of the specified DateCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDateColEditObj newEditInstance( IYCFBamDateColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateColObj realiseDateCol( IYCFBamDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateColObj createDateCol( IYCFBamDateColObj Obj );

	/**
	 *	Read a DateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDateColObj readDateCol( YCFBamValuePKey pkey );

	/**
	 *	Read a DateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDateColObj readDateCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDateColObj readCachedDateCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDateCol( IYCFBamDateColObj obj );

	void deepDisposeDateCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateColObj lockDateCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DateCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDateColObj> readAllDateCol();

	/**
	 *	Return a sorted map of all the DateCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDateColObj> readAllDateCol( boolean forceRead );

	List<IYCFBamDateColObj> readCachedAllDateCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateColObj readDateColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateColObj readDateColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateColObj readDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateColObj readDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateColObj> readDateColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamDateColObj readCachedDateColByIdIdx( long TenantId,
		long Id );

	IYCFBamDateColObj readCachedDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDateColObj> readCachedDateColByValTentIdx( long TenantId );

	List<IYCFBamDateColObj> readCachedDateColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDateColObj> readCachedDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDateColObj> readCachedDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDateColObj> readCachedDateColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDateColObj> readCachedDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDateColObj> readCachedDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDateColObj> readCachedDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDateColObj> readCachedDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDateColObj> readCachedDateColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeDateColByIdIdx( long TenantId,
		long Id );

	void deepDisposeDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDateColByValTentIdx( long TenantId );

	void deepDisposeDateColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDateColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateColObj updateDateCol( IYCFBamDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateCol( IYCFBamDateColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamDateColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDateColObj refreshed cache instance.
	 */
	IYCFBamDateColObj moveUpDateCol( IYCFBamDateColObj Obj );

	/**
	 *	Move the YCFBamDateColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDateColObj refreshed cache instance.
	 */
	IYCFBamDateColObj moveDownDateCol( IYCFBamDateColObj Obj );
}
