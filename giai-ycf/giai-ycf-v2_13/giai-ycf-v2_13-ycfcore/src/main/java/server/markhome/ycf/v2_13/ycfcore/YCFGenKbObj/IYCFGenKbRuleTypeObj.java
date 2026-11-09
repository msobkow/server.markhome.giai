// Description: Java 11 Object interface for CFGenKb RuleType.

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

public interface ICFGenKbRuleTypeObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a RuleType.
	 *
	 *	@return	CFGenKbRuleTypeObj instance which should be subsequently referenced.
	 */
	ICFGenKbRuleTypeObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbRuleTypeObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbRuleTypeObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbRuleTypeObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbRuleTypeObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this RuleType instance.
	 *
	 *	@return	The newly locked ICFGenKbRuleTypeEditObj edition of this instance.
	 */
	ICFGenKbRuleTypeEditObj beginEdit();

	/**
	 *	End this edition of this RuleType instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this RuleType instance.
	 *
	 *	@return	The ICFGenKbRuleTypeEditObj edition of this instance.
	 */
	ICFGenKbRuleTypeEditObj getEdit();

	/**
	 *	Get the current edition of this RuleType instance as a ICFGenKbRuleTypeEditObj.
	 *
	 *	@return	The ICFGenKbRuleTypeEditObj edition of this instance.
	 */
	ICFGenKbRuleTypeEditObj getEditAsRuleType();

	/**
	 *	Get the ICFGenKbRuleTypeTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbRuleTypeTableObj table cache which manages this instance.
	 */
	ICFGenKbRuleTypeTableObj getRuleTypeTable();

	/**
	 *	Get the ICFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFGenKbSchemaObj schema cache which manages this instance.
	 */
	ICFGenKbSchemaObj getSchema();

	/**
	 *	Get the CFGenKbRuleTypeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbRuleTypeBuff instance which currently backs this object.
	 */
	CFGenKbRuleTypeBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFGenKbRuleTypeBuff value );

	/**
	 *	Get the CFGenKbRuleTypeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbRuleTypeBuff instance which currently backs this object.
	 */
	CFGenKbRuleTypeBuff getRuleTypeBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFGenKbRuleTypePKey primary key for this instance.
	 */
	CFGenKbRuleTypePKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFGenKbRuleTypePKey primary key value for this instance.
	 */
	void setPKey( CFGenKbRuleTypePKey value );

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
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
