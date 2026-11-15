// Description: Java 25 Public Instance Edit Object interface for Secure SecSession.

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
import org.apache.commons.text.StringEscapeUtils;

import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface ISecurePubSecSessionEditObj
	extends ISecurePubSecSessionObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecurePubSecSessionObj.
	 */
	ISecurePubSecSessionObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecurePubSecSessionObj.
	 */
	ISecurePubSecSessionObj getOrigAsSecSession();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecurePubSecSessionObj create();

	/*
	 *	Update the instance.
	 */
	ISecurePubSecSessionEditObj update();

	/*
	 *	Delete the instance.
	 */
	ISecurePubSecSessionEditObj deleteInstance();

	/**
	 *	Get the ISecurePubSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The ISecurePubSecUserObj instance referenced by the SecUser key.
	 */
	ISecurePubSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required ISecurePubSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ISecurePubSecUserObj instance referenced by the SecUser key.
	 */
	ISecurePubSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Set the ISecurePubSecUserObj instance referenced by the SecUser key.
	 *
	 *	@param	value	the ISecurePubSecUserObj instance to be referenced by the SecUser key.
	 */
	void setRequiredContainerSecUser( ISecurePubSecUserObj value );

	/**
	 *	Get the required CFDbKeyHash256 attribute SecSessionId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute SecSessionId.
	 */
	CFDbKeyHash256 getRequiredSecSessionId();

	/**
	 *	Set the required CFDbKeyHash256 attribute SecSessionId.
	 *
	 *	@param value The required CFDbKeyHash256 attribute SecSessionId value to be applied.
	 */
	void setRequiredSecSessionId(CFDbKeyHash256 value);

	/**
	 *	Get the required CFDbKeyHash256 attribute SecUserId.
	 *
	 *	@return	The required CFDbKeyHash256 attribute SecUserId.
	 */
	CFDbKeyHash256 getRequiredSecUserId();

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

	public void copyRecToOrig();
	public void copyOrigToRec();

}
