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

public interface ICFBamIndexTweakTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new IndexTweak instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamIndexTweakObj newInstance();

	/**
	 *	Instantiate a new IndexTweak edition of the specified IndexTweak instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamIndexTweakEditObj newEditInstance( ICFBamIndexTweakObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexTweakObj realiseIndexTweak( ICFBamIndexTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexTweakObj createIndexTweak( ICFBamIndexTweakObj Obj );

	/**
	 *	Read a IndexTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamIndexTweakObj readIndexTweak( CFBamTweakPKey pkey );

	/**
	 *	Read a IndexTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamIndexTweakObj readIndexTweak( CFBamTweakPKey pkey,
		boolean forceRead );

	ICFBamIndexTweakObj readCachedIndexTweak( CFBamTweakPKey pkey );

	public void reallyDeepDisposeIndexTweak( ICFBamIndexTweakObj obj );

	void deepDisposeIndexTweak( CFBamTweakPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexTweakObj lockIndexTweak( CFBamTweakPKey pkey );

	/**
	 *	Return a sorted list of all the IndexTweak-derived instances in the database.
	 *
	 *	@return	List of ICFBamIndexTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamIndexTweakObj> readAllIndexTweak();

	/**
	 *	Return a sorted map of all the IndexTweak-derived instances in the database.
	 *
	 *	@return	List of ICFBamIndexTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamIndexTweakObj> readAllIndexTweak( boolean forceRead );

	List<ICFBamIndexTweakObj> readCachedAllIndexTweak();

	/**
	 *	Get the CFBamTweakObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexTweakObj readIndexTweakByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamTweakObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexTweakObj readIndexTweakByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexTweakObj readIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexTweakObj readIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the CFBamTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexTweakObj readIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Get the CFBamTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamIndexTweakObj readIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexTweakObj> readIndexTweakByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamIndexTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexTweakObj> readIndexTweakByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexTweakObj> readIndexTweakByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamIndexTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexTweakObj> readIndexTweakByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexTweakObj> readIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamIndexTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexTweakObj> readIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamIndexTweakObj instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexTweakObj cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexTweakObj> readIndexTweakByIndexIdx( long TenantId,
		long IndexId );

	/**
	 *	Get the map of CFBamIndexTweakObj instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamIndexTweakObj cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamIndexTweakObj> readIndexTweakByIndexIdx( long TenantId,
		long IndexId,
		boolean forceRead );

	ICFBamIndexTweakObj readCachedIndexTweakByIdIdx( long TenantId,
		long Id );

	ICFBamIndexTweakObj readCachedIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	ICFBamIndexTweakObj readCachedIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	List<ICFBamIndexTweakObj> readCachedIndexTweakByValTentIdx( long TenantId );

	List<ICFBamIndexTweakObj> readCachedIndexTweakByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamIndexTweakObj> readCachedIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamIndexTweakObj> readCachedIndexTweakByIndexIdx( long TenantId,
		long IndexId );

	void deepDisposeIndexTweakByIdIdx( long TenantId,
		long Id );

	void deepDisposeIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	void deepDisposeIndexTweakByValTentIdx( long TenantId );

	void deepDisposeIndexTweakByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeIndexTweakByIndexIdx( long TenantId,
		long IndexId );

	/**
	 *	Internal use only.
	 */
	ICFBamIndexTweakObj updateIndexTweak( ICFBamIndexTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndexTweak( ICFBamIndexTweakObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByIndexIdx( long TenantId,
		long IndexId );
}
