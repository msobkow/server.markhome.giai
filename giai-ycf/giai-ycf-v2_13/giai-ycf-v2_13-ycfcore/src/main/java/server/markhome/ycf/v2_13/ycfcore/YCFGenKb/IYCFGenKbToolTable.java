
// Description: Java 11 DbIO interface for Tool.

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
 *	YCFGenKbToolTable database interface for Tool
 */
public interface IYCFGenKbToolTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createTool( YCFGenKbAuthorization Authorization,
		YCFGenKbToolBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateTool( YCFGenKbAuthorization Authorization,
		YCFGenKbToolBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteTool( YCFGenKbAuthorization Authorization,
		YCFGenKbToolBuff Buff );
	/**
	 *	Delete the Tool instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The Tool key attribute of the instance generating the id.
	 */
	void deleteToolByIdIdx( YCFGenKbAuthorization Authorization,
		short argId );

	/**
	 *	Delete the Tool instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteToolByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey argKey );
	/**
	 *	Delete the Tool instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The Tool key attribute of the instance generating the id.
	 */
	void deleteToolByNameIdx( YCFGenKbAuthorization Authorization,
		String argName );

	/**
	 *	Delete the Tool instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolByNameIdxKey argKey );
	/**
	 *	Delete the Tool instances identified by the key ReplacesIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argReplacesId	The Tool key attribute of the instance generating the id.
	 */
	void deleteToolByReplacesIdx( YCFGenKbAuthorization Authorization,
		Short argReplacesId );

	/**
	 *	Delete the Tool instances identified by the key ReplacesIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteToolByReplacesIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolByReplacesIdxKey argKey );


	/**
	 *	Read the derived Tool buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Tool instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbToolBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey PKey );

	/**
	 *	Lock the derived Tool buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Tool instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbToolBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey PKey );

	/**
	 *	Read all Tool instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbToolBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived Tool buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbToolBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the derived Tool buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The Tool key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbToolBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the derived Tool buffer instances identified by the duplicate key ReplacesIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argReplacesId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbToolBuff[] readDerivedByReplacesIdx( YCFGenKbAuthorization Authorization,
		Short ReplacesId );

	/**
	 *	Read the specific Tool buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Tool instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey PKey );

	/**
	 *	Lock the specific Tool buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Tool instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey PKey );

	/**
	 *	Read all the specific Tool buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Tool instances in the database accessible for the Authorization.
	 */
	YCFGenKbToolBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific Tool buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the specific Tool buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The Tool key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the specific Tool buffer instances identified by the duplicate key ReplacesIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argReplacesId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbToolBuff[] readBuffByReplacesIdx( YCFGenKbAuthorization Authorization,
		Short ReplacesId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
