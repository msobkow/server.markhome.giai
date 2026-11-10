// Description: Java 11 Object interface for YCFBam Tenant.

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

public interface IYCFBamTenantObj
	extends IYCFSecTenantObj,
		IYCFIntTenantObj
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
	 *	Realise this instance of a Tenant.
	 *
	 *	@return	YCFSecTenantObj instance which should be subsequently referenced.
	 */
	IYCFSecTenantObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecTenantObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecTenantObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecTenantObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecTenantObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Tenant instance.
	 *
	 *	@return	The newly locked IYCFSecTenantEditObj edition of this instance.
	 */
	IYCFSecTenantEditObj beginEdit();

	/**
	 *	End this edition of this Tenant instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Tenant instance.
	 *
	 *	@return	The IYCFSecTenantEditObj edition of this instance.
	 */
	IYCFSecTenantEditObj getEdit();

	/**
	 *	Get the current edition of this Tenant instance as a IYCFSecTenantEditObj.
	 *
	 *	@return	The IYCFSecTenantEditObj edition of this instance.
	 */
	IYCFSecTenantEditObj getEditAsTenant();

	/**
	 *	Get the IYCFSecTenantTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecTenantTableObj table cache which manages this instance.
	 */
	IYCFSecTenantTableObj getTenantTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecTenantBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecTenantBuff instance which currently backs this object.
	 */
	YCFSecTenantBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecTenantBuff value );

	/**
	 *	Get the YCFSecTenantBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecTenantBuff instance which currently backs this object.
	 */
	YCFSecTenantBuff getTenantBuff();

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
	 *	Get the required IYCFBamClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFBamClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredContainerCluster();

	/**
	 *	Get the required IYCFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFSecClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecTSecGroupObj array of instances referenced by the TSecGroup key.
	 *
	 *	@return	The optional IYCFSecTSecGroupObj[] array of instances referenced by the TSecGroup key.
	 */
	List<IYCFSecTSecGroupObj> getOptionalComponentsTSecGroup();

	/**
	 *	Get the array of optional IYCFSecTSecGroupObj array of instances referenced by the TSecGroup key.
	 *
	 *	@return	The optional IYCFSecTSecGroupObj[] array of instances referenced by the TSecGroup key.
	 */
	List<IYCFSecTSecGroupObj> getOptionalComponentsTSecGroup( boolean forceRead );

	/**
	 *	Get the array of optional IYCFIntTldObj array of instances referenced by the Tld key.
	 *
	 *	@return	The optional IYCFIntTldObj[] array of instances referenced by the Tld key.
	 */
	List<IYCFIntTldObj> getOptionalComponentsTld();

	/**
	 *	Get the array of optional IYCFIntTldObj array of instances referenced by the Tld key.
	 *
	 *	@return	The optional IYCFIntTldObj[] array of instances referenced by the Tld key.
	 */
	List<IYCFIntTldObj> getOptionalComponentsTld( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamSchemaDefObj array of instances referenced by the Schema key.
	 *
	 *	@return	The optional IYCFBamSchemaDefObj[] array of instances referenced by the Schema key.
	 */
	List<IYCFBamSchemaDefObj> getOptionalComponentsSchema();

	/**
	 *	Get the array of optional IYCFBamSchemaDefObj array of instances referenced by the Schema key.
	 *
	 *	@return	The optional IYCFBamSchemaDefObj[] array of instances referenced by the Schema key.
	 */
	List<IYCFBamSchemaDefObj> getOptionalComponentsSchema( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
