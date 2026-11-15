// Description: Java 25 Public Instance Edit Object interface for BusModel Param.

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

public interface IBusModelPubParamEditObj
	extends IBusModelPubParamObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IBusModelPubParamObj.
	 */
	IBusModelPubParamObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IBusModelPubParamObj.
	 */
	IBusModelPubParamObj getOrigAsParam();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IBusModelPubParamObj create();

	/*
	 *	Update the instance.
	 */
	IBusModelPubParamEditObj update();

	/*
	 *	Delete the instance.
	 */
	IBusModelPubParamEditObj deleteInstance();

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ISecurePubSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ISecurePubSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( LocalDateTime value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ISecurePubSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ISecurePubSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( LocalDateTime value );

	/**
	 *	Get the IBusModelPubServerMethodObj instance referenced by the ServerMeth key.
	 *
	 *	@return	The IBusModelPubServerMethodObj instance referenced by the ServerMeth key.
	 */
	IBusModelPubServerMethodObj getRequiredContainerServerMeth();

	/**
	 *	Get the required IBusModelPubServerMethodObj instance referenced by the ServerMeth key.
	 *
	 *	@return	The required IBusModelPubServerMethodObj instance referenced by the ServerMeth key.
	 */
	IBusModelPubServerMethodObj getRequiredContainerServerMeth( boolean forceRead );

	/**
	 *	Set the IBusModelPubServerMethodObj instance referenced by the ServerMeth key.
	 *
	 *	@param	value	the IBusModelPubServerMethodObj instance to be referenced by the ServerMeth key.
	 */
	void setRequiredContainerServerMeth( IBusModelPubServerMethodObj value );

	/**
	 *	Get the IBusModelPubSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The IBusModelPubSchemaDefObj instance referenced by the DefSchema key.
	 */
	IBusModelPubSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Get the optional IBusModelPubSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional IBusModelPubSchemaDefObj instance referenced by the DefSchema key.
	 */
	IBusModelPubSchemaDefObj getOptionalLookupDefSchema( boolean forceRead );

	/**
	 *	Set the IBusModelPubSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@param	value	the IBusModelPubSchemaDefObj instance to be referenced by the DefSchema key.
	 */
	void setOptionalLookupDefSchema( IBusModelPubSchemaDefObj value );

	/**
	 *	Get the IBusModelPubParamObj instance referenced by the Prev key.
	 *
	 *	@return	The IBusModelPubParamObj instance referenced by the Prev key.
	 */
	IBusModelPubParamObj getOptionalLookupPrev();

	/**
	 *	Get the optional IBusModelPubParamObj instance referenced by the Prev key.
	 *
	 *	@return	The optional IBusModelPubParamObj instance referenced by the Prev key.
	 */
	IBusModelPubParamObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Set the IBusModelPubParamObj instance referenced by the Prev key.
	 *
	 *	@param	value	the IBusModelPubParamObj instance to be referenced by the Prev key.
	 */
	void setOptionalLookupPrev( IBusModelPubParamObj value );

	/**
	 *	Get the IBusModelPubParamObj instance referenced by the Next key.
	 *
	 *	@return	The IBusModelPubParamObj instance referenced by the Next key.
	 */
	IBusModelPubParamObj getOptionalLookupNext();

	/**
	 *	Get the optional IBusModelPubParamObj instance referenced by the Next key.
	 *
	 *	@return	The optional IBusModelPubParamObj instance referenced by the Next key.
	 */
	IBusModelPubParamObj getOptionalLookupNext( boolean forceRead );

	/**
	 *	Set the IBusModelPubParamObj instance referenced by the Next key.
	 *
	 *	@param	value	the IBusModelPubParamObj instance to be referenced by the Next key.
	 */
	void setOptionalLookupNext( IBusModelPubParamObj value );

	/**
	 *	Get the IBusModelPubValueObj instance referenced by the Type key.
	 *
	 *	@return	The IBusModelPubValueObj instance referenced by the Type key.
	 */
	IBusModelPubValueObj getRequiredLookupType();

	/**
	 *	Get the required IBusModelPubValueObj instance referenced by the Type key.
	 *
	 *	@return	The required IBusModelPubValueObj instance referenced by the Type key.
	 */
	IBusModelPubValueObj getRequiredLookupType( boolean forceRead );

	/**
	 *	Set the IBusModelPubValueObj instance referenced by the Type key.
	 *
	 *	@param	value	the IBusModelPubValueObj instance to be referenced by the Type key.
	 */
	void setRequiredLookupType( IBusModelPubValueObj value );

	/**
	 *	Get the required CFDbKeyHash256 attribute ServerMethodId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute ServerMethodId.
	 */
	CFDbKeyHash256 getRequiredServerMethodId();

	/**
	 *	Get the required CFDbKeyHash256 attribute Id.
	 *
	 *	@return	The required CFDbKeyHash256 attribute Id.
	 */
	CFDbKeyHash256 getRequiredId();

	/**
	 *	Set the required CFDbKeyHash256 attribute Id.
	 *
	 *	@param value The required CFDbKeyHash256 attribute Id value to be applied.
	 */
	void setRequiredId(CFDbKeyHash256 value);

	/**
	 *	Get the optional CFDbKeyHash256 attribute DefSchemaId.
	 *
	 *	@return	The optional CFDbKeyHash256 attribute DefSchemaId.
	 */
	CFDbKeyHash256 getOptionalDefSchemaId();

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
	 *	Get the optional String attribute ShortDescription.
	 *
	 *	@return	The optional String attribute ShortDescription.
	 */
	String getOptionalShortDescription();

	/**
	 *	Set the optional String attribute ShortDescription.
	 *
	 *	@param value The optional String attribute ShortDescription value to be applied.
	 */
	void setOptionalShortDescription(String value);

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Set the optional String attribute Description.
	 *
	 *	@param value The optional String attribute Description value to be applied.
	 */
	void setOptionalDescription(String value);

	/**
	 *	Get the required boolean attribute IsNullable.
	 *
	 *	@return	The required boolean attribute IsNullable.
	 */
	boolean getRequiredIsNullable();

	/**
	 *	Set the required boolean attribute IsNullable.
	 *
	 *	@param value The required boolean attribute IsNullable value to be applied.
	 */
	void setRequiredIsNullable(boolean value);

	/**
	 *	Get the optional CFDbKeyHash256 attribute TypeId.
	 *
	 *	@return	The optional CFDbKeyHash256 attribute TypeId.
	 */
	CFDbKeyHash256 getOptionalTypeId();

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

	public void copyRecToOrig();
	public void copyOrigToRec();

}
