// Description: Java 11 Object interface for YCFGenKb DefClass.

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

public interface IYCFGenKbDefClassObj
	extends IYCFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a DefClass.
	 *
	 *	@return	YCFGenKbDefClassObj instance which should be subsequently referenced.
	 */
	IYCFGenKbDefClassObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbDefClassObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbDefClassObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IYCFGenKbDefClassObj the reference to the cached or read (realised) instance.
	 */
	IYCFGenKbDefClassObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this DefClass instance.
	 *
	 *	@return	The newly locked IYCFGenKbDefClassEditObj edition of this instance.
	 */
	IYCFGenKbDefClassEditObj beginEdit();

	/**
	 *	End this edition of this DefClass instance.
	 *
	 *	@throws	YCFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this DefClass instance.
	 *
	 *	@return	The IYCFGenKbDefClassEditObj edition of this instance.
	 */
	IYCFGenKbDefClassEditObj getEdit();

	/**
	 *	Get the current edition of this DefClass instance as a IYCFGenKbDefClassEditObj.
	 *
	 *	@return	The IYCFGenKbDefClassEditObj edition of this instance.
	 */
	IYCFGenKbDefClassEditObj getEditAsDefClass();

	/**
	 *	Get the IYCFGenKbDefClassTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbDefClassTableObj table cache which manages this instance.
	 */
	IYCFGenKbDefClassTableObj getDefClassTable();

	/**
	 *	Get the IYCFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IYCFGenKbSchemaObj schema cache which manages this instance.
	 */
	IYCFGenKbSchemaObj getSchema();

	/**
	 *	Get the YCFGenKbDefClassBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbDefClassBuff instance which currently backs this object.
	 */
	YCFGenKbDefClassBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( YCFGenKbDefClassBuff value );

	/**
	 *	Get the YCFGenKbDefClassBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbDefClassBuff instance which currently backs this object.
	 */
	YCFGenKbDefClassBuff getDefClassBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	YCFGenKbDefClassPKey primary key for this instance.
	 */
	YCFGenKbDefClassPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param YCFGenKbDefClassPKey primary key value for this instance.
	 */
	void setPKey( YCFGenKbDefClassPKey value );

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
	 *	Get the optional Short attribute BaseId.
	 *
	 *	@return	The optional Short attribute BaseId.
	 */
	Short getOptionalBaseId();

	/**
	 *	Get the optional IYCFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 *
	 *	@return	The optional IYCFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 */
	IYCFGenKbDefClassObj getOptionalParentBaseDefClass();

	/**
	 *	Get the optional IYCFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 *
	 *	@return	The optional IYCFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 */
	IYCFGenKbDefClassObj getOptionalParentBaseDefClass( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
