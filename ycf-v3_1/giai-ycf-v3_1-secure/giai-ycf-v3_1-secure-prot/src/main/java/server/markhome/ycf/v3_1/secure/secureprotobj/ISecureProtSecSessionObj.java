// Description: Java 25 Object interface for SecureProt SecSession.

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

public interface ISecureProtSecSessionObj
	extends ICFAnyObj
{
	/**
	 *	Initially, the class code for an object is ISecureProtSecSession.CLASS_CODE, but the Obj layer relies on class code translation to map those
	 *	backing store entities to a runtime set of front-facing classcodes that the clients download and use when talking to the server implementing this code base.
	 *
	 *	@return The runtime class code used by this object. Only after the system is fully booted are these values stable and reliable.
	 */
	int getClassCode();
	/**
	 *	Realise this instance of a SecSession.
	 *
	 *	@return	SecureProtSecSessionObj instance which should be subsequently referenced.
	 */
	ISecureProtSecSessionObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ISecureProtSecSessionObj the reference to the cached or read (realised) instance.
	 */
	ISecureProtSecSessionObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ISecureProtSecSessionObj the reference to the cached or read (realised) instance.
	 */
	ISecureProtSecSessionObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecSession instance.
	 *
	 *	@return	The newly locked ISecureProtSecSessionEditObj edition of this instance.
	 */
	ISecureProtSecSessionEditObj beginEdit();

	/**
	 *	End this edition of this SecSession instance.
	 *
	 *	@throws	CFNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecSession instance.
	 *
	 *	@return	The ISecureProtSecSessionEditObj edition of this instance.
	 */
	ISecureProtSecSessionEditObj getEdit();

	/**
	 *	Get the current edition of this SecSession instance as a ISecureProtSecSessionEditObj.
	 *
	 *	@return	The ISecureProtSecSessionEditObj edition of this instance.
	 */
	ISecureProtSecSessionEditObj getEditAsSecSession();

	/**
	 *	Get the ISecureProtSecSessionTableObj table cache which manages this instance.
	 *
	 *	@return	ISecureProtSecSessionTableObj table cache which manages this instance.
	 */
	ISecureProtSecSessionTableObj getSecSessionTable();

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
	 *	Get the ISecureProtSecSession instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ISecureProtSecSession instance which currently backs this object.
	 */
	ISecureProtSecSession getRec();

	/**
	 *	Internal use only.
	 */
	void setRec( ISecureProtSecSession value );

	/**
	 *	Get the ISecureProtSecSession instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ISecureProtSecSession instance which currently backs this object.
	 */
	ISecureProtSecSession getSecSessionRec();

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
	 *	Get the required ISecureProtSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ISecureProtSecUserObj instance referenced by the SecUser key.
	 */
	ISecureProtSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required ISecureProtSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ISecureProtSecUserObj instance referenced by the SecUser key.
	 */
	ISecureProtSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Get the required ICFKeyHash256 attribute SecSessionId.
	 *
	 *	@return	The required ICFKeyHash256 attribute SecSessionId.
	 */
	ICFKeyHash256 getRequiredSecSessionId();

	/**
	 *	Get the required ICFKeyHash256 attribute SecUserId.
	 *
	 *	@return	The required ICFKeyHash256 attribute SecUserId.
	 */
	ICFKeyHash256 getRequiredSecUserId();

	/**
	 *	Get the required LocalDateTime attribute Start.
	 *
	 *	@return	The required LocalDateTime attribute Start.
	 */
	LocalDateTime getRequiredStart();

	/**
	 *	Get the optional LocalDateTime attribute Finish.
	 *
	 *	@return	The optional LocalDateTime attribute Finish.
	 */
	LocalDateTime getOptionalFinish();

	/**
	 *	Get the optional CFDbKeyHash256 attribute SecProxyId.
	 *
	 *	@return	The optional CFDbKeyHash256 attribute SecProxyId.
	 */
	CFDbKeyHash256 getOptionalSecProxyId();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToRec();

	/**
	 *	Internal use only.
	 */
	void copyRecToPKey();

}
