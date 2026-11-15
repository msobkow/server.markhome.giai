// Description: Java 25 Object interface for BusModelPub DelSubDep1.

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

package server.markhome.ycf.v3_1.intnet.intnetpubobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
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

public interface IBusModelPubDelSubDep1Obj
	extends IBusModelPubDelDepObj
{
	/**
	 *	Get the current edition of this DelSubDep1 instance as a IBusModelPubDelSubDep1EditObj.
	 *
	 *	@return	The IBusModelPubDelSubDep1EditObj edition of this instance.
	 */
	IBusModelPubDelSubDep1EditObj getEditAsDelSubDep1();

	/**
	 *	Get the IBusModelPubDelSubDep1TableObj table cache which manages this instance.
	 *
	 *	@return	IBusModelPubDelSubDep1TableObj table cache which manages this instance.
	 */
	IBusModelPubDelSubDep1TableObj getDelSubDep1Table();

	/**
	 *	Get the IBusModelPubDelSubDep1 instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IBusModelPubDelSubDep1 instance which currently backs this object.
	 */
	IBusModelPubDelSubDep1 getDelSubDep1Rec();

	/**
	 *	Get the required IBusModelPubDelTopDepObj instance referenced by the DelTopDep key.
	 *
	 *	@return	The required IBusModelPubDelTopDepObj instance referenced by the DelTopDep key.
	 */
	IBusModelPubDelTopDepObj getRequiredContainerDelTopDep();

	/**
	 *	Get the required IBusModelPubDelTopDepObj instance referenced by the DelTopDep key.
	 *
	 *	@return	The required IBusModelPubDelTopDepObj instance referenced by the DelTopDep key.
	 */
	IBusModelPubDelTopDepObj getRequiredContainerDelTopDep( boolean forceRead );

	/**
	 *	Get the array of optional IBusModelPubDelSubDep2Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IBusModelPubDelSubDep2Obj[] array of instances referenced by the DelDep key.
	 */
	List<IBusModelPubDelSubDep2Obj> getOptionalComponentsDelDep();

	/**
	 *	Get the array of optional IBusModelPubDelSubDep2Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IBusModelPubDelSubDep2Obj[] array of instances referenced by the DelDep key.
	 */
	List<IBusModelPubDelSubDep2Obj> getOptionalComponentsDelDep( boolean forceRead );

	/**
	 *	Get the required CFDbKeyHash256 attribute Id.
	 *
	 *	@return	The required CFDbKeyHash256 attribute Id.
	 */
	CFDbKeyHash256 getRequiredId();

	/**
	 *	Get the required CFDbKeyHash256 attribute DelTopDepId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute DelTopDepId.
	 */
	CFDbKeyHash256 getRequiredDelTopDepId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

}
