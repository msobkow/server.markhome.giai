
// Description: Java 25 Factory service implementation for MimeType JPA objects

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
 *	Java 25 Factory service implementation for MimeType JPA objects.
 */
public class IntNetJpaMimeTypeFactoryService
    implements IIntNetMimeTypeFactory
{
    public BusModelJpaMimeTypeFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMimeTypeHPKey newHPKey() {
        IIntNetMimeTypeHPKey hpkey = new IntNetJpaMimeTypeHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMimeTypeHPKey ensureHPKey(IIntNetMimeTypeHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetJpaMimeTypeHPKey) {
			return( (IntNetJpaMimeTypeHPKey)key );
		}
		else {
			IntNetJpaMimeTypeHPKey mapped = new IntNetJpaMimeTypeHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredMimeTypeId( key.getRequiredMimeTypeId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMimeTypeByUNameIdxKey newByUNameIdxKey() {
		IIntNetMimeTypeByUNameIdxKey key = new IntNetJpaMimeTypeByUNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMimeTypeByUNameIdxKey ensureByUNameIdxKey(IIntNetMimeTypeByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetJpaMimeTypeByUNameIdxKey) {
			return( (IntNetJpaMimeTypeByUNameIdxKey)key );
		}
		else {
			IntNetJpaMimeTypeByUNameIdxKey mapped = new IntNetJpaMimeTypeByUNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
    public IIntNetMimeType newRec() {
        IIntNetMimeType rec = new IntNetJpaMimeType();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMimeType ensureRec(IIntNetMimeType rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetJpaMimeType) {
			return( (IntNetJpaMimeType)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case IIntNetMimeType.CLASS_CODE: {
					IntNetJpaMimeType mapped = new IntNetJpaMimeType();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMimeType",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMimeType");
			}
		}
	}

    @Override
    public IIntNetMimeTypeH newHRec() {
        IIntNetMimeTypeH hrec = new IntNetJpaMimeTypeH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMimeTypeH ensureHRec(IIntNetMimeTypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetJpaMimeTypeH) {
			return( (IntNetJpaMimeTypeH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case IIntNetMimeType.CLASS_CODE: {
					IntNetJpaMimeTypeH mapped = new IntNetJpaMimeTypeH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMimeType",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMimeType");
			}
		}
	}
}
