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

public interface IYCFBamBoolDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new BoolDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamBoolDefObj newInstance();

	/**
	 *	Instantiate a new BoolDef edition of the specified BoolDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamBoolDefEditObj newEditInstance( IYCFBamBoolDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamBoolDefObj realiseBoolDef( IYCFBamBoolDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamBoolDefObj createBoolDef( IYCFBamBoolDefObj Obj );

	/**
	 *	Read a BoolDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamBoolDefObj readBoolDef( YCFBamValuePKey pkey );

	/**
	 *	Read a BoolDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamBoolDefObj readBoolDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamBoolDefObj readCachedBoolDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeBoolDef( IYCFBamBoolDefObj obj );

	void deepDisposeBoolDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamBoolDefObj lockBoolDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the BoolDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamBoolDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamBoolDefObj> readAllBoolDef();

	/**
	 *	Return a sorted map of all the BoolDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamBoolDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamBoolDefObj> readAllBoolDef( boolean forceRead );

	List<IYCFBamBoolDefObj> readCachedAllBoolDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBoolDefObj readBoolDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBoolDefObj readBoolDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBoolDefObj readBoolDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBoolDefObj readBoolDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamBoolDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamBoolDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamBoolDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamBoolDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamBoolDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamBoolDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamBoolDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamBoolDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamBoolDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBoolDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBoolDefObj> readBoolDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamBoolDefObj readCachedBoolDefByIdIdx( long TenantId,
		long Id );

	IYCFBamBoolDefObj readCachedBoolDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamBoolDefObj> readCachedBoolDefByValTentIdx( long TenantId );

	List<IYCFBamBoolDefObj> readCachedBoolDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamBoolDefObj> readCachedBoolDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamBoolDefObj> readCachedBoolDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamBoolDefObj> readCachedBoolDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamBoolDefObj> readCachedBoolDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamBoolDefObj> readCachedBoolDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamBoolDefObj> readCachedBoolDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamBoolDefObj> readCachedBoolDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBoolDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeBoolDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeBoolDefByValTentIdx( long TenantId );

	void deepDisposeBoolDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeBoolDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeBoolDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeBoolDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeBoolDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeBoolDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeBoolDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBoolDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamBoolDefObj updateBoolDef( IYCFBamBoolDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBoolDef( IYCFBamBoolDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamBoolDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamBoolDefObj refreshed cache instance.
	 */
	IYCFBamBoolDefObj moveUpBoolDef( IYCFBamBoolDefObj Obj );

	/**
	 *	Move the YCFBamBoolDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamBoolDefObj refreshed cache instance.
	 */
	IYCFBamBoolDefObj moveDownBoolDef( IYCFBamBoolDefObj Obj );
}
