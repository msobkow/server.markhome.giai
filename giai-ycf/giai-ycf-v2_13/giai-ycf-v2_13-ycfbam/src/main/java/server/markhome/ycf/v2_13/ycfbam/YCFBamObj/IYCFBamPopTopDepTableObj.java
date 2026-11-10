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

public interface IYCFBamPopTopDepTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new PopTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamPopTopDepObj newInstance();

	/**
	 *	Instantiate a new PopTopDep edition of the specified PopTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamPopTopDepEditObj newEditInstance( IYCFBamPopTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamPopTopDepObj realisePopTopDep( IYCFBamPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamPopTopDepObj createPopTopDep( IYCFBamPopTopDepObj Obj );

	/**
	 *	Read a PopTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamPopTopDepObj readPopTopDep( YCFBamScopePKey pkey );

	/**
	 *	Read a PopTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamPopTopDepObj readPopTopDep( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamPopTopDepObj readCachedPopTopDep( YCFBamScopePKey pkey );

	public void reallyDeepDisposePopTopDep( IYCFBamPopTopDepObj obj );

	void deepDisposePopTopDep( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamPopTopDepObj lockPopTopDep( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the PopTopDep-derived instances in the database.
	 *
	 *	@return	List of IYCFBamPopTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamPopTopDepObj> readAllPopTopDep();

	/**
	 *	Return a sorted map of all the PopTopDep-derived instances in the database.
	 *
	 *	@return	List of IYCFBamPopTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamPopTopDepObj> readAllPopTopDep( boolean forceRead );

	List<IYCFBamPopTopDepObj> readCachedAllPopTopDep();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamPopTopDepObj readPopTopDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamPopTopDepObj readPopTopDepByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamPopTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamPopTopDepObj> readPopTopDepByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamPopTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamPopTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamPopTopDepObj> readPopTopDepByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamPopTopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamPopTopDepObj> readPopTopDepByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of YCFBamPopTopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamPopTopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamPopTopDepObj> readPopTopDepByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamPopTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamPopTopDepObj> readPopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamPopTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamPopTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamPopTopDepObj> readPopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamPopTopDepObj instances sorted by their primary keys for the duplicate ContRelIdx key.
	 *
	 *	@param	argContRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamPopTopDepObj cached instances sorted by their primary keys for the duplicate ContRelIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamPopTopDepObj> readPopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId );

	/**
	 *	Get the map of YCFBamPopTopDepObj instances sorted by their primary keys for the duplicate ContRelIdx key.
	 *
	 *	@param	argContRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamPopTopDepObj cached instances sorted by their primary keys for the duplicate ContRelIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamPopTopDepObj> readPopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId,
		boolean forceRead );

	/**
	 *	Get the YCFBamPopTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	argContRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamPopTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamPopTopDepObj readPopTopDepByUNameIdx(long ContRelationTenantId,
		long ContRelationId,
		String Name );

	/**
	 *	Get the YCFBamPopTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	argContRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamPopTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamPopTopDepObj readPopTopDepByUNameIdx(long ContRelationTenantId,
		long ContRelationId,
		String Name,
		boolean forceRead );

	IYCFBamPopTopDepObj readCachedPopTopDepByIdIdx( long TenantId,
		long Id );

	List<IYCFBamPopTopDepObj> readCachedPopTopDepByTenantIdx( long TenantId );

	List<IYCFBamPopTopDepObj> readCachedPopTopDepByRelationIdx( long RelationTenantId,
		long RelationId );

	List<IYCFBamPopTopDepObj> readCachedPopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<IYCFBamPopTopDepObj> readCachedPopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId );

	IYCFBamPopTopDepObj readCachedPopTopDepByUNameIdx( long ContRelationTenantId,
		long ContRelationId,
		String Name );

	void deepDisposePopTopDepByIdIdx( long TenantId,
		long Id );

	void deepDisposePopTopDepByTenantIdx( long TenantId );

	void deepDisposePopTopDepByRelationIdx( long RelationTenantId,
		long RelationId );

	void deepDisposePopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposePopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId );

	void deepDisposePopTopDepByUNameIdx( long ContRelationTenantId,
		long ContRelationId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFBamPopTopDepObj updatePopTopDep( IYCFBamPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopTopDep( IYCFBamPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argContRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argContRelationId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argContRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByUNameIdx(long ContRelationTenantId,
		long ContRelationId,
		String Name );
}
