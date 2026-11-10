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

public interface IYCFBamDateTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DateType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDateTypeObj newInstance();

	/**
	 *	Instantiate a new DateType edition of the specified DateType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDateTypeEditObj newEditInstance( IYCFBamDateTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateTypeObj realiseDateType( IYCFBamDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateTypeObj createDateType( IYCFBamDateTypeObj Obj );

	/**
	 *	Read a DateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDateTypeObj readDateType( YCFBamValuePKey pkey );

	/**
	 *	Read a DateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDateTypeObj readDateType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDateTypeObj readCachedDateType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDateType( IYCFBamDateTypeObj obj );

	void deepDisposeDateType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateTypeObj lockDateType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DateType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDateTypeObj> readAllDateType();

	/**
	 *	Return a sorted map of all the DateType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDateTypeObj> readAllDateType( boolean forceRead );

	List<IYCFBamDateTypeObj> readCachedAllDateType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateTypeObj readDateTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateTypeObj readDateTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateTypeObj readDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateTypeObj readDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateTypeObj> readDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamDateTypeObj readCachedDateTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamDateTypeObj readCachedDateTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDateTypeObj> readCachedDateTypeByValTentIdx( long TenantId );

	List<IYCFBamDateTypeObj> readCachedDateTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDateTypeObj> readCachedDateTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDateTypeObj> readCachedDateTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDateTypeObj> readCachedDateTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDateTypeObj> readCachedDateTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDateTypeObj> readCachedDateTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDateTypeObj> readCachedDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDateTypeObj> readCachedDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDateTypeObj> readCachedDateTypeBySchemaIdx( long TenantId,
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

	void deepDisposeDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDateTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDateTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateTypeObj updateDateType( IYCFBamDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateType( IYCFBamDateTypeObj Obj );

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
	void deleteDateTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
	 *	Move the YCFBamDateTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDateTypeObj refreshed cache instance.
	 */
	IYCFBamDateTypeObj moveUpDateType( IYCFBamDateTypeObj Obj );

	/**
	 *	Move the YCFBamDateTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDateTypeObj refreshed cache instance.
	 */
	IYCFBamDateTypeObj moveDownDateType( IYCFBamDateTypeObj Obj );
}
