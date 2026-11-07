// Description: Java 25 Object interface for BusModelPub DelTopDep.

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

package server.markhome.ycf.v3_1.busmodel.busmodelpubobj;

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

public interface IBusModelPubDelTopDepObj
	extends IBusModelPubDelDepObj
{
	/**
	 *	Move this object up in the chain and refresh the cache.
	 *
	 *	@return	IBusModelPubDelTopDepObj the reference to the moved and refreshed instance.
	 */
	IBusModelPubDelTopDepObj moveUp();

	/**
	 *	Move this object down in the chain and refresh the cache.
	 *
	 *	@return	IBusModelPubDelTopDepObj the reference to the moved and refreshed instance.
	 */
	IBusModelPubDelTopDepObj moveDown();

	/**
	 *	Get the current edition of this DelTopDep instance as a IBusModelPubDelTopDepEditObj.
	 *
	 *	@return	The IBusModelPubDelTopDepEditObj edition of this instance.
	 */
	IBusModelPubDelTopDepEditObj getEditAsDelTopDep();

	/**
	 *	Get the IBusModelPubDelTopDepTableObj table cache which manages this instance.
	 *
	 *	@return	IBusModelPubDelTopDepTableObj table cache which manages this instance.
	 */
	IBusModelPubDelTopDepTableObj getDelTopDepTable();

	/**
	 *	Get the IBusModelPubDelTopDep instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IBusModelPubDelTopDep instance which currently backs this object.
	 */
	IBusModelPubDelTopDep getDelTopDepRec();

	/**
	 *	Get the required IBusModelPubTableObj instance referenced by the Table key.
	 *
	 *	@return	The required IBusModelPubTableObj instance referenced by the Table key.
	 */
	IBusModelPubTableObj getRequiredContainerTable();

	/**
	 *	Get the required IBusModelPubTableObj instance referenced by the Table key.
	 *
	 *	@return	The required IBusModelPubTableObj instance referenced by the Table key.
	 */
	IBusModelPubTableObj getRequiredContainerTable( boolean forceRead );

	/**
	 *	Get the array of optional IBusModelPubDelSubDep1Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IBusModelPubDelSubDep1Obj[] array of instances referenced by the DelDep key.
	 */
	List<IBusModelPubDelSubDep1Obj> getOptionalComponentsDelDep();

	/**
	 *	Get the array of optional IBusModelPubDelSubDep1Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IBusModelPubDelSubDep1Obj[] array of instances referenced by the DelDep key.
	 */
	List<IBusModelPubDelSubDep1Obj> getOptionalComponentsDelDep( boolean forceRead );

	/**
	 *	Get the optional IBusModelPubDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IBusModelPubDelTopDepObj instance referenced by the Prev key.
	 */
	IBusModelPubDelTopDepObj getOptionalLookupPrev();

	/**
	 *	Get the optional IBusModelPubDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IBusModelPubDelTopDepObj instance referenced by the Prev key.
	 */
	IBusModelPubDelTopDepObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Get the optional IBusModelPubDelTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The optional IBusModelPubDelTopDepObj instance referenced by the Next key.
	 */
	IBusModelPubDelTopDepObj getOptionalLookupNext();

	/**
	 *	Get the optional IBusModelPubDelTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The optional IBusModelPubDelTopDepObj instance referenced by the Next key.
	 */
	IBusModelPubDelTopDepObj getOptionalLookupNext( boolean forceRead );

	/**
	 *	Get the required CFDbKeyHash256 attribute Id.
	 *
	 *	@return	The required CFDbKeyHash256 attribute Id.
	 */
	CFDbKeyHash256 getRequiredId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required CFDbKeyHash256 attribute TableId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute TableId.
	 */
	CFDbKeyHash256 getRequiredTableId();

	/**
	 *	Get the optional CFDbKeyHash256 attribute PrevId.
	 *
	 *	@return	The optional CFDbKeyHash256 attribute PrevId.
	 */
	CFDbKeyHash256 getOptionalPrevId();

	/**
	 *	Get the optional CFDbKeyHash256 attribute NextId.
	 *
	 *	@return	The optional CFDbKeyHash256 attribute NextId.
	 */
	CFDbKeyHash256 getOptionalNextId();

}
