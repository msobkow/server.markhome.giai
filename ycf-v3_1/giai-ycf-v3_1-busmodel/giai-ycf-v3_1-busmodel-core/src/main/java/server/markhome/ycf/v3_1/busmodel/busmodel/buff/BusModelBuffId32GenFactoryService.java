
// Description: Java 25 Factory service implementation for Id32Gen buffers

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
 *	Java 25 Factory service implementation for Id32Gen buffers.
 */
@Service("busmodel31BuffId32GenFactoryService")
public class BusModelBuffId32GenFactoryService
	implements IBusModelId32GenFactory
{
	public BusModelBuffId32GenFactoryService() {
	}

	@Override
	public IBusModelId32Gen newRec() {
		IBusModelId32Gen rec =
			new BusModelBuffId32Gen();
		return( rec );
	}

	public BusModelBuffId32Gen ensureRec(IBusModelId32Gen rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffId32Gen) {
			return ((BusModelBuffId32Gen)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelId32Gen.CLASS_CODE: {
					BusModelBuffId32Gen mapped = new BusModelBuffId32Gen();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelId32Gen",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelId32Gen");
			}
		}
	}

	@Override
	public IBusModelId32GenH newHRec() {
		IBusModelId32GenH hrec =
			new BusModelBuffId32GenH();
		return( hrec );
	}

	public BusModelBuffId32GenH ensureHRec(IBusModelId32GenH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffId32GenH) {
			return ((BusModelBuffId32GenH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelId32Gen.CLASS_CODE: {
					BusModelBuffId32GenH mapped = new BusModelBuffId32GenH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelId32Gen",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelId32Gen");
			}
		}
	}
}
