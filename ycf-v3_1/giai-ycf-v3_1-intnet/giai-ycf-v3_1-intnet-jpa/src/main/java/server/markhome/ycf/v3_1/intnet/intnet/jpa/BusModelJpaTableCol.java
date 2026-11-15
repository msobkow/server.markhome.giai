// Description: Java 25 JPA implementation of a TableCol entity definition object.

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

package server.markhome.ycf.v3_1.intnet.intnet.jpa;

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
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

@Entity
@Table(
	name = "tblcol", schema = "IntNet31",
	indexes = {
		@Index(name = "TableColIdIdx", columnList = "Id", unique = true),
		@Index(name = "TableColTableIdx", columnList = "TableId", unique = false),
		@Index(name = "TableColDataIdx", columnList = "DataId", unique = false),
		@Index(name = "TableColTableIdxTable", columnList = "TableIdTable", unique = false),
		@Index(name = "TableColDataIdxDataType", columnList = "DataIdDataType", unique = false)
	}
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43100")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "IntNetPU")
public class BusModelJpaTableCol extends BusModelJpaValue
	implements IBusModelTableCol
{
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="TableIdTable", referencedColumnName="Id" )
	protected BusModelJpaTable requiredContainerTable;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="DataIdDataType", referencedColumnName="Id" )
	protected BusModelJpaValue requiredParentDataType;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="TableId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredTableId;
	@Column( name="DbName", nullable=true, length=32 )
	protected String optionalDbName;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="DataId", nullable=true, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 optionalDataId;
	@Column( name="xml_elt_name", nullable=true, length=192 )
	protected String optionalXmlElementName;

	public BusModelJpaTableCol() {
		super();
		requiredTableId = CFDbKeyHash256.fromHex( IBusModelPubTableCol.TABLEID_INIT_VALUE.toString() );
		optionalDbName = null;
		optionalDataId = CFDbKeyHash256.nullGet();
		optionalXmlElementName = null;
	}

	@Override
	public int getClassCode() {
		return( IBusModelTableCol.CLASS_CODE );
	}

	@Override
	public IBusModelTable getRequiredContainerTable() {
		return(requiredContainerTable);
	}

	@Override
	public void setRequiredContainerTable(IBusModelTable argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerTable", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaTable) {
			requiredContainerTable = (BusModelJpaTable)argObj;
			if (requiredContainerTable != null) {
				requiredTableId = requiredContainerTable.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerTable", "argObj", argObj, "BusModelJpaTable");
		}
	}

	@Override
	public void setRequiredContainerTable(IBusModelProtTable argObj) {
		setRequiredContainerTable(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerTable(IBusModelPubTable argObj) {
		setRequiredContainerTable(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerTable(ICFKeyHash256 argTableId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTable", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelTableTable targetTable = targetBackingSchema.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTable", 0, "IBusModelSchema.getBackingBusModel().getTableTable()");
		}
		IBusModelTable targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTableId);
		setRequiredContainerTable(targetRec);
	}

	@Override
	public IBusModelValue getRequiredParentDataType() {
		return(requiredParentDataType);
	}

	@Override
	public void setRequiredParentDataType(IBusModelValue argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setParentDataType", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaValue) {
			requiredParentDataType = (BusModelJpaValue)argObj;
			if (requiredParentDataType != null) {
				optionalDataId = requiredParentDataType.getRequiredId();
			}
			else {
				optionalDataId = null;
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setParentDataType", "argObj", argObj, "BusModelJpaValue");
		}
	}

	@Override
	public void setRequiredParentDataType(IBusModelProtValue argObj) {
		setRequiredParentDataType(argObj.getRequiredId());
	}

	@Override
	public void setRequiredParentDataType(IBusModelPubValue argObj) {
		setRequiredParentDataType(argObj.getRequiredId());
	}

	@Override
	public void setRequiredParentDataType(ICFKeyHash256 argDataId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentDataType", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelValueTable targetTable = targetBackingSchema.getTableValue();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredParentDataType", 0, "IBusModelSchema.getBackingBusModel().getTableValue()");
		}
		IBusModelValue targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argDataId);
		setRequiredParentDataType(targetRec);
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
	public String getOptionalDbName() {
		return(optionalDbName);
	}

	public void setOptionalDbName( String value ) {
		if( value != null && value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDbName",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		optionalDbName = value;
	}

	@Override
	public ICFKeyHash256 getOptionalDataId() {
		return(optionalDataId);
	}

	public void setOptionalDataId( ICFKeyHash256 value ) {
		optionalDataId = value;
	}

	@Override
	public String getOptionalXmlElementName() {
		return(optionalXmlElementName);
	}

	public void setOptionalXmlElementName( String value ) {
		if( value != null && value.length() > 192 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalXmlElementName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		optionalXmlElementName = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof IBusModelTableCol) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelTableCol rhs = (IBusModelTableCol)obj;
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
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					if( ! getOptionalDbName().equals( rhs.getOptionalDbName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( false );
				}
			}
			if( getOptionalDataId() != null ) {
				if( rhs.getOptionalDataId() != null ) {
					if( ! getOptionalDataId().equals( rhs.getOptionalDataId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
					return( false );
				}
			}
			if( getOptionalXmlElementName() != null ) {
				if( rhs.getOptionalXmlElementName() != null ) {
					if( ! getOptionalXmlElementName().equals( rhs.getOptionalXmlElementName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalXmlElementName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelTableColH) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelTableColH rhs = (IBusModelTableColH)obj;
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
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					if( ! getOptionalDbName().equals( rhs.getOptionalDbName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( false );
				}
			}
			if( getOptionalDataId() != null ) {
				if( rhs.getOptionalDataId() != null ) {
					if( ! getOptionalDataId().equals( rhs.getOptionalDataId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
					return( false );
				}
			}
			if( getOptionalXmlElementName() != null ) {
				if( rhs.getOptionalXmlElementName() != null ) {
					if( ! getOptionalXmlElementName().equals( rhs.getOptionalXmlElementName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalXmlElementName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelValueHPKey) {
			return( super.equals(obj) );
		}
		else if (obj instanceof IBusModelTableColByTableIdxKey) {
			IBusModelTableColByTableIdxKey rhs = (IBusModelTableColByTableIdxKey)obj;
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
		else if (obj instanceof IBusModelTableColByDataIdxKey) {
			IBusModelTableColByDataIdxKey rhs = (IBusModelTableColByDataIdxKey)obj;
			if( getOptionalDataId() != null ) {
				if( rhs.getOptionalDataId() != null ) {
					if( ! getOptionalDataId().equals( rhs.getOptionalDataId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
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
		if( getOptionalDbName() != null ) {
			hashCode = hashCode + getOptionalDbName().hashCode();
		}
		if( getOptionalDataId() != null ) {
			hashCode = hashCode + getOptionalDataId().hashCode();
		}
		if( getOptionalXmlElementName() != null ) {
			hashCode = hashCode + getOptionalXmlElementName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof IBusModelTableCol) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelTableCol rhs = (IBusModelTableCol)obj;
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
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					cmp = getOptionalDbName().compareTo( rhs.getOptionalDbName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDataId() != null ) {
				if( rhs.getOptionalDataId() != null ) {
					cmp = getOptionalDataId().compareTo( rhs.getOptionalDataId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalXmlElementName() != null ) {
				if( rhs.getOptionalXmlElementName() != null ) {
					cmp = getOptionalXmlElementName().compareTo( rhs.getOptionalXmlElementName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalXmlElementName() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelTableColH ) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelTableColH rhs = (IBusModelTableColH)obj;
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
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					cmp = getOptionalDbName().compareTo( rhs.getOptionalDbName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDataId() != null ) {
				if( rhs.getOptionalDataId() != null ) {
					cmp = getOptionalDataId().compareTo( rhs.getOptionalDataId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalXmlElementName() != null ) {
				if( rhs.getOptionalXmlElementName() != null ) {
					cmp = getOptionalXmlElementName().compareTo( rhs.getOptionalXmlElementName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalXmlElementName() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelTableColByTableIdxKey) {
			IBusModelTableColByTableIdxKey rhs = (IBusModelTableColByTableIdxKey)obj;
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
		else if (obj instanceof IBusModelTableColByDataIdxKey) {
			IBusModelTableColByDataIdxKey rhs = (IBusModelTableColByDataIdxKey)obj;
			if( getOptionalDataId() != null ) {
				if( rhs.getOptionalDataId() != null ) {
					cmp = getOptionalDataId().compareTo( rhs.getOptionalDataId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDataId() != null ) {
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
	public void set( IBusModelValue src ) {
		if( src instanceof IBusModelTableCol ) {
			setTableCol( (IBusModelTableCol)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaTableCol" );
		}
	}

	@Override
	public void setTableCol( IBusModelTableCol src ) {
		super.setValue( src );
		setRequiredContainerTable(src.getRequiredContainerTable());
		setRequiredParentDataType(src.getRequiredParentDataType());
		setRequiredTableId(src.getRequiredTableId());
		setOptionalDbName(src.getOptionalDbName());
		setOptionalDataId(src.getOptionalDataId());
		setOptionalXmlElementName(src.getOptionalXmlElementName());
	}

	@Override
	public void set( IBusModelValueH src ) {
		if( src instanceof IBusModelTableColH ) {
			setTableCol( (IBusModelTableColH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelTableColH" );
		}
	}

	@Override
	public void setTableCol( IBusModelTableColH src ) {
		super.setValue( src );
		setRequiredContainerTable(src.getRequiredTableId());
		setRequiredParentDataType(src.getOptionalDataId());
		setRequiredTableId(src.getRequiredTableId());
		setOptionalDbName(src.getOptionalDbName());
		setOptionalDataId(src.getOptionalDataId());
		setOptionalXmlElementName(src.getOptionalXmlElementName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredTableId=" + "\"" + getRequiredTableId().toString() + "\""
			+ " OptionalDbName=" + ( ( getOptionalDbName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDbName() ) + "\"" )
			+ " OptionalDataId=" + ( ( getOptionalDataId() == null ) ? "null" : "\"" + getOptionalDataId().toString() + "\"" )
			+ " OptionalXmlElementName=" + ( ( getOptionalXmlElementName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalXmlElementName() ) + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelJpaTableCol" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
