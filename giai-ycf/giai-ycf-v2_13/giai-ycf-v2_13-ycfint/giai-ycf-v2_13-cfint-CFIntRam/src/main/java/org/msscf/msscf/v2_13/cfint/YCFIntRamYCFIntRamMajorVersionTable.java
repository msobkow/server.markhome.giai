
// Description: Java 11 in-memory RAM DbIO implementation for MajorVersion.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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
 *	YCFIntRamMajorVersionTable in-memory RAM DbIO implementation
 *	for MajorVersion.
 */
public class YCFIntRamMajorVersionTable
	implements IYCFIntMajorVersionTable
{
	private IYCFIntSchema schema;
	private Map< YCFIntMajorVersionPKey,
				YCFIntMajorVersionBuff > dictByPKey
		= new HashMap< YCFIntMajorVersionPKey,
				YCFIntMajorVersionBuff >();
	private Map< YCFIntMajorVersionByTenantIdxKey,
				Map< YCFIntMajorVersionPKey,
					YCFIntMajorVersionBuff >> dictByTenantIdx
		= new HashMap< YCFIntMajorVersionByTenantIdxKey,
				Map< YCFIntMajorVersionPKey,
					YCFIntMajorVersionBuff >>();
	private Map< YCFIntMajorVersionBySubProjectIdxKey,
				Map< YCFIntMajorVersionPKey,
					YCFIntMajorVersionBuff >> dictBySubProjectIdx
		= new HashMap< YCFIntMajorVersionBySubProjectIdxKey,
				Map< YCFIntMajorVersionPKey,
					YCFIntMajorVersionBuff >>();
	private Map< YCFIntMajorVersionByNameIdxKey,
			YCFIntMajorVersionBuff > dictByNameIdx
		= new HashMap< YCFIntMajorVersionByNameIdxKey,
			YCFIntMajorVersionBuff >();

	public YCFIntRamMajorVersionTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createMajorVersion( YCFSecAuthorization Authorization,
		YCFIntMajorVersionBuff Buff )
	{
		final String S_ProcName = "createMajorVersion";
		YCFIntMajorVersionPKey pkey = schema.getFactoryMajorVersion().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFIntRamTenantTable)schema.getTableTenant()).nextMajorVersionIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFIntMajorVersionByTenantIdxKey keyTenantIdx = schema.getFactoryMajorVersion().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntMajorVersionBySubProjectIdxKey keySubProjectIdx = schema.getFactoryMajorVersion().newSubProjectIdxKey();
		keySubProjectIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keySubProjectIdx.setRequiredSubProjectId( Buff.getRequiredSubProjectId() );

		YCFIntMajorVersionByNameIdxKey keyNameIdx = schema.getFactoryMajorVersion().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyNameIdx.setRequiredSubProjectId( Buff.getRequiredSubProjectId() );
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"MajorVersionNameIdx",
				keyNameIdx );
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
						"Tenant",
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
				if( null == schema.getTableSubProject().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredSubProjectId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ParentSubProject",
						"SubProject",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff > subdictSubProjectIdx;
		if( dictBySubProjectIdx.containsKey( keySubProjectIdx ) ) {
			subdictSubProjectIdx = dictBySubProjectIdx.get( keySubProjectIdx );
		}
		else {
			subdictSubProjectIdx = new HashMap< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff >();
			dictBySubProjectIdx.put( keySubProjectIdx, subdictSubProjectIdx );
		}
		subdictSubProjectIdx.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

	}

	public YCFIntMajorVersionBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntMajorVersionPKey PKey )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readDerived";
		YCFIntMajorVersionPKey key = schema.getFactoryMajorVersion().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntMajorVersionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMajorVersionBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntMajorVersionPKey PKey )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readDerived";
		YCFIntMajorVersionPKey key = schema.getFactoryMajorVersion().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntMajorVersionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMajorVersionBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamMajorVersion.readAllDerived";
		YCFIntMajorVersionBuff[] retList = new YCFIntMajorVersionBuff[ dictByPKey.values().size() ];
		Iterator< YCFIntMajorVersionBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFIntMajorVersionBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readDerivedByTenantIdx";
		YCFIntMajorVersionByTenantIdxKey key = schema.getFactoryMajorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFIntMajorVersionBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFIntMajorVersionBuff[ subdictTenantIdx.size() ];
			Iterator< YCFIntMajorVersionBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff > subdictTenantIdx
				= new HashMap< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFIntMajorVersionBuff[0];
		}
		return( recArray );
	}

	public YCFIntMajorVersionBuff[] readDerivedBySubProjectIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SubProjectId )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readDerivedBySubProjectIdx";
		YCFIntMajorVersionBySubProjectIdxKey key = schema.getFactoryMajorVersion().newSubProjectIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSubProjectId( SubProjectId );

		YCFIntMajorVersionBuff[] recArray;
		if( dictBySubProjectIdx.containsKey( key ) ) {
			Map< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff > subdictSubProjectIdx
				= dictBySubProjectIdx.get( key );
			recArray = new YCFIntMajorVersionBuff[ subdictSubProjectIdx.size() ];
			Iterator< YCFIntMajorVersionBuff > iter = subdictSubProjectIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff > subdictSubProjectIdx
				= new HashMap< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff >();
			dictBySubProjectIdx.put( key, subdictSubProjectIdx );
			recArray = new YCFIntMajorVersionBuff[0];
		}
		return( recArray );
	}

	public YCFIntMajorVersionBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SubProjectId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readDerivedByNameIdx";
		YCFIntMajorVersionByNameIdxKey key = schema.getFactoryMajorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSubProjectId( SubProjectId );
		key.setRequiredName( Name );

		YCFIntMajorVersionBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMajorVersionBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readDerivedByIdIdx() ";
		YCFIntMajorVersionPKey key = schema.getFactoryMajorVersion().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFIntMajorVersionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMajorVersionBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntMajorVersionPKey PKey )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readBuff";
		YCFIntMajorVersionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a102" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMajorVersionBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntMajorVersionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFIntMajorVersionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a102" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMajorVersionBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readAllBuff";
		YCFIntMajorVersionBuff buff;
		ArrayList<YCFIntMajorVersionBuff> filteredList = new ArrayList<YCFIntMajorVersionBuff>();
		YCFIntMajorVersionBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a102" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFIntMajorVersionBuff[0] ) );
	}

	public YCFIntMajorVersionBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readBuffByIdIdx() ";
		YCFIntMajorVersionBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a102" ) ) {
			return( (YCFIntMajorVersionBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntMajorVersionBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readBuffByTenantIdx() ";
		YCFIntMajorVersionBuff buff;
		ArrayList<YCFIntMajorVersionBuff> filteredList = new ArrayList<YCFIntMajorVersionBuff>();
		YCFIntMajorVersionBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a102" ) ) {
				filteredList.add( (YCFIntMajorVersionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntMajorVersionBuff[0] ) );
	}

	public YCFIntMajorVersionBuff[] readBuffBySubProjectIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SubProjectId )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readBuffBySubProjectIdx() ";
		YCFIntMajorVersionBuff buff;
		ArrayList<YCFIntMajorVersionBuff> filteredList = new ArrayList<YCFIntMajorVersionBuff>();
		YCFIntMajorVersionBuff[] buffList = readDerivedBySubProjectIdx( Authorization,
			TenantId,
			SubProjectId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a102" ) ) {
				filteredList.add( (YCFIntMajorVersionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntMajorVersionBuff[0] ) );
	}

	public YCFIntMajorVersionBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SubProjectId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamMajorVersion.readBuffByNameIdx() ";
		YCFIntMajorVersionBuff buff = readDerivedByNameIdx( Authorization,
			TenantId,
			SubProjectId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a102" ) ) {
			return( (YCFIntMajorVersionBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateMajorVersion( YCFSecAuthorization Authorization,
		YCFIntMajorVersionBuff Buff )
	{
		YCFIntMajorVersionPKey pkey = schema.getFactoryMajorVersion().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntMajorVersionBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateMajorVersion",
				"Existing record not found",
				"MajorVersion",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateMajorVersion",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFIntMajorVersionByTenantIdxKey existingKeyTenantIdx = schema.getFactoryMajorVersion().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntMajorVersionByTenantIdxKey newKeyTenantIdx = schema.getFactoryMajorVersion().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntMajorVersionBySubProjectIdxKey existingKeySubProjectIdx = schema.getFactoryMajorVersion().newSubProjectIdxKey();
		existingKeySubProjectIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeySubProjectIdx.setRequiredSubProjectId( existing.getRequiredSubProjectId() );

		YCFIntMajorVersionBySubProjectIdxKey newKeySubProjectIdx = schema.getFactoryMajorVersion().newSubProjectIdxKey();
		newKeySubProjectIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeySubProjectIdx.setRequiredSubProjectId( Buff.getRequiredSubProjectId() );

		YCFIntMajorVersionByNameIdxKey existingKeyNameIdx = schema.getFactoryMajorVersion().newNameIdxKey();
		existingKeyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyNameIdx.setRequiredSubProjectId( existing.getRequiredSubProjectId() );
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntMajorVersionByNameIdxKey newKeyNameIdx = schema.getFactoryMajorVersion().newNameIdxKey();
		newKeyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyNameIdx.setRequiredSubProjectId( Buff.getRequiredSubProjectId() );
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateMajorVersion",
					"MajorVersionNameIdx",
					newKeyNameIdx );
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
						"updateMajorVersion",
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSubProject().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredSubProjectId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateMajorVersion",
						"Container",
						"ParentSubProject",
						"SubProject",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff > subdict;

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
			subdict = new HashMap< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictBySubProjectIdx.get( existingKeySubProjectIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySubProjectIdx.containsKey( newKeySubProjectIdx ) ) {
			subdict = dictBySubProjectIdx.get( newKeySubProjectIdx );
		}
		else {
			subdict = new HashMap< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff >();
			dictBySubProjectIdx.put( newKeySubProjectIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

	}

	public void deleteMajorVersion( YCFSecAuthorization Authorization,
		YCFIntMajorVersionBuff Buff )
	{
		final String S_ProcName = "YCFIntRamMajorVersionTable.deleteMajorVersion() ";
		String classCode;
		YCFIntMajorVersionPKey pkey = schema.getFactoryMajorVersion().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntMajorVersionBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteMajorVersion",
				pkey );
		}
					schema.getTableMinorVersion().deleteMinorVersionByMajorVerIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFIntMajorVersionByTenantIdxKey keyTenantIdx = schema.getFactoryMajorVersion().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntMajorVersionBySubProjectIdxKey keySubProjectIdx = schema.getFactoryMajorVersion().newSubProjectIdxKey();
		keySubProjectIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySubProjectIdx.setRequiredSubProjectId( existing.getRequiredSubProjectId() );

		YCFIntMajorVersionByNameIdxKey keyNameIdx = schema.getFactoryMajorVersion().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredSubProjectId( existing.getRequiredSubProjectId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFIntMajorVersionPKey, YCFIntMajorVersionBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictBySubProjectIdx.get( keySubProjectIdx );
		subdict.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

	}
	public void deleteMajorVersionByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFIntMajorVersionPKey key = schema.getFactoryMajorVersion().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteMajorVersionByIdIdx( Authorization, key );
	}

	public void deleteMajorVersionByIdIdx( YCFSecAuthorization Authorization,
		YCFIntMajorVersionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFIntMajorVersionBuff cur;
		LinkedList<YCFIntMajorVersionBuff> matchSet = new LinkedList<YCFIntMajorVersionBuff>();
		Iterator<YCFIntMajorVersionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMajorVersionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMajorVersion().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteMajorVersion( Authorization, cur );
		}
	}

	public void deleteMajorVersionByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFIntMajorVersionByTenantIdxKey key = schema.getFactoryMajorVersion().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteMajorVersionByTenantIdx( Authorization, key );
	}

	public void deleteMajorVersionByTenantIdx( YCFSecAuthorization Authorization,
		YCFIntMajorVersionByTenantIdxKey argKey )
	{
		YCFIntMajorVersionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntMajorVersionBuff> matchSet = new LinkedList<YCFIntMajorVersionBuff>();
		Iterator<YCFIntMajorVersionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMajorVersionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMajorVersion().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteMajorVersion( Authorization, cur );
		}
	}

	public void deleteMajorVersionBySubProjectIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSubProjectId )
	{
		YCFIntMajorVersionBySubProjectIdxKey key = schema.getFactoryMajorVersion().newSubProjectIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSubProjectId( argSubProjectId );
		deleteMajorVersionBySubProjectIdx( Authorization, key );
	}

	public void deleteMajorVersionBySubProjectIdx( YCFSecAuthorization Authorization,
		YCFIntMajorVersionBySubProjectIdxKey argKey )
	{
		YCFIntMajorVersionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntMajorVersionBuff> matchSet = new LinkedList<YCFIntMajorVersionBuff>();
		Iterator<YCFIntMajorVersionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMajorVersionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMajorVersion().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteMajorVersion( Authorization, cur );
		}
	}

	public void deleteMajorVersionByNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSubProjectId,
		String argName )
	{
		YCFIntMajorVersionByNameIdxKey key = schema.getFactoryMajorVersion().newNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSubProjectId( argSubProjectId );
		key.setRequiredName( argName );
		deleteMajorVersionByNameIdx( Authorization, key );
	}

	public void deleteMajorVersionByNameIdx( YCFSecAuthorization Authorization,
		YCFIntMajorVersionByNameIdxKey argKey )
	{
		YCFIntMajorVersionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntMajorVersionBuff> matchSet = new LinkedList<YCFIntMajorVersionBuff>();
		Iterator<YCFIntMajorVersionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMajorVersionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMajorVersion().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteMajorVersion( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
