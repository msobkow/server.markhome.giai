// Description: Java 11 Table Object interface for YCFGenKb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public interface IYCFGenKbRuleCartTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new RuleCart instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbRuleCartObj newInstance();

	/**
	 *	Instantiate a new RuleCart edition of the specified RuleCart instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbRuleCartEditObj newEditInstance( IYCFGenKbRuleCartObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbRuleCartObj realiseRuleCart( IYCFGenKbRuleCartObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbRuleCartObj createRuleCart( IYCFGenKbRuleCartObj Obj );

	/**
	 *	Read a RuleCart-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RuleCart-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbRuleCartObj readRuleCart( YCFGenKbRuleCartPKey pkey );

	/**
	 *	Read a RuleCart-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RuleCart-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbRuleCartObj readRuleCart( YCFGenKbRuleCartPKey pkey,
		boolean forceRead );

	IYCFGenKbRuleCartObj readCachedRuleCart( YCFGenKbRuleCartPKey pkey );

	public void reallyDeepDisposeRuleCart( IYCFGenKbRuleCartObj obj );

	void deepDisposeRuleCart( YCFGenKbRuleCartPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbRuleCartObj lockRuleCart( YCFGenKbRuleCartPKey pkey );

	/**
	 *	Return a sorted list of all the RuleCart-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbRuleCartObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbRuleCartObj> readAllRuleCart();

	/**
	 *	Return a sorted map of all the RuleCart-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbRuleCartObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbRuleCartObj> readAllRuleCart( boolean forceRead );

	List<IYCFGenKbRuleCartObj> readCachedAllRuleCart();

	/**
	 *	Get the YCFGenKbRuleCartObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbRuleCartObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbRuleCartObj readRuleCartByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the YCFGenKbRuleCartObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbRuleCartObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbRuleCartObj readRuleCartByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbRuleCartObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbRuleCartObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbRuleCartObj> readRuleCartByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbRuleCartObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbRuleCartObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbRuleCartObj> readRuleCartByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbRuleCartObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbRuleCartObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbRuleCartObj readRuleCartByNameIdx(long TenantId,
		String Name );

	/**
	 *	Get the YCFGenKbRuleCartObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbRuleCartObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbRuleCartObj readRuleCartByNameIdx(long TenantId,
		String Name,
		boolean forceRead );

	IYCFGenKbRuleCartObj readCachedRuleCartByIdIdx( long TenantId,
		long Id );

	List<IYCFGenKbRuleCartObj> readCachedRuleCartByTenantIdx( long TenantId );

	IYCFGenKbRuleCartObj readCachedRuleCartByNameIdx( long TenantId,
		String Name );

	void deepDisposeRuleCartByIdIdx( long TenantId,
		long Id );

	void deepDisposeRuleCartByTenantIdx( long TenantId );

	void deepDisposeRuleCartByNameIdx( long TenantId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbRuleCartObj updateRuleCart( IYCFGenKbRuleCartObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRuleCart( IYCFGenKbRuleCartObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByNameIdx(long TenantId,
		String Name );
}
