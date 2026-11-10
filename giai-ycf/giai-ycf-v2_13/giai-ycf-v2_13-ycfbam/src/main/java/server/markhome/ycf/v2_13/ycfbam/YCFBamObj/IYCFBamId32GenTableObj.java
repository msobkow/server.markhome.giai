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

public interface IYCFBamId32GenTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Id32Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamId32GenObj newInstance();

	/**
	 *	Instantiate a new Id32Gen edition of the specified Id32Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamId32GenEditObj newEditInstance( IYCFBamId32GenObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamId32GenObj realiseId32Gen( IYCFBamId32GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamId32GenObj createId32Gen( IYCFBamId32GenObj Obj );

	/**
	 *	Read a Id32Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id32Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamId32GenObj readId32Gen( YCFBamValuePKey pkey );

	/**
	 *	Read a Id32Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id32Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamId32GenObj readId32Gen( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamId32GenObj readCachedId32Gen( YCFBamValuePKey pkey );

	public void reallyDeepDisposeId32Gen( IYCFBamId32GenObj obj );

	void deepDisposeId32Gen( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamId32GenObj lockId32Gen( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Id32Gen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamId32GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamId32GenObj> readAllId32Gen();

	/**
	 *	Return a sorted map of all the Id32Gen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamId32GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamId32GenObj> readAllId32Gen( boolean forceRead );

	List<IYCFBamId32GenObj> readCachedAllId32Gen();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId32GenObj readId32GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId32GenObj readId32GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId32GenObj readId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId32GenObj readId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamInt32TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of YCFBamId32GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId32GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId32GenObj> readId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	IYCFBamId32GenObj readCachedId32GenByIdIdx( long TenantId,
		long Id );

	IYCFBamId32GenObj readCachedId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamId32GenObj> readCachedId32GenByValTentIdx( long TenantId );

	List<IYCFBamId32GenObj> readCachedId32GenByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamId32GenObj> readCachedId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamId32GenObj> readCachedId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamId32GenObj> readCachedId32GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamId32GenObj> readCachedId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamId32GenObj> readCachedId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamId32GenObj> readCachedId32GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamId32GenObj> readCachedId32GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamId32GenObj> readCachedId32GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<IYCFBamId32GenObj> readCachedId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeId32GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeId32GenByValTentIdx( long TenantId );

	void deepDisposeId32GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeId32GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeId32GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeId32GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeId32GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	IYCFBamId32GenObj updateId32Gen( IYCFBamId32GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteId32Gen( IYCFBamId32GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The Id32Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id32Gen key attribute of the instance generating the id.
	 */
	void deleteId32GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the YCFBamId32GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamId32GenObj refreshed cache instance.
	 */
	IYCFBamId32GenObj moveUpId32Gen( IYCFBamId32GenObj Obj );

	/**
	 *	Move the YCFBamId32GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamId32GenObj refreshed cache instance.
	 */
	IYCFBamId32GenObj moveDownId32Gen( IYCFBamId32GenObj Obj );
}
