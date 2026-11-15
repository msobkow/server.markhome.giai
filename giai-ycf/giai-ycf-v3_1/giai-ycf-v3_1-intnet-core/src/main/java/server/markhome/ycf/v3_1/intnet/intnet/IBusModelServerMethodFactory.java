
// Description: Java JPA Factory interface for ServerMethod.

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

package server.markhome.ycf.v3_1.intnet.intnet;

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
 *	IBusModelServerMethodFactory interface for ServerMethod
 */
public interface IBusModelServerMethodFactory extends IBusModelProtServerMethodFactory
{

	/**
	 *	Allocate a UNameIdx key over ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerMethodByUNameIdxKey newByUNameIdxKey();

	/**
	 *	Allocate a protected UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByUNameIdxKey asProtected(IBusModelServerMethodByUNameIdxKey src);

	/**
	 *	Allocate a public UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByUNameIdxKey asPublic(IBusModelServerMethodByUNameIdxKey src);

	/**
	 *	Allocate a MethTableIdx key over ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerMethodByMethTableIdxKey newByMethTableIdxKey();

	/**
	 *	Allocate a protected MethTableIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByMethTableIdxKey asProtected(IBusModelServerMethodByMethTableIdxKey src);

	/**
	 *	Allocate a public MethTableIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByMethTableIdxKey asPublic(IBusModelServerMethodByMethTableIdxKey src);

	/**
	 *	Allocate a MethCodeVisIdx key over ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerMethodByMethCodeVisIdxKey newByMethCodeVisIdxKey();

	/**
	 *	Allocate a protected MethCodeVisIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByMethCodeVisIdxKey asProtected(IBusModelServerMethodByMethCodeVisIdxKey src);

	/**
	 *	Allocate a public MethCodeVisIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByMethCodeVisIdxKey asPublic(IBusModelServerMethodByMethCodeVisIdxKey src);

	/**
	 *	Allocate a MethTableVisIdx key over ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerMethodByMethTableVisIdxKey newByMethTableVisIdxKey();

	/**
	 *	Allocate a protected MethTableVisIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByMethTableVisIdxKey asProtected(IBusModelServerMethodByMethTableVisIdxKey src);

	/**
	 *	Allocate a public MethTableVisIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByMethTableVisIdxKey asPublic(IBusModelServerMethodByMethTableVisIdxKey src);

	/**
	 *	Allocate a DefSchemaIdx key over ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerMethodByDefSchemaIdxKey newByDefSchemaIdxKey();

	/**
	 *	Allocate a protected DefSchemaIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByDefSchemaIdxKey asProtected(IBusModelServerMethodByDefSchemaIdxKey src);

	/**
	 *	Allocate a public DefSchemaIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByDefSchemaIdxKey asPublic(IBusModelServerMethodByDefSchemaIdxKey src);

	/**
	 *	Allocate a ServerMethod interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerMethod newRec();

	/**
	 *	Allocate a protected ServerMethod interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethod asProtected(IBusModelServerMethod src);

	/**
	 *	Allocate a public ServerMethod interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethod asPublic(IBusModelServerMethod src);

	/**
	 *	Allocate a ServerMethod history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerMethodH newHRec();

	/**
	 *	Allocate a protected ServerMethod history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodH asProtected(IBusModelServerMethodH src);

	/**
	 *	Allocate a public ServerMethod history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodH asPublic(IBusModelServerMethodH src);

}
