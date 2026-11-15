// Description: Java 25 implementation of a DbKeyHash160Col buffer

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
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;

public class BusModelBuffDbKeyHash160Col
	extends BusModelBuffDbKeyHash160Def
	implements IBusModelDbKeyHash160Col
{
	protected ICFKeyHash256 requiredTableId;

	public BusModelBuffDbKeyHash160Col() {
		super();
		requiredTableId = CFDbKeyHash256.fromHex( IBusModelPubDbKeyHash160Col.TABLEID_INIT_VALUE.toString() );
	}

	@Override
	public int getClassCode() {
		return( IBusModelDbKeyHash160Col.CLASS_CODE );
	}

	@Override
	public void setRequiredContainerScope(ICFKeyHash256 argTableId) {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTable-args", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelScopeTable targetTable = targetBackingBusModel.getTableScope();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope", 0, "IBusModelSchema.getBackingBusModel().getTableScope()");
		}
		IBusModelScope found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTableId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope-args", 0, "found");
		}
		else if (found instanceof IBusModelTable) || (found instanceof IBusModelProtTable) || (found instanceof IBusModelPubTable)) {
			super.setRequiredContainerScope(argTableId);
		requiredTableId = argTableId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerScope-args", "found", found, "IBusModelTableIBusModelProtTableIBusModelPubTable");
		}
	}

	@Override
	public void setRequiredContainerScope(IBusModelTable argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerTable", 1, "argObj");
		}
		else if ((argObj instanceof IBusModelTable) || (argObj instanceof IBusModelProtTable) || (argObj instanceof IBusModelPubTable)) {
			setRequiredTableId(argObj.getRequiredId());
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerTable", "argObj", argObj, "IBusModelTable, IBusModelProtTable), IBusModelPubTable)");
		}
	}

	@Override
	public void setRequiredContainerScope(IBusModelProtTable argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerTable", 1, "argObj");
		}
		else if ((argObj instanceof IBusModelProtTable) || (argObj instanceof IBusModelPubTable)) {
			setRequiredTableId(argObj.getRequiredId());
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerTable", "argObj", argObj, "IBusModelProtTable, IBusModelPubTable)");
		}
	}

	@Override
	public void setRequiredContainerScope(IBusModelPubTable argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerTable", 1, "argObj");
		}
		else if (argObj instanceof IBusModelPubTable) {
			setRequiredTableId(argObj.getRequiredId());
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setContainerTable", "argObj", argObj, "IBusModelPubTable");
		}
	}

	@Override
	public IBusModelTable getRequiredContainerTable() {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTable", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelTableTable targetTable = targetBackingBusModel.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTable", 0, "IBusModelSchema.getBackingBusModel().getTableTable()");
		}
		IBusModelTable targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTableId());
		return(targetRec);
	}

	@Override
	public IBusModelTable getRequiredContainerTable() {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTable", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelTableTable targetTable = targetBackingBusModel.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTable", 0, "IBusModelSchema.getBackingBusModel().getTableTable()");
		}
		IBusModelTable targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTableId());
		return(targetRec);
	}

	@Override
	public IBusModelTable getRequiredContainerTable() {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTable", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelTableTable targetTable = targetBackingBusModel.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTable", 0, "IBusModelSchema.getBackingBusModel().getTableTable()");
		}
		IBusModelPubTable targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTableId());
		return(targetRec);
	}

	@Override
	public void setRequiredContainerScope(ICFKeyHash256 argTableId) {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTable-args", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelScopeTable targetTable = targetBackingBusModel.getTableScope();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope", 0, "IBusModelSchema.getBackingBusModel().getTableScope()");
		}
		IBusModelScope found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTableId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope-args", 0, "found");
		}
		else if (found instanceof IBusModelTable) || (found instanceof IBusModelProtTable) || (found instanceof IBusModelPubTable)) {
			super.setRequiredContainerScope(argTableId);
		requiredTableId = argTableId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerScope-args", "found", found, "IBusModelTableIBusModelProtTableIBusModelPubTable");
		}
	}

	@Override
	public void setRequiredContainerTable(ICFKeyHash256 argTableId) {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTable-args", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelScopeTable targetTable = targetBackingBusModel.getTableScope();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope", 0, "IBusModelSchema.getBackingBusModel().getTableScope()");
		}
		IBusModelScope found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTableId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope-args", 0, "found");
		}
		else if (found instanceof IBusModelTable) || (found instanceof IBusModelProtTable) || (found instanceof IBusModelPubTable)) {
			super.setRequiredContainerScope(argTableId);
		requiredTableId = argTableId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerScope-args", "found", found, "IBusModelTableIBusModelProtTableIBusModelPubTable");
		}
	}

	@Override
	public void setRequiredContainerTable(IBusModelTable argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerTable", 1, "argObj");
		}
		else {
			setRequiredTableId(argObj.getRequiredId());
		}
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
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IBusModelDbKeyHash160Col rhs ) {
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
		else if( obj instanceof IBusModelDbKeyHash160ColH rhs ) {
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
		else if( obj instanceof IBusModelValueHPKey ) {
			IBusModelValueHPKey rhs = (IBusModelValueHPKey)obj;
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
		else if( obj instanceof IBusModelDbKeyHash160ColByTableIdxKey rhs ) {
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
		else if( obj instanceof IBusModelProtDbKeyHash160Col rhs ) {
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
		else if( obj instanceof IBusModelProtDbKeyHash160ColH rhs ) {
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
		else if( obj instanceof IBusModelProtValueHPKey rhs ) {
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
		else if( obj instanceof IBusModelDbKeyHash160ColByTableIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubDbKeyHash160Col rhs ) {
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
		else if( obj instanceof IBusModelPubDbKeyHash160ColH rhs ) {
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
		else if( obj instanceof IBusModelPubValueHPKey rhs ) {
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
		else if( obj instanceof IBusModelDbKeyHash160ColByTableIdxKey rhs ) {
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
			boolean retval = super.equals( obj );
			return( retval );
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
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IBusModelDbKeyHash160Col rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelValueHPKey rhs ) {
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
		else if( obj instanceof IBusModelDbKeyHash160ColH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelDbKeyHash160ColByTableIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtDbKeyHash160Col rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelProtValueHPKey rhs ) {
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
		else if( obj instanceof IBusModelProtDbKeyHash160ColH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelProtDbKeyHash160ColByTableIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubDbKeyHash160Col rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelPubValueHPKey rhs ) {
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
		else if( obj instanceof IBusModelPubDbKeyHash160ColH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelPubDbKeyHash160ColByTableIdxKey rhs ) {
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
			}			return( 0 );
		}
		else {
			cmp = super.compareTo( obj );
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelValue src ) {
		if( src instanceof BusModelBuffDbKeyHash160Col ) {
			setDbKeyHash160Col( (BusModelBuffDbKeyHash160Col)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelBuffDbKeyHash160Col" );
		}
	}

	@Override
	public void setDbKeyHash160Col( IBusModelDbKeyHash160Col src ) {
		super.setDbKeyHash160Def( src );
		setRequiredContainerTable(src.getRequiredContainerTable());
		setRequiredTableId(src.getRequiredTableId());
	}

	@Override
	public void set( IBusModelValueH src ) {
		if( src instanceof IBusModelDbKeyHash160ColH ) {
			setDbKeyHash160Col( (IBusModelDbKeyHash160ColH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelDbKeyHash160ColH" );
		}
	}

	@Override
	public void setDbKeyHash160Col( IBusModelDbKeyHash160ColH src ) {
		super.setDbKeyHash160Def( src );
		setRequiredContainerTable(src.getRequiredContainerTable());
		setRequiredTableId(src.getRequiredTableId());
	}

	@Override
	public void set( IBusModelProtValue src ) {
		if( src instanceof BusModelProtBuffDbKeyHash160Col ) {
			setDbKeyHash160Col( (BusModelProtBuffDbKeyHash160Col)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelProtBuffDbKeyHash160Col" );
		}
	}

	@Override
	public void setDbKeyHash160Col( IBusModelProtDbKeyHash160Col src ) {
		super.setDbKeyHash160Def( src );
		setRequiredContainerTable(src.getRequiredContainerTable());
		setRequiredTableId(src.getRequiredTableId());
	}

	@Override
	public void set( IBusModelProtValueH src ) {
		if( src instanceof IBusModelProtDbKeyHash160ColH ) {
			setDbKeyHash160Col( (IBusModelProtDbKeyHash160ColH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelProtDbKeyHash160ColH" );
		}
	}

	@Override
	public void setDbKeyHash160Col( IBusModelProtDbKeyHash160ColH src ) {
		super.setDbKeyHash160Def( src );
		setRequiredContainerTable(src.getRequiredContainerTable());
		setRequiredTableId(src.getRequiredTableId());
	}

	@Override
	public void set( IBusModelPubValue src ) {
		if( src instanceof BusModelPubBuffDbKeyHash160Col ) {
			setDbKeyHash160Col( (BusModelPubBuffDbKeyHash160Col)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubBuffDbKeyHash160Col" );
		}
	}

	@Override
	public void setDbKeyHash160Col( IBusModelPubDbKeyHash160Col src ) {
		super.setDbKeyHash160Def( src );
		setRequiredContainerTable(src.getRequiredContainerTable());
		setRequiredTableId(src.getRequiredTableId());
	}

	@Override
	public void set( IBusModelPubValueH src ) {
		if( src instanceof IBusModelPubDbKeyHash160ColH ) {
			setDbKeyHash160Col( (IBusModelPubDbKeyHash160ColH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubDbKeyHash160ColH" );
		}
	}

	@Override
	public void setDbKeyHash160Col( IBusModelPubDbKeyHash160ColH src ) {
		super.setDbKeyHash160Def( src );
		setRequiredContainerTable(src.getRequiredContainerTable());
		setRequiredTableId(src.getRequiredTableId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredTableId=" + "\"" + getRequiredTableId().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelBuffDbKeyHash160Col" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
