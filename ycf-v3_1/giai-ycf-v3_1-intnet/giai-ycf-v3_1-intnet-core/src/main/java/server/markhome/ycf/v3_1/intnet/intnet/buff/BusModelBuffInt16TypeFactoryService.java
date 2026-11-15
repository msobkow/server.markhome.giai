
// Description: Java 25 Factory service implementation for Int16Type buffers

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
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;

/*
 *	Java 25 Factory service implementation for Int16Type buffers.
 */
@Service("busmodel31BuffInt16TypeFactoryService")
public class BusModelBuffInt16TypeFactoryService
	implements IBusModelInt16TypeFactory
{
	public BusModelBuffInt16TypeFactoryService() {
	}

	@Override
	public IBusModelInt16TypeBySchemaIdxKey newBySchemaIdxKey() {
		IBusModelInt16TypeBySchemaIdxKey key =
			new BusModelBuffInt16TypeBySchemaIdxKey();
		return( key );
	}

	public BusModelBuffInt16TypeBySchemaIdxKey ensureBySchemaIdxKey(IBusModelInt16TypeBySchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelBuffInt16TypeBySchemaIdxKey) {
			return( (BusModelBuffInt16TypeBySchemaIdxKey)key );
		}
		else {
			BusModelBuffInt16TypeBySchemaIdxKey mapped = new BusModelBuffInt16TypeBySchemaIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			return( mapped );
		}
	}

	@Override
	public IBusModelInt16Type newRec() {
		IBusModelInt16Type rec =
			new BusModelBuffInt16Type();
		return( rec );
	}

	public BusModelBuffInt16Type ensureRec(IBusModelInt16Type rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffInt16Type) {
			return ((BusModelBuffInt16Type)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelInt16Type.CLASS_CODE: {
					BusModelBuffInt16Type mapped = new BusModelBuffInt16Type();
					mapped.set(rec);
					return(mapped); }
				case IBusModelId16Gen.CLASS_CODE: {
					BusModelBuffId16Gen mapped = new BusModelBuffId16Gen();
					mapped.set((IBusModelId16Gen)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelInt16Type",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelInt16Type");
			}
		}
	}

	@Override
	public IBusModelInt16TypeH newHRec() {
		IBusModelInt16TypeH hrec =
			new BusModelBuffInt16TypeH();
		return( hrec );
	}

	public BusModelBuffInt16TypeH ensureHRec(IBusModelInt16TypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffInt16TypeH) {
			return ((BusModelBuffInt16TypeH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelInt16Type.CLASS_CODE: {
					BusModelBuffInt16TypeH mapped = new BusModelBuffInt16TypeH();
					mapped.set(hrec);
					return(mapped); }
				case IBusModelId16Gen.CLASS_CODE: {
					BusModelBuffId16GenH mapped = new BusModelBuffId16GenH();
					mapped.set((IBusModelId16GenH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelInt16Type",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelInt16Type");
			}
		}
	}
}
