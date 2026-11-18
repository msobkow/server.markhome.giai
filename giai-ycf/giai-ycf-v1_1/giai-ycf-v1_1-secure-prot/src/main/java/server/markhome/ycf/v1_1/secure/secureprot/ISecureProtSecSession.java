// Description: Java 25 protected interface for a SecSession record implementation

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

package server.markhome.ycf.v3_1.secure.secureprot;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/**
 *	ISecureProtSecSession persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecureProtSecSession
{
	public static final String S_SECSESSIONID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SECSESSIONID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SECSESSIONID_INIT_VALUE );
	public static final String S_SECUSERID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SECUSERID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SECUSERID_INIT_VALUE );
	public static final LocalDateTime START_INIT_VALUE = CFXmlUtil.parseTimestamp("2020-01-01T00:00:00");
	public static final String S_SECPROXYID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SECPROXYID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SECPROXYID_INIT_VALUE );
	public final static int CLASS_CODE = 0xa01e;
	public final static String S_CLASS_CODE = "a01e";

	public int getClassCode();

	public CFDbKeyHash256 getPKey();
	public void setPKey(CFDbKeyHash256 requiredSecSessionId);
	public ICFKeyHash256 getRequiredSecSessionId();
	public void setRequiredSecSessionId( ICFKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public ISecureProtSecUser getRequiredContainerSecUser();

	public void setRequiredContainerSecUser(ICFKeyHash256 argSecUserId);


	public void setRequiredContainerSecUser(ISecureProtSecUser argObj);

	public void setRequiredContainerSecUser(ISecurePubSecUser argObj);

	public ISecureProtSecUser getRequiredParentSecProxy();

	public void setRequiredParentSecProxy(ICFKeyHash256 argSecProxyId);


	public void setRequiredParentSecProxy(ISecureProtSecUser argObj);

	public void setRequiredParentSecProxy(ISecurePubSecUser argObj);

	public ICFKeyHash256 getRequiredSecUserId();
	public void setRequiredSecUserId( ICFKeyHash256 value );
	public LocalDateTime getRequiredStart();
	public void setRequiredStart( LocalDateTime value );
	public LocalDateTime getOptionalFinish();
	public void setOptionalFinish( LocalDateTime value );
	public ICFKeyHash256 getOptionalSecProxyId();
	public void setOptionalSecProxyId( ICFKeyHash256 value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( ISecureProtSecSession src );

	public void setSecSession( ISecureProtSecSession src );

	public void set( ISecureProtSecSessionH src );

	public void setSecSession( ISecureProtSecSessionH src );

	public void set( ISecurePubSecSession src );

	public void setSecSession( ISecurePubSecSession src );

	public void set( ISecurePubSecSessionH src );

	public void setSecSession( ISecurePubSecSessionH src );

	public String getXmlAttrFragment();

	public String toString();
}
