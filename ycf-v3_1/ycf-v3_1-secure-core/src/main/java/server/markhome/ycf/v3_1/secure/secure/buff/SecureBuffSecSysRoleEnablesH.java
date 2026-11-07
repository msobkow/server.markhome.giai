// Description: Java 25 implementation of a SecSysRoleEnables history buffer object

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

public class SecureBuffSecSysRoleEnablesH
    implements ISecureSecSysRoleEnablesH, Comparable<Object>, Serializable
{
    protected SecureBuffSecSysRoleEnablesHPKey pkey;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();

    public SecureBuffSecSysRoleEnablesH() {
            // The primary key member attributes are initialized on construction
            pkey = new SecureBuffSecSysRoleEnablesHPKey();
    }

    @Override
    public int getClassCode() {
            return( ISecureSecSysRoleEnables.CLASS_CODE );
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
    public ISecureSecSysRoleEnablesHPKey getPKey() {
        return( pkey );
    }

    @Override
    public void setPKey( ISecureSecSysRoleEnablesHPKey pkey ) {
        if (pkey != null) {
            if (pkey instanceof SecureBuffSecSysRoleEnablesHPKey) {
                this.pkey = (SecureBuffSecSysRoleEnablesHPKey)pkey;
            }
            else {
                throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureBuffSecSysRoleEnablesHPKey");
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
	public ICFKeyHash256 getRequiredSecSysRoleId() {
		return(getPKey().getRequiredSecSysRoleId());
	}

	public void setRequiredSecSysRoleId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecSysRoleId",
				1,
				"value" );
		}
		getPKey().setRequiredSecSysRoleId(value);
	}

	@Override
	public String getRequiredEnableName() {
		return(getPKey().getRequiredEnableName());
	}

	public void setRequiredEnableName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredEnableName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredEnableName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		getPKey().setRequiredEnableName(value);
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof ISecureSecSysRoleEnables) {
            ISecureSecSysRoleEnables rhs = (ISecureSecSysRoleEnables)obj;
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
        else if (obj instanceof ISecureSecSysRoleEnablesH) {
            ISecureSecSysRoleEnablesH rhs = (ISecureSecSysRoleEnablesH)obj;
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
        else if (obj instanceof ISecureSecSysRoleEnablesHPKey) {
		ISecureSecSysRoleEnablesHPKey rhs = (ISecureSecSysRoleEnablesHPKey)obj;
			if( getRequiredSecSysRoleId() != null ) {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					if( ! getRequiredSecSysRoleId().equals( rhs.getRequiredSecSysRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					return( false );
				}
			}
			if( getRequiredEnableName() != null ) {
				if( rhs.getRequiredEnableName() != null ) {
					if( ! getRequiredEnableName().equals( rhs.getRequiredEnableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnableName() != null ) {
					return( false );
				}
			}
		return( true );
        }
        else if (obj instanceof ISecureSecSysRoleEnablesBySysRoleIdxKey) {
            ISecureSecSysRoleEnablesBySysRoleIdxKey rhs = (ISecureSecSysRoleEnablesBySysRoleIdxKey)obj;
			if( getRequiredSecSysRoleId() != null ) {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					if( ! getRequiredSecSysRoleId().equals( rhs.getRequiredSecSysRoleId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecSysRoleId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureSecSysRoleEnablesByNameIdxKey) {
            ISecureSecSysRoleEnablesByNameIdxKey rhs = (ISecureSecSysRoleEnablesByNameIdxKey)obj;
			if( getRequiredEnableName() != null ) {
				if( rhs.getRequiredEnableName() != null ) {
					if( ! getRequiredEnableName().equals( rhs.getRequiredEnableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredEnableName() != null ) {
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
        else if (obj instanceof ISecureSecSysRoleEnables) {
		ISecureSecSysRoleEnables rhs = (ISecureSecSysRoleEnables)obj;
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
        else if (obj instanceof ISecureSecSysRoleEnablesHPKey) {
        if (getPKey() != null) {
            return( getPKey().compareTo( obj ));
        }
        else {
            return( -1 );
        }
        }
        else if (obj instanceof ISecureSecSysRoleEnablesH) {
		ISecureSecSysRoleEnablesH rhs = (ISecureSecSysRoleEnablesH)obj;
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
        else if (obj instanceof ISecureSecSysRoleEnablesBySysRoleIdxKey ) {
            ISecureSecSysRoleEnablesBySysRoleIdxKey rhs = (ISecureSecSysRoleEnablesBySysRoleIdxKey)obj;
			if (getRequiredSecSysRoleId() != null) {
				if (rhs.getRequiredSecSysRoleId() != null) {
					cmp = getRequiredSecSysRoleId().compareTo( rhs.getRequiredSecSysRoleId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecSysRoleId() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureSecSysRoleEnablesByNameIdxKey ) {
            ISecureSecSysRoleEnablesByNameIdxKey rhs = (ISecureSecSysRoleEnablesByNameIdxKey)obj;
			if (getRequiredEnableName() != null) {
				if (rhs.getRequiredEnableName() != null) {
					cmp = getRequiredEnableName().compareTo( rhs.getRequiredEnableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredEnableName() != null) {
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
    public void set( ISecureSecSysRoleEnables src ) {
		setSecSysRoleEnables( src );
    }

	@Override
    public void setSecSysRoleEnables( ISecureSecSysRoleEnables src ) {
		setRequiredSecSysRoleId( src.getRequiredSecSysRoleId() );
		setRequiredEnableName( src.getRequiredEnableName() );
		setRequiredRevision( src.getRequiredRevision() );
    }

	@Override
    public void set( ISecureSecSysRoleEnablesH src ) {
		setSecSysRoleEnables( src );
    }

	@Override
    public void setSecSysRoleEnables( ISecureSecSysRoleEnablesH src ) {
		setRequiredSecSysRoleId( src.getRequiredSecSysRoleId() );
		setRequiredEnableName( src.getRequiredEnableName() );
		setRequiredRevision( src.getRequiredRevision() );
    }

    public String getXmlAttrFragment() {
        String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"";
        return( ret );
    }

    public String toString() {
        String ret = "<SecureBuffSecSysRoleEnablesH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
