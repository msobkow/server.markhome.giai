
// Description: Java 25 Factory service implementation for SecUserPWReset JPA objects

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
 *	Java 25 Factory service implementation for SecUserPWReset JPA objects.
 */
public class SecureJpaSecUserPWResetFactoryService
    implements ISecureSecUserPWResetFactory
{
    public BusModelJpaSecUserPWResetFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWResetHPKey newHPKey() {
        ISecureSecUserPWResetHPKey hpkey = new SecureJpaSecUserPWResetHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWResetHPKey ensureHPKey(ISecureSecUserPWResetHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecUserPWResetHPKey) {
			return( (SecureJpaSecUserPWResetHPKey)key );
		}
		else {
			SecureJpaSecUserPWResetHPKey mapped = new SecureJpaSecUserPWResetHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecUserId( key.getRequiredSecUserId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWResetByUUuid6IdxKey newByUUuid6IdxKey() {
		ISecureSecUserPWResetByUUuid6IdxKey key = new SecureJpaSecUserPWResetByUUuid6IdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWResetByUUuid6IdxKey ensureByUUuid6IdxKey(ISecureSecUserPWResetByUUuid6IdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserPWResetByUUuid6IdxKey) {
			return( (SecureJpaSecUserPWResetByUUuid6IdxKey)key );
		}
		else {
			SecureJpaSecUserPWResetByUUuid6IdxKey mapped = new SecureJpaSecUserPWResetByUUuid6IdxKey();
			mapped.setRequiredPasswordResetUuid6( key.getRequiredPasswordResetUuid6() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWResetBySentEMAddrIdxKey newBySentEMAddrIdxKey() {
		ISecureSecUserPWResetBySentEMAddrIdxKey key = new SecureJpaSecUserPWResetBySentEMAddrIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWResetBySentEMAddrIdxKey ensureBySentEMAddrIdxKey(ISecureSecUserPWResetBySentEMAddrIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserPWResetBySentEMAddrIdxKey) {
			return( (SecureJpaSecUserPWResetBySentEMAddrIdxKey)key );
		}
		else {
			SecureJpaSecUserPWResetBySentEMAddrIdxKey mapped = new SecureJpaSecUserPWResetBySentEMAddrIdxKey();
			mapped.setRequiredSentToEMailAddr( key.getRequiredSentToEMailAddr() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWResetByNewAcctIdxKey newByNewAcctIdxKey() {
		ISecureSecUserPWResetByNewAcctIdxKey key = new SecureJpaSecUserPWResetByNewAcctIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWResetByNewAcctIdxKey ensureByNewAcctIdxKey(ISecureSecUserPWResetByNewAcctIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserPWResetByNewAcctIdxKey) {
			return( (SecureJpaSecUserPWResetByNewAcctIdxKey)key );
		}
		else {
			SecureJpaSecUserPWResetByNewAcctIdxKey mapped = new SecureJpaSecUserPWResetByNewAcctIdxKey();
			mapped.setRequiredNewAccount( key.getRequiredNewAccount() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserPWReset newRec() {
        ISecureSecUserPWReset rec = new SecureJpaSecUserPWReset();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWReset ensureRec(ISecureSecUserPWReset rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecUserPWReset) {
			return( (SecureJpaSecUserPWReset)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecUserPWReset.CLASS_CODE: {
					SecureJpaSecUserPWReset mapped = new SecureJpaSecUserPWReset();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUserPWReset",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUserPWReset");
			}
		}
	}

    @Override
    public ISecureSecUserPWResetH newHRec() {
        ISecureSecUserPWResetH hrec = new SecureJpaSecUserPWResetH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWResetH ensureHRec(ISecureSecUserPWResetH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecUserPWResetH) {
			return( (SecureJpaSecUserPWResetH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecUserPWReset.CLASS_CODE: {
					SecureJpaSecUserPWResetH mapped = new SecureJpaSecUserPWResetH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUserPWReset",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUserPWReset");
			}
		}
	}
}
