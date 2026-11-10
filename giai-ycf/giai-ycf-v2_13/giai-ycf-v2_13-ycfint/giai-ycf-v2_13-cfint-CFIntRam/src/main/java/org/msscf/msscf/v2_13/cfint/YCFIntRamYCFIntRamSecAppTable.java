
// Description: Java 11 in-memory RAM DbIO implementation for SecApp.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;

/*
 *	YCFIntRamSecAppTable in-memory RAM DbIO implementation
 *	for SecApp.
 */
public class YCFIntRamSecAppTable
	implements IYCFIntSecAppTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecSecAppPKey,
				YCFSecSecAppBuff > dictByPKey
		= new HashMap< YCFSecSecAppPKey,
				YCFSecSecAppBuff >();
	private Map< YCFSecSecAppByClusterIdxKey,
				Map< YCFSecSecAppPKey,
					YCFSecSecAppBuff >> dictByClusterIdx
		= new HashMap< YCFSecSecAppByClusterIdxKey,
				Map< YCFSecSecAppPKey,
					YCFSecSecAppBuff >>();
	private Map< YCFSecSecAppByUJEEMountIdxKey,
			YCFSecSecAppBuff > dictByUJEEMountIdx
		= new HashMap< YCFSecSecAppByUJEEMountIdxKey,
			YCFSecSecAppBuff >();

	public YCFIntRamSecAppTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecApp( YCFSecAuthorization Authorization,
		YCFSecSecAppBuff Buff )
	{
		final String S_ProcName = "createSecApp";
		YCFSecSecAppPKey pkey = schema.getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecAppId( ((YCFIntRamClusterTable)schema.getTableCluster()).nextSecAppIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecAppId( pkey.getRequiredSecAppId() );
		YCFSecSecAppByClusterIdxKey keyClusterIdx = schema.getFactorySecApp().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecAppByUJEEMountIdxKey keyUJEEMountIdx = schema.getFactorySecApp().newUJEEMountIdxKey();
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

		Map< YCFSecSecAppPKey, YCFSecSecAppBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecSecAppPKey, YCFSecSecAppBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		dictByUJEEMountIdx.put( keyUJEEMountIdx, Buff );

	}

	public YCFSecSecAppBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecApp.readDerived";
		YCFSecSecAppPKey key = schema.getFactorySecApp().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecAppId( PKey.getRequiredSecAppId() );
		YCFSecSecAppBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecAppBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecApp.readDerived";
		YCFSecSecAppPKey key = schema.getFactorySecApp().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecAppId( PKey.getRequiredSecAppId() );
		YCFSecSecAppBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecAppBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamSecApp.readAllDerived";
		YCFSecSecAppBuff[] retList = new YCFSecSecAppBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSecAppBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSecAppBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamSecApp.readDerivedByClusterIdx";
		YCFSecSecAppByClusterIdxKey key = schema.getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecSecAppBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecSecAppPKey, YCFSecSecAppBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecSecAppBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecSecAppBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecAppPKey, YCFSecSecAppBuff > subdictClusterIdx
				= new HashMap< YCFSecSecAppPKey, YCFSecSecAppBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecSecAppBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecAppBuff readDerivedByUJEEMountIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String JEEMountName )
	{
		final String S_ProcName = "YCFIntRamSecApp.readDerivedByUJEEMountIdx";
		YCFSecSecAppByUJEEMountIdxKey key = schema.getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredJEEMountName( JEEMountName );

		YCFSecSecAppBuff buff;
		if( dictByUJEEMountIdx.containsKey( key ) ) {
			buff = dictByUJEEMountIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecAppBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFIntRamSecApp.readDerivedByIdIdx() ";
		YCFSecSecAppPKey key = schema.getFactorySecApp().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );

		YCFSecSecAppBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecAppBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecApp.readBuff";
		YCFSecSecAppBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a009" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecAppBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSecAppBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a009" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecAppBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamSecApp.readAllBuff";
		YCFSecSecAppBuff buff;
		ArrayList<YCFSecSecAppBuff> filteredList = new ArrayList<YCFSecSecAppBuff>();
		YCFSecSecAppBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a009" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecAppBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecApp buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecApp instances in the database accessible for the Authorization.
	 */
	public YCFSecSecAppBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Integer priorSecAppId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecSecAppBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFIntRamSecApp.readBuffByIdIdx() ";
		YCFSecSecAppBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecAppId );
		if( ( buff != null ) && buff.getClassCode().equals( "a009" ) ) {
			return( (YCFSecSecAppBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecAppBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamSecApp.readBuffByClusterIdx() ";
		YCFSecSecAppBuff buff;
		ArrayList<YCFSecSecAppBuff> filteredList = new ArrayList<YCFSecSecAppBuff>();
		YCFSecSecAppBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a009" ) ) {
				filteredList.add( (YCFSecSecAppBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecAppBuff[0] ) );
	}

	public YCFSecSecAppBuff readBuffByUJEEMountIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String JEEMountName )
	{
		final String S_ProcName = "YCFIntRamSecApp.readBuffByUJEEMountIdx() ";
		YCFSecSecAppBuff buff = readDerivedByUJEEMountIdx( Authorization,
			ClusterId,
			JEEMountName );
		if( ( buff != null ) && buff.getClassCode().equals( "a009" ) ) {
			return( (YCFSecSecAppBuff)buff );
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
	public YCFSecSecAppBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Integer priorSecAppId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecApp( YCFSecAuthorization Authorization,
		YCFSecSecAppBuff Buff )
	{
		YCFSecSecAppPKey pkey = schema.getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecAppId( Buff.getRequiredSecAppId() );
		YCFSecSecAppBuff existing = dictByPKey.get( pkey );
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
		YCFSecSecAppByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecApp().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecAppByClusterIdxKey newKeyClusterIdx = schema.getFactorySecApp().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecAppByUJEEMountIdxKey existingKeyUJEEMountIdx = schema.getFactorySecApp().newUJEEMountIdxKey();
		existingKeyUJEEMountIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUJEEMountIdx.setRequiredJEEMountName( existing.getRequiredJEEMountName() );

		YCFSecSecAppByUJEEMountIdxKey newKeyUJEEMountIdx = schema.getFactorySecApp().newUJEEMountIdxKey();
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

		Map< YCFSecSecAppPKey, YCFSecSecAppBuff > subdict;

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
			subdict = new HashMap< YCFSecSecAppPKey, YCFSecSecAppBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUJEEMountIdx.remove( existingKeyUJEEMountIdx );
		dictByUJEEMountIdx.put( newKeyUJEEMountIdx, Buff );

	}

	public void deleteSecApp( YCFSecAuthorization Authorization,
		YCFSecSecAppBuff Buff )
	{
		final String S_ProcName = "YCFIntRamSecAppTable.deleteSecApp() ";
		String classCode;
		YCFSecSecAppPKey pkey = schema.getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecAppId( Buff.getRequiredSecAppId() );
		YCFSecSecAppBuff existing = dictByPKey.get( pkey );
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
		YCFSecSecAppByClusterIdxKey keyClusterIdx = schema.getFactorySecApp().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecAppByUJEEMountIdxKey keyUJEEMountIdx = schema.getFactorySecApp().newUJEEMountIdxKey();
		keyUJEEMountIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUJEEMountIdx.setRequiredJEEMountName( existing.getRequiredJEEMountName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSecAppPKey, YCFSecSecAppBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		dictByUJEEMountIdx.remove( keyUJEEMountIdx );

	}
	public void deleteSecAppByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecAppId )
	{
		YCFSecSecAppPKey key = schema.getFactorySecApp().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecAppId( argSecAppId );
		deleteSecAppByIdIdx( Authorization, key );
	}

	public void deleteSecAppByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSecAppBuff cur;
		LinkedList<YCFSecSecAppBuff> matchSet = new LinkedList<YCFSecSecAppBuff>();
		Iterator<YCFSecSecAppBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecAppBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecApp().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecAppId() );
			deleteSecApp( Authorization, cur );
		}
	}

	public void deleteSecAppByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecSecAppByClusterIdxKey key = schema.getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecAppByClusterIdx( Authorization, key );
	}

	public void deleteSecAppByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSecAppByClusterIdxKey argKey )
	{
		YCFSecSecAppBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecAppBuff> matchSet = new LinkedList<YCFSecSecAppBuff>();
		Iterator<YCFSecSecAppBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecAppBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecApp().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecAppId() );
			deleteSecApp( Authorization, cur );
		}
	}

	public void deleteSecAppByUJEEMountIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		String argJEEMountName )
	{
		YCFSecSecAppByUJEEMountIdxKey key = schema.getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredJEEMountName( argJEEMountName );
		deleteSecAppByUJEEMountIdx( Authorization, key );
	}

	public void deleteSecAppByUJEEMountIdx( YCFSecAuthorization Authorization,
		YCFSecSecAppByUJEEMountIdxKey argKey )
	{
		YCFSecSecAppBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecAppBuff> matchSet = new LinkedList<YCFSecSecAppBuff>();
		Iterator<YCFSecSecAppBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecAppBuff> iterMatch = matchSet.iterator();
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
