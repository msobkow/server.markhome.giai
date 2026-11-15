
// Description: Java 25 Factory service implementation for TimeCol buffers

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
 *	Java 25 Factory service implementation for TimeCol buffers.
 */
@Service("busmodel31BuffTimeColFactoryService")
public class BusModelBuffTimeColFactoryService
	implements IBusModelTimeColFactory
{
	public BusModelBuffTimeColFactoryService() {
	}

	@Override
	public IBusModelTimeColByTableIdxKey newByTableIdxKey() {
		IBusModelTimeColByTableIdxKey key =
			new BusModelBuffTimeColByTableIdxKey();
		return( key );
	}

	public BusModelBuffTimeColByTableIdxKey ensureByTableIdxKey(IBusModelTimeColByTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelBuffTimeColByTableIdxKey) {
			return( (BusModelBuffTimeColByTableIdxKey)key );
		}
		else {
			BusModelBuffTimeColByTableIdxKey mapped = new BusModelBuffTimeColByTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

	@Override
	public IBusModelTimeCol newRec() {
		IBusModelTimeCol rec =
			new BusModelBuffTimeCol();
		return( rec );
	}

	public BusModelBuffTimeCol ensureRec(IBusModelTimeCol rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffTimeCol) {
			return ((BusModelBuffTimeCol)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelTimeCol.CLASS_CODE: {
					BusModelBuffTimeCol mapped = new BusModelBuffTimeCol();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelTimeCol",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelTimeCol");
			}
		}
	}

	@Override
	public IBusModelTimeColH newHRec() {
		IBusModelTimeColH hrec =
			new BusModelBuffTimeColH();
		return( hrec );
	}

	public BusModelBuffTimeColH ensureHRec(IBusModelTimeColH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffTimeColH) {
			return ((BusModelBuffTimeColH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelTimeCol.CLASS_CODE: {
					BusModelBuffTimeColH mapped = new BusModelBuffTimeColH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelTimeCol",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelTimeCol");
			}
		}
	}
}
