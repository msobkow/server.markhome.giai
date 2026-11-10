// Description: Java 11 Object interface for YCFGenKb SecUser.

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

public interface IYCFGenKbSecUserObj
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
	 *	Realise this instance of a SecUser.
	 *
	 *	@return	YCFGenKbSecUserObj instance which should be subsequently referenced.
	 */
	IYCFGenKbSecUserObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSecUserObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSecUserObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSecUserObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSecUserObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecUser instance.
	 *
	 *	@return	The newly locked IYCFGenKbSecUserEditObj edition of this instance.
	 */
	IYCFGenKbSecUserEditObj beginEdit();

	/**
	 *	End this edition of this SecUser instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecUser instance.
	 *
	 *	@return	The IYCFGenKbSecUserEditObj edition of this instance.
	 */
	IYCFGenKbSecUserEditObj getEdit();

	/**
	 *	Get the current edition of this SecUser instance as a IYCFGenKbSecUserEditObj.
	 *
	 *	@return	The IYCFGenKbSecUserEditObj edition of this instance.
	 */
	IYCFGenKbSecUserEditObj getEditAsSecUser();

	/**
	 *	Get the IYCFGenKbSecUserTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSecUserTableObj table cache which manages this instance.
	 */
	IYCFGenKbSecUserTableObj getSecUserTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbSecUserBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSecUserBuff instance which currently backs this object.
	 */
	YCFGenKbSecUserBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbSecUserBuff value );

	/**
	 *	Get the YCFGenKbSecUserBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSecUserBuff instance which currently backs this object.
	 */
	YCFGenKbSecUserBuff getSecUserBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbSecUserPKey primary key for this instance.
	 */
	YCFGenKbSecUserPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbSecUserPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbSecUserPKey value );

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
	 *	Get the array of optional IYCFGenKbSecDeviceObj array of instances referenced by the SecDev key.
	 *
	 *	@return	The optional IYCFGenKbSecDeviceObj[] array of instances referenced by the SecDev key.
	 */
	List<IYCFGenKbSecDeviceObj> getOptionalComponentsSecDev();

	/**
	 *	Get the array of optional IYCFGenKbSecDeviceObj array of instances referenced by the SecDev key.
	 *
	 *	@return	The optional IYCFGenKbSecDeviceObj[] array of instances referenced by the SecDev key.
	 */
	List<IYCFGenKbSecDeviceObj> getOptionalComponentsSecDev( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The optional IYCFGenKbSecDeviceObj instance referenced by the DefDev key.
	 */
	IYCFGenKbSecDeviceObj getOptionalLookupDefDev();

	/**
	 *	Get the optional IYCFGenKbSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The optional IYCFGenKbSecDeviceObj instance referenced by the DefDev key.
	 */
	IYCFGenKbSecDeviceObj getOptionalLookupDefDev( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbSecSessionObj array of instances referenced by the SecSess key.
	 *
	 *	@return	The optional IYCFGenKbSecSessionObj[] array of instances referenced by the SecSess key.
	 */
	List<IYCFGenKbSecSessionObj> getOptionalComponentsSecSess();

	/**
	 *	Get the array of optional IYCFGenKbSecSessionObj array of instances referenced by the SecSess key.
	 *
	 *	@return	The optional IYCFGenKbSecSessionObj[] array of instances referenced by the SecSess key.
	 */
	List<IYCFGenKbSecSessionObj> getOptionalComponentsSecSess( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbSecSessionObj array of instances referenced by the SecProxy key.
	 *
	 *	@return	The optional IYCFGenKbSecSessionObj[] array of instances referenced by the SecProxy key.
	 */
	List<IYCFGenKbSecSessionObj> getOptionalChildrenSecProxy();

	/**
	 *	Get the array of optional IYCFGenKbSecSessionObj array of instances referenced by the SecProxy key.
	 *
	 *	@return	The optional IYCFGenKbSecSessionObj[] array of instances referenced by the SecProxy key.
	 */
	List<IYCFGenKbSecSessionObj> getOptionalChildrenSecProxy( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbSecGrpMembObj array of instances referenced by the SecGrpMemb key.
	 *
	 *	@return	The optional IYCFGenKbSecGrpMembObj[] array of instances referenced by the SecGrpMemb key.
	 */
	List<IYCFGenKbSecGrpMembObj> getOptionalChildrenSecGrpMemb();

	/**
	 *	Get the array of optional IYCFGenKbSecGrpMembObj array of instances referenced by the SecGrpMemb key.
	 *
	 *	@return	The optional IYCFGenKbSecGrpMembObj[] array of instances referenced by the SecGrpMemb key.
	 */
	List<IYCFGenKbSecGrpMembObj> getOptionalChildrenSecGrpMemb( boolean forceRead );

	/**
	 *	Get the array of optional IYCFGenKbTSecGrpMembObj array of instances referenced by the TSecGrpMemb key.
	 *
	 *	@return	The optional IYCFGenKbTSecGrpMembObj[] array of instances referenced by the TSecGrpMemb key.
	 */
	List<IYCFGenKbTSecGrpMembObj> getOptionalChildrenTSecGrpMemb();

	/**
	 *	Get the array of optional IYCFGenKbTSecGrpMembObj array of instances referenced by the TSecGrpMemb key.
	 *
	 *	@return	The optional IYCFGenKbTSecGrpMembObj[] array of instances referenced by the TSecGrpMemb key.
	 */
	List<IYCFGenKbTSecGrpMembObj> getOptionalChildrenTSecGrpMemb( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
