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

public interface IYCFGenKbToolTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Tool instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbToolObj newInstance();

	/**
	 *	Instantiate a new Tool edition of the specified Tool instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbToolEditObj newEditInstance( IYCFGenKbToolObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbToolObj realiseTool( IYCFGenKbToolObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbToolObj createTool( IYCFGenKbToolObj Obj );

	/**
	 *	Read a Tool-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tool-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbToolObj readTool( YCFGenKbToolPKey pkey );

	/**
	 *	Read a Tool-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tool-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbToolObj readTool( YCFGenKbToolPKey pkey,
		boolean forceRead );

	IYCFGenKbToolObj readCachedTool( YCFGenKbToolPKey pkey );

	public void reallyDeepDisposeTool( IYCFGenKbToolObj obj );

	void deepDisposeTool( YCFGenKbToolPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbToolObj lockTool( YCFGenKbToolPKey pkey );

	/**
	 *	Return a sorted list of all the Tool-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbToolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbToolObj> readAllTool();

	/**
	 *	Return a sorted map of all the Tool-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbToolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbToolObj> readAllTool( boolean forceRead );

	List<IYCFGenKbToolObj> readCachedAllTool();

	/**
	 *	Get the YCFGenKbToolObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbToolObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbToolObj readToolByIdIdx( short Id );

	/**
	 *	Get the YCFGenKbToolObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbToolObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbToolObj readToolByIdIdx( short Id,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbToolObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbToolObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbToolObj readToolByNameIdx(String Name );

	/**
	 *	Get the YCFGenKbToolObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbToolObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbToolObj readToolByNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbToolObj instances sorted by their primary keys for the duplicate ReplacesIdx key.
	 *
	 *	@param	argReplacesId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolObj cached instances sorted by their primary keys for the duplicate ReplacesIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolObj> readToolByReplacesIdx( Short ReplacesId );

	/**
	 *	Get the map of YCFGenKbToolObj instances sorted by their primary keys for the duplicate ReplacesIdx key.
	 *
	 *	@param	argReplacesId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbToolObj cached instances sorted by their primary keys for the duplicate ReplacesIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbToolObj> readToolByReplacesIdx( Short ReplacesId,
		boolean forceRead );

	IYCFGenKbToolObj readCachedToolByIdIdx( short Id );

	IYCFGenKbToolObj readCachedToolByNameIdx( String Name );

	List<IYCFGenKbToolObj> readCachedToolByReplacesIdx( Short ReplacesId );

	void deepDisposeToolByIdIdx( short Id );

	void deepDisposeToolByNameIdx( String Name );

	void deepDisposeToolByReplacesIdx( Short ReplacesId );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbToolObj updateTool( IYCFGenKbToolObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTool( IYCFGenKbToolObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The Tool key attribute of the instance generating the id.
	 */
	void deleteToolByIdIdx( short Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The Tool key attribute of the instance generating the id.
	 */
	void deleteToolByNameIdx(String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argReplacesId	The Tool key attribute of the instance generating the id.
	 */
	void deleteToolByReplacesIdx( Short ReplacesId );
}
