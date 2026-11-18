
// Description: Java 25 Factory service implementation for DbKeyHash224Type buffers

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
 *	Java 25 Factory service implementation for DbKeyHash224Type buffers.
 */
@Service("busmodel31BuffDbKeyHash224TypeFactoryService")
public class BusModelBuffDbKeyHash224TypeFactoryService
	implements IBusModelDbKeyHash224TypeFactory
{
	public BusModelBuffDbKeyHash224TypeFactoryService() {
	}

	@Override
	public IBusModelDbKeyHash224TypeBySchemaIdxKey newBySchemaIdxKey() {
		IBusModelDbKeyHash224TypeBySchemaIdxKey key =
			new BusModelBuffDbKeyHash224TypeBySchemaIdxKey();
		return( key );
	}

	public BusModelBuffDbKeyHash224TypeBySchemaIdxKey ensureBySchemaIdxKey(IBusModelDbKeyHash224TypeBySchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelBuffDbKeyHash224TypeBySchemaIdxKey) {
			return( (BusModelBuffDbKeyHash224TypeBySchemaIdxKey)key );
		}
		else {
			BusModelBuffDbKeyHash224TypeBySchemaIdxKey mapped = new BusModelBuffDbKeyHash224TypeBySchemaIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			return( mapped );
		}
	}

	@Override
	public IBusModelDbKeyHash224Type newRec() {
		IBusModelDbKeyHash224Type rec =
			new BusModelBuffDbKeyHash224Type();
		return( rec );
	}

	public BusModelBuffDbKeyHash224Type ensureRec(IBusModelDbKeyHash224Type rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffDbKeyHash224Type) {
			return ((BusModelBuffDbKeyHash224Type)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelDbKeyHash224Type.CLASS_CODE: {
					BusModelBuffDbKeyHash224Type mapped = new BusModelBuffDbKeyHash224Type();
					mapped.set(rec);
					return(mapped); }
				case IBusModelDbKeyHash224Gen.CLASS_CODE: {
					BusModelBuffDbKeyHash224Gen mapped = new BusModelBuffDbKeyHash224Gen();
					mapped.set((IBusModelDbKeyHash224Gen)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash224Type",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash224Type");
			}
		}
	}

	@Override
	public IBusModelDbKeyHash224TypeH newHRec() {
		IBusModelDbKeyHash224TypeH hrec =
			new BusModelBuffDbKeyHash224TypeH();
		return( hrec );
	}

	public BusModelBuffDbKeyHash224TypeH ensureHRec(IBusModelDbKeyHash224TypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffDbKeyHash224TypeH) {
			return ((BusModelBuffDbKeyHash224TypeH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelDbKeyHash224Type.CLASS_CODE: {
					BusModelBuffDbKeyHash224TypeH mapped = new BusModelBuffDbKeyHash224TypeH();
					mapped.set(hrec);
					return(mapped); }
				case IBusModelDbKeyHash224Gen.CLASS_CODE: {
					BusModelBuffDbKeyHash224GenH mapped = new BusModelBuffDbKeyHash224GenH();
					mapped.set((IBusModelDbKeyHash224GenH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash224Type",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash224Type");
			}
		}
	}
}
