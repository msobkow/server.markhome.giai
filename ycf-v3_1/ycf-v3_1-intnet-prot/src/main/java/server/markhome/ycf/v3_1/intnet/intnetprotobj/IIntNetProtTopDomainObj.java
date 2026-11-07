// Description: Java 25 Object interface for IntNetProt TopDomain.

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

package server.markhome.ycf.v3_1.intnet.intnetprotobj;

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
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IIntNetProtTopDomainObj
	extends ICFAnyObj
{
	/**
	 *	Initially, the class code for an object is IIntNetProtTopDomain.CLASS_CODE, but the Obj layer relies on class code translation to map those
	 *	backing store entities to a runtime set of front-facing classcodes that the clients download and use when talking to the server implementing this code base.
	 *
	 *	@return The runtime class code used by this object. Only after the system is fully booted are these values stable and reliable.
	 */
	int getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ISecurePubSecUserObj instance who created this instance.
	 */
	ISecurePubSecUserObj getCreatedBy();

	/**
	 *	Get the LocalDateTime this instance was created.
	 *
	 *	@return	The LocalDateTime value for the creation time of the instance.
	 */
	LocalDateTime getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ISecurePubSecUserObj instance who updated this instance.
	 */
	ISecurePubSecUserObj getUpdatedBy();

	/**
	 *	Get the LocalDateTime date-time this instance was updated.
	 *
	 *	@return	The LocalDateTime value for the create time of the instance.
	 */
	LocalDateTime getUpdatedAt();
	/**
	 *	Realise this instance of a TopDomain.
	 *
	 *	@return	IntNetProtTopDomainObj instance which should be subsequently referenced.
	 */
	IIntNetProtTopDomainObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IIntNetProtTopDomainObj the reference to the cached or read (realised) instance.
	 */
	IIntNetProtTopDomainObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IIntNetProtTopDomainObj the reference to the cached or read (realised) instance.
	 */
	IIntNetProtTopDomainObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TopDomain instance.
	 *
	 *	@return	The newly locked IIntNetProtTopDomainEditObj edition of this instance.
	 */
	IIntNetProtTopDomainEditObj beginEdit();

	/**
	 *	End this edition of this TopDomain instance.
	 *
	 *	@throws	CFNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TopDomain instance.
	 *
	 *	@return	The IIntNetProtTopDomainEditObj edition of this instance.
	 */
	IIntNetProtTopDomainEditObj getEdit();

	/**
	 *	Get the current edition of this TopDomain instance as a IIntNetProtTopDomainEditObj.
	 *
	 *	@return	The IIntNetProtTopDomainEditObj edition of this instance.
	 */
	IIntNetProtTopDomainEditObj getEditAsTopDomain();

	/**
	 *	Get the IIntNetProtTopDomainTableObj table cache which manages this instance.
	 *
	 *	@return	IIntNetProtTopDomainTableObj table cache which manages this instance.
	 */
	IIntNetProtTopDomainTableObj getTopDomainTable();

	/**
	 *	Get the IIntNetProtSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IIntNetProtSchemaObj schema cache which manages this instance.
	 */
	IIntNetProtSchemaObj getSchema();

	/**
	 *	Set the IIntNetProtSchemaObj schema cache which manages this instance.
	 *	Should only be used to install overloads of the buff implementation wired specifically to a transport implementation
	 *	that eventually hits a server running a JPA backend.
	 *
	 *	@param schema	IIntNetProtSchemaObj schema cache which manages this instance.
	 */
	void setSchema(IIntNetProtSchemaObj schema);

	/**
	 *	Get the IIntNetProtTopDomain instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IIntNetProtTopDomain instance which currently backs this object.
	 */
	IIntNetProtTopDomain getRec();

	/**
	 *	Internal use only.
	 */
	void setRec( IIntNetProtTopDomain value );

	/**
	 *	Get the IIntNetProtTopDomain instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IIntNetProtTopDomain instance which currently backs this object.
	 */
	IIntNetProtTopDomain getTopDomainRec();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFDbKeyHash256 primary key for this instance.
	 */
	CFDbKeyHash256 getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFDbKeyHash256 primary key value for this instance.
	 */
	void setPKey( CFDbKeyHash256 value );

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required IIntNetProtTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IIntNetProtTenantObj instance referenced by the Tenant key.
	 */
	ISecurePubTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ISecureProtTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ISecureProtTenantObj instance referenced by the Tenant key.
	 */
	ISecurePubTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required IIntNetProtTldObj instance referenced by the ParentTld key.
	 *
	 *	@return	The required IIntNetProtTldObj instance referenced by the ParentTld key.
	 */
	IIntNetProtTldObj getRequiredContainerParentTld();

	/**
	 *	Get the required IIntNetProtTldObj instance referenced by the ParentTld key.
	 *
	 *	@return	The required IIntNetProtTldObj instance referenced by the ParentTld key.
	 */
	IIntNetProtTldObj getRequiredContainerParentTld( boolean forceRead );

	/**
	 *	Get the array of optional IIntNetProtTopProjectObj array of instances referenced by the TopProject key.
	 *
	 *	@return	The optional IIntNetProtTopProjectObj[] array of instances referenced by the TopProject key.
	 */
	List<IIntNetProtTopProjectObj> getOptionalComponentsTopProject();

	/**
	 *	Get the array of optional IIntNetProtTopProjectObj array of instances referenced by the TopProject key.
	 *
	 *	@return	The optional IIntNetProtTopProjectObj[] array of instances referenced by the TopProject key.
	 */
	List<IIntNetProtTopProjectObj> getOptionalComponentsTopProject( boolean forceRead );

	/**
	 *	Get the array of optional IIntNetProtLicenseObj array of instances referenced by the License key.
	 *
	 *	@return	The optional IIntNetProtLicenseObj[] array of instances referenced by the License key.
	 */
	List<IIntNetProtLicenseObj> getOptionalComponentsLicense();

	/**
	 *	Get the array of optional IIntNetProtLicenseObj array of instances referenced by the License key.
	 *
	 *	@return	The optional IIntNetProtLicenseObj[] array of instances referenced by the License key.
	 */
	List<IIntNetProtLicenseObj> getOptionalComponentsLicense( boolean forceRead );

	/**
	 *	Get the required ICFKeyHash256 attribute Id.
	 *
	 *	@return	The required ICFKeyHash256 attribute Id.
	 */
	ICFKeyHash256 getRequiredId();

	/**
	 *	Get the required ICFKeyHash256 attribute TenantId.
	 *
	 *	@return	The required ICFKeyHash256 attribute TenantId.
	 */
	ICFKeyHash256 getRequiredTenantId();

	/**
	 *	Get the required ICFKeyHash256 attribute TldId.
	 *
	 *	@return	The required ICFKeyHash256 attribute TldId.
	 */
	ICFKeyHash256 getRequiredTldId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToRec();

	/**
	 *	Internal use only.
	 */
	void copyRecToPKey();

}
