// Description: Java 11 Object interface for YCFGenKb SysCluster.

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

public interface IYCFGenKbSysClusterObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a SysCluster.
	 *
	 *	@return	YCFGenKbSysClusterObj instance which should be subsequently referenced.
	 */
	IYCFGenKbSysClusterObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSysClusterObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSysClusterObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSysClusterObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSysClusterObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SysCluster instance.
	 *
	 *	@return	The newly locked IYCFGenKbSysClusterEditObj edition of this instance.
	 */
	IYCFGenKbSysClusterEditObj beginEdit();

	/**
	 *	End this edition of this SysCluster instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SysCluster instance.
	 *
	 *	@return	The IYCFGenKbSysClusterEditObj edition of this instance.
	 */
	IYCFGenKbSysClusterEditObj getEdit();

	/**
	 *	Get the current edition of this SysCluster instance as a IYCFGenKbSysClusterEditObj.
	 *
	 *	@return	The IYCFGenKbSysClusterEditObj edition of this instance.
	 */
	IYCFGenKbSysClusterEditObj getEditAsSysCluster();

	/**
	 *	Get the IYCFGenKbSysClusterTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSysClusterTableObj table cache which manages this instance.
	 */
	IYCFGenKbSysClusterTableObj getSysClusterTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbSysClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSysClusterBuff instance which currently backs this object.
	 */
	YCFGenKbSysClusterBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbSysClusterBuff value );

	/**
	 *	Get the YCFGenKbSysClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSysClusterBuff instance which currently backs this object.
	 */
	YCFGenKbSysClusterBuff getSysClusterBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbSysClusterPKey primary key for this instance.
	 */
	YCFGenKbSysClusterPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbSysClusterPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbSysClusterPKey value );

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
	 *	Get the required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 */
	IYCFGenKbClusterObj getRequiredContainerCluster();

	/**
	 *	Get the required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 */
	IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
