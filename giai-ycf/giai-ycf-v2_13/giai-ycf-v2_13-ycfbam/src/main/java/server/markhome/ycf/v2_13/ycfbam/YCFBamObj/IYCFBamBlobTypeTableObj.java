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

public interface ICFBamBlobTypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new BlobType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamBlobTypeObj newInstance();

	/**
	 *	Instantiate a new BlobType edition of the specified BlobType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamBlobTypeEditObj newEditInstance( ICFBamBlobTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobTypeObj realiseBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobTypeObj createBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Read a BlobType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamBlobTypeObj readBlobType( CFBamValuePKey pkey );

	/**
	 *	Read a BlobType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamBlobTypeObj readBlobType( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamBlobTypeObj readCachedBlobType( CFBamValuePKey pkey );

	public void reallyDeepDisposeBlobType( ICFBamBlobTypeObj obj );

	void deepDisposeBlobType( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobTypeObj lockBlobType( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the BlobType-derived instances in the database.
	 *
	 *	@return	List of ICFBamBlobTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamBlobTypeObj> readAllBlobType();

	/**
	 *	Return a sorted map of all the BlobType-derived instances in the database.
	 *
	 *	@return	List of ICFBamBlobTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamBlobTypeObj> readAllBlobType( boolean forceRead );

	List<ICFBamBlobTypeObj> readCachedAllBlobType();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobTypeObj readBlobTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobTypeObj readBlobTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobTypeObj readBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamBlobTypeObj readBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamBlobTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamBlobTypeObj> readBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamBlobTypeObj readCachedBlobTypeByIdIdx( long TenantId,
		long Id );

	ICFBamBlobTypeObj readCachedBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByValTentIdx( long TenantId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamBlobTypeObj> readCachedBlobTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamBlobTypeObj> readCachedBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeBlobTypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeBlobTypeByValTentIdx( long TenantId );

	void deepDisposeBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeBlobTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBlobTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamBlobTypeObj updateBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BlobType key attribute of the instance generating the id.
	 */
	void deleteBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamBlobTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamBlobTypeObj refreshed cache instance.
	 */
	ICFBamBlobTypeObj moveUpBlobType( ICFBamBlobTypeObj Obj );

	/**
	 *	Move the CFBamBlobTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamBlobTypeObj refreshed cache instance.
	 */
	ICFBamBlobTypeObj moveDownBlobType( ICFBamBlobTypeObj Obj );
}
