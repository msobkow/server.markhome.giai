
// Description: Java 11 in-memory RAM DbIO implementation for SecGroup.

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
 *	YCFSecRamSecGroupTable in-memory RAM DbIO implementation
 *	for SecGroup.
 */
public class YCFSecRamSecGroupTable
	implements IYCFSecSecGroupTable
{
	private IYCFSecSchema schema;
	private Map< YCFSecSecGroupPKey,
				YCFSecSecGroupBuff > dictByPKey
		= new HashMap< YCFSecSecGroupPKey,
				YCFSecSecGroupBuff >();
	private Map< YCFSecSecGroupByClusterIdxKey,
				Map< YCFSecSecGroupPKey,
					YCFSecSecGroupBuff >> dictByClusterIdx
		= new HashMap< YCFSecSecGroupByClusterIdxKey,
				Map< YCFSecSecGroupPKey,
					YCFSecSecGroupBuff >>();
	private Map< YCFSecSecGroupByClusterVisIdxKey,
				Map< YCFSecSecGroupPKey,
					YCFSecSecGroupBuff >> dictByClusterVisIdx
		= new HashMap< YCFSecSecGroupByClusterVisIdxKey,
				Map< YCFSecSecGroupPKey,
					YCFSecSecGroupBuff >>();
	private Map< YCFSecSecGroupByUNameIdxKey,
			YCFSecSecGroupBuff > dictByUNameIdx
		= new HashMap< YCFSecSecGroupByUNameIdxKey,
			YCFSecSecGroupBuff >();

	public YCFSecRamSecGroupTable( IYCFSecSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecGroup( YCFSecAuthorization Authorization,
		YCFSecSecGroupBuff Buff )
	{
		final String S_ProcName = "createSecGroup";
		YCFSecSecGroupPKey pkey = schema.getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupId( ((YCFSecRamClusterTable)schema.getTableCluster()).nextSecGroupIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecGroupId( pkey.getRequiredSecGroupId() );
		YCFSecSecGroupByClusterIdxKey keyClusterIdx = schema.getFactorySecGroup().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecGroupByClusterVisIdxKey keyClusterVisIdx = schema.getFactorySecGroup().newClusterVisIdxKey();
		keyClusterVisIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyClusterVisIdx.setRequiredIsVisible( Buff.getRequiredIsVisible() );

		YCFSecSecGroupByUNameIdxKey keyUNameIdx = schema.getFactorySecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecGroupUNameIdx",
				keyUNameIdx );
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
						"SecGroupCluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecSecGroupPKey, YCFSecSecGroupBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecSecGroupPKey, YCFSecSecGroupBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFSecSecGroupPKey, YCFSecSecGroupBuff > subdictClusterVisIdx;
		if( dictByClusterVisIdx.containsKey( keyClusterVisIdx ) ) {
			subdictClusterVisIdx = dictByClusterVisIdx.get( keyClusterVisIdx );
		}
		else {
			subdictClusterVisIdx = new HashMap< YCFSecSecGroupPKey, YCFSecSecGroupBuff >();
			dictByClusterVisIdx.put( keyClusterVisIdx, subdictClusterVisIdx );
		}
		subdictClusterVisIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFSecSecGroupBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readDerived";
		YCFSecSecGroupPKey key = schema.getFactorySecGroup().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGroupId( PKey.getRequiredSecGroupId() );
		YCFSecSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readDerived";
		YCFSecSecGroupPKey key = schema.getFactorySecGroup().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGroupId( PKey.getRequiredSecGroupId() );
		YCFSecSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFSecRamSecGroup.readAllDerived";
		YCFSecSecGroupBuff[] retList = new YCFSecSecGroupBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSecGroupBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSecGroupBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readDerivedByClusterIdx";
		YCFSecSecGroupByClusterIdxKey key = schema.getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecSecGroupBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecSecGroupPKey, YCFSecSecGroupBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecSecGroupBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecSecGroupBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGroupPKey, YCFSecSecGroupBuff > subdictClusterIdx
				= new HashMap< YCFSecSecGroupPKey, YCFSecSecGroupBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecSecGroupBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGroupBuff[] readDerivedByClusterVisIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readDerivedByClusterVisIdx";
		YCFSecSecGroupByClusterVisIdxKey key = schema.getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );

		YCFSecSecGroupBuff[] recArray;
		if( dictByClusterVisIdx.containsKey( key ) ) {
			Map< YCFSecSecGroupPKey, YCFSecSecGroupBuff > subdictClusterVisIdx
				= dictByClusterVisIdx.get( key );
			recArray = new YCFSecSecGroupBuff[ subdictClusterVisIdx.size() ];
			Iterator< YCFSecSecGroupBuff > iter = subdictClusterVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGroupPKey, YCFSecSecGroupBuff > subdictClusterVisIdx
				= new HashMap< YCFSecSecGroupPKey, YCFSecSecGroupBuff >();
			dictByClusterVisIdx.put( key, subdictClusterVisIdx );
			recArray = new YCFSecSecGroupBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGroupBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String Name )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readDerivedByUNameIdx";
		YCFSecSecGroupByUNameIdxKey key = schema.getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );

		YCFSecSecGroupBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readDerivedByIdIdx() ";
		YCFSecSecGroupPKey key = schema.getFactorySecGroup().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );

		YCFSecSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readBuff";
		YCFSecSecGroupBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecGroupPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSecGroupBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readAllBuff";
		YCFSecSecGroupBuff buff;
		ArrayList<YCFSecSecGroupBuff> filteredList = new ArrayList<YCFSecSecGroupBuff>();
		YCFSecSecGroupBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00c" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGroupBuff[0] ) );
	}

	public YCFSecSecGroupBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readBuffByIdIdx() ";
		YCFSecSecGroupBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecGroupId );
		if( ( buff != null ) && buff.getClassCode().equals( "a00c" ) ) {
			return( (YCFSecSecGroupBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecGroupBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readBuffByClusterIdx() ";
		YCFSecSecGroupBuff buff;
		ArrayList<YCFSecSecGroupBuff> filteredList = new ArrayList<YCFSecSecGroupBuff>();
		YCFSecSecGroupBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00c" ) ) {
				filteredList.add( (YCFSecSecGroupBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGroupBuff[0] ) );
	}

	public YCFSecSecGroupBuff[] readBuffByClusterVisIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readBuffByClusterVisIdx() ";
		YCFSecSecGroupBuff buff;
		ArrayList<YCFSecSecGroupBuff> filteredList = new ArrayList<YCFSecSecGroupBuff>();
		YCFSecSecGroupBuff[] buffList = readDerivedByClusterVisIdx( Authorization,
			ClusterId,
			IsVisible );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00c" ) ) {
				filteredList.add( (YCFSecSecGroupBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGroupBuff[0] ) );
	}

	public YCFSecSecGroupBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String Name )
	{
		final String S_ProcName = "YCFSecRamSecGroup.readBuffByUNameIdx() ";
		YCFSecSecGroupBuff buff = readDerivedByUNameIdx( Authorization,
			ClusterId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a00c" ) ) {
			return( (YCFSecSecGroupBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateSecGroup( YCFSecAuthorization Authorization,
		YCFSecSecGroupBuff Buff )
	{
		YCFSecSecGroupPKey pkey = schema.getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		YCFSecSecGroupBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecGroup",
				"Existing record not found",
				"SecGroup",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecGroup",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecSecGroupByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecGroup().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGroupByClusterIdxKey newKeyClusterIdx = schema.getFactorySecGroup().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecGroupByClusterVisIdxKey existingKeyClusterVisIdx = schema.getFactorySecGroup().newClusterVisIdxKey();
		existingKeyClusterVisIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyClusterVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFSecSecGroupByClusterVisIdxKey newKeyClusterVisIdx = schema.getFactorySecGroup().newClusterVisIdxKey();
		newKeyClusterVisIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyClusterVisIdx.setRequiredIsVisible( Buff.getRequiredIsVisible() );

		YCFSecSecGroupByUNameIdxKey existingKeyUNameIdx = schema.getFactorySecGroup().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFSecSecGroupByUNameIdxKey newKeyUNameIdx = schema.getFactorySecGroup().newUNameIdxKey();
		newKeyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecGroup",
					"SecGroupUNameIdx",
					newKeyUNameIdx );
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
						"updateSecGroup",
						"Container",
						"SecGroupCluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecSecGroupPKey, YCFSecSecGroupBuff > subdict;

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
			subdict = new HashMap< YCFSecSecGroupPKey, YCFSecSecGroupBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByClusterVisIdx.get( existingKeyClusterVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClusterVisIdx.containsKey( newKeyClusterVisIdx ) ) {
			subdict = dictByClusterVisIdx.get( newKeyClusterVisIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecGroupPKey, YCFSecSecGroupBuff >();
			dictByClusterVisIdx.put( newKeyClusterVisIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteSecGroup( YCFSecAuthorization Authorization,
		YCFSecSecGroupBuff Buff )
	{
		final String S_ProcName = "YCFSecRamSecGroupTable.deleteSecGroup() ";
		String classCode;
		YCFSecSecGroupPKey pkey = schema.getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		YCFSecSecGroupBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecGroup",
				pkey );
		}
					schema.getTableSecGroupForm().deleteSecGroupFormByGroupIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getTableSecGrpInc().deleteSecGrpIncByIncludeIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getTableSecGrpInc().deleteSecGrpIncByGroupIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
		YCFSecSecGroupByClusterIdxKey keyClusterIdx = schema.getFactorySecGroup().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGroupByClusterVisIdxKey keyClusterVisIdx = schema.getFactorySecGroup().newClusterVisIdxKey();
		keyClusterVisIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyClusterVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFSecSecGroupByUNameIdxKey keyUNameIdx = schema.getFactorySecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSecGroupPKey, YCFSecSecGroupBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByClusterVisIdx.get( keyClusterVisIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	public void deleteSecGroupByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId )
	{
		YCFSecSecGroupPKey key = schema.getFactorySecGroup().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		deleteSecGroupByIdIdx( Authorization, key );
	}

	public void deleteSecGroupByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSecGroupBuff cur;
		LinkedList<YCFSecSecGroupBuff> matchSet = new LinkedList<YCFSecSecGroupBuff>();
		Iterator<YCFSecSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupId() );
			deleteSecGroup( Authorization, cur );
		}
	}

	public void deleteSecGroupByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecSecGroupByClusterIdxKey key = schema.getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecGroupByClusterIdx( Authorization, key );
	}

	public void deleteSecGroupByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupByClusterIdxKey argKey )
	{
		YCFSecSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGroupBuff> matchSet = new LinkedList<YCFSecSecGroupBuff>();
		Iterator<YCFSecSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupId() );
			deleteSecGroup( Authorization, cur );
		}
	}

	public void deleteSecGroupByClusterVisIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		boolean argIsVisible )
	{
		YCFSecSecGroupByClusterVisIdxKey key = schema.getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredIsVisible( argIsVisible );
		deleteSecGroupByClusterVisIdx( Authorization, key );
	}

	public void deleteSecGroupByClusterVisIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupByClusterVisIdxKey argKey )
	{
		YCFSecSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGroupBuff> matchSet = new LinkedList<YCFSecSecGroupBuff>();
		Iterator<YCFSecSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupId() );
			deleteSecGroup( Authorization, cur );
		}
	}

	public void deleteSecGroupByUNameIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		String argName )
	{
		YCFSecSecGroupByUNameIdxKey key = schema.getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredName( argName );
		deleteSecGroupByUNameIdx( Authorization, key );
	}

	public void deleteSecGroupByUNameIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupByUNameIdxKey argKey )
	{
		YCFSecSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGroupBuff> matchSet = new LinkedList<YCFSecSecGroupBuff>();
		Iterator<YCFSecSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupId() );
			deleteSecGroup( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
