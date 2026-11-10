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

public interface IYCFBamTokenColTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TokenCol instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamTokenColObj newInstance();

	/**
	 *	Instantiate a new TokenCol edition of the specified TokenCol instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamTokenColEditObj newEditInstance( IYCFBamTokenColObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamTokenColObj realiseTokenCol( IYCFBamTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamTokenColObj createTokenCol( IYCFBamTokenColObj Obj );

	/**
	 *	Read a TokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTokenColObj readTokenCol( YCFBamValuePKey pkey );

	/**
	 *	Read a TokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamTokenColObj readTokenCol( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamTokenColObj readCachedTokenCol( YCFBamValuePKey pkey );

	public void reallyDeepDisposeTokenCol( IYCFBamTokenColObj obj );

	void deepDisposeTokenCol( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamTokenColObj lockTokenCol( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TokenCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTokenColObj> readAllTokenCol();

	/**
	 *	Return a sorted map of all the TokenCol-derived instances in the database.
	 *
	 *	@return	List of IYCFBamTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamTokenColObj> readAllTokenCol( boolean forceRead );

	List<IYCFBamTokenColObj> readCachedAllTokenCol();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTokenColObj readTokenColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTokenColObj readTokenColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTokenColObj readTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamTokenColObj readTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of YCFBamTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamTokenColObj> readTokenColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	IYCFBamTokenColObj readCachedTokenColByIdIdx( long TenantId,
		long Id );

	IYCFBamTokenColObj readCachedTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamTokenColObj> readCachedTokenColByValTentIdx( long TenantId );

	List<IYCFBamTokenColObj> readCachedTokenColByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamTokenColObj> readCachedTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamTokenColObj> readCachedTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamTokenColObj> readCachedTokenColByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamTokenColObj> readCachedTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamTokenColObj> readCachedTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamTokenColObj> readCachedTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTokenColObj> readCachedTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamTokenColObj> readCachedTokenColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTokenColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTokenColByValTentIdx( long TenantId );

	void deepDisposeTokenColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTokenColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTokenColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	IYCFBamTokenColObj updateTokenCol( IYCFBamTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTokenCol( IYCFBamTokenColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the YCFBamTokenColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTokenColObj refreshed cache instance.
	 */
	IYCFBamTokenColObj moveUpTokenCol( IYCFBamTokenColObj Obj );

	/**
	 *	Move the YCFBamTokenColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTokenColObj refreshed cache instance.
	 */
	IYCFBamTokenColObj moveDownTokenCol( IYCFBamTokenColObj Obj );
}
