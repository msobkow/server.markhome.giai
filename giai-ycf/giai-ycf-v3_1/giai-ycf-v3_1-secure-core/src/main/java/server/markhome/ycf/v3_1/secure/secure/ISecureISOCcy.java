// Description: Java 25 interface for a ISOCcy record declementation

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
 *	ISecureISOCcy persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecureISOCcy
{
	public static final short ISOCCYID_MIN_VALUE = (short)0;
	public static final short PRECIS_MIN_VALUE = (short)0;
	public static final short PRECIS_MAX_VALUE = (short)5;
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final short ISOCCYID_INIT_VALUE = (short)0;
	public static final String ISOCODE_INIT_VALUE = new String( "" );
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final short PRECIS_INIT_VALUE = (short)0;
	public final static int CLASS_CODE = 0xa003;
	public final static String S_CLASS_CODE = "a003";

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
	public void setPKey($implCommaIJavaOptAtomType$ requiredISOCcyId);
	public List<ISecureISOCtryCcy> getOptionalChildrenCtry();

	public short getRequiredISOCcyId();
	public void setRequiredISOCcyId( short value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public String getRequiredISOCode();
	public void setRequiredISOCode( String value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public String getOptionalUnitSymbol();
	public void setOptionalUnitSymbol( String value );
	public short getRequiredPrecis();
	public void setRequiredPrecis( short value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( ISecureISOCcy src );

	public void setISOCcy( ISecureISOCcy src );

	public void set( ISecureISOCcyH src );

	public void setISOCcy( ISecureISOCcyH src );

	public void set( ISecureProtISOCcy src );

	public void setISOCcy( ISecureProtISOCcy src );

	public void set( ISecureProtISOCcyH src );

	public void setISOCcy( ISecureProtISOCcyH src );

	public void set( ISecurePubISOCcy src );

	public void setISOCcy( ISecurePubISOCcy src );

	public void set( ISecurePubISOCcyH src );

	public void setISOCcy( ISecurePubISOCcyH src );

	public String getXmlAttrFragment();

	public String toString();
}
