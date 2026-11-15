
// Description: Java 25 Factory service implementation for SecClusRole JPA objects

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
 *	Java 25 Factory service implementation for SecClusRole JPA objects.
 */
public class SecureJpaSecClusRoleFactoryService
    implements ISecureSecClusRoleFactory
{
    public BusModelJpaSecClusRoleFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusRoleHPKey newHPKey() {
        ISecureSecClusRoleHPKey hpkey = new SecureJpaSecClusRoleHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleHPKey ensureHPKey(ISecureSecClusRoleHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecClusRoleHPKey) {
			return( (SecureJpaSecClusRoleHPKey)key );
		}
		else {
			SecureJpaSecClusRoleHPKey mapped = new SecureJpaSecClusRoleHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecClusRoleId( key.getRequiredSecClusRoleId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusRoleByClusterIdxKey newByClusterIdxKey() {
		ISecureSecClusRoleByClusterIdxKey key = new SecureJpaSecClusRoleByClusterIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleByClusterIdxKey ensureByClusterIdxKey(ISecureSecClusRoleByClusterIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecClusRoleByClusterIdxKey) {
			return( (SecureJpaSecClusRoleByClusterIdxKey)key );
		}
		else {
			SecureJpaSecClusRoleByClusterIdxKey mapped = new SecureJpaSecClusRoleByClusterIdxKey();
			mapped.setRequiredClusterId( key.getRequiredClusterId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusRoleByNameIdxKey newByNameIdxKey() {
		ISecureSecClusRoleByNameIdxKey key = new SecureJpaSecClusRoleByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleByNameIdxKey ensureByNameIdxKey(ISecureSecClusRoleByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecClusRoleByNameIdxKey) {
			return( (SecureJpaSecClusRoleByNameIdxKey)key );
		}
		else {
			SecureJpaSecClusRoleByNameIdxKey mapped = new SecureJpaSecClusRoleByNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusRoleByUNameIdxKey newByUNameIdxKey() {
		ISecureSecClusRoleByUNameIdxKey key = new SecureJpaSecClusRoleByUNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleByUNameIdxKey ensureByUNameIdxKey(ISecureSecClusRoleByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecClusRoleByUNameIdxKey) {
			return( (SecureJpaSecClusRoleByUNameIdxKey)key );
		}
		else {
			SecureJpaSecClusRoleByUNameIdxKey mapped = new SecureJpaSecClusRoleByUNameIdxKey();
			mapped.setRequiredClusterId( key.getRequiredClusterId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusRole newRec() {
        ISecureSecClusRole rec = new SecureJpaSecClusRole();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRole ensureRec(ISecureSecClusRole rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecClusRole) {
			return( (SecureJpaSecClusRole)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecClusRole.CLASS_CODE: {
					SecureJpaSecClusRole mapped = new SecureJpaSecClusRole();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecClusRole",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecClusRole");
			}
		}
	}

    @Override
    public ISecureSecClusRoleH newHRec() {
        ISecureSecClusRoleH hrec = new SecureJpaSecClusRoleH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleH ensureHRec(ISecureSecClusRoleH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecClusRoleH) {
			return( (SecureJpaSecClusRoleH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecClusRole.CLASS_CODE: {
					SecureJpaSecClusRoleH mapped = new SecureJpaSecClusRoleH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecClusRole",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecClusRole");
			}
		}
	}
}
