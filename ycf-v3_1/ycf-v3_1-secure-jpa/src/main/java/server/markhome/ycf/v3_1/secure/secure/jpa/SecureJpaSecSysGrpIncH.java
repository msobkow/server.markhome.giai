// Description: Java 25 JPA implementation of SecSysGrpInc history objects

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
 *  SecureJpaSecSysGrpIncH provides history objects matching the SecureSecSysGrpInc change history.
 *	Note that because all indexes are historical with multiple instances of history records, the only key that can be unique is the primary key of a history table.
 */
@Entity
@Table(
    name = "SecSysGrpInc_h", schema = "Secure31",
    indexes = {
        @Index(name = "SecSysGrpIncIdIdx_h", columnList = "auditClusterId, auditStamp, auditAction, requiredRevision, auditSessionId, SecSysGrpId, inc_name", unique = true),
        @Index(name = "SecSysGrpIncSysGrpIdx_h", columnList = "SecSysGrpId", unique = false),
        @Index(name = "SecSysGrpIncNameIdx_h", columnList = "inc_name", unique = false)
    }
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaSecSysGrpIncH
    implements ISecureSecSysGrpIncH, Comparable<Object>, Serializable
{
	@AttributeOverrides({
		@AttributeOverride(name="auditClusterId", column = @Column( name="auditClusterId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="auditStamp", column = @Column( name="auditStamp", nullable=false ) ),
		@AttributeOverride(name="auditAction", column = @Column( name="auditAction", nullable=false ) ),
		@AttributeOverride(name="requiredRevision", column = @Column( name="requiredRevision", nullable=false ) ),
		@AttributeOverride(name="auditSessionId", column = @Column( name="auditSessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="SecSysGrpId", column = @Column( name="SecSysGrpId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="inc_name", column = @Column( name="inc_name", nullable=false, length=64 ) )
	})
    @EmbeddedId
    protected SecureJpaSecSysGrpIncHPKey pkey;
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

    public SecureJpaSecSysGrpIncH() {
            // The primary key member attributes are initialized on construction
            pkey = new SecureJpaSecSysGrpIncHPKey();
    }

    @Override
    public int getClassCode() {
            return( ISecureSecSysGrpInc.CLASS_CODE );
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
    public ISecureSecSysGrpIncHPKey getPKey() {
        return( pkey );
    }

    @Override
    public void setPKey( ISecureSecSysGrpIncHPKey pkey ) {
        if (pkey != null) {
            if (pkey instanceof SecureJpaSecSysGrpIncHPKey) {
                this.pkey = (SecureJpaSecSysGrpIncHPKey)pkey;
            }
            else {
                throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureJpaSecSysGrpIncHPKey");
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
    public ICFKeyHash256 getRequiredSecSysGrpId() {
        return( pkey.getRequiredSecSysGrpId() );
    }

    @Override
    public void setRequiredSecSysGrpId( ICFKeyHash256 requiredSecSysGrpId ) {
        pkey.setRequiredSecSysGrpId( requiredSecSysGrpId );
    }

    @Override
    public String getRequiredInclName() {
        return( pkey.getRequiredInclName() );
    }

    @Override
    public void setRequiredInclName( String requiredInclName ) {
        pkey.setRequiredInclName( requiredInclName );
    }

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof ISecureSecSysGrpInc) {
            ISecureSecSysGrpInc rhs = (ISecureSecSysGrpInc)obj;
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

            return( true );
        }
        else if (obj instanceof ISecureSecSysGrpIncH) {
            ISecureSecSysGrpIncH rhs = (ISecureSecSysGrpIncH)obj;
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

            return( true );
        }
        else if (obj instanceof ISecureSecSysGrpIncHPKey) {
		ISecureSecSysGrpIncHPKey rhs = (ISecureSecSysGrpIncHPKey)obj;
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
        else if (obj instanceof ISecureSecSysGrpIncBySysGrpIdxKey) {
            ISecureSecSysGrpIncBySysGrpIdxKey rhs = (ISecureSecSysGrpIncBySysGrpIdxKey)obj;
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
            return( true );
        }
        else if (obj instanceof ISecureSecSysGrpIncByNameIdxKey) {
            ISecureSecSysGrpIncByNameIdxKey rhs = (ISecureSecSysGrpIncByNameIdxKey)obj;
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
        int hashCode = pkey.hashCode();
        return( hashCode & 0x7fffffff );
    }

    @Override
    public int compareTo( Object obj ) {
        int cmp;
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof ISecureSecSysGrpInc) {
		ISecureSecSysGrpInc rhs = (ISecureSecSysGrpInc)obj;
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
            return( 0 );
        }
        else if (obj instanceof ISecureSecSysGrpIncHPKey) {
        if (getPKey() != null) {
            return( getPKey().compareTo( obj ));
        }
        else {
            return( -1 );
        }
        }
        else if (obj instanceof ISecureSecSysGrpIncH) {
		ISecureSecSysGrpIncH rhs = (ISecureSecSysGrpIncH)obj;
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
            return( 0 );
        }
        else if (obj instanceof ISecureSecSysGrpIncBySysGrpIdxKey ) {
            ISecureSecSysGrpIncBySysGrpIdxKey rhs = (ISecureSecSysGrpIncBySysGrpIdxKey)obj;
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
            return( 0 );
        }
        else if (obj instanceof ISecureSecSysGrpIncByNameIdxKey ) {
            ISecureSecSysGrpIncByNameIdxKey rhs = (ISecureSecSysGrpIncByNameIdxKey)obj;
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
        else {
            throw new CFUnsupportedClassException( getClass(),
                "compareTo",
                "obj",
                obj,
                null );
        }
    }
	@Override
    public void set( ISecureSecSysGrpInc src ) {
		setSecSysGrpInc( src );
    }

	@Override
    public void setSecSysGrpInc( ISecureSecSysGrpInc src ) {
		setRequiredSecSysGrpId( src.getRequiredSecSysGrpId() );
		setRequiredInclName( src.getRequiredInclName() );
		setRequiredRevision( src.getRequiredRevision() );
    }

	@Override
    public void set( ISecureSecSysGrpIncH src ) {
		setSecSysGrpInc( src );
    }

	@Override
    public void setSecSysGrpInc( ISecureSecSysGrpIncH src ) {
		setRequiredSecSysGrpId( src.getRequiredSecSysGrpId() );
		setRequiredInclName( src.getRequiredInclName() );
		setRequiredRevision( src.getRequiredRevision() );
    }

    public String getXmlAttrFragment() {
        String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"";
        return( ret );
    }

    public String toString() {
        String ret = "<SecureJpaSecSysGrpIncH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
