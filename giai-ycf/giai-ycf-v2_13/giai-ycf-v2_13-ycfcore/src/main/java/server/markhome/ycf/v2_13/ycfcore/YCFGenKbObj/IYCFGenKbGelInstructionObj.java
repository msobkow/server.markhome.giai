// Description: Java 11 Object interface for YCFGenKb GelInstruction.

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

public interface IYCFGenKbGelInstructionObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a GelInstruction.
	 *
	 *	@return	YCFGenKbGelInstructionObj instance which should be subsequently referenced.
	 */
	IYCFGenKbGelInstructionObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbGelInstructionObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbGelInstructionObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbGelInstructionObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbGelInstructionObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this GelInstruction instance.
	 *
	 *	@return	The newly locked IYCFGenKbGelInstructionEditObj edition of this instance.
	 */
	IYCFGenKbGelInstructionEditObj beginEdit();

	/**
	 *	End this edition of this GelInstruction instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this GelInstruction instance.
	 *
	 *	@return	The IYCFGenKbGelInstructionEditObj edition of this instance.
	 */
	IYCFGenKbGelInstructionEditObj getEdit();

	/**
	 *	Get the current edition of this GelInstruction instance as a IYCFGenKbGelInstructionEditObj.
	 *
	 *	@return	The IYCFGenKbGelInstructionEditObj edition of this instance.
	 */
	IYCFGenKbGelInstructionEditObj getEditAsGelInstruction();

	/**
	 *	Get the IYCFGenKbGelInstructionTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGelInstructionTableObj table cache which manages this instance.
	 */
	IYCFGenKbGelInstructionTableObj getGelInstructionTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbGelInstructionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelInstructionBuff instance which currently backs this object.
	 */
	YCFGenKbGelInstructionBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbGelInstructionBuff value );

	/**
	 *	Get the YCFGenKbGelInstructionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelInstructionBuff instance which currently backs this object.
	 */
	YCFGenKbGelInstructionBuff getGelInstructionBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbGelInstructionPKey primary key for this instance.
	 */
	YCFGenKbGelInstructionPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbGelInstructionPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbGelInstructionPKey value );

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
	 *	Get the required long attribute GelInstId.
	 *
	 *	@return	The required long attribute GelInstId.
	 */
	long getRequiredGelInstId();

	/**
	 *	Get the optional Long attribute ChainInstTenantId.
	 *
	 *	@return	The optional Long attribute ChainInstTenantId.
	 */
	Long getOptionalChainInstTenantId();

	/**
	 *	Get the optional Long attribute ChainInstGelCacheId.
	 *
	 *	@return	The optional Long attribute ChainInstGelCacheId.
	 */
	Long getOptionalChainInstGelCacheId();

	/**
	 *	Get the optional Long attribute ChainInstGelInstId.
	 *
	 *	@return	The optional Long attribute ChainInstGelInstId.
	 */
	Long getOptionalChainInstGelInstId();

	/**
	 *	Get the required String attribute SourceText.
	 *
	 *	@return	The required String attribute SourceText.
	 */
	String getRequiredSourceText();

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
	 *	Get the required IYCFGenKbGelCacheObj instance referenced by the GelCache key.
	 *
	 *	@return	The required IYCFGenKbGelCacheObj instance referenced by the GelCache key.
	 */
	IYCFGenKbGelCacheObj getRequiredContainerGelCache();

	/**
	 *	Get the required IYCFGenKbGelCacheObj instance referenced by the GelCache key.
	 *
	 *	@return	The required IYCFGenKbGelCacheObj instance referenced by the GelCache key.
	 */
	IYCFGenKbGelCacheObj getRequiredContainerGelCache( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 *
	 *	@return	The optional IYCFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 */
	IYCFGenKbGelInstructionObj getOptionalLookupChainInst();

	/**
	 *	Get the optional IYCFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 *
	 *	@return	The optional IYCFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 */
	IYCFGenKbGelInstructionObj getOptionalLookupChainInst( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

	public void linkChainInstruction( IYCFGenKbGelInstructionObj calledInstruction );
	public void addCalledInstruction( IYCFGenKbGelCacheObj gelCache, IYCFGenKbGelInstructionObj calledInstruction );
	public String expand( MssYCFGenContext genContext );
}
