// Description: Java 25 Instance Edit Object interface for Secure SecUserPWHistory.

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

public interface ISecureSecUserPWHistoryEditObj
	extends ISecureSecUserPWHistoryObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecureSecUserPWHistoryObj.
	 */
	ISecureSecUserPWHistoryObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecureSecUserPWHistoryObj.
	 */
	ISecureSecUserPWHistoryObj getOrigAsSecUserPWHistory();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecureSecUserPWHistoryObj create();

	/*
	 *	Update the instance.
	 */
	SecureSecUserPWHistoryEditObj update();

	/*
	 *	Delete the instance.
	 */
	SecureSecUserPWHistoryEditObj deleteInstance();

	/**
	 *	Get the required ICFKeyHash256 attribute SecUserId.
	 *
	 *	@return	The required ICFKeyHash256 attribute SecUserId.
	 */
	ICFKeyHash256 getRequiredSecUserId();

	/**
	 *	Set the required ICFKeyHash256 attribute SecUserId.
	 *
	 *	@param value The required ICFKeyHash256 attribute SecUserId value to be applied.
	 */
	void setRequiredSecUserId(ICFKeyHash256 value);

	/**
	 *	Get the required LocalDateTime attribute PWSetStamp.
	 *
	 *	@return	The required LocalDateTime attribute PWSetStamp.
	 */
	LocalDateTime getRequiredPWSetStamp();

	/**
	 *	Set the required LocalDateTime attribute PWSetStamp.
	 *
	 *	@param value The required LocalDateTime attribute PWSetStamp value to be applied.
	 */
	void setRequiredPWSetStamp(LocalDateTime value);

	/**
	 *	Get the required LocalDateTime attribute PWReplacedStamp.
	 *
	 *	@return	The required LocalDateTime attribute PWReplacedStamp.
	 */
	LocalDateTime getRequiredPWReplacedStamp();

	/**
	 *	Set the required LocalDateTime attribute PWReplacedStamp.
	 *
	 *	@param value The required LocalDateTime attribute PWReplacedStamp value to be applied.
	 */
	void setRequiredPWReplacedStamp(LocalDateTime value);

	/**
	 *	Get the required String attribute PasswordHash.
	 *
	 *	@return	The required String attribute PasswordHash.
	 */
	String getRequiredPasswordHash();

	/**
	 *	Set the required String attribute PasswordHash.
	 *
	 *	@param value The required String attribute PasswordHash value to be applied.
	 */
	void setRequiredPasswordHash(String value);

	public void copyRecToOrig();
	public void copyOrigToRec();

}
