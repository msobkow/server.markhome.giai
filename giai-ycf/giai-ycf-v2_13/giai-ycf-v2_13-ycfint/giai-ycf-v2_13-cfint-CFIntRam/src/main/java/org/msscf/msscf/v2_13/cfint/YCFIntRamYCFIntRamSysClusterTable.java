
// Description: Java 11 in-memory RAM DbIO implementation for SysCluster.

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
 *	YCFIntRamSysClusterTable in-memory RAM DbIO implementation
 *	for SysCluster.
 */
public class YCFIntRamSysClusterTable
	implements IYCFIntSysClusterTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecSysClusterPKey,
				YCFSecSysClusterBuff > dictByPKey
		= new HashMap< YCFSecSysClusterPKey,
				YCFSecSysClusterBuff >();
	private Map< YCFSecSysClusterByClusterIdxKey,
				Map< YCFSecSysClusterPKey,
					YCFSecSysClusterBuff >> dictByClusterIdx
		= new HashMap< YCFSecSysClusterByClusterIdxKey,
				Map< YCFSecSysClusterPKey,
					YCFSecSysClusterBuff >>();

	public YCFIntRamSysClusterTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createSysCluster( YCFSecAuthorization Authorization,
		YCFSecSysClusterBuff Buff )
	{
		final String S_ProcName = "createSysCluster";
		YCFSecSysClusterPKey pkey = schema.getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( Buff.getRequiredSingletonId() );
		Buff.setRequiredSingletonId( pkey.getRequiredSingletonId() );
		YCFSecSysClusterByClusterIdxKey keyClusterIdx = schema.getFactorySysCluster().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
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
						"SysClusterCluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecSysClusterPKey, YCFSecSysClusterBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecSysClusterPKey, YCFSecSysClusterBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

	}

	public YCFSecSysClusterBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSysClusterPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSysCluster.readDerived";
		YCFSecSysClusterPKey key = schema.getFactorySysCluster().newPKey();
		key.setRequiredSingletonId( PKey.getRequiredSingletonId() );
		YCFSecSysClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSysClusterBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSysClusterPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSysCluster.readDerived";
		YCFSecSysClusterPKey key = schema.getFactorySysCluster().newPKey();
		key.setRequiredSingletonId( PKey.getRequiredSingletonId() );
		YCFSecSysClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSysClusterBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamSysCluster.readAllDerived";
		YCFSecSysClusterBuff[] retList = new YCFSecSysClusterBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSysClusterBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSysClusterBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamSysCluster.readDerivedByClusterIdx";
		YCFSecSysClusterByClusterIdxKey key = schema.getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecSysClusterBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecSysClusterPKey, YCFSecSysClusterBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecSysClusterBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecSysClusterBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSysClusterPKey, YCFSecSysClusterBuff > subdictClusterIdx
				= new HashMap< YCFSecSysClusterPKey, YCFSecSysClusterBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecSysClusterBuff[0];
		}
		return( recArray );
	}

	public YCFSecSysClusterBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		int SingletonId )
	{
		final String S_ProcName = "YCFIntRamSysCluster.readDerivedByIdIdx() ";
		YCFSecSysClusterPKey key = schema.getFactorySysCluster().newPKey();
		key.setRequiredSingletonId( SingletonId );

		YCFSecSysClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSysClusterBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSysClusterPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSysCluster.readBuff";
		YCFSecSysClusterBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a014" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSysClusterBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSysClusterPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSysClusterBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a014" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSysClusterBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamSysCluster.readAllBuff";
		YCFSecSysClusterBuff buff;
		ArrayList<YCFSecSysClusterBuff> filteredList = new ArrayList<YCFSecSysClusterBuff>();
		YCFSecSysClusterBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a014" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSysClusterBuff[0] ) );
	}

	public YCFSecSysClusterBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		int SingletonId )
	{
		final String S_ProcName = "YCFIntRamSysCluster.readBuffByIdIdx() ";
		YCFSecSysClusterBuff buff = readDerivedByIdIdx( Authorization,
			SingletonId );
		if( ( buff != null ) && buff.getClassCode().equals( "a014" ) ) {
			return( (YCFSecSysClusterBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSysClusterBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamSysCluster.readBuffByClusterIdx() ";
		YCFSecSysClusterBuff buff;
		ArrayList<YCFSecSysClusterBuff> filteredList = new ArrayList<YCFSecSysClusterBuff>();
		YCFSecSysClusterBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a014" ) ) {
				filteredList.add( (YCFSecSysClusterBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSysClusterBuff[0] ) );
	}

	public void updateSysCluster( YCFSecAuthorization Authorization,
		YCFSecSysClusterBuff Buff )
	{
		YCFSecSysClusterPKey pkey = schema.getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( Buff.getRequiredSingletonId() );
		YCFSecSysClusterBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSysCluster",
				"Existing record not found",
				"SysCluster",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSysCluster",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecSysClusterByClusterIdxKey existingKeyClusterIdx = schema.getFactorySysCluster().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSysClusterByClusterIdxKey newKeyClusterIdx = schema.getFactorySysCluster().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSysCluster",
						"Container",
						"SysClusterCluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecSysClusterPKey, YCFSecSysClusterBuff > subdict;

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
			subdict = new HashMap< YCFSecSysClusterPKey, YCFSecSysClusterBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSysCluster( YCFSecAuthorization Authorization,
		YCFSecSysClusterBuff Buff )
	{
		final String S_ProcName = "YCFIntRamSysClusterTable.deleteSysCluster() ";
		String classCode;
		YCFSecSysClusterPKey pkey = schema.getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( Buff.getRequiredSingletonId() );
		YCFSecSysClusterBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSysCluster",
				pkey );
		}
		YCFSecSysClusterByClusterIdxKey keyClusterIdx = schema.getFactorySysCluster().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSysClusterPKey, YCFSecSysClusterBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

	}
	public void deleteSysClusterByIdIdx( YCFSecAuthorization Authorization,
		int argSingletonId )
	{
		YCFSecSysClusterPKey key = schema.getFactorySysCluster().newPKey();
		key.setRequiredSingletonId( argSingletonId );
		deleteSysClusterByIdIdx( Authorization, key );
	}

	public void deleteSysClusterByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSysClusterPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSysClusterBuff cur;
		LinkedList<YCFSecSysClusterBuff> matchSet = new LinkedList<YCFSecSysClusterBuff>();
		Iterator<YCFSecSysClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSysClusterBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSysCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredSingletonId() );
			deleteSysCluster( Authorization, cur );
		}
	}

	public void deleteSysClusterByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecSysClusterByClusterIdxKey key = schema.getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSysClusterByClusterIdx( Authorization, key );
	}

	public void deleteSysClusterByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSysClusterByClusterIdxKey argKey )
	{
		YCFSecSysClusterBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSysClusterBuff> matchSet = new LinkedList<YCFSecSysClusterBuff>();
		Iterator<YCFSecSysClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSysClusterBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSysCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredSingletonId() );
			deleteSysCluster( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
