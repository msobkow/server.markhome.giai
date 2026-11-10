// Description: Java 11 Object interface for YCFGenKb TSecGroup.

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

public interface IYCFGenKbTSecGroupObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The IYCFGenKbSecUserObj instance who created this instance.
	 */
	IYCFGenKbSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The IYCFGenKbSecUserObj instance who updated this instance.
	 */
	IYCFGenKbSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a TSecGroup.
	 *
	 *	@return	YCFGenKbTSecGroupObj instance which should be subsequently referenced.
	 */
	IYCFGenKbTSecGroupObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbTSecGroupObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbTSecGroupObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbTSecGroupObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbTSecGroupObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TSecGroup instance.
	 *
	 *	@return	The newly locked IYCFGenKbTSecGroupEditObj edition of this instance.
	 */
	IYCFGenKbTSecGroupEditObj beginEdit();

	/**
	 *	End this edition of this TSecGroup instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TSecGroup instance.
	 *
	 *	@return	The IYCFGenKbTSecGroupEditObj edition of this instance.
	 */
	IYCFGenKbTSecGroupEditObj getEdit();

	/**
	 *	Get the current edition of this TSecGroup instance as a IYCFGenKbTSecGroupEditObj.
	 *
	 *	@return	The IYCFGenKbTSecGroupEditObj edition of this instance.
	 */
	IYCFGenKbTSecGroupEditObj getEditAsTSecGroup();

	/**
	 *	Get the IYCFGenKbTSecGroupTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbTSecGroupTableObj table cache which manages this instance.
	 */
	IYCFGenKbTSecGroupTableObj getTSecGroupTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbTSecGroupBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbTSecGroupBuff instance which currently backs this object.
	 */
	YCFGenKbTSecGroupBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbTSecGroupBuff value );

	/**
	 *	Get the YCFGenKbTSecGroupBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbTSecGroupBuff instance which currently backs this object.
	 */
	YCFGenKbTSecGroupBuff getTSecGroupBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbTSecGroupPKey primary key for this instance.
	 */
	YCFGenKbTSecGroupPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbTSecGroupPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbTSecGroupPKey value );

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
	 *	Get the required int attribute TSecGroupId.
	 *
	 *	@return	The required int attribute TSecGroupId.
	 */
	int getRequiredTSecGroupId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required boolean attribute IsVisible.
	 *
	 *	@return	The required boolean attribute IsVisible.
	 */
	boolean getRequiredIsVisible();

	/**
	 *	Get the required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredContainerTenant();

	/**
	 *	Get the required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredContainerTenant( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbTSecGrpIncObj array of instances referenced by the Include key.
	 *
	 *	@return	The optional IYCFGenKbTSecGrpIncObj[] array of instances referenced by the Include key.
	 */
	List<IYCFGenKbTSecGrpIncObj> getOptionalComponentsInclude();

	/**
	 *	Get the array of optional IYCFGenKbTSecGrpIncObj array of instances referenced by the Include key.
	 *
	 *	@return	The optional IYCFGenKbTSecGrpIncObj[] array of instances referenced by the Include key.
	 */
	List<IYCFGenKbTSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbTSecGrpMembObj array of instances referenced by the Member key.
	 *
	 *	@return	The optional IYCFGenKbTSecGrpMembObj[] array of instances referenced by the Member key.
	 */
	List<IYCFGenKbTSecGrpMembObj> getOptionalComponentsMember();

	/**
	 *	Get the array of optional IYCFGenKbTSecGrpMembObj array of instances referenced by the Member key.
	 *
	 *	@return	The optional IYCFGenKbTSecGrpMembObj[] array of instances referenced by the Member key.
	 */
	List<IYCFGenKbTSecGrpMembObj> getOptionalComponentsMember( boolean forceRead );

	/**
	 *	Get the array of required IYCFGenKbTSecGrpIncObj array of instances referenced by the IncByGroup key.
	 *
	 *	@return	The required IYCFGenKbTSecGrpIncObj[] array of instances referenced by the IncByGroup key.
	 */
	List<IYCFGenKbTSecGrpIncObj> getRequiredChildrenIncByGroup();

	/**
	 *	Get the array of required IYCFGenKbTSecGrpIncObj array of instances referenced by the IncByGroup key.
	 *
	 *	@return	The required IYCFGenKbTSecGrpIncObj[] array of instances referenced by the IncByGroup key.
	 */
	List<IYCFGenKbTSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
