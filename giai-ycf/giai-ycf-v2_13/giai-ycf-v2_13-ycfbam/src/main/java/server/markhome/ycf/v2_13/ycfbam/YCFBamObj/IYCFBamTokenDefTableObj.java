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

public interface IYCFBamTokenDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TokenDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTokenDefObj newInstance();

	/**
	 *	Instantiate a new TokenDef edition of the specified TokenDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTokenDefEditObj newEditInstance( IYCFBamTokenDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTokenDefObj realiseTokenDef( IYCFBamTokenDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTokenDefObj createTokenDef( IYCFBamTokenDefObj Obj );

	/**
	 *	Read a TokenDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTokenDefObj readTokenDef( YCFBamValuePKey pkey );

	/**
	 *	Read a TokenDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTokenDefObj readTokenDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTokenDefObj readCachedTokenDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTokenDef( IYCFBamTokenDefObj obj );

	void deepDisposeTokenDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTokenDefObj lockTokenDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TokenDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTokenDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTokenDefObj> readAllTokenDef();

	/**
	 *	Return a sorted map of all the TokenDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTokenDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTokenDefObj> readAllTokenDef( boolean forceRead );

	List<IYCFBamTokenDefObj> readCachedAllTokenDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTokenDefObj readTokenDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTokenDefObj readTokenDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTokenDefObj readTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTokenDefObj readTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTokenDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTokenDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTokenDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTokenDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTokenDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTokenDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTokenDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTokenDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTokenDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenDefObj> readTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamTokenDefObj readCachedTokenDefByIdIdx( long TenantId,
		long Id );

	IYCFBamTokenDefObj readCachedTokenDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTokenDefObj> readCachedTokenDefByValTentIdx( long TenantId );

	List<IYCFBamTokenDefObj> readCachedTokenDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTokenDefObj> readCachedTokenDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTokenDefObj> readCachedTokenDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTokenDefObj> readCachedTokenDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTokenDefObj> readCachedTokenDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTokenDefObj> readCachedTokenDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTokenDefObj> readCachedTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTokenDefObj> readCachedTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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

	void deepDisposeTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTokenDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamTokenDefObj updateTokenDef( IYCFBamTokenDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTokenDef( IYCFBamTokenDefObj Obj );

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
	void deleteTokenDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamTokenDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTokenDefObj refreshed cache instance.
	 */
	IYCFBamTokenDefObj moveUpTokenDef( IYCFBamTokenDefObj Obj );

	/**
	 *	Move the YCFBamTokenDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTokenDefObj refreshed cache instance.
	 */
	IYCFBamTokenDefObj moveDownTokenDef( IYCFBamTokenDefObj Obj );
}
