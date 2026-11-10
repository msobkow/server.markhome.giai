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

public interface IYCFGenKbTSecGroupTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TSecGroup instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbTSecGroupObj newInstance();

	/**
	 *	Instantiate a new TSecGroup edition of the specified TSecGroup instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbTSecGroupEditObj newEditInstance( IYCFGenKbTSecGroupObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGroupObj realiseTSecGroup( IYCFGenKbTSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGroupObj createTSecGroup( IYCFGenKbTSecGroupObj Obj );

	/**
	 *	Read a TSecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbTSecGroupObj readTSecGroup( YCFGenKbTSecGroupPKey pkey );

	/**
	 *	Read a TSecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbTSecGroupObj readTSecGroup( YCFGenKbTSecGroupPKey pkey,
		boolean forceRead );

	IYCFGenKbTSecGroupObj readCachedTSecGroup( YCFGenKbTSecGroupPKey pkey );

	public void reallyDeepDisposeTSecGroup( IYCFGenKbTSecGroupObj obj );

	void deepDisposeTSecGroup( YCFGenKbTSecGroupPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGroupObj lockTSecGroup( YCFGenKbTSecGroupPKey pkey );

	/**
	 *	Return a sorted list of all the TSecGroup-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTSecGroupObj> readAllTSecGroup();

	/**
	 *	Return a sorted map of all the TSecGroup-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbTSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbTSecGroupObj> readAllTSecGroup( boolean forceRead );

	List<IYCFGenKbTSecGroupObj> readCachedAllTSecGroup();

	/**
	 *	Get the YCFGenKbTSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGroupObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Get the YCFGenKbTSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGroupObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbTSecGroupObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGroupObj> readTSecGroupByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbTSecGroupObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGroupObj> readTSecGroupByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbTSecGroupObj instances sorted by their primary keys for the duplicate TenantVisIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	/**
	 *	Get the map of YCFGenKbTSecGroupObj instances sorted by their primary keys for the duplicate TenantVisIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantVisIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible,
		boolean forceRead );

	/**
	 *	Get the YCFGenKbTSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGroupObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGroupObj readTSecGroupByUNameIdx(long TenantId,
		String Name );

	/**
	 *	Get the YCFGenKbTSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbTSecGroupObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbTSecGroupObj readTSecGroupByUNameIdx(long TenantId,
		String Name,
		boolean forceRead );

	IYCFGenKbTSecGroupObj readCachedTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	List<IYCFGenKbTSecGroupObj> readCachedTSecGroupByTenantIdx( long TenantId );

	List<IYCFGenKbTSecGroupObj> readCachedTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	IYCFGenKbTSecGroupObj readCachedTSecGroupByUNameIdx( long TenantId,
		String Name );

	void deepDisposeTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	void deepDisposeTSecGroupByTenantIdx( long TenantId );

	void deepDisposeTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	void deepDisposeTSecGroupByUNameIdx( long TenantId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbTSecGroupObj updateTSecGroup( IYCFGenKbTSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTSecGroup( IYCFGenKbTSecGroupObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByUNameIdx(long TenantId,
		String Name );
}
