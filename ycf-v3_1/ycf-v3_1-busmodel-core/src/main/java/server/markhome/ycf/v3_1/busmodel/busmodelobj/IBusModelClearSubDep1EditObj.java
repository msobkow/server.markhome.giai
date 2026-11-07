// Description: Java 25 Instance Edit Object interface for BusModel ClearSubDep1.

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

package server.markhome.ycf.v3_1.busmodel.busmodelobj;

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

public interface IBusModelClearSubDep1EditObj
	extends IBusModelClearSubDep1Obj, IBusModelClearDepEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IBusModelClearSubDep1Obj.
	 */
	IBusModelClearSubDep1Obj getOrigAsClearSubDep1();

	/**
	 *	Get the IBusModelClearTopDepObj instance referenced by the ClearTopDep key.
	 *
	 *	@return	The IBusModelClearTopDepObj instance referenced by the ClearTopDep key.
	 */
	IBusModelClearTopDepObj getRequiredContainerClearTopDep();

	/**
	 *	Get the required IBusModelClearTopDepObj instance referenced by the ClearTopDep key.
	 *
	 *	@return	The required IBusModelClearTopDepObj instance referenced by the ClearTopDep key.
	 */
	IBusModelClearTopDepObj getRequiredContainerClearTopDep( boolean forceRead );

	/**
	 *	Set the IBusModelClearTopDepObj instance referenced by the ClearTopDep key.
	 *
	 *	@param	value	the IBusModelClearTopDepObj instance to be referenced by the ClearTopDep key.
	 */
	void setRequiredContainerClearTopDep( IBusModelClearTopDepObj value );

	/**
	 *	Get a list IBusModelClearSubDep2Obj instances referenced by the ClearDep key.
	 *
	 *	@return	The (potentially empty) list of IBusModelClearSubDep2Obj instances referenced by the ClearDep key.
	 */
	List<IBusModelClearSubDep2Obj> getOptionalComponentsClearDep();

	/**
	 *	Get the required ICFKeyHash256 attribute ClearTopDepId.
	 *
	 *	@return	The required ICFKeyHash256 attribute ClearTopDepId.
	 */
	ICFKeyHash256 getRequiredClearTopDepId();

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
