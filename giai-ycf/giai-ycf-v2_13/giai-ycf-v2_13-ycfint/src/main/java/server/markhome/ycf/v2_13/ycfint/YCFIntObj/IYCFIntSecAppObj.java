// Description: Java 11 Object interface for YCFInt SecApp.

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

public interface IYCFIntSecAppObj
	extends IYCFSecSecAppObj
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
	 *	Realise this instance of a SecApp.
	 *
	 *	@return	YCFSecSecAppObj instance which should be subsequently referenced.
	 */
	IYCFSecSecAppObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecAppObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecAppObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecAppObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecAppObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecApp instance.
	 *
	 *	@return	The newly locked IYCFSecSecAppEditObj edition of this instance.
	 */
	IYCFSecSecAppEditObj beginEdit();

	/**
	 *	End this edition of this SecApp instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecApp instance.
	 *
	 *	@return	The IYCFSecSecAppEditObj edition of this instance.
	 */
	IYCFSecSecAppEditObj getEdit();

	/**
	 *	Get the current edition of this SecApp instance as a IYCFSecSecAppEditObj.
	 *
	 *	@return	The IYCFSecSecAppEditObj edition of this instance.
	 */
	IYCFSecSecAppEditObj getEditAsSecApp();

	/**
	 *	Get the IYCFSecSecAppTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecSecAppTableObj table cache which manages this instance.
	 */
	IYCFSecSecAppTableObj getSecAppTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecSecAppBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecAppBuff instance which currently backs this object.
	 */
	YCFSecSecAppBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecSecAppBuff value );

	/**
	 *	Get the YCFSecSecAppBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecAppBuff instance which currently backs this object.
	 */
	YCFSecSecAppBuff getSecAppBuff();

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
	 *	Get the required int attribute SecAppId.
	 *
	 *	@return	The required int attribute SecAppId.
	 */
	int getRequiredSecAppId();

	/**
	 *	Get the required String attribute JEEMountName.
	 *
	 *	@return	The required String attribute JEEMountName.
	 */
	String getRequiredJEEMountName();

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
	 *	Get the array of optional IYCFSecSecFormObj array of instances referenced by the Form key.
	 *
	 *	@return	The optional IYCFSecSecFormObj[] array of instances referenced by the Form key.
	 */
	List<IYCFSecSecFormObj> getOptionalComponentsForm();

	/**
	 *	Get the array of optional IYCFSecSecFormObj array of instances referenced by the Form key.
	 *
	 *	@return	The optional IYCFSecSecFormObj[] array of instances referenced by the Form key.
	 */
	List<IYCFSecSecFormObj> getOptionalComponentsForm( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
