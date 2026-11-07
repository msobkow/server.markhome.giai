
// Description: Java 25 Factory service implementation for TopDomain JPA objects

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
 *	Java 25 Factory service implementation for TopDomain JPA objects.
 */
public class IntNetJpaTopDomainFactoryService
    implements IIntNetTopDomainFactory
{
    public BusModelJpaTopDomainFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetTopDomainHPKey newHPKey() {
        IIntNetTopDomainHPKey hpkey = new IntNetJpaTopDomainHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopDomainHPKey ensureHPKey(IIntNetTopDomainHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetJpaTopDomainHPKey) {
			return( (IntNetJpaTopDomainHPKey)key );
		}
		else {
			IntNetJpaTopDomainHPKey mapped = new IntNetJpaTopDomainHPKey();
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
    public IIntNetTopDomainByTenantIdxKey newByTenantIdxKey() {
		IIntNetTopDomainByTenantIdxKey key = new IntNetJpaTopDomainByTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopDomainByTenantIdxKey ensureByTenantIdxKey(IIntNetTopDomainByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaTopDomainByTenantIdxKey) {
			return( (IntNetJpaTopDomainByTenantIdxKey)key );
		}
		else {
			IntNetJpaTopDomainByTenantIdxKey mapped = new IntNetJpaTopDomainByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetTopDomainByTldIdxKey newByTldIdxKey() {
		IIntNetTopDomainByTldIdxKey key = new IntNetJpaTopDomainByTldIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopDomainByTldIdxKey ensureByTldIdxKey(IIntNetTopDomainByTldIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaTopDomainByTldIdxKey) {
			return( (IntNetJpaTopDomainByTldIdxKey)key );
		}
		else {
			IntNetJpaTopDomainByTldIdxKey mapped = new IntNetJpaTopDomainByTldIdxKey();
			mapped.setRequiredTldId( key.getRequiredTldId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetTopDomainByNameIdxKey newByNameIdxKey() {
		IIntNetTopDomainByNameIdxKey key = new IntNetJpaTopDomainByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopDomainByNameIdxKey ensureByNameIdxKey(IIntNetTopDomainByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaTopDomainByNameIdxKey) {
			return( (IntNetJpaTopDomainByNameIdxKey)key );
		}
		else {
			IntNetJpaTopDomainByNameIdxKey mapped = new IntNetJpaTopDomainByNameIdxKey();
			mapped.setRequiredTldId( key.getRequiredTldId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetTopDomain newRec() {
        IIntNetTopDomain rec = new IntNetJpaTopDomain();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopDomain ensureRec(IIntNetTopDomain rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetJpaTopDomain) {
			return( (IntNetJpaTopDomain)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IIntNetTopDomain.CLASS_CODE: {
					IntNetJpaTopDomain mapped = new IntNetJpaTopDomain();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetTopDomain",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetTopDomain");
			}
		}
	}

    @Override
    public IIntNetTopDomainH newHRec() {
        IIntNetTopDomainH hrec = new IntNetJpaTopDomainH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopDomainH ensureHRec(IIntNetTopDomainH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetJpaTopDomainH) {
			return( (IntNetJpaTopDomainH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IIntNetTopDomain.CLASS_CODE: {
					IntNetJpaTopDomainH mapped = new IntNetJpaTopDomainH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetTopDomain",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetTopDomain");
			}
		}
	}
}
