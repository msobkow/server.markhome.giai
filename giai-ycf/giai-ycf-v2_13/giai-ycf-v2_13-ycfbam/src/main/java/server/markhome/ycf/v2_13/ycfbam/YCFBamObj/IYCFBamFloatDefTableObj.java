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

public interface ICFBamFloatDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new FloatDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamFloatDefObj newInstance();

	/**
	 *	Instantiate a new FloatDef edition of the specified FloatDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamFloatDefEditObj newEditInstance( ICFBamFloatDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatDefObj realiseFloatDef( ICFBamFloatDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatDefObj createFloatDef( ICFBamFloatDefObj Obj );

	/**
	 *	Read a FloatDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamFloatDefObj readFloatDef( CFBamValuePKey pkey );

	/**
	 *	Read a FloatDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamFloatDefObj readFloatDef( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamFloatDefObj readCachedFloatDef( CFBamValuePKey pkey );

	public void reallyDeepDisposeFloatDef( ICFBamFloatDefObj obj );

	void deepDisposeFloatDef( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatDefObj lockFloatDef( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the FloatDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamFloatDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamFloatDefObj> readAllFloatDef();

	/**
	 *	Return a sorted map of all the FloatDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamFloatDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamFloatDefObj> readAllFloatDef( boolean forceRead );

	List<ICFBamFloatDefObj> readCachedAllFloatDef();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatDefObj readFloatDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatDefObj readFloatDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatDefObj readFloatDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamFloatDefObj readFloatDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamFloatDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamFloatDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamFloatDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamFloatDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamFloatDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamFloatDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamFloatDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamFloatDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamFloatDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The FloatDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamFloatDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamFloatDefObj> readFloatDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamFloatDefObj readCachedFloatDefByIdIdx( long TenantId,
		long Id );

	ICFBamFloatDefObj readCachedFloatDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamFloatDefObj> readCachedFloatDefByValTentIdx( long TenantId );

	List<ICFBamFloatDefObj> readCachedFloatDefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamFloatDefObj> readCachedFloatDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamFloatDefObj> readCachedFloatDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamFloatDefObj> readCachedFloatDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamFloatDefObj> readCachedFloatDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamFloatDefObj> readCachedFloatDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamFloatDefObj> readCachedFloatDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamFloatDefObj> readCachedFloatDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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

	void deepDisposeFloatDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeFloatDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamFloatDefObj updateFloatDef( ICFBamFloatDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatDef( ICFBamFloatDefObj Obj );

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
	void deleteFloatDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

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
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamFloatDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamFloatDefObj refreshed cache instance.
	 */
	ICFBamFloatDefObj moveUpFloatDef( ICFBamFloatDefObj Obj );

	/**
	 *	Move the CFBamFloatDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamFloatDefObj refreshed cache instance.
	 */
	ICFBamFloatDefObj moveDownFloatDef( ICFBamFloatDefObj Obj );
}
