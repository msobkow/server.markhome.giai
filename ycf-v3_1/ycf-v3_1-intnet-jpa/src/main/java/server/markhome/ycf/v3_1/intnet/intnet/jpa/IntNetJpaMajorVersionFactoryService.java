
// Description: Java 25 Factory service implementation for MajorVersion JPA objects

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
 *	Java 25 Factory service implementation for MajorVersion JPA objects.
 */
public class IntNetJpaMajorVersionFactoryService
    implements IIntNetMajorVersionFactory
{
    public BusModelJpaMajorVersionFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMajorVersionHPKey newHPKey() {
        IIntNetMajorVersionHPKey hpkey = new IntNetJpaMajorVersionHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersionHPKey ensureHPKey(IIntNetMajorVersionHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetJpaMajorVersionHPKey) {
			return( (IntNetJpaMajorVersionHPKey)key );
		}
		else {
			IntNetJpaMajorVersionHPKey mapped = new IntNetJpaMajorVersionHPKey();
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
    public IIntNetMajorVersionByTenantIdxKey newByTenantIdxKey() {
		IIntNetMajorVersionByTenantIdxKey key = new IntNetJpaMajorVersionByTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersionByTenantIdxKey ensureByTenantIdxKey(IIntNetMajorVersionByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaMajorVersionByTenantIdxKey) {
			return( (IntNetJpaMajorVersionByTenantIdxKey)key );
		}
		else {
			IntNetJpaMajorVersionByTenantIdxKey mapped = new IntNetJpaMajorVersionByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMajorVersionBySubProjectIdxKey newBySubProjectIdxKey() {
		IIntNetMajorVersionBySubProjectIdxKey key = new IntNetJpaMajorVersionBySubProjectIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersionBySubProjectIdxKey ensureBySubProjectIdxKey(IIntNetMajorVersionBySubProjectIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaMajorVersionBySubProjectIdxKey) {
			return( (IntNetJpaMajorVersionBySubProjectIdxKey)key );
		}
		else {
			IntNetJpaMajorVersionBySubProjectIdxKey mapped = new IntNetJpaMajorVersionBySubProjectIdxKey();
			mapped.setRequiredSubProjectId( key.getRequiredSubProjectId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMajorVersionByNameIdxKey newByNameIdxKey() {
		IIntNetMajorVersionByNameIdxKey key = new IntNetJpaMajorVersionByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersionByNameIdxKey ensureByNameIdxKey(IIntNetMajorVersionByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaMajorVersionByNameIdxKey) {
			return( (IntNetJpaMajorVersionByNameIdxKey)key );
		}
		else {
			IntNetJpaMajorVersionByNameIdxKey mapped = new IntNetJpaMajorVersionByNameIdxKey();
			mapped.setRequiredSubProjectId( key.getRequiredSubProjectId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMajorVersion newRec() {
        IIntNetMajorVersion rec = new IntNetJpaMajorVersion();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersion ensureRec(IIntNetMajorVersion rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetJpaMajorVersion) {
			return( (IntNetJpaMajorVersion)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IIntNetMajorVersion.CLASS_CODE: {
					IntNetJpaMajorVersion mapped = new IntNetJpaMajorVersion();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMajorVersion",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMajorVersion");
			}
		}
	}

    @Override
    public IIntNetMajorVersionH newHRec() {
        IIntNetMajorVersionH hrec = new IntNetJpaMajorVersionH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersionH ensureHRec(IIntNetMajorVersionH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetJpaMajorVersionH) {
			return( (IntNetJpaMajorVersionH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IIntNetMajorVersion.CLASS_CODE: {
					IntNetJpaMajorVersionH mapped = new IntNetJpaMajorVersionH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMajorVersion",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMajorVersion");
			}
		}
	}
}
