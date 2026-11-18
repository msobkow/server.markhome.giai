// Description: Java 25 Instance Edit Object interface for IntNet SubProject.

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

package server.markhome.ycf.v3_1.intnet.intnetobj;

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
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

public interface IIntNetSubProjectEditObj
	extends IIntNetSubProjectObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IIntNetSubProjectObj.
	 */
	IIntNetSubProjectObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IIntNetSubProjectObj.
	 */
	IIntNetSubProjectObj getOrigAsSubProject();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IIntNetSubProjectObj create();

	/*
	 *	Update the instance.
	 */
	IntNetSubProjectEditObj update();

	/*
	 *	Delete the instance.
	 */
	IntNetSubProjectEditObj deleteInstance();

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
	 *	Get the ISecureTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ISecureTenantObj instance referenced by the Tenant key.
	 */
	ISecureTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ISecureTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ISecureTenantObj instance referenced by the Tenant key.
	 */
	ISecureTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Set the ISecureTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ISecureTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( ISecureTenantObj value );

	/**
	 *	Get the IIntNetTopProjectObj instance referenced by the ParentTPrj key.
	 *
	 *	@return	The IIntNetTopProjectObj instance referenced by the ParentTPrj key.
	 */
	IIntNetTopProjectObj getRequiredContainerParentTPrj();

	/**
	 *	Get the required IIntNetTopProjectObj instance referenced by the ParentTPrj key.
	 *
	 *	@return	The required IIntNetTopProjectObj instance referenced by the ParentTPrj key.
	 */
	IIntNetTopProjectObj getRequiredContainerParentTPrj( boolean forceRead );

	/**
	 *	Set the IIntNetTopProjectObj instance referenced by the ParentTPrj key.
	 *
	 *	@param	value	the IIntNetTopProjectObj instance to be referenced by the ParentTPrj key.
	 */
	void setRequiredContainerParentTPrj( IIntNetTopProjectObj value );

	/**
	 *	Get a list IIntNetMajorVersionObj instances referenced by the MajorVer key.
	 *
	 *	@return	The (potentially empty) list of IIntNetMajorVersionObj instances referenced by the MajorVer key.
	 */
	List<IIntNetMajorVersionObj> getOptionalComponentsMajorVer();

	/**
	 *	Get the required ICFKeyHash256 attribute Id.
	 *
	 *	@return	The required ICFKeyHash256 attribute Id.
	 */
	ICFKeyHash256 getRequiredId();

	/**
	 *	Set the required ICFKeyHash256 attribute Id.
	 *
	 *	@param value The required ICFKeyHash256 attribute Id value to be applied.
	 */
	void setRequiredId(ICFKeyHash256 value);

	/**
	 *	Get the required ICFKeyHash256 attribute TenantId.
	 *
	 *	@return	The required ICFKeyHash256 attribute TenantId.
	 */
	ICFKeyHash256 getRequiredTenantId();

	/**
	 *	Get the required ICFKeyHash256 attribute TopProjectId.
	 *
	 *	@return	The required ICFKeyHash256 attribute TopProjectId.
	 */
	ICFKeyHash256 getRequiredTopProjectId();

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
