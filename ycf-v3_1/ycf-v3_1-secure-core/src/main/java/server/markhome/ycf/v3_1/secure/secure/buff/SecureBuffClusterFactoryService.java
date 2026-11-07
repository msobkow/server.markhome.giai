
// Description: Java 25 Factory service implementation for Cluster buffers

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
 *	Java 25 Factory service implementation for Cluster buffers.
 */
@Service("secure31BuffClusterFactoryService")
public class SecureBuffClusterFactoryService
	implements ISecureClusterFactory
{
	public BusModelBuffClusterFactoryService() {
	}

	@Override
	public ISecureClusterHPKey newHPKey() {
		ISecureClusterHPKey hpkey =
			new SecureBuffClusterHPKey();
		return( hpkey );
	}

	public SecureBuffClusterHPKey ensureHPKey(ISecureClusterHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof SecureBuffClusterHPKey) {
			return( (SecureBuffClusterHPKey)key );
		}
		else {
			SecureBuffClusterHPKey mapped = new SecureBuffClusterHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredId( key.getRequiredId() );
			return( mapped );
		}
	}

	@Override
	public ISecureClusterByUDomNameIdxKey newByUDomNameIdxKey() {
		ISecureClusterByUDomNameIdxKey key =
			new SecureBuffClusterByUDomNameIdxKey();
		return( key );
	}

	public SecureBuffClusterByUDomNameIdxKey ensureByUDomNameIdxKey(ISecureClusterByUDomNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffClusterByUDomNameIdxKey) {
			return( (SecureBuffClusterByUDomNameIdxKey)key );
		}
		else {
			SecureBuffClusterByUDomNameIdxKey mapped = new SecureBuffClusterByUDomNameIdxKey();
			mapped.setRequiredFullDomName( key.getRequiredFullDomName() );
			return( mapped );
		}
	}

	@Override
	public ISecureClusterByUDescrIdxKey newByUDescrIdxKey() {
		ISecureClusterByUDescrIdxKey key =
			new SecureBuffClusterByUDescrIdxKey();
		return( key );
	}

	public SecureBuffClusterByUDescrIdxKey ensureByUDescrIdxKey(ISecureClusterByUDescrIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof SecureBuffClusterByUDescrIdxKey) {
			return( (SecureBuffClusterByUDescrIdxKey)key );
		}
		else {
			SecureBuffClusterByUDescrIdxKey mapped = new SecureBuffClusterByUDescrIdxKey();
			mapped.setRequiredDescription( key.getRequiredDescription() );
			return( mapped );
		}
	}

	@Override
	public ISecureCluster newRec() {
		ISecureCluster rec =
			new SecureBuffCluster();
		return( rec );
	}

	public SecureBuffCluster ensureRec(ISecureCluster rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof SecureBuffCluster) {
			return ((SecureBuffCluster)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ISecureCluster.CLASS_CODE: {
					SecureBuffCluster mapped = new SecureBuffCluster();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureCluster",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of SecureCluster");
			}
		}
	}

	@Override
	public ISecureClusterH newHRec() {
		ISecureClusterH hrec =
			new SecureBuffClusterH();
		return( hrec );
	}

	public SecureBuffClusterH ensureHRec(ISecureClusterH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof SecureBuffClusterH) {
			return ((SecureBuffClusterH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ISecureCluster.CLASS_CODE: {
					SecureBuffClusterH mapped = new SecureBuffClusterH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureCluster",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of SecureCluster");
			}
		}
	}
}
