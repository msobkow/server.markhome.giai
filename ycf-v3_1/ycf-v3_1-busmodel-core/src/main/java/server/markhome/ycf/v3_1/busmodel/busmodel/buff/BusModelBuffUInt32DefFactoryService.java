
// Description: Java 25 Factory service implementation for UInt32Def buffers

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
 *	Java 25 Factory service implementation for UInt32Def buffers.
 */
@Service("busmodel31BuffUInt32DefFactoryService")
public class BusModelBuffUInt32DefFactoryService
	implements IBusModelUInt32DefFactory
{
	public BusModelBuffUInt32DefFactoryService() {
	}

	@Override
	public IBusModelUInt32Def newRec() {
		IBusModelUInt32Def rec =
			new BusModelBuffUInt32Def();
		return( rec );
	}

	public BusModelBuffUInt32Def ensureRec(IBusModelUInt32Def rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffUInt32Def) {
			return ((BusModelBuffUInt32Def)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelUInt32Def.CLASS_CODE: {
					BusModelBuffUInt32Def mapped = new BusModelBuffUInt32Def();
					mapped.set(rec);
					return(mapped); }
				case IBusModelUInt32Type.CLASS_CODE: {
					BusModelBuffUInt32Type mapped = new BusModelBuffUInt32Type();
					mapped.set((IBusModelUInt32Type)rec);
					return(mapped); }
				case IBusModelUInt32Col.CLASS_CODE: {
					BusModelBuffUInt32Col mapped = new BusModelBuffUInt32Col();
					mapped.set((IBusModelUInt32Col)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUInt32Def",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelUInt32Def");
			}
		}
	}

	@Override
	public IBusModelUInt32DefH newHRec() {
		IBusModelUInt32DefH hrec =
			new BusModelBuffUInt32DefH();
		return( hrec );
	}

	public BusModelBuffUInt32DefH ensureHRec(IBusModelUInt32DefH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffUInt32DefH) {
			return ((BusModelBuffUInt32DefH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelUInt32Def.CLASS_CODE: {
					BusModelBuffUInt32DefH mapped = new BusModelBuffUInt32DefH();
					mapped.set(hrec);
					return(mapped); }
				case IBusModelUInt32Type.CLASS_CODE: {
					BusModelBuffUInt32TypeH mapped = new BusModelBuffUInt32TypeH();
					mapped.set((IBusModelUInt32TypeH)hrec);
					return(mapped); }
				case IBusModelUInt32Col.CLASS_CODE: {
					BusModelBuffUInt32ColH mapped = new BusModelBuffUInt32ColH();
					mapped.set((IBusModelUInt32ColH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUInt32Def",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelUInt32Def");
			}
		}
	}
}
