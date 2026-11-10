// Description: Java 11 implementation of a SecDevice primary key object.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSec;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.apache.commons.codec.binary.Base64;

/*
 *	YCFSecSecDevicePKey Primary Key for SecDevice

 *		requiredSecUserId	Required object attribute SecUserId.
 *		requiredDevName	Required object attribute DevName. */
public class YCFSecSecDevicePKey
	implements Comparable<Object>,
		Serializable
{

	protected UUID requiredSecUserId;
	protected String requiredDevName;
	public YCFSecSecDevicePKey() {
		requiredSecUserId = UUID.fromString( YCFSecSecDeviceBuff.SECUSERID_INIT_VALUE.toString() );
		requiredDevName = new String( YCFSecSecDeviceBuff.DEVNAME_INIT_VALUE );
	}

	public UUID getRequiredSecUserId() {
		return( requiredSecUserId );
	}

	public void setRequiredSecUserId( UUID value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredSecUserId",
				1,
				"value" );
		}
		requiredSecUserId = value;
	}

	public String getRequiredDevName() {
		return( requiredDevName );
	}

	public void setRequiredDevName( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredDevName",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredDevName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredDevName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecSecDeviceHPKey ) {
			YCFSecSecDeviceHPKey rhs = (YCFSecSecDeviceHPKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredDevName().equals( rhs.getRequiredDevName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecDevicePKey ) {
			YCFSecSecDevicePKey rhs = (YCFSecSecDevicePKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredDevName().equals( rhs.getRequiredDevName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecDeviceHBuff ) {
			YCFSecSecDeviceHBuff rhs = (YCFSecSecDeviceHBuff)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredDevName().equals( rhs.getRequiredDevName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecDeviceBuff ) {
			YCFSecSecDeviceBuff rhs = (YCFSecSecDeviceBuff)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredDevName().equals( rhs.getRequiredDevName() ) ) {
				return( false );
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getRequiredDevName() != null ) {
			hashCode = hashCode + getRequiredDevName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecSecDeviceHPKey ) {
			YCFSecSecDeviceHPKey rhs = (YCFSecSecDeviceHPKey)obj;
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredDevName().compareTo( rhs.getRequiredDevName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecDevicePKey ) {
			YCFSecSecDevicePKey rhs = (YCFSecSecDevicePKey)obj;
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredDevName().compareTo( rhs.getRequiredDevName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecDeviceBuff ) {
			YCFSecSecDeviceBuff rhs = (YCFSecSecDeviceBuff)obj;
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredDevName().compareTo( rhs.getRequiredDevName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecDeviceHBuff ) {
			YCFSecSecDeviceHBuff rhs = (YCFSecSecDeviceHBuff)obj;
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredDevName().compareTo( rhs.getRequiredDevName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"YCFSecSecDevicePKey, YCFSecSecDeviceBuff" );
		}
	}

	public String toString() {
		String ret = "<YCFSecSecDevicePKey"
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " RequiredDevName=" + "\"" + YCFSecSchema.xmlEncodeString( getRequiredDevName() ) + "\""
			+ "/>";
		return( ret );
	}
}
