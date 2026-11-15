// Description: Java 25 Instance Edit Object interface for BusModel PopSubDep1.

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

package server.markhome.ycf.v3_1.intnet.intnetobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public interface IBusModelPopSubDep1EditObj
	extends IBusModelPopSubDep1Obj, IBusModelPopDepEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IBusModelPopSubDep1Obj.
	 */
	IBusModelPopSubDep1Obj getOrigAsPopSubDep1();

	/**
	 *	Get the IBusModelPopTopDepObj instance referenced by the ContPopTopDep key.
	 *
	 *	@return	The IBusModelPopTopDepObj instance referenced by the ContPopTopDep key.
	 */
	IBusModelPopTopDepObj getRequiredContainerContPopTopDep();

	/**
	 *	Get the required IBusModelPopTopDepObj instance referenced by the ContPopTopDep key.
	 *
	 *	@return	The required IBusModelPopTopDepObj instance referenced by the ContPopTopDep key.
	 */
	IBusModelPopTopDepObj getRequiredContainerContPopTopDep( boolean forceRead );

	/**
	 *	Set the IBusModelPopTopDepObj instance referenced by the ContPopTopDep key.
	 *
	 *	@param	value	the IBusModelPopTopDepObj instance to be referenced by the ContPopTopDep key.
	 */
	void setRequiredContainerContPopTopDep( IBusModelPopTopDepObj value );

	/**
	 *	Get a list IBusModelPopSubDep2Obj instances referenced by the PopDep key.
	 *
	 *	@return	The (potentially empty) list of IBusModelPopSubDep2Obj instances referenced by the PopDep key.
	 */
	List<IBusModelPopSubDep2Obj> getOptionalComponentsPopDep();

	/**
	 *	Get the required ICFKeyHash256 attribute PopTopDepId.
	 *
	 *	@return	The required ICFKeyHash256 attribute PopTopDepId.
	 */
	ICFKeyHash256 getRequiredPopTopDepId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param value The required String attribute Name value to be applied.
	 */
	void setRequiredName(String value);

}
