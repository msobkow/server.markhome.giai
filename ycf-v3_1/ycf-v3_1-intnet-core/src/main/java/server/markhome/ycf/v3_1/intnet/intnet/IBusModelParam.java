// Description: Java 25 interface for a Param record declementation

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
 *	IBusModelParam persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelParam
{
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final String S_SERVERMETHODID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SERVERMETHODID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SERVERMETHODID_INIT_VALUE );
	public static final String S_ID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 ID_INIT_VALUE = CFDbKeyHash256.fromHex( S_ID_INIT_VALUE );
	public static final String S_DEFSCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 DEFSCHEMAID_INIT_VALUE = CFDbKeyHash256.fromHex( S_DEFSCHEMAID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public final static boolean ISNULLABLE_INIT_VALUE = false;
	public static final String S_TYPEID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TYPEID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TYPEID_INIT_VALUE );
	public static final String S_PREVID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 PREVID_INIT_VALUE = CFDbKeyHash256.fromHex( S_PREVID_INIT_VALUE );
	public static final String S_NEXTID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 NEXTID_INIT_VALUE = CFDbKeyHash256.fromHex( S_NEXTID_INIT_VALUE );
	public final static int CLASS_CODE = 0xa833;
	public final static String S_CLASS_CODE = "a833";

	public int getClassCode();

	public CFDbKeyHash256 getCreatedByUserId();

	public void setCreatedByUserId( CFDbKeyHash256 value );

	public LocalDateTime getCreatedAt();

	public void setCreatedAt( LocalDateTime value );

	public CFDbKeyHash256 getUpdatedByUserId();

	public void setUpdatedByUserId( CFDbKeyHash256 value );

	public LocalDateTime getUpdatedAt();

	public void setUpdatedAt( LocalDateTime value );

	public $implCommaIJavaOptAtomType$ getPKey();
	public void setPKey($implCommaIJavaOptAtomType$ requiredId);
	public ICFKeyHash256 getRequiredId();
	public void setRequiredId( ICFKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public IBusModelServerMethod getRequiredContainerServerMeth();

	public void setRequiredContainerServerMeth(ICFKeyHash256 argServerMethodId);

	public void setRequiredContainerServerMeth(IBusModelServerMethod argObj);

	public void setRequiredContainerServerMeth(IBusModelProtServerMethod argObj);

	public void setRequiredContainerServerMeth(IBusModelPubServerMethod argObj);

	public IBusModelSchemaDef getOptionalLookupDefSchema();

	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId);

	public void setOptionalLookupDefSchema(IBusModelSchemaDef argObj);

	public void setOptionalLookupDefSchema(IBusModelProtSchemaDef argObj);

	public void setOptionalLookupDefSchema(IBusModelPubSchemaDef argObj);

	public IBusModelParam getOptionalLookupPrev();

	public void setOptionalLookupPrev(ICFKeyHash256 argPrevId);

	public void setOptionalLookupPrev(IBusModelParam argObj);

	public void setOptionalLookupPrev(IBusModelProtParam argObj);

	public void setOptionalLookupPrev(IBusModelPubParam argObj);

	public IBusModelParam getOptionalLookupNext();

	public void setOptionalLookupNext(ICFKeyHash256 argNextId);

	public void setOptionalLookupNext(IBusModelParam argObj);

	public void setOptionalLookupNext(IBusModelProtParam argObj);

	public void setOptionalLookupNext(IBusModelPubParam argObj);

	public IBusModelValue getRequiredLookupType();

	public void setRequiredLookupType(ICFKeyHash256 argTypeId);

	public void setRequiredLookupType(IBusModelValue argObj);

	public void setRequiredLookupType(IBusModelProtValue argObj);

	public void setRequiredLookupType(IBusModelPubValue argObj);

	public ICFKeyHash256 getRequiredServerMethodId();
	public void setRequiredServerMethodId( ICFKeyHash256 value );
	public ICFKeyHash256 getOptionalDefSchemaId();
	public void setOptionalDefSchemaId( ICFKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public String getOptionalShortDescription();
	public void setOptionalShortDescription( String value );
	public String getOptionalDescription();
	public void setOptionalDescription( String value );
	public boolean getRequiredIsNullable();
	public void setRequiredIsNullable( boolean value );
	public ICFKeyHash256 getOptionalTypeId();
	public void setOptionalTypeId( ICFKeyHash256 value );
	public ICFKeyHash256 getOptionalPrevId();
	public void setOptionalPrevId( ICFKeyHash256 value );
	public ICFKeyHash256 getOptionalNextId();
	public void setOptionalNextId( ICFKeyHash256 value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelParam src );

	public void setParam( IBusModelParam src );

	public void set( IBusModelParamH src );

	public void setParam( IBusModelParamH src );

	public void set( IBusModelProtParam src );

	public void setParam( IBusModelProtParam src );

	public void set( IBusModelProtParamH src );

	public void setParam( IBusModelProtParamH src );

	public void set( IBusModelPubParam src );

	public void setParam( IBusModelPubParam src );

	public void set( IBusModelPubParamH src );

	public void setParam( IBusModelPubParamH src );

	public String getXmlAttrFragment();

	public String toString();
}
