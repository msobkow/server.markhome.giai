// Description: Java 25 implementation of a ISOTZone history buffer object

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

public class SecureBuffISOTZoneH
    implements ISecureISOTZoneH, Comparable<Object>, Serializable
{
    protected SecureBuffISOTZoneHPKey pkey;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(ISecurePubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(ISecurePubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected String requiredIso8601;
	protected String requiredTZName;
	protected short requiredTZHourOffset;
	protected short requiredTZMinOffset;
	protected String requiredDescription;
	protected boolean requiredVisible;

    public SecureBuffISOTZoneH() {
            // The primary key member attributes are initialized on construction
            pkey = new SecureBuffISOTZoneHPKey();
		requiredIso8601 = ISecurePubISOTZone.ISO8601_INIT_VALUE;
		requiredTZName = ISecurePubISOTZone.TZNAME_INIT_VALUE;
		requiredTZHourOffset = ISecurePubISOTZone.TZHOUROFFSET_INIT_VALUE;
		requiredTZMinOffset = ISecurePubISOTZone.TZMINOFFSET_INIT_VALUE;
		requiredDescription = ISecurePubISOTZone.DESCRIPTION_INIT_VALUE;
		requiredVisible = ISecurePubISOTZone.VISIBLE_INIT_VALUE;
    }

    @Override
    public int getClassCode() {
            return( ISecureISOTZone.CLASS_CODE );
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
    public ISecureISOTZoneHPKey getPKey() {
        return( pkey );
    }

    @Override
    public void setPKey( ISecureISOTZoneHPKey pkey ) {
        if (pkey != null) {
            if (pkey instanceof SecureBuffISOTZoneHPKey) {
                this.pkey = (SecureBuffISOTZoneHPKey)pkey;
            }
            else {
                throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureBuffISOTZoneHPKey");
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
	public short getRequiredISOTZoneId() {
		return(getPKey().getRequiredISOTZoneId());
	}

	@Override
	public void setRequiredISOTZoneId( short value ) {
		if( value < ISecurePubISOTZone.ISOTZONEID_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredISOTZoneId",
				1,
				"value",
				value,
				ISecurePubISOTZone.ISOTZONEID_MIN_VALUE );
		}
		getPKey().setRequiredISOTZoneId(value);
	}

	@Override
	public String getRequiredIso8601() {
		return(requiredIso8601);
	}

	public void setRequiredIso8601( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredIso8601",
				1,
				"value" );
		}
		else if( value.length() > 6 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredIso8601",
				1,
				"value.length()",
				value.length(),
				6 );
		}
		requiredIso8601 = value;
	}

	@Override
	public String getRequiredTZName() {
		return(requiredTZName);
	}

	public void setRequiredTZName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTZName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredTZName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredTZName = value;
	}

	@Override
	public short getRequiredTZHourOffset() {
		return(requiredTZHourOffset);
	}

	@Override
	public void setRequiredTZHourOffset( short value ) {
		if( value < ISecurePubISOTZone.TZHOUROFFSET_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredTZHourOffset",
				1,
				"value",
				value,
				ISecurePubISOTZone.TZHOUROFFSET_MIN_VALUE );
		}
		if( value > ISecurePubISOTZone.TZHOUROFFSET_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredTZHourOffset",
				1,
				"value",
				value,
				ISecurePubISOTZone.TZHOUROFFSET_MAX_VALUE );
		}
		requiredTZHourOffset = value;
	}

	@Override
	public short getRequiredTZMinOffset() {
		return(requiredTZMinOffset);
	}

	@Override
	public void setRequiredTZMinOffset( short value ) {
		if( value < ISecurePubISOTZone.TZMINOFFSET_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredTZMinOffset",
				1,
				"value",
				value,
				ISecurePubISOTZone.TZMINOFFSET_MIN_VALUE );
		}
		if( value > ISecurePubISOTZone.TZMINOFFSET_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredTZMinOffset",
				1,
				"value",
				value,
				ISecurePubISOTZone.TZMINOFFSET_MAX_VALUE );
		}
		requiredTZMinOffset = value;
	}

	@Override
	public String getRequiredDescription() {
		return(requiredDescription);
	}

	public void setRequiredDescription( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredDescription",
				1,
				"value" );
		}
		else if( value.length() > 128 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredDescription",
				1,
				"value.length()",
				value.length(),
				128 );
		}
		requiredDescription = value;
	}

	@Override
	public boolean getRequiredVisible() {
		return(requiredVisible);
	}

	public void setRequiredVisible( boolean value ) {
		requiredVisible = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof ISecureISOTZone) {
            ISecureISOTZone rhs = (ISecureISOTZone)obj;
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

			if( getRequiredIso8601() != null ) {
				if( rhs.getRequiredIso8601() != null ) {
					if( ! getRequiredIso8601().equals( rhs.getRequiredIso8601() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIso8601() != null ) {
					return( false );
				}
			}
			if( getRequiredTZName() != null ) {
				if( rhs.getRequiredTZName() != null ) {
					if( ! getRequiredTZName().equals( rhs.getRequiredTZName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTZName() != null ) {
					return( false );
				}
			}
			if( getRequiredTZHourOffset() != rhs.getRequiredTZHourOffset() ) {
				return( false );
			}
			if( getRequiredTZMinOffset() != rhs.getRequiredTZMinOffset() ) {
				return( false );
			}
			if( getRequiredDescription() != null ) {
				if( rhs.getRequiredDescription() != null ) {
					if( ! getRequiredDescription().equals( rhs.getRequiredDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredDescription() != null ) {
					return( false );
				}
			}
			if( getRequiredVisible() != rhs.getRequiredVisible() ) {
				return( false );
			}
            return( true );
        }
        else if (obj instanceof ISecureISOTZoneH) {
            ISecureISOTZoneH rhs = (ISecureISOTZoneH)obj;
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

			if( getRequiredIso8601() != null ) {
				if( rhs.getRequiredIso8601() != null ) {
					if( ! getRequiredIso8601().equals( rhs.getRequiredIso8601() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIso8601() != null ) {
					return( false );
				}
			}
			if( getRequiredTZName() != null ) {
				if( rhs.getRequiredTZName() != null ) {
					if( ! getRequiredTZName().equals( rhs.getRequiredTZName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTZName() != null ) {
					return( false );
				}
			}
			if( getRequiredTZHourOffset() != rhs.getRequiredTZHourOffset() ) {
				return( false );
			}
			if( getRequiredTZMinOffset() != rhs.getRequiredTZMinOffset() ) {
				return( false );
			}
			if( getRequiredDescription() != null ) {
				if( rhs.getRequiredDescription() != null ) {
					if( ! getRequiredDescription().equals( rhs.getRequiredDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredDescription() != null ) {
					return( false );
				}
			}
			if( getRequiredVisible() != rhs.getRequiredVisible() ) {
				return( false );
			}
            return( true );
        }
        else if (obj instanceof ISecureISOTZoneHPKey) {
		ISecureISOTZoneHPKey rhs = (ISecureISOTZoneHPKey)obj;
			if( getRequiredISOTZoneId() != rhs.getRequiredISOTZoneId() ) {
				return( false );
			}
		return( true );
        }
        else if (obj instanceof ISecureISOTZoneByOffsetIdxKey) {
            ISecureISOTZoneByOffsetIdxKey rhs = (ISecureISOTZoneByOffsetIdxKey)obj;
			if( getRequiredTZHourOffset() != rhs.getRequiredTZHourOffset() ) {
				return( false );
			}
			if( getRequiredTZMinOffset() != rhs.getRequiredTZMinOffset() ) {
				return( false );
			}
            return( true );
        }
        else if (obj instanceof ISecureISOTZoneByUTZNameIdxKey) {
            ISecureISOTZoneByUTZNameIdxKey rhs = (ISecureISOTZoneByUTZNameIdxKey)obj;
			if( getRequiredTZName() != null ) {
				if( rhs.getRequiredTZName() != null ) {
					if( ! getRequiredTZName().equals( rhs.getRequiredTZName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTZName() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureISOTZoneByIso8601IdxKey) {
            ISecureISOTZoneByIso8601IdxKey rhs = (ISecureISOTZoneByIso8601IdxKey)obj;
			if( getRequiredIso8601() != null ) {
				if( rhs.getRequiredIso8601() != null ) {
					if( ! getRequiredIso8601().equals( rhs.getRequiredIso8601() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIso8601() != null ) {
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
		if( getRequiredIso8601() != null ) {
			hashCode = hashCode + getRequiredIso8601().hashCode();
		}
		if( getRequiredTZName() != null ) {
			hashCode = hashCode + getRequiredTZName().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredTZHourOffset();
		hashCode = ( hashCode * 0x10000 ) + getRequiredTZMinOffset();
		if( getRequiredDescription() != null ) {
			hashCode = hashCode + getRequiredDescription().hashCode();
		}
		if( getRequiredVisible() ) {
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
        else if (obj instanceof ISecureISOTZone) {
		ISecureISOTZone rhs = (ISecureISOTZone)obj;
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
			if (getRequiredIso8601() != null) {
				if (rhs.getRequiredIso8601() != null) {
					cmp = getRequiredIso8601().compareTo( rhs.getRequiredIso8601() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIso8601() != null) {
				return( -1 );
			}
			if (getRequiredTZName() != null) {
				if (rhs.getRequiredTZName() != null) {
					cmp = getRequiredTZName().compareTo( rhs.getRequiredTZName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTZName() != null) {
				return( -1 );
			}
			if( getRequiredTZHourOffset() < rhs.getRequiredTZHourOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZHourOffset() > rhs.getRequiredTZHourOffset() ) {
				return( 1 );
			}
			if( getRequiredTZMinOffset() < rhs.getRequiredTZMinOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZMinOffset() > rhs.getRequiredTZMinOffset() ) {
				return( 1 );
			}
			if (getRequiredDescription() != null) {
				if (rhs.getRequiredDescription() != null) {
					cmp = getRequiredDescription().compareTo( rhs.getRequiredDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredDescription() != null) {
				return( -1 );
			}
			if( getRequiredVisible() ) {
				if( ! rhs.getRequiredVisible() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredVisible() ) {
					return( -1 );
				}
			}
            return( 0 );
        }
        else if (obj instanceof ISecureISOTZoneHPKey) {
        if (getPKey() != null) {
            return( getPKey().compareTo( obj ));
        }
        else {
            return( -1 );
        }
        }
        else if (obj instanceof ISecureISOTZoneH) {
		ISecureISOTZoneH rhs = (ISecureISOTZoneH)obj;
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
			if (getRequiredIso8601() != null) {
				if (rhs.getRequiredIso8601() != null) {
					cmp = getRequiredIso8601().compareTo( rhs.getRequiredIso8601() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIso8601() != null) {
				return( -1 );
			}
			if (getRequiredTZName() != null) {
				if (rhs.getRequiredTZName() != null) {
					cmp = getRequiredTZName().compareTo( rhs.getRequiredTZName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTZName() != null) {
				return( -1 );
			}
			if( getRequiredTZHourOffset() < rhs.getRequiredTZHourOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZHourOffset() > rhs.getRequiredTZHourOffset() ) {
				return( 1 );
			}
			if( getRequiredTZMinOffset() < rhs.getRequiredTZMinOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZMinOffset() > rhs.getRequiredTZMinOffset() ) {
				return( 1 );
			}
			if (getRequiredDescription() != null) {
				if (rhs.getRequiredDescription() != null) {
					cmp = getRequiredDescription().compareTo( rhs.getRequiredDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredDescription() != null) {
				return( -1 );
			}
			if( getRequiredVisible() ) {
				if( ! rhs.getRequiredVisible() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredVisible() ) {
					return( -1 );
				}
			}
            return( 0 );
        }
        else if (obj instanceof ISecureISOTZoneByOffsetIdxKey ) {
            ISecureISOTZoneByOffsetIdxKey rhs = (ISecureISOTZoneByOffsetIdxKey)obj;
			if( getRequiredTZHourOffset() < rhs.getRequiredTZHourOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZHourOffset() > rhs.getRequiredTZHourOffset() ) {
				return( 1 );
			}
			if( getRequiredTZMinOffset() < rhs.getRequiredTZMinOffset() ) {
				return( -1 );
			}
			else if( getRequiredTZMinOffset() > rhs.getRequiredTZMinOffset() ) {
				return( 1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureISOTZoneByUTZNameIdxKey ) {
            ISecureISOTZoneByUTZNameIdxKey rhs = (ISecureISOTZoneByUTZNameIdxKey)obj;
			if (getRequiredTZName() != null) {
				if (rhs.getRequiredTZName() != null) {
					cmp = getRequiredTZName().compareTo( rhs.getRequiredTZName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTZName() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureISOTZoneByIso8601IdxKey ) {
            ISecureISOTZoneByIso8601IdxKey rhs = (ISecureISOTZoneByIso8601IdxKey)obj;
			if (getRequiredIso8601() != null) {
				if (rhs.getRequiredIso8601() != null) {
					cmp = getRequiredIso8601().compareTo( rhs.getRequiredIso8601() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIso8601() != null) {
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
    public void set( ISecureISOTZone src ) {
		setISOTZone( src );
    }

	@Override
    public void setISOTZone( ISecureISOTZone src ) {
		setRequiredISOTZoneId( src.getRequiredISOTZoneId() );
		setRequiredIso8601( src.getRequiredIso8601() );
		setRequiredTZName( src.getRequiredTZName() );
		setRequiredTZHourOffset( src.getRequiredTZHourOffset() );
		setRequiredTZMinOffset( src.getRequiredTZMinOffset() );
		setRequiredDescription( src.getRequiredDescription() );
		setRequiredVisible( src.getRequiredVisible() );
		setRequiredRevision( src.getRequiredRevision() );
    }

	@Override
    public void set( ISecureISOTZoneH src ) {
		setISOTZone( src );
    }

	@Override
    public void setISOTZone( ISecureISOTZoneH src ) {
		setRequiredISOTZoneId( src.getRequiredISOTZoneId() );
		setRequiredIso8601( src.getRequiredIso8601() );
		setRequiredTZName( src.getRequiredTZName() );
		setRequiredTZHourOffset( src.getRequiredTZHourOffset() );
		setRequiredTZMinOffset( src.getRequiredTZMinOffset() );
		setRequiredDescription( src.getRequiredDescription() );
		setRequiredVisible( src.getRequiredVisible() );
		setRequiredRevision( src.getRequiredRevision() );
    }

    public String getXmlAttrFragment() {
        String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredIso8601=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredIso8601() ) + "\""
			+ " RequiredTZName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredTZName() ) + "\""
			+ " RequiredTZHourOffset=" + "\"" + Short.toString( getRequiredTZHourOffset() ) + "\""
			+ " RequiredTZMinOffset=" + "\"" + Short.toString( getRequiredTZMinOffset() ) + "\""
			+ " RequiredDescription=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredDescription() ) + "\""
			+ " RequiredVisible=" + (( getRequiredVisible() ) ? "\"true\"" : "\"false\"" );
        return( ret );
    }

    public String toString() {
        String ret = "<SecureBuffISOTZoneH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
