// Description: Java 25 JPA implementation of DbKeyHash256Col history objects

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
 *  BusModelJpaDbKeyHash256ColH provides history objects matching the BusModelDbKeyHash256Col change history.
 *	Note that because all indexes are historical with multiple instances of history records, the only key that can be unique is the primary key of a history table.
 */
@Entity
@Table(
    name = "dbk256col_h", schema = "BusModel31",
    indexes = {
        @Index(name = "DbKeyHash256ColIdIdx_h", columnList = "auditClusterId, auditStamp, auditAction, requiredRevision, auditSessionId, Id", unique = true),
        @Index(name = "DbKeyHash256ColTableIdx_h", columnList = "TableId", unique = false)
    }
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43081")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaDbKeyHash256ColH extends BusModelJpaDbKeyHash256DefH
    implements IBusModelDbKeyHash256ColH
{
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="TableId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredTableId;

    public BusModelJpaDbKeyHash256ColH() {
            super();
		requiredTableId = CFDbKeyHash256.fromHex( IBusModelPubDbKeyHash256Col.TABLEID_INIT_VALUE.toString() );
    }

    @Override
    public int getClassCode() {
            return( IBusModelDbKeyHash256Col.CLASS_CODE );
    }

	@Override
	public ICFKeyHash256 getRequiredTableId() {
		return(requiredTableId);
	}

	public void setRequiredTableId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTableId",
				1,
				"value" );
		}
		requiredTableId = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof IBusModelDbKeyHash256Col) {
            IBusModelDbKeyHash256Col rhs = (IBusModelDbKeyHash256Col)obj;
        if (!super.equals(obj)) {
            return( false );
        }
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelDbKeyHash256ColH) {
			if (!super.equals(obj)) {
				return( false );
			}
            IBusModelDbKeyHash256ColH rhs = (IBusModelDbKeyHash256ColH)obj;
        if (!super.equals(obj)) {
            return( false );
        }
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelValueHPKey) {
			return( super.equals(obj) );
        }
        else if (obj instanceof IBusModelDbKeyHash256ColByTableIdxKey) {
            IBusModelDbKeyHash256ColByTableIdxKey rhs = (IBusModelDbKeyHash256ColByTableIdxKey)obj;
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
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
		hashCode = hashCode + getRequiredTableId().hashCode();
        return( hashCode & 0x7fffffff );
    }

    @Override
    public int compareTo( Object obj ) {
        int cmp;
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof IBusModelDbKeyHash256Col) {
        cmp = super.compareTo(obj);
        if (cmp != 0) {
            return( cmp );
        }
        IBusModelDbKeyHash256Col rhs = (IBusModelDbKeyHash256Col)obj;
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelValueHPKey) {
        return( super.compareTo(obj) );
        }
        else if (obj instanceof IBusModelDbKeyHash256ColH) {
        cmp = super.compareTo(obj);
        if (cmp != 0) {
            return( cmp );
        }
        IBusModelDbKeyHash256ColH rhs = (IBusModelDbKeyHash256ColH)obj;
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelDbKeyHash256ColByTableIdxKey ) {
            IBusModelDbKeyHash256ColByTableIdxKey rhs = (IBusModelDbKeyHash256ColByTableIdxKey)obj;
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
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
		if( src instanceof IBusModelDbKeyHash256Col ) {
			setDbKeyHash256Col( (IBusModelDbKeyHash256Col)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaDbKeyHash256Col" );
		}
    }

	@Override
    public void setDbKeyHash256Col( IBusModelDbKeyHash256Col src ) {
        super.setDbKeyHash256Def( src );
		setRequiredTableId( src.getRequiredTableId() );
    }

	@Override
    public void set( IBusModelValueH src ) {
		if( src instanceof IBusModelDbKeyHash256ColH ) {
			setDbKeyHash256Col( (IBusModelDbKeyHash256ColH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelDbKeyHash256ColH" );
		}
    }

	@Override
    public void setDbKeyHash256Col( IBusModelDbKeyHash256ColH src ) {
        super.setDbKeyHash256Def( src );
		setRequiredTableId( src.getRequiredTableId() );
    }

    public String getXmlAttrFragment() {
        String ret = super.getXmlAttrFragment() 
			+ " RequiredTableId=" + "\"" + getRequiredTableId().toString() + "\"";
        return( ret );
    }

    public String toString() {
        String ret = "<BusModelJpaDbKeyHash256ColH" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}
