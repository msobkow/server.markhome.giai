
// Description: Java Protected Factory interface for ClearSubDep2.

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
 *	IBusModelProtClearSubDep2Factory protected interface for ClearSubDep2
 */
public interface IBusModelProtClearSubDep2Factory extends IBusModelPubClearSubDep2Factory
{

	/**
	 *	Allocate a protected ClearSubDep1Idx key over protected ClearSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearSubDep2ByClearSubDep1IdxKey newProtByClearSubDep1IdxKey();

	/**
	 *	Allocate a public ClearSubDep1Idx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearSubDep2ByClearSubDep1IdxKey asPublic(IBusModelProtClearSubDep2ByClearSubDep1IdxKey src);

	/**
	 *	Allocate a protected UNameIdx key over protected ClearSubDep2 instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearSubDep2ByUNameIdxKey newProtByUNameIdxKey();

	/**
	 *	Allocate a public UNameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearSubDep2ByUNameIdxKey asPublic(IBusModelProtClearSubDep2ByUNameIdxKey src);

	/**
	 *	Allocate a protected ClearSubDep2 interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearSubDep2 newProtRec();

	/**
	 *	Allocate a public ClearSubDep2 interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearSubDep2 asPublic(IBusModelProtClearSubDep2 src);

	/**
	 *	Allocate a protected ClearSubDep2 history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearSubDep2H newProtHRec();

	/**
	 *	Allocate a public ClearSubDep2 history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearSubDep2H asPublic(IBusModelProtClearSubDep2H src);

}
