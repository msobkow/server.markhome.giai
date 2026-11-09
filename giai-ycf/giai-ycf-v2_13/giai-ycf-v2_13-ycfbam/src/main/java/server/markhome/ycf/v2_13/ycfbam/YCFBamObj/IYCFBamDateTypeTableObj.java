// Description: Java 11 Table Object interface for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamDateTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DateType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDateTypeObj newInstance();

	/**
	 *	Instantiate a new DateType edition of the specified DateType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDateTypeEditObj newEditInstance( ICFBamDateTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDateTypeObj realiseDateType( ICFBamDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDateTypeObj createDateType( ICFBamDateTypeObj Obj );

	/**
	 *	Read a DateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDateTypeObj readDateType( CFBamValuePKey pkey );

	/**
	 *	Read a DateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDateTypeObj readDateType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDateTypeObj readCachedDateType( CFBamValuePKey pkey );

	public void reallyDeepDisposeDateType( ICFBamDateTypeObj obj );

	void deepDisposeDateType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDateTypeObj lockDateType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DateType-derived instances in the database.
	 *
	 *	@return	List of ICFBamDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDateTypeObj> readAllDateType();

	/**
	 *	Return a sorted map of all the DateType-derived instances in the database.
	 *
	 *	@return	List of ICFBamDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDateTypeObj> readAllDateType( boolean forceRead );

	List<ICFBamDateTypeObj> readCachedAllDateType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDateTypeObj readDateTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDateTypeObj readDateTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDateTypeObj readDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDateTypeObj readDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDateTypeObj> readDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamDateTypeObj readCachedDateTypeByIdIdx( long TenantId,
		long Id );

	ICFBamDateTypeObj readCachedDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDateTypeObj> readCachedDateTypeByValTentIdx( long TenantId );

	List<ICFBamDateTypeObj> readCachedDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDateTypeObj> readCachedDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDateTypeObj> readCachedDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDateTypeObj> readCachedDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDateTypeObj> readCachedDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDateTypeObj> readCachedDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDateTypeObj> readCachedDateTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDateTypeObj> readCachedDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamDateTypeObj> readCachedDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDateTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDateTypeByValTentIdx( long TenantId );

	void deepDisposeDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDateTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamDateTypeObj updateDateType( ICFBamDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateType( ICFBamDateTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamDateTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDateTypeObj refreshed cache instance.
	 */
	ICFBamDateTypeObj moveUpDateType( ICFBamDateTypeObj Obj );

	/**
	 *	Move the CFBamDateTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDateTypeObj refreshed cache instance.
	 */
	ICFBamDateTypeObj moveDownDateType( ICFBamDateTypeObj Obj );
}
