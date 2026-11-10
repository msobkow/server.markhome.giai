
// Description: Java 11 in-memory RAM DbIO implementation for GelSwitchLimb.

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
 *	YCFGenKbRamGelSwitchLimbTable in-memory RAM DbIO implementation
 *	for GelSwitchLimb.
 */
public class YCFGenKbRamGelSwitchLimbTable
	implements IYCFGenKbGelSwitchLimbTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelSwitchLimbPKey,
				YCFGenKbGelSwitchLimbBuff > dictByPKey
		= new HashMap< YCFGenKbGelSwitchLimbPKey,
				YCFGenKbGelSwitchLimbBuff >();
	private Map< YCFGenKbGelSwitchLimbByTenantIdxKey,
				Map< YCFGenKbGelSwitchLimbPKey,
					YCFGenKbGelSwitchLimbBuff >> dictByTenantIdx
		= new HashMap< YCFGenKbGelSwitchLimbByTenantIdxKey,
				Map< YCFGenKbGelSwitchLimbPKey,
					YCFGenKbGelSwitchLimbBuff >>();
	private Map< YCFGenKbGelSwitchLimbBySwitchIdxKey,
				Map< YCFGenKbGelSwitchLimbPKey,
					YCFGenKbGelSwitchLimbBuff >> dictBySwitchIdx
		= new HashMap< YCFGenKbGelSwitchLimbBySwitchIdxKey,
				Map< YCFGenKbGelSwitchLimbPKey,
					YCFGenKbGelSwitchLimbBuff >>();

	public YCFGenKbRamGelSwitchLimbTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelSwitchLimb( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbBuff Buff )
	{
		final String S_ProcName = "createGelSwitchLimb";
		YCFGenKbGelSwitchLimbPKey pkey = schema.getFactoryGelSwitchLimb().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		pkey.setRequiredLimbName( Buff.getRequiredLimbName() );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredGelCacheId( pkey.getRequiredGelCacheId() );
		Buff.setRequiredGelInstId( pkey.getRequiredGelInstId() );
		Buff.setRequiredLimbName( pkey.getRequiredLimbName() );
		YCFGenKbGelSwitchLimbByTenantIdxKey keyTenantIdx = schema.getFactoryGelSwitchLimb().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbGelSwitchLimbBySwitchIdxKey keySwitchIdx = schema.getFactoryGelSwitchLimb().newSwitchIdxKey();
		keySwitchIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keySwitchIdx.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		keySwitchIdx.setRequiredGelInstId( Buff.getRequiredGelInstId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff > subdictSwitchIdx;
		if( dictBySwitchIdx.containsKey( keySwitchIdx ) ) {
			subdictSwitchIdx = dictBySwitchIdx.get( keySwitchIdx );
		}
		else {
			subdictSwitchIdx = new HashMap< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff >();
			dictBySwitchIdx.put( keySwitchIdx, subdictSwitchIdx );
		}
		subdictSwitchIdx.put( pkey, Buff );

	}

	public YCFGenKbGelSwitchLimbBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readDerived";
		YCFGenKbGelSwitchLimbPKey key = schema.getFactoryGelSwitchLimb().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		key.setRequiredLimbName( PKey.getRequiredLimbName() );
		YCFGenKbGelSwitchLimbBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSwitchLimbBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readDerived";
		YCFGenKbGelSwitchLimbPKey key = schema.getFactoryGelSwitchLimb().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		key.setRequiredLimbName( PKey.getRequiredLimbName() );
		YCFGenKbGelSwitchLimbBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSwitchLimbBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readAllDerived";
		YCFGenKbGelSwitchLimbBuff[] retList = new YCFGenKbGelSwitchLimbBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelSwitchLimbBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelSwitchLimbBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readDerivedByTenantIdx";
		YCFGenKbGelSwitchLimbByTenantIdxKey key = schema.getFactoryGelSwitchLimb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFGenKbGelSwitchLimbBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFGenKbGelSwitchLimbBuff[ subdictTenantIdx.size() ];
			Iterator< YCFGenKbGelSwitchLimbBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff > subdictTenantIdx
				= new HashMap< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFGenKbGelSwitchLimbBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSwitchLimbBuff[] readDerivedBySwitchIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readDerivedBySwitchIdx";
		YCFGenKbGelSwitchLimbBySwitchIdxKey key = schema.getFactoryGelSwitchLimb().newSwitchIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );

		YCFGenKbGelSwitchLimbBuff[] recArray;
		if( dictBySwitchIdx.containsKey( key ) ) {
			Map< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff > subdictSwitchIdx
				= dictBySwitchIdx.get( key );
			recArray = new YCFGenKbGelSwitchLimbBuff[ subdictSwitchIdx.size() ];
			Iterator< YCFGenKbGelSwitchLimbBuff > iter = subdictSwitchIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff > subdictSwitchIdx
				= new HashMap< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff >();
			dictBySwitchIdx.put( key, subdictSwitchIdx );
			recArray = new YCFGenKbGelSwitchLimbBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSwitchLimbBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readDerivedByPIdx() ";
		YCFGenKbGelSwitchLimbPKey key = schema.getFactoryGelSwitchLimb().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );
		key.setRequiredLimbName( LimbName );

		YCFGenKbGelSwitchLimbBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSwitchLimbBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readBuff";
		YCFGenKbGelSwitchLimbBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a91f" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSwitchLimbBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelSwitchLimbBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a91f" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSwitchLimbBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readAllBuff";
		YCFGenKbGelSwitchLimbBuff buff;
		ArrayList<YCFGenKbGelSwitchLimbBuff> filteredList = new ArrayList<YCFGenKbGelSwitchLimbBuff>();
		YCFGenKbGelSwitchLimbBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91f" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSwitchLimbBuff[0] ) );
	}

	public YCFGenKbGelSwitchLimbBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId,
		String LimbName )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readBuffByPIdx() ";
		YCFGenKbGelSwitchLimbBuff buff = readDerivedByPIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId,
			LimbName );
		if( ( buff != null ) && buff.getClassCode().equals( "a91f" ) ) {
			return( (YCFGenKbGelSwitchLimbBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelSwitchLimbBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readBuffByTenantIdx() ";
		YCFGenKbGelSwitchLimbBuff buff;
		ArrayList<YCFGenKbGelSwitchLimbBuff> filteredList = new ArrayList<YCFGenKbGelSwitchLimbBuff>();
		YCFGenKbGelSwitchLimbBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91f" ) ) {
				filteredList.add( (YCFGenKbGelSwitchLimbBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSwitchLimbBuff[0] ) );
	}

	public YCFGenKbGelSwitchLimbBuff[] readBuffBySwitchIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimb.readBuffBySwitchIdx() ";
		YCFGenKbGelSwitchLimbBuff buff;
		ArrayList<YCFGenKbGelSwitchLimbBuff> filteredList = new ArrayList<YCFGenKbGelSwitchLimbBuff>();
		YCFGenKbGelSwitchLimbBuff[] buffList = readDerivedBySwitchIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91f" ) ) {
				filteredList.add( (YCFGenKbGelSwitchLimbBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSwitchLimbBuff[0] ) );
	}

	public void updateGelSwitchLimb( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbBuff Buff )
	{
		YCFGenKbGelSwitchLimbPKey pkey = schema.getFactoryGelSwitchLimb().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		pkey.setRequiredLimbName( Buff.getRequiredLimbName() );
		YCFGenKbGelSwitchLimbBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelSwitchLimb",
				"Existing record not found",
				"GelSwitchLimb",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateGelSwitchLimb",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbGelSwitchLimbByTenantIdxKey existingKeyTenantIdx = schema.getFactoryGelSwitchLimb().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGelSwitchLimbByTenantIdxKey newKeyTenantIdx = schema.getFactoryGelSwitchLimb().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbGelSwitchLimbBySwitchIdxKey existingKeySwitchIdx = schema.getFactoryGelSwitchLimb().newSwitchIdxKey();
		existingKeySwitchIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeySwitchIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );
		existingKeySwitchIdx.setRequiredGelInstId( existing.getRequiredGelInstId() );

		YCFGenKbGelSwitchLimbBySwitchIdxKey newKeySwitchIdx = schema.getFactoryGelSwitchLimb().newSwitchIdxKey();
		newKeySwitchIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeySwitchIdx.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		newKeySwitchIdx.setRequiredGelInstId( Buff.getRequiredGelInstId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGelSwitchLimb",
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByTenantIdx.get( existingKeyTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTenantIdx.containsKey( newKeyTenantIdx ) ) {
			subdict = dictByTenantIdx.get( newKeyTenantIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictBySwitchIdx.get( existingKeySwitchIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySwitchIdx.containsKey( newKeySwitchIdx ) ) {
			subdict = dictBySwitchIdx.get( newKeySwitchIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff >();
			dictBySwitchIdx.put( newKeySwitchIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGelSwitchLimb( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelSwitchLimbTable.deleteGelSwitchLimb() ";
		String classCode;
		YCFGenKbGelSwitchLimbPKey pkey = schema.getFactoryGelSwitchLimb().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		pkey.setRequiredLimbName( Buff.getRequiredLimbName() );
		YCFGenKbGelSwitchLimbBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelSwitchLimb",
				pkey );
		}
		YCFGenKbGelSwitchLimbByTenantIdxKey keyTenantIdx = schema.getFactoryGelSwitchLimb().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGelSwitchLimbBySwitchIdxKey keySwitchIdx = schema.getFactoryGelSwitchLimb().newSwitchIdxKey();
		keySwitchIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySwitchIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );
		keySwitchIdx.setRequiredGelInstId( existing.getRequiredGelInstId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGelSwitchLimbPKey, YCFGenKbGelSwitchLimbBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictBySwitchIdx.get( keySwitchIdx );
		subdict.remove( pkey );

	}
	public void deleteGelSwitchLimbByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId,
		String argLimbName )
	{
		YCFGenKbGelSwitchLimbPKey key = schema.getFactoryGelSwitchLimb().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		key.setRequiredLimbName( argLimbName );
		deleteGelSwitchLimbByPIdx( Authorization, key );
	}

	public void deleteGelSwitchLimbByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelSwitchLimbBuff cur;
		LinkedList<YCFGenKbGelSwitchLimbBuff> matchSet = new LinkedList<YCFGenKbGelSwitchLimbBuff>();
		Iterator<YCFGenKbGelSwitchLimbBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSwitchLimbBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSwitchLimb().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId(),
				cur.getRequiredLimbName() );
			deleteGelSwitchLimb( Authorization, cur );
		}
	}

	public void deleteGelSwitchLimbByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelSwitchLimbByTenantIdxKey key = schema.getFactoryGelSwitchLimb().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelSwitchLimbByTenantIdx( Authorization, key );
	}

	public void deleteGelSwitchLimbByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbByTenantIdxKey argKey )
	{
		YCFGenKbGelSwitchLimbBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSwitchLimbBuff> matchSet = new LinkedList<YCFGenKbGelSwitchLimbBuff>();
		Iterator<YCFGenKbGelSwitchLimbBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSwitchLimbBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSwitchLimb().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId(),
				cur.getRequiredLimbName() );
			deleteGelSwitchLimb( Authorization, cur );
		}
	}

	public void deleteGelSwitchLimbBySwitchIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId )
	{
		YCFGenKbGelSwitchLimbBySwitchIdxKey key = schema.getFactoryGelSwitchLimb().newSwitchIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		deleteGelSwitchLimbBySwitchIdx( Authorization, key );
	}

	public void deleteGelSwitchLimbBySwitchIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSwitchLimbBySwitchIdxKey argKey )
	{
		YCFGenKbGelSwitchLimbBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSwitchLimbBuff> matchSet = new LinkedList<YCFGenKbGelSwitchLimbBuff>();
		Iterator<YCFGenKbGelSwitchLimbBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSwitchLimbBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSwitchLimb().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId(),
				cur.getRequiredLimbName() );
			deleteGelSwitchLimb( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
