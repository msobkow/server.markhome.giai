// Description: Java 11 Object interface for YCFGenKb GelModifier.

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

public interface IYCFGenKbGelModifierObj
	extends IYCFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelModifier instance as a IYCFGenKbGelModifierEditObj.
	 *
	 *	@return	The IYCFGenKbGelModifierEditObj edition of this instance.
	 */
	IYCFGenKbGelModifierEditObj getEditAsGelModifier();

	/**
	 *	Get the IYCFGenKbGelModifierTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGelModifierTableObj table cache which manages this instance.
	 */
	IYCFGenKbGelModifierTableObj getGelModifierTable();

	/**
	 *	Get the YCFGenKbGelModifierBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelModifierBuff instance which currently backs this object.
	 */
	YCFGenKbGelModifierBuff getGelModifierBuff();

	/**
	 *	Get the optional Long attribute RemainderTenantId.
	 *
	 *	@return	The optional Long attribute RemainderTenantId.
	 */
	Long getOptionalRemainderTenantId();

	/**
	 *	Get the required long attribute RemainderGelCacheId.
	 *
	 *	@return	The required long attribute RemainderGelCacheId.
	 */
	long getRequiredRemainderGelCacheId();

	/**
	 *	Get the optional Long attribute RemainderInstId.
	 *
	 *	@return	The optional Long attribute RemainderInstId.
	 */
	Long getOptionalRemainderInstId();

	/**
	 *	Get the optional IYCFGenKbGelInstructionObj instance referenced by the Remainder key.
	 *
	 *	@return	The optional IYCFGenKbGelInstructionObj instance referenced by the Remainder key.
	 */
	IYCFGenKbGelInstructionObj getOptionalLookupRemainder();

	/**
	 *	Get the optional IYCFGenKbGelInstructionObj instance referenced by the Remainder key.
	 *
	 *	@return	The optional IYCFGenKbGelInstructionObj instance referenced by the Remainder key.
	 */
	IYCFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead );

}
