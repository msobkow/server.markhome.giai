// Description: Java 25 Object interface for SecurePub ISOLang.

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

package server.markhome.ycf.v3_1.secure.securepubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface ISecurePubISOLangObj
	extends ICFAnyObj
{
	/**
	 *	Initially, the class code for an object is ISecurePubISOLang.CLASS_CODE, but the Obj layer relies on class code translation to map those
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
	 *	Realise this instance of a ISOLang.
	 *
	 *	@return	SecurePubISOLangObj instance which should be subsequently referenced.
	 */
	ISecurePubISOLangObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ISecurePubISOLangObj the reference to the cached or read (realised) instance.
	 */
	ISecurePubISOLangObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ISecurePubISOLangObj the reference to the cached or read (realised) instance.
	 */
	ISecurePubISOLangObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOLang instance.
	 *
	 *	@return	The newly locked ISecurePubISOLangEditObj edition of this instance.
	 */
	ISecurePubISOLangEditObj beginEdit();

	/**
	 *	End this edition of this ISOLang instance.
	 *
	 *	@throws	CFNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOLang instance.
	 *
	 *	@return	The ISecurePubISOLangEditObj edition of this instance.
	 */
	ISecurePubISOLangEditObj getEdit();

	/**
	 *	Get the current edition of this ISOLang instance as a ISecurePubISOLangEditObj.
	 *
	 *	@return	The ISecurePubISOLangEditObj edition of this instance.
	 */
	ISecurePubISOLangEditObj getEditAsISOLang();

	/**
	 *	Get the ISecurePubISOLangTableObj table cache which manages this instance.
	 *
	 *	@return	ISecurePubISOLangTableObj table cache which manages this instance.
	 */
	ISecurePubISOLangTableObj getISOLangTable();

	/**
	 *	Get the ISecurePubSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ISecurePubSchemaObj schema cache which manages this instance.
	 */
	ISecurePubSchemaObj getSchema();

	/**
	 *	Set the ISecurePubSchemaObj schema cache which manages this instance.
	 *	Should only be used to install overloads of the buff implementation wired specifically to a transport implementation
	 *	that eventually hits a server running a JPA backend.
	 *
	 *	@param schema	ISecurePubSchemaObj schema cache which manages this instance.
	 */
	void setSchema(ISecurePubSchemaObj schema);

	/**
	 *	Get the ISecurePubISOLang instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ISecurePubISOLang instance which currently backs this object.
	 */
	ISecurePubISOLang getRec();

	/**
	 *	Internal use only.
	 */
	void setRec( ISecurePubISOLang value );

	/**
	 *	Get the ISecurePubISOLang instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ISecurePubISOLang instance which currently backs this object.
	 */
	ISecurePubISOLang getISOLangRec();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	Short primary key for this instance.
	 */
	Short getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param Short primary key value for this instance.
	 */
	void setPKey( Short value );

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
	 *	Get the array of optional ISecurePubISOCtryLangObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional ISecurePubISOCtryLangObj[] array of instances referenced by the Ctry key.
	 */
	List<ISecurePubISOCtryLangObj> getOptionalChildrenCtry();

	/**
	 *	Get the array of optional ISecurePubISOCtryLangObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional ISecurePubISOCtryLangObj[] array of instances referenced by the Ctry key.
	 */
	List<ISecurePubISOCtryLangObj> getOptionalChildrenCtry( boolean forceRead );

	/**
	 *	Get the required short attribute ISOLangId.
	 *
	 *	@return	The required short attribute ISOLangId.
	 */
	short getRequiredISOLangId();

	/**
	 *	Get the required String attribute ISO6392Code.
	 *
	 *	@return	The required String attribute ISO6392Code.
	 */
	String getRequiredISO6392Code();

	/**
	 *	Get the optional String attribute ISO6391Code.
	 *
	 *	@return	The optional String attribute ISO6391Code.
	 */
	String getOptionalISO6391Code();

	/**
	 *	Get the required String attribute EnglishName.
	 *
	 *	@return	The required String attribute EnglishName.
	 */
	String getRequiredEnglishName();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToRec();

	/**
	 *	Internal use only.
	 */
	void copyRecToPKey();

}
