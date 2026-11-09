// Description: Java 11 Object interface for CFGenKb DefClass.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbDefClassObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a DefClass.
	 *
	 *	@return	CFGenKbDefClassObj instance which should be subsequently referenced.
	 */
	ICFGenKbDefClassObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbDefClassObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbDefClassObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbDefClassObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbDefClassObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this DefClass instance.
	 *
	 *	@return	The newly locked ICFGenKbDefClassEditObj edition of this instance.
	 */
	ICFGenKbDefClassEditObj beginEdit();

	/**
	 *	End this edition of this DefClass instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this DefClass instance.
	 *
	 *	@return	The ICFGenKbDefClassEditObj edition of this instance.
	 */
	ICFGenKbDefClassEditObj getEdit();

	/**
	 *	Get the current edition of this DefClass instance as a ICFGenKbDefClassEditObj.
	 *
	 *	@return	The ICFGenKbDefClassEditObj edition of this instance.
	 */
	ICFGenKbDefClassEditObj getEditAsDefClass();

	/**
	 *	Get the ICFGenKbDefClassTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbDefClassTableObj table cache which manages this instance.
	 */
	ICFGenKbDefClassTableObj getDefClassTable();

	/**
	 *	Get the ICFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFGenKbSchemaObj schema cache which manages this instance.
	 */
	ICFGenKbSchemaObj getSchema();

	/**
	 *	Get the CFGenKbDefClassBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbDefClassBuff instance which currently backs this object.
	 */
	CFGenKbDefClassBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFGenKbDefClassBuff value );

	/**
	 *	Get the CFGenKbDefClassBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbDefClassBuff instance which currently backs this object.
	 */
	CFGenKbDefClassBuff getDefClassBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFGenKbDefClassPKey primary key for this instance.
	 */
	CFGenKbDefClassPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFGenKbDefClassPKey primary key value for this instance.
	 */
	void setPKey( CFGenKbDefClassPKey value );

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
	 *	Get the optional ICFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 *
	 *	@return	The optional ICFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 */
	ICFGenKbDefClassObj getOptionalParentBaseDefClass();

	/**
	 *	Get the optional ICFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 *
	 *	@return	The optional ICFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 */
	ICFGenKbDefClassObj getOptionalParentBaseDefClass( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
