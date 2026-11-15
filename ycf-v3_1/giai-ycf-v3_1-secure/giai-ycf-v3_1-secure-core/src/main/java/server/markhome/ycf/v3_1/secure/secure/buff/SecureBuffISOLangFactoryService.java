
// Description: Java 25 Factory service implementation for ISOLang buffers

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
 *	Java 25 Factory service implementation for ISOLang buffers.
 */
@Service("secure31BuffISOLangFactoryService")
public class SecureBuffISOLangFactoryService
	implements ISecureISOLangFactory
{
	public BusModelBuffISOLangFactoryService() {
	}

	@Override
	public ISecureISOLangHPKey newHPKey() {
		ISecureISOLangHPKey hpkey =
			new SecureBuffISOLangHPKey();
		return( hpkey );
	}

	public SecureBuffISOLangHPKey ensureHPKey(ISecureISOLangHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffISOLangHPKey) {
			return( (SecureBuffISOLangHPKey)key );
		}
		else {
			SecureBuffISOLangHPKey mapped = new SecureBuffISOLangHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredISOLangId( key.getRequiredISOLangId() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOLangByCode3IdxKey newByCode3IdxKey() {
		ISecureISOLangByCode3IdxKey key =
			new SecureBuffISOLangByCode3IdxKey();
		return( key );
	}

	public SecureBuffISOLangByCode3IdxKey ensureByCode3IdxKey(ISecureISOLangByCode3IdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffISOLangByCode3IdxKey) {
			return( (SecureBuffISOLangByCode3IdxKey)key );
		}
		else {
			SecureBuffISOLangByCode3IdxKey mapped = new SecureBuffISOLangByCode3IdxKey();
			mapped.setRequiredISO6392Code( key.getRequiredISO6392Code() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOLangByCode2IdxKey newByCode2IdxKey() {
		ISecureISOLangByCode2IdxKey key =
			new SecureBuffISOLangByCode2IdxKey();
		return( key );
	}

	public SecureBuffISOLangByCode2IdxKey ensureByCode2IdxKey(ISecureISOLangByCode2IdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffISOLangByCode2IdxKey) {
			return( (SecureBuffISOLangByCode2IdxKey)key );
		}
		else {
			SecureBuffISOLangByCode2IdxKey mapped = new SecureBuffISOLangByCode2IdxKey();
			mapped.setOptionalISO6391Code( key.getOptionalISO6391Code() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOLang newRec() {
		ISecureISOLang rec =
			new SecureBuffISOLang();
		return( rec );
	}

	public SecureBuffISOLang ensureRec(ISecureISOLang rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffISOLang) {
			return ((SecureBuffISOLang)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureISOLang.CLASS_CODE: {
					SecureBuffISOLang mapped = new SecureBuffISOLang();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOLang",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOLang");
			}
		}
	}

	@Override
	public ISecureISOLangH newHRec() {
		ISecureISOLangH hrec =
			new SecureBuffISOLangH();
		return( hrec );
	}

	public SecureBuffISOLangH ensureHRec(ISecureISOLangH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffISOLangH) {
			return ((SecureBuffISOLangH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureISOLang.CLASS_CODE: {
					SecureBuffISOLangH mapped = new SecureBuffISOLangH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOLang",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOLang");
			}
		}
	}
}
