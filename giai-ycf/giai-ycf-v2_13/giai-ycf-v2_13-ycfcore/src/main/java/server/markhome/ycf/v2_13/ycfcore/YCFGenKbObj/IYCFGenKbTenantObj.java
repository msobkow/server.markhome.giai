// Description: Java 11 Object interface for YCFGenKb Tenant.

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

public interface IYCFGenKbTenantObj
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
	 *	Realise this instance of a Tenant.
	 *
	 *	@return	YCFGenKbTenantObj instance which should be subsequently referenced.
	 */
	IYCFGenKbTenantObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbTenantObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbTenantObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbTenantObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbTenantObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Tenant instance.
	 *
	 *	@return	The newly locked IYCFGenKbTenantEditObj edition of this instance.
	 */
	IYCFGenKbTenantEditObj beginEdit();

	/**
	 *	End this edition of this Tenant instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Tenant instance.
	 *
	 *	@return	The IYCFGenKbTenantEditObj edition of this instance.
	 */
	IYCFGenKbTenantEditObj getEdit();

	/**
	 *	Get the current edition of this Tenant instance as a IYCFGenKbTenantEditObj.
	 *
	 *	@return	The IYCFGenKbTenantEditObj edition of this instance.
	 */
	IYCFGenKbTenantEditObj getEditAsTenant();

	/**
	 *	Get the IYCFGenKbTenantTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbTenantTableObj table cache which manages this instance.
	 */
	IYCFGenKbTenantTableObj getTenantTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbTenantBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbTenantBuff instance which currently backs this object.
	 */
	YCFGenKbTenantBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbTenantBuff value );

	/**
	 *	Get the YCFGenKbTenantBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbTenantBuff instance which currently backs this object.
	 */
	YCFGenKbTenantBuff getTenantBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbTenantPKey primary key for this instance.
	 */
	YCFGenKbTenantPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbTenantPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbTenantPKey value );

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
	 *	Get the required long attribute ClusterId.
	 *
	 *	@return	The required long attribute ClusterId.
	 */
	long getRequiredClusterId();

	/**
	 *	Get the required long attribute Id.
	 *
	 *	@return	The required long attribute Id.
	 */
	long getRequiredId();

	/**
	 *	Get the required String attribute TenantName.
	 *
	 *	@return	The required String attribute TenantName.
	 */
	String getRequiredTenantName();

	/**
	 *	Get the required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 */
	IYCFGenKbClusterObj getRequiredContainerCluster();

	/**
	 *	Get the required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 */
	IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbTSecGroupObj array of instances referenced by the TSecGroup key.
	 *
	 *	@return	The optional IYCFGenKbTSecGroupObj[] array of instances referenced by the TSecGroup key.
	 */
	List<IYCFGenKbTSecGroupObj> getOptionalComponentsTSecGroup();

	/**
	 *	Get the array of optional IYCFGenKbTSecGroupObj array of instances referenced by the TSecGroup key.
	 *
	 *	@return	The optional IYCFGenKbTSecGroupObj[] array of instances referenced by the TSecGroup key.
	 */
	List<IYCFGenKbTSecGroupObj> getOptionalComponentsTSecGroup( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbRuleCartObj array of instances referenced by the RuleCart key.
	 *
	 *	@return	The optional IYCFGenKbRuleCartObj[] array of instances referenced by the RuleCart key.
	 */
	List<IYCFGenKbRuleCartObj> getOptionalComponentsRuleCart();

	/**
	 *	Get the array of optional IYCFGenKbRuleCartObj array of instances referenced by the RuleCart key.
	 *
	 *	@return	The optional IYCFGenKbRuleCartObj[] array of instances referenced by the RuleCart key.
	 */
	List<IYCFGenKbRuleCartObj> getOptionalComponentsRuleCart( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
