// Description: Java 11 Object interface for YCFGenKb Cluster.

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

public interface IYCFGenKbClusterObj
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
	 *	Realise this instance of a Cluster.
	 *
	 *	@return	YCFGenKbClusterObj instance which should be subsequently referenced.
	 */
	IYCFGenKbClusterObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbClusterObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbClusterObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbClusterObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbClusterObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Cluster instance.
	 *
	 *	@return	The newly locked IYCFGenKbClusterEditObj edition of this instance.
	 */
	IYCFGenKbClusterEditObj beginEdit();

	/**
	 *	End this edition of this Cluster instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Cluster instance.
	 *
	 *	@return	The IYCFGenKbClusterEditObj edition of this instance.
	 */
	IYCFGenKbClusterEditObj getEdit();

	/**
	 *	Get the current edition of this Cluster instance as a IYCFGenKbClusterEditObj.
	 *
	 *	@return	The IYCFGenKbClusterEditObj edition of this instance.
	 */
	IYCFGenKbClusterEditObj getEditAsCluster();

	/**
	 *	Get the IYCFGenKbClusterTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbClusterTableObj table cache which manages this instance.
	 */
	IYCFGenKbClusterTableObj getClusterTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbClusterBuff instance which currently backs this object.
	 */
	YCFGenKbClusterBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbClusterBuff value );

	/**
	 *	Get the YCFGenKbClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbClusterBuff instance which currently backs this object.
	 */
	YCFGenKbClusterBuff getClusterBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbClusterPKey primary key for this instance.
	 */
	YCFGenKbClusterPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbClusterPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbClusterPKey value );

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
	 *	Get the required long attribute Id.
	 *
	 *	@return	The required long attribute Id.
	 */
	long getRequiredId();

	/**
	 *	Get the required String attribute FullDomName.
	 *
	 *	@return	The required String attribute FullDomName.
	 */
	String getRequiredFullDomName();

	/**
	 *	Get the required String attribute Description.
	 *
	 *	@return	The required String attribute Description.
	 */
	String getRequiredDescription();

	/**
	 *	Get the array of optional IYCFGenKbHostNodeObj array of instances referenced by the HostNode key.
	 *
	 *	@return	The optional IYCFGenKbHostNodeObj[] array of instances referenced by the HostNode key.
	 */
	List<IYCFGenKbHostNodeObj> getOptionalComponentsHostNode();

	/**
	 *	Get the array of optional IYCFGenKbHostNodeObj array of instances referenced by the HostNode key.
	 *
	 *	@return	The optional IYCFGenKbHostNodeObj[] array of instances referenced by the HostNode key.
	 */
	List<IYCFGenKbHostNodeObj> getOptionalComponentsHostNode( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbTenantObj array of instances referenced by the Tenant key.
	 *
	 *	@return	The optional IYCFGenKbTenantObj[] array of instances referenced by the Tenant key.
	 */
	List<IYCFGenKbTenantObj> getOptionalComponentsTenant();

	/**
	 *	Get the array of optional IYCFGenKbTenantObj array of instances referenced by the Tenant key.
	 *
	 *	@return	The optional IYCFGenKbTenantObj[] array of instances referenced by the Tenant key.
	 */
	List<IYCFGenKbTenantObj> getOptionalComponentsTenant( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbSecAppObj array of instances referenced by the SecApp key.
	 *
	 *	@return	The optional IYCFGenKbSecAppObj[] array of instances referenced by the SecApp key.
	 */
	List<IYCFGenKbSecAppObj> getOptionalComponentsSecApp();

	/**
	 *	Get the array of optional IYCFGenKbSecAppObj array of instances referenced by the SecApp key.
	 *
	 *	@return	The optional IYCFGenKbSecAppObj[] array of instances referenced by the SecApp key.
	 */
	List<IYCFGenKbSecAppObj> getOptionalComponentsSecApp( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbSecGroupObj array of instances referenced by the SecGroup key.
	 *
	 *	@return	The optional IYCFGenKbSecGroupObj[] array of instances referenced by the SecGroup key.
	 */
	List<IYCFGenKbSecGroupObj> getOptionalComponentsSecGroup();

	/**
	 *	Get the array of optional IYCFGenKbSecGroupObj array of instances referenced by the SecGroup key.
	 *
	 *	@return	The optional IYCFGenKbSecGroupObj[] array of instances referenced by the SecGroup key.
	 */
	List<IYCFGenKbSecGroupObj> getOptionalComponentsSecGroup( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbSysClusterObj array of instances referenced by the SysCluster key.
	 *
	 *	@return	The optional IYCFGenKbSysClusterObj[] array of instances referenced by the SysCluster key.
	 */
	List<IYCFGenKbSysClusterObj> getOptionalComponentsSysCluster();

	/**
	 *	Get the array of optional IYCFGenKbSysClusterObj array of instances referenced by the SysCluster key.
	 *
	 *	@return	The optional IYCFGenKbSysClusterObj[] array of instances referenced by the SysCluster key.
	 */
	List<IYCFGenKbSysClusterObj> getOptionalComponentsSysCluster( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
