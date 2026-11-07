// Description: Java 25 interface for a TopProject record declementation

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

import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

/**
 *	IIntNetTopProject persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IIntNetTopProject
{
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final String S_ID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 ID_INIT_VALUE = CFDbKeyHash256.fromHex( S_ID_INIT_VALUE );
	public static final String S_TENANTID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TENANTID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TENANTID_INIT_VALUE );
	public static final String S_TOPDOMAINID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 TOPDOMAINID_INIT_VALUE = CFDbKeyHash256.fromHex( S_TOPDOMAINID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final String DESCRIPTION_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa108;
	public final static String S_CLASS_CODE = "a108";

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
	public List<IIntNetSubProject> getOptionalComponentsSubProject();

	public ICFKeyHash256 getRequiredId();
	public void setRequiredId( ICFKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public ISecureTenant getRequiredOwnerTenant();

	public void setRequiredOwnerTenant(ICFKeyHash256 argTenantId);

	public void setRequiredOwnerTenant(ISecurePubTenant argObj);

	public IIntNetTopDomain getRequiredContainerParentSDom();

	public void setRequiredContainerParentSDom(ICFKeyHash256 argTopDomainId);

	public void setRequiredContainerParentSDom(IIntNetTopDomain argObj);

	public void setRequiredContainerParentSDom(IIntNetProtTopDomain argObj);

	public void setRequiredContainerParentSDom(IIntNetPubTopDomain argObj);

	public ICFKeyHash256 getRequiredTenantId();
	public void setRequiredTenantId( ICFKeyHash256 value );
	public ICFKeyHash256 getRequiredTopDomainId();
	public void setRequiredTopDomainId( ICFKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public String getOptionalDescription();
	public void setOptionalDescription( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IIntNetTopProject src );

	public void setTopProject( IIntNetTopProject src );

	public void set( IIntNetTopProjectH src );

	public void setTopProject( IIntNetTopProjectH src );

	public void set( IIntNetProtTopProject src );

	public void setTopProject( IIntNetProtTopProject src );

	public void set( IIntNetProtTopProjectH src );

	public void setTopProject( IIntNetProtTopProjectH src );

	public void set( IIntNetPubTopProject src );

	public void setTopProject( IIntNetPubTopProject src );

	public void set( IIntNetPubTopProjectH src );

	public void setTopProject( IIntNetPubTopProjectH src );

	public String getXmlAttrFragment();

	public String toString();
}
