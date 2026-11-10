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

public interface IYCFBamStringDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new StringDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamStringDefObj newInstance();

	/**
	 *	Instantiate a new StringDef edition of the specified StringDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamStringDefEditObj newEditInstance( IYCFBamStringDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamStringDefObj realiseStringDef( IYCFBamStringDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamStringDefObj createStringDef( IYCFBamStringDefObj Obj );

	/**
	 *	Read a StringDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamStringDefObj readStringDef( YCFBamValuePKey pkey );

	/**
	 *	Read a StringDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamStringDefObj readStringDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamStringDefObj readCachedStringDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeStringDef( IYCFBamStringDefObj obj );

	void deepDisposeStringDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamStringDefObj lockStringDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the StringDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamStringDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamStringDefObj> readAllStringDef();

	/**
	 *	Return a sorted map of all the StringDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamStringDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamStringDefObj> readAllStringDef( boolean forceRead );

	List<IYCFBamStringDefObj> readCachedAllStringDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamStringDefObj readStringDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamStringDefObj readStringDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamStringDefObj readStringDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamStringDefObj readStringDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamStringDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamStringDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamStringDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamStringDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamStringDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamStringDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamStringDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamStringDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamStringDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamStringDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamStringDefObj> readStringDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamStringDefObj readCachedStringDefByIdIdx( long TenantId,
		long Id );

	IYCFBamStringDefObj readCachedStringDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamStringDefObj> readCachedStringDefByValTentIdx( long TenantId );

	List<IYCFBamStringDefObj> readCachedStringDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamStringDefObj> readCachedStringDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamStringDefObj> readCachedStringDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamStringDefObj> readCachedStringDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamStringDefObj> readCachedStringDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamStringDefObj> readCachedStringDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamStringDefObj> readCachedStringDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamStringDefObj> readCachedStringDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeStringDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeStringDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeStringDefByValTentIdx( long TenantId );

	void deepDisposeStringDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeStringDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeStringDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeStringDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeStringDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeStringDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeStringDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeStringDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamStringDefObj updateStringDef( IYCFBamStringDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteStringDef( IYCFBamStringDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamStringDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamStringDefObj refreshed cache instance.
	 */
	IYCFBamStringDefObj moveUpStringDef( IYCFBamStringDefObj Obj );

	/**
	 *	Move the YCFBamStringDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamStringDefObj refreshed cache instance.
	 */
	IYCFBamStringDefObj moveDownStringDef( IYCFBamStringDefObj Obj );
}
