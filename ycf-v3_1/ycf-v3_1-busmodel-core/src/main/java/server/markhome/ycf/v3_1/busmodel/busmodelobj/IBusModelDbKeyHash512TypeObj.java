// Description: Java 25 Object interface for BusModel DbKeyHash512Type.

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public interface IBusModelDbKeyHash512TypeObj
	extends IBusModelDbKeyHash512DefObj
{
	/**
	 *	Get the current edition of this DbKeyHash512Type instance as a IBusModelDbKeyHash512TypeEditObj.
	 *
	 *	@return	The IBusModelDbKeyHash512TypeEditObj edition of this instance.
	 */
	IBusModelDbKeyHash512TypeEditObj getEditAsDbKeyHash512Type();

	/**
	 *	Get the IBusModelDbKeyHash512TypeTableObj table cache which manages this instance.
	 *
	 *	@return	IBusModelDbKeyHash512TypeTableObj table cache which manages this instance.
	 */
	IBusModelDbKeyHash512TypeTableObj getDbKeyHash512TypeTable();

	/**
	 *	Get the IBusModelDbKeyHash512Type instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IBusModelDbKeyHash512Type instance which currently backs this object.
	 */
	IBusModelDbKeyHash512Type getDbKeyHash512TypeRec();

	/**
	 *	Get the required IBusModelSchemaDefObj instance referenced by the SchemaDef key.
	 *
	 *	@return	The required IBusModelSchemaDefObj instance referenced by the SchemaDef key.
	 */
	IBusModelSchemaDefObj getRequiredContainerSchemaDef();

	/**
	 *	Get the required IBusModelSchemaDefObj instance referenced by the SchemaDef key.
	 *
	 *	@return	The required IBusModelSchemaDefObj instance referenced by the SchemaDef key.
	 */
	IBusModelSchemaDefObj getRequiredContainerSchemaDef( boolean forceRead );

	/**
	 *	Get the required ICFKeyHash256 attribute Id.
	 *
	 *	@return	The required ICFKeyHash256 attribute Id.
	 */
	ICFKeyHash256 getRequiredId();

	/**
	 *	Get the required ICFKeyHash256 attribute SchemaDefId.
	 *
	 *	@return	The required ICFKeyHash256 attribute SchemaDefId.
	 */
	ICFKeyHash256 getRequiredSchemaDefId();

}
