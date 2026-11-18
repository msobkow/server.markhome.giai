
// Description: Java 25 Factory service implementation for NmTokensDef JPA objects

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
 *	Java 25 Factory service implementation for NmTokensDef JPA objects.
 */
public class BusModelJpaNmTokensDefFactoryService
    implements IBusModelNmTokensDefFactory
{
    public BusModelJpaNmTokensDefFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
    public IBusModelNmTokensDef newRec() {
        IBusModelNmTokensDef rec = new BusModelJpaNmTokensDef();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaNmTokensDef ensureRec(IBusModelNmTokensDef rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelJpaNmTokensDef) {
			return( (BusModelJpaNmTokensDef)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IBusModelNmTokensDef.CLASS_CODE: {
					BusModelJpaNmTokensDef mapped = new BusModelJpaNmTokensDef();
					mapped.set(rec);
					return( mapped ); }
				case IBusModelNmTokensType.CLASS_CODE: {
					BusModelJpaNmTokensType mapped = new BusModelJpaNmTokensType();
					mapped.set((IBusModelNmTokensType)rec);
					return(mapped); }
				case IBusModelNmTokensCol.CLASS_CODE: {
					BusModelJpaNmTokensCol mapped = new BusModelJpaNmTokensCol();
					mapped.set((IBusModelNmTokensCol)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelNmTokensDef",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelNmTokensDef");
			}
		}
	}

    @Override
    public IBusModelNmTokensDefH newHRec() {
        IBusModelNmTokensDefH hrec = new BusModelJpaNmTokensDefH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "busmodel31TransactionManager")
	public BusModelJpaNmTokensDefH ensureHRec(IBusModelNmTokensDefH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelJpaNmTokensDefH) {
			return( (BusModelJpaNmTokensDefH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IBusModelNmTokensDef.CLASS_CODE: {
					BusModelJpaNmTokensDefH mapped = new BusModelJpaNmTokensDefH();
					mapped.set(hrec);
					return( mapped ); }
				case IBusModelNmTokensType.CLASS_CODE: {
					BusModelJpaNmTokensTypeH mapped = new BusModelJpaNmTokensTypeH();
					mapped.set((IBusModelNmTokensTypeH)hrec);
					return(mapped); }
				case IBusModelNmTokensCol.CLASS_CODE: {
					BusModelJpaNmTokensColH mapped = new BusModelJpaNmTokensColH();
					mapped.set((IBusModelNmTokensColH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelNmTokensDef",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelNmTokensDef");
			}
		}
	}
}
