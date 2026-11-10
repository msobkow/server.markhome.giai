// Description: Java 11 Object interface for YCFInt License.

/*
 *	org.mssycf.mssycf.YCFInt
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

public interface IYCFIntLicenseObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a License.
	 *
	 *	@return	YCFIntLicenseObj instance which should be subsequently referenced.
	 */
	IYCFIntLicenseObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFIntLicenseObj the reference to the cached or read (realised) instance.
	 */
	IYCFIntLicenseObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFIntLicenseObj the reference to the cached or read (realised) instance.
	 */
	IYCFIntLicenseObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this License instance.
	 *
	 *	@return	The newly locked IYCFIntLicenseEditObj edition of this instance.
	 */
	IYCFIntLicenseEditObj beginEdit();

	/**
	 *	End this edition of this License instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this License instance.
	 *
	 *	@return	The IYCFIntLicenseEditObj edition of this instance.
	 */
	IYCFIntLicenseEditObj getEdit();

	/**
	 *	Get the current edition of this License instance as a IYCFIntLicenseEditObj.
	 *
	 *	@return	The IYCFIntLicenseEditObj edition of this instance.
	 */
	IYCFIntLicenseEditObj getEditAsLicense();

	/**
	 *	Get the IYCFIntLicenseTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFIntLicenseTableObj table cache which manages this instance.
	 */
	IYCFIntLicenseTableObj getLicenseTable();

	/**
	 *	Get the IYCFIntSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFIntSchemaObj schema cache which manages this instance.
	 */
	IYCFIntSchemaObj getSchema();

	/**
	 *	Get the YCFIntLicenseBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFIntLicenseBuff instance which currently backs this object.
	 */
	YCFIntLicenseBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFIntLicenseBuff value );

	/**
	 *	Get the YCFIntLicenseBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFIntLicenseBuff instance which currently backs this object.
	 */
	YCFIntLicenseBuff getLicenseBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFIntLicensePKey primary key for this instance.
	 */
	YCFIntLicensePKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFIntLicensePKey primary key value for this instance.
	 */
	void setPKey( YCFIntLicensePKey value );

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
	 *	Get the optional String attribute EmbeddedText.
	 *
	 *	@return	The optional String attribute EmbeddedText.
	 */
	String getOptionalEmbeddedText();

	/**
	 *	Get the optional String attribute FullText.
	 *
	 *	@return	The optional String attribute FullText.
	 */
	String getOptionalFullText();

	/**
	 *	Get the required IYCFIntTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFIntTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFSecTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required IYCFIntTopDomainObj instance referenced by the TopDomain key.
	 *
	 *	@return	The required IYCFIntTopDomainObj instance referenced by the TopDomain key.
	 */
	IYCFIntTopDomainObj getRequiredContainerTopDomain();

	/**
	 *	Get the required IYCFIntTopDomainObj instance referenced by the TopDomain key.
	 *
	 *	@return	The required IYCFIntTopDomainObj instance referenced by the TopDomain key.
	 */
	IYCFIntTopDomainObj getRequiredContainerTopDomain( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
