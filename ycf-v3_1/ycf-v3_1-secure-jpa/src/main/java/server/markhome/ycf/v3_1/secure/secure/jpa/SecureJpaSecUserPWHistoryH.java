// Description: Java 25 JPA implementation of SecUserPWHistory history objects

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
 *  SecureJpaSecUserPWHistoryH provides history objects matching the SecureSecUserPWHistory change history.
 *	Note that because all indexes are historical with multiple instances of history records, the only key that can be unique is the primary key of a history table.
 */
public class SecureJpaSecUserPWHistoryH
    implements ISecureSecUserPWHistoryH, Comparable<Object>, Serializable
{
	@AttributeOverrides({
		@AttributeOverride(name="auditClusterId", column = @Column( name="auditClusterId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="auditStamp", column = @Column( name="auditStamp", nullable=false ) ),
		@AttributeOverride(name="auditAction", column = @Column( name="auditAction", nullable=false ) ),
		@AttributeOverride(name="requiredRevision", column = @Column( name="requiredRevision", nullable=false ) ),
		@AttributeOverride(name="auditSessionId", column = @Column( name="auditSessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="SecUserId", column = @Column( name="SecUserId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="PWSetStamp", column = @Column( name="PWSetStamp", nullable=false ) )
	})
    protected SecureJpaSecUserPWHistoryHPKey pkey;
	protected LocalDateTime requiredPWReplacedStamp;
	protected String requiredPasswordHash;

    public SecureJpaSecUserPWHistoryH() {
            // The primary key member attributes are initialized on construction
            pkey = new SecureJpaSecUserPWHistoryHPKey();
		requiredPWReplacedStamp = CFXmlUtil.parseTimestamp("2020-01-01T00:00:00");
    }

    @Override
    public int getClassCode() {
            return( ISecureSecUserPWHistory.CLASS_CODE );
    }

    @Override
    public ISecureSecUserPWHistoryHPKey getPKey() {
        return( pkey );
    }

    @Override
    public void setPKey( ISecureSecUserPWHistoryHPKey pkey ) {
        if (pkey != null) {
            if (pkey instanceof SecureJpaSecUserPWHistoryHPKey) {
                this.pkey = (SecureJpaSecUserPWHistoryHPKey)pkey;
            }
            else {
                throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureJpaSecUserPWHistoryHPKey");
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
    public LocalDateTime getRequiredPWSetStamp() {
        return( pkey.getRequiredPWSetStamp() );
    }

    @Override
    public void setRequiredPWSetStamp( LocalDateTime requiredPWSetStamp ) {
        pkey.setRequiredPWSetStamp( requiredPWSetStamp );
    }

	@Override
	public LocalDateTime getRequiredPWReplacedStamp() {
		return(requiredPWReplacedStamp);
	}

	public void setRequiredPWReplacedStamp( LocalDateTime value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredPWReplacedStamp",
				1,
				"value" );
		}
		requiredPWReplacedStamp = value;
	}

	@Override
	public String getRequiredPasswordHash() {
		return(requiredPasswordHash);
	}

	public void setRequiredPasswordHash( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredPasswordHash",
				1,
				"value" );
		}
		else if( value.length() > 256 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredPasswordHash",
				1,
				"value.length()",
				value.length(),
				256 );
		}
		requiredPasswordHash = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof ISecureSecUserPWHistory) {
            ISecureSecUserPWHistory rhs = (ISecureSecUserPWHistory)obj;
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

			if( getRequiredPWReplacedStamp() != null ) {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					if( ! getRequiredPWReplacedStamp().equals( rhs.getRequiredPWReplacedStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					return( false );
				}
			}
			if( getRequiredPasswordHash() != null ) {
				if( rhs.getRequiredPasswordHash() != null ) {
					if( ! getRequiredPasswordHash().equals( rhs.getRequiredPasswordHash() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordHash() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserPWHistoryH) {
            ISecureSecUserPWHistoryH rhs = (ISecureSecUserPWHistoryH)obj;
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

			if( getRequiredPWReplacedStamp() != null ) {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					if( ! getRequiredPWReplacedStamp().equals( rhs.getRequiredPWReplacedStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					return( false );
				}
			}
			if( getRequiredPasswordHash() != null ) {
				if( rhs.getRequiredPasswordHash() != null ) {
					if( ! getRequiredPasswordHash().equals( rhs.getRequiredPasswordHash() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPasswordHash() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserPWHistoryHPKey) {
		ISecureSecUserPWHistoryHPKey rhs = (ISecureSecUserPWHistoryHPKey)obj;
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
			if( getRequiredPWSetStamp() != null ) {
				if( rhs.getRequiredPWSetStamp() != null ) {
					if( ! getRequiredPWSetStamp().equals( rhs.getRequiredPWSetStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWSetStamp() != null ) {
					return( false );
				}
			}
		return( true );
        }
        else if (obj instanceof ISecureSecUserPWHistoryByUserIdxKey) {
            ISecureSecUserPWHistoryByUserIdxKey rhs = (ISecureSecUserPWHistoryByUserIdxKey)obj;
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
        else if (obj instanceof ISecureSecUserPWHistoryBySetStampIdxKey) {
            ISecureSecUserPWHistoryBySetStampIdxKey rhs = (ISecureSecUserPWHistoryBySetStampIdxKey)obj;
			if( getRequiredPWSetStamp() != null ) {
				if( rhs.getRequiredPWSetStamp() != null ) {
					if( ! getRequiredPWSetStamp().equals( rhs.getRequiredPWSetStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWSetStamp() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserPWHistoryByReplacedStampIdxKey) {
            ISecureSecUserPWHistoryByReplacedStampIdxKey rhs = (ISecureSecUserPWHistoryByReplacedStampIdxKey)obj;
			if( getRequiredPWReplacedStamp() != null ) {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
					if( ! getRequiredPWReplacedStamp().equals( rhs.getRequiredPWReplacedStamp() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPWReplacedStamp() != null ) {
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
		if( getRequiredPWReplacedStamp() != null ) {
			hashCode = hashCode + getRequiredPWReplacedStamp().hashCode();
		}
		if( getRequiredPasswordHash() != null ) {
			hashCode = hashCode + getRequiredPasswordHash().hashCode();
		}
        return( hashCode & 0x7fffffff );
    }

    @Override
    public int compareTo( Object obj ) {
        int cmp;
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof ISecureSecUserPWHistory) {
		ISecureSecUserPWHistory rhs = (ISecureSecUserPWHistory)obj;
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
			if (getRequiredPWReplacedStamp() != null) {
				if (rhs.getRequiredPWReplacedStamp() != null) {
					cmp = getRequiredPWReplacedStamp().compareTo( rhs.getRequiredPWReplacedStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWReplacedStamp() != null) {
				return( -1 );
			}
			if (getRequiredPasswordHash() != null) {
				if (rhs.getRequiredPasswordHash() != null) {
					cmp = getRequiredPasswordHash().compareTo( rhs.getRequiredPasswordHash() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordHash() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserPWHistoryHPKey) {
        if (getPKey() != null) {
            return( getPKey().compareTo( obj ));
        }
        else {
            return( -1 );
        }
        }
        else if (obj instanceof ISecureSecUserPWHistoryH) {
		ISecureSecUserPWHistoryH rhs = (ISecureSecUserPWHistoryH)obj;
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
			if (getRequiredPWReplacedStamp() != null) {
				if (rhs.getRequiredPWReplacedStamp() != null) {
					cmp = getRequiredPWReplacedStamp().compareTo( rhs.getRequiredPWReplacedStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWReplacedStamp() != null) {
				return( -1 );
			}
			if (getRequiredPasswordHash() != null) {
				if (rhs.getRequiredPasswordHash() != null) {
					cmp = getRequiredPasswordHash().compareTo( rhs.getRequiredPasswordHash() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPasswordHash() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserPWHistoryByUserIdxKey ) {
            ISecureSecUserPWHistoryByUserIdxKey rhs = (ISecureSecUserPWHistoryByUserIdxKey)obj;
			if (getRequiredSecUserId() != null) {
				if (rhs.getRequiredSecUserId() != null) {
					cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecUserId() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserPWHistoryBySetStampIdxKey ) {
            ISecureSecUserPWHistoryBySetStampIdxKey rhs = (ISecureSecUserPWHistoryBySetStampIdxKey)obj;
			if (getRequiredPWSetStamp() != null) {
				if (rhs.getRequiredPWSetStamp() != null) {
					cmp = getRequiredPWSetStamp().compareTo( rhs.getRequiredPWSetStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWSetStamp() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserPWHistoryByReplacedStampIdxKey ) {
            ISecureSecUserPWHistoryByReplacedStampIdxKey rhs = (ISecureSecUserPWHistoryByReplacedStampIdxKey)obj;
			if (getRequiredPWReplacedStamp() != null) {
				if (rhs.getRequiredPWReplacedStamp() != null) {
					cmp = getRequiredPWReplacedStamp().compareTo( rhs.getRequiredPWReplacedStamp() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPWReplacedStamp() != null) {
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
    public void set( ISecureSecUserPWHistory src ) {
		setSecUserPWHistory( src );
    }

	@Override
    public void setSecUserPWHistory( ISecureSecUserPWHistory src ) {
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredPWSetStamp( src.getRequiredPWSetStamp() );
		setRequiredPWReplacedStamp( src.getRequiredPWReplacedStamp() );
		setRequiredPasswordHash( src.getRequiredPasswordHash() );
		setRequiredRevision( src.getRequiredRevision() );
    }

	@Override
    public void set( ISecureSecUserPWHistoryH src ) {
		setSecUserPWHistory( src );
    }

	@Override
    public void setSecUserPWHistory( ISecureSecUserPWHistoryH src ) {
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredPWSetStamp( src.getRequiredPWSetStamp() );
		setRequiredPWReplacedStamp( src.getRequiredPWReplacedStamp() );
		setRequiredPasswordHash( src.getRequiredPasswordHash() );
		setRequiredRevision( src.getRequiredRevision() );
    }

    public String getXmlAttrFragment() {
        String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredPWReplacedStamp=" + "\"" + getRequiredPWReplacedStamp().toString() + "\""
			+ " RequiredPasswordHash=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredPasswordHash() ) + "\"";
        return( ret );
    }

    public String toString() {
        String ret = "<SecureJpaSecUserPWHistoryH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
