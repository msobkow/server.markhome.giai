
// Description: Java 11 in-memory RAM DbIO implementation for MimeType.

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
 *	YCFIntRamMimeTypeTable in-memory RAM DbIO implementation
 *	for MimeType.
 */
public class YCFIntRamMimeTypeTable
	implements IYCFIntMimeTypeTable
{
	private IYCFIntSchema schema;
	private Map< YCFIntMimeTypePKey,
				YCFIntMimeTypeBuff > dictByPKey
		= new HashMap< YCFIntMimeTypePKey,
				YCFIntMimeTypeBuff >();
	private Map< YCFIntMimeTypeByUNameIdxKey,
			YCFIntMimeTypeBuff > dictByUNameIdx
		= new HashMap< YCFIntMimeTypeByUNameIdxKey,
			YCFIntMimeTypeBuff >();

	public YCFIntRamMimeTypeTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createMimeType( YCFSecAuthorization Authorization,
		YCFIntMimeTypeBuff Buff )
	{
		final String S_ProcName = "createMimeType";
		YCFIntMimeTypePKey pkey = schema.getFactoryMimeType().newPKey();
		pkey.setRequiredMimeTypeId( schema.nextMimeTypeIdGen() );
		Buff.setRequiredMimeTypeId( pkey.getRequiredMimeTypeId() );
		YCFIntMimeTypeByUNameIdxKey keyUNameIdx = schema.getFactoryMimeType().newUNameIdxKey();
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"MimeTypeUNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFIntMimeTypeBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey PKey )
	{
		final String S_ProcName = "YCFIntRamMimeType.readDerived";
		YCFIntMimeTypePKey key = schema.getFactoryMimeType().newPKey();
		key.setRequiredMimeTypeId( PKey.getRequiredMimeTypeId() );
		YCFIntMimeTypeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMimeTypeBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey PKey )
	{
		final String S_ProcName = "YCFIntRamMimeType.readDerived";
		YCFIntMimeTypePKey key = schema.getFactoryMimeType().newPKey();
		key.setRequiredMimeTypeId( PKey.getRequiredMimeTypeId() );
		YCFIntMimeTypeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMimeTypeBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamMimeType.readAllDerived";
		YCFIntMimeTypeBuff[] retList = new YCFIntMimeTypeBuff[ dictByPKey.values().size() ];
		Iterator< YCFIntMimeTypeBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFIntMimeTypeBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFIntRamMimeType.readDerivedByUNameIdx";
		YCFIntMimeTypeByUNameIdxKey key = schema.getFactoryMimeType().newUNameIdxKey();
		key.setRequiredName( Name );

		YCFIntMimeTypeBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMimeTypeBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		int MimeTypeId )
	{
		final String S_ProcName = "YCFIntRamMimeType.readDerivedByIdIdx() ";
		YCFIntMimeTypePKey key = schema.getFactoryMimeType().newPKey();
		key.setRequiredMimeTypeId( MimeTypeId );

		YCFIntMimeTypeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMimeTypeBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey PKey )
	{
		final String S_ProcName = "YCFIntRamMimeType.readBuff";
		YCFIntMimeTypeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a103" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMimeTypeBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFIntMimeTypeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a103" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntMimeTypeBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamMimeType.readAllBuff";
		YCFIntMimeTypeBuff buff;
		ArrayList<YCFIntMimeTypeBuff> filteredList = new ArrayList<YCFIntMimeTypeBuff>();
		YCFIntMimeTypeBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a103" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFIntMimeTypeBuff[0] ) );
	}

	public YCFIntMimeTypeBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		int MimeTypeId )
	{
		final String S_ProcName = "YCFIntRamMimeType.readBuffByIdIdx() ";
		YCFIntMimeTypeBuff buff = readDerivedByIdIdx( Authorization,
			MimeTypeId );
		if( ( buff != null ) && buff.getClassCode().equals( "a103" ) ) {
			return( (YCFIntMimeTypeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntMimeTypeBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFIntRamMimeType.readBuffByUNameIdx() ";
		YCFIntMimeTypeBuff buff = readDerivedByUNameIdx( Authorization,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a103" ) ) {
			return( (YCFIntMimeTypeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateMimeType( YCFSecAuthorization Authorization,
		YCFIntMimeTypeBuff Buff )
	{
		YCFIntMimeTypePKey pkey = schema.getFactoryMimeType().newPKey();
		pkey.setRequiredMimeTypeId( Buff.getRequiredMimeTypeId() );
		YCFIntMimeTypeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateMimeType",
				"Existing record not found",
				"MimeType",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateMimeType",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFIntMimeTypeByUNameIdxKey existingKeyUNameIdx = schema.getFactoryMimeType().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntMimeTypeByUNameIdxKey newKeyUNameIdx = schema.getFactoryMimeType().newUNameIdxKey();
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateMimeType",
					"MimeTypeUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFIntMimeTypePKey, YCFIntMimeTypeBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteMimeType( YCFSecAuthorization Authorization,
		YCFIntMimeTypeBuff Buff )
	{
		final String S_ProcName = "YCFIntRamMimeTypeTable.deleteMimeType() ";
		String classCode;
		YCFIntMimeTypePKey pkey = schema.getFactoryMimeType().newPKey();
		pkey.setRequiredMimeTypeId( Buff.getRequiredMimeTypeId() );
		YCFIntMimeTypeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteMimeType",
				pkey );
		}
		YCFIntMimeTypeByUNameIdxKey keyUNameIdx = schema.getFactoryMimeType().newUNameIdxKey();
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFIntMimeTypePKey, YCFIntMimeTypeBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	public void deleteMimeTypeByIdIdx( YCFSecAuthorization Authorization,
		int argMimeTypeId )
	{
		YCFIntMimeTypePKey key = schema.getFactoryMimeType().newPKey();
		key.setRequiredMimeTypeId( argMimeTypeId );
		deleteMimeTypeByIdIdx( Authorization, key );
	}

	public void deleteMimeTypeByIdIdx( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFIntMimeTypeBuff cur;
		LinkedList<YCFIntMimeTypeBuff> matchSet = new LinkedList<YCFIntMimeTypeBuff>();
		Iterator<YCFIntMimeTypeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMimeTypeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMimeType().readDerivedByIdIdx( Authorization,
				cur.getRequiredMimeTypeId() );
			deleteMimeType( Authorization, cur );
		}
	}

	public void deleteMimeTypeByUNameIdx( YCFSecAuthorization Authorization,
		String argName )
	{
		YCFIntMimeTypeByUNameIdxKey key = schema.getFactoryMimeType().newUNameIdxKey();
		key.setRequiredName( argName );
		deleteMimeTypeByUNameIdx( Authorization, key );
	}

	public void deleteMimeTypeByUNameIdx( YCFSecAuthorization Authorization,
		YCFIntMimeTypeByUNameIdxKey argKey )
	{
		YCFIntMimeTypeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntMimeTypeBuff> matchSet = new LinkedList<YCFIntMimeTypeBuff>();
		Iterator<YCFIntMimeTypeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntMimeTypeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableMimeType().readDerivedByIdIdx( Authorization,
				cur.getRequiredMimeTypeId() );
			deleteMimeType( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
