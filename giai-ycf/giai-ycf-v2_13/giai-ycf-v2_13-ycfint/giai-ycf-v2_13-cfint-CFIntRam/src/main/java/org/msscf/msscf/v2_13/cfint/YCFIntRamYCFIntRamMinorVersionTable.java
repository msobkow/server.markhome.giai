
// Description: Java 11 in-memory RAM DbIO implementation for MinorVersion.

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
 *	YCFIntRamMinorVersionTable in-memory RAM DbIO implementation
 *	for MinorVersion.
 */
public class YCFIntRamMinorVersionTable
	implements IYCFIntMinorVersionTable
{
	private IYCFIntSchema schema;
	private Map< YCFIntMinorVersionPKey,
				YCFIntMinorVersionBuff > dictByPKey
		= new HashMap< YCFIntMinorVersionPKey,
				YCFIntMinorVersionBuff >();
	private Map< YCFIntMinorVersionByTenantIdxKey,
				Map< YCFIntMinorVersionPKey,
					YCFIntMinorVersionBuff >> dictByTenantIdx
		= new HashMap< YCFIntMinorVersionByTenantIdxKey,
				Map< YCFIntMinorVersionPKey,
					YCFIntMinorVersionBuff >>();
	private Map< YCFIntMinorVersionByMajorVerIdxKey,
				Map< YCFIntMinorVersionPKey,
					YCFIntMinorVersionBuff >> dictByMajorVerIdx
		= new HashMap< YCFIntMinorVersionByMajorVerIdxKey,
				Map< YCFIntMinorVersionPKey,
					YCFIntMinorVersionBuff >>();
	private Map< YCFIntMinorVersionByNameIdxKey,
			YCFIntMinorVersionBuff > dictByNameIdx
		= new HashMap< YCFIntMinorVersionByNameIdxKey,
			YCFIntMinorVersionBuff >();

	public YCFIntRamMinorVersionTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createMinorVersion( YCFSecAuthorization Authorization,
		YCFIntMinorVersionBuff Buff )
	{
		final String S_ProcName = "createMinorVersion";
		YCFIntMinorVersionPKey pkey = schema.getFactoryMinorVersion().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFIntRamTenantTable)schema.getTableTenant()).nextMinorVersionIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFIntMinorVersionByTenantIdxKey keyTenantIdx = schema.getFactoryMinorVersion().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx = schema.getFactoryMinorVersion().newMajorVerIdxKey();
		keyMajorVerIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyMajorVerIdx.setRequiredMajorVersionId( Buff.getRequiredMajorVersionId() );

		YCFIntMinorVersionByNameIdxKey keyNameIdx = schema.getFactoryMinorVersion().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyNameIdx.setRequiredMajorVersionId( Buff.getRequiredMajorVersionId() );
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"MinorVersionNameIdx",
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
				if( null == schema.getTableMajorVersion().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredMajorVersionId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ParentMajorVersion",
						"MajorVersion",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff > subdictMajorVerIdx;
		if( dictByMajorVerIdx.containsKey( keyMajorVerIdx ) ) {
			subdictMajorVerIdx = dictByMajorVerIdx.get( keyMajorVerIdx );
		}
		else {
			subdictMajorVerIdx = new HashMap< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff >();
			dictByMajorVerIdx.put( keyMajorVerIdx, subdictMajorVerIdx );
		}
		subdictMajorVerIdx.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

	}

	public YCFIntMinorVersionBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey PKey )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readDerived";
		YCFIntMinorVersionPKey key = schema.getFactoryMinorVersion().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntMinorVersionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMinorVersionBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey PKey )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readDerived";
		YCFIntMinorVersionPKey key = schema.getFactoryMinorVersion().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntMinorVersionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMinorVersionBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamMinorVersion.readAllDerived";
		YCFIntMinorVersionBuff[] retList = new YCFIntMinorVersionBuff[ dictByPKey.values().size() ];
		Iterator< YCFIntMinorVersionBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFIntMinorVersionBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readDerivedByTenantIdx";
		YCFIntMinorVersionByTenantIdxKey key = schema.getFactoryMinorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFIntMinorVersionBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFIntMinorVersionBuff[ subdictTenantIdx.size() ];
			Iterator< YCFIntMinorVersionBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff > subdictTenantIdx
				= new HashMap< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFIntMinorVersionBuff[0];
		}
		return( recArray );
	}

	public YCFIntMinorVersionBuff[] readDerivedByMajorVerIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MajorVersionId )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readDerivedByMajorVerIdx";
		YCFIntMinorVersionByMajorVerIdxKey key = schema.getFactoryMinorVersion().newMajorVerIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );

		YCFIntMinorVersionBuff[] recArray;
		if( dictByMajorVerIdx.containsKey( key ) ) {
			Map< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff > subdictMajorVerIdx
				= dictByMajorVerIdx.get( key );
			recArray = new YCFIntMinorVersionBuff[ subdictMajorVerIdx.size() ];
			Iterator< YCFIntMinorVersionBuff > iter = subdictMajorVerIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff > subdictMajorVerIdx
				= new HashMap< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff >();
			dictByMajorVerIdx.put( key, subdictMajorVerIdx );
			recArray = new YCFIntMinorVersionBuff[0];
		}
		return( recArray );
	}

	public YCFIntMinorVersionBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MajorVersionId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readDerivedByNameIdx";
		YCFIntMinorVersionByNameIdxKey key = schema.getFactoryMinorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		key.setRequiredName( Name );

		YCFIntMinorVersionBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMinorVersionBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readDerivedByIdIdx() ";
		YCFIntMinorVersionPKey key = schema.getFactoryMinorVersion().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFIntMinorVersionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMinorVersionBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey PKey )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readBuff";
		YCFIntMinorVersionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a104" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMinorVersionBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFIntMinorVersionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a104" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMinorVersionBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readAllBuff";
		YCFIntMinorVersionBuff buff;
		ArrayList<YCFIntMinorVersionBuff> filteredList = new ArrayList<YCFIntMinorVersionBuff>();
		YCFIntMinorVersionBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a104" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFIntMinorVersionBuff[0] ) );
	}

	public YCFIntMinorVersionBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readBuffByIdIdx() ";
		YCFIntMinorVersionBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a104" ) ) {
			return( (YCFIntMinorVersionBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntMinorVersionBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readBuffByTenantIdx() ";
		YCFIntMinorVersionBuff buff;
		ArrayList<YCFIntMinorVersionBuff> filteredList = new ArrayList<YCFIntMinorVersionBuff>();
		YCFIntMinorVersionBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a104" ) ) {
				filteredList.add( (YCFIntMinorVersionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntMinorVersionBuff[0] ) );
	}

	public YCFIntMinorVersionBuff[] readBuffByMajorVerIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MajorVersionId )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readBuffByMajorVerIdx() ";
		YCFIntMinorVersionBuff buff;
		ArrayList<YCFIntMinorVersionBuff> filteredList = new ArrayList<YCFIntMinorVersionBuff>();
		YCFIntMinorVersionBuff[] buffList = readDerivedByMajorVerIdx( Authorization,
			TenantId,
			MajorVersionId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a104" ) ) {
				filteredList.add( (YCFIntMinorVersionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntMinorVersionBuff[0] ) );
	}

	public YCFIntMinorVersionBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MajorVersionId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamMinorVersion.readBuffByNameIdx() ";
		YCFIntMinorVersionBuff buff = readDerivedByNameIdx( Authorization,
			TenantId,
			MajorVersionId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a104" ) ) {
			return( (YCFIntMinorVersionBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateMinorVersion( YCFSecAuthorization Authorization,
		YCFIntMinorVersionBuff Buff )
	{
		YCFIntMinorVersionPKey pkey = schema.getFactoryMinorVersion().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntMinorVersionBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateMinorVersion",
				"Existing record not found",
				"MinorVersion",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateMinorVersion",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFIntMinorVersionByTenantIdxKey existingKeyTenantIdx = schema.getFactoryMinorVersion().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntMinorVersionByTenantIdxKey newKeyTenantIdx = schema.getFactoryMinorVersion().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntMinorVersionByMajorVerIdxKey existingKeyMajorVerIdx = schema.getFactoryMinorVersion().newMajorVerIdxKey();
		existingKeyMajorVerIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyMajorVerIdx.setRequiredMajorVersionId( existing.getRequiredMajorVersionId() );

		YCFIntMinorVersionByMajorVerIdxKey newKeyMajorVerIdx = schema.getFactoryMinorVersion().newMajorVerIdxKey();
		newKeyMajorVerIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyMajorVerIdx.setRequiredMajorVersionId( Buff.getRequiredMajorVersionId() );

		YCFIntMinorVersionByNameIdxKey existingKeyNameIdx = schema.getFactoryMinorVersion().newNameIdxKey();
		existingKeyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyNameIdx.setRequiredMajorVersionId( existing.getRequiredMajorVersionId() );
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntMinorVersionByNameIdxKey newKeyNameIdx = schema.getFactoryMinorVersion().newNameIdxKey();
		newKeyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyNameIdx.setRequiredMajorVersionId( Buff.getRequiredMajorVersionId() );
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateMinorVersion",
					"MinorVersionNameIdx",
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
						"updateMinorVersion",
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
				if( null == schema.getTableMajorVersion().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredMajorVersionId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateMinorVersion",
						"Container",
						"ParentMajorVersion",
						"MajorVersion",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff > subdict;

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
			subdict = new HashMap< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByMajorVerIdx.get( existingKeyMajorVerIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByMajorVerIdx.containsKey( newKeyMajorVerIdx ) ) {
			subdict = dictByMajorVerIdx.get( newKeyMajorVerIdx );
		}
		else {
			subdict = new HashMap< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff >();
			dictByMajorVerIdx.put( newKeyMajorVerIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

	}

	public void deleteMinorVersion( YCFSecAuthorization Authorization,
		YCFIntMinorVersionBuff Buff )
	{
		final String S_ProcName = "YCFIntRamMinorVersionTable.deleteMinorVersion() ";
		String classCode;
		YCFIntMinorVersionPKey pkey = schema.getFactoryMinorVersion().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntMinorVersionBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteMinorVersion",
				pkey );
		}
		YCFIntMinorVersionByTenantIdxKey keyTenantIdx = schema.getFactoryMinorVersion().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx = schema.getFactoryMinorVersion().newMajorVerIdxKey();
		keyMajorVerIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMajorVerIdx.setRequiredMajorVersionId( existing.getRequiredMajorVersionId() );

		YCFIntMinorVersionByNameIdxKey keyNameIdx = schema.getFactoryMinorVersion().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredMajorVersionId( existing.getRequiredMajorVersionId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFIntMinorVersionPKey, YCFIntMinorVersionBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByMajorVerIdx.get( keyMajorVerIdx );
		subdict.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

	}
	public void deleteMinorVersionByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFIntMinorVersionPKey key = schema.getFactoryMinorVersion().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteMinorVersionByIdIdx( Authorization, key );
	}

	public void deleteMinorVersionByIdIdx( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFIntMinorVersionBuff cur;
		LinkedList<YCFIntMinorVersionBuff> matchSet = new LinkedList<YCFIntMinorVersionBuff>();
		Iterator<YCFIntMinorVersionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMinorVersionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMinorVersion().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteMinorVersion( Authorization, cur );
		}
	}

	public void deleteMinorVersionByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFIntMinorVersionByTenantIdxKey key = schema.getFactoryMinorVersion().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteMinorVersionByTenantIdx( Authorization, key );
	}

	public void deleteMinorVersionByTenantIdx( YCFSecAuthorization Authorization,
		YCFIntMinorVersionByTenantIdxKey argKey )
	{
		YCFIntMinorVersionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntMinorVersionBuff> matchSet = new LinkedList<YCFIntMinorVersionBuff>();
		Iterator<YCFIntMinorVersionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMinorVersionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMinorVersion().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteMinorVersion( Authorization, cur );
		}
	}

	public void deleteMinorVersionByMajorVerIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argMajorVersionId )
	{
		YCFIntMinorVersionByMajorVerIdxKey key = schema.getFactoryMinorVersion().newMajorVerIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredMajorVersionId( argMajorVersionId );
		deleteMinorVersionByMajorVerIdx( Authorization, key );
	}

	public void deleteMinorVersionByMajorVerIdx( YCFSecAuthorization Authorization,
		YCFIntMinorVersionByMajorVerIdxKey argKey )
	{
		YCFIntMinorVersionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntMinorVersionBuff> matchSet = new LinkedList<YCFIntMinorVersionBuff>();
		Iterator<YCFIntMinorVersionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMinorVersionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMinorVersion().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteMinorVersion( Authorization, cur );
		}
	}

	public void deleteMinorVersionByNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argMajorVersionId,
		String argName )
	{
		YCFIntMinorVersionByNameIdxKey key = schema.getFactoryMinorVersion().newNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredMajorVersionId( argMajorVersionId );
		key.setRequiredName( argName );
		deleteMinorVersionByNameIdx( Authorization, key );
	}

	public void deleteMinorVersionByNameIdx( YCFSecAuthorization Authorization,
		YCFIntMinorVersionByNameIdxKey argKey )
	{
		YCFIntMinorVersionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntMinorVersionBuff> matchSet = new LinkedList<YCFIntMinorVersionBuff>();
		Iterator<YCFIntMinorVersionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMinorVersionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMinorVersion().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteMinorVersion( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
