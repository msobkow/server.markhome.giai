// Description: Java 25 interface for a SecUser record declementation

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

package server.markhome.ycf.v3_1.secure.secure;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;

import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/**
 *	ISecureSecUser persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecureSecUser
{
	public static final ISecurePubSchema.SecAccountStatusEnum ACCOUNTSTATUS_MIN_VALUE = ISecurePubSchema.SecAccountStatusEnum.System;
	public static final ISecurePubSchema.SecAccountStatusEnum ACCOUNTSTATUS_MAX_VALUE = ISecurePubSchema.SecAccountStatusEnum.Locked;
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final String S_SECUSERID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SECUSERID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SECUSERID_INIT_VALUE );
	public static final String LOGINID_INIT_VALUE = new String( "" );
	public static final ISecurePubSchema.SecAccountStatusEnum ACCOUNTSTATUS_INIT_VALUE = ISecurePubSchema.ordinalToSecAccountStatusEnum( 5 );
	public static final String DFLTSYSGRPNAME_INIT_VALUE = new String( "" );
	public static final String DFLTCLUSGRPNAME_INIT_VALUE = new String( "" );
	public static final String DFLTTENTGRPNAME_INIT_VALUE = new String( "" );
	public static final String EMAILADDRESS_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa009;
	public final static String S_CLASS_CODE = "a009";

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
	public void setPKey($implCommaIJavaOptAtomType$ requiredSecUserId);
	public List<ISecureSecSession> getOptionalComponentsSecSess();

	public List<ISecureSecSession> getOptionalChildrenSecProxy();

	public ISecureSecUserPassword getOptionalComponentsPassword();

	public ISecureSecUserEMConf getOptionalComponentsEMConf();

	public ISecureSecUserPWReset getOptionalComponentsPWReset();

	public ISecureSecUserPWHistory getOptionalChildrenPWHistory();

	public ICFKeyHash256 getRequiredSecUserId();
	public void setRequiredSecUserId( ICFKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public List<ISecureSecSysGrpMemb> getOptionalChildrenSysSecGrpMemb();

	public List<ISecureSecClusGrpMemb> getOptionalChildrenClusSecGrpMemb();

	public List<ISecureSecTentGrpMemb> getOptionalChildrenTentSecGrpMemb();

	public String getRequiredLoginId();
	public void setRequiredLoginId( String value );
	public ISecurePubSchema.SecAccountStatusEnum getRequiredAccountStatus();
	public void setRequiredAccountStatus( ISecurePubSchema.SecAccountStatusEnum value );
	public String getOptionalDfltSysGrpName();
	public void setOptionalDfltSysGrpName( String value );
	public String getOptionalDfltClusGrpName();
	public void setOptionalDfltClusGrpName( String value );
	public String getOptionalDfltTentGrpName();
	public void setOptionalDfltTentGrpName( String value );
	public String getRequiredEMailAddress();
	public void setRequiredEMailAddress( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( ISecureSecUser src );

	public void setSecUser( ISecureSecUser src );

	public void set( ISecureSecUserH src );

	public void setSecUser( ISecureSecUserH src );

	public void set( ISecureProtSecUser src );

	public void setSecUser( ISecureProtSecUser src );

	public void set( ISecureProtSecUserH src );

	public void setSecUser( ISecureProtSecUserH src );

	public void set( ISecurePubSecUser src );

	public void setSecUser( ISecurePubSecUser src );

	public void set( ISecurePubSecUserH src );

	public void setSecUser( ISecurePubSecUserH src );

	public String getXmlAttrFragment();

	public String toString();
}
