// Description: Java 11 Object interface for YCFBam TopProject.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

public interface IYCFBamTopProjectObj
	extends IYCFIntTopProjectObj
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
	 *	Realise this instance of a TopProject.
	 *
	 *	@return	YCFIntTopProjectObj instance which should be subsequently referenced.
	 */
	IYCFIntTopProjectObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFIntTopProjectObj the reference to the cached or read (realised) instance.
	 */
	IYCFIntTopProjectObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFIntTopProjectObj the reference to the cached or read (realised) instance.
	 */
	IYCFIntTopProjectObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TopProject instance.
	 *
	 *	@return	The newly locked IYCFIntTopProjectEditObj edition of this instance.
	 */
	IYCFIntTopProjectEditObj beginEdit();

	/**
	 *	End this edition of this TopProject instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TopProject instance.
	 *
	 *	@return	The IYCFIntTopProjectEditObj edition of this instance.
	 */
	IYCFIntTopProjectEditObj getEdit();

	/**
	 *	Get the current edition of this TopProject instance as a IYCFIntTopProjectEditObj.
	 *
	 *	@return	The IYCFIntTopProjectEditObj edition of this instance.
	 */
	IYCFIntTopProjectEditObj getEditAsTopProject();

	/**
	 *	Get the IYCFIntTopProjectTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFIntTopProjectTableObj table cache which manages this instance.
	 */
	IYCFIntTopProjectTableObj getTopProjectTable();

	/**
	 *	Get the IYCFIntSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFIntSchemaObj schema cache which manages this instance.
	 */
	IYCFIntSchemaObj getSchema();

	/**
	 *	Get the YCFIntTopProjectBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFIntTopProjectBuff instance which currently backs this object.
	 */
	YCFIntTopProjectBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFIntTopProjectBuff value );

	/**
	 *	Get the YCFIntTopProjectBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFIntTopProjectBuff instance which currently backs this object.
	 */
	YCFIntTopProjectBuff getTopProjectBuff();

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
	 *	Get the required long attribute TenantId.
	 *
	 *	@return	The required long attribute TenantId.
	 */
	long getRequiredTenantId();

	/**
	 *	Get the required long attribute Id.
	 *
	 *	@return	The required long attribute Id.
	 */
	long getRequiredId();

	/**
	 *	Get the required long attribute TopDomainId.
	 *
	 *	@return	The required long attribute TopDomainId.
	 */
	long getRequiredTopDomainId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Get the required IYCFBamTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFBamTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFSecTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required IYCFBamTopDomainObj instance referenced by the ParentSDom key.
	 *
	 *	@return	The required IYCFBamTopDomainObj instance referenced by the ParentSDom key.
	 */
	IYCFIntTopDomainObj getRequiredContainerParentSDom();

	/**
	 *	Get the required IYCFIntTopDomainObj instance referenced by the ParentSDom key.
	 *
	 *	@return	The required IYCFIntTopDomainObj instance referenced by the ParentSDom key.
	 */
	IYCFIntTopDomainObj getRequiredContainerParentSDom( boolean forceRead );

	/**
	 *	Get the array of optional IYCFIntSubProjectObj array of instances referenced by the SubProject key.
	 *
	 *	@return	The optional IYCFIntSubProjectObj[] array of instances referenced by the SubProject key.
	 */
	List<IYCFIntSubProjectObj> getOptionalComponentsSubProject();

	/**
	 *	Get the array of optional IYCFIntSubProjectObj array of instances referenced by the SubProject key.
	 *
	 *	@return	The optional IYCFIntSubProjectObj[] array of instances referenced by the SubProject key.
	 */
	List<IYCFIntSubProjectObj> getOptionalComponentsSubProject( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
