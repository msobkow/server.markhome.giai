
// Description: Java 25 Factory service implementation for SysCluster JPA objects

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
 *	Java 25 Factory service implementation for SysCluster JPA objects.
 */
public class SecureJpaSysClusterFactoryService
    implements ISecureSysClusterFactory
{
    public BusModelJpaSysClusterFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSysClusterHPKey newHPKey() {
        ISecureSysClusterHPKey hpkey = new SecureJpaSysClusterHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSysClusterHPKey ensureHPKey(ISecureSysClusterHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureJpaSysClusterHPKey) {
			return( (SecureJpaSysClusterHPKey)key );
		}
		else {
			SecureJpaSysClusterHPKey mapped = new SecureJpaSysClusterHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSingletonId( key.getRequiredSingletonId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSysClusterByClusterIdxKey newByClusterIdxKey() {
		ISecureSysClusterByClusterIdxKey key = new SecureJpaSysClusterByClusterIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSysClusterByClusterIdxKey ensureByClusterIdxKey(ISecureSysClusterByClusterIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureJpaSysClusterByClusterIdxKey) {
			return( (SecureJpaSysClusterByClusterIdxKey)key );
		}
		else {
			SecureJpaSysClusterByClusterIdxKey mapped = new SecureJpaSysClusterByClusterIdxKey();
			mapped.setRequiredClusterId( key.getRequiredClusterId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
    public ISecureSysCluster newRec() {
        ISecureSysCluster rec = new SecureJpaSysCluster();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSysCluster ensureRec(ISecureSysCluster rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureJpaSysCluster) {
			return( (SecureJpaSysCluster)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ISecureSysCluster.CLASS_CODE: {
					SecureJpaSysCluster mapped = new SecureJpaSysCluster();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSysCluster",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSysCluster");
			}
		}
	}

    @Override
    public ISecureSysClusterH newHRec() {
        ISecureSysClusterH hrec = new SecureJpaSysClusterH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSysClusterH ensureHRec(ISecureSysClusterH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureJpaSysClusterH) {
			return( (SecureJpaSysClusterH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ISecureSysCluster.CLASS_CODE: {
					SecureJpaSysClusterH mapped = new SecureJpaSysClusterH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSysCluster",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSysCluster");
			}
		}
	}
}
