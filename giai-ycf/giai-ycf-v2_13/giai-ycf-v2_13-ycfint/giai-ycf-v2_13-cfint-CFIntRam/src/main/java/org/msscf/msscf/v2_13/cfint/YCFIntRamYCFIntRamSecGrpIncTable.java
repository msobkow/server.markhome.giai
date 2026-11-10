
// Description: Java 11 in-memory RAM DbIO implementation for SecGrpInc.

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
 *	YCFIntRamSecGrpIncTable in-memory RAM DbIO implementation
 *	for SecGrpInc.
 */
public class YCFIntRamSecGrpIncTable
	implements IYCFIntSecGrpIncTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecSecGrpIncPKey,
				YCFSecSecGrpIncBuff > dictByPKey
		= new HashMap< YCFSecSecGrpIncPKey,
				YCFSecSecGrpIncBuff >();
	private Map< YCFSecSecGrpIncByClusterIdxKey,
				Map< YCFSecSecGrpIncPKey,
					YCFSecSecGrpIncBuff >> dictByClusterIdx
		= new HashMap< YCFSecSecGrpIncByClusterIdxKey,
				Map< YCFSecSecGrpIncPKey,
					YCFSecSecGrpIncBuff >>();
	private Map< YCFSecSecGrpIncByGroupIdxKey,
				Map< YCFSecSecGrpIncPKey,
					YCFSecSecGrpIncBuff >> dictByGroupIdx
		= new HashMap< YCFSecSecGrpIncByGroupIdxKey,
				Map< YCFSecSecGrpIncPKey,
					YCFSecSecGrpIncBuff >>();
	private Map< YCFSecSecGrpIncByIncludeIdxKey,
				Map< YCFSecSecGrpIncPKey,
					YCFSecSecGrpIncBuff >> dictByIncludeIdx
		= new HashMap< YCFSecSecGrpIncByIncludeIdxKey,
				Map< YCFSecSecGrpIncPKey,
					YCFSecSecGrpIncBuff >>();
	private Map< YCFSecSecGrpIncByUIncludeIdxKey,
			YCFSecSecGrpIncBuff > dictByUIncludeIdx
		= new HashMap< YCFSecSecGrpIncByUIncludeIdxKey,
			YCFSecSecGrpIncBuff >();

	public YCFIntRamSecGrpIncTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecGrpInc( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncBuff Buff )
	{
		final String S_ProcName = "createSecGrpInc";
		YCFSecSecGrpIncPKey pkey = schema.getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpIncId( ((YCFIntRamClusterTable)schema.getTableCluster()).nextSecGrpIncIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecGrpIncId( pkey.getRequiredSecGrpIncId() );
		YCFSecSecGrpIncByClusterIdxKey keyClusterIdx = schema.getFactorySecGrpInc().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecGrpIncByGroupIdxKey keyGroupIdx = schema.getFactorySecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFSecSecGrpIncByIncludeIdxKey keyIncludeIdx = schema.getFactorySecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		YCFSecSecGrpIncByUIncludeIdxKey keyUIncludeIdx = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUIncludeIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUIncludeIdx.containsKey( keyUIncludeIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecGrpIncUIncludeIdx",
				keyUIncludeIdx );
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
						"SecGrpIncCluster",
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
						"SecGrpIncGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdictIncludeIdx;
		if( dictByIncludeIdx.containsKey( keyIncludeIdx ) ) {
			subdictIncludeIdx = dictByIncludeIdx.get( keyIncludeIdx );
		}
		else {
			subdictIncludeIdx = new HashMap< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff >();
			dictByIncludeIdx.put( keyIncludeIdx, subdictIncludeIdx );
		}
		subdictIncludeIdx.put( pkey, Buff );

		dictByUIncludeIdx.put( keyUIncludeIdx, Buff );

	}

	public YCFSecSecGrpIncBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readDerived";
		YCFSecSecGrpIncPKey key = schema.getFactorySecGrpInc().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGrpIncId( PKey.getRequiredSecGrpIncId() );
		YCFSecSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpIncBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readDerived";
		YCFSecSecGrpIncPKey key = schema.getFactorySecGrpInc().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGrpIncId( PKey.getRequiredSecGrpIncId() );
		YCFSecSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpIncBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamSecGrpInc.readAllDerived";
		YCFSecSecGrpIncBuff[] retList = new YCFSecSecGrpIncBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSecGrpIncBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSecGrpIncBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readDerivedByClusterIdx";
		YCFSecSecGrpIncByClusterIdxKey key = schema.getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecSecGrpIncBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecSecGrpIncBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecSecGrpIncBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdictClusterIdx
				= new HashMap< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGrpIncBuff[] readDerivedByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readDerivedByGroupIdx";
		YCFSecSecGrpIncByGroupIdxKey key = schema.getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );

		YCFSecSecGrpIncBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFSecSecGrpIncBuff[ subdictGroupIdx.size() ];
			Iterator< YCFSecSecGrpIncBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdictGroupIdx
				= new HashMap< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFSecSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGrpIncBuff[] readDerivedByIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readDerivedByIncludeIdx";
		YCFSecSecGrpIncByIncludeIdxKey key = schema.getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );

		YCFSecSecGrpIncBuff[] recArray;
		if( dictByIncludeIdx.containsKey( key ) ) {
			Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdictIncludeIdx
				= dictByIncludeIdx.get( key );
			recArray = new YCFSecSecGrpIncBuff[ subdictIncludeIdx.size() ];
			Iterator< YCFSecSecGrpIncBuff > iter = subdictIncludeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdictIncludeIdx
				= new HashMap< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff >();
			dictByIncludeIdx.put( key, subdictIncludeIdx );
			recArray = new YCFSecSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGrpIncBuff readDerivedByUIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readDerivedByUIncludeIdx";
		YCFSecSecGrpIncByUIncludeIdxKey key = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );

		YCFSecSecGrpIncBuff buff;
		if( dictByUIncludeIdx.containsKey( key ) ) {
			buff = dictByUIncludeIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpIncBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGrpIncId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readDerivedByIdIdx() ";
		YCFSecSecGrpIncPKey key = schema.getFactorySecGrpInc().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGrpIncId( SecGrpIncId );

		YCFSecSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpIncBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readBuff";
		YCFSecSecGrpIncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpIncBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSecGrpIncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGrpIncBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readAllBuff";
		YCFSecSecGrpIncBuff buff;
		ArrayList<YCFSecSecGrpIncBuff> filteredList = new ArrayList<YCFSecSecGrpIncBuff>();
		YCFSecSecGrpIncBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00e" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGrpIncBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecGrpInc buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGrpInc instances in the database accessible for the Authorization.
	 */
	public YCFSecSecGrpIncBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecSecGrpIncBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGrpIncId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readBuffByIdIdx() ";
		YCFSecSecGrpIncBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecGrpIncId );
		if( ( buff != null ) && buff.getClassCode().equals( "a00e" ) ) {
			return( (YCFSecSecGrpIncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecGrpIncBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readBuffByClusterIdx() ";
		YCFSecSecGrpIncBuff buff;
		ArrayList<YCFSecSecGrpIncBuff> filteredList = new ArrayList<YCFSecSecGrpIncBuff>();
		YCFSecSecGrpIncBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00e" ) ) {
				filteredList.add( (YCFSecSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGrpIncBuff[0] ) );
	}

	public YCFSecSecGrpIncBuff[] readBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readBuffByGroupIdx() ";
		YCFSecSecGrpIncBuff buff;
		ArrayList<YCFSecSecGrpIncBuff> filteredList = new ArrayList<YCFSecSecGrpIncBuff>();
		YCFSecSecGrpIncBuff[] buffList = readDerivedByGroupIdx( Authorization,
			ClusterId,
			SecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00e" ) ) {
				filteredList.add( (YCFSecSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGrpIncBuff[0] ) );
	}

	public YCFSecSecGrpIncBuff[] readBuffByIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readBuffByIncludeIdx() ";
		YCFSecSecGrpIncBuff buff;
		ArrayList<YCFSecSecGrpIncBuff> filteredList = new ArrayList<YCFSecSecGrpIncBuff>();
		YCFSecSecGrpIncBuff[] buffList = readDerivedByIncludeIdx( Authorization,
			ClusterId,
			IncludeGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00e" ) ) {
				filteredList.add( (YCFSecSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGrpIncBuff[0] ) );
	}

	public YCFSecSecGrpIncBuff readBuffByUIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFIntRamSecGrpInc.readBuffByUIncludeIdx() ";
		YCFSecSecGrpIncBuff buff = readDerivedByUIncludeIdx( Authorization,
			ClusterId,
			SecGroupId,
			IncludeGroupId );
		if( ( buff != null ) && buff.getClassCode().equals( "a00e" ) ) {
			return( (YCFSecSecGrpIncBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SecGrpInc buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGrpIncBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGrpInc buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGrpIncBuff[] pageBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGrpInc buffer instances identified by the duplicate key IncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGrpIncBuff[] pageBuffByIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int IncludeGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByIncludeIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecGrpInc( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncBuff Buff )
	{
		YCFSecSecGrpIncPKey pkey = schema.getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpIncId( Buff.getRequiredSecGrpIncId() );
		YCFSecSecGrpIncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecGrpInc",
				"Existing record not found",
				"SecGrpInc",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecGrpInc",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecSecGrpIncByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecGrpInc().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGrpIncByClusterIdxKey newKeyClusterIdx = schema.getFactorySecGrpInc().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecGrpIncByGroupIdxKey existingKeyGroupIdx = schema.getFactorySecGrpInc().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFSecSecGrpIncByGroupIdxKey newKeyGroupIdx = schema.getFactorySecGrpInc().newGroupIdxKey();
		newKeyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFSecSecGrpIncByIncludeIdxKey existingKeyIncludeIdx = schema.getFactorySecGrpInc().newIncludeIdxKey();
		existingKeyIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFSecSecGrpIncByIncludeIdxKey newKeyIncludeIdx = schema.getFactorySecGrpInc().newIncludeIdxKey();
		newKeyIncludeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		YCFSecSecGrpIncByUIncludeIdxKey existingKeyUIncludeIdx = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		existingKeyUIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUIncludeIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		existingKeyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFSecSecGrpIncByUIncludeIdxKey newKeyUIncludeIdx = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		newKeyUIncludeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUIncludeIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		newKeyUIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		// Check unique indexes

		if( ! existingKeyUIncludeIdx.equals( newKeyUIncludeIdx ) ) {
			if( dictByUIncludeIdx.containsKey( newKeyUIncludeIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecGrpInc",
					"SecGrpIncUIncludeIdx",
					newKeyUIncludeIdx );
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
						"updateSecGrpInc",
						"Owner",
						"SecGrpIncCluster",
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
						"updateSecGrpInc",
						"Container",
						"SecGrpIncGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdict;

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
			subdict = new HashMap< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff >();
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
			subdict = new HashMap< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff >();
			dictByGroupIdx.put( newKeyGroupIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByIncludeIdx.get( existingKeyIncludeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIncludeIdx.containsKey( newKeyIncludeIdx ) ) {
			subdict = dictByIncludeIdx.get( newKeyIncludeIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff >();
			dictByIncludeIdx.put( newKeyIncludeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUIncludeIdx.remove( existingKeyUIncludeIdx );
		dictByUIncludeIdx.put( newKeyUIncludeIdx, Buff );

	}

	public void deleteSecGrpInc( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncBuff Buff )
	{
		final String S_ProcName = "YCFIntRamSecGrpIncTable.deleteSecGrpInc() ";
		String classCode;
		YCFSecSecGrpIncPKey pkey = schema.getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpIncId( Buff.getRequiredSecGrpIncId() );
		YCFSecSecGrpIncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecGrpInc",
				pkey );
		}
		YCFSecSecGrpIncByClusterIdxKey keyClusterIdx = schema.getFactorySecGrpInc().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGrpIncByGroupIdxKey keyGroupIdx = schema.getFactorySecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFSecSecGrpIncByIncludeIdxKey keyIncludeIdx = schema.getFactorySecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFSecSecGrpIncByUIncludeIdxKey keyUIncludeIdx = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUIncludeIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSecGrpIncPKey, YCFSecSecGrpIncBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByIncludeIdx.get( keyIncludeIdx );
		subdict.remove( pkey );

		dictByUIncludeIdx.remove( keyUIncludeIdx );

	}
	public void deleteSecGrpIncByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argSecGrpIncId )
	{
		YCFSecSecGrpIncPKey key = schema.getFactorySecGrpInc().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGrpIncId( argSecGrpIncId );
		deleteSecGrpIncByIdIdx( Authorization, key );
	}

	public void deleteSecGrpIncByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSecGrpIncBuff cur;
		LinkedList<YCFSecSecGrpIncBuff> matchSet = new LinkedList<YCFSecSecGrpIncBuff>();
		Iterator<YCFSecSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void deleteSecGrpIncByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecSecGrpIncByClusterIdxKey key = schema.getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecGrpIncByClusterIdx( Authorization, key );
	}

	public void deleteSecGrpIncByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncByClusterIdxKey argKey )
	{
		YCFSecSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGrpIncBuff> matchSet = new LinkedList<YCFSecSecGrpIncBuff>();
		Iterator<YCFSecSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void deleteSecGrpIncByGroupIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId )
	{
		YCFSecSecGrpIncByGroupIdxKey key = schema.getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		deleteSecGrpIncByGroupIdx( Authorization, key );
	}

	public void deleteSecGrpIncByGroupIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncByGroupIdxKey argKey )
	{
		YCFSecSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGrpIncBuff> matchSet = new LinkedList<YCFSecSecGrpIncBuff>();
		Iterator<YCFSecSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void deleteSecGrpIncByIncludeIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argIncludeGroupId )
	{
		YCFSecSecGrpIncByIncludeIdxKey key = schema.getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredIncludeGroupId( argIncludeGroupId );
		deleteSecGrpIncByIncludeIdx( Authorization, key );
	}

	public void deleteSecGrpIncByIncludeIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncByIncludeIdxKey argKey )
	{
		YCFSecSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGrpIncBuff> matchSet = new LinkedList<YCFSecSecGrpIncBuff>();
		Iterator<YCFSecSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void deleteSecGrpIncByUIncludeIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId,
		int argIncludeGroupId )
	{
		YCFSecSecGrpIncByUIncludeIdxKey key = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		key.setRequiredIncludeGroupId( argIncludeGroupId );
		deleteSecGrpIncByUIncludeIdx( Authorization, key );
	}

	public void deleteSecGrpIncByUIncludeIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncByUIncludeIdxKey argKey )
	{
		YCFSecSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGrpIncBuff> matchSet = new LinkedList<YCFSecSecGrpIncBuff>();
		Iterator<YCFSecSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
