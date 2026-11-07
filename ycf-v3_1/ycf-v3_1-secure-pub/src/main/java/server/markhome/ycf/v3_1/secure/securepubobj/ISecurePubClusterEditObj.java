// Description: Java 25 Public Instance Edit Object interface for Secure Cluster.

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

package server.markhome.ycf.v3_1.secure.securepubobj;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface ISecurePubClusterEditObj
	extends ISecurePubClusterObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecurePubClusterObj.
	 */
	ISecurePubClusterObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecurePubClusterObj.
	 */
	ISecurePubClusterObj getOrigAsCluster();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecurePubClusterObj create();

	/*
	 *	Update the instance.
	 */
	ISecurePubClusterEditObj update();

	/*
	 *	Delete the instance.
	 */
	ISecurePubClusterEditObj deleteInstance();

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
	 *	Get a list ISecurePubTenantObj instances referenced by the Tenant key.
	 *
	 *	@return	The (potentially empty) list of ISecurePubTenantObj instances referenced by the Tenant key.
	 */
	List<ISecurePubTenantObj> getOptionalComponentsTenant();

	/**
	 *	Get a list ISecurePubSysClusterObj instances referenced by the SysCluster key.
	 *
	 *	@return	The (potentially empty) list of ISecurePubSysClusterObj instances referenced by the SysCluster key.
	 */
	List<ISecurePubSysClusterObj> getOptionalComponentsSysCluster();

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
	 *	Get the required String attribute FullDomName.
	 *
	 *	@return	The required String attribute FullDomName.
	 */
	String getRequiredFullDomName();

	/**
	 *	Set the required String attribute FullDomName.
	 *
	 *	@param value The required String attribute FullDomName value to be applied.
	 */
	void setRequiredFullDomName(String value);

	/**
	 *	Get the required String attribute Description.
	 *
	 *	@return	The required String attribute Description.
	 */
	String getRequiredDescription();

	/**
	 *	Set the required String attribute Description.
	 *
	 *	@param value The required String attribute Description value to be applied.
	 */
	void setRequiredDescription(String value);

	public void copyRecToOrig();
	public void copyOrigToRec();

}
