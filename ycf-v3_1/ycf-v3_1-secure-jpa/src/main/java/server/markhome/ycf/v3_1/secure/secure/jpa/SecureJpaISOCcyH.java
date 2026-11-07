// Description: Java 25 JPA implementation of ISOCcy history objects

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

/**
 *  SecureJpaISOCcyH provides history objects matching the SecureISOCcy change history.
 *	Note that because all indexes are historical with multiple instances of history records, the only key that can be unique is the primary key of a history table.
 */
@Entity
@Table(
    name = "iso_ccy_h", schema = "Secure31",
    indexes = {
        @Index(name = "ISOCcyIdIdx_h", columnList = "auditClusterId, auditStamp, auditAction, requiredRevision, auditSessionId, ISOCcyId", unique = true),
        @Index(name = "ISOCcyCodeIdx_h", columnList = "iso_code", unique = false),
        @Index(name = "ISOCcyNameIdx_h", columnList = "ccy_name", unique = false)
    }
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaISOCcyH
    implements ISecureISOCcyH, Comparable<Object>, Serializable
{
	@AttributeOverrides({
		@AttributeOverride(name="auditClusterId", column = @Column( name="auditClusterId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="auditStamp", column = @Column( name="auditStamp", nullable=false ) ),
		@AttributeOverride(name="auditAction", column = @Column( name="auditAction", nullable=false ) ),
		@AttributeOverride(name="requiredRevision", column = @Column( name="requiredRevision", nullable=false ) ),
		@AttributeOverride(name="auditSessionId", column = @Column( name="auditSessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="ISOCcyId", column = @Column( name="ISOCcyId", nullable=false ) )
	})
    @EmbeddedId
    protected SecureJpaISOCcyHPKey pkey;
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
	@Column( name="iso_code", nullable=false, length=3 )
	protected String requiredISOCode;
	@Column( name="ccy_name", nullable=false, length=64 )
	protected String requiredName;
	@Column( name="unit_symbol", nullable=true, length=4 )
	protected String optionalUnitSymbol;
	@Column( name="precis", nullable=false )
	protected short requiredPrecis;

    public SecureJpaISOCcyH() {
            // The primary key member attributes are initialized on construction
            pkey = new SecureJpaISOCcyHPKey();
		requiredISOCode = ISecurePubISOCcy.ISOCODE_INIT_VALUE;
		requiredName = ISecurePubISOCcy.NAME_INIT_VALUE;
		optionalUnitSymbol = null;
		requiredPrecis = ISecurePubISOCcy.PRECIS_INIT_VALUE;
    }

    @Override
    public int getClassCode() {
            return( ISecureISOCcy.CLASS_CODE );
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
    public ISecureISOCcyHPKey getPKey() {
        return( pkey );
    }

    @Override
    public void setPKey( ISecureISOCcyHPKey pkey ) {
        if (pkey != null) {
            if (pkey instanceof SecureJpaISOCcyHPKey) {
                this.pkey = (SecureJpaISOCcyHPKey)pkey;
            }
            else {
                throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureJpaISOCcyHPKey");
            }
        }
    }

    @Override
    public CFDbKeyHash256 getAuditClusterId() {
        return pkey.getAuditClusterId();
    }

    @Override
    public void setAuditClusterId(CFDbKeyHash256 auditClusterId) {
        pkey.setAuditClusterId(auditClusterId);
    }

    @Override
    public LocalDateTime getAuditStamp() {
        return pkey.getAuditStamp();
    }

    @Override
    public void setAuditStamp(LocalDateTime auditStamp) {
        pkey.setAuditStamp(auditStamp);
    }

    @Override
    public short getAuditActionId() {
        return pkey.getAuditActionId();
    }

    @Override
    public void setAuditActionId(short auditActionId) {
        pkey.setAuditActionId(auditActionId);
    }

    @Override
    public int getRequiredRevision() {
        return pkey.getRequiredRevision();
    }

    @Override
    public void setRequiredRevision(int revision) {
        pkey.setRequiredRevision(revision);
    }

    @Override
    public CFDbKeyHash256 getAuditSessionId() {
        return pkey.getAuditSessionId();
    }

    @Override
    public void setAuditSessionId(CFDbKeyHash256 auditSessionId) {
        pkey.setAuditSessionId(auditSessionId);
    }

    @Override
    public short getRequiredISOCcyId() {
        return( pkey.getRequiredISOCcyId() );
    }

    @Override
    public void setRequiredISOCcyId( short requiredISOCcyId ) {
        pkey.setRequiredISOCcyId( requiredISOCcyId );
    }

	@Override
	public String getRequiredISOCode() {
		return(requiredISOCode);
	}

	public void setRequiredISOCode( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredISOCode",
				1,
				"value" );
		}
		else if( value.length() > 3 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredISOCode",
				1,
				"value.length()",
				value.length(),
				3 );
		}
		requiredISOCode = value;
	}

	@Override
	public String getRequiredName() {
		return(requiredName);
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredName = value;
	}

	@Override
	public String getOptionalUnitSymbol() {
		return(optionalUnitSymbol);
	}

	public void setOptionalUnitSymbol( String value ) {
		if( value != null && value.length() > 4 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalUnitSymbol",
				1,
				"value.length()",
				value.length(),
				4 );
		}
		optionalUnitSymbol = value;
	}

	@Override
	public short getRequiredPrecis() {
		return(requiredPrecis);
	}

	@Override
	public void setRequiredPrecis( short value ) {
		if( value < ISecurePubISOCcy.PRECIS_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredPrecis",
				1,
				"value",
				value,
				ISecurePubISOCcy.PRECIS_MIN_VALUE );
		}
		if( value > ISecurePubISOCcy.PRECIS_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredPrecis",
				1,
				"value",
				value,
				ISecurePubISOCcy.PRECIS_MAX_VALUE );
		}
		requiredPrecis = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof ISecureISOCcy) {
            ISecureISOCcy rhs = (ISecureISOCcy)obj;
		if (getPKey() != null) {
			if (rhs.getPKey() != null) {
				if (!getPKey().equals(rhs.getPKey())) {
					return( false );
				}
			}
			else {
				return( false );
			}
		}
		else if (rhs.getPKey() != null) {
			return( false );
		}

			if( getRequiredISOCode() != null ) {
				if( rhs.getRequiredISOCode() != null ) {
					if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredISOCode() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalUnitSymbol() != null ) {
				if( rhs.getOptionalUnitSymbol() != null ) {
					if( ! getOptionalUnitSymbol().equals( rhs.getOptionalUnitSymbol() ) ) {
						return( false );
					}
				}
				else {
					return( false );
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
        else if (obj instanceof ISecureISOCcyH) {
            ISecureISOCcyH rhs = (ISecureISOCcyH)obj;
		if (getPKey() != null) {
			if (rhs.getPKey() != null) {
				if (!getPKey().equals(rhs.getPKey())) {
					return( false );
				}
			}
			else {
				return( false );
			}
		}
		else if (rhs.getPKey() != null) {
			return( false );
		}

			if( getRequiredISOCode() != null ) {
				if( rhs.getRequiredISOCode() != null ) {
					if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredISOCode() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalUnitSymbol() != null ) {
				if( rhs.getOptionalUnitSymbol() != null ) {
					if( ! getOptionalUnitSymbol().equals( rhs.getOptionalUnitSymbol() ) ) {
						return( false );
					}
				}
				else {
					return( false );
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
        else if (obj instanceof ISecureISOCcyHPKey) {
		ISecureISOCcyHPKey rhs = (ISecureISOCcyHPKey)obj;
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
		return( true );
        }
        else if (obj instanceof ISecureISOCcyByCcyCdIdxKey) {
            ISecureISOCcyByCcyCdIdxKey rhs = (ISecureISOCcyByCcyCdIdxKey)obj;
			if( getRequiredISOCode() != null ) {
				if( rhs.getRequiredISOCode() != null ) {
					if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredISOCode() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureISOCcyByCcyNmIdxKey) {
            ISecureISOCcyByCcyNmIdxKey rhs = (ISecureISOCcyByCcyNmIdxKey)obj;
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
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
        int hashCode = pkey.hashCode();
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

    @Override
    public int compareTo( Object obj ) {
        int cmp;
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof ISecureISOCcy) {
		ISecureISOCcy rhs = (ISecureISOCcy)obj;
		if (getPKey() != null) {
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
		else {
			if (rhs.getPKey() != null) {
				return( -1 );
			}
		}
			if (getRequiredISOCode() != null) {
				if (rhs.getRequiredISOCode() != null) {
					cmp = getRequiredISOCode().compareTo( rhs.getRequiredISOCode() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredISOCode() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalUnitSymbol() != null ) {
				if( rhs.getOptionalUnitSymbol() != null ) {
					cmp = getOptionalUnitSymbol().compareTo( rhs.getOptionalUnitSymbol() );
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
        else if (obj instanceof ISecureISOCcyHPKey) {
        if (getPKey() != null) {
            return( getPKey().compareTo( obj ));
        }
        else {
            return( -1 );
        }
        }
        else if (obj instanceof ISecureISOCcyH) {
		ISecureISOCcyH rhs = (ISecureISOCcyH)obj;
		if (getPKey() != null) {
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
		else {
			if (rhs.getPKey() != null) {
				return( -1 );
			}
		}
			if (getRequiredISOCode() != null) {
				if (rhs.getRequiredISOCode() != null) {
					cmp = getRequiredISOCode().compareTo( rhs.getRequiredISOCode() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredISOCode() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalUnitSymbol() != null ) {
				if( rhs.getOptionalUnitSymbol() != null ) {
					cmp = getOptionalUnitSymbol().compareTo( rhs.getOptionalUnitSymbol() );
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
        else if (obj instanceof ISecureISOCcyByCcyCdIdxKey ) {
            ISecureISOCcyByCcyCdIdxKey rhs = (ISecureISOCcyByCcyCdIdxKey)obj;
			if (getRequiredISOCode() != null) {
				if (rhs.getRequiredISOCode() != null) {
					cmp = getRequiredISOCode().compareTo( rhs.getRequiredISOCode() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredISOCode() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureISOCcyByCcyNmIdxKey ) {
            ISecureISOCcyByCcyNmIdxKey rhs = (ISecureISOCcyByCcyNmIdxKey)obj;
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
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
    public void set( ISecureISOCcy src ) {
		setISOCcy( src );
    }

	@Override
    public void setISOCcy( ISecureISOCcy src ) {
		setRequiredISOCcyId( src.getRequiredISOCcyId() );
		setRequiredISOCode( src.getRequiredISOCode() );
		setRequiredName( src.getRequiredName() );
		setOptionalUnitSymbol( src.getOptionalUnitSymbol() );
		setRequiredPrecis( src.getRequiredPrecis() );
		setRequiredRevision( src.getRequiredRevision() );
    }

	@Override
    public void set( ISecureISOCcyH src ) {
		setISOCcy( src );
    }

	@Override
    public void setISOCcy( ISecureISOCcyH src ) {
		setRequiredISOCcyId( src.getRequiredISOCcyId() );
		setRequiredISOCode( src.getRequiredISOCode() );
		setRequiredName( src.getRequiredName() );
		setOptionalUnitSymbol( src.getOptionalUnitSymbol() );
		setRequiredPrecis( src.getRequiredPrecis() );
		setRequiredRevision( src.getRequiredRevision() );
    }

    public String getXmlAttrFragment() {
        String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredISOCode=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredISOCode() ) + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\""
			+ " OptionalUnitSymbol=" + ( ( getOptionalUnitSymbol() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalUnitSymbol() ) + "\"" )
			+ " RequiredPrecis=" + "\"" + Short.toString( getRequiredPrecis() ) + "\"";
        return( ret );
    }

    public String toString() {
        String ret = "<SecureJpaISOCcyH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
