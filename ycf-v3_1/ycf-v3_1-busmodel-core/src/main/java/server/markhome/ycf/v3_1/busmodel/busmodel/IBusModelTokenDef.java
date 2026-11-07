// Description: Java 25 interface for a TokenDef record declementation

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

package server.markhome.ycf.v3_1.busmodel.busmodel;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;

import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

/**
 *	IBusModelTokenDef persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelTokenDef
	extends IBusModelAtom
{
	public static final int MAXLEN_MIN_VALUE = 0;
	public static final int MAXLEN_MAX_VALUE = 2147483647;
	public static final int MAXLEN_INIT_VALUE = 0;
	public final static int CLASS_CODE = 0xa863;
	public final static String S_CLASS_CODE = "a863";

	public int getRequiredMaxLen();
	public void setRequiredMaxLen( int value );
	public String getOptionalInitValue();
	public void setOptionalInitValue( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelValue src );

	public void setTokenDef( IBusModelTokenDef src );

	public void set( IBusModelValueH src );

	public void setTokenDef( IBusModelTokenDefH src );

	public void set( IBusModelProtValue src );

	public void setTokenDef( IBusModelProtTokenDef src );

	public void set( IBusModelProtValueH src );

	public void setTokenDef( IBusModelProtTokenDefH src );

	public void set( IBusModelPubValue src );

	public void setTokenDef( IBusModelPubTokenDef src );

	public void set( IBusModelPubValueH src );

	public void setTokenDef( IBusModelPubTokenDefH src );

	public String getXmlAttrFragment();

	public String toString();
}
