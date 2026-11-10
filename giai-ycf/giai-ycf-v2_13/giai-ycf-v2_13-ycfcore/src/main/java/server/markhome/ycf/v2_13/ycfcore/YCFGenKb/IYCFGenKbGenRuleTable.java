
// Description: Java 11 DbIO interface for GenRule.

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
 *	YCFGenKbGenRuleTable database interface for GenRule
 */
public interface IYCFGenKbGenRuleTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createGenRule( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateGenRule( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteGenRule( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleBuff Buff );
	/**
	 *	Delete the GenRule instances identified by the key BodyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByBodyIdx( YCFGenKbAuthorization Authorization,
		Long argBodyTenantId,
		Long argBodyGelCacheId,
		Long argBodyGelId );

	/**
	 *	Delete the GenRule instances identified by the key BodyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByBodyIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenRuleByBodyIdxKey argKey );
	/**
	 *	Delete the GenRule instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByItemIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId,
		long argItemId );

	/**
	 *	Delete the GenRule instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteGenRuleByItemIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey argKey );
	/**
	 *	Delete the GenRule instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the GenRule instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByTenantIdxKey argKey );
	/**
	 *	Delete the GenRule instances identified by the key CartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByCartIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId );

	/**
	 *	Delete the GenRule instances identified by the key CartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByCartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByCartIdxKey argKey );
	/**
	 *	Delete the GenRule instances identified by the key RuleTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRuleTypeId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short argRuleTypeId );

	/**
	 *	Delete the GenRule instances identified by the key RuleTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByRuleTypeIdxKey argKey );
	/**
	 *	Delete the GenRule instances identified by the key ToolSetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByToolSetIdx( YCFGenKbAuthorization Authorization,
		short argToolSetId );

	/**
	 *	Delete the GenRule instances identified by the key ToolSetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByToolSetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByToolSetIdxKey argKey );
	/**
	 *	Delete the GenRule instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByScopeIdx( YCFGenKbAuthorization Authorization,
		Short argScopeDefId );

	/**
	 *	Delete the GenRule instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByScopeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByScopeIdxKey argKey );
	/**
	 *	Delete the GenRule instances identified by the key GenDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByGenDefIdx( YCFGenKbAuthorization Authorization,
		short argGenDefId );

	/**
	 *	Delete the GenRule instances identified by the key GenDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByGenDefIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGenDefIdxKey argKey );
	/**
	 *	Delete the GenRule instances identified by the key AltIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByAltIdx( YCFGenKbAuthorization Authorization,
		String argName,
		short argToolSetId,
		Short argScopeDefId,
		short argGenDefId );

	/**
	 *	Delete the GenRule instances identified by the key AltIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByAltIdxKey argKey );
	/**
	 *	Delete the GenRule instances identified by the key GelExecIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGelExecutableTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long argGelExecutableTenantId,
		Long argGelExecutableGelCacheId,
		Long argGelExecutableId );

	/**
	 *	Delete the GenRule instances identified by the key GelExecIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByGelExecIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGelExecIdxKey argKey );
	/**
	 *	Delete the GenRule instances identified by the key ProbeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argProbeTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByProbeIdx( YCFGenKbAuthorization Authorization,
		Long argProbeTenantId,
		Long argProbeCartridgeId,
		Long argProbeGenItemId );

	/**
	 *	Delete the GenRule instances identified by the key ProbeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenRuleByProbeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByProbeIdxKey argKey );


	/**
	 *	Read the derived GenRule buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GenRule instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGenRuleBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey );

	/**
	 *	Lock the derived GenRule buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GenRule instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGenRuleBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey );

	/**
	 *	Read all GenRule instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived GenRule buffer instance identified by the unique key ItemIdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGenRuleBuff readDerivedByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Read an array of the derived GenRule buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived GenRule buffer instances identified by the duplicate key CartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readDerivedByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId );

	/**
	 *	Read an array of the derived GenRule buffer instances identified by the duplicate key RuleTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRuleTypeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readDerivedByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId );

	/**
	 *	Read an array of the derived GenRule buffer instances identified by the duplicate key ToolSetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readDerivedByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId );

	/**
	 *	Read an array of the derived GenRule buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readDerivedByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId );

	/**
	 *	Read an array of the derived GenRule buffer instances identified by the duplicate key GenDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readDerivedByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId );

	/**
	 *	Read the derived GenRule buffer instance identified by the unique key AltIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGenRuleBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Read an array of the derived GenRule buffer instances identified by the duplicate key GelExecIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGelExecutableTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readDerivedByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Read an array of the derived GenRule buffer instances identified by the duplicate key ProbeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argProbeTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readDerivedByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Read an array of the derived GenRule buffer instances identified by the duplicate key BodyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenRuleBuff[] readDerivedByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Read the specific GenRule buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GenRule instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey );

	/**
	 *	Lock the specific GenRule buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GenRule instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey );

	/**
	 *	Read all the specific GenRule buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific GenRule instances in the database accessible for the Authorization.
	 */
	YCFGenKbGenRuleBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific GenRule buffer instance identified by the unique key ItemIdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff readBuffByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Read an array of the specific GenRule buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific GenRule buffer instances identified by the duplicate key CartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff[] readBuffByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId );

	/**
	 *	Read an array of the specific GenRule buffer instances identified by the duplicate key RuleTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRuleTypeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff[] readBuffByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId );

	/**
	 *	Read an array of the specific GenRule buffer instances identified by the duplicate key ToolSetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff[] readBuffByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId );

	/**
	 *	Read an array of the specific GenRule buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff[] readBuffByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId );

	/**
	 *	Read an array of the specific GenRule buffer instances identified by the duplicate key GenDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff[] readBuffByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId );

	/**
	 *	Read the specific GenRule buffer instance identified by the unique key AltIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Read an array of the specific GenRule buffer instances identified by the duplicate key GelExecIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGelExecutableTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff[] readBuffByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Read an array of the specific GenRule buffer instances identified by the duplicate key ProbeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argProbeTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff[] readBuffByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Read an array of the specific GenRule buffer instances identified by the duplicate key BodyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenRuleBuff[] readBuffByBodyIdx( YCFGenKbAuthorization Authorization,
		Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
