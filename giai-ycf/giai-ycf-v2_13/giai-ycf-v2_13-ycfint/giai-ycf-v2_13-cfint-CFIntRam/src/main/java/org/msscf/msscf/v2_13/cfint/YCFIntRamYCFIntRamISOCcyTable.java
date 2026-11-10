
// Description: Java 11 in-memory RAM DbIO implementation for ISOCcy.

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
 *	YCFIntRamISOCcyTable in-memory RAM DbIO implementation
 *	for ISOCcy.
 */
public class YCFIntRamISOCcyTable
	implements IYCFIntISOCcyTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecISOCcyPKey,
				YCFSecISOCcyBuff > dictByPKey
		= new HashMap< YCFSecISOCcyPKey,
				YCFSecISOCcyBuff >();
	private Map< YCFSecISOCcyByCcyCdIdxKey,
			YCFSecISOCcyBuff > dictByCcyCdIdx
		= new HashMap< YCFSecISOCcyByCcyCdIdxKey,
			YCFSecISOCcyBuff >();
	private Map< YCFSecISOCcyByCcyNmIdxKey,
			YCFSecISOCcyBuff > dictByCcyNmIdx
		= new HashMap< YCFSecISOCcyByCcyNmIdxKey,
			YCFSecISOCcyBuff >();

	public YCFIntRamISOCcyTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createISOCcy( YCFSecAuthorization Authorization,
		YCFSecISOCcyBuff Buff )
	{
		final String S_ProcName = "createISOCcy";
		YCFSecISOCcyPKey pkey = schema.getFactoryISOCcy().newPKey();
		pkey.setRequiredISOCcyId( schema.nextISOCcyIdGen() );
		Buff.setRequiredISOCcyId( pkey.getRequiredISOCcyId() );
		YCFSecISOCcyByCcyCdIdxKey keyCcyCdIdx = schema.getFactoryISOCcy().newCcyCdIdxKey();
		keyCcyCdIdx.setRequiredISOCode( Buff.getRequiredISOCode() );

		YCFSecISOCcyByCcyNmIdxKey keyCcyNmIdx = schema.getFactoryISOCcy().newCcyNmIdxKey();
		keyCcyNmIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByCcyCdIdx.containsKey( keyCcyCdIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ISOCcyCodeIdx",
				keyCcyCdIdx );
		}

		if( dictByCcyNmIdx.containsKey( keyCcyNmIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ISOCcyNameIdx",
				keyCcyNmIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByCcyCdIdx.put( keyCcyCdIdx, Buff );

		dictByCcyNmIdx.put( keyCcyNmIdx, Buff );

	}

	public YCFSecISOCcyBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readDerived";
		YCFSecISOCcyPKey key = schema.getFactoryISOCcy().newPKey();
		key.setRequiredISOCcyId( PKey.getRequiredISOCcyId() );
		YCFSecISOCcyBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCcyBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readDerived";
		YCFSecISOCcyPKey key = schema.getFactoryISOCcy().newPKey();
		key.setRequiredISOCcyId( PKey.getRequiredISOCcyId() );
		YCFSecISOCcyBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCcyBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamISOCcy.readAllDerived";
		YCFSecISOCcyBuff[] retList = new YCFSecISOCcyBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecISOCcyBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecISOCcyBuff readDerivedByCcyCdIdx( YCFSecAuthorization Authorization,
		String ISOCode )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readDerivedByCcyCdIdx";
		YCFSecISOCcyByCcyCdIdxKey key = schema.getFactoryISOCcy().newCcyCdIdxKey();
		key.setRequiredISOCode( ISOCode );

		YCFSecISOCcyBuff buff;
		if( dictByCcyCdIdx.containsKey( key ) ) {
			buff = dictByCcyCdIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCcyBuff readDerivedByCcyNmIdx( YCFSecAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readDerivedByCcyNmIdx";
		YCFSecISOCcyByCcyNmIdxKey key = schema.getFactoryISOCcy().newCcyNmIdxKey();
		key.setRequiredName( Name );

		YCFSecISOCcyBuff buff;
		if( dictByCcyNmIdx.containsKey( key ) ) {
			buff = dictByCcyNmIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCcyBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOCcyId )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readDerivedByIdIdx() ";
		YCFSecISOCcyPKey key = schema.getFactoryISOCcy().newPKey();
		key.setRequiredISOCcyId( ISOCcyId );

		YCFSecISOCcyBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCcyBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey PKey )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readBuff";
		YCFSecISOCcyBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a003" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCcyBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecISOCcyBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a003" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCcyBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readAllBuff";
		YCFSecISOCcyBuff buff;
		ArrayList<YCFSecISOCcyBuff> filteredList = new ArrayList<YCFSecISOCcyBuff>();
		YCFSecISOCcyBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a003" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOCcyBuff[0] ) );
	}

	public YCFSecISOCcyBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOCcyId )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readBuffByIdIdx() ";
		YCFSecISOCcyBuff buff = readDerivedByIdIdx( Authorization,
			ISOCcyId );
		if( ( buff != null ) && buff.getClassCode().equals( "a003" ) ) {
			return( (YCFSecISOCcyBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOCcyBuff readBuffByCcyCdIdx( YCFSecAuthorization Authorization,
		String ISOCode )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readBuffByCcyCdIdx() ";
		YCFSecISOCcyBuff buff = readDerivedByCcyCdIdx( Authorization,
			ISOCode );
		if( ( buff != null ) && buff.getClassCode().equals( "a003" ) ) {
			return( (YCFSecISOCcyBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOCcyBuff readBuffByCcyNmIdx( YCFSecAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFIntRamISOCcy.readBuffByCcyNmIdx() ";
		YCFSecISOCcyBuff buff = readDerivedByCcyNmIdx( Authorization,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a003" ) ) {
			return( (YCFSecISOCcyBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateISOCcy( YCFSecAuthorization Authorization,
		YCFSecISOCcyBuff Buff )
	{
		YCFSecISOCcyPKey pkey = schema.getFactoryISOCcy().newPKey();
		pkey.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );
		YCFSecISOCcyBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateISOCcy",
				"Existing record not found",
				"ISOCcy",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateISOCcy",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecISOCcyByCcyCdIdxKey existingKeyCcyCdIdx = schema.getFactoryISOCcy().newCcyCdIdxKey();
		existingKeyCcyCdIdx.setRequiredISOCode( existing.getRequiredISOCode() );

		YCFSecISOCcyByCcyCdIdxKey newKeyCcyCdIdx = schema.getFactoryISOCcy().newCcyCdIdxKey();
		newKeyCcyCdIdx.setRequiredISOCode( Buff.getRequiredISOCode() );

		YCFSecISOCcyByCcyNmIdxKey existingKeyCcyNmIdx = schema.getFactoryISOCcy().newCcyNmIdxKey();
		existingKeyCcyNmIdx.setRequiredName( existing.getRequiredName() );

		YCFSecISOCcyByCcyNmIdxKey newKeyCcyNmIdx = schema.getFactoryISOCcy().newCcyNmIdxKey();
		newKeyCcyNmIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyCcyCdIdx.equals( newKeyCcyCdIdx ) ) {
			if( dictByCcyCdIdx.containsKey( newKeyCcyCdIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateISOCcy",
					"ISOCcyCodeIdx",
					newKeyCcyCdIdx );
			}
		}

		if( ! existingKeyCcyNmIdx.equals( newKeyCcyNmIdx ) ) {
			if( dictByCcyNmIdx.containsKey( newKeyCcyNmIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateISOCcy",
					"ISOCcyNameIdx",
					newKeyCcyNmIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFSecISOCcyPKey, YCFSecISOCcyBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByCcyCdIdx.remove( existingKeyCcyCdIdx );
		dictByCcyCdIdx.put( newKeyCcyCdIdx, Buff );

		dictByCcyNmIdx.remove( existingKeyCcyNmIdx );
		dictByCcyNmIdx.put( newKeyCcyNmIdx, Buff );

	}

	public void deleteISOCcy( YCFSecAuthorization Authorization,
		YCFSecISOCcyBuff Buff )
	{
		final String S_ProcName = "YCFIntRamISOCcyTable.deleteISOCcy() ";
		String classCode;
		YCFSecISOCcyPKey pkey = schema.getFactoryISOCcy().newPKey();
		pkey.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );
		YCFSecISOCcyBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteISOCcy",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckISOCcyCountries[] = schema.getTableISOCtryCcy().readDerivedByCcyIdx( Authorization,
						existing.getRequiredISOCcyId() );
		if( arrCheckISOCcyCountries.length > 0 ) {
			schema.getTableISOCtryCcy().deleteISOCtryCcyByCcyIdx( Authorization,
						existing.getRequiredISOCcyId() );
		}
		YCFSecISOCcyByCcyCdIdxKey keyCcyCdIdx = schema.getFactoryISOCcy().newCcyCdIdxKey();
		keyCcyCdIdx.setRequiredISOCode( existing.getRequiredISOCode() );

		YCFSecISOCcyByCcyNmIdxKey keyCcyNmIdx = schema.getFactoryISOCcy().newCcyNmIdxKey();
		keyCcyNmIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecISOCcyPKey, YCFSecISOCcyBuff > subdict;

		dictByPKey.remove( pkey );

		dictByCcyCdIdx.remove( keyCcyCdIdx );

		dictByCcyNmIdx.remove( keyCcyNmIdx );

	}
	public void deleteISOCcyByIdIdx( YCFSecAuthorization Authorization,
		short argISOCcyId )
	{
		YCFSecISOCcyPKey key = schema.getFactoryISOCcy().newPKey();
		key.setRequiredISOCcyId( argISOCcyId );
		deleteISOCcyByIdIdx( Authorization, key );
	}

	public void deleteISOCcyByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecISOCcyBuff cur;
		LinkedList<YCFSecISOCcyBuff> matchSet = new LinkedList<YCFSecISOCcyBuff>();
		Iterator<YCFSecISOCcyBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCcyBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCcy().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCcyId() );
			deleteISOCcy( Authorization, cur );
		}
	}

	public void deleteISOCcyByCcyCdIdx( YCFSecAuthorization Authorization,
		String argISOCode )
	{
		YCFSecISOCcyByCcyCdIdxKey key = schema.getFactoryISOCcy().newCcyCdIdxKey();
		key.setRequiredISOCode( argISOCode );
		deleteISOCcyByCcyCdIdx( Authorization, key );
	}

	public void deleteISOCcyByCcyCdIdx( YCFSecAuthorization Authorization,
		YCFSecISOCcyByCcyCdIdxKey argKey )
	{
		YCFSecISOCcyBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOCcyBuff> matchSet = new LinkedList<YCFSecISOCcyBuff>();
		Iterator<YCFSecISOCcyBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCcyBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCcy().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCcyId() );
			deleteISOCcy( Authorization, cur );
		}
	}

	public void deleteISOCcyByCcyNmIdx( YCFSecAuthorization Authorization,
		String argName )
	{
		YCFSecISOCcyByCcyNmIdxKey key = schema.getFactoryISOCcy().newCcyNmIdxKey();
		key.setRequiredName( argName );
		deleteISOCcyByCcyNmIdx( Authorization, key );
	}

	public void deleteISOCcyByCcyNmIdx( YCFSecAuthorization Authorization,
		YCFSecISOCcyByCcyNmIdxKey argKey )
	{
		YCFSecISOCcyBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOCcyBuff> matchSet = new LinkedList<YCFSecISOCcyBuff>();
		Iterator<YCFSecISOCcyBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCcyBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCcy().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCcyId() );
			deleteISOCcy( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
