
// Description: Java 25 Factory service implementation for SecTentRole buffers

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
 *	Java 25 Factory service implementation for SecTentRole buffers.
 */
@Service("secure31BuffSecTentRoleFactoryService")
public class SecureBuffSecTentRoleFactoryService
	implements ISecureSecTentRoleFactory
{
	public BusModelBuffSecTentRoleFactoryService() {
	}

	@Override
	public ISecureSecTentRoleHPKey newHPKey() {
		ISecureSecTentRoleHPKey hpkey =
			new SecureBuffSecTentRoleHPKey();
		return( hpkey );
	}

	public SecureBuffSecTentRoleHPKey ensureHPKey(ISecureSecTentRoleHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecTentRoleHPKey) {
			return( (SecureBuffSecTentRoleHPKey)key );
		}
		else {
			SecureBuffSecTentRoleHPKey mapped = new SecureBuffSecTentRoleHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecTentRoleId( key.getRequiredSecTentRoleId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentRoleByTenantIdxKey newByTenantIdxKey() {
		ISecureSecTentRoleByTenantIdxKey key =
			new SecureBuffSecTentRoleByTenantIdxKey();
		return( key );
	}

	public SecureBuffSecTentRoleByTenantIdxKey ensureByTenantIdxKey(ISecureSecTentRoleByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecTentRoleByTenantIdxKey) {
			return( (SecureBuffSecTentRoleByTenantIdxKey)key );
		}
		else {
			SecureBuffSecTentRoleByTenantIdxKey mapped = new SecureBuffSecTentRoleByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentRoleByNameIdxKey newByNameIdxKey() {
		ISecureSecTentRoleByNameIdxKey key =
			new SecureBuffSecTentRoleByNameIdxKey();
		return( key );
	}

	public SecureBuffSecTentRoleByNameIdxKey ensureByNameIdxKey(ISecureSecTentRoleByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecTentRoleByNameIdxKey) {
			return( (SecureBuffSecTentRoleByNameIdxKey)key );
		}
		else {
			SecureBuffSecTentRoleByNameIdxKey mapped = new SecureBuffSecTentRoleByNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentRoleByUNameIdxKey newByUNameIdxKey() {
		ISecureSecTentRoleByUNameIdxKey key =
			new SecureBuffSecTentRoleByUNameIdxKey();
		return( key );
	}

	public SecureBuffSecTentRoleByUNameIdxKey ensureByUNameIdxKey(ISecureSecTentRoleByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecTentRoleByUNameIdxKey) {
			return( (SecureBuffSecTentRoleByUNameIdxKey)key );
		}
		else {
			SecureBuffSecTentRoleByUNameIdxKey mapped = new SecureBuffSecTentRoleByUNameIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentRole newRec() {
		ISecureSecTentRole rec =
			new SecureBuffSecTentRole();
		return( rec );
	}

	public SecureBuffSecTentRole ensureRec(ISecureSecTentRole rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecTentRole) {
			return ((SecureBuffSecTentRole)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecTentRole.CLASS_CODE: {
					SecureBuffSecTentRole mapped = new SecureBuffSecTentRole();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentRole",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentRole");
			}
		}
	}

	@Override
	public ISecureSecTentRoleH newHRec() {
		ISecureSecTentRoleH hrec =
			new SecureBuffSecTentRoleH();
		return( hrec );
	}

	public SecureBuffSecTentRoleH ensureHRec(ISecureSecTentRoleH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecTentRoleH) {
			return ((SecureBuffSecTentRoleH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecTentRole.CLASS_CODE: {
					SecureBuffSecTentRoleH mapped = new SecureBuffSecTentRoleH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentRole",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentRole");
			}
		}
	}
}
