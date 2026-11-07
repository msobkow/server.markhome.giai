// Description: Java 25 Public Authorization Callback Interface.

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
 *	An I$SchemaName$PubAuthorizationCallback is callback method hook for locating the currently applicable authorization object at runtime.
 */
public interface I$SchemaName$PubAuthorizationCallback
{
	/**
	 *	Get the currently effective public authorization to be used for processing on behalf of the user behind the scenes.
	 *
	 *	@return	The currently effective public authorization. May be null if there is no currently active user session, in which case some code uses a default system session or rejects the request.
	 */
	public I$SchemaName$PubAuthorization getEffectivePubAuthorization();
}
