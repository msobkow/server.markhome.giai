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

import java.util.Calendar;
import java.math.*;
import java.time.LocalDate;

public class YCFLibArgumentOverflowException extends YCFLibArgumentException {

	public YCFLibArgumentOverflowException(
		String msg )
	{
		super( msg );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		String msg )
	{
		super( throwingClass, methName, msg );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, msg, th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( throwingClass, methName, argNo, argName, msg );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName, msg, th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Short.toString( argValue )
				+ " must be no more than "
				+ Short.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Short.toString( argValue )
				+ " must be no more than "
				+ Short.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Integer.toString( argValue )
				+ " must be no more than "
				+ Integer.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Integer.toString( argValue )
				+ " must be no more than "
				+ Integer.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Long.toString( argValue )
				+ " must be no more than "
				+ Long.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Long.toString( argValue )
				+ " must be no more than "
				+ Long.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Float.toString( argValue )
				+ " must be no more than "
				+ Float.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Float.toString( argValue )
				+ " must be no more than "
				+ Float.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Double.toString( argValue )
				+ " must be no more than "
				+ Double.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + Double.toString( argValue )
				+ " must be no more than "
				+ Double.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString() );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString(),
			th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		LocalDate argValue,
		LocalDate maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString() );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		LocalDate argValue,
		LocalDate maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString(),
			th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString() );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString(),
			th );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString() );
	}

	public YCFLibArgumentOverflowException(
		Class throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super( throwingClass, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString(),
			th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String msg )
	{
		super( fieldName, msg );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		String msg )
	{
		super( fieldName, methName, msg );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, msg, th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg )
	{
		super( fieldName, methName, argNo, argName, msg );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String msg,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName, msg, th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Short.toString( argValue )
				+ " must be no more than "
				+ Short.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Short.toString( argValue )
				+ " must be no more than "
				+ Short.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Integer.toString( argValue )
				+ " must be no more than "
				+ Integer.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Integer.toString( argValue )
				+ " must be no more than "
				+ Integer.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Long.toString( argValue )
				+ " must be no more than "
				+ Long.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Long.toString( argValue )
				+ " must be no more than "
				+ Long.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Float.toString( argValue )
				+ " must be no more than "
				+ Float.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Float.toString( argValue )
				+ " must be no more than "
				+ Float.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Double.toString( argValue )
				+ " must be no more than "
				+ Double.toString( maxValue ) );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + Double.toString( argValue )
				+ " must be no more than "
				+ Double.toString( maxValue ),
			th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString() );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString(),
			th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString() );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString(),
			th );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString() );
	}

	public YCFLibArgumentOverflowException(
		String fieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super( fieldName, methName, argNo, argName,
			"value " + argValue.toString()
				+ " must be no more than "
				+ maxValue.toString(),
			th );
	}
}
