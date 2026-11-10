// Description: Java 11 Object interface for YCFInt HostNode.

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

public interface IYCFIntHostNodeObj
	extends IYCFSecHostNodeObj
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
	 *	Realise this instance of a HostNode.
	 *
	 *	@return	YCFSecHostNodeObj instance which should be subsequently referenced.
	 */
	IYCFSecHostNodeObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecHostNodeObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecHostNodeObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecHostNodeObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecHostNodeObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this HostNode instance.
	 *
	 *	@return	The newly locked IYCFSecHostNodeEditObj edition of this instance.
	 */
	IYCFSecHostNodeEditObj beginEdit();

	/**
	 *	End this edition of this HostNode instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this HostNode instance.
	 *
	 *	@return	The IYCFSecHostNodeEditObj edition of this instance.
	 */
	IYCFSecHostNodeEditObj getEdit();

	/**
	 *	Get the current edition of this HostNode instance as a IYCFSecHostNodeEditObj.
	 *
	 *	@return	The IYCFSecHostNodeEditObj edition of this instance.
	 */
	IYCFSecHostNodeEditObj getEditAsHostNode();

	/**
	 *	Get the IYCFSecHostNodeTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecHostNodeTableObj table cache which manages this instance.
	 */
	IYCFSecHostNodeTableObj getHostNodeTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecHostNodeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecHostNodeBuff instance which currently backs this object.
	 */
	YCFSecHostNodeBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecHostNodeBuff value );

	/**
	 *	Get the YCFSecHostNodeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecHostNodeBuff instance which currently backs this object.
	 */
	YCFSecHostNodeBuff getHostNodeBuff();

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
	 *	Get the required long attribute HostNodeId.
	 *
	 *	@return	The required long attribute HostNodeId.
	 */
	long getRequiredHostNodeId();

	/**
	 *	Get the required String attribute Description.
	 *
	 *	@return	The required String attribute Description.
	 */
	String getRequiredDescription();

	/**
	 *	Get the required String attribute HostName.
	 *
	 *	@return	The required String attribute HostName.
	 */
	String getRequiredHostName();

	/**
	 *	Get the required IYCFIntClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFIntClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredContainerCluster();

	/**
	 *	Get the required IYCFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFSecClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead );

	/**
	 *	Get the array of optional IYCFSecServiceObj array of instances referenced by the Service key.
	 *
	 *	@return	The optional IYCFSecServiceObj[] array of instances referenced by the Service key.
	 */
	List<IYCFSecServiceObj> getOptionalComponentsService();

	/**
	 *	Get the array of optional IYCFSecServiceObj array of instances referenced by the Service key.
	 *
	 *	@return	The optional IYCFSecServiceObj[] array of instances referenced by the Service key.
	 */
	List<IYCFSecServiceObj> getOptionalComponentsService( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
