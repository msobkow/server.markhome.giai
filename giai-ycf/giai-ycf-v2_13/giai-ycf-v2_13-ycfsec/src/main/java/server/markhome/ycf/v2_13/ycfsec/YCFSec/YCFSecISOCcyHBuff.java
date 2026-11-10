// Description: Java 11 implementation of a ISOCcy history buffer object.

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

public class YCFSecISOCcyHBuff

	extends YCFSecHPKey	implements Comparable<Object>,
		Serializable
{
	public static final short ISOCCYID_INIT_VALUE = (short)0;
	public static final String ISOCODE_INIT_VALUE = new String( "" );
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final short PRECIS_INIT_VALUE = (short)0;
	public static final short ISOCCYID_MIN_VALUE = (short)0;
	public static final short PRECIS_MIN_VALUE = (short)0;
	public static final short PRECIS_MAX_VALUE = (short)5;

	protected short requiredISOCcyId;
	protected String requiredISOCode;
	protected String requiredName;
	protected String optionalUnitSymbol;
	protected short requiredPrecis;
	public YCFSecISOCcyHBuff() {
		super();
		requiredISOCcyId = YCFSecISOCcyBuff.ISOCCYID_INIT_VALUE;
		requiredISOCode = new String( YCFSecISOCcyBuff.ISOCODE_INIT_VALUE );
		requiredName = new String( YCFSecISOCcyBuff.NAME_INIT_VALUE );
		optionalUnitSymbol = null;
		requiredPrecis = YCFSecISOCcyBuff.PRECIS_INIT_VALUE;
	}

	public String getClassCode() {
		return( YCFSecISOCcyBuff.CLASS_CODE );
	}

	public short getRequiredISOCcyId() {
		return( requiredISOCcyId );
	}

	public void setRequiredISOCcyId( short value ) {
		if( value < YCFSecISOCcyBuff.ISOCCYID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredISOCcyId",
				1,
				"value",
				value,
				YCFSecISOCcyBuff.ISOCCYID_MIN_VALUE );
		}
		requiredISOCcyId = value;
	}

	public String getRequiredISOCode() {
		return( requiredISOCode );
	}

	public void setRequiredISOCode( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredISOCode",
				1,
				"value" );
		}
		if( value.length() > 3 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredISOCode",
				1,
				"value.length()",
				value.length(),
				3 );
		}
		requiredISOCode = value;
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 64 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredName = value;
	}

	public String getOptionalUnitSymbol() {
		return( optionalUnitSymbol );
	}

	public void setOptionalUnitSymbol( String value ) {
		if( value == null ) {
			optionalUnitSymbol = null;
		}
		else if( value.length() > 4 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setOptionalUnitSymbol",
				1,
				"value.length()",
				value.length(),
				4 );
		}
		else {
			optionalUnitSymbol = value;
		}
	}

	public short getRequiredPrecis() {
		return( requiredPrecis );
	}

	public void setRequiredPrecis( short value ) {
		if( value < YCFSecISOCcyBuff.PRECIS_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredPrecis",
				1,
				"value",
				value,
				YCFSecISOCcyBuff.PRECIS_MIN_VALUE );
		}
		if( value > YCFSecISOCcyBuff.PRECIS_MAX_VALUE ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredPrecis",
				1,
				"value",
				value,
				YCFSecISOCcyBuff.PRECIS_MAX_VALUE );
		}
		requiredPrecis = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof YCFSecISOCcyHBuff ) {
			YCFSecISOCcyHBuff rhs = (YCFSecISOCcyHBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( getOptionalUnitSymbol() != null ) {
				if( rhs.getOptionalUnitSymbol() != null ) {
					if( ! getOptionalUnitSymbol().equals( rhs.getOptionalUnitSymbol() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalUnitSymbol() != null ) {
					return( false );
				}
			}
			if( getRequiredPrecis() != rhs.getRequiredPrecis() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCcyBuff ) {
			YCFSecISOCcyBuff rhs = (YCFSecISOCcyBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			if( getOptionalUnitSymbol() != null ) {
				if( rhs.getOptionalUnitSymbol() != null ) {
					if( ! getOptionalUnitSymbol().equals( rhs.getOptionalUnitSymbol() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalUnitSymbol() != null ) {
					return( false );
				}
			}
			if( getRequiredPrecis() != rhs.getRequiredPrecis() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCcyByCcyCdIdxKey ) {
			YCFSecISOCcyByCcyCdIdxKey rhs = (YCFSecISOCcyByCcyCdIdxKey)obj;
			if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCcyByCcyNmIdxKey ) {
			YCFSecISOCcyByCcyNmIdxKey rhs = (YCFSecISOCcyByCcyNmIdxKey)obj;
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCcyHPKey ) {
			YCFSecISOCcyHPKey rhs = (YCFSecISOCcyHPKey)obj;
			{
				long lhsClusterId = getAuditClusterId();
				long rhsClusterId = rhs.getAuditClusterId();
				if( lhsClusterId != rhsClusterId ) {
					return( false );
				}
			}
			{
				Calendar lhsAuditStamp = getAuditStamp();
				Calendar rhsAuditStamp = rhs.getAuditStamp();
				if( lhsAuditStamp != null ) {
					if( rhsAuditStamp != null ) {
						if( ! lhsAuditStamp.equals( rhsAuditStamp ) ) {
							return( false );
						}
					}
					else {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			{
				short lhsActionId = getAuditActionId();
				short rhsActionId = rhs.getAuditActionId();
				if( lhsActionId != rhsActionId ) {
					return( false );
				}
			}
			{
				int lhsRevision = getRequiredRevision();
				int rhsRevision = rhs.getRequiredRevision();
				if( lhsRevision != rhsRevision ) {
					return( false );
				}
			}
			{
				UUID lhsAuditSessionId = getAuditSessionId();
				UUID rhsAuditSessionId = rhs.getAuditSessionId();
				if( lhsAuditSessionId != null ) {
					if( rhsAuditSessionId != null ) {
						if( ! lhsAuditSessionId.equals( rhsAuditSessionId ) ) {
							return( false );
						}
					}
					else {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecHPKey ) {
			YCFSecHPKey rhs = (YCFSecHPKey)obj;
			{
				long lhsClusterId = getAuditClusterId();
				long rhsClusterId = rhs.getAuditClusterId();
				if( lhsClusterId != rhsClusterId ) {
					return( false );
				}
			}
			{
				Calendar lhsAuditStamp = getAuditStamp();
				Calendar rhsAuditStamp = rhs.getAuditStamp();
				if( lhsAuditStamp != null ) {
					if( rhsAuditStamp != null ) {
						if( ! lhsAuditStamp.equals( rhsAuditStamp ) ) {
							return( false );
						}
					}
					else {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			{
				short lhsActionId = getAuditActionId();
				short rhsActionId = rhs.getAuditActionId();
				if( lhsActionId != rhsActionId ) {
					return( false );
				}
			}
			{
				int lhsRevision = getRequiredRevision();
				int rhsRevision = rhs.getRequiredRevision();
				if( lhsRevision != rhsRevision ) {
					return( false );
				}
			}
			{
				UUID lhsAuditSessionId = getAuditSessionId();
				UUID rhsAuditSessionId = rhs.getAuditSessionId();
				if( lhsAuditSessionId != null ) {
					if( rhsAuditSessionId != null ) {
						if( ! lhsAuditSessionId.equals( rhsAuditSessionId ) ) {
							return( false );
						}
					}
					else {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCcyPKey ) {
			YCFSecISOCcyPKey rhs = (YCFSecISOCcyPKey)obj;
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else {
			return( super.equals( obj ) );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = ( hashCode * 0x10000 ) + getRequiredISOCcyId();
		if( getRequiredISOCode() != null ) {
			hashCode = hashCode + getRequiredISOCode().hashCode();
		}
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalUnitSymbol() != null ) {
			hashCode = hashCode + getOptionalUnitSymbol().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredPrecis();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecISOCcyBuff ) {
			YCFSecISOCcyBuff rhs = (YCFSecISOCcyBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecISOCcyByCcyCdIdxKey ) {
			YCFSecISOCcyByCcyCdIdxKey rhs = (YCFSecISOCcyByCcyCdIdxKey)obj;

			{
				int cmp = getRequiredISOCode().compareTo( rhs.getRequiredISOCode() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecISOCcyByCcyNmIdxKey ) {
			YCFSecISOCcyByCcyNmIdxKey rhs = (YCFSecISOCcyByCcyNmIdxKey)obj;

			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecISOCcyHBuff ) {
			YCFSecISOCcyHBuff rhs = (YCFSecISOCcyHBuff)obj;

			int retval = 0;
			{
				long lhsAuditClusterId = getAuditClusterId();
				long rhsAuditClusterId = rhs.getAuditClusterId();
				if( lhsAuditClusterId < rhsAuditClusterId ) {
					return( -1 );
				}
				else if( lhsAuditClusterId > rhsAuditClusterId ) {
					return( 1 );
				}
			}
			{
				Calendar lhsAuditStamp = getAuditStamp();
				Calendar rhsAuditStamp = rhs.getAuditStamp();
				if( lhsAuditStamp == null ) {
					if( rhsAuditStamp != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditStamp == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditStamp.compareTo( rhsAuditStamp );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
				}
			}
			{
				short lhsAuditActionId = getAuditActionId();
				short rhsAuditActionId = rhs.getAuditActionId();
				if( lhsAuditActionId < rhsAuditActionId ) {
					return( -1 );
				}
				else if( lhsAuditActionId > rhsAuditActionId ) {
					return( 1 );
				}
			}
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
				UUID lhsAuditSessionId = getAuditSessionId();
				UUID rhsAuditSessionId = rhs.getAuditSessionId();
				if( lhsAuditSessionId == null ) {
					if( rhsAuditSessionId != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditSessionId == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditSessionId.compareTo( rhsAuditSessionId );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
				}
			}
			{
				long lhsAuditClusterId = getAuditClusterId();
				long rhsAuditClusterId = rhs.getAuditClusterId();
				if( lhsAuditClusterId < rhsAuditClusterId ) {
					return( -1 );
				}
				else if( lhsAuditClusterId > rhsAuditClusterId ) {
					return( 1 );
				}
			}
			{
				Calendar lhsAuditStamp = getAuditStamp();
				Calendar rhsAuditStamp = rhs.getAuditStamp();
				if( lhsAuditStamp == null ) {
					if( rhsAuditStamp != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditStamp == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditStamp.compareTo( rhsAuditStamp );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
				}
			}
			{
				short lhsAuditActionId = getAuditActionId();
				short rhsAuditActionId = rhs.getAuditActionId();
				if( lhsAuditActionId < rhsAuditActionId ) {
					return( -1 );
				}
				else if( lhsAuditActionId > rhsAuditActionId ) {
					return( 1 );
				}
			}
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
				UUID lhsAuditSessionId = getAuditSessionId();
				UUID rhsAuditSessionId = rhs.getAuditSessionId();
				if( lhsAuditSessionId == null ) {
					if( rhsAuditSessionId != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditSessionId == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditSessionId.compareTo( rhsAuditSessionId );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
				}
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredISOCode().compareTo( rhs.getRequiredISOCode() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalUnitSymbol() != null ) {
				if( rhs.getOptionalUnitSymbol() != null ) {
					int cmp = getOptionalUnitSymbol().compareTo( rhs.getOptionalUnitSymbol() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalUnitSymbol() != null ) {
					return( -1 );
				}
			}
			if( getRequiredPrecis() < rhs.getRequiredPrecis() ) {
				return( -1 );
			}
			else if( getRequiredPrecis() > rhs.getRequiredPrecis() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecISOCcyHPKey ) {
			YCFSecISOCcyHPKey rhs = (YCFSecISOCcyHPKey)obj;
			{
				long lhsAuditClusterId = getAuditClusterId();
				long rhsAuditClusterId = rhs.getAuditClusterId();
				if( lhsAuditClusterId < rhsAuditClusterId ) {
					return( -1 );
				}
				else if( lhsAuditClusterId > rhsAuditClusterId ) {
					return( 1 );
				}
			}
			{
				Calendar lhsAuditStamp = getAuditStamp();
				Calendar rhsAuditStamp = rhs.getAuditStamp();
				if( lhsAuditStamp == null ) {
					if( rhsAuditStamp != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditStamp == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditStamp.compareTo( rhsAuditStamp );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
				}
			}
			{
				short lhsAuditActionId = getAuditActionId();
				short rhsAuditActionId = rhs.getAuditActionId();
				if( lhsAuditActionId < rhsAuditActionId ) {
					return( -1 );
				}
				else if( lhsAuditActionId > rhsAuditActionId ) {
					return( 1 );
				}
			}
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
				UUID lhsAuditSessionId = getAuditSessionId();
				UUID rhsAuditSessionId = rhs.getAuditSessionId();
				if( lhsAuditSessionId == null ) {
					if( rhsAuditSessionId != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditSessionId == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditSessionId.compareTo( rhsAuditSessionId );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
				}
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecISOCcyPKey ) {
			YCFSecISOCcyPKey rhs = (YCFSecISOCcyPKey)obj;
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecHPKey ) {
			YCFSecHPKey rhs = (YCFSecHPKey)obj;
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
			return( 0 );
		}
		else {
			return( super.compareTo( obj ) );
		}
	}

	public void set( YCFSecISOCcyBuff src ) {
		setISOCcyBuff( src );
	}

	public void setISOCcyBuff( YCFSecISOCcyBuff src ) {
		setRequiredISOCcyId( src.getRequiredISOCcyId() );
		setRequiredISOCode( src.getRequiredISOCode() );
		setRequiredName( src.getRequiredName() );
		setOptionalUnitSymbol( src.getOptionalUnitSymbol() );
		setRequiredPrecis( src.getRequiredPrecis() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( YCFSecISOCcyHBuff src ) {
		setISOCcyBuff( src );
	}

	public void setISOCcyBuff( YCFSecISOCcyHBuff src ) {
		setRequiredISOCcyId( src.getRequiredISOCcyId() );
		setRequiredISOCode( src.getRequiredISOCode() );
		setRequiredName( src.getRequiredName() );
		setOptionalUnitSymbol( src.getOptionalUnitSymbol() );
		setRequiredPrecis( src.getRequiredPrecis() );
		setRequiredRevision( src.getRequiredRevision() );
	}
}
