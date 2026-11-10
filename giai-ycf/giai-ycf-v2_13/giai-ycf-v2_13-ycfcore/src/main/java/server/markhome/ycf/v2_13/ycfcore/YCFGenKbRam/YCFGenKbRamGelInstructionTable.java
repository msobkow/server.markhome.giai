
// Description: Java 11 in-memory RAM DbIO implementation for GelInstruction.

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
 *	YCFGenKbRamGelInstructionTable in-memory RAM DbIO implementation
 *	for GelInstruction.
 */
public class YCFGenKbRamGelInstructionTable
	implements IYCFGenKbGelInstructionTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelInstructionPKey,
				YCFGenKbGelInstructionBuff > dictByPKey
		= new HashMap< YCFGenKbGelInstructionPKey,
				YCFGenKbGelInstructionBuff >();
	private Map< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelInstructionBuff >> dictByTenantIdx
		= new HashMap< YCFGenKbGelInstructionByTenantIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelInstructionBuff >>();
	private Map< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelInstructionBuff >> dictByGelCacheIdx
		= new HashMap< YCFGenKbGelInstructionByGelCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelInstructionBuff >>();
	private Map< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelInstructionBuff >> dictByChainIdx
		= new HashMap< YCFGenKbGelInstructionByChainIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelInstructionBuff >>();

	public YCFGenKbRamGelInstructionTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelInstruction( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionBuff Buff )
	{
		final String S_ProcName = "createGelInstruction";
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( ((YCFGenKbRamTenantTable)schema.getTableTenant()).nextGelInstructionIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredGelCacheId( pkey.getRequiredGelCacheId() );
		Buff.setRequiredGelInstId( pkey.getRequiredGelInstId() );
		YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx = schema.getFactoryGelInstruction().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		keyGelCacheIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyGelCacheIdx.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );

		YCFGenKbGelInstructionByChainIdxKey keyChainIdx = schema.getFactoryGelInstruction().newChainIdxKey();
		keyChainIdx.setOptionalChainInstTenantId( Buff.getOptionalChainInstTenantId() );
		keyChainIdx.setOptionalChainInstGelCacheId( Buff.getOptionalChainInstGelCacheId() );
		keyChainIdx.setOptionalChainInstGelInstId( Buff.getOptionalChainInstGelInstId() );

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

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableGelCache().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredGelCacheId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"GelCache",
						"GelCache",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdictGelCacheIdx;
		if( dictByGelCacheIdx.containsKey( keyGelCacheIdx ) ) {
			subdictGelCacheIdx = dictByGelCacheIdx.get( keyGelCacheIdx );
		}
		else {
			subdictGelCacheIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff >();
			dictByGelCacheIdx.put( keyGelCacheIdx, subdictGelCacheIdx );
		}
		subdictGelCacheIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdictChainIdx;
		if( dictByChainIdx.containsKey( keyChainIdx ) ) {
			subdictChainIdx = dictByChainIdx.get( keyChainIdx );
		}
		else {
			subdictChainIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff >();
			dictByChainIdx.put( keyChainIdx, subdictChainIdx );
		}
		subdictChainIdx.put( pkey, Buff );

	}

	public YCFGenKbGelInstructionBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelInstructionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelInstructionBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelInstructionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelInstructionBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelInstruction.readAllDerived";
		YCFGenKbGelInstructionBuff[] retList = new YCFGenKbGelInstructionBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelInstructionBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelInstructionBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByTenantIdx";
		YCFGenKbGelInstructionByTenantIdxKey key = schema.getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFGenKbGelInstructionBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFGenKbGelInstructionBuff[ subdictTenantIdx.size() ];
			Iterator< YCFGenKbGelInstructionBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdictTenantIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFGenKbGelInstructionBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelInstructionBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByGelCacheIdx";
		YCFGenKbGelInstructionByGelCacheIdxKey key = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );

		YCFGenKbGelInstructionBuff[] recArray;
		if( dictByGelCacheIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdictGelCacheIdx
				= dictByGelCacheIdx.get( key );
			recArray = new YCFGenKbGelInstructionBuff[ subdictGelCacheIdx.size() ];
			Iterator< YCFGenKbGelInstructionBuff > iter = subdictGelCacheIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdictGelCacheIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff >();
			dictByGelCacheIdx.put( key, subdictGelCacheIdx );
			recArray = new YCFGenKbGelInstructionBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelInstructionBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByChainIdx";
		YCFGenKbGelInstructionByChainIdxKey key = schema.getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );

		YCFGenKbGelInstructionBuff[] recArray;
		if( dictByChainIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdictChainIdx
				= dictByChainIdx.get( key );
			recArray = new YCFGenKbGelInstructionBuff[ subdictChainIdx.size() ];
			Iterator< YCFGenKbGelInstructionBuff > iter = subdictChainIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdictChainIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff >();
			dictByChainIdx.put( key, subdictChainIdx );
			recArray = new YCFGenKbGelInstructionBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelInstructionBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByPIdx() ";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );

		YCFGenKbGelInstructionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelInstructionBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuff";
		YCFGenKbGelInstructionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a916" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelInstructionBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelInstructionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a916" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelInstructionBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readAllBuff";
		YCFGenKbGelInstructionBuff buff;
		ArrayList<YCFGenKbGelInstructionBuff> filteredList = new ArrayList<YCFGenKbGelInstructionBuff>();
		YCFGenKbGelInstructionBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelInstructionBuff[0] ) );
	}

	public YCFGenKbGelInstructionBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByPIdx() ";
		YCFGenKbGelInstructionBuff buff = readDerivedByPIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId );
		if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
			return( (YCFGenKbGelInstructionBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelInstructionBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByTenantIdx() ";
		YCFGenKbGelInstructionBuff buff;
		ArrayList<YCFGenKbGelInstructionBuff> filteredList = new ArrayList<YCFGenKbGelInstructionBuff>();
		YCFGenKbGelInstructionBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelInstructionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelInstructionBuff[0] ) );
	}

	public YCFGenKbGelInstructionBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByGelCacheIdx() ";
		YCFGenKbGelInstructionBuff buff;
		ArrayList<YCFGenKbGelInstructionBuff> filteredList = new ArrayList<YCFGenKbGelInstructionBuff>();
		YCFGenKbGelInstructionBuff[] buffList = readDerivedByGelCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelInstructionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelInstructionBuff[0] ) );
	}

	public YCFGenKbGelInstructionBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByChainIdx() ";
		YCFGenKbGelInstructionBuff buff;
		ArrayList<YCFGenKbGelInstructionBuff> filteredList = new ArrayList<YCFGenKbGelInstructionBuff>();
		YCFGenKbGelInstructionBuff[] buffList = readDerivedByChainIdx( Authorization,
			ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelInstructionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelInstructionBuff[0] ) );
	}

	public void updateGelInstruction( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionBuff Buff )
	{
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelInstructionBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelInstruction",
				"Existing record not found",
				"GelInstruction",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateGelInstruction",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbGelInstructionByTenantIdxKey existingKeyTenantIdx = schema.getFactoryGelInstruction().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGelInstructionByTenantIdxKey newKeyTenantIdx = schema.getFactoryGelInstruction().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbGelInstructionByGelCacheIdxKey existingKeyGelCacheIdx = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		existingKeyGelCacheIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyGelCacheIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );

		YCFGenKbGelInstructionByGelCacheIdxKey newKeyGelCacheIdx = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		newKeyGelCacheIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyGelCacheIdx.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );

		YCFGenKbGelInstructionByChainIdxKey existingKeyChainIdx = schema.getFactoryGelInstruction().newChainIdxKey();
		existingKeyChainIdx.setOptionalChainInstTenantId( existing.getOptionalChainInstTenantId() );
		existingKeyChainIdx.setOptionalChainInstGelCacheId( existing.getOptionalChainInstGelCacheId() );
		existingKeyChainIdx.setOptionalChainInstGelInstId( existing.getOptionalChainInstGelInstId() );

		YCFGenKbGelInstructionByChainIdxKey newKeyChainIdx = schema.getFactoryGelInstruction().newChainIdxKey();
		newKeyChainIdx.setOptionalChainInstTenantId( Buff.getOptionalChainInstTenantId() );
		newKeyChainIdx.setOptionalChainInstGelCacheId( Buff.getOptionalChainInstGelCacheId() );
		newKeyChainIdx.setOptionalChainInstGelInstId( Buff.getOptionalChainInstGelInstId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGelInstruction",
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableGelCache().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredGelCacheId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGelInstruction",
						"Container",
						"GelCache",
						"GelCache",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdict;

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
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByGelCacheIdx.get( existingKeyGelCacheIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByGelCacheIdx.containsKey( newKeyGelCacheIdx ) ) {
			subdict = dictByGelCacheIdx.get( newKeyGelCacheIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff >();
			dictByGelCacheIdx.put( newKeyGelCacheIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByChainIdx.get( existingKeyChainIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByChainIdx.containsKey( newKeyChainIdx ) ) {
			subdict = dictByChainIdx.get( newKeyChainIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff >();
			dictByChainIdx.put( newKeyChainIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGelInstruction( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelInstructionTable.deleteGelInstruction() ";
		String classCode;
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelInstructionBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelInstruction",
				pkey );
		}
		YCFGenKbGelInstructionByTenantIdxKey keyTenantIdx = schema.getFactoryGelInstruction().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		keyGelCacheIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGelCacheIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );

		YCFGenKbGelInstructionByChainIdxKey keyChainIdx = schema.getFactoryGelInstruction().newChainIdxKey();
		keyChainIdx.setOptionalChainInstTenantId( existing.getOptionalChainInstTenantId() );
		keyChainIdx.setOptionalChainInstGelCacheId( existing.getOptionalChainInstGelCacheId() );
		keyChainIdx.setOptionalChainInstGelInstId( existing.getOptionalChainInstGelInstId() );

		// Validate reverse foreign keys

		if( schema.getTableGelIterator().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelIterator",
				pkey );
		}

		if( schema.getTableGelSpread().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelSpread",
				pkey );
		}

		if( schema.getTableGelPop().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelPop",
				pkey );
		}

		if( schema.getTableGelPrefixLine().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelPrefixLine",
				pkey );
		}

		if( schema.getTableGelReference().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelReference",
				pkey );
		}

		if( schema.getTableGelCall().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelCall",
				pkey );
		}

		if( schema.getTableGelSequence().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelSequence",
				pkey );
		}

		if( schema.getTableGelSwitch().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelSwitch",
				pkey );
		}

		if( schema.getTableGelBoilerplate().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelBoilerplate",
				pkey );
		}

		if( schema.getTableGelBuiltin().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelBuiltin",
				pkey );
		}

		if( schema.getTableGelConstrain().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelConstrain",
				pkey );
		}

		if( schema.getTableGelCounter().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelCounter",
				pkey );
		}

		if( schema.getTableGelExpansion().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelExpansion",
				pkey );
		}

		if( schema.getTableGelModifier().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelInstruction",
				"Superclass",
				"SuperClass",
				"GelModifier",
				pkey );
		}

		// Delete is valid
		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelInstructionBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByGelCacheIdx.get( keyGelCacheIdx );
		subdict.remove( pkey );

		subdict = dictByChainIdx.get( keyChainIdx );
		subdict.remove( pkey );

	}
	public void deleteGelInstructionByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId )
	{
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		deleteGelInstructionByPIdx( Authorization, key );
	}

	public void deleteGelInstructionByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey )
	{
		final String S_ProcName = "deleteGelInstructionByPIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelInstructionBuff cur;
		LinkedList<YCFGenKbGelInstructionBuff> matchSet = new LinkedList<YCFGenKbGelInstructionBuff>();
		Iterator<YCFGenKbGelInstructionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelInstructionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelInstruction().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a916".equals( subClassCode ) ) {
				schema.getTableGelInstruction().deleteGelInstruction( Authorization, cur );
			}
			else if( "a917".equals( subClassCode ) ) {
				schema.getTableGelIterator().deleteGelIterator( Authorization, (YCFGenKbGelIteratorBuff)cur );
			}
			else if( "a918".equals( subClassCode ) ) {
				schema.getTableGelSpread().deleteGelSpread( Authorization, (YCFGenKbGelSpreadBuff)cur );
			}
			else if( "a919".equals( subClassCode ) ) {
				schema.getTableGelPop().deleteGelPop( Authorization, (YCFGenKbGelPopBuff)cur );
			}
			else if( "a91a".equals( subClassCode ) ) {
				schema.getTableGelPrefixLine().deleteGelPrefixLine( Authorization, (YCFGenKbGelPrefixLineBuff)cur );
			}
			else if( "a91b".equals( subClassCode ) ) {
				schema.getTableGelReference().deleteGelReference( Authorization, (YCFGenKbGelReferenceBuff)cur );
			}
			else if( "a91c".equals( subClassCode ) ) {
				schema.getTableGelCall().deleteGelCall( Authorization, (YCFGenKbGelCallBuff)cur );
			}
			else if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, (YCFGenKbGelSequenceBuff)cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else if( "a91e".equals( subClassCode ) ) {
				schema.getTableGelSwitch().deleteGelSwitch( Authorization, (YCFGenKbGelSwitchBuff)cur );
			}
			else if( "a929".equals( subClassCode ) ) {
				schema.getTableGelBoilerplate().deleteGelBoilerplate( Authorization, (YCFGenKbGelBoilerplateBuff)cur );
			}
			else if( "a92a".equals( subClassCode ) ) {
				schema.getTableGelError().deleteGelError( Authorization, (YCFGenKbGelErrorBuff)cur );
			}
			else if( "a92b".equals( subClassCode ) ) {
				schema.getTableGelBuiltin().deleteGelBuiltin( Authorization, (YCFGenKbGelBuiltinBuff)cur );
			}
			else if( "a92c".equals( subClassCode ) ) {
				schema.getTableGelConstrain().deleteGelConstrain( Authorization, (YCFGenKbGelConstrainBuff)cur );
			}
			else if( "a92d".equals( subClassCode ) ) {
				schema.getTableGelCounter().deleteGelCounter( Authorization, (YCFGenKbGelCounterBuff)cur );
			}
			else if( "a92f".equals( subClassCode ) ) {
				schema.getTableGelExpansion().deleteGelExpansion( Authorization, (YCFGenKbGelExpansionBuff)cur );
			}
			else if( "a930".equals( subClassCode ) ) {
				schema.getTableGelModifier().deleteGelModifier( Authorization, (YCFGenKbGelModifierBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelInstruction must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGelInstructionByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = schema.getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelInstructionByTenantIdx( Authorization, key );
	}

	public void deleteGelInstructionByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteGelInstructionByTenantIdx";
		YCFGenKbGelInstructionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelInstructionBuff> matchSet = new LinkedList<YCFGenKbGelInstructionBuff>();
		Iterator<YCFGenKbGelInstructionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelInstructionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelInstruction().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a916".equals( subClassCode ) ) {
				schema.getTableGelInstruction().deleteGelInstruction( Authorization, cur );
			}
			else if( "a917".equals( subClassCode ) ) {
				schema.getTableGelIterator().deleteGelIterator( Authorization, (YCFGenKbGelIteratorBuff)cur );
			}
			else if( "a918".equals( subClassCode ) ) {
				schema.getTableGelSpread().deleteGelSpread( Authorization, (YCFGenKbGelSpreadBuff)cur );
			}
			else if( "a919".equals( subClassCode ) ) {
				schema.getTableGelPop().deleteGelPop( Authorization, (YCFGenKbGelPopBuff)cur );
			}
			else if( "a91a".equals( subClassCode ) ) {
				schema.getTableGelPrefixLine().deleteGelPrefixLine( Authorization, (YCFGenKbGelPrefixLineBuff)cur );
			}
			else if( "a91b".equals( subClassCode ) ) {
				schema.getTableGelReference().deleteGelReference( Authorization, (YCFGenKbGelReferenceBuff)cur );
			}
			else if( "a91c".equals( subClassCode ) ) {
				schema.getTableGelCall().deleteGelCall( Authorization, (YCFGenKbGelCallBuff)cur );
			}
			else if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, (YCFGenKbGelSequenceBuff)cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else if( "a91e".equals( subClassCode ) ) {
				schema.getTableGelSwitch().deleteGelSwitch( Authorization, (YCFGenKbGelSwitchBuff)cur );
			}
			else if( "a929".equals( subClassCode ) ) {
				schema.getTableGelBoilerplate().deleteGelBoilerplate( Authorization, (YCFGenKbGelBoilerplateBuff)cur );
			}
			else if( "a92a".equals( subClassCode ) ) {
				schema.getTableGelError().deleteGelError( Authorization, (YCFGenKbGelErrorBuff)cur );
			}
			else if( "a92b".equals( subClassCode ) ) {
				schema.getTableGelBuiltin().deleteGelBuiltin( Authorization, (YCFGenKbGelBuiltinBuff)cur );
			}
			else if( "a92c".equals( subClassCode ) ) {
				schema.getTableGelConstrain().deleteGelConstrain( Authorization, (YCFGenKbGelConstrainBuff)cur );
			}
			else if( "a92d".equals( subClassCode ) ) {
				schema.getTableGelCounter().deleteGelCounter( Authorization, (YCFGenKbGelCounterBuff)cur );
			}
			else if( "a92f".equals( subClassCode ) ) {
				schema.getTableGelExpansion().deleteGelExpansion( Authorization, (YCFGenKbGelExpansionBuff)cur );
			}
			else if( "a930".equals( subClassCode ) ) {
				schema.getTableGelModifier().deleteGelModifier( Authorization, (YCFGenKbGelModifierBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelInstruction must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGelInstructionByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelInstructionByGelCacheIdx( Authorization, key );
	}

	public void deleteGelInstructionByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey )
	{
		final String S_ProcName = "deleteGelInstructionByGelCacheIdx";
		YCFGenKbGelInstructionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelInstructionBuff> matchSet = new LinkedList<YCFGenKbGelInstructionBuff>();
		Iterator<YCFGenKbGelInstructionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelInstructionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelInstruction().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a916".equals( subClassCode ) ) {
				schema.getTableGelInstruction().deleteGelInstruction( Authorization, cur );
			}
			else if( "a917".equals( subClassCode ) ) {
				schema.getTableGelIterator().deleteGelIterator( Authorization, (YCFGenKbGelIteratorBuff)cur );
			}
			else if( "a918".equals( subClassCode ) ) {
				schema.getTableGelSpread().deleteGelSpread( Authorization, (YCFGenKbGelSpreadBuff)cur );
			}
			else if( "a919".equals( subClassCode ) ) {
				schema.getTableGelPop().deleteGelPop( Authorization, (YCFGenKbGelPopBuff)cur );
			}
			else if( "a91a".equals( subClassCode ) ) {
				schema.getTableGelPrefixLine().deleteGelPrefixLine( Authorization, (YCFGenKbGelPrefixLineBuff)cur );
			}
			else if( "a91b".equals( subClassCode ) ) {
				schema.getTableGelReference().deleteGelReference( Authorization, (YCFGenKbGelReferenceBuff)cur );
			}
			else if( "a91c".equals( subClassCode ) ) {
				schema.getTableGelCall().deleteGelCall( Authorization, (YCFGenKbGelCallBuff)cur );
			}
			else if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, (YCFGenKbGelSequenceBuff)cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else if( "a91e".equals( subClassCode ) ) {
				schema.getTableGelSwitch().deleteGelSwitch( Authorization, (YCFGenKbGelSwitchBuff)cur );
			}
			else if( "a929".equals( subClassCode ) ) {
				schema.getTableGelBoilerplate().deleteGelBoilerplate( Authorization, (YCFGenKbGelBoilerplateBuff)cur );
			}
			else if( "a92a".equals( subClassCode ) ) {
				schema.getTableGelError().deleteGelError( Authorization, (YCFGenKbGelErrorBuff)cur );
			}
			else if( "a92b".equals( subClassCode ) ) {
				schema.getTableGelBuiltin().deleteGelBuiltin( Authorization, (YCFGenKbGelBuiltinBuff)cur );
			}
			else if( "a92c".equals( subClassCode ) ) {
				schema.getTableGelConstrain().deleteGelConstrain( Authorization, (YCFGenKbGelConstrainBuff)cur );
			}
			else if( "a92d".equals( subClassCode ) ) {
				schema.getTableGelCounter().deleteGelCounter( Authorization, (YCFGenKbGelCounterBuff)cur );
			}
			else if( "a92f".equals( subClassCode ) ) {
				schema.getTableGelExpansion().deleteGelExpansion( Authorization, (YCFGenKbGelExpansionBuff)cur );
			}
			else if( "a930".equals( subClassCode ) ) {
				schema.getTableGelModifier().deleteGelModifier( Authorization, (YCFGenKbGelModifierBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelInstruction must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGelInstructionByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = schema.getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( argChainInstTenantId );
		key.setOptionalChainInstGelCacheId( argChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( argChainInstGelInstId );
		deleteGelInstructionByChainIdx( Authorization, key );
	}

	public void deleteGelInstructionByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey )
	{
		final String S_ProcName = "deleteGelInstructionByChainIdx";
		YCFGenKbGelInstructionBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalChainInstTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalChainInstGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalChainInstGelInstId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelInstructionBuff> matchSet = new LinkedList<YCFGenKbGelInstructionBuff>();
		Iterator<YCFGenKbGelInstructionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelInstructionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelInstruction().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a916".equals( subClassCode ) ) {
				schema.getTableGelInstruction().deleteGelInstruction( Authorization, cur );
			}
			else if( "a917".equals( subClassCode ) ) {
				schema.getTableGelIterator().deleteGelIterator( Authorization, (YCFGenKbGelIteratorBuff)cur );
			}
			else if( "a918".equals( subClassCode ) ) {
				schema.getTableGelSpread().deleteGelSpread( Authorization, (YCFGenKbGelSpreadBuff)cur );
			}
			else if( "a919".equals( subClassCode ) ) {
				schema.getTableGelPop().deleteGelPop( Authorization, (YCFGenKbGelPopBuff)cur );
			}
			else if( "a91a".equals( subClassCode ) ) {
				schema.getTableGelPrefixLine().deleteGelPrefixLine( Authorization, (YCFGenKbGelPrefixLineBuff)cur );
			}
			else if( "a91b".equals( subClassCode ) ) {
				schema.getTableGelReference().deleteGelReference( Authorization, (YCFGenKbGelReferenceBuff)cur );
			}
			else if( "a91c".equals( subClassCode ) ) {
				schema.getTableGelCall().deleteGelCall( Authorization, (YCFGenKbGelCallBuff)cur );
			}
			else if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, (YCFGenKbGelSequenceBuff)cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else if( "a91e".equals( subClassCode ) ) {
				schema.getTableGelSwitch().deleteGelSwitch( Authorization, (YCFGenKbGelSwitchBuff)cur );
			}
			else if( "a929".equals( subClassCode ) ) {
				schema.getTableGelBoilerplate().deleteGelBoilerplate( Authorization, (YCFGenKbGelBoilerplateBuff)cur );
			}
			else if( "a92a".equals( subClassCode ) ) {
				schema.getTableGelError().deleteGelError( Authorization, (YCFGenKbGelErrorBuff)cur );
			}
			else if( "a92b".equals( subClassCode ) ) {
				schema.getTableGelBuiltin().deleteGelBuiltin( Authorization, (YCFGenKbGelBuiltinBuff)cur );
			}
			else if( "a92c".equals( subClassCode ) ) {
				schema.getTableGelConstrain().deleteGelConstrain( Authorization, (YCFGenKbGelConstrainBuff)cur );
			}
			else if( "a92d".equals( subClassCode ) ) {
				schema.getTableGelCounter().deleteGelCounter( Authorization, (YCFGenKbGelCounterBuff)cur );
			}
			else if( "a92f".equals( subClassCode ) ) {
				schema.getTableGelExpansion().deleteGelExpansion( Authorization, (YCFGenKbGelExpansionBuff)cur );
			}
			else if( "a930".equals( subClassCode ) ) {
				schema.getTableGelModifier().deleteGelModifier( Authorization, (YCFGenKbGelModifierBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelInstruction must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
