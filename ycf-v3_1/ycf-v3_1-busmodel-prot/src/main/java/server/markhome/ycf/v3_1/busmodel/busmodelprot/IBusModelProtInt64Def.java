// Description: Java 25 protected interface for a Int64Def record implementation

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
 *	IBusModelProtInt64Def persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelProtInt64Def
	extends IBusModelProtAtom
{
	public static final long INITVALUE_MIN_VALUE = -9223372036854775807L;
	public static final long MINVALUE_MIN_VALUE = -9223372036854775807L;
	public static final long MAXVALUE_MIN_VALUE = -9223372036854775807L;
	public static final long INITVALUE_MAX_VALUE = 9223372036854775807L;
	public static final long MINVALUE_MAX_VALUE = 9223372036854775807L;
	public static final long MAXVALUE_MAX_VALUE = 9223372036854775807L;
	public static final long INITVALUE_INIT_VALUE = 0L;
	public static final long MINVALUE_INIT_VALUE = 0L;
	public static final long MAXVALUE_INIT_VALUE = 0L;
	public final static int CLASS_CODE = 0xa82b;
	public final static String S_CLASS_CODE = "a82b";

	public Long getOptionalInitValue();
	public void setOptionalInitValue( Long value );
	public Long getOptionalMinValue();
	public void setOptionalMinValue( Long value );
	public Long getOptionalMaxValue();
	public void setOptionalMaxValue( Long value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelProtValue src );

	public void setInt64Def( IBusModelProtInt64Def src );

	public void set( IBusModelProtValueH src );

	public void setInt64Def( IBusModelProtInt64DefH src );

	public void set( IBusModelPubValue src );

	public void setInt64Def( IBusModelPubInt64Def src );

	public void set( IBusModelPubValueH src );

	public void setInt64Def( IBusModelPubInt64DefH src );

	public String getXmlAttrFragment();

	public String toString();
}
