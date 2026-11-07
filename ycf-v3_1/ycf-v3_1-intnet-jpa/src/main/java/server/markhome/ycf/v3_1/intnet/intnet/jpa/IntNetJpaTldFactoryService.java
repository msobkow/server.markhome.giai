
// Description: Java 25 Factory service implementation for Tld JPA objects

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

package server.markhome.ycf.v3_1.intnet.intnet.jpa;

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
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

/*
 *	Java 25 Factory service implementation for Tld JPA objects.
 */
public class IntNetJpaTldFactoryService
    implements IIntNetTldFactory
{
    public BusModelJpaTldFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetTldHPKey newHPKey() {
        IIntNetTldHPKey hpkey = new IntNetJpaTldHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTldHPKey ensureHPKey(IIntNetTldHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetJpaTldHPKey) {
			return( (IntNetJpaTldHPKey)key );
		}
		else {
			IntNetJpaTldHPKey mapped = new IntNetJpaTldHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredId( key.getRequiredId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetTldByTenantIdxKey newByTenantIdxKey() {
		IIntNetTldByTenantIdxKey key = new IntNetJpaTldByTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTldByTenantIdxKey ensureByTenantIdxKey(IIntNetTldByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaTldByTenantIdxKey) {
			return( (IntNetJpaTldByTenantIdxKey)key );
		}
		else {
			IntNetJpaTldByTenantIdxKey mapped = new IntNetJpaTldByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetTldByNameIdxKey newByNameIdxKey() {
		IIntNetTldByNameIdxKey key = new IntNetJpaTldByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTldByNameIdxKey ensureByNameIdxKey(IIntNetTldByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaTldByNameIdxKey) {
			return( (IntNetJpaTldByNameIdxKey)key );
		}
		else {
			IntNetJpaTldByNameIdxKey mapped = new IntNetJpaTldByNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetTld newRec() {
        IIntNetTld rec = new IntNetJpaTld();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTld ensureRec(IIntNetTld rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetJpaTld) {
			return( (IntNetJpaTld)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IIntNetTld.CLASS_CODE: {
					IntNetJpaTld mapped = new IntNetJpaTld();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetTld",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetTld");
			}
		}
	}

    @Override
    public IIntNetTldH newHRec() {
        IIntNetTldH hrec = new IntNetJpaTldH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTldH ensureHRec(IIntNetTldH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetJpaTldH) {
			return( (IntNetJpaTldH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IIntNetTld.CLASS_CODE: {
					IntNetJpaTldH mapped = new IntNetJpaTldH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetTld",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetTld");
			}
		}
	}
}
