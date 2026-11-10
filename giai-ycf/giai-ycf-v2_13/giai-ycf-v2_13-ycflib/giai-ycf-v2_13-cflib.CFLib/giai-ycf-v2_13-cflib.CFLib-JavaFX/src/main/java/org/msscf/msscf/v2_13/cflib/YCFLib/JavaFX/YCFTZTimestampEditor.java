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

import java.util.*;
import javafx.geometry.Pos;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

public class YCFTZTimestampEditor
extends YCFTextField
{
	public final static Calendar MIN_VALUE = YCFLib.getUTCGregorianCalendar( 0, 0, 0, 0, 0, 0 );
	public final static Calendar MAX_VALUE = YCFLib.getUTCGregorianCalendar( 9999, 11, 31, 23, 59, 59 );

	protected Calendar curValue = null;

	protected Calendar minValue = MIN_VALUE;
	protected Calendar maxValue = MAX_VALUE;

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

	public YCFTZTimestampEditor() {
		super();
		setAlignment( Pos.CENTER_LEFT );
		setMinWidth( 200 );
		setMaxWidth( 200 );
		setPrefWidth( 200 );
		setMinHeight( 25 );
		setMaxHeight( 25 );
		setPrefHeight( 25 );
	}

	public Calendar getMinValue() {
		return( minValue );
	}
	
	public void setMinValue( Calendar value ) {
		minValue = value;
	}
	
	public Calendar getMaxValue() {
		return( maxValue );
	}
	
	public void setMaxValue( Calendar value ) {
		maxValue = value;
	}
	
	
	public boolean isEditValid() {
		String text = getText();
		if( ( text == null ) || ( text.length() <= 0 ) ) {
			curValue = null;
			return( true );
		}
		curValue = null;
		curValue = YCFLibXmlUtil.parseTZTimestamp( fieldName, text );
		return( true );
	}

	public void setTZTimestampValue( Calendar value ) {
		curValue = value;
		if( curValue != null ) {
			String str = YCFLibXmlUtil.formatTZTimestamp( value );
			setText( str );
		}
		else {
			setText( "" );
		}
	}
	
	public boolean hasValue() {
		boolean retval;
		String text = getText();
		if( ( text == null ) || ( text.length() <= 0 ) ) {
			retval = false;
		}
		else {
			retval = true;
		}
		return( retval );
	}

	public Calendar getTZTimestampValue() {
		final String S_ProcName = "getTZTimestampValue";
		if( ! hasValue() ) {
			return( null );
		}
		else if( isEditValid() ) {
			return( curValue );
		}
		else {
			throw new YCFLibInvalidArgumentException( fieldName,
					S_ProcName,
					0,
					"text",
					getText() );
		}
	}
}
