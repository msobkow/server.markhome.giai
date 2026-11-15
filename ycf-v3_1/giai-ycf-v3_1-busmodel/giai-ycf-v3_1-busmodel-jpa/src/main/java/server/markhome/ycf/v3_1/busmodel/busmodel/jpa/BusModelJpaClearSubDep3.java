// Description: Java 25 JPA implementation of a ClearSubDep3 entity definition object.

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

@Entity
@Table(
	name = "clrsubdep3", schema = "BusModel31",
	indexes = {
		@Index(name = "ClearSubDep3IdIdx", columnList = "Id", unique = true),
		@Index(name = "ClearSubDep3ClearSubDep2Idx", columnList = "contclrdep2id", unique = false),
		@Index(name = "ClearSubDep3UNameIdx", columnList = "contclrdep2id, safe_name", unique = true),
		@Index(name = "ClearSubDep3ClearSubDep2IdxClearSubDep2", columnList = "contclrdep2idClearSubDep2", unique = false)
	}
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43031")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaClearSubDep3 extends BusModelJpaClearDep
	implements IBusModelClearSubDep3
{
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="contclrdep2idClearSubDep2", referencedColumnName="Id" )
	protected BusModelJpaClearSubDep2 requiredContainerClearSubDep2;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="contclrdep2id", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredClearSubDep2Id;
	@Column( name="safe_name", nullable=false, length=192 )
	protected String requiredName;

	public BusModelJpaClearSubDep3() {
		super();
		requiredClearSubDep2Id = CFDbKeyHash256.fromHex( IBusModelPubClearSubDep3.CLEARSUBDEP2ID_INIT_VALUE.toString() );
		requiredName = IBusModelPubClearSubDep3.NAME_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( IBusModelClearSubDep3.CLASS_CODE );
	}

	@Override
	public IBusModelClearSubDep2 getRequiredContainerClearSubDep2() {
		return(requiredContainerClearSubDep2);
	}

	@Override
	public void setRequiredContainerClearSubDep2(IBusModelClearSubDep2 argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerClearSubDep2", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaClearSubDep2) {
			requiredContainerClearSubDep2 = (BusModelJpaClearSubDep2)argObj;
			if (requiredContainerClearSubDep2 != null) {
				requiredClearSubDep2Id = requiredContainerClearSubDep2.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerClearSubDep2", "argObj", argObj, "BusModelJpaClearSubDep2");
		}
	}

	@Override
	public void setRequiredContainerClearSubDep2(IBusModelProtClearSubDep2 argObj) {
		setRequiredContainerClearSubDep2(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerClearSubDep2(IBusModelPubClearSubDep2 argObj) {
		setRequiredContainerClearSubDep2(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerClearSubDep2(ICFKeyHash256 argClearSubDep2Id) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearSubDep2", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelClearSubDep2Table targetTable = targetBackingSchema.getTableClearSubDep2();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearSubDep2", 0, "IBusModelSchema.getBackingBusModel().getTableClearSubDep2()");
		}
		IBusModelClearSubDep2 targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argClearSubDep2Id);
		setRequiredContainerClearSubDep2(targetRec);
	}

	@Override
	public ICFKeyHash256 getRequiredClearSubDep2Id() {
		return(requiredClearSubDep2Id);
	}

	public void setRequiredClearSubDep2Id( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredClearSubDep2Id",
				1,
				"value" );
		}
		requiredClearSubDep2Id = value;
	}

	@Override
	public String getRequiredName() {
		return(requiredName);
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		else if( value.length() > 192 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredName = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof IBusModelClearSubDep3) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelClearSubDep3 rhs = (IBusModelClearSubDep3)obj;
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelClearSubDep3H) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelClearSubDep3H rhs = (IBusModelClearSubDep3H)obj;
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelScopeHPKey) {
			return( super.equals(obj) );
		}
		else if (obj instanceof IBusModelClearSubDep3ByClearSubDep2IdxKey) {
			IBusModelClearSubDep3ByClearSubDep2IdxKey rhs = (IBusModelClearSubDep3ByClearSubDep2IdxKey)obj;
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelClearSubDep3ByUNameIdxKey) {
			IBusModelClearSubDep3ByUNameIdxKey rhs = (IBusModelClearSubDep3ByUNameIdxKey)obj;
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
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
		hashCode = hashCode + getRequiredClearSubDep2Id().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof IBusModelClearSubDep3) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelClearSubDep3 rhs = (IBusModelClearSubDep3)obj;
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelClearSubDep3H ) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelClearSubDep3H rhs = (IBusModelClearSubDep3H)obj;
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelClearSubDep3ByClearSubDep2IdxKey) {
			IBusModelClearSubDep3ByClearSubDep2IdxKey rhs = (IBusModelClearSubDep3ByClearSubDep2IdxKey)obj;
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelClearSubDep3ByUNameIdxKey) {
			IBusModelClearSubDep3ByUNameIdxKey rhs = (IBusModelClearSubDep3ByUNameIdxKey)obj;
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else {
			cmp = super.compareTo(obj);
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelScope src ) {
		if( src instanceof IBusModelClearSubDep3 ) {
			setClearSubDep3( (IBusModelClearSubDep3)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaClearSubDep3" );
		}
	}

	@Override
	public void setClearSubDep3( IBusModelClearSubDep3 src ) {
		super.setClearDep( src );
		setRequiredContainerClearSubDep2(src.getRequiredContainerClearSubDep2());
		setRequiredClearSubDep2Id(src.getRequiredClearSubDep2Id());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public void set( IBusModelScopeH src ) {
		if( src instanceof IBusModelClearSubDep3H ) {
			setClearSubDep3( (IBusModelClearSubDep3H)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelClearSubDep3H" );
		}
	}

	@Override
	public void setClearSubDep3( IBusModelClearSubDep3H src ) {
		super.setClearDep( src );
		setRequiredContainerClearSubDep2(src.getRequiredClearSubDep2Id());
		setRequiredClearSubDep2Id(src.getRequiredClearSubDep2Id());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredClearSubDep2Id=" + "\"" + getRequiredClearSubDep2Id().toString() + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelJpaClearSubDep3" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
