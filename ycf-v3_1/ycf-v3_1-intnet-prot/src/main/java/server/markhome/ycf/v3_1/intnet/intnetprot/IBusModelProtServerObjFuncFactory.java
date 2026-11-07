
// Description: Java Protected Factory interface for ServerObjFunc.

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
 *	IBusModelProtServerObjFuncFactory protected interface for ServerObjFunc
 */
public interface IBusModelProtServerObjFuncFactory extends IBusModelPubServerObjFuncFactory
{

	/**
	 *	Allocate a protected RetTblIdx key over protected ServerObjFunc instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerObjFuncByRetTblIdxKey newProtByRetTblIdxKey();

	/**
	 *	Allocate a public RetTblIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerObjFuncByRetTblIdxKey asPublic(IBusModelProtServerObjFuncByRetTblIdxKey src);

	/**
	 *	Allocate a protected ServerObjFunc interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerObjFunc newProtRec();

	/**
	 *	Allocate a public ServerObjFunc interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerObjFunc asPublic(IBusModelProtServerObjFunc src);

	/**
	 *	Allocate a protected ServerObjFunc history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtServerObjFuncH newProtHRec();

	/**
	 *	Allocate a public ServerObjFunc history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubServerObjFuncH asPublic(IBusModelProtServerObjFuncH src);

}
