// Description: Java 25 Public Instance Edit Object interface for BusModel Chain.

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

public interface IBusModelPubChainEditObj
	extends IBusModelPubChainObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IBusModelPubChainObj.
	 */
	IBusModelPubChainObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IBusModelPubChainObj.
	 */
	IBusModelPubChainObj getOrigAsChain();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IBusModelPubChainObj create();

	/*
	 *	Update the instance.
	 */
	IBusModelPubChainEditObj update();

	/*
	 *	Delete the instance.
	 */
	IBusModelPubChainEditObj deleteInstance();

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
	 *	Get the IBusModelPubRelationObj instance referenced by the PrevRel key.
	 *
	 *	@return	The IBusModelPubRelationObj instance referenced by the PrevRel key.
	 */
	IBusModelPubRelationObj getRequiredLookupPrevRel();

	/**
	 *	Get the required IBusModelPubRelationObj instance referenced by the PrevRel key.
	 *
	 *	@return	The required IBusModelPubRelationObj instance referenced by the PrevRel key.
	 */
	IBusModelPubRelationObj getRequiredLookupPrevRel( boolean forceRead );

	/**
	 *	Set the IBusModelPubRelationObj instance referenced by the PrevRel key.
	 *
	 *	@param	value	the IBusModelPubRelationObj instance to be referenced by the PrevRel key.
	 */
	void setRequiredLookupPrevRel( IBusModelPubRelationObj value );

	/**
	 *	Get the IBusModelPubRelationObj instance referenced by the NextRel key.
	 *
	 *	@return	The IBusModelPubRelationObj instance referenced by the NextRel key.
	 */
	IBusModelPubRelationObj getRequiredLookupNextRel();

	/**
	 *	Get the required IBusModelPubRelationObj instance referenced by the NextRel key.
	 *
	 *	@return	The required IBusModelPubRelationObj instance referenced by the NextRel key.
	 */
	IBusModelPubRelationObj getRequiredLookupNextRel( boolean forceRead );

	/**
	 *	Set the IBusModelPubRelationObj instance referenced by the NextRel key.
	 *
	 *	@param	value	the IBusModelPubRelationObj instance to be referenced by the NextRel key.
	 */
	void setRequiredLookupNextRel( IBusModelPubRelationObj value );

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
	 *	Get the optional String attribute ShortName.
	 *
	 *	@return	The optional String attribute ShortName.
	 */
	String getOptionalShortName();

	/**
	 *	Set the optional String attribute ShortName.
	 *
	 *	@param value The optional String attribute ShortName value to be applied.
	 */
	void setOptionalShortName(String value);

	/**
	 *	Get the optional String attribute Label.
	 *
	 *	@return	The optional String attribute Label.
	 */
	String getOptionalLabel();

	/**
	 *	Set the optional String attribute Label.
	 *
	 *	@param value The optional String attribute Label value to be applied.
	 */
	void setOptionalLabel(String value);

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
	 *	Get the required CFDbKeyHash256 attribute TableId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute TableId.
	 */
	CFDbKeyHash256 getRequiredTableId();

	/**
	 *	Get the optional String attribute Suffix.
	 *
	 *	@return	The optional String attribute Suffix.
	 */
	String getOptionalSuffix();

	/**
	 *	Set the optional String attribute Suffix.
	 *
	 *	@param value The optional String attribute Suffix value to be applied.
	 */
	void setOptionalSuffix(String value);

	/**
	 *	Get the required CFDbKeyHash256 attribute PrevRelationId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute PrevRelationId.
	 */
	CFDbKeyHash256 getRequiredPrevRelationId();

	/**
	 *	Get the required CFDbKeyHash256 attribute NextRelationId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute NextRelationId.
	 */
	CFDbKeyHash256 getRequiredNextRelationId();

	public void copyRecToOrig();
	public void copyOrigToRec();

}
