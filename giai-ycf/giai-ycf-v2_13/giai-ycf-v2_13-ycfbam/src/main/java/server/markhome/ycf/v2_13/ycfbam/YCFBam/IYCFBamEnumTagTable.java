
// Description: Java 11 DbIO interface for EnumTag.

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
 *	YCFBamEnumTagTable database interface for EnumTag
 */
public interface IYCFBamEnumTagTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createEnumTag( YCFSecAuthorization Authorization,
		YCFBamEnumTagBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateEnumTag( YCFSecAuthorization Authorization,
		YCFBamEnumTagBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteEnumTag( YCFSecAuthorization Authorization,
		YCFBamEnumTagBuff Buff );
	/**
	 *	Delete the EnumTag instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the EnumTag instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteEnumTagByIdIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey argKey );
	/**
	 *	Delete the EnumTag instances identified by the key EnumTagTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByEnumTagTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the EnumTag instances identified by the key EnumTagTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteEnumTagByEnumTagTenantIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByEnumTagTenantIdxKey argKey );
	/**
	 *	Delete the EnumTag instances identified by the key EnumIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByEnumIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argEnumId );

	/**
	 *	Delete the EnumTag instances identified by the key EnumIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteEnumTagByEnumIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByEnumIdxKey argKey );
	/**
	 *	Delete the EnumTag instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the EnumTag instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteEnumTagByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByDefSchemaIdxKey argKey );
	/**
	 *	Delete the EnumTag instances identified by the key EnumNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByEnumNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argEnumId,
		String argName );

	/**
	 *	Delete the EnumTag instances identified by the key EnumNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteEnumTagByEnumNameIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByEnumNameIdxKey argKey );
	/**
	 *	Delete the EnumTag instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the EnumTag instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteEnumTagByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByPrevIdxKey argKey );
	/**
	 *	Delete the EnumTag instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the EnumTag instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteEnumTagByNextIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByNextIdxKey argKey );


	/**
	 *	Read the derived EnumTag buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the EnumTag instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamEnumTagBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey PKey );

	/**
	 *	Lock the derived EnumTag buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the EnumTag instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamEnumTagBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey PKey );

	/**
	 *	Read all EnumTag instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFBamEnumTagBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived EnumTag buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamEnumTagBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived EnumTag buffer instances identified by the duplicate key EnumTagTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamEnumTagBuff[] readDerivedByEnumTagTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived EnumTag buffer instances identified by the duplicate key EnumIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamEnumTagBuff[] readDerivedByEnumIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long EnumId );

	/**
	 *	Read an array of the derived EnumTag buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamEnumTagBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read the derived EnumTag buffer instance identified by the unique key EnumNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFBamEnumTagBuff readDerivedByEnumNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long EnumId,
		String Name );

	/**
	 *	Read an array of the derived EnumTag buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamEnumTagBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived EnumTag buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFBamEnumTagBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read the specific EnumTag buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the EnumTag instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamEnumTagBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey PKey );

	/**
	 *	Lock the specific EnumTag buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the EnumTag instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamEnumTagBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey PKey );

	/**
	 *	Read all the specific EnumTag buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific EnumTag instances in the database accessible for the Authorization.
	 */
	YCFBamEnumTagBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific EnumTag buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamEnumTagBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific EnumTag buffer instances identified by the duplicate key EnumTagTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamEnumTagBuff[] readBuffByEnumTagTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific EnumTag buffer instances identified by the duplicate key EnumIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamEnumTagBuff[] readBuffByEnumIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long EnumId );

	/**
	 *	Read an array of the specific EnumTag buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamEnumTagBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read the specific EnumTag buffer instance identified by the unique key EnumNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argEnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argName	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamEnumTagBuff readBuffByEnumNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long EnumId,
		String Name );

	/**
	 *	Read an array of the specific EnumTag buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamEnumTagBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific EnumTag buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFBamEnumTagBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamEnumTagBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	YCFBamEnumTagBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
