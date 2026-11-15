// Description: Java 25 Instance Edit Object interface for Secure ISOTZone.

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

public interface ISecureISOTZoneEditObj
	extends ISecureISOTZoneObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecureISOTZoneObj.
	 */
	ISecureISOTZoneObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecureISOTZoneObj.
	 */
	ISecureISOTZoneObj getOrigAsISOTZone();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecureISOTZoneObj create();

	/*
	 *	Update the instance.
	 */
	SecureISOTZoneEditObj update();

	/*
	 *	Delete the instance.
	 */
	SecureISOTZoneEditObj deleteInstance();

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
	 *	Get the required short attribute ISOTZoneId.
	 *
	 *	@return	The required short attribute ISOTZoneId.
	 */
	short getRequiredISOTZoneId();

	/**
	 *	Set the required short attribute ISOTZoneId.
	 *
	 *	@param value The required short attribute ISOTZoneId value to be applied.
	 */
	void setRequiredISOTZoneId(short value);

	/**
	 *	Get the required String attribute Iso8601.
	 *
	 *	@return	The required String attribute Iso8601.
	 */
	String getRequiredIso8601();

	/**
	 *	Set the required String attribute Iso8601.
	 *
	 *	@param value The required String attribute Iso8601 value to be applied.
	 */
	void setRequiredIso8601(String value);

	/**
	 *	Get the required String attribute TZName.
	 *
	 *	@return	The required String attribute TZName.
	 */
	String getRequiredTZName();

	/**
	 *	Set the required String attribute TZName.
	 *
	 *	@param value The required String attribute TZName value to be applied.
	 */
	void setRequiredTZName(String value);

	/**
	 *	Get the required short attribute TZHourOffset.
	 *
	 *	@return	The required short attribute TZHourOffset.
	 */
	short getRequiredTZHourOffset();

	/**
	 *	Set the required short attribute TZHourOffset.
	 *
	 *	@param value The required short attribute TZHourOffset value to be applied.
	 */
	void setRequiredTZHourOffset(short value);

	/**
	 *	Get the required short attribute TZMinOffset.
	 *
	 *	@return	The required short attribute TZMinOffset.
	 */
	short getRequiredTZMinOffset();

	/**
	 *	Set the required short attribute TZMinOffset.
	 *
	 *	@param value The required short attribute TZMinOffset value to be applied.
	 */
	void setRequiredTZMinOffset(short value);

	/**
	 *	Get the required String attribute Description.
	 *
	 *	@return	The required String attribute Description.
	 */
	String getRequiredDescription();

	/**
	 *	Set the required String attribute Description.
	 *
	 *	@param value The required String attribute Description value to be applied.
	 */
	void setRequiredDescription(String value);

	/**
	 *	Get the required boolean attribute Visible.
	 *
	 *	@return	The required boolean attribute Visible.
	 */
	boolean getRequiredVisible();

	/**
	 *	Set the required boolean attribute Visible.
	 *
	 *	@param value The required boolean attribute Visible value to be applied.
	 */
	void setRequiredVisible(boolean value);

	public void copyRecToOrig();
	public void copyOrigToRec();

}
