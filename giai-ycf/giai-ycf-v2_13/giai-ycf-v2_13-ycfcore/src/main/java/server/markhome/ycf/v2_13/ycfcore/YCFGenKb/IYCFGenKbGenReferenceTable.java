
// Description: Java 11 DbIO interface for GenReference.

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
 *	YCFGenKbGenReferenceTable database interface for GenReference
 */
public interface IYCFGenKbGenReferenceTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createGenReference( YCFGenKbAuthorization Authorization,
		YCFGenKbGenReferenceBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateGenReference( YCFGenKbAuthorization Authorization,
		YCFGenKbGenReferenceBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteGenReference( YCFGenKbAuthorization Authorization,
		YCFGenKbGenReferenceBuff Buff );
	/**
	 *	Delete the GenReference instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByItemIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId,
		long argItemId );

	/**
	 *	Delete the GenReference instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteGenReferenceByItemIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey argKey );
	/**
	 *	Delete the GenReference instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the GenReference instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenReferenceByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByTenantIdxKey argKey );
	/**
	 *	Delete the GenReference instances identified by the key CartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByCartIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argCartridgeId );

	/**
	 *	Delete the GenReference instances identified by the key CartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenReferenceByCartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByCartIdxKey argKey );
	/**
	 *	Delete the GenReference instances identified by the key RuleTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRuleTypeId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short argRuleTypeId );

	/**
	 *	Delete the GenReference instances identified by the key RuleTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenReferenceByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByRuleTypeIdxKey argKey );
	/**
	 *	Delete the GenReference instances identified by the key ToolSetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByToolSetIdx( YCFGenKbAuthorization Authorization,
		short argToolSetId );

	/**
	 *	Delete the GenReference instances identified by the key ToolSetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenReferenceByToolSetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByToolSetIdxKey argKey );
	/**
	 *	Delete the GenReference instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByScopeIdx( YCFGenKbAuthorization Authorization,
		Short argScopeDefId );

	/**
	 *	Delete the GenReference instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenReferenceByScopeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByScopeIdxKey argKey );
	/**
	 *	Delete the GenReference instances identified by the key GenDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByGenDefIdx( YCFGenKbAuthorization Authorization,
		short argGenDefId );

	/**
	 *	Delete the GenReference instances identified by the key GenDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenReferenceByGenDefIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGenDefIdxKey argKey );
	/**
	 *	Delete the GenReference instances identified by the key AltIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByAltIdx( YCFGenKbAuthorization Authorization,
		String argName,
		short argToolSetId,
		Short argScopeDefId,
		short argGenDefId );

	/**
	 *	Delete the GenReference instances identified by the key AltIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenReferenceByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByAltIdxKey argKey );
	/**
	 *	Delete the GenReference instances identified by the key GelExecIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGelExecutableTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long argGelExecutableTenantId,
		Long argGelExecutableGelCacheId,
		Long argGelExecutableId );

	/**
	 *	Delete the GenReference instances identified by the key GelExecIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenReferenceByGelExecIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByGelExecIdxKey argKey );
	/**
	 *	Delete the GenReference instances identified by the key ProbeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argProbeTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByProbeIdx( YCFGenKbAuthorization Authorization,
		Long argProbeTenantId,
		Long argProbeCartridgeId,
		Long argProbeGenItemId );

	/**
	 *	Delete the GenReference instances identified by the key ProbeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGenReferenceByProbeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemByProbeIdxKey argKey );


	/**
	 *	Read the derived GenReference buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GenReference instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGenReferenceBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey );

	/**
	 *	Lock the derived GenReference buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GenReference instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGenReferenceBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey );

	/**
	 *	Read all GenReference instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbGenReferenceBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived GenReference buffer instance identified by the unique key ItemIdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGenReferenceBuff readDerivedByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Read an array of the derived GenReference buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenReferenceBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived GenReference buffer instances identified by the duplicate key CartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenReferenceBuff[] readDerivedByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId );

	/**
	 *	Read an array of the derived GenReference buffer instances identified by the duplicate key RuleTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRuleTypeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenReferenceBuff[] readDerivedByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId );

	/**
	 *	Read an array of the derived GenReference buffer instances identified by the duplicate key ToolSetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenReferenceBuff[] readDerivedByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId );

	/**
	 *	Read an array of the derived GenReference buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenReferenceBuff[] readDerivedByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId );

	/**
	 *	Read an array of the derived GenReference buffer instances identified by the duplicate key GenDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenReferenceBuff[] readDerivedByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId );

	/**
	 *	Read the derived GenReference buffer instance identified by the unique key AltIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGenReferenceBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Read an array of the derived GenReference buffer instances identified by the duplicate key GelExecIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGelExecutableTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenReferenceBuff[] readDerivedByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Read an array of the derived GenReference buffer instances identified by the duplicate key ProbeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argProbeTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGenReferenceBuff[] readDerivedByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Read the specific GenReference buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GenReference instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey );

	/**
	 *	Lock the specific GenReference buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GenReference instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGenItemPKey PKey );

	/**
	 *	Read all the specific GenReference buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific GenReference instances in the database accessible for the Authorization.
	 */
	YCFGenKbGenReferenceBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific GenReference buffer instance identified by the unique key ItemIdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff readBuffByItemIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Read an array of the specific GenReference buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific GenReference buffer instances identified by the duplicate key CartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff[] readBuffByCartIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long CartridgeId );

	/**
	 *	Read an array of the specific GenReference buffer instances identified by the duplicate key RuleTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRuleTypeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff[] readBuffByRuleTypeIdx( YCFGenKbAuthorization Authorization,
		short RuleTypeId );

	/**
	 *	Read an array of the specific GenReference buffer instances identified by the duplicate key ToolSetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff[] readBuffByToolSetIdx( YCFGenKbAuthorization Authorization,
		short ToolSetId );

	/**
	 *	Read an array of the specific GenReference buffer instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff[] readBuffByScopeIdx( YCFGenKbAuthorization Authorization,
		Short ScopeDefId );

	/**
	 *	Read an array of the specific GenReference buffer instances identified by the duplicate key GenDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff[] readBuffByGenDefIdx( YCFGenKbAuthorization Authorization,
		short GenDefId );

	/**
	 *	Read the specific GenReference buffer instance identified by the unique key AltIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Read an array of the specific GenReference buffer instances identified by the duplicate key GelExecIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argGelExecutableTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff[] readBuffByGelExecIdx( YCFGenKbAuthorization Authorization,
		Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Read an array of the specific GenReference buffer instances identified by the duplicate key ProbeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argProbeTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGenReferenceBuff[] readBuffByProbeIdx( YCFGenKbAuthorization Authorization,
		Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
