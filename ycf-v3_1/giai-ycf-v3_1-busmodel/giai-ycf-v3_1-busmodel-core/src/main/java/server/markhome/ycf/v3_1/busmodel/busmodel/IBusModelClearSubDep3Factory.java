
// Description: Java JPA Factory interface for ClearSubDep3.

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
 *	IBusModelClearSubDep3Factory interface for ClearSubDep3
 */
public interface IBusModelClearSubDep3Factory extends IBusModelProtClearSubDep3Factory
{

	/**
	 *	Allocate a ClearSubDep2Idx key over ClearSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelClearSubDep3ByClearSubDep2IdxKey newByClearSubDep2IdxKey();

	/**
	 *	Allocate a protected ClearSubDep2Idx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearSubDep3ByClearSubDep2IdxKey asProtected(IBusModelClearSubDep3ByClearSubDep2IdxKey src);

	/**
	 *	Allocate a public ClearSubDep2Idx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearSubDep3ByClearSubDep2IdxKey asPublic(IBusModelClearSubDep3ByClearSubDep2IdxKey src);

	/**
	 *	Allocate a UNameIdx key over ClearSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelClearSubDep3ByUNameIdxKey newByUNameIdxKey();

	/**
	 *	Allocate a protected UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearSubDep3ByUNameIdxKey asProtected(IBusModelClearSubDep3ByUNameIdxKey src);

	/**
	 *	Allocate a public UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearSubDep3ByUNameIdxKey asPublic(IBusModelClearSubDep3ByUNameIdxKey src);

	/**
	 *	Allocate a ClearSubDep3 interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelClearSubDep3 newRec();

	/**
	 *	Allocate a protected ClearSubDep3 interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearSubDep3 asProtected(IBusModelClearSubDep3 src);

	/**
	 *	Allocate a public ClearSubDep3 interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearSubDep3 asPublic(IBusModelClearSubDep3 src);

	/**
	 *	Allocate a ClearSubDep3 history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelClearSubDep3H newHRec();

	/**
	 *	Allocate a protected ClearSubDep3 history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearSubDep3H asProtected(IBusModelClearSubDep3H src);

	/**
	 *	Allocate a public ClearSubDep3 history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearSubDep3H asPublic(IBusModelClearSubDep3H src);

}
