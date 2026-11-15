
// Description: Java JPA Factory interface for TableInfo.

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
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	ISecureTableInfoFactory interface for TableInfo
 */
public interface ISecureTableInfoFactory extends ISecureProtTableInfoFactory
{

	/**
	 *	Allocate a primary history key for TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	ISecureTableInfoHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for TableInfo instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecureProtTableInfoHPKey asProtected(ISecureTableInfoHPKey src);

	/**
	 *	Allocate a public primary history key for TableInfo instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ISecurePubTableInfoHPKey asPublic(ISecureTableInfoHPKey src);

	/**
	 *	Allocate a TableNameIdx key over TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureTableInfoByTableNameIdxKey newByTableNameIdxKey();

	/**
	 *	Allocate a protected TableNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoByTableNameIdxKey asProtected(ISecureTableInfoByTableNameIdxKey src);

	/**
	 *	Allocate a public TableNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoByTableNameIdxKey asPublic(ISecureTableInfoByTableNameIdxKey src);

	/**
	 *	Allocate a SuperNameIdx key over TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureTableInfoBySuperNameIdxKey newBySuperNameIdxKey();

	/**
	 *	Allocate a protected SuperNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoBySuperNameIdxKey asProtected(ISecureTableInfoBySuperNameIdxKey src);

	/**
	 *	Allocate a public SuperNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoBySuperNameIdxKey asPublic(ISecureTableInfoBySuperNameIdxKey src);

	/**
	 *	Allocate a SchemaNameIdx key over TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureTableInfoBySchemaNameIdxKey newBySchemaNameIdxKey();

	/**
	 *	Allocate a protected SchemaNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoBySchemaNameIdxKey asProtected(ISecureTableInfoBySchemaNameIdxKey src);

	/**
	 *	Allocate a public SchemaNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoBySchemaNameIdxKey asPublic(ISecureTableInfoBySchemaNameIdxKey src);

	/**
	 *	Allocate a SchemaBkCodeIdx key over TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureTableInfoBySchemaBkCodeIdxKey newBySchemaBkCodeIdxKey();

	/**
	 *	Allocate a protected SchemaBkCodeIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoBySchemaBkCodeIdxKey asProtected(ISecureTableInfoBySchemaBkCodeIdxKey src);

	/**
	 *	Allocate a public SchemaBkCodeIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoBySchemaBkCodeIdxKey asPublic(ISecureTableInfoBySchemaBkCodeIdxKey src);

	/**
	 *	Allocate a SchemaRTCodeIdx key over TableInfo instances.
	 *
	 *	@return	The new instance.
	 */
	public ISecureTableInfoBySchemaRTCodeIdxKey newBySchemaRTCodeIdxKey();

	/**
	 *	Allocate a protected SchemaRTCodeIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoBySchemaRTCodeIdxKey asProtected(ISecureTableInfoBySchemaRTCodeIdxKey src);

	/**
	 *	Allocate a public SchemaRTCodeIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoBySchemaRTCodeIdxKey asPublic(ISecureTableInfoBySchemaRTCodeIdxKey src);

	/**
	 *	Allocate a TableInfo interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureTableInfo newRec();

	/**
	 *	Allocate a protected TableInfo interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfo asProtected(ISecureTableInfo src);

	/**
	 *	Allocate a public TableInfo interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfo asPublic(ISecureTableInfo src);

	/**
	 *	Allocate a TableInfo history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ISecureTableInfoH newHRec();

	/**
	 *	Allocate a protected TableInfo history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecureProtTableInfoH asProtected(ISecureTableInfoH src);

	/**
	 *	Allocate a public TableInfo history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ISecurePubTableInfoH asPublic(ISecureTableInfoH src);

}
