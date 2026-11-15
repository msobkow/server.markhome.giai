// Description: Java 25 interface for a ISOLang record declementation

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
 *	ISecureISOLang persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecureISOLang
{
	public static final short ISOLANGID_MIN_VALUE = (short)0;
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final short ISOLANGID_INIT_VALUE = (short)0;
	public static final String ISO6392CODE_INIT_VALUE = new String( "" );
	public static final String ISO6391CODE_INIT_VALUE = new String( "" );
	public static final String ENGLISHNAME_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa007;
	public final static String S_CLASS_CODE = "a007";

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
	public void setPKey($implCommaIJavaOptAtomType$ requiredISOLangId);
	public List<ISecureISOCtryLang> getOptionalChildrenCtry();

	public short getRequiredISOLangId();
	public void setRequiredISOLangId( short value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public String getRequiredISO6392Code();
	public void setRequiredISO6392Code( String value );
	public String getOptionalISO6391Code();
	public void setOptionalISO6391Code( String value );
	public String getRequiredEnglishName();
	public void setRequiredEnglishName( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( ISecureISOLang src );

	public void setISOLang( ISecureISOLang src );

	public void set( ISecureISOLangH src );

	public void setISOLang( ISecureISOLangH src );

	public void set( ISecureProtISOLang src );

	public void setISOLang( ISecureProtISOLang src );

	public void set( ISecureProtISOLangH src );

	public void setISOLang( ISecureProtISOLangH src );

	public void set( ISecurePubISOLang src );

	public void setISOLang( ISecurePubISOLang src );

	public void set( ISecurePubISOLangH src );

	public void setISOLang( ISecurePubISOLangH src );

	public String getXmlAttrFragment();

	public String toString();
}
