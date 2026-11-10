// Description: Java 11 Instance Edit Object interface for YCFGenKb GenItem.

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

public interface IYCFGenKbGenItemEditObj
	extends IYCFGenKbGenItemObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFGenKbGenItemObj.
	 */
	IYCFGenKbGenItemObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFGenKbGenItemObj.
	 */
	IYCFGenKbGenItemObj getOrigAsGenItem();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFGenKbGenItemObj create();

	/*
	 *	Update the instance.
	 */
	YCFGenKbGenItemEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFGenKbGenItemEditObj deleteInstance();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The String value of the attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param	value	the String value of the attribute Name.
	 */
	void setRequiredName( String value );

	/**
	 *	Get the IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the IYCFGenKbTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( IYCFGenKbTenantObj value );

	/**
	 *	Get the IYCFGenKbRuleCartObj instance referenced by the Cartridge key.
	 *
	 *	@return	The IYCFGenKbRuleCartObj instance referenced by the Cartridge key.
	 */
	IYCFGenKbRuleCartObj getRequiredContainerCartridge();

	/**
	 *	Set the IYCFGenKbRuleCartObj instance referenced by the Cartridge key.
	 *
	 *	@param	value	the IYCFGenKbRuleCartObj instance to be referenced by the Cartridge key.
	 */
	void setRequiredContainerCartridge( IYCFGenKbRuleCartObj value );

	/**
	 *	Get the IYCFGenKbRuleTypeObj instance referenced by the RuleType key.
	 *
	 *	@return	The IYCFGenKbRuleTypeObj instance referenced by the RuleType key.
	 */
	IYCFGenKbRuleTypeObj getRequiredLookupRuleType();

	/**
	 *	Set the IYCFGenKbRuleTypeObj instance referenced by the RuleType key.
	 *
	 *	@param	value	the IYCFGenKbRuleTypeObj instance to be referenced by the RuleType key.
	 */
	void setRequiredLookupRuleType( IYCFGenKbRuleTypeObj value );

	/**
	 *	Get the IYCFGenKbToolSetObj instance referenced by the ToolSet key.
	 *
	 *	@return	The IYCFGenKbToolSetObj instance referenced by the ToolSet key.
	 */
	IYCFGenKbToolSetObj getRequiredLookupToolSet();

	/**
	 *	Set the IYCFGenKbToolSetObj instance referenced by the ToolSet key.
	 *
	 *	@param	value	the IYCFGenKbToolSetObj instance to be referenced by the ToolSet key.
	 */
	void setRequiredLookupToolSet( IYCFGenKbToolSetObj value );

	/**
	 *	Get the IYCFGenKbDefClassObj instance referenced by the ScopeDef key.
	 *
	 *	@return	The IYCFGenKbDefClassObj instance referenced by the ScopeDef key.
	 */
	IYCFGenKbDefClassObj getOptionalLookupScopeDef();

	/**
	 *	Set the IYCFGenKbDefClassObj instance referenced by the ScopeDef key.
	 *
	 *	@param	value	the IYCFGenKbDefClassObj instance to be referenced by the ScopeDef key.
	 */
	void setOptionalLookupScopeDef( IYCFGenKbDefClassObj value );

	/**
	 *	Get the IYCFGenKbDefClassObj instance referenced by the GenDef key.
	 *
	 *	@return	The IYCFGenKbDefClassObj instance referenced by the GenDef key.
	 */
	IYCFGenKbDefClassObj getRequiredLookupGenDef();

	/**
	 *	Set the IYCFGenKbDefClassObj instance referenced by the GenDef key.
	 *
	 *	@param	value	the IYCFGenKbDefClassObj instance to be referenced by the GenDef key.
	 */
	void setRequiredLookupGenDef( IYCFGenKbDefClassObj value );

	/**
	 *	Get the IYCFGenKbGelExecutableObj instance referenced by the GelExec key.
	 *
	 *	@return	The IYCFGenKbGelExecutableObj instance referenced by the GelExec key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsGelExec();

	/**
	 *	Set the IYCFGenKbGelExecutableObj instance referenced by the GelExec key.
	 *
	 *	@param	value	the IYCFGenKbGelExecutableObj instance to be referenced by the GelExec key.
	 */
	void setOptionalComponentsGelExec( IYCFGenKbGelExecutableObj value );

	/**
	 *	Get the IYCFGenKbGenItemObj instance referenced by the Probe key.
	 *
	 *	@return	The IYCFGenKbGenItemObj instance referenced by the Probe key.
	 */
	IYCFGenKbGenItemObj getOptionalLookupProbe();

	/**
	 *	Set the IYCFGenKbGenItemObj instance referenced by the Probe key.
	 *
	 *	@param	value	the IYCFGenKbGenItemObj instance to be referenced by the Probe key.
	 */
	void setOptionalLookupProbe( IYCFGenKbGenItemObj value );
}
