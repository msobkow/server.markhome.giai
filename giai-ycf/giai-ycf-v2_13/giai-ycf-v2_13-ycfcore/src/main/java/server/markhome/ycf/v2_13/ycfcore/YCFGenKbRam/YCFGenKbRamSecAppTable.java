
// Description: Java 11 in-memory RAM DbIO implementation for SecApp.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

/*
 *	YCFGenKbRamSecAppTable in-memory RAM DbIO implementation
 *	for SecApp.
 */
public class YCFGenKbRamSecAppTable
	implements IYCFGenKbSecAppTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSecAppPKey,
				YCFGenKbSecAppBuff > dictByPKey
		= new HashMap< YCFGenKbSecAppPKey,
				YCFGenKbSecAppBuff >();
	private Map< YCFGenKbSecAppByClusterIdxKey,
				Map< YCFGenKbSecAppPKey,
					YCFGenKbSecAppBuff >> dictByClusterIdx
		= new HashMap< YCFGenKbSecAppByClusterIdxKey,
				Map< YCFGenKbSecAppPKey,
					YCFGenKbSecAppBuff >>();
	private Map< YCFGenKbSecAppByUJEEMountIdxKey,
			YCFGenKbSecAppBuff > dictByUJEEMountIdx
		= new HashMap< YCFGenKbSecAppByUJEEMountIdxKey,
			YCFGenKbSecAppBuff >();

	public YCFGenKbRamSecAppTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecApp( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppBuff Buff )
	{
		final String S_ProcName = "createSecApp";
		YCFGenKbSecAppPKey pkey = schema.getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecAppId( ((YCFGenKbRamClusterTable)schema.getTableCluster()).nextSecAppIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecAppId( pkey.getRequiredSecAppId() );
		YCFGenKbSecAppByClusterIdxKey keyClusterIdx = schema.getFactorySecApp().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecAppByUJEEMountIdxKey keyUJEEMountIdx = schema.getFactorySecApp().newUJEEMountIdxKey();
		keyUJEEMountIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUJEEMountIdx.setRequiredJEEMountName( Buff.getRequiredJEEMountName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUJEEMountIdx.containsKey( keyUJEEMountIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecAppUJEEMountIdx",
				keyUJEEMountIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SecAppCluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbSecAppPKey, YCFGenKbSecAppBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFGenKbSecAppPKey, YCFGenKbSecAppBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		dictByUJEEMountIdx.put( keyUJEEMountIdx, Buff );

	}

	public YCFGenKbSecAppBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readDerived";
		YCFGenKbSecAppPKey key = schema.getFactorySecApp().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecAppId( PKey.getRequiredSecAppId() );
		YCFGenKbSecAppBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecAppBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readDerived";
		YCFGenKbSecAppPKey key = schema.getFactorySecApp().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecAppId( PKey.getRequiredSecAppId() );
		YCFGenKbSecAppBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecAppBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSecApp.readAllDerived";
		YCFGenKbSecAppBuff[] retList = new YCFGenKbSecAppBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSecAppBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSecAppBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readDerivedByClusterIdx";
		YCFGenKbSecAppByClusterIdxKey key = schema.getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFGenKbSecAppBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFGenKbSecAppPKey, YCFGenKbSecAppBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFGenKbSecAppBuff[ subdictClusterIdx.size() ];
			Iterator< YCFGenKbSecAppBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecAppPKey, YCFGenKbSecAppBuff > subdictClusterIdx
				= new HashMap< YCFGenKbSecAppPKey, YCFGenKbSecAppBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFGenKbSecAppBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecAppBuff readDerivedByUJEEMountIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String JEEMountName )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readDerivedByUJEEMountIdx";
		YCFGenKbSecAppByUJEEMountIdxKey key = schema.getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredJEEMountName( JEEMountName );

		YCFGenKbSecAppBuff buff;
		if( dictByUJEEMountIdx.containsKey( key ) ) {
			buff = dictByUJEEMountIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecAppBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readDerivedByIdIdx() ";
		YCFGenKbSecAppPKey key = schema.getFactorySecApp().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );

		YCFGenKbSecAppBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecAppBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readBuff";
		YCFGenKbSecAppBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a903" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecAppBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSecAppBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a903" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecAppBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readAllBuff";
		YCFGenKbSecAppBuff buff;
		ArrayList<YCFGenKbSecAppBuff> filteredList = new ArrayList<YCFGenKbSecAppBuff>();
		YCFGenKbSecAppBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a903" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecAppBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecApp buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecApp instances in the database accessible for the Authorization.
	 */
	public YCFGenKbSecAppBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorClusterId,
		Integer priorSecAppId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbSecAppBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readBuffByIdIdx() ";
		YCFGenKbSecAppBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecAppId );
		if( ( buff != null ) && buff.getClassCode().equals( "a903" ) ) {
			return( (YCFGenKbSecAppBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecAppBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readBuffByClusterIdx() ";
		YCFGenKbSecAppBuff buff;
		ArrayList<YCFGenKbSecAppBuff> filteredList = new ArrayList<YCFGenKbSecAppBuff>();
		YCFGenKbSecAppBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a903" ) ) {
				filteredList.add( (YCFGenKbSecAppBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecAppBuff[0] ) );
	}

	public YCFGenKbSecAppBuff readBuffByUJEEMountIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String JEEMountName )
	{
		final String S_ProcName = "YCFGenKbRamSecApp.readBuffByUJEEMountIdx() ";
		YCFGenKbSecAppBuff buff = readDerivedByUJEEMountIdx( Authorization,
			ClusterId,
			JEEMountName );
		if( ( buff != null ) && buff.getClassCode().equals( "a903" ) ) {
			return( (YCFGenKbSecAppBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SecApp buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecAppBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Integer priorSecAppId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecApp( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppBuff Buff )
	{
		YCFGenKbSecAppPKey pkey = schema.getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecAppId( Buff.getRequiredSecAppId() );
		YCFGenKbSecAppBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecApp",
				"Existing record not found",
				"SecApp",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecApp",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbSecAppByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecApp().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecAppByClusterIdxKey newKeyClusterIdx = schema.getFactorySecApp().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecAppByUJEEMountIdxKey existingKeyUJEEMountIdx = schema.getFactorySecApp().newUJEEMountIdxKey();
		existingKeyUJEEMountIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUJEEMountIdx.setRequiredJEEMountName( existing.getRequiredJEEMountName() );

		YCFGenKbSecAppByUJEEMountIdxKey newKeyUJEEMountIdx = schema.getFactorySecApp().newUJEEMountIdxKey();
		newKeyUJEEMountIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUJEEMountIdx.setRequiredJEEMountName( Buff.getRequiredJEEMountName() );

		// Check unique indexes

		if( ! existingKeyUJEEMountIdx.equals( newKeyUJEEMountIdx ) ) {
			if( dictByUJEEMountIdx.containsKey( newKeyUJEEMountIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecApp",
					"SecAppUJEEMountIdx",
					newKeyUJEEMountIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSecApp",
						"Container",
						"SecAppCluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbSecAppPKey, YCFGenKbSecAppBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByClusterIdx.get( existingKeyClusterIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClusterIdx.containsKey( newKeyClusterIdx ) ) {
			subdict = dictByClusterIdx.get( newKeyClusterIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSecAppPKey, YCFGenKbSecAppBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUJEEMountIdx.remove( existingKeyUJEEMountIdx );
		dictByUJEEMountIdx.put( newKeyUJEEMountIdx, Buff );

	}

	public void deleteSecApp( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSecAppTable.deleteSecApp() ";
		String classCode;
		YCFGenKbSecAppPKey pkey = schema.getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecAppId( Buff.getRequiredSecAppId() );
		YCFGenKbSecAppBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecApp",
				pkey );
		}
					schema.getTableSecForm().deleteSecFormBySecAppIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredSecAppId() );
		YCFGenKbSecAppByClusterIdxKey keyClusterIdx = schema.getFactorySecApp().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecAppByUJEEMountIdxKey keyUJEEMountIdx = schema.getFactorySecApp().newUJEEMountIdxKey();
		keyUJEEMountIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUJEEMountIdx.setRequiredJEEMountName( existing.getRequiredJEEMountName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSecAppPKey, YCFGenKbSecAppBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		dictByUJEEMountIdx.remove( keyUJEEMountIdx );

	}
	public void deleteSecAppByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecAppId )
	{
		YCFGenKbSecAppPKey key = schema.getFactorySecApp().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecAppId( argSecAppId );
		deleteSecAppByIdIdx( Authorization, key );
	}

	public void deleteSecAppByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSecAppBuff cur;
		LinkedList<YCFGenKbSecAppBuff> matchSet = new LinkedList<YCFGenKbSecAppBuff>();
		Iterator<YCFGenKbSecAppBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecAppBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecApp().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecAppId() );
			deleteSecApp( Authorization, cur );
		}
	}

	public void deleteSecAppByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId )
	{
		YCFGenKbSecAppByClusterIdxKey key = schema.getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecAppByClusterIdx( Authorization, key );
	}

	public void deleteSecAppByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppByClusterIdxKey argKey )
	{
		YCFGenKbSecAppBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecAppBuff> matchSet = new LinkedList<YCFGenKbSecAppBuff>();
		Iterator<YCFGenKbSecAppBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecAppBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecApp().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecAppId() );
			deleteSecApp( Authorization, cur );
		}
	}

	public void deleteSecAppByUJEEMountIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		String argJEEMountName )
	{
		YCFGenKbSecAppByUJEEMountIdxKey key = schema.getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredJEEMountName( argJEEMountName );
		deleteSecAppByUJEEMountIdx( Authorization, key );
	}

	public void deleteSecAppByUJEEMountIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppByUJEEMountIdxKey argKey )
	{
		YCFGenKbSecAppBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecAppBuff> matchSet = new LinkedList<YCFGenKbSecAppBuff>();
		Iterator<YCFGenKbSecAppBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecAppBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecApp().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecAppId() );
			deleteSecApp( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
