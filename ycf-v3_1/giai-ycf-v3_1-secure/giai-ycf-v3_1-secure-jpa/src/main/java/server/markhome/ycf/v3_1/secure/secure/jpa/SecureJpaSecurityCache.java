// Description: Java 25 Secure JPA Security Cache Implementation

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

package server.markhome.ycf.v3_1.secure.secure.jpa;

import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.ycf.v3_1.secure.secure.*;

/*
 *	The SecureJpaSecurityCache is the implementation of a security cache specialized to access the JPA security
 *	tables their Repositories rather than through the secured Service implementations. Otherwise the cache would end
 *	up querying itself as to whether it is allowed to update itself.
 *
 *	In practice, there is only one instance of the JPA security cache running on the security server, and accessed
 *	remotely by the application servers. Only during initial development of the code base will the applications talk
 *	directly to this JPA implementation.
 */
public class SecureJpaSecurityCache extends SecureSecurityCache
{
	/**
	 *	Construct a JPA security cache instance.
	 *	There should only be one security cache instance in a service process, registered with the
	 *	ISecureSchema static methods accordingly so that all the code in process can find it.
	 */
	public SecureJpaSecurityCache() {
		super();
	}

	/***** Backend methods to be implemented by concrete subclass */

	/**
	 *	Map the userLogin string to a userId DbKey.
	 *
	 *	@param userLogin 
	 *	@return null if the userLogin does not exist, is null, is empty, or is blank. Otherwise the DbKey for the user.
	 */
	@Override
	public CFDbKeyHash256 mapUserLoginToUserId(String userLogin) {
		return(((SecureJpaSchema)(ISecureSchema.getBackingSecure())).getSchemaService().mapUserLoginToUserId(userLogin));
	}

	/**
	 *	Map the userId DbKey to the userLogin string.
	 *
	 *	@param userId
	 *	@return null if the userId does not exist or is null. Otherwise the userLogin for the user.
	 */
	@Override
	public String mapUserIdToUserLogin(CFDbKeyHash256 userId) {
		return(((SecureJpaSchema)(ISecureSchema.getBackingSecure())).getSchemaService().mapUserIdToUserLogin(userId));
	}

	/**
	 *	Probe the back-end SecRole*, SecTent* security tables, then the SecClus* security tables, and finally the SecSys* tables
	 *	in order until a probe authorizes the users access to the permission role or group.  The probed value is then "acquired" by
	 *	the cache and kept until it expires or is forgotten by the cache.
	 *
	 *	@param userId The user id for the SecUser object this query is for.
	 *	@param clusterId The cluster id of the cluster that contains the tenant being queried.
	 *	@param tenantId The tenant id being queried.
	 *	@param permissionName The name of the permission role or group being queried.
	 *
	 *	@return true if the user is a member of the tenant role or group, the equivalent cluster admin role or group, or the equivalent system admin role or group, otherwise false.
	 */
	@Override
	public boolean probeMemberOfTenantGroup(CFDbKeyHash256 userId, CFDbKeyHash256 clusterId, CFDbKeyHash256 tenantId, String permissionName) {
		return(((SecureJpaSchema)(ISecureSchema.getBackingSecure())).getSchemaService().probeMemberOfTenantGroup(userId, clusterId, tenantId, permissionName));
	}

	/**
	 *	Probe the back-end SecRole*, SecClus* security tables, and finally the SecSys* tables in order until a probe authorizes
	 *	the users access to the permission role or group.  The probed value is then "acquired" by the cache and kept until it
	 *	expires or is forgotten by the cache.
	 *
	 *	@param userId The user id for the SecUser object this query is for.
	 *	@param clusterId The cluster id of the cluster that contains the tenant being queried.
	 *	@param permissionName The name of the permission role or group being queried.
	 *
	 *	@return true if the user is a member of the tenant role or group, the equivalent cluster admin role or group, or the equivalent system admin role or group, otherwise false.
	 */
	@Override
	public boolean probeMemberOfClusterGroup(CFDbKeyHash256 userId, CFDbKeyHash256 clusterId, String permissionName) {
		return(((SecureJpaSchema)(ISecureSchema.getBackingSecure())).getSchemaService().probeMemberOfClusterGroup(userId, clusterId, permissionName));
	}

	/**
	 *	Probe the back-end SecRole*, and SecSys* tables until a probe authorizes the users access to the permission role or group.
	 *	The probed value is then "acquired" by the cache and kept until it expires or is forgotten by the cache.
	 *
	 *	@param userId The user id for the SecUser object this query is for.
	 *	@param permissionName The name of the permission role or group being queried.
	 *
	 *	@return true if the user is a member of the tenant role or group, the equivalent cluster admin role or group, or the equivalent system admin role or group, otherwise false.
	 */
	@Override
	public boolean probeMemberOfSystemGroup(CFDbKeyHash256 userId, String permissionName) {
		return(((SecureJpaSchema)(ISecureSchema.getBackingSecure())).getSchemaService().probeMemberOfSystemGroup(userId, permissionName));
	}
}
