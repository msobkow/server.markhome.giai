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

public interface ICFBamEnumDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new EnumDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamEnumDefObj newInstance();

	/**
	 *	Instantiate a new EnumDef edition of the specified EnumDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamEnumDefEditObj newEditInstance( ICFBamEnumDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamEnumDefObj realiseEnumDef( ICFBamEnumDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamEnumDefObj createEnumDef( ICFBamEnumDefObj Obj );

	/**
	 *	Read a EnumDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamEnumDefObj readEnumDef( CFBamValuePKey pkey );

	/**
	 *	Read a EnumDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamEnumDefObj readEnumDef( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamEnumDefObj readCachedEnumDef( CFBamValuePKey pkey );

	public void reallyDeepDisposeEnumDef( ICFBamEnumDefObj obj );

	void deepDisposeEnumDef( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamEnumDefObj lockEnumDef( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the EnumDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamEnumDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamEnumDefObj> readAllEnumDef();

	/**
	 *	Return a sorted map of all the EnumDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamEnumDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamEnumDefObj> readAllEnumDef( boolean forceRead );

	List<ICFBamEnumDefObj> readCachedAllEnumDef();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamEnumDefObj readEnumDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamEnumDefObj readEnumDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamEnumDefObj readEnumDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamEnumDefObj readEnumDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamEnumDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamEnumDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamEnumDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamEnumDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamEnumDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamEnumDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamEnumDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamEnumDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamEnumDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamEnumDefObj> readEnumDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamEnumDefObj readCachedEnumDefByIdIdx( long TenantId,
		long Id );

	ICFBamEnumDefObj readCachedEnumDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamEnumDefObj> readCachedEnumDefByValTentIdx( long TenantId );

	List<ICFBamEnumDefObj> readCachedEnumDefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamEnumDefObj> readCachedEnumDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamEnumDefObj> readCachedEnumDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamEnumDefObj> readCachedEnumDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamEnumDefObj> readCachedEnumDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamEnumDefObj> readCachedEnumDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamEnumDefObj> readCachedEnumDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamEnumDefObj> readCachedEnumDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeEnumDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeEnumDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeEnumDefByValTentIdx( long TenantId );

	void deepDisposeEnumDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeEnumDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeEnumDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeEnumDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeEnumDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeEnumDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeEnumDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeEnumDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamEnumDefObj updateEnumDef( ICFBamEnumDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumDef( ICFBamEnumDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamEnumDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamEnumDefObj refreshed cache instance.
	 */
	ICFBamEnumDefObj moveUpEnumDef( ICFBamEnumDefObj Obj );

	/**
	 *	Move the CFBamEnumDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamEnumDefObj refreshed cache instance.
	 */
	ICFBamEnumDefObj moveDownEnumDef( ICFBamEnumDefObj Obj );
}
