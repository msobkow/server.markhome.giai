
// Description: Java 11 in-memory RAM DbIO implementation for ISOLang.

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
 *	YCFIntRamISOLangTable in-memory RAM DbIO implementation
 *	for ISOLang.
 */
public class YCFIntRamISOLangTable
	implements IYCFIntISOLangTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecISOLangPKey,
				YCFSecISOLangBuff > dictByPKey
		= new HashMap< YCFSecISOLangPKey,
				YCFSecISOLangBuff >();
	private Map< YCFSecISOLangByCode3IdxKey,
			YCFSecISOLangBuff > dictByCode3Idx
		= new HashMap< YCFSecISOLangByCode3IdxKey,
			YCFSecISOLangBuff >();
	private Map< YCFSecISOLangByCode2IdxKey,
				Map< YCFSecISOLangPKey,
					YCFSecISOLangBuff >> dictByCode2Idx
		= new HashMap< YCFSecISOLangByCode2IdxKey,
				Map< YCFSecISOLangPKey,
					YCFSecISOLangBuff >>();

	public YCFIntRamISOLangTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createISOLang( YCFSecAuthorization Authorization,
		YCFSecISOLangBuff Buff )
	{
		final String S_ProcName = "createISOLang";
		YCFSecISOLangPKey pkey = schema.getFactoryISOLang().newPKey();
		pkey.setRequiredISOLangId( schema.nextISOLangIdGen() );
		Buff.setRequiredISOLangId( pkey.getRequiredISOLangId() );
		YCFSecISOLangByCode3IdxKey keyCode3Idx = schema.getFactoryISOLang().newCode3IdxKey();
		keyCode3Idx.setRequiredISO6392Code( Buff.getRequiredISO6392Code() );

		YCFSecISOLangByCode2IdxKey keyCode2Idx = schema.getFactoryISOLang().newCode2IdxKey();
		keyCode2Idx.setOptionalISO6391Code( Buff.getOptionalISO6391Code() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByCode3Idx.containsKey( keyCode3Idx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ISOLang6392Idx",
				keyCode3Idx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByCode3Idx.put( keyCode3Idx, Buff );

		Map< YCFSecISOLangPKey, YCFSecISOLangBuff > subdictCode2Idx;
		if( dictByCode2Idx.containsKey( keyCode2Idx ) ) {
			subdictCode2Idx = dictByCode2Idx.get( keyCode2Idx );
		}
		else {
			subdictCode2Idx = new HashMap< YCFSecISOLangPKey, YCFSecISOLangBuff >();
			dictByCode2Idx.put( keyCode2Idx, subdictCode2Idx );
		}
		subdictCode2Idx.put( pkey, Buff );

	}

	public YCFSecISOLangBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOLang.readDerived";
		YCFSecISOLangPKey key = schema.getFactoryISOLang().newPKey();
		key.setRequiredISOLangId( PKey.getRequiredISOLangId() );
		YCFSecISOLangBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOLangBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOLang.readDerived";
		YCFSecISOLangPKey key = schema.getFactoryISOLang().newPKey();
		key.setRequiredISOLangId( PKey.getRequiredISOLangId() );
		YCFSecISOLangBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOLangBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamISOLang.readAllDerived";
		YCFSecISOLangBuff[] retList = new YCFSecISOLangBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecISOLangBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecISOLangBuff readDerivedByCode3Idx( YCFSecAuthorization Authorization,
		String ISO6392Code )
	{
		final String S_ProcName = "YCFIntRamISOLang.readDerivedByCode3Idx";
		YCFSecISOLangByCode3IdxKey key = schema.getFactoryISOLang().newCode3IdxKey();
		key.setRequiredISO6392Code( ISO6392Code );

		YCFSecISOLangBuff buff;
		if( dictByCode3Idx.containsKey( key ) ) {
			buff = dictByCode3Idx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOLangBuff[] readDerivedByCode2Idx( YCFSecAuthorization Authorization,
		String ISO6391Code )
	{
		final String S_ProcName = "YCFIntRamISOLang.readDerivedByCode2Idx";
		YCFSecISOLangByCode2IdxKey key = schema.getFactoryISOLang().newCode2IdxKey();
		key.setOptionalISO6391Code( ISO6391Code );

		YCFSecISOLangBuff[] recArray;
		if( dictByCode2Idx.containsKey( key ) ) {
			Map< YCFSecISOLangPKey, YCFSecISOLangBuff > subdictCode2Idx
				= dictByCode2Idx.get( key );
			recArray = new YCFSecISOLangBuff[ subdictCode2Idx.size() ];
			Iterator< YCFSecISOLangBuff > iter = subdictCode2Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecISOLangPKey, YCFSecISOLangBuff > subdictCode2Idx
				= new HashMap< YCFSecISOLangPKey, YCFSecISOLangBuff >();
			dictByCode2Idx.put( key, subdictCode2Idx );
			recArray = new YCFSecISOLangBuff[0];
		}
		return( recArray );
	}

	public YCFSecISOLangBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOLangId )
	{
		final String S_ProcName = "YCFIntRamISOLang.readDerivedByIdIdx() ";
		YCFSecISOLangPKey key = schema.getFactoryISOLang().newPKey();
		key.setRequiredISOLangId( ISOLangId );

		YCFSecISOLangBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOLangBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOLang.readBuff";
		YCFSecISOLangBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a007" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOLangBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecISOLangBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a007" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOLangBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamISOLang.readAllBuff";
		YCFSecISOLangBuff buff;
		ArrayList<YCFSecISOLangBuff> filteredList = new ArrayList<YCFSecISOLangBuff>();
		YCFSecISOLangBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a007" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOLangBuff[0] ) );
	}

	public YCFSecISOLangBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOLangId )
	{
		final String S_ProcName = "YCFIntRamISOLang.readBuffByIdIdx() ";
		YCFSecISOLangBuff buff = readDerivedByIdIdx( Authorization,
			ISOLangId );
		if( ( buff != null ) && buff.getClassCode().equals( "a007" ) ) {
			return( (YCFSecISOLangBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOLangBuff readBuffByCode3Idx( YCFSecAuthorization Authorization,
		String ISO6392Code )
	{
		final String S_ProcName = "YCFIntRamISOLang.readBuffByCode3Idx() ";
		YCFSecISOLangBuff buff = readDerivedByCode3Idx( Authorization,
			ISO6392Code );
		if( ( buff != null ) && buff.getClassCode().equals( "a007" ) ) {
			return( (YCFSecISOLangBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOLangBuff[] readBuffByCode2Idx( YCFSecAuthorization Authorization,
		String ISO6391Code )
	{
		final String S_ProcName = "YCFIntRamISOLang.readBuffByCode2Idx() ";
		YCFSecISOLangBuff buff;
		ArrayList<YCFSecISOLangBuff> filteredList = new ArrayList<YCFSecISOLangBuff>();
		YCFSecISOLangBuff[] buffList = readDerivedByCode2Idx( Authorization,
			ISO6391Code );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a007" ) ) {
				filteredList.add( (YCFSecISOLangBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOLangBuff[0] ) );
	}

	public void updateISOLang( YCFSecAuthorization Authorization,
		YCFSecISOLangBuff Buff )
	{
		YCFSecISOLangPKey pkey = schema.getFactoryISOLang().newPKey();
		pkey.setRequiredISOLangId( Buff.getRequiredISOLangId() );
		YCFSecISOLangBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateISOLang",
				"Existing record not found",
				"ISOLang",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateISOLang",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecISOLangByCode3IdxKey existingKeyCode3Idx = schema.getFactoryISOLang().newCode3IdxKey();
		existingKeyCode3Idx.setRequiredISO6392Code( existing.getRequiredISO6392Code() );

		YCFSecISOLangByCode3IdxKey newKeyCode3Idx = schema.getFactoryISOLang().newCode3IdxKey();
		newKeyCode3Idx.setRequiredISO6392Code( Buff.getRequiredISO6392Code() );

		YCFSecISOLangByCode2IdxKey existingKeyCode2Idx = schema.getFactoryISOLang().newCode2IdxKey();
		existingKeyCode2Idx.setOptionalISO6391Code( existing.getOptionalISO6391Code() );

		YCFSecISOLangByCode2IdxKey newKeyCode2Idx = schema.getFactoryISOLang().newCode2IdxKey();
		newKeyCode2Idx.setOptionalISO6391Code( Buff.getOptionalISO6391Code() );

		// Check unique indexes

		if( ! existingKeyCode3Idx.equals( newKeyCode3Idx ) ) {
			if( dictByCode3Idx.containsKey( newKeyCode3Idx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateISOLang",
					"ISOLang6392Idx",
					newKeyCode3Idx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFSecISOLangPKey, YCFSecISOLangBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByCode3Idx.remove( existingKeyCode3Idx );
		dictByCode3Idx.put( newKeyCode3Idx, Buff );

		subdict = dictByCode2Idx.get( existingKeyCode2Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCode2Idx.containsKey( newKeyCode2Idx ) ) {
			subdict = dictByCode2Idx.get( newKeyCode2Idx );
		}
		else {
			subdict = new HashMap< YCFSecISOLangPKey, YCFSecISOLangBuff >();
			dictByCode2Idx.put( newKeyCode2Idx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteISOLang( YCFSecAuthorization Authorization,
		YCFSecISOLangBuff Buff )
	{
		final String S_ProcName = "YCFIntRamISOLangTable.deleteISOLang() ";
		String classCode;
		YCFSecISOLangPKey pkey = schema.getFactoryISOLang().newPKey();
		pkey.setRequiredISOLangId( Buff.getRequiredISOLangId() );
		YCFSecISOLangBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteISOLang",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckISOLangCountries[] = schema.getTableISOCtryLang().readDerivedByLangIdx( Authorization,
						existing.getRequiredISOLangId() );
		if( arrCheckISOLangCountries.length > 0 ) {
			schema.getTableISOCtryLang().deleteISOCtryLangByLangIdx( Authorization,
						existing.getRequiredISOLangId() );
		}
		YCFSecISOLangByCode3IdxKey keyCode3Idx = schema.getFactoryISOLang().newCode3IdxKey();
		keyCode3Idx.setRequiredISO6392Code( existing.getRequiredISO6392Code() );

		YCFSecISOLangByCode2IdxKey keyCode2Idx = schema.getFactoryISOLang().newCode2IdxKey();
		keyCode2Idx.setOptionalISO6391Code( existing.getOptionalISO6391Code() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecISOLangPKey, YCFSecISOLangBuff > subdict;

		dictByPKey.remove( pkey );

		dictByCode3Idx.remove( keyCode3Idx );

		subdict = dictByCode2Idx.get( keyCode2Idx );
		subdict.remove( pkey );

	}
	public void deleteISOLangByIdIdx( YCFSecAuthorization Authorization,
		short argISOLangId )
	{
		YCFSecISOLangPKey key = schema.getFactoryISOLang().newPKey();
		key.setRequiredISOLangId( argISOLangId );
		deleteISOLangByIdIdx( Authorization, key );
	}

	public void deleteISOLangByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOLangPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecISOLangBuff cur;
		LinkedList<YCFSecISOLangBuff> matchSet = new LinkedList<YCFSecISOLangBuff>();
		Iterator<YCFSecISOLangBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOLangBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOLang().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOLangId() );
			deleteISOLang( Authorization, cur );
		}
	}

	public void deleteISOLangByCode3Idx( YCFSecAuthorization Authorization,
		String argISO6392Code )
	{
		YCFSecISOLangByCode3IdxKey key = schema.getFactoryISOLang().newCode3IdxKey();
		key.setRequiredISO6392Code( argISO6392Code );
		deleteISOLangByCode3Idx( Authorization, key );
	}

	public void deleteISOLangByCode3Idx( YCFSecAuthorization Authorization,
		YCFSecISOLangByCode3IdxKey argKey )
	{
		YCFSecISOLangBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOLangBuff> matchSet = new LinkedList<YCFSecISOLangBuff>();
		Iterator<YCFSecISOLangBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOLangBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOLang().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOLangId() );
			deleteISOLang( Authorization, cur );
		}
	}

	public void deleteISOLangByCode2Idx( YCFSecAuthorization Authorization,
		String argISO6391Code )
	{
		YCFSecISOLangByCode2IdxKey key = schema.getFactoryISOLang().newCode2IdxKey();
		key.setOptionalISO6391Code( argISO6391Code );
		deleteISOLangByCode2Idx( Authorization, key );
	}

	public void deleteISOLangByCode2Idx( YCFSecAuthorization Authorization,
		YCFSecISOLangByCode2IdxKey argKey )
	{
		YCFSecISOLangBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalISO6391Code() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOLangBuff> matchSet = new LinkedList<YCFSecISOLangBuff>();
		Iterator<YCFSecISOLangBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOLangBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOLang().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOLangId() );
			deleteISOLang( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
