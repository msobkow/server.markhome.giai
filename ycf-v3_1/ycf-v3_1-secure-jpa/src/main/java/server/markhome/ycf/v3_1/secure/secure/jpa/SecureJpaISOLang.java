// Description: Java 25 JPA implementation of a ISOLang entity definition object.

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

package server.markhome.ycf.v3_1.secure.secure.jpa;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

@Entity
@Table(
	name = "iso_lang", schema = "Secure31",
	indexes = {
		@Index(name = "ISOLangIdIdx", columnList = "ISOLangId", unique = true),
		@Index(name = "ISOLang6392Idx", columnList = "iso_code3", unique = true),
		@Index(name = "ISOLang6391Idx", columnList = "iso_code2", unique = false)
	}
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaISOLang
	implements Comparable<Object>,
		ISecureISOLang,
		Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ISOLangIdGenSeq")
	@SequenceGenerator(name = "ISOLangIdGenSeq", allocationSize = 1, initialValue = 0, schema = "BusModel31")
	@Column( name="ISOLangId", nullable=false )
	protected short requiredISOLangId;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredParentLang")
	protected Set<SecureJpaISOCtryLang> optionalChildrenCtry;
	protected int requiredRevision;


	@AttributeOverrides({
		@AttributeOverride( name="bytes", column = @Column( name="CreatedByUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);

	@AttributeOverrides({
		@AttributeOverride( name="bytes", column = @Column( name="CreatedBySessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);

	@Column(name="CreatedAt", nullable=false)
	protected LocalDateTime createdAt = LocalDateTime.now();

	@AttributeOverrides({
		@AttributeOverride( name="bytes", column= @Column( name="UpdatedByUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);

	@AttributeOverrides({
		@AttributeOverride( name="bytes", column= @Column( name="UpdatedBySessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);

	@Column(name="UpdatedAt", nullable=false)
	protected LocalDateTime updatedAt = LocalDateTime.now();
	@Column( name="iso_code3", nullable=false, length=3 )
	protected String requiredISO6392Code;
	@Column( name="iso_code2", nullable=true, length=2 )
	protected String optionalISO6391Code;
	@Column( name="eng_name", nullable=false, length=64 )
	protected String requiredEnglishName;

	public BusModelJpaISOLang() {
		requiredISOLangId = ISecurePubISOLang.ISOLANGID_INIT_VALUE;
		requiredISO6392Code = ISecurePubISOLang.ISO6392CODE_INIT_VALUE;
		optionalISO6391Code = null;
		requiredEnglishName = ISecurePubISOLang.ENGLISHNAME_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( ISecureISOLang.CLASS_CODE );
	}

	@Override
	public List<ISecureISOCtryLang> getOptionalChildrenCtry() {
		List<ISecureISOCtryLang> retlist = (optionalChildrenCtry != null) ? new ArrayList<>(optionalChildrenCtry) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setCreatedByUserId( CFDbKeyHash256 value ) {
		if (value == null || value.isNull()) {
			throw new CFNullArgumentException(getClass(), "setCreatedByUserId", 1, "value");
		}
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setCreatedAt( LocalDateTime value ) {
		if (value == null) {
			throw new CFNullArgumentException(getClass(), "setCreatedAt", 1, "value");
		}
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setUpdatedByUserId( CFDbKeyHash256 value ) {
		if (value == null || value.isNull()) {
			throw new CFNullArgumentException(getClass(), "setUpdatedByUserId", 1, "value");
		}
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setUpdatedAt( LocalDateTime value ) {
		if (value == null) {
			throw new CFNullArgumentException(getClass(), "setUpdatedAt", 1, "value");
		}
		updatedAt = value;
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return getRequiredISOLangId();
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredISOLangId) {
		this.requiredISOLangId = requiredISOLangId;
	}

	@Override
	public short getRequiredISOLangId() {
		return(getPKey().getRequiredISOLangId());
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
		getPKey().setRequiredISOLangId(value);
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
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof ISecureISOLang) {
			ISecureISOLang rhs = (ISecureISOLang)obj;
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
		else if (obj instanceof ISecureISOLangH) {
			ISecureISOLangH rhs = (ISecureISOLangH)obj;
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
		else if (obj instanceof ISecureISOLangHPKey) {
			ISecureISOLangHPKey rhs = (ISecureISOLangHPKey)obj;
			if( getRequiredISOLangId() != rhs.getRequiredISOLangId() ) {
				return( false );
			}
			return( true );
		}
		else if (obj instanceof ISecureISOLangByCode3IdxKey) {
			ISecureISOLangByCode3IdxKey rhs = (ISecureISOLangByCode3IdxKey)obj;
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
		else if (obj instanceof ISecureISOLangByCode2IdxKey) {
			ISecureISOLangByCode2IdxKey rhs = (ISecureISOLangByCode2IdxKey)obj;
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
		int hashCode = getPKey().hashCode();
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
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof ISecureISOLang) {
			ISecureISOLang rhs = (ISecureISOLang)obj;
			if (getPKey() == null) {
				if (rhs.getPKey() != null) {
					return( -1 );
				}
			}
			else {
				if (rhs.getPKey() == null) {
					return( 1 );
				}
				else {
					cmp = getPKey().compareTo(rhs.getPKey());
					if (cmp != 0) {
						return( cmp );
					}
				}
			}
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
		else if (obj instanceof ISecureISOLangHPKey) {
			ISecureISOLangHPKey rhs = (ISecureISOLangHPKey)obj;
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureISOLangH ) {
			ISecureISOLangH rhs = (ISecureISOLangH)obj;
			if( getRequiredISOLangId() < rhs.getRequiredISOLangId() ) {
				return( -1 );
			}
			else if( getRequiredISOLangId() > rhs.getRequiredISOLangId() ) {
				return( 1 );
			}
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
		else if (obj instanceof ISecureISOLangByCode3IdxKey) {
			ISecureISOLangByCode3IdxKey rhs = (ISecureISOLangByCode3IdxKey)obj;
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
			return( 0 );
		}
		else if (obj instanceof ISecureISOLangByCode2IdxKey) {
			ISecureISOLangByCode2IdxKey rhs = (ISecureISOLangByCode2IdxKey)obj;
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
	public void set( ISecureISOLang src ) {
		setISOLang( src );
	}

	@Override
	public void setISOLang( ISecureISOLang src ) {
		setRequiredISOLangId(src.getRequiredISOLangId());
		setRequiredRevision( src.getRequiredRevision() );
		setCreatedByUserId( src.getCreatedByUserId() );
		setCreatedAt( src.getCreatedAt() );
		setUpdatedByUserId( src.getUpdatedByUserId() );
		setUpdatedAt( src.getUpdatedAt() );
		setRequiredISO6392Code(src.getRequiredISO6392Code());
		setOptionalISO6391Code(src.getOptionalISO6391Code());
		setRequiredEnglishName(src.getRequiredEnglishName());
	}

	@Override
	public void set( ISecureISOLangH src ) {
		setISOLang( src );
	}

	@Override
	public void setISOLang( ISecureISOLangH src ) {
		setRequiredISOLangId(src.getRequiredISOLangId());
		setRequiredISO6392Code(src.getRequiredISO6392Code());
		setOptionalISO6391Code(src.getOptionalISO6391Code());
		setRequiredEnglishName(src.getRequiredEnglishName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredISOLangId=" + "\"" + Short.toString( getRequiredISOLangId() ) + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredISOLangId=" + "\"" + Short.toString( getRequiredISOLangId() ) + "\""
			+ " RequiredISO6392Code=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredISO6392Code() ) + "\""
			+ " OptionalISO6391Code=" + ( ( getOptionalISO6391Code() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalISO6391Code() ) + "\"" )
			+ " RequiredEnglishName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredEnglishName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureJpaISOLang" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
