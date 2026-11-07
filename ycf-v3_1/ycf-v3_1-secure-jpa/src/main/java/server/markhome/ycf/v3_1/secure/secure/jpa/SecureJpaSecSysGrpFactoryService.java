
// Description: Java 25 Factory service implementation for SecSysGrp JPA objects

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
 *	Java 25 Factory service implementation for SecSysGrp JPA objects.
 */
public class SecureJpaSecSysGrpFactoryService
    implements ISecureSecSysGrpFactory
{
    public BusModelJpaSecSysGrpFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysGrpHPKey newHPKey() {
        ISecureSecSysGrpHPKey hpkey = new SecureJpaSecSysGrpHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpHPKey ensureHPKey(ISecureSecSysGrpHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSecSysGrpHPKey) {
			return( (SecureJpaSecSysGrpHPKey)key );
		}
		else {
			SecureJpaSecSysGrpHPKey mapped = new SecureJpaSecSysGrpHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecSysGrpId( key.getRequiredSecSysGrpId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysGrpByUNameIdxKey newByUNameIdxKey() {
		ISecureSecSysGrpByUNameIdxKey key = new SecureJpaSecSysGrpByUNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpByUNameIdxKey ensureByUNameIdxKey(ISecureSecSysGrpByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSysGrpByUNameIdxKey) {
			return( (SecureJpaSecSysGrpByUNameIdxKey)key );
		}
		else {
			SecureJpaSecSysGrpByUNameIdxKey mapped = new SecureJpaSecSysGrpByUNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysGrpBySecLevelIdxKey newBySecLevelIdxKey() {
		ISecureSecSysGrpBySecLevelIdxKey key = new SecureJpaSecSysGrpBySecLevelIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpBySecLevelIdxKey ensureBySecLevelIdxKey(ISecureSecSysGrpBySecLevelIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSecSysGrpBySecLevelIdxKey) {
			return( (SecureJpaSecSysGrpBySecLevelIdxKey)key );
		}
		else {
			SecureJpaSecSysGrpBySecLevelIdxKey mapped = new SecureJpaSecSysGrpBySecLevelIdxKey();
			mapped.setRequiredSecLevel( key.getRequiredSecLevel() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSecSysGrp newRec() {
        ISecureSecSysGrp rec = new SecureJpaSecSysGrp();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrp ensureRec(ISecureSecSysGrp rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSecSysGrp) {
			return( (SecureJpaSecSysGrp)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSecSysGrp.CLASS_CODE: {
					SecureJpaSecSysGrp mapped = new SecureJpaSecSysGrp();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysGrp",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysGrp");
			}
		}
	}

    @Override
    public ISecureSecSysGrpH newHRec() {
        ISecureSecSysGrpH hrec = new SecureJpaSecSysGrpH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpH ensureHRec(ISecureSecSysGrpH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSecSysGrpH) {
			return( (SecureJpaSecSysGrpH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSecSysGrp.CLASS_CODE: {
					SecureJpaSecSysGrpH mapped = new SecureJpaSecSysGrpH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysGrp",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysGrp");
			}
		}
	}
}
