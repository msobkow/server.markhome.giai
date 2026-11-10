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

public class YCFDoubleEditor
extends YCFFormattedTextField
{
	protected static Format defaultFormat = null;

	protected Double minValue = -Double.MAX_VALUE;
	protected Double maxValue = Double.MAX_VALUE;

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
			defaultFormat = new DecimalFormat( "######################################################################################################################################################################################################################################################################################################################0.0######################################################################################################################################################################################################################################################################################################################" );
		}
		return( defaultFormat );
	}

	public YCFDoubleEditor() {
		super();
		setAlignment( Pos.CENTER_RIGHT );
		setMinHeight( 25 );
		setMaxHeight( 25 );
		setPrefHeight( 25 );
		setMinWidth( 160 );
		setMaxWidth( 160 );
		setPrefWidth( 160 );
	}

	public Double getMinValue() {
		return( minValue );
	}
	
	public void setMinValue( Double value ) {
		final String S_ProcName = "setMinValue";
		if( value == null ) {
			throw new YCFLibNullArgumentException( fieldName,
					S_ProcName,
					1,
					fieldName );
		}
		if( value.compareTo( -Double.MAX_VALUE ) < 0 ) {
			throw new YCFLibArgumentUnderflowException( fieldName,
					S_ProcName,
					1,
					fieldName,
					value,
					-Double.MAX_VALUE );
		}
		minValue = value;
	}

	public Double getMaxValue() {
		return( maxValue );
	}

	public void setMaxValue( Double value ) {
		final String S_ProcName = "setMaxValue";
		if( value == null ) {
			throw new YCFLibNullArgumentException( fieldName,
					S_ProcName,
					1,
					fieldName );
		}
		if( value.compareTo( Double.MAX_VALUE ) > 0 ) {
			throw new YCFLibArgumentOverflowException( fieldName,
					S_ProcName,
					1,
					fieldName,
					value,
					Double.MAX_VALUE );
		}
		maxValue = value;
	}
	
	public void setDoubleValue( Double value ) {
		if( value == null ) {
			setText( "" );
		}
		else {
			String text = getDefaultFormat().format( value );
			setText( text );
		}
	}
	
	public Double getDoubleValue() {
		final String S_ProcName = "getDoubleValue";
		Double retval;
		String text = getText();
		if( ( text == null ) || ( text.length() <= 0 ) ) {
			retval = null;
		}
		else {
			Double v = Double.valueOf( text );
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
