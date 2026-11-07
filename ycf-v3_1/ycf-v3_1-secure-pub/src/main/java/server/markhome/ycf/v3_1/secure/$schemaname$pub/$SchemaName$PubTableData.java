// Description: Java 25 Public $SchemaName$ TableData Implementation

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
import server.markhome.ycf.v3_1.secure.$schemaname$pubobj.I$SchemaName$PubClusterObj;
import server.markhome.ycf.v3_1.secure.$schemaname$pubobj.I$SchemaName$PubTenantObj;
import server.markhome.ycf.v3_1.secure.$schemaname$pubobj.I$SchemaName$PubSecSessionObj;

/*
 *	The $SchemaName$PubTableData objects are passed in to the $SchemaName$ schema implementation to be bound
 *	to the 
 */
public class $SchemaName$PubTableData implements Serializable
{
	protected final String schemaName;
	protected final String tableName;
	protected final String superName;
	protected final boolean history;
	protected final boolean mutable;
	protected final String scope;
	protected final String codeVis;

	public $SchemaName$PubTableData(String schemaName, String tableName, String superName, boolean history, boolean mutable, String scope, String codeVis) {
		this.schemaName = schemaName;
		this.tableName = tableName;
		this.superName = superName;
		this.history = history;
		this.mutable = mutable;
		this.scope = scope;
		this.codeVis = codeVis;
	}

	public String getTableName() {
		return tableName;
	}

	public String getSuperName() {
		return superName;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public boolean hasHistory() {
		return history;
	}

	public boolean isMutable() {
		return mutable;
	}

	public String getScope() {
		return scope;
	}

	public String getCodeVis() {
		return codeVis;
	}
}
