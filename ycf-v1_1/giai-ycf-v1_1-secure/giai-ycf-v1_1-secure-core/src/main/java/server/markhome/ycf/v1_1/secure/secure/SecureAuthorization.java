// Description: Java 25 Secure Private Authorization Implementation

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
import java.io.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.ycf.v3_1.secure.securepub.ISecurePubAuthorization;
import server.markhome.ycf.v3_1.secure.securepub.SecurePubAuthorization;
import server.markhome.ycf.v3_1.secure.secureprot.ISecureProtAuthorization;
import server.markhome.ycf.v3_1.secure.secureprot.SecureProtAuthorization;
import server.markhome.ycf.v3_1.secure.secureobj.ISecureClusterObj;
import server.markhome.ycf.v3_1.secure.secureobj.ISecureTenantObj;
import server.markhome.ycf.v3_1.secure.secureobj.ISecureSecSessionObj;
import server.markhome.ycf.v3_1.secure.secureobj.ISecureSecUserObj;

/*
 *	A SecureAuthorization is a private authorization ticket
 *	for the system providing services.  Most modern authorizations
 *	are based on OAuth2 tickets, but I haven't gotten there yet.
 */
public class SecureAuthorization extends SecureProtAuthorization implements ISecureAuthorization, Serializable
{
	public SecureAuthorization() {
		super();
	}

	public SecureAuthorization(ICFUuid6 authUuid6, CFDbKeyHash256 secSessionId, CFDbKeyHash256 secUserId, CFDbKeyHash256 secClusterId, CFDbKeyHash256 secTenantId) {
		super(authUuid6, secSessionId, secUserId, secClusterId, secTenantId);
	}

	public SecureAuthorization(ISecureAuthorization src) {
		super(src);
	}

	public SecureAuthorization(ISecureProtAuthorization src) {
		super(src);
	}

	public SecureAuthorization(ISecurePubAuthorization src) {
		super(src);
	}

	@Override
	public void setAuthUuid6( ICFUuid6 value ) {
		this.authUuid6 = new CFUuid6(value.getBytes());
		this.authUuid6Str = this.authUuid6.toString();
	}

	@Override
	public void setSecClusterId( CFDbKeyHash256 clusterId ) {
		this.secClusterId = new CFDbKeyHash256(clusterId);
	}

	@Override
	public void setSecCluster(ISecureClusterObj cluster) {
		if (cluster == null) {
			this.secClusterId = CFDbKeyHash256.nullGet();
		}
		else {
			this.secClusterId = cluster.getRequiredId();
		}
	}

	@Override
	public void setSecTenantId( CFDbKeyHash256 tenantId ) {
		this.secTenantId = new CFDbKeyHash256(tenantId);
	}

	@Override
	public void setSecTenant(ISecureTenantObj tenant) {
		if (tenant == null) {
			this.secTenantId = CFDbKeyHash256.nullGet();
		}
		else {
			this.secTenantId = new CFDbKeyHash256(tenant.getRequiredId());
		}
	}

	@Override
	public void setSecSessionId( CFDbKeyHash256 sessionId ) {
		this.secSessionId = new CFDbKeyHash256(sessionId);
	}

	@Override
	public void setSecSession(ISecureSecSessionObj session) {
		if (session == null) {
			this.secSessionId = CFDbKeyHash256.nullGet();
		}
		else {
			this.secSessionId = new CFDbKeyHash256(session.getRequiredSecSessionId());
		}
	}

	@Override
	public void setSecUserId( CFDbKeyHash256 userId ) {
		this.secUserId = new CFDbKeyHash256(userId);
	}

	@Override
	public void setSecUser(ISecureSecUserObj user) {
		if (user == null) {
			this.secUserId = CFDbKeyHash256.nullGet();
		}
		else {
			this.secUserId = new CFDbKeyHash256(user.getRequiredSecUserId());
		}
	}
}
