// Description: Java 17 implJustPubementation of a SysCluster buffer

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

package server.markhome.ycf.v3_1.secure.secure.buff;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;

public class SecurePubBuffSysCluster
	implements ISecurePubSysCluster, Comparable<Object>, Serializable
{
	protected int requiredSingletonId;
	protected int requiredRevision;
	protected ICFKeyHash256 requiredClusterId;

	public BusModelPubBuffSysCluster() {
		requiredSingletonId = ISecurePubSysCluster.SINGLETONID_INIT_VALUE;
		requiredClusterId = CFDbKeyHash256.fromHex( ISecurePubSysCluster.CLUSTERID_INIT_VALUE.toString() );
	}

	@Override
	public Integer getPKey() {
		return (requiredSingletonId);
	}

	@Override
	public void setPKey(Integer requiredSingletonId) {
		if(requiredSingletonId != null) {
			this.requiredSingletonId = requiredSingletonId;
		}
	}

	@Override
	public int getRequiredSingletonId() {
		return(requiredSingletonId);
	}

	@Override
	public void setRequiredSingletonId( int value ) {
		if( value < ISecurePubSysCluster.SINGLETONID_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				ISecurePubSysCluster.SINGLETONID_MIN_VALUE );
		}
		if( value > ISecureSysCluster.SINGLETONID_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				ISecureSysCluster.SINGLETONID_MAX_VALUE );
		}
		requiredSingletonId = value;
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
		return( ISecurePubSysCluster.CLASS_CODE );
	}

	@Override
	public ISecurePubCluster getRequiredContainerCluster(ICFKeyHash256 argClusterId) {
		ISecurePubSchema targetBackingSecure = ISecurePubSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCluster", 0, "ISecurePubSchema.getBackingSecure()");
		}
		ISecurePubClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerCluster", 0, "ISecurePubSchema.getBackingSecure().getTableCluster()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredClusterId()));
	}

	@Override
	public void setRequiredContainerCluster(ICFKeyHash256 argClusterId) {
		ISecurePubSchema targetBackingSecure = ISecurePubSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCluster-args", 0, "ISecurePubSchema.getBackingSecure()");
		}
		ISecurePubClusterTable targetTable = targetBackingSecure.getTableCluster();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCluster", 0, "ISecureSchema.getBackingSecure().getTableCluster()");
		}
		ISecurePubCluster found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argClusterId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerCluster-args", 0, "found");
		}
		else if (found instanceof ISecurePubCluster) || (found instanceof ISecurePubCluster)) {
			super.setRequiredContainerCluster(argClusterId);
		requiredClusterId = argClusterId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerCluster-args", "found", found, "ISecurePubClusterISecurePubCluster");
		}
	}

	@Override
	public void setRequiredContainerCluster(ISecurePubCluster argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerCluster", 1, "argObj");
		}
		else {
			setRequiredClusterId(argObj.getRequiredId());
		}
	}

	@Override
	public ICFKeyHash256 getRequiredClusterId() {
		return(requiredClusterId);
	}

	public void setRequiredClusterId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredClusterId",
				1,
				"value" );
		}
		requiredClusterId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecurePubSysCluster rhs ) {
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != null ) {
				if( rhs.getRequiredClusterId() != null ) {
					if( ! getRequiredClusterId().equals( rhs.getRequiredClusterId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClusterId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubSysClusterH rhs ) {
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != null ) {
				if( rhs.getRequiredClusterId() != null ) {
					if( ! getRequiredClusterId().equals( rhs.getRequiredClusterId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClusterId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubSysClusterHPKey ) {
			ISecurePubSysClusterHPKey rhs = (ISecurePubSysClusterHPKey)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubSysClusterByClusterIdxKey rhs ) {
			if( getRequiredClusterId() != null ) {
				if( rhs.getRequiredClusterId() != null ) {
					if( ! getRequiredClusterId().equals( rhs.getRequiredClusterId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClusterId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubSysCluster rhs ) {
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != null ) {
				if( rhs.getRequiredClusterId() != null ) {
					if( ! getRequiredClusterId().equals( rhs.getRequiredClusterId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClusterId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubSysClusterH rhs ) {
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != null ) {
				if( rhs.getRequiredClusterId() != null ) {
					if( ! getRequiredClusterId().equals( rhs.getRequiredClusterId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClusterId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubSysClusterHPKey rhs ) {
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubSysClusterByClusterIdxKey rhs ) {
			if( getRequiredClusterId() != null ) {
				if( rhs.getRequiredClusterId() != null ) {
					if( ! getRequiredClusterId().equals( rhs.getRequiredClusterId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredClusterId() != null ) {
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
		hashCode = hashCode + getRequiredSingletonId();
		hashCode = hashCode + getRequiredClusterId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecurePubSysCluster rhs ) {
			cmp = 0;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			if (getRequiredClusterId() != null) {
				if (rhs.getRequiredClusterId() != null) {
					cmp = getRequiredClusterId().compareTo( rhs.getRequiredClusterId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClusterId() != null) {
				return( -1 );
			}
			return( 0 );
 		}
		else if( obj instanceof ISecurePubSysClusterHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubSysClusterH rhs ) {
			cmp = 0;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			if (getRequiredClusterId() != null) {
				if (rhs.getRequiredClusterId() != null) {
					cmp = getRequiredClusterId().compareTo( rhs.getRequiredClusterId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClusterId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubSysClusterByClusterIdxKey rhs ) {
			if (getRequiredClusterId() != null) {
				if (rhs.getRequiredClusterId() != null) {
					cmp = getRequiredClusterId().compareTo( rhs.getRequiredClusterId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClusterId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubSysCluster rhs ) {
			cmp = 0;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			if (getRequiredClusterId() != null) {
				if (rhs.getRequiredClusterId() != null) {
					cmp = getRequiredClusterId().compareTo( rhs.getRequiredClusterId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClusterId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubSysClusterHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubSysClusterH rhs ) {
			cmp = 0;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			if (getRequiredClusterId() != null) {
				if (rhs.getRequiredClusterId() != null) {
					cmp = getRequiredClusterId().compareTo( rhs.getRequiredClusterId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClusterId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubSysClusterByClusterIdxKey rhs ) {
			if (getRequiredClusterId() != null) {
				if (rhs.getRequiredClusterId() != null) {
					cmp = getRequiredClusterId().compareTo( rhs.getRequiredClusterId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredClusterId() != null) {
				return( -1 );
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
	public void set( ISecurePubSysCluster src ) {
		setJustPubSysCluster( src );
	}

	@Override
	public void setSysCluster( ISecurePubSysCluster src ) {
		setJustPubRequiredSingletonId(src.getRequiredSingletonId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubRequiredContainerCluster(src.getRequiredContainerCluster());
		setJustPubRequiredClusterId(src.getRequiredClusterId());
	}

	@Override
	public void set( ISecurePubSysClusterH src ) {
		setJustPubSysCluster( src );
	}

	@Override
	public void setSysCluster( ISecurePubSysClusterH src ) {
		setJustPubRequiredSingletonId(src.getRequiredSingletonId());
		setJustPubRequiredContainerCluster(src.getRequiredContainerCluster());
		setJustPubRequiredClusterId(src.getRequiredClusterId());
	}

	@Override
	public void set( ISecurePubSysCluster src ) {
		setJustPubSysCluster( src );
	}

	@Override
	public void setSysCluster( ISecurePubSysCluster src ) {
		setJustPubRequiredSingletonId(src.getRequiredSingletonId());
		setJustPubRequiredRevision( src.getRequiredRevision() );
		setJustPubRequiredContainerCluster(src.getRequiredContainerCluster());
		setJustPubRequiredClusterId(src.getRequiredClusterId());
	}

	@Override
	public void set( ISecurePubSysClusterH src ) {
		setJustPubSysCluster( src );
	}

	@Override
	public void setSysCluster( ISecurePubSysClusterH src ) {
		setJustPubRequiredSingletonId(src.getRequiredSingletonId());
		setJustPubRequiredContainerCluster(src.getRequiredContainerCluster());
		setJustPubRequiredClusterId(src.getRequiredClusterId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + Integer.toString( getRequiredSingletonId() ) + "\"" + "\"" + getRequiredClusterId().toString() + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecurePubBuffSysCluster" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
