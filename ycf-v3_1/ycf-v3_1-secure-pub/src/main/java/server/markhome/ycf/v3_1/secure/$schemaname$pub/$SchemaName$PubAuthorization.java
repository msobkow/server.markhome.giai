// Description: Java 25 $SchemaName$ Public Authorization Implementation

$MssSourceLicense$

package server.markhome.ycf.v3_1.secure.$schemaname$pub;

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
 *	A $SchemaName$PubAuthorization is a public authorization ticket
 *	for the system providing services.  Most modern authorizations
 *	are based on OAuth2 tickets, but I haven't gotten there yet.
 */
public class $SchemaName$PubAuthorization implements I$SchemaName$PubAuthorization, Serializable
{
	protected ICFUuid6 authUuid6;
	protected String authUuid6Str;

	protected CFDbKeyHash256 secSessionId;
	protected CFDbKeyHash256 secUserId;
	protected CFDbKeyHash256 secClusterId;
	protected CFDbKeyHash256 secTenantId;

	public $DefSchemaName$PubAuthorization() {
		authUuid6 = CFUuid6.generateUuid6();
		authUuid6Str = authUuid6.toString();
		secSessionId = CFDbKeyHash256.nullGet();
		secUserId = CFDbKeyHash256.nullGet();
		secClusterId = CFDbKeyHash256.nullGet();
		secTenantId = CFDbKeyHash256.nullGet();
	}

	public $DefSchemaName$PubAuthorization(ICFUuid6 authUuid6, CFDbKeyHash256 secSessionId, CFDbKeyHash256 secUserId, CFDbKeyHash256 secClusterId, CFDbKeyHash256 secTenantId) {
		this.authUuid6 = authUuid6;
		this.authUuid6Str = this.authUuid6.toString();
		this.secSessionId = secSessionId;
		this.secUserId = secUserId;
		this.secClusterId = secClusterId;
		this.secTenantId = secTenantId;
	}

	public $DefSchemaName$PubAuthorization(I$DefSchemaName$PubAuthorization src) {
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
