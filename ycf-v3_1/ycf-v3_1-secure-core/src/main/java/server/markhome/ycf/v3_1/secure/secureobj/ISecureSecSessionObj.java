// Description: Java 25 Object interface for Secure SecSession.

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

public interface ISecureSecSessionObj
	extends ICFAnyObj
{
	/**
	 *	Initially, the class code for an object is ISecureSecSession.CLASS_CODE, but the Obj layer relies on class code translation to map those
	 *	backing store entities to a runtime set of front-facing classcodes that the clients download and use when talking to the server implementing this code base.
	 *
	 *	@return The runtime class code used by this object. Only after the system is fully booted are these values stable and reliable.
	 */
	int getClassCode();
	/**
	 *	Realise this instance of a SecSession.
	 *
	 *	@return	SecureSecSessionObj instance which should be subsequently referenced.
	 */
	ISecureSecSessionObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ISecureSecSessionObj the reference to the cached or read (realised) instance.
	 */
	ISecureSecSessionObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ISecureSecSessionObj the reference to the cached or read (realised) instance.
	 */
	ISecureSecSessionObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecSession instance.
	 *
	 *	@return	The newly locked ISecureSecSessionEditObj edition of this instance.
	 */
	ISecureSecSessionEditObj beginEdit();

	/**
	 *	End this edition of this SecSession instance.
	 *
	 *	@throws	CFNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecSession instance.
	 *
	 *	@return	The ISecureSecSessionEditObj edition of this instance.
	 */
	ISecureSecSessionEditObj getEdit();

	/**
	 *	Get the current edition of this SecSession instance as a ISecureSecSessionEditObj.
	 *
	 *	@return	The ISecureSecSessionEditObj edition of this instance.
	 */
	ISecureSecSessionEditObj getEditAsSecSession();

	/**
	 *	Get the ISecureSecSessionTableObj table cache which manages this instance.
	 *
	 *	@return	ISecureSecSessionTableObj table cache which manages this instance.
	 */
	ISecureSecSessionTableObj getSecSessionTable();

	/**
	 *	Get the ISecureSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ISecureSchemaObj schema cache which manages this instance.
	 */
	ISecureSchemaObj getSchema();

	/**
	 *	Set the ISecureSchemaObj schema cache which manages this instance.
	 *	Should only be used to install overloads of the buff implementation wired specifically to a transport implementation
	 *	that eventually hits a server running a JPA backend.
	 *
	 *	@param schema	ISecureSchemaObj schema cache which manages this instance.
	 */
	void setSchema(ISecureSchemaObj schema);

	/**
	 *	Get the ISecureSecSession instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ISecureSecSession instance which currently backs this object.
	 */
	ISecureSecSession getRec();

	/**
	 *	Internal use only.
	 */
	void setRec( ISecureSecSession value );

	/**
	 *	Get the ISecureSecSession instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ISecureSecSession instance which currently backs this object.
	 */
	ISecureSecSession getSecSessionRec();

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
	 *	Get the required ISecureSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ISecureSecUserObj instance referenced by the SecUser key.
	 */
	ISecureSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required ISecureSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ISecureSecUserObj instance referenced by the SecUser key.
	 */
	ISecureSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Get the required ISecureSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The required ISecureSecUserObj instance referenced by the SecProxy key.
	 */
	ISecureSecUserObj getRequiredParentSecProxy();

	/**
	 *	Get the required ISecureSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The required ISecureSecUserObj instance referenced by the SecProxy key.
	 */
	ISecureSecUserObj getRequiredParentSecProxy( boolean forceRead );

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
	 *	Get the optional ICFKeyHash256 attribute SecProxyId.
	 *
	 *	@return	The optional ICFKeyHash256 attribute SecProxyId.
	 */
	ICFKeyHash256 getOptionalSecProxyId();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToRec();

	/**
	 *	Internal use only.
	 */
	void copyRecToPKey();

}
