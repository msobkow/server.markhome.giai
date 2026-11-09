// Description: Java 11 Object interface for CFGenKb GelExpansion.

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

public interface ICFGenKbGelExpansionObj
	extends ICFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelExpansion instance as a ICFGenKbGelExpansionEditObj.
	 *
	 *	@return	The ICFGenKbGelExpansionEditObj edition of this instance.
	 */
	ICFGenKbGelExpansionEditObj getEditAsGelExpansion();

	/**
	 *	Get the ICFGenKbGelExpansionTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelExpansionTableObj table cache which manages this instance.
	 */
	ICFGenKbGelExpansionTableObj getGelExpansionTable();

	/**
	 *	Get the CFGenKbGelExpansionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelExpansionBuff instance which currently backs this object.
	 */
	CFGenKbGelExpansionBuff getGelExpansionBuff();

	/**
	 *	Get the required String attribute MacroName.
	 *
	 *	@return	The required String attribute MacroName.
	 */
	String getRequiredMacroName();

}
