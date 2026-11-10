// Description: Java 11 Object interface for YCFGenKb GelSequence.

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

public interface IYCFGenKbGelSequenceObj
	extends IYCFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelSequence instance as a IYCFGenKbGelSequenceEditObj.
	 *
	 *	@return	The IYCFGenKbGelSequenceEditObj edition of this instance.
	 */
	IYCFGenKbGelSequenceEditObj getEditAsGelSequence();

	/**
	 *	Get the IYCFGenKbGelSequenceTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGelSequenceTableObj table cache which manages this instance.
	 */
	IYCFGenKbGelSequenceTableObj getGelSequenceTable();

	/**
	 *	Get the YCFGenKbGelSequenceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelSequenceBuff instance which currently backs this object.
	 */
	YCFGenKbGelSequenceBuff getGelSequenceBuff();

	/**
	 *	Get the optional Long attribute FirstInstTenantId.
	 *
	 *	@return	The optional Long attribute FirstInstTenantId.
	 */
	Long getOptionalFirstInstTenantId();

	/**
	 *	Get the optional Long attribute FirstInstGelCacheId.
	 *
	 *	@return	The optional Long attribute FirstInstGelCacheId.
	 */
	Long getOptionalFirstInstGelCacheId();

	/**
	 *	Get the optional Long attribute FirstInstId.
	 *
	 *	@return	The optional Long attribute FirstInstId.
	 */
	Long getOptionalFirstInstId();

	/**
	 *	Get the optional Long attribute LastInstTenantId.
	 *
	 *	@return	The optional Long attribute LastInstTenantId.
	 */
	Long getOptionalLastInstTenantId();

	/**
	 *	Get the optional Long attribute LastInstGelCacheId.
	 *
	 *	@return	The optional Long attribute LastInstGelCacheId.
	 */
	Long getOptionalLastInstGelCacheId();

	/**
	 *	Get the optional Long attribute LastInstId.
	 *
	 *	@return	The optional Long attribute LastInstId.
	 */
	Long getOptionalLastInstId();

	/**
	 *	Get the array of optional IYCFGenKbGelCallObj array of instances referenced by the Calls key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj[] array of instances referenced by the Calls key.
	 */
	List<IYCFGenKbGelCallObj> getOptionalChildrenCalls();

	/**
	 *	Get the array of optional IYCFGenKbGelCallObj array of instances referenced by the Calls key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj[] array of instances referenced by the Calls key.
	 */
	List<IYCFGenKbGelCallObj> getOptionalChildrenCalls( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelCallObj instance referenced by the FirstInst key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj instance referenced by the FirstInst key.
	 */
	IYCFGenKbGelCallObj getOptionalLookupFirstInst();

	/**
	 *	Get the optional IYCFGenKbGelCallObj instance referenced by the FirstInst key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj instance referenced by the FirstInst key.
	 */
	IYCFGenKbGelCallObj getOptionalLookupFirstInst( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelCallObj instance referenced by the LastInst key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj instance referenced by the LastInst key.
	 */
	IYCFGenKbGelCallObj getOptionalLookupLastInst();

	/**
	 *	Get the optional IYCFGenKbGelCallObj instance referenced by the LastInst key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj instance referenced by the LastInst key.
	 */
	IYCFGenKbGelCallObj getOptionalLookupLastInst( boolean forceRead );

}
