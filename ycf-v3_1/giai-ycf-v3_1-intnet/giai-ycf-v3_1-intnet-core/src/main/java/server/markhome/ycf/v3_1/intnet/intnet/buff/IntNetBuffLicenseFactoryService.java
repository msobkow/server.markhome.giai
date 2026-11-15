
// Description: Java 25 Factory service implementation for License buffers

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
 *	Java 25 Factory service implementation for License buffers.
 */
@Service("intnet31BuffLicenseFactoryService")
public class IntNetBuffLicenseFactoryService
	implements IIntNetLicenseFactory
{
	public BusModelBuffLicenseFactoryService() {
	}

	@Override
	public IIntNetLicenseHPKey newHPKey() {
		IIntNetLicenseHPKey hpkey =
			new IntNetBuffLicenseHPKey();
		return( hpkey );
	}

	public IntNetBuffLicenseHPKey ensureHPKey(IIntNetLicenseHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetBuffLicenseHPKey) {
			return( (IntNetBuffLicenseHPKey)key );
		}
		else {
			IntNetBuffLicenseHPKey mapped = new IntNetBuffLicenseHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredId( key.getRequiredId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetLicenseByLicnTenantIdxKey newByLicnTenantIdxKey() {
		IIntNetLicenseByLicnTenantIdxKey key =
			new IntNetBuffLicenseByLicnTenantIdxKey();
		return( key );
	}

	public IntNetBuffLicenseByLicnTenantIdxKey ensureByLicnTenantIdxKey(IIntNetLicenseByLicnTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffLicenseByLicnTenantIdxKey) {
			return( (IntNetBuffLicenseByLicnTenantIdxKey)key );
		}
		else {
			IntNetBuffLicenseByLicnTenantIdxKey mapped = new IntNetBuffLicenseByLicnTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetLicenseByDomainIdxKey newByDomainIdxKey() {
		IIntNetLicenseByDomainIdxKey key =
			new IntNetBuffLicenseByDomainIdxKey();
		return( key );
	}

	public IntNetBuffLicenseByDomainIdxKey ensureByDomainIdxKey(IIntNetLicenseByDomainIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffLicenseByDomainIdxKey) {
			return( (IntNetBuffLicenseByDomainIdxKey)key );
		}
		else {
			IntNetBuffLicenseByDomainIdxKey mapped = new IntNetBuffLicenseByDomainIdxKey();
			mapped.setRequiredTopDomainId( key.getRequiredTopDomainId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetLicenseByUNameIdxKey newByUNameIdxKey() {
		IIntNetLicenseByUNameIdxKey key =
			new IntNetBuffLicenseByUNameIdxKey();
		return( key );
	}

	public IntNetBuffLicenseByUNameIdxKey ensureByUNameIdxKey(IIntNetLicenseByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffLicenseByUNameIdxKey) {
			return( (IntNetBuffLicenseByUNameIdxKey)key );
		}
		else {
			IntNetBuffLicenseByUNameIdxKey mapped = new IntNetBuffLicenseByUNameIdxKey();
			mapped.setRequiredTopDomainId( key.getRequiredTopDomainId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public IIntNetLicense newRec() {
		IIntNetLicense rec =
			new IntNetBuffLicense();
		return( rec );
	}

	public IntNetBuffLicense ensureRec(IIntNetLicense rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetBuffLicense) {
			return ((IntNetBuffLicense)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IIntNetLicense.CLASS_CODE: {
					IntNetBuffLicense mapped = new IntNetBuffLicense();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetLicense",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetLicense");
			}
		}
	}

	@Override
	public IIntNetLicenseH newHRec() {
		IIntNetLicenseH hrec =
			new IntNetBuffLicenseH();
		return( hrec );
	}

	public IntNetBuffLicenseH ensureHRec(IIntNetLicenseH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetBuffLicenseH) {
			return ((IntNetBuffLicenseH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IIntNetLicense.CLASS_CODE: {
					IntNetBuffLicenseH mapped = new IntNetBuffLicenseH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetLicense",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetLicense");
			}
		}
	}
}
