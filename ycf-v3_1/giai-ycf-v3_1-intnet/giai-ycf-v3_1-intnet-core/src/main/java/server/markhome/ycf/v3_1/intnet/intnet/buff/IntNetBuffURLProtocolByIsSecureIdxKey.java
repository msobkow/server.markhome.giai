// Description: Java 25 implementation of a URLProtocol by IsSecureIdx index key buffer

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
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;

public class IntNetBuffURLProtocolByIsSecureIdxKey
	implements IIntNetURLProtocolByIsSecureIdxKey, Comparable<Object>, Serializable
{
	protected boolean requiredIsSecure;
	public IntNetBuffURLProtocolByIsSecureIdxKey() {
		requiredIsSecure = IIntNetPubURLProtocol.ISSECURE_INIT_VALUE;
	}

	@Override
	public boolean getRequiredIsSecure() {
		return(requiredIsSecure);
	}

	public void setRequiredIsSecure( boolean value ) {
		requiredIsSecure = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IIntNetURLProtocolByIsSecureIdxKey ) {
			IIntNetURLProtocolByIsSecureIdxKey rhs = (IIntNetURLProtocolByIsSecureIdxKey)obj;
			if( getRequiredIsSecure() != rhs.getRequiredIsSecure() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof IIntNetURLProtocol) {
			IIntNetURLProtocol rhs = (IIntNetURLProtocol)obj;
			if( getRequiredIsSecure() != rhs.getRequiredIsSecure() ) {
				return( false );
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
		if( getRequiredIsSecure() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof IIntNetURLProtocolByIsSecureIdxKey ) {
			IIntNetURLProtocolByIsSecureIdxKey rhs = (IIntNetURLProtocolByIsSecureIdxKey)obj;
			if( getRequiredIsSecure() ) {
				if( ! rhs.getRequiredIsSecure() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsSecure() ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetURLProtocol ) {
			IIntNetURLProtocol rhs = (IIntNetURLProtocol)obj;
			if( getRequiredIsSecure() ) {
				if( ! rhs.getRequiredIsSecure() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsSecure() ) {
					return( -1 );
				}
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
			+ " RequiredIsSecure=" + (( getRequiredIsSecure() ) ? "\"true\"" : "\"false\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<IntNetBuffURLProtocolByIsSecureIdxKey" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
