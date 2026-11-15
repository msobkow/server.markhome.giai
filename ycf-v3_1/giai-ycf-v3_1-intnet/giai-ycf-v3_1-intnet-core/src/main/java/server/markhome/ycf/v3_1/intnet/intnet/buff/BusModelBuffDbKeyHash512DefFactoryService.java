
// Description: Java 25 Factory service implementation for DbKeyHash512Def buffers

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
 *	Java 25 Factory service implementation for DbKeyHash512Def buffers.
 */
@Service("busmodel31BuffDbKeyHash512DefFactoryService")
public class BusModelBuffDbKeyHash512DefFactoryService
	implements IBusModelDbKeyHash512DefFactory
{
	public BusModelBuffDbKeyHash512DefFactoryService() {
	}

	@Override
	public IBusModelDbKeyHash512Def newRec() {
		IBusModelDbKeyHash512Def rec =
			new BusModelBuffDbKeyHash512Def();
		return( rec );
	}

	public BusModelBuffDbKeyHash512Def ensureRec(IBusModelDbKeyHash512Def rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffDbKeyHash512Def) {
			return ((BusModelBuffDbKeyHash512Def)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelDbKeyHash512Def.CLASS_CODE: {
					BusModelBuffDbKeyHash512Def mapped = new BusModelBuffDbKeyHash512Def();
					mapped.set(rec);
					return(mapped); }
				case IBusModelDbKeyHash512Col.CLASS_CODE: {
					BusModelBuffDbKeyHash512Col mapped = new BusModelBuffDbKeyHash512Col();
					mapped.set((IBusModelDbKeyHash512Col)rec);
					return(mapped); }
				case IBusModelDbKeyHash512Type.CLASS_CODE: {
					BusModelBuffDbKeyHash512Type mapped = new BusModelBuffDbKeyHash512Type();
					mapped.set((IBusModelDbKeyHash512Type)rec);
					return(mapped); }
				case IBusModelDbKeyHash512Gen.CLASS_CODE: {
					BusModelBuffDbKeyHash512Gen mapped = new BusModelBuffDbKeyHash512Gen();
					mapped.set((IBusModelDbKeyHash512Gen)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash512Def",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelDbKeyHash512Def");
			}
		}
	}

	@Override
	public IBusModelDbKeyHash512DefH newHRec() {
		IBusModelDbKeyHash512DefH hrec =
			new BusModelBuffDbKeyHash512DefH();
		return( hrec );
	}

	public BusModelBuffDbKeyHash512DefH ensureHRec(IBusModelDbKeyHash512DefH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffDbKeyHash512DefH) {
			return ((BusModelBuffDbKeyHash512DefH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelDbKeyHash512Def.CLASS_CODE: {
					BusModelBuffDbKeyHash512DefH mapped = new BusModelBuffDbKeyHash512DefH();
					mapped.set(hrec);
					return(mapped); }
				case IBusModelDbKeyHash512Col.CLASS_CODE: {
					BusModelBuffDbKeyHash512ColH mapped = new BusModelBuffDbKeyHash512ColH();
					mapped.set((IBusModelDbKeyHash512ColH)hrec);
					return(mapped); }
				case IBusModelDbKeyHash512Type.CLASS_CODE: {
					BusModelBuffDbKeyHash512TypeH mapped = new BusModelBuffDbKeyHash512TypeH();
					mapped.set((IBusModelDbKeyHash512TypeH)hrec);
					return(mapped); }
				case IBusModelDbKeyHash512Gen.CLASS_CODE: {
					BusModelBuffDbKeyHash512GenH mapped = new BusModelBuffDbKeyHash512GenH();
					mapped.set((IBusModelDbKeyHash512GenH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash512Def",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelDbKeyHash512Def");
			}
		}
	}
}
