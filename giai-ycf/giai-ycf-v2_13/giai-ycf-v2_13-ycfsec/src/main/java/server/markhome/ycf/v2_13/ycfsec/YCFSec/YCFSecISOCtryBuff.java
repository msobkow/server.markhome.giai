// Description: Java 11 implementation of a ISOCtry buffer object.

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

public class YCFSecISOCtryBuff
{
	public final static String CLASS_CODE = "a004";
	public final static String S_INIT_CREATEDBY = "654dbba0-eda7-11e1-aff1-0800200c9a66";
	public final static UUID INIT_CREATEDBY = UUID.fromString( S_INIT_CREATEDBY );
	public final static String S_INIT_UPDATEDBY = "654dbba0-eda7-11e1-aff1-0800200c9a66";
	public final static UUID INIT_UPDATEDBY = UUID.fromString( S_INIT_UPDATEDBY );
	public static final short ISOCTRYID_INIT_VALUE = (short)0;
	public static final String ISOCODE_INIT_VALUE = new String( "" );
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final short ISOCTRYID_MIN_VALUE = (short)0;
	protected UUID createdByUserId = YCFSecISOCtryBuff.INIT_CREATEDBY;
	protected Calendar createdAt = Calendar.getInstance();
	protected UUID updatedByUserId = YCFSecISOCtryBuff.INIT_UPDATEDBY;
	protected Calendar updatedAt = Calendar.getInstance();
	protected short requiredISOCtryId;
	protected String requiredISOCode;
	protected String requiredName;
	protected int requiredRevision;
	public YCFSecISOCtryBuff() {
		requiredISOCtryId = YCFSecISOCtryBuff.ISOCTRYID_INIT_VALUE;
		requiredISOCode = new String( YCFSecISOCtryBuff.ISOCODE_INIT_VALUE );
		requiredName = new String( YCFSecISOCtryBuff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public UUID getCreatedByUserId() {
		return( createdByUserId );
	}

	public void setCreatedByUserId( UUID value ) {
		createdByUserId = value;
	}

	public Calendar getCreatedAt() {
		return( createdAt );
	}

	public void setCreatedAt( Calendar value ) {
		createdAt = value;
	}

	public UUID getUpdatedByUserId() {
		return( updatedByUserId );
	}

	public void setUpdatedByUserId( UUID value ) {
		updatedByUserId = value;
	}

	public Calendar getUpdatedAt() {
		return( updatedAt );
	}

	public void setUpdatedAt( Calendar value ) {
		updatedAt = value;
	}
	public short getRequiredISOCtryId() {
		return( requiredISOCtryId );
	}

	public void setRequiredISOCtryId( short value ) {
		if( value < YCFSecISOCtryBuff.ISOCTRYID_MIN_VALUE ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				"setRequiredISOCtryId",
				1,
				"value",
				value,
				YCFSecISOCtryBuff.ISOCTRYID_MIN_VALUE );
		}
		requiredISOCtryId = value;
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
		if( value.length() > 2 ) {
			throw new YCFLibArgumentOverflowException( getClass(),
				"setRequiredISOCode",
				1,
				"value.length()",
				value.length(),
				2 );
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
		else if( obj instanceof YCFSecISOCtryBuff ) {
			YCFSecISOCtryBuff rhs = (YCFSecISOCtryBuff)obj;
			if( ! getCreatedByUserId().equals( rhs.getCreatedByUserId() ) ) {
				return( false );
			}
			if( ! getCreatedAt().equals( rhs.getCreatedAt() ) ) {
				return( false );
			}
			if( ! getUpdatedByUserId().equals( rhs.getUpdatedByUserId() ) ) {
				return( false );
			}
			if( ! getUpdatedAt().equals( rhs.getUpdatedAt() ) ) {
				return( false );
			}
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCtryPKey ) {
			YCFSecISOCtryPKey rhs = (YCFSecISOCtryPKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCtryHBuff ) {
			YCFSecISOCtryHBuff rhs = (YCFSecISOCtryHBuff)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCtryHPKey ) {
			YCFSecISOCtryHPKey rhs = (YCFSecISOCtryHPKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCtryByISOCodeIdxKey ) {
			YCFSecISOCtryByISOCodeIdxKey rhs = (YCFSecISOCtryByISOCodeIdxKey)obj;
			if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof YCFSecISOCtryByNameIdxKey ) {
			YCFSecISOCtryByNameIdxKey rhs = (YCFSecISOCtryByNameIdxKey)obj;
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
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
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = ( hashCode * 0x10000 ) + getRequiredISOCtryId();
		if( getRequiredISOCode() != null ) {
			hashCode = hashCode + getRequiredISOCode().hashCode();
		}
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof YCFSecISOCtryBuff ) {
			YCFSecISOCtryBuff rhs = (YCFSecISOCtryBuff)obj;
			int retval = 0;
			{
				int cmp = getCreatedByUserId().compareTo( rhs.getCreatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getCreatedAt().compareTo( rhs.getCreatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedByUserId().compareTo( rhs.getUpdatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedAt().compareTo( rhs.getUpdatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
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
			return( 0 );
		}
		else if( obj instanceof YCFSecISOCtryPKey ) {
			YCFSecISOCtryPKey rhs = (YCFSecISOCtryPKey)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecISOCtryHPKey ) {
			YCFSecISOCtryHPKey rhs = (YCFSecISOCtryHPKey)obj;
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
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof YCFSecISOCtryHBuff ) {
			YCFSecISOCtryHBuff rhs = (YCFSecISOCtryHBuff)obj;
			int retval = 0;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
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
			return( 0 );
		}
		else if( obj instanceof YCFSecISOCtryByISOCodeIdxKey ) {
			YCFSecISOCtryByISOCodeIdxKey rhs = (YCFSecISOCtryByISOCodeIdxKey)obj;

			{
				int cmp = getRequiredISOCode().compareTo( rhs.getRequiredISOCode() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof YCFSecISOCtryByNameIdxKey ) {
			YCFSecISOCtryByNameIdxKey rhs = (YCFSecISOCtryByNameIdxKey)obj;

			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
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

	public void set( YCFSecISOCtryBuff src ) {
		setISOCtryBuff( src );
	}

	public void setISOCtryBuff( YCFSecISOCtryBuff src ) {
		setRequiredISOCtryId( src.getRequiredISOCtryId() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredISOCode( src.getRequiredISOCode() );
		setRequiredName( src.getRequiredName() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( YCFSecISOCtryHBuff src ) {
		setISOCtryBuff( src );
	}

	public void setISOCtryBuff( YCFSecISOCtryHBuff src ) {
		setRequiredISOCtryId( src.getRequiredISOCtryId() );
		setRequiredISOCode( src.getRequiredISOCode() );
		setRequiredName( src.getRequiredName() );
	}
}
