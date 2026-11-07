
// Description: Java Protected Factory interface for PopSubDep1.

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
 *	IBusModelProtPopSubDep1Factory protected interface for PopSubDep1
 */
public interface IBusModelProtPopSubDep1Factory extends IBusModelPubPopSubDep1Factory
{

	/**
	 *	Allocate a protected PopTopDepIdx key over protected PopSubDep1 instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtPopSubDep1ByPopTopDepIdxKey newProtByPopTopDepIdxKey();

	/**
	 *	Allocate a public PopTopDepIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubPopSubDep1ByPopTopDepIdxKey asPublic(IBusModelProtPopSubDep1ByPopTopDepIdxKey src);

	/**
	 *	Allocate a protected UNameIdx key over protected PopSubDep1 instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtPopSubDep1ByUNameIdxKey newProtByUNameIdxKey();

	/**
	 *	Allocate a public UNameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubPopSubDep1ByUNameIdxKey asPublic(IBusModelProtPopSubDep1ByUNameIdxKey src);

	/**
	 *	Allocate a protected PopSubDep1 interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtPopSubDep1 newProtRec();

	/**
	 *	Allocate a public PopSubDep1 interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubPopSubDep1 asPublic(IBusModelProtPopSubDep1 src);

	/**
	 *	Allocate a protected PopSubDep1 history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtPopSubDep1H newProtHRec();

	/**
	 *	Allocate a public PopSubDep1 history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubPopSubDep1H asPublic(IBusModelProtPopSubDep1H src);

}
