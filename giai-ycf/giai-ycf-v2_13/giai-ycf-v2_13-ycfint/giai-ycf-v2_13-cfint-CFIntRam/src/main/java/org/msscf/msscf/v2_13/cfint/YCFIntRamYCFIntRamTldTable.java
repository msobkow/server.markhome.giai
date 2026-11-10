
// Description: Java 11 in-memory RAM DbIO implementation for Tld.

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
 *	YCFIntRamTldTable in-memory RAM DbIO implementation
 *	for Tld.
 */
public class YCFIntRamTldTable
	implements IYCFIntTldTable
{
	private IYCFIntSchema schema;
	private Map< YCFIntTldPKey,
				YCFIntTldBuff > dictByPKey
		= new HashMap< YCFIntTldPKey,
				YCFIntTldBuff >();
	private Map< YCFIntTldByTenantIdxKey,
				Map< YCFIntTldPKey,
					YCFIntTldBuff >> dictByTenantIdx
		= new HashMap< YCFIntTldByTenantIdxKey,
				Map< YCFIntTldPKey,
					YCFIntTldBuff >>();
	private Map< YCFIntTldByNameIdxKey,
			YCFIntTldBuff > dictByNameIdx
		= new HashMap< YCFIntTldByNameIdxKey,
			YCFIntTldBuff >();

	public YCFIntRamTldTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createTld( YCFSecAuthorization Authorization,
		YCFIntTldBuff Buff )
	{
		final String S_ProcName = "createTld";
		YCFIntTldPKey pkey = schema.getFactoryTld().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFIntRamTenantTable)schema.getTableTenant()).nextTldIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFIntTldByTenantIdxKey keyTenantIdx = schema.getFactoryTld().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntTldByNameIdxKey keyNameIdx = schema.getFactoryTld().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TldNameIdx",
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
						"Container",
						"TldTenant",
						"Tenant",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFIntTldPKey, YCFIntTldBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFIntTldPKey, YCFIntTldBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

	}

	public YCFIntTldBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntTldPKey PKey )
	{
		final String S_ProcName = "YCFIntRamTld.readDerived";
		YCFIntTldPKey key = schema.getFactoryTld().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntTldBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTldBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntTldPKey PKey )
	{
		final String S_ProcName = "YCFIntRamTld.readDerived";
		YCFIntTldPKey key = schema.getFactoryTld().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntTldBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTldBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamTld.readAllDerived";
		YCFIntTldBuff[] retList = new YCFIntTldBuff[ dictByPKey.values().size() ];
		Iterator< YCFIntTldBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFIntTldBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamTld.readDerivedByTenantIdx";
		YCFIntTldByTenantIdxKey key = schema.getFactoryTld().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFIntTldBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFIntTldPKey, YCFIntTldBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFIntTldBuff[ subdictTenantIdx.size() ];
			Iterator< YCFIntTldBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntTldPKey, YCFIntTldBuff > subdictTenantIdx
				= new HashMap< YCFIntTldPKey, YCFIntTldBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFIntTldBuff[0];
		}
		return( recArray );
	}

	public YCFIntTldBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamTld.readDerivedByNameIdx";
		YCFIntTldByNameIdxKey key = schema.getFactoryTld().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );

		YCFIntTldBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTldBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamTld.readDerivedByIdIdx() ";
		YCFIntTldPKey key = schema.getFactoryTld().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFIntTldBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTldBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntTldPKey PKey )
	{
		final String S_ProcName = "YCFIntRamTld.readBuff";
		YCFIntTldBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a106" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTldBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntTldPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFIntTldBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a106" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTldBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamTld.readAllBuff";
		YCFIntTldBuff buff;
		ArrayList<YCFIntTldBuff> filteredList = new ArrayList<YCFIntTldBuff>();
		YCFIntTldBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a106" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFIntTldBuff[0] ) );
	}

	public YCFIntTldBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamTld.readBuffByIdIdx() ";
		YCFIntTldBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a106" ) ) {
			return( (YCFIntTldBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntTldBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamTld.readBuffByTenantIdx() ";
		YCFIntTldBuff buff;
		ArrayList<YCFIntTldBuff> filteredList = new ArrayList<YCFIntTldBuff>();
		YCFIntTldBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a106" ) ) {
				filteredList.add( (YCFIntTldBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntTldBuff[0] ) );
	}

	public YCFIntTldBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamTld.readBuffByNameIdx() ";
		YCFIntTldBuff buff = readDerivedByNameIdx( Authorization,
			TenantId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a106" ) ) {
			return( (YCFIntTldBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateTld( YCFSecAuthorization Authorization,
		YCFIntTldBuff Buff )
	{
		YCFIntTldPKey pkey = schema.getFactoryTld().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntTldBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTld",
				"Existing record not found",
				"Tld",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTld",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFIntTldByTenantIdxKey existingKeyTenantIdx = schema.getFactoryTld().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntTldByTenantIdxKey newKeyTenantIdx = schema.getFactoryTld().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntTldByNameIdxKey existingKeyNameIdx = schema.getFactoryTld().newNameIdxKey();
		existingKeyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntTldByNameIdxKey newKeyNameIdx = schema.getFactoryTld().newNameIdxKey();
		newKeyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTld",
					"TldNameIdx",
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
						"updateTld",
						"Container",
						"TldTenant",
						"Tenant",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFIntTldPKey, YCFIntTldBuff > subdict;

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
			subdict = new HashMap< YCFIntTldPKey, YCFIntTldBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

	}

	public void deleteTld( YCFSecAuthorization Authorization,
		YCFIntTldBuff Buff )
	{
		final String S_ProcName = "YCFIntRamTldTable.deleteTld() ";
		String classCode;
		YCFIntTldPKey pkey = schema.getFactoryTld().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntTldBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTld",
				pkey );
		}
					schema.getTableTopDomain().deleteTopDomainByTldIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFIntTldByTenantIdxKey keyTenantIdx = schema.getFactoryTld().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntTldByNameIdxKey keyNameIdx = schema.getFactoryTld().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFIntTldPKey, YCFIntTldBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

	}
	public void deleteTldByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFIntTldPKey key = schema.getFactoryTld().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteTldByIdIdx( Authorization, key );
	}

	public void deleteTldByIdIdx( YCFSecAuthorization Authorization,
		YCFIntTldPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFIntTldBuff cur;
		LinkedList<YCFIntTldBuff> matchSet = new LinkedList<YCFIntTldBuff>();
		Iterator<YCFIntTldBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTldBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTld().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTld( Authorization, cur );
		}
	}

	public void deleteTldByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFIntTldByTenantIdxKey key = schema.getFactoryTld().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTldByTenantIdx( Authorization, key );
	}

	public void deleteTldByTenantIdx( YCFSecAuthorization Authorization,
		YCFIntTldByTenantIdxKey argKey )
	{
		YCFIntTldBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntTldBuff> matchSet = new LinkedList<YCFIntTldBuff>();
		Iterator<YCFIntTldBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTldBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTld().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTld( Authorization, cur );
		}
	}

	public void deleteTldByNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		String argName )
	{
		YCFIntTldByNameIdxKey key = schema.getFactoryTld().newNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredName( argName );
		deleteTldByNameIdx( Authorization, key );
	}

	public void deleteTldByNameIdx( YCFSecAuthorization Authorization,
		YCFIntTldByNameIdxKey argKey )
	{
		YCFIntTldBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntTldBuff> matchSet = new LinkedList<YCFIntTldBuff>();
		Iterator<YCFIntTldBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTldBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTld().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTld( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
