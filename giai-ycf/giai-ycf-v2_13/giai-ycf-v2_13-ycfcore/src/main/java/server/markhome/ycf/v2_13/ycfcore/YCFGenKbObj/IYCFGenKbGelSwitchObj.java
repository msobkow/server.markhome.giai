// Description: Java 11 Object interface for YCFGenKb GelSwitch.

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
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;

public interface IYCFGenKbGelSwitchObj
	extends IYCFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelSwitch instance as a IYCFGenKbGelSwitchEditObj.
	 *
	 *	@return	The IYCFGenKbGelSwitchEditObj edition of this instance.
	 */
	IYCFGenKbGelSwitchEditObj getEditAsGelSwitch();

	/**
	 *	Get the IYCFGenKbGelSwitchTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGelSwitchTableObj table cache which manages this instance.
	 */
	IYCFGenKbGelSwitchTableObj getGelSwitchTable();

	/**
	 *	Get the YCFGenKbGelSwitchBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelSwitchBuff instance which currently backs this object.
	 */
	YCFGenKbGelSwitchBuff getGelSwitchBuff();

	/**
	 *	Get the required String attribute ValueExpansion.
	 *
	 *	@return	The required String attribute ValueExpansion.
	 */
	String getRequiredValueExpansion();

	/**
	 *	Get the optional String attribute NilExpansion.
	 *
	 *	@return	The optional String attribute NilExpansion.
	 */
	String getOptionalNilExpansion();

	/**
	 *	Get the optional String attribute EmptyExpansion.
	 *
	 *	@return	The optional String attribute EmptyExpansion.
	 */
	String getOptionalEmptyExpansion();

	/**
	 *	Get the required String attribute DefaultExpansion.
	 *
	 *	@return	The required String attribute DefaultExpansion.
	 */
	String getRequiredDefaultExpansion();

	/**
	 *	Get the array of optional IYCFGenKbGelSwitchLimbObj array of instances referenced by the SwitchLimb key.
	 *
	 *	@return	The optional IYCFGenKbGelSwitchLimbObj[] array of instances referenced by the SwitchLimb key.
	 */
	List<IYCFGenKbGelSwitchLimbObj> getOptionalChildrenSwitchLimb();

	/**
	 *	Get the array of optional IYCFGenKbGelSwitchLimbObj array of instances referenced by the SwitchLimb key.
	 *
	 *	@return	The optional IYCFGenKbGelSwitchLimbObj[] array of instances referenced by the SwitchLimb key.
	 */
	List<IYCFGenKbGelSwitchLimbObj> getOptionalChildrenSwitchLimb( boolean forceRead );

}
