// Description: Java 11 Object interface for YCFBam SecDevice.

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

public interface IYCFBamSecDeviceObj
	extends IYCFSecSecDeviceObj,
		IYCFIntSecDeviceObj
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
	 *	Realise this instance of a SecDevice.
	 *
	 *	@return	YCFSecSecDeviceObj instance which should be subsequently referenced.
	 */
	IYCFSecSecDeviceObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecDeviceObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecDeviceObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecDeviceObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecDeviceObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecDevice instance.
	 *
	 *	@return	The newly locked IYCFSecSecDeviceEditObj edition of this instance.
	 */
	IYCFSecSecDeviceEditObj beginEdit();

	/**
	 *	End this edition of this SecDevice instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecDevice instance.
	 *
	 *	@return	The IYCFSecSecDeviceEditObj edition of this instance.
	 */
	IYCFSecSecDeviceEditObj getEdit();

	/**
	 *	Get the current edition of this SecDevice instance as a IYCFSecSecDeviceEditObj.
	 *
	 *	@return	The IYCFSecSecDeviceEditObj edition of this instance.
	 */
	IYCFSecSecDeviceEditObj getEditAsSecDevice();

	/**
	 *	Get the IYCFSecSecDeviceTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecSecDeviceTableObj table cache which manages this instance.
	 */
	IYCFSecSecDeviceTableObj getSecDeviceTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecSecDeviceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecDeviceBuff instance which currently backs this object.
	 */
	YCFSecSecDeviceBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecSecDeviceBuff value );

	/**
	 *	Get the YCFSecSecDeviceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecDeviceBuff instance which currently backs this object.
	 */
	YCFSecSecDeviceBuff getSecDeviceBuff();

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
	 *	Get the required IYCFBamSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required IYCFBamSecUserObj instance referenced by the SecUser key.
	 */
	IYCFSecSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required IYCFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required IYCFSecSecUserObj instance referenced by the SecUser key.
	 */
	IYCFSecSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
