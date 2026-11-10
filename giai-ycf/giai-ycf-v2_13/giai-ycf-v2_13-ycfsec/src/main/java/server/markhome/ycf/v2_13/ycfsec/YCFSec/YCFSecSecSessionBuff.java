// Description: Java 11 implementation of a SecSession buffer object.

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

public class YCFSecSecSessionBuff
{
	public final static String CLASS_CODE = "a010";
	public static final UUID SECSESSIONID_INIT_VALUE = UUID.fromString( "654dbba0-eda7-11e1-aff1-0800200c9a66" );
	public static final UUID SECUSERID_INIT_VALUE = UUID.fromString( "654dbba0-eda7-11e1-aff1-0800200c9a66" );
	public static final String SECDEVNAME_INIT_VALUE = new String( "" );
	public static final Calendar START_INIT_VALUE = YCFLib.getUTCGregorianCalendar( 2020, 0, 1, 0, 0, 0 );
	public static final UUID SECPROXYID_INIT_VALUE = UUID.fromString( "654dbba0-eda7-11e1-aff1-0800200c9a66" );
	protected UUID requiredSecSessionId;
	protected UUID requiredSecUserId;
	protected String optionalSecDevName;
	protected Calendar requiredStart;
	protected Calendar optionalFinish;
	protected UUID optionalSecProxyId;
	protected int requiredRevision;
	public YCFSecSecSessionBuff() {
		requiredSecSessionId = UUID.fromString( YCFSecSecSessionBuff.SECSESSIONID_INIT_VALUE.toString() );
		requiredSecUserId = UUID.fromString( YCFSecSecSessionBuff.SECUSERID_INIT_VALUE.toString() );
		optionalSecDevName = null;
		requiredStart = YCFLib.getUTCGregorianCalendar( 2020, 0, 1, 0, 0, 0 );
		optionalFinish = null;
		optionalSecProxyId = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public UUID getRequiredSecSessionId() {
		return( requiredSecSessionId );
	}

	public void setRequiredSecSessionId( UUID value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredSecSessionId",
				1,
				"value" );
		}
		requiredSecSessionId = value;
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

	public String getOptionalSecDevName() {
		return( optionalSecDevName );
	}

	public void setOptionalSecDevName( String value ) {
		if( value == null ) {
			optionalSecDevName = null;
		}
		else if( value.length() > 127 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalSecDevName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalSecDevName = value;
		}
	}

	public Calendar getRequiredStart() {
		return( requiredStart );
	}

	public void setRequiredStart( Calendar value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredStart",
				1,
				"value" );
		}
		requiredStart = value;
	}

	public Calendar getOptionalFinish() {
		return( optionalFinish );
	}

	public void setOptionalFinish( Calendar value ) {
		if( value == null ) {
			optionalFinish = null;
		}
		else {
			optionalFinish = value;
		}
	}

	public UUID getOptionalSecProxyId() {
		return( optionalSecProxyId );
	}

	public void setOptionalSecProxyId( UUID value ) {
		if( value == null ) {
			optionalSecProxyId = null;
		}
		else {
			optionalSecProxyId = value;
		}
	}

	public int getRequiredRevision() {
		return( requiredRevision );
	}

	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecSecSessionBuff ) {
			YCFSecSecSessionBuff rhs = (YCFSecSecSessionBuff)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
				return( false );
			}
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( getOptionalSecDevName() != null ) {
				if( rhs.getOptionalSecDevName() != null ) {
					if( ! getOptionalSecDevName().equals( rhs.getOptionalSecDevName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSecDevName() != null ) {
					return( false );
				}
			}
			if( ! getRequiredStart().equals( rhs.getRequiredStart() ) ) {
				return( false );
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					if( ! getOptionalFinish().equals( rhs.getOptionalFinish() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( false );
				}
			}
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					if( ! getOptionalSecProxyId().equals( rhs.getOptionalSecProxyId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionPKey ) {
			YCFSecSecSessionPKey rhs = (YCFSecSecSessionPKey)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionHBuff ) {
			YCFSecSecSessionHBuff rhs = (YCFSecSecSessionHBuff)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
				return( false );
			}
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( getOptionalSecDevName() != null ) {
				if( rhs.getOptionalSecDevName() != null ) {
					if( ! getOptionalSecDevName().equals( rhs.getOptionalSecDevName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSecDevName() != null ) {
					return( false );
				}
			}
			if( ! getRequiredStart().equals( rhs.getRequiredStart() ) ) {
				return( false );
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					if( ! getOptionalFinish().equals( rhs.getOptionalFinish() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( false );
				}
			}
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					if( ! getOptionalSecProxyId().equals( rhs.getOptionalSecProxyId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionHPKey ) {
			YCFSecSecSessionHPKey rhs = (YCFSecSecSessionHPKey)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionBySecUserIdxKey ) {
			YCFSecSecSessionBySecUserIdxKey rhs = (YCFSecSecSessionBySecUserIdxKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionBySecDevIdxKey ) {
			YCFSecSecSessionBySecDevIdxKey rhs = (YCFSecSecSessionBySecDevIdxKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( getOptionalSecDevName() != null ) {
				if( rhs.getOptionalSecDevName() != null ) {
					if( ! getOptionalSecDevName().equals( rhs.getOptionalSecDevName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSecDevName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionByStartIdxKey ) {
			YCFSecSecSessionByStartIdxKey rhs = (YCFSecSecSessionByStartIdxKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredStart().equals( rhs.getRequiredStart() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionByFinishIdxKey ) {
			YCFSecSecSessionByFinishIdxKey rhs = (YCFSecSecSessionByFinishIdxKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					if( ! getOptionalFinish().equals( rhs.getOptionalFinish() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecSecSessionBySecProxyIdxKey ) {
			YCFSecSecSessionBySecProxyIdxKey rhs = (YCFSecSecSessionBySecProxyIdxKey)obj;
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					if( ! getOptionalSecProxyId().equals( rhs.getOptionalSecProxyId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getRequiredSecSessionId().hashCode();
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getOptionalSecDevName() != null ) {
			hashCode = hashCode + getOptionalSecDevName().hashCode();
		}
		if( getRequiredStart() != null ) {
			hashCode = hashCode + getRequiredStart().hashCode();
		}
		if( getOptionalFinish() != null ) {
			hashCode = hashCode + getOptionalFinish().hashCode();
		}
		if( getOptionalSecProxyId() != null ) {
			hashCode = hashCode + getOptionalSecProxyId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecSecSessionBuff ) {
			YCFSecSecSessionBuff rhs = (YCFSecSecSessionBuff)obj;
			int retval = 0;
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalSecDevName() != null ) {
				if( rhs.getOptionalSecDevName() != null ) {
					int cmp = getOptionalSecDevName().compareTo( rhs.getOptionalSecDevName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecDevName() != null ) {
					return( -1 );
				}
			}
			{
				int cmp = getRequiredStart().compareTo( rhs.getRequiredStart() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					int cmp = getOptionalFinish().compareTo( rhs.getOptionalFinish() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					int cmp = getOptionalSecProxyId().compareTo( rhs.getOptionalSecProxyId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionPKey ) {
			YCFSecSecSessionPKey rhs = (YCFSecSecSessionPKey)obj;
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionHPKey ) {
			YCFSecSecSessionHPKey rhs = (YCFSecSecSessionHPKey)obj;
			{
				int lhsRequiredRevision = getRequiredRevision();
				int rhsRequiredRevision = rhs.getRequiredRevision();
				if( lhsRequiredRevision < rhsRequiredRevision ) {
					return( -1 );
				}
				else if( lhsRequiredRevision > rhsRequiredRevision ) {
					return( 1 );
				}
			}
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionHBuff ) {
			YCFSecSecSessionHBuff rhs = (YCFSecSecSessionHBuff)obj;
			int retval = 0;
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalSecDevName() != null ) {
				if( rhs.getOptionalSecDevName() != null ) {
					int cmp = getOptionalSecDevName().compareTo( rhs.getOptionalSecDevName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecDevName() != null ) {
					return( -1 );
				}
			}
			{
				int cmp = getRequiredStart().compareTo( rhs.getRequiredStart() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					int cmp = getOptionalFinish().compareTo( rhs.getOptionalFinish() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( -1 );
				}
			}
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					int cmp = getOptionalSecProxyId().compareTo( rhs.getOptionalSecProxyId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionBySecUserIdxKey ) {
			YCFSecSecSessionBySecUserIdxKey rhs = (YCFSecSecSessionBySecUserIdxKey)obj;

			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionBySecDevIdxKey ) {
			YCFSecSecSessionBySecDevIdxKey rhs = (YCFSecSecSessionBySecDevIdxKey)obj;

			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalSecDevName() != null ) {
				if( rhs.getOptionalSecDevName() != null ) {
					int cmp = getOptionalSecDevName().compareTo( rhs.getOptionalSecDevName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecDevName() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionByStartIdxKey ) {
			YCFSecSecSessionByStartIdxKey rhs = (YCFSecSecSessionByStartIdxKey)obj;

			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredStart().compareTo( rhs.getRequiredStart() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionByFinishIdxKey ) {
			YCFSecSecSessionByFinishIdxKey rhs = (YCFSecSecSessionByFinishIdxKey)obj;

			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalFinish() != null ) {
				if( rhs.getOptionalFinish() != null ) {
					int cmp = getOptionalFinish().compareTo( rhs.getOptionalFinish() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFinish() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecSecSessionBySecProxyIdxKey ) {
			YCFSecSecSessionBySecProxyIdxKey rhs = (YCFSecSecSessionBySecProxyIdxKey)obj;

			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					int cmp = getOptionalSecProxyId().compareTo( rhs.getOptionalSecProxyId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public void set( YCFSecSecSessionBuff src ) {
		setSecSessionBuff( src );
	}

	public void setSecSessionBuff( YCFSecSecSessionBuff src ) {
		setRequiredSecSessionId( src.getRequiredSecSessionId() );
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setOptionalSecDevName( src.getOptionalSecDevName() );
		setRequiredStart( src.getRequiredStart() );
		setOptionalFinish( src.getOptionalFinish() );
		setOptionalSecProxyId( src.getOptionalSecProxyId() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( YCFSecSecSessionHBuff src ) {
		setSecSessionBuff( src );
	}

	public void setSecSessionBuff( YCFSecSecSessionHBuff src ) {
		setRequiredSecSessionId( src.getRequiredSecSessionId() );
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setOptionalSecDevName( src.getOptionalSecDevName() );
		setRequiredStart( src.getRequiredStart() );
		setOptionalFinish( src.getOptionalFinish() );
		setOptionalSecProxyId( src.getOptionalSecProxyId() );
	}
}
