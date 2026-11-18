
// Description: Java 25 Factory service implementation for MinorVersion JPA objects

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
 *	Java 25 Factory service implementation for MinorVersion JPA objects.
 */
public class IntNetJpaMinorVersionFactoryService
    implements IIntNetMinorVersionFactory
{
    public BusModelJpaMinorVersionFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMinorVersionHPKey newHPKey() {
        IIntNetMinorVersionHPKey hpkey = new IntNetJpaMinorVersionHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersionHPKey ensureHPKey(IIntNetMinorVersionHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetJpaMinorVersionHPKey) {
			return( (IntNetJpaMinorVersionHPKey)key );
		}
		else {
			IntNetJpaMinorVersionHPKey mapped = new IntNetJpaMinorVersionHPKey();
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
    public IIntNetMinorVersionByTenantIdxKey newByTenantIdxKey() {
		IIntNetMinorVersionByTenantIdxKey key = new IntNetJpaMinorVersionByTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersionByTenantIdxKey ensureByTenantIdxKey(IIntNetMinorVersionByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaMinorVersionByTenantIdxKey) {
			return( (IntNetJpaMinorVersionByTenantIdxKey)key );
		}
		else {
			IntNetJpaMinorVersionByTenantIdxKey mapped = new IntNetJpaMinorVersionByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMinorVersionByMajorVerIdxKey newByMajorVerIdxKey() {
		IIntNetMinorVersionByMajorVerIdxKey key = new IntNetJpaMinorVersionByMajorVerIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersionByMajorVerIdxKey ensureByMajorVerIdxKey(IIntNetMinorVersionByMajorVerIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaMinorVersionByMajorVerIdxKey) {
			return( (IntNetJpaMinorVersionByMajorVerIdxKey)key );
		}
		else {
			IntNetJpaMinorVersionByMajorVerIdxKey mapped = new IntNetJpaMinorVersionByMajorVerIdxKey();
			mapped.setRequiredMajorVersionId( key.getRequiredMajorVersionId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMinorVersionByNameIdxKey newByNameIdxKey() {
		IIntNetMinorVersionByNameIdxKey key = new IntNetJpaMinorVersionByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersionByNameIdxKey ensureByNameIdxKey(IIntNetMinorVersionByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaMinorVersionByNameIdxKey) {
			return( (IntNetJpaMinorVersionByNameIdxKey)key );
		}
		else {
			IntNetJpaMinorVersionByNameIdxKey mapped = new IntNetJpaMinorVersionByNameIdxKey();
			mapped.setRequiredMajorVersionId( key.getRequiredMajorVersionId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMinorVersion newRec() {
        IIntNetMinorVersion rec = new IntNetJpaMinorVersion();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersion ensureRec(IIntNetMinorVersion rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetJpaMinorVersion) {
			return( (IntNetJpaMinorVersion)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IIntNetMinorVersion.CLASS_CODE: {
					IntNetJpaMinorVersion mapped = new IntNetJpaMinorVersion();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMinorVersion",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMinorVersion");
			}
		}
	}

    @Override
    public IIntNetMinorVersionH newHRec() {
        IIntNetMinorVersionH hrec = new IntNetJpaMinorVersionH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersionH ensureHRec(IIntNetMinorVersionH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetJpaMinorVersionH) {
			return( (IntNetJpaMinorVersionH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IIntNetMinorVersion.CLASS_CODE: {
					IntNetJpaMinorVersionH mapped = new IntNetJpaMinorVersionH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMinorVersion",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMinorVersion");
			}
		}
	}
}
