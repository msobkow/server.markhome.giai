// Description: Java 25 public interface for a Relation record implementation

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
 *	IBusModelPubRelation persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPubRelation
	extends IBusModelPubScope
{
	public static final IBusModelPubSchema.RelationTypeEnum RELATIONTYPE_MIN_VALUE = IBusModelPubSchema.RelationTypeEnum.Unknown;
	public static final IBusModelPubSchema.CodeVisibilityEnum CODEVIS_MIN_VALUE = IBusModelPubSchema.CodeVisibilityEnum.Public;
	public static final IBusModelPubSchema.RelationTypeEnum RELATIONTYPE_MAX_VALUE = IBusModelPubSchema.RelationTypeEnum.Children;
	public static final IBusModelPubSchema.CodeVisibilityEnum CODEVIS_MAX_VALUE = IBusModelPubSchema.CodeVisibilityEnum.Private;
	public static final String S_TABLEID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TABLEID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TABLEID_INIT_VALUE );
	public static final String S_DEFSCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 DEFSCHEMAID_INIT_VALUE = CFDbKeyHash256.fromHex( S_DEFSCHEMAID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final IBusModelPubSchema.RelationTypeEnum RELATIONTYPE_INIT_VALUE = IBusModelPubSchema.ordinalToRelationTypeEnum( 0 );
	public static final String S_FROMINDEXID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 FROMINDEXID_INIT_VALUE = CFDbKeyHash256.fromHex( S_FROMINDEXID_INIT_VALUE );
	public static final String S_TOTABLEID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TOTABLEID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TOTABLEID_INIT_VALUE );
	public static final String S_TOINDEXID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TOINDEXID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TOINDEXID_INIT_VALUE );
	public final static boolean ISREQUIRED_INIT_VALUE = false;
	public final static boolean ISXSDCONTAINER_INIT_VALUE = false;
	public final static boolean ISLATERESOLVER_INIT_VALUE = false;
	public final static boolean ALLOWADDENDUM_INIT_VALUE = false;
	public static final String S_NARROWEDID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 NARROWEDID_INIT_VALUE = CFDbKeyHash256.fromHex( S_NARROWEDID_INIT_VALUE );
	public static final IBusModelPubSchema.CodeVisibilityEnum CODEVIS_INIT_VALUE = IBusModelPubSchema.ordinalToCodeVisibilityEnum( 0 );
	public final static int CLASS_CODE = 0xa839;
	public final static String S_CLASS_CODE = "a839";

	public IBusModelPubSchemaDef getOptionalLookupDefSchema();

	public void setOptionalLookupDefSchema(IBusModelPubSchemaDef argObj);
	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId);

	public IBusModelPubTable getRequiredContainerFromTable();

	public void setRequiredContainerFromTable(IBusModelPubTable argObj);
	public void setRequiredContainerFromTable(ICFKeyHash256 argTableId);

	public IBusModelPubIndex getRequiredLookupFromIndex();

	public void setRequiredLookupFromIndex(IBusModelPubIndex argObj);
	public void setRequiredLookupFromIndex(ICFKeyHash256 argFromIndexId);

	public IBusModelPubTable getRequiredLookupToTable();

	public void setRequiredLookupToTable(IBusModelPubTable argObj);
	public void setRequiredLookupToTable(ICFKeyHash256 argToTableId);

	public IBusModelPubIndex getRequiredLookupToIndex();

	public void setRequiredLookupToIndex(IBusModelPubIndex argObj);
	public void setRequiredLookupToIndex(ICFKeyHash256 argToIndexId);

	public IBusModelPubRelation getOptionalLookupNarrowed();

	public void setOptionalLookupNarrowed(IBusModelPubRelation argObj);
	public void setOptionalLookupNarrowed(ICFKeyHash256 argNarrowedId);

	public List<IBusModelPubRelationCol> getOptionalComponentsColumns();

	public List<IBusModelPubPopTopDep> getOptionalComponentsPopDep();

	public CFDbKeyHash256 getRequiredTableId();
	public void setRequiredTableId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalDefSchemaId();
	public void setOptionalDefSchemaId( CFDbKeyHash256 value );
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
	public IBusModelPubSchema.RelationTypeEnum getRequiredRelationType();
	public void setRequiredRelationType( IBusModelPubSchema.RelationTypeEnum value );
	public String getOptionalDbName();
	public void setOptionalDbName( String value );
	public String getOptionalSuffix();
	public void setOptionalSuffix( String value );
	public CFDbKeyHash256 getRequiredFromIndexId();
	public void setRequiredFromIndexId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getRequiredToTableId();
	public void setRequiredToTableId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getRequiredToIndexId();
	public void setRequiredToIndexId( CFDbKeyHash256 value );
	public boolean getRequiredIsRequired();
	public void setRequiredIsRequired( boolean value );
	public boolean getRequiredIsXsdContainer();
	public void setRequiredIsXsdContainer( boolean value );
	public boolean getRequiredIsLateResolver();
	public void setRequiredIsLateResolver( boolean value );
	public boolean getRequiredAllowAddendum();
	public void setRequiredAllowAddendum( boolean value );
	public CFDbKeyHash256 getOptionalNarrowedId();
	public void setOptionalNarrowedId( CFDbKeyHash256 value );
	public IBusModelPubSchema.CodeVisibilityEnum getRequiredCodeVis();
	public void setRequiredCodeVis( IBusModelPubSchema.CodeVisibilityEnum value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelPubScope src );

	public void setRelation( IBusModelPubRelation src );

	public void set( IBusModelPubScopeH src );

	public void setRelation( IBusModelPubRelationH src );

	public String getXmlAttrFragment();

	public String toString();
}
