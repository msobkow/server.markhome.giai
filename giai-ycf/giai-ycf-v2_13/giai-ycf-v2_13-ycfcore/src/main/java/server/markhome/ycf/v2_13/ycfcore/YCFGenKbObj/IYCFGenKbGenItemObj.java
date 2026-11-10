// Description: Java 11 Object interface for YCFGenKb GenItem.

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

public interface IYCFGenKbGenItemObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a GenItem.
	 *
	 *	@return	YCFGenKbGenItemObj instance which should be subsequently referenced.
	 */
	IYCFGenKbGenItemObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbGenItemObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbGenItemObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbGenItemObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbGenItemObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this GenItem instance.
	 *
	 *	@return	The newly locked IYCFGenKbGenItemEditObj edition of this instance.
	 */
	IYCFGenKbGenItemEditObj beginEdit();

	/**
	 *	End this edition of this GenItem instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this GenItem instance.
	 *
	 *	@return	The IYCFGenKbGenItemEditObj edition of this instance.
	 */
	IYCFGenKbGenItemEditObj getEdit();

	/**
	 *	Get the current edition of this GenItem instance as a IYCFGenKbGenItemEditObj.
	 *
	 *	@return	The IYCFGenKbGenItemEditObj edition of this instance.
	 */
	IYCFGenKbGenItemEditObj getEditAsGenItem();

	/**
	 *	Get the IYCFGenKbGenItemTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGenItemTableObj table cache which manages this instance.
	 */
	IYCFGenKbGenItemTableObj getGenItemTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbGenItemBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGenItemBuff instance which currently backs this object.
	 */
	YCFGenKbGenItemBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbGenItemBuff value );

	/**
	 *	Get the YCFGenKbGenItemBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGenItemBuff instance which currently backs this object.
	 */
	YCFGenKbGenItemBuff getGenItemBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbGenItemPKey primary key for this instance.
	 */
	YCFGenKbGenItemPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbGenItemPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbGenItemPKey value );

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required long attribute TenantId.
	 *
	 *	@return	The required long attribute TenantId.
	 */
	long getRequiredTenantId();

	/**
	 *	Get the required long attribute CartridgeId.
	 *
	 *	@return	The required long attribute CartridgeId.
	 */
	long getRequiredCartridgeId();

	/**
	 *	Get the required long attribute ItemId.
	 *
	 *	@return	The required long attribute ItemId.
	 */
	long getRequiredItemId();

	/**
	 *	Get the required short attribute RuleTypeId.
	 *
	 *	@return	The required short attribute RuleTypeId.
	 */
	short getRequiredRuleTypeId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required short attribute ToolSetId.
	 *
	 *	@return	The required short attribute ToolSetId.
	 */
	short getRequiredToolSetId();

	/**
	 *	Get the optional Short attribute ScopeDefId.
	 *
	 *	@return	The optional Short attribute ScopeDefId.
	 */
	Short getOptionalScopeDefId();

	/**
	 *	Get the required short attribute GenDefId.
	 *
	 *	@return	The required short attribute GenDefId.
	 */
	short getRequiredGenDefId();

	/**
	 *	Get the optional Long attribute GelExecutableTenantId.
	 *
	 *	@return	The optional Long attribute GelExecutableTenantId.
	 */
	Long getOptionalGelExecutableTenantId();

	/**
	 *	Get the optional Long attribute GelExecutableGelCacheId.
	 *
	 *	@return	The optional Long attribute GelExecutableGelCacheId.
	 */
	Long getOptionalGelExecutableGelCacheId();

	/**
	 *	Get the optional Long attribute GelExecutableId.
	 *
	 *	@return	The optional Long attribute GelExecutableId.
	 */
	Long getOptionalGelExecutableId();

	/**
	 *	Get the optional Long attribute ProbeTenantId.
	 *
	 *	@return	The optional Long attribute ProbeTenantId.
	 */
	Long getOptionalProbeTenantId();

	/**
	 *	Get the optional Long attribute ProbeCartridgeId.
	 *
	 *	@return	The optional Long attribute ProbeCartridgeId.
	 */
	Long getOptionalProbeCartridgeId();

	/**
	 *	Get the optional Long attribute ProbeGenItemId.
	 *
	 *	@return	The optional Long attribute ProbeGenItemId.
	 */
	Long getOptionalProbeGenItemId();

	/**
	 *	Get the required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbRuleCartObj instance referenced by the Cartridge key.
	 *
	 *	@return	The required IYCFGenKbRuleCartObj instance referenced by the Cartridge key.
	 */
	IYCFGenKbRuleCartObj getRequiredContainerCartridge();

	/**
	 *	Get the required IYCFGenKbRuleCartObj instance referenced by the Cartridge key.
	 *
	 *	@return	The required IYCFGenKbRuleCartObj instance referenced by the Cartridge key.
	 */
	IYCFGenKbRuleCartObj getRequiredContainerCartridge( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbRuleTypeObj instance referenced by the RuleType key.
	 *
	 *	@return	The required IYCFGenKbRuleTypeObj instance referenced by the RuleType key.
	 */
	IYCFGenKbRuleTypeObj getRequiredLookupRuleType();

	/**
	 *	Get the required IYCFGenKbRuleTypeObj instance referenced by the RuleType key.
	 *
	 *	@return	The required IYCFGenKbRuleTypeObj instance referenced by the RuleType key.
	 */
	IYCFGenKbRuleTypeObj getRequiredLookupRuleType( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbToolSetObj instance referenced by the ToolSet key.
	 *
	 *	@return	The required IYCFGenKbToolSetObj instance referenced by the ToolSet key.
	 */
	IYCFGenKbToolSetObj getRequiredLookupToolSet();

	/**
	 *	Get the required IYCFGenKbToolSetObj instance referenced by the ToolSet key.
	 *
	 *	@return	The required IYCFGenKbToolSetObj instance referenced by the ToolSet key.
	 */
	IYCFGenKbToolSetObj getRequiredLookupToolSet( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbDefClassObj instance referenced by the ScopeDef key.
	 *
	 *	@return	The optional IYCFGenKbDefClassObj instance referenced by the ScopeDef key.
	 */
	IYCFGenKbDefClassObj getOptionalLookupScopeDef();

	/**
	 *	Get the optional IYCFGenKbDefClassObj instance referenced by the ScopeDef key.
	 *
	 *	@return	The optional IYCFGenKbDefClassObj instance referenced by the ScopeDef key.
	 */
	IYCFGenKbDefClassObj getOptionalLookupScopeDef( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbDefClassObj instance referenced by the GenDef key.
	 *
	 *	@return	The required IYCFGenKbDefClassObj instance referenced by the GenDef key.
	 */
	IYCFGenKbDefClassObj getRequiredLookupGenDef();

	/**
	 *	Get the required IYCFGenKbDefClassObj instance referenced by the GenDef key.
	 *
	 *	@return	The required IYCFGenKbDefClassObj instance referenced by the GenDef key.
	 */
	IYCFGenKbDefClassObj getRequiredLookupGenDef( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the GelExec key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the GelExec key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsGelExec();

	/**
	 *	Get the optional IYCFGenKbGelExecutableObj instance referenced by the GelExec key.
	 *
	 *	@return	The optional IYCFGenKbGelExecutableObj instance referenced by the GelExec key.
	 */
	IYCFGenKbGelExecutableObj getOptionalComponentsGelExec( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGenItemObj instance referenced by the Probe key.
	 *
	 *	@return	The optional IYCFGenKbGenItemObj instance referenced by the Probe key.
	 */
	IYCFGenKbGenItemObj getOptionalLookupProbe();

	/**
	 *	Get the optional IYCFGenKbGenItemObj instance referenced by the Probe key.
	 *
	 *	@return	The optional IYCFGenKbGenItemObj instance referenced by the Probe key.
	 */
	IYCFGenKbGenItemObj getOptionalLookupProbe( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
