// Description: Java 25 interface for a SecUserEMConf record declementation

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
 *	ISecureSecUserEMConf persistence instances have CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 */
public interface ISecureSecUserEMConf
{
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final String S_SECUSERID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SECUSERID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SECUSERID_INIT_VALUE );
	public static final String CONFIRMEMAILADDR_INIT_VALUE = new String( "" );
	public static final LocalDateTime EMAILSENTSTAMP_INIT_VALUE = CFXmlUtil.parseTimestamp("2020-01-01T00:00:00");
	public final static boolean NEWACCOUNT_INIT_VALUE = false;
	public final static int CLASS_CODE = 0xa00b;
	public final static String S_CLASS_CODE = "a00b";

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
	public ISecureSecUser getRequiredContainerUser();

	public void setRequiredContainerUser(ICFKeyHash256 argSecUserId);

	public void setRequiredContainerUser(ISecureSecUser argObj);

	public void setRequiredContainerUser(ISecureProtSecUser argObj);

	public void setRequiredContainerUser(ISecurePubSecUser argObj);

	public ICFKeyHash256 getRequiredSecUserId();
	public void setRequiredSecUserId( ICFKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public String getRequiredConfirmEMailAddr();
	public void setRequiredConfirmEMailAddr( String value );
	public LocalDateTime getRequiredEMailSentStamp();
	public void setRequiredEMailSentStamp( LocalDateTime value );
	public ICFUuid6 getRequiredEMConfirmationUuid6();
	public void setRequiredEMConfirmationUuid6( ICFUuid6 value );
	public boolean getRequiredNewAccount();
	public void setRequiredNewAccount( boolean value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( ISecureSecUserEMConf src );

	public void setSecUserEMConf( ISecureSecUserEMConf src );

	public void set( ISecureSecUserEMConfH src );

	public void setSecUserEMConf( ISecureSecUserEMConfH src );

	public void set( ISecureProtSecUserEMConf src );

	public void setSecUserEMConf( ISecureProtSecUserEMConf src );

	public void set( ISecureProtSecUserEMConfH src );

	public void setSecUserEMConf( ISecureProtSecUserEMConfH src );

	public String getXmlAttrFragment();

	public String toString();
}
