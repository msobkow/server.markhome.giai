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

import javafx.scene.control.TextArea;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

public class YCFTextEditor
extends TextArea
{
	protected int maxLen = 0;

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

	public YCFTextEditor() {
		super();
		setPrefWidth( 660 );
		setMinHeight( 50 );
		setPrefHeight( 50 );
	}
	
	public void setTextValue( String text ) {
		final String S_ProcName = "setTextValue";
		if( text == null ) {
			setText( "" );
			return;
		}
		if( text.length() > maxLen ) {
			throw new YCFLibArgumentOverflowException( fieldName,
				S_ProcName,
				"Maximum length of text editor is " + maxLen );
		}
		setText( text );
	}
	
	public String getTextValue() {
		String text = getText();
		return( text );
	}
	
	public int getMaxLen() {
		return( maxLen );
	}

	public void setMaxLen( int value ) {
		final String S_ProcName = "setMaxLen";
		if( value < 1 ) {
			throw new YCFLibArgumentUnderflowException( fieldName,
					S_ProcName,
					1,
					"value",
					value,
					1 );
		}
		maxLen = value;
		String curText = getText();
		if( ( curText != null ) && ( curText.length() > maxLen ) ) {
			curText = curText.substring( 0, maxLen );
			setText( curText );
		}
	}
}
