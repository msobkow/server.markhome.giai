
// Description: Java 25 Factory service implementation for ISOTZone buffers

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
 *	Java 25 Factory service implementation for ISOTZone buffers.
 */
@Service("secure31BuffISOTZoneFactoryService")
public class SecureBuffISOTZoneFactoryService
	implements ISecureISOTZoneFactory
{
	public BusModelBuffISOTZoneFactoryService() {
	}

	@Override
	public ISecureISOTZoneHPKey newHPKey() {
		ISecureISOTZoneHPKey hpkey =
			new SecureBuffISOTZoneHPKey();
		return( hpkey );
	}

	public SecureBuffISOTZoneHPKey ensureHPKey(ISecureISOTZoneHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffISOTZoneHPKey) {
			return( (SecureBuffISOTZoneHPKey)key );
		}
		else {
			SecureBuffISOTZoneHPKey mapped = new SecureBuffISOTZoneHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredISOTZoneId( key.getRequiredISOTZoneId() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOTZoneByOffsetIdxKey newByOffsetIdxKey() {
		ISecureISOTZoneByOffsetIdxKey key =
			new SecureBuffISOTZoneByOffsetIdxKey();
		return( key );
	}

	public SecureBuffISOTZoneByOffsetIdxKey ensureByOffsetIdxKey(ISecureISOTZoneByOffsetIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffISOTZoneByOffsetIdxKey) {
			return( (SecureBuffISOTZoneByOffsetIdxKey)key );
		}
		else {
			SecureBuffISOTZoneByOffsetIdxKey mapped = new SecureBuffISOTZoneByOffsetIdxKey();
			mapped.setRequiredTZHourOffset( key.getRequiredTZHourOffset() );
			mapped.setRequiredTZMinOffset( key.getRequiredTZMinOffset() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOTZoneByUTZNameIdxKey newByUTZNameIdxKey() {
		ISecureISOTZoneByUTZNameIdxKey key =
			new SecureBuffISOTZoneByUTZNameIdxKey();
		return( key );
	}

	public SecureBuffISOTZoneByUTZNameIdxKey ensureByUTZNameIdxKey(ISecureISOTZoneByUTZNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffISOTZoneByUTZNameIdxKey) {
			return( (SecureBuffISOTZoneByUTZNameIdxKey)key );
		}
		else {
			SecureBuffISOTZoneByUTZNameIdxKey mapped = new SecureBuffISOTZoneByUTZNameIdxKey();
			mapped.setRequiredTZName( key.getRequiredTZName() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOTZoneByIso8601IdxKey newByIso8601IdxKey() {
		ISecureISOTZoneByIso8601IdxKey key =
			new SecureBuffISOTZoneByIso8601IdxKey();
		return( key );
	}

	public SecureBuffISOTZoneByIso8601IdxKey ensureByIso8601IdxKey(ISecureISOTZoneByIso8601IdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffISOTZoneByIso8601IdxKey) {
			return( (SecureBuffISOTZoneByIso8601IdxKey)key );
		}
		else {
			SecureBuffISOTZoneByIso8601IdxKey mapped = new SecureBuffISOTZoneByIso8601IdxKey();
			mapped.setRequiredIso8601( key.getRequiredIso8601() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOTZone newRec() {
		ISecureISOTZone rec =
			new SecureBuffISOTZone();
		return( rec );
	}

	public SecureBuffISOTZone ensureRec(ISecureISOTZone rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffISOTZone) {
			return ((SecureBuffISOTZone)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureISOTZone.CLASS_CODE: {
					SecureBuffISOTZone mapped = new SecureBuffISOTZone();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOTZone",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOTZone");
			}
		}
	}

	@Override
	public ISecureISOTZoneH newHRec() {
		ISecureISOTZoneH hrec =
			new SecureBuffISOTZoneH();
		return( hrec );
	}

	public SecureBuffISOTZoneH ensureHRec(ISecureISOTZoneH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffISOTZoneH) {
			return ((SecureBuffISOTZoneH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureISOTZone.CLASS_CODE: {
					SecureBuffISOTZoneH mapped = new SecureBuffISOTZoneH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOTZone",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOTZone");
			}
		}
	}
}
