
// Description: Java 25 Factory service implementation for SecTentGrpMemb JPA objects

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
 *	Java 25 Factory service implementation for SecTentGrpMemb JPA objects.
 */
public class SecureJpaSecTentGrpMembFactoryService
    implements ISecureSecTentGrpMembFactory
{
    public BusModelJpaSecTentGrpMembFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentGrpMembPKey newPKey() {
        ISecureSecTentGrpMembPKey pkey = new SecureJpaSecTentGrpMembPKey();
        return( pkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMembPKey ensurePKey(ISecureSecTentGrpMembPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecTentGrpMembPKey) {
			return( (SecureJpaSecTentGrpMembPKey)key );
		}
		else {
			SecureJpaSecTentGrpMembPKey mapped = new SecureJpaSecTentGrpMembPKey();
			mapped.setRequiredSecTentGrpId( key.getRequiredSecTentGrpId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentGrpMembHPKey newHPKey() {
        ISecureSecTentGrpMembHPKey hpkey = new SecureJpaSecTentGrpMembHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMembHPKey ensureHPKey(ISecureSecTentGrpMembHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecTentGrpMembHPKey) {
			return( (SecureJpaSecTentGrpMembHPKey)key );
		}
		else {
			SecureJpaSecTentGrpMembHPKey mapped = new SecureJpaSecTentGrpMembHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecTentGrpId( key.getRequiredSecTentGrpId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentGrpMembByTentGrpIdxKey newByTentGrpIdxKey() {
		ISecureSecTentGrpMembByTentGrpIdxKey key = new SecureJpaSecTentGrpMembByTentGrpIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMembByTentGrpIdxKey ensureByTentGrpIdxKey(ISecureSecTentGrpMembByTentGrpIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecTentGrpMembByTentGrpIdxKey) {
			return( (SecureJpaSecTentGrpMembByTentGrpIdxKey)key );
		}
		else {
			SecureJpaSecTentGrpMembByTentGrpIdxKey mapped = new SecureJpaSecTentGrpMembByTentGrpIdxKey();
			mapped.setRequiredSecTentGrpId( key.getRequiredSecTentGrpId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentGrpMembByUserIdxKey newByUserIdxKey() {
		ISecureSecTentGrpMembByUserIdxKey key = new SecureJpaSecTentGrpMembByUserIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMembByUserIdxKey ensureByUserIdxKey(ISecureSecTentGrpMembByUserIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecTentGrpMembByUserIdxKey) {
			return( (SecureJpaSecTentGrpMembByUserIdxKey)key );
		}
		else {
			SecureJpaSecTentGrpMembByUserIdxKey mapped = new SecureJpaSecTentGrpMembByUserIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecTentGrpMemb newRec() {
        ISecureSecTentGrpMemb rec = new SecureJpaSecTentGrpMemb();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMemb ensureRec(ISecureSecTentGrpMemb rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecTentGrpMemb) {
			return( (SecureJpaSecTentGrpMemb)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecTentGrpMemb.CLASS_CODE: {
					SecureJpaSecTentGrpMemb mapped = new SecureJpaSecTentGrpMemb();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentGrpMemb",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecTentGrpMemb");
			}
		}
	}

    @Override
    public ISecureSecTentGrpMembH newHRec() {
        ISecureSecTentGrpMembH hrec = new SecureJpaSecTentGrpMembH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMembH ensureHRec(ISecureSecTentGrpMembH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecTentGrpMembH) {
			return( (SecureJpaSecTentGrpMembH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecTentGrpMemb.CLASS_CODE: {
					SecureJpaSecTentGrpMembH mapped = new SecureJpaSecTentGrpMembH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentGrpMemb",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecTentGrpMemb");
			}
		}
	}
}
