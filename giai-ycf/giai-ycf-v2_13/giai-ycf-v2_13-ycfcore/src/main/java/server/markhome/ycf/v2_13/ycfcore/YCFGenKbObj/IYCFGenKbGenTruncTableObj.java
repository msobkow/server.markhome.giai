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

public interface IYCFGenKbGenTruncTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenTrunc instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGenTruncObj newInstance();

	/**
	 *	Instantiate a new GenTrunc edition of the specified GenTrunc instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGenTruncEditObj newEditInstance( IYCFGenKbGenTruncObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenTruncObj realiseGenTrunc( IYCFGenKbGenTruncObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenTruncObj createGenTrunc( IYCFGenKbGenTruncObj Obj );

	/**
	 *	Read a GenTrunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenTrunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenTruncObj readGenTrunc( YCFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenTrunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenTrunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenTruncObj readGenTrunc( YCFGenKbGenItemPKey pkey,
		boolean forceRead );

	IYCFGenKbGenTruncObj readCachedGenTrunc( YCFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenTrunc( IYCFGenKbGenTruncObj obj );

	void deepDisposeGenTrunc( YCFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenTruncObj lockGenTrunc( YCFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenTrunc-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenTruncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readAllGenTrunc();

	/**
	 *	Return a sorted map of all the GenTrunc-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenTruncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readAllGenTrunc( boolean forceRead );

	List<IYCFGenKbGenTruncObj> readCachedAllGenTrunc();

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenTruncObj readGenTruncByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenTruncObj readGenTruncByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGenTruncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of YCFGenKbGenTruncObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of YCFGenKbGenTruncObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of YCFGenKbGenTruncObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of YCFGenKbGenTruncObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of YCFGenKbGenTruncObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenTruncObj readGenTruncByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenTruncObj readGenTruncByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of YCFGenKbGenTruncObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of YCFGenKbGenTruncObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Get the map of YCFGenKbGenTruncObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenTrunc key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenTruncObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenTruncObj> readGenTruncByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		boolean forceRead );

	IYCFGenKbGenTruncObj readCachedGenTruncByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<IYCFGenKbGenTruncObj> readCachedGenTruncByTenantIdx( long TenantId );

	List<IYCFGenKbGenTruncObj> readCachedGenTruncByCartIdx( long TenantId,
		long CartridgeId );

	List<IYCFGenKbGenTruncObj> readCachedGenTruncByRuleTypeIdx( short RuleTypeId );

	List<IYCFGenKbGenTruncObj> readCachedGenTruncByToolSetIdx( short ToolSetId );

	List<IYCFGenKbGenTruncObj> readCachedGenTruncByScopeIdx( Short ScopeDefId );

	List<IYCFGenKbGenTruncObj> readCachedGenTruncByGenDefIdx( short GenDefId );

	IYCFGenKbGenTruncObj readCachedGenTruncByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<IYCFGenKbGenTruncObj> readCachedGenTruncByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<IYCFGenKbGenTruncObj> readCachedGenTruncByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	List<IYCFGenKbGenTruncObj> readCachedGenTruncByBodyIdx( Long BodyTenantId,
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
	IYCFGenKbGenTruncObj updateGenTrunc( IYCFGenKbGenTruncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenTrunc( IYCFGenKbGenTruncObj Obj );

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
