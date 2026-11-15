
// Description: Java Protected Factory interface for ServerMethod.

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

package server.markhome.ycf.v3_1.intnet.intnetprot;

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
 *	IBusModelProtServerMethodFactory protected interface for ServerMethod
 */
public interface IBusModelProtServerMethodFactory extends IBusModelPubServerMethodFactory
{

	/**
	 *	Allocate a protected UNameIdx key over protected ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByUNameIdxKey newProtByUNameIdxKey();

	/**
	 *	Allocate a public UNameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByUNameIdxKey asPublic(IBusModelProtServerMethodByUNameIdxKey src);

	/**
	 *	Allocate a protected MethTableIdx key over protected ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByMethTableIdxKey newProtByMethTableIdxKey();

	/**
	 *	Allocate a public MethTableIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByMethTableIdxKey asPublic(IBusModelProtServerMethodByMethTableIdxKey src);

	/**
	 *	Allocate a protected MethCodeVisIdx key over protected ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByMethCodeVisIdxKey newProtByMethCodeVisIdxKey();

	/**
	 *	Allocate a public MethCodeVisIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByMethCodeVisIdxKey asPublic(IBusModelProtServerMethodByMethCodeVisIdxKey src);

	/**
	 *	Allocate a protected MethTableVisIdx key over protected ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByMethTableVisIdxKey newProtByMethTableVisIdxKey();

	/**
	 *	Allocate a public MethTableVisIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByMethTableVisIdxKey asPublic(IBusModelProtServerMethodByMethTableVisIdxKey src);

	/**
	 *	Allocate a protected DefSchemaIdx key over protected ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodByDefSchemaIdxKey newProtByDefSchemaIdxKey();

	/**
	 *	Allocate a public DefSchemaIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodByDefSchemaIdxKey asPublic(IBusModelProtServerMethodByDefSchemaIdxKey src);

	/**
	 *	Allocate a protected ServerMethod interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethod newProtRec();

	/**
	 *	Allocate a public ServerMethod interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethod asPublic(IBusModelProtServerMethod src);

	/**
	 *	Allocate a protected ServerMethod history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerMethodH newProtHRec();

	/**
	 *	Allocate a public ServerMethod history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerMethodH asPublic(IBusModelProtServerMethodH src);

}
