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

public interface IYCFBamEnumDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new EnumDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamEnumDefObj newInstance();

	/**
	 *	Instantiate a new EnumDef edition of the specified EnumDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamEnumDefEditObj newEditInstance( IYCFBamEnumDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumDefObj realiseEnumDef( IYCFBamEnumDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumDefObj createEnumDef( IYCFBamEnumDefObj Obj );

	/**
	 *	Read a EnumDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamEnumDefObj readEnumDef( YCFBamValuePKey pkey );

	/**
	 *	Read a EnumDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamEnumDefObj readEnumDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamEnumDefObj readCachedEnumDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeEnumDef( IYCFBamEnumDefObj obj );

	void deepDisposeEnumDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumDefObj lockEnumDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the EnumDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamEnumDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamEnumDefObj> readAllEnumDef();

	/**
	 *	Return a sorted map of all the EnumDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamEnumDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamEnumDefObj> readAllEnumDef( boolean forceRead );

	List<IYCFBamEnumDefObj> readCachedAllEnumDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumDefObj readEnumDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumDefObj readEnumDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumDefObj readEnumDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumDefObj readEnumDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamEnumDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamEnumDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamEnumDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamEnumDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamEnumDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamEnumDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamEnumDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamEnumDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamEnumDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumDefObj> readEnumDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamEnumDefObj readCachedEnumDefByIdIdx( long TenantId,
		long Id );

	IYCFBamEnumDefObj readCachedEnumDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamEnumDefObj> readCachedEnumDefByValTentIdx( long TenantId );

	List<IYCFBamEnumDefObj> readCachedEnumDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamEnumDefObj> readCachedEnumDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamEnumDefObj> readCachedEnumDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamEnumDefObj> readCachedEnumDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamEnumDefObj> readCachedEnumDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamEnumDefObj> readCachedEnumDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamEnumDefObj> readCachedEnumDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamEnumDefObj> readCachedEnumDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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

	void deepDisposeEnumDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeEnumDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumDefObj updateEnumDef( IYCFBamEnumDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumDef( IYCFBamEnumDefObj Obj );

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
	void deleteEnumDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamEnumDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamEnumDefObj refreshed cache instance.
	 */
	IYCFBamEnumDefObj moveUpEnumDef( IYCFBamEnumDefObj Obj );

	/**
	 *	Move the YCFBamEnumDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamEnumDefObj refreshed cache instance.
	 */
	IYCFBamEnumDefObj moveDownEnumDef( IYCFBamEnumDefObj Obj );
}
