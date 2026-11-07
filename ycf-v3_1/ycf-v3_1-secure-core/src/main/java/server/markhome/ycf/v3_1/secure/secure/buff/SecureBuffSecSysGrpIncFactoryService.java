
// Description: Java 25 Factory service implementation for SecSysGrpInc buffers

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

package server.markhome.ycf.v3_1.secure.secure.buff;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;

/*
 *	Java 25 Factory service implementation for SecSysGrpInc buffers.
 */
@Service("secure31BuffSecSysGrpIncFactoryService")
public class SecureBuffSecSysGrpIncFactoryService
	implements ISecureSecSysGrpIncFactory
{
	public BusModelBuffSecSysGrpIncFactoryService() {
	}

    @Override
    public ISecureSecSysGrpIncPKey newPKey() {
        ISecureSecSysGrpIncPKey pkey =
            new SecureBuffSecSysGrpIncPKey();
        return( pkey );
    }

	public SecureBuffSecSysGrpIncPKey ensurePKey(ISecureSecSysGrpIncPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecSysGrpIncPKey) {
			return( (SecureBuffSecSysGrpIncPKey)key );
		}
		else {
			SecureBuffSecSysGrpIncPKey mapped = new SecureBuffSecSysGrpIncPKey();
			mapped.setRequiredSecSysGrpId( key.getRequiredSecSysGrpId() );
			mapped.setRequiredInclName( key.getRequiredInclName() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysGrpIncHPKey newHPKey() {
		ISecureSecSysGrpIncHPKey hpkey =
			new SecureBuffSecSysGrpIncHPKey();
		return( hpkey );
	}

	public SecureBuffSecSysGrpIncHPKey ensureHPKey(ISecureSecSysGrpIncHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecSysGrpIncHPKey) {
			return( (SecureBuffSecSysGrpIncHPKey)key );
		}
		else {
			SecureBuffSecSysGrpIncHPKey mapped = new SecureBuffSecSysGrpIncHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecSysGrpId( key.getRequiredSecSysGrpId() );
			mapped.setRequiredInclName( key.getRequiredInclName() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysGrpIncBySysGrpIdxKey newBySysGrpIdxKey() {
		ISecureSecSysGrpIncBySysGrpIdxKey key =
			new SecureBuffSecSysGrpIncBySysGrpIdxKey();
		return( key );
	}

	public SecureBuffSecSysGrpIncBySysGrpIdxKey ensureBySysGrpIdxKey(ISecureSecSysGrpIncBySysGrpIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecSysGrpIncBySysGrpIdxKey) {
			return( (SecureBuffSecSysGrpIncBySysGrpIdxKey)key );
		}
		else {
			SecureBuffSecSysGrpIncBySysGrpIdxKey mapped = new SecureBuffSecSysGrpIncBySysGrpIdxKey();
			mapped.setRequiredSecSysGrpId( key.getRequiredSecSysGrpId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysGrpIncByNameIdxKey newByNameIdxKey() {
		ISecureSecSysGrpIncByNameIdxKey key =
			new SecureBuffSecSysGrpIncByNameIdxKey();
		return( key );
	}

	public SecureBuffSecSysGrpIncByNameIdxKey ensureByNameIdxKey(ISecureSecSysGrpIncByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecSysGrpIncByNameIdxKey) {
			return( (SecureBuffSecSysGrpIncByNameIdxKey)key );
		}
		else {
			SecureBuffSecSysGrpIncByNameIdxKey mapped = new SecureBuffSecSysGrpIncByNameIdxKey();
			mapped.setRequiredInclName( key.getRequiredInclName() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysGrpInc newRec() {
		ISecureSecSysGrpInc rec =
			new SecureBuffSecSysGrpInc();
		return( rec );
	}

	public SecureBuffSecSysGrpInc ensureRec(ISecureSecSysGrpInc rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecSysGrpInc) {
			return ((SecureBuffSecSysGrpInc)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecSysGrpInc.CLASS_CODE: {
					SecureBuffSecSysGrpInc mapped = new SecureBuffSecSysGrpInc();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysGrpInc",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysGrpInc");
			}
		}
	}

	@Override
	public ISecureSecSysGrpIncH newHRec() {
		ISecureSecSysGrpIncH hrec =
			new SecureBuffSecSysGrpIncH();
		return( hrec );
	}

	public SecureBuffSecSysGrpIncH ensureHRec(ISecureSecSysGrpIncH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecSysGrpIncH) {
			return ((SecureBuffSecSysGrpIncH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecSysGrpInc.CLASS_CODE: {
					SecureBuffSecSysGrpIncH mapped = new SecureBuffSecSysGrpIncH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysGrpInc",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysGrpInc");
			}
		}
	}
}
