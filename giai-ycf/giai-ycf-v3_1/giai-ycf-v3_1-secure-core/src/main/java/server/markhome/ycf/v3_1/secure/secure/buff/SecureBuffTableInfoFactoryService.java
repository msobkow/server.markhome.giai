
// Description: Java 25 Factory service implementation for TableInfo buffers

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
 *	Java 25 Factory service implementation for TableInfo buffers.
 */
@Service("secure31BuffTableInfoFactoryService")
public class SecureBuffTableInfoFactoryService
	implements ISecureTableInfoFactory
{
	public BusModelBuffTableInfoFactoryService() {
	}

	@Override
	public ISecureTableInfoHPKey newHPKey() {
		ISecureTableInfoHPKey hpkey =
			new SecureBuffTableInfoHPKey();
		return( hpkey );
	}

	public SecureBuffTableInfoHPKey ensureHPKey(ISecureTableInfoHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffTableInfoHPKey) {
			return( (SecureBuffTableInfoHPKey)key );
		}
		else {
			SecureBuffTableInfoHPKey mapped = new SecureBuffTableInfoHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredTableInfoId( key.getRequiredTableInfoId() );
			return( mapped );
		}
	}

	@Override
	public ISecureTableInfoByTableNameIdxKey newByTableNameIdxKey() {
		ISecureTableInfoByTableNameIdxKey key =
			new SecureBuffTableInfoByTableNameIdxKey();
		return( key );
	}

	public SecureBuffTableInfoByTableNameIdxKey ensureByTableNameIdxKey(ISecureTableInfoByTableNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffTableInfoByTableNameIdxKey) {
			return( (SecureBuffTableInfoByTableNameIdxKey)key );
		}
		else {
			SecureBuffTableInfoByTableNameIdxKey mapped = new SecureBuffTableInfoByTableNameIdxKey();
			mapped.setRequiredTableName( key.getRequiredTableName() );
			return( mapped );
		}
	}

	@Override
	public ISecureTableInfoBySuperNameIdxKey newBySuperNameIdxKey() {
		ISecureTableInfoBySuperNameIdxKey key =
			new SecureBuffTableInfoBySuperNameIdxKey();
		return( key );
	}

	public SecureBuffTableInfoBySuperNameIdxKey ensureBySuperNameIdxKey(ISecureTableInfoBySuperNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffTableInfoBySuperNameIdxKey) {
			return( (SecureBuffTableInfoBySuperNameIdxKey)key );
		}
		else {
			SecureBuffTableInfoBySuperNameIdxKey mapped = new SecureBuffTableInfoBySuperNameIdxKey();
			mapped.setOptionalSuperName( key.getOptionalSuperName() );
			return( mapped );
		}
	}

	@Override
	public ISecureTableInfoBySchemaNameIdxKey newBySchemaNameIdxKey() {
		ISecureTableInfoBySchemaNameIdxKey key =
			new SecureBuffTableInfoBySchemaNameIdxKey();
		return( key );
	}

	public SecureBuffTableInfoBySchemaNameIdxKey ensureBySchemaNameIdxKey(ISecureTableInfoBySchemaNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffTableInfoBySchemaNameIdxKey) {
			return( (SecureBuffTableInfoBySchemaNameIdxKey)key );
		}
		else {
			SecureBuffTableInfoBySchemaNameIdxKey mapped = new SecureBuffTableInfoBySchemaNameIdxKey();
			mapped.setRequiredSchemaName( key.getRequiredSchemaName() );
			return( mapped );
		}
	}

	@Override
	public ISecureTableInfoBySchemaBkCodeIdxKey newBySchemaBkCodeIdxKey() {
		ISecureTableInfoBySchemaBkCodeIdxKey key =
			new SecureBuffTableInfoBySchemaBkCodeIdxKey();
		return( key );
	}

	public SecureBuffTableInfoBySchemaBkCodeIdxKey ensureBySchemaBkCodeIdxKey(ISecureTableInfoBySchemaBkCodeIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffTableInfoBySchemaBkCodeIdxKey) {
			return( (SecureBuffTableInfoBySchemaBkCodeIdxKey)key );
		}
		else {
			SecureBuffTableInfoBySchemaBkCodeIdxKey mapped = new SecureBuffTableInfoBySchemaBkCodeIdxKey();
			mapped.setRequiredSchemaName( key.getRequiredSchemaName() );
			mapped.setRequiredBackingClassCode( key.getRequiredBackingClassCode() );
			return( mapped );
		}
	}

	@Override
	public ISecureTableInfoBySchemaRTCodeIdxKey newBySchemaRTCodeIdxKey() {
		ISecureTableInfoBySchemaRTCodeIdxKey key =
			new SecureBuffTableInfoBySchemaRTCodeIdxKey();
		return( key );
	}

	public SecureBuffTableInfoBySchemaRTCodeIdxKey ensureBySchemaRTCodeIdxKey(ISecureTableInfoBySchemaRTCodeIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffTableInfoBySchemaRTCodeIdxKey) {
			return( (SecureBuffTableInfoBySchemaRTCodeIdxKey)key );
		}
		else {
			SecureBuffTableInfoBySchemaRTCodeIdxKey mapped = new SecureBuffTableInfoBySchemaRTCodeIdxKey();
			mapped.setRequiredRuntimeClassCode( key.getRequiredRuntimeClassCode() );
			return( mapped );
		}
	}

	@Override
	public ISecureTableInfo newRec() {
		ISecureTableInfo rec =
			new SecureBuffTableInfo();
		return( rec );
	}

	public SecureBuffTableInfo ensureRec(ISecureTableInfo rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffTableInfo) {
			return ((SecureBuffTableInfo)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureTableInfo.CLASS_CODE: {
					SecureBuffTableInfo mapped = new SecureBuffTableInfo();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureTableInfo",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureTableInfo");
			}
		}
	}

	@Override
	public ISecureTableInfoH newHRec() {
		ISecureTableInfoH hrec =
			new SecureBuffTableInfoH();
		return( hrec );
	}

	public SecureBuffTableInfoH ensureHRec(ISecureTableInfoH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffTableInfoH) {
			return ((SecureBuffTableInfoH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureTableInfo.CLASS_CODE: {
					SecureBuffTableInfoH mapped = new SecureBuffTableInfoH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureTableInfo",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureTableInfo");
			}
		}
	}
}
