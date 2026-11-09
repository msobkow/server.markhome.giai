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

public interface ICFBamValueTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Value instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamValueObj newInstance();

	/**
	 *	Instantiate a new Value edition of the specified Value instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamValueEditObj newEditInstance( ICFBamValueObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	argClassCode	The class code used to identify the proposed instance class.
	 *
	 *	@return	ICFBamValueObj instance, which may be a subclass of a Value instance.
	 */
	ICFBamValueObj constructByClassCode( String argClassCode );

	/**
	 *	Internal use only.
	 */
	ICFBamValueObj realiseValue( ICFBamValueObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamValueObj createValue( ICFBamValueObj Obj );

	/**
	 *	Read a Value-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Value-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamValueObj readValue( CFBamValuePKey pkey );

	/**
	 *	Read a Value-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Value-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamValueObj readValue( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamValueObj readCachedValue( CFBamValuePKey pkey );

	public void reallyDeepDisposeValue( ICFBamValueObj obj );

	void deepDisposeValue( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamValueObj lockValue( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Value-derived instances in the database.
	 *
	 *	@return	List of ICFBamValueObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamValueObj> readAllValue();

	/**
	 *	Return a sorted map of all the Value-derived instances in the database.
	 *
	 *	@return	List of ICFBamValueObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamValueObj> readAllValue( boolean forceRead );

	List<ICFBamValueObj> readCachedAllValue();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamValueObj readValueByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamValueObj readValueByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Value key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamValueObj readValueByUNameIdx(long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Value key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamValueObj readValueByUNameIdx(long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	argCodeVis	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamValueObj cached instances sorted by their primary keys for the duplicate ScopeCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamValueObj> readValueByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	ICFBamValueObj readCachedValueByIdIdx( long TenantId,
		long Id );

	ICFBamValueObj readCachedValueByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamValueObj> readCachedValueByValTentIdx( long TenantId );

	List<ICFBamValueObj> readCachedValueByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamValueObj> readCachedValueByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamValueObj> readCachedValueByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamValueObj> readCachedValueByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamValueObj> readCachedValueByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamValueObj> readCachedValueByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamValueObj> readCachedValueByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamValueObj> readCachedValueByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeValueByIdIdx( long TenantId,
		long Id );

	void deepDisposeValueByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeValueByValTentIdx( long TenantId );

	void deepDisposeValueByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeValueByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeValueByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeValueByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeValueByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeValueByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeValueByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeValueByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 */
	ICFBamValueObj updateValue( ICFBamValueObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteValue( ICFBamValueObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByUNameIdx(long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argCodeVis	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Move the CFBamValueObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamValueObj refreshed cache instance.
	 */
	ICFBamValueObj moveUpValue( ICFBamValueObj Obj );

	/**
	 *	Move the CFBamValueObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamValueObj refreshed cache instance.
	 */
	ICFBamValueObj moveDownValue( ICFBamValueObj Obj );
}
