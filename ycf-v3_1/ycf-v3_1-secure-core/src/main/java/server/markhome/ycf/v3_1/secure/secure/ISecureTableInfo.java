// Description: Java 25 interface for a TableInfo record declementation

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
 *	ISecureTableInfo persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ISecureTableInfo
{
	public static final int TABLEINFOID_MIN_VALUE = 0;
	public static final int BACKINGCLASSCODE_MIN_VALUE = 0;
	public static final int RUNTIMECLASSCODE_MIN_VALUE = 0;
	public static final int TABLEINFOID_INIT_VALUE = 0;
	public static final String SCHEMANAME_INIT_VALUE = new String( "" );
	public static final String TABLENAME_INIT_VALUE = new String( "" );
	public static final String SUPERNAME_INIT_VALUE = new String( "" );
	public static final int BACKINGCLASSCODE_INIT_VALUE = 0;
	public static final int RUNTIMECLASSCODE_INIT_VALUE = 0;
	public final static boolean HASHISTORY_INIT_VALUE = false;
	public final static boolean ISMUTABLE_INIT_VALUE = false;
	public static final String SECSCOPENAME_INIT_VALUE = new String( "" );
	public static final String CODEVIS_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa020;
	public final static String S_CLASS_CODE = "a020";

	public int getClassCode();

	public $implCommaIJavaOptAtomType$ getPKey();
	public void setPKey($implCommaIJavaOptAtomType$ requiredTableInfoId);
	public int getRequiredTableInfoId();
	public void setRequiredTableInfoId( int value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public ISecureTableInfo getOptionalParentSuperRef();

	public void setOptionalParentSuperRef(String argSuperName);

	public void setOptionalParentSuperRef(ISecureTableInfo argObj);

	public void setOptionalParentSuperRef(ISecureProtTableInfo argObj);

	public void setOptionalParentSuperRef(ISecurePubTableInfo argObj);

	public List<ISecureTableInfo> getOptionalChildrenSubRefs();

	public String getRequiredSchemaName();
	public void setRequiredSchemaName( String value );
	public String getRequiredTableName();
	public void setRequiredTableName( String value );
	public String getOptionalSuperName();
	public void setOptionalSuperName( String value );
	public int getRequiredBackingClassCode();
	public void setRequiredBackingClassCode( int value );
	public int getRequiredRuntimeClassCode();
	public void setRequiredRuntimeClassCode( int value );
	public boolean getRequiredHasHistory();
	public void setRequiredHasHistory( boolean value );
	public boolean getRequiredIsMutable();
	public void setRequiredIsMutable( boolean value );
	public String getRequiredSecScopeName();
	public void setRequiredSecScopeName( String value );
	public String getRequiredCodeVis();
	public void setRequiredCodeVis( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( ISecureTableInfo src );

	public void setTableInfo( ISecureTableInfo src );

	public void set( ISecureTableInfoH src );

	public void setTableInfo( ISecureTableInfoH src );

	public void set( ISecureProtTableInfo src );

	public void setTableInfo( ISecureProtTableInfo src );

	public void set( ISecureProtTableInfoH src );

	public void setTableInfo( ISecureProtTableInfoH src );

	public void set( ISecurePubTableInfo src );

	public void setTableInfo( ISecurePubTableInfo src );

	public void set( ISecurePubTableInfoH src );

	public void setTableInfo( ISecurePubTableInfoH src );

	public String getXmlAttrFragment();

	public String toString();
}
