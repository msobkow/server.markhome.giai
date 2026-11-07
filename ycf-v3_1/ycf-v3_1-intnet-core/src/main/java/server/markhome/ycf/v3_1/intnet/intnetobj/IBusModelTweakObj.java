// Description: Java 25 Object interface for BusModel Tweak.

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
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public interface IBusModelTweakObj
	extends ICFAnyObj
{
	/**
	 *	Initially, the class code for an object is IBusModelTweak.CLASS_CODE, but the Obj layer relies on class code translation to map those
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
	 *	Realise this instance of a Tweak.
	 *
	 *	@return	BusModelTweakObj instance which should be subsequently referenced.
	 */
	IBusModelTweakObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IBusModelTweakObj the reference to the cached or read (realised) instance.
	 */
	IBusModelTweakObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	IBusModelTweakObj the reference to the cached or read (realised) instance.
	 */
	IBusModelTweakObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Tweak instance.
	 *
	 *	@return	The newly locked IBusModelTweakEditObj edition of this instance.
	 */
	IBusModelTweakEditObj beginEdit();

	/**
	 *	End this edition of this Tweak instance.
	 *
	 *	@throws	CFNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Tweak instance.
	 *
	 *	@return	The IBusModelTweakEditObj edition of this instance.
	 */
	IBusModelTweakEditObj getEdit();

	/**
	 *	Get the current edition of this Tweak instance as a IBusModelTweakEditObj.
	 *
	 *	@return	The IBusModelTweakEditObj edition of this instance.
	 */
	IBusModelTweakEditObj getEditAsTweak();

	/**
	 *	Get the IBusModelTweakTableObj table cache which manages this instance.
	 *
	 *	@return	IBusModelTweakTableObj table cache which manages this instance.
	 */
	IBusModelTweakTableObj getTweakTable();

	/**
	 *	Get the IBusModelSchemaObj schema cache which manages this instance.
	 *
	 *	@return	IBusModelSchemaObj schema cache which manages this instance.
	 */
	IBusModelSchemaObj getSchema();

	/**
	 *	Set the IBusModelSchemaObj schema cache which manages this instance.
	 *	Should only be used to install overloads of the buff implementation wired specifically to a transport implementation
	 *	that eventually hits a server running a JPA backend.
	 *
	 *	@param schema	IBusModelSchemaObj schema cache which manages this instance.
	 */
	void setSchema(IBusModelSchemaObj schema);

	/**
	 *	Get the IBusModelTweak instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IBusModelTweak instance which currently backs this object.
	 */
	IBusModelTweak getRec();

	/**
	 *	Internal use only.
	 */
	void setRec( IBusModelTweak value );

	/**
	 *	Get the IBusModelTweak instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	IBusModelTweak instance which currently backs this object.
	 */
	IBusModelTweak getTweakRec();

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
	 *	Get the required IBusModelScopeObj instance referenced by the ScopeDef key.
	 *
	 *	@return	The required IBusModelScopeObj instance referenced by the ScopeDef key.
	 */
	IBusModelScopeObj getRequiredContainerScopeDef();

	/**
	 *	Get the required IBusModelScopeObj instance referenced by the ScopeDef key.
	 *
	 *	@return	The required IBusModelScopeObj instance referenced by the ScopeDef key.
	 */
	IBusModelScopeObj getRequiredContainerScopeDef( boolean forceRead );

	/**
	 *	Get the optional IBusModelSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional IBusModelSchemaDefObj instance referenced by the DefSchema key.
	 */
	IBusModelSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Get the optional IBusModelSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional IBusModelSchemaDefObj instance referenced by the DefSchema key.
	 */
	IBusModelSchemaDefObj getOptionalLookupDefSchema( boolean forceRead );

	/**
	 *	Get the required ICFKeyHash256 attribute TenantId.
	 *
	 *	@return	The required ICFKeyHash256 attribute TenantId.
	 */
	ICFKeyHash256 getRequiredTenantId();

	/**
	 *	Get the required ICFKeyHash256 attribute ScopeId.
	 *
	 *	@return	The required ICFKeyHash256 attribute ScopeId.
	 */
	ICFKeyHash256 getRequiredScopeId();

	/**
	 *	Get the required ICFKeyHash256 attribute Id.
	 *
	 *	@return	The required ICFKeyHash256 attribute Id.
	 */
	ICFKeyHash256 getRequiredId();

	/**
	 *	Get the optional ICFKeyHash256 attribute DefSchemaTenantId.
	 *
	 *	@return	The optional ICFKeyHash256 attribute DefSchemaTenantId.
	 */
	ICFKeyHash256 getOptionalDefSchemaTenantId();

	/**
	 *	Get the optional ICFKeyHash256 attribute DefSchemaId.
	 *
	 *	@return	The optional ICFKeyHash256 attribute DefSchemaId.
	 */
	ICFKeyHash256 getOptionalDefSchemaId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required boolean attribute ReplacesInherited.
	 *
	 *	@return	The required boolean attribute ReplacesInherited.
	 */
	boolean getRequiredReplacesInherited();

	/**
	 *	Get the required String attribute TweakGelText.
	 *
	 *	@return	The required String attribute TweakGelText.
	 */
	String getRequiredTweakGelText();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToRec();

	/**
	 *	Internal use only.
	 */
	void copyRecToPKey();

}
