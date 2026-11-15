
// Description: Java 25 Factory service implementation for UInt64Def JPA objects

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
 *	Java 25 Factory service implementation for UInt64Def JPA objects.
 */
public class BusModelJpaUInt64DefFactoryService
    implements IBusModelUInt64DefFactory
{
    public BusModelJpaUInt64DefFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelUInt64Def newRec() {
        IBusModelUInt64Def rec = new BusModelJpaUInt64Def();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUInt64Def ensureRec(IBusModelUInt64Def rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaUInt64Def) {
			return( (BusModelJpaUInt64Def)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelUInt64Def.CLASS_CODE: {
					BusModelJpaUInt64Def mapped = new BusModelJpaUInt64Def();
					mapped.set(rec);
					return( mapped ); }
				case IBusModelUInt64Type.CLASS_CODE: {
					BusModelJpaUInt64Type mapped = new BusModelJpaUInt64Type();
					mapped.set((IBusModelUInt64Type)rec);
					return(mapped); }
				case IBusModelUInt64Col.CLASS_CODE: {
					BusModelJpaUInt64Col mapped = new BusModelJpaUInt64Col();
					mapped.set((IBusModelUInt64Col)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUInt64Def",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUInt64Def");
			}
		}
	}

    @Override
    public IBusModelUInt64DefH newHRec() {
        IBusModelUInt64DefH hrec = new BusModelJpaUInt64DefH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaUInt64DefH ensureHRec(IBusModelUInt64DefH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaUInt64DefH) {
			return( (BusModelJpaUInt64DefH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelUInt64Def.CLASS_CODE: {
					BusModelJpaUInt64DefH mapped = new BusModelJpaUInt64DefH();
					mapped.set(hrec);
					return( mapped ); }
				case IBusModelUInt64Type.CLASS_CODE: {
					BusModelJpaUInt64TypeH mapped = new BusModelJpaUInt64TypeH();
					mapped.set((IBusModelUInt64TypeH)hrec);
					return(mapped); }
				case IBusModelUInt64Col.CLASS_CODE: {
					BusModelJpaUInt64ColH mapped = new BusModelJpaUInt64ColH();
					mapped.set((IBusModelUInt64ColH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUInt64Def",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUInt64Def");
			}
		}
	}
}
