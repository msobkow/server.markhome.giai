// Description: Java 25 JPA implementation of SecUserPWReset history objects

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
 *  SecureJpaSecUserPWResetH provides history objects matching the SecureSecUserPWReset change history.
 *	Note that because all indexes are historical with multiple instances of history records, the only key that can be unique is the primary key of a history table.
 */
@Entity
@Table(
    name = "secusrpwrst_h", schema = "Secure31",
    indexes = {
        @Index(name = "SecUserPWResetIdIdx_h", columnList = "auditClusterId, auditStamp, auditAction, requiredRevision, auditSessionId, SecUserId", unique = true),
        @Index(name = "SecUserPWResetUuid6Idx_h", columnList = "pwdrstuuid6", unique = false),
        @Index(name = "SecUserPWResetSentToEMailAddrIdx_h", columnList = "sent_emailaddr", unique = false),
        @Index(name = "SecUserPWResetNewAcctIdx_h", columnList = "newacct", unique = false)
    }
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecUserPWResetH
    implements ISecureSecUserPWResetH, Comparable<Object>, Serializable
{
	@AttributeOverrides({
		@AttributeOverride(name="auditClusterId", column = @Column( name="auditClusterId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="auditStamp", column = @Column( name="auditStamp", nullable=false ) ),
		@AttributeOverride(name="auditAction", column = @Column( name="auditAction", nullable=false ) ),
		@AttributeOverride(name="requiredRevision", column = @Column( name="requiredRevision", nullable=false ) ),
		@AttributeOverride(name="auditSessionId", column = @Column( name="auditSessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="SecUserId", column = @Column( name="SecUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
    @EmbeddedId
    protected SecureJpaSecUserPWResetHPKey pkey;
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
	@Column( name="sent_emailaddr", nullable=false, length=512 )
	protected String requiredSentToEMailAddr;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="pwdrstuuid6", nullable=false, length=ICFUuid6.TOTAL_BYTES ) )
	})
	protected ICFUuid6 requiredPasswordResetUuid6;
	@Column( name="newacct", nullable=false )
	protected boolean requiredNewAccount;

    public SecureJpaSecUserPWResetH() {
            // The primary key member attributes are initialized on construction
            pkey = new SecureJpaSecUserPWResetHPKey();
		requiredSentToEMailAddr = ISecureProtSecUserPWReset.SENTTOEMAILADDR_INIT_VALUE;
		requiredNewAccount = ISecureProtSecUserPWReset.NEWACCOUNT_INIT_VALUE;
    }

    @Override
    public int getClassCode() {
            return( ISecureSecUserPWReset.CLASS_CODE );
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
    public ISecureSecUserPWResetHPKey getPKey() {
        return( pkey );
    }

    @Override
    public void setPKey( ISecureSecUserPWResetHPKey pkey ) {
        if (pkey != null) {
            if (pkey instanceof SecureJpaSecUserPWResetHPKey) {
                this.pkey = (SecureJpaSecUserPWResetHPKey)pkey;
            }
            else {
                throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureJpaSecUserPWResetHPKey");
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
    public ICFKeyHash256 getRequiredSecUserId() {
        return( pkey.getRequiredSecUserId() );
    }

    @Override
    public void setRequiredSecUserId( ICFKeyHash256 requiredSecUserId ) {
        pkey.setRequiredSecUserId( requiredSecUserId );
    }

	@Override
	public String getRequiredSentToEMailAddr() {
		return(requiredSentToEMailAddr);
	}

	public void setRequiredSentToEMailAddr( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSentToEMailAddr",
				1,
				"value" );
		}
		else if( value.length() > 512 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredSentToEMailAddr",
				1,
				"value.length()",
				value.length(),
				512 );
		}
		requiredSentToEMailAddr = value;
	}

	@Override
	public ICFUuid6 getRequiredPasswordResetUuid6() {
		return(requiredPasswordResetUuid6);
	}

	public void setRequiredPasswordResetUuid6( ICFUuid6 value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredPasswordResetUuid6",
				1,
				"value" );
		}
		requiredPasswordResetUuid6 = value;
	}

	@Override
	public boolean getRequiredNewAccount() {
		return(requiredNewAccount);
	}

	public void setRequiredNewAccount( boolean value ) {
		requiredNewAccount = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof ISecureSecUserPWReset) {
            ISecureSecUserPWReset rhs = (ISecureSecUserPWReset)obj;
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

			if( getRequiredSentToEMailAddr() != null ) {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					if( ! getRequiredSentToEMailAddr().equals( rhs.getRequiredSentToEMailAddr() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					return( false );
				}
			}
			if( getRequiredPasswordResetUuid6() != null ) {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					if( ! getRequiredPasswordResetUuid6().equals( rhs.getRequiredPasswordResetUuid6() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					return( false );
				}
			}
			if( getRequiredNewAccount() != rhs.getRequiredNewAccount() ) {
				return( false );
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserPWResetH) {
            ISecureSecUserPWResetH rhs = (ISecureSecUserPWResetH)obj;
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

			if( getRequiredSentToEMailAddr() != null ) {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					if( ! getRequiredSentToEMailAddr().equals( rhs.getRequiredSentToEMailAddr() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					return( false );
				}
			}
			if( getRequiredPasswordResetUuid6() != null ) {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					if( ! getRequiredPasswordResetUuid6().equals( rhs.getRequiredPasswordResetUuid6() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					return( false );
				}
			}
			if( getRequiredNewAccount() != rhs.getRequiredNewAccount() ) {
				return( false );
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserPWResetHPKey) {
		ISecureSecUserPWResetHPKey rhs = (ISecureSecUserPWResetHPKey)obj;
			if( getRequiredSecUserId() != null ) {
				if( rhs.getRequiredSecUserId() != null ) {
					if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecUserId() != null ) {
					return( false );
				}
			}
		return( true );
        }
        else if (obj instanceof ISecureSecUserPWResetByUUuid6IdxKey) {
            ISecureSecUserPWResetByUUuid6IdxKey rhs = (ISecureSecUserPWResetByUUuid6IdxKey)obj;
			if( getRequiredPasswordResetUuid6() != null ) {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					if( ! getRequiredPasswordResetUuid6().equals( rhs.getRequiredPasswordResetUuid6() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordResetUuid6() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserPWResetBySentEMAddrIdxKey) {
            ISecureSecUserPWResetBySentEMAddrIdxKey rhs = (ISecureSecUserPWResetBySentEMAddrIdxKey)obj;
			if( getRequiredSentToEMailAddr() != null ) {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					if( ! getRequiredSentToEMailAddr().equals( rhs.getRequiredSentToEMailAddr() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSentToEMailAddr() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserPWResetByNewAcctIdxKey) {
            ISecureSecUserPWResetByNewAcctIdxKey rhs = (ISecureSecUserPWResetByNewAcctIdxKey)obj;
			if( getRequiredNewAccount() != rhs.getRequiredNewAccount() ) {
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
        int hashCode = pkey.hashCode();
		if( getRequiredSentToEMailAddr() != null ) {
			hashCode = hashCode + getRequiredSentToEMailAddr().hashCode();
		}
		hashCode = hashCode + getRequiredPasswordResetUuid6().hashCode();
		if( getRequiredNewAccount() ) {
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
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof ISecureSecUserPWReset) {
		ISecureSecUserPWReset rhs = (ISecureSecUserPWReset)obj;
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
			if (getRequiredSentToEMailAddr() != null) {
				if (rhs.getRequiredSentToEMailAddr() != null) {
					cmp = getRequiredSentToEMailAddr().compareTo( rhs.getRequiredSentToEMailAddr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSentToEMailAddr() != null) {
				return( -1 );
			}
			if (getRequiredPasswordResetUuid6() != null) {
				if (rhs.getRequiredPasswordResetUuid6() != null) {
					cmp = getRequiredPasswordResetUuid6().compareTo( rhs.getRequiredPasswordResetUuid6() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordResetUuid6() != null) {
				return( -1 );
			}
			if( getRequiredNewAccount() ) {
				if( ! rhs.getRequiredNewAccount() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredNewAccount() ) {
					return( -1 );
				}
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserPWResetHPKey) {
        if (getPKey() != null) {
            return( getPKey().compareTo( obj ));
        }
        else {
            return( -1 );
        }
        }
        else if (obj instanceof ISecureSecUserPWResetH) {
		ISecureSecUserPWResetH rhs = (ISecureSecUserPWResetH)obj;
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
			if (getRequiredSentToEMailAddr() != null) {
				if (rhs.getRequiredSentToEMailAddr() != null) {
					cmp = getRequiredSentToEMailAddr().compareTo( rhs.getRequiredSentToEMailAddr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSentToEMailAddr() != null) {
				return( -1 );
			}
			if (getRequiredPasswordResetUuid6() != null) {
				if (rhs.getRequiredPasswordResetUuid6() != null) {
					cmp = getRequiredPasswordResetUuid6().compareTo( rhs.getRequiredPasswordResetUuid6() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordResetUuid6() != null) {
				return( -1 );
			}
			if( getRequiredNewAccount() ) {
				if( ! rhs.getRequiredNewAccount() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredNewAccount() ) {
					return( -1 );
				}
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserPWResetByUUuid6IdxKey ) {
            ISecureSecUserPWResetByUUuid6IdxKey rhs = (ISecureSecUserPWResetByUUuid6IdxKey)obj;
			if (getRequiredPasswordResetUuid6() != null) {
				if (rhs.getRequiredPasswordResetUuid6() != null) {
					cmp = getRequiredPasswordResetUuid6().compareTo( rhs.getRequiredPasswordResetUuid6() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordResetUuid6() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserPWResetBySentEMAddrIdxKey ) {
            ISecureSecUserPWResetBySentEMAddrIdxKey rhs = (ISecureSecUserPWResetBySentEMAddrIdxKey)obj;
			if (getRequiredSentToEMailAddr() != null) {
				if (rhs.getRequiredSentToEMailAddr() != null) {
					cmp = getRequiredSentToEMailAddr().compareTo( rhs.getRequiredSentToEMailAddr() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSentToEMailAddr() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserPWResetByNewAcctIdxKey ) {
            ISecureSecUserPWResetByNewAcctIdxKey rhs = (ISecureSecUserPWResetByNewAcctIdxKey)obj;
			if( getRequiredNewAccount() ) {
				if( ! rhs.getRequiredNewAccount() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredNewAccount() ) {
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
    public void set( ISecureSecUserPWReset src ) {
		setSecUserPWReset( src );
    }

	@Override
    public void setSecUserPWReset( ISecureSecUserPWReset src ) {
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredSentToEMailAddr( src.getRequiredSentToEMailAddr() );
		setRequiredPasswordResetUuid6( src.getRequiredPasswordResetUuid6() );
		setRequiredNewAccount( src.getRequiredNewAccount() );
		setRequiredRevision( src.getRequiredRevision() );
    }

	@Override
    public void set( ISecureSecUserPWResetH src ) {
		setSecUserPWReset( src );
    }

	@Override
    public void setSecUserPWReset( ISecureSecUserPWResetH src ) {
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredSentToEMailAddr( src.getRequiredSentToEMailAddr() );
		setRequiredPasswordResetUuid6( src.getRequiredPasswordResetUuid6() );
		setRequiredNewAccount( src.getRequiredNewAccount() );
		setRequiredRevision( src.getRequiredRevision() );
    }

    public String getXmlAttrFragment() {
        String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSentToEMailAddr=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredSentToEMailAddr() ) + "\""
			+ " RequiredPasswordResetUuid6=" + "\"" + getRequiredPasswordResetUuid6().toString() + "\""
			+ " RequiredNewAccount=" + (( getRequiredNewAccount() ) ? "\"true\"" : "\"false\"" );
        return( ret );
    }

    public String toString() {
        String ret = "<SecureJpaSecUserPWResetH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
