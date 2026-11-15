
// Description: Java 25 Factory service implementation for DelDep JPA objects

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

package server.markhome.ycf.v3_1.busmodel.busmodel.jpa;

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
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

/*
 *	Java 25 Factory service implementation for DelDep JPA objects.
 */
public class BusModelJpaDelDepFactoryService
    implements IBusModelDelDepFactory
{
    public BusModelJpaDelDepFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDelDepByDefSchemaIdxKey newByDefSchemaIdxKey() {
		IBusModelDelDepByDefSchemaIdxKey key = new BusModelJpaDelDepByDefSchemaIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelDepByDefSchemaIdxKey ensureByDefSchemaIdxKey(IBusModelDelDepByDefSchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaDelDepByDefSchemaIdxKey) {
			return( (BusModelJpaDelDepByDefSchemaIdxKey)key );
		}
		else {
			BusModelJpaDelDepByDefSchemaIdxKey mapped = new BusModelJpaDelDepByDefSchemaIdxKey();
			mapped.setOptionalDefSchemaId( key.getOptionalDefSchemaId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDelDepByDelDepIdxKey newByDelDepIdxKey() {
		IBusModelDelDepByDelDepIdxKey key = new BusModelJpaDelDepByDelDepIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelDepByDelDepIdxKey ensureByDelDepIdxKey(IBusModelDelDepByDelDepIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaDelDepByDelDepIdxKey) {
			return( (BusModelJpaDelDepByDelDepIdxKey)key );
		}
		else {
			BusModelJpaDelDepByDelDepIdxKey mapped = new BusModelJpaDelDepByDelDepIdxKey();
			mapped.setRequiredRelationId( key.getRequiredRelationId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDelDep newRec() {
        IBusModelDelDep rec = new BusModelJpaDelDep();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelDep ensureRec(IBusModelDelDep rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaDelDep) {
			return( (BusModelJpaDelDep)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelDelDep.CLASS_CODE: {
					BusModelJpaDelDep mapped = new BusModelJpaDelDep();
					mapped.set(rec);
					return( mapped ); }
				case IBusModelDelSubDep1.CLASS_CODE: {
					BusModelJpaDelSubDep1 mapped = new BusModelJpaDelSubDep1();
					mapped.set((IBusModelDelSubDep1)rec);
					return(mapped); }
				case IBusModelDelSubDep2.CLASS_CODE: {
					BusModelJpaDelSubDep2 mapped = new BusModelJpaDelSubDep2();
					mapped.set((IBusModelDelSubDep2)rec);
					return(mapped); }
				case IBusModelDelSubDep3.CLASS_CODE: {
					BusModelJpaDelSubDep3 mapped = new BusModelJpaDelSubDep3();
					mapped.set((IBusModelDelSubDep3)rec);
					return(mapped); }
				case IBusModelDelTopDep.CLASS_CODE: {
					BusModelJpaDelTopDep mapped = new BusModelJpaDelTopDep();
					mapped.set((IBusModelDelTopDep)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDelDep",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDelDep");
			}
		}
	}

    @Override
    public IBusModelDelDepH newHRec() {
        IBusModelDelDepH hrec = new BusModelJpaDelDepH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDelDepH ensureHRec(IBusModelDelDepH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaDelDepH) {
			return( (BusModelJpaDelDepH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelDelDep.CLASS_CODE: {
					BusModelJpaDelDepH mapped = new BusModelJpaDelDepH();
					mapped.set(hrec);
					return( mapped ); }
				case IBusModelDelSubDep1.CLASS_CODE: {
					BusModelJpaDelSubDep1H mapped = new BusModelJpaDelSubDep1H();
					mapped.set((IBusModelDelSubDep1H)hrec);
					return(mapped); }
				case IBusModelDelSubDep2.CLASS_CODE: {
					BusModelJpaDelSubDep2H mapped = new BusModelJpaDelSubDep2H();
					mapped.set((IBusModelDelSubDep2H)hrec);
					return(mapped); }
				case IBusModelDelSubDep3.CLASS_CODE: {
					BusModelJpaDelSubDep3H mapped = new BusModelJpaDelSubDep3H();
					mapped.set((IBusModelDelSubDep3H)hrec);
					return(mapped); }
				case IBusModelDelTopDep.CLASS_CODE: {
					BusModelJpaDelTopDepH mapped = new BusModelJpaDelTopDepH();
					mapped.set((IBusModelDelTopDepH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDelDep",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDelDep");
			}
		}
	}
}
