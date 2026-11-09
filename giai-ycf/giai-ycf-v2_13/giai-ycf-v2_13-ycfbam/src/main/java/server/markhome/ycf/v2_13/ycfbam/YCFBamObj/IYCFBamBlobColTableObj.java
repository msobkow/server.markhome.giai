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

public interface ICFBamBlobColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new BlobCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamBlobColObj newInstance();

	/**
	 *	Instantiate a new BlobCol edition of the specified BlobCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamBlobColEditObj newEditInstance( ICFBamBlobColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobColObj realiseBlobCol( ICFBamBlobColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobColObj createBlobCol( ICFBamBlobColObj Obj );

	/**
	 *	Read a BlobCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamBlobColObj readBlobCol( CFBamValuePKey pkey );

	/**
	 *	Read a BlobCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamBlobColObj readBlobCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamBlobColObj readCachedBlobCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeBlobCol( ICFBamBlobColObj obj );

	void deepDisposeBlobCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobColObj lockBlobCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the BlobCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamBlobColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamBlobColObj> readAllBlobCol();

	/**
	 *	Return a sorted map of all the BlobCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamBlobColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamBlobColObj> readAllBlobCol( boolean forceRead );

	List<ICFBamBlobColObj> readCachedAllBlobCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobColObj readBlobColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobColObj readBlobColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobColObj readBlobColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobColObj readBlobColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamBlobColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobColObj> readBlobColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamBlobColObj readCachedBlobColByIdIdx( long TenantId,
		long Id );

	ICFBamBlobColObj readCachedBlobColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamBlobColObj> readCachedBlobColByValTentIdx( long TenantId );

	List<ICFBamBlobColObj> readCachedBlobColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamBlobColObj> readCachedBlobColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamBlobColObj> readCachedBlobColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamBlobColObj> readCachedBlobColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamBlobColObj> readCachedBlobColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamBlobColObj> readCachedBlobColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamBlobColObj> readCachedBlobColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamBlobColObj> readCachedBlobColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamBlobColObj> readCachedBlobColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeBlobColByIdIdx( long TenantId,
		long Id );

	void deepDisposeBlobColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeBlobColByValTentIdx( long TenantId );

	void deepDisposeBlobColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeBlobColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeBlobColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeBlobColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeBlobColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeBlobColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeBlobColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBlobColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBlobColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobColObj updateBlobCol( ICFBamBlobColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBlobCol( ICFBamBlobColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamBlobColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamBlobColObj refreshed cache instance.
	 */
	ICFBamBlobColObj moveUpBlobCol( ICFBamBlobColObj Obj );

	/**
	 *	Move the CFBamBlobColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamBlobColObj refreshed cache instance.
	 */
	ICFBamBlobColObj moveDownBlobCol( ICFBamBlobColObj Obj );
}
