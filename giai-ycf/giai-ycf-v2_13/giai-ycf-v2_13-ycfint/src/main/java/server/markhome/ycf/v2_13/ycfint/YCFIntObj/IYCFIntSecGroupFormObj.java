// Description: Java 11 Object interface for YCFInt SecGroupForm.

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

public interface IYCFIntSecGroupFormObj
	extends IYCFSecSecGroupFormObj
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
	 *	Realise this instance of a SecGroupForm.
	 *
	 *	@return	YCFSecSecGroupFormObj instance which should be subsequently referenced.
	 */
	IYCFSecSecGroupFormObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecGroupFormObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecGroupFormObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecSecGroupFormObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecSecGroupFormObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecGroupForm instance.
	 *
	 *	@return	The newly locked IYCFSecSecGroupFormEditObj edition of this instance.
	 */
	IYCFSecSecGroupFormEditObj beginEdit();

	/**
	 *	End this edition of this SecGroupForm instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecGroupForm instance.
	 *
	 *	@return	The IYCFSecSecGroupFormEditObj edition of this instance.
	 */
	IYCFSecSecGroupFormEditObj getEdit();

	/**
	 *	Get the current edition of this SecGroupForm instance as a IYCFSecSecGroupFormEditObj.
	 *
	 *	@return	The IYCFSecSecGroupFormEditObj edition of this instance.
	 */
	IYCFSecSecGroupFormEditObj getEditAsSecGroupForm();

	/**
	 *	Get the IYCFSecSecGroupFormTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecSecGroupFormTableObj table cache which manages this instance.
	 */
	IYCFSecSecGroupFormTableObj getSecGroupFormTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecSecGroupFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecGroupFormBuff instance which currently backs this object.
	 */
	YCFSecSecGroupFormBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecSecGroupFormBuff value );

	/**
	 *	Get the YCFSecSecGroupFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecSecGroupFormBuff instance which currently backs this object.
	 */
	YCFSecSecGroupFormBuff getSecGroupFormBuff();

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
	 *	Get the required IYCFIntSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required IYCFIntSecGroupObj instance referenced by the Group key.
	 */
	IYCFSecSecGroupObj getRequiredContainerGroup();

	/**
	 *	Get the required IYCFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required IYCFSecSecGroupObj instance referenced by the Group key.
	 */
	IYCFSecSecGroupObj getRequiredContainerGroup( boolean forceRead );

	/**
	 *	Get the required IYCFIntSecAppObj instance referenced by the App key.
	 *
	 *	@return	The required IYCFIntSecAppObj instance referenced by the App key.
	 */
	IYCFSecSecAppObj getRequiredParentApp();

	/**
	 *	Get the required IYCFSecSecAppObj instance referenced by the App key.
	 *
	 *	@return	The required IYCFSecSecAppObj instance referenced by the App key.
	 */
	IYCFSecSecAppObj getRequiredParentApp( boolean forceRead );

	/**
	 *	Get the required IYCFIntSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The required IYCFIntSecFormObj instance referenced by the Form key.
	 */
	IYCFSecSecFormObj getRequiredParentForm();

	/**
	 *	Get the required IYCFSecSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The required IYCFSecSecFormObj instance referenced by the Form key.
	 */
	IYCFSecSecFormObj getRequiredParentForm( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
