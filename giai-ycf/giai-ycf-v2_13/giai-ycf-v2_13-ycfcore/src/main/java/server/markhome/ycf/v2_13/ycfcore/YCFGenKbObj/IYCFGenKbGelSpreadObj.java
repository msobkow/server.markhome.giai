// Description: Java 11 Object interface for CFGenKb GelSpread.

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
import org.msscf.msscf.v2_13.cfcore.MssCF.*;

public interface ICFGenKbGelSpreadObj
	extends ICFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelSpread instance as a ICFGenKbGelSpreadEditObj.
	 *
	 *	@return	The ICFGenKbGelSpreadEditObj edition of this instance.
	 */
	ICFGenKbGelSpreadEditObj getEditAsGelSpread();

	/**
	 *	Get the ICFGenKbGelSpreadTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelSpreadTableObj table cache which manages this instance.
	 */
	ICFGenKbGelSpreadTableObj getGelSpreadTable();

	/**
	 *	Get the CFGenKbGelSpreadBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelSpreadBuff instance which currently backs this object.
	 */
	CFGenKbGelSpreadBuff getGelSpreadBuff();

	/**
	 *	Get the required String attribute IteratorName.
	 *
	 *	@return	The required String attribute IteratorName.
	 */
	String getRequiredIteratorName();

	/**
	 *	Get the optional String attribute ExpandBetween.
	 *
	 *	@return	The optional String attribute ExpandBetween.
	 */
	String getOptionalExpandBetween();

	/**
	 *	Get the optional String attribute ExpandBefore.
	 *
	 *	@return	The optional String attribute ExpandBefore.
	 */
	String getOptionalExpandBefore();

	/**
	 *	Get the optional String attribute ExpandFirst.
	 *
	 *	@return	The optional String attribute ExpandFirst.
	 */
	String getOptionalExpandFirst();

	/**
	 *	Get the required String attribute ExpandEach.
	 *
	 *	@return	The required String attribute ExpandEach.
	 */
	String getRequiredExpandEach();

	/**
	 *	Get the optional String attribute ExpandLast.
	 *
	 *	@return	The optional String attribute ExpandLast.
	 */
	String getOptionalExpandLast();

	/**
	 *	Get the optional String attribute ExpandLone.
	 *
	 *	@return	The optional String attribute ExpandLone.
	 */
	String getOptionalExpandLone();

	/**
	 *	Get the optional String attribute ExpandEmpty.
	 *
	 *	@return	The optional String attribute ExpandEmpty.
	 */
	String getOptionalExpandEmpty();

	/**
	 *	Get the optional String attribute ExpandAfter.
	 *
	 *	@return	The optional String attribute ExpandAfter.
	 */
	String getOptionalExpandAfter();

}
