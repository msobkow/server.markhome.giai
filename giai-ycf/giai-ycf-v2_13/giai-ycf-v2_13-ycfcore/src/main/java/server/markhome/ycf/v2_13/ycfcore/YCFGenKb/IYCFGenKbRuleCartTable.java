
// Description: Java 11 DbIO interface for RuleCart.

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
 *	YCFGenKbRuleCartTable database interface for RuleCart
 */
public interface IYCFGenKbRuleCartTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createRuleCart( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateRuleCart( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteRuleCart( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartBuff Buff );
	/**
	 *	Delete the RuleCart instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the RuleCart instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteRuleCartByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey argKey );
	/**
	 *	Delete the RuleCart instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the RuleCart instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRuleCartByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartByTenantIdxKey argKey );
	/**
	 *	Delete the RuleCart instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByNameIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		String argName );

	/**
	 *	Delete the RuleCart instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRuleCartByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartByNameIdxKey argKey );


	/**
	 *	Read the derived RuleCart buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleCart instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbRuleCartBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey PKey );

	/**
	 *	Lock the derived RuleCart buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleCart instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbRuleCartBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey PKey );

	/**
	 *	Read all RuleCart instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbRuleCartBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived RuleCart buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbRuleCartBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived RuleCart buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbRuleCartBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read the derived RuleCart buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbRuleCartBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		String Name );

	/**
	 *	Read the specific RuleCart buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleCart instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbRuleCartBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey PKey );

	/**
	 *	Lock the specific RuleCart buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleCart instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbRuleCartBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey PKey );

	/**
	 *	Read all the specific RuleCart buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific RuleCart instances in the database accessible for the Authorization.
	 */
	YCFGenKbRuleCartBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific RuleCart buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbRuleCartBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific RuleCart buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbRuleCartBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read the specific RuleCart buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbRuleCartBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
