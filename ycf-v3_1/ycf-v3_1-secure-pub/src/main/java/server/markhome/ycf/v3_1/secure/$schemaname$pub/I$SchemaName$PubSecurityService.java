// Description: Java 25 Public Security Service Interface.

$MssSourceLicense$

package server.markhome.ycf.v3_1.secure.$schemaname$pub;

import server.markhome.cf.*;

/*
 *	An I$SchemaName$PubSecurityService is the public service interface used by
 *	normal applications to query the security server or a security server cache.
 */
public interface I$SchemaName$PubSecurityService {

	/**
	 *	Probe the SecRole*, SecTent* security tables, then the SecClus* security tables, and finally the SecSys* tables
	 *	in order until a probe authorizes the users access to the permission role or group. There is no need to invoke
	 *	isMemberOfClusterGroup() or isMemberOfSystemGroup() if you invoke this method.
	 *
	 *	@param userLogin The login id from the SecUser object for the user this query is for.
	 *	@param clusterId The cluster id of the cluster that contains the tenant being queried.
	 *	@param tenantId The tenant id being queried.
	 *	@param permissionName The name of the permission role or group being queried.
	 *
	 *	@return true if the user is a member of the tenant role or group, the equivalent cluster admin role or group, or the equivalent system admin role or group, otherwise false.
	 */
	public boolean isMemberOfTenantGroup(String userLogin, CFDbKeyHash256 clusterId, CFDbKeyHash256 tenantId, String permissionName);

	/**
	 *	Probe the SecRole*, SecTent* security tables, then the SecClus* security tables, and finally the SecSys* tables
	 *	in order until a probe authorizes the users access to the permission role or group. There is no need to invoke
	 *	isMemberOfClusterGroup() or isMemberOfSystemGroup() if you invoke this method.
	 *
	 *	@param userId The user id for the SecUser object this query is for.
	 *	@param clusterId The cluster id of the cluster that contains the tenant being queried.
	 *	@param tenantId The tenant id being queried.
	 *	@param permissionName The name of the permission role or group being queried.
	 *
	 *	@return true if the user is a member of the tenant role or group, the equivalent cluster admin role or group, or the equivalent system admin role or group, otherwise false.
	 */
	public boolean isMemberOfTenantGroup(CFDbKeyHash256 userId, CFDbKeyHash256 clusterId, CFDbKeyHash256 tenantId, String permissionName);

	/**
	 *	Probe the SecRole*, SecClus* security tables, and then the SecSys* tables until a probe authorizes the users access
	 *	to the permission role or group as a cluster or system admin. There is no need to invoke isMemberOfSystemGroup()
	 *	if you invoke this method.
	 *
	 *	@param userLogin The login id from the SecUser object for the user this query is for.
	 *	@param clusterId The cluster id being queried.
	 *	@param permissionName The name of the permission role or group being queried.
	 *
	 *	@return true if the user is a member of the cluster role or group or the equivalent system admin role or group, otherwise false.
	 */
	public boolean isMemberOfClusterGroup(String userLogin, CFDbKeyHash256 clusterId, String permissionName);

	/**
	 *	Probe the SecRole*, SecClus* security tables, and then the SecSys* tables until a probe authorizes the users access
	 *	to the permission role or group as a cluster or system admin. There is no need to invoke isMemberOfSystemGroup()
	 *	if you invoke this method.
	 *
	 *	@param userId The user id for the SecUser object this query is for.
	 *	@param clusterId The cluster id being queried.
	 *	@param permissionName The name of the permission role or group being queried.
	 *
	 *	@return true if the user is a member of the cluster role or group or the equivalent system admin role or group, otherwise false.
	 */
	public boolean isMemberOfClusterGroup(CFDbKeyHash256 userId, CFDbKeyHash256 clusterId, String permissionName);

	/**
	 *	Probe the SecRole*, SecSys* tables for authorization of the users access to the permission role or group as a system admin.
	 *
	 *	@param userLogin The login id from the SecUser object for the user this query is for
	 *	@param permissionName The name of the permission role or group being queried.
	 *
	 *	@return true if the user is a member of the specified system role or group, otherwise false.
	 */
	public boolean isMemberOfSystemGroup(String userLogin, String permissionName);

	/**
	 *	Probe the SecRole*, SecSys* tables for authorization of the users access to the permission role or group as a system admin.
	 *
	 *	@param userId The user id for the SecUser object this query is for.
	 *	@param permissionName The name of the permission role or group being queried.
	 *
	 *	@return true if the user is a member of the specified system role or group, otherwise false.
	 */
	public boolean isMemberOfSystemGroup(CFDbKeyHash256 userId, String permissionName);
}
