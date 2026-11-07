// Description: Java 25 Object interface for BusModelPub DelSubDep3.

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

public interface IBusModelPubDelSubDep3Obj
	extends IBusModelPubDelDepObj
{
	/**
	 *	Get the current edition of this DelSubDep3 instance as a IBusModelPubDelSubDep3EditObj.
	 *
	 *	@return	The IBusModelPubDelSubDep3EditObj edition of this instance.
	 */
	IBusModelPubDelSubDep3EditObj getEditAsDelSubDep3();

	/**
	 *	Get the IBusModelPubDelSubDep3TableObj table cache which manages this instance.
	 *
	 *	@return	IBusModelPubDelSubDep3TableObj table cache which manages this instance.
	 */
	IBusModelPubDelSubDep3TableObj getDelSubDep3Table();

	/**
	 *	Get the IBusModelPubDelSubDep3 instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IBusModelPubDelSubDep3 instance which currently backs this object.
	 */
	IBusModelPubDelSubDep3 getDelSubDep3Rec();

	/**
	 *	Get the required IBusModelPubDelSubDep2Obj instance referenced by the DelSubDep2 key.
	 *
	 *	@return	The required IBusModelPubDelSubDep2Obj instance referenced by the DelSubDep2 key.
	 */
	IBusModelPubDelSubDep2Obj getRequiredContainerDelSubDep2();

	/**
	 *	Get the required IBusModelPubDelSubDep2Obj instance referenced by the DelSubDep2 key.
	 *
	 *	@return	The required IBusModelPubDelSubDep2Obj instance referenced by the DelSubDep2 key.
	 */
	IBusModelPubDelSubDep2Obj getRequiredContainerDelSubDep2( boolean forceRead );

	/**
	 *	Get the required CFDbKeyHash256 attribute Id.
	 *
	 *	@return	The required CFDbKeyHash256 attribute Id.
	 */
	CFDbKeyHash256 getRequiredId();

	/**
	 *	Get the required CFDbKeyHash256 attribute DelSubDep2Id.
	 *
	 *	@return	The required CFDbKeyHash256 attribute DelSubDep2Id.
	 */
	CFDbKeyHash256 getRequiredDelSubDep2Id();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

}
