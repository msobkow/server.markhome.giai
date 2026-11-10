// Description: Java 11 Object interface for YCFGenKb SecDevice.

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

public interface IYCFGenKbSecDeviceObj
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
	 *	Realise this instance of a SecDevice.
	 *
	 *	@return	YCFGenKbSecDeviceObj instance which should be subsequently referenced.
	 */
	IYCFGenKbSecDeviceObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSecDeviceObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSecDeviceObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSecDeviceObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSecDeviceObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecDevice instance.
	 *
	 *	@return	The newly locked IYCFGenKbSecDeviceEditObj edition of this instance.
	 */
	IYCFGenKbSecDeviceEditObj beginEdit();

	/**
	 *	End this edition of this SecDevice instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecDevice instance.
	 *
	 *	@return	The IYCFGenKbSecDeviceEditObj edition of this instance.
	 */
	IYCFGenKbSecDeviceEditObj getEdit();

	/**
	 *	Get the current edition of this SecDevice instance as a IYCFGenKbSecDeviceEditObj.
	 *
	 *	@return	The IYCFGenKbSecDeviceEditObj edition of this instance.
	 */
	IYCFGenKbSecDeviceEditObj getEditAsSecDevice();

	/**
	 *	Get the IYCFGenKbSecDeviceTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSecDeviceTableObj table cache which manages this instance.
	 */
	IYCFGenKbSecDeviceTableObj getSecDeviceTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbSecDeviceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSecDeviceBuff instance which currently backs this object.
	 */
	YCFGenKbSecDeviceBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbSecDeviceBuff value );

	/**
	 *	Get the YCFGenKbSecDeviceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSecDeviceBuff instance which currently backs this object.
	 */
	YCFGenKbSecDeviceBuff getSecDeviceBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbSecDevicePKey primary key for this instance.
	 */
	YCFGenKbSecDevicePKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbSecDevicePKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbSecDevicePKey value );

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
	 *	Get the required String attribute DevName.
	 *
	 *	@return	The required String attribute DevName.
	 */
	String getRequiredDevName();

	/**
	 *	Get the optional String attribute PubKey.
	 *
	 *	@return	The optional String attribute PubKey.
	 */
	String getOptionalPubKey();

	/**
	 *	Get the required IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 */
	IYCFGenKbSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 */
	IYCFGenKbSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
