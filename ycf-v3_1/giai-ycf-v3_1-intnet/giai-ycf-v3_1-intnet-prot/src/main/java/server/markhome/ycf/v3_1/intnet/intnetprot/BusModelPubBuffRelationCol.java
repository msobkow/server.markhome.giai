// Description: Java 17 implJustPubementation of a RelationCol buffer

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
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

public class BusModelPubBuffRelationCol
	implements IBusModelPubRelationCol, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredId;
	protected int requiredRevision;
	protected CFDbKeyHash256 createdByUserId = CFDbKeyHash256.fromHex(IBusModelPubSecUser.S_INIT_CREATED_BY);
	protected CFDbKeyHash256 createdBySessionId = CFDbKeyHash256.fromHex(IBusModelPubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime createdAt = LocalDateTime.now();
	protected CFDbKeyHash256 updatedByUserId = CFDbKeyHash256.fromHex(IBusModelPubSecUser.S_INIT_UPDATED_BY);
	protected CFDbKeyHash256 updatedBySessionId = CFDbKeyHash256.fromHex(IBusModelPubSecSession.S_SECSESSIONID_INIT_VALUE);
	protected LocalDateTime updatedAt = LocalDateTime.now();
	protected ICFKeyHash256 requiredRelationId;
	protected ICFKeyHash256 optionalDefSchemaId;
	protected String requiredName;
	protected String optionalShortName;
	protected String optionalLabel;
	protected String optionalShortDescription;
	protected String optionalDescription;
	protected ICFKeyHash256 requiredFromColId;
	protected ICFKeyHash256 requiredToColId;
	protected ICFKeyHash256 optionalPrevId;
	protected ICFKeyHash256 optionalNextId;

	public BusModelPubBuffRelationCol() {
		requiredId = CFDbKeyHash256.fromHex( IBusModelPubRelationCol.ID_INIT_VALUE.toString() );
		requiredRelationId = CFDbKeyHash256.fromHex( IBusModelPubRelationCol.RELATIONID_INIT_VALUE.toString() );
		optionalDefSchemaId = CFDbKeyHash256.nullGet();
		requiredName = IBusModelPubRelationCol.NAME_INIT_VALUE;
		optionalShortName = null;
		optionalLabel = null;
		optionalShortDescription = null;
		optionalDescription = null;
		requiredFromColId = CFDbKeyHash256.fromHex( IBusModelPubRelationCol.FROMCOLID_INIT_VALUE.toString() );
		requiredToColId = CFDbKeyHash256.fromHex( IBusModelPubRelationCol.TOCOLID_INIT_VALUE.toString() );
		optionalPrevId = CFDbKeyHash256.nullGet();
		optionalNextId = CFDbKeyHash256.nullGet();
	}

	@Override
	public ICFKeyHash256 getPKey() {
		return (requiredId);
	}

	@Override
	public void setPKey(ICFKeyHash256 requiredId) {
		if(requiredId != null) {
			this.requiredId = requiredId;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredId() {
		return(requiredId);
	}

	public void setRequiredId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredId",
				1,
				"value" );
		}
		requiredId = value;
	}

	@Override
	public CFDbKeyHash256 getCreatedByUserId() {
		return( createdByUserId );
	}

	@Override
	public void setJustPubCreatedByUserId( CFDbKeyHash256 value ) {
		createdByUserId = value;
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( createdAt );
	}

	@Override
	public void setJustPubCreatedAt( LocalDateTime value ) {
		createdAt = value;
	}

	@Override
	public CFDbKeyHash256 getUpdatedByUserId() {
		return( updatedByUserId );
	}

	@Override
	public void setJustPubUpdatedByUserId( CFDbKeyHash256 value ) {
		updatedByUserId = value;
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( updatedAt );
	}

	@Override
	public void setJustPubUpdatedAt( LocalDateTime value ) {
		updatedAt = value;
	}

	@Override
	public int getRequiredRevision() {
		return( requiredRevision );
	}

	@Override
	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	@Override
	public int getClassCode() {
		return( IBusModelPubRelationCol.CLASS_CODE );
	}

	@Override
	public IBusModelPubRelation getRequiredContainerRelation(ICFKeyHash256 argRelationId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerRelation", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubRelationTable targetTable = targetBackingBusModel.getTableRelation();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerRelation", 0, "IBusModelPubSchema.getBackingBusModel().getTableRelation()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredRelationId()));
	}

	@Override
	public void setRequiredContainerRelation(ICFKeyHash256 argRelationId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerRelation-args", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubRelationTable targetTable = targetBackingBusModel.getTableRelation();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerRelation", 0, "IBusModelSchema.getBackingBusModel().getTableRelation()");
		}
		IBusModelPubRelation found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argRelationId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerRelation-args", 0, "found");
		}
		else if (found instanceof IBusModelPubRelation) || (found instanceof IBusModelPubRelation)) {
			super.setRequiredContainerRelation(argRelationId);
		requiredRelationId = argRelationId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerRelation-args", "found", found, "IBusModelPubRelationIBusModelPubRelation");
		}
	}

	@Override
	public void setRequiredContainerRelation(IBusModelPubRelation argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerRelation", 1, "argObj");
		}
		else {
			setRequiredRelationId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelPubSchemaDef getOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupDefSchema", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupDefSchema", 0, "IBusModelPubSchema.getBackingBusModel().getTableSchemaDef()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalDefSchemaId()));
	}

	@Override
	public void setOptionalLookupDefSchema(ICFKeyHash256 argDefSchemaId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupDefSchema-args", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupDefSchema", 0, "IBusModelSchema.getBackingBusModel().getTableSchemaDef()");
		}
		IBusModelPubSchemaDef found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argDefSchemaId);
		if (found == null || (found != null && ((found instanceof IBusModelPubSchemaDef) || (found instanceof IBusModelPubSchemaDef)))) {
			super.setOptionalLookupDefSchema(argDefSchemaId);
		optionalDefSchemaId = argDefSchemaId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupDefSchema-args", "found", found, "IBusModelPubSchemaDefIBusModelPubSchemaDef");
		}
	}

	@Override
	public void setOptionalLookupDefSchema(IBusModelPubSchemaDef argObj) {

		if(argObj == null) {
			setJustPubOptionalDefSchemaId(null);
		}
		else {
			setOptionalDefSchemaId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelPubRelationCol getOptionalLookupPrev(ICFKeyHash256 argPrevId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupPrev", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubRelationColTable targetTable = targetBackingBusModel.getTableRelationCol();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupPrev", 0, "IBusModelPubSchema.getBackingBusModel().getTableRelationCol()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalPrevId()));
	}

	@Override
	public void setOptionalLookupPrev(ICFKeyHash256 argPrevId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupPrev-args", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubRelationColTable targetTable = targetBackingBusModel.getTableRelationCol();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupPrev", 0, "IBusModelSchema.getBackingBusModel().getTableRelationCol()");
		}
		IBusModelPubRelationCol found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argPrevId);
		if (found == null || (found != null && ((found instanceof IBusModelPubRelationCol) || (found instanceof IBusModelPubRelationCol)))) {
			super.setOptionalLookupPrev(argPrevId);
		optionalPrevId = argPrevId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupPrev-args", "found", found, "IBusModelPubRelationColIBusModelPubRelationCol");
		}
	}

	@Override
	public void setOptionalLookupPrev(IBusModelPubRelationCol argObj) {

		if(argObj == null) {
			setJustPubOptionalPrevId(null);
		}
		else {
			setOptionalPrevId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelPubRelationCol getOptionalLookupNext(ICFKeyHash256 argNextId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupNext", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubRelationColTable targetTable = targetBackingBusModel.getTableRelationCol();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupNext", 0, "IBusModelPubSchema.getBackingBusModel().getTableRelationCol()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalNextId()));
	}

	@Override
	public void setOptionalLookupNext(ICFKeyHash256 argNextId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNext-args", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubRelationColTable targetTable = targetBackingBusModel.getTableRelationCol();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNext", 0, "IBusModelSchema.getBackingBusModel().getTableRelationCol()");
		}
		IBusModelPubRelationCol found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argNextId);
		if (found == null || (found != null && ((found instanceof IBusModelPubRelationCol) || (found instanceof IBusModelPubRelationCol)))) {
			super.setOptionalLookupNext(argNextId);
		optionalNextId = argNextId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupNext-args", "found", found, "IBusModelPubRelationColIBusModelPubRelationCol");
		}
	}

	@Override
	public void setOptionalLookupNext(IBusModelPubRelationCol argObj) {

		if(argObj == null) {
			setJustPubOptionalNextId(null);
		}
		else {
			setOptionalNextId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelPubIndexCol getRequiredLookupFromCol(ICFKeyHash256 argFromColId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupFromCol", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubIndexColTable targetTable = targetBackingBusModel.getTableIndexCol();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupFromCol", 0, "IBusModelPubSchema.getBackingBusModel().getTableIndexCol()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredFromColId()));
	}

	@Override
	public void setRequiredLookupFromCol(ICFKeyHash256 argFromColId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupFromCol-args", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubIndexColTable targetTable = targetBackingBusModel.getTableIndexCol();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupFromCol", 0, "IBusModelSchema.getBackingBusModel().getTableIndexCol()");
		}
		IBusModelPubIndexCol found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argFromColId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupFromCol-args", 0, "found");
		}
		else if (found instanceof IBusModelPubIndexCol) || (found instanceof IBusModelPubIndexCol)) {
			super.setRequiredLookupFromCol(argFromColId);
		requiredFromColId = argFromColId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredLookupFromCol-args", "found", found, "IBusModelPubIndexColIBusModelPubIndexCol");
		}
	}

	@Override
	public void setRequiredLookupFromCol(IBusModelPubIndexCol argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setLookupFromCol", 1, "argObj");
		}
		else {
			setRequiredFromColId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelPubIndexCol getRequiredLookupToCol(ICFKeyHash256 argToColId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupToCol", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubIndexColTable targetTable = targetBackingBusModel.getTableIndexCol();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredLookupToCol", 0, "IBusModelPubSchema.getBackingBusModel().getTableIndexCol()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredToColId()));
	}

	@Override
	public void setRequiredLookupToCol(ICFKeyHash256 argToColId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupToCol-args", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubIndexColTable targetTable = targetBackingBusModel.getTableIndexCol();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupToCol", 0, "IBusModelSchema.getBackingBusModel().getTableIndexCol()");
		}
		IBusModelPubIndexCol found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argToColId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredLookupToCol-args", 0, "found");
		}
		else if (found instanceof IBusModelPubIndexCol) || (found instanceof IBusModelPubIndexCol)) {
			super.setRequiredLookupToCol(argToColId);
		requiredToColId = argToColId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredLookupToCol-args", "found", found, "IBusModelPubIndexColIBusModelPubIndexCol");
		}
	}

	@Override
	public void setRequiredLookupToCol(IBusModelPubIndexCol argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setLookupToCol", 1, "argObj");
		}
		else {
			setRequiredToColId(argObj.getRequiredId());
		}
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
	public ICFKeyHash256 getOptionalDefSchemaId() {
		return(optionalDefSchemaId);
	}

	public void setOptionalDefSchemaId( ICFKeyHash256 value ) {
		optionalDefSchemaId = value;
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
	public String getOptionalShortName() {
		return(optionalShortName);
	}

	public void setOptionalShortName( String value ) {
		if( value != null && value.length() > 16 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalShortName",
				1,
				"value.length()",
				value.length(),
				16 );
		}
		optionalShortName = value;
	}

	@Override
	public String getOptionalLabel() {
		return(optionalLabel);
	}

	public void setOptionalLabel( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalLabel",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalLabel = value;
	}

	@Override
	public String getOptionalShortDescription() {
		return(optionalShortDescription);
	}

	public void setOptionalShortDescription( String value ) {
		if( value != null && value.length() > 128 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalShortDescription",
				1,
				"value.length()",
				value.length(),
				128 );
		}
		optionalShortDescription = value;
	}

	@Override
	public String getOptionalDescription() {
		return(optionalDescription);
	}

	public void setOptionalDescription( String value ) {
		if( value != null && value.length() > 1023 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDescription",
				1,
				"value.length()",
				value.length(),
				1023 );
		}
		optionalDescription = value;
	}

	@Override
	public ICFKeyHash256 getRequiredFromColId() {
		return(requiredFromColId);
	}

	public void setRequiredFromColId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredFromColId",
				1,
				"value" );
		}
		requiredFromColId = value;
	}

	@Override
	public ICFKeyHash256 getRequiredToColId() {
		return(requiredToColId);
	}

	public void setRequiredToColId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredToColId",
				1,
				"value" );
		}
		requiredToColId = value;
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
		else if( obj instanceof IBusModelPubRelationCol rhs ) {
			if( ! getCreatedByUserId().equals( rhs.getCreatedByUserId() ) ) {
				return( false );
			}
			if( ! getCreatedAt().equals( rhs.getCreatedAt() ) ) {
				return( false );
			}
			if( ! getUpdatedByUserId().equals( rhs.getUpdatedByUserId() ) ) {
				return( false );
			}
			if( ! getUpdatedAt().equals( rhs.getUpdatedAt() ) ) {
				return( false );
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
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					if( ! getOptionalShortName().equals( rhs.getOptionalShortName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( false );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					if( ! getOptionalLabel().equals( rhs.getOptionalLabel() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( false );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					if( ! getOptionalShortDescription().equals( rhs.getOptionalShortDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getRequiredFromColId() != null ) {
				if( rhs.getRequiredFromColId() != null ) {
					if( ! getRequiredFromColId().equals( rhs.getRequiredFromColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredFromColId() != null ) {
					return( false );
				}
			}
			if( getRequiredToColId() != null ) {
				if( rhs.getRequiredToColId() != null ) {
					if( ! getRequiredToColId().equals( rhs.getRequiredToColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToColId() != null ) {
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
		else if( obj instanceof IBusModelPubRelationColH rhs ) {
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
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					if( ! getOptionalShortName().equals( rhs.getOptionalShortName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( false );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					if( ! getOptionalLabel().equals( rhs.getOptionalLabel() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( false );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					if( ! getOptionalShortDescription().equals( rhs.getOptionalShortDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getRequiredFromColId() != null ) {
				if( rhs.getRequiredFromColId() != null ) {
					if( ! getRequiredFromColId().equals( rhs.getRequiredFromColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredFromColId() != null ) {
					return( false );
				}
			}
			if( getRequiredToColId() != null ) {
				if( rhs.getRequiredToColId() != null ) {
					if( ! getRequiredToColId().equals( rhs.getRequiredToColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToColId() != null ) {
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
		else if( obj instanceof IBusModelPubRelationColHPKey ) {
			IBusModelPubRelationColHPKey rhs = (IBusModelPubRelationColHPKey)obj;
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
		else if( obj instanceof IBusModelPubRelationColByUNameIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelationIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByDefSchemaIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByFromColIdxKey rhs ) {
			if( getRequiredFromColId() != null ) {
				if( rhs.getRequiredFromColId() != null ) {
					if( ! getRequiredFromColId().equals( rhs.getRequiredFromColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredFromColId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubRelationColByToColIdxKey rhs ) {
			if( getRequiredToColId() != null ) {
				if( rhs.getRequiredToColId() != null ) {
					if( ! getRequiredToColId().equals( rhs.getRequiredToColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToColId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubRelationColByPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByNextIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelNextIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationCol rhs ) {
			if( ! getCreatedByUserId().equals( rhs.getCreatedByUserId() ) ) {
				return( false );
			}
			if( ! getCreatedAt().equals( rhs.getCreatedAt() ) ) {
				return( false );
			}
			if( ! getUpdatedByUserId().equals( rhs.getUpdatedByUserId() ) ) {
				return( false );
			}
			if( ! getUpdatedAt().equals( rhs.getUpdatedAt() ) ) {
				return( false );
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
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					if( ! getOptionalShortName().equals( rhs.getOptionalShortName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( false );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					if( ! getOptionalLabel().equals( rhs.getOptionalLabel() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( false );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					if( ! getOptionalShortDescription().equals( rhs.getOptionalShortDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getRequiredFromColId() != null ) {
				if( rhs.getRequiredFromColId() != null ) {
					if( ! getRequiredFromColId().equals( rhs.getRequiredFromColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredFromColId() != null ) {
					return( false );
				}
			}
			if( getRequiredToColId() != null ) {
				if( rhs.getRequiredToColId() != null ) {
					if( ! getRequiredToColId().equals( rhs.getRequiredToColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToColId() != null ) {
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
		else if( obj instanceof IBusModelPubRelationColH rhs ) {
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
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					if( ! getOptionalShortName().equals( rhs.getOptionalShortName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( false );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					if( ! getOptionalLabel().equals( rhs.getOptionalLabel() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( false );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					if( ! getOptionalShortDescription().equals( rhs.getOptionalShortDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getRequiredFromColId() != null ) {
				if( rhs.getRequiredFromColId() != null ) {
					if( ! getRequiredFromColId().equals( rhs.getRequiredFromColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredFromColId() != null ) {
					return( false );
				}
			}
			if( getRequiredToColId() != null ) {
				if( rhs.getRequiredToColId() != null ) {
					if( ! getRequiredToColId().equals( rhs.getRequiredToColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToColId() != null ) {
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
		else if( obj instanceof IBusModelPubRelationColHPKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByUNameIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelationIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByDefSchemaIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByFromColIdxKey rhs ) {
			if( getRequiredFromColId() != null ) {
				if( rhs.getRequiredFromColId() != null ) {
					if( ! getRequiredFromColId().equals( rhs.getRequiredFromColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredFromColId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubRelationColByToColIdxKey rhs ) {
			if( getRequiredToColId() != null ) {
				if( rhs.getRequiredToColId() != null ) {
					if( ! getRequiredToColId().equals( rhs.getRequiredToColId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredToColId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubRelationColByPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByNextIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelNextIdxKey rhs ) {
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
			return( false );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getCreatedByUserId().hashCode();
		hashCode = hashCode + getCreatedAt().hashCode();
		hashCode = hashCode + getUpdatedByUserId().hashCode();
		hashCode = hashCode + getUpdatedAt().hashCode();
		hashCode = hashCode + getRequiredRelationId().hashCode();
		hashCode = hashCode + getRequiredId().hashCode();
		if( getOptionalDefSchemaId() != null ) {
			hashCode = hashCode + getOptionalDefSchemaId().hashCode();
		}
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalShortName() != null ) {
			hashCode = hashCode + getOptionalShortName().hashCode();
		}
		if( getOptionalLabel() != null ) {
			hashCode = hashCode + getOptionalLabel().hashCode();
		}
		if( getOptionalShortDescription() != null ) {
			hashCode = hashCode + getOptionalShortDescription().hashCode();
		}
		if( getOptionalDescription() != null ) {
			hashCode = hashCode + getOptionalDescription().hashCode();
		}
		hashCode = hashCode + getRequiredFromColId().hashCode();
		hashCode = hashCode + getRequiredToColId().hashCode();
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
		else if( obj instanceof IBusModelPubRelationCol rhs ) {
			cmp = 0;
			{
				cmp = getCreatedByUserId().compareTo( rhs.getCreatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getCreatedAt().compareTo( rhs.getCreatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedByUserId().compareTo( rhs.getUpdatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedAt().compareTo( rhs.getUpdatedAt() );
				if( cmp != 0 ) {
					return( cmp );
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
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					cmp = getOptionalShortName().compareTo( rhs.getOptionalShortName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					cmp = getOptionalLabel().compareTo( rhs.getOptionalLabel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( -1 );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					cmp = getOptionalShortDescription().compareTo( rhs.getOptionalShortDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if (getRequiredFromColId() != null) {
				if (rhs.getRequiredFromColId() != null) {
					cmp = getRequiredFromColId().compareTo( rhs.getRequiredFromColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredFromColId() != null) {
				return( -1 );
			}
			if (getRequiredToColId() != null) {
				if (rhs.getRequiredToColId() != null) {
					cmp = getRequiredToColId().compareTo( rhs.getRequiredToColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToColId() != null) {
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
		else if( obj instanceof IBusModelPubRelationColHPKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColH rhs ) {
			cmp = 0;
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
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					cmp = getOptionalShortName().compareTo( rhs.getOptionalShortName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					cmp = getOptionalLabel().compareTo( rhs.getOptionalLabel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( -1 );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					cmp = getOptionalShortDescription().compareTo( rhs.getOptionalShortDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if (getRequiredFromColId() != null) {
				if (rhs.getRequiredFromColId() != null) {
					cmp = getRequiredFromColId().compareTo( rhs.getRequiredFromColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredFromColId() != null) {
				return( -1 );
			}
			if (getRequiredToColId() != null) {
				if (rhs.getRequiredToColId() != null) {
					cmp = getRequiredToColId().compareTo( rhs.getRequiredToColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToColId() != null) {
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
		else if( obj instanceof IBusModelPubRelationColByUNameIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelationIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByDefSchemaIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByFromColIdxKey rhs ) {
			if (getRequiredFromColId() != null) {
				if (rhs.getRequiredFromColId() != null) {
					cmp = getRequiredFromColId().compareTo( rhs.getRequiredFromColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredFromColId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubRelationColByToColIdxKey rhs ) {
			if (getRequiredToColId() != null) {
				if (rhs.getRequiredToColId() != null) {
					cmp = getRequiredToColId().compareTo( rhs.getRequiredToColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToColId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubRelationColByPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByNextIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelNextIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationCol rhs ) {
			cmp = 0;
			{
				cmp = getCreatedByUserId().compareTo( rhs.getCreatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getCreatedAt().compareTo( rhs.getCreatedAt() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedByUserId().compareTo( rhs.getUpdatedByUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}

				cmp = getUpdatedAt().compareTo( rhs.getUpdatedAt() );
				if( cmp != 0 ) {
					return( cmp );
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
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					cmp = getOptionalShortName().compareTo( rhs.getOptionalShortName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					cmp = getOptionalLabel().compareTo( rhs.getOptionalLabel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( -1 );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					cmp = getOptionalShortDescription().compareTo( rhs.getOptionalShortDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if (getRequiredFromColId() != null) {
				if (rhs.getRequiredFromColId() != null) {
					cmp = getRequiredFromColId().compareTo( rhs.getRequiredFromColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredFromColId() != null) {
				return( -1 );
			}
			if (getRequiredToColId() != null) {
				if (rhs.getRequiredToColId() != null) {
					cmp = getRequiredToColId().compareTo( rhs.getRequiredToColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToColId() != null) {
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
		else if( obj instanceof IBusModelPubRelationColHPKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColH rhs ) {
			cmp = 0;
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
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					cmp = getOptionalShortName().compareTo( rhs.getOptionalShortName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					cmp = getOptionalLabel().compareTo( rhs.getOptionalLabel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( -1 );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					cmp = getOptionalShortDescription().compareTo( rhs.getOptionalShortDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if (getRequiredFromColId() != null) {
				if (rhs.getRequiredFromColId() != null) {
					cmp = getRequiredFromColId().compareTo( rhs.getRequiredFromColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredFromColId() != null) {
				return( -1 );
			}
			if (getRequiredToColId() != null) {
				if (rhs.getRequiredToColId() != null) {
					cmp = getRequiredToColId().compareTo( rhs.getRequiredToColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToColId() != null) {
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
		else if( obj instanceof IBusModelPubRelationColByUNameIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelationIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByDefSchemaIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByFromColIdxKey rhs ) {
			if (getRequiredFromColId() != null) {
				if (rhs.getRequiredFromColId() != null) {
					cmp = getRequiredFromColId().compareTo( rhs.getRequiredFromColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredFromColId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubRelationColByToColIdxKey rhs ) {
			if (getRequiredToColId() != null) {
				if (rhs.getRequiredToColId() != null) {
					cmp = getRequiredToColId().compareTo( rhs.getRequiredToColId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredToColId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubRelationColByPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByNextIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelPrevIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubRelationColByRelNextIdxKey rhs ) {
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
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	@Override
	public void set( IBusModelPubRelationCol src ) {
		setJustPubRelationCol( src );
	}

	@Override
	public void setRelationCol( IBusModelPubRelationCol src ) {
		setJustPubRequiredId(src.getRequiredId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubCreatedByUserId( src.getCreatedByUserId() );
		setJustPubCreatedAt( src.getCreatedAt() );
		setJustPubUpdatedByUserId( src.getUpdatedByUserId() );
		setJustPubUpdatedAt( src.getUpdatedAt() );
		setJustPubRequiredContainerRelation(src.getRequiredContainerRelation());
		setJustPubOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setJustPubOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustPubOptionalLookupNext(src.getOptionalLookupNext());
		setJustPubRequiredLookupFromCol(src.getRequiredLookupFromCol());
		setJustPubRequiredLookupToCol(src.getRequiredLookupToCol());
		setJustPubRequiredRelationId(src.getRequiredRelationId());
		setJustPubOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalShortName(src.getOptionalShortName());
		setJustPubOptionalLabel(src.getOptionalLabel());
		setJustPubOptionalShortDescription(src.getOptionalShortDescription());
		setJustPubOptionalDescription(src.getOptionalDescription());
		setJustPubRequiredFromColId(src.getRequiredFromColId());
		setJustPubRequiredToColId(src.getRequiredToColId());
		setJustPubOptionalPrevId(src.getOptionalPrevId());
		setJustPubOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelPubRelationColH src ) {
		setJustPubRelationCol( src );
	}

	@Override
	public void setRelationCol( IBusModelPubRelationColH src ) {
		setJustPubRequiredId(src.getRequiredId());
		setJustPubRequiredContainerRelation(src.getRequiredContainerRelation());
		setJustPubOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setJustPubOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustPubOptionalLookupNext(src.getOptionalLookupNext());
		setJustPubRequiredLookupFromCol(src.getRequiredLookupFromCol());
		setJustPubRequiredLookupToCol(src.getRequiredLookupToCol());
		setJustPubRequiredRelationId(src.getRequiredRelationId());
		setJustPubOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalShortName(src.getOptionalShortName());
		setJustPubOptionalLabel(src.getOptionalLabel());
		setJustPubOptionalShortDescription(src.getOptionalShortDescription());
		setJustPubOptionalDescription(src.getOptionalDescription());
		setJustPubRequiredFromColId(src.getRequiredFromColId());
		setJustPubRequiredToColId(src.getRequiredToColId());
		setJustPubOptionalPrevId(src.getOptionalPrevId());
		setJustPubOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelPubRelationCol src ) {
		setJustPubRelationCol( src );
	}

	@Override
	public void setRelationCol( IBusModelPubRelationCol src ) {
		setJustPubRequiredId(src.getRequiredId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubCreatedByUserId( src.getCreatedByUserId() );
		setJustPubCreatedAt( src.getCreatedAt() );
		setJustPubUpdatedByUserId( src.getUpdatedByUserId() );
		setJustPubUpdatedAt( src.getUpdatedAt() );
		setJustPubRequiredContainerRelation(src.getRequiredContainerRelation());
		setJustPubOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setJustPubOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustPubOptionalLookupNext(src.getOptionalLookupNext());
		setJustPubRequiredLookupFromCol(src.getRequiredLookupFromCol());
		setJustPubRequiredLookupToCol(src.getRequiredLookupToCol());
		setJustPubRequiredRelationId(src.getRequiredRelationId());
		setJustPubOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalShortName(src.getOptionalShortName());
		setJustPubOptionalLabel(src.getOptionalLabel());
		setJustPubOptionalShortDescription(src.getOptionalShortDescription());
		setJustPubOptionalDescription(src.getOptionalDescription());
		setJustPubRequiredFromColId(src.getRequiredFromColId());
		setJustPubRequiredToColId(src.getRequiredToColId());
		setJustPubOptionalPrevId(src.getOptionalPrevId());
		setJustPubOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelPubRelationColH src ) {
		setJustPubRelationCol( src );
	}

	@Override
	public void setRelationCol( IBusModelPubRelationColH src ) {
		setJustPubRequiredId(src.getRequiredId());
		setJustPubRequiredContainerRelation(src.getRequiredContainerRelation());
		setJustPubOptionalLookupDefSchema(src.getOptionalLookupDefSchema());
		setJustPubOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustPubOptionalLookupNext(src.getOptionalLookupNext());
		setJustPubRequiredLookupFromCol(src.getRequiredLookupFromCol());
		setJustPubRequiredLookupToCol(src.getRequiredLookupToCol());
		setJustPubRequiredRelationId(src.getRequiredRelationId());
		setJustPubOptionalDefSchemaId(src.getOptionalDefSchemaId());
		setJustPubRequiredName(src.getRequiredName());
		setJustPubOptionalShortName(src.getOptionalShortName());
		setJustPubOptionalLabel(src.getOptionalLabel());
		setJustPubOptionalShortDescription(src.getOptionalShortDescription());
		setJustPubOptionalDescription(src.getOptionalDescription());
		setJustPubRequiredFromColId(src.getRequiredFromColId());
		setJustPubRequiredToColId(src.getRequiredToColId());
		setJustPubOptionalPrevId(src.getOptionalPrevId());
		setJustPubOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + getRequiredRelationId().toString() + "\"" + "\"" + getRequiredId().toString() + "\"" + ( ( getOptionalDefSchemaId() == null ) ? "null" : "\"" + getOptionalDefSchemaId().toString() + "\"" ) + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"" + ( ( getOptionalShortName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalShortName() ) + "\"" ) + ( ( getOptionalLabel() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalLabel() ) + "\"" ) + ( ( getOptionalShortDescription() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalShortDescription() ) + "\"" ) + ( ( getOptionalDescription() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDescription() ) + "\"" ) + "\"" + getRequiredFromColId().toString() + "\"" + "\"" + getRequiredToColId().toString() + "\"" + ( ( getOptionalPrevId() == null ) ? "null" : "\"" + getOptionalPrevId().toString() + "\"" ) + ( ( getOptionalNextId() == null ) ? "null" : "\"" + getOptionalNextId().toString() + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelPubBuffRelationCol" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
