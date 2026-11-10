
// Description: Java 11 in-memory RAM DbIO implementation for ISOCtry.

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
 *	YCFBamRamISOCtryTable in-memory RAM DbIO implementation
 *	for ISOCtry.
 */
public class YCFBamRamISOCtryTable
	implements IYCFBamISOCtryTable
{
	private IYCFBamSchema schema;
	private Map< YCFSecISOCtryPKey,
				YCFSecISOCtryBuff > dictByPKey
		= new HashMap< YCFSecISOCtryPKey,
				YCFSecISOCtryBuff >();
	private Map< YCFSecISOCtryByISOCodeIdxKey,
			YCFSecISOCtryBuff > dictByISOCodeIdx
		= new HashMap< YCFSecISOCtryByISOCodeIdxKey,
			YCFSecISOCtryBuff >();
	private Map< YCFSecISOCtryByNameIdxKey,
			YCFSecISOCtryBuff > dictByNameIdx
		= new HashMap< YCFSecISOCtryByNameIdxKey,
			YCFSecISOCtryBuff >();

	public YCFBamRamISOCtryTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createISOCtry( YCFSecAuthorization Authorization,
		YCFSecISOCtryBuff Buff )
	{
		final String S_ProcName = "createISOCtry";
		YCFSecISOCtryPKey pkey = schema.getFactoryISOCtry().newPKey();
		pkey.setRequiredISOCtryId( schema.nextISOCtryIdGen() );
		Buff.setRequiredISOCtryId( pkey.getRequiredISOCtryId() );
		YCFSecISOCtryByISOCodeIdxKey keyISOCodeIdx = schema.getFactoryISOCtry().newISOCodeIdxKey();
		keyISOCodeIdx.setRequiredISOCode( Buff.getRequiredISOCode() );

		YCFSecISOCtryByNameIdxKey keyNameIdx = schema.getFactoryISOCtry().newNameIdxKey();
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByISOCodeIdx.containsKey( keyISOCodeIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ISOCtryCodeIdx",
				keyISOCodeIdx );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ISOCtryNameIdx",
				keyNameIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByISOCodeIdx.put( keyISOCodeIdx, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

	}

	public YCFSecISOCtryBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOCtryPKey PKey )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readDerived";
		YCFSecISOCtryPKey key = schema.getFactoryISOCtry().newPKey();
		key.setRequiredISOCtryId( PKey.getRequiredISOCtryId() );
		YCFSecISOCtryBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOCtryPKey PKey )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readDerived";
		YCFSecISOCtryPKey key = schema.getFactoryISOCtry().newPKey();
		key.setRequiredISOCtryId( PKey.getRequiredISOCtryId() );
		YCFSecISOCtryBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamISOCtry.readAllDerived";
		YCFSecISOCtryBuff[] retList = new YCFSecISOCtryBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecISOCtryBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecISOCtryBuff readDerivedByISOCodeIdx( YCFSecAuthorization Authorization,
		String ISOCode )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readDerivedByISOCodeIdx";
		YCFSecISOCtryByISOCodeIdxKey key = schema.getFactoryISOCtry().newISOCodeIdxKey();
		key.setRequiredISOCode( ISOCode );

		YCFSecISOCtryBuff buff;
		if( dictByISOCodeIdx.containsKey( key ) ) {
			buff = dictByISOCodeIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readDerivedByNameIdx";
		YCFSecISOCtryByNameIdxKey key = schema.getFactoryISOCtry().newNameIdxKey();
		key.setRequiredName( Name );

		YCFSecISOCtryBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOCtryId )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readDerivedByIdIdx() ";
		YCFSecISOCtryPKey key = schema.getFactoryISOCtry().newPKey();
		key.setRequiredISOCtryId( ISOCtryId );

		YCFSecISOCtryBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOCtryPKey PKey )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readBuff";
		YCFSecISOCtryBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a004" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOCtryPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecISOCtryBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a004" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecISOCtryBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readAllBuff";
		YCFSecISOCtryBuff buff;
		ArrayList<YCFSecISOCtryBuff> filteredList = new ArrayList<YCFSecISOCtryBuff>();
		YCFSecISOCtryBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a004" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecISOCtryBuff[0] ) );
	}

	public YCFSecISOCtryBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOCtryId )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readBuffByIdIdx() ";
		YCFSecISOCtryBuff buff = readDerivedByIdIdx( Authorization,
			ISOCtryId );
		if( ( buff != null ) && buff.getClassCode().equals( "a004" ) ) {
			return( (YCFSecISOCtryBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOCtryBuff readBuffByISOCodeIdx( YCFSecAuthorization Authorization,
		String ISOCode )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readBuffByISOCodeIdx() ";
		YCFSecISOCtryBuff buff = readDerivedByISOCodeIdx( Authorization,
			ISOCode );
		if( ( buff != null ) && buff.getClassCode().equals( "a004" ) ) {
			return( (YCFSecISOCtryBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecISOCtryBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFBamRamISOCtry.readBuffByNameIdx() ";
		YCFSecISOCtryBuff buff = readDerivedByNameIdx( Authorization,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a004" ) ) {
			return( (YCFSecISOCtryBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateISOCtry( YCFSecAuthorization Authorization,
		YCFSecISOCtryBuff Buff )
	{
		YCFSecISOCtryPKey pkey = schema.getFactoryISOCtry().newPKey();
		pkey.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );
		YCFSecISOCtryBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateISOCtry",
				"Existing record not found",
				"ISOCtry",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateISOCtry",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecISOCtryByISOCodeIdxKey existingKeyISOCodeIdx = schema.getFactoryISOCtry().newISOCodeIdxKey();
		existingKeyISOCodeIdx.setRequiredISOCode( existing.getRequiredISOCode() );

		YCFSecISOCtryByISOCodeIdxKey newKeyISOCodeIdx = schema.getFactoryISOCtry().newISOCodeIdxKey();
		newKeyISOCodeIdx.setRequiredISOCode( Buff.getRequiredISOCode() );

		YCFSecISOCtryByNameIdxKey existingKeyNameIdx = schema.getFactoryISOCtry().newNameIdxKey();
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFSecISOCtryByNameIdxKey newKeyNameIdx = schema.getFactoryISOCtry().newNameIdxKey();
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyISOCodeIdx.equals( newKeyISOCodeIdx ) ) {
			if( dictByISOCodeIdx.containsKey( newKeyISOCodeIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateISOCtry",
					"ISOCtryCodeIdx",
					newKeyISOCodeIdx );
			}
		}

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateISOCtry",
					"ISOCtryNameIdx",
					newKeyNameIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFSecISOCtryPKey, YCFSecISOCtryBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByISOCodeIdx.remove( existingKeyISOCodeIdx );
		dictByISOCodeIdx.put( newKeyISOCodeIdx, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

	}

	public void deleteISOCtry( YCFSecAuthorization Authorization,
		YCFSecISOCtryBuff Buff )
	{
		final String S_ProcName = "YCFBamRamISOCtryTable.deleteISOCtry() ";
		String classCode;
		YCFSecISOCtryPKey pkey = schema.getFactoryISOCtry().newPKey();
		pkey.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );
		YCFSecISOCtryBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteISOCtry",
				pkey );
		}
					schema.getTableISOCtryLang().deleteISOCtryLangByCtryIdx( Authorization,
						existing.getRequiredISOCtryId() );
					schema.getTableISOCtryCcy().deleteISOCtryCcyByCtryIdx( Authorization,
						existing.getRequiredISOCtryId() );
		YCFSecISOCtryByISOCodeIdxKey keyISOCodeIdx = schema.getFactoryISOCtry().newISOCodeIdxKey();
		keyISOCodeIdx.setRequiredISOCode( existing.getRequiredISOCode() );

		YCFSecISOCtryByNameIdxKey keyNameIdx = schema.getFactoryISOCtry().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecISOCtryPKey, YCFSecISOCtryBuff > subdict;

		dictByPKey.remove( pkey );

		dictByISOCodeIdx.remove( keyISOCodeIdx );

		dictByNameIdx.remove( keyNameIdx );

	}
	public void deleteISOCtryByIdIdx( YCFSecAuthorization Authorization,
		short argISOCtryId )
	{
		YCFSecISOCtryPKey key = schema.getFactoryISOCtry().newPKey();
		key.setRequiredISOCtryId( argISOCtryId );
		deleteISOCtryByIdIdx( Authorization, key );
	}

	public void deleteISOCtryByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecISOCtryBuff cur;
		LinkedList<YCFSecISOCtryBuff> matchSet = new LinkedList<YCFSecISOCtryBuff>();
		Iterator<YCFSecISOCtryBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCtryBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCtry().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId() );
			deleteISOCtry( Authorization, cur );
		}
	}

	public void deleteISOCtryByISOCodeIdx( YCFSecAuthorization Authorization,
		String argISOCode )
	{
		YCFSecISOCtryByISOCodeIdxKey key = schema.getFactoryISOCtry().newISOCodeIdxKey();
		key.setRequiredISOCode( argISOCode );
		deleteISOCtryByISOCodeIdx( Authorization, key );
	}

	public void deleteISOCtryByISOCodeIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryByISOCodeIdxKey argKey )
	{
		YCFSecISOCtryBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOCtryBuff> matchSet = new LinkedList<YCFSecISOCtryBuff>();
		Iterator<YCFSecISOCtryBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCtryBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCtry().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId() );
			deleteISOCtry( Authorization, cur );
		}
	}

	public void deleteISOCtryByNameIdx( YCFSecAuthorization Authorization,
		String argName )
	{
		YCFSecISOCtryByNameIdxKey key = schema.getFactoryISOCtry().newNameIdxKey();
		key.setRequiredName( argName );
		deleteISOCtryByNameIdx( Authorization, key );
	}

	public void deleteISOCtryByNameIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryByNameIdxKey argKey )
	{
		YCFSecISOCtryBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecISOCtryBuff> matchSet = new LinkedList<YCFSecISOCtryBuff>();
		Iterator<YCFSecISOCtryBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecISOCtryBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableISOCtry().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId() );
			deleteISOCtry( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
