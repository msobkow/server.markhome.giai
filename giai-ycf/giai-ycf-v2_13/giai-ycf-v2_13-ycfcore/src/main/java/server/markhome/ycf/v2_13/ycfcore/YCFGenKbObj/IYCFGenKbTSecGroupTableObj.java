// Description: Java 11 Table Object interface for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbTSecGroupTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TSecGroup instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbTSecGroupObj newInstance();

	/**
	 *	Instantiate a new TSecGroup edition of the specified TSecGroup instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbTSecGroupEditObj newEditInstance( ICFGenKbTSecGroupObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbTSecGroupObj realiseTSecGroup( ICFGenKbTSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbTSecGroupObj createTSecGroup( ICFGenKbTSecGroupObj Obj );

	/**
	 *	Read a TSecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbTSecGroupObj readTSecGroup( CFGenKbTSecGroupPKey pkey );

	/**
	 *	Read a TSecGroup-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TSecGroup-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbTSecGroupObj readTSecGroup( CFGenKbTSecGroupPKey pkey,
		boolean forceRead );

	ICFGenKbTSecGroupObj readCachedTSecGroup( CFGenKbTSecGroupPKey pkey );

	public void reallyDeepDisposeTSecGroup( ICFGenKbTSecGroupObj obj );

	void deepDisposeTSecGroup( CFGenKbTSecGroupPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbTSecGroupObj lockTSecGroup( CFGenKbTSecGroupPKey pkey );

	/**
	 *	Return a sorted list of all the TSecGroup-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbTSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbTSecGroupObj> readAllTSecGroup();

	/**
	 *	Return a sorted map of all the TSecGroup-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbTSecGroupObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbTSecGroupObj> readAllTSecGroup( boolean forceRead );

	List<ICFGenKbTSecGroupObj> readCachedAllTSecGroup();

	/**
	 *	Get the CFGenKbTSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbTSecGroupObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	/**
	 *	Get the CFGenKbTSecGroupObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbTSecGroupObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbTSecGroupObj readTSecGroupByIdIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbTSecGroupObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbTSecGroupObj> readTSecGroupByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbTSecGroupObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbTSecGroupObj> readTSecGroupByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbTSecGroupObj instances sorted by their primary keys for the duplicate TenantVisIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	/**
	 *	Get the map of CFGenKbTSecGroupObj instances sorted by their primary keys for the duplicate TenantVisIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbTSecGroupObj cached instances sorted by their primary keys for the duplicate TenantVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbTSecGroupObj> readTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible,
		boolean forceRead );

	/**
	 *	Get the CFGenKbTSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbTSecGroupObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbTSecGroupObj readTSecGroupByUNameIdx(long TenantId,
		String Name );

	/**
	 *	Get the CFGenKbTSecGroupObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbTSecGroupObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbTSecGroupObj readTSecGroupByUNameIdx(long TenantId,
		String Name,
		boolean forceRead );

	ICFGenKbTSecGroupObj readCachedTSecGroupByIdIdx( long TenantId,
		int TSecGroupId );

	List<ICFGenKbTSecGroupObj> readCachedTSecGroupByTenantIdx( long TenantId );

	List<ICFGenKbTSecGroupObj> readCachedTSecGroupByTenantVisIdx( long TenantId,
		boolean IsVisible );

	ICFGenKbTSecGroupObj readCachedTSecGroupByUNameIdx( long TenantId,
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
	ICFGenKbTSecGroupObj updateTSecGroup( ICFGenKbTSecGroupObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTSecGroup( ICFGenKbTSecGroupObj Obj );

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
