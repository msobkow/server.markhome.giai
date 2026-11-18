// Description: Java 25 JPA implementation of a ClearTopDep entity definition object.

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
	name = "clr_topdep", schema = "IntNet31",
	indexes = {
		@Index(name = "ClearTopDepIdIdx", columnList = "Id", unique = true),
		@Index(name = "ClearTopDepTableIdx", columnList = "TableId", unique = false),
		@Index(name = "ClearTopDepUNameIdx", columnList = "TableId, safe_name", unique = true),
		@Index(name = "ClearTopDepPrevIdx", columnList = "PrevId", unique = false),
		@Index(name = "ClearTopDepNextIdx", columnList = "NextId", unique = false),
		@Index(name = "ClearTopDepTableIdxTable", columnList = "TableIdTable", unique = false),
		@Index(name = "ClearTopDepPrevIdxPrev", columnList = "PrevIdPrev", unique = false),
		@Index(name = "ClearTopDepNextIdxNext", columnList = "NextIdNext", unique = false)
	}
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43032")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "IntNetPU")
public class BusModelJpaClearTopDep extends BusModelJpaClearDep
	implements IBusModelClearTopDep
{
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="TableIdTable", referencedColumnName="Id" )
	protected BusModelJpaTable requiredContainerTable;
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="PrevIdPrev", referencedColumnName="Id" )
	protected BusModelJpaClearTopDep optionalLookupPrev;
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn( name="NextIdNext", referencedColumnName="Id" )
	protected BusModelJpaClearTopDep optionalLookupNext;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requiredContainerClearTopDep")
	protected Set<BusModelJpaClearSubDep1> optionalComponentsClearDep;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="TableId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredTableId;
	@Column( name="safe_name", nullable=false, length=192 )
	protected String requiredName;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="PrevId", nullable=true, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 optionalPrevId;
	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="NextId", nullable=true, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 optionalNextId;

	public BusModelJpaClearTopDep() {
		super();
		requiredTableId = CFDbKeyHash256.fromHex( IBusModelPubClearTopDep.TABLEID_INIT_VALUE.toString() );
		requiredName = IBusModelPubClearTopDep.NAME_INIT_VALUE;
		optionalPrevId = CFDbKeyHash256.nullGet();
		optionalNextId = CFDbKeyHash256.nullGet();
	}

	@Override
	public int getClassCode() {
		return( IBusModelClearTopDep.CLASS_CODE );
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
	public IBusModelClearTopDep getOptionalLookupPrev() {
		return(optionalLookupPrev);
	}

	@Override
	public void setOptionalLookupPrev(IBusModelClearTopDep argObj) {
		if(argObj == null) {
			optionalLookupPrev = null;
		}
		else if (argObj instanceof BusModelJpaClearTopDep) {
			optionalLookupPrev = (BusModelJpaClearTopDep)argObj;
			if (optionalLookupPrev != null) {
				optionalPrevId = optionalLookupPrev.getRequiredId();
			}
			else {
				optionalPrevId = null;
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setLookupPrev", "argObj", argObj, "BusModelJpaClearTopDep");
		}
	}

	@Override
	public void setOptionalLookupPrev(IBusModelProtClearTopDep argObj) {
		setOptionalLookupPrev(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupPrev(IBusModelPubClearTopDep argObj) {
		setOptionalLookupPrev(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupPrev(ICFKeyHash256 argPrevId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupPrev", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelClearTopDepTable targetTable = targetBackingSchema.getTableClearTopDep();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupPrev", 0, "IBusModelSchema.getBackingBusModel().getTableClearTopDep()");
		}
		IBusModelClearTopDep targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argPrevId);
		setOptionalLookupPrev(targetRec);
	}

	@Override
	public IBusModelClearTopDep getOptionalLookupNext() {
		return(optionalLookupNext);
	}

	@Override
	public void setOptionalLookupNext(IBusModelClearTopDep argObj) {
		if(argObj == null) {
			optionalLookupNext = null;
		}
		else if (argObj instanceof BusModelJpaClearTopDep) {
			optionalLookupNext = (BusModelJpaClearTopDep)argObj;
			if (optionalLookupNext != null) {
				optionalNextId = optionalLookupNext.getRequiredId();
			}
			else {
				optionalNextId = null;
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setLookupNext", "argObj", argObj, "BusModelJpaClearTopDep");
		}
	}

	@Override
	public void setOptionalLookupNext(IBusModelProtClearTopDep argObj) {
		setOptionalLookupNext(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupNext(IBusModelPubClearTopDep argObj) {
		setOptionalLookupNext(argObj.getRequiredId());
	}

	@Override
	public void setOptionalLookupNext(ICFKeyHash256 argNextId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNext", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelClearTopDepTable targetTable = targetBackingSchema.getTableClearTopDep();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNext", 0, "IBusModelSchema.getBackingBusModel().getTableClearTopDep()");
		}
		IBusModelClearTopDep targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argNextId);
		setOptionalLookupNext(targetRec);
	}

	@Override
	public List<IBusModelClearSubDep1> getOptionalComponentsClearDep() {
		List<IBusModelClearSubDep1> retlist = (optionalComponentsClearDep != null) ? new ArrayList<>(optionalComponentsClearDep) : new ArrayList<>();
		return( retlist );
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
	public ICFKeyHash256 getOptionalPrevId() {
		return(optionalPrevId);
	}

	public void setOptionalPrevId( ICFKeyHash256 value ) {
		optionalPrevId = value;
	}

	@Override
	public ICFKeyHash256 getOptionalNextId() {
		return(optionalNextId);
	}

	public void setOptionalNextId( ICFKeyHash256 value ) {
		optionalNextId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof IBusModelClearTopDep) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelClearTopDep rhs = (IBusModelClearTopDep)obj;
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
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelClearTopDepH) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelClearTopDepH rhs = (IBusModelClearTopDepH)obj;
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
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelScopeHPKey) {
			return( super.equals(obj) );
		}
		else if (obj instanceof IBusModelClearTopDepByClrTopDepTblIdxKey) {
			IBusModelClearTopDepByClrTopDepTblIdxKey rhs = (IBusModelClearTopDepByClrTopDepTblIdxKey)obj;
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
		else if (obj instanceof IBusModelClearTopDepByUNameIdxKey) {
			IBusModelClearTopDepByUNameIdxKey rhs = (IBusModelClearTopDepByUNameIdxKey)obj;
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
		else if (obj instanceof IBusModelClearTopDepByPrevIdxKey) {
			IBusModelClearTopDepByPrevIdxKey rhs = (IBusModelClearTopDepByPrevIdxKey)obj;
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelClearTopDepByNextIdxKey) {
			IBusModelClearTopDepByNextIdxKey rhs = (IBusModelClearTopDepByNextIdxKey)obj;
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
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
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalPrevId() != null ) {
			hashCode = hashCode + getOptionalPrevId().hashCode();
		}
		if( getOptionalNextId() != null ) {
			hashCode = hashCode + getOptionalNextId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof IBusModelClearTopDep) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelClearTopDep rhs = (IBusModelClearTopDep)obj;
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
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					cmp = getOptionalPrevId().compareTo( rhs.getOptionalPrevId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					cmp = getOptionalNextId().compareTo( rhs.getOptionalNextId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelClearTopDepH ) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelClearTopDepH rhs = (IBusModelClearTopDepH)obj;
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
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					cmp = getOptionalPrevId().compareTo( rhs.getOptionalPrevId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					cmp = getOptionalNextId().compareTo( rhs.getOptionalNextId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelClearTopDepByClrTopDepTblIdxKey) {
			IBusModelClearTopDepByClrTopDepTblIdxKey rhs = (IBusModelClearTopDepByClrTopDepTblIdxKey)obj;
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
		else if (obj instanceof IBusModelClearTopDepByUNameIdxKey) {
			IBusModelClearTopDepByUNameIdxKey rhs = (IBusModelClearTopDepByUNameIdxKey)obj;
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
		else if (obj instanceof IBusModelClearTopDepByPrevIdxKey) {
			IBusModelClearTopDepByPrevIdxKey rhs = (IBusModelClearTopDepByPrevIdxKey)obj;
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					cmp = getOptionalPrevId().compareTo( rhs.getOptionalPrevId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelClearTopDepByNextIdxKey) {
			IBusModelClearTopDepByNextIdxKey rhs = (IBusModelClearTopDepByNextIdxKey)obj;
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					cmp = getOptionalNextId().compareTo( rhs.getOptionalNextId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
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
		if( src instanceof IBusModelClearTopDep ) {
			setClearTopDep( (IBusModelClearTopDep)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaClearTopDep" );
		}
	}

	@Override
	public void setClearTopDep( IBusModelClearTopDep src ) {
		super.setClearDep( src );
		setRequiredContainerTable(src.getRequiredContainerTable());
		setOptionalLookupPrev(src.getOptionalLookupPrev());
		setOptionalLookupNext(src.getOptionalLookupNext());
		setRequiredTableId(src.getRequiredTableId());
		setRequiredName(src.getRequiredName());
		setOptionalPrevId(src.getOptionalPrevId());
		setOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelScopeH src ) {
		if( src instanceof IBusModelClearTopDepH ) {
			setClearTopDep( (IBusModelClearTopDepH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelClearTopDepH" );
		}
	}

	@Override
	public void setClearTopDep( IBusModelClearTopDepH src ) {
		super.setClearDep( src );
		setRequiredContainerTable(src.getRequiredTableId());
		setOptionalLookupPrev(src.getOptionalPrevId());
		setOptionalLookupNext(src.getOptionalNextId());
		setRequiredTableId(src.getRequiredTableId());
		setRequiredName(src.getRequiredName());
		setOptionalPrevId(src.getOptionalPrevId());
		setOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredTableId=" + "\"" + getRequiredTableId().toString() + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\""
			+ " OptionalPrevId=" + ( ( getOptionalPrevId() == null ) ? "null" : "\"" + getOptionalPrevId().toString() + "\"" )
			+ " OptionalNextId=" + ( ( getOptionalNextId() == null ) ? "null" : "\"" + getOptionalNextId().toString() + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelJpaClearTopDep" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
