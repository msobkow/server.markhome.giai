// Description: Java 25 Protected Instance Edit Object interface for Secure SecClusRole.

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

package server.markhome.ycf.v3_1.secure.secureprotobj;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;

public interface ISecureProtSecClusRoleEditObj
	extends ISecureProtSecClusRoleObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecureProtSecClusRoleObj.
	 */
	ISecureProtSecClusRoleObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecureProtSecClusRoleObj.
	 */
	ISecureProtSecClusRoleObj getOrigAsSecClusRole();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecureProtSecClusRoleObj create();

	/*
	 *	Update the instance.
	 */
	ISecureProtSecClusRoleEditObj update();

	/*
	 *	Delete the instance.
	 */
	ISecureProtSecClusRoleEditObj deleteInstance();

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
	 *	Get the ISecureProtClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The ISecureProtClusterObj instance referenced by the Cluster key.
	 */
	ISecureProtClusterObj getRequiredOwnerCluster();

	/**
	 *	Get the required ISecureProtClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ISecureProtClusterObj instance referenced by the Cluster key.
	 */
	ISecureProtClusterObj getRequiredOwnerCluster( boolean forceRead );

	/**
	 *	Set the ISecureProtClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the ISecureProtClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredOwnerCluster( ISecureProtClusterObj value );

	/**
	 *	Get the ISecureProtSecSysGrpObj instance referenced by the SysRole key.
	 *
	 *	@return	The ISecureProtSecSysGrpObj instance referenced by the SysRole key.
	 */
	ISecureProtSecSysGrpObj getRequiredContainerSysRole();

	/**
	 *	Get the required ISecureProtSecSysGrpObj instance referenced by the SysRole key.
	 *
	 *	@return	The required ISecureProtSecSysGrpObj instance referenced by the SysRole key.
	 */
	ISecureProtSecSysGrpObj getRequiredContainerSysRole( boolean forceRead );

	/**
	 *	Set the ISecureProtSecSysGrpObj instance referenced by the SysRole key.
	 *
	 *	@param	value	the ISecureProtSecSysGrpObj instance to be referenced by the SysRole key.
	 */
	void setRequiredContainerSysRole( ISecureProtSecSysGrpObj value );

	/**
	 *	Get a list ISecureProtSecClusRoleMembObj instances referenced by the MembByGrp key.
	 *
	 *	@return	The (potentially empty) list of ISecureProtSecClusRoleMembObj instances referenced by the MembByGrp key.
	 */
	List<ISecureProtSecClusRoleMembObj> getOptionalChildrenMembByGrp();

	/**
	 *	Get the required ICFKeyHash256 attribute SecClusRoleId.
	 *
	 *	@return	The required ICFKeyHash256 attribute SecClusRoleId.
	 */
	ICFKeyHash256 getRequiredSecClusRoleId();

	/**
	 *	Set the required ICFKeyHash256 attribute SecClusRoleId.
	 *
	 *	@param value The required ICFKeyHash256 attribute SecClusRoleId value to be applied.
	 */
	void setRequiredSecClusRoleId(ICFKeyHash256 value);

	/**
	 *	Get the required ICFKeyHash256 attribute ClusterId.
	 *
	 *	@return	The required ICFKeyHash256 attribute ClusterId.
	 */
	ICFKeyHash256 getRequiredClusterId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	public void copyRecToOrig();
	public void copyOrigToRec();

}
