/*
 *	MSS Code Factory YCFLib 2.13 Common Application Functionality
 *
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow (mailto:mark.sobkow@gmail.com)
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
 *	along with this program.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycflib.YCFLib;

import java.util.*;

public class YCFLibUnrecognizedAttributeException extends NoSuchElementException {

	public YCFLibUnrecognizedAttributeException(
		String msg )
	{
		super( msg );
	}

	public YCFLibUnrecognizedAttributeException(
		Class throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass.getName()
					+ ( ( ( methName != null ) && ( methName.length() > 0 ))
						? "." + methName
						: "" )
					+ "() "
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )
						? msg
						: "" ) );
	}

	public YCFLibUnrecognizedAttributeException(
		String fieldName,
		String msg )
	{
		super( fieldName + "() "
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )
						? msg
						: "" ) );
	}

	public YCFLibUnrecognizedAttributeException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName
					+ ( ( ( methName != null ) && ( methName.length() > 0 ))
						? "." + methName
						: "" )
					+ "() "
					+ ( ( ( msg != null ) && ( msg.length() > 0 ) )
						? msg
						: "" ) );
	}

	public YCFLibUnrecognizedAttributeException()
	{
		super( "Unrecognized attribute" );
	}

	public YCFLibUnrecognizedAttributeException(
		Class throwingClass,
		String methName )
	{
		super( throwingClass.getName()
					+ ( ( ( methName != null ) && ( methName.length() > 0 ))
						? "." + methName
						: "" )
					+ "() Unrecognized attribute" );
	}

	public YCFLibUnrecognizedAttributeException(
		Class throwingClass,
		String methName,
		String locInfo,
		String attrName )
	{
		super( throwingClass.getName()
					+ ( ( ( methName != null ) && ( methName.length() > 0 ))
						? "." + methName
						: "" )
					+ "() "
					+ ((( locInfo != null ) && ( locInfo.length() > 0 ))
						? locInfo + " "
						: "" )
					+ "Unrecognized attribute "
					+ ( (( attrName != null ) && ( attrName.length() > 0 ))
							? "\"" + attrName + "\""
							: "null" ) );
		}
}
