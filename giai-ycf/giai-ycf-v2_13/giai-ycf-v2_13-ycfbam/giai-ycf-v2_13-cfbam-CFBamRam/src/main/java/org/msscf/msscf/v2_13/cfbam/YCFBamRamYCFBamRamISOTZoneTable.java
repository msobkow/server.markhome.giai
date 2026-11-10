
// Description: Java 11 in-memory RAM DbIO implementation for ISOTZone.

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
 *	YCFBamRamISOTZoneTable in-memory RAM DbIO implementation
 *	for ISOTZone.
 */
public class YCFBamRamISOTZoneTable
	implements IYCFBamISOTZoneTable
{
	private IYCFBamSchema schema;
	private Map< YCFSecISOTZonePKey,
				YCFSecISOTZoneBuff > dictByPKey
		= new HashMap< YCFSecISOTZonePKey,
				YCFSecISOTZoneBuff >();
	private Map< YCFSecISOTZoneByOffsetIdxKey,
				Map< YCFSecISOTZonePKey,
					YCFSecISOTZoneBuff >> dictByOffsetIdx
		= new HashMap< YCFSecISOTZoneByOffsetIdxKey,
				Map< YCFSecISOTZonePKey,
					YCFSecISOTZoneBuff >>();
	private Map< YCFSecISOTZoneByUTZNameIdxKey,
			YCFSecISOTZoneBuff > dictByUTZNameIdx
		= new HashMap< YCFSecISOTZoneByUTZNameIdxKey,
			YCFSecISOTZoneBuff >();
	private Map< YCFSecISOTZoneByIso8601IdxKey,
				Map< YCFSecISOTZonePKey,
					YCFSecISOTZoneBuff >> dictByIso8601Idx
		= new HashMap< YCFSecISOTZoneByIso8601IdxKey,
				Map< YCFSecISOTZonePKey,
					YCFSecISOTZoneBuff >>();

	public YCFBamRamISOTZoneTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createISOTZone( YCFSecAuthorization Authorization,
		YCFSecISOTZoneBuff Buff )
	{
		final String S_ProcName = "createISOTZone";
		YCFSecISOTZonePKey pkey = schema.getFactoryISOTZone().newPKey();
		pkey.setRequiredISOTZoneId( schema.nextISOTZoneIdGen() );
		Buff.setRequiredISOTZoneId( pkey.getRequiredISOTZoneId() );
		YCFSecISOTZoneByOffsetIdxKey keyOffsetIdx = schema.getFactoryISOTZone().newOffsetIdxKey();
		keyOffsetIdx.setRequiredTZHourOffset( Buff.getRequiredTZHourOffset() );
		keyOffsetIdx.setRequiredTZMinOffset( Buff.getRequiredTZMinOffset() );

		YCFSecISOTZoneByUTZNameIdxKey keyUTZNameIdx = schema.getFactoryISOTZone().newUTZNameIdxKey();
		keyUTZNameIdx.setRequiredTZName( Buff.getRequiredTZName() );

		YCFSecISOTZoneByIso8601IdxKey keyIso8601Idx = schema.getFactoryISOTZone().newIso8601IdxKey();
		keyIso8601Idx.setRequiredIso8601( Buff.getRequiredIso8601() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUTZNameIdx.containsKey( keyUTZNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ISOTZoneUTZNameIdx",
				keyUTZNameIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecISOTZonePKey, YCFSecISOTZoneBuff > subdictOffsetIdx;
		if( dictByOffsetIdx.containsKey( keyOffsetIdx ) ) {
			subdictOffsetIdx = dictByOffsetIdx.get( keyOffsetIdx );
		}
		else {
			subdictOffsetIdx = new HashMap< YCFSecISOTZonePKey, YCFSecISOTZoneBuff >();
			dictByOffsetIdx.put( keyOffsetIdx, subdictOffsetIdx );
		}
		subdictOffsetIdx.put( pkey, Buff );

		dictByUTZNameIdx.put( keyUTZNameIdx, Buff );

		Map< YCFSecISOTZonePKey, YCFSecISOTZoneBuff > subdictIso8601Idx;
		if( dictByIso8601Idx.containsKey( keyIso8601Idx ) ) {
			subdictIso8601Idx = dictByIso8601Idx.get( keyIso8601Idx );
		}
		else {
			subdictIso8601Idx = new HashMap< YCFSecISOTZonePKey, YCFSecISOTZoneBuff >();
			dictByIso8601Idx.put( keyIso8601Idx, subdictIso8601Idx );
		}
		subdictIso8601Idx.put( pkey, Buff );

	}

	public YCFSecISOTZoneBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey PKey )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readDerived";
		YCFSecISOTZonePKey key = schema.getFactoryISOTZone().newPKey();
		key.setRequiredISOTZoneId( PKey.getRequiredISOTZoneId() );
		YCFSecISOTZoneBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOTZoneBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey PKey )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readDerived";
		YCFSecISOTZonePKey key = schema.getFactoryISOTZone().newPKey();
		key.setRequiredISOTZoneId( PKey.getRequiredISOTZoneId() );
		YCFSecISOTZoneBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOTZoneBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamISOTZone.readAllDerived";
		YCFSecISOTZoneBuff[] retList = new YCFSecISOTZoneBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecISOTZoneBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecISOTZoneBuff[] readDerivedByOffsetIdx( YCFSecAuthorization Authorization,
		short TZHourOffset,
		short TZMinOffset )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readDerivedByOffsetIdx";
		YCFSecISOTZoneByOffsetIdxKey key = schema.getFactoryISOTZone().newOffsetIdxKey();
		key.setRequiredTZHourOffset( TZHourOffset );
		key.setRequiredTZMinOffset( TZMinOffset );

		YCFSecISOTZoneBuff[] recArray;
		if( dictByOffsetIdx.containsKey( key ) ) {
			Map< YCFSecISOTZonePKey, YCFSecISOTZoneBuff > subdictOffsetIdx
				= dictByOffsetIdx.get( key );
			recArray = new YCFSecISOTZoneBuff[ subdictOffsetIdx.size() ];
			Iterator< YCFSecISOTZoneBuff > iter = subdictOffsetIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecISOTZonePKey, YCFSecISOTZoneBuff > subdictOffsetIdx
				= new HashMap< YCFSecISOTZonePKey, YCFSecISOTZoneBuff >();
			dictByOffsetIdx.put( key, subdictOffsetIdx );
			recArray = new YCFSecISOTZoneBuff[0];
		}
		return( recArray );
	}

	public YCFSecISOTZoneBuff readDerivedByUTZNameIdx( YCFSecAuthorization Authorization,
		String TZName )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readDerivedByUTZNameIdx";
		YCFSecISOTZoneByUTZNameIdxKey key = schema.getFactoryISOTZone().newUTZNameIdxKey();
		key.setRequiredTZName( TZName );

		YCFSecISOTZoneBuff buff;
		if( dictByUTZNameIdx.containsKey( key ) ) {
			buff = dictByUTZNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOTZoneBuff[] readDerivedByIso8601Idx( YCFSecAuthorization Authorization,
		String Iso8601 )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readDerivedByIso8601Idx";
		YCFSecISOTZoneByIso8601IdxKey key = schema.getFactoryISOTZone().newIso8601IdxKey();
		key.setRequiredIso8601( Iso8601 );

		YCFSecISOTZoneBuff[] recArray;
		if( dictByIso8601Idx.containsKey( key ) ) {
			Map< YCFSecISOTZonePKey, YCFSecISOTZoneBuff > subdictIso8601Idx
				= dictByIso8601Idx.get( key );
			recArray = new YCFSecISOTZoneBuff[ subdictIso8601Idx.size() ];
			Iterator< YCFSecISOTZoneBuff > iter = subdictIso8601Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecISOTZonePKey, YCFSecISOTZoneBuff > subdictIso8601Idx
				= new HashMap< YCFSecISOTZonePKey, YCFSecISOTZoneBuff >();
			dictByIso8601Idx.put( key, subdictIso8601Idx );
			recArray = new YCFSecISOTZoneBuff[0];
		}
		return( recArray );
	}

	public YCFSecISOTZoneBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOTZoneId )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readDerivedByIdIdx() ";
		YCFSecISOTZonePKey key = schema.getFactoryISOTZone().newPKey();
		key.setRequiredISOTZoneId( ISOTZoneId );

		YCFSecISOTZoneBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOTZoneBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey PKey )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readBuff";
		YCFSecISOTZoneBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a008" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOTZoneBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecISOTZoneBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a008" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOTZoneBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readAllBuff";
		YCFSecISOTZoneBuff buff;
		ArrayList<YCFSecISOTZoneBuff> filteredList = new ArrayList<YCFSecISOTZoneBuff>();
		YCFSecISOTZoneBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a008" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOTZoneBuff[0] ) );
	}

	public YCFSecISOTZoneBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOTZoneId )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readBuffByIdIdx() ";
		YCFSecISOTZoneBuff buff = readDerivedByIdIdx( Authorization,
			ISOTZoneId );
		if( ( buff != null ) && buff.getClassCode().equals( "a008" ) ) {
			return( (YCFSecISOTZoneBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOTZoneBuff[] readBuffByOffsetIdx( YCFSecAuthorization Authorization,
		short TZHourOffset,
		short TZMinOffset )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readBuffByOffsetIdx() ";
		YCFSecISOTZoneBuff buff;
		ArrayList<YCFSecISOTZoneBuff> filteredList = new ArrayList<YCFSecISOTZoneBuff>();
		YCFSecISOTZoneBuff[] buffList = readDerivedByOffsetIdx( Authorization,
			TZHourOffset,
			TZMinOffset );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a008" ) ) {
				filteredList.add( (YCFSecISOTZoneBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOTZoneBuff[0] ) );
	}

	public YCFSecISOTZoneBuff readBuffByUTZNameIdx( YCFSecAuthorization Authorization,
		String TZName )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readBuffByUTZNameIdx() ";
		YCFSecISOTZoneBuff buff = readDerivedByUTZNameIdx( Authorization,
			TZName );
		if( ( buff != null ) && buff.getClassCode().equals( "a008" ) ) {
			return( (YCFSecISOTZoneBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOTZoneBuff[] readBuffByIso8601Idx( YCFSecAuthorization Authorization,
		String Iso8601 )
	{
		final String S_ProcName = "YCFBamRamISOTZone.readBuffByIso8601Idx() ";
		YCFSecISOTZoneBuff buff;
		ArrayList<YCFSecISOTZoneBuff> filteredList = new ArrayList<YCFSecISOTZoneBuff>();
		YCFSecISOTZoneBuff[] buffList = readDerivedByIso8601Idx( Authorization,
			Iso8601 );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a008" ) ) {
				filteredList.add( (YCFSecISOTZoneBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOTZoneBuff[0] ) );
	}

	public void updateISOTZone( YCFSecAuthorization Authorization,
		YCFSecISOTZoneBuff Buff )
	{
		YCFSecISOTZonePKey pkey = schema.getFactoryISOTZone().newPKey();
		pkey.setRequiredISOTZoneId( Buff.getRequiredISOTZoneId() );
		YCFSecISOTZoneBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateISOTZone",
				"Existing record not found",
				"ISOTZone",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateISOTZone",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecISOTZoneByOffsetIdxKey existingKeyOffsetIdx = schema.getFactoryISOTZone().newOffsetIdxKey();
		existingKeyOffsetIdx.setRequiredTZHourOffset( existing.getRequiredTZHourOffset() );
		existingKeyOffsetIdx.setRequiredTZMinOffset( existing.getRequiredTZMinOffset() );

		YCFSecISOTZoneByOffsetIdxKey newKeyOffsetIdx = schema.getFactoryISOTZone().newOffsetIdxKey();
		newKeyOffsetIdx.setRequiredTZHourOffset( Buff.getRequiredTZHourOffset() );
		newKeyOffsetIdx.setRequiredTZMinOffset( Buff.getRequiredTZMinOffset() );

		YCFSecISOTZoneByUTZNameIdxKey existingKeyUTZNameIdx = schema.getFactoryISOTZone().newUTZNameIdxKey();
		existingKeyUTZNameIdx.setRequiredTZName( existing.getRequiredTZName() );

		YCFSecISOTZoneByUTZNameIdxKey newKeyUTZNameIdx = schema.getFactoryISOTZone().newUTZNameIdxKey();
		newKeyUTZNameIdx.setRequiredTZName( Buff.getRequiredTZName() );

		YCFSecISOTZoneByIso8601IdxKey existingKeyIso8601Idx = schema.getFactoryISOTZone().newIso8601IdxKey();
		existingKeyIso8601Idx.setRequiredIso8601( existing.getRequiredIso8601() );

		YCFSecISOTZoneByIso8601IdxKey newKeyIso8601Idx = schema.getFactoryISOTZone().newIso8601IdxKey();
		newKeyIso8601Idx.setRequiredIso8601( Buff.getRequiredIso8601() );

		// Check unique indexes

		if( ! existingKeyUTZNameIdx.equals( newKeyUTZNameIdx ) ) {
			if( dictByUTZNameIdx.containsKey( newKeyUTZNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateISOTZone",
					"ISOTZoneUTZNameIdx",
					newKeyUTZNameIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFSecISOTZonePKey, YCFSecISOTZoneBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByOffsetIdx.get( existingKeyOffsetIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByOffsetIdx.containsKey( newKeyOffsetIdx ) ) {
			subdict = dictByOffsetIdx.get( newKeyOffsetIdx );
		}
		else {
			subdict = new HashMap< YCFSecISOTZonePKey, YCFSecISOTZoneBuff >();
			dictByOffsetIdx.put( newKeyOffsetIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUTZNameIdx.remove( existingKeyUTZNameIdx );
		dictByUTZNameIdx.put( newKeyUTZNameIdx, Buff );

		subdict = dictByIso8601Idx.get( existingKeyIso8601Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIso8601Idx.containsKey( newKeyIso8601Idx ) ) {
			subdict = dictByIso8601Idx.get( newKeyIso8601Idx );
		}
		else {
			subdict = new HashMap< YCFSecISOTZonePKey, YCFSecISOTZoneBuff >();
			dictByIso8601Idx.put( newKeyIso8601Idx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteISOTZone( YCFSecAuthorization Authorization,
		YCFSecISOTZoneBuff Buff )
	{
		final String S_ProcName = "YCFBamRamISOTZoneTable.deleteISOTZone() ";
		String classCode;
		YCFSecISOTZonePKey pkey = schema.getFactoryISOTZone().newPKey();
		pkey.setRequiredISOTZoneId( Buff.getRequiredISOTZoneId() );
		YCFSecISOTZoneBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteISOTZone",
				pkey );
		}
		YCFSecISOTZoneByOffsetIdxKey keyOffsetIdx = schema.getFactoryISOTZone().newOffsetIdxKey();
		keyOffsetIdx.setRequiredTZHourOffset( existing.getRequiredTZHourOffset() );
		keyOffsetIdx.setRequiredTZMinOffset( existing.getRequiredTZMinOffset() );

		YCFSecISOTZoneByUTZNameIdxKey keyUTZNameIdx = schema.getFactoryISOTZone().newUTZNameIdxKey();
		keyUTZNameIdx.setRequiredTZName( existing.getRequiredTZName() );

		YCFSecISOTZoneByIso8601IdxKey keyIso8601Idx = schema.getFactoryISOTZone().newIso8601IdxKey();
		keyIso8601Idx.setRequiredIso8601( existing.getRequiredIso8601() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecISOTZonePKey, YCFSecISOTZoneBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByOffsetIdx.get( keyOffsetIdx );
		subdict.remove( pkey );

		dictByUTZNameIdx.remove( keyUTZNameIdx );

		subdict = dictByIso8601Idx.get( keyIso8601Idx );
		subdict.remove( pkey );

	}
	public void deleteISOTZoneByIdIdx( YCFSecAuthorization Authorization,
		short argISOTZoneId )
	{
		YCFSecISOTZonePKey key = schema.getFactoryISOTZone().newPKey();
		key.setRequiredISOTZoneId( argISOTZoneId );
		deleteISOTZoneByIdIdx( Authorization, key );
	}

	public void deleteISOTZoneByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecISOTZoneBuff cur;
		LinkedList<YCFSecISOTZoneBuff> matchSet = new LinkedList<YCFSecISOTZoneBuff>();
		Iterator<YCFSecISOTZoneBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOTZoneBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOTZone().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOTZoneId() );
			deleteISOTZone( Authorization, cur );
		}
	}

	public void deleteISOTZoneByOffsetIdx( YCFSecAuthorization Authorization,
		short argTZHourOffset,
		short argTZMinOffset )
	{
		YCFSecISOTZoneByOffsetIdxKey key = schema.getFactoryISOTZone().newOffsetIdxKey();
		key.setRequiredTZHourOffset( argTZHourOffset );
		key.setRequiredTZMinOffset( argTZMinOffset );
		deleteISOTZoneByOffsetIdx( Authorization, key );
	}

	public void deleteISOTZoneByOffsetIdx( YCFSecAuthorization Authorization,
		YCFSecISOTZoneByOffsetIdxKey argKey )
	{
		YCFSecISOTZoneBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOTZoneBuff> matchSet = new LinkedList<YCFSecISOTZoneBuff>();
		Iterator<YCFSecISOTZoneBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOTZoneBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOTZone().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOTZoneId() );
			deleteISOTZone( Authorization, cur );
		}
	}

	public void deleteISOTZoneByUTZNameIdx( YCFSecAuthorization Authorization,
		String argTZName )
	{
		YCFSecISOTZoneByUTZNameIdxKey key = schema.getFactoryISOTZone().newUTZNameIdxKey();
		key.setRequiredTZName( argTZName );
		deleteISOTZoneByUTZNameIdx( Authorization, key );
	}

	public void deleteISOTZoneByUTZNameIdx( YCFSecAuthorization Authorization,
		YCFSecISOTZoneByUTZNameIdxKey argKey )
	{
		YCFSecISOTZoneBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOTZoneBuff> matchSet = new LinkedList<YCFSecISOTZoneBuff>();
		Iterator<YCFSecISOTZoneBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOTZoneBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOTZone().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOTZoneId() );
			deleteISOTZone( Authorization, cur );
		}
	}

	public void deleteISOTZoneByIso8601Idx( YCFSecAuthorization Authorization,
		String argIso8601 )
	{
		YCFSecISOTZoneByIso8601IdxKey key = schema.getFactoryISOTZone().newIso8601IdxKey();
		key.setRequiredIso8601( argIso8601 );
		deleteISOTZoneByIso8601Idx( Authorization, key );
	}

	public void deleteISOTZoneByIso8601Idx( YCFSecAuthorization Authorization,
		YCFSecISOTZoneByIso8601IdxKey argKey )
	{
		YCFSecISOTZoneBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOTZoneBuff> matchSet = new LinkedList<YCFSecISOTZoneBuff>();
		Iterator<YCFSecISOTZoneBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOTZoneBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOTZone().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOTZoneId() );
			deleteISOTZone( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
