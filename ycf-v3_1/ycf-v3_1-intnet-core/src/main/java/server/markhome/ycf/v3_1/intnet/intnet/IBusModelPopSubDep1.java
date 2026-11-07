// Description: Java 25 interface for a PopSubDep1 record declementation

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

package server.markhome.ycf.v3_1.intnet.intnet;

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
 *	IBusModelPopSubDep1 persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPopSubDep1
	extends IBusModelPopDep
{
	public static final String S_POPTOPDEPID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 POPTOPDEPID_INIT_VALUE = CFDbKeyHash256.fromHex( S_POPTOPDEPID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa835;
	public final static String S_CLASS_CODE = "a835";

	public IBusModelPopTopDep getRequiredContainerContPopTopDep();

	public void setRequiredContainerContPopTopDep(ICFKeyHash256 argPopTopDepId);

	public void setRequiredContainerContPopTopDep(IBusModelPopTopDep argObj);

	public void setRequiredContainerContPopTopDep(IBusModelProtPopTopDep argObj);

	public void setRequiredContainerContPopTopDep(IBusModelPubPopTopDep argObj);

	public List<IBusModelPopSubDep2> getOptionalComponentsPopDep();

	public ICFKeyHash256 getRequiredPopTopDepId();
	public void setRequiredPopTopDepId( ICFKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelScope src );

	public void setPopSubDep1( IBusModelPopSubDep1 src );

	public void set( IBusModelScopeH src );

	public void setPopSubDep1( IBusModelPopSubDep1H src );

	public void set( IBusModelProtScope src );

	public void setPopSubDep1( IBusModelProtPopSubDep1 src );

	public void set( IBusModelProtScopeH src );

	public void setPopSubDep1( IBusModelProtPopSubDep1H src );

	public void set( IBusModelPubScope src );

	public void setPopSubDep1( IBusModelPubPopSubDep1 src );

	public void set( IBusModelPubScopeH src );

	public void setPopSubDep1( IBusModelPubPopSubDep1H src );

	public String getXmlAttrFragment();

	public String toString();
}
