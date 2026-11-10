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

public interface IYCFBamUuidGenTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new UuidGen instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamUuidGenObj newInstance();

	/**
	 *	Instantiate a new UuidGen edition of the specified UuidGen instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamUuidGenEditObj newEditInstance( IYCFBamUuidGenObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidGenObj realiseUuidGen( IYCFBamUuidGenObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidGenObj createUuidGen( IYCFBamUuidGenObj Obj );

	/**
	 *	Read a UuidGen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidGen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuidGenObj readUuidGen( YCFBamValuePKey pkey );

	/**
	 *	Read a UuidGen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidGen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamUuidGenObj readUuidGen( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamUuidGenObj readCachedUuidGen( YCFBamValuePKey pkey );

	public void reallyDeepDisposeUuidGen( IYCFBamUuidGenObj obj );

	void deepDisposeUuidGen( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidGenObj lockUuidGen( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the UuidGen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuidGenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuidGenObj> readAllUuidGen();

	/**
	 *	Return a sorted map of all the UuidGen-derived instances in the database.
	 *
	 *	@return	List of IYCFBamUuidGenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamUuidGenObj> readAllUuidGen( boolean forceRead );

	List<IYCFBamUuidGenObj> readCachedAllUuidGen();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidGenObj readUuidGenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidGenObj readUuidGenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidGenObj readUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamUuidGenObj readUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Get the map of YCFBamUuidGenObj instances sorted by their primary keys for the duplicate DispIdx key.
	 *
	 *	@param	argDispenserTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamUuidGenObj cached instances sorted by their primary keys for the duplicate DispIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamUuidGenObj> readUuidGenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead );

	IYCFBamUuidGenObj readCachedUuidGenByIdIdx( long TenantId,
		long Id );

	IYCFBamUuidGenObj readCachedUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamUuidGenObj> readCachedUuidGenByValTentIdx( long TenantId );

	List<IYCFBamUuidGenObj> readCachedUuidGenByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamUuidGenObj> readCachedUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamUuidGenObj> readCachedUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamUuidGenObj> readCachedUuidGenByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamUuidGenObj> readCachedUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamUuidGenObj> readCachedUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamUuidGenObj> readCachedUuidGenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuidGenObj> readCachedUuidGenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamUuidGenObj> readCachedUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId );

	List<IYCFBamUuidGenObj> readCachedUuidGenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	void deepDisposeUuidGenByIdIdx( long TenantId,
		long Id );

	void deepDisposeUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeUuidGenByValTentIdx( long TenantId );

	void deepDisposeUuidGenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeUuidGenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeUuidGenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidGenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeUuidGenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Internal use only.
	 */
	IYCFBamUuidGenObj updateUuidGen( IYCFBamUuidGenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidGen( IYCFBamUuidGenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDispenserTenantId	The UuidGen key attribute of the instance generating the id.
	 *
	 *	@param	argDispenserId	The UuidGen key attribute of the instance generating the id.
	 */
	void deleteUuidGenByDispIdx( Long DispenserTenantId,
		Long DispenserId );

	/**
	 *	Move the YCFBamUuidGenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuidGenObj refreshed cache instance.
	 */
	IYCFBamUuidGenObj moveUpUuidGen( IYCFBamUuidGenObj Obj );

	/**
	 *	Move the YCFBamUuidGenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUuidGenObj refreshed cache instance.
	 */
	IYCFBamUuidGenObj moveDownUuidGen( IYCFBamUuidGenObj Obj );
}
