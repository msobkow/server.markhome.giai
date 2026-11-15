// Description: Java 25 public interface for a Id16Gen record implementation

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

package server.markhome.ycf.v3_1.busmodel.busmodelpub;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
//import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;

/**
 *	IBusModelPubId16Gen persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPubId16Gen
	extends IBusModelPubInt16Type
{
	public static final short SLICE_MIN_VALUE = (short)0;
	public static final short BLOCKSIZE_MIN_VALUE = (short)1;
	public static final short SLICE_MAX_VALUE = (short)32767;
	public static final short BLOCKSIZE_MAX_VALUE = (short)32767;
	public static final short SLICE_INIT_VALUE = (short)0;
	public static final short BLOCKSIZE_INIT_VALUE = (short)1;
	public final static int CLASS_CODE = 0xa876;
	public final static String S_CLASS_CODE = "a876";

	public short getRequiredSlice();
	public void setRequiredSlice( short value );
	public short getRequiredBlockSize();
	public void setRequiredBlockSize( short value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelPubValue src );

	public void setId16Gen( IBusModelPubId16Gen src );

	public void set( IBusModelPubValueH src );

	public void setId16Gen( IBusModelPubId16GenH src );

	public String getXmlAttrFragment();

	public String toString();
}
