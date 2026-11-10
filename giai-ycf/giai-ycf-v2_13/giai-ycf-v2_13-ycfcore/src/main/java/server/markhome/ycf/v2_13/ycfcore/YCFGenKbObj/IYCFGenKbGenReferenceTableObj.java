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

public interface IYCFGenKbGenReferenceTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenReference instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGenReferenceObj newInstance();

	/**
	 *	Instantiate a new GenReference edition of the specified GenReference instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGenReferenceEditObj newEditInstance( IYCFGenKbGenReferenceObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenReferenceObj realiseGenReference( IYCFGenKbGenReferenceObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenReferenceObj createGenReference( IYCFGenKbGenReferenceObj Obj );

	/**
	 *	Read a GenReference-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenReference-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenReferenceObj readGenReference( YCFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenReference-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenReference-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenReferenceObj readGenReference( YCFGenKbGenItemPKey pkey,
		boolean forceRead );

	IYCFGenKbGenReferenceObj readCachedGenReference( YCFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenReference( IYCFGenKbGenReferenceObj obj );

	void deepDisposeGenReference( YCFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenReferenceObj lockGenReference( YCFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenReference-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenReferenceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readAllGenReference();

	/**
	 *	Return a sorted map of all the GenReference-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenReferenceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readAllGenReference( boolean forceRead );

	List<IYCFGenKbGenReferenceObj> readCachedAllGenReference();

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenReferenceObj readGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenReferenceObj readGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of YCFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of YCFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of YCFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of YCFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of YCFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenReferenceObj readGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenReferenceObj readGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of YCFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of YCFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenReferenceObj> readGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	IYCFGenKbGenReferenceObj readCachedGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<IYCFGenKbGenReferenceObj> readCachedGenReferenceByTenantIdx( long TenantId );

	List<IYCFGenKbGenReferenceObj> readCachedGenReferenceByCartIdx( long TenantId,
		long CartridgeId );

	List<IYCFGenKbGenReferenceObj> readCachedGenReferenceByRuleTypeIdx( short RuleTypeId );

	List<IYCFGenKbGenReferenceObj> readCachedGenReferenceByToolSetIdx( short ToolSetId );

	List<IYCFGenKbGenReferenceObj> readCachedGenReferenceByScopeIdx( Short ScopeDefId );

	List<IYCFGenKbGenReferenceObj> readCachedGenReferenceByGenDefIdx( short GenDefId );

	IYCFGenKbGenReferenceObj readCachedGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<IYCFGenKbGenReferenceObj> readCachedGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<IYCFGenKbGenReferenceObj> readCachedGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	void deepDisposeGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	void deepDisposeGenReferenceByTenantIdx( long TenantId );

	void deepDisposeGenReferenceByCartIdx( long TenantId,
		long CartridgeId );

	void deepDisposeGenReferenceByRuleTypeIdx( short RuleTypeId );

	void deepDisposeGenReferenceByToolSetIdx( short ToolSetId );

	void deepDisposeGenReferenceByScopeIdx( Short ScopeDefId );

	void deepDisposeGenReferenceByGenDefIdx( short GenDefId );

	void deepDisposeGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	void deepDisposeGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	void deepDisposeGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenReferenceObj updateGenReference( IYCFGenKbGenReferenceObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenReference( IYCFGenKbGenReferenceObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRuleTypeId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByToolSetIdx( short ToolSetId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByScopeIdx( Short ScopeDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByGenDefIdx( short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGelExecutableTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argProbeTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );
}
