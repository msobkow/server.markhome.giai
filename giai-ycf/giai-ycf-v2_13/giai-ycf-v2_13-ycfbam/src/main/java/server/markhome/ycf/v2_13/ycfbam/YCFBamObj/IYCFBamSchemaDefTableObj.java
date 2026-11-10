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

public interface IYCFBamSchemaDefTableObj
{
	IYCFBamSchemaObj getSchema();
	void setSchema( IYCFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SchemaDef instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFBamSchemaDefObj newInstance();

	/**
	 *	Instantiate a new SchemaDef edition of the specified SchemaDef instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFBamSchemaDefEditObj newEditInstance( IYCFBamSchemaDefObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFBamSchemaDefObj realiseSchemaDef( IYCFBamSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFBamSchemaDefObj createSchemaDef( IYCFBamSchemaDefObj Obj );

	/**
	 *	Read a SchemaDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamSchemaDefObj readSchemaDef( YCFBamScopePKey pkey );

	/**
	 *	Read a SchemaDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFBamSchemaDefObj readSchemaDef( YCFBamScopePKey pkey,
		boolean forceRead );

	IYCFBamSchemaDefObj readCachedSchemaDef( YCFBamScopePKey pkey );

	public void reallyDeepDisposeSchemaDef( IYCFBamSchemaDefObj obj );

	void deepDisposeSchemaDef( YCFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFBamSchemaDefObj lockSchemaDef( YCFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the SchemaDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamSchemaDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamSchemaDefObj> readAllSchemaDef();

	/**
	 *	Return a sorted map of all the SchemaDef-derived instances in the database.
	 *
	 *	@return	List of IYCFBamSchemaDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFBamSchemaDefObj> readAllSchemaDef( boolean forceRead );

	List<IYCFBamSchemaDefObj> readCachedAllSchemaDef();

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaDefObj readSchemaDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaDefObj readSchemaDefByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamSchemaDefObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamSchemaDefObj instances sorted by their primary keys for the duplicate CTenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate CTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByCTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFBamSchemaDefObj instances sorted by their primary keys for the duplicate CTenantIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate CTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByCTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamSchemaDefObj instances sorted by their primary keys for the duplicate MinorVersionIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate MinorVersionIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId );

	/**
	 *	Get the map of YCFBamSchemaDefObj instances sorted by their primary keys for the duplicate MinorVersionIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate MinorVersionIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId,
		boolean forceRead );

	/**
	 *	Get the YCFBamSchemaDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamSchemaDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaDefObj readSchemaDefByUNameIdx(long TenantId,
		long MinorVersionId,
		String Name );

	/**
	 *	Get the YCFBamSchemaDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamSchemaDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaDefObj readSchemaDefByUNameIdx(long TenantId,
		long MinorVersionId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamSchemaDefObj instances sorted by their primary keys for the duplicate AuthEMailIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate AuthEMailIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail );

	/**
	 *	Get the map of YCFBamSchemaDefObj instances sorted by their primary keys for the duplicate AuthEMailIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate AuthEMailIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail,
		boolean forceRead );

	/**
	 *	Get the map of YCFBamSchemaDefObj instances sorted by their primary keys for the duplicate ProjectURLIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate ProjectURLIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL );

	/**
	 *	Get the map of YCFBamSchemaDefObj instances sorted by their primary keys for the duplicate ProjectURLIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFBamSchemaDefObj cached instances sorted by their primary keys for the duplicate ProjectURLIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFBamSchemaDefObj> readSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL,
		boolean forceRead );

	/**
	 *	Get the YCFBamSchemaDefObj instance for the unique PubURIIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argPublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamSchemaDefObj cached instance for the unique PubURIIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaDefObj readSchemaDefByPubURIIdx(long TenantId,
		String PublishURI );

	/**
	 *	Get the YCFBamSchemaDefObj instance for the unique PubURIIdx key.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argPublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	YCFBamSchemaDefObj refreshed instance for the unique PubURIIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFBamSchemaDefObj readSchemaDefByPubURIIdx(long TenantId,
		String PublishURI,
		boolean forceRead );

	IYCFBamSchemaDefObj readCachedSchemaDefByIdIdx( long TenantId,
		long Id );

	List<IYCFBamSchemaDefObj> readCachedSchemaDefByTenantIdx( long TenantId );

	List<IYCFBamSchemaDefObj> readCachedSchemaDefByCTenantIdx( long TenantId );

	List<IYCFBamSchemaDefObj> readCachedSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId );

	IYCFBamSchemaDefObj readCachedSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name );

	List<IYCFBamSchemaDefObj> readCachedSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail );

	List<IYCFBamSchemaDefObj> readCachedSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL );

	IYCFBamSchemaDefObj readCachedSchemaDefByPubURIIdx( long TenantId,
		String PublishURI );

	void deepDisposeSchemaDefByIdIdx( long TenantId,
		long Id );

	void deepDisposeSchemaDefByTenantIdx( long TenantId );

	void deepDisposeSchemaDefByCTenantIdx( long TenantId );

	void deepDisposeSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId );

	void deepDisposeSchemaDefByUNameIdx( long TenantId,
		long MinorVersionId,
		String Name );

	void deepDisposeSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail );

	void deepDisposeSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL );

	void deepDisposeSchemaDefByPubURIIdx( long TenantId,
		String PublishURI );

	/**
	 *	Internal use only.
	 */
	IYCFBamSchemaDefObj updateSchemaDef( IYCFBamSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaDef( IYCFBamSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByCTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByMinorVersionIdx( long TenantId,
		long MinorVersionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByUNameIdx(long TenantId,
		long MinorVersionId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByAuthEMailIdx( long TenantId,
		String AuthorEMail );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByProjectURLIdx( long TenantId,
		String ProjectURL );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argPublishURI	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByPubURIIdx(long TenantId,
		String PublishURI );
}
