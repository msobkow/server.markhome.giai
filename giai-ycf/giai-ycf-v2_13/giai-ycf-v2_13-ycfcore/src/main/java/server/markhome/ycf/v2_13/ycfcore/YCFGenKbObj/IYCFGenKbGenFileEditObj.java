// Description: Java 11 Instance Edit Object interface for YCFGenKb GenFile.

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

public interface IYCFGenKbGenFileEditObj
	extends IYCFGenKbGenFileObj,
		IYCFGenKbGenRuleEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFGenKbGenFileObj.
	 */
	IYCFGenKbGenFileObj getOrigAsGenFile();

	/**
	 *	Get the optional String attribute GenerateOnce.
	 *
	 *	@return	The String value of the attribute GenerateOnce.
	 */
	String getOptionalGenerateOnce();

	/**
	 *	Set the optional String attribute GenerateOnce.
	 *
	 *	@param	value	the String value of the attribute GenerateOnce.
	 */
	void setOptionalGenerateOnce( String value );

	/**
	 *	Get the optional String attribute SourceBundle.
	 *
	 *	@return	The String value of the attribute SourceBundle.
	 */
	String getOptionalSourceBundle();

	/**
	 *	Set the optional String attribute SourceBundle.
	 *
	 *	@param	value	the String value of the attribute SourceBundle.
	 */
	void setOptionalSourceBundle( String value );

	/**
	 *	Get the optional String attribute ModuleName.
	 *
	 *	@return	The String value of the attribute ModuleName.
	 */
	String getOptionalModuleName();

	/**
	 *	Set the optional String attribute ModuleName.
	 *
	 *	@param	value	the String value of the attribute ModuleName.
	 */
	void setOptionalModuleName( String value );

	/**
	 *	Get the optional String attribute BasePackageName.
	 *
	 *	@return	The String value of the attribute BasePackageName.
	 */
	String getOptionalBasePackageName();

	/**
	 *	Set the optional String attribute BasePackageName.
	 *
	 *	@param	value	the String value of the attribute BasePackageName.
	 */
	void setOptionalBasePackageName( String value );

	/**
	 *	Get the optional String attribute SubPackageName.
	 *
	 *	@return	The String value of the attribute SubPackageName.
	 */
	String getOptionalSubPackageName();

	/**
	 *	Set the optional String attribute SubPackageName.
	 *
	 *	@param	value	the String value of the attribute SubPackageName.
	 */
	void setOptionalSubPackageName( String value );

	/**
	 *	Get the optional String attribute ExpansionClassName.
	 *
	 *	@return	The String value of the attribute ExpansionClassName.
	 */
	String getOptionalExpansionClassName();

	/**
	 *	Set the optional String attribute ExpansionClassName.
	 *
	 *	@param	value	the String value of the attribute ExpansionClassName.
	 */
	void setOptionalExpansionClassName( String value );

	/**
	 *	Get the optional String attribute ExpansionKeyName.
	 *
	 *	@return	The String value of the attribute ExpansionKeyName.
	 */
	String getOptionalExpansionKeyName();

	/**
	 *	Set the optional String attribute ExpansionKeyName.
	 *
	 *	@param	value	the String value of the attribute ExpansionKeyName.
	 */
	void setOptionalExpansionKeyName( String value );

	/**
	 *	Get the optional String attribute ExpansionFileName.
	 *
	 *	@return	The String value of the attribute ExpansionFileName.
	 */
	String getOptionalExpansionFileName();

	/**
	 *	Set the optional String attribute ExpansionFileName.
	 *
	 *	@param	value	the String value of the attribute ExpansionFileName.
	 */
	void setOptionalExpansionFileName( String value );

	/**
	 *	Get the IYCFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 *
	 *	@return	The IYCFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsSrcBundleGel();

	/**
	 *	Set the IYCFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 *
	 *	@param	value	the IYCFGenKbGelExecutableObj instance to be referenced by the SrcBundleGel key.
	 */
	void setOptionalComponentsSrcBundleGel( IYCFGenKbGelExecutableObj value );

	/**
	 *	Get the IYCFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 *
	 *	@return	The IYCFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsBasePackageGel();

	/**
	 *	Set the IYCFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 *
	 *	@param	value	the IYCFGenKbGelExecutableObj instance to be referenced by the BasePackageGel key.
	 */
	void setOptionalComponentsBasePackageGel( IYCFGenKbGelExecutableObj value );

	/**
	 *	Get the IYCFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 *
	 *	@return	The IYCFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsModuleNameGel();

	/**
	 *	Set the IYCFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 *
	 *	@param	value	the IYCFGenKbGelExecutableObj instance to be referenced by the ModuleNameGel key.
	 */
	void setOptionalComponentsModuleNameGel( IYCFGenKbGelExecutableObj value );

	/**
	 *	Get the IYCFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 *
	 *	@return	The IYCFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsSubPackageGel();

	/**
	 *	Set the IYCFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 *
	 *	@param	value	the IYCFGenKbGelExecutableObj instance to be referenced by the SubPackageGel key.
	 */
	void setOptionalComponentsSubPackageGel( IYCFGenKbGelExecutableObj value );

	/**
	 *	Get the IYCFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 *
	 *	@return	The IYCFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsExpClassGel();

	/**
	 *	Set the IYCFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 *
	 *	@param	value	the IYCFGenKbGelExecutableObj instance to be referenced by the ExpClassGel key.
	 */
	void setOptionalComponentsExpClassGel( IYCFGenKbGelExecutableObj value );

	/**
	 *	Get the IYCFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 *
	 *	@return	The IYCFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsExpKeyNameGel();

	/**
	 *	Set the IYCFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 *
	 *	@param	value	the IYCFGenKbGelExecutableObj instance to be referenced by the ExpKeyNameGel key.
	 */
	void setOptionalComponentsExpKeyNameGel( IYCFGenKbGelExecutableObj value );

	/**
	 *	Get the IYCFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 *
	 *	@return	The IYCFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsExpFileNameGel();

	/**
	 *	Set the IYCFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 *
	 *	@param	value	the IYCFGenKbGelExecutableObj instance to be referenced by the ExpFileNameGel key.
	 */
	void setOptionalComponentsExpFileNameGel( IYCFGenKbGelExecutableObj value );
}
