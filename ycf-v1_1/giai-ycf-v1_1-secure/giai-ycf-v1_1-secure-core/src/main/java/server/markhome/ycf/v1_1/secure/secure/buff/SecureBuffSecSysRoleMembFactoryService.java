
// Description: Java 25 Factory service implementation for SecSysRoleMemb buffers

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
 *	Java 25 Factory service implementation for SecSysRoleMemb buffers.
 */
@Service("secure31BuffSecSysRoleMembFactoryService")
public class SecureBuffSecSysRoleMembFactoryService
	implements ISecureSecSysRoleMembFactory
{
	public BusModelBuffSecSysRoleMembFactoryService() {
	}

    @Override
    public ISecureSecSysRoleMembPKey newPKey() {
        ISecureSecSysRoleMembPKey pkey =
            new SecureBuffSecSysRoleMembPKey();
        return( pkey );
    }

	public SecureBuffSecSysRoleMembPKey ensurePKey(ISecureSecSysRoleMembPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecSysRoleMembPKey) {
			return( (SecureBuffSecSysRoleMembPKey)key );
		}
		else {
			SecureBuffSecSysRoleMembPKey mapped = new SecureBuffSecSysRoleMembPKey();
			mapped.setRequiredSecSysRoleId( key.getRequiredSecSysRoleId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysRoleMembHPKey newHPKey() {
		ISecureSecSysRoleMembHPKey hpkey =
			new SecureBuffSecSysRoleMembHPKey();
		return( hpkey );
	}

	public SecureBuffSecSysRoleMembHPKey ensureHPKey(ISecureSecSysRoleMembHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecSysRoleMembHPKey) {
			return( (SecureBuffSecSysRoleMembHPKey)key );
		}
		else {
			SecureBuffSecSysRoleMembHPKey mapped = new SecureBuffSecSysRoleMembHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecSysRoleId( key.getRequiredSecSysRoleId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysRoleMembBySysRoleIdxKey newBySysRoleIdxKey() {
		ISecureSecSysRoleMembBySysRoleIdxKey key =
			new SecureBuffSecSysRoleMembBySysRoleIdxKey();
		return( key );
	}

	public SecureBuffSecSysRoleMembBySysRoleIdxKey ensureBySysRoleIdxKey(ISecureSecSysRoleMembBySysRoleIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecSysRoleMembBySysRoleIdxKey) {
			return( (SecureBuffSecSysRoleMembBySysRoleIdxKey)key );
		}
		else {
			SecureBuffSecSysRoleMembBySysRoleIdxKey mapped = new SecureBuffSecSysRoleMembBySysRoleIdxKey();
			mapped.setRequiredSecSysRoleId( key.getRequiredSecSysRoleId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysRoleMembByLoginIdxKey newByLoginIdxKey() {
		ISecureSecSysRoleMembByLoginIdxKey key =
			new SecureBuffSecSysRoleMembByLoginIdxKey();
		return( key );
	}

	public SecureBuffSecSysRoleMembByLoginIdxKey ensureByLoginIdxKey(ISecureSecSysRoleMembByLoginIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecSysRoleMembByLoginIdxKey) {
			return( (SecureBuffSecSysRoleMembByLoginIdxKey)key );
		}
		else {
			SecureBuffSecSysRoleMembByLoginIdxKey mapped = new SecureBuffSecSysRoleMembByLoginIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysRoleMemb newRec() {
		ISecureSecSysRoleMemb rec =
			new SecureBuffSecSysRoleMemb();
		return( rec );
	}

	public SecureBuffSecSysRoleMemb ensureRec(ISecureSecSysRoleMemb rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecSysRoleMemb) {
			return ((SecureBuffSecSysRoleMemb)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecSysRoleMemb.CLASS_CODE: {
					SecureBuffSecSysRoleMemb mapped = new SecureBuffSecSysRoleMemb();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysRoleMemb",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysRoleMemb");
			}
		}
	}

	@Override
	public ISecureSecSysRoleMembH newHRec() {
		ISecureSecSysRoleMembH hrec =
			new SecureBuffSecSysRoleMembH();
		return( hrec );
	}

	public SecureBuffSecSysRoleMembH ensureHRec(ISecureSecSysRoleMembH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecSysRoleMembH) {
			return ((SecureBuffSecSysRoleMembH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecSysRoleMemb.CLASS_CODE: {
					SecureBuffSecSysRoleMembH mapped = new SecureBuffSecSysRoleMembH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysRoleMemb",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysRoleMemb");
			}
		}
	}
}
