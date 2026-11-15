
// Description: Java 25 Factory service implementation for MimeType buffers

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
 *	Java 25 Factory service implementation for MimeType buffers.
 */
@Service("intnet31BuffMimeTypeFactoryService")
public class IntNetBuffMimeTypeFactoryService
	implements IIntNetMimeTypeFactory
{
	public BusModelBuffMimeTypeFactoryService() {
	}

	@Override
	public IIntNetMimeTypeHPKey newHPKey() {
		IIntNetMimeTypeHPKey hpkey =
			new IntNetBuffMimeTypeHPKey();
		return( hpkey );
	}

	public IntNetBuffMimeTypeHPKey ensureHPKey(IIntNetMimeTypeHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof IntNetBuffMimeTypeHPKey) {
			return( (IntNetBuffMimeTypeHPKey)key );
		}
		else {
			IntNetBuffMimeTypeHPKey mapped = new IntNetBuffMimeTypeHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredMimeTypeId( key.getRequiredMimeTypeId() );
			return( mapped );
		}
	}

	@Override
	public IIntNetMimeTypeByUNameIdxKey newByUNameIdxKey() {
		IIntNetMimeTypeByUNameIdxKey key =
			new IntNetBuffMimeTypeByUNameIdxKey();
		return( key );
	}

	public IntNetBuffMimeTypeByUNameIdxKey ensureByUNameIdxKey(IIntNetMimeTypeByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof IntNetBuffMimeTypeByUNameIdxKey) {
			return( (IntNetBuffMimeTypeByUNameIdxKey)key );
		}
		else {
			IntNetBuffMimeTypeByUNameIdxKey mapped = new IntNetBuffMimeTypeByUNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public IIntNetMimeType newRec() {
		IIntNetMimeType rec =
			new IntNetBuffMimeType();
		return( rec );
	}

	public IntNetBuffMimeType ensureRec(IIntNetMimeType rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof IntNetBuffMimeType) {
			return ((IntNetBuffMimeType)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IIntNetMimeType.CLASS_CODE: {
					IntNetBuffMimeType mapped = new IntNetBuffMimeType();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMimeType",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of IntNetMimeType");
			}
		}
	}

	@Override
	public IIntNetMimeTypeH newHRec() {
		IIntNetMimeTypeH hrec =
			new IntNetBuffMimeTypeH();
		return( hrec );
	}

	public IntNetBuffMimeTypeH ensureHRec(IIntNetMimeTypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof IntNetBuffMimeTypeH) {
			return ((IntNetBuffMimeTypeH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IIntNetMimeType.CLASS_CODE: {
					IntNetBuffMimeTypeH mapped = new IntNetBuffMimeTypeH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMimeType",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of IntNetMimeType");
			}
		}
	}
}
