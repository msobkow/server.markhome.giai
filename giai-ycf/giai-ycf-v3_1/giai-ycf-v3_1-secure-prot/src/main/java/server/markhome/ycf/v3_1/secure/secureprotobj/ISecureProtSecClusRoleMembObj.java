// Description: Java 25 Object interface for SecureProt SecClusRoleMemb.

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

public interface ISecureProtSecClusRoleMembObj
	extends ICFAnyObj
{
	/**
	 *	Initially, the class code for an object is ISecureProtSecClusRoleMemb.CLASS_CODE, but the Obj layer relies on class code translation to map those
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
	 *	Realise this instance of a SecClusRoleMemb.
	 *
	 *	@return	SecureProtSecClusRoleMembObj instance which should be subsequently referenced.
	 */
	ISecureProtSecClusRoleMembObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ISecureProtSecClusRoleMembObj the reference to the cached or read (realised) instance.
	 */
	ISecureProtSecClusRoleMembObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ISecureProtSecClusRoleMembObj the reference to the cached or read (realised) instance.
	 */
	ISecureProtSecClusRoleMembObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecClusRoleMemb instance.
	 *
	 *	@return	The newly locked ISecureProtSecClusRoleMembEditObj edition of this instance.
	 */
	ISecureProtSecClusRoleMembEditObj beginEdit();

	/**
	 *	End this edition of this SecClusRoleMemb instance.
	 *
	 *	@throws	CFNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecClusRoleMemb instance.
	 *
	 *	@return	The ISecureProtSecClusRoleMembEditObj edition of this instance.
	 */
	ISecureProtSecClusRoleMembEditObj getEdit();

	/**
	 *	Get the current edition of this SecClusRoleMemb instance as a ISecureProtSecClusRoleMembEditObj.
	 *
	 *	@return	The ISecureProtSecClusRoleMembEditObj edition of this instance.
	 */
	ISecureProtSecClusRoleMembEditObj getEditAsSecClusRoleMemb();

	/**
	 *	Get the ISecureProtSecClusRoleMembTableObj table cache which manages this instance.
	 *
	 *	@return	ISecureProtSecClusRoleMembTableObj table cache which manages this instance.
	 */
	ISecureProtSecClusRoleMembTableObj getSecClusRoleMembTable();

	/**
	 *	Get the ISecureProtSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ISecureProtSchemaObj schema cache which manages this instance.
	 */
	ISecureProtSchemaObj getSchema();

	/**
	 *	Set the ISecureProtSchemaObj schema cache which manages this instance.
	 *	Should only be used to install overloads of the buff implementation wired specifically to a transport implementation
	 *	that eventually hits a server running a JPA backend.
	 *
	 *	@param schema	ISecureProtSchemaObj schema cache which manages this instance.
	 */
	void setSchema(ISecureProtSchemaObj schema);

	/**
	 *	Get the ISecureProtSecClusRoleMemb instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ISecureProtSecClusRoleMemb instance which currently backs this object.
	 */
	ISecureProtSecClusRoleMemb getRec();

	/**
	 *	Internal use only.
	 */
	void setRec( ISecureProtSecClusRoleMemb value );

	/**
	 *	Get the ISecureProtSecClusRoleMemb instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ISecureProtSecClusRoleMemb instance which currently backs this object.
	 */
	ISecureProtSecClusRoleMemb getSecClusRoleMembRec();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	ISecureProtSecClusRoleMembPKey primary key for this instance.
	 */
	ISecureProtSecClusRoleMembPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param ISecureProtSecClusRoleMembPKey primary key value for this instance.
	 */
	void setPKey( ISecureProtSecClusRoleMembPKey value );

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

	/**
	 *	Internal use only.
	 */
	void copyPKeyToRec();

	/**
	 *	Internal use only.
	 */
	void copyRecToPKey();

}
