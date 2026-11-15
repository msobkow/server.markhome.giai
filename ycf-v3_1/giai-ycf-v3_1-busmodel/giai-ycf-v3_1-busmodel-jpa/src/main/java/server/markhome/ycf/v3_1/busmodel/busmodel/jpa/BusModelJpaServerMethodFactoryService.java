
// Description: Java 25 Factory service implementation for ServerMethod JPA objects

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
 *	Java 25 Factory service implementation for ServerMethod JPA objects.
 */
public class BusModelJpaServerMethodFactoryService
    implements IBusModelServerMethodFactory
{
    public BusModelJpaServerMethodFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelServerMethodByUNameIdxKey newByUNameIdxKey() {
		IBusModelServerMethodByUNameIdxKey key = new BusModelJpaServerMethodByUNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaServerMethodByUNameIdxKey ensureByUNameIdxKey(IBusModelServerMethodByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaServerMethodByUNameIdxKey) {
			return( (BusModelJpaServerMethodByUNameIdxKey)key );
		}
		else {
			BusModelJpaServerMethodByUNameIdxKey mapped = new BusModelJpaServerMethodByUNameIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelServerMethodByMethTableIdxKey newByMethTableIdxKey() {
		IBusModelServerMethodByMethTableIdxKey key = new BusModelJpaServerMethodByMethTableIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaServerMethodByMethTableIdxKey ensureByMethTableIdxKey(IBusModelServerMethodByMethTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaServerMethodByMethTableIdxKey) {
			return( (BusModelJpaServerMethodByMethTableIdxKey)key );
		}
		else {
			BusModelJpaServerMethodByMethTableIdxKey mapped = new BusModelJpaServerMethodByMethTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelServerMethodByMethCodeVisIdxKey newByMethCodeVisIdxKey() {
		IBusModelServerMethodByMethCodeVisIdxKey key = new BusModelJpaServerMethodByMethCodeVisIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaServerMethodByMethCodeVisIdxKey ensureByMethCodeVisIdxKey(IBusModelServerMethodByMethCodeVisIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaServerMethodByMethCodeVisIdxKey) {
			return( (BusModelJpaServerMethodByMethCodeVisIdxKey)key );
		}
		else {
			BusModelJpaServerMethodByMethCodeVisIdxKey mapped = new BusModelJpaServerMethodByMethCodeVisIdxKey();
			mapped.setRequiredCodeVis( key.getRequiredCodeVis() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelServerMethodByMethTableVisIdxKey newByMethTableVisIdxKey() {
		IBusModelServerMethodByMethTableVisIdxKey key = new BusModelJpaServerMethodByMethTableVisIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaServerMethodByMethTableVisIdxKey ensureByMethTableVisIdxKey(IBusModelServerMethodByMethTableVisIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaServerMethodByMethTableVisIdxKey) {
			return( (BusModelJpaServerMethodByMethTableVisIdxKey)key );
		}
		else {
			BusModelJpaServerMethodByMethTableVisIdxKey mapped = new BusModelJpaServerMethodByMethTableVisIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			mapped.setRequiredCodeVis( key.getRequiredCodeVis() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelServerMethodByDefSchemaIdxKey newByDefSchemaIdxKey() {
		IBusModelServerMethodByDefSchemaIdxKey key = new BusModelJpaServerMethodByDefSchemaIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaServerMethodByDefSchemaIdxKey ensureByDefSchemaIdxKey(IBusModelServerMethodByDefSchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaServerMethodByDefSchemaIdxKey) {
			return( (BusModelJpaServerMethodByDefSchemaIdxKey)key );
		}
		else {
			BusModelJpaServerMethodByDefSchemaIdxKey mapped = new BusModelJpaServerMethodByDefSchemaIdxKey();
			mapped.setOptionalDefSchemaId( key.getOptionalDefSchemaId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelServerMethod newRec() {
        IBusModelServerMethod rec = new BusModelJpaServerMethod();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaServerMethod ensureRec(IBusModelServerMethod rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaServerMethod) {
			return( (BusModelJpaServerMethod)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelServerMethod.CLASS_CODE: {
					BusModelJpaServerMethod mapped = new BusModelJpaServerMethod();
					mapped.set(rec);
					return( mapped ); }
				case IBusModelServerObjFunc.CLASS_CODE: {
					BusModelJpaServerObjFunc mapped = new BusModelJpaServerObjFunc();
					mapped.set((IBusModelServerObjFunc)rec);
					return(mapped); }
				case IBusModelServerProc.CLASS_CODE: {
					BusModelJpaServerProc mapped = new BusModelJpaServerProc();
					mapped.set((IBusModelServerProc)rec);
					return(mapped); }
				case IBusModelServerListFunc.CLASS_CODE: {
					BusModelJpaServerListFunc mapped = new BusModelJpaServerListFunc();
					mapped.set((IBusModelServerListFunc)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelServerMethod",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelServerMethod");
			}
		}
	}

    @Override
    public IBusModelServerMethodH newHRec() {
        IBusModelServerMethodH hrec = new BusModelJpaServerMethodH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaServerMethodH ensureHRec(IBusModelServerMethodH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaServerMethodH) {
			return( (BusModelJpaServerMethodH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelServerMethod.CLASS_CODE: {
					BusModelJpaServerMethodH mapped = new BusModelJpaServerMethodH();
					mapped.set(hrec);
					return( mapped ); }
				case IBusModelServerObjFunc.CLASS_CODE: {
					BusModelJpaServerObjFuncH mapped = new BusModelJpaServerObjFuncH();
					mapped.set((IBusModelServerObjFuncH)hrec);
					return(mapped); }
				case IBusModelServerProc.CLASS_CODE: {
					BusModelJpaServerProcH mapped = new BusModelJpaServerProcH();
					mapped.set((IBusModelServerProcH)hrec);
					return(mapped); }
				case IBusModelServerListFunc.CLASS_CODE: {
					BusModelJpaServerListFuncH mapped = new BusModelJpaServerListFuncH();
					mapped.set((IBusModelServerListFuncH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelServerMethod",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelServerMethod");
			}
		}
	}
}
