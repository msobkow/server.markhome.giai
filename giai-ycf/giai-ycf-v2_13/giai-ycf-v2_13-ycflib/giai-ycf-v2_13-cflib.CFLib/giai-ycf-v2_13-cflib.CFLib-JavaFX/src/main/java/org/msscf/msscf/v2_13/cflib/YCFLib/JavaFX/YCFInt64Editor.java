/*
 *	MSS Code Factory YCFLib 2.13 JavaFX Support
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

package org.mssycf.mssycf.v2_13.ycflib.YCFLib.JavaFX;

import java.text.*;

import javafx.geometry.Pos;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

public class YCFInt64Editor
extends YCFFormattedTextField
{
	protected static Format defaultFormat = null;
	protected long minValue = -9223372036854775808L;
	protected long maxValue = 9223372036854775807L;

	protected String fieldName = "?";
	
	public String getFieldName() {
		return( fieldName );
	}
	
	public void setFieldName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			fieldName = "?";
		}
		else {
			fieldName = value;
		}
	}

	public static Format getDefaultFormat() {
		if( defaultFormat == null ) {
			defaultFormat = new DecimalFormat( "##################0;-##################0" );
		}
		return( defaultFormat );
	}

	public YCFInt64Editor() {
		setAlignment( Pos.CENTER_RIGHT );
		setMinWidth( 210 );
		setPrefWidth( 210 );
		setMaxWidth( 210 );
		setMinHeight( 25 );
		setMaxHeight( 25 );
		setPrefHeight( 25 );
	}
	
	public long getMinValue() {
		return( minValue );
	}

	public void setMinValue( long value ) {
		minValue = value;
	}
	
	public long getMaxValue() {
		return( maxValue );
	}
	
	public void setMaxValue( long value ) {
		maxValue = value;
	}
	
	public void setInt64Value( Long value ) {
		if( value == null ) {
			setText( "" );
		}
		else {
			String text = getDefaultFormat().format( value );
			setText( text );
		}
	}
	
	public Long getInt64Value() {
		final String S_ProcName = "getInt64Value";
		Long retval;
		String text = getText();
		if( ( text == null ) || ( text.length() <= 0 ) ) {
			retval = null;
		}
		else {
			Long v = Long.valueOf( text );
			if( v == null ) {
				throw new YCFLibInvalidArgumentException( fieldName,
						S_ProcName,
						0,
						"text",
						text );
			}
			if( v.compareTo( minValue ) < 0 ) {
				throw new YCFLibArgumentUnderflowException( fieldName,
						S_ProcName,
						1,
						fieldName,
						v,
						minValue );
			}
			if( v.compareTo( maxValue ) > 0 ) {
				throw new YCFLibArgumentOverflowException( fieldName,
						S_ProcName,
						1,
						fieldName,
						v,
						maxValue );
			}
			retval = v;
		}
		return( retval );
	}
}
