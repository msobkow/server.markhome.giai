// Description: Java 25 interface for a SecClusGrpMemb record declementation

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
 *	ISecureSecClusGrpMemb persistence instances have CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 */
public interface ISecureSecClusGrpMemb
{
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final String S_SECCLUSGRPID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 SECCLUSGRPID_INIT_VALUE = CFDbKeyHash256.fromHex( S_SECCLUSGRPID_INIT_VALUE );
	public static final String LOGINID_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa013;
	public final static String S_CLASS_CODE = "a013";

	public int getClassCode();

	public CFDbKeyHash256 getCreatedByUserId();

	public void setCreatedByUserId( CFDbKeyHash256 value );

	public LocalDateTime getCreatedAt();

	public void setCreatedAt( LocalDateTime value );

	public CFDbKeyHash256 getUpdatedByUserId();

	public void setUpdatedByUserId( CFDbKeyHash256 value );

	public LocalDateTime getUpdatedAt();

	public void setUpdatedAt( LocalDateTime value );

	public ISecureSecClusGrpMembPKey getPKey();
	public void setPKey(ISecureSecClusGrpMembPKey pkey );
	public ISecureSecClusGrp getRequiredContainerGroup();

	public void setRequiredContainerGroup(ICFKeyHash256 argSecClusGrpId);

	public void setRequiredContainerGroup(ISecureSecClusGrp argObj);

	public void setRequiredContainerGroup(ISecureProtSecClusGrp argObj);

	public ISecureSecUser getRequiredParentUser();

	public void setRequiredParentUser(String argLoginId);

	public void setRequiredParentUser(ISecureSecUser argObj);

	public void setRequiredParentUser(ISecureProtSecUser argObj);

	public void setRequiredParentUser(ISecurePubSecUser argObj);

	public ICFKeyHash256 getRequiredSecClusGrpId();

	public void setRequiredSecClusGrpId(ICFKeyHash256 value);

	public String getRequiredLoginId();

	public void setRequiredLoginId(String value);

	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( ISecureSecClusGrpMemb src );

	public void setSecClusGrpMemb( ISecureSecClusGrpMemb src );

	public void set( ISecureSecClusGrpMembH src );

	public void setSecClusGrpMemb( ISecureSecClusGrpMembH src );

	public void set( ISecureProtSecClusGrpMemb src );

	public void setSecClusGrpMemb( ISecureProtSecClusGrpMemb src );

	public void set( ISecureProtSecClusGrpMembH src );

	public void setSecClusGrpMemb( ISecureProtSecClusGrpMembH src );

	public String getXmlAttrFragment();

	public String toString();
}
