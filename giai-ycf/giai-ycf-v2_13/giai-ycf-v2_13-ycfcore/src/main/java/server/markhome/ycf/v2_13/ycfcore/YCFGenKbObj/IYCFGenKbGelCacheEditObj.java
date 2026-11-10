// Description: Java 11 Instance Edit Object interface for YCFGenKb GelCache.

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
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFEngine;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGenContext;

public interface IYCFGenKbGelCacheEditObj
	extends IYCFGenKbGelCacheObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFGenKbGelCacheObj.
	 */
	IYCFGenKbGelCacheObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFGenKbGelCacheObj.
	 */
	IYCFGenKbGelCacheObj getOrigAsGelCache();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFGenKbGelCacheObj create();

	/*
	 *	Update the instance.
	 */
	YCFGenKbGelCacheEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFGenKbGelCacheEditObj deleteInstance();

	/**
	 *	Get the required String attribute CacheName.
	 *
	 *	@return	The String value of the attribute CacheName.
	 */
	String getRequiredCacheName();

	/**
	 *	Set the required String attribute CacheName.
	 *
	 *	@param	value	the String value of the attribute CacheName.
	 */
	void setRequiredCacheName( String value );

	/**
	 *	Get the IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the IYCFGenKbTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( IYCFGenKbTenantObj value );
}
