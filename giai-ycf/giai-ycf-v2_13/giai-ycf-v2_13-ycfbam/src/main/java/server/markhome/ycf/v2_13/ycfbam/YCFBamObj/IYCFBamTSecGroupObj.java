// Description: Java 11 Object interface for YCFBam TSecGroup.

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

public interface IYCFBamTSecGroupObj
	extends IYCFSecTSecGroupObj,
		IYCFIntTSecGroupObj
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
	 *	Realise this instance of a TSecGroup.
	 *
	 *	@return	YCFSecTSecGroupObj instance which should be subsequently referenced.
	 */
	IYCFSecTSecGroupObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecTSecGroupObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecTSecGroupObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecTSecGroupObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecTSecGroupObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TSecGroup instance.
	 *
	 *	@return	The newly locked IYCFSecTSecGroupEditObj edition of this instance.
	 */
	IYCFSecTSecGroupEditObj beginEdit();

	/**
	 *	End this edition of this TSecGroup instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TSecGroup instance.
	 *
	 *	@return	The IYCFSecTSecGroupEditObj edition of this instance.
	 */
	IYCFSecTSecGroupEditObj getEdit();

	/**
	 *	Get the current edition of this TSecGroup instance as a IYCFSecTSecGroupEditObj.
	 *
	 *	@return	The IYCFSecTSecGroupEditObj edition of this instance.
	 */
	IYCFSecTSecGroupEditObj getEditAsTSecGroup();

	/**
	 *	Get the IYCFSecTSecGroupTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecTSecGroupTableObj table cache which manages this instance.
	 */
	IYCFSecTSecGroupTableObj getTSecGroupTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecTSecGroupBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecTSecGroupBuff instance which currently backs this object.
	 */
	YCFSecTSecGroupBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecTSecGroupBuff value );

	/**
	 *	Get the YCFSecTSecGroupBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecTSecGroupBuff instance which currently backs this object.
	 */
	YCFSecTSecGroupBuff getTSecGroupBuff();

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
	 *	Get the required IYCFBamTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFBamTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredContainerTenant();

	/**
	 *	Get the required IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFSecTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredContainerTenant( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecTSecGrpIncObj array of instances referenced by the Include key.
	 *
	 *	@return	The optional IYCFSecTSecGrpIncObj[] array of instances referenced by the Include key.
	 */
	List<IYCFSecTSecGrpIncObj> getOptionalComponentsInclude();

	/**
	 *	Get the array of optional IYCFSecTSecGrpIncObj array of instances referenced by the Include key.
	 *
	 *	@return	The optional IYCFSecTSecGrpIncObj[] array of instances referenced by the Include key.
	 */
	List<IYCFSecTSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecTSecGrpMembObj array of instances referenced by the Member key.
	 *
	 *	@return	The optional IYCFSecTSecGrpMembObj[] array of instances referenced by the Member key.
	 */
	List<IYCFSecTSecGrpMembObj> getOptionalComponentsMember();

	/**
	 *	Get the array of optional IYCFSecTSecGrpMembObj array of instances referenced by the Member key.
	 *
	 *	@return	The optional IYCFSecTSecGrpMembObj[] array of instances referenced by the Member key.
	 */
	List<IYCFSecTSecGrpMembObj> getOptionalComponentsMember( boolean forceRead );

	/**
	 *	Get the array of required IYCFSecTSecGrpIncObj array of instances referenced by the IncByGroup key.
	 *
	 *	@return	The required IYCFSecTSecGrpIncObj[] array of instances referenced by the IncByGroup key.
	 */
	List<IYCFSecTSecGrpIncObj> getRequiredChildrenIncByGroup();

	/**
	 *	Get the array of required IYCFSecTSecGrpIncObj array of instances referenced by the IncByGroup key.
	 *
	 *	@return	The required IYCFSecTSecGrpIncObj[] array of instances referenced by the IncByGroup key.
	 */
	List<IYCFSecTSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
