
// Description: Java 25 Factory service implementation for UInt32Type JPA objects

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
 *	Java 25 Factory service implementation for UInt32Type JPA objects.
 */
public class BusModelJpaUInt32TypeFactoryService
    implements IBusModelUInt32TypeFactory
{
    public BusModelJpaUInt32TypeFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelUInt32TypeBySchemaIdxKey newBySchemaIdxKey() {
		IBusModelUInt32TypeBySchemaIdxKey key = new BusModelJpaUInt32TypeBySchemaIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUInt32TypeBySchemaIdxKey ensureBySchemaIdxKey(IBusModelUInt32TypeBySchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaUInt32TypeBySchemaIdxKey) {
			return( (BusModelJpaUInt32TypeBySchemaIdxKey)key );
		}
		else {
			BusModelJpaUInt32TypeBySchemaIdxKey mapped = new BusModelJpaUInt32TypeBySchemaIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelUInt32Type newRec() {
        IBusModelUInt32Type rec = new BusModelJpaUInt32Type();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUInt32Type ensureRec(IBusModelUInt32Type rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaUInt32Type) {
			return( (BusModelJpaUInt32Type)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelUInt32Type.CLASS_CODE: {
					BusModelJpaUInt32Type mapped = new BusModelJpaUInt32Type();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUInt32Type",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUInt32Type");
			}
		}
	}

    @Override
    public IBusModelUInt32TypeH newHRec() {
        IBusModelUInt32TypeH hrec = new BusModelJpaUInt32TypeH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUInt32TypeH ensureHRec(IBusModelUInt32TypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaUInt32TypeH) {
			return( (BusModelJpaUInt32TypeH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelUInt32Type.CLASS_CODE: {
					BusModelJpaUInt32TypeH mapped = new BusModelJpaUInt32TypeH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUInt32Type",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUInt32Type");
			}
		}
	}
}
