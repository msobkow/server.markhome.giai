// Description: Java 25 Instance Edit Object interface for Secure SecTentGrpMemb.

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

package server.markhome.ycf.v3_1.secure.secureobj;

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
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

public interface ISecureSecTentGrpMembEditObj
	extends ISecureSecTentGrpMembObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecureSecTentGrpMembObj.
	 */
	ISecureSecTentGrpMembObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecureSecTentGrpMembObj.
	 */
	ISecureSecTentGrpMembObj getOrigAsSecTentGrpMemb();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecureSecTentGrpMembObj create();

	/*
	 *	Update the instance.
	 */
	SecureSecTentGrpMembEditObj update();

	/*
	 *	Delete the instance.
	 */
	SecureSecTentGrpMembEditObj deleteInstance();

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ISecureSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ISecureSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( LocalDateTime value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ISecureSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ISecureSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( LocalDateTime value );

	/**
	 *	Get the ISecureSecTentGrpObj instance referenced by the Group key.
	 *
	 *	@return	The ISecureSecTentGrpObj instance referenced by the Group key.
	 */
	ISecureSecTentGrpObj getRequiredContainerGroup();

	/**
	 *	Get the required ISecureSecTentGrpObj instance referenced by the Group key.
	 *
	 *	@return	The required ISecureSecTentGrpObj instance referenced by the Group key.
	 */
	ISecureSecTentGrpObj getRequiredContainerGroup( boolean forceRead );

	/**
	 *	Set the ISecureSecTentGrpObj instance referenced by the Group key.
	 *
	 *	@param	value	the ISecureSecTentGrpObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( ISecureSecTentGrpObj value );

	/**
	 *	Get the ISecureSecUserObj instance referenced by the User key.
	 *
	 *	@return	The ISecureSecUserObj instance referenced by the User key.
	 */
	ISecureSecUserObj getRequiredParentUser();

	/**
	 *	Get the required ISecureSecUserObj instance referenced by the User key.
	 *
	 *	@return	The required ISecureSecUserObj instance referenced by the User key.
	 */
	ISecureSecUserObj getRequiredParentUser( boolean forceRead );

	/**
	 *	Set the ISecureSecUserObj instance referenced by the User key.
	 *
	 *	@param	value	the ISecureSecUserObj instance to be referenced by the User key.
	 */
	void setRequiredParentUser( ISecureSecUserObj value );

	/**
	 *	Get the required ICFKeyHash256 attribute SecTentGrpId.
	 *
	 *	@return	The required ICFKeyHash256 attribute SecTentGrpId.
	 */
	ICFKeyHash256 getRequiredSecTentGrpId();

	/**
	 *	Get the required String attribute LoginId.
	 *
	 *	@return	The required String attribute LoginId.
	 */
	String getRequiredLoginId();

	public void copyRecToOrig();
	public void copyOrigToRec();

}
