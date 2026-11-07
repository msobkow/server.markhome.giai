
// Description: Java 25 Factory service implementation for SecClusRoleMemb buffers

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
 *	Java 25 Factory service implementation for SecClusRoleMemb buffers.
 */
@Service("secure31BuffSecClusRoleMembFactoryService")
public class SecureBuffSecClusRoleMembFactoryService
	implements ISecureSecClusRoleMembFactory
{
	public BusModelBuffSecClusRoleMembFactoryService() {
	}

    @Override
    public ISecureSecClusRoleMembPKey newPKey() {
        ISecureSecClusRoleMembPKey pkey =
            new SecureBuffSecClusRoleMembPKey();
        return( pkey );
    }

	public SecureBuffSecClusRoleMembPKey ensurePKey(ISecureSecClusRoleMembPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecClusRoleMembPKey) {
			return( (SecureBuffSecClusRoleMembPKey)key );
		}
		else {
			SecureBuffSecClusRoleMembPKey mapped = new SecureBuffSecClusRoleMembPKey();
			mapped.setRequiredSecClusRoleId( key.getRequiredSecClusRoleId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecClusRoleMembHPKey newHPKey() {
		ISecureSecClusRoleMembHPKey hpkey =
			new SecureBuffSecClusRoleMembHPKey();
		return( hpkey );
	}

	public SecureBuffSecClusRoleMembHPKey ensureHPKey(ISecureSecClusRoleMembHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecClusRoleMembHPKey) {
			return( (SecureBuffSecClusRoleMembHPKey)key );
		}
		else {
			SecureBuffSecClusRoleMembHPKey mapped = new SecureBuffSecClusRoleMembHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecClusRoleId( key.getRequiredSecClusRoleId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecClusRoleMembByClusRoleIdxKey newByClusRoleIdxKey() {
		ISecureSecClusRoleMembByClusRoleIdxKey key =
			new SecureBuffSecClusRoleMembByClusRoleIdxKey();
		return( key );
	}

	public SecureBuffSecClusRoleMembByClusRoleIdxKey ensureByClusRoleIdxKey(ISecureSecClusRoleMembByClusRoleIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecClusRoleMembByClusRoleIdxKey) {
			return( (SecureBuffSecClusRoleMembByClusRoleIdxKey)key );
		}
		else {
			SecureBuffSecClusRoleMembByClusRoleIdxKey mapped = new SecureBuffSecClusRoleMembByClusRoleIdxKey();
			mapped.setRequiredSecClusRoleId( key.getRequiredSecClusRoleId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecClusRoleMembByLoginIdxKey newByLoginIdxKey() {
		ISecureSecClusRoleMembByLoginIdxKey key =
			new SecureBuffSecClusRoleMembByLoginIdxKey();
		return( key );
	}

	public SecureBuffSecClusRoleMembByLoginIdxKey ensureByLoginIdxKey(ISecureSecClusRoleMembByLoginIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecClusRoleMembByLoginIdxKey) {
			return( (SecureBuffSecClusRoleMembByLoginIdxKey)key );
		}
		else {
			SecureBuffSecClusRoleMembByLoginIdxKey mapped = new SecureBuffSecClusRoleMembByLoginIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecClusRoleMemb newRec() {
		ISecureSecClusRoleMemb rec =
			new SecureBuffSecClusRoleMemb();
		return( rec );
	}

	public SecureBuffSecClusRoleMemb ensureRec(ISecureSecClusRoleMemb rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecClusRoleMemb) {
			return ((SecureBuffSecClusRoleMemb)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecClusRoleMemb.CLASS_CODE: {
					SecureBuffSecClusRoleMemb mapped = new SecureBuffSecClusRoleMemb();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecClusRoleMemb",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecClusRoleMemb");
			}
		}
	}

	@Override
	public ISecureSecClusRoleMembH newHRec() {
		ISecureSecClusRoleMembH hrec =
			new SecureBuffSecClusRoleMembH();
		return( hrec );
	}

	public SecureBuffSecClusRoleMembH ensureHRec(ISecureSecClusRoleMembH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecClusRoleMembH) {
			return ((SecureBuffSecClusRoleMembH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecClusRoleMemb.CLASS_CODE: {
					SecureBuffSecClusRoleMembH mapped = new SecureBuffSecClusRoleMembH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecClusRoleMemb",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecClusRoleMemb");
			}
		}
	}
}
