// Description: Java 17 implJustProtementation of a SchemaRef buffer

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

public class BusModelProtBuffSchemaRef
	extends BusModelProtBuffScope
	implements IBusModelSchemaRef
{
	protected ICFKeyHash256 requiredSchemaId;
	protected String requiredName;
	protected String requiredRefModelName;
	protected String requiredIncludeRoot;
	protected ICFKeyHash256 optionalRefSchemaId;
	protected ICFKeyHash256 optionalPrevId;
	protected ICFKeyHash256 optionalNextId;

	public BusModelProtBuffSchemaRef() {
		super();
		requiredSchemaId = CFDbKeyHash256.fromHex( IBusModelPubSchemaRef.SCHEMAID_INIT_VALUE.toString() );
		requiredName = IBusModelPubSchemaRef.NAME_INIT_VALUE;
		requiredRefModelName = IBusModelPubSchemaRef.REFMODELNAME_INIT_VALUE;
		requiredIncludeRoot = IBusModelPubSchemaRef.INCLUDEROOT_INIT_VALUE;
		optionalRefSchemaId = CFDbKeyHash256.nullGet();
		optionalPrevId = CFDbKeyHash256.nullGet();
		optionalNextId = CFDbKeyHash256.nullGet();
	}

	@Override
	public int getClassCode() {
		return( IBusModelProtSchemaRef.CLASS_CODE );
	}

	@Override
	public IBusModelProtSchemaDef getRequiredContainerSchema(ICFKeyHash256 argSchemaId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSchema", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSchema", 0, "IBusModelProtSchema.getBackingBusModel().getTableSchemaDef()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSchemaId()));
	}

	@Override
	public void setRequiredContainerSchema(ICFKeyHash256 argSchemaId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSchema-args", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSchema", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaDef()");
		}
		IBusModelProtSchemaDef found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSchemaId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSchema-args", 0, "found");
		}
		else if (found instanceof IBusModelProtSchemaDef) || (found instanceof IBusModelProtSchemaDef) || (found instanceof IBusModelPubSchemaDef)) {
			super.setRequiredContainerSchema(argSchemaId);
		requiredSchemaId = argSchemaId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerSchema-args", "found", found, "IBusModelProtSchemaDefIBusModelProtSchemaDefIBusModelPubSchemaDef");
		}
	}

	@Override
	public void setRequiredContainerSchema(IBusModelProtSchemaDef argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSchema", 1, "argObj");
		}
		else {
			setJustProtRequiredSchemaId(argObj.getRequiredId());
		}
	}

	@Override
	public void setRequiredContainerSchema(IBusModelPubSchemaDef argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSchema", 1, "argObj");
		}
		else {
			setJustProtRequiredSchemaId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelProtSchemaDef getOptionalLookupRefSchema(ICFKeyHash256 argRefSchemaId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupRefSchema", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupRefSchema", 0, "IBusModelProtSchema.getBackingBusModel().getTableSchemaDef()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalRefSchemaId()));
	}

	@Override
	public void setOptionalLookupRefSchema(ICFKeyHash256 argRefSchemaId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupRefSchema-args", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupRefSchema", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaDef()");
		}
		IBusModelProtSchemaDef found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argRefSchemaId);
		if (found == null || (found != null && ((found instanceof IBusModelProtSchemaDef) || (found instanceof IBusModelProtSchemaDef) || (found instanceof IBusModelPubSchemaDef)))) {
			super.setOptionalLookupRefSchema(argRefSchemaId);
		optionalRefSchemaId = argRefSchemaId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupRefSchema-args", "found", found, "IBusModelProtSchemaDefIBusModelProtSchemaDefIBusModelPubSchemaDef");
		}
	}

	@Override
	public void setOptionalLookupRefSchema(IBusModelProtSchemaDef argObj) {

		if(argObj == null) {
			setJustProtOptionalRefSchemaId(null);
		}
		else {
			setJustProtOptionalRefSchemaId(argObj.getRequiredId());
		}
	}

	@Override
	public void setOptionalLookupRefSchema(IBusModelPubSchemaDef argObj) {

		if(argObj == null) {
			setJustProtOptionalRefSchemaId(null);
		}
		else {
			setJustProtOptionalRefSchemaId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelProtSchemaRef getOptionalLookupPrev(ICFKeyHash256 argPrevId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupPrev", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtSchemaRefTable targetTable = targetBackingBusModel.getTableSchemaRef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupPrev", 0, "IBusModelProtSchema.getBackingBusModel().getTableSchemaRef()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalPrevId()));
	}

	@Override
	public void setOptionalLookupPrev(ICFKeyHash256 argPrevId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupPrev-args", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtSchemaRefTable targetTable = targetBackingBusModel.getTableSchemaRef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupPrev", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaRef()");
		}
		IBusModelProtSchemaRef found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argPrevId);
		if (found == null || (found != null && ((found instanceof IBusModelProtSchemaRef) || (found instanceof IBusModelProtSchemaRef) || (found instanceof IBusModelPubSchemaRef)))) {
			super.setOptionalLookupPrev(argPrevId);
		optionalPrevId = argPrevId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupPrev-args", "found", found, "IBusModelProtSchemaRefIBusModelProtSchemaRefIBusModelPubSchemaRef");
		}
	}

	@Override
	public void setOptionalLookupPrev(IBusModelProtSchemaRef argObj) {

		if(argObj == null) {
			setJustProtOptionalPrevId(null);
		}
		else {
			setJustProtOptionalPrevId(argObj.getRequiredId());
		}
	}

	@Override
	public void setOptionalLookupPrev(IBusModelPubSchemaRef argObj) {

		if(argObj == null) {
			setJustProtOptionalPrevId(null);
		}
		else {
			setJustProtOptionalPrevId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelProtSchemaRef getOptionalLookupNext(ICFKeyHash256 argNextId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupNext", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtSchemaRefTable targetTable = targetBackingBusModel.getTableSchemaRef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupNext", 0, "IBusModelProtSchema.getBackingBusModel().getTableSchemaRef()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalNextId()));
	}

	@Override
	public void setOptionalLookupNext(ICFKeyHash256 argNextId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNext-args", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtSchemaRefTable targetTable = targetBackingBusModel.getTableSchemaRef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNext", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaRef()");
		}
		IBusModelProtSchemaRef found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argNextId);
		if (found == null || (found != null && ((found instanceof IBusModelProtSchemaRef) || (found instanceof IBusModelProtSchemaRef) || (found instanceof IBusModelPubSchemaRef)))) {
			super.setOptionalLookupNext(argNextId);
		optionalNextId = argNextId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupNext-args", "found", found, "IBusModelProtSchemaRefIBusModelProtSchemaRefIBusModelPubSchemaRef");
		}
	}

	@Override
	public void setOptionalLookupNext(IBusModelProtSchemaRef argObj) {

		if(argObj == null) {
			setJustProtOptionalNextId(null);
		}
		else {
			setJustProtOptionalNextId(argObj.getRequiredId());
		}
	}

	@Override
	public void setOptionalLookupNext(IBusModelPubSchemaRef argObj) {

		if(argObj == null) {
			setJustProtOptionalNextId(null);
		}
		else {
			setJustProtOptionalNextId(argObj.getRequiredId());
		}
	}

	@Override
	public ICFKeyHash256 getRequiredSchemaId() {
		return(requiredSchemaId);
	}

	public void setRequiredSchemaId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSchemaId",
				1,
				"value" );
		}
		requiredSchemaId = value;
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
	public String getRequiredRefModelName() {
		return(requiredRefModelName);
	}

	public void setRequiredRefModelName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredRefModelName",
				1,
				"value" );
		}
		else if( value.length() > 1024 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredRefModelName",
				1,
				"value.length()",
				value.length(),
				1024 );
		}
		requiredRefModelName = value;
	}

	@Override
	public String getRequiredIncludeRoot() {
		return(requiredIncludeRoot);
	}

	public void setRequiredIncludeRoot( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredIncludeRoot",
				1,
				"value" );
		}
		else if( value.length() > 1024 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredIncludeRoot",
				1,
				"value.length()",
				value.length(),
				1024 );
		}
		requiredIncludeRoot = value;
	}

	@Override
	public ICFKeyHash256 getOptionalRefSchemaId() {
		return(optionalRefSchemaId);
	}

	public void setOptionalRefSchemaId( ICFKeyHash256 value ) {
		optionalRefSchemaId = value;
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
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IBusModelProtSchemaRef rhs ) {
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
			if( getRequiredSchemaId() != null ) {
				if( rhs.getRequiredSchemaId() != null ) {
					if( ! getRequiredSchemaId().equals( rhs.getRequiredSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaId() != null ) {
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
			if( getRequiredRefModelName() != null ) {
				if( rhs.getRequiredRefModelName() != null ) {
					if( ! getRequiredRefModelName().equals( rhs.getRequiredRefModelName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRefModelName() != null ) {
					return( false );
				}
			}
			if( getRequiredIncludeRoot() != null ) {
				if( rhs.getRequiredIncludeRoot() != null ) {
					if( ! getRequiredIncludeRoot().equals( rhs.getRequiredIncludeRoot() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIncludeRoot() != null ) {
					return( false );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
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
		else if( obj instanceof IBusModelProtSchemaRefH rhs ) {
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
			if( getRequiredSchemaId() != null ) {
				if( rhs.getRequiredSchemaId() != null ) {
					if( ! getRequiredSchemaId().equals( rhs.getRequiredSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaId() != null ) {
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
			if( getRequiredRefModelName() != null ) {
				if( rhs.getRequiredRefModelName() != null ) {
					if( ! getRequiredRefModelName().equals( rhs.getRequiredRefModelName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRefModelName() != null ) {
					return( false );
				}
			}
			if( getRequiredIncludeRoot() != null ) {
				if( rhs.getRequiredIncludeRoot() != null ) {
					if( ! getRequiredIncludeRoot().equals( rhs.getRequiredIncludeRoot() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIncludeRoot() != null ) {
					return( false );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
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
		else if( obj instanceof IBusModelProtScopeHPKey ) {
			IBusModelProtScopeHPKey rhs = (IBusModelProtScopeHPKey)obj;
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
		else if( obj instanceof IBusModelProtSchemaRefBySchemaIdxKey rhs ) {
			if( getRequiredSchemaId() != null ) {
				if( rhs.getRequiredSchemaId() != null ) {
					if( ! getRequiredSchemaId().equals( rhs.getRequiredSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtSchemaRefByUNameIdxKey rhs ) {
			if( getRequiredSchemaId() != null ) {
				if( rhs.getRequiredSchemaId() != null ) {
					if( ! getRequiredSchemaId().equals( rhs.getRequiredSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaId() != null ) {
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
		else if( obj instanceof IBusModelProtSchemaRefByRefSchemaIdxKey rhs ) {
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtSchemaRefByPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelProtSchemaRefByNextIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubSchemaRef rhs ) {
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
			if( getRequiredSchemaId() != null ) {
				if( rhs.getRequiredSchemaId() != null ) {
					if( ! getRequiredSchemaId().equals( rhs.getRequiredSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaId() != null ) {
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
			if( getRequiredRefModelName() != null ) {
				if( rhs.getRequiredRefModelName() != null ) {
					if( ! getRequiredRefModelName().equals( rhs.getRequiredRefModelName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRefModelName() != null ) {
					return( false );
				}
			}
			if( getRequiredIncludeRoot() != null ) {
				if( rhs.getRequiredIncludeRoot() != null ) {
					if( ! getRequiredIncludeRoot().equals( rhs.getRequiredIncludeRoot() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIncludeRoot() != null ) {
					return( false );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
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
		else if( obj instanceof IBusModelPubSchemaRefH rhs ) {
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
			if( getRequiredSchemaId() != null ) {
				if( rhs.getRequiredSchemaId() != null ) {
					if( ! getRequiredSchemaId().equals( rhs.getRequiredSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaId() != null ) {
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
			if( getRequiredRefModelName() != null ) {
				if( rhs.getRequiredRefModelName() != null ) {
					if( ! getRequiredRefModelName().equals( rhs.getRequiredRefModelName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredRefModelName() != null ) {
					return( false );
				}
			}
			if( getRequiredIncludeRoot() != null ) {
				if( rhs.getRequiredIncludeRoot() != null ) {
					if( ! getRequiredIncludeRoot().equals( rhs.getRequiredIncludeRoot() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredIncludeRoot() != null ) {
					return( false );
				}
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
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
		else if( obj instanceof IBusModelProtSchemaRefBySchemaIdxKey rhs ) {
			if( getRequiredSchemaId() != null ) {
				if( rhs.getRequiredSchemaId() != null ) {
					if( ! getRequiredSchemaId().equals( rhs.getRequiredSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtSchemaRefByUNameIdxKey rhs ) {
			if( getRequiredSchemaId() != null ) {
				if( rhs.getRequiredSchemaId() != null ) {
					if( ! getRequiredSchemaId().equals( rhs.getRequiredSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaId() != null ) {
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
		else if( obj instanceof IBusModelProtSchemaRefByRefSchemaIdxKey rhs ) {
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					if( ! getOptionalRefSchemaId().equals( rhs.getOptionalRefSchemaId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtSchemaRefByPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelProtSchemaRefByNextIdxKey rhs ) {
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
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredSchemaId().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getRequiredRefModelName() != null ) {
			hashCode = hashCode + getRequiredRefModelName().hashCode();
		}
		if( getRequiredIncludeRoot() != null ) {
			hashCode = hashCode + getRequiredIncludeRoot().hashCode();
		}
		if( getOptionalRefSchemaId() != null ) {
			hashCode = hashCode + getOptionalRefSchemaId().hashCode();
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
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IBusModelProtSchemaRef rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredSchemaId() != null) {
				if (rhs.getRequiredSchemaId() != null) {
					cmp = getRequiredSchemaId().compareTo( rhs.getRequiredSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaId() != null) {
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
			if (getRequiredRefModelName() != null) {
				if (rhs.getRequiredRefModelName() != null) {
					cmp = getRequiredRefModelName().compareTo( rhs.getRequiredRefModelName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRefModelName() != null) {
				return( -1 );
			}
			if (getRequiredIncludeRoot() != null) {
				if (rhs.getRequiredIncludeRoot() != null) {
					cmp = getRequiredIncludeRoot().compareTo( rhs.getRequiredIncludeRoot() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIncludeRoot() != null) {
				return( -1 );
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					cmp = getOptionalRefSchemaId().compareTo( rhs.getOptionalRefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( -1 );
				}
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
		else if( obj instanceof IBusModelProtSchemaRefH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredSchemaId() != null) {
				if (rhs.getRequiredSchemaId() != null) {
					cmp = getRequiredSchemaId().compareTo( rhs.getRequiredSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaId() != null) {
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
			if (getRequiredRefModelName() != null) {
				if (rhs.getRequiredRefModelName() != null) {
					cmp = getRequiredRefModelName().compareTo( rhs.getRequiredRefModelName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRefModelName() != null) {
				return( -1 );
			}
			if (getRequiredIncludeRoot() != null) {
				if (rhs.getRequiredIncludeRoot() != null) {
					cmp = getRequiredIncludeRoot().compareTo( rhs.getRequiredIncludeRoot() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIncludeRoot() != null) {
				return( -1 );
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					cmp = getOptionalRefSchemaId().compareTo( rhs.getOptionalRefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( -1 );
				}
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
		else if( obj instanceof IBusModelProtSchemaRefBySchemaIdxKey rhs ) {
			if (getRequiredSchemaId() != null) {
				if (rhs.getRequiredSchemaId() != null) {
					cmp = getRequiredSchemaId().compareTo( rhs.getRequiredSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtSchemaRefByUNameIdxKey rhs ) {
			if (getRequiredSchemaId() != null) {
				if (rhs.getRequiredSchemaId() != null) {
					cmp = getRequiredSchemaId().compareTo( rhs.getRequiredSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaId() != null) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtSchemaRefByRefSchemaIdxKey rhs ) {
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					cmp = getOptionalRefSchemaId().compareTo( rhs.getOptionalRefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtSchemaRefByPrevIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtSchemaRefByNextIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubSchemaRef rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredSchemaId() != null) {
				if (rhs.getRequiredSchemaId() != null) {
					cmp = getRequiredSchemaId().compareTo( rhs.getRequiredSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaId() != null) {
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
			if (getRequiredRefModelName() != null) {
				if (rhs.getRequiredRefModelName() != null) {
					cmp = getRequiredRefModelName().compareTo( rhs.getRequiredRefModelName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRefModelName() != null) {
				return( -1 );
			}
			if (getRequiredIncludeRoot() != null) {
				if (rhs.getRequiredIncludeRoot() != null) {
					cmp = getRequiredIncludeRoot().compareTo( rhs.getRequiredIncludeRoot() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIncludeRoot() != null) {
				return( -1 );
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					cmp = getOptionalRefSchemaId().compareTo( rhs.getOptionalRefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( -1 );
				}
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
		else if( obj instanceof IBusModelPubSchemaRefH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredSchemaId() != null) {
				if (rhs.getRequiredSchemaId() != null) {
					cmp = getRequiredSchemaId().compareTo( rhs.getRequiredSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaId() != null) {
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
			if (getRequiredRefModelName() != null) {
				if (rhs.getRequiredRefModelName() != null) {
					cmp = getRequiredRefModelName().compareTo( rhs.getRequiredRefModelName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredRefModelName() != null) {
				return( -1 );
			}
			if (getRequiredIncludeRoot() != null) {
				if (rhs.getRequiredIncludeRoot() != null) {
					cmp = getRequiredIncludeRoot().compareTo( rhs.getRequiredIncludeRoot() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredIncludeRoot() != null) {
				return( -1 );
			}
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					cmp = getOptionalRefSchemaId().compareTo( rhs.getOptionalRefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( -1 );
				}
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
		else if( obj instanceof IBusModelPubSchemaRefBySchemaIdxKey rhs ) {
			if (getRequiredSchemaId() != null) {
				if (rhs.getRequiredSchemaId() != null) {
					cmp = getRequiredSchemaId().compareTo( rhs.getRequiredSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubSchemaRefByUNameIdxKey rhs ) {
			if (getRequiredSchemaId() != null) {
				if (rhs.getRequiredSchemaId() != null) {
					cmp = getRequiredSchemaId().compareTo( rhs.getRequiredSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaId() != null) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubSchemaRefByRefSchemaIdxKey rhs ) {
			if( getOptionalRefSchemaId() != null ) {
				if( rhs.getOptionalRefSchemaId() != null ) {
					cmp = getOptionalRefSchemaId().compareTo( rhs.getOptionalRefSchemaId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRefSchemaId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubSchemaRefByPrevIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubSchemaRefByNextIdxKey rhs ) {
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
			}			return( 0 );
		}
		else {
			cmp = super.compareTo( obj );
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelProtScope src ) {
		if( src instanceof BusModelProtBuffSchemaRef ) {
			setJustProtSchemaRef( (BusModelProtBuffSchemaRef)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelProtBuffSchemaRef" );
		}
	}

	@Override
	public void setSchemaRef( IBusModelProtSchemaRef src ) {
		super.setScope( src );
		setJustProtRequiredContainerSchema(src.getRequiredContainerSchema());
		setJustProtOptionalLookupRefSchema(src.getOptionalLookupRefSchema());
		setJustProtOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustProtOptionalLookupNext(src.getOptionalLookupNext());
		setJustProtRequiredSchemaId(src.getRequiredSchemaId());
		setJustProtRequiredName(src.getRequiredName());
		setJustProtRequiredRefModelName(src.getRequiredRefModelName());
		setJustProtRequiredIncludeRoot(src.getRequiredIncludeRoot());
		setJustProtOptionalRefSchemaId(src.getOptionalRefSchemaId());
		setJustProtOptionalPrevId(src.getOptionalPrevId());
		setJustProtOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelProtScopeH src ) {
		if( src instanceof IBusModelPubSchemaRefH ) {
			setSchemaRef( (IBusModelPubSchemaRefH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubSchemaRefH" );
		}
	}

	@Override
	public void setSchemaRef( IBusModelProtSchemaRefH src ) {
		super.setScope( src );
		setJustProtRequiredContainerSchema(src.getRequiredContainerSchema());
		setJustProtOptionalLookupRefSchema(src.getOptionalLookupRefSchema());
		setJustProtOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustProtOptionalLookupNext(src.getOptionalLookupNext());
		setJustProtRequiredSchemaId(src.getRequiredSchemaId());
		setJustProtRequiredName(src.getRequiredName());
		setJustProtRequiredRefModelName(src.getRequiredRefModelName());
		setJustProtRequiredIncludeRoot(src.getRequiredIncludeRoot());
		setJustProtOptionalRefSchemaId(src.getOptionalRefSchemaId());
		setJustProtOptionalPrevId(src.getOptionalPrevId());
		setJustProtOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelPubScope src ) {
		if( src instanceof BusModelPubProtBuffSchemaRef ) {
			setJustProtSchemaRef( (BusModelPubProtBuffSchemaRef)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubProtBuffSchemaRef" );
		}
	}

	@Override
	public void setSchemaRef( IBusModelPubSchemaRef src ) {
		super.setScope( src );
		setJustProtRequiredContainerSchema(src.getRequiredContainerSchema());
		setJustProtOptionalLookupRefSchema(src.getOptionalLookupRefSchema());
		setJustProtOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustProtOptionalLookupNext(src.getOptionalLookupNext());
		setJustProtRequiredSchemaId(src.getRequiredSchemaId());
		setJustProtRequiredName(src.getRequiredName());
		setJustProtRequiredRefModelName(src.getRequiredRefModelName());
		setJustProtRequiredIncludeRoot(src.getRequiredIncludeRoot());
		setJustProtOptionalRefSchemaId(src.getOptionalRefSchemaId());
		setJustProtOptionalPrevId(src.getOptionalPrevId());
		setJustProtOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelPubScopeH src ) {
		if( src instanceof IBusModelPubSchemaRefH ) {
			setSchemaRef( (IBusModelPubSchemaRefH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubSchemaRefH" );
		}
	}

	@Override
	public void setSchemaRef( IBusModelPubSchemaRefH src ) {
		super.setScope( src );
		setJustProtRequiredContainerSchema(src.getRequiredContainerSchema());
		setJustProtOptionalLookupRefSchema(src.getOptionalLookupRefSchema());
		setJustProtOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustProtOptionalLookupNext(src.getOptionalLookupNext());
		setJustProtRequiredSchemaId(src.getRequiredSchemaId());
		setJustProtRequiredName(src.getRequiredName());
		setJustProtRequiredRefModelName(src.getRequiredRefModelName());
		setJustProtRequiredIncludeRoot(src.getRequiredIncludeRoot());
		setJustProtOptionalRefSchemaId(src.getOptionalRefSchemaId());
		setJustProtOptionalPrevId(src.getOptionalPrevId());
		setJustProtOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment()  + "\"" + getRequiredId().toString() + "\"" + "\"" + getRequiredSchemaId().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredRefModelName() ) + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredIncludeRoot() ) + "\"" + ( ( getOptionalRefSchemaId() == null ) ? "null" : "\"" + getOptionalRefSchemaId().toString() + "\"" ) + ( ( getOptionalPrevId() == null ) ? "null" : "\"" + getOptionalPrevId().toString() + "\"" ) + ( ( getOptionalNextId() == null ) ? "null" : "\"" + getOptionalNextId().toString() + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelProtBuffSchemaRef" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
