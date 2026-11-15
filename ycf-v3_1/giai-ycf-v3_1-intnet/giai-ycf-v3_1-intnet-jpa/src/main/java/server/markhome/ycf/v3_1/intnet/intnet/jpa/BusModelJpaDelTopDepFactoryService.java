
// Description: Java 25 Factory service implementation for DelTopDep JPA objects

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
 *	Java 25 Factory service implementation for DelTopDep JPA objects.
 */
public class BusModelJpaDelTopDepFactoryService
    implements IBusModelDelTopDepFactory
{
    public BusModelJpaDelTopDepFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDelTopDepByDelTopDepTblIdxKey newByDelTopDepTblIdxKey() {
		IBusModelDelTopDepByDelTopDepTblIdxKey key = new BusModelJpaDelTopDepByDelTopDepTblIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelTopDepByDelTopDepTblIdxKey ensureByDelTopDepTblIdxKey(IBusModelDelTopDepByDelTopDepTblIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaDelTopDepByDelTopDepTblIdxKey) {
			return( (BusModelJpaDelTopDepByDelTopDepTblIdxKey)key );
		}
		else {
			BusModelJpaDelTopDepByDelTopDepTblIdxKey mapped = new BusModelJpaDelTopDepByDelTopDepTblIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDelTopDepByUNameIdxKey newByUNameIdxKey() {
		IBusModelDelTopDepByUNameIdxKey key = new BusModelJpaDelTopDepByUNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelTopDepByUNameIdxKey ensureByUNameIdxKey(IBusModelDelTopDepByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaDelTopDepByUNameIdxKey) {
			return( (BusModelJpaDelTopDepByUNameIdxKey)key );
		}
		else {
			BusModelJpaDelTopDepByUNameIdxKey mapped = new BusModelJpaDelTopDepByUNameIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDelTopDepByPrevIdxKey newByPrevIdxKey() {
		IBusModelDelTopDepByPrevIdxKey key = new BusModelJpaDelTopDepByPrevIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelTopDepByPrevIdxKey ensureByPrevIdxKey(IBusModelDelTopDepByPrevIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaDelTopDepByPrevIdxKey) {
			return( (BusModelJpaDelTopDepByPrevIdxKey)key );
		}
		else {
			BusModelJpaDelTopDepByPrevIdxKey mapped = new BusModelJpaDelTopDepByPrevIdxKey();
			mapped.setOptionalPrevId( key.getOptionalPrevId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDelTopDepByNextIdxKey newByNextIdxKey() {
		IBusModelDelTopDepByNextIdxKey key = new BusModelJpaDelTopDepByNextIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelTopDepByNextIdxKey ensureByNextIdxKey(IBusModelDelTopDepByNextIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaDelTopDepByNextIdxKey) {
			return( (BusModelJpaDelTopDepByNextIdxKey)key );
		}
		else {
			BusModelJpaDelTopDepByNextIdxKey mapped = new BusModelJpaDelTopDepByNextIdxKey();
			mapped.setOptionalNextId( key.getOptionalNextId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDelTopDep newRec() {
        IBusModelDelTopDep rec = new BusModelJpaDelTopDep();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelTopDep ensureRec(IBusModelDelTopDep rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaDelTopDep) {
			return( (BusModelJpaDelTopDep)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelDelTopDep.CLASS_CODE: {
					BusModelJpaDelTopDep mapped = new BusModelJpaDelTopDep();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDelTopDep",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDelTopDep");
			}
		}
	}

    @Override
    public IBusModelDelTopDepH newHRec() {
        IBusModelDelTopDepH hrec = new BusModelJpaDelTopDepH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelTopDepH ensureHRec(IBusModelDelTopDepH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaDelTopDepH) {
			return( (BusModelJpaDelTopDepH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelDelTopDep.CLASS_CODE: {
					BusModelJpaDelTopDepH mapped = new BusModelJpaDelTopDepH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDelTopDep",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDelTopDep");
			}
		}
	}
}
