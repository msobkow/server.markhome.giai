// Description: Java 25 JPA implementation of a SchemaRole entity definition object.

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
	name = "schrole", schema = "BusModel31",
	indexes = {
		@Index(name = "SchemaRoleIdIdx", columnList = "Id", unique = true),
		@Index(name = "SchemaRoleSchemaIdx", columnList = "SchemaDefId", unique = false),
		@Index(name = "SchemaRoleRoleScpIdx", columnList = "RoleScopeId", unique = false),
		@Index(name = "SchemaRoleSchScpIdx", columnList = "SchemaDefId, RoleScopeId", unique = false),
		@Index(name = "SchemaRoleSchemaIdxSchemaDef", columnList = "SchemaDefIdSchemaDef", unique = false)
	}
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43151")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaSchemaRole extends BusModelJpaRoleDef
	implements IBusModelSchemaRole
{
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn( name="SchemaDefIdSchemaDef", referencedColumnName="Id" )
	protected BusModelJpaSchemaDef requiredContainerSchemaDef;

	@AttributeOverrides({
		@AttributeOverride(name="bytes", column = @Column( name="SchemaDefId", nullable=false, length=CFDbKeyHash256.HASH_LENGTH ) )
	})
	protected ICFKeyHash256 requiredSchemaDefId;
	@Column( name="RoleScopeId", nullable=false )
	protected IBusModelPubSchema.RoleScopeEnum requiredRoleScope;

	public BusModelJpaSchemaRole() {
		super();
		requiredSchemaDefId = CFDbKeyHash256.fromHex( IBusModelPubSchemaRole.SCHEMADEFID_INIT_VALUE.toString() );
		requiredRoleScope = IBusModelPubSchemaRole.ROLESCOPE_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( IBusModelSchemaRole.CLASS_CODE );
	}

	@Override
	public IBusModelSchemaDef getRequiredContainerSchemaDef() {
		return(requiredContainerSchemaDef);
	}

	@Override
	public void setRequiredContainerSchemaDef(IBusModelSchemaDef argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSchemaDef", 1, "argObj");
		}
		else if (argObj instanceof BusModelJpaSchemaDef) {
			requiredContainerSchemaDef = (BusModelJpaSchemaDef)argObj;
			if (requiredContainerSchemaDef != null) {
				requiredSchemaDefId = requiredContainerSchemaDef.getRequiredId();
			}
			else {
			}
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerSchemaDef", "argObj", argObj, "BusModelJpaSchemaDef");
		}
	}

	@Override
	public void setRequiredContainerSchemaDef(IBusModelProtSchemaDef argObj) {
		setRequiredContainerSchemaDef(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerSchemaDef(IBusModelPubSchemaDef argObj) {
		setRequiredContainerSchemaDef(argObj.getRequiredId());
	}

	@Override
	public void setRequiredContainerSchemaDef(ICFKeyHash256 argSchemaDefId) {
		IBusModelSchema targetBackingSchema = IBusModelSchema.getBackingBusModel();
		if (targetBackingSchema == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSchemaDef", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelSchemaDefTable targetTable = targetBackingSchema.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSchemaDef", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaDef()");
		}
		IBusModelSchemaDef targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSchemaDefId);
		setRequiredContainerSchemaDef(targetRec);
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
	public IBusModelPubSchema.RoleScopeEnum getRequiredRoleScope() {
		return(requiredRoleScope);
	}

	public void setRequiredRoleScope( IBusModelPubSchema.RoleScopeEnum value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredRoleScope",
				1,
				"value" );
		}
		requiredRoleScope = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof IBusModelSchemaRole) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelSchemaRole rhs = (IBusModelSchemaRole)obj;
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
			if( getRequiredRoleScope() != null ) {
				if( rhs.getRequiredRoleScope() != null ) {
					if( ! getRequiredRoleScope().equals( rhs.getRequiredRoleScope() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRoleScope() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelSchemaRoleH) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelSchemaRoleH rhs = (IBusModelSchemaRoleH)obj;
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
			if( getRequiredRoleScope() != null ) {
				if( rhs.getRequiredRoleScope() != null ) {
					if( ! getRequiredRoleScope().equals( rhs.getRequiredRoleScope() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRoleScope() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelRoleDefHPKey) {
			return( super.equals(obj) );
		}
		else if (obj instanceof IBusModelSchemaRoleBySchemaIdxKey) {
			IBusModelSchemaRoleBySchemaIdxKey rhs = (IBusModelSchemaRoleBySchemaIdxKey)obj;
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
		else if (obj instanceof IBusModelSchemaRoleByRoleScopeIdxKey) {
			IBusModelSchemaRoleByRoleScopeIdxKey rhs = (IBusModelSchemaRoleByRoleScopeIdxKey)obj;
			if( getRequiredRoleScope() != null ) {
				if( rhs.getRequiredRoleScope() != null ) {
					if( ! getRequiredRoleScope().equals( rhs.getRequiredRoleScope() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRoleScope() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelSchemaRoleBySchRoleScpIdxKey) {
			IBusModelSchemaRoleBySchRoleScpIdxKey rhs = (IBusModelSchemaRoleBySchRoleScpIdxKey)obj;
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
			if( getRequiredRoleScope() != null ) {
				if( rhs.getRequiredRoleScope() != null ) {
					if( ! getRequiredRoleScope().equals( rhs.getRequiredRoleScope() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRoleScope() != null ) {
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
		hashCode = ( hashCode * 0x10000 ) + getRequiredRoleScope().ordinal();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof IBusModelSchemaRole) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelSchemaRole rhs = (IBusModelSchemaRole)obj;
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
			if (getRequiredRoleScope() != null) {
				if (rhs.getRequiredRoleScope() != null) {
					cmp = getRequiredRoleScope().compareTo( rhs.getRequiredRoleScope() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRoleScope() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelSchemaRoleH ) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelSchemaRoleH rhs = (IBusModelSchemaRoleH)obj;
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
			if (getRequiredRoleScope() != null) {
				if (rhs.getRequiredRoleScope() != null) {
					cmp = getRequiredRoleScope().compareTo( rhs.getRequiredRoleScope() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRoleScope() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelSchemaRoleBySchemaIdxKey) {
			IBusModelSchemaRoleBySchemaIdxKey rhs = (IBusModelSchemaRoleBySchemaIdxKey)obj;
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
		else if (obj instanceof IBusModelSchemaRoleByRoleScopeIdxKey) {
			IBusModelSchemaRoleByRoleScopeIdxKey rhs = (IBusModelSchemaRoleByRoleScopeIdxKey)obj;
			if (getRequiredRoleScope() != null) {
				if (rhs.getRequiredRoleScope() != null) {
					cmp = getRequiredRoleScope().compareTo( rhs.getRequiredRoleScope() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRoleScope() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if (obj instanceof IBusModelSchemaRoleBySchRoleScpIdxKey) {
			IBusModelSchemaRoleBySchRoleScpIdxKey rhs = (IBusModelSchemaRoleBySchRoleScpIdxKey)obj;
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
			if (getRequiredRoleScope() != null) {
				if (rhs.getRequiredRoleScope() != null) {
					cmp = getRequiredRoleScope().compareTo( rhs.getRequiredRoleScope() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRoleScope() != null) {
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
	public void set( IBusModelRoleDef src ) {
		if( src instanceof IBusModelSchemaRole ) {
			setSchemaRole( (IBusModelSchemaRole)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaSchemaRole" );
		}
	}

	@Override
	public void setSchemaRole( IBusModelSchemaRole src ) {
		super.setRoleDef( src );
		setRequiredContainerSchemaDef(src.getRequiredContainerSchemaDef());
		setRequiredSchemaDefId(src.getRequiredSchemaDefId());
		setRequiredRoleScope(src.getRequiredRoleScope());
	}

	@Override
	public void set( IBusModelRoleDefH src ) {
		if( src instanceof IBusModelSchemaRoleH ) {
			setSchemaRole( (IBusModelSchemaRoleH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelSchemaRoleH" );
		}
	}

	@Override
	public void setSchemaRole( IBusModelSchemaRoleH src ) {
		super.setRoleDef( src );
		setRequiredContainerSchemaDef(src.getRequiredSchemaDefId());
		setRequiredSchemaDefId(src.getRequiredSchemaDefId());
		setRequiredRoleScope(src.getRequiredRoleScope());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredSchemaDefId=" + "\"" + getRequiredSchemaDefId().toString() + "\""
			+ " RequiredRoleScope=" + "\"" + getRequiredRoleScope().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelJpaSchemaRole" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
