// Description: Java 25 implementation of a SecSysGrpInc protected primary key buffer object

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

package server.markhome.ycf.v3_1.secure.secureprot.buff;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	SecureProtSecSysGrpIncPKey protected Primary Key for SecSysGrpInc buffers
 *		requiredSecSysGrpId	Required object attribute SecSysGrpId.
 *		requiredInclName	Required object attribute InclName.
 */
public class SecureProtSecSysGrpIncPKey
	implements ISecureProtSecSysGrpIncPKey, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredSecSysGrpId;
	protected String requiredInclName;

	public SecureProtSecSysGrpIncPKey() {
		requiredSecSysGrpId = CFDbKeyHash256.fromHex( ISecureProtSecSysGrpInc.SECSYSGRPID_INIT_VALUE.toString() );
		requiredInclName = ISecureProtSecSysGrpInc.INCLNAME_INIT_VALUE;
	}

	@Override
	public ICFKeyHash256 getRequiredSecSysGrpId() {
		return(requiredSecSysGrpId);
	}

	public void setRequiredSecSysGrpId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecSysGrpId",
				1,
				"value" );
		}
		requiredSecSysGrpId = value;
	}

	@Override
	public String getRequiredInclName() {
		return(requiredInclName);
	}

	public void setRequiredInclName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredInclName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredInclName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredInclName = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if(obj == this) {
			return( true );
		}
		else if (obj instanceof ISecureProtSecSysGrpIncPKey rhs) {
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredInclName() != null ) {
				if( rhs.getRequiredInclName() != null ) {
					if( ! getRequiredInclName().equals( rhs.getRequiredInclName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredInclName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureProtSecSysGrpIncHPKey rhs) {
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredInclName() != null ) {
				if( rhs.getRequiredInclName() != null ) {
					if( ! getRequiredInclName().equals( rhs.getRequiredInclName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredInclName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureProtSecSysGrpInc rhs) {
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredInclName() != null ) {
				if( rhs.getRequiredInclName() != null ) {
					if( ! getRequiredInclName().equals( rhs.getRequiredInclName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredInclName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof ISecureProtSecSysGrpIncH rhs) {
			if( getRequiredSecSysGrpId() != null ) {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					if( ! getRequiredSecSysGrpId().equals( rhs.getRequiredSecSysGrpId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysGrpId() != null ) {
					return( false );
				}
			}
			if( getRequiredInclName() != null ) {
				if( rhs.getRequiredInclName() != null ) {
					if( ! getRequiredInclName().equals( rhs.getRequiredInclName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredInclName() != null ) {
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
		hashCode = hashCode + getRequiredSecSysGrpId().hashCode();
		if( getRequiredInclName() != null ) {
			hashCode = hashCode + getRequiredInclName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj == this) {
			return( 0 );
		}
		else if (obj instanceof ISecureProtSecSysGrpIncPKey rhs) {
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredInclName() != null) {
				if (rhs.getRequiredInclName() != null) {
					cmp = getRequiredInclName().compareTo( rhs.getRequiredInclName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredInclName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureProtSecSysGrpIncHPKey rhs) {
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredInclName() != null) {
				if (rhs.getRequiredInclName() != null) {
					cmp = getRequiredInclName().compareTo( rhs.getRequiredInclName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredInclName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureProtSecSysGrpInc rhs) {
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredInclName() != null) {
				if (rhs.getRequiredInclName() != null) {
					cmp = getRequiredInclName().compareTo( rhs.getRequiredInclName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredInclName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof ISecureProtSecSysGrpIncH rhs) {
			if (getRequiredSecSysGrpId() != null) {
				if (rhs.getRequiredSecSysGrpId() != null) {
					cmp = getRequiredSecSysGrpId().compareTo( rhs.getRequiredSecSysGrpId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysGrpId() != null) {
				return( -1 );
			}
			if (getRequiredInclName() != null) {
				if (rhs.getRequiredInclName() != null) {
					cmp = getRequiredInclName().compareTo( rhs.getRequiredInclName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredInclName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		return( 0 );
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""  + "\"" + getRequiredSecSysGrpId().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredInclName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureProtSecSysGrpIncPKey" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
