
// Description: Java 25 Factory service implementation for PopSubDep3 JPA objects

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
 *	Java 25 Factory service implementation for PopSubDep3 JPA objects.
 */
public class BusModelJpaPopSubDep3FactoryService
    implements IBusModelPopSubDep3Factory
{
    public BusModelJpaPopSubDep3FactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelPopSubDep3ByPopSubDep2IdxKey newByPopSubDep2IdxKey() {
		IBusModelPopSubDep3ByPopSubDep2IdxKey key = new BusModelJpaPopSubDep3ByPopSubDep2IdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaPopSubDep3ByPopSubDep2IdxKey ensureByPopSubDep2IdxKey(IBusModelPopSubDep3ByPopSubDep2IdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaPopSubDep3ByPopSubDep2IdxKey) {
			return( (BusModelJpaPopSubDep3ByPopSubDep2IdxKey)key );
		}
		else {
			BusModelJpaPopSubDep3ByPopSubDep2IdxKey mapped = new BusModelJpaPopSubDep3ByPopSubDep2IdxKey();
			mapped.setRequiredPopSubDep2Id( key.getRequiredPopSubDep2Id() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelPopSubDep3ByUNameIdxKey newByUNameIdxKey() {
		IBusModelPopSubDep3ByUNameIdxKey key = new BusModelJpaPopSubDep3ByUNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaPopSubDep3ByUNameIdxKey ensureByUNameIdxKey(IBusModelPopSubDep3ByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaPopSubDep3ByUNameIdxKey) {
			return( (BusModelJpaPopSubDep3ByUNameIdxKey)key );
		}
		else {
			BusModelJpaPopSubDep3ByUNameIdxKey mapped = new BusModelJpaPopSubDep3ByUNameIdxKey();
			mapped.setRequiredPopSubDep2Id( key.getRequiredPopSubDep2Id() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelPopSubDep3 newRec() {
        IBusModelPopSubDep3 rec = new BusModelJpaPopSubDep3();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaPopSubDep3 ensureRec(IBusModelPopSubDep3 rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaPopSubDep3) {
			return( (BusModelJpaPopSubDep3)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelPopSubDep3.CLASS_CODE: {
					BusModelJpaPopSubDep3 mapped = new BusModelJpaPopSubDep3();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelPopSubDep3",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelPopSubDep3");
			}
		}
	}

    @Override
    public IBusModelPopSubDep3H newHRec() {
        IBusModelPopSubDep3H hrec = new BusModelJpaPopSubDep3H();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaPopSubDep3H ensureHRec(IBusModelPopSubDep3H hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaPopSubDep3H) {
			return( (BusModelJpaPopSubDep3H)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelPopSubDep3.CLASS_CODE: {
					BusModelJpaPopSubDep3H mapped = new BusModelJpaPopSubDep3H();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelPopSubDep3",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelPopSubDep3");
			}
		}
	}
}
