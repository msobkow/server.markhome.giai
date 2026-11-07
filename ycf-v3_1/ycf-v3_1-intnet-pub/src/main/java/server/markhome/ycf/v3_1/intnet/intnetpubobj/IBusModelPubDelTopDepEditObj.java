// Description: Java 25 Public Instance Edit Object interface for BusModel DelTopDep.

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
import org.apache.commons.text.StringEscapeUtils;

import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IBusModelPubDelTopDepEditObj
	extends IBusModelPubDelTopDepObj, IBusModelPubDelDepEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IBusModelPubDelTopDepObj.
	 */
	IBusModelPubDelTopDepObj getOrigAsDelTopDep();

	/**
	 *	Get the IBusModelPubTableObj instance referenced by the Table key.
	 *
	 *	@return	The IBusModelPubTableObj instance referenced by the Table key.
	 */
	IBusModelPubTableObj getRequiredContainerTable();

	/**
	 *	Get the required IBusModelPubTableObj instance referenced by the Table key.
	 *
	 *	@return	The required IBusModelPubTableObj instance referenced by the Table key.
	 */
	IBusModelPubTableObj getRequiredContainerTable( boolean forceRead );

	/**
	 *	Set the IBusModelPubTableObj instance referenced by the Table key.
	 *
	 *	@param	value	the IBusModelPubTableObj instance to be referenced by the Table key.
	 */
	void setRequiredContainerTable( IBusModelPubTableObj value );

	/**
	 *	Get a list IBusModelPubDelSubDep1Obj instances referenced by the DelDep key.
	 *
	 *	@return	The (potentially empty) list of IBusModelPubDelSubDep1Obj instances referenced by the DelDep key.
	 */
	List<IBusModelPubDelSubDep1Obj> getOptionalComponentsDelDep();

	/**
	 *	Get the IBusModelPubDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The IBusModelPubDelTopDepObj instance referenced by the Prev key.
	 */
	IBusModelPubDelTopDepObj getOptionalLookupPrev();

	/**
	 *	Get the optional IBusModelPubDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IBusModelPubDelTopDepObj instance referenced by the Prev key.
	 */
	IBusModelPubDelTopDepObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Set the IBusModelPubDelTopDepObj instance referenced by the Prev key.
	 *
	 *	@param	value	the IBusModelPubDelTopDepObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( IBusModelPubDelTopDepObj value );

	/**
	 *	Get the IBusModelPubDelTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The IBusModelPubDelTopDepObj instance referenced by the Next key.
	 */
	IBusModelPubDelTopDepObj getOptionalLookupNext();

	/**
	 *	Get the optional IBusModelPubDelTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The optional IBusModelPubDelTopDepObj instance referenced by the Next key.
	 */
	IBusModelPubDelTopDepObj getOptionalLookupNext( boolean forceRead );

	/**
	 *	Set the IBusModelPubDelTopDepObj instance referenced by the Next key.
	 *
	 *	@param	value	the IBusModelPubDelTopDepObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( IBusModelPubDelTopDepObj value );

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param value The required String attribute Name value to be applied.
	 */
	void setRequiredName(String value);

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
