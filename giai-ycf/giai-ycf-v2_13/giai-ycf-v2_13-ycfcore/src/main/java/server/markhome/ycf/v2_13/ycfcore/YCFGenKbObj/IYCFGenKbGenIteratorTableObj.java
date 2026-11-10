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

public interface IYCFGenKbGenIteratorTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenIterator instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGenIteratorObj newInstance();

	/**
	 *	Instantiate a new GenIterator edition of the specified GenIterator instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGenIteratorEditObj newEditInstance( IYCFGenKbGenIteratorObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenIteratorObj realiseGenIterator( IYCFGenKbGenIteratorObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenIteratorObj createGenIterator( IYCFGenKbGenIteratorObj Obj );

	/**
	 *	Read a GenIterator-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenIterator-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenIteratorObj readGenIterator( YCFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenIterator-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenIterator-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenIteratorObj readGenIterator( YCFGenKbGenItemPKey pkey,
		boolean forceRead );

	IYCFGenKbGenIteratorObj readCachedGenIterator( YCFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenIterator( IYCFGenKbGenIteratorObj obj );

	void deepDisposeGenIterator( YCFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenIteratorObj lockGenIterator( YCFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenIterator-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenIteratorObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readAllGenIterator();

	/**
	 *	Return a sorted map of all the GenIterator-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenIteratorObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readAllGenIterator( boolean forceRead );

	List<IYCFGenKbGenIteratorObj> readCachedAllGenIterator();

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenIteratorObj readGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenIteratorObj readGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGenIteratorObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of YCFGenKbGenIteratorObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of YCFGenKbGenIteratorObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of YCFGenKbGenIteratorObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of YCFGenKbGenIteratorObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of YCFGenKbGenIteratorObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenIteratorObj readGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenIteratorObj readGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of YCFGenKbGenIteratorObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of YCFGenKbGenIteratorObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenIteratorObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenIteratorObj> readGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	IYCFGenKbGenIteratorObj readCachedGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByTenantIdx( long TenantId );

	List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByCartIdx( long TenantId,
		long CartridgeId );

	List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByRuleTypeIdx( short RuleTypeId );

	List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByToolSetIdx( short ToolSetId );

	List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByScopeIdx( Short ScopeDefId );

	List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByGenDefIdx( short GenDefId );

	IYCFGenKbGenIteratorObj readCachedGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<IYCFGenKbGenIteratorObj> readCachedGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	void deepDisposeGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	void deepDisposeGenIteratorByTenantIdx( long TenantId );

	void deepDisposeGenIteratorByCartIdx( long TenantId,
		long CartridgeId );

	void deepDisposeGenIteratorByRuleTypeIdx( short RuleTypeId );

	void deepDisposeGenIteratorByToolSetIdx( short ToolSetId );

	void deepDisposeGenIteratorByScopeIdx( Short ScopeDefId );

	void deepDisposeGenIteratorByGenDefIdx( short GenDefId );

	void deepDisposeGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	void deepDisposeGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	void deepDisposeGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenIteratorObj updateGenIterator( IYCFGenKbGenIteratorObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenIterator( IYCFGenKbGenIteratorObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRuleTypeId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolSetId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByToolSetIdx( short ToolSetId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argScopeDefId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByScopeIdx( Short ScopeDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGenDefId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByGenDefIdx( short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGelExecutableTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argProbeTenantId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenIterator key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenIterator key attribute of the instance generating the id.
	 */
	void deleteGenIteratorByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );
}
