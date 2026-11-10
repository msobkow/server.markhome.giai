// Description: Java 11 Object interface for YCFGenKb GelCall.

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

public interface IYCFGenKbGelCallObj
	extends IYCFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelCall instance as a IYCFGenKbGelCallEditObj.
	 *
	 *	@return	The IYCFGenKbGelCallEditObj edition of this instance.
	 */
	IYCFGenKbGelCallEditObj getEditAsGelCall();

	/**
	 *	Get the IYCFGenKbGelCallTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGelCallTableObj table cache which manages this instance.
	 */
	IYCFGenKbGelCallTableObj getGelCallTable();

	/**
	 *	Get the YCFGenKbGelCallBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelCallBuff instance which currently backs this object.
	 */
	YCFGenKbGelCallBuff getGelCallBuff();

	/**
	 *	Get the optional Long attribute SeqInstTenantId.
	 *
	 *	@return	The optional Long attribute SeqInstTenantId.
	 */
	Long getOptionalSeqInstTenantId();

	/**
	 *	Get the optional Long attribute SeqInstGelCacheId.
	 *
	 *	@return	The optional Long attribute SeqInstGelCacheId.
	 */
	Long getOptionalSeqInstGelCacheId();

	/**
	 *	Get the optional Long attribute SeqInstId.
	 *
	 *	@return	The optional Long attribute SeqInstId.
	 */
	Long getOptionalSeqInstId();

	/**
	 *	Get the optional Long attribute CallInstTenantId.
	 *
	 *	@return	The optional Long attribute CallInstTenantId.
	 */
	Long getOptionalCallInstTenantId();

	/**
	 *	Get the optional Long attribute CallInstGelCacheId.
	 *
	 *	@return	The optional Long attribute CallInstGelCacheId.
	 */
	Long getOptionalCallInstGelCacheId();

	/**
	 *	Get the optional Long attribute CallInstId.
	 *
	 *	@return	The optional Long attribute CallInstId.
	 */
	Long getOptionalCallInstId();

	/**
	 *	Get the optional Long attribute PrevInstTenantId.
	 *
	 *	@return	The optional Long attribute PrevInstTenantId.
	 */
	Long getOptionalPrevInstTenantId();

	/**
	 *	Get the optional Long attribute PrevInstGelCacheId.
	 *
	 *	@return	The optional Long attribute PrevInstGelCacheId.
	 */
	Long getOptionalPrevInstGelCacheId();

	/**
	 *	Get the optional Long attribute PrevInstGelInstId.
	 *
	 *	@return	The optional Long attribute PrevInstGelInstId.
	 */
	Long getOptionalPrevInstGelInstId();

	/**
	 *	Get the optional Long attribute NextInstTenantId.
	 *
	 *	@return	The optional Long attribute NextInstTenantId.
	 */
	Long getOptionalNextInstTenantId();

	/**
	 *	Get the optional Long attribute NextInstGelCacheId.
	 *
	 *	@return	The optional Long attribute NextInstGelCacheId.
	 */
	Long getOptionalNextInstGelCacheId();

	/**
	 *	Get the optional Long attribute NextInstGelInstId.
	 *
	 *	@return	The optional Long attribute NextInstGelInstId.
	 */
	Long getOptionalNextInstGelInstId();

	/**
	 *	Get the optional IYCFGenKbGelSequenceObj instance referenced by the SeqInst key.
	 *
	 *	@return	The optional IYCFGenKbGelSequenceObj instance referenced by the SeqInst key.
	 */
	IYCFGenKbGelSequenceObj getOptionalParentSeqInst();

	/**
	 *	Get the optional IYCFGenKbGelSequenceObj instance referenced by the SeqInst key.
	 *
	 *	@return	The optional IYCFGenKbGelSequenceObj instance referenced by the SeqInst key.
	 */
	IYCFGenKbGelSequenceObj getOptionalParentSeqInst( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelInstructionObj instance referenced by the CallInst key.
	 *
	 *	@return	The optional IYCFGenKbGelInstructionObj instance referenced by the CallInst key.
	 */
	IYCFGenKbGelInstructionObj getOptionalLookupCallInst();

	/**
	 *	Get the optional IYCFGenKbGelInstructionObj instance referenced by the CallInst key.
	 *
	 *	@return	The optional IYCFGenKbGelInstructionObj instance referenced by the CallInst key.
	 */
	IYCFGenKbGelInstructionObj getOptionalLookupCallInst( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelCallObj instance referenced by the PrevInst key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj instance referenced by the PrevInst key.
	 */
	IYCFGenKbGelCallObj getOptionalLookupPrevInst();

	/**
	 *	Get the optional IYCFGenKbGelCallObj instance referenced by the PrevInst key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj instance referenced by the PrevInst key.
	 */
	IYCFGenKbGelCallObj getOptionalLookupPrevInst( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbGelCallObj instance referenced by the NextInst key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj instance referenced by the NextInst key.
	 */
	IYCFGenKbGelCallObj getOptionalLookupNextInst();

	/**
	 *	Get the optional IYCFGenKbGelCallObj instance referenced by the NextInst key.
	 *
	 *	@return	The optional IYCFGenKbGelCallObj instance referenced by the NextInst key.
	 */
	IYCFGenKbGelCallObj getOptionalLookupNextInst( boolean forceRead );

}
