
// Description: Java 11 DbIO interface for RuleType.

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
 *	YCFGenKbRuleTypeTable database interface for RuleType
 */
public interface IYCFGenKbRuleTypeTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createRuleType( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypeBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateRuleType( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypeBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteRuleType( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypeBuff Buff );
	/**
	 *	Delete the RuleType instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The RuleType key attribute of the instance generating the id.
	 */
	void deleteRuleTypeByIdIdx( YCFGenKbAuthorization Authorization,
		short argId );

	/**
	 *	Delete the RuleType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteRuleTypeByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey argKey );
	/**
	 *	Delete the RuleType instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The RuleType key attribute of the instance generating the id.
	 */
	void deleteRuleTypeByNameIdx( YCFGenKbAuthorization Authorization,
		String argName );

	/**
	 *	Delete the RuleType instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRuleTypeByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypeByNameIdxKey argKey );


	/**
	 *	Read the derived RuleType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleType instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbRuleTypeBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey PKey );

	/**
	 *	Lock the derived RuleType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbRuleTypeBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey PKey );

	/**
	 *	Read all RuleType instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbRuleTypeBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived RuleType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbRuleTypeBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the derived RuleType buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbRuleTypeBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Read the specific RuleType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbRuleTypeBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey PKey );

	/**
	 *	Lock the specific RuleType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbRuleTypeBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey PKey );

	/**
	 *	Read all the specific RuleType buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific RuleType instances in the database accessible for the Authorization.
	 */
	YCFGenKbRuleTypeBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific RuleType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbRuleTypeBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the specific RuleType buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbRuleTypeBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
