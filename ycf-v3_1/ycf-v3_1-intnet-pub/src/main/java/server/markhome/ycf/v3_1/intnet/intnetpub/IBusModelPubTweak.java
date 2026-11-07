// Description: Java 25 public interface for a Tweak record implementation

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

package server.markhome.ycf.v3_1.intnet.intnetpub;

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
 *	IBusModelPubTweak persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPubTweak
{
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final String S_TENANTID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TENANTID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TENANTID_INIT_VALUE );
	public static final String S_SCOPEID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SCOPEID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SCOPEID_INIT_VALUE );
	public static final String S_ID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 ID_INIT_VALUE = CFDbKeyHash256.fromHex( S_ID_INIT_VALUE );
	public static final String S_DEFSCHEMATENANTID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 DEFSCHEMATENANTID_INIT_VALUE = CFDbKeyHash256.fromHex( S_DEFSCHEMATENANTID_INIT_VALUE );
	public static final String S_DEFSCHEMAID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 DEFSCHEMAID_INIT_VALUE = CFDbKeyHash256.fromHex( S_DEFSCHEMAID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public final static boolean REPLACESINHERITED_INIT_VALUE = false;
	public static final String TWEAKGELTEXT_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa808;
	public final static String S_CLASS_CODE = "a808";

	public int getClassCode();

	public CFDbKeyHash256 getCreatedByUserId();

	public void setCreatedByUserId( CFDbKeyHash256 value );

	public LocalDateTime getCreatedAt();

	public void setCreatedAt( LocalDateTime value );

	public CFDbKeyHash256 getUpdatedByUserId();

	public void setUpdatedByUserId( CFDbKeyHash256 value );

	public LocalDateTime getUpdatedAt();

	public void setUpdatedAt( LocalDateTime value );

	public ICFKeyHash256 getPKey();
	public void setPKey(ICFKeyHash256 requiredId);
	public CFDbKeyHash256 getRequiredId();
	public void setRequiredId( CFDbKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public IBusModelPubScope getRequiredContainerScopeDef();

	public void setRequiredContainerScopeDef(IBusModelPubScope argObj);
	public void setRequiredContainerScopeDef(ICFKeyHash256 argScopeId);

	public IBusModelPubSchemaDef getOptionalLookupDefSchema();

	public void setOptionalLookupDefSchema(IBusModelPubSchemaDef argObj);
	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId);

	public CFDbKeyHash256 getRequiredTenantId();
	public void setRequiredTenantId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getRequiredScopeId();
	public void setRequiredScopeId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalDefSchemaTenantId();
	public void setOptionalDefSchemaTenantId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalDefSchemaId();
	public void setOptionalDefSchemaId( CFDbKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public boolean getRequiredReplacesInherited();
	public void setRequiredReplacesInherited( boolean value );
	public String getRequiredTweakGelText();
	public void setRequiredTweakGelText( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IBusModelPubTweak src );

	public void setTweak( IBusModelPubTweak src );

	public void set( IBusModelPubTweakH src );

	public void setTweak( IBusModelPubTweakH src );

	public String getXmlAttrFragment();

	public String toString();
}
