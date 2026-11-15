// Description: Java 17 implJustPubementation of a TextType buffer

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

public class BusModelPubBuffTextType
	extends BusModelPubBuffTextDef
	implements IBusModelTextType
{
	protected ICFKeyHash256 requiredSchemaDefId;

	public BusModelPubBuffTextType() {
		super();
		requiredSchemaDefId = CFDbKeyHash256.fromHex( IBusModelPubTextType.SCHEMADEFID_INIT_VALUE.toString() );
	}

	@Override
	public int getClassCode() {
		return( IBusModelPubTextType.CLASS_CODE );
	}

	@Override
	public IBusModelPubSchemaDef getRequiredContainerSchemaDef(ICFKeyHash256 argSchemaDefId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSchemaDef", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubSchemaDefTable targetTable = targetBackingBusModel.getTableSchemaDef();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerSchemaDef", 0, "IBusModelPubSchema.getBackingBusModel().getTableSchemaDef()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredSchemaDefId()));
	}

	@Override
	public void setRequiredContainerScope(ICFKeyHash256 argSchemaDefId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSchemaDef-args", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelPubScopeTable targetTable = targetBackingBusModel.getTableScope();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope", 0, "IBusModelSchema.getBackingBusModel().getTableScope()");
		}
		IBusModelPubScope found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSchemaDefId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope-args", 0, "found");
		}
		else if (found instanceof IBusModelPubSchemaDef) || (found instanceof IBusModelPubSchemaDef)) {
			super.setRequiredContainerScope(argSchemaDefId);
		requiredSchemaDefId = argSchemaDefId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerScope-args", "found", found, "IBusModelPubSchemaDefIBusModelPubSchemaDef");
		}
	}
$reimplJustPubSchemaPubBuffTableNarrowedPubRelationSetter$
	@Override
	public void setRequiredContainerSchemaDef(ICFKeyHash256 argSchemaDefId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerSchemaDef-args", 0, "IBusModelSchema.getBackingBusModel()");
		}
		IBusModelPubScopeTable targetTable = targetBackingBusModel.getTableScope();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope", 0, "IBusModelSchema.getBackingBusModel().getTableScope()");
		}
		IBusModelPubScope found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSchemaDefId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerScope-args", 0, "found");
		}
		else if (found instanceof IBusModelPubSchemaDef) || (found instanceof IBusModelPubSchemaDef)) {
			super.setRequiredContainerScope(argSchemaDefId);
		requiredSchemaDefId = argSchemaDefId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerScope-args", "found", found, "IBusModelPubSchemaDefIBusModelPubSchemaDef");
		}
	}

	@Override
	public void setRequiredContainerSchemaDef(IBusModelPubSchemaDef argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerSchemaDef", 1, "argObj");
		}
		else {
			setRequiredSchemaDefId(argObj.getRequiredId());
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
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IBusModelPubTextType rhs ) {
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
			return( true );
		}
		else if( obj instanceof IBusModelPubTextTypeH rhs ) {
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
			return( true );
		}
		else if( obj instanceof IBusModelPubValueHPKey ) {
			IBusModelPubValueHPKey rhs = (IBusModelPubValueHPKey)obj;
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
		else if( obj instanceof IBusModelPubTextTypeBySchemaIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubTextType rhs ) {
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
			return( true );
		}
		else if( obj instanceof IBusModelPubTextTypeH rhs ) {
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
		else if( obj instanceof IBusModelPubTextTypeBySchemaIdxKey rhs ) {
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
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredSchemaDefId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IBusModelPubTextType rhs ) {
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
		else if( obj instanceof IBusModelPubTextTypeH rhs ) {
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
			return( 0 );
		}
		else if( obj instanceof IBusModelPubTextTypeBySchemaIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubTextType rhs ) {
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
		else if( obj instanceof IBusModelPubTextTypeH rhs ) {
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
			return( 0 );
		}
		else if( obj instanceof IBusModelPubTextTypeBySchemaIdxKey rhs ) {
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
		else {
			cmp = super.compareTo( obj );
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelPubValue src ) {
		if( src instanceof BusModelPubBuffTextType ) {
			setJustPubTextType( (BusModelPubBuffTextType)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubBuffTextType" );
		}
	}

	@Override
	public void setTextType( IBusModelPubTextType src ) {
		super.setTextDef( src );
		setJustPubRequiredContainerSchemaDef(src.getRequiredContainerSchemaDef());
		setJustPubRequiredSchemaDefId(src.getRequiredSchemaDefId());
	}

	@Override
	public void set( IBusModelPubValueH src ) {
		if( src instanceof IBusModelPubTextTypeH ) {
			setTextType( (IBusModelPubTextTypeH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubTextTypeH" );
		}
	}

	@Override
	public void setTextType( IBusModelPubTextTypeH src ) {
		super.setTextDef( src );
		setJustPubRequiredContainerSchemaDef(src.getRequiredContainerSchemaDef());
		setJustPubRequiredSchemaDefId(src.getRequiredSchemaDefId());
	}

	@Override
	public void set( IBusModelPubValue src ) {
		if( src instanceof BusModelPubPubBuffTextType ) {
			setJustPubTextType( (BusModelPubPubBuffTextType)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubPubBuffTextType" );
		}
	}

	@Override
	public void setTextType( IBusModelPubTextType src ) {
		super.setTextDef( src );
		setJustPubRequiredContainerSchemaDef(src.getRequiredContainerSchemaDef());
		setJustPubRequiredSchemaDefId(src.getRequiredSchemaDefId());
	}

	@Override
	public void set( IBusModelPubValueH src ) {
		if( src instanceof IBusModelPubTextTypeH ) {
			setTextType( (IBusModelPubTextTypeH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubTextTypeH" );
		}
	}

	@Override
	public void setTextType( IBusModelPubTextTypeH src ) {
		super.setTextDef( src );
		setJustPubRequiredContainerSchemaDef(src.getRequiredContainerSchemaDef());
		setJustPubRequiredSchemaDefId(src.getRequiredSchemaDefId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment()  + "\"" + getRequiredId().toString() + "\"" + "\"" + getRequiredSchemaDefId().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelPubBuffTextType" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
