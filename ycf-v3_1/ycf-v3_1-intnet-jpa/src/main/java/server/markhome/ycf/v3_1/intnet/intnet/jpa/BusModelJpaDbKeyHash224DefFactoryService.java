
// Description: Java 25 Factory service implementation for DbKeyHash224Def JPA objects

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
 *	Java 25 Factory service implementation for DbKeyHash224Def JPA objects.
 */
public class BusModelJpaDbKeyHash224DefFactoryService
    implements IBusModelDbKeyHash224DefFactory
{
    public BusModelJpaDbKeyHash224DefFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelDbKeyHash224Def newRec() {
        IBusModelDbKeyHash224Def rec = new BusModelJpaDbKeyHash224Def();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDbKeyHash224Def ensureRec(IBusModelDbKeyHash224Def rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaDbKeyHash224Def) {
			return( (BusModelJpaDbKeyHash224Def)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelDbKeyHash224Def.CLASS_CODE: {
					BusModelJpaDbKeyHash224Def mapped = new BusModelJpaDbKeyHash224Def();
					mapped.set(rec);
					return( mapped ); }
				case IBusModelDbKeyHash224Col.CLASS_CODE: {
					BusModelJpaDbKeyHash224Col mapped = new BusModelJpaDbKeyHash224Col();
					mapped.set((IBusModelDbKeyHash224Col)rec);
					return(mapped); }
				case IBusModelDbKeyHash224Type.CLASS_CODE: {
					BusModelJpaDbKeyHash224Type mapped = new BusModelJpaDbKeyHash224Type();
					mapped.set((IBusModelDbKeyHash224Type)rec);
					return(mapped); }
				case IBusModelDbKeyHash224Gen.CLASS_CODE: {
					BusModelJpaDbKeyHash224Gen mapped = new BusModelJpaDbKeyHash224Gen();
					mapped.set((IBusModelDbKeyHash224Gen)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash224Def",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash224Def");
			}
		}
	}

    @Override
    public IBusModelDbKeyHash224DefH newHRec() {
        IBusModelDbKeyHash224DefH hrec = new BusModelJpaDbKeyHash224DefH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaDbKeyHash224DefH ensureHRec(IBusModelDbKeyHash224DefH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaDbKeyHash224DefH) {
			return( (BusModelJpaDbKeyHash224DefH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelDbKeyHash224Def.CLASS_CODE: {
					BusModelJpaDbKeyHash224DefH mapped = new BusModelJpaDbKeyHash224DefH();
					mapped.set(hrec);
					return( mapped ); }
				case IBusModelDbKeyHash224Col.CLASS_CODE: {
					BusModelJpaDbKeyHash224ColH mapped = new BusModelJpaDbKeyHash224ColH();
					mapped.set((IBusModelDbKeyHash224ColH)hrec);
					return(mapped); }
				case IBusModelDbKeyHash224Type.CLASS_CODE: {
					BusModelJpaDbKeyHash224TypeH mapped = new BusModelJpaDbKeyHash224TypeH();
					mapped.set((IBusModelDbKeyHash224TypeH)hrec);
					return(mapped); }
				case IBusModelDbKeyHash224Gen.CLASS_CODE: {
					BusModelJpaDbKeyHash224GenH mapped = new BusModelJpaDbKeyHash224GenH();
					mapped.set((IBusModelDbKeyHash224GenH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash224Def",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash224Def");
			}
		}
	}
}
