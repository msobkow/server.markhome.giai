// Description: Java 11 Object interface for YCFSec TSecGrpMemb.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public interface IYCFSecTSecGrpMembObj
	extends IYCFLibAnyObj
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
	 *	Realise this instance of a TSecGrpMemb.
	 *
	 *	@return	YCFSecTSecGrpMembObj instance which should be subsequently referenced.
	 */
	IYCFSecTSecGrpMembObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecTSecGrpMembObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecTSecGrpMembObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecTSecGrpMembObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecTSecGrpMembObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TSecGrpMemb instance.
	 *
	 *	@return	The newly locked IYCFSecTSecGrpMembEditObj edition of this instance.
	 */
	IYCFSecTSecGrpMembEditObj beginEdit();

	/**
	 *	End this edition of this TSecGrpMemb instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TSecGrpMemb instance.
	 *
	 *	@return	The IYCFSecTSecGrpMembEditObj edition of this instance.
	 */
	IYCFSecTSecGrpMembEditObj getEdit();

	/**
	 *	Get the current edition of this TSecGrpMemb instance as a IYCFSecTSecGrpMembEditObj.
	 *
	 *	@return	The IYCFSecTSecGrpMembEditObj edition of this instance.
	 */
	IYCFSecTSecGrpMembEditObj getEditAsTSecGrpMemb();

	/**
	 *	Get the IYCFSecTSecGrpMembTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecTSecGrpMembTableObj table cache which manages this instance.
	 */
	IYCFSecTSecGrpMembTableObj getTSecGrpMembTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecTSecGrpMembBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecTSecGrpMembBuff instance which currently backs this object.
	 */
	YCFSecTSecGrpMembBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecTSecGrpMembBuff value );

	/**
	 *	Get the YCFSecTSecGrpMembBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecTSecGrpMembBuff instance which currently backs this object.
	 */
	YCFSecTSecGrpMembBuff getTSecGrpMembBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFSecTSecGrpMembPKey primary key for this instance.
	 */
	YCFSecTSecGrpMembPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFSecTSecGrpMembPKey primary key value for this instance.
	 */
	void setPKey( YCFSecTSecGrpMembPKey value );

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
	 *	Get the required long attribute TSecGrpMembId.
	 *
	 *	@return	The required long attribute TSecGrpMembId.
	 */
	long getRequiredTSecGrpMembId();

	/**
	 *	Get the required int attribute TSecGroupId.
	 *
	 *	@return	The required int attribute TSecGroupId.
	 */
	int getRequiredTSecGroupId();

	/**
	 *	Get the required UUID attribute SecUserId.
	 *
	 *	@return	The required UUID attribute SecUserId.
	 */
	UUID getRequiredSecUserId();

	/**
	 *	Get the required IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFSecTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFSecTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required IYCFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required IYCFSecTSecGroupObj instance referenced by the Group key.
	 */
	IYCFSecTSecGroupObj getRequiredContainerGroup();

	/**
	 *	Get the required IYCFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required IYCFSecTSecGroupObj instance referenced by the Group key.
	 */
	IYCFSecTSecGroupObj getRequiredContainerGroup( boolean forceRead );

	/**
	 *	Get the required IYCFSecSecUserObj instance referenced by the User key.
	 *
	 *	@return	The required IYCFSecSecUserObj instance referenced by the User key.
	 */
	IYCFSecSecUserObj getRequiredParentUser();

	/**
	 *	Get the required IYCFSecSecUserObj instance referenced by the User key.
	 *
	 *	@return	The required IYCFSecSecUserObj instance referenced by the User key.
	 */
	IYCFSecSecUserObj getRequiredParentUser( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
