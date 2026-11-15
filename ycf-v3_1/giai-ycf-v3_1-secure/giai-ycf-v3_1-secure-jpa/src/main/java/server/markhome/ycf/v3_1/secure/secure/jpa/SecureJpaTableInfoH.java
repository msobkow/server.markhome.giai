// Description: Java 25 JPA implementation of TableInfo history objects

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
 *  SecureJpaTableInfoH provides history objects matching the SecureTableInfo change history.
 *	Note that because all indexes are historical with multiple instances of history records, the only key that can be unique is the primary key of a history table.
 */
@Entity
@Table(
    name = "table_info_h", schema = "Secure31",
    indexes = {
        @Index(name = "TableInfoIdIdx_h", columnList = "auditClusterId, auditStamp, auditAction, requiredRevision, auditSessionId, TableInfoId", unique = true),
        @Index(name = "TableInfoTableNameIdx_h", columnList = "tbl_name", unique = false),
        @Index(name = "TableInfoSuperNameIdx_h", columnList = "sup_name", unique = false),
        @Index(name = "TableInfoSchemaNameIdx_h", columnList = "sch_name", unique = false),
        @Index(name = "TableInfoSchemaBkCodeIdx_h", columnList = "sch_name, back_clscode", unique = false),
        @Index(name = "TableInfoSchemaRTCodeIdx_h", columnList = "runtm_clscode", unique = false)
    }
)
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "SecurePU")
public class SecureJpaTableInfoH
    implements ISecureTableInfoH, Comparable<Object>, Serializable
{
	@AttributeOverrides({
		@AttributeOverride(name="auditClusterId", column = @Column( name="auditClusterId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="auditStamp", column = @Column( name="auditStamp", nullable=false ) ),
		@AttributeOverride(name="auditAction", column = @Column( name="auditAction", nullable=false ) ),
		@AttributeOverride(name="requiredRevision", column = @Column( name="requiredRevision", nullable=false ) ),
		@AttributeOverride(name="auditSessionId", column = @Column( name="auditSessionId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) ),
		@AttributeOverride(name="TableInfoId", column = @Column( name="TableInfoId", nullable=false ) )
	})
    @EmbeddedId
    protected SecureJpaTableInfoHPKey pkey;
	@Column( name="sch_name", nullable=false, length=32 )
	protected String requiredSchemaName;
	@Column( name="tbl_name", nullable=false, length=64 )
	protected String requiredTableName;
	@Column( name="sup_name", nullable=true, length=64 )
	protected String optionalSuperName;
	@Column( name="back_clscode", nullable=false )
	protected int requiredBackingClassCode;
	@Column( name="runtm_clscode", nullable=false )
	protected int requiredRuntimeClassCode;
	@Column( name="has_hist", nullable=false )
	protected boolean requiredHasHistory;
	@Column( name="is_mutable", nullable=false )
	protected boolean requiredIsMutable;
	@Column( name="sec_scope_name", nullable=false, length=32 )
	protected String requiredSecScopeName;
	@Column( name="cd_vis", nullable=false, length=32 )
	protected String requiredCodeVis;

    public SecureJpaTableInfoH() {
            // The primary key member attributes are initialized on construction
            pkey = new SecureJpaTableInfoHPKey();
		requiredSchemaName = ISecurePubTableInfo.SCHEMANAME_INIT_VALUE;
		requiredTableName = ISecurePubTableInfo.TABLENAME_INIT_VALUE;
		optionalSuperName = null;
		requiredBackingClassCode = ISecurePubTableInfo.BACKINGCLASSCODE_INIT_VALUE;
		requiredRuntimeClassCode = ISecurePubTableInfo.RUNTIMECLASSCODE_INIT_VALUE;
		requiredHasHistory = ISecurePubTableInfo.HASHISTORY_INIT_VALUE;
		requiredIsMutable = ISecurePubTableInfo.ISMUTABLE_INIT_VALUE;
		requiredSecScopeName = ISecurePubTableInfo.SECSCOPENAME_INIT_VALUE;
		requiredCodeVis = ISecurePubTableInfo.CODEVIS_INIT_VALUE;
    }

    @Override
    public int getClassCode() {
            return( ISecureTableInfo.CLASS_CODE );
    }

    @Override
    public ISecureTableInfoHPKey getPKey() {
        return( pkey );
    }

    @Override
    public void setPKey( ISecureTableInfoHPKey pkey ) {
        if (pkey != null) {
            if (pkey instanceof SecureJpaTableInfoHPKey) {
                this.pkey = (SecureJpaTableInfoHPKey)pkey;
            }
            else {
                throw new CFUnsupportedClassException(getClass(), "setPKey", "pkey", pkey, "SecureJpaTableInfoHPKey");
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
    public int getRequiredTableInfoId() {
        return( pkey.getRequiredTableInfoId() );
    }

    @Override
    public void setRequiredTableInfoId( int requiredTableInfoId ) {
        pkey.setRequiredTableInfoId( requiredTableInfoId );
    }

	@Override
	public String getRequiredSchemaName() {
		return(requiredSchemaName);
	}

	public void setRequiredSchemaName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSchemaName",
				1,
				"value" );
		}
		else if( value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredSchemaName",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredSchemaName = value;
	}

	@Override
	public String getRequiredTableName() {
		return(requiredTableName);
	}

	public void setRequiredTableName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTableName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredTableName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredTableName = value;
	}

	@Override
	public String getOptionalSuperName() {
		return(optionalSuperName);
	}

	public void setOptionalSuperName( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalSuperName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalSuperName = value;
	}

	@Override
	public int getRequiredBackingClassCode() {
		return(requiredBackingClassCode);
	}

	@Override
	public void setRequiredBackingClassCode( int value ) {
		if( value < ISecurePubTableInfo.BACKINGCLASSCODE_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredBackingClassCode",
				1,
				"value",
				value,
				ISecurePubTableInfo.BACKINGCLASSCODE_MIN_VALUE );
		}
		requiredBackingClassCode = value;
	}

	@Override
	public int getRequiredRuntimeClassCode() {
		return(requiredRuntimeClassCode);
	}

	@Override
	public void setRequiredRuntimeClassCode( int value ) {
		if( value < ISecurePubTableInfo.RUNTIMECLASSCODE_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredRuntimeClassCode",
				1,
				"value",
				value,
				ISecurePubTableInfo.RUNTIMECLASSCODE_MIN_VALUE );
		}
		requiredRuntimeClassCode = value;
	}

	@Override
	public boolean getRequiredHasHistory() {
		return(requiredHasHistory);
	}

	public void setRequiredHasHistory( boolean value ) {
		requiredHasHistory = value;
	}

	@Override
	public boolean getRequiredIsMutable() {
		return(requiredIsMutable);
	}

	public void setRequiredIsMutable( boolean value ) {
		requiredIsMutable = value;
	}

	@Override
	public String getRequiredSecScopeName() {
		return(requiredSecScopeName);
	}

	public void setRequiredSecScopeName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecScopeName",
				1,
				"value" );
		}
		else if( value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredSecScopeName",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredSecScopeName = value;
	}

	@Override
	public String getRequiredCodeVis() {
		return(requiredCodeVis);
	}

	public void setRequiredCodeVis( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredCodeVis",
				1,
				"value" );
		}
		else if( value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredCodeVis",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredCodeVis = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof ISecureTableInfo) {
            ISecureTableInfo rhs = (ISecureTableInfo)obj;
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

			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			if( getRequiredTableName() != null ) {
				if( rhs.getRequiredTableName() != null ) {
					if( ! getRequiredTableName().equals( rhs.getRequiredTableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableName() != null ) {
					return( false );
				}
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					if( ! getOptionalSuperName().equals( rhs.getOptionalSuperName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( false );
				}
			}
			if( getRequiredBackingClassCode() != rhs.getRequiredBackingClassCode() ) {
				return( false );
			}
			if( getRequiredRuntimeClassCode() != rhs.getRequiredRuntimeClassCode() ) {
				return( false );
			}
			if( getRequiredHasHistory() != rhs.getRequiredHasHistory() ) {
				return( false );
			}
			if( getRequiredIsMutable() != rhs.getRequiredIsMutable() ) {
				return( false );
			}
			if( getRequiredSecScopeName() != null ) {
				if( rhs.getRequiredSecScopeName() != null ) {
					if( ! getRequiredSecScopeName().equals( rhs.getRequiredSecScopeName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecScopeName() != null ) {
					return( false );
				}
			}
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureTableInfoH) {
            ISecureTableInfoH rhs = (ISecureTableInfoH)obj;
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

			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			if( getRequiredTableName() != null ) {
				if( rhs.getRequiredTableName() != null ) {
					if( ! getRequiredTableName().equals( rhs.getRequiredTableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableName() != null ) {
					return( false );
				}
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					if( ! getOptionalSuperName().equals( rhs.getOptionalSuperName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( false );
				}
			}
			if( getRequiredBackingClassCode() != rhs.getRequiredBackingClassCode() ) {
				return( false );
			}
			if( getRequiredRuntimeClassCode() != rhs.getRequiredRuntimeClassCode() ) {
				return( false );
			}
			if( getRequiredHasHistory() != rhs.getRequiredHasHistory() ) {
				return( false );
			}
			if( getRequiredIsMutable() != rhs.getRequiredIsMutable() ) {
				return( false );
			}
			if( getRequiredSecScopeName() != null ) {
				if( rhs.getRequiredSecScopeName() != null ) {
					if( ! getRequiredSecScopeName().equals( rhs.getRequiredSecScopeName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecScopeName() != null ) {
					return( false );
				}
			}
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureTableInfoHPKey) {
		ISecureTableInfoHPKey rhs = (ISecureTableInfoHPKey)obj;
			if( getRequiredTableInfoId() != rhs.getRequiredTableInfoId() ) {
				return( false );
			}
		return( true );
        }
        else if (obj instanceof ISecureTableInfoByTableNameIdxKey) {
            ISecureTableInfoByTableNameIdxKey rhs = (ISecureTableInfoByTableNameIdxKey)obj;
			if( getRequiredTableName() != null ) {
				if( rhs.getRequiredTableName() != null ) {
					if( ! getRequiredTableName().equals( rhs.getRequiredTableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableName() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureTableInfoBySuperNameIdxKey) {
            ISecureTableInfoBySuperNameIdxKey rhs = (ISecureTableInfoBySuperNameIdxKey)obj;
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					if( ! getOptionalSuperName().equals( rhs.getOptionalSuperName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureTableInfoBySchemaNameIdxKey) {
            ISecureTableInfoBySchemaNameIdxKey rhs = (ISecureTableInfoBySchemaNameIdxKey)obj;
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof ISecureTableInfoBySchemaBkCodeIdxKey) {
            ISecureTableInfoBySchemaBkCodeIdxKey rhs = (ISecureTableInfoBySchemaBkCodeIdxKey)obj;
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			if( getRequiredBackingClassCode() != rhs.getRequiredBackingClassCode() ) {
				return( false );
			}
            return( true );
        }
        else if (obj instanceof ISecureTableInfoBySchemaRTCodeIdxKey) {
            ISecureTableInfoBySchemaRTCodeIdxKey rhs = (ISecureTableInfoBySchemaRTCodeIdxKey)obj;
			if( getRequiredRuntimeClassCode() != rhs.getRequiredRuntimeClassCode() ) {
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
		if( getRequiredSchemaName() != null ) {
			hashCode = hashCode + getRequiredSchemaName().hashCode();
		}
		if( getRequiredTableName() != null ) {
			hashCode = hashCode + getRequiredTableName().hashCode();
		}
		if( getOptionalSuperName() != null ) {
			hashCode = hashCode + getOptionalSuperName().hashCode();
		}
		hashCode = hashCode + getRequiredBackingClassCode();
		hashCode = hashCode + getRequiredRuntimeClassCode();
		if( getRequiredHasHistory() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		if( getRequiredIsMutable() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		if( getRequiredSecScopeName() != null ) {
			hashCode = hashCode + getRequiredSecScopeName().hashCode();
		}
		if( getRequiredCodeVis() != null ) {
			hashCode = hashCode + getRequiredCodeVis().hashCode();
		}
        return( hashCode & 0x7fffffff );
    }

    @Override
    public int compareTo( Object obj ) {
        int cmp;
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof ISecureTableInfo) {
		ISecureTableInfo rhs = (ISecureTableInfo)obj;
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
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
			if (getRequiredTableName() != null) {
				if (rhs.getRequiredTableName() != null) {
					cmp = getRequiredTableName().compareTo( rhs.getRequiredTableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableName() != null) {
				return( -1 );
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					cmp = getOptionalSuperName().compareTo( rhs.getOptionalSuperName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( -1 );
				}
			}
			if( getRequiredBackingClassCode() < rhs.getRequiredBackingClassCode() ) {
				return( -1 );
			}
			else if( getRequiredBackingClassCode() > rhs.getRequiredBackingClassCode() ) {
				return( 1 );
			}
			if( getRequiredRuntimeClassCode() < rhs.getRequiredRuntimeClassCode() ) {
				return( -1 );
			}
			else if( getRequiredRuntimeClassCode() > rhs.getRequiredRuntimeClassCode() ) {
				return( 1 );
			}
			if( getRequiredHasHistory() ) {
				if( ! rhs.getRequiredHasHistory() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredHasHistory() ) {
					return( -1 );
				}
			}
			if( getRequiredIsMutable() ) {
				if( ! rhs.getRequiredIsMutable() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsMutable() ) {
					return( -1 );
				}
			}
			if (getRequiredSecScopeName() != null) {
				if (rhs.getRequiredSecScopeName() != null) {
					cmp = getRequiredSecScopeName().compareTo( rhs.getRequiredSecScopeName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecScopeName() != null) {
				return( -1 );
			}
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureTableInfoHPKey) {
        if (getPKey() != null) {
            return( getPKey().compareTo( obj ));
        }
        else {
            return( -1 );
        }
        }
        else if (obj instanceof ISecureTableInfoH) {
		ISecureTableInfoH rhs = (ISecureTableInfoH)obj;
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
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
			if (getRequiredTableName() != null) {
				if (rhs.getRequiredTableName() != null) {
					cmp = getRequiredTableName().compareTo( rhs.getRequiredTableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableName() != null) {
				return( -1 );
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					cmp = getOptionalSuperName().compareTo( rhs.getOptionalSuperName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( -1 );
				}
			}
			if( getRequiredBackingClassCode() < rhs.getRequiredBackingClassCode() ) {
				return( -1 );
			}
			else if( getRequiredBackingClassCode() > rhs.getRequiredBackingClassCode() ) {
				return( 1 );
			}
			if( getRequiredRuntimeClassCode() < rhs.getRequiredRuntimeClassCode() ) {
				return( -1 );
			}
			else if( getRequiredRuntimeClassCode() > rhs.getRequiredRuntimeClassCode() ) {
				return( 1 );
			}
			if( getRequiredHasHistory() ) {
				if( ! rhs.getRequiredHasHistory() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredHasHistory() ) {
					return( -1 );
				}
			}
			if( getRequiredIsMutable() ) {
				if( ! rhs.getRequiredIsMutable() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsMutable() ) {
					return( -1 );
				}
			}
			if (getRequiredSecScopeName() != null) {
				if (rhs.getRequiredSecScopeName() != null) {
					cmp = getRequiredSecScopeName().compareTo( rhs.getRequiredSecScopeName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecScopeName() != null) {
				return( -1 );
			}
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureTableInfoByTableNameIdxKey ) {
            ISecureTableInfoByTableNameIdxKey rhs = (ISecureTableInfoByTableNameIdxKey)obj;
			if (getRequiredTableName() != null) {
				if (rhs.getRequiredTableName() != null) {
					cmp = getRequiredTableName().compareTo( rhs.getRequiredTableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableName() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureTableInfoBySuperNameIdxKey ) {
            ISecureTableInfoBySuperNameIdxKey rhs = (ISecureTableInfoBySuperNameIdxKey)obj;
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					cmp = getOptionalSuperName().compareTo( rhs.getOptionalSuperName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( -1 );
				}
			}
            return( 0 );
        }
        else if (obj instanceof ISecureTableInfoBySchemaNameIdxKey ) {
            ISecureTableInfoBySchemaNameIdxKey rhs = (ISecureTableInfoBySchemaNameIdxKey)obj;
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureTableInfoBySchemaBkCodeIdxKey ) {
            ISecureTableInfoBySchemaBkCodeIdxKey rhs = (ISecureTableInfoBySchemaBkCodeIdxKey)obj;
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
			if( getRequiredBackingClassCode() < rhs.getRequiredBackingClassCode() ) {
				return( -1 );
			}
			else if( getRequiredBackingClassCode() > rhs.getRequiredBackingClassCode() ) {
				return( 1 );
			}
            return( 0 );
        }
        else if (obj instanceof ISecureTableInfoBySchemaRTCodeIdxKey ) {
            ISecureTableInfoBySchemaRTCodeIdxKey rhs = (ISecureTableInfoBySchemaRTCodeIdxKey)obj;
			if( getRequiredRuntimeClassCode() < rhs.getRequiredRuntimeClassCode() ) {
				return( -1 );
			}
			else if( getRequiredRuntimeClassCode() > rhs.getRequiredRuntimeClassCode() ) {
				return( 1 );
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
    public void set( ISecureTableInfo src ) {
		setTableInfo( src );
    }

	@Override
    public void setTableInfo( ISecureTableInfo src ) {
		setRequiredTableInfoId( src.getRequiredTableInfoId() );
		setRequiredSchemaName( src.getRequiredSchemaName() );
		setRequiredTableName( src.getRequiredTableName() );
		setOptionalSuperName( src.getOptionalSuperName() );
		setRequiredBackingClassCode( src.getRequiredBackingClassCode() );
		setRequiredRuntimeClassCode( src.getRequiredRuntimeClassCode() );
		setRequiredHasHistory( src.getRequiredHasHistory() );
		setRequiredIsMutable( src.getRequiredIsMutable() );
		setRequiredSecScopeName( src.getRequiredSecScopeName() );
		setRequiredCodeVis( src.getRequiredCodeVis() );
		setRequiredRevision( src.getRequiredRevision() );
    }

	@Override
    public void set( ISecureTableInfoH src ) {
		setTableInfo( src );
    }

	@Override
    public void setTableInfo( ISecureTableInfoH src ) {
		setRequiredTableInfoId( src.getRequiredTableInfoId() );
		setRequiredSchemaName( src.getRequiredSchemaName() );
		setRequiredTableName( src.getRequiredTableName() );
		setOptionalSuperName( src.getOptionalSuperName() );
		setRequiredBackingClassCode( src.getRequiredBackingClassCode() );
		setRequiredRuntimeClassCode( src.getRequiredRuntimeClassCode() );
		setRequiredHasHistory( src.getRequiredHasHistory() );
		setRequiredIsMutable( src.getRequiredIsMutable() );
		setRequiredSecScopeName( src.getRequiredSecScopeName() );
		setRequiredCodeVis( src.getRequiredCodeVis() );
		setRequiredRevision( src.getRequiredRevision() );
    }

    public String getXmlAttrFragment() {
        String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredSchemaName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredSchemaName() ) + "\""
			+ " RequiredTableName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredTableName() ) + "\""
			+ " OptionalSuperName=" + ( ( getOptionalSuperName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalSuperName() ) + "\"" )
			+ " RequiredBackingClassCode=" + "\"" + Integer.toString( getRequiredBackingClassCode() ) + "\""
			+ " RequiredRuntimeClassCode=" + "\"" + Integer.toString( getRequiredRuntimeClassCode() ) + "\""
			+ " RequiredHasHistory=" + (( getRequiredHasHistory() ) ? "\"true\"" : "\"false\"" )
			+ " RequiredIsMutable=" + (( getRequiredIsMutable() ) ? "\"true\"" : "\"false\"" )
			+ " RequiredSecScopeName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredSecScopeName() ) + "\""
			+ " RequiredCodeVis=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredCodeVis() ) + "\"";
        return( ret );
    }

    public String toString() {
        String ret = "<SecureJpaTableInfoH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
