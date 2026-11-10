// Description: Java 11 Object interface for YCFGenKb GenFile.

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
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFEngine;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGelCompiler;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGenContext;

public interface IYCFGenKbGenFileObj
	extends IYCFGenKbGenRuleObj
{
	/**
	 *	Get the current edition of this GenFile instance as a IYCFGenKbGenFileEditObj.
	 *
	 *	@return	The IYCFGenKbGenFileEditObj edition of this instance.
	 */
	IYCFGenKbGenFileEditObj getEditAsGenFile();

	/**
	 *	Get the IYCFGenKbGenFileTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGenFileTableObj table cache which manages this instance.
	 */
	IYCFGenKbGenFileTableObj getGenFileTable();

	/**
	 *	Get the YCFGenKbGenFileBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGenFileBuff instance which currently backs this object.
	 */
	YCFGenKbGenFileBuff getGenFileBuff();

	/**
	 *	Get the optional String attribute GenerateOnce.
	 *
	 *	@return	The optional String attribute GenerateOnce.
	 */
	String getOptionalGenerateOnce();

	/**
	 *	Get the optional String attribute SourceBundle.
	 *
	 *	@return	The optional String attribute SourceBundle.
	 */
	String getOptionalSourceBundle();

	/**
	 *	Get the optional Long attribute SourceBundleTenantId.
	 *
	 *	@return	The optional Long attribute SourceBundleTenantId.
	 */
	Long getOptionalSourceBundleTenantId();

	/**
	 *	Get the optional Long attribute SourceBundleGelCacheId.
	 *
	 *	@return	The optional Long attribute SourceBundleGelCacheId.
	 */
	Long getOptionalSourceBundleGelCacheId();

	/**
	 *	Get the optional Long attribute SourceBundleGelId.
	 *
	 *	@return	The optional Long attribute SourceBundleGelId.
	 */
	Long getOptionalSourceBundleGelId();

	/**
	 *	Get the optional String attribute ModuleName.
	 *
	 *	@return	The optional String attribute ModuleName.
	 */
	String getOptionalModuleName();

	/**
	 *	Get the optional Long attribute ModuleNameTenantId.
	 *
	 *	@return	The optional Long attribute ModuleNameTenantId.
	 */
	Long getOptionalModuleNameTenantId();

	/**
	 *	Get the optional Long attribute ModuleNameGelCacheId.
	 *
	 *	@return	The optional Long attribute ModuleNameGelCacheId.
	 */
	Long getOptionalModuleNameGelCacheId();

	/**
	 *	Get the optional Long attribute ModuleNameGelId.
	 *
	 *	@return	The optional Long attribute ModuleNameGelId.
	 */
	Long getOptionalModuleNameGelId();

	/**
	 *	Get the optional String attribute BasePackageName.
	 *
	 *	@return	The optional String attribute BasePackageName.
	 */
	String getOptionalBasePackageName();

	/**
	 *	Get the optional Long attribute BasePackageTenantId.
	 *
	 *	@return	The optional Long attribute BasePackageTenantId.
	 */
	Long getOptionalBasePackageTenantId();

	/**
	 *	Get the optional Long attribute BasePackageGelCacheId.
	 *
	 *	@return	The optional Long attribute BasePackageGelCacheId.
	 */
	Long getOptionalBasePackageGelCacheId();

	/**
	 *	Get the optional Long attribute BasePackageGelId.
	 *
	 *	@return	The optional Long attribute BasePackageGelId.
	 */
	Long getOptionalBasePackageGelId();

	/**
	 *	Get the optional String attribute SubPackageName.
	 *
	 *	@return	The optional String attribute SubPackageName.
	 */
	String getOptionalSubPackageName();

	/**
	 *	Get the optional Long attribute SubPackageTenantId.
	 *
	 *	@return	The optional Long attribute SubPackageTenantId.
	 */
	Long getOptionalSubPackageTenantId();

	/**
	 *	Get the optional Long attribute SubPackageGelCacheId.
	 *
	 *	@return	The optional Long attribute SubPackageGelCacheId.
	 */
	Long getOptionalSubPackageGelCacheId();

	/**
	 *	Get the optional Long attribute SubPackageGelId.
	 *
	 *	@return	The optional Long attribute SubPackageGelId.
	 */
	Long getOptionalSubPackageGelId();

	/**
	 *	Get the optional String attribute ExpansionClassName.
	 *
	 *	@return	The optional String attribute ExpansionClassName.
	 */
	String getOptionalExpansionClassName();

	/**
	 *	Get the optional Long attribute ExpansionClassNameTenantId.
	 *
	 *	@return	The optional Long attribute ExpansionClassNameTenantId.
	 */
	Long getOptionalExpansionClassNameTenantId();

	/**
	 *	Get the optional Long attribute ExpansionClassNameGelCacheId.
	 *
	 *	@return	The optional Long attribute ExpansionClassNameGelCacheId.
	 */
	Long getOptionalExpansionClassNameGelCacheId();

	/**
	 *	Get the optional Long attribute ExpansionClassNameGelId.
	 *
	 *	@return	The optional Long attribute ExpansionClassNameGelId.
	 */
	Long getOptionalExpansionClassNameGelId();

	/**
	 *	Get the optional String attribute ExpansionKeyName.
	 *
	 *	@return	The optional String attribute ExpansionKeyName.
	 */
	String getOptionalExpansionKeyName();

	/**
	 *	Get the optional Long attribute ExpansionKeyNameTenantId.
	 *
	 *	@return	The optional Long attribute ExpansionKeyNameTenantId.
	 */
	Long getOptionalExpansionKeyNameTenantId();

	/**
	 *	Get the optional Long attribute ExpansionKeyNameGelCacheId.
	 *
	 *	@return	The optional Long attribute ExpansionKeyNameGelCacheId.
	 */
	Long getOptionalExpansionKeyNameGelCacheId();

	/**
	 *	Get the optional Long attribute ExpansionKeyNameGelId.
	 *
	 *	@return	The optional Long attribute ExpansionKeyNameGelId.
	 */
	Long getOptionalExpansionKeyNameGelId();

	/**
	 *	Get the optional String attribute ExpansionFileName.
	 *
	 *	@return	The optional String attribute ExpansionFileName.
	 */
	String getOptionalExpansionFileName();

	/**
	 *	Get the optional Long attribute ExpansionFileNameTenantId.
	 *
	 *	@return	The optional Long attribute ExpansionFileNameTenantId.
	 */
	Long getOptionalExpansionFileNameTenantId();

	/**
	 *	Get the optional Long attribute ExpansionFileNameGelCacheId.
	 *
	 *	@return	The optional Long attribute ExpansionFileNameGelCacheId.
	 */
	Long getOptionalExpansionFileNameGelCacheId();

	/**
	 *	Get the optional Long attribute ExpansionFileNameGelId.
	 *
	 *	@return	The optional Long attribute ExpansionFileNameGelId.
	 */
	Long getOptionalExpansionFileNameGelId();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsSrcBundleGel();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsSrcBundleGel( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsBasePackageGel();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsBasePackageGel( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsModuleNameGel();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsModuleNameGel( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsSubPackageGel();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsSubPackageGel( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsExpClassGel();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsExpClassGel( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsExpKeyNameGel();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsExpKeyNameGel( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsExpFileNameGel();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsExpFileNameGel( boolean forceRead );

}
