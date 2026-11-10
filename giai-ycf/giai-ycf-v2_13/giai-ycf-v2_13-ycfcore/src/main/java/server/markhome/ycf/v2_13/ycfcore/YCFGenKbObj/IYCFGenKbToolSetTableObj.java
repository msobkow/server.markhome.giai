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

public interface IYCFGenKbToolSetTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ToolSet instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbToolSetObj newInstance();

	/**
	 *	Instantiate a new ToolSet edition of the specified ToolSet instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbToolSetEditObj newEditInstance( IYCFGenKbToolSetObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbToolSetObj realiseToolSet( IYCFGenKbToolSetObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbToolSetObj createToolSet( IYCFGenKbToolSetObj Obj );

	/**
	 *	Read a ToolSet-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ToolSet-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbToolSetObj readToolSet( YCFGenKbToolSetPKey pkey );

	/**
	 *	Read a ToolSet-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ToolSet-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbToolSetObj readToolSet( YCFGenKbToolSetPKey pkey,
		boolean forceRead );

	IYCFGenKbToolSetObj readCachedToolSet( YCFGenKbToolSetPKey pkey );

	public void reallyDeepDisposeToolSet( IYCFGenKbToolSetObj obj );

	void deepDisposeToolSet( YCFGenKbToolSetPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbToolSetObj lockToolSet( YCFGenKbToolSetPKey pkey );

	/**
	 *	Return a sorted list of all the ToolSet-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbToolSetObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbToolSetObj> readAllToolSet();

	/**
	 *	Return a sorted map of all the ToolSet-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbToolSetObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbToolSetObj> readAllToolSet( boolean forceRead );

	List<IYCFGenKbToolSetObj> readCachedAllToolSet();

	/**
	 *	Get the YCFGenKbToolSetObj instance for the primary key attributes.
	 *
	 *	@param	argId	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbToolSetObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbToolSetObj readToolSetByIdIdx( short Id );

	/**
	 *	Get the YCFGenKbToolSetObj instance for the primary key attributes.
	 *
	 *	@param	argId	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbToolSetObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbToolSetObj readToolSetByIdIdx( short Id,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbToolSetObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbToolSetObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbToolSetObj readToolSetByNameIdx(String Name );

	/**
	 *	Get the YCFGenKbToolSetObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbToolSetObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbToolSetObj readToolSetByNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool0Idx key.
	 *
	 *	@param	argToolId0	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool0Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool0Idx( short ToolId0 );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool0Idx key.
	 *
	 *	@param	argToolId0	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool0Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool0Idx( short ToolId0,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool1Idx key.
	 *
	 *	@param	argToolId1	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool1Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool1Idx( Short ToolId1 );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool1Idx key.
	 *
	 *	@param	argToolId1	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool1Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool1Idx( Short ToolId1,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool2Idx key.
	 *
	 *	@param	argToolId2	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool2Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool2Idx( Short ToolId2 );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool2Idx key.
	 *
	 *	@param	argToolId2	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool2Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool2Idx( Short ToolId2,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool3Idx key.
	 *
	 *	@param	argToolId3	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool3Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool3Idx( Short ToolId3 );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool3Idx key.
	 *
	 *	@param	argToolId3	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool3Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool3Idx( Short ToolId3,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool4Idx key.
	 *
	 *	@param	argToolId4	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool4Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool4Idx( Short ToolId4 );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool4Idx key.
	 *
	 *	@param	argToolId4	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool4Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool4Idx( Short ToolId4,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool5Idx key.
	 *
	 *	@param	argToolId5	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool5Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool5Idx( Short ToolId5 );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool5Idx key.
	 *
	 *	@param	argToolId5	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool5Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool5Idx( Short ToolId5,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool6Idx key.
	 *
	 *	@param	argToolId6	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool6Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool6Idx( Short ToolId6 );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool6Idx key.
	 *
	 *	@param	argToolId6	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool6Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool6Idx( Short ToolId6,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool7Idx key.
	 *
	 *	@param	argToolId7	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool7Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool7Idx( Short ToolId7 );

	/**
	 *	Get the map of YCFGenKbToolSetObj instances sorted by their primary keys for the duplicate Tool7Idx key.
	 *
	 *	@param	argToolId7	The ToolSet key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolSetObj cached instances sorted by their primary keys for the duplicate Tool7Idx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolSetObj> readToolSetByTool7Idx( Short ToolId7,
		boolean forceRead );

	IYCFGenKbToolSetObj readCachedToolSetByIdIdx( short Id );

	IYCFGenKbToolSetObj readCachedToolSetByNameIdx( String Name );

	List<IYCFGenKbToolSetObj> readCachedToolSetByTool0Idx( short ToolId0 );

	List<IYCFGenKbToolSetObj> readCachedToolSetByTool1Idx( Short ToolId1 );

	List<IYCFGenKbToolSetObj> readCachedToolSetByTool2Idx( Short ToolId2 );

	List<IYCFGenKbToolSetObj> readCachedToolSetByTool3Idx( Short ToolId3 );

	List<IYCFGenKbToolSetObj> readCachedToolSetByTool4Idx( Short ToolId4 );

	List<IYCFGenKbToolSetObj> readCachedToolSetByTool5Idx( Short ToolId5 );

	List<IYCFGenKbToolSetObj> readCachedToolSetByTool6Idx( Short ToolId6 );

	List<IYCFGenKbToolSetObj> readCachedToolSetByTool7Idx( Short ToolId7 );

	void deepDisposeToolSetByIdIdx( short Id );

	void deepDisposeToolSetByNameIdx( String Name );

	void deepDisposeToolSetByTool0Idx( short ToolId0 );

	void deepDisposeToolSetByTool1Idx( Short ToolId1 );

	void deepDisposeToolSetByTool2Idx( Short ToolId2 );

	void deepDisposeToolSetByTool3Idx( Short ToolId3 );

	void deepDisposeToolSetByTool4Idx( Short ToolId4 );

	void deepDisposeToolSetByTool5Idx( Short ToolId5 );

	void deepDisposeToolSetByTool6Idx( Short ToolId6 );

	void deepDisposeToolSetByTool7Idx( Short ToolId7 );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbToolSetObj updateToolSet( IYCFGenKbToolSetObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteToolSet( IYCFGenKbToolSetObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByIdIdx( short Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByNameIdx(String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolId0	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool0Idx( short ToolId0 );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolId1	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool1Idx( Short ToolId1 );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolId2	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool2Idx( Short ToolId2 );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolId3	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool3Idx( Short ToolId3 );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolId4	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool4Idx( Short ToolId4 );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolId5	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool5Idx( Short ToolId5 );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolId6	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool6Idx( Short ToolId6 );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolId7	The ToolSet key attribute of the instance generating the id.
	 */
	void deleteToolSetByTool7Idx( Short ToolId7 );
}
