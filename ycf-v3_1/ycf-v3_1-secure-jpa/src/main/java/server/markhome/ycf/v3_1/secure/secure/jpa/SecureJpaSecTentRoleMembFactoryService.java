
// Description: Java 25 Factory service implementation for SecTentRoleMemb JPA objects

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

package server.markhome.ycf.v3_1.secure.secure.jpa;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

/*
 *	Java 25 Factory service implementation for SecTentRoleMemb JPA objects.
 */
public class SecureJpaSecTentRoleMembFactoryService
    implements ISecureSecTentRoleMembFactory
{
    public BusModelJpaSecTentRoleMembFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRoleMembPKey newPKey() {
        ISecureSecTentRoleMembPKey pkey = new SecureJpaSecTentRoleMembPKey();
        return( pkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMembPKey ensurePKey(ISecureSecTentRoleMembPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecTentRoleMembPKey) {
			return( (SecureJpaSecTentRoleMembPKey)key );
		}
		else {
			SecureJpaSecTentRoleMembPKey mapped = new SecureJpaSecTentRoleMembPKey();
			mapped.setRequiredSecTentRoleId( key.getRequiredSecTentRoleId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRoleMembHPKey newHPKey() {
        ISecureSecTentRoleMembHPKey hpkey = new SecureJpaSecTentRoleMembHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMembHPKey ensureHPKey(ISecureSecTentRoleMembHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecTentRoleMembHPKey) {
			return( (SecureJpaSecTentRoleMembHPKey)key );
		}
		else {
			SecureJpaSecTentRoleMembHPKey mapped = new SecureJpaSecTentRoleMembHPKey();
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
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRoleMembByTentRoleIdxKey newByTentRoleIdxKey() {
		ISecureSecTentRoleMembByTentRoleIdxKey key = new SecureJpaSecTentRoleMembByTentRoleIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMembByTentRoleIdxKey ensureByTentRoleIdxKey(ISecureSecTentRoleMembByTentRoleIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecTentRoleMembByTentRoleIdxKey) {
			return( (SecureJpaSecTentRoleMembByTentRoleIdxKey)key );
		}
		else {
			SecureJpaSecTentRoleMembByTentRoleIdxKey mapped = new SecureJpaSecTentRoleMembByTentRoleIdxKey();
			mapped.setRequiredSecTentRoleId( key.getRequiredSecTentRoleId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRoleMembByUserIdxKey newByUserIdxKey() {
		ISecureSecTentRoleMembByUserIdxKey key = new SecureJpaSecTentRoleMembByUserIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMembByUserIdxKey ensureByUserIdxKey(ISecureSecTentRoleMembByUserIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecTentRoleMembByUserIdxKey) {
			return( (SecureJpaSecTentRoleMembByUserIdxKey)key );
		}
		else {
			SecureJpaSecTentRoleMembByUserIdxKey mapped = new SecureJpaSecTentRoleMembByUserIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRoleMemb newRec() {
        ISecureSecTentRoleMemb rec = new SecureJpaSecTentRoleMemb();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMemb ensureRec(ISecureSecTentRoleMemb rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecTentRoleMemb) {
			return( (SecureJpaSecTentRoleMemb)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecTentRoleMemb.CLASS_CODE: {
					SecureJpaSecTentRoleMemb mapped = new SecureJpaSecTentRoleMemb();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentRoleMemb",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentRoleMemb");
			}
		}
	}

    @Override
    public ISecureSecTentRoleMembH newHRec() {
        ISecureSecTentRoleMembH hrec = new SecureJpaSecTentRoleMembH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMembH ensureHRec(ISecureSecTentRoleMembH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecTentRoleMembH) {
			return( (SecureJpaSecTentRoleMembH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecTentRoleMemb.CLASS_CODE: {
					SecureJpaSecTentRoleMembH mapped = new SecureJpaSecTentRoleMembH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentRoleMemb",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentRoleMemb");
			}
		}
	}
}
