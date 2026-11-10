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

public interface IYCFBamEnumTagTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new EnumTag instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamEnumTagObj newInstance();

	/**
	 *	Instantiate a new EnumTag edition of the specified EnumTag instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamEnumTagEditObj newEditInstance( IYCFBamEnumTagObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumTagObj realiseEnumTag( IYCFBamEnumTagObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumTagObj createEnumTag( IYCFBamEnumTagObj Obj );

	/**
	 *	Read a EnumTag-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumTag-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamEnumTagObj readEnumTag( YCFBamEnumTagPKey pkey );

	/**
	 *	Read a EnumTag-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumTag-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamEnumTagObj readEnumTag( YCFBamEnumTagPKey pkey,
		boolean forceRead );

	IYCFBamEnumTagObj readCachedEnumTag( YCFBamEnumTagPKey pkey );

	public void reallyDeepDisposeEnumTag( IYCFBamEnumTagObj obj );

	void deepDisposeEnumTag( YCFBamEnumTagPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumTagObj lockEnumTag( YCFBamEnumTagPKey pkey );

	/**
	 *	Return a sorted list of all the EnumTag-derived instances in the database.
	 *
	 *	@return	List of IYCFBamEnumTagObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamEnumTagObj> readAllEnumTag();

	/**
	 *	Return a sorted map of all the EnumTag-derived instances in the database.
	 *
	 *	@return	List of IYCFBamEnumTagObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamEnumTagObj> readAllEnumTag( boolean forceRead );

	List<IYCFBamEnumTagObj> readCachedAllEnumTag();

	/**
	 *	Get the YCFBamEnumTagObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamEnumTagObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumTagObj readEnumTagByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamEnumTagObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamEnumTagObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumTagObj readEnumTagByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate EnumTagTenantIdx key.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate EnumTagTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByEnumTagTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate EnumTagTenantIdx key.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate EnumTagTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByEnumTagTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate EnumIdx key.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate EnumIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByEnumIdx( long TenantId,
		long EnumId );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate EnumIdx key.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate EnumIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByEnumIdx( long TenantId,
		long EnumId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the YCFBamEnumTagObj instance for the unique EnumNameIdx key.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamEnumTagObj cached instance for the unique EnumNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumTagObj readEnumTagByEnumNameIdx(long TenantId,
		long EnumId,
		String Name );

	/**
	 *	Get the YCFBamEnumTagObj instance for the unique EnumNameIdx key.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamEnumTagObj refreshed instance for the unique EnumNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamEnumTagObj readEnumTagByEnumNameIdx(long TenantId,
		long EnumId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of YCFBamEnumTagObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamEnumTagObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamEnumTagObj> readEnumTagByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	IYCFBamEnumTagObj readCachedEnumTagByIdIdx( long TenantId,
		long Id );

	List<IYCFBamEnumTagObj> readCachedEnumTagByEnumTagTenantIdx( long TenantId );

	List<IYCFBamEnumTagObj> readCachedEnumTagByEnumIdx( long TenantId,
		long EnumId );

	List<IYCFBamEnumTagObj> readCachedEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	IYCFBamEnumTagObj readCachedEnumTagByEnumNameIdx( long TenantId,
		long EnumId,
		String Name );

	List<IYCFBamEnumTagObj> readCachedEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<IYCFBamEnumTagObj> readCachedEnumTagByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeEnumTagByIdIdx( long TenantId,
		long Id );

	void deepDisposeEnumTagByEnumTagTenantIdx( long TenantId );

	void deepDisposeEnumTagByEnumIdx( long TenantId,
		long EnumId );

	void deepDisposeEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeEnumTagByEnumNameIdx( long TenantId,
		long EnumId,
		String Name );

	void deepDisposeEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeEnumTagByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	IYCFBamEnumTagObj updateEnumTag( IYCFBamEnumTagObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumTag( IYCFBamEnumTagObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByEnumTagTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByEnumIdx( long TenantId,
		long EnumId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByEnumNameIdx(long TenantId,
		long EnumId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Move the YCFBamEnumTagObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamEnumTagObj refreshed cache instance.
	 */
	IYCFBamEnumTagObj moveUpEnumTag( IYCFBamEnumTagObj Obj );

	/**
	 *	Move the YCFBamEnumTagObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamEnumTagObj refreshed cache instance.
	 */
	IYCFBamEnumTagObj moveDownEnumTag( IYCFBamEnumTagObj Obj );
}
