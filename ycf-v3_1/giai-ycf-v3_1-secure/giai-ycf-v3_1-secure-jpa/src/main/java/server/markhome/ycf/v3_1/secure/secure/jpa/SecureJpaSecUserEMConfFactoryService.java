
// Description: Java 25 Factory service implementation for SecUserEMConf JPA objects

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
 *	Java 25 Factory service implementation for SecUserEMConf JPA objects.
 */
public class SecureJpaSecUserEMConfFactoryService
    implements ISecureSecUserEMConfFactory
{
    public BusModelJpaSecUserEMConfFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserEMConfHPKey newHPKey() {
        ISecureSecUserEMConfHPKey hpkey = new SecureJpaSecUserEMConfHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConfHPKey ensureHPKey(ISecureSecUserEMConfHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecUserEMConfHPKey) {
			return( (SecureJpaSecUserEMConfHPKey)key );
		}
		else {
			SecureJpaSecUserEMConfHPKey mapped = new SecureJpaSecUserEMConfHPKey();
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
    public ISecureSecUserEMConfByUUuid6IdxKey newByUUuid6IdxKey() {
		ISecureSecUserEMConfByUUuid6IdxKey key = new SecureJpaSecUserEMConfByUUuid6IdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConfByUUuid6IdxKey ensureByUUuid6IdxKey(ISecureSecUserEMConfByUUuid6IdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserEMConfByUUuid6IdxKey) {
			return( (SecureJpaSecUserEMConfByUUuid6IdxKey)key );
		}
		else {
			SecureJpaSecUserEMConfByUUuid6IdxKey mapped = new SecureJpaSecUserEMConfByUUuid6IdxKey();
			mapped.setRequiredEMConfirmationUuid6( key.getRequiredEMConfirmationUuid6() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserEMConfByConfEMAddrIdxKey newByConfEMAddrIdxKey() {
		ISecureSecUserEMConfByConfEMAddrIdxKey key = new SecureJpaSecUserEMConfByConfEMAddrIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConfByConfEMAddrIdxKey ensureByConfEMAddrIdxKey(ISecureSecUserEMConfByConfEMAddrIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserEMConfByConfEMAddrIdxKey) {
			return( (SecureJpaSecUserEMConfByConfEMAddrIdxKey)key );
		}
		else {
			SecureJpaSecUserEMConfByConfEMAddrIdxKey mapped = new SecureJpaSecUserEMConfByConfEMAddrIdxKey();
			mapped.setRequiredConfirmEMailAddr( key.getRequiredConfirmEMailAddr() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserEMConfBySentStampIdxKey newBySentStampIdxKey() {
		ISecureSecUserEMConfBySentStampIdxKey key = new SecureJpaSecUserEMConfBySentStampIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConfBySentStampIdxKey ensureBySentStampIdxKey(ISecureSecUserEMConfBySentStampIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserEMConfBySentStampIdxKey) {
			return( (SecureJpaSecUserEMConfBySentStampIdxKey)key );
		}
		else {
			SecureJpaSecUserEMConfBySentStampIdxKey mapped = new SecureJpaSecUserEMConfBySentStampIdxKey();
			mapped.setRequiredEMailSentStamp( key.getRequiredEMailSentStamp() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserEMConfByNewAcctIdxKey newByNewAcctIdxKey() {
		ISecureSecUserEMConfByNewAcctIdxKey key = new SecureJpaSecUserEMConfByNewAcctIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConfByNewAcctIdxKey ensureByNewAcctIdxKey(ISecureSecUserEMConfByNewAcctIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserEMConfByNewAcctIdxKey) {
			return( (SecureJpaSecUserEMConfByNewAcctIdxKey)key );
		}
		else {
			SecureJpaSecUserEMConfByNewAcctIdxKey mapped = new SecureJpaSecUserEMConfByNewAcctIdxKey();
			mapped.setRequiredNewAccount( key.getRequiredNewAccount() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserEMConf newRec() {
        ISecureSecUserEMConf rec = new SecureJpaSecUserEMConf();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConf ensureRec(ISecureSecUserEMConf rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecUserEMConf) {
			return( (SecureJpaSecUserEMConf)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecUserEMConf.CLASS_CODE: {
					SecureJpaSecUserEMConf mapped = new SecureJpaSecUserEMConf();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUserEMConf",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUserEMConf");
			}
		}
	}

    @Override
    public ISecureSecUserEMConfH newHRec() {
        ISecureSecUserEMConfH hrec = new SecureJpaSecUserEMConfH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConfH ensureHRec(ISecureSecUserEMConfH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecUserEMConfH) {
			return( (SecureJpaSecUserEMConfH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecUserEMConf.CLASS_CODE: {
					SecureJpaSecUserEMConfH mapped = new SecureJpaSecUserEMConfH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUserEMConf",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUserEMConf");
			}
		}
	}
}
