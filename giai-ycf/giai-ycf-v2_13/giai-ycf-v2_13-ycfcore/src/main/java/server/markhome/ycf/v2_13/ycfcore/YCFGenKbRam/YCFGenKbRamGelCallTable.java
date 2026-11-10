
// Description: Java 11 in-memory RAM DbIO implementation for GelCall.

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
 *	YCFGenKbRamGelCallTable in-memory RAM DbIO implementation
 *	for GelCall.
 */
public class YCFGenKbRamGelCallTable
	implements IYCFGenKbGelCallTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelInstructionPKey,
				YCFGenKbGelCallBuff > dictByPKey
		= new HashMap< YCFGenKbGelInstructionPKey,
				YCFGenKbGelCallBuff >();
	private Map< YCFGenKbGelCallByCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >> dictByCacheIdx
		= new HashMap< YCFGenKbGelCallByCacheIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >>();
	private Map< YCFGenKbGelCallBySeqIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >> dictBySeqIdx
		= new HashMap< YCFGenKbGelCallBySeqIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >>();
	private Map< YCFGenKbGelCallByCallInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >> dictByCallInstIdx
		= new HashMap< YCFGenKbGelCallByCallInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >>();
	private Map< YCFGenKbGelCallByPrevInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >> dictByPrevInstIdx
		= new HashMap< YCFGenKbGelCallByPrevInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >>();
	private Map< YCFGenKbGelCallByNextInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >> dictByNextInstIdx
		= new HashMap< YCFGenKbGelCallByNextInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelCallBuff >>();

	public YCFGenKbRamGelCallTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelCall( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallBuff Buff )
	{
		final String S_ProcName = "createGelCall";
		schema.getTableGelInstruction().createGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelCallByCacheIdxKey keyCacheIdx = schema.getFactoryGelCall().newCacheIdxKey();
		keyCacheIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyCacheIdx.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );

		YCFGenKbGelCallBySeqIdxKey keySeqIdx = schema.getFactoryGelCall().newSeqIdxKey();
		keySeqIdx.setOptionalSeqInstTenantId( Buff.getOptionalSeqInstTenantId() );
		keySeqIdx.setOptionalSeqInstGelCacheId( Buff.getOptionalSeqInstGelCacheId() );
		keySeqIdx.setOptionalSeqInstId( Buff.getOptionalSeqInstId() );

		YCFGenKbGelCallByCallInstIdxKey keyCallInstIdx = schema.getFactoryGelCall().newCallInstIdxKey();
		keyCallInstIdx.setOptionalCallInstTenantId( Buff.getOptionalCallInstTenantId() );
		keyCallInstIdx.setOptionalCallInstGelCacheId( Buff.getOptionalCallInstGelCacheId() );
		keyCallInstIdx.setOptionalCallInstId( Buff.getOptionalCallInstId() );

		YCFGenKbGelCallByPrevInstIdxKey keyPrevInstIdx = schema.getFactoryGelCall().newPrevInstIdxKey();
		keyPrevInstIdx.setOptionalPrevInstTenantId( Buff.getOptionalPrevInstTenantId() );
		keyPrevInstIdx.setOptionalPrevInstGelCacheId( Buff.getOptionalPrevInstGelCacheId() );
		keyPrevInstIdx.setOptionalPrevInstGelInstId( Buff.getOptionalPrevInstGelInstId() );

		YCFGenKbGelCallByNextInstIdxKey keyNextInstIdx = schema.getFactoryGelCall().newNextInstIdxKey();
		keyNextInstIdx.setOptionalNextInstTenantId( Buff.getOptionalNextInstTenantId() );
		keyNextInstIdx.setOptionalNextInstGelCacheId( Buff.getOptionalNextInstGelCacheId() );
		keyNextInstIdx.setOptionalNextInstGelInstId( Buff.getOptionalNextInstGelInstId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableGelInstruction().readDerivedByPIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredGelCacheId(),
						Buff.getRequiredGelInstId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"GelInstruction",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictCacheIdx;
		if( dictByCacheIdx.containsKey( keyCacheIdx ) ) {
			subdictCacheIdx = dictByCacheIdx.get( keyCacheIdx );
		}
		else {
			subdictCacheIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByCacheIdx.put( keyCacheIdx, subdictCacheIdx );
		}
		subdictCacheIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictSeqIdx;
		if( dictBySeqIdx.containsKey( keySeqIdx ) ) {
			subdictSeqIdx = dictBySeqIdx.get( keySeqIdx );
		}
		else {
			subdictSeqIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictBySeqIdx.put( keySeqIdx, subdictSeqIdx );
		}
		subdictSeqIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictCallInstIdx;
		if( dictByCallInstIdx.containsKey( keyCallInstIdx ) ) {
			subdictCallInstIdx = dictByCallInstIdx.get( keyCallInstIdx );
		}
		else {
			subdictCallInstIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByCallInstIdx.put( keyCallInstIdx, subdictCallInstIdx );
		}
		subdictCallInstIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictPrevInstIdx;
		if( dictByPrevInstIdx.containsKey( keyPrevInstIdx ) ) {
			subdictPrevInstIdx = dictByPrevInstIdx.get( keyPrevInstIdx );
		}
		else {
			subdictPrevInstIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByPrevInstIdx.put( keyPrevInstIdx, subdictPrevInstIdx );
		}
		subdictPrevInstIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictNextInstIdx;
		if( dictByNextInstIdx.containsKey( keyNextInstIdx ) ) {
			subdictNextInstIdx = dictByNextInstIdx.get( keyNextInstIdx );
		}
		else {
			subdictNextInstIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByNextInstIdx.put( keyNextInstIdx, subdictNextInstIdx );
		}
		subdictNextInstIdx.put( pkey, Buff );

	}

	public YCFGenKbGelCallBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelCallBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCallBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelCallBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCallBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelCall.readAllDerived";
		YCFGenKbGelCallBuff[] retList = new YCFGenKbGelCallBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelCallBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelCallBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByTenantIdx";
		YCFGenKbGelInstructionBuff buffList[] = schema.getTableGelInstruction().readDerivedByTenantIdx( Authorization,
			TenantId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGelInstructionBuff buff;
			ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelCallBuff ) ) {
					filteredList.add( (YCFGenKbGelCallBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
		}
	}

	public YCFGenKbGelCallBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByGelCacheIdx";
		YCFGenKbGelInstructionBuff buffList[] = schema.getTableGelInstruction().readDerivedByGelCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGelInstructionBuff buff;
			ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelCallBuff ) ) {
					filteredList.add( (YCFGenKbGelCallBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
		}
	}

	public YCFGenKbGelCallBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByChainIdx";
		YCFGenKbGelInstructionBuff buffList[] = schema.getTableGelInstruction().readDerivedByChainIdx( Authorization,
			ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGelInstructionBuff buff;
			ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelCallBuff ) ) {
					filteredList.add( (YCFGenKbGelCallBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
		}
	}

	public YCFGenKbGelCallBuff[] readDerivedByCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readDerivedByCacheIdx";
		YCFGenKbGelCallByCacheIdxKey key = schema.getFactoryGelCall().newCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );

		YCFGenKbGelCallBuff[] recArray;
		if( dictByCacheIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictCacheIdx
				= dictByCacheIdx.get( key );
			recArray = new YCFGenKbGelCallBuff[ subdictCacheIdx.size() ];
			Iterator< YCFGenKbGelCallBuff > iter = subdictCacheIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictCacheIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByCacheIdx.put( key, subdictCacheIdx );
			recArray = new YCFGenKbGelCallBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelCallBuff[] readDerivedBySeqIdx( YCFGenKbAuthorization Authorization,
		Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readDerivedBySeqIdx";
		YCFGenKbGelCallBySeqIdxKey key = schema.getFactoryGelCall().newSeqIdxKey();
		key.setOptionalSeqInstTenantId( SeqInstTenantId );
		key.setOptionalSeqInstGelCacheId( SeqInstGelCacheId );
		key.setOptionalSeqInstId( SeqInstId );

		YCFGenKbGelCallBuff[] recArray;
		if( dictBySeqIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictSeqIdx
				= dictBySeqIdx.get( key );
			recArray = new YCFGenKbGelCallBuff[ subdictSeqIdx.size() ];
			Iterator< YCFGenKbGelCallBuff > iter = subdictSeqIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictSeqIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictBySeqIdx.put( key, subdictSeqIdx );
			recArray = new YCFGenKbGelCallBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelCallBuff[] readDerivedByCallInstIdx( YCFGenKbAuthorization Authorization,
		Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readDerivedByCallInstIdx";
		YCFGenKbGelCallByCallInstIdxKey key = schema.getFactoryGelCall().newCallInstIdxKey();
		key.setOptionalCallInstTenantId( CallInstTenantId );
		key.setOptionalCallInstGelCacheId( CallInstGelCacheId );
		key.setOptionalCallInstId( CallInstId );

		YCFGenKbGelCallBuff[] recArray;
		if( dictByCallInstIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictCallInstIdx
				= dictByCallInstIdx.get( key );
			recArray = new YCFGenKbGelCallBuff[ subdictCallInstIdx.size() ];
			Iterator< YCFGenKbGelCallBuff > iter = subdictCallInstIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictCallInstIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByCallInstIdx.put( key, subdictCallInstIdx );
			recArray = new YCFGenKbGelCallBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelCallBuff[] readDerivedByPrevInstIdx( YCFGenKbAuthorization Authorization,
		Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readDerivedByPrevInstIdx";
		YCFGenKbGelCallByPrevInstIdxKey key = schema.getFactoryGelCall().newPrevInstIdxKey();
		key.setOptionalPrevInstTenantId( PrevInstTenantId );
		key.setOptionalPrevInstGelCacheId( PrevInstGelCacheId );
		key.setOptionalPrevInstGelInstId( PrevInstGelInstId );

		YCFGenKbGelCallBuff[] recArray;
		if( dictByPrevInstIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictPrevInstIdx
				= dictByPrevInstIdx.get( key );
			recArray = new YCFGenKbGelCallBuff[ subdictPrevInstIdx.size() ];
			Iterator< YCFGenKbGelCallBuff > iter = subdictPrevInstIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictPrevInstIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByPrevInstIdx.put( key, subdictPrevInstIdx );
			recArray = new YCFGenKbGelCallBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelCallBuff[] readDerivedByNextInstIdx( YCFGenKbAuthorization Authorization,
		Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readDerivedByNextInstIdx";
		YCFGenKbGelCallByNextInstIdxKey key = schema.getFactoryGelCall().newNextInstIdxKey();
		key.setOptionalNextInstTenantId( NextInstTenantId );
		key.setOptionalNextInstGelCacheId( NextInstGelCacheId );
		key.setOptionalNextInstGelInstId( NextInstGelInstId );

		YCFGenKbGelCallBuff[] recArray;
		if( dictByNextInstIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictNextInstIdx
				= dictByNextInstIdx.get( key );
			recArray = new YCFGenKbGelCallBuff[ subdictNextInstIdx.size() ];
			Iterator< YCFGenKbGelCallBuff > iter = subdictNextInstIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdictNextInstIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByNextInstIdx.put( key, subdictNextInstIdx );
			recArray = new YCFGenKbGelCallBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelCallBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByPIdx() ";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );

		YCFGenKbGelCallBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCallBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readBuff";
		YCFGenKbGelCallBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a91c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCallBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelCallBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a91c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCallBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readAllBuff";
		YCFGenKbGelCallBuff buff;
		ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
		YCFGenKbGelCallBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91c" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
	}

	public YCFGenKbGelCallBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByPIdx() ";
		YCFGenKbGelCallBuff buff = readDerivedByPIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId );
		if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
			return( (YCFGenKbGelCallBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelCallBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByTenantIdx() ";
		YCFGenKbGelCallBuff buff;
		ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
		YCFGenKbGelCallBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelCallBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
	}

	public YCFGenKbGelCallBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByGelCacheIdx() ";
		YCFGenKbGelCallBuff buff;
		ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
		YCFGenKbGelCallBuff[] buffList = readDerivedByGelCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelCallBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
	}

	public YCFGenKbGelCallBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByChainIdx() ";
		YCFGenKbGelCallBuff buff;
		ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
		YCFGenKbGelCallBuff[] buffList = readDerivedByChainIdx( Authorization,
			ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelCallBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
	}

	public YCFGenKbGelCallBuff[] readBuffByCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readBuffByCacheIdx() ";
		YCFGenKbGelCallBuff buff;
		ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
		YCFGenKbGelCallBuff[] buffList = readDerivedByCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91c" ) ) {
				filteredList.add( (YCFGenKbGelCallBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
	}

	public YCFGenKbGelCallBuff[] readBuffBySeqIdx( YCFGenKbAuthorization Authorization,
		Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readBuffBySeqIdx() ";
		YCFGenKbGelCallBuff buff;
		ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
		YCFGenKbGelCallBuff[] buffList = readDerivedBySeqIdx( Authorization,
			SeqInstTenantId,
			SeqInstGelCacheId,
			SeqInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91c" ) ) {
				filteredList.add( (YCFGenKbGelCallBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
	}

	public YCFGenKbGelCallBuff[] readBuffByCallInstIdx( YCFGenKbAuthorization Authorization,
		Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readBuffByCallInstIdx() ";
		YCFGenKbGelCallBuff buff;
		ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
		YCFGenKbGelCallBuff[] buffList = readDerivedByCallInstIdx( Authorization,
			CallInstTenantId,
			CallInstGelCacheId,
			CallInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91c" ) ) {
				filteredList.add( (YCFGenKbGelCallBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
	}

	public YCFGenKbGelCallBuff[] readBuffByPrevInstIdx( YCFGenKbAuthorization Authorization,
		Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readBuffByPrevInstIdx() ";
		YCFGenKbGelCallBuff buff;
		ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
		YCFGenKbGelCallBuff[] buffList = readDerivedByPrevInstIdx( Authorization,
			PrevInstTenantId,
			PrevInstGelCacheId,
			PrevInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91c" ) ) {
				filteredList.add( (YCFGenKbGelCallBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
	}

	public YCFGenKbGelCallBuff[] readBuffByNextInstIdx( YCFGenKbAuthorization Authorization,
		Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelCall.readBuffByNextInstIdx() ";
		YCFGenKbGelCallBuff buff;
		ArrayList<YCFGenKbGelCallBuff> filteredList = new ArrayList<YCFGenKbGelCallBuff>();
		YCFGenKbGelCallBuff[] buffList = readDerivedByNextInstIdx( Authorization,
			NextInstTenantId,
			NextInstGelCacheId,
			NextInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91c" ) ) {
				filteredList.add( (YCFGenKbGelCallBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCallBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GelCall buffer instances identified by the duplicate key CacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelCallBuff[] pageBuffByCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByCacheIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelCall buffer instances identified by the duplicate key SeqIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSeqInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelCallBuff[] pageBuffBySeqIdx( YCFGenKbAuthorization Authorization,
		Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffBySeqIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelCall buffer instances identified by the duplicate key CallInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCallInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelCallBuff[] pageBuffByCallInstIdx( YCFGenKbAuthorization Authorization,
		Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByCallInstIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelCall buffer instances identified by the duplicate key PrevInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelCallBuff[] pageBuffByPrevInstIdx( YCFGenKbAuthorization Authorization,
		Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByPrevInstIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelCall buffer instances identified by the duplicate key NextInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelCallBuff[] pageBuffByNextInstIdx( YCFGenKbAuthorization Authorization,
		Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByNextInstIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateGelCall( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallBuff Buff )
	{
		schema.getTableGelInstruction().updateGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelCallBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelCall",
				"Existing record not found",
				"GelCall",
				pkey );
		}
		YCFGenKbGelCallByCacheIdxKey existingKeyCacheIdx = schema.getFactoryGelCall().newCacheIdxKey();
		existingKeyCacheIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyCacheIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );

		YCFGenKbGelCallByCacheIdxKey newKeyCacheIdx = schema.getFactoryGelCall().newCacheIdxKey();
		newKeyCacheIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyCacheIdx.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );

		YCFGenKbGelCallBySeqIdxKey existingKeySeqIdx = schema.getFactoryGelCall().newSeqIdxKey();
		existingKeySeqIdx.setOptionalSeqInstTenantId( existing.getOptionalSeqInstTenantId() );
		existingKeySeqIdx.setOptionalSeqInstGelCacheId( existing.getOptionalSeqInstGelCacheId() );
		existingKeySeqIdx.setOptionalSeqInstId( existing.getOptionalSeqInstId() );

		YCFGenKbGelCallBySeqIdxKey newKeySeqIdx = schema.getFactoryGelCall().newSeqIdxKey();
		newKeySeqIdx.setOptionalSeqInstTenantId( Buff.getOptionalSeqInstTenantId() );
		newKeySeqIdx.setOptionalSeqInstGelCacheId( Buff.getOptionalSeqInstGelCacheId() );
		newKeySeqIdx.setOptionalSeqInstId( Buff.getOptionalSeqInstId() );

		YCFGenKbGelCallByCallInstIdxKey existingKeyCallInstIdx = schema.getFactoryGelCall().newCallInstIdxKey();
		existingKeyCallInstIdx.setOptionalCallInstTenantId( existing.getOptionalCallInstTenantId() );
		existingKeyCallInstIdx.setOptionalCallInstGelCacheId( existing.getOptionalCallInstGelCacheId() );
		existingKeyCallInstIdx.setOptionalCallInstId( existing.getOptionalCallInstId() );

		YCFGenKbGelCallByCallInstIdxKey newKeyCallInstIdx = schema.getFactoryGelCall().newCallInstIdxKey();
		newKeyCallInstIdx.setOptionalCallInstTenantId( Buff.getOptionalCallInstTenantId() );
		newKeyCallInstIdx.setOptionalCallInstGelCacheId( Buff.getOptionalCallInstGelCacheId() );
		newKeyCallInstIdx.setOptionalCallInstId( Buff.getOptionalCallInstId() );

		YCFGenKbGelCallByPrevInstIdxKey existingKeyPrevInstIdx = schema.getFactoryGelCall().newPrevInstIdxKey();
		existingKeyPrevInstIdx.setOptionalPrevInstTenantId( existing.getOptionalPrevInstTenantId() );
		existingKeyPrevInstIdx.setOptionalPrevInstGelCacheId( existing.getOptionalPrevInstGelCacheId() );
		existingKeyPrevInstIdx.setOptionalPrevInstGelInstId( existing.getOptionalPrevInstGelInstId() );

		YCFGenKbGelCallByPrevInstIdxKey newKeyPrevInstIdx = schema.getFactoryGelCall().newPrevInstIdxKey();
		newKeyPrevInstIdx.setOptionalPrevInstTenantId( Buff.getOptionalPrevInstTenantId() );
		newKeyPrevInstIdx.setOptionalPrevInstGelCacheId( Buff.getOptionalPrevInstGelCacheId() );
		newKeyPrevInstIdx.setOptionalPrevInstGelInstId( Buff.getOptionalPrevInstGelInstId() );

		YCFGenKbGelCallByNextInstIdxKey existingKeyNextInstIdx = schema.getFactoryGelCall().newNextInstIdxKey();
		existingKeyNextInstIdx.setOptionalNextInstTenantId( existing.getOptionalNextInstTenantId() );
		existingKeyNextInstIdx.setOptionalNextInstGelCacheId( existing.getOptionalNextInstGelCacheId() );
		existingKeyNextInstIdx.setOptionalNextInstGelInstId( existing.getOptionalNextInstGelInstId() );

		YCFGenKbGelCallByNextInstIdxKey newKeyNextInstIdx = schema.getFactoryGelCall().newNextInstIdxKey();
		newKeyNextInstIdx.setOptionalNextInstTenantId( Buff.getOptionalNextInstTenantId() );
		newKeyNextInstIdx.setOptionalNextInstGelCacheId( Buff.getOptionalNextInstGelCacheId() );
		newKeyNextInstIdx.setOptionalNextInstGelInstId( Buff.getOptionalNextInstGelInstId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableGelInstruction().readDerivedByPIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredGelCacheId(),
						Buff.getRequiredGelInstId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGelCall",
						"Superclass",
						"SuperClass",
						"GelInstruction",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByCacheIdx.get( existingKeyCacheIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCacheIdx.containsKey( newKeyCacheIdx ) ) {
			subdict = dictByCacheIdx.get( newKeyCacheIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByCacheIdx.put( newKeyCacheIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictBySeqIdx.get( existingKeySeqIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySeqIdx.containsKey( newKeySeqIdx ) ) {
			subdict = dictBySeqIdx.get( newKeySeqIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictBySeqIdx.put( newKeySeqIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByCallInstIdx.get( existingKeyCallInstIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCallInstIdx.containsKey( newKeyCallInstIdx ) ) {
			subdict = dictByCallInstIdx.get( newKeyCallInstIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByCallInstIdx.put( newKeyCallInstIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByPrevInstIdx.get( existingKeyPrevInstIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPrevInstIdx.containsKey( newKeyPrevInstIdx ) ) {
			subdict = dictByPrevInstIdx.get( newKeyPrevInstIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByPrevInstIdx.put( newKeyPrevInstIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByNextInstIdx.get( existingKeyNextInstIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByNextInstIdx.containsKey( newKeyNextInstIdx ) ) {
			subdict = dictByNextInstIdx.get( newKeyNextInstIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff >();
			dictByNextInstIdx.put( newKeyNextInstIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGelCall( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelCallTable.deleteGelCall() ";
		String classCode;
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelCallBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelCall",
				pkey );
		}
		YCFGenKbGelCallByCacheIdxKey keyCacheIdx = schema.getFactoryGelCall().newCacheIdxKey();
		keyCacheIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyCacheIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );

		YCFGenKbGelCallBySeqIdxKey keySeqIdx = schema.getFactoryGelCall().newSeqIdxKey();
		keySeqIdx.setOptionalSeqInstTenantId( existing.getOptionalSeqInstTenantId() );
		keySeqIdx.setOptionalSeqInstGelCacheId( existing.getOptionalSeqInstGelCacheId() );
		keySeqIdx.setOptionalSeqInstId( existing.getOptionalSeqInstId() );

		YCFGenKbGelCallByCallInstIdxKey keyCallInstIdx = schema.getFactoryGelCall().newCallInstIdxKey();
		keyCallInstIdx.setOptionalCallInstTenantId( existing.getOptionalCallInstTenantId() );
		keyCallInstIdx.setOptionalCallInstGelCacheId( existing.getOptionalCallInstGelCacheId() );
		keyCallInstIdx.setOptionalCallInstId( existing.getOptionalCallInstId() );

		YCFGenKbGelCallByPrevInstIdxKey keyPrevInstIdx = schema.getFactoryGelCall().newPrevInstIdxKey();
		keyPrevInstIdx.setOptionalPrevInstTenantId( existing.getOptionalPrevInstTenantId() );
		keyPrevInstIdx.setOptionalPrevInstGelCacheId( existing.getOptionalPrevInstGelCacheId() );
		keyPrevInstIdx.setOptionalPrevInstGelInstId( existing.getOptionalPrevInstGelInstId() );

		YCFGenKbGelCallByNextInstIdxKey keyNextInstIdx = schema.getFactoryGelCall().newNextInstIdxKey();
		keyNextInstIdx.setOptionalNextInstTenantId( existing.getOptionalNextInstTenantId() );
		keyNextInstIdx.setOptionalNextInstGelCacheId( existing.getOptionalNextInstGelCacheId() );
		keyNextInstIdx.setOptionalNextInstGelInstId( existing.getOptionalNextInstGelInstId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelCallBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByCacheIdx.get( keyCacheIdx );
		subdict.remove( pkey );

		subdict = dictBySeqIdx.get( keySeqIdx );
		subdict.remove( pkey );

		subdict = dictByCallInstIdx.get( keyCallInstIdx );
		subdict.remove( pkey );

		subdict = dictByPrevInstIdx.get( keyPrevInstIdx );
		subdict.remove( pkey );

		subdict = dictByNextInstIdx.get( keyNextInstIdx );
		subdict.remove( pkey );

		schema.getTableGelInstruction().deleteGelInstruction( Authorization,
			Buff );
	}
	public void deleteGelCallByCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelCallByCacheIdxKey key = schema.getFactoryGelCall().newCacheIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelCallByCacheIdx( Authorization, key );
	}

	public void deleteGelCallByCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallByCacheIdxKey argKey )
	{
		YCFGenKbGelCallBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelCallBuff> matchSet = new LinkedList<YCFGenKbGelCallBuff>();
		Iterator<YCFGenKbGelCallBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCallBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCall().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelCall( Authorization, cur );
		}
	}

	public void deleteGelCallBySeqIdx( YCFGenKbAuthorization Authorization,
		Long argSeqInstTenantId,
		Long argSeqInstGelCacheId,
		Long argSeqInstId )
	{
		YCFGenKbGelCallBySeqIdxKey key = schema.getFactoryGelCall().newSeqIdxKey();
		key.setOptionalSeqInstTenantId( argSeqInstTenantId );
		key.setOptionalSeqInstGelCacheId( argSeqInstGelCacheId );
		key.setOptionalSeqInstId( argSeqInstId );
		deleteGelCallBySeqIdx( Authorization, key );
	}

	public void deleteGelCallBySeqIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallBySeqIdxKey argKey )
	{
		YCFGenKbGelCallBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalSeqInstTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalSeqInstGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalSeqInstId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelCallBuff> matchSet = new LinkedList<YCFGenKbGelCallBuff>();
		Iterator<YCFGenKbGelCallBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCallBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCall().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelCall( Authorization, cur );
		}
	}

	public void deleteGelCallByCallInstIdx( YCFGenKbAuthorization Authorization,
		Long argCallInstTenantId,
		Long argCallInstGelCacheId,
		Long argCallInstId )
	{
		YCFGenKbGelCallByCallInstIdxKey key = schema.getFactoryGelCall().newCallInstIdxKey();
		key.setOptionalCallInstTenantId( argCallInstTenantId );
		key.setOptionalCallInstGelCacheId( argCallInstGelCacheId );
		key.setOptionalCallInstId( argCallInstId );
		deleteGelCallByCallInstIdx( Authorization, key );
	}

	public void deleteGelCallByCallInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallByCallInstIdxKey argKey )
	{
		YCFGenKbGelCallBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalCallInstTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalCallInstGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalCallInstId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelCallBuff> matchSet = new LinkedList<YCFGenKbGelCallBuff>();
		Iterator<YCFGenKbGelCallBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCallBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCall().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelCall( Authorization, cur );
		}
	}

	public void deleteGelCallByPrevInstIdx( YCFGenKbAuthorization Authorization,
		Long argPrevInstTenantId,
		Long argPrevInstGelCacheId,
		Long argPrevInstGelInstId )
	{
		YCFGenKbGelCallByPrevInstIdxKey key = schema.getFactoryGelCall().newPrevInstIdxKey();
		key.setOptionalPrevInstTenantId( argPrevInstTenantId );
		key.setOptionalPrevInstGelCacheId( argPrevInstGelCacheId );
		key.setOptionalPrevInstGelInstId( argPrevInstGelInstId );
		deleteGelCallByPrevInstIdx( Authorization, key );
	}

	public void deleteGelCallByPrevInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallByPrevInstIdxKey argKey )
	{
		YCFGenKbGelCallBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalPrevInstTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalPrevInstGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalPrevInstGelInstId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelCallBuff> matchSet = new LinkedList<YCFGenKbGelCallBuff>();
		Iterator<YCFGenKbGelCallBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCallBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCall().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelCall( Authorization, cur );
		}
	}

	public void deleteGelCallByNextInstIdx( YCFGenKbAuthorization Authorization,
		Long argNextInstTenantId,
		Long argNextInstGelCacheId,
		Long argNextInstGelInstId )
	{
		YCFGenKbGelCallByNextInstIdxKey key = schema.getFactoryGelCall().newNextInstIdxKey();
		key.setOptionalNextInstTenantId( argNextInstTenantId );
		key.setOptionalNextInstGelCacheId( argNextInstGelCacheId );
		key.setOptionalNextInstGelInstId( argNextInstGelInstId );
		deleteGelCallByNextInstIdx( Authorization, key );
	}

	public void deleteGelCallByNextInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallByNextInstIdxKey argKey )
	{
		YCFGenKbGelCallBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalNextInstTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalNextInstGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalNextInstGelInstId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelCallBuff> matchSet = new LinkedList<YCFGenKbGelCallBuff>();
		Iterator<YCFGenKbGelCallBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCallBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCall().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelCall( Authorization, cur );
		}
	}

	public void deleteGelCallByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId )
	{
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		deleteGelCallByPIdx( Authorization, key );
	}

	public void deleteGelCallByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelCallBuff cur;
		LinkedList<YCFGenKbGelCallBuff> matchSet = new LinkedList<YCFGenKbGelCallBuff>();
		Iterator<YCFGenKbGelCallBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCallBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCall().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelCall( Authorization, cur );
		}
	}

	public void deleteGelCallByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = schema.getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelCallByTenantIdx( Authorization, key );
	}

	public void deleteGelCallByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey )
	{
		YCFGenKbGelCallBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelCallBuff> matchSet = new LinkedList<YCFGenKbGelCallBuff>();
		Iterator<YCFGenKbGelCallBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCallBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCall().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelCall( Authorization, cur );
		}
	}

	public void deleteGelCallByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelCallByGelCacheIdx( Authorization, key );
	}

	public void deleteGelCallByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey )
	{
		YCFGenKbGelCallBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelCallBuff> matchSet = new LinkedList<YCFGenKbGelCallBuff>();
		Iterator<YCFGenKbGelCallBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCallBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCall().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelCall( Authorization, cur );
		}
	}

	public void deleteGelCallByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = schema.getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( argChainInstTenantId );
		key.setOptionalChainInstGelCacheId( argChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( argChainInstGelInstId );
		deleteGelCallByChainIdx( Authorization, key );
	}

	public void deleteGelCallByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey )
	{
		YCFGenKbGelCallBuff cur;
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
		LinkedList<YCFGenKbGelCallBuff> matchSet = new LinkedList<YCFGenKbGelCallBuff>();
		Iterator<YCFGenKbGelCallBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCallBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCall().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelCall( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
