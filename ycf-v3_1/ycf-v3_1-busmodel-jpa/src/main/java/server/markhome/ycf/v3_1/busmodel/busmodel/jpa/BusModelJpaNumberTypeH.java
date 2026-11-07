// Description: Java 25 JPA implementation of NumberType history objects

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
 *  BusModelJpaNumberTypeH provides history objects matching the BusModelNumberType change history.
 *	Note that because all indexes are historical with multiple instances of history records, the only key that can be unique is the primary key of a history table.
 */
@Entity
@Table(
    name = "numtyp_h", schema = "BusModel31",
    indexes = {
        @Index(name = "NumberTypeIdIdx_h", columnList = "auditClusterId, auditStamp, auditAction, requiredRevision, auditSessionId, Id", unique = true),
        @Index(name = "NumberTypeSchemaDefIdx_h", columnList = "SchemaDefId", unique = false)
    }
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43058")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaNumberTypeH extends BusModelJpaNumberDefH
    implements IBusModelNumberTypeH
{
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SchemaDefId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredSchemaDefId;

    public BusModelJpaNumberTypeH() {
            super();
		requiredSchemaDefId = CFDbKeyHash256.fromHex( IBusModelPubNumberType.SCHEMADEFID_INIT_VALUE.toString() );
    }

    @Override
    public int getClassCode() {
            return( IBusModelNumberType.CLASS_CODE );
    }

	@Override
	public ICFKeyHash256 getRequiredSchemaDefId() {
		return(requiredSchemaDefId);
	}

	public void setRequiredSchemaDefId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSchemaDefId",
				1,
				"value" );
		}
		requiredSchemaDefId = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof IBusModelNumberType) {
            IBusModelNumberType rhs = (IBusModelNumberType)obj;
        if (!super.equals(obj)) {
            return( false );
        }
			if( getRequiredSchemaDefId() != null ) {
				if( rhs.getRequiredSchemaDefId() != null ) {
					if( ! getRequiredSchemaDefId().equals( rhs.getRequiredSchemaDefId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaDefId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelNumberTypeH) {
			if (!super.equals(obj)) {
				return( false );
			}
            IBusModelNumberTypeH rhs = (IBusModelNumberTypeH)obj;
        if (!super.equals(obj)) {
            return( false );
        }
			if( getRequiredSchemaDefId() != null ) {
				if( rhs.getRequiredSchemaDefId() != null ) {
					if( ! getRequiredSchemaDefId().equals( rhs.getRequiredSchemaDefId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaDefId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelValueHPKey) {
			return( super.equals(obj) );
        }
        else if (obj instanceof IBusModelNumberTypeBySchemaIdxKey) {
            IBusModelNumberTypeBySchemaIdxKey rhs = (IBusModelNumberTypeBySchemaIdxKey)obj;
			if( getRequiredSchemaDefId() != null ) {
				if( rhs.getRequiredSchemaDefId() != null ) {
					if( ! getRequiredSchemaDefId().equals( rhs.getRequiredSchemaDefId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaDefId() != null ) {
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
		hashCode = hashCode + getRequiredSchemaDefId().hashCode();
        return( hashCode & 0x7fffffff );
    }

    @Override
    public int compareTo( Object obj ) {
        int cmp;
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof IBusModelNumberType) {
        cmp = super.compareTo(obj);
        if (cmp != 0) {
            return( cmp );
        }
        IBusModelNumberType rhs = (IBusModelNumberType)obj;
			if (getRequiredSchemaDefId() != null) {
				if (rhs.getRequiredSchemaDefId() != null) {
					cmp = getRequiredSchemaDefId().compareTo( rhs.getRequiredSchemaDefId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaDefId() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelValueHPKey) {
        return( super.compareTo(obj) );
        }
        else if (obj instanceof IBusModelNumberTypeH) {
        cmp = super.compareTo(obj);
        if (cmp != 0) {
            return( cmp );
        }
        IBusModelNumberTypeH rhs = (IBusModelNumberTypeH)obj;
			if (getRequiredSchemaDefId() != null) {
				if (rhs.getRequiredSchemaDefId() != null) {
					cmp = getRequiredSchemaDefId().compareTo( rhs.getRequiredSchemaDefId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaDefId() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelNumberTypeBySchemaIdxKey ) {
            IBusModelNumberTypeBySchemaIdxKey rhs = (IBusModelNumberTypeBySchemaIdxKey)obj;
			if (getRequiredSchemaDefId() != null) {
				if (rhs.getRequiredSchemaDefId() != null) {
					cmp = getRequiredSchemaDefId().compareTo( rhs.getRequiredSchemaDefId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaDefId() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else {
        return( super.compareTo(obj) );
        }
    }
	@Override
    public void set( IBusModelValue src ) {
		if( src instanceof IBusModelNumberType ) {
			setNumberType( (IBusModelNumberType)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaNumberType" );
		}
    }

	@Override
    public void setNumberType( IBusModelNumberType src ) {
        super.setNumberDef( src );
		setRequiredSchemaDefId( src.getRequiredSchemaDefId() );
    }

	@Override
    public void set( IBusModelValueH src ) {
		if( src instanceof IBusModelNumberTypeH ) {
			setNumberType( (IBusModelNumberTypeH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelNumberTypeH" );
		}
    }

	@Override
    public void setNumberType( IBusModelNumberTypeH src ) {
        super.setNumberDef( src );
		setRequiredSchemaDefId( src.getRequiredSchemaDefId() );
    }

    public String getXmlAttrFragment() {
        String ret = super.getXmlAttrFragment() 
			+ " RequiredSchemaDefId=" + "\"" + getRequiredSchemaDefId().toString() + "\"";
        return( ret );
    }

    public String toString() {
        String ret = "<BusModelJpaNumberTypeH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
