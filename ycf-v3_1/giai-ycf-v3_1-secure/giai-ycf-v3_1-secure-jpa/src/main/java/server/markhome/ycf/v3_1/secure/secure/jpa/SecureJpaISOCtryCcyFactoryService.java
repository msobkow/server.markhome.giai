
// Description: Java 25 Factory service implementation for ISOCtryCcy JPA objects

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
 *	Java 25 Factory service implementation for ISOCtryCcy JPA objects.
 */
public class SecureJpaISOCtryCcyFactoryService
    implements ISecureISOCtryCcyFactory
{
    public BusModelJpaISOCtryCcyFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureISOCtryCcyPKey newPKey() {
        ISecureISOCtryCcyPKey pkey = new SecureJpaISOCtryCcyPKey();
        return( pkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcyPKey ensurePKey(ISecureISOCtryCcyPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaISOCtryCcyPKey) {
			return( (SecureJpaISOCtryCcyPKey)key );
		}
		else {
			SecureJpaISOCtryCcyPKey mapped = new SecureJpaISOCtryCcyPKey();
			mapped.setRequiredISOCtryId( key.getRequiredISOCtryId() );
			mapped.setRequiredISOCcyId( key.getRequiredISOCcyId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureISOCtryCcyHPKey newHPKey() {
        ISecureISOCtryCcyHPKey hpkey = new SecureJpaISOCtryCcyHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcyHPKey ensureHPKey(ISecureISOCtryCcyHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaISOCtryCcyHPKey) {
			return( (SecureJpaISOCtryCcyHPKey)key );
		}
		else {
			SecureJpaISOCtryCcyHPKey mapped = new SecureJpaISOCtryCcyHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredISOCtryId( key.getRequiredISOCtryId() );
			mapped.setRequiredISOCcyId( key.getRequiredISOCcyId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureISOCtryCcyByCtryIdxKey newByCtryIdxKey() {
		ISecureISOCtryCcyByCtryIdxKey key = new SecureJpaISOCtryCcyByCtryIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcyByCtryIdxKey ensureByCtryIdxKey(ISecureISOCtryCcyByCtryIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaISOCtryCcyByCtryIdxKey) {
			return( (SecureJpaISOCtryCcyByCtryIdxKey)key );
		}
		else {
			SecureJpaISOCtryCcyByCtryIdxKey mapped = new SecureJpaISOCtryCcyByCtryIdxKey();
			mapped.setRequiredISOCtryId( key.getRequiredISOCtryId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureISOCtryCcyByCcyIdxKey newByCcyIdxKey() {
		ISecureISOCtryCcyByCcyIdxKey key = new SecureJpaISOCtryCcyByCcyIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcyByCcyIdxKey ensureByCcyIdxKey(ISecureISOCtryCcyByCcyIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaISOCtryCcyByCcyIdxKey) {
			return( (SecureJpaISOCtryCcyByCcyIdxKey)key );
		}
		else {
			SecureJpaISOCtryCcyByCcyIdxKey mapped = new SecureJpaISOCtryCcyByCcyIdxKey();
			mapped.setRequiredISOCcyId( key.getRequiredISOCcyId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureISOCtryCcy newRec() {
        ISecureISOCtryCcy rec = new SecureJpaISOCtryCcy();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcy ensureRec(ISecureISOCtryCcy rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaISOCtryCcy) {
			return( (SecureJpaISOCtryCcy)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureISOCtryCcy.CLASS_CODE: {
					SecureJpaISOCtryCcy mapped = new SecureJpaISOCtryCcy();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOCtryCcy",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOCtryCcy");
			}
		}
	}

    @Override
    public ISecureISOCtryCcyH newHRec() {
        ISecureISOCtryCcyH hrec = new SecureJpaISOCtryCcyH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcyH ensureHRec(ISecureISOCtryCcyH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaISOCtryCcyH) {
			return( (SecureJpaISOCtryCcyH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureISOCtryCcy.CLASS_CODE: {
					SecureJpaISOCtryCcyH mapped = new SecureJpaISOCtryCcyH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOCtryCcy",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOCtryCcy");
			}
		}
	}
}
