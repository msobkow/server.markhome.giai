// Description: Java 25 Secure Public Authorization Implementation

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

package server.markhome.ycf.v3_1.secure.securepub;

import java.lang.reflect.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;

/*
 *	A SecurePubAuthorization is a public authorization ticket
 *	for the system providing services.  Most modern authorizations
 *	are based on OAuth2 tickets, but I haven't gotten there yet.
 */
public class SecurePubAuthorization implements ISecurePubAuthorization, Serializable
{
	protected ICFUuid6 authUuid6;
	protected String authUuid6Str;

	protected CFDbKeyHash256 secSessionId;
	protected CFDbKeyHash256 secUserId;
	protected CFDbKeyHash256 secClusterId;
	protected CFDbKeyHash256 secTenantId;

	public SecurePubAuthorization() {
		authUuid6 = CFUuid6.generateUuid6();
		authUuid6Str = authUuid6.toString();
		secSessionId = CFDbKeyHash256.nullGet();
		secUserId = CFDbKeyHash256.nullGet();
		secClusterId = CFDbKeyHash256.nullGet();
		secTenantId = CFDbKeyHash256.nullGet();
	}

	public SecurePubAuthorization(ICFUuid6 authUuid6, CFDbKeyHash256 secSessionId, CFDbKeyHash256 secUserId, CFDbKeyHash256 secClusterId, CFDbKeyHash256 secTenantId) {
		this.authUuid6 = authUuid6;
		this.authUuid6Str = this.authUuid6.toString();
		this.secSessionId = secSessionId;
		this.secUserId = secUserId;
		this.secClusterId = secClusterId;
		this.secTenantId = secTenantId;
	}

	public SecurePubAuthorization(ISecurePubAuthorization src) {
		authUuid6 = new CFUuid6(src.getAuthUuid6().getBytes());
		authUuid6Str = authUuid6.toString();
		secSessionId = new CFDbKeyHash256(src.getSecSessionId());
		secUserId = new CFDbKeyHash256(src.getSecUserId());
		secClusterId = new CFDbKeyHash256(src.getSecClusterId());
		secTenantId = new CFDbKeyHash256(src.getSecTenantId());
	}

	public ICFUuid6 getAuthUuid6() {
		return( authUuid6 );
	}

	public String getAuthUuid6Str() {
		return( authUuid6Str );
	}

	public CFDbKeyHash256 getSecSessionId() {
		return( secSessionId );
	}

	public CFDbKeyHash256 getSecUserId() {
		return( secUserId );
	}

	public CFDbKeyHash256 getSecClusterId() {
		return( secClusterId );
	}

	public CFDbKeyHash256 getSecTenantId() {
		return( secTenantId );
	}
}
