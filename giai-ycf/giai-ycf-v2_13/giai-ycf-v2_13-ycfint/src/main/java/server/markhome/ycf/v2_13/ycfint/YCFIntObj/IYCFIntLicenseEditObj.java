// Description: Java 11 Instance Edit Object interface for YCFInt License.

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
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFIntLicenseEditObj
	extends IYCFIntLicenseObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFIntLicenseObj.
	 */
	IYCFIntLicenseObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFIntLicenseObj.
	 */
	IYCFIntLicenseObj getOrigAsLicense();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFIntLicenseObj create();

	/*
	 *	Update the instance.
	 */
	YCFIntLicenseEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFIntLicenseEditObj deleteInstance();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The String value of the attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param	value	the String value of the attribute Name.
	 */
	void setRequiredName( String value );

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The String value of the attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Set the optional String attribute Description.
	 *
	 *	@param	value	the String value of the attribute Description.
	 */
	void setOptionalDescription( String value );

	/**
	 *	Get the optional String attribute EmbeddedText.
	 *
	 *	@return	The String value of the attribute EmbeddedText.
	 */
	String getOptionalEmbeddedText();

	/**
	 *	Set the optional String attribute EmbeddedText.
	 *
	 *	@param	value	the String value of the attribute EmbeddedText.
	 */
	void setOptionalEmbeddedText( String value );

	/**
	 *	Get the optional String attribute FullText.
	 *
	 *	@return	The String value of the attribute FullText.
	 */
	String getOptionalFullText();

	/**
	 *	Set the optional String attribute FullText.
	 *
	 *	@param	value	the String value of the attribute FullText.
	 */
	void setOptionalFullText( String value );

	/**
	 *	Get the IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The IYCFSecTenantObj instance referenced by the Tenant key.
	 */
	IYCFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the IYCFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the IYCFSecTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( IYCFSecTenantObj value );

	/**
	 *	Get the IYCFIntTopDomainObj instance referenced by the TopDomain key.
	 *
	 *	@return	The IYCFIntTopDomainObj instance referenced by the TopDomain key.
	 */
	IYCFIntTopDomainObj getRequiredContainerTopDomain();

	/**
	 *	Set the IYCFIntTopDomainObj instance referenced by the TopDomain key.
	 *
	 *	@param	value	the IYCFIntTopDomainObj instance to be referenced by the TopDomain key.
	 */
	void setRequiredContainerTopDomain( IYCFIntTopDomainObj value );
}
