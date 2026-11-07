// Description: Java 25 implementation of a PopDep buffer

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

package server.markhome.ycf.v3_1.busmodel.busmodel.buff;

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

public class BusModelBuffPopDep
	extends BusModelBuffScope
	implements IBusModelPopDep
{
	protected ICFKeyHash256 optionalDefSchemaId;
	protected ICFKeyHash256 requiredRelationId;

	public BusModelBuffPopDep() {
		super();
		optionalDefSchemaId = CFDbKeyHash256.nullGet();
		requiredRelationId = CFDbKeyHash256.fromHex( IBusModelPubPopDep.RELATIONID_INIT_VALUE.toString() );
	}

	@Override
	public int getClassCode() {
		return( IBusModelPopDep.CLASS_CODE );
	}

	@Override
	public IBusModelRelation getRequiredLookupRelation() {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupRelation", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelRelationTable targetTable = targetBackingBusModel.getTableRelation();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupRelation", 0, "IBusModelSchema.getBackingBusModel().getTableRelation()");
		}
		IBusModelRelation targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredRelationId());
		return(targetRec);
	}

	@Override
	public IBusModelRelation getRequiredLookupRelation() {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupRelation", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelRelationTable targetTable = targetBackingBusModel.getTableRelation();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupRelation", 0, "IBusModelSchema.getBackingBusModel().getTableRelation()");
		}
		IBusModelRelation targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredRelationId());
		return(targetRec);
	}

	@Override
	public IBusModelRelation getRequiredLookupRelation() {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupRelation", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelRelationTable targetTable = targetBackingBusModel.getTableRelation();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupRelation", 0, "IBusModelSchema.getBackingBusModel().getTableRelation()");
		}
		IBusModelPubRelation targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredRelationId());
		return(targetRec);
	}

	@Override
	public void setRequiredLookupRelation(ICFKeyHash256 argRelationId) {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupRelation-args", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelRelationTable targetTable = targetBackingBusModel.getTableRelation();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupRelation", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelRelation found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argRelationId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupRelation-args", 0, "found");
		}
		else if ((found instanceof IBusModelRelation) || (found instanceof IBusModelProtRelation) || (found instanceof IBusModelPubRelation)) {
		requiredRelationId = argRelationId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredLookupRelation-args", "found", found, "IBusModelRelationIBusModelProtRelationIBusModelPubRelation");
		}
	}

	@Override
	public void setRequiredLookupRelation(IBusModelRelation argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setLookupRelation", 1, "argObj");
		}
		else {
			setRequiredRelationId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelSchemaDef getOptionalLookupDefSchema() {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaDef()");
		}
		IBusModelSchemaDef targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalDefSchemaId());
		return(targetRec);
	}

	@Override
	public IBusModelSchemaDef getOptionalLookupDefSchema() {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaDef()");
		}
		IBusModelSchemaDef targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalDefSchemaId());
		return(targetRec);
	}

	@Override
	public IBusModelSchemaDef getOptionalLookupDefSchema() {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaDef()");
		}
		IBusModelPubSchemaDef targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalDefSchemaId());
		return(targetRec);
	}

	@Override
	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId) {
		IBusModelSchema targetBackingBusModel = IBusModelSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupDefSchema-args", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelSchemaDef found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argDefSchemaId);
		if (found == null || (found != null && ((found instanceof IBusModelSchemaDef) || (found instanceof IBusModelProtSchemaDef) || (found instanceof IBusModelPubSchemaDef)))) {
		optionalDefSchemaId = argDefSchemaId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupDefSchema-args", "found", found, "IBusModelSchemaDefIBusModelProtSchemaDefIBusModelPubSchemaDef");
		}
	}

	@Override
	public void setOptionalLookupDefSchema(IBusModelSchemaDef argObj) {
		if(argObj == null) {
			setOptionalDefSchemaId(null);
		}
		else {
			setOptionalDefSchemaId(argObj.getRequiredId());
		}
	}

	@Override
	public ICFKeyHash256 getOptionalDefSchemaId() {
		return(optionalDefSchemaId);
	}

	public void setOptionalDefSchemaId( ICFKeyHash256 value ) {
		optionalDefSchemaId = value;
	}

	@Override
	public ICFKeyHash256 getRequiredRelationId() {
		return(requiredRelationId);
	}

	public void setRequiredRelationId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredRelationId",
				1,
				"value" );
		}
		requiredRelationId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IBusModelPopDep rhs ) {
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
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPopDepH rhs ) {
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
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelScopeHPKey ) {
			IBusModelScopeHPKey rhs = (IBusModelScopeHPKey)obj;
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
		else if( obj instanceof IBusModelPopDepByRelationIdxKey rhs ) {
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPopDepByDefSchemaIdxKey rhs ) {
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtPopDep rhs ) {
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
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtPopDepH rhs ) {
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
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtScopeHPKey rhs ) {
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
		else if( obj instanceof IBusModelPopDepByRelationIdxKey rhs ) {
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPopDepByDefSchemaIdxKey rhs ) {
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubPopDep rhs ) {
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
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubPopDepH rhs ) {
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
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( false );
				}
			}
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubScopeHPKey rhs ) {
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
		else if( obj instanceof IBusModelPopDepByRelationIdxKey rhs ) {
			if( getRequiredRelationId() != null ) {
				if( rhs.getRequiredRelationId() != null ) {
					if( ! getRequiredRelationId().equals( rhs.getRequiredRelationId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRelationId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPopDepByDefSchemaIdxKey rhs ) {
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					if( ! getOptionalDefSchemaId().equals( rhs.getOptionalDefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
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
		if( getOptionalDefSchemaId() != null ) {
			hashCode = hashCode + getOptionalDefSchemaId().hashCode();
		}
		hashCode = hashCode + getRequiredRelationId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IBusModelPopDep rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelScopeHPKey rhs ) {
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
		else if( obj instanceof IBusModelPopDepH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelPopDepByRelationIdxKey rhs ) {
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPopDepByDefSchemaIdxKey rhs ) {
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtPopDep rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}
			return( 0 );
 		}
		else if( obj instanceof IBusModelProtScopeHPKey rhs ) {
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
		else if( obj instanceof IBusModelProtPopDepH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelProtPopDepByRelationIdxKey rhs ) {
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtPopDepByDefSchemaIdxKey rhs ) {
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubPopDep rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelPubScopeHPKey rhs ) {
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
		else if( obj instanceof IBusModelPubPopDepH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelPubPopDepByRelationIdxKey rhs ) {
			if (getRequiredRelationId() != null) {
				if (rhs.getRequiredRelationId() != null) {
					cmp = getRequiredRelationId().compareTo( rhs.getRequiredRelationId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRelationId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubPopDepByDefSchemaIdxKey rhs ) {
			if( getOptionalDefSchemaId() != null ) {
				if( rhs.getOptionalDefSchemaId() != null ) {
					cmp = getOptionalDefSchemaId().compareTo( rhs.getOptionalDefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else {
			cmp = super.compareTo( obj );
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelScope src ) {
		if( src instanceof BusModelBuffPopDep ) {
			setPopDep( (BusModelBuffPopDep)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelBuffPopDep" );
		}
	}

	@Override
	public void setPopDep( IBusModelPopDep src ) {
		super.setScope( src );
		setRequiredLookupRelation(src.getRequiredLookupRelation());
		setOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setRequiredRelationId(src.getRequiredRelationId());
	}

	@Override
	public void set( IBusModelScopeH src ) {
		if( src instanceof IBusModelPopDepH ) {
			setPopDep( (IBusModelPopDepH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPopDepH" );
		}
	}

	@Override
	public void setPopDep( IBusModelPopDepH src ) {
		super.setScope( src );
		setRequiredLookupRelation(src.getRequiredLookupRelation());
		setOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setRequiredRelationId(src.getRequiredRelationId());
	}

	@Override
	public void set( IBusModelProtScope src ) {
		if( src instanceof BusModelProtBuffPopDep ) {
			setPopDep( (BusModelProtBuffPopDep)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelProtBuffPopDep" );
		}
	}

	@Override
	public void setPopDep( IBusModelProtPopDep src ) {
		super.setScope( src );
		setRequiredLookupRelation(src.getRequiredLookupRelation());
		setOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setRequiredRelationId(src.getRequiredRelationId());
	}

	@Override
	public void set( IBusModelProtScopeH src ) {
		if( src instanceof IBusModelProtPopDepH ) {
			setPopDep( (IBusModelProtPopDepH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelProtPopDepH" );
		}
	}

	@Override
	public void setPopDep( IBusModelProtPopDepH src ) {
		super.setScope( src );
		setRequiredLookupRelation(src.getRequiredLookupRelation());
		setOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setRequiredRelationId(src.getRequiredRelationId());
	}

	@Override
	public void set( IBusModelPubScope src ) {
		if( src instanceof BusModelPubBuffPopDep ) {
			setPopDep( (BusModelPubBuffPopDep)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubBuffPopDep" );
		}
	}

	@Override
	public void setPopDep( IBusModelPubPopDep src ) {
		super.setScope( src );
		setRequiredLookupRelation(src.getRequiredLookupRelation());
		setOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setRequiredRelationId(src.getRequiredRelationId());
	}

	@Override
	public void set( IBusModelPubScopeH src ) {
		if( src instanceof IBusModelPubPopDepH ) {
			setPopDep( (IBusModelPubPopDepH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubPopDepH" );
		}
	}

	@Override
	public void setPopDep( IBusModelPubPopDepH src ) {
		super.setScope( src );
		setRequiredLookupRelation(src.getRequiredLookupRelation());
		setOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setRequiredRelationId(src.getRequiredRelationId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " OptionalDefSchemaId=" + ( ( getOptionalDefSchemaId() == null ) ? "null" : "\"" + getOptionalDefSchemaId().toString() + "\"" )
			+ " RequiredRelationId=" + "\"" + getRequiredRelationId().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelBuffPopDep" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
