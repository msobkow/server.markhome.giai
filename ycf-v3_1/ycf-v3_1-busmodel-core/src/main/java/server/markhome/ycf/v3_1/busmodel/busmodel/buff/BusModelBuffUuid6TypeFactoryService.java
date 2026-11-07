
// Description: Java 25 Factory service implementation for Uuid6Type buffers

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

package server.markhome.ycf.v3_1.busmodel.busmodel.buff;

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
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;

/*
 *	Java 25 Factory service implementation for Uuid6Type buffers.
 */
@Service("busmodel31BuffUuid6TypeFactoryService")
public class BusModelBuffUuid6TypeFactoryService
	implements IBusModelUuid6TypeFactory
{
	public BusModelBuffUuid6TypeFactoryService() {
	}

	@Override
	public IBusModelUuid6TypeBySchemaIdxKey newBySchemaIdxKey() {
		IBusModelUuid6TypeBySchemaIdxKey key =
			new BusModelBuffUuid6TypeBySchemaIdxKey();
		return( key );
	}

	public BusModelBuffUuid6TypeBySchemaIdxKey ensureBySchemaIdxKey(IBusModelUuid6TypeBySchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelBuffUuid6TypeBySchemaIdxKey) {
			return( (BusModelBuffUuid6TypeBySchemaIdxKey)key );
		}
		else {
			BusModelBuffUuid6TypeBySchemaIdxKey mapped = new BusModelBuffUuid6TypeBySchemaIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			return( mapped );
		}
	}

	@Override
	public IBusModelUuid6Type newRec() {
		IBusModelUuid6Type rec =
			new BusModelBuffUuid6Type();
		return( rec );
	}

	public BusModelBuffUuid6Type ensureRec(IBusModelUuid6Type rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffUuid6Type) {
			return ((BusModelBuffUuid6Type)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelUuid6Type.CLASS_CODE: {
					BusModelBuffUuid6Type mapped = new BusModelBuffUuid6Type();
					mapped.set(rec);
					return(mapped); }
				case IBusModelUuid6Gen.CLASS_CODE: {
					BusModelBuffUuid6Gen mapped = new BusModelBuffUuid6Gen();
					mapped.set((IBusModelUuid6Gen)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUuid6Type",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUuid6Type");
			}
		}
	}

	@Override
	public IBusModelUuid6TypeH newHRec() {
		IBusModelUuid6TypeH hrec =
			new BusModelBuffUuid6TypeH();
		return( hrec );
	}

	public BusModelBuffUuid6TypeH ensureHRec(IBusModelUuid6TypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffUuid6TypeH) {
			return ((BusModelBuffUuid6TypeH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelUuid6Type.CLASS_CODE: {
					BusModelBuffUuid6TypeH mapped = new BusModelBuffUuid6TypeH();
					mapped.set(hrec);
					return(mapped); }
				case IBusModelUuid6Gen.CLASS_CODE: {
					BusModelBuffUuid6GenH mapped = new BusModelBuffUuid6GenH();
					mapped.set((IBusModelUuid6GenH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUuid6Type",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUuid6Type");
			}
		}
	}
}
