// Description: Java 25 interface for a Index record declementation

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
 *	IBusModelIndex persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelIndex
	extends IBusModelScope
{
	public static final IBusModelPubSchema.CodeVisibilityEnum CODEVIS_MIN_VALUE = IBusModelPubSchema.CodeVisibilityEnum.Public;
	public static final IBusModelPubSchema.CodeVisibilityEnum CODEVIS_MAX_VALUE = IBusModelPubSchema.CodeVisibilityEnum.Private;
	public static final String S_TABLEID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TABLEID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TABLEID_INIT_VALUE );
	public static final String S_DEFSCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 DEFSCHEMAID_INIT_VALUE = CFDbKeyHash256.fromHex( S_DEFSCHEMAID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public final static boolean ISUNIQUE_INIT_VALUE = false;
	public final static boolean ISDBMAPPED_INIT_VALUE = true;
	public static final IBusModelPubSchema.CodeVisibilityEnum CODEVIS_INIT_VALUE = IBusModelPubSchema.ordinalToCodeVisibilityEnum( 0 );
	public final static int CLASS_CODE = 0xa825;
	public final static String S_CLASS_CODE = "a825";

	public IBusModelTable getRequiredContainerTable();

	public void setRequiredContainerTable(ICFKeyHash256 argTableId);

	public void setRequiredContainerTable(IBusModelTable argObj);

	public void setRequiredContainerTable(IBusModelProtTable argObj);

	public void setRequiredContainerTable(IBusModelPubTable argObj);

	public IBusModelSchemaDef getOptionalLookupDefSchema();

	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId);

	public void setOptionalLookupDefSchema(IBusModelSchemaDef argObj);

	public void setOptionalLookupDefSchema(IBusModelProtSchemaDef argObj);

	public void setOptionalLookupDefSchema(IBusModelPubSchemaDef argObj);

	public List<IBusModelIndexCol> getOptionalComponentsColumns();

	public List<IBusModelIndexTweak> getOptionalComponentsTweaks();

	public ICFKeyHash256 getRequiredTableId();
	public void setRequiredTableId( ICFKeyHash256 value );
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
	public String getOptionalDbName();
	public void setOptionalDbName( String value );
	public String getOptionalSuffix();
	public void setOptionalSuffix( String value );
	public boolean getRequiredIsUnique();
	public void setRequiredIsUnique( boolean value );
	public boolean getRequiredIsDbMapped();
	public void setRequiredIsDbMapped( boolean value );
	public IBusModelPubSchema.CodeVisibilityEnum getRequiredCodeVis();
	public void setRequiredCodeVis( IBusModelPubSchema.CodeVisibilityEnum value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelScope src );

	public void setIndex( IBusModelIndex src );

	public void set( IBusModelScopeH src );

	public void setIndex( IBusModelIndexH src );

	public void set( IBusModelProtScope src );

	public void setIndex( IBusModelProtIndex src );

	public void set( IBusModelProtScopeH src );

	public void setIndex( IBusModelProtIndexH src );

	public void set( IBusModelPubScope src );

	public void setIndex( IBusModelPubIndex src );

	public void set( IBusModelPubScopeH src );

	public void setIndex( IBusModelPubIndexH src );

	public String getXmlAttrFragment();

	public String toString();
}
