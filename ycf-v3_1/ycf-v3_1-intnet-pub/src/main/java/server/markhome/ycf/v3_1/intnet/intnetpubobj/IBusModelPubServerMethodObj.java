// Description: Java 25 Object interface for BusModelPub ServerMethod.

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

public interface IBusModelPubServerMethodObj
	extends IBusModelPubScopeObj
{
	/**
	 *	Get the current edition of this ServerMethod instance as a IBusModelPubServerMethodEditObj.
	 *
	 *	@return	The IBusModelPubServerMethodEditObj edition of this instance.
	 */
	IBusModelPubServerMethodEditObj getEditAsServerMethod();

	/**
	 *	Get the IBusModelPubServerMethodTableObj table cache which manages this instance.
	 *
	 *	@return	IBusModelPubServerMethodTableObj table cache which manages this instance.
	 */
	IBusModelPubServerMethodTableObj getServerMethodTable();

	/**
	 *	Get the IBusModelPubServerMethod instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IBusModelPubServerMethod instance which currently backs this object.
	 */
	IBusModelPubServerMethod getServerMethodRec();

	/**
	 *	Get the optional IBusModelPubSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional IBusModelPubSchemaDefObj instance referenced by the DefSchema key.
	 */
	IBusModelPubSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Get the optional IBusModelPubSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional IBusModelPubSchemaDefObj instance referenced by the DefSchema key.
	 */
	IBusModelPubSchemaDefObj getOptionalLookupDefSchema( boolean forceRead );

	/**
	 *	Get the required IBusModelPubTableObj instance referenced by the ForTable key.
	 *
	 *	@return	The required IBusModelPubTableObj instance referenced by the ForTable key.
	 */
	IBusModelPubTableObj getRequiredContainerForTable();

	/**
	 *	Get the required IBusModelPubTableObj instance referenced by the ForTable key.
	 *
	 *	@return	The required IBusModelPubTableObj instance referenced by the ForTable key.
	 */
	IBusModelPubTableObj getRequiredContainerForTable( boolean forceRead );

	/**
	 *	Get the array of optional IBusModelPubParamObj array of instances referenced by the Params key.
	 *
	 *	@return	The optional IBusModelPubParamObj[] array of instances referenced by the Params key.
	 */
	List<IBusModelPubParamObj> getOptionalComponentsParams();

	/**
	 *	Get the array of optional IBusModelPubParamObj array of instances referenced by the Params key.
	 *
	 *	@return	The optional IBusModelPubParamObj[] array of instances referenced by the Params key.
	 */
	List<IBusModelPubParamObj> getOptionalComponentsParams( boolean forceRead );

	/**
	 *	Get the required CFDbKeyHash256 attribute TableId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute TableId.
	 */
	CFDbKeyHash256 getRequiredTableId();

	/**
	 *	Get the required CFDbKeyHash256 attribute Id.
	 *
	 *	@return	The required CFDbKeyHash256 attribute Id.
	 */
	CFDbKeyHash256 getRequiredId();

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
	 *	Get the optional String attribute ShortName.
	 *
	 *	@return	The optional String attribute ShortName.
	 */
	String getOptionalShortName();

	/**
	 *	Get the optional String attribute Label.
	 *
	 *	@return	The optional String attribute Label.
	 */
	String getOptionalLabel();

	/**
	 *	Get the optional String attribute ShortDescription.
	 *
	 *	@return	The optional String attribute ShortDescription.
	 */
	String getOptionalShortDescription();

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Get the optional String attribute Suffix.
	 *
	 *	@return	The optional String attribute Suffix.
	 */
	String getOptionalSuffix();

	/**
	 *	Get the required boolean attribute IsInstanceMethod.
	 *
	 *	@return	The required boolean attribute IsInstanceMethod.
	 */
	boolean getRequiredIsInstanceMethod();

	/**
	 *	Get the required boolean attribute IsServerOnly.
	 *
	 *	@return	The required boolean attribute IsServerOnly.
	 */
	boolean getRequiredIsServerOnly();

	/**
	 *	Get the required IBusModelPubSchema.CodeVisibilityEnum attribute CodeVis.
	 *
	 *	@return	The required IBusModelPubSchema.CodeVisibilityEnum attribute CodeVis.
	 */
	IBusModelPubSchema.CodeVisibilityEnum getRequiredCodeVis();

	/**
	 *	Get the required String attribute JMethodBody.
	 *
	 *	@return	The required String attribute JMethodBody.
	 */
	String getRequiredJMethodBody();

	/**
	 *	Get the required String attribute CppMethodBody.
	 *
	 *	@return	The required String attribute CppMethodBody.
	 */
	String getRequiredCppMethodBody();

	/**
	 *	Get the required String attribute CsMethodBody.
	 *
	 *	@return	The required String attribute CsMethodBody.
	 */
	String getRequiredCsMethodBody();

}
