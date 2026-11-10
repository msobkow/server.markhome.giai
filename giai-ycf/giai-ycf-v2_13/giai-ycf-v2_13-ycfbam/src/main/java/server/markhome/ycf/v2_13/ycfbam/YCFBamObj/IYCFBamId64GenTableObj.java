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

public interface IYCFBamId64GenTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Id64Gen instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamId64GenObj newInstance();

	/**
	 *	Instantiate a new Id64Gen edition of the specified Id64Gen instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamId64GenEditObj newEditInstance( IYCFBamId64GenObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamId64GenObj realiseId64Gen( IYCFBamId64GenObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamId64GenObj createId64Gen( IYCFBamId64GenObj Obj );

	/**
	 *	Read a Id64Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id64Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamId64GenObj readId64Gen( YCFBamValuePKey pkey );

	/**
	 *	Read a Id64Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Id64Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamId64GenObj readId64Gen( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamId64GenObj readCachedId64Gen( YCFBamValuePKey pkey );

	public void reallyDeepDisposeId64Gen( IYCFBamId64GenObj obj );

	void deepDisposeId64Gen( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamId64GenObj lockId64Gen( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Id64Gen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamId64GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamId64GenObj> readAllId64Gen();

	/**
	 *	Return a sorted map of all the Id64Gen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamId64GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamId64GenObj> readAllId64Gen( boolean forceRead );

	List<IYCFBamId64GenObj> readCachedAllId64Gen();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId64GenObj readId64GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId64GenObj readId64GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId64GenObj readId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamId64GenObj readId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamInt64TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of YCFBamId64GenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamId64GenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamId64GenObj> readId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	IYCFBamId64GenObj readCachedId64GenByIdIdx( long TenantId,
		long Id );

	IYCFBamId64GenObj readCachedId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamId64GenObj> readCachedId64GenByValTentIdx( long TenantId );

	List<IYCFBamId64GenObj> readCachedId64GenByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamId64GenObj> readCachedId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamId64GenObj> readCachedId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamId64GenObj> readCachedId64GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamId64GenObj> readCachedId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamId64GenObj> readCachedId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamId64GenObj> readCachedId64GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamId64GenObj> readCachedId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamId64GenObj> readCachedId64GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<IYCFBamId64GenObj> readCachedId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeId64GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeId64GenByValTentIdx( long TenantId );

	void deepDisposeId64GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeId64GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeId64GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeId64GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	IYCFBamId64GenObj updateId64Gen( IYCFBamId64GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteId64Gen( IYCFBamId64GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The Id64Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The Id64Gen key attribute of the instance generating the id.
	 */
	void deleteId64GenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the YCFBamId64GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamId64GenObj refreshed cache instance.
	 */
	IYCFBamId64GenObj moveUpId64Gen( IYCFBamId64GenObj Obj );

	/**
	 *	Move the YCFBamId64GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamId64GenObj refreshed cache instance.
	 */
	IYCFBamId64GenObj moveDownId64Gen( IYCFBamId64GenObj Obj );
}
