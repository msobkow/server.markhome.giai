
// Description: Java 11 in-memory RAM DbIO implementation for SecDevice.

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
 *	YCFIntRamSecDeviceTable in-memory RAM DbIO implementation
 *	for SecDevice.
 */
public class YCFIntRamSecDeviceTable
	implements IYCFIntSecDeviceTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecSecDevicePKey,
				YCFSecSecDeviceBuff > dictByPKey
		= new HashMap< YCFSecSecDevicePKey,
				YCFSecSecDeviceBuff >();
	private Map< YCFSecSecDeviceByNameIdxKey,
			YCFSecSecDeviceBuff > dictByNameIdx
		= new HashMap< YCFSecSecDeviceByNameIdxKey,
			YCFSecSecDeviceBuff >();
	private Map< YCFSecSecDeviceByUserIdxKey,
				Map< YCFSecSecDevicePKey,
					YCFSecSecDeviceBuff >> dictByUserIdx
		= new HashMap< YCFSecSecDeviceByUserIdxKey,
				Map< YCFSecSecDevicePKey,
					YCFSecSecDeviceBuff >>();

	public YCFIntRamSecDeviceTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecDevice( YCFSecAuthorization Authorization,
		YCFSecSecDeviceBuff Buff )
	{
		final String S_ProcName = "createSecDevice";
		YCFSecSecDevicePKey pkey = schema.getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		pkey.setRequiredDevName( Buff.getRequiredDevName() );
		Buff.setRequiredSecUserId( pkey.getRequiredSecUserId() );
		Buff.setRequiredDevName( pkey.getRequiredDevName() );
		YCFSecSecDeviceByNameIdxKey keyNameIdx = schema.getFactorySecDevice().newNameIdxKey();
		keyNameIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		keyNameIdx.setRequiredDevName( Buff.getRequiredDevName() );

		YCFSecSecDeviceByUserIdxKey keyUserIdx = schema.getFactorySecDevice().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecDeviceNameIdx",
				keyNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableSecUser().readDerivedByIdIdx( Authorization,
						Buff.getRequiredSecUserId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SecDeviceSecUser",
						"SecUser",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

		Map< YCFSecSecDevicePKey, YCFSecSecDeviceBuff > subdictUserIdx;
		if( dictByUserIdx.containsKey( keyUserIdx ) ) {
			subdictUserIdx = dictByUserIdx.get( keyUserIdx );
		}
		else {
			subdictUserIdx = new HashMap< YCFSecSecDevicePKey, YCFSecSecDeviceBuff >();
			dictByUserIdx.put( keyUserIdx, subdictUserIdx );
		}
		subdictUserIdx.put( pkey, Buff );

	}

	public YCFSecSecDeviceBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readDerived";
		YCFSecSecDevicePKey key = schema.getFactorySecDevice().newPKey();
		key.setRequiredSecUserId( PKey.getRequiredSecUserId() );
		key.setRequiredDevName( PKey.getRequiredDevName() );
		YCFSecSecDeviceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecDeviceBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readDerived";
		YCFSecSecDevicePKey key = schema.getFactorySecDevice().newPKey();
		key.setRequiredSecUserId( PKey.getRequiredSecUserId() );
		key.setRequiredDevName( PKey.getRequiredDevName() );
		YCFSecSecDeviceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecDeviceBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamSecDevice.readAllDerived";
		YCFSecSecDeviceBuff[] retList = new YCFSecSecDeviceBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSecDeviceBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSecDeviceBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String DevName )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readDerivedByNameIdx";
		YCFSecSecDeviceByNameIdxKey key = schema.getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );

		YCFSecSecDeviceBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecDeviceBuff[] readDerivedByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readDerivedByUserIdx";
		YCFSecSecDeviceByUserIdxKey key = schema.getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );

		YCFSecSecDeviceBuff[] recArray;
		if( dictByUserIdx.containsKey( key ) ) {
			Map< YCFSecSecDevicePKey, YCFSecSecDeviceBuff > subdictUserIdx
				= dictByUserIdx.get( key );
			recArray = new YCFSecSecDeviceBuff[ subdictUserIdx.size() ];
			Iterator< YCFSecSecDeviceBuff > iter = subdictUserIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecDevicePKey, YCFSecSecDeviceBuff > subdictUserIdx
				= new HashMap< YCFSecSecDevicePKey, YCFSecSecDeviceBuff >();
			dictByUserIdx.put( key, subdictUserIdx );
			recArray = new YCFSecSecDeviceBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecDeviceBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String DevName )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readDerivedByIdIdx() ";
		YCFSecSecDevicePKey key = schema.getFactorySecDevice().newPKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );

		YCFSecSecDeviceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecDeviceBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readBuff";
		YCFSecSecDeviceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecDeviceBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSecDeviceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecDeviceBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readAllBuff";
		YCFSecSecDeviceBuff buff;
		ArrayList<YCFSecSecDeviceBuff> filteredList = new ArrayList<YCFSecSecDeviceBuff>();
		YCFSecSecDeviceBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00a" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecDeviceBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecDevice buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecDevice instances in the database accessible for the Authorization.
	 */
	public YCFSecSecDeviceBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecSecDeviceBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String DevName )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readBuffByIdIdx() ";
		YCFSecSecDeviceBuff buff = readDerivedByIdIdx( Authorization,
			SecUserId,
			DevName );
		if( ( buff != null ) && buff.getClassCode().equals( "a00a" ) ) {
			return( (YCFSecSecDeviceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecDeviceBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String DevName )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readBuffByNameIdx() ";
		YCFSecSecDeviceBuff buff = readDerivedByNameIdx( Authorization,
			SecUserId,
			DevName );
		if( ( buff != null ) && buff.getClassCode().equals( "a00a" ) ) {
			return( (YCFSecSecDeviceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecDeviceBuff[] readBuffByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFIntRamSecDevice.readBuffByUserIdx() ";
		YCFSecSecDeviceBuff buff;
		ArrayList<YCFSecSecDeviceBuff> filteredList = new ArrayList<YCFSecSecDeviceBuff>();
		YCFSecSecDeviceBuff[] buffList = readDerivedByUserIdx( Authorization,
			SecUserId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00a" ) ) {
				filteredList.add( (YCFSecSecDeviceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecDeviceBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific SecDevice buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecDeviceBuff[] pageBuffByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageBuffByUserIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecDevice( YCFSecAuthorization Authorization,
		YCFSecSecDeviceBuff Buff )
	{
		YCFSecSecDevicePKey pkey = schema.getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		pkey.setRequiredDevName( Buff.getRequiredDevName() );
		YCFSecSecDeviceBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecDevice",
				"Existing record not found",
				"SecDevice",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecDevice",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecSecDeviceByNameIdxKey existingKeyNameIdx = schema.getFactorySecDevice().newNameIdxKey();
		existingKeyNameIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		existingKeyNameIdx.setRequiredDevName( existing.getRequiredDevName() );

		YCFSecSecDeviceByNameIdxKey newKeyNameIdx = schema.getFactorySecDevice().newNameIdxKey();
		newKeyNameIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		newKeyNameIdx.setRequiredDevName( Buff.getRequiredDevName() );

		YCFSecSecDeviceByUserIdxKey existingKeyUserIdx = schema.getFactorySecDevice().newUserIdxKey();
		existingKeyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecSecDeviceByUserIdxKey newKeyUserIdx = schema.getFactorySecDevice().newUserIdxKey();
		newKeyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecDevice",
					"SecDeviceNameIdx",
					newKeyNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSecUser().readDerivedByIdIdx( Authorization,
						Buff.getRequiredSecUserId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSecDevice",
						"Container",
						"SecDeviceSecUser",
						"SecUser",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecSecDevicePKey, YCFSecSecDeviceBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

		subdict = dictByUserIdx.get( existingKeyUserIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByUserIdx.containsKey( newKeyUserIdx ) ) {
			subdict = dictByUserIdx.get( newKeyUserIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecDevicePKey, YCFSecSecDeviceBuff >();
			dictByUserIdx.put( newKeyUserIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSecDevice( YCFSecAuthorization Authorization,
		YCFSecSecDeviceBuff Buff )
	{
		final String S_ProcName = "YCFIntRamSecDeviceTable.deleteSecDevice() ";
		String classCode;
		YCFSecSecDevicePKey pkey = schema.getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		pkey.setRequiredDevName( Buff.getRequiredDevName() );
		YCFSecSecDeviceBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecDevice",
				pkey );
		}
		YCFSecSecDeviceByNameIdxKey keyNameIdx = schema.getFactorySecDevice().newNameIdxKey();
		keyNameIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyNameIdx.setRequiredDevName( existing.getRequiredDevName() );

		YCFSecSecDeviceByUserIdxKey keyUserIdx = schema.getFactorySecDevice().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSecDevicePKey, YCFSecSecDeviceBuff > subdict;

		dictByPKey.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

		subdict = dictByUserIdx.get( keyUserIdx );
		subdict.remove( pkey );

	}
	public void deleteSecDeviceByIdIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		String argDevName )
	{
		YCFSecSecDevicePKey key = schema.getFactorySecDevice().newPKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setRequiredDevName( argDevName );
		deleteSecDeviceByIdIdx( Authorization, key );
	}

	public void deleteSecDeviceByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSecDeviceBuff cur;
		LinkedList<YCFSecSecDeviceBuff> matchSet = new LinkedList<YCFSecSecDeviceBuff>();
		Iterator<YCFSecSecDeviceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecDeviceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecDevice().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId(),
				cur.getRequiredDevName() );
			deleteSecDevice( Authorization, cur );
		}
	}

	public void deleteSecDeviceByNameIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		String argDevName )
	{
		YCFSecSecDeviceByNameIdxKey key = schema.getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setRequiredDevName( argDevName );
		deleteSecDeviceByNameIdx( Authorization, key );
	}

	public void deleteSecDeviceByNameIdx( YCFSecAuthorization Authorization,
		YCFSecSecDeviceByNameIdxKey argKey )
	{
		YCFSecSecDeviceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecDeviceBuff> matchSet = new LinkedList<YCFSecSecDeviceBuff>();
		Iterator<YCFSecSecDeviceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecDeviceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecDevice().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId(),
				cur.getRequiredDevName() );
			deleteSecDevice( Authorization, cur );
		}
	}

	public void deleteSecDeviceByUserIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFSecSecDeviceByUserIdxKey key = schema.getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteSecDeviceByUserIdx( Authorization, key );
	}

	public void deleteSecDeviceByUserIdx( YCFSecAuthorization Authorization,
		YCFSecSecDeviceByUserIdxKey argKey )
	{
		YCFSecSecDeviceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecDeviceBuff> matchSet = new LinkedList<YCFSecSecDeviceBuff>();
		Iterator<YCFSecSecDeviceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecDeviceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecDevice().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId(),
				cur.getRequiredDevName() );
			deleteSecDevice( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
