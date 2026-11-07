
// Description: Java 25 Factory service implementation for TimeDef JPA objects

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
 *	Java 25 Factory service implementation for TimeDef JPA objects.
 */
public class BusModelJpaTimeDefFactoryService
    implements IBusModelTimeDefFactory
{
    public BusModelJpaTimeDefFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelTimeDef newRec() {
        IBusModelTimeDef rec = new BusModelJpaTimeDef();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaTimeDef ensureRec(IBusModelTimeDef rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaTimeDef) {
			return( (BusModelJpaTimeDef)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelTimeDef.CLASS_CODE: {
					BusModelJpaTimeDef mapped = new BusModelJpaTimeDef();
					mapped.set(rec);
					return( mapped ); }
				case IBusModelTimeType.CLASS_CODE: {
					BusModelJpaTimeType mapped = new BusModelJpaTimeType();
					mapped.set((IBusModelTimeType)rec);
					return(mapped); }
				case IBusModelTimeCol.CLASS_CODE: {
					BusModelJpaTimeCol mapped = new BusModelJpaTimeCol();
					mapped.set((IBusModelTimeCol)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelTimeDef",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelTimeDef");
			}
		}
	}

    @Override
    public IBusModelTimeDefH newHRec() {
        IBusModelTimeDefH hrec = new BusModelJpaTimeDefH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaTimeDefH ensureHRec(IBusModelTimeDefH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaTimeDefH) {
			return( (BusModelJpaTimeDefH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelTimeDef.CLASS_CODE: {
					BusModelJpaTimeDefH mapped = new BusModelJpaTimeDefH();
					mapped.set(hrec);
					return( mapped ); }
				case IBusModelTimeType.CLASS_CODE: {
					BusModelJpaTimeTypeH mapped = new BusModelJpaTimeTypeH();
					mapped.set((IBusModelTimeTypeH)hrec);
					return(mapped); }
				case IBusModelTimeCol.CLASS_CODE: {
					BusModelJpaTimeColH mapped = new BusModelJpaTimeColH();
					mapped.set((IBusModelTimeColH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelTimeDef",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelTimeDef");
			}
		}
	}
}
