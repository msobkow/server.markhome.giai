
// Description: Java 25 Factory service implementation for SecUser JPA objects

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
 *	Java 25 Factory service implementation for SecUser JPA objects.
 */
public class SecureJpaSecUserFactoryService
    implements ISecureSecUserFactory
{
    public BusModelJpaSecUserFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserHPKey newHPKey() {
        ISecureSecUserHPKey hpkey = new SecureJpaSecUserHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserHPKey ensureHPKey(ISecureSecUserHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecUserHPKey) {
			return( (SecureJpaSecUserHPKey)key );
		}
		else {
			SecureJpaSecUserHPKey mapped = new SecureJpaSecUserHPKey();
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
    public ISecureSecUserByULoginIdxKey newByULoginIdxKey() {
		ISecureSecUserByULoginIdxKey key = new SecureJpaSecUserByULoginIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserByULoginIdxKey ensureByULoginIdxKey(ISecureSecUserByULoginIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserByULoginIdxKey) {
			return( (SecureJpaSecUserByULoginIdxKey)key );
		}
		else {
			SecureJpaSecUserByULoginIdxKey mapped = new SecureJpaSecUserByULoginIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUserByEMAddrIdxKey newByEMAddrIdxKey() {
		ISecureSecUserByEMAddrIdxKey key = new SecureJpaSecUserByEMAddrIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserByEMAddrIdxKey ensureByEMAddrIdxKey(ISecureSecUserByEMAddrIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecUserByEMAddrIdxKey) {
			return( (SecureJpaSecUserByEMAddrIdxKey)key );
		}
		else {
			SecureJpaSecUserByEMAddrIdxKey mapped = new SecureJpaSecUserByEMAddrIdxKey();
			mapped.setRequiredEMailAddress( key.getRequiredEMailAddress() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecUser newRec() {
        ISecureSecUser rec = new SecureJpaSecUser();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUser ensureRec(ISecureSecUser rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecUser) {
			return( (SecureJpaSecUser)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecUser.CLASS_CODE: {
					SecureJpaSecUser mapped = new SecureJpaSecUser();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUser",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUser");
			}
		}
	}

    @Override
    public ISecureSecUserH newHRec() {
        ISecureSecUserH hrec = new SecureJpaSecUserH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserH ensureHRec(ISecureSecUserH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecUserH) {
			return( (SecureJpaSecUserH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecUser.CLASS_CODE: {
					SecureJpaSecUserH mapped = new SecureJpaSecUserH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUser",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUser");
			}
		}
	}
}
