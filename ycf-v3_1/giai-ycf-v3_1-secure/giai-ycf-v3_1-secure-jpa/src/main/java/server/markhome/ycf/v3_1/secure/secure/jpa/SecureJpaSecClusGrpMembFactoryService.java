
// Description: Java 25 Factory service implementation for SecClusGrpMemb JPA objects

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
 *	Java 25 Factory service implementation for SecClusGrpMemb JPA objects.
 */
public class SecureJpaSecClusGrpMembFactoryService
    implements ISecureSecClusGrpMembFactory
{
    public BusModelJpaSecClusGrpMembFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusGrpMembPKey newPKey() {
        ISecureSecClusGrpMembPKey pkey = new SecureJpaSecClusGrpMembPKey();
        return( pkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrpMembPKey ensurePKey(ISecureSecClusGrpMembPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecClusGrpMembPKey) {
			return( (SecureJpaSecClusGrpMembPKey)key );
		}
		else {
			SecureJpaSecClusGrpMembPKey mapped = new SecureJpaSecClusGrpMembPKey();
			mapped.setRequiredSecClusGrpId( key.getRequiredSecClusGrpId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusGrpMembHPKey newHPKey() {
        ISecureSecClusGrpMembHPKey hpkey = new SecureJpaSecClusGrpMembHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrpMembHPKey ensureHPKey(ISecureSecClusGrpMembHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecClusGrpMembHPKey) {
			return( (SecureJpaSecClusGrpMembHPKey)key );
		}
		else {
			SecureJpaSecClusGrpMembHPKey mapped = new SecureJpaSecClusGrpMembHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecClusGrpId( key.getRequiredSecClusGrpId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusGrpMembByClusGrpIdxKey newByClusGrpIdxKey() {
		ISecureSecClusGrpMembByClusGrpIdxKey key = new SecureJpaSecClusGrpMembByClusGrpIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrpMembByClusGrpIdxKey ensureByClusGrpIdxKey(ISecureSecClusGrpMembByClusGrpIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecClusGrpMembByClusGrpIdxKey) {
			return( (SecureJpaSecClusGrpMembByClusGrpIdxKey)key );
		}
		else {
			SecureJpaSecClusGrpMembByClusGrpIdxKey mapped = new SecureJpaSecClusGrpMembByClusGrpIdxKey();
			mapped.setRequiredSecClusGrpId( key.getRequiredSecClusGrpId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusGrpMembByLoginIdxKey newByLoginIdxKey() {
		ISecureSecClusGrpMembByLoginIdxKey key = new SecureJpaSecClusGrpMembByLoginIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrpMembByLoginIdxKey ensureByLoginIdxKey(ISecureSecClusGrpMembByLoginIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecClusGrpMembByLoginIdxKey) {
			return( (SecureJpaSecClusGrpMembByLoginIdxKey)key );
		}
		else {
			SecureJpaSecClusGrpMembByLoginIdxKey mapped = new SecureJpaSecClusGrpMembByLoginIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecClusGrpMemb newRec() {
        ISecureSecClusGrpMemb rec = new SecureJpaSecClusGrpMemb();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrpMemb ensureRec(ISecureSecClusGrpMemb rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecClusGrpMemb) {
			return( (SecureJpaSecClusGrpMemb)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecClusGrpMemb.CLASS_CODE: {
					SecureJpaSecClusGrpMemb mapped = new SecureJpaSecClusGrpMemb();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecClusGrpMemb",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecClusGrpMemb");
			}
		}
	}

    @Override
    public ISecureSecClusGrpMembH newHRec() {
        ISecureSecClusGrpMembH hrec = new SecureJpaSecClusGrpMembH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrpMembH ensureHRec(ISecureSecClusGrpMembH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecClusGrpMembH) {
			return( (SecureJpaSecClusGrpMembH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecClusGrpMemb.CLASS_CODE: {
					SecureJpaSecClusGrpMembH mapped = new SecureJpaSecClusGrpMembH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecClusGrpMemb",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecClusGrpMemb");
			}
		}
	}
}
