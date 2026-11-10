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

public interface IYCFGenKbGenFileTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenFile instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGenFileObj newInstance();

	/**
	 *	Instantiate a new GenFile edition of the specified GenFile instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGenFileEditObj newEditInstance( IYCFGenKbGenFileObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenFileObj realiseGenFile( IYCFGenKbGenFileObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenFileObj createGenFile( IYCFGenKbGenFileObj Obj );

	/**
	 *	Read a GenFile-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenFile-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenFileObj readGenFile( YCFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenFile-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenFile-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGenFileObj readGenFile( YCFGenKbGenItemPKey pkey,
		boolean forceRead );

	IYCFGenKbGenFileObj readCachedGenFile( YCFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenFile( IYCFGenKbGenFileObj obj );

	void deepDisposeGenFile( YCFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenFileObj lockGenFile( YCFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenFile-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenFileObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenFileObj> readAllGenFile();

	/**
	 *	Return a sorted map of all the GenFile-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGenFileObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGenFileObj> readAllGenFile( boolean forceRead );

	List<IYCFGenKbGenFileObj> readCachedAllGenFile();

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenFileObj readGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenFileObj readGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenFileObj readGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the YCFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGenFileObj readGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenRuleObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XSrcBundle key.
	 *
	 *	@param	argSourceBundleTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSourceBundleGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSourceBundleGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XSrcBundle key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XSrcBundle key.
	 *
	 *	@param	argSourceBundleTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSourceBundleGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSourceBundleGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XSrcBundle key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XModName key.
	 *
	 *	@param	argModuleNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argModuleNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argModuleNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XModName key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XModName key.
	 *
	 *	@param	argModuleNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argModuleNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argModuleNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XModName key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XBasePkg key.
	 *
	 *	@param	argBasePackageTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBasePackageGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBasePackageGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XBasePkg key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XBasePkg key.
	 *
	 *	@param	argBasePackageTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBasePackageGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBasePackageGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XBasePkg key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XSubPkg key.
	 *
	 *	@param	argSubPackageTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSubPackageGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSubPackageGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XSubPkg key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XSubPkg key.
	 *
	 *	@param	argSubPackageTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSubPackageGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSubPackageGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XSubPkg key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XExpClsName key.
	 *
	 *	@param	argExpansionClassNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionClassNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionClassNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XExpClsName key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XExpClsName key.
	 *
	 *	@param	argExpansionClassNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionClassNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionClassNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XExpClsName key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XExpKeyName key.
	 *
	 *	@param	argExpansionKeyNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionKeyNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionKeyNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XExpKeyName key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XExpKeyName key.
	 *
	 *	@param	argExpansionKeyNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionKeyNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionKeyNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XExpKeyName key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XExpFileName key.
	 *
	 *	@param	argExpansionFileNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionFileNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionFileNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XExpFileName key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId );

	/**
	 *	Get the map of YCFGenKbGenFileObj instances sorted by their primary keys for the duplicate XExpFileName key.
	 *
	 *	@param	argExpansionFileNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionFileNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionFileNameGelId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGenFileObj cached instances sorted by their primary keys for the duplicate XExpFileName key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGenFileObj> readGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId,
		boolean forceRead );

	IYCFGenKbGenFileObj readCachedGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByTenantIdx( long TenantId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByCartIdx( long TenantId,
		long CartridgeId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByRuleTypeIdx( short RuleTypeId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByToolSetIdx( short ToolSetId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByScopeIdx( Short ScopeDefId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByGenDefIdx( short GenDefId );

	IYCFGenKbGenFileObj readCachedGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId );

	List<IYCFGenKbGenFileObj> readCachedGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId );

	void deepDisposeGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	void deepDisposeGenFileByTenantIdx( long TenantId );

	void deepDisposeGenFileByCartIdx( long TenantId,
		long CartridgeId );

	void deepDisposeGenFileByRuleTypeIdx( short RuleTypeId );

	void deepDisposeGenFileByToolSetIdx( short ToolSetId );

	void deepDisposeGenFileByScopeIdx( Short ScopeDefId );

	void deepDisposeGenFileByGenDefIdx( short GenDefId );

	void deepDisposeGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	void deepDisposeGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	void deepDisposeGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	void deepDisposeGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	void deepDisposeGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId );

	void deepDisposeGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId );

	void deepDisposeGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId );

	void deepDisposeGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId );

	void deepDisposeGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId );

	void deepDisposeGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId );

	void deepDisposeGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGenFileObj updateGenFile( IYCFGenKbGenFileObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenFile( IYCFGenKbGenFileObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRuleTypeId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolSetId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByToolSetIdx( short ToolSetId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argScopeDefId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByScopeIdx( Short ScopeDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGenDefId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByGenDefIdx( short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGelExecutableTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argProbeTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argBodyTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSourceBundleTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSourceBundleGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSourceBundleGelId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByXSrcBundle( Long SourceBundleTenantId,
		Long SourceBundleGelCacheId,
		Long SourceBundleGelId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argModuleNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argModuleNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argModuleNameGelId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByXModName( Long ModuleNameTenantId,
		Long ModuleNameGelCacheId,
		Long ModuleNameGelId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argBasePackageTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBasePackageGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argBasePackageGelId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByXBasePkg( Long BasePackageTenantId,
		Long BasePackageGelCacheId,
		Long BasePackageGelId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argSubPackageTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSubPackageGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argSubPackageGelId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByXSubPkg( Long SubPackageTenantId,
		Long SubPackageGelCacheId,
		Long SubPackageGelId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpansionClassNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionClassNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionClassNameGelId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByXExpClsName( Long ExpansionClassNameTenantId,
		Long ExpansionClassNameGelCacheId,
		Long ExpansionClassNameGelId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpansionKeyNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionKeyNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionKeyNameGelId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByXExpKeyName( Long ExpansionKeyNameTenantId,
		Long ExpansionKeyNameGelCacheId,
		Long ExpansionKeyNameGelId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpansionFileNameTenantId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionFileNameGelCacheId	The GenFile key attribute of the instance generating the id.
	 *
	 *	@param	argExpansionFileNameGelId	The GenFile key attribute of the instance generating the id.
	 */
	void deleteGenFileByXExpFileName( Long ExpansionFileNameTenantId,
		Long ExpansionFileNameGelCacheId,
		Long ExpansionFileNameGelId );
}
