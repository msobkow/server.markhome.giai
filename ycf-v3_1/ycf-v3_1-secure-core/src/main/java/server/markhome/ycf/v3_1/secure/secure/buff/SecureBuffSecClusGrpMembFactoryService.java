
// Description: Java 25 Factory service implementation for SecClusGrpMemb buffers

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
 *	Java 25 Factory service implementation for SecClusGrpMemb buffers.
 */
@Service("secure31BuffSecClusGrpMembFactoryService")
public class SecureBuffSecClusGrpMembFactoryService
	implements ISecureSecClusGrpMembFactory
{
	public BusModelBuffSecClusGrpMembFactoryService() {
	}

    @Override
    public ISecureSecClusGrpMembPKey newPKey() {
        ISecureSecClusGrpMembPKey pkey =
            new SecureBuffSecClusGrpMembPKey();
        return( pkey );
    }

	public SecureBuffSecClusGrpMembPKey ensurePKey(ISecureSecClusGrpMembPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecClusGrpMembPKey) {
			return( (SecureBuffSecClusGrpMembPKey)key );
		}
		else {
			SecureBuffSecClusGrpMembPKey mapped = new SecureBuffSecClusGrpMembPKey();
			mapped.setRequiredSecClusGrpId( key.getRequiredSecClusGrpId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecClusGrpMembHPKey newHPKey() {
		ISecureSecClusGrpMembHPKey hpkey =
			new SecureBuffSecClusGrpMembHPKey();
		return( hpkey );
	}

	public SecureBuffSecClusGrpMembHPKey ensureHPKey(ISecureSecClusGrpMembHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecClusGrpMembHPKey) {
			return( (SecureBuffSecClusGrpMembHPKey)key );
		}
		else {
			SecureBuffSecClusGrpMembHPKey mapped = new SecureBuffSecClusGrpMembHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecClusGrpId( key.getRequiredSecClusGrpId() );
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecClusGrpMembByClusGrpIdxKey newByClusGrpIdxKey() {
		ISecureSecClusGrpMembByClusGrpIdxKey key =
			new SecureBuffSecClusGrpMembByClusGrpIdxKey();
		return( key );
	}

	public SecureBuffSecClusGrpMembByClusGrpIdxKey ensureByClusGrpIdxKey(ISecureSecClusGrpMembByClusGrpIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecClusGrpMembByClusGrpIdxKey) {
			return( (SecureBuffSecClusGrpMembByClusGrpIdxKey)key );
		}
		else {
			SecureBuffSecClusGrpMembByClusGrpIdxKey mapped = new SecureBuffSecClusGrpMembByClusGrpIdxKey();
			mapped.setRequiredSecClusGrpId( key.getRequiredSecClusGrpId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecClusGrpMembByLoginIdxKey newByLoginIdxKey() {
		ISecureSecClusGrpMembByLoginIdxKey key =
			new SecureBuffSecClusGrpMembByLoginIdxKey();
		return( key );
	}

	public SecureBuffSecClusGrpMembByLoginIdxKey ensureByLoginIdxKey(ISecureSecClusGrpMembByLoginIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecClusGrpMembByLoginIdxKey) {
			return( (SecureBuffSecClusGrpMembByLoginIdxKey)key );
		}
		else {
			SecureBuffSecClusGrpMembByLoginIdxKey mapped = new SecureBuffSecClusGrpMembByLoginIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecClusGrpMemb newRec() {
		ISecureSecClusGrpMemb rec =
			new SecureBuffSecClusGrpMemb();
		return( rec );
	}

	public SecureBuffSecClusGrpMemb ensureRec(ISecureSecClusGrpMemb rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecClusGrpMemb) {
			return ((SecureBuffSecClusGrpMemb)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecClusGrpMemb.CLASS_CODE: {
					SecureBuffSecClusGrpMemb mapped = new SecureBuffSecClusGrpMemb();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecClusGrpMemb",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecClusGrpMemb");
			}
		}
	}

	@Override
	public ISecureSecClusGrpMembH newHRec() {
		ISecureSecClusGrpMembH hrec =
			new SecureBuffSecClusGrpMembH();
		return( hrec );
	}

	public SecureBuffSecClusGrpMembH ensureHRec(ISecureSecClusGrpMembH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecClusGrpMembH) {
			return ((SecureBuffSecClusGrpMembH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecClusGrpMemb.CLASS_CODE: {
					SecureBuffSecClusGrpMembH mapped = new SecureBuffSecClusGrpMembH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecClusGrpMemb",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecClusGrpMemb");
			}
		}
	}
}
