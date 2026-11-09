
// Description: Java 11 DbIO interface for SchemaDef.

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
 *	CFBamSchemaDefTable database interface for SchemaDef
 */
public interface ICFBamSchemaDefTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSchemaDef( CFSecAuthorization Authorization,
		CFBamSchemaDefBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSchemaDef( CFSecAuthorization Authorization,
		CFBamSchemaDefBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSchemaDef( CFSecAuthorization Authorization,
		CFBamSchemaDefBuff Buff );
	/**
	 *	Delete the SchemaDef instances identified by the key CTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByCTenantIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the SchemaDef instances identified by the key CTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaDefByCTenantIdx( CFSecAuthorization Authorization,
		CFBamSchemaDefByCTenantIdxKey argKey );
	/**
	 *	Delete the SchemaDef instances identified by the key MinorVersionIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByMinorVersionIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argMinorVersionId );

	/**
	 *	Delete the SchemaDef instances identified by the key MinorVersionIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaDefByMinorVersionIdx( CFSecAuthorization Authorization,
		CFBamSchemaDefByMinorVersionIdxKey argKey );
	/**
	 *	Delete the SchemaDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByUNameIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argMinorVersionId,
		String argName );

	/**
	 *	Delete the SchemaDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaDefByUNameIdx( CFSecAuthorization Authorization,
		CFBamSchemaDefByUNameIdxKey argKey );
	/**
	 *	Delete the SchemaDef instances identified by the key AuthEMailIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByAuthEMailIdx( CFSecAuthorization Authorization,
		long argTenantId,
		String argAuthorEMail );

	/**
	 *	Delete the SchemaDef instances identified by the key AuthEMailIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaDefByAuthEMailIdx( CFSecAuthorization Authorization,
		CFBamSchemaDefByAuthEMailIdxKey argKey );
	/**
	 *	Delete the SchemaDef instances identified by the key ProjectURLIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByProjectURLIdx( CFSecAuthorization Authorization,
		long argTenantId,
		String argProjectURL );

	/**
	 *	Delete the SchemaDef instances identified by the key ProjectURLIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaDefByProjectURLIdx( CFSecAuthorization Authorization,
		CFBamSchemaDefByProjectURLIdxKey argKey );
	/**
	 *	Delete the SchemaDef instances identified by the key PubURIIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argPublishURI	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByPubURIIdx( CFSecAuthorization Authorization,
		long argTenantId,
		String argPublishURI );

	/**
	 *	Delete the SchemaDef instances identified by the key PubURIIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaDefByPubURIIdx( CFSecAuthorization Authorization,
		CFBamSchemaDefByPubURIIdxKey argKey );
	/**
	 *	Delete the SchemaDef instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the SchemaDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSchemaDefByIdIdx( CFSecAuthorization Authorization,
		CFBamScopePKey argKey );
	/**
	 *	Delete the SchemaDef instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByTenantIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the SchemaDef instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSchemaDefByTenantIdx( CFSecAuthorization Authorization,
		CFBamScopeByTenantIdxKey argKey );


	/**
	 *	Read the derived SchemaDef buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SchemaDef instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaDefBuff readDerived( CFSecAuthorization Authorization,
		CFBamScopePKey PKey );

	/**
	 *	Lock the derived SchemaDef buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SchemaDef instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaDefBuff lockDerived( CFSecAuthorization Authorization,
		CFBamScopePKey PKey );

	/**
	 *	Read all SchemaDef instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFBamSchemaDefBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived SchemaDef buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaDefBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived SchemaDef buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaDefBuff[] readDerivedByTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived SchemaDef buffer instances identified by the duplicate key CTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaDefBuff[] readDerivedByCTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived SchemaDef buffer instances identified by the duplicate key MinorVersionIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaDefBuff[] readDerivedByMinorVersionIdx( CFSecAuthorization Authorization,
		long TenantId,
		long MinorVersionId );

	/**
	 *	Read the derived SchemaDef buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaDefBuff readDerivedByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long MinorVersionId,
		String Name );

	/**
	 *	Read an array of the derived SchemaDef buffer instances identified by the duplicate key AuthEMailIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaDefBuff[] readDerivedByAuthEMailIdx( CFSecAuthorization Authorization,
		long TenantId,
		String AuthorEMail );

	/**
	 *	Read an array of the derived SchemaDef buffer instances identified by the duplicate key ProjectURLIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamSchemaDefBuff[] readDerivedByProjectURLIdx( CFSecAuthorization Authorization,
		long TenantId,
		String ProjectURL );

	/**
	 *	Read the derived SchemaDef buffer instance identified by the unique key PubURIIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argPublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamSchemaDefBuff readDerivedByPubURIIdx( CFSecAuthorization Authorization,
		long TenantId,
		String PublishURI );

	/**
	 *	Read the specific SchemaDef buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SchemaDef instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff readBuff( CFSecAuthorization Authorization,
		CFBamScopePKey PKey );

	/**
	 *	Lock the specific SchemaDef buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SchemaDef instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff lockBuff( CFSecAuthorization Authorization,
		CFBamScopePKey PKey );

	/**
	 *	Read all the specific SchemaDef buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SchemaDef instances in the database accessible for the Authorization.
	 */
	CFBamSchemaDefBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific SchemaDef buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific SchemaDef buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff[] readBuffByTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific SchemaDef buffer instances identified by the duplicate key CTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff[] readBuffByCTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific SchemaDef buffer instances identified by the duplicate key MinorVersionIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff[] readBuffByMinorVersionIdx( CFSecAuthorization Authorization,
		long TenantId,
		long MinorVersionId );

	/**
	 *	Read the specific SchemaDef buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff readBuffByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long MinorVersionId,
		String Name );

	/**
	 *	Read an array of the specific SchemaDef buffer instances identified by the duplicate key AuthEMailIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff[] readBuffByAuthEMailIdx( CFSecAuthorization Authorization,
		long TenantId,
		String AuthorEMail );

	/**
	 *	Read an array of the specific SchemaDef buffer instances identified by the duplicate key ProjectURLIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff[] readBuffByProjectURLIdx( CFSecAuthorization Authorization,
		long TenantId,
		String ProjectURL );

	/**
	 *	Read the specific SchemaDef buffer instance identified by the unique key PubURIIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argPublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamSchemaDefBuff readBuffByPubURIIdx( CFSecAuthorization Authorization,
		long TenantId,
		String PublishURI );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
