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

public interface IYCFBamNumberDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NumberDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamNumberDefObj newInstance();

	/**
	 *	Instantiate a new NumberDef edition of the specified NumberDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamNumberDefEditObj newEditInstance( IYCFBamNumberDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamNumberDefObj realiseNumberDef( IYCFBamNumberDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamNumberDefObj createNumberDef( IYCFBamNumberDefObj Obj );

	/**
	 *	Read a NumberDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNumberDefObj readNumberDef( YCFBamValuePKey pkey );

	/**
	 *	Read a NumberDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamNumberDefObj readNumberDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamNumberDefObj readCachedNumberDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeNumberDef( IYCFBamNumberDefObj obj );

	void deepDisposeNumberDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamNumberDefObj lockNumberDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NumberDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNumberDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNumberDefObj> readAllNumberDef();

	/**
	 *	Return a sorted map of all the NumberDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamNumberDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamNumberDefObj> readAllNumberDef( boolean forceRead );

	List<IYCFBamNumberDefObj> readCachedAllNumberDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNumberDefObj readNumberDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNumberDefObj readNumberDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNumberDefObj readNumberDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamNumberDefObj readNumberDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamNumberDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamNumberDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamNumberDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNumberDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNumberDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamNumberDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamNumberDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNumberDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamNumberDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamNumberDefObj> readNumberDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamNumberDefObj readCachedNumberDefByIdIdx( long TenantId,
		long Id );

	IYCFBamNumberDefObj readCachedNumberDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamNumberDefObj> readCachedNumberDefByValTentIdx( long TenantId );

	List<IYCFBamNumberDefObj> readCachedNumberDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamNumberDefObj> readCachedNumberDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamNumberDefObj> readCachedNumberDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamNumberDefObj> readCachedNumberDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamNumberDefObj> readCachedNumberDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamNumberDefObj> readCachedNumberDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamNumberDefObj> readCachedNumberDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamNumberDefObj> readCachedNumberDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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

	void deepDisposeNumberDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeNumberDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamNumberDefObj updateNumberDef( IYCFBamNumberDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberDef( IYCFBamNumberDefObj Obj );

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
	void deleteNumberDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamNumberDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNumberDefObj refreshed cache instance.
	 */
	IYCFBamNumberDefObj moveUpNumberDef( IYCFBamNumberDefObj Obj );

	/**
	 *	Move the YCFBamNumberDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNumberDefObj refreshed cache instance.
	 */
	IYCFBamNumberDefObj moveDownNumberDef( IYCFBamNumberDefObj Obj );
}
