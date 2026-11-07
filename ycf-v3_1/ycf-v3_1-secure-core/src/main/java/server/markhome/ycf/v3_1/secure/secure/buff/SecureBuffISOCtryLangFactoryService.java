
// Description: Java 25 Factory service implementation for ISOCtryLang buffers

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
 *	Java 25 Factory service implementation for ISOCtryLang buffers.
 */
@Service("secure31BuffISOCtryLangFactoryService")
public class SecureBuffISOCtryLangFactoryService
	implements ISecureISOCtryLangFactory
{
	public BusModelBuffISOCtryLangFactoryService() {
	}

    @Override
    public ISecureISOCtryLangPKey newPKey() {
        ISecureISOCtryLangPKey pkey =
            new SecureBuffISOCtryLangPKey();
        return( pkey );
    }

	public SecureBuffISOCtryLangPKey ensurePKey(ISecureISOCtryLangPKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffISOCtryLangPKey) {
			return( (SecureBuffISOCtryLangPKey)key );
		}
		else {
			SecureBuffISOCtryLangPKey mapped = new SecureBuffISOCtryLangPKey();
			mapped.setRequiredISOCtryId( key.getRequiredISOCtryId() );
			mapped.setRequiredISOLangId( key.getRequiredISOLangId() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOCtryLangHPKey newHPKey() {
		ISecureISOCtryLangHPKey hpkey =
			new SecureBuffISOCtryLangHPKey();
		return( hpkey );
	}

	public SecureBuffISOCtryLangHPKey ensureHPKey(ISecureISOCtryLangHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffISOCtryLangHPKey) {
			return( (SecureBuffISOCtryLangHPKey)key );
		}
		else {
			SecureBuffISOCtryLangHPKey mapped = new SecureBuffISOCtryLangHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredISOCtryId( key.getRequiredISOCtryId() );
			mapped.setRequiredISOLangId( key.getRequiredISOLangId() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOCtryLangByCtryIdxKey newByCtryIdxKey() {
		ISecureISOCtryLangByCtryIdxKey key =
			new SecureBuffISOCtryLangByCtryIdxKey();
		return( key );
	}

	public SecureBuffISOCtryLangByCtryIdxKey ensureByCtryIdxKey(ISecureISOCtryLangByCtryIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffISOCtryLangByCtryIdxKey) {
			return( (SecureBuffISOCtryLangByCtryIdxKey)key );
		}
		else {
			SecureBuffISOCtryLangByCtryIdxKey mapped = new SecureBuffISOCtryLangByCtryIdxKey();
			mapped.setRequiredISOCtryId( key.getRequiredISOCtryId() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOCtryLangByLangIdxKey newByLangIdxKey() {
		ISecureISOCtryLangByLangIdxKey key =
			new SecureBuffISOCtryLangByLangIdxKey();
		return( key );
	}

	public SecureBuffISOCtryLangByLangIdxKey ensureByLangIdxKey(ISecureISOCtryLangByLangIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffISOCtryLangByLangIdxKey) {
			return( (SecureBuffISOCtryLangByLangIdxKey)key );
		}
		else {
			SecureBuffISOCtryLangByLangIdxKey mapped = new SecureBuffISOCtryLangByLangIdxKey();
			mapped.setRequiredISOLangId( key.getRequiredISOLangId() );
			return( mapped );
		}
	}

	@Override
	public ISecureISOCtryLang newRec() {
		ISecureISOCtryLang rec =
			new SecureBuffISOCtryLang();
		return( rec );
	}

	public SecureBuffISOCtryLang ensureRec(ISecureISOCtryLang rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffISOCtryLang) {
			return ((SecureBuffISOCtryLang)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureISOCtryLang.CLASS_CODE: {
					SecureBuffISOCtryLang mapped = new SecureBuffISOCtryLang();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOCtryLang",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureISOCtryLang");
			}
		}
	}

	@Override
	public ISecureISOCtryLangH newHRec() {
		ISecureISOCtryLangH hrec =
			new SecureBuffISOCtryLangH();
		return( hrec );
	}

	public SecureBuffISOCtryLangH ensureHRec(ISecureISOCtryLangH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffISOCtryLangH) {
			return ((SecureBuffISOCtryLangH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureISOCtryLang.CLASS_CODE: {
					SecureBuffISOCtryLangH mapped = new SecureBuffISOCtryLangH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOCtryLang",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureISOCtryLang");
			}
		}
	}
}
