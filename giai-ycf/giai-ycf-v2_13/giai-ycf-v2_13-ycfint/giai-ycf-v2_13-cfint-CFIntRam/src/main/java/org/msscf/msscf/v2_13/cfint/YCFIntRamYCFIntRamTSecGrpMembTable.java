
// Description: Java 11 in-memory RAM DbIO implementation for TSecGrpMemb.

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
 *	YCFIntRamTSecGrpMembTable in-memory RAM DbIO implementation
 *	for TSecGrpMemb.
 */
public class YCFIntRamTSecGrpMembTable
	implements IYCFIntTSecGrpMembTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecTSecGrpMembPKey,
				YCFSecTSecGrpMembBuff > dictByPKey
		= new HashMap< YCFSecTSecGrpMembPKey,
				YCFSecTSecGrpMembBuff >();
	private Map< YCFSecTSecGrpMembByTenantIdxKey,
				Map< YCFSecTSecGrpMembPKey,
					YCFSecTSecGrpMembBuff >> dictByTenantIdx
		= new HashMap< YCFSecTSecGrpMembByTenantIdxKey,
				Map< YCFSecTSecGrpMembPKey,
					YCFSecTSecGrpMembBuff >>();
	private Map< YCFSecTSecGrpMembByGroupIdxKey,
				Map< YCFSecTSecGrpMembPKey,
					YCFSecTSecGrpMembBuff >> dictByGroupIdx
		= new HashMap< YCFSecTSecGrpMembByGroupIdxKey,
				Map< YCFSecTSecGrpMembPKey,
					YCFSecTSecGrpMembBuff >>();
	private Map< YCFSecTSecGrpMembByUserIdxKey,
				Map< YCFSecTSecGrpMembPKey,
					YCFSecTSecGrpMembBuff >> dictByUserIdx
		= new HashMap< YCFSecTSecGrpMembByUserIdxKey,
				Map< YCFSecTSecGrpMembPKey,
					YCFSecTSecGrpMembBuff >>();
	private Map< YCFSecTSecGrpMembByUUserIdxKey,
			YCFSecTSecGrpMembBuff > dictByUUserIdx
		= new HashMap< YCFSecTSecGrpMembByUUserIdxKey,
			YCFSecTSecGrpMembBuff >();

	public YCFIntRamTSecGrpMembTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createTSecGrpMemb( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembBuff Buff )
	{
		final String S_ProcName = "createTSecGrpMemb";
		YCFSecTSecGrpMembPKey pkey = schema.getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpMembId( ((YCFIntRamTenantTable)schema.getTableTenant()).nextTSecGrpMembIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredTSecGrpMembId( pkey.getRequiredTSecGrpMembId() );
		YCFSecTSecGrpMembByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFSecTSecGrpMembByGroupIdxKey keyGroupIdx = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );

		YCFSecTSecGrpMembByUserIdxKey keyUserIdx = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFSecTSecGrpMembByUUserIdxKey keyUUserIdx = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUUserIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUUserIdx.containsKey( keyUUserIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TSecGrpMembUUserIdx",
				keyUUserIdx );
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
						"TSecGrpMembTenant",
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
						"TSecGrpMembGroup",
						"TSecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdictUserIdx;
		if( dictByUserIdx.containsKey( keyUserIdx ) ) {
			subdictUserIdx = dictByUserIdx.get( keyUserIdx );
		}
		else {
			subdictUserIdx = new HashMap< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff >();
			dictByUserIdx.put( keyUserIdx, subdictUserIdx );
		}
		subdictUserIdx.put( pkey, Buff );

		dictByUUserIdx.put( keyUUserIdx, Buff );

	}

	public YCFSecTSecGrpMembBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readDerived";
		YCFSecTSecGrpMembPKey key = schema.getFactoryTSecGrpMemb().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGrpMembId( PKey.getRequiredTSecGrpMembId() );
		YCFSecTSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpMembBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readDerived";
		YCFSecTSecGrpMembPKey key = schema.getFactoryTSecGrpMemb().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGrpMembId( PKey.getRequiredTSecGrpMembId() );
		YCFSecTSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpMembBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readAllDerived";
		YCFSecTSecGrpMembBuff[] retList = new YCFSecTSecGrpMembBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecTSecGrpMembBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecTSecGrpMembBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readDerivedByTenantIdx";
		YCFSecTSecGrpMembByTenantIdxKey key = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFSecTSecGrpMembBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFSecTSecGrpMembBuff[ subdictTenantIdx.size() ];
			Iterator< YCFSecTSecGrpMembBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdictTenantIdx
				= new HashMap< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFSecTSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFSecTSecGrpMembBuff[] readDerivedByGroupIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readDerivedByGroupIdx";
		YCFSecTSecGrpMembByGroupIdxKey key = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );

		YCFSecTSecGrpMembBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFSecTSecGrpMembBuff[ subdictGroupIdx.size() ];
			Iterator< YCFSecTSecGrpMembBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdictGroupIdx
				= new HashMap< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFSecTSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFSecTSecGrpMembBuff[] readDerivedByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readDerivedByUserIdx";
		YCFSecTSecGrpMembByUserIdxKey key = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );

		YCFSecTSecGrpMembBuff[] recArray;
		if( dictByUserIdx.containsKey( key ) ) {
			Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdictUserIdx
				= dictByUserIdx.get( key );
			recArray = new YCFSecTSecGrpMembBuff[ subdictUserIdx.size() ];
			Iterator< YCFSecTSecGrpMembBuff > iter = subdictUserIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdictUserIdx
				= new HashMap< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff >();
			dictByUserIdx.put( key, subdictUserIdx );
			recArray = new YCFSecTSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFSecTSecGrpMembBuff readDerivedByUUserIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readDerivedByUUserIdx";
		YCFSecTSecGrpMembByUUserIdxKey key = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredSecUserId( SecUserId );

		YCFSecTSecGrpMembBuff buff;
		if( dictByUUserIdx.containsKey( key ) ) {
			buff = dictByUUserIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpMembBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TSecGrpMembId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readDerivedByIdIdx() ";
		YCFSecTSecGrpMembPKey key = schema.getFactoryTSecGrpMemb().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGrpMembId( TSecGrpMembId );

		YCFSecTSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpMembBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readBuff";
		YCFSecTSecGrpMembBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a018" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpMembBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecTSecGrpMembBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a018" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGrpMembBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readAllBuff";
		YCFSecTSecGrpMembBuff buff;
		ArrayList<YCFSecTSecGrpMembBuff> filteredList = new ArrayList<YCFSecTSecGrpMembBuff>();
		YCFSecTSecGrpMembBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a018" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGrpMembBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific TSecGrpMemb buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TSecGrpMemb instances in the database accessible for the Authorization.
	 */
	public YCFSecTSecGrpMembBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecTSecGrpMembBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TSecGrpMembId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readBuffByIdIdx() ";
		YCFSecTSecGrpMembBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			TSecGrpMembId );
		if( ( buff != null ) && buff.getClassCode().equals( "a018" ) ) {
			return( (YCFSecTSecGrpMembBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecTSecGrpMembBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readBuffByTenantIdx() ";
		YCFSecTSecGrpMembBuff buff;
		ArrayList<YCFSecTSecGrpMembBuff> filteredList = new ArrayList<YCFSecTSecGrpMembBuff>();
		YCFSecTSecGrpMembBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a018" ) ) {
				filteredList.add( (YCFSecTSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGrpMembBuff[0] ) );
	}

	public YCFSecTSecGrpMembBuff[] readBuffByGroupIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readBuffByGroupIdx() ";
		YCFSecTSecGrpMembBuff buff;
		ArrayList<YCFSecTSecGrpMembBuff> filteredList = new ArrayList<YCFSecTSecGrpMembBuff>();
		YCFSecTSecGrpMembBuff[] buffList = readDerivedByGroupIdx( Authorization,
			TenantId,
			TSecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a018" ) ) {
				filteredList.add( (YCFSecTSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGrpMembBuff[0] ) );
	}

	public YCFSecTSecGrpMembBuff[] readBuffByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readBuffByUserIdx() ";
		YCFSecTSecGrpMembBuff buff;
		ArrayList<YCFSecTSecGrpMembBuff> filteredList = new ArrayList<YCFSecTSecGrpMembBuff>();
		YCFSecTSecGrpMembBuff[] buffList = readDerivedByUserIdx( Authorization,
			SecUserId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a018" ) ) {
				filteredList.add( (YCFSecTSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGrpMembBuff[0] ) );
	}

	public YCFSecTSecGrpMembBuff readBuffByUUserIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMemb.readBuffByUUserIdx() ";
		YCFSecTSecGrpMembBuff buff = readDerivedByUUserIdx( Authorization,
			TenantId,
			TSecGroupId,
			SecUserId );
		if( ( buff != null ) && buff.getClassCode().equals( "a018" ) ) {
			return( (YCFSecTSecGrpMembBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific TSecGrpMemb buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecTSecGrpMembBuff[] pageBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByTenantIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific TSecGrpMemb buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecTSecGrpMembBuff[] pageBuffByGroupIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific TSecGrpMemb buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecTSecGrpMembBuff[] pageBuffByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByUserIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateTSecGrpMemb( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembBuff Buff )
	{
		YCFSecTSecGrpMembPKey pkey = schema.getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpMembId( Buff.getRequiredTSecGrpMembId() );
		YCFSecTSecGrpMembBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTSecGrpMemb",
				"Existing record not found",
				"TSecGrpMemb",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTSecGrpMemb",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecTSecGrpMembByTenantIdxKey existingKeyTenantIdx = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFSecTSecGrpMembByTenantIdxKey newKeyTenantIdx = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFSecTSecGrpMembByGroupIdxKey existingKeyGroupIdx = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFSecTSecGrpMembByGroupIdxKey newKeyGroupIdx = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		newKeyGroupIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyGroupIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );

		YCFSecTSecGrpMembByUserIdxKey existingKeyUserIdx = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		existingKeyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecTSecGrpMembByUserIdxKey newKeyUserIdx = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		newKeyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFSecTSecGrpMembByUUserIdxKey existingKeyUUserIdx = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		existingKeyUUserIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUUserIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		existingKeyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecTSecGrpMembByUUserIdxKey newKeyUUserIdx = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		newKeyUUserIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUUserIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		newKeyUUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Check unique indexes

		if( ! existingKeyUUserIdx.equals( newKeyUUserIdx ) ) {
			if( dictByUUserIdx.containsKey( newKeyUUserIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTSecGrpMemb",
					"TSecGrpMembUUserIdx",
					newKeyUUserIdx );
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
						"updateTSecGrpMemb",
						"Owner",
						"TSecGrpMembTenant",
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
						"updateTSecGrpMemb",
						"Container",
						"TSecGrpMembGroup",
						"TSecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdict;

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
			subdict = new HashMap< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff >();
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
			subdict = new HashMap< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff >();
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
			subdict = new HashMap< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff >();
			dictByUserIdx.put( newKeyUserIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUUserIdx.remove( existingKeyUUserIdx );
		dictByUUserIdx.put( newKeyUUserIdx, Buff );

	}

	public void deleteTSecGrpMemb( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembBuff Buff )
	{
		final String S_ProcName = "YCFIntRamTSecGrpMembTable.deleteTSecGrpMemb() ";
		String classCode;
		YCFSecTSecGrpMembPKey pkey = schema.getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpMembId( Buff.getRequiredTSecGrpMembId() );
		YCFSecTSecGrpMembBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTSecGrpMemb",
				pkey );
		}
		YCFSecTSecGrpMembByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFSecTSecGrpMembByGroupIdxKey keyGroupIdx = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFSecTSecGrpMembByUserIdxKey keyUserIdx = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecTSecGrpMembByUUserIdxKey keyUUserIdx = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUUserIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecTSecGrpMembPKey, YCFSecTSecGrpMembBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByUserIdx.get( keyUserIdx );
		subdict.remove( pkey );

		dictByUUserIdx.remove( keyUUserIdx );

	}
	public void deleteTSecGrpMembByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTSecGrpMembId )
	{
		YCFSecTSecGrpMembPKey key = schema.getFactoryTSecGrpMemb().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGrpMembId( argTSecGrpMembId );
		deleteTSecGrpMembByIdIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByIdIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecTSecGrpMembBuff cur;
		LinkedList<YCFSecTSecGrpMembBuff> matchSet = new LinkedList<YCFSecTSecGrpMembBuff>();
		Iterator<YCFSecTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteTSecGrpMembByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFSecTSecGrpMembByTenantIdxKey key = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTSecGrpMembByTenantIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByTenantIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembByTenantIdxKey argKey )
	{
		YCFSecTSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGrpMembBuff> matchSet = new LinkedList<YCFSecTSecGrpMembBuff>();
		Iterator<YCFSecTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteTSecGrpMembByGroupIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId )
	{
		YCFSecTSecGrpMembByGroupIdxKey key = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		deleteTSecGrpMembByGroupIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByGroupIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembByGroupIdxKey argKey )
	{
		YCFSecTSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGrpMembBuff> matchSet = new LinkedList<YCFSecTSecGrpMembBuff>();
		Iterator<YCFSecTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteTSecGrpMembByUserIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFSecTSecGrpMembByUserIdxKey key = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteTSecGrpMembByUserIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByUserIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembByUserIdxKey argKey )
	{
		YCFSecTSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGrpMembBuff> matchSet = new LinkedList<YCFSecTSecGrpMembBuff>();
		Iterator<YCFSecTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteTSecGrpMembByUUserIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId,
		UUID argSecUserId )
	{
		YCFSecTSecGrpMembByUUserIdxKey key = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		key.setRequiredSecUserId( argSecUserId );
		deleteTSecGrpMembByUUserIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByUUserIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGrpMembByUUserIdxKey argKey )
	{
		YCFSecTSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGrpMembBuff> matchSet = new LinkedList<YCFSecTSecGrpMembBuff>();
		Iterator<YCFSecTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
