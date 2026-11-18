// Description: Java 25 Public Instance Edit Object interface for Secure Tenant.

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

public interface ISecurePubTenantEditObj
	extends ISecurePubTenantObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecurePubTenantObj.
	 */
	ISecurePubTenantObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecurePubTenantObj.
	 */
	ISecurePubTenantObj getOrigAsTenant();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecurePubTenantObj create();

	/*
	 *	Update the instance.
	 */
	ISecurePubTenantEditObj update();

	/*
	 *	Delete the instance.
	 */
	ISecurePubTenantEditObj deleteInstance();

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
	 *	Get the ISecurePubClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The ISecurePubClusterObj instance referenced by the Cluster key.
	 */
	ISecurePubClusterObj getRequiredContainerCluster();

	/**
	 *	Get the required ISecurePubClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ISecurePubClusterObj instance referenced by the Cluster key.
	 */
	ISecurePubClusterObj getRequiredContainerCluster( boolean forceRead );

	/**
	 *	Set the ISecurePubClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the ISecurePubClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredContainerCluster( ISecurePubClusterObj value );

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
	 *	Get the required CFDbKeyHash256 attribute ClusterId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute ClusterId.
	 */
	CFDbKeyHash256 getRequiredClusterId();

	/**
	 *	Get the required String attribute TenantName.
	 *
	 *	@return	The required String attribute TenantName.
	 */
	String getRequiredTenantName();

	/**
	 *	Set the required String attribute TenantName.
	 *
	 *	@param value The required String attribute TenantName value to be applied.
	 */
	void setRequiredTenantName(String value);

	public void copyRecToOrig();
	public void copyOrigToRec();

}
