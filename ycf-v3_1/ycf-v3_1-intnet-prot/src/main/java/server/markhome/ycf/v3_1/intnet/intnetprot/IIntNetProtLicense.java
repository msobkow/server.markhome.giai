// Description: Java 25 protected interface for a License record implementation

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
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

/**
 *	IIntNetProtLicense persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IIntNetProtLicense
{
	public static final String S_ID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 ID_INIT_VALUE = CFDbKeyHash256.fromHex( S_ID_INIT_VALUE );
	public static final String S_TENANTID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TENANTID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TENANTID_INIT_VALUE );
	public static final String S_TOPDOMAINID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TOPDOMAINID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TOPDOMAINID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final String DESCRIPTION_INIT_VALUE = new String( "" );
	public static final String EMBEDDEDTEXT_INIT_VALUE = new String( "" );
	public static final String FULLTEXT_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa110;
	public final static String S_CLASS_CODE = "a110";

	public int getClassCode();

	public CFDbKeyHash256 getPKey();
	public void setPKey(CFDbKeyHash256 requiredId);
	public ICFKeyHash256 getRequiredId();
	public void setRequiredId( ICFKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public ISecureProtTenant getRequiredOwnerTenant();

	public void setRequiredOwnerTenant(ICFKeyHash256 argTenantId);

	public void setRequiredOwnerTenant(ISecurePubTenant argObj);

	public IIntNetProtTopDomain getRequiredContainerTopDomain();

	public void setRequiredContainerTopDomain(ICFKeyHash256 argTopDomainId);


	public void setRequiredContainerTopDomain(IIntNetProtTopDomain argObj);

	public void setRequiredContainerTopDomain(IIntNetPubTopDomain argObj);

	public ICFKeyHash256 getRequiredTenantId();
	public void setRequiredTenantId( ICFKeyHash256 value );
	public ICFKeyHash256 getRequiredTopDomainId();
	public void setRequiredTopDomainId( ICFKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public String getOptionalDescription();
	public void setOptionalDescription( String value );
	public String getOptionalEmbeddedText();
	public void setOptionalEmbeddedText( String value );
	public String getOptionalFullText();
	public void setOptionalFullText( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IIntNetProtLicense src );

	public void setLicense( IIntNetProtLicense src );

	public void set( IIntNetProtLicenseH src );

	public void setLicense( IIntNetProtLicenseH src );

	public void set( IIntNetPubLicense src );

	public void setLicense( IIntNetPubLicense src );

	public void set( IIntNetPubLicenseH src );

	public void setLicense( IIntNetPubLicenseH src );

	public String getXmlAttrFragment();

	public String toString();
}
