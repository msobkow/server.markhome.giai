// Description: Java 25 JPA implementation of ClearDep history objects

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

package server.markhome.ycf.v3_1.busmodel.busmodel.jpa;

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
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

/**
 *  BusModelJpaClearDepH provides history objects matching the BusModelClearDep change history.
 *	Note that because all indexes are historical with multiple instances of history records, the only key that can be unique is the primary key of a history table.
 */
@Entity
@Table(
    name = "clr_dep_h", schema = "BusModel31",
    indexes = {
        @Index(name = "ClearDepIdIdx_h", columnList = "auditClusterId, auditStamp, auditAction, requiredRevision, auditSessionId, Id", unique = true),
        @Index(name = "ClearDepRelationIdx_h", columnList = "RelationId", unique = false),
        @Index(name = "ClearDepDefSchemaDefIdx_h", columnList = "defschid", unique = false)
    }
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43028")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaClearDepH extends BusModelJpaScopeH
    implements IBusModelClearDepH
{
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="RelationId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredRelationId;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="defschid", nullable=true, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 optionalDefSchemaId;

    public BusModelJpaClearDepH() {
            super();
		requiredRelationId = CFDbKeyHash256.fromHex( IBusModelPubClearDep.RELATIONID_INIT_VALUE.toString() );
		optionalDefSchemaId = CFDbKeyHash256.nullGet();
    }

    @Override
    public int getClassCode() {
            return( IBusModelClearDep.CLASS_CODE );
    }

	@Override
	public ICFKeyHash256 getRequiredRelationId() {
		return(requiredRelationId);
	}

	public void setRequiredRelationId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredRelationId",
				1,
				"value" );
		}
		requiredRelationId = value;
	}

	@Override
	public ICFKeyHash256 getOptionalDefSchemaId() {
		return(optionalDefSchemaId);
	}

	public void setOptionalDefSchemaId( ICFKeyHash256 value ) {
		optionalDefSchemaId = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof IBusModelClearDep) {
            IBusModelClearDep rhs = (IBusModelClearDep)obj;
        if (!super.equals(obj)) {
            return( false );
        }
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelClearDepH) {
			if (!super.equals(obj)) {
				return( false );
			}
            IBusModelClearDepH rhs = (IBusModelClearDepH)obj;
        if (!super.equals(obj)) {
            return( false );
        }
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelScopeHPKey) {
			return( super.equals(obj) );
        }
        else if (obj instanceof IBusModelClearDepByClearDepIdxKey) {
            IBusModelClearDepByClearDepIdxKey rhs = (IBusModelClearDepByClearDepIdxKey)obj;
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelClearDepByDefSchemaIdxKey) {
            IBusModelClearDepByDefSchemaIdxKey rhs = (IBusModelClearDepByDefSchemaIdxKey)obj;
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else {
			return( super.equals(obj) );
        }
    }
    
    @Override
    public int hashCode() {
        int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredRelationId().hashCode();
		if( getOptionalDefSchemaId() != null ) {
			hashCode = hashCode + getOptionalDefSchemaId().hashCode();
		}
        return( hashCode & 0x7fffffff );
    }

    @Override
    public int compareTo( Object obj ) {
        int cmp;
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof IBusModelClearDep) {
        cmp = super.compareTo(obj);
        if (cmp != 0) {
            return( cmp );
        }
        IBusModelClearDep rhs = (IBusModelClearDep)obj;
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelScopeHPKey) {
        return( super.compareTo(obj) );
        }
        else if (obj instanceof IBusModelClearDepH) {
        cmp = super.compareTo(obj);
        if (cmp != 0) {
            return( cmp );
        }
        IBusModelClearDepH rhs = (IBusModelClearDepH)obj;
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelClearDepByClearDepIdxKey ) {
            IBusModelClearDepByClearDepIdxKey rhs = (IBusModelClearDepByClearDepIdxKey)obj;
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelClearDepByDefSchemaIdxKey ) {
            IBusModelClearDepByDefSchemaIdxKey rhs = (IBusModelClearDepByDefSchemaIdxKey)obj;
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
            return( 0 );
        }
        else {
        return( super.compareTo(obj) );
        }
    }
	@Override
    public void set( IBusModelScope src ) {
		if( src instanceof IBusModelClearDep ) {
			setClearDep( (IBusModelClearDep)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaClearDep" );
		}
    }

	@Override
    public void setClearDep( IBusModelClearDep src ) {
        super.setScope( src );
		setRequiredRelationId( src.getRequiredRelationId() );
		setOptionalDefSchemaId( src.getOptionalDefSchemaId() );
    }

	@Override
    public void set( IBusModelScopeH src ) {
		if( src instanceof IBusModelClearDepH ) {
			setClearDep( (IBusModelClearDepH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelClearDepH" );
		}
    }

	@Override
    public void setClearDep( IBusModelClearDepH src ) {
        super.setScope( src );
		setRequiredRelationId( src.getRequiredRelationId() );
		setOptionalDefSchemaId( src.getOptionalDefSchemaId() );
    }

    public String getXmlAttrFragment() {
        String ret = super.getXmlAttrFragment() 
			+ " RequiredRelationId=" + "\"" + getRequiredRelationId().toString() + "\""
			+ " OptionalDefSchemaId=" + ( ( getOptionalDefSchemaId() == null ) ? "null" : "\"" + getOptionalDefSchemaId().toString() + "\"" );
        return( ret );
    }

    public String toString() {
        String ret = "<BusModelJpaClearDepH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
