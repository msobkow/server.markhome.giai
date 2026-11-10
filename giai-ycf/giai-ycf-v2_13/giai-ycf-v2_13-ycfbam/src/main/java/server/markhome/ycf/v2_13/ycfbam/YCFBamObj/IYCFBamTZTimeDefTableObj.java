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

public interface IYCFBamTZTimeDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TZTimeDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTZTimeDefObj newInstance();

	/**
	 *	Instantiate a new TZTimeDef edition of the specified TZTimeDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTZTimeDefEditObj newEditInstance( IYCFBamTZTimeDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimeDefObj realiseTZTimeDef( IYCFBamTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimeDefObj createTZTimeDef( IYCFBamTZTimeDefObj Obj );

	/**
	 *	Read a TZTimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZTimeDefObj readTZTimeDef( YCFBamValuePKey pkey );

	/**
	 *	Read a TZTimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTZTimeDefObj readTZTimeDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTZTimeDefObj readCachedTZTimeDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTZTimeDef( IYCFBamTZTimeDefObj obj );

	void deepDisposeTZTimeDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimeDefObj lockTZTimeDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TZTimeDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readAllTZTimeDef();

	/**
	 *	Return a sorted map of all the TZTimeDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTZTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readAllTZTimeDef( boolean forceRead );

	List<IYCFBamTZTimeDefObj> readCachedAllTZTimeDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimeDefObj readTZTimeDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimeDefObj readTZTimeDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimeDefObj readTZTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTZTimeDefObj readTZTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTZTimeDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZTimeDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZTimeDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZTimeDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTZTimeDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTZTimeDefObj> readTZTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamTZTimeDefObj readCachedTZTimeDefByIdIdx( long TenantId,
		long Id );

	IYCFBamTZTimeDefObj readCachedTZTimeDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTZTimeDefObj> readCachedTZTimeDefByValTentIdx( long TenantId );

	List<IYCFBamTZTimeDefObj> readCachedTZTimeDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTZTimeDefObj> readCachedTZTimeDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTZTimeDefObj> readCachedTZTimeDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTZTimeDefObj> readCachedTZTimeDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTZTimeDefObj> readCachedTZTimeDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTZTimeDefObj> readCachedTZTimeDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTZTimeDefObj> readCachedTZTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTZTimeDefObj> readCachedTZTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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

	void deepDisposeTZTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTZTimeDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamTZTimeDefObj updateTZTimeDef( IYCFBamTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimeDef( IYCFBamTZTimeDefObj Obj );

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
	void deleteTZTimeDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamTZTimeDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimeDefObj refreshed cache instance.
	 */
	IYCFBamTZTimeDefObj moveUpTZTimeDef( IYCFBamTZTimeDefObj Obj );

	/**
	 *	Move the YCFBamTZTimeDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimeDefObj refreshed cache instance.
	 */
	IYCFBamTZTimeDefObj moveDownTZTimeDef( IYCFBamTZTimeDefObj Obj );
}
