// Description: Java 17 implJustPubementation of a ClearSubDep1 buffer

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

public class BusModelPubBuffClearSubDep1
	extends BusModelPubBuffClearDep
	implements IBusModelClearSubDep1
{
	protected ICFKeyHash256 requiredClearTopDepId;
	protected String requiredName;

	public BusModelPubBuffClearSubDep1() {
		super();
		requiredClearTopDepId = CFDbKeyHash256.fromHex( IBusModelPubClearSubDep1.CLEARTOPDEPID_INIT_VALUE.toString() );
		requiredName = IBusModelPubClearSubDep1.NAME_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( IBusModelPubClearSubDep1.CLASS_CODE );
	}

	@Override
	public IBusModelPubClearTopDep getRequiredContainerClearTopDep(ICFKeyHash256 argClearTopDepId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerClearTopDep", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubClearTopDepTable targetTable = targetBackingBusModel.getTableClearTopDep();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerClearTopDep", 0, "IBusModelPubSchema.getBackingBusModel().getTableClearTopDep()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClearTopDepId()));
	}

	@Override
	public void setRequiredContainerClearTopDep(ICFKeyHash256 argClearTopDepId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearTopDep-args", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubClearTopDepTable targetTable = targetBackingBusModel.getTableClearTopDep();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearTopDep", 0, "IBusModelSchema.getBackingBusModel().getTableClearTopDep()");
		}
		IBusModelPubClearTopDep found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argClearTopDepId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerClearTopDep-args", 0, "found");
		}
		else if (found instanceof IBusModelPubClearTopDep) || (found instanceof IBusModelPubClearTopDep)) {
			super.setRequiredContainerClearTopDep(argClearTopDepId);
		requiredClearTopDepId = argClearTopDepId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerClearTopDep-args", "found", found, "IBusModelPubClearTopDepIBusModelPubClearTopDep");
		}
	}

	@Override
	public void setRequiredContainerClearTopDep(IBusModelPubClearTopDep argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerClearTopDep", 1, "argObj");
		}
		else {
			setRequiredClearTopDepId(argObj.getRequiredId());
		}
	}

	@Override
	public List<IBusModelPubClearSubDep2> getOptionalComponentsClearDep(ICFKeyHash256 argId) {
		IBusModelPubSchema targetBackingBusModel = IBusModelPubSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsClearDep", 0, "IBusModelPubSchema.getBackingBusModel()");
		}
		IBusModelPubClearSubDep2Table targetTable = targetBackingBusModel.getTableClearSubDep2();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsClearDep", 0, "IBusModelPubSchema.getBackingBusModel().getTableClearSubDep2()");
		}
		IBusModelPubClearSubDep2[] targetArr = targetTable.readDerivedByClearSubDep1Idx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredId());
		if( targetArr != null ) {
			List<IBusModelPubClearSubDep2> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return(results);
		}
		else {
			List<IBusModelPubClearSubDep2> results = new ArrayList<>();
			return(results);
		}
	}

	@Override
	public ICFKeyHash256 getRequiredClearTopDepId() {
		return(requiredClearTopDepId);
	}

	public void setRequiredClearTopDepId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredClearTopDepId",
				1,
				"value" );
		}
		requiredClearTopDepId = value;
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
		else if( obj instanceof IBusModelPubClearSubDep1 rhs ) {
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
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep1H rhs ) {
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
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep1ByClearTopDepIdxKey rhs ) {
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubClearSubDep1ByUNameIdxKey rhs ) {
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep1 rhs ) {
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
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep1H rhs ) {
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
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
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
		else if( obj instanceof IBusModelPubClearSubDep1ByClearTopDepIdxKey rhs ) {
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubClearSubDep1ByUNameIdxKey rhs ) {
			if( getRequiredClearTopDepId() != null ) {
				if( rhs.getRequiredClearTopDepId() != null ) {
					if( ! getRequiredClearTopDepId().equals( rhs.getRequiredClearTopDepId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClearTopDepId() != null ) {
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
		hashCode = hashCode + getRequiredClearTopDepId().hashCode();
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
		else if( obj instanceof IBusModelPubClearSubDep1 rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep1H rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep1ByClearTopDepIdxKey rhs ) {
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearSubDep1ByUNameIdxKey rhs ) {
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep1 rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep1H rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
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
		else if( obj instanceof IBusModelPubClearSubDep1ByClearTopDepIdxKey rhs ) {
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearSubDep1ByUNameIdxKey rhs ) {
			if (getRequiredClearTopDepId() != null) {
				if (rhs.getRequiredClearTopDepId() != null) {
					cmp = getRequiredClearTopDepId().compareTo( rhs.getRequiredClearTopDepId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClearTopDepId() != null) {
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
		if( src instanceof BusModelPubBuffClearSubDep1 ) {
			setJustPubClearSubDep1( (BusModelPubBuffClearSubDep1)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubBuffClearSubDep1" );
		}
	}

	@Override
	public void setClearSubDep1( IBusModelPubClearSubDep1 src ) {
		super.setClearDep( src );
		setJustPubRequiredContainerClearTopDep(src.getRequiredContainerClearTopDep());
		setJustPubRequiredClearTopDepId(src.getRequiredClearTopDepId());
		setJustPubRequiredName(src.getRequiredName());
	}

	@Override
	public void set( IBusModelPubScopeH src ) {
		if( src instanceof IBusModelPubClearSubDep1H ) {
			setClearSubDep1( (IBusModelPubClearSubDep1H)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubClearSubDep1H" );
		}
	}

	@Override
	public void setClearSubDep1( IBusModelPubClearSubDep1H src ) {
		super.setClearDep( src );
		setJustPubRequiredContainerClearTopDep(src.getRequiredContainerClearTopDep());
		setJustPubRequiredClearTopDepId(src.getRequiredClearTopDepId());
		setJustPubRequiredName(src.getRequiredName());
	}

	@Override
	public void set( IBusModelPubScope src ) {
		if( src instanceof BusModelPubPubBuffClearSubDep1 ) {
			setJustPubClearSubDep1( (BusModelPubPubBuffClearSubDep1)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubPubBuffClearSubDep1" );
		}
	}

	@Override
	public void setClearSubDep1( IBusModelPubClearSubDep1 src ) {
		super.setClearDep( src );
		setJustPubRequiredContainerClearTopDep(src.getRequiredContainerClearTopDep());
		setJustPubRequiredClearTopDepId(src.getRequiredClearTopDepId());
		setJustPubRequiredName(src.getRequiredName());
	}

	@Override
	public void set( IBusModelPubScopeH src ) {
		if( src instanceof IBusModelPubClearSubDep1H ) {
			setClearSubDep1( (IBusModelPubClearSubDep1H)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubClearSubDep1H" );
		}
	}

	@Override
	public void setClearSubDep1( IBusModelPubClearSubDep1H src ) {
		super.setClearDep( src );
		setJustPubRequiredContainerClearTopDep(src.getRequiredContainerClearTopDep());
		setJustPubRequiredClearTopDepId(src.getRequiredClearTopDepId());
		setJustPubRequiredName(src.getRequiredName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment()  + "\"" + getRequiredId().toString() + "\"" + "\"" + getRequiredClearTopDepId().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelPubBuffClearSubDep1" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
