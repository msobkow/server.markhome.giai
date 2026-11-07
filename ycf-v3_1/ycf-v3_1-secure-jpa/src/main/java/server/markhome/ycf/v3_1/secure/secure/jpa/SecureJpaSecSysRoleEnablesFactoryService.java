
// Description: Java 25 Factory service implementation for SecSysRoleEnables JPA objects

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
 *	Java 25 Factory service implementation for SecSysRoleEnables JPA objects.
 */
public class SecureJpaSecSysRoleEnablesFactoryService
    implements ISecureSecSysRoleEnablesFactory
{
    public BusModelJpaSecSysRoleEnablesFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysRoleEnablesPKey newPKey() {
        ISecureSecSysRoleEnablesPKey pkey = new SecureJpaSecSysRoleEnablesPKey();
        return( pkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnablesPKey ensurePKey(ISecureSecSysRoleEnablesPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSysRoleEnablesPKey) {
			return( (SecureJpaSecSysRoleEnablesPKey)key );
		}
		else {
			SecureJpaSecSysRoleEnablesPKey mapped = new SecureJpaSecSysRoleEnablesPKey();
			mapped.setRequiredSecSysRoleId( key.getRequiredSecSysRoleId() );
			mapped.setRequiredEnableName( key.getRequiredEnableName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysRoleEnablesHPKey newHPKey() {
        ISecureSecSysRoleEnablesHPKey hpkey = new SecureJpaSecSysRoleEnablesHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnablesHPKey ensureHPKey(ISecureSecSysRoleEnablesHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecSysRoleEnablesHPKey) {
			return( (SecureJpaSecSysRoleEnablesHPKey)key );
		}
		else {
			SecureJpaSecSysRoleEnablesHPKey mapped = new SecureJpaSecSysRoleEnablesHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecSysRoleId( key.getRequiredSecSysRoleId() );
			mapped.setRequiredEnableName( key.getRequiredEnableName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysRoleEnablesBySysRoleIdxKey newBySysRoleIdxKey() {
		ISecureSecSysRoleEnablesBySysRoleIdxKey key = new SecureJpaSecSysRoleEnablesBySysRoleIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnablesBySysRoleIdxKey ensureBySysRoleIdxKey(ISecureSecSysRoleEnablesBySysRoleIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSysRoleEnablesBySysRoleIdxKey) {
			return( (SecureJpaSecSysRoleEnablesBySysRoleIdxKey)key );
		}
		else {
			SecureJpaSecSysRoleEnablesBySysRoleIdxKey mapped = new SecureJpaSecSysRoleEnablesBySysRoleIdxKey();
			mapped.setRequiredSecSysRoleId( key.getRequiredSecSysRoleId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysRoleEnablesByNameIdxKey newByNameIdxKey() {
		ISecureSecSysRoleEnablesByNameIdxKey key = new SecureJpaSecSysRoleEnablesByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnablesByNameIdxKey ensureByNameIdxKey(ISecureSecSysRoleEnablesByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSysRoleEnablesByNameIdxKey) {
			return( (SecureJpaSecSysRoleEnablesByNameIdxKey)key );
		}
		else {
			SecureJpaSecSysRoleEnablesByNameIdxKey mapped = new SecureJpaSecSysRoleEnablesByNameIdxKey();
			mapped.setRequiredEnableName( key.getRequiredEnableName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysRoleEnables newRec() {
        ISecureSecSysRoleEnables rec = new SecureJpaSecSysRoleEnables();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnables ensureRec(ISecureSecSysRoleEnables rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecSysRoleEnables) {
			return( (SecureJpaSecSysRoleEnables)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecSysRoleEnables.CLASS_CODE: {
					SecureJpaSecSysRoleEnables mapped = new SecureJpaSecSysRoleEnables();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysRoleEnables",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysRoleEnables");
			}
		}
	}

    @Override
    public ISecureSecSysRoleEnablesH newHRec() {
        ISecureSecSysRoleEnablesH hrec = new SecureJpaSecSysRoleEnablesH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnablesH ensureHRec(ISecureSecSysRoleEnablesH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecSysRoleEnablesH) {
			return( (SecureJpaSecSysRoleEnablesH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecSysRoleEnables.CLASS_CODE: {
					SecureJpaSecSysRoleEnablesH mapped = new SecureJpaSecSysRoleEnablesH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysRoleEnables",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysRoleEnables");
			}
		}
	}
}
