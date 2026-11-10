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

public interface IYCFGenKbGenBindTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenBind instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGenBindObj newInstance();

	/**
	 *	Instantiate a new GenBind edition of the specified GenBind instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGenBindEditObj newEditInstance( IYCFGenKbGenBindObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenBindObj realiseGenBind( IYCFGenKbGenBindObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenBindObj createGenBind( IYCFGenKbGenBindObj Obj );

	/**
	 *	Read a GenBind-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenBind-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenBindObj readGenBind( YCFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenBind-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenBind-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenBindObj readGenBind( YCFGenKbGenItemPKey pkey,
		boolean forceRead );

	IYCFGenKbGenBindObj readCachedGenBind( YCFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenBind( IYCFGenKbGenBindObj obj );

	void deepDisposeGenBind( YCFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenBindObj lockGenBind( YCFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenBind-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenBindObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenBindObj> readAllGenBind();

	/**
	 *	Return a sorted map of all the GenBind-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenBindObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenBindObj> readAllGenBind( boolean forceRead );

	List<IYCFGenKbGenBindObj> readCachedAllGenBind();

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenBindObj readGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenBindObj readGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGenBindObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of YCFGenKbGenBindObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of YCFGenKbGenBindObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of YCFGenKbGenBindObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of YCFGenKbGenBindObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of YCFGenKbGenBindObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenBindObj readGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenBindObj readGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of YCFGenKbGenBindObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of YCFGenKbGenBindObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenBindObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenBindObj> readGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	IYCFGenKbGenBindObj readCachedGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<IYCFGenKbGenBindObj> readCachedGenBindByTenantIdx( long TenantId );

	List<IYCFGenKbGenBindObj> readCachedGenBindByCartIdx( long TenantId,
		long CartridgeId );

	List<IYCFGenKbGenBindObj> readCachedGenBindByRuleTypeIdx( short RuleTypeId );

	List<IYCFGenKbGenBindObj> readCachedGenBindByToolSetIdx( short ToolSetId );

	List<IYCFGenKbGenBindObj> readCachedGenBindByScopeIdx( Short ScopeDefId );

	List<IYCFGenKbGenBindObj> readCachedGenBindByGenDefIdx( short GenDefId );

	IYCFGenKbGenBindObj readCachedGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<IYCFGenKbGenBindObj> readCachedGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<IYCFGenKbGenBindObj> readCachedGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	void deepDisposeGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	void deepDisposeGenBindByTenantIdx( long TenantId );

	void deepDisposeGenBindByCartIdx( long TenantId,
		long CartridgeId );

	void deepDisposeGenBindByRuleTypeIdx( short RuleTypeId );

	void deepDisposeGenBindByToolSetIdx( short ToolSetId );

	void deepDisposeGenBindByScopeIdx( Short ScopeDefId );

	void deepDisposeGenBindByGenDefIdx( short GenDefId );

	void deepDisposeGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	void deepDisposeGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	void deepDisposeGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenBindObj updateGenBind( IYCFGenKbGenBindObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenBind( IYCFGenKbGenBindObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRuleTypeId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolSetId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByToolSetIdx( short ToolSetId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argScopeDefId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByScopeIdx( Short ScopeDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGenDefId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByGenDefIdx( short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGelExecutableTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argProbeTenantId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenBind key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenBind key attribute of the instance generating the id.
	 */
	void deleteGenBindByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );
}
