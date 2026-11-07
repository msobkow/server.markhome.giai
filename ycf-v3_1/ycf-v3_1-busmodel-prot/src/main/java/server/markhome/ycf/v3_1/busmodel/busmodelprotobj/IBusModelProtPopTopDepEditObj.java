// Description: Java 25 Protected Instance Edit Object interface for BusModel PopTopDep.

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

package server.markhome.ycf.v3_1.busmodel.busmodelprotobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

public interface IBusModelProtPopTopDepEditObj
	extends IBusModelProtPopTopDepObj, IBusModelProtPopDepEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IBusModelProtPopTopDepObj.
	 */
	IBusModelProtPopTopDepObj getOrigAsPopTopDep();

	/**
	 *	Get the IBusModelProtRelationObj instance referenced by the ContRelation key.
	 *
	 *	@return	The IBusModelProtRelationObj instance referenced by the ContRelation key.
	 */
	IBusModelProtRelationObj getRequiredContainerContRelation();

	/**
	 *	Get the required IBusModelProtRelationObj instance referenced by the ContRelation key.
	 *
	 *	@return	The required IBusModelProtRelationObj instance referenced by the ContRelation key.
	 */
	IBusModelProtRelationObj getRequiredContainerContRelation( boolean forceRead );

	/**
	 *	Set the IBusModelProtRelationObj instance referenced by the ContRelation key.
	 *
	 *	@param	value	the IBusModelProtRelationObj instance to be referenced by the ContRelation key.
	 */
	void setRequiredContainerContRelation( IBusModelProtRelationObj value );

	/**
	 *	Get a list IBusModelProtPopSubDep1Obj instances referenced by the PopDep key.
	 *
	 *	@return	The (potentially empty) list of IBusModelProtPopSubDep1Obj instances referenced by the PopDep key.
	 */
	List<IBusModelProtPopSubDep1Obj> getOptionalComponentsPopDep();

	/**
	 *	Get the required ICFKeyHash256 attribute ContRelationId.
	 *
	 *	@return	The required ICFKeyHash256 attribute ContRelationId.
	 */
	ICFKeyHash256 getRequiredContRelationId();

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
