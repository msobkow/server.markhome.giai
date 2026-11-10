// Description: Java 11 Object interface for YCFInt ServiceType.

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

public interface IYCFIntServiceTypeObj
	extends IYCFSecServiceTypeObj
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
	 *	Realise this instance of a ServiceType.
	 *
	 *	@return	YCFSecServiceTypeObj instance which should be subsequently referenced.
	 */
	IYCFSecServiceTypeObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecServiceTypeObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecServiceTypeObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFSecServiceTypeObj the reference to the cached or read (realised) instance.
	 */
	IYCFSecServiceTypeObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ServiceType instance.
	 *
	 *	@return	The newly locked IYCFSecServiceTypeEditObj edition of this instance.
	 */
	IYCFSecServiceTypeEditObj beginEdit();

	/**
	 *	End this edition of this ServiceType instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ServiceType instance.
	 *
	 *	@return	The IYCFSecServiceTypeEditObj edition of this instance.
	 */
	IYCFSecServiceTypeEditObj getEdit();

	/**
	 *	Get the current edition of this ServiceType instance as a IYCFSecServiceTypeEditObj.
	 *
	 *	@return	The IYCFSecServiceTypeEditObj edition of this instance.
	 */
	IYCFSecServiceTypeEditObj getEditAsServiceType();

	/**
	 *	Get the IYCFSecServiceTypeTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFSecServiceTypeTableObj table cache which manages this instance.
	 */
	IYCFSecServiceTypeTableObj getServiceTypeTable();

	/**
	 *	Get the IYCFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFSecSchemaObj schema cache which manages this instance.
	 */
	IYCFSecSchemaObj getSchema();

	/**
	 *	Get the YCFSecServiceTypeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecServiceTypeBuff instance which currently backs this object.
	 */
	YCFSecServiceTypeBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFSecServiceTypeBuff value );

	/**
	 *	Get the YCFSecServiceTypeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFSecServiceTypeBuff instance which currently backs this object.
	 */
	YCFSecServiceTypeBuff getServiceTypeBuff();

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
	 *	Get the required int attribute ServiceTypeId.
	 *
	 *	@return	The required int attribute ServiceTypeId.
	 */
	int getRequiredServiceTypeId();

	/**
	 *	Get the required String attribute Description.
	 *
	 *	@return	The required String attribute Description.
	 */
	String getRequiredDescription();

	/**
	 *	Get the array of optional IYCFSecServiceObj array of instances referenced by the Deployed key.
	 *
	 *	@return	The optional IYCFSecServiceObj[] array of instances referenced by the Deployed key.
	 */
	List<IYCFSecServiceObj> getOptionalChildrenDeployed();

	/**
	 *	Get the array of optional IYCFSecServiceObj array of instances referenced by the Deployed key.
	 *
	 *	@return	The optional IYCFSecServiceObj[] array of instances referenced by the Deployed key.
	 */
	List<IYCFSecServiceObj> getOptionalChildrenDeployed( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
