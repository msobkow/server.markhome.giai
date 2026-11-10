
// Description: Java 11 in-memory RAM DbIO implementation for ISOCtryLang.

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
 *	YCFIntRamISOCtryLangTable in-memory RAM DbIO implementation
 *	for ISOCtryLang.
 */
public class YCFIntRamISOCtryLangTable
	implements IYCFIntISOCtryLangTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecISOCtryLangPKey,
				YCFSecISOCtryLangBuff > dictByPKey
		= new HashMap< YCFSecISOCtryLangPKey,
				YCFSecISOCtryLangBuff >();
	private Map< YCFSecISOCtryLangByCtryIdxKey,
				Map< YCFSecISOCtryLangPKey,
					YCFSecISOCtryLangBuff >> dictByCtryIdx
		= new HashMap< YCFSecISOCtryLangByCtryIdxKey,
				Map< YCFSecISOCtryLangPKey,
					YCFSecISOCtryLangBuff >>();
	private Map< YCFSecISOCtryLangByLangIdxKey,
				Map< YCFSecISOCtryLangPKey,
					YCFSecISOCtryLangBuff >> dictByLangIdx
		= new HashMap< YCFSecISOCtryLangByLangIdxKey,
				Map< YCFSecISOCtryLangPKey,
					YCFSecISOCtryLangBuff >>();

	public YCFIntRamISOCtryLangTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createISOCtryLang( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangBuff Buff )
	{
		final String S_ProcName = "createISOCtryLang";
		YCFSecISOCtryLangPKey pkey = schema.getFactoryISOCtryLang().newPKey();
		pkey.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );
		pkey.setRequiredISOLangId( Buff.getRequiredISOLangId() );
		Buff.setRequiredISOCtryId( pkey.getRequiredISOCtryId() );
		Buff.setRequiredISOLangId( pkey.getRequiredISOLangId() );
		YCFSecISOCtryLangByCtryIdxKey keyCtryIdx = schema.getFactoryISOCtryLang().newCtryIdxKey();
		keyCtryIdx.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );

		YCFSecISOCtryLangByLangIdxKey keyLangIdx = schema.getFactoryISOCtryLang().newLangIdxKey();
		keyLangIdx.setRequiredISOLangId( Buff.getRequiredISOLangId() );

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
						"ISOCtryLangCtry",
						"ISOCtry",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff > subdictCtryIdx;
		if( dictByCtryIdx.containsKey( keyCtryIdx ) ) {
			subdictCtryIdx = dictByCtryIdx.get( keyCtryIdx );
		}
		else {
			subdictCtryIdx = new HashMap< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff >();
			dictByCtryIdx.put( keyCtryIdx, subdictCtryIdx );
		}
		subdictCtryIdx.put( pkey, Buff );

		Map< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff > subdictLangIdx;
		if( dictByLangIdx.containsKey( keyLangIdx ) ) {
			subdictLangIdx = dictByLangIdx.get( keyLangIdx );
		}
		else {
			subdictLangIdx = new HashMap< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff >();
			dictByLangIdx.put( keyLangIdx, subdictLangIdx );
		}
		subdictLangIdx.put( pkey, Buff );

	}

	public YCFSecISOCtryLangBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readDerived";
		YCFSecISOCtryLangPKey key = schema.getFactoryISOCtryLang().newPKey();
		key.setRequiredISOCtryId( PKey.getRequiredISOCtryId() );
		key.setRequiredISOLangId( PKey.getRequiredISOLangId() );
		YCFSecISOCtryLangBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryLangBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readDerived";
		YCFSecISOCtryLangPKey key = schema.getFactoryISOCtryLang().newPKey();
		key.setRequiredISOCtryId( PKey.getRequiredISOCtryId() );
		key.setRequiredISOLangId( PKey.getRequiredISOLangId() );
		YCFSecISOCtryLangBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryLangBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamISOCtryLang.readAllDerived";
		YCFSecISOCtryLangBuff[] retList = new YCFSecISOCtryLangBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecISOCtryLangBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecISOCtryLangBuff[] readDerivedByCtryIdx( YCFSecAuthorization Authorization,
		short ISOCtryId )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readDerivedByCtryIdx";
		YCFSecISOCtryLangByCtryIdxKey key = schema.getFactoryISOCtryLang().newCtryIdxKey();
		key.setRequiredISOCtryId( ISOCtryId );

		YCFSecISOCtryLangBuff[] recArray;
		if( dictByCtryIdx.containsKey( key ) ) {
			Map< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff > subdictCtryIdx
				= dictByCtryIdx.get( key );
			recArray = new YCFSecISOCtryLangBuff[ subdictCtryIdx.size() ];
			Iterator< YCFSecISOCtryLangBuff > iter = subdictCtryIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff > subdictCtryIdx
				= new HashMap< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff >();
			dictByCtryIdx.put( key, subdictCtryIdx );
			recArray = new YCFSecISOCtryLangBuff[0];
		}
		return( recArray );
	}

	public YCFSecISOCtryLangBuff[] readDerivedByLangIdx( YCFSecAuthorization Authorization,
		short ISOLangId )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readDerivedByLangIdx";
		YCFSecISOCtryLangByLangIdxKey key = schema.getFactoryISOCtryLang().newLangIdxKey();
		key.setRequiredISOLangId( ISOLangId );

		YCFSecISOCtryLangBuff[] recArray;
		if( dictByLangIdx.containsKey( key ) ) {
			Map< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff > subdictLangIdx
				= dictByLangIdx.get( key );
			recArray = new YCFSecISOCtryLangBuff[ subdictLangIdx.size() ];
			Iterator< YCFSecISOCtryLangBuff > iter = subdictLangIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff > subdictLangIdx
				= new HashMap< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff >();
			dictByLangIdx.put( key, subdictLangIdx );
			recArray = new YCFSecISOCtryLangBuff[0];
		}
		return( recArray );
	}

	public YCFSecISOCtryLangBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOCtryId,
		short ISOLangId )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readDerivedByIdIdx() ";
		YCFSecISOCtryLangPKey key = schema.getFactoryISOCtryLang().newPKey();
		key.setRequiredISOCtryId( ISOCtryId );
		key.setRequiredISOLangId( ISOLangId );

		YCFSecISOCtryLangBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryLangBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readBuff";
		YCFSecISOCtryLangBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a006" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryLangBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecISOCtryLangBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a006" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryLangBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readAllBuff";
		YCFSecISOCtryLangBuff buff;
		ArrayList<YCFSecISOCtryLangBuff> filteredList = new ArrayList<YCFSecISOCtryLangBuff>();
		YCFSecISOCtryLangBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a006" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOCtryLangBuff[0] ) );
	}

	public YCFSecISOCtryLangBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOCtryId,
		short ISOLangId )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readBuffByIdIdx() ";
		YCFSecISOCtryLangBuff buff = readDerivedByIdIdx( Authorization,
			ISOCtryId,
			ISOLangId );
		if( ( buff != null ) && buff.getClassCode().equals( "a006" ) ) {
			return( (YCFSecISOCtryLangBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOCtryLangBuff[] readBuffByCtryIdx( YCFSecAuthorization Authorization,
		short ISOCtryId )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readBuffByCtryIdx() ";
		YCFSecISOCtryLangBuff buff;
		ArrayList<YCFSecISOCtryLangBuff> filteredList = new ArrayList<YCFSecISOCtryLangBuff>();
		YCFSecISOCtryLangBuff[] buffList = readDerivedByCtryIdx( Authorization,
			ISOCtryId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a006" ) ) {
				filteredList.add( (YCFSecISOCtryLangBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOCtryLangBuff[0] ) );
	}

	public YCFSecISOCtryLangBuff[] readBuffByLangIdx( YCFSecAuthorization Authorization,
		short ISOLangId )
	{
		final String S_ProcName = "YCFIntRamISOCtryLang.readBuffByLangIdx() ";
		YCFSecISOCtryLangBuff buff;
		ArrayList<YCFSecISOCtryLangBuff> filteredList = new ArrayList<YCFSecISOCtryLangBuff>();
		YCFSecISOCtryLangBuff[] buffList = readDerivedByLangIdx( Authorization,
			ISOLangId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a006" ) ) {
				filteredList.add( (YCFSecISOCtryLangBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOCtryLangBuff[0] ) );
	}

	public void updateISOCtryLang( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangBuff Buff )
	{
		YCFSecISOCtryLangPKey pkey = schema.getFactoryISOCtryLang().newPKey();
		pkey.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );
		pkey.setRequiredISOLangId( Buff.getRequiredISOLangId() );
		YCFSecISOCtryLangBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateISOCtryLang",
				"Existing record not found",
				"ISOCtryLang",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateISOCtryLang",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecISOCtryLangByCtryIdxKey existingKeyCtryIdx = schema.getFactoryISOCtryLang().newCtryIdxKey();
		existingKeyCtryIdx.setRequiredISOCtryId( existing.getRequiredISOCtryId() );

		YCFSecISOCtryLangByCtryIdxKey newKeyCtryIdx = schema.getFactoryISOCtryLang().newCtryIdxKey();
		newKeyCtryIdx.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );

		YCFSecISOCtryLangByLangIdxKey existingKeyLangIdx = schema.getFactoryISOCtryLang().newLangIdxKey();
		existingKeyLangIdx.setRequiredISOLangId( existing.getRequiredISOLangId() );

		YCFSecISOCtryLangByLangIdxKey newKeyLangIdx = schema.getFactoryISOCtryLang().newLangIdxKey();
		newKeyLangIdx.setRequiredISOLangId( Buff.getRequiredISOLangId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableISOCtry().readDerivedByIdIdx( Authorization,
						Buff.getRequiredISOCtryId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateISOCtryLang",
						"Container",
						"ISOCtryLangCtry",
						"ISOCtry",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff > subdict;

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
			subdict = new HashMap< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff >();
			dictByCtryIdx.put( newKeyCtryIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByLangIdx.get( existingKeyLangIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByLangIdx.containsKey( newKeyLangIdx ) ) {
			subdict = dictByLangIdx.get( newKeyLangIdx );
		}
		else {
			subdict = new HashMap< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff >();
			dictByLangIdx.put( newKeyLangIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteISOCtryLang( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangBuff Buff )
	{
		final String S_ProcName = "YCFIntRamISOCtryLangTable.deleteISOCtryLang() ";
		String classCode;
		YCFSecISOCtryLangPKey pkey = schema.getFactoryISOCtryLang().newPKey();
		pkey.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );
		pkey.setRequiredISOLangId( Buff.getRequiredISOLangId() );
		YCFSecISOCtryLangBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteISOCtryLang",
				pkey );
		}
		YCFSecISOCtryLangByCtryIdxKey keyCtryIdx = schema.getFactoryISOCtryLang().newCtryIdxKey();
		keyCtryIdx.setRequiredISOCtryId( existing.getRequiredISOCtryId() );

		YCFSecISOCtryLangByLangIdxKey keyLangIdx = schema.getFactoryISOCtryLang().newLangIdxKey();
		keyLangIdx.setRequiredISOLangId( existing.getRequiredISOLangId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecISOCtryLangPKey, YCFSecISOCtryLangBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByCtryIdx.get( keyCtryIdx );
		subdict.remove( pkey );

		subdict = dictByLangIdx.get( keyLangIdx );
		subdict.remove( pkey );

	}
	public void deleteISOCtryLangByIdIdx( YCFSecAuthorization Authorization,
		short argISOCtryId,
		short argISOLangId )
	{
		YCFSecISOCtryLangPKey key = schema.getFactoryISOCtryLang().newPKey();
		key.setRequiredISOCtryId( argISOCtryId );
		key.setRequiredISOLangId( argISOLangId );
		deleteISOCtryLangByIdIdx( Authorization, key );
	}

	public void deleteISOCtryLangByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecISOCtryLangBuff cur;
		LinkedList<YCFSecISOCtryLangBuff> matchSet = new LinkedList<YCFSecISOCtryLangBuff>();
		Iterator<YCFSecISOCtryLangBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCtryLangBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCtryLang().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId(),
				cur.getRequiredISOLangId() );
			deleteISOCtryLang( Authorization, cur );
		}
	}

	public void deleteISOCtryLangByCtryIdx( YCFSecAuthorization Authorization,
		short argISOCtryId )
	{
		YCFSecISOCtryLangByCtryIdxKey key = schema.getFactoryISOCtryLang().newCtryIdxKey();
		key.setRequiredISOCtryId( argISOCtryId );
		deleteISOCtryLangByCtryIdx( Authorization, key );
	}

	public void deleteISOCtryLangByCtryIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangByCtryIdxKey argKey )
	{
		YCFSecISOCtryLangBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOCtryLangBuff> matchSet = new LinkedList<YCFSecISOCtryLangBuff>();
		Iterator<YCFSecISOCtryLangBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCtryLangBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCtryLang().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId(),
				cur.getRequiredISOLangId() );
			deleteISOCtryLang( Authorization, cur );
		}
	}

	public void deleteISOCtryLangByLangIdx( YCFSecAuthorization Authorization,
		short argISOLangId )
	{
		YCFSecISOCtryLangByLangIdxKey key = schema.getFactoryISOCtryLang().newLangIdxKey();
		key.setRequiredISOLangId( argISOLangId );
		deleteISOCtryLangByLangIdx( Authorization, key );
	}

	public void deleteISOCtryLangByLangIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryLangByLangIdxKey argKey )
	{
		YCFSecISOCtryLangBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOCtryLangBuff> matchSet = new LinkedList<YCFSecISOCtryLangBuff>();
		Iterator<YCFSecISOCtryLangBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCtryLangBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCtryLang().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId(),
				cur.getRequiredISOLangId() );
			deleteISOCtryLang( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
