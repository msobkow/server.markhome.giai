
// Description: Java 11 in-memory RAM DbIO implementation for SecGrpMemb.

/*
 *	org.mssycf.mssycf.YCFBam
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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

/*
 *	YCFBamRamSecGrpMembTable in-memory RAM DbIO implementation
 *	for SecGrpMemb.
 */
public class YCFBamRamSecGrpMembTable
	implements IYCFBamSecGrpMembTable
{
	private IYCFBamSchema schema;
	private Map< YCFSecSecGrpMembPKey,
				YCFSecSecGrpMembBuff > dictByPKey
		= new HashMap< YCFSecSecGrpMembPKey,
				YCFSecSecGrpMembBuff >();
	private Map< YCFSecSecGrpMembByClusterIdxKey,
				Map< YCFSecSecGrpMembPKey,
					YCFSecSecGrpMembBuff >> dictByClusterIdx
		= new HashMap< YCFSecSecGrpMembByClusterIdxKey,
				Map< YCFSecSecGrpMembPKey,
					YCFSecSecGrpMembBuff >>();
	private Map< YCFSecSecGrpMembByGroupIdxKey,
				Map< YCFSecSecGrpMembPKey,
					YCFSecSecGrpMembBuff >> dictByGroupIdx
		= new HashMap< YCFSecSecGrpMembByGroupIdxKey,
				Map< YCFSecSecGrpMembPKey,
					YCFSecSecGrpMembBuff >>();
	private Map< YCFSecSecGrpMembByUserIdxKey,
				Map< YCFSecSecGrpMembPKey,
					YCFSecSecGrpMembBuff >> dictByUserIdx
		= new HashMap< YCFSecSecGrpMembByUserIdxKey,
				Map< YCFSecSecGrpMembPKey,
					YCFSecSecGrpMembBuff >>();
	private Map< YCFSecSecGrpMembByUUserIdxKey,
			YCFSecSecGrpMembBuff > dictByUUserIdx
		= new HashMap< YCFSecSecGrpMembByUUserIdxKey,
			YCFSecSecGrpMembBuff >();

	public YCFBamRamSecGrpMembTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecGrpMemb( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembBuff Buff )
	{
		final String S_ProcName = "createSecGrpMemb";
		YCFSecSecGrpMembPKey pkey = schema.getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpMembId( ((YCFBamRamClusterTable)schema.getTableCluster()).nextSecGrpMembIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecGrpMembId( pkey.getRequiredSecGrpMembId() );
		YCFSecSecGrpMembByClusterIdxKey keyClusterIdx = schema.getFactorySecGrpMemb().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecGrpMembByGroupIdxKey keyGroupIdx = schema.getFactorySecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFSecSecGrpMembByUserIdxKey keyUserIdx = schema.getFactorySecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFSecSecGrpMembByUUserIdxKey keyUUserIdx = schema.getFactorySecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUUserIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUUserIdx.containsKey( keyUUserIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecGrpMembUUserIdx",
				keyUUserIdx );
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
						"Owner",
						"SecGrpMembCluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SecGrpMembGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdictUserIdx;
		if( dictByUserIdx.containsKey( keyUserIdx ) ) {
			subdictUserIdx = dictByUserIdx.get( keyUserIdx );
		}
		else {
			subdictUserIdx = new HashMap< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff >();
			dictByUserIdx.put( keyUserIdx, subdictUserIdx );
		}
		subdictUserIdx.put( pkey, Buff );

		dictByUUserIdx.put( keyUUserIdx, Buff );

	}

	public YCFSecSecGrpMembBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readDerived";
		YCFSecSecGrpMembPKey key = schema.getFactorySecGrpMemb().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGrpMembId( PKey.getRequiredSecGrpMembId() );
		YCFSecSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpMembBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readDerived";
		YCFSecSecGrpMembPKey key = schema.getFactorySecGrpMemb().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGrpMembId( PKey.getRequiredSecGrpMembId() );
		YCFSecSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpMembBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamSecGrpMemb.readAllDerived";
		YCFSecSecGrpMembBuff[] retList = new YCFSecSecGrpMembBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSecGrpMembBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSecGrpMembBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readDerivedByClusterIdx";
		YCFSecSecGrpMembByClusterIdxKey key = schema.getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecSecGrpMembBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecSecGrpMembBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecSecGrpMembBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdictClusterIdx
				= new HashMap< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGrpMembBuff[] readDerivedByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readDerivedByGroupIdx";
		YCFSecSecGrpMembByGroupIdxKey key = schema.getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );

		YCFSecSecGrpMembBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFSecSecGrpMembBuff[ subdictGroupIdx.size() ];
			Iterator< YCFSecSecGrpMembBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdictGroupIdx
				= new HashMap< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFSecSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGrpMembBuff[] readDerivedByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readDerivedByUserIdx";
		YCFSecSecGrpMembByUserIdxKey key = schema.getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );

		YCFSecSecGrpMembBuff[] recArray;
		if( dictByUserIdx.containsKey( key ) ) {
			Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdictUserIdx
				= dictByUserIdx.get( key );
			recArray = new YCFSecSecGrpMembBuff[ subdictUserIdx.size() ];
			Iterator< YCFSecSecGrpMembBuff > iter = subdictUserIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdictUserIdx
				= new HashMap< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff >();
			dictByUserIdx.put( key, subdictUserIdx );
			recArray = new YCFSecSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGrpMembBuff readDerivedByUUserIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readDerivedByUUserIdx";
		YCFSecSecGrpMembByUUserIdxKey key = schema.getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );

		YCFSecSecGrpMembBuff buff;
		if( dictByUUserIdx.containsKey( key ) ) {
			buff = dictByUUserIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpMembBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGrpMembId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readDerivedByIdIdx() ";
		YCFSecSecGrpMembPKey key = schema.getFactorySecGrpMemb().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGrpMembId( SecGrpMembId );

		YCFSecSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpMembBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readBuff";
		YCFSecSecGrpMembBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00f" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpMembBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSecGrpMembBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00f" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpMembBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readAllBuff";
		YCFSecSecGrpMembBuff buff;
		ArrayList<YCFSecSecGrpMembBuff> filteredList = new ArrayList<YCFSecSecGrpMembBuff>();
		YCFSecSecGrpMembBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00f" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGrpMembBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecGrpMemb buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGrpMemb instances in the database accessible for the Authorization.
	 */
	public YCFSecSecGrpMembBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecSecGrpMembBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGrpMembId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readBuffByIdIdx() ";
		YCFSecSecGrpMembBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecGrpMembId );
		if( ( buff != null ) && buff.getClassCode().equals( "a00f" ) ) {
			return( (YCFSecSecGrpMembBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecGrpMembBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readBuffByClusterIdx() ";
		YCFSecSecGrpMembBuff buff;
		ArrayList<YCFSecSecGrpMembBuff> filteredList = new ArrayList<YCFSecSecGrpMembBuff>();
		YCFSecSecGrpMembBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00f" ) ) {
				filteredList.add( (YCFSecSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGrpMembBuff[0] ) );
	}

	public YCFSecSecGrpMembBuff[] readBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readBuffByGroupIdx() ";
		YCFSecSecGrpMembBuff buff;
		ArrayList<YCFSecSecGrpMembBuff> filteredList = new ArrayList<YCFSecSecGrpMembBuff>();
		YCFSecSecGrpMembBuff[] buffList = readDerivedByGroupIdx( Authorization,
			ClusterId,
			SecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00f" ) ) {
				filteredList.add( (YCFSecSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGrpMembBuff[0] ) );
	}

	public YCFSecSecGrpMembBuff[] readBuffByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readBuffByUserIdx() ";
		YCFSecSecGrpMembBuff buff;
		ArrayList<YCFSecSecGrpMembBuff> filteredList = new ArrayList<YCFSecSecGrpMembBuff>();
		YCFSecSecGrpMembBuff[] buffList = readDerivedByUserIdx( Authorization,
			SecUserId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00f" ) ) {
				filteredList.add( (YCFSecSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGrpMembBuff[0] ) );
	}

	public YCFSecSecGrpMembBuff readBuffByUUserIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFBamRamSecGrpMemb.readBuffByUUserIdx() ";
		YCFSecSecGrpMembBuff buff = readDerivedByUUserIdx( Authorization,
			ClusterId,
			SecGroupId,
			SecUserId );
		if( ( buff != null ) && buff.getClassCode().equals( "a00f" ) ) {
			return( (YCFSecSecGrpMembBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SecGrpMemb buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGrpMembBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGrpMemb buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGrpMembBuff[] pageBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGrpMemb buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGrpMembBuff[] pageBuffByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByUserIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecGrpMemb( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembBuff Buff )
	{
		YCFSecSecGrpMembPKey pkey = schema.getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpMembId( Buff.getRequiredSecGrpMembId() );
		YCFSecSecGrpMembBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecGrpMemb",
				"Existing record not found",
				"SecGrpMemb",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecGrpMemb",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecSecGrpMembByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecGrpMemb().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGrpMembByClusterIdxKey newKeyClusterIdx = schema.getFactorySecGrpMemb().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecGrpMembByGroupIdxKey existingKeyGroupIdx = schema.getFactorySecGrpMemb().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFSecSecGrpMembByGroupIdxKey newKeyGroupIdx = schema.getFactorySecGrpMemb().newGroupIdxKey();
		newKeyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFSecSecGrpMembByUserIdxKey existingKeyUserIdx = schema.getFactorySecGrpMemb().newUserIdxKey();
		existingKeyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecSecGrpMembByUserIdxKey newKeyUserIdx = schema.getFactorySecGrpMemb().newUserIdxKey();
		newKeyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFSecSecGrpMembByUUserIdxKey existingKeyUUserIdx = schema.getFactorySecGrpMemb().newUUserIdxKey();
		existingKeyUUserIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUUserIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		existingKeyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecSecGrpMembByUUserIdxKey newKeyUUserIdx = schema.getFactorySecGrpMemb().newUUserIdxKey();
		newKeyUUserIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUUserIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		newKeyUUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Check unique indexes

		if( ! existingKeyUUserIdx.equals( newKeyUUserIdx ) ) {
			if( dictByUUserIdx.containsKey( newKeyUUserIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecGrpMemb",
					"SecGrpMembUUserIdx",
					newKeyUUserIdx );
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
						"updateSecGrpMemb",
						"Owner",
						"SecGrpMembCluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSecGrpMemb",
						"Container",
						"SecGrpMembGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdict;

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
			subdict = new HashMap< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByGroupIdx.get( existingKeyGroupIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByGroupIdx.containsKey( newKeyGroupIdx ) ) {
			subdict = dictByGroupIdx.get( newKeyGroupIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff >();
			dictByGroupIdx.put( newKeyGroupIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByUserIdx.get( existingKeyUserIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByUserIdx.containsKey( newKeyUserIdx ) ) {
			subdict = dictByUserIdx.get( newKeyUserIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff >();
			dictByUserIdx.put( newKeyUserIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUUserIdx.remove( existingKeyUUserIdx );
		dictByUUserIdx.put( newKeyUUserIdx, Buff );

	}

	public void deleteSecGrpMemb( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembBuff Buff )
	{
		final String S_ProcName = "YCFBamRamSecGrpMembTable.deleteSecGrpMemb() ";
		String classCode;
		YCFSecSecGrpMembPKey pkey = schema.getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpMembId( Buff.getRequiredSecGrpMembId() );
		YCFSecSecGrpMembBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecGrpMemb",
				pkey );
		}
		YCFSecSecGrpMembByClusterIdxKey keyClusterIdx = schema.getFactorySecGrpMemb().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGrpMembByGroupIdxKey keyGroupIdx = schema.getFactorySecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFSecSecGrpMembByUserIdxKey keyUserIdx = schema.getFactorySecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecSecGrpMembByUUserIdxKey keyUUserIdx = schema.getFactorySecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUUserIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSecGrpMembPKey, YCFSecSecGrpMembBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByUserIdx.get( keyUserIdx );
		subdict.remove( pkey );

		dictByUUserIdx.remove( keyUUserIdx );

	}
	public void deleteSecGrpMembByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argSecGrpMembId )
	{
		YCFSecSecGrpMembPKey key = schema.getFactorySecGrpMemb().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGrpMembId( argSecGrpMembId );
		deleteSecGrpMembByIdIdx( Authorization, key );
	}

	public void deleteSecGrpMembByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSecGrpMembBuff cur;
		LinkedList<YCFSecSecGrpMembBuff> matchSet = new LinkedList<YCFSecSecGrpMembBuff>();
		Iterator<YCFSecSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteSecGrpMembByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecSecGrpMembByClusterIdxKey key = schema.getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecGrpMembByClusterIdx( Authorization, key );
	}

	public void deleteSecGrpMembByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembByClusterIdxKey argKey )
	{
		YCFSecSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGrpMembBuff> matchSet = new LinkedList<YCFSecSecGrpMembBuff>();
		Iterator<YCFSecSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteSecGrpMembByGroupIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId )
	{
		YCFSecSecGrpMembByGroupIdxKey key = schema.getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		deleteSecGrpMembByGroupIdx( Authorization, key );
	}

	public void deleteSecGrpMembByGroupIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembByGroupIdxKey argKey )
	{
		YCFSecSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGrpMembBuff> matchSet = new LinkedList<YCFSecSecGrpMembBuff>();
		Iterator<YCFSecSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteSecGrpMembByUserIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFSecSecGrpMembByUserIdxKey key = schema.getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteSecGrpMembByUserIdx( Authorization, key );
	}

	public void deleteSecGrpMembByUserIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembByUserIdxKey argKey )
	{
		YCFSecSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGrpMembBuff> matchSet = new LinkedList<YCFSecSecGrpMembBuff>();
		Iterator<YCFSecSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteSecGrpMembByUUserIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId,
		UUID argSecUserId )
	{
		YCFSecSecGrpMembByUUserIdxKey key = schema.getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		key.setRequiredSecUserId( argSecUserId );
		deleteSecGrpMembByUUserIdx( Authorization, key );
	}

	public void deleteSecGrpMembByUUserIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpMembByUUserIdxKey argKey )
	{
		YCFSecSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGrpMembBuff> matchSet = new LinkedList<YCFSecSecGrpMembBuff>();
		Iterator<YCFSecSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
