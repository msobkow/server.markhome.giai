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

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import javafx.scene.control.TableCell;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;

public class YCFNumberTableCell<T>
extends TableCell<T,BigDecimal>
{
	protected int digits;
	protected int precis;

	public YCFNumberTableCell( int argDigits, int argPrecision ) {
		super();
		setDigits( argDigits );
		setPrecision( argPrecision );
	}

	@Override protected void updateItem( BigDecimal item, boolean empty ) {
		super.updateItem( item, empty );
		if( ( item == null ) || empty ) {
			setText( null );
			setStyle( "" );
		}
		else {
			Format fmt = YCFLibBigDecimalUtil.getNumberFormat( getClass().getName(), digits, precis );
			String cellText = fmt.format( item );
			setText( cellText );
			setStyle( "-fx-alignment: CENTER-RIGHT" );
		}
	}

	public int getDigits() {
		return( digits );
	}

	public void setDigits( int argDigits ) {
		final String S_ProcName = "setDigits";
		if( argDigits < 1 ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					1,
					"argDigits",
					argDigits,
					1 );
		}
		else if( argDigits > YCFLibBigDecimalUtil.MAX_DIGITS ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				S_ProcName,
				1,
				"argDigits",
				argDigits,
				YCFLibBigDecimalUtil.MAX_DIGITS );
		}
		digits = argDigits;
	}
	
	public int getPrecision() {
		return( precis );
	}

	public void setPrecision( int argPrecis ) {
		final String S_ProcName = "setPrecision";
		if( argPrecis < 0 ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				1,
				"argPrecis",
				argPrecis,
				0 );
		}
		else if( argPrecis > YCFLibBigDecimalUtil.MAX_PRECISION ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				S_ProcName,
				1,
				"argPrecis",
				argPrecis,
				YCFLibBigDecimalUtil.MAX_PRECISION );
		}

		if( argPrecis >= digits ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				S_ProcName,
				1,
				"argPrecis",
				argPrecis,
				digits - 1 );
		}

		precis = argPrecis;
	}

	public void setDigitsAndPrecision( int argDigits, int argPrecis ) {
		final String S_ProcName = "setDigitsAndPrecision";
		if( argDigits < 1 ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					1,
					"argDigits",
					argDigits,
					1 );
		}
		else if( argDigits > YCFLibBigDecimalUtil.MAX_DIGITS ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				S_ProcName,
				1,
				"argDigits",
				argDigits,
				YCFLibBigDecimalUtil.MAX_DIGITS );
		}
		if( argPrecis < 0 ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				1,
				"argPrecis",
				argPrecis,
				0 );
		}
		else if( argPrecis > YCFLibBigDecimalUtil.MAX_PRECISION ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				S_ProcName,
				1,
				"argPrecis",
				argPrecis,
				YCFLibBigDecimalUtil.MAX_PRECISION );
		}
		if( argPrecis >= argDigits ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				S_ProcName,
				1,
				"argPrecis",
				argPrecis,
				argDigits - 1 );
		}
		digits = argDigits;
		precis = argPrecis;
	}
}
