// Description: Java 25 interface for a ClearSubDep3 record declementation

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
 *	IBusModelClearSubDep3 persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelClearSubDep3
	extends IBusModelClearDep
{
	public static final String S_CLEARSUBDEP2ID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 CLEARSUBDEP2ID_INIT_VALUE = CFDbKeyHash256.fromHex( S_CLEARSUBDEP2ID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa817;
	public final static String S_CLASS_CODE = "a817";

	public IBusModelClearSubDep2 getRequiredContainerClearSubDep2();

	public void setRequiredContainerClearSubDep2(ICFKeyHash256 argClearSubDep2Id);

	public void setRequiredContainerClearSubDep2(IBusModelClearSubDep2 argObj);

	public void setRequiredContainerClearSubDep2(IBusModelProtClearSubDep2 argObj);

	public void setRequiredContainerClearSubDep2(IBusModelPubClearSubDep2 argObj);

	public ICFKeyHash256 getRequiredClearSubDep2Id();
	public void setRequiredClearSubDep2Id( ICFKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelScope src );

	public void setClearSubDep3( IBusModelClearSubDep3 src );

	public void set( IBusModelScopeH src );

	public void setClearSubDep3( IBusModelClearSubDep3H src );

	public void set( IBusModelProtScope src );

	public void setClearSubDep3( IBusModelProtClearSubDep3 src );

	public void set( IBusModelProtScopeH src );

	public void setClearSubDep3( IBusModelProtClearSubDep3H src );

	public void set( IBusModelPubScope src );

	public void setClearSubDep3( IBusModelPubClearSubDep3 src );

	public void set( IBusModelPubScopeH src );

	public void setClearSubDep3( IBusModelPubClearSubDep3H src );

	public String getXmlAttrFragment();

	public String toString();
}
