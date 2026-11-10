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

public interface IYCFBamSchemaTweakTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SchemaTweak instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamSchemaTweakObj newInstance();

	/**
	 *	Instantiate a new SchemaTweak edition of the specified SchemaTweak instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamSchemaTweakEditObj newEditInstance( IYCFBamSchemaTweakObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamSchemaTweakObj realiseSchemaTweak( IYCFBamSchemaTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamSchemaTweakObj createSchemaTweak( IYCFBamSchemaTweakObj Obj );

	/**
	 *	Read a SchemaTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamSchemaTweakObj readSchemaTweak( YCFBamTweakPKey pkey );

	/**
	 *	Read a SchemaTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamSchemaTweakObj readSchemaTweak( YCFBamTweakPKey pkey,
		boolean forceRead );

	IYCFBamSchemaTweakObj readCachedSchemaTweak( YCFBamTweakPKey pkey );

	public void reallyDeepDisposeSchemaTweak( IYCFBamSchemaTweakObj obj );

	void deepDisposeSchemaTweak( YCFBamTweakPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamSchemaTweakObj lockSchemaTweak( YCFBamTweakPKey pkey );

	/**
	 *	Return a sorted list of all the SchemaTweak-derived instances in the database.
	 *
	 *	@return	List of IYCFBamSchemaTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readAllSchemaTweak();

	/**
	 *	Return a sorted map of all the SchemaTweak-derived instances in the database.
	 *
	 *	@return	List of IYCFBamSchemaTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readAllSchemaTweak( boolean forceRead );

	List<IYCFBamSchemaTweakObj> readCachedAllSchemaTweak();

	/**
	 *	Get the YCFBamTweakObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTweakObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaTweakObj readSchemaTweakByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamTweakObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTweakObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaTweakObj readSchemaTweakByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the YCFBamTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTweakObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaTweakObj readSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the YCFBamTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTweakObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaTweakObj readSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the YCFBamTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTweakObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaTweakObj readSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Get the YCFBamTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamTweakObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaTweakObj readSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readSchemaTweakByValTentIdx( long TenantId );

	/**
	 *	Get the map of YCFBamSchemaTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readSchemaTweakByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readSchemaTweakByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of YCFBamSchemaTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readSchemaTweakByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamSchemaTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamSchemaTweakObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaTweakObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of YCFBamSchemaTweakObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaTweakObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaTweakObj> readSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	IYCFBamSchemaTweakObj readCachedSchemaTweakByIdIdx( long TenantId,
		long Id );

	IYCFBamSchemaTweakObj readCachedSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	IYCFBamSchemaTweakObj readCachedSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	List<IYCFBamSchemaTweakObj> readCachedSchemaTweakByValTentIdx( long TenantId );

	List<IYCFBamSchemaTweakObj> readCachedSchemaTweakByScopeIdx( long TenantId,
		long ScopeId );

	List<IYCFBamSchemaTweakObj> readCachedSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamSchemaTweakObj> readCachedSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeSchemaTweakByIdIdx( long TenantId,
		long Id );

	void deepDisposeSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	void deepDisposeSchemaTweakByValTentIdx( long TenantId );

	void deepDisposeSchemaTweakByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IYCFBamSchemaTweakObj updateSchemaTweak( IYCFBamSchemaTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaTweak( IYCFBamSchemaTweakObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId );
}
