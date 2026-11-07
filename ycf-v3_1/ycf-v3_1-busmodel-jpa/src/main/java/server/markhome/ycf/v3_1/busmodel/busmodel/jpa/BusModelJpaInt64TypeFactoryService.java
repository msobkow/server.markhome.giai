
// Description: Java 25 Factory service implementation for Int64Type JPA objects

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
 *	Java 25 Factory service implementation for Int64Type JPA objects.
 */
public class BusModelJpaInt64TypeFactoryService
    implements IBusModelInt64TypeFactory
{
    public BusModelJpaInt64TypeFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelInt64TypeBySchemaIdxKey newBySchemaIdxKey() {
		IBusModelInt64TypeBySchemaIdxKey key = new BusModelJpaInt64TypeBySchemaIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaInt64TypeBySchemaIdxKey ensureBySchemaIdxKey(IBusModelInt64TypeBySchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaInt64TypeBySchemaIdxKey) {
			return( (BusModelJpaInt64TypeBySchemaIdxKey)key );
		}
		else {
			BusModelJpaInt64TypeBySchemaIdxKey mapped = new BusModelJpaInt64TypeBySchemaIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelInt64Type newRec() {
        IBusModelInt64Type rec = new BusModelJpaInt64Type();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaInt64Type ensureRec(IBusModelInt64Type rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaInt64Type) {
			return( (BusModelJpaInt64Type)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelInt64Type.CLASS_CODE: {
					BusModelJpaInt64Type mapped = new BusModelJpaInt64Type();
					mapped.set(rec);
					return( mapped ); }
				case IBusModelId64Gen.CLASS_CODE: {
					BusModelJpaId64Gen mapped = new BusModelJpaId64Gen();
					mapped.set((IBusModelId64Gen)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelInt64Type",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelInt64Type");
			}
		}
	}

    @Override
    public IBusModelInt64TypeH newHRec() {
        IBusModelInt64TypeH hrec = new BusModelJpaInt64TypeH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaInt64TypeH ensureHRec(IBusModelInt64TypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaInt64TypeH) {
			return( (BusModelJpaInt64TypeH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelInt64Type.CLASS_CODE: {
					BusModelJpaInt64TypeH mapped = new BusModelJpaInt64TypeH();
					mapped.set(hrec);
					return( mapped ); }
				case IBusModelId64Gen.CLASS_CODE: {
					BusModelJpaId64GenH mapped = new BusModelJpaId64GenH();
					mapped.set((IBusModelId64GenH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelInt64Type",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelInt64Type");
			}
		}
	}
}
