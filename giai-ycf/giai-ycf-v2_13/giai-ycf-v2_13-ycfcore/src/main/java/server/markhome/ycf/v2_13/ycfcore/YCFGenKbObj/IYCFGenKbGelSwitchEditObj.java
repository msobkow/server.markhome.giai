// Description: Java 11 Instance Edit Object interface for CFGenKb GelSwitch.

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
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbGelSwitchEditObj
	extends ICFGenKbGelSwitchObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelSwitchObj.
	 */
	ICFGenKbGelSwitchObj getOrigAsGelSwitch();

	/**
	 *	Get the required String attribute ValueExpansion.
	 *
	 *	@return	The String value of the attribute ValueExpansion.
	 */
	String getRequiredValueExpansion();

	/**
	 *	Set the required String attribute ValueExpansion.
	 *
	 *	@param	value	the String value of the attribute ValueExpansion.
	 */
	void setRequiredValueExpansion( String value );

	/**
	 *	Get the optional String attribute NilExpansion.
	 *
	 *	@return	The String value of the attribute NilExpansion.
	 */
	String getOptionalNilExpansion();

	/**
	 *	Set the optional String attribute NilExpansion.
	 *
	 *	@param	value	the String value of the attribute NilExpansion.
	 */
	void setOptionalNilExpansion( String value );

	/**
	 *	Get the optional String attribute EmptyExpansion.
	 *
	 *	@return	The String value of the attribute EmptyExpansion.
	 */
	String getOptionalEmptyExpansion();

	/**
	 *	Set the optional String attribute EmptyExpansion.
	 *
	 *	@param	value	the String value of the attribute EmptyExpansion.
	 */
	void setOptionalEmptyExpansion( String value );

	/**
	 *	Get the required String attribute DefaultExpansion.
	 *
	 *	@return	The String value of the attribute DefaultExpansion.
	 */
	String getRequiredDefaultExpansion();

	/**
	 *	Set the required String attribute DefaultExpansion.
	 *
	 *	@param	value	the String value of the attribute DefaultExpansion.
	 */
	void setRequiredDefaultExpansion( String value );
}
