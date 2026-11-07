// Description: Java 25 Public Secure TableData Implementation

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
import server.markhome.ycf.v3_1.secure.securepubobj.ISecurePubClusterObj;
import server.markhome.ycf.v3_1.secure.securepubobj.ISecurePubTenantObj;
import server.markhome.ycf.v3_1.secure.securepubobj.ISecurePubSecSessionObj;

/*
 *	The SecurePubTableData objects are passed in to the Secure schema implementation to be bound
 *	to the 
 */
public class SecurePubTableData implements Serializable
{
	protected final String schemaName;
	protected final String tableName;
	protected final String superName;
	protected final boolean history;
	protected final boolean mutable;
	protected final String scope;
	protected final String codeVis;

	public SecurePubTableData(String schemaName, String tableName, String superName, boolean history, boolean mutable, String scope, String codeVis) {
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
