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

public interface IYCFBamBlobDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new BlobDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamBlobDefObj newInstance();

	/**
	 *	Instantiate a new BlobDef edition of the specified BlobDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamBlobDefEditObj newEditInstance( IYCFBamBlobDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamBlobDefObj realiseBlobDef( IYCFBamBlobDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamBlobDefObj createBlobDef( IYCFBamBlobDefObj Obj );

	/**
	 *	Read a BlobDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamBlobDefObj readBlobDef( YCFBamValuePKey pkey );

	/**
	 *	Read a BlobDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamBlobDefObj readBlobDef( YCFBamValuePKey pkey,
		boolean forceRead );

	IYCFBamBlobDefObj readCachedBlobDef( YCFBamValuePKey pkey );

	public void reallyDeepDisposeBlobDef( IYCFBamBlobDefObj obj );

	void deepDisposeBlobDef( YCFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamBlobDefObj lockBlobDef( YCFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the BlobDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamBlobDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamBlobDefObj> readAllBlobDef();

	/**
	 *	Return a sorted map of all the BlobDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamBlobDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamBlobDefObj> readAllBlobDef( boolean forceRead );

	List<IYCFBamBlobDefObj> readCachedAllBlobDef();

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBlobDefObj readBlobDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBlobDefObj readBlobDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBlobDefObj readBlobDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamBlobDefObj readBlobDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamBlobDefObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamBlobDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamBlobDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamBlobDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamBlobDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamBlobDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of YCFBamBlobDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamBlobDefObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of YCFBamBlobDefObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamBlobDefObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamBlobDefObj> readBlobDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	IYCFBamBlobDefObj readCachedBlobDefByIdIdx( long TenantId,
		long Id );

	IYCFBamBlobDefObj readCachedBlobDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<IYCFBamBlobDefObj> readCachedBlobDefByValTentIdx( long TenantId );

	List<IYCFBamBlobDefObj> readCachedBlobDefByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamBlobDefObj> readCachedBlobDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamBlobDefObj> readCachedBlobDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamBlobDefObj> readCachedBlobDefByNextIdx( Long NextTenantId,
		Long NextId );

	List<IYCFBamBlobDefObj> readCachedBlobDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<IYCFBamBlobDefObj> readCachedBlobDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<IYCFBamBlobDefObj> readCachedBlobDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	List<IYCFBamBlobDefObj> readCachedBlobDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBlobDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeBlobDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeBlobDefByValTentIdx( long TenantId );

	void deepDisposeBlobDefByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeBlobDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeBlobDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeBlobDefByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeBlobDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeBlobDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeBlobDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeBlobDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	IYCFBamBlobDefObj updateBlobDef( IYCFBamBlobDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBlobDef( IYCFBamBlobDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The BlobDef key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The BlobDef key attribute of the instance generating the id.
	 */
	void deleteBlobDefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the YCFBamBlobDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamBlobDefObj refreshed cache instance.
	 */
	IYCFBamBlobDefObj moveUpBlobDef( IYCFBamBlobDefObj Obj );

	/**
	 *	Move the YCFBamBlobDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamBlobDefObj refreshed cache instance.
	 */
	IYCFBamBlobDefObj moveDownBlobDef( IYCFBamBlobDefObj Obj );
}
