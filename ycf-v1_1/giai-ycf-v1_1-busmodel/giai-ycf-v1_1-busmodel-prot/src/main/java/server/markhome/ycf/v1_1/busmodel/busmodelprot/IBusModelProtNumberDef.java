// Description: Java 25 protected interface for a NumberDef record implementation

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.busmodel.busmodelprot;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

/**
 *	IBusModelProtNumberDef persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelProtNumberDef
	extends IBusModelProtAtom
{
	public static final short DIGITS_MIN_VALUE = (short)1;
	public static final short PRECIS_MIN_VALUE = (short)0;
	public static final short DIGITS_MAX_VALUE = (short)31;
	public static final short PRECIS_MAX_VALUE = (short)30;
	public static final short DIGITS_INIT_VALUE = (short)16;
	public static final short PRECIS_INIT_VALUE = (short)0;
	public static final BigDecimal INITVALUE_INIT_VALUE = CFBigDecimalUtil.parse( "BusModel.NumberDef.InitValue", "BusModel.NumberDef.InitValue", 31, 5, "0.00000" );
	public static final BigDecimal MINVALUE_INIT_VALUE = CFBigDecimalUtil.parse( "BusModel.NumberDef.MinValue", "BusModel.NumberDef.MinValue", 31, 5, "0.00000" );
	public static final BigDecimal MAXVALUE_INIT_VALUE = CFBigDecimalUtil.parse( "BusModel.NumberDef.MaxValue", "BusModel.NumberDef.MaxValue", 31, 5, "0.00000" );
	public final static int CLASS_CODE = 0xa831;
	public final static String S_CLASS_CODE = "a831";

	public short getRequiredDigits();
	public void setRequiredDigits( short value );
	public short getRequiredPrecis();
	public void setRequiredPrecis( short value );
	public BigDecimal getOptionalInitValue();
	public void setOptionalInitValue( BigDecimal value );
	public BigDecimal getOptionalMinValue();
	public void setOptionalMinValue( BigDecimal value );
	public BigDecimal getOptionalMaxValue();
	public void setOptionalMaxValue( BigDecimal value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelProtValue src );

	public void setNumberDef( IBusModelProtNumberDef src );

	public void set( IBusModelProtValueH src );

	public void setNumberDef( IBusModelProtNumberDefH src );

	public void set( IBusModelPubValue src );

	public void setNumberDef( IBusModelPubNumberDef src );

	public void set( IBusModelPubValueH src );

	public void setNumberDef( IBusModelPubNumberDefH src );

	public String getXmlAttrFragment();

	public String toString();
}
