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

public interface IYCFGenKbRuleTypeTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new RuleType instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbRuleTypeObj newInstance();

	/**
	 *	Instantiate a new RuleType edition of the specified RuleType instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbRuleTypeEditObj newEditInstance( IYCFGenKbRuleTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbRuleTypeObj realiseRuleType( IYCFGenKbRuleTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbRuleTypeObj createRuleType( IYCFGenKbRuleTypeObj Obj );

	/**
	 *	Read a RuleType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RuleType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbRuleTypeObj readRuleType( YCFGenKbRuleTypePKey pkey );

	/**
	 *	Read a RuleType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RuleType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbRuleTypeObj readRuleType( YCFGenKbRuleTypePKey pkey,
		boolean forceRead );

	IYCFGenKbRuleTypeObj readCachedRuleType( YCFGenKbRuleTypePKey pkey );

	public void reallyDeepDisposeRuleType( IYCFGenKbRuleTypeObj obj );

	void deepDisposeRuleType( YCFGenKbRuleTypePKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbRuleTypeObj lockRuleType( YCFGenKbRuleTypePKey pkey );

	/**
	 *	Return a sorted list of all the RuleType-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbRuleTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbRuleTypeObj> readAllRuleType();

	/**
	 *	Return a sorted map of all the RuleType-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbRuleTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbRuleTypeObj> readAllRuleType( boolean forceRead );

	List<IYCFGenKbRuleTypeObj> readCachedAllRuleType();

	/**
	 *	Get the YCFGenKbRuleTypeObj instance for the primary key attributes.
	 *
	 *	@param	argId	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbRuleTypeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbRuleTypeObj readRuleTypeByIdIdx( short Id );

	/**
	 *	Get the YCFGenKbRuleTypeObj instance for the primary key attributes.
	 *
	 *	@param	argId	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbRuleTypeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbRuleTypeObj readRuleTypeByIdIdx( short Id,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbRuleTypeObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbRuleTypeObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbRuleTypeObj readRuleTypeByNameIdx(String Name );

	/**
	 *	Get the YCFGenKbRuleTypeObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbRuleTypeObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbRuleTypeObj readRuleTypeByNameIdx(String Name,
		boolean forceRead );

	IYCFGenKbRuleTypeObj readCachedRuleTypeByIdIdx( short Id );

	IYCFGenKbRuleTypeObj readCachedRuleTypeByNameIdx( String Name );

	void deepDisposeRuleTypeByIdIdx( short Id );

	void deepDisposeRuleTypeByNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbRuleTypeObj updateRuleType( IYCFGenKbRuleTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRuleType( IYCFGenKbRuleTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The RuleType key attribute of the instance generating the id.
	 */
	void deleteRuleTypeByIdIdx( short Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The RuleType key attribute of the instance generating the id.
	 */
	void deleteRuleTypeByNameIdx(String Name );
}
