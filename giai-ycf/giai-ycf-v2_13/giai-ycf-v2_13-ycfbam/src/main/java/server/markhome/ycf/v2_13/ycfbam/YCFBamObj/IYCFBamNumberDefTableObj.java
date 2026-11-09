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

public interface ICFBamNumberDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NumberDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamNumberDefObj newInstance();

	/**
	 *	Instantiate a new NumberDef edition of the specified NumberDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamNumberDefEditObj newEditInstance( ICFBamNumberDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberDefObj realiseNumberDef( ICFBamNumberDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberDefObj createNumberDef( ICFBamNumberDefObj Obj );

	/**
	 *	Read a NumberDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNumberDefObj readNumberDef( CFBamValuePKey pkey );

	/**
	 *	Read a NumberDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNumberDefObj readNumberDef( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamNumberDefObj readCachedNumberDef( CFBamValuePKey pkey );

	public void reallyDeepDisposeNumberDef( ICFBamNumberDefObj obj );

	void deepDisposeNumberDef( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberDefObj lockNumberDef( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NumberDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamNumberDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNumberDefObj> readAllNumberDef();

	/**
	 *	Return a sorted map of all the NumberDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamNumberDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNumberDefObj> readAllNumberDef( boolean forceRead );

	List<ICFBamNumberDefObj> readCachedAllNumberDef();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberDefObj readNumberDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberDefObj readNumberDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberDefObj readNumberDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberDefObj readNumberDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamNumberDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamNumberDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamNumberDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNumberDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamNumberDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNumberDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamNumberDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNumberDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamNumberDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberDefObj> readNumberDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamNumberDefObj readCachedNumberDefByIdIdx( long TenantId,
		long Id );

	ICFBamNumberDefObj readCachedNumberDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamNumberDefObj> readCachedNumberDefByValTentIdx( long TenantId );

	List<ICFBamNumberDefObj> readCachedNumberDefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamNumberDefObj> readCachedNumberDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamNumberDefObj> readCachedNumberDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamNumberDefObj> readCachedNumberDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamNumberDefObj> readCachedNumberDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamNumberDefObj> readCachedNumberDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamNumberDefObj> readCachedNumberDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamNumberDefObj> readCachedNumberDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNumberDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeNumberDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNumberDefByValTentIdx( long TenantId );

	void deepDisposeNumberDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNumberDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNumberDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNumberDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNumberDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNumberDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNumberDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNumberDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberDefObj updateNumberDef( ICFBamNumberDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberDef( ICFBamNumberDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamNumberDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNumberDefObj refreshed cache instance.
	 */
	ICFBamNumberDefObj moveUpNumberDef( ICFBamNumberDefObj Obj );

	/**
	 *	Move the CFBamNumberDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNumberDefObj refreshed cache instance.
	 */
	ICFBamNumberDefObj moveDownNumberDef( ICFBamNumberDefObj Obj );
}
