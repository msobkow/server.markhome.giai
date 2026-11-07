// Description: Java 25 JPA implementation of a ClearSubDep1 entity definition object.

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
	name = "clrsubdep1", schema = "BusModel31",
	indexes = {
		@Index(name = "ClearSubDep1IdIdx", columnList = "Id", unique = true),
		@Index(name = "ClearSubDep1ClearTopDepIdx", columnList = "contclrdepid", unique = false),
		@Index(name = "ClearSubDep1UNameIdx", columnList = "contclrdepid, safe_name", unique = true),
		@Index(name = "ClearSubDep1ClearTopDepIdxClearTopDep", columnList = "contclrdepidClearTopDep", unique = false)
	}
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43029")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaClearSubDep1 extends BusModelJpaClearDep
	implements IBusModelClearSubDep1
{
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="contclrdepidClearTopDep", referencedColumnName="Id" )
	protected BusModelJpaClearTopDep requiredContainerClearTopDep;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerClearSubDep1")
	protected Set<BusModelJpaClearSubDep2> optionalComponentsClearDep;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="contclrdepid", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredClearTopDepId;
	@Column( name="safe_name", nullable=false, length=192 )
	protected String requiredName;

	public BusModelJpaClearSubDep1() {
		super();
		requiredClearTopDepId = CFDbKeyHash256.fromHex( IBusModelPubClearSubDep1.CLEARTOPDEPID_INIT_VALUE.toString() );
		requiredName = IBusModelPubClearSubDep1.NAME_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( IBusModelClearSubDep1.CLASS_CODE );
	}

	@Override
	public IBusModelClearTopDep getRequiredContainerClearTopDep() {
		return(requiredContainerClearTopDep);
	}

	@Override
	public void setRequiredContainerClearTopDep(IBusModelClearTopDep argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerClearTopDep", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaClearTopDep) {
			requiredContainerClearTopDep = (BusModelJpaClearTopDep)argObj;
			if (requiredContainerClearTopDep != null) {
				requiredClearTopDepId = requiredContainerClearTopDep.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerClearTopDep", "argObj", argObj, "BusModelJpaClearTopDep");
		}
	}

	@Override
	public void setRequiredContainerClearTopDep(IBusModelProtClearTopDep argObj) {
		setRequiredContainerClearTopDep(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerClearTopDep(IBusModelPubClearTopDep argObj) {
		setRequiredContainerClearTopDep(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerClearTopDep(ICFKeyHash256 argClearTopDepId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearTopDep", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelClearTopDepTable targetTable = targetBackingSchema.getTableClearTopDep();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearTopDep", 0, "IBusModelSchema.getBackingBusModel().getTableClearTopDep()");
		}
		IBusModelClearTopDep targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argClearTopDepId);
		setRequiredContainerClearTopDep(targetRec);
	}

	@Override
	public List<IBusModelClearSubDep2> getOptionalComponentsClearDep() {
		List<IBusModelClearSubDep2> retlist = (optionalComponentsClearDep != null) ? new ArrayList<>(optionalComponentsClearDep) : new ArrayList<>();
		return( retlist );
	}

	@Override
	public ICFKeyHash256 getRequiredClearTopDepId() {
		return(requiredClearTopDepId);
	}

	public void setRequiredClearTopDepId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredClearTopDepId",
				1,
				"value" );
		}
		requiredClearTopDepId = value;
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
		else if (obj instanceof IBusModelClearSubDep1) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelClearSubDep1 rhs = (IBusModelClearSubDep1)obj;
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
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
		else if (obj instanceof IBusModelClearSubDep1H) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelClearSubDep1H rhs = (IBusModelClearSubDep1H)obj;
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
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
		else if (obj instanceof IBusModelClearSubDep1ByClearTopDepIdxKey) {
			IBusModelClearSubDep1ByClearTopDepIdxKey rhs = (IBusModelClearSubDep1ByClearTopDepIdxKey)obj;
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelClearSubDep1ByUNameIdxKey) {
			IBusModelClearSubDep1ByUNameIdxKey rhs = (IBusModelClearSubDep1ByUNameIdxKey)obj;
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
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
		hashCode = hashCode + getRequiredClearTopDepId().hashCode();
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
		else if (obj instanceof IBusModelClearSubDep1) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelClearSubDep1 rhs = (IBusModelClearSubDep1)obj;
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
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
		else if( obj instanceof IBusModelClearSubDep1H ) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelClearSubDep1H rhs = (IBusModelClearSubDep1H)obj;
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
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
		else if (obj instanceof IBusModelClearSubDep1ByClearTopDepIdxKey) {
			IBusModelClearSubDep1ByClearTopDepIdxKey rhs = (IBusModelClearSubDep1ByClearTopDepIdxKey)obj;
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelClearSubDep1ByUNameIdxKey) {
			IBusModelClearSubDep1ByUNameIdxKey rhs = (IBusModelClearSubDep1ByUNameIdxKey)obj;
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
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
		if( src instanceof IBusModelClearSubDep1 ) {
			setClearSubDep1( (IBusModelClearSubDep1)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaClearSubDep1" );
		}
	}

	@Override
	public void setClearSubDep1( IBusModelClearSubDep1 src ) {
		super.setClearDep( src );
		setRequiredContainerClearTopDep(src.getRequiredContainerClearTopDep());
		setRequiredClearTopDepId(src.getRequiredClearTopDepId());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public void set( IBusModelScopeH src ) {
		if( src instanceof IBusModelClearSubDep1H ) {
			setClearSubDep1( (IBusModelClearSubDep1H)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelClearSubDep1H" );
		}
	}

	@Override
	public void setClearSubDep1( IBusModelClearSubDep1H src ) {
		super.setClearDep( src );
		setRequiredContainerClearTopDep(src.getRequiredClearTopDepId());
		setRequiredClearTopDepId(src.getRequiredClearTopDepId());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredClearTopDepId=" + "\"" + getRequiredClearTopDepId().toString() + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelJpaClearSubDep1" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
