// Description: Java 11 Instance Edit Object interface for YCFGenKb GelPushContext.

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
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public interface IYCFGenKbGelPushContextEditObj
	extends IYCFGenKbGelPushContextObj,
		IYCFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFGenKbGelPushContextObj.
	 */
	IYCFGenKbGelPushContextObj getOrigAsGelPushContext();

	/**
	 *	Get the required String attribute GoalTypeName.
	 *
	 *	@return	The String value of the attribute GoalTypeName.
	 */
	String getRequiredGoalTypeName();

	/**
	 *	Set the required String attribute GoalTypeName.
	 *
	 *	@param	value	the String value of the attribute GoalTypeName.
	 */
	void setRequiredGoalTypeName( String value );

	/**
	 *	Get the IYCFGenKbGelInstructionObj instance referenced by the Remainder key.
	 *
	 *	@return	The IYCFGenKbGelInstructionObj instance referenced by the Remainder key.
	 */
	IYCFGenKbGelInstructionObj getOptionalLookupRemainder();

	/**
	 *	Set the IYCFGenKbGelInstructionObj instance referenced by the Remainder key.
	 *
	 *	@param	value	the IYCFGenKbGelInstructionObj instance to be referenced by the Remainder key.
	 */
	void setOptionalLookupRemainder( IYCFGenKbGelInstructionObj value );
}
