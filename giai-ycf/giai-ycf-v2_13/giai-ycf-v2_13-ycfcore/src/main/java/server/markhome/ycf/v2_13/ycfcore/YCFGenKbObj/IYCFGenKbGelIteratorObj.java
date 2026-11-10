// Description: Java 11 Object interface for YCFGenKb GelIterator.

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

public interface IYCFGenKbGelIteratorObj
	extends IYCFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelIterator instance as a IYCFGenKbGelIteratorEditObj.
	 *
	 *	@return	The IYCFGenKbGelIteratorEditObj edition of this instance.
	 */
	IYCFGenKbGelIteratorEditObj getEditAsGelIterator();

	/**
	 *	Get the IYCFGenKbGelIteratorTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFGenKbGelIteratorTableObj table cache which manages this instance.
	 */
	IYCFGenKbGelIteratorTableObj getGelIteratorTable();

	/**
	 *	Get the YCFGenKbGelIteratorBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFGenKbGelIteratorBuff instance which currently backs this object.
	 */
	YCFGenKbGelIteratorBuff getGelIteratorBuff();

	/**
	 *	Get the required String attribute IteratorName.
	 *
	 *	@return	The required String attribute IteratorName.
	 */
	String getRequiredIteratorName();

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
