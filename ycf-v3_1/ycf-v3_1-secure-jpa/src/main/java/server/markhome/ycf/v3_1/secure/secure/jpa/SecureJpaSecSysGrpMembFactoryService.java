
// Description: Java 25 Factory service implementation for SecSysGrpMemb JPA objects

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
 *	Java 25 Factory service implementation for SecSysGrpMemb JPA objects.
 */
public class SecureJpaSecSysGrpMembFactoryService
    implements ISecureSecSysGrpMembFactory
{
    public BusModelJpaSecSysGrpMembFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysGrpMembPKey newPKey() {
        ISecureSecSysGrpMembPKey pkey = new SecureJpaSecSysGrpMembPKey();
        return( pkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMembPKey ensurePKey(ISecureSecSysGrpMembPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSysGrpMembPKey) {
			return( (SecureJpaSecSysGrpMembPKey)key );
		}
		else {
			SecureJpaSecSysGrpMembPKey mapped = new SecureJpaSecSysGrpMembPKey();
			mapped.setRequiredSecSysGrpId( key.getRequiredSecSysGrpId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysGrpMembHPKey newHPKey() {
        ISecureSecSysGrpMembHPKey hpkey = new SecureJpaSecSysGrpMembHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMembHPKey ensureHPKey(ISecureSecSysGrpMembHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecSysGrpMembHPKey) {
			return( (SecureJpaSecSysGrpMembHPKey)key );
		}
		else {
			SecureJpaSecSysGrpMembHPKey mapped = new SecureJpaSecSysGrpMembHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecSysGrpId( key.getRequiredSecSysGrpId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysGrpMembBySysGrpIdxKey newBySysGrpIdxKey() {
		ISecureSecSysGrpMembBySysGrpIdxKey key = new SecureJpaSecSysGrpMembBySysGrpIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMembBySysGrpIdxKey ensureBySysGrpIdxKey(ISecureSecSysGrpMembBySysGrpIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSysGrpMembBySysGrpIdxKey) {
			return( (SecureJpaSecSysGrpMembBySysGrpIdxKey)key );
		}
		else {
			SecureJpaSecSysGrpMembBySysGrpIdxKey mapped = new SecureJpaSecSysGrpMembBySysGrpIdxKey();
			mapped.setRequiredSecSysGrpId( key.getRequiredSecSysGrpId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysGrpMembByLoginIdxKey newByLoginIdxKey() {
		ISecureSecSysGrpMembByLoginIdxKey key = new SecureJpaSecSysGrpMembByLoginIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMembByLoginIdxKey ensureByLoginIdxKey(ISecureSecSysGrpMembByLoginIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSysGrpMembByLoginIdxKey) {
			return( (SecureJpaSecSysGrpMembByLoginIdxKey)key );
		}
		else {
			SecureJpaSecSysGrpMembByLoginIdxKey mapped = new SecureJpaSecSysGrpMembByLoginIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysGrpMemb newRec() {
        ISecureSecSysGrpMemb rec = new SecureJpaSecSysGrpMemb();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMemb ensureRec(ISecureSecSysGrpMemb rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecSysGrpMemb) {
			return( (SecureJpaSecSysGrpMemb)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecSysGrpMemb.CLASS_CODE: {
					SecureJpaSecSysGrpMemb mapped = new SecureJpaSecSysGrpMemb();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysGrpMemb",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysGrpMemb");
			}
		}
	}

    @Override
    public ISecureSecSysGrpMembH newHRec() {
        ISecureSecSysGrpMembH hrec = new SecureJpaSecSysGrpMembH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMembH ensureHRec(ISecureSecSysGrpMembH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecSysGrpMembH) {
			return( (SecureJpaSecSysGrpMembH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecSysGrpMemb.CLASS_CODE: {
					SecureJpaSecSysGrpMembH mapped = new SecureJpaSecSysGrpMembH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysGrpMemb",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysGrpMemb");
			}
		}
	}
}
