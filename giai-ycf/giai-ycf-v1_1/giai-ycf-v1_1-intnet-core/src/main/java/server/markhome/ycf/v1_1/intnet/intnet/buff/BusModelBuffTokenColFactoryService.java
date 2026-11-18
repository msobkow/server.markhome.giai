
// Description: Java 25 Factory service implementation for TokenCol buffers

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
 *	Java 25 Factory service implementation for TokenCol buffers.
 */
@Service("busmodel31BuffTokenColFactoryService")
public class BusModelBuffTokenColFactoryService
	implements IBusModelTokenColFactory
{
	public BusModelBuffTokenColFactoryService() {
	}

	@Override
	public IBusModelTokenColByTableIdxKey newByTableIdxKey() {
		IBusModelTokenColByTableIdxKey key =
			new BusModelBuffTokenColByTableIdxKey();
		return( key );
	}

	public BusModelBuffTokenColByTableIdxKey ensureByTableIdxKey(IBusModelTokenColByTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelBuffTokenColByTableIdxKey) {
			return( (BusModelBuffTokenColByTableIdxKey)key );
		}
		else {
			BusModelBuffTokenColByTableIdxKey mapped = new BusModelBuffTokenColByTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

	@Override
	public IBusModelTokenCol newRec() {
		IBusModelTokenCol rec =
			new BusModelBuffTokenCol();
		return( rec );
	}

	public BusModelBuffTokenCol ensureRec(IBusModelTokenCol rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffTokenCol) {
			return ((BusModelBuffTokenCol)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelTokenCol.CLASS_CODE: {
					BusModelBuffTokenCol mapped = new BusModelBuffTokenCol();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelTokenCol",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelTokenCol");
			}
		}
	}

	@Override
	public IBusModelTokenColH newHRec() {
		IBusModelTokenColH hrec =
			new BusModelBuffTokenColH();
		return( hrec );
	}

	public BusModelBuffTokenColH ensureHRec(IBusModelTokenColH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffTokenColH) {
			return ((BusModelBuffTokenColH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelTokenCol.CLASS_CODE: {
					BusModelBuffTokenColH mapped = new BusModelBuffTokenColH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelTokenCol",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelTokenCol");
			}
		}
	}
}
