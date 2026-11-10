
// Description: Java 11 DbIO interface for ToolSet.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

/*
 *	YCFGenKbToolSetTable database interface for ToolSet
 */
public interface IYCFGenKbToolSetTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createToolSet( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateToolSet( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteToolSet( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetBuff Buff );
	/**
	 *	Delete the ToolSet instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByIdIdx( YCFGenKbAuthorization Authorization,
		short argId );

	/**
	 *	Delete the ToolSet instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteToolSetByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey argKey );
	/**
	 *	Delete the ToolSet instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByNameIdx( YCFGenKbAuthorization Authorization,
		String argName );

	/**
	 *	Delete the ToolSet instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolSetByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByNameIdxKey argKey );
	/**
	 *	Delete the ToolSet instances identified by the key Tool0Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId0	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool0Idx( YCFGenKbAuthorization Authorization,
		short argToolId0 );

	/**
	 *	Delete the ToolSet instances identified by the key Tool0Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolSetByTool0Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool0IdxKey argKey );
	/**
	 *	Delete the ToolSet instances identified by the key Tool1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId1	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool1Idx( YCFGenKbAuthorization Authorization,
		Short argToolId1 );

	/**
	 *	Delete the ToolSet instances identified by the key Tool1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolSetByTool1Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool1IdxKey argKey );
	/**
	 *	Delete the ToolSet instances identified by the key Tool2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId2	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool2Idx( YCFGenKbAuthorization Authorization,
		Short argToolId2 );

	/**
	 *	Delete the ToolSet instances identified by the key Tool2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolSetByTool2Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool2IdxKey argKey );
	/**
	 *	Delete the ToolSet instances identified by the key Tool3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId3	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool3Idx( YCFGenKbAuthorization Authorization,
		Short argToolId3 );

	/**
	 *	Delete the ToolSet instances identified by the key Tool3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolSetByTool3Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool3IdxKey argKey );
	/**
	 *	Delete the ToolSet instances identified by the key Tool4Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId4	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool4Idx( YCFGenKbAuthorization Authorization,
		Short argToolId4 );

	/**
	 *	Delete the ToolSet instances identified by the key Tool4Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolSetByTool4Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool4IdxKey argKey );
	/**
	 *	Delete the ToolSet instances identified by the key Tool5Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId5	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool5Idx( YCFGenKbAuthorization Authorization,
		Short argToolId5 );

	/**
	 *	Delete the ToolSet instances identified by the key Tool5Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolSetByTool5Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool5IdxKey argKey );
	/**
	 *	Delete the ToolSet instances identified by the key Tool6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId6	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool6Idx( YCFGenKbAuthorization Authorization,
		Short argToolId6 );

	/**
	 *	Delete the ToolSet instances identified by the key Tool6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolSetByTool6Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool6IdxKey argKey );
	/**
	 *	Delete the ToolSet instances identified by the key Tool7Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId7	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool7Idx( YCFGenKbAuthorization Authorization,
		Short argToolId7 );

	/**
	 *	Delete the ToolSet instances identified by the key Tool7Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolSetByTool7Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool7IdxKey argKey );


	/**
	 *	Read the derived ToolSet buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ToolSet instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbToolSetBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey PKey );

	/**
	 *	Lock the derived ToolSet buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ToolSet instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbToolSetBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey PKey );

	/**
	 *	Read all ToolSet instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbToolSetBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived ToolSet buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbToolSetBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the derived ToolSet buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbToolSetBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the derived ToolSet buffer instances identified by the duplicate key Tool0Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId0	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbToolSetBuff[] readDerivedByTool0Idx( YCFGenKbAuthorization Authorization,
		short ToolId0 );

	/**
	 *	Read an array of the derived ToolSet buffer instances identified by the duplicate key Tool1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId1	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbToolSetBuff[] readDerivedByTool1Idx( YCFGenKbAuthorization Authorization,
		Short ToolId1 );

	/**
	 *	Read an array of the derived ToolSet buffer instances identified by the duplicate key Tool2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId2	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbToolSetBuff[] readDerivedByTool2Idx( YCFGenKbAuthorization Authorization,
		Short ToolId2 );

	/**
	 *	Read an array of the derived ToolSet buffer instances identified by the duplicate key Tool3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId3	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbToolSetBuff[] readDerivedByTool3Idx( YCFGenKbAuthorization Authorization,
		Short ToolId3 );

	/**
	 *	Read an array of the derived ToolSet buffer instances identified by the duplicate key Tool4Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId4	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbToolSetBuff[] readDerivedByTool4Idx( YCFGenKbAuthorization Authorization,
		Short ToolId4 );

	/**
	 *	Read an array of the derived ToolSet buffer instances identified by the duplicate key Tool5Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId5	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbToolSetBuff[] readDerivedByTool5Idx( YCFGenKbAuthorization Authorization,
		Short ToolId5 );

	/**
	 *	Read an array of the derived ToolSet buffer instances identified by the duplicate key Tool6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId6	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbToolSetBuff[] readDerivedByTool6Idx( YCFGenKbAuthorization Authorization,
		Short ToolId6 );

	/**
	 *	Read an array of the derived ToolSet buffer instances identified by the duplicate key Tool7Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId7	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbToolSetBuff[] readDerivedByTool7Idx( YCFGenKbAuthorization Authorization,
		Short ToolId7 );

	/**
	 *	Read the specific ToolSet buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ToolSet instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey PKey );

	/**
	 *	Lock the specific ToolSet buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ToolSet instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey PKey );

	/**
	 *	Read all the specific ToolSet buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ToolSet instances in the database accessible for the Authorization.
	 */
	YCFGenKbToolSetBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific ToolSet buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the specific ToolSet buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the specific ToolSet buffer instances identified by the duplicate key Tool0Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId0	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff[] readBuffByTool0Idx( YCFGenKbAuthorization Authorization,
		short ToolId0 );

	/**
	 *	Read an array of the specific ToolSet buffer instances identified by the duplicate key Tool1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId1	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff[] readBuffByTool1Idx( YCFGenKbAuthorization Authorization,
		Short ToolId1 );

	/**
	 *	Read an array of the specific ToolSet buffer instances identified by the duplicate key Tool2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId2	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff[] readBuffByTool2Idx( YCFGenKbAuthorization Authorization,
		Short ToolId2 );

	/**
	 *	Read an array of the specific ToolSet buffer instances identified by the duplicate key Tool3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId3	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff[] readBuffByTool3Idx( YCFGenKbAuthorization Authorization,
		Short ToolId3 );

	/**
	 *	Read an array of the specific ToolSet buffer instances identified by the duplicate key Tool4Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId4	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff[] readBuffByTool4Idx( YCFGenKbAuthorization Authorization,
		Short ToolId4 );

	/**
	 *	Read an array of the specific ToolSet buffer instances identified by the duplicate key Tool5Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId5	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff[] readBuffByTool5Idx( YCFGenKbAuthorization Authorization,
		Short ToolId5 );

	/**
	 *	Read an array of the specific ToolSet buffer instances identified by the duplicate key Tool6Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId6	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff[] readBuffByTool6Idx( YCFGenKbAuthorization Authorization,
		Short ToolId6 );

	/**
	 *	Read an array of the specific ToolSet buffer instances identified by the duplicate key Tool7Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolId7	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolSetBuff[] readBuffByTool7Idx( YCFGenKbAuthorization Authorization,
		Short ToolId7 );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
