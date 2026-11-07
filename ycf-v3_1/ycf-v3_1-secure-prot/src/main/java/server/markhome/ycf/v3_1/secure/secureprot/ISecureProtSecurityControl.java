// Description: Java 25 Protected Security Control Interface.

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

package server.markhome.ycf.v3_1.secure.secureprot;

import java.util.List;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

/*
 *	An ISecureSecurityControl is the protected security service control interface
 *	used by the system to tell registered caches what information to forget about, including
 *	users, permission groups, tenants, clusters, or the entire cache of information. Application logic
 *	should never invoke the control interface for any reason.  It is intended solely for use by the
 *	infrastructure to issue commands to security cache implementations that have registered for change
 *	and control propagation.
 */
public interface ISecureProtSecurityControl extends ISecureProtSecurityService {

	/**
	 *	Forget about the specified lists of objects.  Any null arguments are presumed to imply empty sets.
	 *	Caches keep concurrent hash maps of user login strings and user ids mapped to a common internal
	 *	userinfo object that maintains the caches for the user, one each for the system, the cluster, and
	 *	the tenant security probes. Each such cache is a map by permission name string.  For the system
	 *	cache, this map has Boolean data for the true/false state of the cached permission.  For the cluster
	 *	cache, this map has a sub-map of cluster ids which reference the Booleans.  Similarly, the tenant id
	 *	sub-maps reference Booleans.
	 *
	 *	The userinfo objects also track the last time the user's security information was queried, allowing for
	 *	a pruning scan to automatically expire stale, unused data should the user wander away from their sessions.
	 *
	 *	There is no "global" cache of default permissions applying to all users or anything like that, just per-user permission
	 *	caching.
	 *
	 *	@param userLogins List of user login id strings to forget about.
	 *	@param userIds List of user ids to forget about.
	 *	@param clusterIds List of cluster ids to forget about.
	 *	@param tenantIds List of tenant ids to forget about.
	 *	@param permissionNames List of permission name strings
	 */
	public void forgetAbout(List<String> userLogins,
		List<CFDbKeyHash256> userIds,
		List<CFDbKeyHash256> clusterIds,
		List<CFDbKeyHash256> tenantIds,
		List<String> permissionNames);

	/**
	 *	Forget about everything; reset the controlled cache.  Does not forget interest registrations.
	 */
	public void forgetAll();

}
