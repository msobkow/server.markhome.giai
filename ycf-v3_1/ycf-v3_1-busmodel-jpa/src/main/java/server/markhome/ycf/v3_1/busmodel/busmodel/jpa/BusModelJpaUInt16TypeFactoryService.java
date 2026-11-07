
// Description: Java 25 Factory service implementation for UInt16Type JPA objects

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
 *	Java 25 Factory service implementation for UInt16Type JPA objects.
 */
public class BusModelJpaUInt16TypeFactoryService
    implements IBusModelUInt16TypeFactory
{
    public BusModelJpaUInt16TypeFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelUInt16TypeBySchemaIdxKey newBySchemaIdxKey() {
		IBusModelUInt16TypeBySchemaIdxKey key = new BusModelJpaUInt16TypeBySchemaIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUInt16TypeBySchemaIdxKey ensureBySchemaIdxKey(IBusModelUInt16TypeBySchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaUInt16TypeBySchemaIdxKey) {
			return( (BusModelJpaUInt16TypeBySchemaIdxKey)key );
		}
		else {
			BusModelJpaUInt16TypeBySchemaIdxKey mapped = new BusModelJpaUInt16TypeBySchemaIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelUInt16Type newRec() {
        IBusModelUInt16Type rec = new BusModelJpaUInt16Type();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUInt16Type ensureRec(IBusModelUInt16Type rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaUInt16Type) {
			return( (BusModelJpaUInt16Type)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelUInt16Type.CLASS_CODE: {
					BusModelJpaUInt16Type mapped = new BusModelJpaUInt16Type();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUInt16Type",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUInt16Type");
			}
		}
	}

    @Override
    public IBusModelUInt16TypeH newHRec() {
        IBusModelUInt16TypeH hrec = new BusModelJpaUInt16TypeH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUInt16TypeH ensureHRec(IBusModelUInt16TypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaUInt16TypeH) {
			return( (BusModelJpaUInt16TypeH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelUInt16Type.CLASS_CODE: {
					BusModelJpaUInt16TypeH mapped = new BusModelJpaUInt16TypeH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUInt16Type",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUInt16Type");
			}
		}
	}
}
