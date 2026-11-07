// Description: Java 25 JPA implementation of a ServerObjFunc entity definition object.

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
	name = "srvofunc", schema = "BusModel31",
	indexes = {
		@Index(name = "ServerObjFuncIdIdx", columnList = "Id", unique = true),
		@Index(name = "ServerObjFuncRetTableIdx", columnList = "rettblid", unique = false),
		@Index(name = "ServerObjFuncRetTableIdxRetTable", columnList = "rettblidRetTable", unique = false)
	}
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43013")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaServerObjFunc extends BusModelJpaServerMethod
	implements IBusModelServerObjFunc
{
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="rettblidRetTable", referencedColumnName="Id" )
	protected BusModelJpaTable optionalLookupRetTable;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="rettblid", nullable=true, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 optionalRetTableId;

	public BusModelJpaServerObjFunc() {
		super();
		optionalRetTableId = CFDbKeyHash256.nullGet();
	}

	@Override
	public int getClassCode() {
		return( IBusModelServerObjFunc.CLASS_CODE );
	}

	@Override
	public IBusModelTable getOptionalLookupRetTable() {
		return(optionalLookupRetTable);
	}

	@Override
	public void setOptionalLookupRetTable(IBusModelTable argObj) {
		if(argObj == null) {
			optionalLookupRetTable = null;
		}
		else if (argObj instanceof BusModelJpaTable) {
			optionalLookupRetTable = (BusModelJpaTable)argObj;
			if (optionalLookupRetTable != null) {
				optionalRetTableId = optionalLookupRetTable.getRequiredId();
			}
			else {
				optionalRetTableId = null;
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setLookupRetTable", "argObj", argObj, "BusModelJpaTable");
		}
	}

	@Override
	public void setOptionalLookupRetTable(IBusModelProtTable argObj) {
		setOptionalLookupRetTable(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupRetTable(IBusModelPubTable argObj) {
		setOptionalLookupRetTable(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupRetTable(ICFKeyHash256 argRetTableId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupRetTable", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelTableTable targetTable = targetBackingSchema.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupRetTable", 0, "IBusModelSchema.getBackingBusModel().getTableTable()");
		}
		IBusModelTable targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argRetTableId);
		setOptionalLookupRetTable(targetRec);
	}

	@Override
	public ICFKeyHash256 getOptionalRetTableId() {
		return(optionalRetTableId);
	}

	public void setOptionalRetTableId( ICFKeyHash256 value ) {
		optionalRetTableId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof IBusModelServerObjFunc) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelServerObjFunc rhs = (IBusModelServerObjFunc)obj;
			if( getOptionalRetTableId() != null ) {
				if( rhs.getOptionalRetTableId() != null ) {
					if( ! getOptionalRetTableId().equals( rhs.getOptionalRetTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelServerObjFuncH) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelServerObjFuncH rhs = (IBusModelServerObjFuncH)obj;
			if( getOptionalRetTableId() != null ) {
				if( rhs.getOptionalRetTableId() != null ) {
					if( ! getOptionalRetTableId().equals( rhs.getOptionalRetTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelScopeHPKey) {
			return( super.equals(obj) );
		}
		else if (obj instanceof IBusModelServerObjFuncByRetTblIdxKey) {
			IBusModelServerObjFuncByRetTblIdxKey rhs = (IBusModelServerObjFuncByRetTblIdxKey)obj;
			if( getOptionalRetTableId() != null ) {
				if( rhs.getOptionalRetTableId() != null ) {
					if( ! getOptionalRetTableId().equals( rhs.getOptionalRetTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
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
		if( getOptionalRetTableId() != null ) {
			hashCode = hashCode + getOptionalRetTableId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof IBusModelServerObjFunc) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelServerObjFunc rhs = (IBusModelServerObjFunc)obj;
			if( getOptionalRetTableId() != null ) {
				if( rhs.getOptionalRetTableId() != null ) {
					cmp = getOptionalRetTableId().compareTo( rhs.getOptionalRetTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelServerObjFuncH ) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelServerObjFuncH rhs = (IBusModelServerObjFuncH)obj;
			if( getOptionalRetTableId() != null ) {
				if( rhs.getOptionalRetTableId() != null ) {
					cmp = getOptionalRetTableId().compareTo( rhs.getOptionalRetTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelServerObjFuncByRetTblIdxKey) {
			IBusModelServerObjFuncByRetTblIdxKey rhs = (IBusModelServerObjFuncByRetTblIdxKey)obj;
			if( getOptionalRetTableId() != null ) {
				if( rhs.getOptionalRetTableId() != null ) {
					cmp = getOptionalRetTableId().compareTo( rhs.getOptionalRetTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
					return( -1 );
				}
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
		if( src instanceof IBusModelServerObjFunc ) {
			setServerObjFunc( (IBusModelServerObjFunc)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaServerObjFunc" );
		}
	}

	@Override
	public void setServerObjFunc( IBusModelServerObjFunc src ) {
		super.setServerMethod( src );
		setOptionalLookupRetTable(src.getOptionalLookupRetTable());
		setOptionalRetTableId(src.getOptionalRetTableId());
	}

	@Override
	public void set( IBusModelScopeH src ) {
		if( src instanceof IBusModelServerObjFuncH ) {
			setServerObjFunc( (IBusModelServerObjFuncH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelServerObjFuncH" );
		}
	}

	@Override
	public void setServerObjFunc( IBusModelServerObjFuncH src ) {
		super.setServerMethod( src );
		setOptionalLookupRetTable(src.getOptionalRetTableId());
		setOptionalRetTableId(src.getOptionalRetTableId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " OptionalRetTableId=" + ( ( getOptionalRetTableId() == null ) ? "null" : "\"" + getOptionalRetTableId().toString() + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelJpaServerObjFunc" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
