// Description: Java 11 Object interface for YCFBam MajorVersion.

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

public interface IYCFBamMajorVersionObj
	extends IYCFIntMajorVersionObj
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
	 *	Realise this instance of a MajorVersion.
	 *
	 *	@return	YCFIntMajorVersionObj instance which should be subsequently referenced.
	 */
	IYCFIntMajorVersionObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFIntMajorVersionObj the reference to the cached or read (realised) instance.
	 */
	IYCFIntMajorVersionObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFIntMajorVersionObj the reference to the cached or read (realised) instance.
	 */
	IYCFIntMajorVersionObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this MajorVersion instance.
	 *
	 *	@return	The newly locked IYCFIntMajorVersionEditObj edition of this instance.
	 */
	IYCFIntMajorVersionEditObj beginEdit();

	/**
	 *	End this edition of this MajorVersion instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this MajorVersion instance.
	 *
	 *	@return	The IYCFIntMajorVersionEditObj edition of this instance.
	 */
	IYCFIntMajorVersionEditObj getEdit();

	/**
	 *	Get the current edition of this MajorVersion instance as a IYCFIntMajorVersionEditObj.
	 *
	 *	@return	The IYCFIntMajorVersionEditObj edition of this instance.
	 */
	IYCFIntMajorVersionEditObj getEditAsMajorVersion();

	/**
	 *	Get the IYCFIntMajorVersionTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFIntMajorVersionTableObj table cache which manages this instance.
	 */
	IYCFIntMajorVersionTableObj getMajorVersionTable();

	/**
	 *	Get the IYCFIntSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFIntSchemaObj schema cache which manages this instance.
	 */
	IYCFIntSchemaObj getSchema();

	/**
	 *	Get the YCFIntMajorVersionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFIntMajorVersionBuff instance which currently backs this object.
	 */
	YCFIntMajorVersionBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFIntMajorVersionBuff value );

	/**
	 *	Get the YCFIntMajorVersionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFIntMajorVersionBuff instance which currently backs this object.
	 */
	YCFIntMajorVersionBuff getMajorVersionBuff();

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
	 *	Get the required long attribute SubProjectId.
	 *
	 *	@return	The required long attribute SubProjectId.
	 */
	long getRequiredSubProjectId();

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
	 *	Get the required IYCFBamSubProjectObj instance referenced by the ParentSPrj key.
	 *
	 *	@return	The required IYCFBamSubProjectObj instance referenced by the ParentSPrj key.
	 */
	IYCFIntSubProjectObj getRequiredContainerParentSPrj();

	/**
	 *	Get the required IYCFIntSubProjectObj instance referenced by the ParentSPrj key.
	 *
	 *	@return	The required IYCFIntSubProjectObj instance referenced by the ParentSPrj key.
	 */
	IYCFIntSubProjectObj getRequiredContainerParentSPrj( boolean forceRead );

	/**
	 *	Get the array of optional IYCFIntMinorVersionObj array of instances referenced by the MinorVer key.
	 *
	 *	@return	The optional IYCFIntMinorVersionObj[] array of instances referenced by the MinorVer key.
	 */
	List<IYCFIntMinorVersionObj> getOptionalComponentsMinorVer();

	/**
	 *	Get the array of optional IYCFIntMinorVersionObj array of instances referenced by the MinorVer key.
	 *
	 *	@return	The optional IYCFIntMinorVersionObj[] array of instances referenced by the MinorVer key.
	 */
	List<IYCFIntMinorVersionObj> getOptionalComponentsMinorVer( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
