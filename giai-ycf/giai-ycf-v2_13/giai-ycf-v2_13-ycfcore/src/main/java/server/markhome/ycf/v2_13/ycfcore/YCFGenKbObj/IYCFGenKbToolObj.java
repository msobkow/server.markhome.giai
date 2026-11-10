// Description: Java 11 Object interface for YCFGenKb Tool.

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

public interface IYCFGenKbToolObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a Tool.
	 *
	 *	@return	YCFGenKbToolObj instance which should be subsequently referenced.
	 */
	IYCFGenKbToolObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbToolObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbToolObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbToolObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbToolObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Tool instance.
	 *
	 *	@return	The newly locked IYCFGenKbToolEditObj edition of this instance.
	 */
	IYCFGenKbToolEditObj beginEdit();

	/**
	 *	End this edition of this Tool instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Tool instance.
	 *
	 *	@return	The IYCFGenKbToolEditObj edition of this instance.
	 */
	IYCFGenKbToolEditObj getEdit();

	/**
	 *	Get the current edition of this Tool instance as a IYCFGenKbToolEditObj.
	 *
	 *	@return	The IYCFGenKbToolEditObj edition of this instance.
	 */
	IYCFGenKbToolEditObj getEditAsTool();

	/**
	 *	Get the IYCFGenKbToolTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbToolTableObj table cache which manages this instance.
	 */
	IYCFGenKbToolTableObj getToolTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbToolBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbToolBuff instance which currently backs this object.
	 */
	YCFGenKbToolBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbToolBuff value );

	/**
	 *	Get the YCFGenKbToolBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbToolBuff instance which currently backs this object.
	 */
	YCFGenKbToolBuff getToolBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbToolPKey primary key for this instance.
	 */
	YCFGenKbToolPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbToolPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbToolPKey value );

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
	 *	Get the optional Short attribute ReplacesId.
	 *
	 *	@return	The optional Short attribute ReplacesId.
	 */
	Short getOptionalReplacesId();

	/**
	 *	Get the required boolean attribute IsSupported.
	 *
	 *	@return	The required boolean attribute IsSupported.
	 */
	boolean getRequiredIsSupported();

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Replaces key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Replaces key.
	 */
	IYCFGenKbToolObj getOptionalLookupReplaces();

	/**
	 *	Get the optional IYCFGenKbToolObj instance referenced by the Replaces key.
	 *
	 *	@return	The optional IYCFGenKbToolObj instance referenced by the Replaces key.
	 */
	IYCFGenKbToolObj getOptionalLookupReplaces( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
