// Description: Java 17 implJustPubementation of a ServerObjFunc buffer

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
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

public class BusModelPubBuffServerObjFunc
	extends BusModelPubBuffServerMethod
	implements IBusModelServerObjFunc
{
	protected ICFKeyHash256 optionalRetTableId;

	public BusModelPubBuffServerObjFunc() {
		super();
		optionalRetTableId = CFDbKeyHash256.nullGet();
	}

	@Override
	public int getClassCode() {
		return( IBusModelPubServerObjFunc.CLASS_CODE );
	}

	@Override
	public IBusModelPubTable getOptionalLookupRetTable(ICFKeyHash256 argRetTableId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupRetTable", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubTableTable targetTable = targetBackingBusModel.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupRetTable", 0, "IBusModelPubSchema.getBackingBusModel().getTableTable()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalRetTableId()));
	}

	@Override
	public void setOptionalLookupRetTable(ICFKeyHash256 argRetTableId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupRetTable-args", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubTableTable targetTable = targetBackingBusModel.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupRetTable", 0, "IBusModelSchema.getBackingBusModel().getTableTable()");
		}
		IBusModelPubTable found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argRetTableId);
		if (found == null || (found != null && ((found instanceof IBusModelPubTable) || (found instanceof IBusModelPubTable)))) {
			super.setOptionalLookupRetTable(argRetTableId);
		optionalRetTableId = argRetTableId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupRetTable-args", "found", found, "IBusModelPubTableIBusModelPubTable");
		}
	}

	@Override
	public void setOptionalLookupRetTable(IBusModelPubTable argObj) {

		if(argObj == null) {
			setJustPubOptionalRetTableId(null);
		}
		else {
			setOptionalRetTableId(argObj.getRequiredId());
		}
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
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IBusModelPubServerObjFunc rhs ) {
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
		else if( obj instanceof IBusModelPubServerObjFuncH rhs ) {
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
		else if( obj instanceof IBusModelPubScopeHPKey ) {
			IBusModelPubScopeHPKey rhs = (IBusModelPubScopeHPKey)obj;
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
		else if( obj instanceof IBusModelPubServerObjFuncByRetTblIdxKey rhs ) {
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
		else if( obj instanceof IBusModelPubServerObjFunc rhs ) {
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
		else if( obj instanceof IBusModelPubServerObjFuncH rhs ) {
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
		else if( obj instanceof IBusModelPubServerObjFuncByRetTblIdxKey rhs ) {
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
			boolean retval = super.equals( obj );
			return( retval );
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
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IBusModelPubServerObjFunc rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelPubServerObjFuncH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelPubServerObjFuncByRetTblIdxKey rhs ) {
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
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubServerObjFunc rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelPubServerObjFuncH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
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
		else if( obj instanceof IBusModelPubServerObjFuncByRetTblIdxKey rhs ) {
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
			}			return( 0 );
		}
		else {
			cmp = super.compareTo( obj );
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelPubScope src ) {
		if( src instanceof BusModelPubBuffServerObjFunc ) {
			setJustPubServerObjFunc( (BusModelPubBuffServerObjFunc)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubBuffServerObjFunc" );
		}
	}

	@Override
	public void setServerObjFunc( IBusModelPubServerObjFunc src ) {
		super.setServerMethod( src );
		setJustPubOptionalLookupRetTable(src.getOptionalLookupRetTable());
		setJustPubOptionalRetTableId(src.getOptionalRetTableId());
	}

	@Override
	public void set( IBusModelPubScopeH src ) {
		if( src instanceof IBusModelPubServerObjFuncH ) {
			setServerObjFunc( (IBusModelPubServerObjFuncH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubServerObjFuncH" );
		}
	}

	@Override
	public void setServerObjFunc( IBusModelPubServerObjFuncH src ) {
		super.setServerMethod( src );
		setJustPubOptionalLookupRetTable(src.getOptionalLookupRetTable());
		setJustPubOptionalRetTableId(src.getOptionalRetTableId());
	}

	@Override
	public void set( IBusModelPubScope src ) {
		if( src instanceof BusModelPubPubBuffServerObjFunc ) {
			setJustPubServerObjFunc( (BusModelPubPubBuffServerObjFunc)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubPubBuffServerObjFunc" );
		}
	}

	@Override
	public void setServerObjFunc( IBusModelPubServerObjFunc src ) {
		super.setServerMethod( src );
		setJustPubOptionalLookupRetTable(src.getOptionalLookupRetTable());
		setJustPubOptionalRetTableId(src.getOptionalRetTableId());
	}

	@Override
	public void set( IBusModelPubScopeH src ) {
		if( src instanceof IBusModelPubServerObjFuncH ) {
			setServerObjFunc( (IBusModelPubServerObjFuncH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubServerObjFuncH" );
		}
	}

	@Override
	public void setServerObjFunc( IBusModelPubServerObjFuncH src ) {
		super.setServerMethod( src );
		setJustPubOptionalLookupRetTable(src.getOptionalLookupRetTable());
		setJustPubOptionalRetTableId(src.getOptionalRetTableId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment()  + "\"" + getRequiredId().toString() + "\"" + ( ( getOptionalRetTableId() == null ) ? "null" : "\"" + getOptionalRetTableId().toString() + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelPubBuffServerObjFunc" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
