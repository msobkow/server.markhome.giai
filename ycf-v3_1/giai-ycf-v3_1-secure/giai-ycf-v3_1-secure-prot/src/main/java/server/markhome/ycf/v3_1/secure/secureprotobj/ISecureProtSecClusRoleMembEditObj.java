// Description: Java 25 Protected Instance Edit Object interface for Secure SecClusRoleMemb.

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

public interface ISecureProtSecClusRoleMembEditObj
	extends ISecureProtSecClusRoleMembObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecureProtSecClusRoleMembObj.
	 */
	ISecureProtSecClusRoleMembObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecureProtSecClusRoleMembObj.
	 */
	ISecureProtSecClusRoleMembObj getOrigAsSecClusRoleMemb();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecureProtSecClusRoleMembObj create();

	/*
	 *	Update the instance.
	 */
	ISecureProtSecClusRoleMembEditObj update();

	/*
	 *	Delete the instance.
	 */
	ISecureProtSecClusRoleMembEditObj deleteInstance();

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
	 *	Get the ISecureProtSecClusRoleObj instance referenced by the Role key.
	 *
	 *	@return	The ISecureProtSecClusRoleObj instance referenced by the Role key.
	 */
	ISecureProtSecClusRoleObj getRequiredContainerRole();

	/**
	 *	Get the required ISecureProtSecClusRoleObj instance referenced by the Role key.
	 *
	 *	@return	The required ISecureProtSecClusRoleObj instance referenced by the Role key.
	 */
	ISecureProtSecClusRoleObj getRequiredContainerRole( boolean forceRead );

	/**
	 *	Set the ISecureProtSecClusRoleObj instance referenced by the Role key.
	 *
	 *	@param	value	the ISecureProtSecClusRoleObj instance to be referenced by the Role key.
	 */
	void setRequiredContainerRole( ISecureProtSecClusRoleObj value );

	/**
	 *	Get the ISecureProtSecUserObj instance referenced by the User key.
	 *
	 *	@return	The ISecureProtSecUserObj instance referenced by the User key.
	 */
	ISecureProtSecUserObj getRequiredParentUser();

	/**
	 *	Get the required ISecureProtSecUserObj instance referenced by the User key.
	 *
	 *	@return	The required ISecureProtSecUserObj instance referenced by the User key.
	 */
	ISecureProtSecUserObj getRequiredParentUser( boolean forceRead );

	/**
	 *	Set the ISecureProtSecUserObj instance referenced by the User key.
	 *
	 *	@param	value	the ISecureProtSecUserObj instance to be referenced by the User key.
	 */
	void setRequiredParentUser( ISecureProtSecUserObj value );

	/**
	 *	Get the required ICFKeyHash256 attribute SecClusRoleId.
	 *
	 *	@return	The required ICFKeyHash256 attribute SecClusRoleId.
	 */
	ICFKeyHash256 getRequiredSecClusRoleId();

	/**
	 *	Get the required String attribute LoginId.
	 *
	 *	@return	The required String attribute LoginId.
	 */
	String getRequiredLoginId();

	public void copyRecToOrig();
	public void copyOrigToRec();

}
