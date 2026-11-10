// Description: Java 11 Object interface for YCFGenKb SecGroupForm.

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

public interface IYCFGenKbSecGroupFormObj
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
	 *	Realise this instance of a SecGroupForm.
	 *
	 *	@return	YCFGenKbSecGroupFormObj instance which should be subsequently referenced.
	 */
	IYCFGenKbSecGroupFormObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSecGroupFormObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSecGroupFormObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbSecGroupFormObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbSecGroupFormObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecGroupForm instance.
	 *
	 *	@return	The newly locked IYCFGenKbSecGroupFormEditObj edition of this instance.
	 */
	IYCFGenKbSecGroupFormEditObj beginEdit();

	/**
	 *	End this edition of this SecGroupForm instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecGroupForm instance.
	 *
	 *	@return	The IYCFGenKbSecGroupFormEditObj edition of this instance.
	 */
	IYCFGenKbSecGroupFormEditObj getEdit();

	/**
	 *	Get the current edition of this SecGroupForm instance as a IYCFGenKbSecGroupFormEditObj.
	 *
	 *	@return	The IYCFGenKbSecGroupFormEditObj edition of this instance.
	 */
	IYCFGenKbSecGroupFormEditObj getEditAsSecGroupForm();

	/**
	 *	Get the IYCFGenKbSecGroupFormTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSecGroupFormTableObj table cache which manages this instance.
	 */
	IYCFGenKbSecGroupFormTableObj getSecGroupFormTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbSecGroupFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSecGroupFormBuff instance which currently backs this object.
	 */
	YCFGenKbSecGroupFormBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbSecGroupFormBuff value );

	/**
	 *	Get the YCFGenKbSecGroupFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbSecGroupFormBuff instance which currently backs this object.
	 */
	YCFGenKbSecGroupFormBuff getSecGroupFormBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbSecGroupFormPKey primary key for this instance.
	 */
	YCFGenKbSecGroupFormPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbSecGroupFormPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbSecGroupFormPKey value );

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
	 *	Get the required long attribute SecGroupFormId.
	 *
	 *	@return	The required long attribute SecGroupFormId.
	 */
	long getRequiredSecGroupFormId();

	/**
	 *	Get the required int attribute SecGroupId.
	 *
	 *	@return	The required int attribute SecGroupId.
	 */
	int getRequiredSecGroupId();

	/**
	 *	Get the required int attribute SecAppId.
	 *
	 *	@return	The required int attribute SecAppId.
	 */
	int getRequiredSecAppId();

	/**
	 *	Get the required int attribute SecFormId.
	 *
	 *	@return	The required int attribute SecFormId.
	 */
	int getRequiredSecFormId();

	/**
	 *	Get the required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 */
	IYCFGenKbClusterObj getRequiredOwnerCluster();

	/**
	 *	Get the required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required IYCFGenKbClusterObj instance referenced by the Cluster key.
	 */
	IYCFGenKbClusterObj getRequiredOwnerCluster( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required IYCFGenKbSecGroupObj instance referenced by the Group key.
	 */
	IYCFGenKbSecGroupObj getRequiredContainerGroup();

	/**
	 *	Get the required IYCFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required IYCFGenKbSecGroupObj instance referenced by the Group key.
	 */
	IYCFGenKbSecGroupObj getRequiredContainerGroup( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbSecAppObj instance referenced by the App key.
	 *
	 *	@return	The required IYCFGenKbSecAppObj instance referenced by the App key.
	 */
	IYCFGenKbSecAppObj getRequiredParentApp();

	/**
	 *	Get the required IYCFGenKbSecAppObj instance referenced by the App key.
	 *
	 *	@return	The required IYCFGenKbSecAppObj instance referenced by the App key.
	 */
	IYCFGenKbSecAppObj getRequiredParentApp( boolean forceRead );

	/**
	 *	Get the required IYCFGenKbSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The required IYCFGenKbSecFormObj instance referenced by the Form key.
	 */
	IYCFGenKbSecFormObj getRequiredParentForm();

	/**
	 *	Get the required IYCFGenKbSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The required IYCFGenKbSecFormObj instance referenced by the Form key.
	 */
	IYCFGenKbSecFormObj getRequiredParentForm( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
