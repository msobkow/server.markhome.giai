
// Description: Java JPA Factory interface for SecSysRoleEnables.

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
 *	ISecureSecSysRoleEnablesFactory interface for SecSysRoleEnables
 */
public interface ISecureSecSysRoleEnablesFactory extends ISecureProtSecSysRoleEnablesFactory
{

	/**
	 *	Allocate a primary key for SecSysRoleEnables instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysRoleEnablesPKey newPKey();

	/**
	 *	Allocate a protected key for SecSysRoleEnables instances from a private key.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysRoleEnablesPKey asProtected(ISecureSecSysRoleEnablesPKey src);

	/**
	 *	Allocate a primary history key for SecSysRoleEnables instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureSecSysRoleEnablesHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for SecSysRoleEnables instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtSecSysRoleEnablesHPKey asProtected(ISecureSecSysRoleEnablesHPKey src);

	/**
	 *	Allocate a SysRoleIdx key over SecSysRoleEnables instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysRoleEnablesBySysRoleIdxKey newBySysRoleIdxKey();

	/**
	 *	Allocate a protected SysRoleIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysRoleEnablesBySysRoleIdxKey asProtected(ISecureSecSysRoleEnablesBySysRoleIdxKey src);

	/**
	 *	Allocate a NameIdx key over SecSysRoleEnables instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysRoleEnablesByNameIdxKey newByNameIdxKey();

	/**
	 *	Allocate a protected NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysRoleEnablesByNameIdxKey asProtected(ISecureSecSysRoleEnablesByNameIdxKey src);

	/**
	 *	Allocate a SecSysRoleEnables interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysRoleEnables newRec();

	/**
	 *	Allocate a protected SecSysRoleEnables interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysRoleEnables asProtected(ISecureSecSysRoleEnables src);

	/**
	 *	Allocate a SecSysRoleEnables history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecSysRoleEnablesH newHRec();

	/**
	 *	Allocate a protected SecSysRoleEnables history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecSysRoleEnablesH asProtected(ISecureSecSysRoleEnablesH src);

}
