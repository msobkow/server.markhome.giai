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

public interface IYCFBamId16GenTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Id16Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamId16GenObj newInstance();

	/**
	 *	Instantiate a new Id16Gen edition of the specified Id16Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamId16GenEditObj newEditInstance( IYCFBamId16GenObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamId16GenObj realiseId16Gen( IYCFBamId16GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamId16GenObj createId16Gen( IYCFBamId16GenObj Obj );

	/**
	 *	Read a Id16Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id16Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamId16GenObj readId16Gen( YCFBamValuePKey pkey );

	/**
	 *	Read a Id16Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id16Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamId16GenObj readId16Gen( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamId16GenObj readCachedId16Gen( YCFBamValuePKey pkey );

	public void reallyDeepDisposeId16Gen( IYCFBamId16GenObj obj );

	void deepDisposeId16Gen( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamId16GenObj lockId16Gen( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Id16Gen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamId16GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamId16GenObj> readAllId16Gen();

	/**
	 *	Return a sorted map of all the Id16Gen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamId16GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamId16GenObj> readAllId16Gen( boolean forceRead );

	List<IYCFBamId16GenObj> readCachedAllId16Gen();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId16GenObj readId16GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId16GenObj readId16GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId16GenObj readId16GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId16GenObj readId16GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of YCFBamId16GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId16GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId16GenObj> readId16GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	IYCFBamId16GenObj readCachedId16GenByIdIdx( long TenantId,
		long Id );

	IYCFBamId16GenObj readCachedId16GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamId16GenObj> readCachedId16GenByValTentIdx( long TenantId );

	List<IYCFBamId16GenObj> readCachedId16GenByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamId16GenObj> readCachedId16GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamId16GenObj> readCachedId16GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamId16GenObj> readCachedId16GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamId16GenObj> readCachedId16GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamId16GenObj> readCachedId16GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamId16GenObj> readCachedId16GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamId16GenObj> readCachedId16GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamId16GenObj> readCachedId16GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<IYCFBamId16GenObj> readCachedId16GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeId16GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeId16GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeId16GenByValTentIdx( long TenantId );

	void deepDisposeId16GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeId16GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeId16GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeId16GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeId16GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeId16GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeId16GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeId16GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeId16GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeId16GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	IYCFBamId16GenObj updateId16Gen( IYCFBamId16GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteId16Gen( IYCFBamId16GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The Id16Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id16Gen key attribute of the instance generating the id.
	 */
	void deleteId16GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the YCFBamId16GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamId16GenObj refreshed cache instance.
	 */
	IYCFBamId16GenObj moveUpId16Gen( IYCFBamId16GenObj Obj );

	/**
	 *	Move the YCFBamId16GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamId16GenObj refreshed cache instance.
	 */
	IYCFBamId16GenObj moveDownId16Gen( IYCFBamId16GenObj Obj );
}
