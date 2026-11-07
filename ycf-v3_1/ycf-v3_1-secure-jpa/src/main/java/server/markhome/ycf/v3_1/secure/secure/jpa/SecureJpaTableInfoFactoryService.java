
// Description: Java 25 Factory service implementation for TableInfo JPA objects

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
 *	Java 25 Factory service implementation for TableInfo JPA objects.
 */
public class SecureJpaTableInfoFactoryService
    implements ISecureTableInfoFactory
{
    public BusModelJpaTableInfoFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureTableInfoHPKey newHPKey() {
        ISecureTableInfoHPKey hpkey = new SecureJpaTableInfoHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfoHPKey ensureHPKey(ISecureTableInfoHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaTableInfoHPKey) {
			return( (SecureJpaTableInfoHPKey)key );
		}
		else {
			SecureJpaTableInfoHPKey mapped = new SecureJpaTableInfoHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredTableInfoId( key.getRequiredTableInfoId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureTableInfoByTableNameIdxKey newByTableNameIdxKey() {
		ISecureTableInfoByTableNameIdxKey key = new SecureJpaTableInfoByTableNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfoByTableNameIdxKey ensureByTableNameIdxKey(ISecureTableInfoByTableNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaTableInfoByTableNameIdxKey) {
			return( (SecureJpaTableInfoByTableNameIdxKey)key );
		}
		else {
			SecureJpaTableInfoByTableNameIdxKey mapped = new SecureJpaTableInfoByTableNameIdxKey();
			mapped.setRequiredTableName( key.getRequiredTableName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureTableInfoBySuperNameIdxKey newBySuperNameIdxKey() {
		ISecureTableInfoBySuperNameIdxKey key = new SecureJpaTableInfoBySuperNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfoBySuperNameIdxKey ensureBySuperNameIdxKey(ISecureTableInfoBySuperNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaTableInfoBySuperNameIdxKey) {
			return( (SecureJpaTableInfoBySuperNameIdxKey)key );
		}
		else {
			SecureJpaTableInfoBySuperNameIdxKey mapped = new SecureJpaTableInfoBySuperNameIdxKey();
			mapped.setOptionalSuperName( key.getOptionalSuperName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureTableInfoBySchemaNameIdxKey newBySchemaNameIdxKey() {
		ISecureTableInfoBySchemaNameIdxKey key = new SecureJpaTableInfoBySchemaNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfoBySchemaNameIdxKey ensureBySchemaNameIdxKey(ISecureTableInfoBySchemaNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaTableInfoBySchemaNameIdxKey) {
			return( (SecureJpaTableInfoBySchemaNameIdxKey)key );
		}
		else {
			SecureJpaTableInfoBySchemaNameIdxKey mapped = new SecureJpaTableInfoBySchemaNameIdxKey();
			mapped.setRequiredSchemaName( key.getRequiredSchemaName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureTableInfoBySchemaBkCodeIdxKey newBySchemaBkCodeIdxKey() {
		ISecureTableInfoBySchemaBkCodeIdxKey key = new SecureJpaTableInfoBySchemaBkCodeIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfoBySchemaBkCodeIdxKey ensureBySchemaBkCodeIdxKey(ISecureTableInfoBySchemaBkCodeIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaTableInfoBySchemaBkCodeIdxKey) {
			return( (SecureJpaTableInfoBySchemaBkCodeIdxKey)key );
		}
		else {
			SecureJpaTableInfoBySchemaBkCodeIdxKey mapped = new SecureJpaTableInfoBySchemaBkCodeIdxKey();
			mapped.setRequiredSchemaName( key.getRequiredSchemaName() );
			mapped.setRequiredBackingClassCode( key.getRequiredBackingClassCode() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureTableInfoBySchemaRTCodeIdxKey newBySchemaRTCodeIdxKey() {
		ISecureTableInfoBySchemaRTCodeIdxKey key = new SecureJpaTableInfoBySchemaRTCodeIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfoBySchemaRTCodeIdxKey ensureBySchemaRTCodeIdxKey(ISecureTableInfoBySchemaRTCodeIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaTableInfoBySchemaRTCodeIdxKey) {
			return( (SecureJpaTableInfoBySchemaRTCodeIdxKey)key );
		}
		else {
			SecureJpaTableInfoBySchemaRTCodeIdxKey mapped = new SecureJpaTableInfoBySchemaRTCodeIdxKey();
			mapped.setRequiredRuntimeClassCode( key.getRequiredRuntimeClassCode() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureTableInfo newRec() {
        ISecureTableInfo rec = new SecureJpaTableInfo();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo ensureRec(ISecureTableInfo rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaTableInfo) {
			return( (SecureJpaTableInfo)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureTableInfo.CLASS_CODE: {
					SecureJpaTableInfo mapped = new SecureJpaTableInfo();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureTableInfo",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureTableInfo");
			}
		}
	}

    @Override
    public ISecureTableInfoH newHRec() {
        ISecureTableInfoH hrec = new SecureJpaTableInfoH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfoH ensureHRec(ISecureTableInfoH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaTableInfoH) {
			return( (SecureJpaTableInfoH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureTableInfo.CLASS_CODE: {
					SecureJpaTableInfoH mapped = new SecureJpaTableInfoH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureTableInfo",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureTableInfo");
			}
		}
	}
}
