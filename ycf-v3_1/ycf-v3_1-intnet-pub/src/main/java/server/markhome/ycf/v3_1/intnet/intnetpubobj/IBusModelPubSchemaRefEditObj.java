// Description: Java 25 Public Instance Edit Object interface for BusModel SchemaRef.

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

public interface IBusModelPubSchemaRefEditObj
	extends IBusModelPubSchemaRefObj, IBusModelPubScopeEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IBusModelPubSchemaRefObj.
	 */
	IBusModelPubSchemaRefObj getOrigAsSchemaRef();

	/**
	 *	Get the IBusModelPubSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@return	The IBusModelPubSchemaDefObj instance referenced by the Schema key.
	 */
	IBusModelPubSchemaDefObj getRequiredContainerSchema();

	/**
	 *	Get the required IBusModelPubSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@return	The required IBusModelPubSchemaDefObj instance referenced by the Schema key.
	 */
	IBusModelPubSchemaDefObj getRequiredContainerSchema( boolean forceRead );

	/**
	 *	Set the IBusModelPubSchemaDefObj instance referenced by the Schema key.
	 *
	 *	@param	value	the IBusModelPubSchemaDefObj instance to be referenced by the Schema key.
	 */
	void setRequiredContainerSchema( IBusModelPubSchemaDefObj value );

	/**
	 *	Get the IBusModelPubSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@return	The IBusModelPubSchemaDefObj instance referenced by the RefSchema key.
	 */
	IBusModelPubSchemaDefObj getOptionalLookupRefSchema();

	/**
	 *	Get the optional IBusModelPubSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@return	The optional IBusModelPubSchemaDefObj instance referenced by the RefSchema key.
	 */
	IBusModelPubSchemaDefObj getOptionalLookupRefSchema( boolean forceRead );

	/**
	 *	Set the IBusModelPubSchemaDefObj instance referenced by the RefSchema key.
	 *
	 *	@param	value	the IBusModelPubSchemaDefObj instance to be referenced by the RefSchema key.
	 */
	void setOptionalLookupRefSchema( IBusModelPubSchemaDefObj value );

	/**
	 *	Get the IBusModelPubSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@return	The IBusModelPubSchemaRefObj instance referenced by the Prev key.
	 */
	IBusModelPubSchemaRefObj getOptionalLookupPrev();

	/**
	 *	Get the optional IBusModelPubSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IBusModelPubSchemaRefObj instance referenced by the Prev key.
	 */
	IBusModelPubSchemaRefObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Set the IBusModelPubSchemaRefObj instance referenced by the Prev key.
	 *
	 *	@param	value	the IBusModelPubSchemaRefObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( IBusModelPubSchemaRefObj value );

	/**
	 *	Get the IBusModelPubSchemaRefObj instance referenced by the Next key.
	 *
	 *	@return	The IBusModelPubSchemaRefObj instance referenced by the Next key.
	 */
	IBusModelPubSchemaRefObj getOptionalLookupNext();

	/**
	 *	Get the optional IBusModelPubSchemaRefObj instance referenced by the Next key.
	 *
	 *	@return	The optional IBusModelPubSchemaRefObj instance referenced by the Next key.
	 */
	IBusModelPubSchemaRefObj getOptionalLookupNext( boolean forceRead );

	/**
	 *	Set the IBusModelPubSchemaRefObj instance referenced by the Next key.
	 *
	 *	@param	value	the IBusModelPubSchemaRefObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( IBusModelPubSchemaRefObj value );

	/**
	 *	Get the required CFDbKeyHash256 attribute SchemaId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute SchemaId.
	 */
	CFDbKeyHash256 getRequiredSchemaId();

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
	 *	Get the required String attribute RefModelName.
	 *
	 *	@return	The required String attribute RefModelName.
	 */
	String getRequiredRefModelName();

	/**
	 *	Set the required String attribute RefModelName.
	 *
	 *	@param value The required String attribute RefModelName value to be applied.
	 */
	void setRequiredRefModelName(String value);

	/**
	 *	Get the required String attribute IncludeRoot.
	 *
	 *	@return	The required String attribute IncludeRoot.
	 */
	String getRequiredIncludeRoot();

	/**
	 *	Set the required String attribute IncludeRoot.
	 *
	 *	@param value The required String attribute IncludeRoot value to be applied.
	 */
	void setRequiredIncludeRoot(String value);

	/**
	 *	Get the optional CFDbKeyHash256 attribute RefSchemaId.
	 *
	 *	@return	The optional CFDbKeyHash256 attribute RefSchemaId.
	 */
	CFDbKeyHash256 getOptionalRefSchemaId();

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
