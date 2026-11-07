
// Description: Java JPA Factory interface for ServerObjFunc.

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
 *	IBusModelServerObjFuncFactory interface for ServerObjFunc
 */
public interface IBusModelServerObjFuncFactory extends IBusModelProtServerObjFuncFactory
{

	/**
	 *	Allocate a RetTblIdx key over ServerObjFunc instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerObjFuncByRetTblIdxKey newByRetTblIdxKey();

	/**
	 *	Allocate a protected RetTblIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerObjFuncByRetTblIdxKey asProtected(IBusModelServerObjFuncByRetTblIdxKey src);

	/**
	 *	Allocate a public RetTblIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerObjFuncByRetTblIdxKey asPublic(IBusModelServerObjFuncByRetTblIdxKey src);

	/**
	 *	Allocate a ServerObjFunc interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerObjFunc newRec();

	/**
	 *	Allocate a protected ServerObjFunc interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerObjFunc asProtected(IBusModelServerObjFunc src);

	/**
	 *	Allocate a public ServerObjFunc interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerObjFunc asPublic(IBusModelServerObjFunc src);

	/**
	 *	Allocate a ServerObjFunc history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelServerObjFuncH newHRec();

	/**
	 *	Allocate a protected ServerObjFunc history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerObjFuncH asProtected(IBusModelServerObjFuncH src);

	/**
	 *	Allocate a public ServerObjFunc history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerObjFuncH asPublic(IBusModelServerObjFuncH src);

}
