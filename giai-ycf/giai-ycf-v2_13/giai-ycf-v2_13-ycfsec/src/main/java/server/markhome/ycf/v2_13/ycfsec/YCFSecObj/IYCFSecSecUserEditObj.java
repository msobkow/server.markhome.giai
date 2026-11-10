// Description: Java 11 Instance Edit Object interface for YCFSec SecUser.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public interface IYCFSecSecUserEditObj
	extends IYCFSecSecUserObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFSecSecUserObj.
	 */
	IYCFSecSecUserObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFSecSecUserObj.
	 */
	IYCFSecSecUserObj getOrigAsSecUser();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFSecSecUserObj create();

	/*
	 *	Update the instance.
	 */
	YCFSecSecUserEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFSecSecUserEditObj deleteInstance();

	/**
	 *	Get the required String attribute LoginId.
	 *
	 *	@return	The String value of the attribute LoginId.
	 */
	String getRequiredLoginId();

	/**
	 *	Set the required String attribute LoginId.
	 *
	 *	@param	value	the String value of the attribute LoginId.
	 */
	void setRequiredLoginId( String value );

	/**
	 *	Get the required String attribute EMailAddress.
	 *
	 *	@return	The String value of the attribute EMailAddress.
	 */
	String getRequiredEMailAddress();

	/**
	 *	Set the required String attribute EMailAddress.
	 *
	 *	@param	value	the String value of the attribute EMailAddress.
	 */
	void setRequiredEMailAddress( String value );

	/**
	 *	Get the optional UUID attribute EMailConfirmUuid.
	 *
	 *	@return	The UUID value of the attribute EMailConfirmUuid.
	 */
	UUID getOptionalEMailConfirmUuid();

	/**
	 *	Set the optional UUID attribute EMailConfirmUuid.
	 *
	 *	@param	value	the UUID value of the attribute EMailConfirmUuid.
	 */
	void setOptionalEMailConfirmUuid( UUID value );

	/**
	 *	Get the required String attribute PasswordHash.
	 *
	 *	@return	The String value of the attribute PasswordHash.
	 */
	String getRequiredPasswordHash();

	/**
	 *	Set the required String attribute PasswordHash.
	 *
	 *	@param	value	the String value of the attribute PasswordHash.
	 */
	void setRequiredPasswordHash( String value );

	/**
	 *	Get the optional UUID attribute PasswordResetUuid.
	 *
	 *	@return	The UUID value of the attribute PasswordResetUuid.
	 */
	UUID getOptionalPasswordResetUuid();

	/**
	 *	Set the optional UUID attribute PasswordResetUuid.
	 *
	 *	@param	value	the UUID value of the attribute PasswordResetUuid.
	 */
	void setOptionalPasswordResetUuid( UUID value );

	/**
	 *	Get the IYCFSecSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The IYCFSecSecDeviceObj instance referenced by the DefDev key.
	 */
	IYCFSecSecDeviceObj getOptionalLookupDefDev();

	/**
	 *	Set the IYCFSecSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@param	value	the IYCFSecSecDeviceObj instance to be referenced by the DefDev key.
	 */
	void setOptionalLookupDefDev( IYCFSecSecDeviceObj value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The IYCFSecSecUserObj instance who created this instance.
	 */
	void setCreatedBy( IYCFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The IYCFSecSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( IYCFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
