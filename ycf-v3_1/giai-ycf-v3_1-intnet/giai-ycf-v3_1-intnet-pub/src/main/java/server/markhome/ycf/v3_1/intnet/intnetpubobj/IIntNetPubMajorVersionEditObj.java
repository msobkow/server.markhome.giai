// Description: Java 25 Public Instance Edit Object interface for IntNet MajorVersion.

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
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IIntNetPubMajorVersionEditObj
	extends IIntNetPubMajorVersionObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IIntNetPubMajorVersionObj.
	 */
	IIntNetPubMajorVersionObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IIntNetPubMajorVersionObj.
	 */
	IIntNetPubMajorVersionObj getOrigAsMajorVersion();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IIntNetPubMajorVersionObj create();

	/*
	 *	Update the instance.
	 */
	IIntNetPubMajorVersionEditObj update();

	/*
	 *	Delete the instance.
	 */
	IIntNetPubMajorVersionEditObj deleteInstance();

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
	 *	Get the ISecurePubTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ISecurePubTenantObj instance referenced by the Tenant key.
	 */
	ISecurePubTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ISecurePubTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ISecurePubTenantObj instance referenced by the Tenant key.
	 */
	ISecurePubTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Set the ISecurePubTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ISecurePubTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( ISecurePubTenantObj value );

	/**
	 *	Get the IIntNetPubSubProjectObj instance referenced by the ParentSPrj key.
	 *
	 *	@return	The IIntNetPubSubProjectObj instance referenced by the ParentSPrj key.
	 */
	IIntNetPubSubProjectObj getRequiredContainerParentSPrj();

	/**
	 *	Get the required IIntNetPubSubProjectObj instance referenced by the ParentSPrj key.
	 *
	 *	@return	The required IIntNetPubSubProjectObj instance referenced by the ParentSPrj key.
	 */
	IIntNetPubSubProjectObj getRequiredContainerParentSPrj( boolean forceRead );

	/**
	 *	Set the IIntNetPubSubProjectObj instance referenced by the ParentSPrj key.
	 *
	 *	@param	value	the IIntNetPubSubProjectObj instance to be referenced by the ParentSPrj key.
	 */
	void setRequiredContainerParentSPrj( IIntNetPubSubProjectObj value );

	/**
	 *	Get a list IIntNetPubMinorVersionObj instances referenced by the MinorVer key.
	 *
	 *	@return	The (potentially empty) list of IIntNetPubMinorVersionObj instances referenced by the MinorVer key.
	 */
	List<IIntNetPubMinorVersionObj> getOptionalComponentsMinorVer();

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
	 *	Get the required CFDbKeyHash256 attribute TenantId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute TenantId.
	 */
	CFDbKeyHash256 getRequiredTenantId();

	/**
	 *	Get the required CFDbKeyHash256 attribute SubProjectId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute SubProjectId.
	 */
	CFDbKeyHash256 getRequiredSubProjectId();

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

	public void copyRecToOrig();
	public void copyOrigToRec();

}
