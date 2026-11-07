
// Description: Java JPA Factory interface for TZTimeCol.

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
 *	IBusModelTZTimeColFactory interface for TZTimeCol
 */
public interface IBusModelTZTimeColFactory extends IBusModelProtTZTimeColFactory
{

	/**
	 *	Allocate a TableIdx key over TZTimeCol instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelTZTimeColByTableIdxKey newByTableIdxKey();

	/**
	 *	Allocate a protected TableIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtTZTimeColByTableIdxKey asProtected(IBusModelTZTimeColByTableIdxKey src);

	/**
	 *	Allocate a public TableIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubTZTimeColByTableIdxKey asPublic(IBusModelTZTimeColByTableIdxKey src);

	/**
	 *	Allocate a TZTimeCol interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelTZTimeCol newRec();

	/**
	 *	Allocate a protected TZTimeCol interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtTZTimeCol asProtected(IBusModelTZTimeCol src);

	/**
	 *	Allocate a public TZTimeCol interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubTZTimeCol asPublic(IBusModelTZTimeCol src);

	/**
	 *	Allocate a TZTimeCol history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelTZTimeColH newHRec();

	/**
	 *	Allocate a protected TZTimeCol history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtTZTimeColH asProtected(IBusModelTZTimeColH src);

	/**
	 *	Allocate a public TZTimeCol history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubTZTimeColH asPublic(IBusModelTZTimeColH src);

}
