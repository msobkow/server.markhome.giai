
// Description: Java 25 Factory service implementation for Int16Col JPA objects

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
 *	Java 25 Factory service implementation for Int16Col JPA objects.
 */
public class BusModelJpaInt16ColFactoryService
    implements IBusModelInt16ColFactory
{
    public BusModelJpaInt16ColFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelInt16ColByTableIdxKey newByTableIdxKey() {
		IBusModelInt16ColByTableIdxKey key = new BusModelJpaInt16ColByTableIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaInt16ColByTableIdxKey ensureByTableIdxKey(IBusModelInt16ColByTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaInt16ColByTableIdxKey) {
			return( (BusModelJpaInt16ColByTableIdxKey)key );
		}
		else {
			BusModelJpaInt16ColByTableIdxKey mapped = new BusModelJpaInt16ColByTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelInt16Col newRec() {
        IBusModelInt16Col rec = new BusModelJpaInt16Col();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaInt16Col ensureRec(IBusModelInt16Col rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaInt16Col) {
			return( (BusModelJpaInt16Col)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelInt16Col.CLASS_CODE: {
					BusModelJpaInt16Col mapped = new BusModelJpaInt16Col();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelInt16Col",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelInt16Col");
			}
		}
	}

    @Override
    public IBusModelInt16ColH newHRec() {
        IBusModelInt16ColH hrec = new BusModelJpaInt16ColH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaInt16ColH ensureHRec(IBusModelInt16ColH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaInt16ColH) {
			return( (BusModelJpaInt16ColH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelInt16Col.CLASS_CODE: {
					BusModelJpaInt16ColH mapped = new BusModelJpaInt16ColH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelInt16Col",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelInt16Col");
			}
		}
	}
}
