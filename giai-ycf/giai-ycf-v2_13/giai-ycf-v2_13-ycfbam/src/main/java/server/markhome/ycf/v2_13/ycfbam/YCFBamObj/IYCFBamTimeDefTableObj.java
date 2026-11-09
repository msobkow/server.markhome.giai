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

public interface ICFBamTimeDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TimeDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTimeDefObj newInstance();

	/**
	 *	Instantiate a new TimeDef edition of the specified TimeDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTimeDefEditObj newEditInstance( ICFBamTimeDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTimeDefObj realiseTimeDef( ICFBamTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTimeDefObj createTimeDef( ICFBamTimeDefObj Obj );

	/**
	 *	Read a TimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTimeDefObj readTimeDef( CFBamValuePKey pkey );

	/**
	 *	Read a TimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTimeDefObj readTimeDef( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTimeDefObj readCachedTimeDef( CFBamValuePKey pkey );

	public void reallyDeepDisposeTimeDef( ICFBamTimeDefObj obj );

	void deepDisposeTimeDef( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTimeDefObj lockTimeDef( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TimeDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTimeDefObj> readAllTimeDef();

	/**
	 *	Return a sorted map of all the TimeDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTimeDefObj> readAllTimeDef( boolean forceRead );

	List<ICFBamTimeDefObj> readCachedAllTimeDef();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimeDefObj readTimeDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimeDefObj readTimeDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimeDefObj readTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTimeDefObj readTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTimeDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTimeDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTimeDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTimeDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTimeDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTimeDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTimeDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTimeDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTimeDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTimeDefObj> readTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamTimeDefObj readCachedTimeDefByIdIdx( long TenantId,
		long Id );

	ICFBamTimeDefObj readCachedTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTimeDefObj> readCachedTimeDefByValTentIdx( long TenantId );

	List<ICFBamTimeDefObj> readCachedTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTimeDefObj> readCachedTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTimeDefObj> readCachedTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTimeDefObj> readCachedTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTimeDefObj> readCachedTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTimeDefObj> readCachedTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTimeDefObj> readCachedTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTimeDefObj> readCachedTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTimeDefByValTentIdx( long TenantId );

	void deepDisposeTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamTimeDefObj updateTimeDef( ICFBamTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeDef( ICFBamTimeDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamTimeDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTimeDefObj refreshed cache instance.
	 */
	ICFBamTimeDefObj moveUpTimeDef( ICFBamTimeDefObj Obj );

	/**
	 *	Move the CFBamTimeDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTimeDefObj refreshed cache instance.
	 */
	ICFBamTimeDefObj moveDownTimeDef( ICFBamTimeDefObj Obj );
}
