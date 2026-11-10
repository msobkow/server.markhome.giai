
// Description: Java 11 in-memory RAM DbIO implementation for TSecGroup.

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
 *	YCFSecRamTSecGroupTable in-memory RAM DbIO implementation
 *	for TSecGroup.
 */
public class YCFSecRamTSecGroupTable
	implements IYCFSecTSecGroupTable
{
	private IYCFSecSchema schema;
	private Map< YCFSecTSecGroupPKey,
				YCFSecTSecGroupBuff > dictByPKey
		= new HashMap< YCFSecTSecGroupPKey,
				YCFSecTSecGroupBuff >();
	private Map< YCFSecTSecGroupByTenantIdxKey,
				Map< YCFSecTSecGroupPKey,
					YCFSecTSecGroupBuff >> dictByTenantIdx
		= new HashMap< YCFSecTSecGroupByTenantIdxKey,
				Map< YCFSecTSecGroupPKey,
					YCFSecTSecGroupBuff >>();
	private Map< YCFSecTSecGroupByTenantVisIdxKey,
				Map< YCFSecTSecGroupPKey,
					YCFSecTSecGroupBuff >> dictByTenantVisIdx
		= new HashMap< YCFSecTSecGroupByTenantVisIdxKey,
				Map< YCFSecTSecGroupPKey,
					YCFSecTSecGroupBuff >>();
	private Map< YCFSecTSecGroupByUNameIdxKey,
			YCFSecTSecGroupBuff > dictByUNameIdx
		= new HashMap< YCFSecTSecGroupByUNameIdxKey,
			YCFSecTSecGroupBuff >();

	public YCFSecRamTSecGroupTable( IYCFSecSchema argSchema ) {
		schema = argSchema;
	}

	public void createTSecGroup( YCFSecAuthorization Authorization,
		YCFSecTSecGroupBuff Buff )
	{
		final String S_ProcName = "createTSecGroup";
		YCFSecTSecGroupPKey pkey = schema.getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGroupId( ((YCFSecRamTenantTable)schema.getTableTenant()).nextTSecGroupIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredTSecGroupId( pkey.getRequiredTSecGroupId() );
		YCFSecTSecGroupByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGroup().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFSecTSecGroupByTenantVisIdxKey keyTenantVisIdx = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		keyTenantVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyTenantVisIdx.setRequiredIsVisible( Buff.getRequiredIsVisible() );

		YCFSecTSecGroupByUNameIdxKey keyUNameIdx = schema.getFactoryTSecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TSecGroupUNameIdx",
				keyUNameIdx );
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
						"Container",
						"TSecGroupTenant",
						"Tenant",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff > subdictTenantVisIdx;
		if( dictByTenantVisIdx.containsKey( keyTenantVisIdx ) ) {
			subdictTenantVisIdx = dictByTenantVisIdx.get( keyTenantVisIdx );
		}
		else {
			subdictTenantVisIdx = new HashMap< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff >();
			dictByTenantVisIdx.put( keyTenantVisIdx, subdictTenantVisIdx );
		}
		subdictTenantVisIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFSecTSecGroupBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readDerived";
		YCFSecTSecGroupPKey key = schema.getFactoryTSecGroup().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGroupId( PKey.getRequiredTSecGroupId() );
		YCFSecTSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGroupBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readDerived";
		YCFSecTSecGroupPKey key = schema.getFactoryTSecGroup().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGroupId( PKey.getRequiredTSecGroupId() );
		YCFSecTSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGroupBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFSecRamTSecGroup.readAllDerived";
		YCFSecTSecGroupBuff[] retList = new YCFSecTSecGroupBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecTSecGroupBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecTSecGroupBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readDerivedByTenantIdx";
		YCFSecTSecGroupByTenantIdxKey key = schema.getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFSecTSecGroupBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFSecTSecGroupBuff[ subdictTenantIdx.size() ];
			Iterator< YCFSecTSecGroupBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff > subdictTenantIdx
				= new HashMap< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFSecTSecGroupBuff[0];
		}
		return( recArray );
	}

	public YCFSecTSecGroupBuff[] readDerivedByTenantVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		boolean IsVisible )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readDerivedByTenantVisIdx";
		YCFSecTSecGroupByTenantVisIdxKey key = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );

		YCFSecTSecGroupBuff[] recArray;
		if( dictByTenantVisIdx.containsKey( key ) ) {
			Map< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff > subdictTenantVisIdx
				= dictByTenantVisIdx.get( key );
			recArray = new YCFSecTSecGroupBuff[ subdictTenantVisIdx.size() ];
			Iterator< YCFSecTSecGroupBuff > iter = subdictTenantVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff > subdictTenantVisIdx
				= new HashMap< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff >();
			dictByTenantVisIdx.put( key, subdictTenantVisIdx );
			recArray = new YCFSecTSecGroupBuff[0];
		}
		return( recArray );
	}

	public YCFSecTSecGroupBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String Name )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readDerivedByUNameIdx";
		YCFSecTSecGroupByUNameIdxKey key = schema.getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );

		YCFSecTSecGroupBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGroupBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readDerivedByIdIdx() ";
		YCFSecTSecGroupPKey key = schema.getFactoryTSecGroup().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );

		YCFSecTSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGroupBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readBuff";
		YCFSecTSecGroupBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a016" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGroupBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecTSecGroupBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a016" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTSecGroupBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readAllBuff";
		YCFSecTSecGroupBuff buff;
		ArrayList<YCFSecTSecGroupBuff> filteredList = new ArrayList<YCFSecTSecGroupBuff>();
		YCFSecTSecGroupBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a016" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGroupBuff[0] ) );
	}

	public YCFSecTSecGroupBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readBuffByIdIdx() ";
		YCFSecTSecGroupBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			TSecGroupId );
		if( ( buff != null ) && buff.getClassCode().equals( "a016" ) ) {
			return( (YCFSecTSecGroupBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecTSecGroupBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readBuffByTenantIdx() ";
		YCFSecTSecGroupBuff buff;
		ArrayList<YCFSecTSecGroupBuff> filteredList = new ArrayList<YCFSecTSecGroupBuff>();
		YCFSecTSecGroupBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a016" ) ) {
				filteredList.add( (YCFSecTSecGroupBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGroupBuff[0] ) );
	}

	public YCFSecTSecGroupBuff[] readBuffByTenantVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		boolean IsVisible )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readBuffByTenantVisIdx() ";
		YCFSecTSecGroupBuff buff;
		ArrayList<YCFSecTSecGroupBuff> filteredList = new ArrayList<YCFSecTSecGroupBuff>();
		YCFSecTSecGroupBuff[] buffList = readDerivedByTenantVisIdx( Authorization,
			TenantId,
			IsVisible );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a016" ) ) {
				filteredList.add( (YCFSecTSecGroupBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecTSecGroupBuff[0] ) );
	}

	public YCFSecTSecGroupBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String Name )
	{
		final String S_ProcName = "YCFSecRamTSecGroup.readBuffByUNameIdx() ";
		YCFSecTSecGroupBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a016" ) ) {
			return( (YCFSecTSecGroupBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateTSecGroup( YCFSecAuthorization Authorization,
		YCFSecTSecGroupBuff Buff )
	{
		YCFSecTSecGroupPKey pkey = schema.getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		YCFSecTSecGroupBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTSecGroup",
				"Existing record not found",
				"TSecGroup",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTSecGroup",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecTSecGroupByTenantIdxKey existingKeyTenantIdx = schema.getFactoryTSecGroup().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFSecTSecGroupByTenantIdxKey newKeyTenantIdx = schema.getFactoryTSecGroup().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFSecTSecGroupByTenantVisIdxKey existingKeyTenantVisIdx = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		existingKeyTenantVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyTenantVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFSecTSecGroupByTenantVisIdxKey newKeyTenantVisIdx = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		newKeyTenantVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyTenantVisIdx.setRequiredIsVisible( Buff.getRequiredIsVisible() );

		YCFSecTSecGroupByUNameIdxKey existingKeyUNameIdx = schema.getFactoryTSecGroup().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFSecTSecGroupByUNameIdxKey newKeyUNameIdx = schema.getFactoryTSecGroup().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTSecGroup",
					"TSecGroupUNameIdx",
					newKeyUNameIdx );
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
						"updateTSecGroup",
						"Container",
						"TSecGroupTenant",
						"Tenant",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff > subdict;

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
			subdict = new HashMap< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTenantVisIdx.get( existingKeyTenantVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTenantVisIdx.containsKey( newKeyTenantVisIdx ) ) {
			subdict = dictByTenantVisIdx.get( newKeyTenantVisIdx );
		}
		else {
			subdict = new HashMap< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff >();
			dictByTenantVisIdx.put( newKeyTenantVisIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteTSecGroup( YCFSecAuthorization Authorization,
		YCFSecTSecGroupBuff Buff )
	{
		final String S_ProcName = "YCFSecRamTSecGroupTable.deleteTSecGroup() ";
		String classCode;
		YCFSecTSecGroupPKey pkey = schema.getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		YCFSecTSecGroupBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTSecGroup",
				pkey );
		}
					schema.getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
					schema.getTableTSecGrpMemb().deleteTSecGrpMembByGroupIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
					schema.getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
		YCFSecTSecGroupByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGroup().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFSecTSecGroupByTenantVisIdxKey keyTenantVisIdx = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		keyTenantVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTenantVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFSecTSecGroupByUNameIdxKey keyUNameIdx = schema.getFactoryTSecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecTSecGroupPKey, YCFSecTSecGroupBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByTenantVisIdx.get( keyTenantVisIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	public void deleteTSecGroupByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId )
	{
		YCFSecTSecGroupPKey key = schema.getFactoryTSecGroup().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		deleteTSecGroupByIdIdx( Authorization, key );
	}

	public void deleteTSecGroupByIdIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecTSecGroupBuff cur;
		LinkedList<YCFSecTSecGroupBuff> matchSet = new LinkedList<YCFSecTSecGroupBuff>();
		Iterator<YCFSecTSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGroupId() );
			deleteTSecGroup( Authorization, cur );
		}
	}

	public void deleteTSecGroupByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFSecTSecGroupByTenantIdxKey key = schema.getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTSecGroupByTenantIdx( Authorization, key );
	}

	public void deleteTSecGroupByTenantIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGroupByTenantIdxKey argKey )
	{
		YCFSecTSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGroupBuff> matchSet = new LinkedList<YCFSecTSecGroupBuff>();
		Iterator<YCFSecTSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGroupId() );
			deleteTSecGroup( Authorization, cur );
		}
	}

	public void deleteTSecGroupByTenantVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		boolean argIsVisible )
	{
		YCFSecTSecGroupByTenantVisIdxKey key = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredIsVisible( argIsVisible );
		deleteTSecGroupByTenantVisIdx( Authorization, key );
	}

	public void deleteTSecGroupByTenantVisIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGroupByTenantVisIdxKey argKey )
	{
		YCFSecTSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGroupBuff> matchSet = new LinkedList<YCFSecTSecGroupBuff>();
		Iterator<YCFSecTSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGroupId() );
			deleteTSecGroup( Authorization, cur );
		}
	}

	public void deleteTSecGroupByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		String argName )
	{
		YCFSecTSecGroupByUNameIdxKey key = schema.getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredName( argName );
		deleteTSecGroupByUNameIdx( Authorization, key );
	}

	public void deleteTSecGroupByUNameIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGroupByUNameIdxKey argKey )
	{
		YCFSecTSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTSecGroupBuff> matchSet = new LinkedList<YCFSecTSecGroupBuff>();
		Iterator<YCFSecTSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGroupId() );
			deleteTSecGroup( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
