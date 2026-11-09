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

public interface ICFBamTokenDefTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TokenDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTokenDefObj newInstance();

	/**
	 *	Instantiate a new TokenDef edition of the specified TokenDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTokenDefEditObj newEditInstance( ICFBamTokenDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTokenDefObj realiseTokenDef( ICFBamTokenDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTokenDefObj createTokenDef( ICFBamTokenDefObj Obj );

	/**
	 *	Read a TokenDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTokenDefObj readTokenDef( CFBamValuePKey pkey );

	/**
	 *	Read a TokenDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTokenDefObj readTokenDef( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTokenDefObj readCachedTokenDef( CFBamValuePKey pkey );

	public void reallyDeepDisposeTokenDef( ICFBamTokenDefObj obj );

	void deepDisposeTokenDef( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTokenDefObj lockTokenDef( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TokenDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamTokenDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTokenDefObj> readAllTokenDef();

	/**
	 *	Return a sorted map of all the TokenDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamTokenDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTokenDefObj> readAllTokenDef( boolean forceRead );

	List<ICFBamTokenDefObj> readCachedAllTokenDef();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTokenDefObj readTokenDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTokenDefObj readTokenDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTokenDefObj readTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTokenDefObj readTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTokenDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTokenDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTokenDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTokenDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTokenDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTokenDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTokenDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTokenDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamTokenDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTokenDefObj> readTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamTokenDefObj readCachedTokenDefByIdIdx( long TenantId,
		long Id );

	ICFBamTokenDefObj readCachedTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTokenDefObj> readCachedTokenDefByValTentIdx( long TenantId );

	List<ICFBamTokenDefObj> readCachedTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTokenDefObj> readCachedTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTokenDefObj> readCachedTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTokenDefObj> readCachedTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTokenDefObj> readCachedTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTokenDefObj> readCachedTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTokenDefObj> readCachedTokenDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamTokenDefObj> readCachedTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTokenDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTokenDefByValTentIdx( long TenantId );

	void deepDisposeTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTokenDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamTokenDefObj updateTokenDef( ICFBamTokenDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTokenDef( ICFBamTokenDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamTokenDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTokenDefObj refreshed cache instance.
	 */
	ICFBamTokenDefObj moveUpTokenDef( ICFBamTokenDefObj Obj );

	/**
	 *	Move the CFBamTokenDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTokenDefObj refreshed cache instance.
	 */
	ICFBamTokenDefObj moveDownTokenDef( ICFBamTokenDefObj Obj );
}
