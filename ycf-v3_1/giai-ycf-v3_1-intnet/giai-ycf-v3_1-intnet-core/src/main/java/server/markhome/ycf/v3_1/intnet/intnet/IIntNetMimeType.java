// Description: Java 25 interface for a MimeType record declementation

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
 *	IIntNetMimeType persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IIntNetMimeType
{
	public static final int MIMETYPEID_MIN_VALUE = 0;
	public static final String S_INIT_CREATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_CREATED_BY = CFDbKeyHash256.fromHex(S_INIT_CREATED_BY);
	public static final String S_INIT_UPDATED_BY = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFDbKeyHash256 INIT_UPDATED_BY = CFDbKeyHash256.fromHex(S_INIT_UPDATED_BY);
	public static final int MIMETYPEID_INIT_VALUE = 0;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final String FILETYPES_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa103;
	public final static String S_CLASS_CODE = "a103";

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
	public void setPKey($implCommaIJavaOptAtomType$ requiredMimeTypeId);
	public int getRequiredMimeTypeId();
	public void setRequiredMimeTypeId( int value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public String getRequiredName();
	public void setRequiredName( String value );
	public String getOptionalFileTypes();
	public void setOptionalFileTypes( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( IIntNetMimeType src );

	public void setMimeType( IIntNetMimeType src );

	public void set( IIntNetMimeTypeH src );

	public void setMimeType( IIntNetMimeTypeH src );

	public void set( IIntNetProtMimeType src );

	public void setMimeType( IIntNetProtMimeType src );

	public void set( IIntNetProtMimeTypeH src );

	public void setMimeType( IIntNetProtMimeTypeH src );

	public void set( IIntNetPubMimeType src );

	public void setMimeType( IIntNetPubMimeType src );

	public void set( IIntNetPubMimeTypeH src );

	public void setMimeType( IIntNetPubMimeTypeH src );

	public String getXmlAttrFragment();

	public String toString();
}
