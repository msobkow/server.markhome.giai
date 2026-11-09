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

public interface ICFBamTableTweakTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TableTweak instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTableTweakObj newInstance();

	/**
	 *	Instantiate a new TableTweak edition of the specified TableTweak instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTableTweakEditObj newEditInstance( ICFBamTableTweakObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTableTweakObj realiseTableTweak( ICFBamTableTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTableTweakObj createTableTweak( ICFBamTableTweakObj Obj );

	/**
	 *	Read a TableTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTableTweakObj readTableTweak( CFBamTweakPKey pkey );

	/**
	 *	Read a TableTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTableTweakObj readTableTweak( CFBamTweakPKey pkey,
		boolean forceRead );

	ICFBamTableTweakObj readCachedTableTweak( CFBamTweakPKey pkey );

	public void reallyDeepDisposeTableTweak( ICFBamTableTweakObj obj );

	void deepDisposeTableTweak( CFBamTweakPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTableTweakObj lockTableTweak( CFBamTweakPKey pkey );

	/**
	 *	Return a sorted list of all the TableTweak-derived instances in the database.
	 *
	 *	@return	List of ICFBamTableTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTableTweakObj> readAllTableTweak();

	/**
	 *	Return a sorted map of all the TableTweak-derived instances in the database.
	 *
	 *	@return	List of ICFBamTableTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTableTweakObj> readAllTableTweak( boolean forceRead );

	List<ICFBamTableTweakObj> readCachedAllTableTweak();

	/**
	 *	Get the CFBamTweakObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableTweakObj readTableTweakByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamTweakObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableTweakObj readTableTweakByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableTweakObj readTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableTweakObj readTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the CFBamTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableTweakObj readTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Get the CFBamTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	CFBamTweakObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTableTweakObj readTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableTweakObj> readTableTweakByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTableTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableTweakObj> readTableTweakByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableTweakObj> readTableTweakByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTableTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableTweakObj> readTableTweakByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableTweakObj> readTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTableTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableTweakObj> readTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTableTweakObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableTweakObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableTweakObj> readTableTweakByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamTableTweakObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTableTweakObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTableTweakObj> readTableTweakByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamTableTweakObj readCachedTableTweakByIdIdx( long TenantId,
		long Id );

	ICFBamTableTweakObj readCachedTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	ICFBamTableTweakObj readCachedTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	List<ICFBamTableTweakObj> readCachedTableTweakByValTentIdx( long TenantId );

	List<ICFBamTableTweakObj> readCachedTableTweakByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTableTweakObj> readCachedTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTableTweakObj> readCachedTableTweakByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTableTweakByIdIdx( long TenantId,
		long Id );

	void deepDisposeTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	void deepDisposeTableTweakByValTentIdx( long TenantId );

	void deepDisposeTableTweakByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTableTweakByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamTableTweakObj updateTableTweak( ICFBamTableTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTableTweak( ICFBamTableTweakObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByTableIdx( long TenantId,
		long TableId );
}
