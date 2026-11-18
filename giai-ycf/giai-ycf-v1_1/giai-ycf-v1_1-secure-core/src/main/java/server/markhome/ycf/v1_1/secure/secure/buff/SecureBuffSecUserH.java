// Description: Java 25 implementation of a SecUser history buffer object

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
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;

public class SecureBuffSecUserH
    implements ISecureSecUserH, Comparable<Object>, Serializable
{
    protected SecureBuffSecUserHPKey pkey;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected String requiredLoginId;
	protected ISecurePubSchema.SecAccountStatusEnum requiredAccountStatus;
	protected String optionalDfltSysGrpName;
	protected String optionalDfltClusGrpName;
	protected String optionalDfltTentGrpName;
	protected String requiredEMailAddress;

    public SecureBuffSecUserH() {
            // The primary key member attributes are initialized on construction
            pkey = new SecureBuffSecUserHPKey();
		requiredLoginId = ISecurePubSecUser.LOGINID_INIT_VALUE;
		requiredAccountStatus = ISecurePubSecUser.ACCOUNTSTATUS_INIT_VALUE;
		optionalDfltSysGrpName = null;
		optionalDfltClusGrpName = null;
		optionalDfltTentGrpName = null;
		requiredEMailAddress = ISecureProtSecUser.EMAILADDRESS_INIT_VALUE;
    }

    @Override
    public int getClassCode() {
            return( ISecureSecUser.CLASS_CODE );
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
    public ISecureSecUserHPKey getPKey() {
        return( pkey );
    }

    @Override
    public void setPKey( ISecureSecUserHPKey pkey ) {
        if (pkey != null) {
            if (pkey instanceof SecureBuffSecUserHPKey) {
                this.pkey = (SecureBuffSecUserHPKey)pkey;
            }
            else {
                throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureBuffSecUserHPKey");
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
		return(getPKey().getRequiredSecUserId());
	}

	public void setRequiredSecUserId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecUserId",
				1,
				"value" );
		}
		getPKey().setRequiredSecUserId(value);
	}

	@Override
	public String getRequiredLoginId() {
		return(requiredLoginId);
	}

	public void setRequiredLoginId( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredLoginId",
				1,
				"value" );
		}
		else if( value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredLoginId",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredLoginId = value;
	}

	@Override
	public ISecurePubSchema.SecAccountStatusEnum getRequiredAccountStatus() {
		return(requiredAccountStatus);
	}

	public void setRequiredAccountStatus( ISecurePubSchema.SecAccountStatusEnum value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredAccountStatus",
				1,
				"value" );
		}
		requiredAccountStatus = value;
	}

	@Override
	public String getOptionalDfltSysGrpName() {
		return(optionalDfltSysGrpName);
	}

	public void setOptionalDfltSysGrpName( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDfltSysGrpName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalDfltSysGrpName = value;
	}

	@Override
	public String getOptionalDfltClusGrpName() {
		return(optionalDfltClusGrpName);
	}

	public void setOptionalDfltClusGrpName( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDfltClusGrpName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalDfltClusGrpName = value;
	}

	@Override
	public String getOptionalDfltTentGrpName() {
		return(optionalDfltTentGrpName);
	}

	public void setOptionalDfltTentGrpName( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDfltTentGrpName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalDfltTentGrpName = value;
	}

	@Override
	public String getRequiredEMailAddress() {
		return(requiredEMailAddress);
	}

	public void setRequiredEMailAddress( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredEMailAddress",
				1,
				"value" );
		}
		else if( value.length() > 512 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredEMailAddress",
				1,
				"value.length()",
				value.length(),
				512 );
		}
		requiredEMailAddress = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof ISecureSecUser) {
            ISecureSecUser rhs = (ISecureSecUser)obj;
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

			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			if( getRequiredAccountStatus() != null ) {
				if( rhs.getRequiredAccountStatus() != null ) {
					if( ! getRequiredAccountStatus().equals( rhs.getRequiredAccountStatus() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredAccountStatus() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltSysGrpName() != null ) {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					if( ! getOptionalDfltSysGrpName().equals( rhs.getOptionalDfltSysGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltClusGrpName() != null ) {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					if( ! getOptionalDfltClusGrpName().equals( rhs.getOptionalDfltClusGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltTentGrpName() != null ) {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					if( ! getOptionalDfltTentGrpName().equals( rhs.getOptionalDfltTentGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					return( false );
				}
			}
			if( getRequiredEMailAddress() != null ) {
				if( rhs.getRequiredEMailAddress() != null ) {
					if( ! getRequiredEMailAddress().equals( rhs.getRequiredEMailAddress() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMailAddress() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserH) {
            ISecureSecUserH rhs = (ISecureSecUserH)obj;
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

			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
			if( getRequiredAccountStatus() != null ) {
				if( rhs.getRequiredAccountStatus() != null ) {
					if( ! getRequiredAccountStatus().equals( rhs.getRequiredAccountStatus() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredAccountStatus() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltSysGrpName() != null ) {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					if( ! getOptionalDfltSysGrpName().equals( rhs.getOptionalDfltSysGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltClusGrpName() != null ) {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					if( ! getOptionalDfltClusGrpName().equals( rhs.getOptionalDfltClusGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltTentGrpName() != null ) {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					if( ! getOptionalDfltTentGrpName().equals( rhs.getOptionalDfltTentGrpName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					return( false );
				}
			}
			if( getRequiredEMailAddress() != null ) {
				if( rhs.getRequiredEMailAddress() != null ) {
					if( ! getRequiredEMailAddress().equals( rhs.getRequiredEMailAddress() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMailAddress() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserHPKey) {
		ISecureSecUserHPKey rhs = (ISecureSecUserHPKey)obj;
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
        else if (obj instanceof ISecureSecUserByULoginIdxKey) {
            ISecureSecUserByULoginIdxKey rhs = (ISecureSecUserByULoginIdxKey)obj;
			if( getRequiredLoginId() != null ) {
				if( rhs.getRequiredLoginId() != null ) {
					if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredLoginId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureSecUserByEMAddrIdxKey) {
            ISecureSecUserByEMAddrIdxKey rhs = (ISecureSecUserByEMAddrIdxKey)obj;
			if( getRequiredEMailAddress() != null ) {
				if( rhs.getRequiredEMailAddress() != null ) {
					if( ! getRequiredEMailAddress().equals( rhs.getRequiredEMailAddress() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEMailAddress() != null ) {
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
		if( getRequiredLoginId() != null ) {
			hashCode = hashCode + getRequiredLoginId().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredAccountStatus().ordinal();
		if( getOptionalDfltSysGrpName() != null ) {
			hashCode = hashCode + getOptionalDfltSysGrpName().hashCode();
		}
		if( getOptionalDfltClusGrpName() != null ) {
			hashCode = hashCode + getOptionalDfltClusGrpName().hashCode();
		}
		if( getOptionalDfltTentGrpName() != null ) {
			hashCode = hashCode + getOptionalDfltTentGrpName().hashCode();
		}
		if( getRequiredEMailAddress() != null ) {
			hashCode = hashCode + getRequiredEMailAddress().hashCode();
		}
        return( hashCode & 0x7fffffff );
    }

    @Override
    public int compareTo( Object obj ) {
        int cmp;
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof ISecureSecUser) {
		ISecureSecUser rhs = (ISecureSecUser)obj;
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
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			if (getRequiredAccountStatus() != null) {
				if (rhs.getRequiredAccountStatus() != null) {
					cmp = getRequiredAccountStatus().compareTo( rhs.getRequiredAccountStatus() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredAccountStatus() != null) {
				return( -1 );
			}
			if( getOptionalDfltSysGrpName() != null ) {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					cmp = getOptionalDfltSysGrpName().compareTo( rhs.getOptionalDfltSysGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltClusGrpName() != null ) {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					cmp = getOptionalDfltClusGrpName().compareTo( rhs.getOptionalDfltClusGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltTentGrpName() != null ) {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					cmp = getOptionalDfltTentGrpName().compareTo( rhs.getOptionalDfltTentGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					return( -1 );
				}
			}
			if (getRequiredEMailAddress() != null) {
				if (rhs.getRequiredEMailAddress() != null) {
					cmp = getRequiredEMailAddress().compareTo( rhs.getRequiredEMailAddress() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMailAddress() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserHPKey) {
        if (getPKey() != null) {
            return( getPKey().compareTo( obj ));
        }
        else {
            return( -1 );
        }
        }
        else if (obj instanceof ISecureSecUserH) {
		ISecureSecUserH rhs = (ISecureSecUserH)obj;
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
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
			if (getRequiredAccountStatus() != null) {
				if (rhs.getRequiredAccountStatus() != null) {
					cmp = getRequiredAccountStatus().compareTo( rhs.getRequiredAccountStatus() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredAccountStatus() != null) {
				return( -1 );
			}
			if( getOptionalDfltSysGrpName() != null ) {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					cmp = getOptionalDfltSysGrpName().compareTo( rhs.getOptionalDfltSysGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltSysGrpName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltClusGrpName() != null ) {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					cmp = getOptionalDfltClusGrpName().compareTo( rhs.getOptionalDfltClusGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltClusGrpName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltTentGrpName() != null ) {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					cmp = getOptionalDfltTentGrpName().compareTo( rhs.getOptionalDfltTentGrpName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltTentGrpName() != null ) {
					return( -1 );
				}
			}
			if (getRequiredEMailAddress() != null) {
				if (rhs.getRequiredEMailAddress() != null) {
					cmp = getRequiredEMailAddress().compareTo( rhs.getRequiredEMailAddress() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMailAddress() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserByULoginIdxKey ) {
            ISecureSecUserByULoginIdxKey rhs = (ISecureSecUserByULoginIdxKey)obj;
			if (getRequiredLoginId() != null) {
				if (rhs.getRequiredLoginId() != null) {
					cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredLoginId() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecUserByEMAddrIdxKey ) {
            ISecureSecUserByEMAddrIdxKey rhs = (ISecureSecUserByEMAddrIdxKey)obj;
			if (getRequiredEMailAddress() != null) {
				if (rhs.getRequiredEMailAddress() != null) {
					cmp = getRequiredEMailAddress().compareTo( rhs.getRequiredEMailAddress() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEMailAddress() != null) {
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
    public void set( ISecureSecUser src ) {
		setSecUser( src );
    }

	@Override
    public void setSecUser( ISecureSecUser src ) {
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredLoginId( src.getRequiredLoginId() );
		setRequiredAccountStatus( src.getRequiredAccountStatus() );
		setOptionalDfltSysGrpName( src.getOptionalDfltSysGrpName() );
		setOptionalDfltClusGrpName( src.getOptionalDfltClusGrpName() );
		setOptionalDfltTentGrpName( src.getOptionalDfltTentGrpName() );
		setRequiredEMailAddress( src.getRequiredEMailAddress() );
		setRequiredRevision( src.getRequiredRevision() );
    }

	@Override
    public void set( ISecureSecUserH src ) {
		setSecUser( src );
    }

	@Override
    public void setSecUser( ISecureSecUserH src ) {
		setRequiredSecUserId( src.getRequiredSecUserId() );
		setRequiredLoginId( src.getRequiredLoginId() );
		setRequiredAccountStatus( src.getRequiredAccountStatus() );
		setOptionalDfltSysGrpName( src.getOptionalDfltSysGrpName() );
		setOptionalDfltClusGrpName( src.getOptionalDfltClusGrpName() );
		setOptionalDfltTentGrpName( src.getOptionalDfltTentGrpName() );
		setRequiredEMailAddress( src.getRequiredEMailAddress() );
		setRequiredRevision( src.getRequiredRevision() );
    }

    public String getXmlAttrFragment() {
        String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredLoginId=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredLoginId() ) + "\""
			+ " RequiredAccountStatus=" + "\"" + getRequiredAccountStatus().toString() + "\""
			+ " OptionalDfltSysGrpName=" + ( ( getOptionalDfltSysGrpName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDfltSysGrpName() ) + "\"" )
			+ " OptionalDfltClusGrpName=" + ( ( getOptionalDfltClusGrpName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDfltClusGrpName() ) + "\"" )
			+ " OptionalDfltTentGrpName=" + ( ( getOptionalDfltTentGrpName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDfltTentGrpName() ) + "\"" )
			+ " RequiredEMailAddress=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredEMailAddress() ) + "\"";
        return( ret );
    }

    public String toString() {
        String ret = "<SecureBuffSecUserH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
