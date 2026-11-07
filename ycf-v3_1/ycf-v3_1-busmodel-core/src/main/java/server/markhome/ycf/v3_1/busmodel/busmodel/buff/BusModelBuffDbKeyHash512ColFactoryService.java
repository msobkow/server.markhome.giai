
// Description: Java 25 Factory service implementation for DbKeyHash512Col buffers

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
 *	Java 25 Factory service implementation for DbKeyHash512Col buffers.
 */
@Service("busmodel31BuffDbKeyHash512ColFactoryService")
public class BusModelBuffDbKeyHash512ColFactoryService
	implements IBusModelDbKeyHash512ColFactory
{
	public BusModelBuffDbKeyHash512ColFactoryService() {
	}

	@Override
	public IBusModelDbKeyHash512ColByTableIdxKey newByTableIdxKey() {
		IBusModelDbKeyHash512ColByTableIdxKey key =
			new BusModelBuffDbKeyHash512ColByTableIdxKey();
		return( key );
	}

	public BusModelBuffDbKeyHash512ColByTableIdxKey ensureByTableIdxKey(IBusModelDbKeyHash512ColByTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof BusModelBuffDbKeyHash512ColByTableIdxKey) {
			return( (BusModelBuffDbKeyHash512ColByTableIdxKey)key );
		}
		else {
			BusModelBuffDbKeyHash512ColByTableIdxKey mapped = new BusModelBuffDbKeyHash512ColByTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

	@Override
	public IBusModelDbKeyHash512Col newRec() {
		IBusModelDbKeyHash512Col rec =
			new BusModelBuffDbKeyHash512Col();
		return( rec );
	}

	public BusModelBuffDbKeyHash512Col ensureRec(IBusModelDbKeyHash512Col rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffDbKeyHash512Col) {
			return ((BusModelBuffDbKeyHash512Col)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelDbKeyHash512Col.CLASS_CODE: {
					BusModelBuffDbKeyHash512Col mapped = new BusModelBuffDbKeyHash512Col();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash512Col",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash512Col");
			}
		}
	}

	@Override
	public IBusModelDbKeyHash512ColH newHRec() {
		IBusModelDbKeyHash512ColH hrec =
			new BusModelBuffDbKeyHash512ColH();
		return( hrec );
	}

	public BusModelBuffDbKeyHash512ColH ensureHRec(IBusModelDbKeyHash512ColH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffDbKeyHash512ColH) {
			return ((BusModelBuffDbKeyHash512ColH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelDbKeyHash512Col.CLASS_CODE: {
					BusModelBuffDbKeyHash512ColH mapped = new BusModelBuffDbKeyHash512ColH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash512Col",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash512Col");
			}
		}
	}
}
