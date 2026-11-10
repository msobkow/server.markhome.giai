// Description: Java 11 Object interface for YCFGenKb ToolSet.

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

public interface IYCFGenKbToolSetObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a ToolSet.
	 *
	 *	@return	YCFGenKbToolSetObj instance which should be subsequently referenced.
	 */
	IYCFGenKbToolSetObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbToolSetObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbToolSetObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbToolSetObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbToolSetObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ToolSet instance.
	 *
	 *	@return	The newly locked IYCFGenKbToolSetEditObj edition of this instance.
	 */
	IYCFGenKbToolSetEditObj beginEdit();

	/**
	 *	End this edition of this ToolSet instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ToolSet instance.
	 *
	 *	@return	The IYCFGenKbToolSetEditObj edition of this instance.
	 */
	IYCFGenKbToolSetEditObj getEdit();

	/**
	 *	Get the current edition of this ToolSet instance as a IYCFGenKbToolSetEditObj.
	 *
	 *	@return	The IYCFGenKbToolSetEditObj edition of this instance.
	 */
	IYCFGenKbToolSetEditObj getEditAsToolSet();

	/**
	 *	Get the IYCFGenKbToolSetTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbToolSetTableObj table cache which manages this instance.
	 */
	IYCFGenKbToolSetTableObj getToolSetTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbToolSetBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbToolSetBuff instance which currently backs this object.
	 */
	YCFGenKbToolSetBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbToolSetBuff value );

	/**
	 *	Get the YCFGenKbToolSetBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbToolSetBuff instance which currently backs this object.
	 */
	YCFGenKbToolSetBuff getToolSetBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbToolSetPKey primary key for this instance.
	 */
	YCFGenKbToolSetPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbToolSetPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbToolSetPKey value );

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
	 *	Get the required short attribute Id.
	 *
	 *	@return	The required short attribute Id.
	 */
	short getRequiredId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute Descr.
	 *
	 *	@return	The optional String attribute Descr.
	 */
	String getOptionalDescr();

	/**
	 *	Get the optional String attribute RevisionString.
	 *
	 *	@return	The optional String attribute RevisionString.
	 */
	String getOptionalRevisionString();

	/**
	 *	Get the required boolean attribute IsSupported.
	 *
	 *	@return	The required boolean attribute IsSupported.
	 */
	boolean getRequiredIsSupported();

	/**
	 *	Get the required boolean attribute Generate.
	 *
	 *	@return	The required boolean attribute Generate.
	 */
	boolean getRequiredGenerate();

	/**
	 *	Get the required short attribute ToolId0.
	 *
	 *	@return	The required short attribute ToolId0.
	 */
	short getRequiredToolId0();

	/**
	 *	Get the optional Short attribute ToolId1.
	 *
	 *	@return	The optional Short attribute ToolId1.
	 */
	Short getOptionalToolId1();

	/**
	 *	Get the optional Short attribute ToolId2.
	 *
	 *	@return	The optional Short attribute ToolId2.
	 */
	Short getOptionalToolId2();

	/**
	 *	Get the optional Short attribute ToolId3.
	 *
	 *	@return	The optional Short attribute ToolId3.
	 */
	Short getOptionalToolId3();

	/**
	 *	Get the optional Short attribute ToolId4.
	 *
	 *	@return	The optional Short attribute ToolId4.
	 */
	Short getOptionalToolId4();

	/**
	 *	Get the optional Short attribute ToolId5.
	 *
	 *	@return	The optional Short attribute ToolId5.
	 */
	Short getOptionalToolId5();

	/**
	 *	Get the optional Short attribute ToolId6.
	 *
	 *	@return	The optional Short attribute ToolId6.
	 */
	Short getOptionalToolId6();

	/**
	 *	Get the optional Short attribute ToolId7.
	 *
	 *	@return	The optional Short attribute ToolId7.
	 */
	Short getOptionalToolId7();

	/**
	 *	Get the required IYCFGenKbToolObj instance referenced by the Tool0 key.
	 *
	 *	@return	The required IYCFGenKbToolObj instance referenced by the Tool0 key.
	 */
	IYCFGenKbToolObj getRequiredLookupTool0();

	/**
	 *	Get the required IYCFGenKbToolObj instance referenced by the Tool0 key.
	 *
	 *	@return	The required IYCFGenKbToolObj instance referenced by the Tool0 key.
	 */
	IYCFGenKbToolObj getRequiredLookupTool0( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool1 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool1 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool1();

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool1 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool1 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool1( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool2 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool2 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool2();

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool2 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool2 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool2( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool3 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool3 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool3();

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool3 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool3 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool3( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool4 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool4 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool4();

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool4 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool4 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool4( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool5 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool5 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool5();

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool5 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool5 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool5( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool6 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool6 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool6();

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool6 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool6 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool6( boolean forceRead );

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool7 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool7 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool7();

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Tool7 key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Tool7 key.
	 */
	IYCFGenKbToolObj getOptionalLookupTool7( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
