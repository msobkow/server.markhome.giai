
// Description: Java Protected Factory interface for ClearTopDep.

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
 *	IBusModelProtClearTopDepFactory protected interface for ClearTopDep
 */
public interface IBusModelProtClearTopDepFactory extends IBusModelPubClearTopDepFactory
{

	/**
	 *	Allocate a protected ClrTopDepTblIdx key over protected ClearTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearTopDepByClrTopDepTblIdxKey newProtByClrTopDepTblIdxKey();

	/**
	 *	Allocate a public ClrTopDepTblIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearTopDepByClrTopDepTblIdxKey asPublic(IBusModelProtClearTopDepByClrTopDepTblIdxKey src);

	/**
	 *	Allocate a protected UNameIdx key over protected ClearTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearTopDepByUNameIdxKey newProtByUNameIdxKey();

	/**
	 *	Allocate a public UNameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearTopDepByUNameIdxKey asPublic(IBusModelProtClearTopDepByUNameIdxKey src);

	/**
	 *	Allocate a protected PrevIdx key over protected ClearTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearTopDepByPrevIdxKey newProtByPrevIdxKey();

	/**
	 *	Allocate a public PrevIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearTopDepByPrevIdxKey asPublic(IBusModelProtClearTopDepByPrevIdxKey src);

	/**
	 *	Allocate a protected NextIdx key over protected ClearTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearTopDepByNextIdxKey newProtByNextIdxKey();

	/**
	 *	Allocate a public NextIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearTopDepByNextIdxKey asPublic(IBusModelProtClearTopDepByNextIdxKey src);

	/**
	 *	Allocate a protected ClearTopDep interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearTopDep newProtRec();

	/**
	 *	Allocate a public ClearTopDep interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearTopDep asPublic(IBusModelProtClearTopDep src);

	/**
	 *	Allocate a protected ClearTopDep history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtClearTopDepH newProtHRec();

	/**
	 *	Allocate a public ClearTopDep history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubClearTopDepH asPublic(IBusModelProtClearTopDepH src);

}
