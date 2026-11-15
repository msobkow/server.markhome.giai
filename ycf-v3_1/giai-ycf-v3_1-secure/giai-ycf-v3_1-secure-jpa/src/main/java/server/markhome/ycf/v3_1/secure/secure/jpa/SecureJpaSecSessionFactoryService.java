
// Description: Java 25 Factory service implementation for SecSession JPA objects

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
 *	Java 25 Factory service implementation for SecSession JPA objects.
 */
public class SecureJpaSecSessionFactoryService
    implements ISecureSecSessionFactory
{
    public BusModelJpaSecSessionFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSessionHPKey newHPKey() {
        ISecureSecSessionHPKey hpkey = new SecureJpaSecSessionHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSessionHPKey ensureHPKey(ISecureSecSessionHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecSessionHPKey) {
			return( (SecureJpaSecSessionHPKey)key );
		}
		else {
			SecureJpaSecSessionHPKey mapped = new SecureJpaSecSessionHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecSessionId( key.getRequiredSecSessionId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSessionBySecUserIdxKey newBySecUserIdxKey() {
		ISecureSecSessionBySecUserIdxKey key = new SecureJpaSecSessionBySecUserIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSessionBySecUserIdxKey ensureBySecUserIdxKey(ISecureSecSessionBySecUserIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSessionBySecUserIdxKey) {
			return( (SecureJpaSecSessionBySecUserIdxKey)key );
		}
		else {
			SecureJpaSecSessionBySecUserIdxKey mapped = new SecureJpaSecSessionBySecUserIdxKey();
			mapped.setRequiredSecUserId( key.getRequiredSecUserId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSessionByStartIdxKey newByStartIdxKey() {
		ISecureSecSessionByStartIdxKey key = new SecureJpaSecSessionByStartIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSessionByStartIdxKey ensureByStartIdxKey(ISecureSecSessionByStartIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSessionByStartIdxKey) {
			return( (SecureJpaSecSessionByStartIdxKey)key );
		}
		else {
			SecureJpaSecSessionByStartIdxKey mapped = new SecureJpaSecSessionByStartIdxKey();
			mapped.setRequiredSecUserId( key.getRequiredSecUserId() );
			mapped.setRequiredStart( key.getRequiredStart() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSessionByFinishIdxKey newByFinishIdxKey() {
		ISecureSecSessionByFinishIdxKey key = new SecureJpaSecSessionByFinishIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSessionByFinishIdxKey ensureByFinishIdxKey(ISecureSecSessionByFinishIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSessionByFinishIdxKey) {
			return( (SecureJpaSecSessionByFinishIdxKey)key );
		}
		else {
			SecureJpaSecSessionByFinishIdxKey mapped = new SecureJpaSecSessionByFinishIdxKey();
			mapped.setRequiredSecUserId( key.getRequiredSecUserId() );
			mapped.setOptionalFinish( key.getOptionalFinish() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSessionBySecProxyIdxKey newBySecProxyIdxKey() {
		ISecureSecSessionBySecProxyIdxKey key = new SecureJpaSecSessionBySecProxyIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSessionBySecProxyIdxKey ensureBySecProxyIdxKey(ISecureSecSessionBySecProxyIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSessionBySecProxyIdxKey) {
			return( (SecureJpaSecSessionBySecProxyIdxKey)key );
		}
		else {
			SecureJpaSecSessionBySecProxyIdxKey mapped = new SecureJpaSecSessionBySecProxyIdxKey();
			mapped.setOptionalSecProxyId( key.getOptionalSecProxyId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSession newRec() {
        ISecureSecSession rec = new SecureJpaSecSession();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSession ensureRec(ISecureSecSession rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecSession) {
			return( (SecureJpaSecSession)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecSession.CLASS_CODE: {
					SecureJpaSecSession mapped = new SecureJpaSecSession();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSession",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSession");
			}
		}
	}

    @Override
    public ISecureSecSessionH newHRec() {
        ISecureSecSessionH hrec = new SecureJpaSecSessionH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSessionH ensureHRec(ISecureSecSessionH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecSessionH) {
			return( (SecureJpaSecSessionH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecSession.CLASS_CODE: {
					SecureJpaSecSessionH mapped = new SecureJpaSecSessionH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSession",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSession");
			}
		}
	}
}
