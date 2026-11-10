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

public interface IYCFBamScopeTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Scope instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamScopeObj newInstance();

	/**
	 *	Instantiate a new Scope edition of the specified Scope instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamScopeEditObj newEditInstance( IYCFBamScopeObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	argClassCode	The class code used to identify the proposed instance class.
	 *
	 *	@return	IYCFBamScopeObj instance, which may be a subclass of a Scope instance.
	 */
	IYCFBamScopeObj constructByClassCode( String argClassCode );

	/**
	 *	Internal use only.
	 */
	IYCFBamScopeObj realiseScope( IYCFBamScopeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamScopeObj createScope( IYCFBamScopeObj Obj );

	/**
	 *	Read a Scope-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Scope-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamScopeObj readScope( YCFBamScopePKey pkey );

	/**
	 *	Read a Scope-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Scope-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamScopeObj readScope( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamScopeObj readCachedScope( YCFBamScopePKey pkey );

	public void reallyDeepDisposeScope( IYCFBamScopeObj obj );

	void deepDisposeScope( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamScopeObj lockScope( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the Scope-derived instances in the database.
	 *
	 *	@return	List of IYCFBamScopeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamScopeObj> readAllScope();

	/**
	 *	Return a sorted map of all the Scope-derived instances in the database.
	 *
	 *	@return	List of IYCFBamScopeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamScopeObj> readAllScope( boolean forceRead );

	List<IYCFBamScopeObj> readCachedAllScope();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamScopeObj readScopeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamScopeObj readScopeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamScopeObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamScopeObj> readScopeByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamScopeObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamScopeObj> readScopeByTenantIdx( long TenantId,
		boolean forceRead );

	IYCFBamScopeObj readCachedScopeByIdIdx( long TenantId,
		long Id );

	List<IYCFBamScopeObj> readCachedScopeByTenantIdx( long TenantId );

	void deepDisposeScopeByIdIdx( long TenantId,
		long Id );

	void deepDisposeScopeByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 */
	IYCFBamScopeObj updateScope( IYCFBamScopeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteScope( IYCFBamScopeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Scope key attribute of the instance generating the id.
	 */
	void deleteScopeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Scope key attribute of the instance generating the id.
	 */
	void deleteScopeByTenantIdx( long TenantId );
}
