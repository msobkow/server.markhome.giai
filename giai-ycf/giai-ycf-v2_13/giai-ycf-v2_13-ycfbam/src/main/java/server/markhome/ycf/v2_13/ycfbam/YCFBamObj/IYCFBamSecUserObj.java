// Description: Java 11 Object interface for YCFBam SecUser.

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

public interface IYCFBamSecUserObj
	extends IYCFSecSecUserObj,
		IYCFIntSecUserObj
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
	 *	Realise this instance of a SecUser.
	 *
	 *	@return	YCFSecSecUserObj instance which should be subsequently referenced.
	 */
	IYCFSecSecUserObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecUserObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecUserObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecUserObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecUserObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecUser instance.
	 *
	 *	@return	The newly locked IYCFSecSecUserEditObj edition of this instance.
	 */
	IYCFSecSecUserEditObj beginEdit();

	/**
	 *	End this edition of this SecUser instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecUser instance.
	 *
	 *	@return	The IYCFSecSecUserEditObj edition of this instance.
	 */
	IYCFSecSecUserEditObj getEdit();

	/**
	 *	Get the current edition of this SecUser instance as a IYCFSecSecUserEditObj.
	 *
	 *	@return	The IYCFSecSecUserEditObj edition of this instance.
	 */
	IYCFSecSecUserEditObj getEditAsSecUser();

	/**
	 *	Get the IYCFSecSecUserTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecSecUserTableObj table cache which manages this instance.
	 */
	IYCFSecSecUserTableObj getSecUserTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecSecUserBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecUserBuff instance which currently backs this object.
	 */
	YCFSecSecUserBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecSecUserBuff value );

	/**
	 *	Get the YCFSecSecUserBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecUserBuff instance which currently backs this object.
	 */
	YCFSecSecUserBuff getSecUserBuff();

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
	 *	Get the required UUID attribute SecUserId.
	 *
	 *	@return	The required UUID attribute SecUserId.
	 */
	UUID getRequiredSecUserId();

	/**
	 *	Get the required String attribute LoginId.
	 *
	 *	@return	The required String attribute LoginId.
	 */
	String getRequiredLoginId();

	/**
	 *	Get the required String attribute EMailAddress.
	 *
	 *	@return	The required String attribute EMailAddress.
	 */
	String getRequiredEMailAddress();

	/**
	 *	Get the optional UUID attribute EMailConfirmUuid.
	 *
	 *	@return	The optional UUID attribute EMailConfirmUuid.
	 */
	UUID getOptionalEMailConfirmUuid();

	/**
	 *	Get the optional UUID attribute DfltDevUserId.
	 *
	 *	@return	The optional UUID attribute DfltDevUserId.
	 */
	UUID getOptionalDfltDevUserId();

	/**
	 *	Get the optional String attribute DfltDevName.
	 *
	 *	@return	The optional String attribute DfltDevName.
	 */
	String getOptionalDfltDevName();

	/**
	 *	Get the required String attribute PasswordHash.
	 *
	 *	@return	The required String attribute PasswordHash.
	 */
	String getRequiredPasswordHash();

	/**
	 *	Get the optional UUID attribute PasswordResetUuid.
	 *
	 *	@return	The optional UUID attribute PasswordResetUuid.
	 */
	UUID getOptionalPasswordResetUuid();

	/**
	 *	Get the array of optional IYCFSecSecDeviceObj array of instances referenced by the SecDev key.
	 *
	 *	@return	The optional IYCFSecSecDeviceObj[] array of instances referenced by the SecDev key.
	 */
	List<IYCFSecSecDeviceObj> getOptionalComponentsSecDev();

	/**
	 *	Get the array of optional IYCFSecSecDeviceObj array of instances referenced by the SecDev key.
	 *
	 *	@return	The optional IYCFSecSecDeviceObj[] array of instances referenced by the SecDev key.
	 */
	List<IYCFSecSecDeviceObj> getOptionalComponentsSecDev( boolean forceRead );

	/**
	 *	Get the optional IYCFBamSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The optional IYCFBamSecDeviceObj instance referenced by the DefDev key.
	 */
	IYCFSecSecDeviceObj getOptionalLookupDefDev();

	/**
	 *	Get the optional IYCFSecSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The optional IYCFSecSecDeviceObj instance referenced by the DefDev key.
	 */
	IYCFSecSecDeviceObj getOptionalLookupDefDev( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecSecSessionObj array of instances referenced by the SecSess key.
	 *
	 *	@return	The optional IYCFSecSecSessionObj[] array of instances referenced by the SecSess key.
	 */
	List<IYCFSecSecSessionObj> getOptionalComponentsSecSess();

	/**
	 *	Get the array of optional IYCFSecSecSessionObj array of instances referenced by the SecSess key.
	 *
	 *	@return	The optional IYCFSecSecSessionObj[] array of instances referenced by the SecSess key.
	 */
	List<IYCFSecSecSessionObj> getOptionalComponentsSecSess( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecSecSessionObj array of instances referenced by the SecProxy key.
	 *
	 *	@return	The optional IYCFSecSecSessionObj[] array of instances referenced by the SecProxy key.
	 */
	List<IYCFSecSecSessionObj> getOptionalChildrenSecProxy();

	/**
	 *	Get the array of optional IYCFSecSecSessionObj array of instances referenced by the SecProxy key.
	 *
	 *	@return	The optional IYCFSecSecSessionObj[] array of instances referenced by the SecProxy key.
	 */
	List<IYCFSecSecSessionObj> getOptionalChildrenSecProxy( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecSecGrpMembObj array of instances referenced by the SecGrpMemb key.
	 *
	 *	@return	The optional IYCFSecSecGrpMembObj[] array of instances referenced by the SecGrpMemb key.
	 */
	List<IYCFSecSecGrpMembObj> getOptionalChildrenSecGrpMemb();

	/**
	 *	Get the array of optional IYCFSecSecGrpMembObj array of instances referenced by the SecGrpMemb key.
	 *
	 *	@return	The optional IYCFSecSecGrpMembObj[] array of instances referenced by the SecGrpMemb key.
	 */
	List<IYCFSecSecGrpMembObj> getOptionalChildrenSecGrpMemb( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecTSecGrpMembObj array of instances referenced by the TSecGrpMemb key.
	 *
	 *	@return	The optional IYCFSecTSecGrpMembObj[] array of instances referenced by the TSecGrpMemb key.
	 */
	List<IYCFSecTSecGrpMembObj> getOptionalChildrenTSecGrpMemb();

	/**
	 *	Get the array of optional IYCFSecTSecGrpMembObj array of instances referenced by the TSecGrpMemb key.
	 *
	 *	@return	The optional IYCFSecTSecGrpMembObj[] array of instances referenced by the TSecGrpMemb key.
	 */
	List<IYCFSecTSecGrpMembObj> getOptionalChildrenTSecGrpMemb( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
