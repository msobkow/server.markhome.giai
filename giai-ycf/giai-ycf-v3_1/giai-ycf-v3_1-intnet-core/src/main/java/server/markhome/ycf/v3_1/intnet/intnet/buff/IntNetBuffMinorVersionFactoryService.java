
// Description: Java 25 Factory service implementation for MinorVersion buffers

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

package server.markhome.ycf.v3_1.intnet.intnet.buff;

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
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;

/*
 *	Java 25 Factory service implementation for MinorVersion buffers.
 */
@Service("intnet31BuffMinorVersionFactoryService")
public class IntNetBuffMinorVersionFactoryService
	implements IIntNetMinorVersionFactory
{
	public BusModelBuffMinorVersionFactoryService() {
	}

	@Override
	public IIntNetMinorVersionHPKey newHPKey() {
		IIntNetMinorVersionHPKey hpkey =
			new IntNetBuffMinorVersionHPKey();
		return( hpkey );
	}

	public IntNetBuffMinorVersionHPKey ensureHPKey(IIntNetMinorVersionHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetBuffMinorVersionHPKey) {
			return( (IntNetBuffMinorVersionHPKey)key );
		}
		else {
			IntNetBuffMinorVersionHPKey mapped = new IntNetBuffMinorVersionHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredId( key.getRequiredId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetMinorVersionByTenantIdxKey newByTenantIdxKey() {
		IIntNetMinorVersionByTenantIdxKey key =
			new IntNetBuffMinorVersionByTenantIdxKey();
		return( key );
	}

	public IntNetBuffMinorVersionByTenantIdxKey ensureByTenantIdxKey(IIntNetMinorVersionByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffMinorVersionByTenantIdxKey) {
			return( (IntNetBuffMinorVersionByTenantIdxKey)key );
		}
		else {
			IntNetBuffMinorVersionByTenantIdxKey mapped = new IntNetBuffMinorVersionByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetMinorVersionByMajorVerIdxKey newByMajorVerIdxKey() {
		IIntNetMinorVersionByMajorVerIdxKey key =
			new IntNetBuffMinorVersionByMajorVerIdxKey();
		return( key );
	}

	public IntNetBuffMinorVersionByMajorVerIdxKey ensureByMajorVerIdxKey(IIntNetMinorVersionByMajorVerIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffMinorVersionByMajorVerIdxKey) {
			return( (IntNetBuffMinorVersionByMajorVerIdxKey)key );
		}
		else {
			IntNetBuffMinorVersionByMajorVerIdxKey mapped = new IntNetBuffMinorVersionByMajorVerIdxKey();
			mapped.setRequiredMajorVersionId( key.getRequiredMajorVersionId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetMinorVersionByNameIdxKey newByNameIdxKey() {
		IIntNetMinorVersionByNameIdxKey key =
			new IntNetBuffMinorVersionByNameIdxKey();
		return( key );
	}

	public IntNetBuffMinorVersionByNameIdxKey ensureByNameIdxKey(IIntNetMinorVersionByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffMinorVersionByNameIdxKey) {
			return( (IntNetBuffMinorVersionByNameIdxKey)key );
		}
		else {
			IntNetBuffMinorVersionByNameIdxKey mapped = new IntNetBuffMinorVersionByNameIdxKey();
			mapped.setRequiredMajorVersionId( key.getRequiredMajorVersionId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public IIntNetMinorVersion newRec() {
		IIntNetMinorVersion rec =
			new IntNetBuffMinorVersion();
		return( rec );
	}

	public IntNetBuffMinorVersion ensureRec(IIntNetMinorVersion rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetBuffMinorVersion) {
			return ((IntNetBuffMinorVersion)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IIntNetMinorVersion.CLASS_CODE: {
					IntNetBuffMinorVersion mapped = new IntNetBuffMinorVersion();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMinorVersion",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMinorVersion");
			}
		}
	}

	@Override
	public IIntNetMinorVersionH newHRec() {
		IIntNetMinorVersionH hrec =
			new IntNetBuffMinorVersionH();
		return( hrec );
	}

	public IntNetBuffMinorVersionH ensureHRec(IIntNetMinorVersionH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetBuffMinorVersionH) {
			return ((IntNetBuffMinorVersionH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IIntNetMinorVersion.CLASS_CODE: {
					IntNetBuffMinorVersionH mapped = new IntNetBuffMinorVersionH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMinorVersion",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMinorVersion");
			}
		}
	}
}
