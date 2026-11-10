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

public interface IYCFBamBlobTypeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new BlobType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamBlobTypeObj newInstance();

	/**
	 *	Instantiate a new BlobType edition of the specified BlobType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamBlobTypeEditObj newEditInstance( IYCFBamBlobTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamBlobTypeObj realiseBlobType( IYCFBamBlobTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamBlobTypeObj createBlobType( IYCFBamBlobTypeObj Obj );

	/**
	 *	Read a BlobType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamBlobTypeObj readBlobType( YCFBamValuePKey pkey );

	/**
	 *	Read a BlobType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamBlobTypeObj readBlobType( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamBlobTypeObj readCachedBlobType( YCFBamValuePKey pkey );

	public void reallyDeepDisposeBlobType( IYCFBamBlobTypeObj obj );

	void deepDisposeBlobType( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamBlobTypeObj lockBlobType( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the BlobType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamBlobTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamBlobTypeObj> readAllBlobType();

	/**
	 *	Return a sorted map of all the BlobType-derived instances in the database.
	 *
	 *	@return	List of IYCFBamBlobTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamBlobTypeObj> readAllBlobType( boolean forceRead );

	List<IYCFBamBlobTypeObj> readCachedAllBlobType();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBlobTypeObj readBlobTypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBlobTypeObj readBlobTypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBlobTypeObj readBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBlobTypeObj readBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamBlobTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The BlobType key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobTypeObj> readBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamBlobTypeObj readCachedBlobTypeByIdIdx( long TenantId,
		long Id );

	IYCFBamBlobTypeObj readCachedBlobTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeByValTentIdx( long TenantId );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamBlobTypeObj> readCachedBlobTypeBySchemaIdx( long TenantId,
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

	void deepDisposeBlobTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBlobTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBlobTypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamBlobTypeObj updateBlobType( IYCFBamBlobTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBlobType( IYCFBamBlobTypeObj Obj );

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
	void deleteBlobTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

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
	 *	Move the YCFBamBlobTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamBlobTypeObj refreshed cache instance.
	 */
	IYCFBamBlobTypeObj moveUpBlobType( IYCFBamBlobTypeObj Obj );

	/**
	 *	Move the YCFBamBlobTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamBlobTypeObj refreshed cache instance.
	 */
	IYCFBamBlobTypeObj moveDownBlobType( IYCFBamBlobTypeObj Obj );
}
