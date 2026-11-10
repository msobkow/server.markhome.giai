
// Description: Java 11 in-memory RAM DbIO implementation for TopDomain.

/*
 *	org.mssycf.mssycf.YCFBam
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
 *	YCFBamRamTopDomainTable in-memory RAM DbIO implementation
 *	for TopDomain.
 */
public class YCFBamRamTopDomainTable
	implements IYCFBamTopDomainTable
{
	private IYCFBamSchema schema;
	private Map< YCFIntTopDomainPKey,
				YCFIntTopDomainBuff > dictByPKey
		= new HashMap< YCFIntTopDomainPKey,
				YCFIntTopDomainBuff >();
	private Map< YCFIntTopDomainByTenantIdxKey,
				Map< YCFIntTopDomainPKey,
					YCFIntTopDomainBuff >> dictByTenantIdx
		= new HashMap< YCFIntTopDomainByTenantIdxKey,
				Map< YCFIntTopDomainPKey,
					YCFIntTopDomainBuff >>();
	private Map< YCFIntTopDomainByTldIdxKey,
				Map< YCFIntTopDomainPKey,
					YCFIntTopDomainBuff >> dictByTldIdx
		= new HashMap< YCFIntTopDomainByTldIdxKey,
				Map< YCFIntTopDomainPKey,
					YCFIntTopDomainBuff >>();
	private Map< YCFIntTopDomainByNameIdxKey,
			YCFIntTopDomainBuff > dictByNameIdx
		= new HashMap< YCFIntTopDomainByNameIdxKey,
			YCFIntTopDomainBuff >();

	public YCFBamRamTopDomainTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createTopDomain( YCFSecAuthorization Authorization,
		YCFIntTopDomainBuff Buff )
	{
		final String S_ProcName = "createTopDomain";
		YCFIntTopDomainPKey pkey = schema.getFactoryTopDomain().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextTopDomainIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFIntTopDomainByTenantIdxKey keyTenantIdx = schema.getFactoryTopDomain().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntTopDomainByTldIdxKey keyTldIdx = schema.getFactoryTopDomain().newTldIdxKey();
		keyTldIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyTldIdx.setRequiredTldId( Buff.getRequiredTldId() );

		YCFIntTopDomainByNameIdxKey keyNameIdx = schema.getFactoryTopDomain().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyNameIdx.setRequiredTldId( Buff.getRequiredTldId() );
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TopDomNameIdx",
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
				if( null == schema.getTableTld().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTldId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ParentTld",
						"Tld",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFIntTopDomainPKey, YCFIntTopDomainBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFIntTopDomainPKey, YCFIntTopDomainBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFIntTopDomainPKey, YCFIntTopDomainBuff > subdictTldIdx;
		if( dictByTldIdx.containsKey( keyTldIdx ) ) {
			subdictTldIdx = dictByTldIdx.get( keyTldIdx );
		}
		else {
			subdictTldIdx = new HashMap< YCFIntTopDomainPKey, YCFIntTopDomainBuff >();
			dictByTldIdx.put( keyTldIdx, subdictTldIdx );
		}
		subdictTldIdx.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

	}

	public YCFIntTopDomainBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntTopDomainPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readDerived";
		YCFIntTopDomainPKey key = schema.getFactoryTopDomain().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntTopDomainBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopDomainBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntTopDomainPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readDerived";
		YCFIntTopDomainPKey key = schema.getFactoryTopDomain().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntTopDomainBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopDomainBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamTopDomain.readAllDerived";
		YCFIntTopDomainBuff[] retList = new YCFIntTopDomainBuff[ dictByPKey.values().size() ];
		Iterator< YCFIntTopDomainBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFIntTopDomainBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readDerivedByTenantIdx";
		YCFIntTopDomainByTenantIdxKey key = schema.getFactoryTopDomain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFIntTopDomainBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFIntTopDomainPKey, YCFIntTopDomainBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFIntTopDomainBuff[ subdictTenantIdx.size() ];
			Iterator< YCFIntTopDomainBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntTopDomainPKey, YCFIntTopDomainBuff > subdictTenantIdx
				= new HashMap< YCFIntTopDomainPKey, YCFIntTopDomainBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFIntTopDomainBuff[0];
		}
		return( recArray );
	}

	public YCFIntTopDomainBuff[] readDerivedByTldIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TldId )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readDerivedByTldIdx";
		YCFIntTopDomainByTldIdxKey key = schema.getFactoryTopDomain().newTldIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTldId( TldId );

		YCFIntTopDomainBuff[] recArray;
		if( dictByTldIdx.containsKey( key ) ) {
			Map< YCFIntTopDomainPKey, YCFIntTopDomainBuff > subdictTldIdx
				= dictByTldIdx.get( key );
			recArray = new YCFIntTopDomainBuff[ subdictTldIdx.size() ];
			Iterator< YCFIntTopDomainBuff > iter = subdictTldIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntTopDomainPKey, YCFIntTopDomainBuff > subdictTldIdx
				= new HashMap< YCFIntTopDomainPKey, YCFIntTopDomainBuff >();
			dictByTldIdx.put( key, subdictTldIdx );
			recArray = new YCFIntTopDomainBuff[0];
		}
		return( recArray );
	}

	public YCFIntTopDomainBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TldId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readDerivedByNameIdx";
		YCFIntTopDomainByNameIdxKey key = schema.getFactoryTopDomain().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTldId( TldId );
		key.setRequiredName( Name );

		YCFIntTopDomainBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopDomainBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readDerivedByIdIdx() ";
		YCFIntTopDomainPKey key = schema.getFactoryTopDomain().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFIntTopDomainBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopDomainBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntTopDomainPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readBuff";
		YCFIntTopDomainBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a107" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopDomainBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntTopDomainPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFIntTopDomainBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a107" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopDomainBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readAllBuff";
		YCFIntTopDomainBuff buff;
		ArrayList<YCFIntTopDomainBuff> filteredList = new ArrayList<YCFIntTopDomainBuff>();
		YCFIntTopDomainBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a107" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFIntTopDomainBuff[0] ) );
	}

	public YCFIntTopDomainBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readBuffByIdIdx() ";
		YCFIntTopDomainBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a107" ) ) {
			return( (YCFIntTopDomainBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntTopDomainBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readBuffByTenantIdx() ";
		YCFIntTopDomainBuff buff;
		ArrayList<YCFIntTopDomainBuff> filteredList = new ArrayList<YCFIntTopDomainBuff>();
		YCFIntTopDomainBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a107" ) ) {
				filteredList.add( (YCFIntTopDomainBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntTopDomainBuff[0] ) );
	}

	public YCFIntTopDomainBuff[] readBuffByTldIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TldId )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readBuffByTldIdx() ";
		YCFIntTopDomainBuff buff;
		ArrayList<YCFIntTopDomainBuff> filteredList = new ArrayList<YCFIntTopDomainBuff>();
		YCFIntTopDomainBuff[] buffList = readDerivedByTldIdx( Authorization,
			TenantId,
			TldId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a107" ) ) {
				filteredList.add( (YCFIntTopDomainBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntTopDomainBuff[0] ) );
	}

	public YCFIntTopDomainBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TldId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTopDomain.readBuffByNameIdx() ";
		YCFIntTopDomainBuff buff = readDerivedByNameIdx( Authorization,
			TenantId,
			TldId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a107" ) ) {
			return( (YCFIntTopDomainBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateTopDomain( YCFSecAuthorization Authorization,
		YCFIntTopDomainBuff Buff )
	{
		YCFIntTopDomainPKey pkey = schema.getFactoryTopDomain().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntTopDomainBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTopDomain",
				"Existing record not found",
				"TopDomain",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTopDomain",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFIntTopDomainByTenantIdxKey existingKeyTenantIdx = schema.getFactoryTopDomain().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntTopDomainByTenantIdxKey newKeyTenantIdx = schema.getFactoryTopDomain().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntTopDomainByTldIdxKey existingKeyTldIdx = schema.getFactoryTopDomain().newTldIdxKey();
		existingKeyTldIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyTldIdx.setRequiredTldId( existing.getRequiredTldId() );

		YCFIntTopDomainByTldIdxKey newKeyTldIdx = schema.getFactoryTopDomain().newTldIdxKey();
		newKeyTldIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyTldIdx.setRequiredTldId( Buff.getRequiredTldId() );

		YCFIntTopDomainByNameIdxKey existingKeyNameIdx = schema.getFactoryTopDomain().newNameIdxKey();
		existingKeyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyNameIdx.setRequiredTldId( existing.getRequiredTldId() );
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntTopDomainByNameIdxKey newKeyNameIdx = schema.getFactoryTopDomain().newNameIdxKey();
		newKeyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyNameIdx.setRequiredTldId( Buff.getRequiredTldId() );
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTopDomain",
					"TopDomNameIdx",
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
						"updateTopDomain",
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
				if( null == schema.getTableTld().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTldId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTopDomain",
						"Container",
						"ParentTld",
						"Tld",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFIntTopDomainPKey, YCFIntTopDomainBuff > subdict;

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
			subdict = new HashMap< YCFIntTopDomainPKey, YCFIntTopDomainBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTldIdx.get( existingKeyTldIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTldIdx.containsKey( newKeyTldIdx ) ) {
			subdict = dictByTldIdx.get( newKeyTldIdx );
		}
		else {
			subdict = new HashMap< YCFIntTopDomainPKey, YCFIntTopDomainBuff >();
			dictByTldIdx.put( newKeyTldIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

	}

	public void deleteTopDomain( YCFSecAuthorization Authorization,
		YCFIntTopDomainBuff Buff )
	{
		final String S_ProcName = "YCFBamRamTopDomainTable.deleteTopDomain() ";
		String classCode;
		YCFIntTopDomainPKey pkey = schema.getFactoryTopDomain().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntTopDomainBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTopDomain",
				pkey );
		}
					schema.getTableTopProject().deleteTopProjectByTopDomainIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getTableLicense().deleteLicenseByDomainIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFIntTopDomainByTenantIdxKey keyTenantIdx = schema.getFactoryTopDomain().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntTopDomainByTldIdxKey keyTldIdx = schema.getFactoryTopDomain().newTldIdxKey();
		keyTldIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTldIdx.setRequiredTldId( existing.getRequiredTldId() );

		YCFIntTopDomainByNameIdxKey keyNameIdx = schema.getFactoryTopDomain().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredTldId( existing.getRequiredTldId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFIntTopDomainPKey, YCFIntTopDomainBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByTldIdx.get( keyTldIdx );
		subdict.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

	}
	public void deleteTopDomainByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFIntTopDomainPKey key = schema.getFactoryTopDomain().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteTopDomainByIdIdx( Authorization, key );
	}

	public void deleteTopDomainByIdIdx( YCFSecAuthorization Authorization,
		YCFIntTopDomainPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFIntTopDomainBuff cur;
		LinkedList<YCFIntTopDomainBuff> matchSet = new LinkedList<YCFIntTopDomainBuff>();
		Iterator<YCFIntTopDomainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTopDomainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTopDomain( Authorization, cur );
		}
	}

	public void deleteTopDomainByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFIntTopDomainByTenantIdxKey key = schema.getFactoryTopDomain().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTopDomainByTenantIdx( Authorization, key );
	}

	public void deleteTopDomainByTenantIdx( YCFSecAuthorization Authorization,
		YCFIntTopDomainByTenantIdxKey argKey )
	{
		YCFIntTopDomainBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntTopDomainBuff> matchSet = new LinkedList<YCFIntTopDomainBuff>();
		Iterator<YCFIntTopDomainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTopDomainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTopDomain( Authorization, cur );
		}
	}

	public void deleteTopDomainByTldIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTldId )
	{
		YCFIntTopDomainByTldIdxKey key = schema.getFactoryTopDomain().newTldIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTldId( argTldId );
		deleteTopDomainByTldIdx( Authorization, key );
	}

	public void deleteTopDomainByTldIdx( YCFSecAuthorization Authorization,
		YCFIntTopDomainByTldIdxKey argKey )
	{
		YCFIntTopDomainBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntTopDomainBuff> matchSet = new LinkedList<YCFIntTopDomainBuff>();
		Iterator<YCFIntTopDomainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTopDomainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTopDomain( Authorization, cur );
		}
	}

	public void deleteTopDomainByNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTldId,
		String argName )
	{
		YCFIntTopDomainByNameIdxKey key = schema.getFactoryTopDomain().newNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTldId( argTldId );
		key.setRequiredName( argName );
		deleteTopDomainByNameIdx( Authorization, key );
	}

	public void deleteTopDomainByNameIdx( YCFSecAuthorization Authorization,
		YCFIntTopDomainByNameIdxKey argKey )
	{
		YCFIntTopDomainBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntTopDomainBuff> matchSet = new LinkedList<YCFIntTopDomainBuff>();
		Iterator<YCFIntTopDomainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTopDomainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTopDomain( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
