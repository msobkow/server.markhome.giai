
// Description: Java 25 Factory service implementation for SecUserPassword buffers

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
 *	Java 25 Factory service implementation for SecUserPassword buffers.
 */
@Service("secure31BuffSecUserPasswordFactoryService")
public class SecureBuffSecUserPasswordFactoryService
	implements ISecureSecUserPasswordFactory
{
	public BusModelBuffSecUserPasswordFactoryService() {
	}

	@Override
	public ISecureSecUserPasswordHPKey newHPKey() {
		ISecureSecUserPasswordHPKey hpkey =
			new SecureBuffSecUserPasswordHPKey();
		return( hpkey );
	}

	public SecureBuffSecUserPasswordHPKey ensureHPKey(ISecureSecUserPasswordHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecUserPasswordHPKey) {
			return( (SecureBuffSecUserPasswordHPKey)key );
		}
		else {
			SecureBuffSecUserPasswordHPKey mapped = new SecureBuffSecUserPasswordHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecUserId( key.getRequiredSecUserId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecUserPasswordBySetStampIdxKey newBySetStampIdxKey() {
		ISecureSecUserPasswordBySetStampIdxKey key =
			new SecureBuffSecUserPasswordBySetStampIdxKey();
		return( key );
	}

	public SecureBuffSecUserPasswordBySetStampIdxKey ensureBySetStampIdxKey(ISecureSecUserPasswordBySetStampIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecUserPasswordBySetStampIdxKey) {
			return( (SecureBuffSecUserPasswordBySetStampIdxKey)key );
		}
		else {
			SecureBuffSecUserPasswordBySetStampIdxKey mapped = new SecureBuffSecUserPasswordBySetStampIdxKey();
			mapped.setRequiredPWSetStamp( key.getRequiredPWSetStamp() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecUserPassword newRec() {
		ISecureSecUserPassword rec =
			new SecureBuffSecUserPassword();
		return( rec );
	}

	public SecureBuffSecUserPassword ensureRec(ISecureSecUserPassword rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecUserPassword) {
			return ((SecureBuffSecUserPassword)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecUserPassword.CLASS_CODE: {
					SecureBuffSecUserPassword mapped = new SecureBuffSecUserPassword();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUserPassword",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecUserPassword");
			}
		}
	}

	@Override
	public ISecureSecUserPasswordH newHRec() {
		ISecureSecUserPasswordH hrec =
			new SecureBuffSecUserPasswordH();
		return( hrec );
	}

	public SecureBuffSecUserPasswordH ensureHRec(ISecureSecUserPasswordH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecUserPasswordH) {
			return ((SecureBuffSecUserPasswordH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecUserPassword.CLASS_CODE: {
					SecureBuffSecUserPasswordH mapped = new SecureBuffSecUserPasswordH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUserPassword",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecUserPassword");
			}
		}
	}
}
