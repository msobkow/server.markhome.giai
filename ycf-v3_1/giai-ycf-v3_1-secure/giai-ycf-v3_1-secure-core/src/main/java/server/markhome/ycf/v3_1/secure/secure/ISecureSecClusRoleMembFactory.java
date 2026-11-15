
// Description: Java JPA Factory interface for SecClusRoleMemb.

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
 *	ISecureSecClusRoleMembFactory interface for SecClusRoleMemb
 */
public interface ISecureSecClusRoleMembFactory extends ISecureProtSecClusRoleMembFactory
{

	/**
	 *	Allocate a primary key for SecClusRoleMemb instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecClusRoleMembPKey newPKey();

	/**
	 *	Allocate a protected key for SecClusRoleMemb instances from a private key.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecClusRoleMembPKey asProtected(ISecureSecClusRoleMembPKey src);

	/**
	 *	Allocate a primary history key for SecClusRoleMemb instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureSecClusRoleMembHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for SecClusRoleMemb instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtSecClusRoleMembHPKey asProtected(ISecureSecClusRoleMembHPKey src);

	/**
	 *	Allocate a ClusRoleIdx key over SecClusRoleMemb instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecClusRoleMembByClusRoleIdxKey newByClusRoleIdxKey();

	/**
	 *	Allocate a protected ClusRoleIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecClusRoleMembByClusRoleIdxKey asProtected(ISecureSecClusRoleMembByClusRoleIdxKey src);

	/**
	 *	Allocate a LoginIdx key over SecClusRoleMemb instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecClusRoleMembByLoginIdxKey newByLoginIdxKey();

	/**
	 *	Allocate a protected LoginIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecClusRoleMembByLoginIdxKey asProtected(ISecureSecClusRoleMembByLoginIdxKey src);

	/**
	 *	Allocate a SecClusRoleMemb interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecClusRoleMemb newRec();

	/**
	 *	Allocate a protected SecClusRoleMemb interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecClusRoleMemb asProtected(ISecureSecClusRoleMemb src);

	/**
	 *	Allocate a SecClusRoleMemb history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureSecClusRoleMembH newHRec();

	/**
	 *	Allocate a protected SecClusRoleMemb history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtSecClusRoleMembH asProtected(ISecureSecClusRoleMembH src);

}
