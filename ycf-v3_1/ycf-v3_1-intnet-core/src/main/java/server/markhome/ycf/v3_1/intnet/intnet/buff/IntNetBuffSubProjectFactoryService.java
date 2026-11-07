
// Description: Java 25 Factory service implementation for SubProject buffers

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
 *	Java 25 Factory service implementation for SubProject buffers.
 */
@Service("intnet31BuffSubProjectFactoryService")
public class IntNetBuffSubProjectFactoryService
	implements IIntNetSubProjectFactory
{
	public BusModelBuffSubProjectFactoryService() {
	}

	@Override
	public IIntNetSubProjectHPKey newHPKey() {
		IIntNetSubProjectHPKey hpkey =
			new IntNetBuffSubProjectHPKey();
		return( hpkey );
	}

	public IntNetBuffSubProjectHPKey ensureHPKey(IIntNetSubProjectHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetBuffSubProjectHPKey) {
			return( (IntNetBuffSubProjectHPKey)key );
		}
		else {
			IntNetBuffSubProjectHPKey mapped = new IntNetBuffSubProjectHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredId( key.getRequiredId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetSubProjectByTenantIdxKey newByTenantIdxKey() {
		IIntNetSubProjectByTenantIdxKey key =
			new IntNetBuffSubProjectByTenantIdxKey();
		return( key );
	}

	public IntNetBuffSubProjectByTenantIdxKey ensureByTenantIdxKey(IIntNetSubProjectByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffSubProjectByTenantIdxKey) {
			return( (IntNetBuffSubProjectByTenantIdxKey)key );
		}
		else {
			IntNetBuffSubProjectByTenantIdxKey mapped = new IntNetBuffSubProjectByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetSubProjectByTopProjectIdxKey newByTopProjectIdxKey() {
		IIntNetSubProjectByTopProjectIdxKey key =
			new IntNetBuffSubProjectByTopProjectIdxKey();
		return( key );
	}

	public IntNetBuffSubProjectByTopProjectIdxKey ensureByTopProjectIdxKey(IIntNetSubProjectByTopProjectIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffSubProjectByTopProjectIdxKey) {
			return( (IntNetBuffSubProjectByTopProjectIdxKey)key );
		}
		else {
			IntNetBuffSubProjectByTopProjectIdxKey mapped = new IntNetBuffSubProjectByTopProjectIdxKey();
			mapped.setRequiredTopProjectId( key.getRequiredTopProjectId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetSubProjectByNameIdxKey newByNameIdxKey() {
		IIntNetSubProjectByNameIdxKey key =
			new IntNetBuffSubProjectByNameIdxKey();
		return( key );
	}

	public IntNetBuffSubProjectByNameIdxKey ensureByNameIdxKey(IIntNetSubProjectByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffSubProjectByNameIdxKey) {
			return( (IntNetBuffSubProjectByNameIdxKey)key );
		}
		else {
			IntNetBuffSubProjectByNameIdxKey mapped = new IntNetBuffSubProjectByNameIdxKey();
			mapped.setRequiredTopProjectId( key.getRequiredTopProjectId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public IIntNetSubProject newRec() {
		IIntNetSubProject rec =
			new IntNetBuffSubProject();
		return( rec );
	}

	public IntNetBuffSubProject ensureRec(IIntNetSubProject rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetBuffSubProject) {
			return ((IntNetBuffSubProject)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IIntNetSubProject.CLASS_CODE: {
					IntNetBuffSubProject mapped = new IntNetBuffSubProject();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetSubProject",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetSubProject");
			}
		}
	}

	@Override
	public IIntNetSubProjectH newHRec() {
		IIntNetSubProjectH hrec =
			new IntNetBuffSubProjectH();
		return( hrec );
	}

	public IntNetBuffSubProjectH ensureHRec(IIntNetSubProjectH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetBuffSubProjectH) {
			return ((IntNetBuffSubProjectH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IIntNetSubProject.CLASS_CODE: {
					IntNetBuffSubProjectH mapped = new IntNetBuffSubProjectH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetSubProject",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetSubProject");
			}
		}
	}
}
