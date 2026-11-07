
// Description: Java Protected Factory interface for TableInfo.

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

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	ISecureProtTableInfoFactory protected interface for TableInfo
 */
public interface ISecureProtTableInfoFactory extends ISecurePubTableInfoFactory
{

	/**
	 *	Allocate a protected primary history key for TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtTableInfoHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for TableInfo instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubTableInfoHPKey asPublic(ISecureProtTableInfoHPKey src);

	/**
	 *	Allocate a protected TableNameIdx key over protected TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoByTableNameIdxKey newProtByTableNameIdxKey();

	/**
	 *	Allocate a public TableNameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoByTableNameIdxKey asPublic(ISecureProtTableInfoByTableNameIdxKey src);

	/**
	 *	Allocate a protected SuperNameIdx key over protected TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoBySuperNameIdxKey newProtBySuperNameIdxKey();

	/**
	 *	Allocate a public SuperNameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoBySuperNameIdxKey asPublic(ISecureProtTableInfoBySuperNameIdxKey src);

	/**
	 *	Allocate a protected SchemaNameIdx key over protected TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoBySchemaNameIdxKey newProtBySchemaNameIdxKey();

	/**
	 *	Allocate a public SchemaNameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoBySchemaNameIdxKey asPublic(ISecureProtTableInfoBySchemaNameIdxKey src);

	/**
	 *	Allocate a protected SchemaBkCodeIdx key over protected TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoBySchemaBkCodeIdxKey newProtBySchemaBkCodeIdxKey();

	/**
	 *	Allocate a public SchemaBkCodeIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoBySchemaBkCodeIdxKey asPublic(ISecureProtTableInfoBySchemaBkCodeIdxKey src);

	/**
	 *	Allocate a protected SchemaRTCodeIdx key over protected TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoBySchemaRTCodeIdxKey newProtBySchemaRTCodeIdxKey();

	/**
	 *	Allocate a public SchemaRTCodeIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoBySchemaRTCodeIdxKey asPublic(ISecureProtTableInfoBySchemaRTCodeIdxKey src);

	/**
	 *	Allocate a protected TableInfo interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfo newProtRec();

	/**
	 *	Allocate a public TableInfo interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfo asPublic(ISecureProtTableInfo src);

	/**
	 *	Allocate a protected TableInfo history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoH newProtHRec();

	/**
	 *	Allocate a public TableInfo history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoH asPublic(ISecureProtTableInfoH src);

}
