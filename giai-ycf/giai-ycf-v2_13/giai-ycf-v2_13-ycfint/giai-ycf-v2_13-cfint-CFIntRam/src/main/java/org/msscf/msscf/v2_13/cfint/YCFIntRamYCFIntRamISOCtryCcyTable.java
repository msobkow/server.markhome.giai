
// Description: Java 11 in-memory RAM DbIO implementation for ISOCtryCcy.

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
 *	YCFIntRamISOCtryCcyTable in-memory RAM DbIO implementation
 *	for ISOCtryCcy.
 */
public class YCFIntRamISOCtryCcyTable
	implements IYCFIntISOCtryCcyTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecISOCtryCcyPKey,
				YCFSecISOCtryCcyBuff > dictByPKey
		= new HashMap< YCFSecISOCtryCcyPKey,
				YCFSecISOCtryCcyBuff >();
	private Map< YCFSecISOCtryCcyByCtryIdxKey,
				Map< YCFSecISOCtryCcyPKey,
					YCFSecISOCtryCcyBuff >> dictByCtryIdx
		= new HashMap< YCFSecISOCtryCcyByCtryIdxKey,
				Map< YCFSecISOCtryCcyPKey,
					YCFSecISOCtryCcyBuff >>();
	private Map< YCFSecISOCtryCcyByCcyIdxKey,
				Map< YCFSecISOCtryCcyPKey,
					YCFSecISOCtryCcyBuff >> dictByCcyIdx
		= new HashMap< YCFSecISOCtryCcyByCcyIdxKey,
				Map< YCFSecISOCtryCcyPKey,
					YCFSecISOCtryCcyBuff >>();

	public YCFIntRamISOCtryCcyTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createISOCtryCcy( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyBuff Buff )
	{
		final String S_ProcName = "createISOCtryCcy";
		YCFSecISOCtryCcyPKey pkey = schema.getFactoryISOCtryCcy().newPKey();
		pkey.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );
		pkey.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );
		Buff.setRequiredISOCtryId( pkey.getRequiredISOCtryId() );
		Buff.setRequiredISOCcyId( pkey.getRequiredISOCcyId() );
		YCFSecISOCtryCcyByCtryIdxKey keyCtryIdx = schema.getFactoryISOCtryCcy().newCtryIdxKey();
		keyCtryIdx.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );

		YCFSecISOCtryCcyByCcyIdxKey keyCcyIdx = schema.getFactoryISOCtryCcy().newCcyIdxKey();
		keyCcyIdx.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableISOCtry().readDerivedByIdIdx( Authorization,
						Buff.getRequiredISOCtryId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ISOCtryCcyCtry",
						"ISOCtry",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff > subdictCtryIdx;
		if( dictByCtryIdx.containsKey( keyCtryIdx ) ) {
			subdictCtryIdx = dictByCtryIdx.get( keyCtryIdx );
		}
		else {
			subdictCtryIdx = new HashMap< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff >();
			dictByCtryIdx.put( keyCtryIdx, subdictCtryIdx );
		}
		subdictCtryIdx.put( pkey, Buff );

		Map< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff > subdictCcyIdx;
		if( dictByCcyIdx.containsKey( keyCcyIdx ) ) {
			subdictCcyIdx = dictByCcyIdx.get( keyCcyIdx );
		}
		else {
			subdictCcyIdx = new HashMap< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff >();
			dictByCcyIdx.put( keyCcyIdx, subdictCcyIdx );
		}
		subdictCcyIdx.put( pkey, Buff );

	}

	public YCFSecISOCtryCcyBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readDerived";
		YCFSecISOCtryCcyPKey key = schema.getFactoryISOCtryCcy().newPKey();
		key.setRequiredISOCtryId( PKey.getRequiredISOCtryId() );
		key.setRequiredISOCcyId( PKey.getRequiredISOCcyId() );
		YCFSecISOCtryCcyBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryCcyBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readDerived";
		YCFSecISOCtryCcyPKey key = schema.getFactoryISOCtryCcy().newPKey();
		key.setRequiredISOCtryId( PKey.getRequiredISOCtryId() );
		key.setRequiredISOCcyId( PKey.getRequiredISOCcyId() );
		YCFSecISOCtryCcyBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryCcyBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamISOCtryCcy.readAllDerived";
		YCFSecISOCtryCcyBuff[] retList = new YCFSecISOCtryCcyBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecISOCtryCcyBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecISOCtryCcyBuff[] readDerivedByCtryIdx( YCFSecAuthorization Authorization,
		short ISOCtryId )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readDerivedByCtryIdx";
		YCFSecISOCtryCcyByCtryIdxKey key = schema.getFactoryISOCtryCcy().newCtryIdxKey();
		key.setRequiredISOCtryId( ISOCtryId );

		YCFSecISOCtryCcyBuff[] recArray;
		if( dictByCtryIdx.containsKey( key ) ) {
			Map< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff > subdictCtryIdx
				= dictByCtryIdx.get( key );
			recArray = new YCFSecISOCtryCcyBuff[ subdictCtryIdx.size() ];
			Iterator< YCFSecISOCtryCcyBuff > iter = subdictCtryIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff > subdictCtryIdx
				= new HashMap< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff >();
			dictByCtryIdx.put( key, subdictCtryIdx );
			recArray = new YCFSecISOCtryCcyBuff[0];
		}
		return( recArray );
	}

	public YCFSecISOCtryCcyBuff[] readDerivedByCcyIdx( YCFSecAuthorization Authorization,
		short ISOCcyId )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readDerivedByCcyIdx";
		YCFSecISOCtryCcyByCcyIdxKey key = schema.getFactoryISOCtryCcy().newCcyIdxKey();
		key.setRequiredISOCcyId( ISOCcyId );

		YCFSecISOCtryCcyBuff[] recArray;
		if( dictByCcyIdx.containsKey( key ) ) {
			Map< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff > subdictCcyIdx
				= dictByCcyIdx.get( key );
			recArray = new YCFSecISOCtryCcyBuff[ subdictCcyIdx.size() ];
			Iterator< YCFSecISOCtryCcyBuff > iter = subdictCcyIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff > subdictCcyIdx
				= new HashMap< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff >();
			dictByCcyIdx.put( key, subdictCcyIdx );
			recArray = new YCFSecISOCtryCcyBuff[0];
		}
		return( recArray );
	}

	public YCFSecISOCtryCcyBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readDerivedByIdIdx() ";
		YCFSecISOCtryCcyPKey key = schema.getFactoryISOCtryCcy().newPKey();
		key.setRequiredISOCtryId( ISOCtryId );
		key.setRequiredISOCcyId( ISOCcyId );

		YCFSecISOCtryCcyBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryCcyBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readBuff";
		YCFSecISOCtryCcyBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a005" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryCcyBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecISOCtryCcyBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a005" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryCcyBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readAllBuff";
		YCFSecISOCtryCcyBuff buff;
		ArrayList<YCFSecISOCtryCcyBuff> filteredList = new ArrayList<YCFSecISOCtryCcyBuff>();
		YCFSecISOCtryCcyBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a005" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOCtryCcyBuff[0] ) );
	}

	public YCFSecISOCtryCcyBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readBuffByIdIdx() ";
		YCFSecISOCtryCcyBuff buff = readDerivedByIdIdx( Authorization,
			ISOCtryId,
			ISOCcyId );
		if( ( buff != null ) && buff.getClassCode().equals( "a005" ) ) {
			return( (YCFSecISOCtryCcyBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOCtryCcyBuff[] readBuffByCtryIdx( YCFSecAuthorization Authorization,
		short ISOCtryId )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readBuffByCtryIdx() ";
		YCFSecISOCtryCcyBuff buff;
		ArrayList<YCFSecISOCtryCcyBuff> filteredList = new ArrayList<YCFSecISOCtryCcyBuff>();
		YCFSecISOCtryCcyBuff[] buffList = readDerivedByCtryIdx( Authorization,
			ISOCtryId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a005" ) ) {
				filteredList.add( (YCFSecISOCtryCcyBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOCtryCcyBuff[0] ) );
	}

	public YCFSecISOCtryCcyBuff[] readBuffByCcyIdx( YCFSecAuthorization Authorization,
		short ISOCcyId )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcy.readBuffByCcyIdx() ";
		YCFSecISOCtryCcyBuff buff;
		ArrayList<YCFSecISOCtryCcyBuff> filteredList = new ArrayList<YCFSecISOCtryCcyBuff>();
		YCFSecISOCtryCcyBuff[] buffList = readDerivedByCcyIdx( Authorization,
			ISOCcyId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a005" ) ) {
				filteredList.add( (YCFSecISOCtryCcyBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOCtryCcyBuff[0] ) );
	}

	public void updateISOCtryCcy( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyBuff Buff )
	{
		YCFSecISOCtryCcyPKey pkey = schema.getFactoryISOCtryCcy().newPKey();
		pkey.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );
		pkey.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );
		YCFSecISOCtryCcyBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateISOCtryCcy",
				"Existing record not found",
				"ISOCtryCcy",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateISOCtryCcy",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecISOCtryCcyByCtryIdxKey existingKeyCtryIdx = schema.getFactoryISOCtryCcy().newCtryIdxKey();
		existingKeyCtryIdx.setRequiredISOCtryId( existing.getRequiredISOCtryId() );

		YCFSecISOCtryCcyByCtryIdxKey newKeyCtryIdx = schema.getFactoryISOCtryCcy().newCtryIdxKey();
		newKeyCtryIdx.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );

		YCFSecISOCtryCcyByCcyIdxKey existingKeyCcyIdx = schema.getFactoryISOCtryCcy().newCcyIdxKey();
		existingKeyCcyIdx.setRequiredISOCcyId( existing.getRequiredISOCcyId() );

		YCFSecISOCtryCcyByCcyIdxKey newKeyCcyIdx = schema.getFactoryISOCtryCcy().newCcyIdxKey();
		newKeyCcyIdx.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableISOCtry().readDerivedByIdIdx( Authorization,
						Buff.getRequiredISOCtryId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateISOCtryCcy",
						"Container",
						"ISOCtryCcyCtry",
						"ISOCtry",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByCtryIdx.get( existingKeyCtryIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCtryIdx.containsKey( newKeyCtryIdx ) ) {
			subdict = dictByCtryIdx.get( newKeyCtryIdx );
		}
		else {
			subdict = new HashMap< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff >();
			dictByCtryIdx.put( newKeyCtryIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByCcyIdx.get( existingKeyCcyIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCcyIdx.containsKey( newKeyCcyIdx ) ) {
			subdict = dictByCcyIdx.get( newKeyCcyIdx );
		}
		else {
			subdict = new HashMap< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff >();
			dictByCcyIdx.put( newKeyCcyIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteISOCtryCcy( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyBuff Buff )
	{
		final String S_ProcName = "YCFIntRamISOCtryCcyTable.deleteISOCtryCcy() ";
		String classCode;
		YCFSecISOCtryCcyPKey pkey = schema.getFactoryISOCtryCcy().newPKey();
		pkey.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );
		pkey.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );
		YCFSecISOCtryCcyBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteISOCtryCcy",
				pkey );
		}
		YCFSecISOCtryCcyByCtryIdxKey keyCtryIdx = schema.getFactoryISOCtryCcy().newCtryIdxKey();
		keyCtryIdx.setRequiredISOCtryId( existing.getRequiredISOCtryId() );

		YCFSecISOCtryCcyByCcyIdxKey keyCcyIdx = schema.getFactoryISOCtryCcy().newCcyIdxKey();
		keyCcyIdx.setRequiredISOCcyId( existing.getRequiredISOCcyId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecISOCtryCcyPKey, YCFSecISOCtryCcyBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByCtryIdx.get( keyCtryIdx );
		subdict.remove( pkey );

		subdict = dictByCcyIdx.get( keyCcyIdx );
		subdict.remove( pkey );

	}
	public void deleteISOCtryCcyByIdIdx( YCFSecAuthorization Authorization,
		short argISOCtryId,
		short argISOCcyId )
	{
		YCFSecISOCtryCcyPKey key = schema.getFactoryISOCtryCcy().newPKey();
		key.setRequiredISOCtryId( argISOCtryId );
		key.setRequiredISOCcyId( argISOCcyId );
		deleteISOCtryCcyByIdIdx( Authorization, key );
	}

	public void deleteISOCtryCcyByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecISOCtryCcyBuff cur;
		LinkedList<YCFSecISOCtryCcyBuff> matchSet = new LinkedList<YCFSecISOCtryCcyBuff>();
		Iterator<YCFSecISOCtryCcyBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCtryCcyBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCtryCcy().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId(),
				cur.getRequiredISOCcyId() );
			deleteISOCtryCcy( Authorization, cur );
		}
	}

	public void deleteISOCtryCcyByCtryIdx( YCFSecAuthorization Authorization,
		short argISOCtryId )
	{
		YCFSecISOCtryCcyByCtryIdxKey key = schema.getFactoryISOCtryCcy().newCtryIdxKey();
		key.setRequiredISOCtryId( argISOCtryId );
		deleteISOCtryCcyByCtryIdx( Authorization, key );
	}

	public void deleteISOCtryCcyByCtryIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyByCtryIdxKey argKey )
	{
		YCFSecISOCtryCcyBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOCtryCcyBuff> matchSet = new LinkedList<YCFSecISOCtryCcyBuff>();
		Iterator<YCFSecISOCtryCcyBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCtryCcyBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCtryCcy().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId(),
				cur.getRequiredISOCcyId() );
			deleteISOCtryCcy( Authorization, cur );
		}
	}

	public void deleteISOCtryCcyByCcyIdx( YCFSecAuthorization Authorization,
		short argISOCcyId )
	{
		YCFSecISOCtryCcyByCcyIdxKey key = schema.getFactoryISOCtryCcy().newCcyIdxKey();
		key.setRequiredISOCcyId( argISOCcyId );
		deleteISOCtryCcyByCcyIdx( Authorization, key );
	}

	public void deleteISOCtryCcyByCcyIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyByCcyIdxKey argKey )
	{
		YCFSecISOCtryCcyBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOCtryCcyBuff> matchSet = new LinkedList<YCFSecISOCtryCcyBuff>();
		Iterator<YCFSecISOCtryCcyBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCtryCcyBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCtryCcy().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId(),
				cur.getRequiredISOCcyId() );
			deleteISOCtryCcy( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
