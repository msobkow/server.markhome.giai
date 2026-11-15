// Description: Java 17 implJustProtementation of a ISOLang buffer

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

package server.markhome.ycf.v3_1.secure.secure.buff;

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

public class SecureProtBuffISOLang
	implements ISecureProtISOLang, Comparable<Object>, Serializable
{
	protected short requiredISOLangId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected String requiredISO6392Code;
	protected String optionalISO6391Code;
	protected String requiredEnglishName;

	public BusModelProtBuffISOLang() {
		requiredISOLangId = ISecurePubISOLang.ISOLANGID_INIT_VALUE;
		requiredISO6392Code = ISecurePubISOLang.ISO6392CODE_INIT_VALUE;
		optionalISO6391Code = null;
		requiredEnglishName = ISecurePubISOLang.ENGLISHNAME_INIT_VALUE;
	}

	@Override
	public Short getPKey() {
		return (requiredISOLangId);
	}

	@Override
	public void setPKey(Short requiredISOLangId) {
		if(requiredISOLangId != null) {
			this.requiredISOLangId = requiredISOLangId;
		}
	}

	@Override
	public short getRequiredISOLangId() {
		return(requiredISOLangId);
	}

	@Override
	public void setRequiredISOLangId( short value ) {
		if( value < ISecurePubISOLang.ISOLANGID_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredISOLangId",
				1,
				"value",
				value,
				ISecurePubISOLang.ISOLANGID_MIN_VALUE );
		}
		requiredISOLangId = value;
	}

	@Override
	public List<ISecureProtISOCtryLang> getOptionalChildrenCtry(short argISOLangId) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenCtry", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtISOCtryLangTable targetTable = targetBackingSecure.getTableISOCtryLang();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenCtry", 0, "ISecureProtSchema.getBackingSecure().getTableISOCtryLang()");
		}
		ISecureProtISOCtryLang[] targetArr = targetTable.readDerivedByLangIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredISOLangId());
		if( targetArr != null ) {
			List<ISecureProtISOCtryLang> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return(results);
		}
		else {
			List<ISecureProtISOCtryLang> results = new ArrayList<>();
			return(results);
		}
	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setJustProtCreatedByUserId( CFDbKeyHash256 value ) {
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setJustProtCreatedAt( LocalDateTime value ) {
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setJustProtUpdatedByUserId( CFDbKeyHash256 value ) {
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setJustProtUpdatedAt( LocalDateTime value ) {
		updatedAt = value;
	}

	@Override
	public int getRequiredRevision() {
		return( requiredRevision );
	}

	@Override
	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	@Override
	public int getClassCode() {
		return( ISecureProtISOLang.CLASS_CODE );
	}

	@Override
	public String getRequiredISO6392Code() {
		return(requiredISO6392Code);
	}

	public void setRequiredISO6392Code( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredISO6392Code",
				1,
				"value" );
		}
		else if( value.length() > 3 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredISO6392Code",
				1,
				"value.length()",
				value.length(),
				3 );
		}
		requiredISO6392Code = value;
	}

	@Override
	public String getOptionalISO6391Code() {
		return(optionalISO6391Code);
	}

	public void setOptionalISO6391Code( String value ) {
		if( value != null && value.length() > 2 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalISO6391Code",
				1,
				"value.length()",
				value.length(),
				2 );
		}
		optionalISO6391Code = value;
	}

	@Override
	public String getRequiredEnglishName() {
		return(requiredEnglishName);
	}

	public void setRequiredEnglishName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredEnglishName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredEnglishName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredEnglishName = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureProtISOLang rhs ) {
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
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			if( getRequiredISO6392Code() != null ) {
				if( rhs.getRequiredISO6392Code() != null ) {
					if( ! getRequiredISO6392Code().equals( rhs.getRequiredISO6392Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredISO6392Code() != null ) {
					return( false );
				}
			}
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					if( ! getOptionalISO6391Code().equals( rhs.getOptionalISO6391Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( false );
				}
			}
			if( getRequiredEnglishName() != null ) {
				if( rhs.getRequiredEnglishName() != null ) {
					if( ! getRequiredEnglishName().equals( rhs.getRequiredEnglishName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnglishName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtISOLangH rhs ) {
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			if( getRequiredISO6392Code() != null ) {
				if( rhs.getRequiredISO6392Code() != null ) {
					if( ! getRequiredISO6392Code().equals( rhs.getRequiredISO6392Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredISO6392Code() != null ) {
					return( false );
				}
			}
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					if( ! getOptionalISO6391Code().equals( rhs.getOptionalISO6391Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( false );
				}
			}
			if( getRequiredEnglishName() != null ) {
				if( rhs.getRequiredEnglishName() != null ) {
					if( ! getRequiredEnglishName().equals( rhs.getRequiredEnglishName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnglishName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtISOLangHPKey ) {
			ISecureProtISOLangHPKey rhs = (ISecureProtISOLangHPKey)obj;
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtISOLangByCode3IdxKey rhs ) {
			if( getRequiredISO6392Code() != null ) {
				if( rhs.getRequiredISO6392Code() != null ) {
					if( ! getRequiredISO6392Code().equals( rhs.getRequiredISO6392Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredISO6392Code() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtISOLangByCode2IdxKey rhs ) {
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					if( ! getOptionalISO6391Code().equals( rhs.getOptionalISO6391Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOLang rhs ) {
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
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			if( getRequiredISO6392Code() != null ) {
				if( rhs.getRequiredISO6392Code() != null ) {
					if( ! getRequiredISO6392Code().equals( rhs.getRequiredISO6392Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredISO6392Code() != null ) {
					return( false );
				}
			}
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					if( ! getOptionalISO6391Code().equals( rhs.getOptionalISO6391Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( false );
				}
			}
			if( getRequiredEnglishName() != null ) {
				if( rhs.getRequiredEnglishName() != null ) {
					if( ! getRequiredEnglishName().equals( rhs.getRequiredEnglishName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnglishName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOLangH rhs ) {
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			if( getRequiredISO6392Code() != null ) {
				if( rhs.getRequiredISO6392Code() != null ) {
					if( ! getRequiredISO6392Code().equals( rhs.getRequiredISO6392Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredISO6392Code() != null ) {
					return( false );
				}
			}
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					if( ! getOptionalISO6391Code().equals( rhs.getOptionalISO6391Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( false );
				}
			}
			if( getRequiredEnglishName() != null ) {
				if( rhs.getRequiredEnglishName() != null ) {
					if( ! getRequiredEnglishName().equals( rhs.getRequiredEnglishName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnglishName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubISOLangHPKey rhs ) {
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtISOLangByCode3IdxKey rhs ) {
			if( getRequiredISO6392Code() != null ) {
				if( rhs.getRequiredISO6392Code() != null ) {
					if( ! getRequiredISO6392Code().equals( rhs.getRequiredISO6392Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredISO6392Code() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtISOLangByCode2IdxKey rhs ) {
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					if( ! getOptionalISO6391Code().equals( rhs.getOptionalISO6391Code() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
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
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = ( hashCode * 0x10000 ) + getRequiredISOLangId();
		if( getRequiredISO6392Code() != null ) {
			hashCode = hashCode + getRequiredISO6392Code().hashCode();
		}
		if( getOptionalISO6391Code() != null ) {
			hashCode = hashCode + getOptionalISO6391Code().hashCode();
		}
		if( getRequiredEnglishName() != null ) {
			hashCode = hashCode + getRequiredEnglishName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecureProtISOLang rhs ) {
			cmp = 0;
			{
				cmp = getCreatedByUserId().compareTo( rhs.getCreatedByUserId() );
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
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
			if (getRequiredISO6392Code() != null) {
				if (rhs.getRequiredISO6392Code() != null) {
					cmp = getRequiredISO6392Code().compareTo( rhs.getRequiredISO6392Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredISO6392Code() != null) {
				return( -1 );
			}
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					cmp = getOptionalISO6391Code().compareTo( rhs.getOptionalISO6391Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( -1 );
				}
			}
			if (getRequiredEnglishName() != null) {
				if (rhs.getRequiredEnglishName() != null) {
					cmp = getRequiredEnglishName().compareTo( rhs.getRequiredEnglishName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEnglishName() != null) {
				return( -1 );
			}
			return( 0 );
 		}
		else if( obj instanceof ISecureProtISOLangHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtISOLangH rhs ) {
			cmp = 0;
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
			if (getRequiredISO6392Code() != null) {
				if (rhs.getRequiredISO6392Code() != null) {
					cmp = getRequiredISO6392Code().compareTo( rhs.getRequiredISO6392Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredISO6392Code() != null) {
				return( -1 );
			}
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					cmp = getOptionalISO6391Code().compareTo( rhs.getOptionalISO6391Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( -1 );
				}
			}
			if (getRequiredEnglishName() != null) {
				if (rhs.getRequiredEnglishName() != null) {
					cmp = getRequiredEnglishName().compareTo( rhs.getRequiredEnglishName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEnglishName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtISOLangByCode3IdxKey rhs ) {
			if (getRequiredISO6392Code() != null) {
				if (rhs.getRequiredISO6392Code() != null) {
					cmp = getRequiredISO6392Code().compareTo( rhs.getRequiredISO6392Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredISO6392Code() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtISOLangByCode2IdxKey rhs ) {
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					cmp = getOptionalISO6391Code().compareTo( rhs.getOptionalISO6391Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubISOLang rhs ) {
			cmp = 0;
			{
				cmp = getCreatedByUserId().compareTo( rhs.getCreatedByUserId() );
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
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
			if (getRequiredISO6392Code() != null) {
				if (rhs.getRequiredISO6392Code() != null) {
					cmp = getRequiredISO6392Code().compareTo( rhs.getRequiredISO6392Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredISO6392Code() != null) {
				return( -1 );
			}
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					cmp = getOptionalISO6391Code().compareTo( rhs.getOptionalISO6391Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( -1 );
				}
			}
			if (getRequiredEnglishName() != null) {
				if (rhs.getRequiredEnglishName() != null) {
					cmp = getRequiredEnglishName().compareTo( rhs.getRequiredEnglishName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEnglishName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubISOLangHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubISOLangH rhs ) {
			cmp = 0;
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
			if (getRequiredISO6392Code() != null) {
				if (rhs.getRequiredISO6392Code() != null) {
					cmp = getRequiredISO6392Code().compareTo( rhs.getRequiredISO6392Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredISO6392Code() != null) {
				return( -1 );
			}
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					cmp = getOptionalISO6391Code().compareTo( rhs.getOptionalISO6391Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( -1 );
				}
			}
			if (getRequiredEnglishName() != null) {
				if (rhs.getRequiredEnglishName() != null) {
					cmp = getRequiredEnglishName().compareTo( rhs.getRequiredEnglishName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEnglishName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubISOLangByCode3IdxKey rhs ) {
			if (getRequiredISO6392Code() != null) {
				if (rhs.getRequiredISO6392Code() != null) {
					cmp = getRequiredISO6392Code().compareTo( rhs.getRequiredISO6392Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredISO6392Code() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubISOLangByCode2IdxKey rhs ) {
			if( getOptionalISO6391Code() != null ) {
				if( rhs.getOptionalISO6391Code() != null ) {
					cmp = getOptionalISO6391Code().compareTo( rhs.getOptionalISO6391Code() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalISO6391Code() != null ) {
					return( -1 );
				}
			}			return( 0 );
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
	public void set( ISecureProtISOLang src ) {
		setJustProtISOLang( src );
	}

	@Override
	public void setISOLang( ISecureProtISOLang src ) {
		setJustProtRequiredISOLangId(src.getRequiredISOLangId());
		setJustProtRequiredRevision( src.getRequiredRevision() );
		setJustProtCreatedByUserId( src.getCreatedByUserId() );
		setJustProtCreatedAt( src.getCreatedAt() );
		setJustProtUpdatedByUserId( src.getUpdatedByUserId() );
		setJustProtUpdatedAt( src.getUpdatedAt() );
		setJustProtRequiredISO6392Code(src.getRequiredISO6392Code());
		setJustProtOptionalISO6391Code(src.getOptionalISO6391Code());
		setJustProtRequiredEnglishName(src.getRequiredEnglishName());
	}

	@Override
	public void set( ISecureProtISOLangH src ) {
		setJustProtISOLang( src );
	}

	@Override
	public void setISOLang( ISecureProtISOLangH src ) {
		setJustProtRequiredISOLangId(src.getRequiredISOLangId());
		setJustProtRequiredISO6392Code(src.getRequiredISO6392Code());
		setJustProtOptionalISO6391Code(src.getOptionalISO6391Code());
		setJustProtRequiredEnglishName(src.getRequiredEnglishName());
	}

	@Override
	public void set( ISecurePubISOLang src ) {
		setJustProtISOLang( src );
	}

	@Override
	public void setISOLang( ISecurePubISOLang src ) {
		setJustProtRequiredISOLangId(src.getRequiredISOLangId());
		setJustProtRequiredRevision( src.getRequiredRevision() );
		setJustProtCreatedByUserId( src.getCreatedByUserId() );
		setJustProtCreatedAt( src.getCreatedAt() );
		setJustProtUpdatedByUserId( src.getUpdatedByUserId() );
		setJustProtUpdatedAt( src.getUpdatedAt() );
		setJustProtRequiredISO6392Code(src.getRequiredISO6392Code());
		setJustProtOptionalISO6391Code(src.getOptionalISO6391Code());
		setJustProtRequiredEnglishName(src.getRequiredEnglishName());
	}

	@Override
	public void set( ISecurePubISOLangH src ) {
		setJustProtISOLang( src );
	}

	@Override
	public void setISOLang( ISecurePubISOLangH src ) {
		setJustProtRequiredISOLangId(src.getRequiredISOLangId());
		setJustProtRequiredISO6392Code(src.getRequiredISO6392Code());
		setJustProtOptionalISO6391Code(src.getOptionalISO6391Code());
		setJustProtRequiredEnglishName(src.getRequiredEnglishName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + Short.toString( getRequiredISOLangId() ) + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredISO6392Code() ) + "\"" + ( ( getOptionalISO6391Code() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalISO6391Code() ) + "\"" ) + "\"" + StringEscapeUtils.escapeXml11( getRequiredEnglishName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureProtBuffISOLang" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
