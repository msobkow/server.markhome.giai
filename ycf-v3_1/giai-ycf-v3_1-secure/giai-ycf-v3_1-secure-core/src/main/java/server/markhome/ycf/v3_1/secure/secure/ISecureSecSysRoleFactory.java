
// Description: Java JPA Factory interface for SecSysRole.

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

package server.markhome.ycf.v3_1.secure.secure;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	ISecureSecSysRoleFactory interface for SecSysRole
 */
public interface ISecureSecSysRoleFactory extends ISecureProtSecSysRoleFactory
{

	/**
	 *	Allocate a primary history key for SecSysRole instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureSecSysRoleHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for SecSysRole instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtSecSysRoleHPKey asProtected(ISecureSecSysRoleHPKey src);

	/**
	 *	Allocate a public primary history key for SecSysRole instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubSecSysRoleHPKey asPublic(ISecureSecSysRoleHPKey src);

	/**
	 *	Allocate a UNameIdx key over SecSysRole instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysRoleByUNameIdxKey newByUNameIdxKey();

	/**
	 *	Allocate a protected UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysRoleByUNameIdxKey asProtected(ISecureSecSysRoleByUNameIdxKey src);

	/**
	 *	Allocate a public UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSysRoleByUNameIdxKey asPublic(ISecureSecSysRoleByUNameIdxKey src);

	/**
	 *	Allocate a SecSysRole interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysRole newRec();

	/**
	 *	Allocate a protected SecSysRole interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysRole asProtected(ISecureSecSysRole src);

	/**
	 *	Allocate a public SecSysRole interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSysRole asPublic(ISecureSecSysRole src);

	/**
	 *	Allocate a SecSysRole history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysRoleH newHRec();

	/**
	 *	Allocate a protected SecSysRole history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysRoleH asProtected(ISecureSecSysRoleH src);

	/**
	 *	Allocate a public SecSysRole history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubSecSysRoleH asPublic(ISecureSecSysRoleH src);

}
