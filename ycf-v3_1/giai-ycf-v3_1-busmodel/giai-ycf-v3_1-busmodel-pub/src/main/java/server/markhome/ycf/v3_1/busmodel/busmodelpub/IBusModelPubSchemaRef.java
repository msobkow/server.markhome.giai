// Description: Java 25 public interface for a SchemaRef record implementation

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
 *	IBusModelPubSchemaRef persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPubSchemaRef
	extends IBusModelPubScope
{
	public static final String S_SCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SCHEMAID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SCHEMAID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final String REFMODELNAME_INIT_VALUE = new String( "" );
	public static final String INCLUDEROOT_INIT_VALUE = new String( "" );
	public static final String S_REFSCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 REFSCHEMAID_INIT_VALUE = CFDbKeyHash256.fromHex( S_REFSCHEMAID_INIT_VALUE );
	public static final String S_PREVID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 PREVID_INIT_VALUE = CFDbKeyHash256.fromHex( S_PREVID_INIT_VALUE );
	public static final String S_NEXTID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 NEXTID_INIT_VALUE = CFDbKeyHash256.fromHex( S_NEXTID_INIT_VALUE );
	public final static int CLASS_CODE = 0xa803;
	public final static String S_CLASS_CODE = "a803";

	public IBusModelPubSchemaDef getRequiredContainerSchema();

	public void setRequiredContainerSchema(IBusModelPubSchemaDef argObj);
	public void setRequiredContainerSchema(ICFKeyHash256 argSchemaId);

	public IBusModelPubSchemaDef getOptionalLookupRefSchema();

	public void setOptionalLookupRefSchema(IBusModelPubSchemaDef argObj);
	public void setOptionalLookupRefSchema(ICFKeyHash256 argRefSchemaId);

	public IBusModelPubSchemaRef getOptionalLookupPrev();

	public void setOptionalLookupPrev(IBusModelPubSchemaRef argObj);
	public void setOptionalLookupPrev(ICFKeyHash256 argPrevId);

	public IBusModelPubSchemaRef getOptionalLookupNext();

	public void setOptionalLookupNext(IBusModelPubSchemaRef argObj);
	public void setOptionalLookupNext(ICFKeyHash256 argNextId);

	public CFDbKeyHash256 getRequiredSchemaId();
	public void setRequiredSchemaId( CFDbKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public String getRequiredRefModelName();
	public void setRequiredRefModelName( String value );
	public String getRequiredIncludeRoot();
	public void setRequiredIncludeRoot( String value );
	public CFDbKeyHash256 getOptionalRefSchemaId();
	public void setOptionalRefSchemaId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalPrevId();
	public void setOptionalPrevId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalNextId();
	public void setOptionalNextId( CFDbKeyHash256 value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelPubScope src );

	public void setSchemaRef( IBusModelPubSchemaRef src );

	public void set( IBusModelPubScopeH src );

	public void setSchemaRef( IBusModelPubSchemaRefH src );

	public String getXmlAttrFragment();

	public String toString();
}
