
// Description: Java 25 Factory service implementation for NmTokensType JPA objects

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
 *	Java 25 Factory service implementation for NmTokensType JPA objects.
 */
public class BusModelJpaNmTokensTypeFactoryService
    implements IBusModelNmTokensTypeFactory
{
    public BusModelJpaNmTokensTypeFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelNmTokensTypeBySchemaIdxKey newBySchemaIdxKey() {
		IBusModelNmTokensTypeBySchemaIdxKey key = new BusModelJpaNmTokensTypeBySchemaIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaNmTokensTypeBySchemaIdxKey ensureBySchemaIdxKey(IBusModelNmTokensTypeBySchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaNmTokensTypeBySchemaIdxKey) {
			return( (BusModelJpaNmTokensTypeBySchemaIdxKey)key );
		}
		else {
			BusModelJpaNmTokensTypeBySchemaIdxKey mapped = new BusModelJpaNmTokensTypeBySchemaIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelNmTokensType newRec() {
        IBusModelNmTokensType rec = new BusModelJpaNmTokensType();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaNmTokensType ensureRec(IBusModelNmTokensType rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaNmTokensType) {
			return( (BusModelJpaNmTokensType)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelNmTokensType.CLASS_CODE: {
					BusModelJpaNmTokensType mapped = new BusModelJpaNmTokensType();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelNmTokensType",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelNmTokensType");
			}
		}
	}

    @Override
    public IBusModelNmTokensTypeH newHRec() {
        IBusModelNmTokensTypeH hrec = new BusModelJpaNmTokensTypeH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaNmTokensTypeH ensureHRec(IBusModelNmTokensTypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaNmTokensTypeH) {
			return( (BusModelJpaNmTokensTypeH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelNmTokensType.CLASS_CODE: {
					BusModelJpaNmTokensTypeH mapped = new BusModelJpaNmTokensTypeH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelNmTokensType",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelNmTokensType");
			}
		}
	}
}
