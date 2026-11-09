
// Description: Java 11 DbIO interface for Relation.

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

package org.msscf.msscf.v2_13.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBamObj.*;

/*
 *	CFBamRelationTable database interface for Relation
 */
public interface ICFBamRelationTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createRelation( CFSecAuthorization Authorization,
		CFBamRelationBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateRelation( CFSecAuthorization Authorization,
		CFBamRelationBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteRelation( CFSecAuthorization Authorization,
		CFBamRelationBuff Buff );
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
	void deleteRelationByUNameIdx( CFSecAuthorization Authorization,
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
	void deleteRelationByUNameIdx( CFSecAuthorization Authorization,
		CFBamRelationByUNameIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key RelnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelnTenantIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the Relation instances identified by the key RelnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByRelnTenantIdx( CFSecAuthorization Authorization,
		CFBamRelationByRelnTenantIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key RelTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelTableIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argTableId );

	/**
	 *	Delete the Relation instances identified by the key RelTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByRelTableIdx( CFSecAuthorization Authorization,
		CFBamRelationByRelTableIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByCodeVisIdx( CFSecAuthorization Authorization,
		ICFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the Relation instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByCodeVisIdx( CFSecAuthorization Authorization,
		CFBamRelationByCodeVisIdxKey argKey );
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
	void deleteRelationByTableCodeVisIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		ICFBamSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the Relation instances identified by the key TableCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByTableCodeVisIdx( CFSecAuthorization Authorization,
		CFBamRelationByTableCodeVisIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByDefSchemaIdx( CFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the Relation instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByDefSchemaIdx( CFSecAuthorization Authorization,
		CFBamRelationByDefSchemaIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key FromKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByFromKeyIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argFromIndexId );

	/**
	 *	Delete the Relation instances identified by the key FromKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByFromKeyIdx( CFSecAuthorization Authorization,
		CFBamRelationByFromKeyIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key ToTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToTblIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argToTableId );

	/**
	 *	Delete the Relation instances identified by the key ToTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByToTblIdx( CFSecAuthorization Authorization,
		CFBamRelationByToTblIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key ToKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToKeyIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argToIndexId );

	/**
	 *	Delete the Relation instances identified by the key ToKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByToKeyIdx( CFSecAuthorization Authorization,
		CFBamRelationByToKeyIdxKey argKey );
	/**
	 *	Delete the Relation instances identified by the key NarrowedIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByNarrowedIdx( CFSecAuthorization Authorization,
		Long argNarrowedTenantId,
		Long argNarrowedId );

	/**
	 *	Delete the Relation instances identified by the key NarrowedIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByNarrowedIdx( CFSecAuthorization Authorization,
		CFBamRelationByNarrowedIdxKey argKey );
	/**
	 *	Delete the Relation instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the Relation instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteRelationByIdIdx( CFSecAuthorization Authorization,
		CFBamScopePKey argKey );
	/**
	 *	Delete the Relation instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByTenantIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the Relation instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRelationByTenantIdx( CFSecAuthorization Authorization,
		CFBamScopeByTenantIdxKey argKey );


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
	CFBamRelationBuff readDerived( CFSecAuthorization Authorization,
		CFBamScopePKey PKey );

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
	CFBamRelationBuff lockDerived( CFSecAuthorization Authorization,
		CFBamScopePKey PKey );

	/**
	 *	Read all Relation instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFBamRelationBuff[] readAllDerived( CFSecAuthorization Authorization );

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
	CFBamRelationBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
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
	CFBamRelationBuff[] readDerivedByTenantIdx( CFSecAuthorization Authorization,
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
	CFBamRelationBuff readDerivedByUNameIdx( CFSecAuthorization Authorization,
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
	CFBamRelationBuff[] readDerivedByRelnTenantIdx( CFSecAuthorization Authorization,
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
	CFBamRelationBuff[] readDerivedByRelTableIdx( CFSecAuthorization Authorization,
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
	CFBamRelationBuff[] readDerivedByCodeVisIdx( CFSecAuthorization Authorization,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
	CFBamRelationBuff[] readDerivedByTableCodeVisIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
	CFBamRelationBuff[] readDerivedByDefSchemaIdx( CFSecAuthorization Authorization,
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
	CFBamRelationBuff[] readDerivedByFromKeyIdx( CFSecAuthorization Authorization,
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
	CFBamRelationBuff[] readDerivedByToTblIdx( CFSecAuthorization Authorization,
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
	CFBamRelationBuff[] readDerivedByToKeyIdx( CFSecAuthorization Authorization,
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
	CFBamRelationBuff[] readDerivedByNarrowedIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff readBuff( CFSecAuthorization Authorization,
		CFBamScopePKey PKey );

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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff lockBuff( CFSecAuthorization Authorization,
		CFBamScopePKey PKey );

	/**
	 *	Read all the specific Relation buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Relation instances in the database accessible for the Authorization.
	 */
	CFBamRelationBuff[] readAllBuff( CFSecAuthorization Authorization );

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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff readBuffByIdIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByTenantIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff readBuffByUNameIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByRelnTenantIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByRelTableIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByCodeVisIdx( CFSecAuthorization Authorization,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByTableCodeVisIdx( CFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis );

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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByDefSchemaIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByFromKeyIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByToTblIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByToKeyIdx( CFSecAuthorization Authorization,
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
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamRelationBuff[] readBuffByNarrowedIdx( CFSecAuthorization Authorization,
		Long NarrowedTenantId,
		Long NarrowedId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
