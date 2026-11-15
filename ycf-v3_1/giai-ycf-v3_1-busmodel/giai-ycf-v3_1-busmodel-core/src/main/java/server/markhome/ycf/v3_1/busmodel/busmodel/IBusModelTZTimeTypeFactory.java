
// Description: Java JPA Factory interface for TZTimeType.

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

package server.markhome.ycf.v3_1.busmodel.busmodel;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

/*
 *	IBusModelTZTimeTypeFactory interface for TZTimeType
 */
public interface IBusModelTZTimeTypeFactory extends IBusModelProtTZTimeTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over TZTimeType instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelTZTimeTypeBySchemaIdxKey newBySchemaIdxKey();

	/**
	 *	Allocate a protected SchemaIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtTZTimeTypeBySchemaIdxKey asProtected(IBusModelTZTimeTypeBySchemaIdxKey src);

	/**
	 *	Allocate a public SchemaIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubTZTimeTypeBySchemaIdxKey asPublic(IBusModelTZTimeTypeBySchemaIdxKey src);

	/**
	 *	Allocate a TZTimeType interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelTZTimeType newRec();

	/**
	 *	Allocate a protected TZTimeType interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtTZTimeType asProtected(IBusModelTZTimeType src);

	/**
	 *	Allocate a public TZTimeType interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubTZTimeType asPublic(IBusModelTZTimeType src);

	/**
	 *	Allocate a TZTimeType history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelTZTimeTypeH newHRec();

	/**
	 *	Allocate a protected TZTimeType history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtTZTimeTypeH asProtected(IBusModelTZTimeTypeH src);

	/**
	 *	Allocate a public TZTimeType history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubTZTimeTypeH asPublic(IBusModelTZTimeTypeH src);

}
