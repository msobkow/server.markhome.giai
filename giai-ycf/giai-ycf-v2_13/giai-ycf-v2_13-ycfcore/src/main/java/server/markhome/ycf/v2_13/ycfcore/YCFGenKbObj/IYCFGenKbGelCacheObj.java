// Description: Java 11 Object interface for YCFGenKb GelCache.

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
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFEngine;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGenContext;

public interface IYCFGenKbGelCacheObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a GelCache.
	 *
	 *	@return	YCFGenKbGelCacheObj instance which should be subsequently referenced.
	 */
	IYCFGenKbGelCacheObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbGelCacheObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbGelCacheObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbGelCacheObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbGelCacheObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this GelCache instance.
	 *
	 *	@return	The newly locked IYCFGenKbGelCacheEditObj edition of this instance.
	 */
	IYCFGenKbGelCacheEditObj beginEdit();

	/**
	 *	End this edition of this GelCache instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this GelCache instance.
	 *
	 *	@return	The IYCFGenKbGelCacheEditObj edition of this instance.
	 */
	IYCFGenKbGelCacheEditObj getEdit();

	/**
	 *	Get the current edition of this GelCache instance as a IYCFGenKbGelCacheEditObj.
	 *
	 *	@return	The IYCFGenKbGelCacheEditObj edition of this instance.
	 */
	IYCFGenKbGelCacheEditObj getEditAsGelCache();

	/**
	 *	Get the IYCFGenKbGelCacheTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGelCacheTableObj table cache which manages this instance.
	 */
	IYCFGenKbGelCacheTableObj getGelCacheTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbGelCacheBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelCacheBuff instance which currently backs this object.
	 */
	YCFGenKbGelCacheBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbGelCacheBuff value );

	/**
	 *	Get the YCFGenKbGelCacheBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelCacheBuff instance which currently backs this object.
	 */
	YCFGenKbGelCacheBuff getGelCacheBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbGelCachePKey primary key for this instance.
	 */
	YCFGenKbGelCachePKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbGelCachePKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbGelCachePKey value );

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
	 *	Get the required long attribute GelCacheId.
	 *
	 *	@return	The required long attribute GelCacheId.
	 */
	long getRequiredGelCacheId();

	/**
	 *	Get the required String attribute CacheName.
	 *
	 *	@return	The required String attribute CacheName.
	 */
	String getRequiredCacheName();

	/**
	 *	Get the required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IYCFGenKbTenantObj instance referenced by the Tenant key.
	 */
	IYCFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

	public IYCFGenKbGelInstructionObj lookupMacro( String macroBody );
	public IYCFGenKbGelInstructionObj rememberMacro( String macroBody, IYCFGenKbGelInstructionObj gel );
	public IYCFGenKbGelExecutableObj lookupExecutable( String execName );
	public IYCFGenKbGelExecutableObj rememberExecutable( String execName, IYCFGenKbGelExecutableObj gel );
}
