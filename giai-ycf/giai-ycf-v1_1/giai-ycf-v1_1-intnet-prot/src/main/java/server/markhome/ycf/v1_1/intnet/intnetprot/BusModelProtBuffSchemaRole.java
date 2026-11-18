// Description: Java 17 implJustProtementation of a SchemaRole buffer

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

package server.markhome.ycf.v3_1.intnet.intnet.buff;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public class BusModelProtBuffSchemaRole
	extends BusModelProtBuffRoleDef
	implements IBusModelSchemaRole
{
	protected ICFKeyHash256 requiredSchemaDefId;
	protected IBusModelPubSchema.RoleScopeEnum requiredRoleScope;

	public BusModelProtBuffSchemaRole() {
		super();
		requiredSchemaDefId = CFDbKeyHash256.fromHex( IBusModelPubSchemaRole.SCHEMADEFID_INIT_VALUE.toString() );
		requiredRoleScope = IBusModelPubSchemaRole.ROLESCOPE_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( IBusModelProtSchemaRole.CLASS_CODE );
	}

	@Override
	public IBusModelProtSchemaDef getRequiredContainerSchemaDef(ICFKeyHash256 argSchemaDefId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSchemaDef", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSchemaDef", 0, "IBusModelProtSchema.getBackingBusModel().getTableSchemaDef()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSchemaDefId()));
	}

	@Override
	public void setRequiredContainerScopeDef(ICFKeyHash256 argSchemaDefId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSchemaDef-args", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelProtScopeTable targetTable = targetBackingBusModel.getTableScope();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScopeDef", 0, "IBusModelSchema.getBackingBusModel().getTableScope()");
		}
		IBusModelProtScope found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSchemaDefId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScopeDef-args", 0, "found");
		}
		else if (found instanceof IBusModelProtSchemaDef) || (found instanceof IBusModelProtSchemaDef) || (found instanceof IBusModelPubSchemaDef)) {
			super.setRequiredContainerScopeDef(argSchemaDefId);
		requiredSchemaDefId = argSchemaDefId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerScopeDef-args", "found", found, "IBusModelProtSchemaDefIBusModelProtSchemaDefIBusModelPubSchemaDef");
		}
	}
$reimplJustProtSchemaProtBuffTableNarrowedPubRelationSetter$
	@Override
	public void setRequiredContainerSchemaDef(ICFKeyHash256 argSchemaDefId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSchemaDef-args", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelProtScopeTable targetTable = targetBackingBusModel.getTableScope();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScopeDef", 0, "IBusModelSchema.getBackingBusModel().getTableScope()");
		}
		IBusModelProtScope found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSchemaDefId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScopeDef-args", 0, "found");
		}
		else if (found instanceof IBusModelProtSchemaDef) || (found instanceof IBusModelProtSchemaDef) || (found instanceof IBusModelPubSchemaDef)) {
			super.setRequiredContainerScopeDef(argSchemaDefId);
		requiredSchemaDefId = argSchemaDefId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerScopeDef-args", "found", found, "IBusModelProtSchemaDefIBusModelProtSchemaDefIBusModelPubSchemaDef");
		}
	}

	@Override
	public void setRequiredContainerSchemaDef(IBusModelProtSchemaDef argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSchemaDef", 1, "argObj");
		}
		else {
			setJustProtRequiredSchemaDefId(argObj.getRequiredId());
		}
	}

	@Override
	public void setRequiredContainerSchemaDef(IBusModelPubSchemaDef argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSchemaDef", 1, "argObj");
		}
		else {
			setJustProtRequiredSchemaDefId(argObj.getRequiredId());
		}
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
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IBusModelProtSchemaRole rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
		else if( obj instanceof IBusModelProtSchemaRoleH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
		else if( obj instanceof IBusModelProtRoleDefHPKey ) {
			IBusModelProtRoleDefHPKey rhs = (IBusModelProtRoleDefHPKey)obj;
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtSchemaRoleBySchemaIdxKey rhs ) {
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
		else if( obj instanceof IBusModelProtSchemaRoleByRoleScopeIdxKey rhs ) {
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
		else if( obj instanceof IBusModelProtSchemaRoleBySchRoleScpIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubSchemaRole rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
		else if( obj instanceof IBusModelPubSchemaRoleH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
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
		else if( obj instanceof IBusModelPubRoleDefHPKey rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtSchemaRoleBySchemaIdxKey rhs ) {
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
		else if( obj instanceof IBusModelProtSchemaRoleByRoleScopeIdxKey rhs ) {
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
		else if( obj instanceof IBusModelProtSchemaRoleBySchRoleScpIdxKey rhs ) {
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
			boolean retval = super.equals( obj );
			return( retval );
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
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IBusModelProtSchemaRole rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelProtRoleDefHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelProtSchemaRoleH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelProtSchemaRoleBySchemaIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtSchemaRoleByRoleScopeIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtSchemaRoleBySchRoleScpIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubSchemaRole rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelPubRoleDefHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelPubSchemaRoleH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelPubSchemaRoleBySchemaIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubSchemaRoleByRoleScopeIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubSchemaRoleBySchRoleScpIdxKey rhs ) {
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
			}			return( 0 );
		}
		else {
			cmp = super.compareTo( obj );
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelProtRoleDef src ) {
		if( src instanceof BusModelProtBuffSchemaRole ) {
			setJustProtSchemaRole( (BusModelProtBuffSchemaRole)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelProtBuffSchemaRole" );
		}
	}

	@Override
	public void setSchemaRole( IBusModelProtSchemaRole src ) {
		super.setRoleDef( src );
		setJustProtRequiredContainerSchemaDef(src.getRequiredContainerSchemaDef());
		setJustProtRequiredSchemaDefId(src.getRequiredSchemaDefId());
		setJustProtRequiredRoleScope(src.getRequiredRoleScope());
	}

	@Override
	public void set( IBusModelProtRoleDefH src ) {
		if( src instanceof IBusModelPubSchemaRoleH ) {
			setSchemaRole( (IBusModelPubSchemaRoleH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubSchemaRoleH" );
		}
	}

	@Override
	public void setSchemaRole( IBusModelProtSchemaRoleH src ) {
		super.setRoleDef( src );
		setJustProtRequiredContainerSchemaDef(src.getRequiredContainerSchemaDef());
		setJustProtRequiredSchemaDefId(src.getRequiredSchemaDefId());
		setJustProtRequiredRoleScope(src.getRequiredRoleScope());
	}

	@Override
	public void set( IBusModelPubRoleDef src ) {
		if( src instanceof BusModelPubProtBuffSchemaRole ) {
			setJustProtSchemaRole( (BusModelPubProtBuffSchemaRole)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubProtBuffSchemaRole" );
		}
	}

	@Override
	public void setSchemaRole( IBusModelPubSchemaRole src ) {
		super.setRoleDef( src );
		setJustProtRequiredContainerSchemaDef(src.getRequiredContainerSchemaDef());
		setJustProtRequiredSchemaDefId(src.getRequiredSchemaDefId());
		setJustProtRequiredRoleScope(src.getRequiredRoleScope());
	}

	@Override
	public void set( IBusModelPubRoleDefH src ) {
		if( src instanceof IBusModelPubSchemaRoleH ) {
			setSchemaRole( (IBusModelPubSchemaRoleH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubSchemaRoleH" );
		}
	}

	@Override
	public void setSchemaRole( IBusModelPubSchemaRoleH src ) {
		super.setRoleDef( src );
		setJustProtRequiredContainerSchemaDef(src.getRequiredContainerSchemaDef());
		setJustProtRequiredSchemaDefId(src.getRequiredSchemaDefId());
		setJustProtRequiredRoleScope(src.getRequiredRoleScope());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment()  + "\"" + getRequiredId().toString() + "\"" + "\"" + getRequiredSchemaDefId().toString() + "\"" + "\"" + getRequiredRoleScope().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelProtBuffSchemaRole" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
