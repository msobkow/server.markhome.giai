// Description: Java 17 implJustPubementation of a ClearSubDep3 buffer

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

public class BusModelPubBuffClearSubDep3
	extends BusModelPubBuffClearDep
	implements IBusModelClearSubDep3
{
	protected ICFKeyHash256 requiredClearSubDep2Id;
	protected String requiredName;

	public BusModelPubBuffClearSubDep3() {
		super();
		requiredClearSubDep2Id = CFDbKeyHash256.fromHex( IBusModelPubClearSubDep3.CLEARSUBDEP2ID_INIT_VALUE.toString() );
		requiredName = IBusModelPubClearSubDep3.NAME_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( IBusModelPubClearSubDep3.CLASS_CODE );
	}

	@Override
	public IBusModelPubClearSubDep2 getRequiredContainerClearSubDep2(ICFKeyHash256 argClearSubDep2Id) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerClearSubDep2", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubClearSubDep2Table targetTable = targetBackingBusModel.getTableClearSubDep2();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerClearSubDep2", 0, "IBusModelPubSchema.getBackingBusModel().getTableClearSubDep2()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClearSubDep2Id()));
	}

	@Override
	public void setRequiredContainerClearSubDep2(ICFKeyHash256 argClearSubDep2Id) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearSubDep2-args", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubClearSubDep2Table targetTable = targetBackingBusModel.getTableClearSubDep2();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearSubDep2", 0, "IBusModelSchema.getBackingBusModel().getTableClearSubDep2()");
		}
		IBusModelPubClearSubDep2 found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argClearSubDep2Id);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearSubDep2-args", 0, "found");
		}
		else if (found instanceof IBusModelPubClearSubDep2) || (found instanceof IBusModelPubClearSubDep2)) {
			super.setRequiredContainerClearSubDep2(argClearSubDep2Id);
		requiredClearSubDep2Id = argClearSubDep2Id;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerClearSubDep2-args", "found", found, "IBusModelPubClearSubDep2IBusModelPubClearSubDep2");
		}
	}

	@Override
	public void setRequiredContainerClearSubDep2(IBusModelPubClearSubDep2 argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerClearSubDep2", 1, "argObj");
		}
		else {
			setRequiredClearSubDep2Id(argObj.getRequiredId());
		}
	}

	@Override
	public ICFKeyHash256 getRequiredClearSubDep2Id() {
		return(requiredClearSubDep2Id);
	}

	public void setRequiredClearSubDep2Id( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredClearSubDep2Id",
				1,
				"value" );
		}
		requiredClearSubDep2Id = value;
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
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IBusModelPubClearSubDep3 rhs ) {
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
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep3H rhs ) {
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
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep3ByClearSubDep2IdxKey rhs ) {
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubClearSubDep3ByUNameIdxKey rhs ) {
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep3 rhs ) {
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
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep3H rhs ) {
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
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep3ByClearSubDep2IdxKey rhs ) {
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubClearSubDep3ByUNameIdxKey rhs ) {
			if( getRequiredClearSubDep2Id() != null ) {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
					if( ! getRequiredClearSubDep2Id().equals( rhs.getRequiredClearSubDep2Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearSubDep2Id() != null ) {
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
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredClearSubDep2Id().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IBusModelPubClearSubDep3 rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep3H rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep3ByClearSubDep2IdxKey rhs ) {
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearSubDep3ByUNameIdxKey rhs ) {
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep3 rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep3H rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep3ByClearSubDep2IdxKey rhs ) {
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearSubDep3ByUNameIdxKey rhs ) {
			if (getRequiredClearSubDep2Id() != null) {
				if (rhs.getRequiredClearSubDep2Id() != null) {
					cmp = getRequiredClearSubDep2Id().compareTo( rhs.getRequiredClearSubDep2Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearSubDep2Id() != null) {
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
		else {
			cmp = super.compareTo( obj );
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelPubScope src ) {
		if( src instanceof BusModelPubBuffClearSubDep3 ) {
			setJustPubClearSubDep3( (BusModelPubBuffClearSubDep3)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubBuffClearSubDep3" );
		}
	}

	@Override
	public void setClearSubDep3( IBusModelPubClearSubDep3 src ) {
		super.setClearDep( src );
		setJustPubRequiredContainerClearSubDep2(src.getRequiredContainerClearSubDep2());
		setJustPubRequiredClearSubDep2Id(src.getRequiredClearSubDep2Id());
		setJustPubRequiredName(src.getRequiredName());
	}

	@Override
	public void set( IBusModelPubScopeH src ) {
		if( src instanceof IBusModelPubClearSubDep3H ) {
			setClearSubDep3( (IBusModelPubClearSubDep3H)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubClearSubDep3H" );
		}
	}

	@Override
	public void setClearSubDep3( IBusModelPubClearSubDep3H src ) {
		super.setClearDep( src );
		setJustPubRequiredContainerClearSubDep2(src.getRequiredContainerClearSubDep2());
		setJustPubRequiredClearSubDep2Id(src.getRequiredClearSubDep2Id());
		setJustPubRequiredName(src.getRequiredName());
	}

	@Override
	public void set( IBusModelPubScope src ) {
		if( src instanceof BusModelPubPubBuffClearSubDep3 ) {
			setJustPubClearSubDep3( (BusModelPubPubBuffClearSubDep3)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubPubBuffClearSubDep3" );
		}
	}

	@Override
	public void setClearSubDep3( IBusModelPubClearSubDep3 src ) {
		super.setClearDep( src );
		setJustPubRequiredContainerClearSubDep2(src.getRequiredContainerClearSubDep2());
		setJustPubRequiredClearSubDep2Id(src.getRequiredClearSubDep2Id());
		setJustPubRequiredName(src.getRequiredName());
	}

	@Override
	public void set( IBusModelPubScopeH src ) {
		if( src instanceof IBusModelPubClearSubDep3H ) {
			setClearSubDep3( (IBusModelPubClearSubDep3H)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubClearSubDep3H" );
		}
	}

	@Override
	public void setClearSubDep3( IBusModelPubClearSubDep3H src ) {
		super.setClearDep( src );
		setJustPubRequiredContainerClearSubDep2(src.getRequiredContainerClearSubDep2());
		setJustPubRequiredClearSubDep2Id(src.getRequiredClearSubDep2Id());
		setJustPubRequiredName(src.getRequiredName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment()  + "\"" + getRequiredId().toString() + "\"" + "\"" + getRequiredClearSubDep2Id().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelPubBuffClearSubDep3" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
