// Description: Java 25 implementation of a IndexCol by ColIdx index key buffer

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

package server.markhome.ycf.v3_1.intnet.intnet.buff;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;

public class BusModelBuffIndexColByColIdxKey
	implements IBusModelIndexColByColIdxKey, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredColumnId;
	public BusModelBuffIndexColByColIdxKey() {
		requiredColumnId = CFDbKeyHash256.fromHex( IBusModelPubIndexCol.COLUMNID_INIT_VALUE.toString() );
	}

	@Override
	public ICFKeyHash256 getRequiredColumnId() {
		return(requiredColumnId);
	}

	public void setRequiredColumnId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredColumnId",
				1,
				"value" );
		}
		requiredColumnId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IBusModelIndexColByColIdxKey ) {
			IBusModelIndexColByColIdxKey rhs = (IBusModelIndexColByColIdxKey)obj;
			if( getRequiredColumnId() != null ) {
				if( rhs.getRequiredColumnId() != null ) {
					if( ! getRequiredColumnId().equals( rhs.getRequiredColumnId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredColumnId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelIndexCol) {
			IBusModelIndexCol rhs = (IBusModelIndexCol)obj;
			if( getRequiredColumnId() != null ) {
				if( rhs.getRequiredColumnId() != null ) {
					if( ! getRequiredColumnId().equals( rhs.getRequiredColumnId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredColumnId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getRequiredColumnId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof IBusModelIndexColByColIdxKey ) {
			IBusModelIndexColByColIdxKey rhs = (IBusModelIndexColByColIdxKey)obj;
			if (getRequiredColumnId() != null) {
				if (rhs.getRequiredColumnId() != null) {
					cmp = getRequiredColumnId().compareTo( rhs.getRequiredColumnId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredColumnId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelIndexCol ) {
			IBusModelIndexCol rhs = (IBusModelIndexCol)obj;
			if (getRequiredColumnId() != null) {
				if (rhs.getRequiredColumnId() != null) {
					cmp = getRequiredColumnId().compareTo( rhs.getRequiredColumnId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredColumnId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredColumnId=" + "\"" + getRequiredColumnId().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelBuffIndexColByColIdxKey" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
