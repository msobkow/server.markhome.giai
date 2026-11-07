
// Description: Java 25 Factory service implementation for SecUser buffers

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
 *	Java 25 Factory service implementation for SecUser buffers.
 */
@Service("secure31BuffSecUserFactoryService")
public class SecureBuffSecUserFactoryService
	implements ISecureSecUserFactory
{
	public BusModelBuffSecUserFactoryService() {
	}

	@Override
	public ISecureSecUserHPKey newHPKey() {
		ISecureSecUserHPKey hpkey =
			new SecureBuffSecUserHPKey();
		return( hpkey );
	}

	public SecureBuffSecUserHPKey ensureHPKey(ISecureSecUserHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecUserHPKey) {
			return( (SecureBuffSecUserHPKey)key );
		}
		else {
			SecureBuffSecUserHPKey mapped = new SecureBuffSecUserHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecUserId( key.getRequiredSecUserId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecUserByULoginIdxKey newByULoginIdxKey() {
		ISecureSecUserByULoginIdxKey key =
			new SecureBuffSecUserByULoginIdxKey();
		return( key );
	}

	public SecureBuffSecUserByULoginIdxKey ensureByULoginIdxKey(ISecureSecUserByULoginIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecUserByULoginIdxKey) {
			return( (SecureBuffSecUserByULoginIdxKey)key );
		}
		else {
			SecureBuffSecUserByULoginIdxKey mapped = new SecureBuffSecUserByULoginIdxKey();
			mapped.setRequiredLoginId( key.getRequiredLoginId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecUserByEMAddrIdxKey newByEMAddrIdxKey() {
		ISecureSecUserByEMAddrIdxKey key =
			new SecureBuffSecUserByEMAddrIdxKey();
		return( key );
	}

	public SecureBuffSecUserByEMAddrIdxKey ensureByEMAddrIdxKey(ISecureSecUserByEMAddrIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecUserByEMAddrIdxKey) {
			return( (SecureBuffSecUserByEMAddrIdxKey)key );
		}
		else {
			SecureBuffSecUserByEMAddrIdxKey mapped = new SecureBuffSecUserByEMAddrIdxKey();
			mapped.setRequiredEMailAddress( key.getRequiredEMailAddress() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecUser newRec() {
		ISecureSecUser rec =
			new SecureBuffSecUser();
		return( rec );
	}

	public SecureBuffSecUser ensureRec(ISecureSecUser rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecUser) {
			return ((SecureBuffSecUser)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecUser.CLASS_CODE: {
					SecureBuffSecUser mapped = new SecureBuffSecUser();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUser",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUser");
			}
		}
	}

	@Override
	public ISecureSecUserH newHRec() {
		ISecureSecUserH hrec =
			new SecureBuffSecUserH();
		return( hrec );
	}

	public SecureBuffSecUserH ensureHRec(ISecureSecUserH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecUserH) {
			return ((SecureBuffSecUserH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecUser.CLASS_CODE: {
					SecureBuffSecUserH mapped = new SecureBuffSecUserH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUser",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUser");
			}
		}
	}
}
