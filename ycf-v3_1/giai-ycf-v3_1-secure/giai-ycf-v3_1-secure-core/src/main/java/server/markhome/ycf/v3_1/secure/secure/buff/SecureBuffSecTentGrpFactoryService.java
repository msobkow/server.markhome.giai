
// Description: Java 25 Factory service implementation for SecTentGrp buffers

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
 *	Java 25 Factory service implementation for SecTentGrp buffers.
 */
@Service("secure31BuffSecTentGrpFactoryService")
public class SecureBuffSecTentGrpFactoryService
	implements ISecureSecTentGrpFactory
{
	public BusModelBuffSecTentGrpFactoryService() {
	}

	@Override
	public ISecureSecTentGrpHPKey newHPKey() {
		ISecureSecTentGrpHPKey hpkey =
			new SecureBuffSecTentGrpHPKey();
		return( hpkey );
	}

	public SecureBuffSecTentGrpHPKey ensureHPKey(ISecureSecTentGrpHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecTentGrpHPKey) {
			return( (SecureBuffSecTentGrpHPKey)key );
		}
		else {
			SecureBuffSecTentGrpHPKey mapped = new SecureBuffSecTentGrpHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecTentGrpId( key.getRequiredSecTentGrpId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentGrpByTenantIdxKey newByTenantIdxKey() {
		ISecureSecTentGrpByTenantIdxKey key =
			new SecureBuffSecTentGrpByTenantIdxKey();
		return( key );
	}

	public SecureBuffSecTentGrpByTenantIdxKey ensureByTenantIdxKey(ISecureSecTentGrpByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecTentGrpByTenantIdxKey) {
			return( (SecureBuffSecTentGrpByTenantIdxKey)key );
		}
		else {
			SecureBuffSecTentGrpByTenantIdxKey mapped = new SecureBuffSecTentGrpByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentGrpByNameIdxKey newByNameIdxKey() {
		ISecureSecTentGrpByNameIdxKey key =
			new SecureBuffSecTentGrpByNameIdxKey();
		return( key );
	}

	public SecureBuffSecTentGrpByNameIdxKey ensureByNameIdxKey(ISecureSecTentGrpByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecTentGrpByNameIdxKey) {
			return( (SecureBuffSecTentGrpByNameIdxKey)key );
		}
		else {
			SecureBuffSecTentGrpByNameIdxKey mapped = new SecureBuffSecTentGrpByNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentGrpByUNameIdxKey newByUNameIdxKey() {
		ISecureSecTentGrpByUNameIdxKey key =
			new SecureBuffSecTentGrpByUNameIdxKey();
		return( key );
	}

	public SecureBuffSecTentGrpByUNameIdxKey ensureByUNameIdxKey(ISecureSecTentGrpByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecTentGrpByUNameIdxKey) {
			return( (SecureBuffSecTentGrpByUNameIdxKey)key );
		}
		else {
			SecureBuffSecTentGrpByUNameIdxKey mapped = new SecureBuffSecTentGrpByUNameIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecTentGrp newRec() {
		ISecureSecTentGrp rec =
			new SecureBuffSecTentGrp();
		return( rec );
	}

	public SecureBuffSecTentGrp ensureRec(ISecureSecTentGrp rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecTentGrp) {
			return ((SecureBuffSecTentGrp)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecTentGrp.CLASS_CODE: {
					SecureBuffSecTentGrp mapped = new SecureBuffSecTentGrp();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentGrp",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentGrp");
			}
		}
	}

	@Override
	public ISecureSecTentGrpH newHRec() {
		ISecureSecTentGrpH hrec =
			new SecureBuffSecTentGrpH();
		return( hrec );
	}

	public SecureBuffSecTentGrpH ensureHRec(ISecureSecTentGrpH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecTentGrpH) {
			return ((SecureBuffSecTentGrpH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecTentGrp.CLASS_CODE: {
					SecureBuffSecTentGrpH mapped = new SecureBuffSecTentGrpH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentGrp",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentGrp");
			}
		}
	}
}
