
// Description: Java 25 Factory service implementation for SecTentRoleMemb buffers

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
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;

/*
 *	Java 25 Factory service implementation for SecTentRoleMemb buffers.
 */
@Service("secure31BuffSecTentRoleMembFactoryService")
public class SecureBuffSecTentRoleMembFactoryService
	implements ISecureSecTentRoleMembFactory
{
	public BusModelBuffSecTentRoleMembFactoryService() {
	}

    @Override
    public ISecureSecTentRoleMembPKey newPKey() {
        ISecureSecTentRoleMembPKey pkey =
            new SecureBuffSecTentRoleMembPKey();
        return( pkey );
    }

	public SecureBuffSecTentRoleMembPKey ensurePKey(ISecureSecTentRoleMembPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecTentRoleMembPKey) {
			return( (SecureBuffSecTentRoleMembPKey)key );
		}
		else {
			SecureBuffSecTentRoleMembPKey mapped = new SecureBuffSecTentRoleMembPKey();
			mapped.setRequiredSecTentRoleId( key.getRequiredSecTentRoleId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentRoleMembHPKey newHPKey() {
		ISecureSecTentRoleMembHPKey hpkey =
			new SecureBuffSecTentRoleMembHPKey();
		return( hpkey );
	}

	public SecureBuffSecTentRoleMembHPKey ensureHPKey(ISecureSecTentRoleMembHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecTentRoleMembHPKey) {
			return( (SecureBuffSecTentRoleMembHPKey)key );
		}
		else {
			SecureBuffSecTentRoleMembHPKey mapped = new SecureBuffSecTentRoleMembHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecTentRoleId( key.getRequiredSecTentRoleId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentRoleMembByTentRoleIdxKey newByTentRoleIdxKey() {
		ISecureSecTentRoleMembByTentRoleIdxKey key =
			new SecureBuffSecTentRoleMembByTentRoleIdxKey();
		return( key );
	}

	public SecureBuffSecTentRoleMembByTentRoleIdxKey ensureByTentRoleIdxKey(ISecureSecTentRoleMembByTentRoleIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecTentRoleMembByTentRoleIdxKey) {
			return( (SecureBuffSecTentRoleMembByTentRoleIdxKey)key );
		}
		else {
			SecureBuffSecTentRoleMembByTentRoleIdxKey mapped = new SecureBuffSecTentRoleMembByTentRoleIdxKey();
			mapped.setRequiredSecTentRoleId( key.getRequiredSecTentRoleId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentRoleMembByUserIdxKey newByUserIdxKey() {
		ISecureSecTentRoleMembByUserIdxKey key =
			new SecureBuffSecTentRoleMembByUserIdxKey();
		return( key );
	}

	public SecureBuffSecTentRoleMembByUserIdxKey ensureByUserIdxKey(ISecureSecTentRoleMembByUserIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecTentRoleMembByUserIdxKey) {
			return( (SecureBuffSecTentRoleMembByUserIdxKey)key );
		}
		else {
			SecureBuffSecTentRoleMembByUserIdxKey mapped = new SecureBuffSecTentRoleMembByUserIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentRoleMemb newRec() {
		ISecureSecTentRoleMemb rec =
			new SecureBuffSecTentRoleMemb();
		return( rec );
	}

	public SecureBuffSecTentRoleMemb ensureRec(ISecureSecTentRoleMemb rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecTentRoleMemb) {
			return ((SecureBuffSecTentRoleMemb)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecTentRoleMemb.CLASS_CODE: {
					SecureBuffSecTentRoleMemb mapped = new SecureBuffSecTentRoleMemb();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentRoleMemb",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentRoleMemb");
			}
		}
	}

	@Override
	public ISecureSecTentRoleMembH newHRec() {
		ISecureSecTentRoleMembH hrec =
			new SecureBuffSecTentRoleMembH();
		return( hrec );
	}

	public SecureBuffSecTentRoleMembH ensureHRec(ISecureSecTentRoleMembH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecTentRoleMembH) {
			return ((SecureBuffSecTentRoleMembH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecTentRoleMemb.CLASS_CODE: {
					SecureBuffSecTentRoleMembH mapped = new SecureBuffSecTentRoleMembH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentRoleMemb",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentRoleMemb");
			}
		}
	}
}
