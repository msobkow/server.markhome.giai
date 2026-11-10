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

public interface IYCFGenKbDefClassTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DefClass instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbDefClassObj newInstance();

	/**
	 *	Instantiate a new DefClass edition of the specified DefClass instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbDefClassEditObj newEditInstance( IYCFGenKbDefClassObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbDefClassObj realiseDefClass( IYCFGenKbDefClassObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbDefClassObj createDefClass( IYCFGenKbDefClassObj Obj );

	/**
	 *	Read a DefClass-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DefClass-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbDefClassObj readDefClass( YCFGenKbDefClassPKey pkey );

	/**
	 *	Read a DefClass-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DefClass-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbDefClassObj readDefClass( YCFGenKbDefClassPKey pkey,
		boolean forceRead );

	IYCFGenKbDefClassObj readCachedDefClass( YCFGenKbDefClassPKey pkey );

	public void reallyDeepDisposeDefClass( IYCFGenKbDefClassObj obj );

	void deepDisposeDefClass( YCFGenKbDefClassPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbDefClassObj lockDefClass( YCFGenKbDefClassPKey pkey );

	/**
	 *	Return a sorted list of all the DefClass-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbDefClassObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbDefClassObj> readAllDefClass();

	/**
	 *	Return a sorted map of all the DefClass-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbDefClassObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbDefClassObj> readAllDefClass( boolean forceRead );

	List<IYCFGenKbDefClassObj> readCachedAllDefClass();

	/**
	 *	Get the YCFGenKbDefClassObj instance for the primary key attributes.
	 *
	 *	@param	argId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbDefClassObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbDefClassObj readDefClassByIdIdx( short Id );

	/**
	 *	Get the YCFGenKbDefClassObj instance for the primary key attributes.
	 *
	 *	@param	argId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbDefClassObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbDefClassObj readDefClassByIdIdx( short Id,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbDefClassObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbDefClassObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbDefClassObj readDefClassByNameIdx(String Name );

	/**
	 *	Get the YCFGenKbDefClassObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbDefClassObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbDefClassObj readDefClassByNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbDefClassObj instances sorted by their primary keys for the duplicate BaseIdx key.
	 *
	 *	@param	argBaseId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbDefClassObj cached instances sorted by their primary keys for the duplicate BaseIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbDefClassObj> readDefClassByBaseIdx( Short BaseId );

	/**
	 *	Get the map of YCFGenKbDefClassObj instances sorted by their primary keys for the duplicate BaseIdx key.
	 *
	 *	@param	argBaseId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbDefClassObj cached instances sorted by their primary keys for the duplicate BaseIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbDefClassObj> readDefClassByBaseIdx( Short BaseId,
		boolean forceRead );

	IYCFGenKbDefClassObj readCachedDefClassByIdIdx( short Id );

	IYCFGenKbDefClassObj readCachedDefClassByNameIdx( String Name );

	List<IYCFGenKbDefClassObj> readCachedDefClassByBaseIdx( Short BaseId );

	void deepDisposeDefClassByIdIdx( short Id );

	void deepDisposeDefClassByNameIdx( String Name );

	void deepDisposeDefClassByBaseIdx( Short BaseId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbDefClassObj updateDefClass( IYCFGenKbDefClassObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDefClass( IYCFGenKbDefClassObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The DefClass key attribute of the instance generating the id.
	 */
	void deleteDefClassByIdIdx( short Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The DefClass key attribute of the instance generating the id.
	 */
	void deleteDefClassByNameIdx(String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argBaseId	The DefClass key attribute of the instance generating the id.
	 */
	void deleteDefClassByBaseIdx( Short BaseId );
}
