
// Description: Java 11 in-memory RAM DbIO implementation for TSecGrpInc.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;

/*
 *	YCFSecRamTSecGrpIncTable in-memory RAM DbIO implementation
 *	for TSecGrpInc.
 */
public class YCFSecRamTSecGrpIncTable
	implements IYCFSecTSecGrpIncTable
{
	private IYCFSecSchema schema;
	private Map< YCFSecTSecGrpIncPKey,
				YCFSecTSecGrpIncBuff > dictByPKey
		= new HashMap< YCFSecTSecGrpIncPKey,
				YCFSecTSecGrpIncBuff >();
	private Map< YCFSecTSecGrpIncByTenantIdxKey,
				Map< YCFSecTSecGrpIncPKey,
					YCFSecTSecGrpIncBuff >> dictByTenantIdx
		= new HashMap< YCFSecTSecGrpIncByTenantIdxKey,
				Map< YCFSecTSecGrpIncPKey,
					YCFSecTSecGrpIncBuff >>();
	private Map< YCFSecTSecGrpIncByGroupIdxKey,
				Map< YCFSecTSecGrpIncPKey,
					YCFSecTSecGrpIncBuff >> dictByGroupIdx
		= new HashMap< YCFSecTSecGrpIncByGroupIdxKey,
				Map< YCFSecTSecGrpIncPKey,
					YCFSecTSecGrpIncBuff >>();
	private Map< YCFSecTSecGrpIncByIncludeIdxKey,
				Map< YCFSecTSecGrpIncPKey,
					YCFSecTSecGrpIncBuff >> dictByIncludeIdx
		= new HashMap< YCFSecTSecGrpIncByIncludeIdxKey,
				Map< YCFSecTSecGrpIncPKey,
					YCFSecTSecGrpIncBuff >>();
	private Map< YCFSecTSecGrpIncByUIncludeIdxKey,
			YCFSecTSecGrpIncBuff > dictByUIncludeIdx
		= new HashMap< YCFSecTSecGrpIncByUIncludeIdxKey,
			YCFSecTSecGrpIncBuff >();

	public YCFSecRamTSecGrpIncTable( IYCFSecSchema argSchema ) {
		schema = argSchema;
	}

	public void createTSecGrpInc( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncBuff Buff )
	{
		final String S_ProcName = "createTSecGrpInc";
		YCFSecTSecGrpIncPKey pkey = schema.getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpIncId( ((YCFSecRamTenantTable)schema.getTableTenant()).nextTSecGrpIncIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredTSecGrpIncId( pkey.getRequiredTSecGrpIncId() );
		YCFSecTSecGrpIncByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFSecTSecGrpIncByGroupIdxKey keyGroupIdx = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );

		YCFSecTSecGrpIncByIncludeIdxKey keyIncludeIdx = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		YCFSecTSecGrpIncByUIncludeIdxKey keyUIncludeIdx = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUIncludeIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUIncludeIdx.containsKey( keyUIncludeIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TSecGrpIncUIncludeIdx",
				keyUIncludeIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Owner",
						"TSecGrpIncTenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"TSecGrpIncGroup",
						"TSecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdictIncludeIdx;
		if( dictByIncludeIdx.containsKey( keyIncludeIdx ) ) {
			subdictIncludeIdx = dictByIncludeIdx.get( keyIncludeIdx );
		}
		else {
			subdictIncludeIdx = new HashMap< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff >();
			dictByIncludeIdx.put( keyIncludeIdx, subdictIncludeIdx );
		}
		subdictIncludeIdx.put( pkey, Buff );

		dictByUIncludeIdx.put( keyUIncludeIdx, Buff );

	}

	public YCFSecTSecGrpIncBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readDerived";
		YCFSecTSecGrpIncPKey key = schema.getFactoryTSecGrpInc().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGrpIncId( PKey.getRequiredTSecGrpIncId() );
		YCFSecTSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpIncBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readDerived";
		YCFSecTSecGrpIncPKey key = schema.getFactoryTSecGrpInc().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGrpIncId( PKey.getRequiredTSecGrpIncId() );
		YCFSecTSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpIncBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFSecRamTSecGrpInc.readAllDerived";
		YCFSecTSecGrpIncBuff[] retList = new YCFSecTSecGrpIncBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecTSecGrpIncBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecTSecGrpIncBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readDerivedByTenantIdx";
		YCFSecTSecGrpIncByTenantIdxKey key = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFSecTSecGrpIncBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFSecTSecGrpIncBuff[ subdictTenantIdx.size() ];
			Iterator< YCFSecTSecGrpIncBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdictTenantIdx
				= new HashMap< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFSecTSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFSecTSecGrpIncBuff[] readDerivedByGroupIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readDerivedByGroupIdx";
		YCFSecTSecGrpIncByGroupIdxKey key = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );

		YCFSecTSecGrpIncBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFSecTSecGrpIncBuff[ subdictGroupIdx.size() ];
			Iterator< YCFSecTSecGrpIncBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdictGroupIdx
				= new HashMap< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFSecTSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFSecTSecGrpIncBuff[] readDerivedByIncludeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readDerivedByIncludeIdx";
		YCFSecTSecGrpIncByIncludeIdxKey key = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );

		YCFSecTSecGrpIncBuff[] recArray;
		if( dictByIncludeIdx.containsKey( key ) ) {
			Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdictIncludeIdx
				= dictByIncludeIdx.get( key );
			recArray = new YCFSecTSecGrpIncBuff[ subdictIncludeIdx.size() ];
			Iterator< YCFSecTSecGrpIncBuff > iter = subdictIncludeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdictIncludeIdx
				= new HashMap< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff >();
			dictByIncludeIdx.put( key, subdictIncludeIdx );
			recArray = new YCFSecTSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFSecTSecGrpIncBuff readDerivedByUIncludeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readDerivedByUIncludeIdx";
		YCFSecTSecGrpIncByUIncludeIdxKey key = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );

		YCFSecTSecGrpIncBuff buff;
		if( dictByUIncludeIdx.containsKey( key ) ) {
			buff = dictByUIncludeIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpIncBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TSecGrpIncId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readDerivedByIdIdx() ";
		YCFSecTSecGrpIncPKey key = schema.getFactoryTSecGrpInc().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGrpIncId( TSecGrpIncId );

		YCFSecTSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpIncBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readBuff";
		YCFSecTSecGrpIncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a017" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpIncBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecTSecGrpIncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a017" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpIncBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readAllBuff";
		YCFSecTSecGrpIncBuff buff;
		ArrayList<YCFSecTSecGrpIncBuff> filteredList = new ArrayList<YCFSecTSecGrpIncBuff>();
		YCFSecTSecGrpIncBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a017" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGrpIncBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific TSecGrpInc buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TSecGrpInc instances in the database accessible for the Authorization.
	 */
	public YCFSecTSecGrpIncBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecTSecGrpIncBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TSecGrpIncId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readBuffByIdIdx() ";
		YCFSecTSecGrpIncBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			TSecGrpIncId );
		if( ( buff != null ) && buff.getClassCode().equals( "a017" ) ) {
			return( (YCFSecTSecGrpIncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecTSecGrpIncBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readBuffByTenantIdx() ";
		YCFSecTSecGrpIncBuff buff;
		ArrayList<YCFSecTSecGrpIncBuff> filteredList = new ArrayList<YCFSecTSecGrpIncBuff>();
		YCFSecTSecGrpIncBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a017" ) ) {
				filteredList.add( (YCFSecTSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGrpIncBuff[0] ) );
	}

	public YCFSecTSecGrpIncBuff[] readBuffByGroupIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readBuffByGroupIdx() ";
		YCFSecTSecGrpIncBuff buff;
		ArrayList<YCFSecTSecGrpIncBuff> filteredList = new ArrayList<YCFSecTSecGrpIncBuff>();
		YCFSecTSecGrpIncBuff[] buffList = readDerivedByGroupIdx( Authorization,
			TenantId,
			TSecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a017" ) ) {
				filteredList.add( (YCFSecTSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGrpIncBuff[0] ) );
	}

	public YCFSecTSecGrpIncBuff[] readBuffByIncludeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readBuffByIncludeIdx() ";
		YCFSecTSecGrpIncBuff buff;
		ArrayList<YCFSecTSecGrpIncBuff> filteredList = new ArrayList<YCFSecTSecGrpIncBuff>();
		YCFSecTSecGrpIncBuff[] buffList = readDerivedByIncludeIdx( Authorization,
			TenantId,
			IncludeGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a017" ) ) {
				filteredList.add( (YCFSecTSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGrpIncBuff[0] ) );
	}

	public YCFSecTSecGrpIncBuff readBuffByUIncludeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFSecRamTSecGrpInc.readBuffByUIncludeIdx() ";
		YCFSecTSecGrpIncBuff buff = readDerivedByUIncludeIdx( Authorization,
			TenantId,
			TSecGroupId,
			IncludeGroupId );
		if( ( buff != null ) && buff.getClassCode().equals( "a017" ) ) {
			return( (YCFSecTSecGrpIncBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific TSecGrpInc buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecTSecGrpIncBuff[] pageBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByTenantIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific TSecGrpInc buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecTSecGrpIncBuff[] pageBuffByGroupIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific TSecGrpInc buffer instances identified by the duplicate key IncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecTSecGrpIncBuff[] pageBuffByIncludeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int IncludeGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByIncludeIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateTSecGrpInc( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncBuff Buff )
	{
		YCFSecTSecGrpIncPKey pkey = schema.getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpIncId( Buff.getRequiredTSecGrpIncId() );
		YCFSecTSecGrpIncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTSecGrpInc",
				"Existing record not found",
				"TSecGrpInc",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTSecGrpInc",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecTSecGrpIncByTenantIdxKey existingKeyTenantIdx = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFSecTSecGrpIncByTenantIdxKey newKeyTenantIdx = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFSecTSecGrpIncByGroupIdxKey existingKeyGroupIdx = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFSecTSecGrpIncByGroupIdxKey newKeyGroupIdx = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		newKeyGroupIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyGroupIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );

		YCFSecTSecGrpIncByIncludeIdxKey existingKeyIncludeIdx = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		existingKeyIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFSecTSecGrpIncByIncludeIdxKey newKeyIncludeIdx = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		newKeyIncludeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		YCFSecTSecGrpIncByUIncludeIdxKey existingKeyUIncludeIdx = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		existingKeyUIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUIncludeIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		existingKeyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFSecTSecGrpIncByUIncludeIdxKey newKeyUIncludeIdx = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		newKeyUIncludeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUIncludeIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		newKeyUIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		// Check unique indexes

		if( ! existingKeyUIncludeIdx.equals( newKeyUIncludeIdx ) ) {
			if( dictByUIncludeIdx.containsKey( newKeyUIncludeIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTSecGrpInc",
					"TSecGrpIncUIncludeIdx",
					newKeyUIncludeIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTSecGrpInc",
						"Owner",
						"TSecGrpIncTenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTSecGrpInc",
						"Container",
						"TSecGrpIncGroup",
						"TSecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByTenantIdx.get( existingKeyTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTenantIdx.containsKey( newKeyTenantIdx ) ) {
			subdict = dictByTenantIdx.get( newKeyTenantIdx );
		}
		else {
			subdict = new HashMap< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
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
			subdict = new HashMap< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff >();
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
			subdict = new HashMap< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff >();
			dictByIncludeIdx.put( newKeyIncludeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUIncludeIdx.remove( existingKeyUIncludeIdx );
		dictByUIncludeIdx.put( newKeyUIncludeIdx, Buff );

	}

	public void deleteTSecGrpInc( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncBuff Buff )
	{
		final String S_ProcName = "YCFSecRamTSecGrpIncTable.deleteTSecGrpInc() ";
		String classCode;
		YCFSecTSecGrpIncPKey pkey = schema.getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpIncId( Buff.getRequiredTSecGrpIncId() );
		YCFSecTSecGrpIncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTSecGrpInc",
				pkey );
		}
		YCFSecTSecGrpIncByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFSecTSecGrpIncByGroupIdxKey keyGroupIdx = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFSecTSecGrpIncByIncludeIdxKey keyIncludeIdx = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFSecTSecGrpIncByUIncludeIdxKey keyUIncludeIdx = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUIncludeIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecTSecGrpIncPKey, YCFSecTSecGrpIncBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByIncludeIdx.get( keyIncludeIdx );
		subdict.remove( pkey );

		dictByUIncludeIdx.remove( keyUIncludeIdx );

	}
	public void deleteTSecGrpIncByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTSecGrpIncId )
	{
		YCFSecTSecGrpIncPKey key = schema.getFactoryTSecGrpInc().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGrpIncId( argTSecGrpIncId );
		deleteTSecGrpIncByIdIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByIdIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecTSecGrpIncBuff cur;
		LinkedList<YCFSecTSecGrpIncBuff> matchSet = new LinkedList<YCFSecTSecGrpIncBuff>();
		Iterator<YCFSecTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void deleteTSecGrpIncByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFSecTSecGrpIncByTenantIdxKey key = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTSecGrpIncByTenantIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByTenantIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncByTenantIdxKey argKey )
	{
		YCFSecTSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGrpIncBuff> matchSet = new LinkedList<YCFSecTSecGrpIncBuff>();
		Iterator<YCFSecTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void deleteTSecGrpIncByGroupIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId )
	{
		YCFSecTSecGrpIncByGroupIdxKey key = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		deleteTSecGrpIncByGroupIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByGroupIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncByGroupIdxKey argKey )
	{
		YCFSecTSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGrpIncBuff> matchSet = new LinkedList<YCFSecTSecGrpIncBuff>();
		Iterator<YCFSecTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void deleteTSecGrpIncByIncludeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		int argIncludeGroupId )
	{
		YCFSecTSecGrpIncByIncludeIdxKey key = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredIncludeGroupId( argIncludeGroupId );
		deleteTSecGrpIncByIncludeIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByIncludeIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncByIncludeIdxKey argKey )
	{
		YCFSecTSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGrpIncBuff> matchSet = new LinkedList<YCFSecTSecGrpIncBuff>();
		Iterator<YCFSecTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void deleteTSecGrpIncByUIncludeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId,
		int argIncludeGroupId )
	{
		YCFSecTSecGrpIncByUIncludeIdxKey key = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		key.setRequiredIncludeGroupId( argIncludeGroupId );
		deleteTSecGrpIncByUIncludeIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByUIncludeIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpIncByUIncludeIdxKey argKey )
	{
		YCFSecTSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGrpIncBuff> matchSet = new LinkedList<YCFSecTSecGrpIncBuff>();
		Iterator<YCFSecTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
