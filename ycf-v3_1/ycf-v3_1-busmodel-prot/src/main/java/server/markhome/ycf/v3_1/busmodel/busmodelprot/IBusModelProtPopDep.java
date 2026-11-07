// Description: Java 25 protected interface for a PopDep record implementation

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
 *	IBusModelProtPopDep persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelProtPopDep
	extends IBusModelProtScope
{
	public static final String S_DEFSCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 DEFSCHEMAID_INIT_VALUE = CFDbKeyHash256.fromHex( S_DEFSCHEMAID_INIT_VALUE );
	public static final String S_RELATIONID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 RELATIONID_INIT_VALUE = CFDbKeyHash256.fromHex( S_RELATIONID_INIT_VALUE );
	public final static int CLASS_CODE = 0xa834;
	public final static String S_CLASS_CODE = "a834";

	public IBusModelProtRelation getRequiredLookupRelation();

	public void setRequiredLookupRelation(ICFKeyHash256 argRelationId);


	public void setRequiredLookupRelation(IBusModelProtRelation argObj);

	public void setRequiredLookupRelation(IBusModelPubRelation argObj);

	public IBusModelProtSchemaDef getOptionalLookupDefSchema();

	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId);


	public void setOptionalLookupDefSchema(IBusModelProtSchemaDef argObj);

	public void setOptionalLookupDefSchema(IBusModelPubSchemaDef argObj);

	public ICFKeyHash256 getOptionalDefSchemaId();
	public void setOptionalDefSchemaId( ICFKeyHash256 value );
	public ICFKeyHash256 getRequiredRelationId();
	public void setRequiredRelationId( ICFKeyHash256 value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelProtScope src );

	public void setPopDep( IBusModelProtPopDep src );

	public void set( IBusModelProtScopeH src );

	public void setPopDep( IBusModelProtPopDepH src );

	public void set( IBusModelPubScope src );

	public void setPopDep( IBusModelPubPopDep src );

	public void set( IBusModelPubScopeH src );

	public void setPopDep( IBusModelPubPopDepH src );

	public String getXmlAttrFragment();

	public String toString();
}
