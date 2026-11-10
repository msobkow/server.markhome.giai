// Description: Java 11 Instance Edit Object interface for YCFGenKb GelInstruction.

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

public interface IYCFGenKbGelInstructionEditObj
	extends IYCFGenKbGelInstructionObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFGenKbGelInstructionObj.
	 */
	IYCFGenKbGelInstructionObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFGenKbGelInstructionObj.
	 */
	IYCFGenKbGelInstructionObj getOrigAsGelInstruction();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFGenKbGelInstructionObj create();

	/*
	 *	Update the instance.
	 */
	YCFGenKbGelInstructionEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFGenKbGelInstructionEditObj deleteInstance();

	/**
	 *	Get the required String attribute SourceText.
	 *
	 *	@return	The String value of the attribute SourceText.
	 */
	String getRequiredSourceText();

	/**
	 *	Set the required String attribute SourceText.
	 *
	 *	@param	value	the String value of the attribute SourceText.
	 */
	void setRequiredSourceText( String value );

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

	/**
	 *	Get the IYCFGenKbGelCacheObj instance referenced by the GelCache key.
	 *
	 *	@return	The IYCFGenKbGelCacheObj instance referenced by the GelCache key.
	 */
	IYCFGenKbGelCacheObj getRequiredContainerGelCache();

	/**
	 *	Set the IYCFGenKbGelCacheObj instance referenced by the GelCache key.
	 *
	 *	@param	value	the IYCFGenKbGelCacheObj instance to be referenced by the GelCache key.
	 */
	void setRequiredContainerGelCache( IYCFGenKbGelCacheObj value );

	/**
	 *	Get the IYCFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 *
	 *	@return	The IYCFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 */
	IYCFGenKbGelInstructionObj getOptionalLookupChainInst();

	/**
	 *	Set the IYCFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 *
	 *	@param	value	the IYCFGenKbGelInstructionObj instance to be referenced by the ChainInst key.
	 */
	void setOptionalLookupChainInst( IYCFGenKbGelInstructionObj value );
}
