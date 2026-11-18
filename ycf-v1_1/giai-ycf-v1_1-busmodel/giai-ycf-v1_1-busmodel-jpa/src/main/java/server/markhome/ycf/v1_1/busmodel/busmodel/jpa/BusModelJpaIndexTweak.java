// Description: Java 25 JPA implementation of a IndexTweak entity definition object.

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
	name = "idxtwk", schema = "BusModel31",
	indexes = {
		@Index(name = "IndexTweakIdIdx", columnList = "Id", unique = true),
		@Index(name = "IndexTweakIndexIdx", columnList = "IndexId", unique = false),
		@Index(name = "IndexTweakIndexIdxIndexDef", columnList = "IndexIdIndexDef", unique = false)
	}
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43019")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaIndexTweak extends BusModelJpaTweak
	implements IBusModelIndexTweak
{
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="IndexIdIndexDef", referencedColumnName="Id" )
	protected BusModelJpaIndex requiredContainerIndexDef;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="IndexId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredIndexId;

	public BusModelJpaIndexTweak() {
		super();
		requiredIndexId = CFDbKeyHash256.fromHex( IBusModelPubIndexTweak.INDEXID_INIT_VALUE.toString() );
	}

	@Override
	public int getClassCode() {
		return( IBusModelIndexTweak.CLASS_CODE );
	}

	@Override
	public IBusModelIndex getRequiredContainerIndexDef() {
		return(requiredContainerIndexDef);
	}

	@Override
	public void setRequiredContainerIndexDef(IBusModelIndex argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerIndexDef", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaIndex) {
			requiredContainerIndexDef = (BusModelJpaIndex)argObj;
			if (requiredContainerIndexDef != null) {
				requiredIndexId = requiredContainerIndexDef.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerIndexDef", "argObj", argObj, "BusModelJpaIndex");
		}
	}

	@Override
	public void setRequiredContainerIndexDef(IBusModelProtIndex argObj) {
		setRequiredContainerIndexDef(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerIndexDef(IBusModelPubIndex argObj) {
		setRequiredContainerIndexDef(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerIndexDef(ICFKeyHash256 argIndexId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerIndexDef", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelIndexTable targetTable = targetBackingSchema.getTableIndex();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerIndexDef", 0, "IBusModelSchema.getBackingBusModel().getTableIndex()");
		}
		IBusModelIndex targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argIndexId);
		setRequiredContainerIndexDef(targetRec);
	}

	@Override
	public ICFKeyHash256 getRequiredIndexId() {
		return(requiredIndexId);
	}

	public void setRequiredIndexId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredIndexId",
				1,
				"value" );
		}
		requiredIndexId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof IBusModelIndexTweak) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelIndexTweak rhs = (IBusModelIndexTweak)obj;
			if( getRequiredIndexId() != null ) {
				if( rhs.getRequiredIndexId() != null ) {
					if( ! getRequiredIndexId().equals( rhs.getRequiredIndexId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIndexId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelIndexTweakH) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelIndexTweakH rhs = (IBusModelIndexTweakH)obj;
			if( getRequiredIndexId() != null ) {
				if( rhs.getRequiredIndexId() != null ) {
					if( ! getRequiredIndexId().equals( rhs.getRequiredIndexId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIndexId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelTweakHPKey) {
			return( super.equals(obj) );
		}
		else if (obj instanceof IBusModelIndexTweakByIndexIdxKey) {
			IBusModelIndexTweakByIndexIdxKey rhs = (IBusModelIndexTweakByIndexIdxKey)obj;
			if( getRequiredIndexId() != null ) {
				if( rhs.getRequiredIndexId() != null ) {
					if( ! getRequiredIndexId().equals( rhs.getRequiredIndexId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIndexId() != null ) {
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
		hashCode = hashCode + getRequiredIndexId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof IBusModelIndexTweak) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelIndexTweak rhs = (IBusModelIndexTweak)obj;
			if (getRequiredIndexId() != null) {
				if (rhs.getRequiredIndexId() != null) {
					cmp = getRequiredIndexId().compareTo( rhs.getRequiredIndexId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIndexId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelIndexTweakH ) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelIndexTweakH rhs = (IBusModelIndexTweakH)obj;
			if (getRequiredIndexId() != null) {
				if (rhs.getRequiredIndexId() != null) {
					cmp = getRequiredIndexId().compareTo( rhs.getRequiredIndexId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIndexId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelIndexTweakByIndexIdxKey) {
			IBusModelIndexTweakByIndexIdxKey rhs = (IBusModelIndexTweakByIndexIdxKey)obj;
			if (getRequiredIndexId() != null) {
				if (rhs.getRequiredIndexId() != null) {
					cmp = getRequiredIndexId().compareTo( rhs.getRequiredIndexId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIndexId() != null) {
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
	public void set( IBusModelTweak src ) {
		if( src instanceof IBusModelIndexTweak ) {
			setIndexTweak( (IBusModelIndexTweak)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaIndexTweak" );
		}
	}

	@Override
	public void setIndexTweak( IBusModelIndexTweak src ) {
		super.setTweak( src );
		setRequiredContainerIndexDef(src.getRequiredContainerIndexDef());
		setRequiredIndexId(src.getRequiredIndexId());
	}

	@Override
	public void set( IBusModelTweakH src ) {
		if( src instanceof IBusModelIndexTweakH ) {
			setIndexTweak( (IBusModelIndexTweakH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelIndexTweakH" );
		}
	}

	@Override
	public void setIndexTweak( IBusModelIndexTweakH src ) {
		super.setTweak( src );
		setRequiredContainerIndexDef(src.getRequiredIndexId());
		setRequiredIndexId(src.getRequiredIndexId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredIndexId=" + "\"" + getRequiredIndexId().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelJpaIndexTweak" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
