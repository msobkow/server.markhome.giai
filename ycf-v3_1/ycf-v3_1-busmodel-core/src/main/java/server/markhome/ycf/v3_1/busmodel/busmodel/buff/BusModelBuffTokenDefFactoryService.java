
// Description: Java 25 Factory service implementation for TokenDef buffers

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
 *	Java 25 Factory service implementation for TokenDef buffers.
 */
@Service("busmodel31BuffTokenDefFactoryService")
public class BusModelBuffTokenDefFactoryService
	implements IBusModelTokenDefFactory
{
	public BusModelBuffTokenDefFactoryService() {
	}

	@Override
	public IBusModelTokenDef newRec() {
		IBusModelTokenDef rec =
			new BusModelBuffTokenDef();
		return( rec );
	}

	public BusModelBuffTokenDef ensureRec(IBusModelTokenDef rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof BusModelBuffTokenDef) {
			return ((BusModelBuffTokenDef)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case IBusModelTokenDef.CLASS_CODE: {
					BusModelBuffTokenDef mapped = new BusModelBuffTokenDef();
					mapped.set(rec);
					return(mapped); }
				case IBusModelTokenType.CLASS_CODE: {
					BusModelBuffTokenType mapped = new BusModelBuffTokenType();
					mapped.set((IBusModelTokenType)rec);
					return(mapped); }
				case IBusModelTokenCol.CLASS_CODE: {
					BusModelBuffTokenCol mapped = new BusModelBuffTokenCol();
					mapped.set((IBusModelTokenCol)rec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelTokenDef",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of BusModelTokenDef");
			}
		}
	}

	@Override
	public IBusModelTokenDefH newHRec() {
		IBusModelTokenDefH hrec =
			new BusModelBuffTokenDefH();
		return( hrec );
	}

	public BusModelBuffTokenDefH ensureHRec(IBusModelTokenDefH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof BusModelBuffTokenDefH) {
			return ((BusModelBuffTokenDefH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case IBusModelTokenDef.CLASS_CODE: {
					BusModelBuffTokenDefH mapped = new BusModelBuffTokenDefH();
					mapped.set(hrec);
					return(mapped); }
				case IBusModelTokenType.CLASS_CODE: {
					BusModelBuffTokenTypeH mapped = new BusModelBuffTokenTypeH();
					mapped.set((IBusModelTokenTypeH)hrec);
					return(mapped); }
				case IBusModelTokenCol.CLASS_CODE: {
					BusModelBuffTokenColH mapped = new BusModelBuffTokenColH();
					mapped.set((IBusModelTokenColH)hrec);
					return(mapped); }
				default:
					throw new CFUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelTokenDef",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of BusModelTokenDef");
			}
		}
	}
}
