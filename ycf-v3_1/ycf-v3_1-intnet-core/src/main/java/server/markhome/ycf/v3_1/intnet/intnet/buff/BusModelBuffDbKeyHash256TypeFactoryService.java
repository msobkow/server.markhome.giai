
// Description: Java 25 Factory service implementation for DbKeyHash256Type buffers

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
 *	Java 25 Factory service implementation for DbKeyHash256Type buffers.
 */
@Service("busmodel31BuffDbKeyHash256TypeFactoryService")
public class BusModelBuffDbKeyHash256TypeFactoryService
	implements IBusModelDbKeyHash256TypeFactory
{
	public BusModelBuffDbKeyHash256TypeFactoryService() {
	}

	@Override
	public IBusModelDbKeyHash256TypeBySchemaIdxKey newBySchemaIdxKey() {
		IBusModelDbKeyHash256TypeBySchemaIdxKey key =
			new BusModelBuffDbKeyHash256TypeBySchemaIdxKey();
		return( key );
	}

	public BusModelBuffDbKeyHash256TypeBySchemaIdxKey ensureBySchemaIdxKey(IBusModelDbKeyHash256TypeBySchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelBuffDbKeyHash256TypeBySchemaIdxKey) {
			return( (BusModelBuffDbKeyHash256TypeBySchemaIdxKey)key );
		}
		else {
			BusModelBuffDbKeyHash256TypeBySchemaIdxKey mapped = new BusModelBuffDbKeyHash256TypeBySchemaIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			return( mapped );
		}
	}

	@Override
	public IBusModelDbKeyHash256Type newRec() {
		IBusModelDbKeyHash256Type rec =
			new BusModelBuffDbKeyHash256Type();
		return( rec );
	}

	public BusModelBuffDbKeyHash256Type ensureRec(IBusModelDbKeyHash256Type rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffDbKeyHash256Type) {
			return ((BusModelBuffDbKeyHash256Type)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelDbKeyHash256Type.CLASS_CODE: {
					BusModelBuffDbKeyHash256Type mapped = new BusModelBuffDbKeyHash256Type();
					mapped.set(rec);
					return(mapped); }
				case IBusModelDbKeyHash256Gen.CLASS_CODE: {
					BusModelBuffDbKeyHash256Gen mapped = new BusModelBuffDbKeyHash256Gen();
					mapped.set((IBusModelDbKeyHash256Gen)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash256Type",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash256Type");
			}
		}
	}

	@Override
	public IBusModelDbKeyHash256TypeH newHRec() {
		IBusModelDbKeyHash256TypeH hrec =
			new BusModelBuffDbKeyHash256TypeH();
		return( hrec );
	}

	public BusModelBuffDbKeyHash256TypeH ensureHRec(IBusModelDbKeyHash256TypeH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffDbKeyHash256TypeH) {
			return ((BusModelBuffDbKeyHash256TypeH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelDbKeyHash256Type.CLASS_CODE: {
					BusModelBuffDbKeyHash256TypeH mapped = new BusModelBuffDbKeyHash256TypeH();
					mapped.set(hrec);
					return(mapped); }
				case IBusModelDbKeyHash256Gen.CLASS_CODE: {
					BusModelBuffDbKeyHash256GenH mapped = new BusModelBuffDbKeyHash256GenH();
					mapped.set((IBusModelDbKeyHash256GenH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash256Type",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash256Type");
			}
		}
	}
}
