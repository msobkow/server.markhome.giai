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

public interface IYCFBamTextDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TextDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTextDefObj newInstance();

	/**
	 *	Instantiate a new TextDef edition of the specified TextDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTextDefEditObj newEditInstance( IYCFBamTextDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTextDefObj realiseTextDef( IYCFBamTextDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTextDefObj createTextDef( IYCFBamTextDefObj Obj );

	/**
	 *	Read a TextDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTextDefObj readTextDef( YCFBamValuePKey pkey );

	/**
	 *	Read a TextDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTextDefObj readTextDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTextDefObj readCachedTextDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTextDef( IYCFBamTextDefObj obj );

	void deepDisposeTextDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTextDefObj lockTextDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TextDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTextDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTextDefObj> readAllTextDef();

	/**
	 *	Return a sorted map of all the TextDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTextDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTextDefObj> readAllTextDef( boolean forceRead );

	List<IYCFBamTextDefObj> readCachedAllTextDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTextDefObj readTextDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTextDefObj readTextDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTextDefObj readTextDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTextDefObj readTextDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTextDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTextDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTextDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTextDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTextDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTextDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTextDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTextDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTextDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TextDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTextDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTextDefObj> readTextDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamTextDefObj readCachedTextDefByIdIdx( long TenantId,
		long Id );

	IYCFBamTextDefObj readCachedTextDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTextDefObj> readCachedTextDefByValTentIdx( long TenantId );

	List<IYCFBamTextDefObj> readCachedTextDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTextDefObj> readCachedTextDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTextDefObj> readCachedTextDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTextDefObj> readCachedTextDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTextDefObj> readCachedTextDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTextDefObj> readCachedTextDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTextDefObj> readCachedTextDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTextDefObj> readCachedTextDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTextDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeTextDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTextDefByValTentIdx( long TenantId );

	void deepDisposeTextDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTextDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTextDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTextDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTextDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTextDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTextDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTextDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamTextDefObj updateTextDef( IYCFBamTextDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTextDef( IYCFBamTextDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TextDef key attribute of the instance generating the id.
	 */
	void deleteTextDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamTextDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTextDefObj refreshed cache instance.
	 */
	IYCFBamTextDefObj moveUpTextDef( IYCFBamTextDefObj Obj );

	/**
	 *	Move the YCFBamTextDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTextDefObj refreshed cache instance.
	 */
	IYCFBamTextDefObj moveDownTextDef( IYCFBamTextDefObj Obj );
}
