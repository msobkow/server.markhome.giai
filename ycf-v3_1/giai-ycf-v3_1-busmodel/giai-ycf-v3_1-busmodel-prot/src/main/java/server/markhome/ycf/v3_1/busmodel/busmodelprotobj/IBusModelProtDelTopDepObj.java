// Description: Java 25 Object interface for BusModelProt DelTopDep.

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

package server.markhome.ycf.v3_1.busmodel.busmodelprotobj;

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
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

public interface IBusModelProtDelTopDepObj
	extends IBusModelProtDelDepObj
{
	/**
	 *	Move this object up in the chain and refresh the cache.
	 *
	 *	@return	IBusModelProtScopeObj the reference to the moved and refreshed instance.
	 */
	IBusModelProtScopeObj moveUp();

	/**
	 *	Move this object down in the chain and refresh the cache.
	 *
	 *	@return	IBusModelProtDelTopDepObj the reference to the moved and refreshed instance.
	 */
	IBusModelProtScopeObj moveDown();

	/**
	 *	Get the current edition of this DelTopDep instance as a IBusModelProtDelTopDepEditObj.
	 *
	 *	@return	The IBusModelProtDelTopDepEditObj edition of this instance.
	 */
	IBusModelProtDelTopDepEditObj getEditAsDelTopDep();

	/**
	 *	Get the IBusModelProtDelTopDepTableObj table cache which manages this instance.
	 *
	 *	@return	IBusModelProtDelTopDepTableObj table cache which manages this instance.
	 */
	IBusModelProtDelTopDepTableObj getDelTopDepTable();

	/**
	 *	Get the IBusModelProtDelTopDep instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IBusModelProtDelTopDep instance which currently backs this object.
	 */
	IBusModelProtDelTopDep getDelTopDepRec();

	/**
	 *	Get the required IBusModelProtTableObj instance referenced by the Table key.
	 *
	 *	@return	The required IBusModelProtTableObj instance referenced by the Table key.
	 */
	IBusModelProtTableObj getRequiredContainerTable();

	/**
	 *	Get the required IBusModelProtTableObj instance referenced by the Table key.
	 *
	 *	@return	The required IBusModelProtTableObj instance referenced by the Table key.
	 */
	IBusModelProtTableObj getRequiredContainerTable( boolean forceRead );

	/**
	 *	Get the array of optional IBusModelProtDelSubDep1Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IBusModelProtDelSubDep1Obj[] array of instances referenced by the DelDep key.
	 */
	List<IBusModelProtDelSubDep1Obj> getOptionalComponentsDelDep();

	/**
	 *	Get the array of optional IBusModelProtDelSubDep1Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IBusModelProtDelSubDep1Obj[] array of instances referenced by the DelDep key.
	 */
	List<IBusModelProtDelSubDep1Obj> getOptionalComponentsDelDep( boolean forceRead );

	/**
	 *	Get the optional IBusModelProtDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IBusModelProtDelTopDepObj instance referenced by the Prev key.
	 */
	IBusModelProtDelTopDepObj getOptionalLookupPrev();

	/**
	 *	Get the optional IBusModelProtDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IBusModelProtDelTopDepObj instance referenced by the Prev key.
	 */
	IBusModelProtDelTopDepObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Get the optional IBusModelProtDelTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The optional IBusModelProtDelTopDepObj instance referenced by the Next key.
	 */
	IBusModelProtDelTopDepObj getOptionalLookupNext();

	/**
	 *	Get the optional IBusModelProtDelTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The optional IBusModelProtDelTopDepObj instance referenced by the Next key.
	 */
	IBusModelProtDelTopDepObj getOptionalLookupNext( boolean forceRead );

	/**
	 *	Get the required ICFKeyHash256 attribute Id.
	 *
	 *	@return	The required ICFKeyHash256 attribute Id.
	 */
	ICFKeyHash256 getRequiredId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFKeyHash256 attribute TableId.
	 *
	 *	@return	The required ICFKeyHash256 attribute TableId.
	 */
	ICFKeyHash256 getRequiredTableId();

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
