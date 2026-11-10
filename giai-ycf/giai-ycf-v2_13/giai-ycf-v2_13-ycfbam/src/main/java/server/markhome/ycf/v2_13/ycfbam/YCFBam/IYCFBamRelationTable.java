
// Description: Java 11 DbIO interface for Relation.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

/*
 *	YCFBamRelationTable database interface for Relation
 */
public interface IYCFBamRelationTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createRelation( YCFSecAuthorization Authorization,
		YCFBamRelationBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateRelation( YCFSecAuthorization Authorization,
		YCFBamRelationBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteRelation( YCFSecAuthorization Authorization,
		YCFBamRelationBuff Buff );
	/**
	 *	Delete the Relation instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		String argName );

	/**
	 *	Delete the Relation instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByUNameIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key RelnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelnTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the Relation instances identified by the key RelnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByRelnTenantIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByRelnTenantIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key RelTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId );

	/**
	 *	Delete the Relation instances identified by the key RelTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByRelTableIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByRelTableIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the Relation instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByCodeVisIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key TableCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the Relation instances identified by the key TableCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByTableCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByTableCodeVisIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the Relation instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByDefSchemaIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key FromKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByFromKeyIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argFromIndexId );

	/**
	 *	Delete the Relation instances identified by the key FromKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByFromKeyIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByFromKeyIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key ToTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToTblIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argToTableId );

	/**
	 *	Delete the Relation instances identified by the key ToTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByToTblIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByToTblIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key ToKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToKeyIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argToIndexId );

	/**
	 *	Delete the Relation instances identified by the key ToKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByToKeyIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByToKeyIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key NarrowedIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByNarrowedIdx( YCFSecAuthorization Authorization,
		Long argNarrowedTenantId,
		Long argNarrowedId );

	/**
	 *	Delete the Relation instances identified by the key NarrowedIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByNarrowedIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByNarrowedIdxKey argKey );
	/**
	 *	Delete the Relation instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the Relation instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteRelationByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey );
	/**
	 *	Delete the Relation instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the Relation instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey );


	/**
	 *	Read the derived Relation buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Relation instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamRelationBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Lock the derived Relation buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Relation instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamRelationBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Read all Relation instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived Relation buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamRelationBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read the derived Relation buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Relation key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamRelationBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key RelnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByRelnTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key RelTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByRelTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key TableCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key FromKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByFromKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long FromIndexId );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key ToTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByToTblIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToTableId );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key ToKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByToKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToIndexId );

	/**
	 *	Read an array of the derived Relation buffer instances identified by the duplicate key NarrowedIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamRelationBuff[] readDerivedByNarrowedIdx( YCFSecAuthorization Authorization,
		Long NarrowedTenantId,
		Long NarrowedId );

	/**
	 *	Read the specific Relation buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Relation instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Lock the specific Relation buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Relation instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey );

	/**
	 *	Read all the specific Relation buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Relation instances in the database accessible for the Authorization.
	 */
	YCFBamRelationBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific Relation buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read the specific Relation buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Relation key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key RelnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByRelnTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key RelTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByRelTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key TableCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key FromKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByFromKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long FromIndexId );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key ToTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByToTblIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToTableId );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key ToKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByToKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToIndexId );

	/**
	 *	Read an array of the specific Relation buffer instances identified by the duplicate key NarrowedIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamRelationBuff[] readBuffByNarrowedIdx( YCFSecAuthorization Authorization,
		Long NarrowedTenantId,
		Long NarrowedId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
