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

public interface ICFBamTZTimeDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZTimeDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTZTimeDefObj newInstance();

	/**
	 *	Instantiate a new TZTimeDef edition of the specified TZTimeDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTZTimeDefEditObj newEditInstance( ICFBamTZTimeDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimeDefObj realiseTZTimeDef( ICFBamTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimeDefObj createTZTimeDef( ICFBamTZTimeDefObj Obj );

	/**
	 *	Read a TZTimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZTimeDefObj readTZTimeDef( CFBamValuePKey pkey );

	/**
	 *	Read a TZTimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTZTimeDefObj readTZTimeDef( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTZTimeDefObj readCachedTZTimeDef( CFBamValuePKey pkey );

	public void reallyDeepDisposeTZTimeDef( ICFBamTZTimeDefObj obj );

	void deepDisposeTZTimeDef( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimeDefObj lockTZTimeDef( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZTimeDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZTimeDefObj> readAllTZTimeDef();

	/**
	 *	Return a sorted map of all the TZTimeDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamTZTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTZTimeDefObj> readAllTZTimeDef( boolean forceRead );

	List<ICFBamTZTimeDefObj> readCachedAllTZTimeDef();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimeDefObj readTZTimeDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimeDefObj readTZTimeDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimeDefObj readTZTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTZTimeDefObj readTZTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTZTimeDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZTimeDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZTimeDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTZTimeDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTZTimeDefObj> readTZTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamTZTimeDefObj readCachedTZTimeDefByIdIdx( long TenantId,
		long Id );

	ICFBamTZTimeDefObj readCachedTZTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTZTimeDefObj> readCachedTZTimeDefByValTentIdx( long TenantId );

	List<ICFBamTZTimeDefObj> readCachedTZTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTZTimeDefObj> readCachedTZTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTZTimeDefObj> readCachedTZTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTZTimeDefObj> readCachedTZTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTZTimeDefObj> readCachedTZTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTZTimeDefObj> readCachedTZTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTZTimeDefObj> readCachedTZTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTZTimeDefObj> readCachedTZTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimeDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeTZTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTZTimeDefByValTentIdx( long TenantId );

	void deepDisposeTZTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTZTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTZTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTZTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTZTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTZTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTZTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamTZTimeDefObj updateTZTimeDef( ICFBamTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimeDef( ICFBamTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamTZTimeDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZTimeDefObj refreshed cache instance.
	 */
	ICFBamTZTimeDefObj moveUpTZTimeDef( ICFBamTZTimeDefObj Obj );

	/**
	 *	Move the CFBamTZTimeDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTZTimeDefObj refreshed cache instance.
	 */
	ICFBamTZTimeDefObj moveDownTZTimeDef( ICFBamTZTimeDefObj Obj );
}
