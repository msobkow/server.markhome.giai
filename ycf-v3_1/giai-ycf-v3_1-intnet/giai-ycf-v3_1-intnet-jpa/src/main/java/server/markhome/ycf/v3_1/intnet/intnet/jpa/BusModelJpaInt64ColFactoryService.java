
// Description: Java 25 Factory service implementation for Int64Col JPA objects

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
 *	Java 25 Factory service implementation for Int64Col JPA objects.
 */
public class BusModelJpaInt64ColFactoryService
    implements IBusModelInt64ColFactory
{
    public BusModelJpaInt64ColFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelInt64ColByTableIdxKey newByTableIdxKey() {
		IBusModelInt64ColByTableIdxKey key = new BusModelJpaInt64ColByTableIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaInt64ColByTableIdxKey ensureByTableIdxKey(IBusModelInt64ColByTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelJpaInt64ColByTableIdxKey) {
			return( (BusModelJpaInt64ColByTableIdxKey)key );
		}
		else {
			BusModelJpaInt64ColByTableIdxKey mapped = new BusModelJpaInt64ColByTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelInt64Col newRec() {
        IBusModelInt64Col rec = new BusModelJpaInt64Col();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaInt64Col ensureRec(IBusModelInt64Col rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaInt64Col) {
			return( (BusModelJpaInt64Col)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelInt64Col.CLASS_CODE: {
					BusModelJpaInt64Col mapped = new BusModelJpaInt64Col();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelInt64Col",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelInt64Col");
			}
		}
	}

    @Override
    public IBusModelInt64ColH newHRec() {
        IBusModelInt64ColH hrec = new BusModelJpaInt64ColH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaInt64ColH ensureHRec(IBusModelInt64ColH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaInt64ColH) {
			return( (BusModelJpaInt64ColH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelInt64Col.CLASS_CODE: {
					BusModelJpaInt64ColH mapped = new BusModelJpaInt64ColH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelInt64Col",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelInt64Col");
			}
		}
	}
}
