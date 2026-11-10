// Description: Java 11 Table Object interface for YCFGenKb.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public interface IYCFGenKbGenRuleTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenRule instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGenRuleObj newInstance();

	/**
	 *	Instantiate a new GenRule edition of the specified GenRule instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGenRuleEditObj newEditInstance( IYCFGenKbGenRuleObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenRuleObj realiseGenRule( IYCFGenKbGenRuleObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenRuleObj createGenRule( IYCFGenKbGenRuleObj Obj );

	/**
	 *	Read a GenRule-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenRule-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenRuleObj readGenRule( YCFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenRule-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenRule-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenRuleObj readGenRule( YCFGenKbGenItemPKey pkey,
		boolean forceRead );

	IYCFGenKbGenRuleObj readCachedGenRule( YCFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenRule( IYCFGenKbGenRuleObj obj );

	void deepDisposeGenRule( YCFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenRuleObj lockGenRule( YCFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenRule-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenRuleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readAllGenRule();

	/**
	 *	Return a sorted map of all the GenRule-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenRuleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readAllGenRule( boolean forceRead );

	List<IYCFGenKbGenRuleObj> readCachedAllGenRule();

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenRuleObj readGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenRuleObj readGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenRuleObj readGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenRuleObj readGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenRuleObj> readGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		boolean forceRead );

	IYCFGenKbGenRuleObj readCachedGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<IYCFGenKbGenRuleObj> readCachedGenRuleByTenantIdx( long TenantId );

	List<IYCFGenKbGenRuleObj> readCachedGenRuleByCartIdx( long TenantId,
		long CartridgeId );

	List<IYCFGenKbGenRuleObj> readCachedGenRuleByRuleTypeIdx( short RuleTypeId );

	List<IYCFGenKbGenRuleObj> readCachedGenRuleByToolSetIdx( short ToolSetId );

	List<IYCFGenKbGenRuleObj> readCachedGenRuleByScopeIdx( Short ScopeDefId );

	List<IYCFGenKbGenRuleObj> readCachedGenRuleByGenDefIdx( short GenDefId );

	IYCFGenKbGenRuleObj readCachedGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<IYCFGenKbGenRuleObj> readCachedGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<IYCFGenKbGenRuleObj> readCachedGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	List<IYCFGenKbGenRuleObj> readCachedGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	void deepDisposeGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	void deepDisposeGenRuleByTenantIdx( long TenantId );

	void deepDisposeGenRuleByCartIdx( long TenantId,
		long CartridgeId );

	void deepDisposeGenRuleByRuleTypeIdx( short RuleTypeId );

	void deepDisposeGenRuleByToolSetIdx( short ToolSetId );

	void deepDisposeGenRuleByScopeIdx( Short ScopeDefId );

	void deepDisposeGenRuleByGenDefIdx( short GenDefId );

	void deepDisposeGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	void deepDisposeGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	void deepDisposeGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	void deepDisposeGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenRuleObj updateGenRule( IYCFGenKbGenRuleObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenRule( IYCFGenKbGenRuleObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRuleTypeId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByToolSetIdx( short ToolSetId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByScopeIdx( Short ScopeDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByGenDefIdx( short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGelExecutableTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argProbeTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );
}
