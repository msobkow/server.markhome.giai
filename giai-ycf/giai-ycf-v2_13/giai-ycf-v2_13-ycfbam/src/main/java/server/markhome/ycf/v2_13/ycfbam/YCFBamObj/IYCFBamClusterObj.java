// Description: Java 11 Object interface for YCFBam Cluster.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamClusterObj
	extends IYCFSecClusterObj,
		IYCFIntClusterObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The IYCFSecSecUserObj instance who created this instance.
	 */
	IYCFSecSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The IYCFSecSecUserObj instance who updated this instance.
	 */
	IYCFSecSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a Cluster.
	 *
	 *	@return	YCFSecClusterObj instance which should be subsequently referenced.
	 */
	IYCFSecClusterObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecClusterObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecClusterObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecClusterObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecClusterObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Cluster instance.
	 *
	 *	@return	The newly locked IYCFSecClusterEditObj edition of this instance.
	 */
	IYCFSecClusterEditObj beginEdit();

	/**
	 *	End this edition of this Cluster instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Cluster instance.
	 *
	 *	@return	The IYCFSecClusterEditObj edition of this instance.
	 */
	IYCFSecClusterEditObj getEdit();

	/**
	 *	Get the current edition of this Cluster instance as a IYCFSecClusterEditObj.
	 *
	 *	@return	The IYCFSecClusterEditObj edition of this instance.
	 */
	IYCFSecClusterEditObj getEditAsCluster();

	/**
	 *	Get the IYCFSecClusterTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecClusterTableObj table cache which manages this instance.
	 */
	IYCFSecClusterTableObj getClusterTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecClusterBuff instance which currently backs this object.
	 */
	YCFSecClusterBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecClusterBuff value );

	/**
	 *	Get the YCFSecClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecClusterBuff instance which currently backs this object.
	 */
	YCFSecClusterBuff getClusterBuff();

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
	 *	Get the array of optional IYCFSecHostNodeObj array of instances referenced by the HostNode key.
	 *
	 *	@return	The optional IYCFSecHostNodeObj[] array of instances referenced by the HostNode key.
	 */
	List<IYCFSecHostNodeObj> getOptionalComponentsHostNode();

	/**
	 *	Get the array of optional IYCFSecHostNodeObj array of instances referenced by the HostNode key.
	 *
	 *	@return	The optional IYCFSecHostNodeObj[] array of instances referenced by the HostNode key.
	 */
	List<IYCFSecHostNodeObj> getOptionalComponentsHostNode( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecTenantObj array of instances referenced by the Tenant key.
	 *
	 *	@return	The optional IYCFSecTenantObj[] array of instances referenced by the Tenant key.
	 */
	List<IYCFSecTenantObj> getOptionalComponentsTenant();

	/**
	 *	Get the array of optional IYCFSecTenantObj array of instances referenced by the Tenant key.
	 *
	 *	@return	The optional IYCFSecTenantObj[] array of instances referenced by the Tenant key.
	 */
	List<IYCFSecTenantObj> getOptionalComponentsTenant( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecSecAppObj array of instances referenced by the SecApp key.
	 *
	 *	@return	The optional IYCFSecSecAppObj[] array of instances referenced by the SecApp key.
	 */
	List<IYCFSecSecAppObj> getOptionalComponentsSecApp();

	/**
	 *	Get the array of optional IYCFSecSecAppObj array of instances referenced by the SecApp key.
	 *
	 *	@return	The optional IYCFSecSecAppObj[] array of instances referenced by the SecApp key.
	 */
	List<IYCFSecSecAppObj> getOptionalComponentsSecApp( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecSecGroupObj array of instances referenced by the SecGroup key.
	 *
	 *	@return	The optional IYCFSecSecGroupObj[] array of instances referenced by the SecGroup key.
	 */
	List<IYCFSecSecGroupObj> getOptionalComponentsSecGroup();

	/**
	 *	Get the array of optional IYCFSecSecGroupObj array of instances referenced by the SecGroup key.
	 *
	 *	@return	The optional IYCFSecSecGroupObj[] array of instances referenced by the SecGroup key.
	 */
	List<IYCFSecSecGroupObj> getOptionalComponentsSecGroup( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecSysClusterObj array of instances referenced by the SysCluster key.
	 *
	 *	@return	The optional IYCFSecSysClusterObj[] array of instances referenced by the SysCluster key.
	 */
	List<IYCFSecSysClusterObj> getOptionalComponentsSysCluster();

	/**
	 *	Get the array of optional IYCFSecSysClusterObj array of instances referenced by the SysCluster key.
	 *
	 *	@return	The optional IYCFSecSysClusterObj[] array of instances referenced by the SysCluster key.
	 */
	List<IYCFSecSysClusterObj> getOptionalComponentsSysCluster( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
