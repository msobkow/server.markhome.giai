// Description: Java 25 protected interface for a EnumTag record implementation

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

package server.markhome.ycf.v3_1.intnet.intnetprot;

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
 *	IBusModelProtEnumTag persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelProtEnumTag
{
	public static final short ENUMCODE_MIN_VALUE = (short)0;
	public static final short ENUMCODE_MAX_VALUE = (short)32767;
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final String S_ID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 ID_INIT_VALUE = CFDbKeyHash256.fromHex( S_ID_INIT_VALUE );
	public static final String S_DEFSCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 DEFSCHEMAID_INIT_VALUE = CFDbKeyHash256.fromHex( S_DEFSCHEMAID_INIT_VALUE );
	public static final String S_ENUMID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 ENUMID_INIT_VALUE = CFDbKeyHash256.fromHex( S_ENUMID_INIT_VALUE );
	public static final short ENUMCODE_INIT_VALUE = (short)0;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final String S_PREVID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 PREVID_INIT_VALUE = CFDbKeyHash256.fromHex( S_PREVID_INIT_VALUE );
	public static final String S_NEXTID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 NEXTID_INIT_VALUE = CFDbKeyHash256.fromHex( S_NEXTID_INIT_VALUE );
	public final static int CLASS_CODE = 0xa822;
	public final static String S_CLASS_CODE = "a822";

	public int getClassCode();

	public CFDbKeyHash256 getCreatedByUserId();

	public void setCreatedByUserId( CFDbKeyHash256 value );

	public LocalDateTime getCreatedAt();

	public void setCreatedAt( LocalDateTime value );

	public CFDbKeyHash256 getUpdatedByUserId();

	public void setUpdatedByUserId( CFDbKeyHash256 value );

	public LocalDateTime getUpdatedAt();

	public void setUpdatedAt( LocalDateTime value );

	public CFDbKeyHash256 getPKey();
	public void setPKey(CFDbKeyHash256 requiredId);
	public ICFKeyHash256 getRequiredId();
	public void setRequiredId( ICFKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public IBusModelProtEnumDef getRequiredContainerEnumDef();

	public void setRequiredContainerEnumDef(ICFKeyHash256 argEnumId);


	public void setRequiredContainerEnumDef(IBusModelProtEnumDef argObj);

	public void setRequiredContainerEnumDef(IBusModelPubEnumDef argObj);

	public IBusModelProtSchemaDef getOptionalLookupDefSchema();

	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId);


	public void setOptionalLookupDefSchema(IBusModelProtSchemaDef argObj);

	public void setOptionalLookupDefSchema(IBusModelPubSchemaDef argObj);

	public IBusModelProtEnumTag getOptionalLookupPrev();

	public void setOptionalLookupPrev(ICFKeyHash256 argPrevId);


	public void setOptionalLookupPrev(IBusModelProtEnumTag argObj);

	public void setOptionalLookupPrev(IBusModelPubEnumTag argObj);

	public IBusModelProtEnumTag getOptionalLookupNext();

	public void setOptionalLookupNext(ICFKeyHash256 argNextId);


	public void setOptionalLookupNext(IBusModelProtEnumTag argObj);

	public void setOptionalLookupNext(IBusModelPubEnumTag argObj);

	public ICFKeyHash256 getOptionalDefSchemaId();
	public void setOptionalDefSchemaId( ICFKeyHash256 value );
	public ICFKeyHash256 getRequiredEnumId();
	public void setRequiredEnumId( ICFKeyHash256 value );
	public Short getOptionalEnumCode();
	public void setOptionalEnumCode( Short value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public ICFKeyHash256 getOptionalPrevId();
	public void setOptionalPrevId( ICFKeyHash256 value );
	public ICFKeyHash256 getOptionalNextId();
	public void setOptionalNextId( ICFKeyHash256 value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelProtEnumTag src );

	public void setEnumTag( IBusModelProtEnumTag src );

	public void set( IBusModelProtEnumTagH src );

	public void setEnumTag( IBusModelProtEnumTagH src );

	public void set( IBusModelPubEnumTag src );

	public void setEnumTag( IBusModelPubEnumTag src );

	public void set( IBusModelPubEnumTagH src );

	public void setEnumTag( IBusModelPubEnumTagH src );

	public String getXmlAttrFragment();

	public String toString();
}
