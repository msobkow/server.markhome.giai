
// Description: Java 25 Factory service implementation for ISOLang JPA objects

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
 *	Java 25 Factory service implementation for ISOLang JPA objects.
 */
public class SecureJpaISOLangFactoryService
    implements ISecureISOLangFactory
{
    public BusModelJpaISOLangFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureISOLangHPKey newHPKey() {
        ISecureISOLangHPKey hpkey = new SecureJpaISOLangHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLangHPKey ensureHPKey(ISecureISOLangHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaISOLangHPKey) {
			return( (SecureJpaISOLangHPKey)key );
		}
		else {
			SecureJpaISOLangHPKey mapped = new SecureJpaISOLangHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredISOLangId( key.getRequiredISOLangId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureISOLangByCode3IdxKey newByCode3IdxKey() {
		ISecureISOLangByCode3IdxKey key = new SecureJpaISOLangByCode3IdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLangByCode3IdxKey ensureByCode3IdxKey(ISecureISOLangByCode3IdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaISOLangByCode3IdxKey) {
			return( (SecureJpaISOLangByCode3IdxKey)key );
		}
		else {
			SecureJpaISOLangByCode3IdxKey mapped = new SecureJpaISOLangByCode3IdxKey();
			mapped.setRequiredISO6392Code( key.getRequiredISO6392Code() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureISOLangByCode2IdxKey newByCode2IdxKey() {
		ISecureISOLangByCode2IdxKey key = new SecureJpaISOLangByCode2IdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLangByCode2IdxKey ensureByCode2IdxKey(ISecureISOLangByCode2IdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaISOLangByCode2IdxKey) {
			return( (SecureJpaISOLangByCode2IdxKey)key );
		}
		else {
			SecureJpaISOLangByCode2IdxKey mapped = new SecureJpaISOLangByCode2IdxKey();
			mapped.setOptionalISO6391Code( key.getOptionalISO6391Code() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureISOLang newRec() {
        ISecureISOLang rec = new SecureJpaISOLang();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLang ensureRec(ISecureISOLang rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaISOLang) {
			return( (SecureJpaISOLang)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureISOLang.CLASS_CODE: {
					SecureJpaISOLang mapped = new SecureJpaISOLang();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOLang",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOLang");
			}
		}
	}

    @Override
    public ISecureISOLangH newHRec() {
        ISecureISOLangH hrec = new SecureJpaISOLangH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLangH ensureHRec(ISecureISOLangH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaISOLangH) {
			return( (SecureJpaISOLangH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureISOLang.CLASS_CODE: {
					SecureJpaISOLangH mapped = new SecureJpaISOLangH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOLang",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOLang");
			}
		}
	}
}
