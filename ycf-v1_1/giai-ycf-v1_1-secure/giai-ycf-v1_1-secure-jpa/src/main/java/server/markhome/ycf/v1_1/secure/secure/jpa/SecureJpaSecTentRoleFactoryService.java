
// Description: Java 25 Factory service implementation for SecTentRole JPA objects

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
 *	Java 25 Factory service implementation for SecTentRole JPA objects.
 */
public class SecureJpaSecTentRoleFactoryService
    implements ISecureSecTentRoleFactory
{
    public BusModelJpaSecTentRoleFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRoleHPKey newHPKey() {
        ISecureSecTentRoleHPKey hpkey = new SecureJpaSecTentRoleHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleHPKey ensureHPKey(ISecureSecTentRoleHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecTentRoleHPKey) {
			return( (SecureJpaSecTentRoleHPKey)key );
		}
		else {
			SecureJpaSecTentRoleHPKey mapped = new SecureJpaSecTentRoleHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecTentRoleId( key.getRequiredSecTentRoleId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRoleByTenantIdxKey newByTenantIdxKey() {
		ISecureSecTentRoleByTenantIdxKey key = new SecureJpaSecTentRoleByTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleByTenantIdxKey ensureByTenantIdxKey(ISecureSecTentRoleByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecTentRoleByTenantIdxKey) {
			return( (SecureJpaSecTentRoleByTenantIdxKey)key );
		}
		else {
			SecureJpaSecTentRoleByTenantIdxKey mapped = new SecureJpaSecTentRoleByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRoleByNameIdxKey newByNameIdxKey() {
		ISecureSecTentRoleByNameIdxKey key = new SecureJpaSecTentRoleByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleByNameIdxKey ensureByNameIdxKey(ISecureSecTentRoleByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecTentRoleByNameIdxKey) {
			return( (SecureJpaSecTentRoleByNameIdxKey)key );
		}
		else {
			SecureJpaSecTentRoleByNameIdxKey mapped = new SecureJpaSecTentRoleByNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRoleByUNameIdxKey newByUNameIdxKey() {
		ISecureSecTentRoleByUNameIdxKey key = new SecureJpaSecTentRoleByUNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleByUNameIdxKey ensureByUNameIdxKey(ISecureSecTentRoleByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecTentRoleByUNameIdxKey) {
			return( (SecureJpaSecTentRoleByUNameIdxKey)key );
		}
		else {
			SecureJpaSecTentRoleByUNameIdxKey mapped = new SecureJpaSecTentRoleByUNameIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentRole newRec() {
        ISecureSecTentRole rec = new SecureJpaSecTentRole();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRole ensureRec(ISecureSecTentRole rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecTentRole) {
			return( (SecureJpaSecTentRole)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecTentRole.CLASS_CODE: {
					SecureJpaSecTentRole mapped = new SecureJpaSecTentRole();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentRole",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentRole");
			}
		}
	}

    @Override
    public ISecureSecTentRoleH newHRec() {
        ISecureSecTentRoleH hrec = new SecureJpaSecTentRoleH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleH ensureHRec(ISecureSecTentRoleH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecTentRoleH) {
			return( (SecureJpaSecTentRoleH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecTentRole.CLASS_CODE: {
					SecureJpaSecTentRoleH mapped = new SecureJpaSecTentRoleH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentRole",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentRole");
			}
		}
	}
}
