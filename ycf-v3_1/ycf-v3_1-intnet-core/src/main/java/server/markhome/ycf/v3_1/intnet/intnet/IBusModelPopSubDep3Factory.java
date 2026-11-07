
// Description: Java JPA Factory interface for PopSubDep3.

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
 *	IBusModelPopSubDep3Factory interface for PopSubDep3
 */
public interface IBusModelPopSubDep3Factory extends IBusModelProtPopSubDep3Factory
{

	/**
	 *	Allocate a PopSubDep2Idx key over PopSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPopSubDep3ByPopSubDep2IdxKey newByPopSubDep2IdxKey();

	/**
	 *	Allocate a protected PopSubDep2Idx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtPopSubDep3ByPopSubDep2IdxKey asProtected(IBusModelPopSubDep3ByPopSubDep2IdxKey src);

	/**
	 *	Allocate a public PopSubDep2Idx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubPopSubDep3ByPopSubDep2IdxKey asPublic(IBusModelPopSubDep3ByPopSubDep2IdxKey src);

	/**
	 *	Allocate a UNameIdx key over PopSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPopSubDep3ByUNameIdxKey newByUNameIdxKey();

	/**
	 *	Allocate a protected UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtPopSubDep3ByUNameIdxKey asProtected(IBusModelPopSubDep3ByUNameIdxKey src);

	/**
	 *	Allocate a public UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubPopSubDep3ByUNameIdxKey asPublic(IBusModelPopSubDep3ByUNameIdxKey src);

	/**
	 *	Allocate a PopSubDep3 interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPopSubDep3 newRec();

	/**
	 *	Allocate a protected PopSubDep3 interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtPopSubDep3 asProtected(IBusModelPopSubDep3 src);

	/**
	 *	Allocate a public PopSubDep3 interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubPopSubDep3 asPublic(IBusModelPopSubDep3 src);

	/**
	 *	Allocate a PopSubDep3 history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPopSubDep3H newHRec();

	/**
	 *	Allocate a protected PopSubDep3 history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtPopSubDep3H asProtected(IBusModelPopSubDep3H src);

	/**
	 *	Allocate a public PopSubDep3 history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubPopSubDep3H asPublic(IBusModelPopSubDep3H src);

}
