
// Description: Java 11 DbIO interface for GelSwitchLimb.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

/*
 *	YCFGenKbGelSwitchLimbTable database interface for GelSwitchLimb
 */
public interface IYCFGenKbGelSwitchLimbTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createGelSwitchLimb( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateGelSwitchLimb( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteGelSwitchLimb( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbBuff Buff );
	/**
	 *	Delete the GelSwitchLimb instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argLimbName	The GelSwitchLimb key attribute of the instance generating the id.
	 */
	void deleteGelSwitchLimbByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId,
		String argLimbName );

	/**
	 *	Delete the GelSwitchLimb instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteGelSwitchLimbByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey argKey );
	/**
	 *	Delete the GelSwitchLimb instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 */
	void deleteGelSwitchLimbByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the GelSwitchLimb instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelSwitchLimbByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbByTenantIdxKey argKey );
	/**
	 *	Delete the GelSwitchLimb instances identified by the key SwitchIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 */
	void deleteGelSwitchLimbBySwitchIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId );

	/**
	 *	Delete the GelSwitchLimb instances identified by the key SwitchIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelSwitchLimbBySwitchIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbBySwitchIdxKey argKey );


	/**
	 *	Read the derived GelSwitchLimb buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelSwitchLimb instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelSwitchLimbBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey PKey );

	/**
	 *	Lock the derived GelSwitchLimb buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelSwitchLimb instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelSwitchLimbBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey PKey );

	/**
	 *	Read all GelSwitchLimb instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbGelSwitchLimbBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived GelSwitchLimb buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argLimbName	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelSwitchLimbBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName );

	/**
	 *	Read an array of the derived GelSwitchLimb buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelSwitchLimbBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived GelSwitchLimb buffer instances identified by the duplicate key SwitchIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelSwitchLimbBuff[] readDerivedBySwitchIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Read the specific GelSwitchLimb buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelSwitchLimb instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelSwitchLimbBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey PKey );

	/**
	 *	Lock the specific GelSwitchLimb buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelSwitchLimb instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelSwitchLimbBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey PKey );

	/**
	 *	Read all the specific GelSwitchLimb buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific GelSwitchLimb instances in the database accessible for the Authorization.
	 */
	YCFGenKbGelSwitchLimbBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific GelSwitchLimb buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argLimbName	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelSwitchLimbBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName );

	/**
	 *	Read an array of the specific GelSwitchLimb buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelSwitchLimbBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific GelSwitchLimb buffer instances identified by the duplicate key SwitchIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitchLimb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelSwitchLimbBuff[] readBuffBySwitchIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
