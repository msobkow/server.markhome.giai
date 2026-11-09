// Description: Java 11 Instance Edit Object interface for CFGenKb GenRule.

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

public interface ICFGenKbGenRuleEditObj
	extends ICFGenKbGenRuleObj,
		ICFGenKbGenItemEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGenRuleObj.
	 */
	ICFGenKbGenRuleObj getOrigAsGenRule();

	/**
	 *	Get the required String attribute DefinedNear.
	 *
	 *	@return	The String value of the attribute DefinedNear.
	 */
	String getRequiredDefinedNear();

	/**
	 *	Set the required String attribute DefinedNear.
	 *
	 *	@param	value	the String value of the attribute DefinedNear.
	 */
	void setRequiredDefinedNear( String value );

	/**
	 *	Get the required String attribute Body.
	 *
	 *	@return	The String value of the attribute Body.
	 */
	String getRequiredBody();

	/**
	 *	Set the required String attribute Body.
	 *
	 *	@param	value	the String value of the attribute Body.
	 */
	void setRequiredBody( String value );

	/**
	 *	Get the ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 *
	 *	@return	The ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsBodyGel();

	/**
	 *	Set the ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 *
	 *	@param	value	the ICFGenKbGelExecutableObj instance to be referenced by the BodyGel key.
	 */
	void setOptionalComponentsBodyGel( ICFGenKbGelExecutableObj value );
}
