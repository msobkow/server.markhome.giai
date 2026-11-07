
// Description: Java 25 Factory service implementation for TopProject buffers

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
 *	Java 25 Factory service implementation for TopProject buffers.
 */
@Service("intnet31BuffTopProjectFactoryService")
public class IntNetBuffTopProjectFactoryService
	implements IIntNetTopProjectFactory
{
	public BusModelBuffTopProjectFactoryService() {
	}

	@Override
	public IIntNetTopProjectHPKey newHPKey() {
		IIntNetTopProjectHPKey hpkey =
			new IntNetBuffTopProjectHPKey();
		return( hpkey );
	}

	public IntNetBuffTopProjectHPKey ensureHPKey(IIntNetTopProjectHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetBuffTopProjectHPKey) {
			return( (IntNetBuffTopProjectHPKey)key );
		}
		else {
			IntNetBuffTopProjectHPKey mapped = new IntNetBuffTopProjectHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredId( key.getRequiredId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetTopProjectByTenantIdxKey newByTenantIdxKey() {
		IIntNetTopProjectByTenantIdxKey key =
			new IntNetBuffTopProjectByTenantIdxKey();
		return( key );
	}

	public IntNetBuffTopProjectByTenantIdxKey ensureByTenantIdxKey(IIntNetTopProjectByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffTopProjectByTenantIdxKey) {
			return( (IntNetBuffTopProjectByTenantIdxKey)key );
		}
		else {
			IntNetBuffTopProjectByTenantIdxKey mapped = new IntNetBuffTopProjectByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetTopProjectByTopDomainIdxKey newByTopDomainIdxKey() {
		IIntNetTopProjectByTopDomainIdxKey key =
			new IntNetBuffTopProjectByTopDomainIdxKey();
		return( key );
	}

	public IntNetBuffTopProjectByTopDomainIdxKey ensureByTopDomainIdxKey(IIntNetTopProjectByTopDomainIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffTopProjectByTopDomainIdxKey) {
			return( (IntNetBuffTopProjectByTopDomainIdxKey)key );
		}
		else {
			IntNetBuffTopProjectByTopDomainIdxKey mapped = new IntNetBuffTopProjectByTopDomainIdxKey();
			mapped.setRequiredTopDomainId( key.getRequiredTopDomainId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetTopProjectByNameIdxKey newByNameIdxKey() {
		IIntNetTopProjectByNameIdxKey key =
			new IntNetBuffTopProjectByNameIdxKey();
		return( key );
	}

	public IntNetBuffTopProjectByNameIdxKey ensureByNameIdxKey(IIntNetTopProjectByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffTopProjectByNameIdxKey) {
			return( (IntNetBuffTopProjectByNameIdxKey)key );
		}
		else {
			IntNetBuffTopProjectByNameIdxKey mapped = new IntNetBuffTopProjectByNameIdxKey();
			mapped.setRequiredTopDomainId( key.getRequiredTopDomainId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public IIntNetTopProject newRec() {
		IIntNetTopProject rec =
			new IntNetBuffTopProject();
		return( rec );
	}

	public IntNetBuffTopProject ensureRec(IIntNetTopProject rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetBuffTopProject) {
			return ((IntNetBuffTopProject)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IIntNetTopProject.CLASS_CODE: {
					IntNetBuffTopProject mapped = new IntNetBuffTopProject();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetTopProject",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetTopProject");
			}
		}
	}

	@Override
	public IIntNetTopProjectH newHRec() {
		IIntNetTopProjectH hrec =
			new IntNetBuffTopProjectH();
		return( hrec );
	}

	public IntNetBuffTopProjectH ensureHRec(IIntNetTopProjectH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetBuffTopProjectH) {
			return ((IntNetBuffTopProjectH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IIntNetTopProject.CLASS_CODE: {
					IntNetBuffTopProjectH mapped = new IntNetBuffTopProjectH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetTopProject",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetTopProject");
			}
		}
	}
}
