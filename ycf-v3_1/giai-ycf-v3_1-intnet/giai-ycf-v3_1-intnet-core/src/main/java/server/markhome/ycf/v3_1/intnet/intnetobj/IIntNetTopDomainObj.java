// Description: Java 25 Object interface for IntNet TopDomain.

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

public interface IIntNetTopDomainObj
	extends ICFAnyObj
{
	/**
	 *	Initially, the class code for an object is IIntNetTopDomain.CLASS_CODE, but the Obj layer relies on class code translation to map those
	 *	backing store entities to a runtime set of front-facing classcodes that the clients download and use when talking to the server implementing this code base.
	 *
	 *	@return The runtime class code used by this object. Only after the system is fully booted are these values stable and reliable.
	 */
	int getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ISecureSecUserObj instance who created this instance.
	 */
	ISecureSecUserObj getCreatedBy();

	/**
	 *	Get the LocalDateTime this instance was created.
	 *
	 *	@return	The LocalDateTime value for the creation time of the instance.
	 */
	LocalDateTime getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ISecureSecUserObj instance who updated this instance.
	 */
	ISecureSecUserObj getUpdatedBy();

	/**
	 *	Get the LocalDateTime date-time this instance was updated.
	 *
	 *	@return	The LocalDateTime value for the create time of the instance.
	 */
	LocalDateTime getUpdatedAt();
	/**
	 *	Realise this instance of a TopDomain.
	 *
	 *	@return	IntNetTopDomainObj instance which should be subsequently referenced.
	 */
	IIntNetTopDomainObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IIntNetTopDomainObj the reference to the cached or read (realised) instance.
	 */
	IIntNetTopDomainObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IIntNetTopDomainObj the reference to the cached or read (realised) instance.
	 */
	IIntNetTopDomainObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TopDomain instance.
	 *
	 *	@return	The newly locked IIntNetTopDomainEditObj edition of this instance.
	 */
	IIntNetTopDomainEditObj beginEdit();

	/**
	 *	End this edition of this TopDomain instance.
	 *
	 *	@throws	CFNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TopDomain instance.
	 *
	 *	@return	The IIntNetTopDomainEditObj edition of this instance.
	 */
	IIntNetTopDomainEditObj getEdit();

	/**
	 *	Get the current edition of this TopDomain instance as a IIntNetTopDomainEditObj.
	 *
	 *	@return	The IIntNetTopDomainEditObj edition of this instance.
	 */
	IIntNetTopDomainEditObj getEditAsTopDomain();

	/**
	 *	Get the IIntNetTopDomainTableObj table cache which manages this instance.
	 *
	 *	@return	IIntNetTopDomainTableObj table cache which manages this instance.
	 */
	IIntNetTopDomainTableObj getTopDomainTable();

	/**
	 *	Get the IIntNetSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IIntNetSchemaObj schema cache which manages this instance.
	 */
	IIntNetSchemaObj getSchema();

	/**
	 *	Set the IIntNetSchemaObj schema cache which manages this instance.
	 *	Should only be used to install overloads of the buff implementation wired specifically to a transport implementation
	 *	that eventually hits a server running a JPA backend.
	 *
	 *	@param schema	IIntNetSchemaObj schema cache which manages this instance.
	 */
	void setSchema(IIntNetSchemaObj schema);

	/**
	 *	Get the IIntNetTopDomain instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IIntNetTopDomain instance which currently backs this object.
	 */
	IIntNetTopDomain getRec();

	/**
	 *	Internal use only.
	 */
	void setRec( IIntNetTopDomain value );

	/**
	 *	Get the IIntNetTopDomain instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IIntNetTopDomain instance which currently backs this object.
	 */
	IIntNetTopDomain getTopDomainRec();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	$implCommaIJavaOptAtomType$ primary key for this instance.
	 */
	$implCommaIJavaOptAtomType$ getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param $implCommaIJavaOptAtomType$ primary key value for this instance.
	 */
	void setPKey( $implCommaIJavaOptAtomType$ value );

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
	 *	Get the required IIntNetTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required IIntNetTenantObj instance referenced by the Tenant key.
	 */
	ISecureTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ISecureTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ISecureTenantObj instance referenced by the Tenant key.
	 */
	ISecureTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required IIntNetTldObj instance referenced by the ParentTld key.
	 *
	 *	@return	The required IIntNetTldObj instance referenced by the ParentTld key.
	 */
	IIntNetTldObj getRequiredContainerParentTld();

	/**
	 *	Get the required IIntNetTldObj instance referenced by the ParentTld key.
	 *
	 *	@return	The required IIntNetTldObj instance referenced by the ParentTld key.
	 */
	IIntNetTldObj getRequiredContainerParentTld( boolean forceRead );

	/**
	 *	Get the array of optional IIntNetTopProjectObj array of instances referenced by the TopProject key.
	 *
	 *	@return	The optional IIntNetTopProjectObj[] array of instances referenced by the TopProject key.
	 */
	List<IIntNetTopProjectObj> getOptionalComponentsTopProject();

	/**
	 *	Get the array of optional IIntNetTopProjectObj array of instances referenced by the TopProject key.
	 *
	 *	@return	The optional IIntNetTopProjectObj[] array of instances referenced by the TopProject key.
	 */
	List<IIntNetTopProjectObj> getOptionalComponentsTopProject( boolean forceRead );

	/**
	 *	Get the array of optional IIntNetLicenseObj array of instances referenced by the License key.
	 *
	 *	@return	The optional IIntNetLicenseObj[] array of instances referenced by the License key.
	 */
	List<IIntNetLicenseObj> getOptionalComponentsLicense();

	/**
	 *	Get the array of optional IIntNetLicenseObj array of instances referenced by the License key.
	 *
	 *	@return	The optional IIntNetLicenseObj[] array of instances referenced by the License key.
	 */
	List<IIntNetLicenseObj> getOptionalComponentsLicense( boolean forceRead );

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
