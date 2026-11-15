// Description: Java 25 interface for a Value record declementation

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
 *	IBusModelValue persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelValue
{
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final String S_SCOPEID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SCOPEID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SCOPEID_INIT_VALUE );
	public static final String S_ID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 ID_INIT_VALUE = CFDbKeyHash256.fromHex( S_ID_INIT_VALUE );
	public static final String S_DEFSCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 DEFSCHEMAID_INIT_VALUE = CFDbKeyHash256.fromHex( S_DEFSCHEMAID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public final static boolean ISNULLABLE_INIT_VALUE = false;
	public final static boolean IMPLEMENTSPOLYMORPH_INIT_VALUE = false;
	public static final String S_PREVID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 PREVID_INIT_VALUE = CFDbKeyHash256.fromHex( S_PREVID_INIT_VALUE );
	public static final String S_NEXTID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 NEXTID_INIT_VALUE = CFDbKeyHash256.fromHex( S_NEXTID_INIT_VALUE );
	public final static int CLASS_CODE = 0xa80d;
	public final static String S_CLASS_CODE = "a80d";

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
	public List<IBusModelTableCol> getOptionalChildrenRefTableCol();

	public List<IBusModelIndexCol> getOptionalChildrenRefIndexCol();

	public ICFKeyHash256 getRequiredId();
	public void setRequiredId( ICFKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public IBusModelScope getRequiredContainerScope();

	public void setRequiredContainerScope(ICFKeyHash256 argScopeId);

	public void setRequiredContainerScope(IBusModelScope argObj);

	public void setRequiredContainerScope(IBusModelProtScope argObj);

	public void setRequiredContainerScope(IBusModelPubScope argObj);

	public IBusModelSchemaDef getOptionalLookupDefSchema();

	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId);

	public void setOptionalLookupDefSchema(IBusModelSchemaDef argObj);

	public void setOptionalLookupDefSchema(IBusModelProtSchemaDef argObj);

	public void setOptionalLookupDefSchema(IBusModelPubSchemaDef argObj);

	public IBusModelValue getOptionalLookupPrev();

	public void setOptionalLookupPrev(ICFKeyHash256 argPrevId);

	public void setOptionalLookupPrev(IBusModelValue argObj);

	public void setOptionalLookupPrev(IBusModelProtValue argObj);

	public void setOptionalLookupPrev(IBusModelPubValue argObj);

	public IBusModelValue getOptionalLookupNext();

	public void setOptionalLookupNext(ICFKeyHash256 argNextId);

	public void setOptionalLookupNext(IBusModelValue argObj);

	public void setOptionalLookupNext(IBusModelProtValue argObj);

	public void setOptionalLookupNext(IBusModelPubValue argObj);

	public ICFKeyHash256 getRequiredScopeId();
	public void setRequiredScopeId( ICFKeyHash256 value );
	public ICFKeyHash256 getOptionalDefSchemaId();
	public void setOptionalDefSchemaId( ICFKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public String getOptionalShortName();
	public void setOptionalShortName( String value );
	public String getOptionalLabel();
	public void setOptionalLabel( String value );
	public String getOptionalShortDescription();
	public void setOptionalShortDescription( String value );
	public String getOptionalDescription();
	public void setOptionalDescription( String value );
	public String getOptionalDefaultXmlValue();
	public void setOptionalDefaultXmlValue( String value );
	public boolean getRequiredIsNullable();
	public void setRequiredIsNullable( boolean value );
	public Boolean getOptionalGenerateId();
	public void setOptionalGenerateId( Boolean value );
	public boolean getRequiredImplementsPolymorph();
	public void setRequiredImplementsPolymorph( boolean value );
	public ICFKeyHash256 getOptionalPrevId();
	public void setOptionalPrevId( ICFKeyHash256 value );
	public ICFKeyHash256 getOptionalNextId();
	public void setOptionalNextId( ICFKeyHash256 value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelValue src );

	public void setValue( IBusModelValue src );

	public void set( IBusModelValueH src );

	public void setValue( IBusModelValueH src );

	public void set( IBusModelProtValue src );

	public void setValue( IBusModelProtValue src );

	public void set( IBusModelProtValueH src );

	public void setValue( IBusModelProtValueH src );

	public void set( IBusModelPubValue src );

	public void setValue( IBusModelPubValue src );

	public void set( IBusModelPubValueH src );

	public void setValue( IBusModelPubValueH src );

	public String getXmlAttrFragment();

	public String toString();
}
