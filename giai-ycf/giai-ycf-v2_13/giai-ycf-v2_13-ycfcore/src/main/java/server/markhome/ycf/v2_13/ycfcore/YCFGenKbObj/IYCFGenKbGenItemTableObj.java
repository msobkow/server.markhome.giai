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

public interface ICFGenKbGenItemTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenItem instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGenItemObj newInstance();

	/**
	 *	Instantiate a new GenItem edition of the specified GenItem instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGenItemEditObj newEditInstance( ICFGenKbGenItemObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	argClassCode	The class code used to identify the proposed instance class.
	 *
	 *	@return	ICFGenKbGenItemObj instance, which may be a subclass of a GenItem instance.
	 */
	ICFGenKbGenItemObj constructByClassCode( String argClassCode );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenItemObj realiseGenItem( ICFGenKbGenItemObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenItemObj createGenItem( ICFGenKbGenItemObj Obj );

	/**
	 *	Read a GenItem-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenItem-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGenItemObj readGenItem( CFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenItem-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenItem-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGenItemObj readGenItem( CFGenKbGenItemPKey pkey,
		boolean forceRead );

	ICFGenKbGenItemObj readCachedGenItem( CFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenItem( ICFGenKbGenItemObj obj );

	void deepDisposeGenItem( CFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenItemObj lockGenItem( CFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenItem-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGenItemObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGenItemObj> readAllGenItem();

	/**
	 *	Return a sorted map of all the GenItem-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGenItemObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGenItemObj> readAllGenItem( boolean forceRead );

	List<ICFGenKbGenItemObj> readCachedAllGenItem();

	/**
	 *	Get the CFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenItemObj readGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the CFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenItemObj readGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenItemObj readGenItemByAltIdx(String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the CFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenItemObj readGenItemByAltIdx(String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenItemObj> readGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	ICFGenKbGenItemObj readCachedGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<ICFGenKbGenItemObj> readCachedGenItemByTenantIdx( long TenantId );

	List<ICFGenKbGenItemObj> readCachedGenItemByCartIdx( long TenantId,
		long CartridgeId );

	List<ICFGenKbGenItemObj> readCachedGenItemByRuleTypeIdx( short RuleTypeId );

	List<ICFGenKbGenItemObj> readCachedGenItemByToolSetIdx( short ToolSetId );

	List<ICFGenKbGenItemObj> readCachedGenItemByScopeIdx( Short ScopeDefId );

	List<ICFGenKbGenItemObj> readCachedGenItemByGenDefIdx( short GenDefId );

	ICFGenKbGenItemObj readCachedGenItemByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<ICFGenKbGenItemObj> readCachedGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<ICFGenKbGenItemObj> readCachedGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	void deepDisposeGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	void deepDisposeGenItemByTenantIdx( long TenantId );

	void deepDisposeGenItemByCartIdx( long TenantId,
		long CartridgeId );

	void deepDisposeGenItemByRuleTypeIdx( short RuleTypeId );

	void deepDisposeGenItemByToolSetIdx( short ToolSetId );

	void deepDisposeGenItemByScopeIdx( Short ScopeDefId );

	void deepDisposeGenItemByGenDefIdx( short GenDefId );

	void deepDisposeGenItemByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	void deepDisposeGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	void deepDisposeGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenItemObj updateGenItem( ICFGenKbGenItemObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenItem( ICFGenKbGenItemObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRuleTypeId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByToolSetIdx( short ToolSetId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByScopeIdx( Short ScopeDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByGenDefIdx( short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByAltIdx(String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGelExecutableTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argProbeTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenItem key attribute of the instance generating the id.
	 */
	void deleteGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );
}
