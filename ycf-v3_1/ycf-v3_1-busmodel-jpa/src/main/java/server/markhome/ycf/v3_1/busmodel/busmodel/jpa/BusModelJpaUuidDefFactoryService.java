
// Description: Java 25 Factory service implementation for UuidDef JPA objects

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
 *	Java 25 Factory service implementation for UuidDef JPA objects.
 */
public class BusModelJpaUuidDefFactoryService
    implements IBusModelUuidDefFactory
{
    public BusModelJpaUuidDefFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelUuidDef newRec() {
        IBusModelUuidDef rec = new BusModelJpaUuidDef();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUuidDef ensureRec(IBusModelUuidDef rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaUuidDef) {
			return( (BusModelJpaUuidDef)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelUuidDef.CLASS_CODE: {
					BusModelJpaUuidDef mapped = new BusModelJpaUuidDef();
					mapped.set(rec);
					return( mapped ); }
				case IBusModelUuidType.CLASS_CODE: {
					BusModelJpaUuidType mapped = new BusModelJpaUuidType();
					mapped.set((IBusModelUuidType)rec);
					return(mapped); }
				case IBusModelUuidGen.CLASS_CODE: {
					BusModelJpaUuidGen mapped = new BusModelJpaUuidGen();
					mapped.set((IBusModelUuidGen)rec);
					return(mapped); }
				case IBusModelUuidCol.CLASS_CODE: {
					BusModelJpaUuidCol mapped = new BusModelJpaUuidCol();
					mapped.set((IBusModelUuidCol)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUuidDef",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUuidDef");
			}
		}
	}

    @Override
    public IBusModelUuidDefH newHRec() {
        IBusModelUuidDefH hrec = new BusModelJpaUuidDefH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUuidDefH ensureHRec(IBusModelUuidDefH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaUuidDefH) {
			return( (BusModelJpaUuidDefH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelUuidDef.CLASS_CODE: {
					BusModelJpaUuidDefH mapped = new BusModelJpaUuidDefH();
					mapped.set(hrec);
					return( mapped ); }
				case IBusModelUuidType.CLASS_CODE: {
					BusModelJpaUuidTypeH mapped = new BusModelJpaUuidTypeH();
					mapped.set((IBusModelUuidTypeH)hrec);
					return(mapped); }
				case IBusModelUuidGen.CLASS_CODE: {
					BusModelJpaUuidGenH mapped = new BusModelJpaUuidGenH();
					mapped.set((IBusModelUuidGenH)hrec);
					return(mapped); }
				case IBusModelUuidCol.CLASS_CODE: {
					BusModelJpaUuidColH mapped = new BusModelJpaUuidColH();
					mapped.set((IBusModelUuidColH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUuidDef",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUuidDef");
			}
		}
	}
}
