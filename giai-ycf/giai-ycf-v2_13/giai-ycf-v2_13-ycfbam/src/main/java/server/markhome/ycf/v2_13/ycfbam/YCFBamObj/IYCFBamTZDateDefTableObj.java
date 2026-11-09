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

public interface ICFBamTZDateDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZDateDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTZDateDefObj newInstance();

	/**
	 *	Instantiate a new TZDateDef edition of the specified TZDateDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTZDateDefEditObj newEditInstance( ICFBamTZDateDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateDefObj realiseTZDateDef( ICFBamTZDateDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateDefObj createTZDateDef( ICFBamTZDateDefObj Obj );

	/**
	 *	Read a TZDateDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZDateDefObj readTZDateDef( CFBamValuePKey pkey );

	/**
	 *	Read a TZDateDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZDateDefObj readTZDateDef( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTZDateDefObj readCachedTZDateDef( CFBamValuePKey pkey );

	public void reallyDeepDisposeTZDateDef( ICFBamTZDateDefObj obj );

	void deepDisposeTZDateDef( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateDefObj lockTZDateDef( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZDateDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZDateDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZDateDefObj> readAllTZDateDef();

	/**
	 *	Return a sorted map of all the TZDateDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZDateDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZDateDefObj> readAllTZDateDef( boolean forceRead );

	List<ICFBamTZDateDefObj> readCachedAllTZDateDef();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateDefObj readTZDateDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateDefObj readTZDateDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateDefObj readTZDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZDateDefObj readTZDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTZDateDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTZDateDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTZDateDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZDateDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZDateDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZDateDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZDateDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTZDateDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTZDateDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZDateDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZDateDefObj> readTZDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamTZDateDefObj readCachedTZDateDefByIdIdx( long TenantId,
		long Id );

	ICFBamTZDateDefObj readCachedTZDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTZDateDefObj> readCachedTZDateDefByValTentIdx( long TenantId );

	List<ICFBamTZDateDefObj> readCachedTZDateDefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTZDateDefObj> readCachedTZDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTZDateDefObj> readCachedTZDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTZDateDefObj> readCachedTZDateDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTZDateDefObj> readCachedTZDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTZDateDefObj> readCachedTZDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTZDateDefObj> readCachedTZDateDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTZDateDefObj> readCachedTZDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZDateDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZDateDefByValTentIdx( long TenantId );

	void deepDisposeTZDateDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZDateDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZDateDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamTZDateDefObj updateTZDateDef( ICFBamTZDateDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZDateDef( ICFBamTZDateDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZDateDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZDateDef key attribute of the instance generating the id.
	 */
	void deleteTZDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamTZDateDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZDateDefObj refreshed cache instance.
	 */
	ICFBamTZDateDefObj moveUpTZDateDef( ICFBamTZDateDefObj Obj );

	/**
	 *	Move the CFBamTZDateDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZDateDefObj refreshed cache instance.
	 */
	ICFBamTZDateDefObj moveDownTZDateDef( ICFBamTZDateDefObj Obj );
}
