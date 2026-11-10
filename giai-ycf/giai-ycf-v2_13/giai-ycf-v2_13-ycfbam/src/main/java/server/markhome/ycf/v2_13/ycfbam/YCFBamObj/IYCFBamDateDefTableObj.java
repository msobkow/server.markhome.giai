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

public interface IYCFBamDateDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DateDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamDateDefObj newInstance();

	/**
	 *	Instantiate a new DateDef edition of the specified DateDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamDateDefEditObj newEditInstance( IYCFBamDateDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateDefObj realiseDateDef( IYCFBamDateDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateDefObj createDateDef( IYCFBamDateDefObj Obj );

	/**
	 *	Read a DateDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDateDefObj readDateDef( YCFBamValuePKey pkey );

	/**
	 *	Read a DateDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamDateDefObj readDateDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamDateDefObj readCachedDateDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeDateDef( IYCFBamDateDefObj obj );

	void deepDisposeDateDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateDefObj lockDateDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DateDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDateDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDateDefObj> readAllDateDef();

	/**
	 *	Return a sorted map of all the DateDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamDateDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamDateDefObj> readAllDateDef( boolean forceRead );

	List<IYCFBamDateDefObj> readCachedAllDateDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateDefObj readDateDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateDefObj readDateDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateDefObj readDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamDateDefObj readDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamDateDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamDateDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamDateDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDateDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDateDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamDateDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamDateDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDateDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamDateDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamDateDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamDateDefObj> readDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamDateDefObj readCachedDateDefByIdIdx( long TenantId,
		long Id );

	IYCFBamDateDefObj readCachedDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamDateDefObj> readCachedDateDefByValTentIdx( long TenantId );

	List<IYCFBamDateDefObj> readCachedDateDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamDateDefObj> readCachedDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamDateDefObj> readCachedDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamDateDefObj> readCachedDateDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamDateDefObj> readCachedDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamDateDefObj> readCachedDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamDateDefObj> readCachedDateDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamDateDefObj> readCachedDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDateDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDateDefByValTentIdx( long TenantId );

	void deepDisposeDateDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDateDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDateDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamDateDefObj updateDateDef( IYCFBamDateDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateDef( IYCFBamDateDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamDateDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDateDefObj refreshed cache instance.
	 */
	IYCFBamDateDefObj moveUpDateDef( IYCFBamDateDefObj Obj );

	/**
	 *	Move the YCFBamDateDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDateDefObj refreshed cache instance.
	 */
	IYCFBamDateDefObj moveDownDateDef( IYCFBamDateDefObj Obj );
}
