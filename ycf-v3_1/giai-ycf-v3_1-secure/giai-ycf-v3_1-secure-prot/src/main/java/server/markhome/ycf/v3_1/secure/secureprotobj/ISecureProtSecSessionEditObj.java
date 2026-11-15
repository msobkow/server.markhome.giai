// Description: Java 25 Protected Instance Edit Object interface for Secure SecSession.

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

public interface ISecureProtSecSessionEditObj
	extends ISecureProtSecSessionObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecureProtSecSessionObj.
	 */
	ISecureProtSecSessionObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecureProtSecSessionObj.
	 */
	ISecureProtSecSessionObj getOrigAsSecSession();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecureProtSecSessionObj create();

	/*
	 *	Update the instance.
	 */
	ISecureProtSecSessionEditObj update();

	/*
	 *	Delete the instance.
	 */
	ISecureProtSecSessionEditObj deleteInstance();

	/**
	 *	Get the ISecureProtSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The ISecureProtSecUserObj instance referenced by the SecUser key.
	 */
	ISecureProtSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required ISecureProtSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ISecureProtSecUserObj instance referenced by the SecUser key.
	 */
	ISecureProtSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Set the ISecureProtSecUserObj instance referenced by the SecUser key.
	 *
	 *	@param	value	the ISecureProtSecUserObj instance to be referenced by the SecUser key.
	 */
	void setRequiredContainerSecUser( ISecureProtSecUserObj value );

	/**
	 *	Get the ISecureProtSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The ISecureProtSecUserObj instance referenced by the SecProxy key.
	 */
	ISecureProtSecUserObj getRequiredParentSecProxy();

	/**
	 *	Get the required ISecureProtSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The required ISecureProtSecUserObj instance referenced by the SecProxy key.
	 */
	ISecureProtSecUserObj getRequiredParentSecProxy( boolean forceRead );

	/**
	 *	Set the ISecureProtSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@param	value	the ISecureProtSecUserObj instance to be referenced by the SecProxy key.
	 */
	void setRequiredParentSecProxy( ISecureProtSecUserObj value );

	/**
	 *	Get the required ICFKeyHash256 attribute SecSessionId.
	 *
	 *	@return	The required ICFKeyHash256 attribute SecSessionId.
	 */
	ICFKeyHash256 getRequiredSecSessionId();

	/**
	 *	Set the required ICFKeyHash256 attribute SecSessionId.
	 *
	 *	@param value The required ICFKeyHash256 attribute SecSessionId value to be applied.
	 */
	void setRequiredSecSessionId(ICFKeyHash256 value);

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
	 *	Set the required LocalDateTime attribute Start.
	 *
	 *	@param value The required LocalDateTime attribute Start value to be applied.
	 */
	void setRequiredStart(LocalDateTime value);

	/**
	 *	Get the optional LocalDateTime attribute Finish.
	 *
	 *	@return	The optional LocalDateTime attribute Finish.
	 */
	LocalDateTime getOptionalFinish();

	/**
	 *	Set the optional LocalDateTime attribute Finish.
	 *
	 *	@param value The optional LocalDateTime attribute Finish value to be applied.
	 */
	void setOptionalFinish(LocalDateTime value);

	/**
	 *	Get the optional CFDbKeyHash256 attribute SecProxyId.
	 *
	 *	@return	The optional CFDbKeyHash256 attribute SecProxyId.
	 */
	CFDbKeyHash256 getOptionalSecProxyId();

	public void copyRecToOrig();
	public void copyOrigToRec();

}
