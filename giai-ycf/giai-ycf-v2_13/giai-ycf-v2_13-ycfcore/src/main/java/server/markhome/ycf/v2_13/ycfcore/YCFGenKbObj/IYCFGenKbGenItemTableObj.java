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

public interface IYCFGenKbGenItemTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenItem instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGenItemObj newInstance();

	/**
	 *	Instantiate a new GenItem edition of the specified GenItem instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGenItemEditObj newEditInstance( IYCFGenKbGenItemObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	argClassCode	The class code used to identify the proposed instance class.
	 *
	 *	@return	IYCFGenKbGenItemObj instance, which may be a subclass of a GenItem instance.
	 */
	IYCFGenKbGenItemObj constructByClassCode( String argClassCode );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenItemObj realiseGenItem( IYCFGenKbGenItemObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenItemObj createGenItem( IYCFGenKbGenItemObj Obj );

	/**
	 *	Read a GenItem-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenItem-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenItemObj readGenItem( YCFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenItem-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenItem-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenItemObj readGenItem( YCFGenKbGenItemPKey pkey,
		boolean forceRead );

	IYCFGenKbGenItemObj readCachedGenItem( YCFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenItem( IYCFGenKbGenItemObj obj );

	void deepDisposeGenItem( YCFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenItemObj lockGenItem( YCFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenItem-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenItemObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenItemObj> readAllGenItem();

	/**
	 *	Return a sorted map of all the GenItem-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenItemObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenItemObj> readAllGenItem( boolean forceRead );

	List<IYCFGenKbGenItemObj> readCachedAllGenItem();

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenItemObj readGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenItemObj readGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenItemObj readGenItemByAltIdx(String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenItemObj readGenItemByAltIdx(String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenItem key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenItemObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenItemObj> readGenItemByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	IYCFGenKbGenItemObj readCachedGenItemByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<IYCFGenKbGenItemObj> readCachedGenItemByTenantIdx( long TenantId );

	List<IYCFGenKbGenItemObj> readCachedGenItemByCartIdx( long TenantId,
		long CartridgeId );

	List<IYCFGenKbGenItemObj> readCachedGenItemByRuleTypeIdx( short RuleTypeId );

	List<IYCFGenKbGenItemObj> readCachedGenItemByToolSetIdx( short ToolSetId );

	List<IYCFGenKbGenItemObj> readCachedGenItemByScopeIdx( Short ScopeDefId );

	List<IYCFGenKbGenItemObj> readCachedGenItemByGenDefIdx( short GenDefId );

	IYCFGenKbGenItemObj readCachedGenItemByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<IYCFGenKbGenItemObj> readCachedGenItemByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<IYCFGenKbGenItemObj> readCachedGenItemByProbeIdx( Long ProbeTenantId,
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
	IYCFGenKbGenItemObj updateGenItem( IYCFGenKbGenItemObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenItem( IYCFGenKbGenItemObj Obj );

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
