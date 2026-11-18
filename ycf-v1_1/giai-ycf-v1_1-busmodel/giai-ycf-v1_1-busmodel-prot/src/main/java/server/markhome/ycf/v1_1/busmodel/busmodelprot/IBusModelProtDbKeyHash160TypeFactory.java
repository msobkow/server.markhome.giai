
// Description: Java Protected Factory interface for DbKeyHash160Type.

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

package server.markhome.ycf.v3_1.busmodel.busmodelprot;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

/*
 *	IBusModelProtDbKeyHash160TypeFactory protected interface for DbKeyHash160Type
 */
public interface IBusModelProtDbKeyHash160TypeFactory extends IBusModelPubDbKeyHash160TypeFactory
{

	/**
	 *	Allocate a protected SchemaIdx key over protected DbKeyHash160Type instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtDbKeyHash160TypeBySchemaIdxKey newProtBySchemaIdxKey();

	/**
	 *	Allocate a public SchemaIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubDbKeyHash160TypeBySchemaIdxKey asPublic(IBusModelProtDbKeyHash160TypeBySchemaIdxKey src);

	/**
	 *	Allocate a protected DbKeyHash160Type interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtDbKeyHash160Type newProtRec();

	/**
	 *	Allocate a public DbKeyHash160Type interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubDbKeyHash160Type asPublic(IBusModelProtDbKeyHash160Type src);

	/**
	 *	Allocate a protected DbKeyHash160Type history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtDbKeyHash160TypeH newProtHRec();

	/**
	 *	Allocate a public DbKeyHash160Type history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubDbKeyHash160TypeH asPublic(IBusModelProtDbKeyHash160TypeH src);

}
