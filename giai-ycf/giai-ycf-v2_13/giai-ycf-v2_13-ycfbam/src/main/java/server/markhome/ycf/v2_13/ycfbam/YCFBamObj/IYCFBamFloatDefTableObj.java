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

public interface IYCFBamFloatDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new FloatDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamFloatDefObj newInstance();

	/**
	 *	Instantiate a new FloatDef edition of the specified FloatDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamFloatDefEditObj newEditInstance( IYCFBamFloatDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatDefObj realiseFloatDef( IYCFBamFloatDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatDefObj createFloatDef( IYCFBamFloatDefObj Obj );

	/**
	 *	Read a FloatDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamFloatDefObj readFloatDef( YCFBamValuePKey pkey );

	/**
	 *	Read a FloatDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamFloatDefObj readFloatDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamFloatDefObj readCachedFloatDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeFloatDef( IYCFBamFloatDefObj obj );

	void deepDisposeFloatDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatDefObj lockFloatDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the FloatDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamFloatDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamFloatDefObj> readAllFloatDef();

	/**
	 *	Return a sorted map of all the FloatDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamFloatDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamFloatDefObj> readAllFloatDef( boolean forceRead );

	List<IYCFBamFloatDefObj> readCachedAllFloatDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatDefObj readFloatDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatDefObj readFloatDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatDefObj readFloatDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamFloatDefObj readFloatDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamFloatDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamFloatDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamFloatDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamFloatDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamFloatDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamFloatDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamFloatDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamFloatDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamFloatDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamFloatDefObj> readFloatDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamFloatDefObj readCachedFloatDefByIdIdx( long TenantId,
		long Id );

	IYCFBamFloatDefObj readCachedFloatDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamFloatDefObj> readCachedFloatDefByValTentIdx( long TenantId );

	List<IYCFBamFloatDefObj> readCachedFloatDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamFloatDefObj> readCachedFloatDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamFloatDefObj> readCachedFloatDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamFloatDefObj> readCachedFloatDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamFloatDefObj> readCachedFloatDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamFloatDefObj> readCachedFloatDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamFloatDefObj> readCachedFloatDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamFloatDefObj> readCachedFloatDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeFloatDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeFloatDefByValTentIdx( long TenantId );

	void deepDisposeFloatDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeFloatDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeFloatDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeFloatDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeFloatDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeFloatDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeFloatDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamFloatDefObj updateFloatDef( IYCFBamFloatDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatDef( IYCFBamFloatDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 */
	void deleteFloatDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamFloatDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamFloatDefObj refreshed cache instance.
	 */
	IYCFBamFloatDefObj moveUpFloatDef( IYCFBamFloatDefObj Obj );

	/**
	 *	Move the YCFBamFloatDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamFloatDefObj refreshed cache instance.
	 */
	IYCFBamFloatDefObj moveDownFloatDef( IYCFBamFloatDefObj Obj );
}
