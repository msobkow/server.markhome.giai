// Description: Java 11 Object interface for YCFSec SysCluster.

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

public interface IYCFSecSysClusterObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a SysCluster.
	 *
	 *	@return	YCFSecSysClusterObj instance which should be subsequently referenced.
	 */
	IYCFSecSysClusterObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSysClusterObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSysClusterObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSysClusterObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSysClusterObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SysCluster instance.
	 *
	 *	@return	The newly locked IYCFSecSysClusterEditObj edition of this instance.
	 */
	IYCFSecSysClusterEditObj beginEdit();

	/**
	 *	End this edition of this SysCluster instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SysCluster instance.
	 *
	 *	@return	The IYCFSecSysClusterEditObj edition of this instance.
	 */
	IYCFSecSysClusterEditObj getEdit();

	/**
	 *	Get the current edition of this SysCluster instance as a IYCFSecSysClusterEditObj.
	 *
	 *	@return	The IYCFSecSysClusterEditObj edition of this instance.
	 */
	IYCFSecSysClusterEditObj getEditAsSysCluster();

	/**
	 *	Get the IYCFSecSysClusterTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecSysClusterTableObj table cache which manages this instance.
	 */
	IYCFSecSysClusterTableObj getSysClusterTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecSysClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSysClusterBuff instance which currently backs this object.
	 */
	YCFSecSysClusterBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecSysClusterBuff value );

	/**
	 *	Get the YCFSecSysClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSysClusterBuff instance which currently backs this object.
	 */
	YCFSecSysClusterBuff getSysClusterBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFSecSysClusterPKey primary key for this instance.
	 */
	YCFSecSysClusterPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFSecSysClusterPKey primary key value for this instance.
	 */
	void setPKey( YCFSecSysClusterPKey value );

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
	 *	Get the required int attribute SingletonId.
	 *
	 *	@return	The required int attribute SingletonId.
	 */
	int getRequiredSingletonId();

	/**
	 *	Get the required long attribute ClusterId.
	 *
	 *	@return	The required long attribute ClusterId.
	 */
	long getRequiredClusterId();

	/**
	 *	Get the required IYCFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFSecClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredContainerCluster();

	/**
	 *	Get the required IYCFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFSecClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
