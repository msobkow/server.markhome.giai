// Description: Java 11 Table Object interface for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbGenTruncTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenTrunc instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGenTruncObj newInstance();

	/**
	 *	Instantiate a new GenTrunc edition of the specified GenTrunc instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGenTruncEditObj newEditInstance( ICFGenKbGenTruncObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenTruncObj realiseGenTrunc( ICFGenKbGenTruncObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenTruncObj createGenTrunc( ICFGenKbGenTruncObj Obj );

	/**
	 *	Read a GenTrunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenTrunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGenTruncObj readGenTrunc( CFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenTrunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenTrunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGenTruncObj readGenTrunc( CFGenKbGenItemPKey pkey,
		boolean forceRead );

	ICFGenKbGenTruncObj readCachedGenTrunc( CFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenTrunc( ICFGenKbGenTruncObj obj );

	void deepDisposeGenTrunc( CFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenTruncObj lockGenTrunc( CFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenTrunc-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGenTruncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGenTruncObj> readAllGenTrunc();

	/**
	 *	Return a sorted map of all the GenTrunc-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGenTruncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGenTruncObj> readAllGenTrunc( boolean forceRead );

	List<ICFGenKbGenTruncObj> readCachedAllGenTrunc();

	/**
	 *	Get the CFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenTruncObj readGenTruncByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the CFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenTruncObj readGenTruncByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGenTruncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of CFGenKbGenTruncObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of CFGenKbGenTruncObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of CFGenKbGenTruncObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of CFGenKbGenTruncObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of CFGenKbGenTruncObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenTruncObj readGenTruncByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the CFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenTruncObj readGenTruncByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of CFGenKbGenTruncObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of CFGenKbGenTruncObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Get the map of CFGenKbGenTruncObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenTruncObj> readGenTruncByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		boolean forceRead );

	ICFGenKbGenTruncObj readCachedGenTruncByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<ICFGenKbGenTruncObj> readCachedGenTruncByTenantIdx( long TenantId );

	List<ICFGenKbGenTruncObj> readCachedGenTruncByCartIdx( long TenantId,
		long CartridgeId );

	List<ICFGenKbGenTruncObj> readCachedGenTruncByRuleTypeIdx( short RuleTypeId );

	List<ICFGenKbGenTruncObj> readCachedGenTruncByToolSetIdx( short ToolSetId );

	List<ICFGenKbGenTruncObj> readCachedGenTruncByScopeIdx( Short ScopeDefId );

	List<ICFGenKbGenTruncObj> readCachedGenTruncByGenDefIdx( short GenDefId );

	ICFGenKbGenTruncObj readCachedGenTruncByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<ICFGenKbGenTruncObj> readCachedGenTruncByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<ICFGenKbGenTruncObj> readCachedGenTruncByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	List<ICFGenKbGenTruncObj> readCachedGenTruncByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	void deepDisposeGenTruncByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	void deepDisposeGenTruncByTenantIdx( long TenantId );

	void deepDisposeGenTruncByCartIdx( long TenantId,
		long CartridgeId );

	void deepDisposeGenTruncByRuleTypeIdx( short RuleTypeId );

	void deepDisposeGenTruncByToolSetIdx( short ToolSetId );

	void deepDisposeGenTruncByScopeIdx( Short ScopeDefId );

	void deepDisposeGenTruncByGenDefIdx( short GenDefId );

	void deepDisposeGenTruncByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	void deepDisposeGenTruncByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	void deepDisposeGenTruncByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	void deepDisposeGenTruncByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenTruncObj updateGenTrunc( ICFGenKbGenTruncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenTrunc( ICFGenKbGenTruncObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRuleTypeId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByToolSetIdx( short ToolSetId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByScopeIdx( Short ScopeDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByGenDefIdx( short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGelExecutableTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argProbeTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argBodyTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenTrunc key attribute of the instance generating the id.
	 */
	void deleteGenTruncByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );
}
