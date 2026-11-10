// Description: Java 11 Object interface for YCFInt Service.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFIntServiceObj
	extends IYCFSecServiceObj
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
	 *	Realise this instance of a Service.
	 *
	 *	@return	YCFSecServiceObj instance which should be subsequently referenced.
	 */
	IYCFSecServiceObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecServiceObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecServiceObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecServiceObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecServiceObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Service instance.
	 *
	 *	@return	The newly locked IYCFSecServiceEditObj edition of this instance.
	 */
	IYCFSecServiceEditObj beginEdit();

	/**
	 *	End this edition of this Service instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Service instance.
	 *
	 *	@return	The IYCFSecServiceEditObj edition of this instance.
	 */
	IYCFSecServiceEditObj getEdit();

	/**
	 *	Get the current edition of this Service instance as a IYCFSecServiceEditObj.
	 *
	 *	@return	The IYCFSecServiceEditObj edition of this instance.
	 */
	IYCFSecServiceEditObj getEditAsService();

	/**
	 *	Get the IYCFSecServiceTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecServiceTableObj table cache which manages this instance.
	 */
	IYCFSecServiceTableObj getServiceTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecServiceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecServiceBuff instance which currently backs this object.
	 */
	YCFSecServiceBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecServiceBuff value );

	/**
	 *	Get the YCFSecServiceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecServiceBuff instance which currently backs this object.
	 */
	YCFSecServiceBuff getServiceBuff();

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
	 *	Get the required long attribute ServiceId.
	 *
	 *	@return	The required long attribute ServiceId.
	 */
	long getRequiredServiceId();

	/**
	 *	Get the required long attribute HostNodeId.
	 *
	 *	@return	The required long attribute HostNodeId.
	 */
	long getRequiredHostNodeId();

	/**
	 *	Get the required int attribute ServiceTypeId.
	 *
	 *	@return	The required int attribute ServiceTypeId.
	 */
	int getRequiredServiceTypeId();

	/**
	 *	Get the required short attribute HostPort.
	 *
	 *	@return	The required short attribute HostPort.
	 */
	short getRequiredHostPort();

	/**
	 *	Get the required IYCFIntClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFIntClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredOwnerCluster();

	/**
	 *	Get the required IYCFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFSecClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredOwnerCluster( boolean forceRead );

	/**
	 *	Get the optional IYCFIntHostNodeObj instance referenced by the Host key.
	 *
	 *	@return	The optional IYCFIntHostNodeObj instance referenced by the Host key.
	 */
	IYCFSecHostNodeObj getOptionalContainerHost();

	/**
	 *	Get the optional IYCFSecHostNodeObj instance referenced by the Host key.
	 *
	 *	@return	The optional IYCFSecHostNodeObj instance referenced by the Host key.
	 */
	IYCFSecHostNodeObj getOptionalContainerHost( boolean forceRead );

	/**
	 *	Get the optional IYCFIntServiceTypeObj instance referenced by the ServiceType key.
	 *
	 *	@return	The optional IYCFIntServiceTypeObj instance referenced by the ServiceType key.
	 */
	IYCFSecServiceTypeObj getOptionalParentServiceType();

	/**
	 *	Get the optional IYCFSecServiceTypeObj instance referenced by the ServiceType key.
	 *
	 *	@return	The optional IYCFSecServiceTypeObj instance referenced by the ServiceType key.
	 */
	IYCFSecServiceTypeObj getOptionalParentServiceType( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
