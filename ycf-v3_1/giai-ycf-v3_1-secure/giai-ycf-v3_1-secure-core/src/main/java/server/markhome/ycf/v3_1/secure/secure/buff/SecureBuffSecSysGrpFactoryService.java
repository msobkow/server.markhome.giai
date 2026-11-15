
// Description: Java 25 Factory service implementation for SecSysGrp buffers

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
 *	Java 25 Factory service implementation for SecSysGrp buffers.
 */
@Service("secure31BuffSecSysGrpFactoryService")
public class SecureBuffSecSysGrpFactoryService
	implements ISecureSecSysGrpFactory
{
	public BusModelBuffSecSysGrpFactoryService() {
	}

	@Override
	public ISecureSecSysGrpHPKey newHPKey() {
		ISecureSecSysGrpHPKey hpkey =
			new SecureBuffSecSysGrpHPKey();
		return( hpkey );
	}

	public SecureBuffSecSysGrpHPKey ensureHPKey(ISecureSecSysGrpHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffSecSysGrpHPKey) {
			return( (SecureBuffSecSysGrpHPKey)key );
		}
		else {
			SecureBuffSecSysGrpHPKey mapped = new SecureBuffSecSysGrpHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredSecSysGrpId( key.getRequiredSecSysGrpId() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysGrpByUNameIdxKey newByUNameIdxKey() {
		ISecureSecSysGrpByUNameIdxKey key =
			new SecureBuffSecSysGrpByUNameIdxKey();
		return( key );
	}

	public SecureBuffSecSysGrpByUNameIdxKey ensureByUNameIdxKey(ISecureSecSysGrpByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecSysGrpByUNameIdxKey) {
			return( (SecureBuffSecSysGrpByUNameIdxKey)key );
		}
		else {
			SecureBuffSecSysGrpByUNameIdxKey mapped = new SecureBuffSecSysGrpByUNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysGrpBySecLevelIdxKey newBySecLevelIdxKey() {
		ISecureSecSysGrpBySecLevelIdxKey key =
			new SecureBuffSecSysGrpBySecLevelIdxKey();
		return( key );
	}

	public SecureBuffSecSysGrpBySecLevelIdxKey ensureBySecLevelIdxKey(ISecureSecSysGrpBySecLevelIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffSecSysGrpBySecLevelIdxKey) {
			return( (SecureBuffSecSysGrpBySecLevelIdxKey)key );
		}
		else {
			SecureBuffSecSysGrpBySecLevelIdxKey mapped = new SecureBuffSecSysGrpBySecLevelIdxKey();
			mapped.setRequiredSecLevel( key.getRequiredSecLevel() );
			return( mapped );
		}
	}

	@Override
	public ISecureSecSysGrp newRec() {
		ISecureSecSysGrp rec =
			new SecureBuffSecSysGrp();
		return( rec );
	}

	public SecureBuffSecSysGrp ensureRec(ISecureSecSysGrp rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffSecSysGrp) {
			return ((SecureBuffSecSysGrp)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureSecSysGrp.CLASS_CODE: {
					SecureBuffSecSysGrp mapped = new SecureBuffSecSysGrp();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysGrp",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureSecSysGrp");
			}
		}
	}

	@Override
	public ISecureSecSysGrpH newHRec() {
		ISecureSecSysGrpH hrec =
			new SecureBuffSecSysGrpH();
		return( hrec );
	}

	public SecureBuffSecSysGrpH ensureHRec(ISecureSecSysGrpH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffSecSysGrpH) {
			return ((SecureBuffSecSysGrpH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureSecSysGrp.CLASS_CODE: {
					SecureBuffSecSysGrpH mapped = new SecureBuffSecSysGrpH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysGrp",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureSecSysGrp");
			}
		}
	}
}
