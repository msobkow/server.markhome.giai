
// Description: Java 25 Factory service implementation for DbKeyHash256Def JPA objects

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
 *	Java 25 Factory service implementation for DbKeyHash256Def JPA objects.
 */
public class BusModelJpaDbKeyHash256DefFactoryService
    implements IBusModelDbKeyHash256DefFactory
{
    public BusModelJpaDbKeyHash256DefFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDbKeyHash256Def newRec() {
        IBusModelDbKeyHash256Def rec = new BusModelJpaDbKeyHash256Def();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDbKeyHash256Def ensureRec(IBusModelDbKeyHash256Def rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaDbKeyHash256Def) {
			return( (BusModelJpaDbKeyHash256Def)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelDbKeyHash256Def.CLASS_CODE: {
					BusModelJpaDbKeyHash256Def mapped = new BusModelJpaDbKeyHash256Def();
					mapped.set(rec);
					return( mapped ); }
				case IBusModelDbKeyHash256Col.CLASS_CODE: {
					BusModelJpaDbKeyHash256Col mapped = new BusModelJpaDbKeyHash256Col();
					mapped.set((IBusModelDbKeyHash256Col)rec);
					return(mapped); }
				case IBusModelDbKeyHash256Type.CLASS_CODE: {
					BusModelJpaDbKeyHash256Type mapped = new BusModelJpaDbKeyHash256Type();
					mapped.set((IBusModelDbKeyHash256Type)rec);
					return(mapped); }
				case IBusModelDbKeyHash256Gen.CLASS_CODE: {
					BusModelJpaDbKeyHash256Gen mapped = new BusModelJpaDbKeyHash256Gen();
					mapped.set((IBusModelDbKeyHash256Gen)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash256Def",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash256Def");
			}
		}
	}

    @Override
    public IBusModelDbKeyHash256DefH newHRec() {
        IBusModelDbKeyHash256DefH hrec = new BusModelJpaDbKeyHash256DefH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDbKeyHash256DefH ensureHRec(IBusModelDbKeyHash256DefH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaDbKeyHash256DefH) {
			return( (BusModelJpaDbKeyHash256DefH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelDbKeyHash256Def.CLASS_CODE: {
					BusModelJpaDbKeyHash256DefH mapped = new BusModelJpaDbKeyHash256DefH();
					mapped.set(hrec);
					return( mapped ); }
				case IBusModelDbKeyHash256Col.CLASS_CODE: {
					BusModelJpaDbKeyHash256ColH mapped = new BusModelJpaDbKeyHash256ColH();
					mapped.set((IBusModelDbKeyHash256ColH)hrec);
					return(mapped); }
				case IBusModelDbKeyHash256Type.CLASS_CODE: {
					BusModelJpaDbKeyHash256TypeH mapped = new BusModelJpaDbKeyHash256TypeH();
					mapped.set((IBusModelDbKeyHash256TypeH)hrec);
					return(mapped); }
				case IBusModelDbKeyHash256Gen.CLASS_CODE: {
					BusModelJpaDbKeyHash256GenH mapped = new BusModelJpaDbKeyHash256GenH();
					mapped.set((IBusModelDbKeyHash256GenH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash256Def",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash256Def");
			}
		}
	}
}
