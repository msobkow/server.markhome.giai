
// Description: Java 11 DbIO interface for DefClass.

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
 *	YCFGenKbDefClassTable database interface for DefClass
 */
public interface IYCFGenKbDefClassTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createDefClass( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateDefClass( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteDefClass( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassBuff Buff );
	/**
	 *	Delete the DefClass instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The DefClass key attribute of the instance generating the id.
	 */
	void deleteDefClassByIdIdx( YCFGenKbAuthorization Authorization,
		short argId );

	/**
	 *	Delete the DefClass instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteDefClassByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey argKey );
	/**
	 *	Delete the DefClass instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The DefClass key attribute of the instance generating the id.
	 */
	void deleteDefClassByNameIdx( YCFGenKbAuthorization Authorization,
		String argName );

	/**
	 *	Delete the DefClass instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDefClassByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassByNameIdxKey argKey );
	/**
	 *	Delete the DefClass instances identified by the key BaseIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBaseId	The DefClass key attribute of the instance generating the id.
	 */
	void deleteDefClassByBaseIdx( YCFGenKbAuthorization Authorization,
		Short argBaseId );

	/**
	 *	Delete the DefClass instances identified by the key BaseIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDefClassByBaseIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassByBaseIdxKey argKey );


	/**
	 *	Read the derived DefClass buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DefClass instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbDefClassBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey PKey );

	/**
	 *	Lock the derived DefClass buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DefClass instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbDefClassBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey PKey );

	/**
	 *	Read all DefClass instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbDefClassBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived DefClass buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbDefClassBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the derived DefClass buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbDefClassBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the derived DefClass buffer instances identified by the duplicate key BaseIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBaseId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbDefClassBuff[] readDerivedByBaseIdx( YCFGenKbAuthorization Authorization,
		Short BaseId );

	/**
	 *	Read the specific DefClass buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DefClass instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbDefClassBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey PKey );

	/**
	 *	Lock the specific DefClass buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DefClass instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbDefClassBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey PKey );

	/**
	 *	Read all the specific DefClass buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific DefClass instances in the database accessible for the Authorization.
	 */
	YCFGenKbDefClassBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific DefClass buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbDefClassBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the specific DefClass buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbDefClassBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the specific DefClass buffer instances identified by the duplicate key BaseIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBaseId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbDefClassBuff[] readBuffByBaseIdx( YCFGenKbAuthorization Authorization,
		Short BaseId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
