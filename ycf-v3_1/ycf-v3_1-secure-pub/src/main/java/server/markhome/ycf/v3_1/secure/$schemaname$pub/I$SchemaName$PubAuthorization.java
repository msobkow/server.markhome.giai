// Description: Java 25 Public Authorization Interface.

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
 *	An I$SchemaName$PubAuthorization is an authorization ticket
 *	for the system providing services.
 */
public interface I$DefSchemaName$PubAuthorization
{
	public ICFUuid6 getAuthUuid6();
	public String getAuthUuid6Str();

	public CFDbKeyHash256 getSecSessionId();
	public CFDbKeyHash256 getSecUserId();
	public CFDbKeyHash256 getSecClusterId();
	public CFDbKeyHash256 getSecTenantId();
}
