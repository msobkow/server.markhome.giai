
// Description: Java 25 Factory service implementation for SecUserPWHistory JPA objects

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
 *	Java 25 Factory service implementation for SecUserPWHistory JPA objects.
 */
public class SecureJpaSecUserPWHistoryFactoryService
    implements ISecureSecUserPWHistoryFactory
{
    public BusModelJpaSecUserPWHistoryFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWHistoryPKey newPKey() {
        ISecureSecUserPWHistoryPKey pkey = new SecureJpaSecUserPWHistoryPKey();
        return( pkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistoryPKey ensurePKey(ISecureSecUserPWHistoryPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserPWHistoryPKey) {
			return( (SecureJpaSecUserPWHistoryPKey)key );
		}
		else {
			SecureJpaSecUserPWHistoryPKey mapped = new SecureJpaSecUserPWHistoryPKey();
			mapped.setRequiredSecUserId( key.getRequiredSecUserId() );
			mapped.setRequiredPWSetStamp( key.getRequiredPWSetStamp() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWHistoryHPKey newHPKey() {
        ISecureSecUserPWHistoryHPKey hpkey = new SecureJpaSecUserPWHistoryHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistoryHPKey ensureHPKey(ISecureSecUserPWHistoryHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecUserPWHistoryHPKey) {
			return( (SecureJpaSecUserPWHistoryHPKey)key );
		}
		else {
			SecureJpaSecUserPWHistoryHPKey mapped = new SecureJpaSecUserPWHistoryHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecUserId( key.getRequiredSecUserId() );
			mapped.setRequiredPWSetStamp( key.getRequiredPWSetStamp() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWHistoryByUserIdxKey newByUserIdxKey() {
		ISecureSecUserPWHistoryByUserIdxKey key = new SecureJpaSecUserPWHistoryByUserIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistoryByUserIdxKey ensureByUserIdxKey(ISecureSecUserPWHistoryByUserIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserPWHistoryByUserIdxKey) {
			return( (SecureJpaSecUserPWHistoryByUserIdxKey)key );
		}
		else {
			SecureJpaSecUserPWHistoryByUserIdxKey mapped = new SecureJpaSecUserPWHistoryByUserIdxKey();
			mapped.setRequiredSecUserId( key.getRequiredSecUserId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWHistoryBySetStampIdxKey newBySetStampIdxKey() {
		ISecureSecUserPWHistoryBySetStampIdxKey key = new SecureJpaSecUserPWHistoryBySetStampIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistoryBySetStampIdxKey ensureBySetStampIdxKey(ISecureSecUserPWHistoryBySetStampIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserPWHistoryBySetStampIdxKey) {
			return( (SecureJpaSecUserPWHistoryBySetStampIdxKey)key );
		}
		else {
			SecureJpaSecUserPWHistoryBySetStampIdxKey mapped = new SecureJpaSecUserPWHistoryBySetStampIdxKey();
			mapped.setRequiredPWSetStamp( key.getRequiredPWSetStamp() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWHistoryByReplacedStampIdxKey newByReplacedStampIdxKey() {
		ISecureSecUserPWHistoryByReplacedStampIdxKey key = new SecureJpaSecUserPWHistoryByReplacedStampIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistoryByReplacedStampIdxKey ensureByReplacedStampIdxKey(ISecureSecUserPWHistoryByReplacedStampIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserPWHistoryByReplacedStampIdxKey) {
			return( (SecureJpaSecUserPWHistoryByReplacedStampIdxKey)key );
		}
		else {
			SecureJpaSecUserPWHistoryByReplacedStampIdxKey mapped = new SecureJpaSecUserPWHistoryByReplacedStampIdxKey();
			mapped.setRequiredPWReplacedStamp( key.getRequiredPWReplacedStamp() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWHistory newRec() {
        ISecureSecUserPWHistory rec = new SecureJpaSecUserPWHistory();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory ensureRec(ISecureSecUserPWHistory rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecUserPWHistory) {
			return( (SecureJpaSecUserPWHistory)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecUserPWHistory.CLASS_CODE: {
					SecureJpaSecUserPWHistory mapped = new SecureJpaSecUserPWHistory();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUserPWHistory",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUserPWHistory");
			}
		}
	}

    @Override
    public ISecureSecUserPWHistoryH newHRec() {
        ISecureSecUserPWHistoryH hrec = new SecureJpaSecUserPWHistoryH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistoryH ensureHRec(ISecureSecUserPWHistoryH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecUserPWHistoryH) {
			return( (SecureJpaSecUserPWHistoryH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecUserPWHistory.CLASS_CODE: {
					SecureJpaSecUserPWHistoryH mapped = new SecureJpaSecUserPWHistoryH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUserPWHistory",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUserPWHistory");
			}
		}
	}
}
