
// Description: Java 11 in-memory RAM DbIO implementation for SecDevice.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

/*
 *	YCFGenKbRamSecDeviceTable in-memory RAM DbIO implementation
 *	for SecDevice.
 */
public class YCFGenKbRamSecDeviceTable
	implements IYCFGenKbSecDeviceTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSecDevicePKey,
				YCFGenKbSecDeviceBuff > dictByPKey
		= new HashMap< YCFGenKbSecDevicePKey,
				YCFGenKbSecDeviceBuff >();
	private Map< YCFGenKbSecDeviceByNameIdxKey,
			YCFGenKbSecDeviceBuff > dictByNameIdx
		= new HashMap< YCFGenKbSecDeviceByNameIdxKey,
			YCFGenKbSecDeviceBuff >();
	private Map< YCFGenKbSecDeviceByUserIdxKey,
				Map< YCFGenKbSecDevicePKey,
					YCFGenKbSecDeviceBuff >> dictByUserIdx
		= new HashMap< YCFGenKbSecDeviceByUserIdxKey,
				Map< YCFGenKbSecDevicePKey,
					YCFGenKbSecDeviceBuff >>();

	public YCFGenKbRamSecDeviceTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecDevice( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceBuff Buff )
	{
		final String S_ProcName = "createSecDevice";
		YCFGenKbSecDevicePKey pkey = schema.getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		pkey.setRequiredDevName( Buff.getRequiredDevName() );
		Buff.setRequiredSecUserId( pkey.getRequiredSecUserId() );
		Buff.setRequiredDevName( pkey.getRequiredDevName() );
		YCFGenKbSecDeviceByNameIdxKey keyNameIdx = schema.getFactorySecDevice().newNameIdxKey();
		keyNameIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		keyNameIdx.setRequiredDevName( Buff.getRequiredDevName() );

		YCFGenKbSecDeviceByUserIdxKey keyUserIdx = schema.getFactorySecDevice().newUserIdxKey();
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

		Map< YCFGenKbSecDevicePKey, YCFGenKbSecDeviceBuff > subdictUserIdx;
		if( dictByUserIdx.containsKey( keyUserIdx ) ) {
			subdictUserIdx = dictByUserIdx.get( keyUserIdx );
		}
		else {
			subdictUserIdx = new HashMap< YCFGenKbSecDevicePKey, YCFGenKbSecDeviceBuff >();
			dictByUserIdx.put( keyUserIdx, subdictUserIdx );
		}
		subdictUserIdx.put( pkey, Buff );

	}

	public YCFGenKbSecDeviceBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readDerived";
		YCFGenKbSecDevicePKey key = schema.getFactorySecDevice().newPKey();
		key.setRequiredSecUserId( PKey.getRequiredSecUserId() );
		key.setRequiredDevName( PKey.getRequiredDevName() );
		YCFGenKbSecDeviceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecDeviceBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readDerived";
		YCFGenKbSecDevicePKey key = schema.getFactorySecDevice().newPKey();
		key.setRequiredSecUserId( PKey.getRequiredSecUserId() );
		key.setRequiredDevName( PKey.getRequiredDevName() );
		YCFGenKbSecDeviceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecDeviceBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSecDevice.readAllDerived";
		YCFGenKbSecDeviceBuff[] retList = new YCFGenKbSecDeviceBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSecDeviceBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSecDeviceBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		String DevName )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readDerivedByNameIdx";
		YCFGenKbSecDeviceByNameIdxKey key = schema.getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );

		YCFGenKbSecDeviceBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecDeviceBuff[] readDerivedByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readDerivedByUserIdx";
		YCFGenKbSecDeviceByUserIdxKey key = schema.getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );

		YCFGenKbSecDeviceBuff[] recArray;
		if( dictByUserIdx.containsKey( key ) ) {
			Map< YCFGenKbSecDevicePKey, YCFGenKbSecDeviceBuff > subdictUserIdx
				= dictByUserIdx.get( key );
			recArray = new YCFGenKbSecDeviceBuff[ subdictUserIdx.size() ];
			Iterator< YCFGenKbSecDeviceBuff > iter = subdictUserIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecDevicePKey, YCFGenKbSecDeviceBuff > subdictUserIdx
				= new HashMap< YCFGenKbSecDevicePKey, YCFGenKbSecDeviceBuff >();
			dictByUserIdx.put( key, subdictUserIdx );
			recArray = new YCFGenKbSecDeviceBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecDeviceBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		String DevName )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readDerivedByIdIdx() ";
		YCFGenKbSecDevicePKey key = schema.getFactorySecDevice().newPKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );

		YCFGenKbSecDeviceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecDeviceBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readBuff";
		YCFGenKbSecDeviceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a905" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecDeviceBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSecDeviceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a905" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecDeviceBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readAllBuff";
		YCFGenKbSecDeviceBuff buff;
		ArrayList<YCFGenKbSecDeviceBuff> filteredList = new ArrayList<YCFGenKbSecDeviceBuff>();
		YCFGenKbSecDeviceBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a905" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecDeviceBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecDevice buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecDevice instances in the database accessible for the Authorization.
	 */
	public YCFGenKbSecDeviceBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbSecDeviceBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		String DevName )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readBuffByIdIdx() ";
		YCFGenKbSecDeviceBuff buff = readDerivedByIdIdx( Authorization,
			SecUserId,
			DevName );
		if( ( buff != null ) && buff.getClassCode().equals( "a905" ) ) {
			return( (YCFGenKbSecDeviceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecDeviceBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		String DevName )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readBuffByNameIdx() ";
		YCFGenKbSecDeviceBuff buff = readDerivedByNameIdx( Authorization,
			SecUserId,
			DevName );
		if( ( buff != null ) && buff.getClassCode().equals( "a905" ) ) {
			return( (YCFGenKbSecDeviceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecDeviceBuff[] readBuffByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecDevice.readBuffByUserIdx() ";
		YCFGenKbSecDeviceBuff buff;
		ArrayList<YCFGenKbSecDeviceBuff> filteredList = new ArrayList<YCFGenKbSecDeviceBuff>();
		YCFGenKbSecDeviceBuff[] buffList = readDerivedByUserIdx( Authorization,
			SecUserId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a905" ) ) {
				filteredList.add( (YCFGenKbSecDeviceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecDeviceBuff[0] ) );
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
	public YCFGenKbSecDeviceBuff[] pageBuffByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageBuffByUserIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecDevice( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceBuff Buff )
	{
		YCFGenKbSecDevicePKey pkey = schema.getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		pkey.setRequiredDevName( Buff.getRequiredDevName() );
		YCFGenKbSecDeviceBuff existing = dictByPKey.get( pkey );
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
		YCFGenKbSecDeviceByNameIdxKey existingKeyNameIdx = schema.getFactorySecDevice().newNameIdxKey();
		existingKeyNameIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		existingKeyNameIdx.setRequiredDevName( existing.getRequiredDevName() );

		YCFGenKbSecDeviceByNameIdxKey newKeyNameIdx = schema.getFactorySecDevice().newNameIdxKey();
		newKeyNameIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		newKeyNameIdx.setRequiredDevName( Buff.getRequiredDevName() );

		YCFGenKbSecDeviceByUserIdxKey existingKeyUserIdx = schema.getFactorySecDevice().newUserIdxKey();
		existingKeyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbSecDeviceByUserIdxKey newKeyUserIdx = schema.getFactorySecDevice().newUserIdxKey();
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

		Map< YCFGenKbSecDevicePKey, YCFGenKbSecDeviceBuff > subdict;

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
			subdict = new HashMap< YCFGenKbSecDevicePKey, YCFGenKbSecDeviceBuff >();
			dictByUserIdx.put( newKeyUserIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSecDevice( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSecDeviceTable.deleteSecDevice() ";
		String classCode;
		YCFGenKbSecDevicePKey pkey = schema.getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		pkey.setRequiredDevName( Buff.getRequiredDevName() );
		YCFGenKbSecDeviceBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecDevice",
				pkey );
		}
		YCFGenKbSecDeviceByNameIdxKey keyNameIdx = schema.getFactorySecDevice().newNameIdxKey();
		keyNameIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyNameIdx.setRequiredDevName( existing.getRequiredDevName() );

		YCFGenKbSecDeviceByUserIdxKey keyUserIdx = schema.getFactorySecDevice().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSecDevicePKey, YCFGenKbSecDeviceBuff > subdict;

		dictByPKey.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

		subdict = dictByUserIdx.get( keyUserIdx );
		subdict.remove( pkey );

	}
	public void deleteSecDeviceByIdIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId,
		String argDevName )
	{
		YCFGenKbSecDevicePKey key = schema.getFactorySecDevice().newPKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setRequiredDevName( argDevName );
		deleteSecDeviceByIdIdx( Authorization, key );
	}

	public void deleteSecDeviceByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSecDeviceBuff cur;
		LinkedList<YCFGenKbSecDeviceBuff> matchSet = new LinkedList<YCFGenKbSecDeviceBuff>();
		Iterator<YCFGenKbSecDeviceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecDeviceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecDevice().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId(),
				cur.getRequiredDevName() );
			deleteSecDevice( Authorization, cur );
		}
	}

	public void deleteSecDeviceByNameIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId,
		String argDevName )
	{
		YCFGenKbSecDeviceByNameIdxKey key = schema.getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setRequiredDevName( argDevName );
		deleteSecDeviceByNameIdx( Authorization, key );
	}

	public void deleteSecDeviceByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceByNameIdxKey argKey )
	{
		YCFGenKbSecDeviceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecDeviceBuff> matchSet = new LinkedList<YCFGenKbSecDeviceBuff>();
		Iterator<YCFGenKbSecDeviceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecDeviceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecDevice().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId(),
				cur.getRequiredDevName() );
			deleteSecDevice( Authorization, cur );
		}
	}

	public void deleteSecDeviceByUserIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFGenKbSecDeviceByUserIdxKey key = schema.getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteSecDeviceByUserIdx( Authorization, key );
	}

	public void deleteSecDeviceByUserIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceByUserIdxKey argKey )
	{
		YCFGenKbSecDeviceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecDeviceBuff> matchSet = new LinkedList<YCFGenKbSecDeviceBuff>();
		Iterator<YCFGenKbSecDeviceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecDeviceBuff> iterMatch = matchSet.iterator();
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
