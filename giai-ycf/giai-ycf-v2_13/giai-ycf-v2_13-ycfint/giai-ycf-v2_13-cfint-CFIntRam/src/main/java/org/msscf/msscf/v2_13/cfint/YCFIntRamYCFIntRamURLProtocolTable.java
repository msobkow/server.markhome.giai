
// Description: Java 11 in-memory RAM DbIO implementation for URLProtocol.

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
 *	YCFIntRamURLProtocolTable in-memory RAM DbIO implementation
 *	for URLProtocol.
 */
public class YCFIntRamURLProtocolTable
	implements IYCFIntURLProtocolTable
{
	private IYCFIntSchema schema;
	private Map< YCFIntURLProtocolPKey,
				YCFIntURLProtocolBuff > dictByPKey
		= new HashMap< YCFIntURLProtocolPKey,
				YCFIntURLProtocolBuff >();
	private Map< YCFIntURLProtocolByUNameIdxKey,
			YCFIntURLProtocolBuff > dictByUNameIdx
		= new HashMap< YCFIntURLProtocolByUNameIdxKey,
			YCFIntURLProtocolBuff >();
	private Map< YCFIntURLProtocolByIsSecureIdxKey,
				Map< YCFIntURLProtocolPKey,
					YCFIntURLProtocolBuff >> dictByIsSecureIdx
		= new HashMap< YCFIntURLProtocolByIsSecureIdxKey,
				Map< YCFIntURLProtocolPKey,
					YCFIntURLProtocolBuff >>();

	public YCFIntRamURLProtocolTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createURLProtocol( YCFSecAuthorization Authorization,
		YCFIntURLProtocolBuff Buff )
	{
		final String S_ProcName = "createURLProtocol";
		YCFIntURLProtocolPKey pkey = schema.getFactoryURLProtocol().newPKey();
		pkey.setRequiredURLProtocolId( schema.nextURLProtocolIdGen() );
		Buff.setRequiredURLProtocolId( pkey.getRequiredURLProtocolId() );
		YCFIntURLProtocolByUNameIdxKey keyUNameIdx = schema.getFactoryURLProtocol().newUNameIdxKey();
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFIntURLProtocolByIsSecureIdxKey keyIsSecureIdx = schema.getFactoryURLProtocol().newIsSecureIdxKey();
		keyIsSecureIdx.setRequiredIsSecure( Buff.getRequiredIsSecure() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"URLProtocolUNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFIntURLProtocolPKey, YCFIntURLProtocolBuff > subdictIsSecureIdx;
		if( dictByIsSecureIdx.containsKey( keyIsSecureIdx ) ) {
			subdictIsSecureIdx = dictByIsSecureIdx.get( keyIsSecureIdx );
		}
		else {
			subdictIsSecureIdx = new HashMap< YCFIntURLProtocolPKey, YCFIntURLProtocolBuff >();
			dictByIsSecureIdx.put( keyIsSecureIdx, subdictIsSecureIdx );
		}
		subdictIsSecureIdx.put( pkey, Buff );

	}

	public YCFIntURLProtocolBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey PKey )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readDerived";
		YCFIntURLProtocolPKey key = schema.getFactoryURLProtocol().newPKey();
		key.setRequiredURLProtocolId( PKey.getRequiredURLProtocolId() );
		YCFIntURLProtocolBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntURLProtocolBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey PKey )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readDerived";
		YCFIntURLProtocolPKey key = schema.getFactoryURLProtocol().newPKey();
		key.setRequiredURLProtocolId( PKey.getRequiredURLProtocolId() );
		YCFIntURLProtocolBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntURLProtocolBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamURLProtocol.readAllDerived";
		YCFIntURLProtocolBuff[] retList = new YCFIntURLProtocolBuff[ dictByPKey.values().size() ];
		Iterator< YCFIntURLProtocolBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFIntURLProtocolBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readDerivedByUNameIdx";
		YCFIntURLProtocolByUNameIdxKey key = schema.getFactoryURLProtocol().newUNameIdxKey();
		key.setRequiredName( Name );

		YCFIntURLProtocolBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntURLProtocolBuff[] readDerivedByIsSecureIdx( YCFSecAuthorization Authorization,
		boolean IsSecure )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readDerivedByIsSecureIdx";
		YCFIntURLProtocolByIsSecureIdxKey key = schema.getFactoryURLProtocol().newIsSecureIdxKey();
		key.setRequiredIsSecure( IsSecure );

		YCFIntURLProtocolBuff[] recArray;
		if( dictByIsSecureIdx.containsKey( key ) ) {
			Map< YCFIntURLProtocolPKey, YCFIntURLProtocolBuff > subdictIsSecureIdx
				= dictByIsSecureIdx.get( key );
			recArray = new YCFIntURLProtocolBuff[ subdictIsSecureIdx.size() ];
			Iterator< YCFIntURLProtocolBuff > iter = subdictIsSecureIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntURLProtocolPKey, YCFIntURLProtocolBuff > subdictIsSecureIdx
				= new HashMap< YCFIntURLProtocolPKey, YCFIntURLProtocolBuff >();
			dictByIsSecureIdx.put( key, subdictIsSecureIdx );
			recArray = new YCFIntURLProtocolBuff[0];
		}
		return( recArray );
	}

	public YCFIntURLProtocolBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		int URLProtocolId )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readDerivedByIdIdx() ";
		YCFIntURLProtocolPKey key = schema.getFactoryURLProtocol().newPKey();
		key.setRequiredURLProtocolId( URLProtocolId );

		YCFIntURLProtocolBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntURLProtocolBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey PKey )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readBuff";
		YCFIntURLProtocolBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a109" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntURLProtocolBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFIntURLProtocolBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a109" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntURLProtocolBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readAllBuff";
		YCFIntURLProtocolBuff buff;
		ArrayList<YCFIntURLProtocolBuff> filteredList = new ArrayList<YCFIntURLProtocolBuff>();
		YCFIntURLProtocolBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a109" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFIntURLProtocolBuff[0] ) );
	}

	public YCFIntURLProtocolBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		int URLProtocolId )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readBuffByIdIdx() ";
		YCFIntURLProtocolBuff buff = readDerivedByIdIdx( Authorization,
			URLProtocolId );
		if( ( buff != null ) && buff.getClassCode().equals( "a109" ) ) {
			return( (YCFIntURLProtocolBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntURLProtocolBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readBuffByUNameIdx() ";
		YCFIntURLProtocolBuff buff = readDerivedByUNameIdx( Authorization,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a109" ) ) {
			return( (YCFIntURLProtocolBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntURLProtocolBuff[] readBuffByIsSecureIdx( YCFSecAuthorization Authorization,
		boolean IsSecure )
	{
		final String S_ProcName = "YCFIntRamURLProtocol.readBuffByIsSecureIdx() ";
		YCFIntURLProtocolBuff buff;
		ArrayList<YCFIntURLProtocolBuff> filteredList = new ArrayList<YCFIntURLProtocolBuff>();
		YCFIntURLProtocolBuff[] buffList = readDerivedByIsSecureIdx( Authorization,
			IsSecure );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a109" ) ) {
				filteredList.add( (YCFIntURLProtocolBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntURLProtocolBuff[0] ) );
	}

	public void updateURLProtocol( YCFSecAuthorization Authorization,
		YCFIntURLProtocolBuff Buff )
	{
		YCFIntURLProtocolPKey pkey = schema.getFactoryURLProtocol().newPKey();
		pkey.setRequiredURLProtocolId( Buff.getRequiredURLProtocolId() );
		YCFIntURLProtocolBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateURLProtocol",
				"Existing record not found",
				"URLProtocol",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateURLProtocol",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFIntURLProtocolByUNameIdxKey existingKeyUNameIdx = schema.getFactoryURLProtocol().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntURLProtocolByUNameIdxKey newKeyUNameIdx = schema.getFactoryURLProtocol().newUNameIdxKey();
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFIntURLProtocolByIsSecureIdxKey existingKeyIsSecureIdx = schema.getFactoryURLProtocol().newIsSecureIdxKey();
		existingKeyIsSecureIdx.setRequiredIsSecure( existing.getRequiredIsSecure() );

		YCFIntURLProtocolByIsSecureIdxKey newKeyIsSecureIdx = schema.getFactoryURLProtocol().newIsSecureIdxKey();
		newKeyIsSecureIdx.setRequiredIsSecure( Buff.getRequiredIsSecure() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateURLProtocol",
					"URLProtocolUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFIntURLProtocolPKey, YCFIntURLProtocolBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByIsSecureIdx.get( existingKeyIsSecureIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIsSecureIdx.containsKey( newKeyIsSecureIdx ) ) {
			subdict = dictByIsSecureIdx.get( newKeyIsSecureIdx );
		}
		else {
			subdict = new HashMap< YCFIntURLProtocolPKey, YCFIntURLProtocolBuff >();
			dictByIsSecureIdx.put( newKeyIsSecureIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteURLProtocol( YCFSecAuthorization Authorization,
		YCFIntURLProtocolBuff Buff )
	{
		final String S_ProcName = "YCFIntRamURLProtocolTable.deleteURLProtocol() ";
		String classCode;
		YCFIntURLProtocolPKey pkey = schema.getFactoryURLProtocol().newPKey();
		pkey.setRequiredURLProtocolId( Buff.getRequiredURLProtocolId() );
		YCFIntURLProtocolBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteURLProtocol",
				pkey );
		}
		YCFIntURLProtocolByUNameIdxKey keyUNameIdx = schema.getFactoryURLProtocol().newUNameIdxKey();
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntURLProtocolByIsSecureIdxKey keyIsSecureIdx = schema.getFactoryURLProtocol().newIsSecureIdxKey();
		keyIsSecureIdx.setRequiredIsSecure( existing.getRequiredIsSecure() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFIntURLProtocolPKey, YCFIntURLProtocolBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByIsSecureIdx.get( keyIsSecureIdx );
		subdict.remove( pkey );

	}
	public void deleteURLProtocolByIdIdx( YCFSecAuthorization Authorization,
		int argURLProtocolId )
	{
		YCFIntURLProtocolPKey key = schema.getFactoryURLProtocol().newPKey();
		key.setRequiredURLProtocolId( argURLProtocolId );
		deleteURLProtocolByIdIdx( Authorization, key );
	}

	public void deleteURLProtocolByIdIdx( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFIntURLProtocolBuff cur;
		LinkedList<YCFIntURLProtocolBuff> matchSet = new LinkedList<YCFIntURLProtocolBuff>();
		Iterator<YCFIntURLProtocolBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntURLProtocolBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableURLProtocol().readDerivedByIdIdx( Authorization,
				cur.getRequiredURLProtocolId() );
			deleteURLProtocol( Authorization, cur );
		}
	}

	public void deleteURLProtocolByUNameIdx( YCFSecAuthorization Authorization,
		String argName )
	{
		YCFIntURLProtocolByUNameIdxKey key = schema.getFactoryURLProtocol().newUNameIdxKey();
		key.setRequiredName( argName );
		deleteURLProtocolByUNameIdx( Authorization, key );
	}

	public void deleteURLProtocolByUNameIdx( YCFSecAuthorization Authorization,
		YCFIntURLProtocolByUNameIdxKey argKey )
	{
		YCFIntURLProtocolBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntURLProtocolBuff> matchSet = new LinkedList<YCFIntURLProtocolBuff>();
		Iterator<YCFIntURLProtocolBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntURLProtocolBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableURLProtocol().readDerivedByIdIdx( Authorization,
				cur.getRequiredURLProtocolId() );
			deleteURLProtocol( Authorization, cur );
		}
	}

	public void deleteURLProtocolByIsSecureIdx( YCFSecAuthorization Authorization,
		boolean argIsSecure )
	{
		YCFIntURLProtocolByIsSecureIdxKey key = schema.getFactoryURLProtocol().newIsSecureIdxKey();
		key.setRequiredIsSecure( argIsSecure );
		deleteURLProtocolByIsSecureIdx( Authorization, key );
	}

	public void deleteURLProtocolByIsSecureIdx( YCFSecAuthorization Authorization,
		YCFIntURLProtocolByIsSecureIdxKey argKey )
	{
		YCFIntURLProtocolBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntURLProtocolBuff> matchSet = new LinkedList<YCFIntURLProtocolBuff>();
		Iterator<YCFIntURLProtocolBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntURLProtocolBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableURLProtocol().readDerivedByIdIdx( Authorization,
				cur.getRequiredURLProtocolId() );
			deleteURLProtocol( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
