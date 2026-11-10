
// Description: Java 11 in-memory RAM DbIO implementation for GelSequence.

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
 *	YCFGenKbRamGelSequenceTable in-memory RAM DbIO implementation
 *	for GelSequence.
 */
public class YCFGenKbRamGelSequenceTable
	implements IYCFGenKbGelSequenceTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelInstructionPKey,
				YCFGenKbGelSequenceBuff > dictByPKey
		= new HashMap< YCFGenKbGelInstructionPKey,
				YCFGenKbGelSequenceBuff >();
	private Map< YCFGenKbGelSequenceByFirstInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSequenceBuff >> dictByFirstInstIdx
		= new HashMap< YCFGenKbGelSequenceByFirstInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSequenceBuff >>();
	private Map< YCFGenKbGelSequenceByLastInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSequenceBuff >> dictByLastInstIdx
		= new HashMap< YCFGenKbGelSequenceByLastInstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSequenceBuff >>();

	public YCFGenKbRamGelSequenceTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelSequence( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSequenceBuff Buff )
	{
		final String S_ProcName = "createGelSequence";
		schema.getTableGelInstruction().createGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelSequenceByFirstInstIdxKey keyFirstInstIdx = schema.getFactoryGelSequence().newFirstInstIdxKey();
		keyFirstInstIdx.setOptionalFirstInstTenantId( Buff.getOptionalFirstInstTenantId() );
		keyFirstInstIdx.setOptionalFirstInstGelCacheId( Buff.getOptionalFirstInstGelCacheId() );
		keyFirstInstIdx.setOptionalFirstInstId( Buff.getOptionalFirstInstId() );

		YCFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx = schema.getFactoryGelSequence().newLastInstIdxKey();
		keyLastInstIdx.setOptionalLastInstTenantId( Buff.getOptionalLastInstTenantId() );
		keyLastInstIdx.setOptionalLastInstGelCacheId( Buff.getOptionalLastInstGelCacheId() );
		keyLastInstIdx.setOptionalLastInstId( Buff.getOptionalLastInstId() );

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

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff > subdictFirstInstIdx;
		if( dictByFirstInstIdx.containsKey( keyFirstInstIdx ) ) {
			subdictFirstInstIdx = dictByFirstInstIdx.get( keyFirstInstIdx );
		}
		else {
			subdictFirstInstIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff >();
			dictByFirstInstIdx.put( keyFirstInstIdx, subdictFirstInstIdx );
		}
		subdictFirstInstIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff > subdictLastInstIdx;
		if( dictByLastInstIdx.containsKey( keyLastInstIdx ) ) {
			subdictLastInstIdx = dictByLastInstIdx.get( keyLastInstIdx );
		}
		else {
			subdictLastInstIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff >();
			dictByLastInstIdx.put( keyLastInstIdx, subdictLastInstIdx );
		}
		subdictLastInstIdx.put( pkey, Buff );

	}

	public YCFGenKbGelSequenceBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelSequenceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSequenceBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelSequenceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSequenceBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelSequence.readAllDerived";
		YCFGenKbGelSequenceBuff[] retList = new YCFGenKbGelSequenceBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelSequenceBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelSequenceBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelSequenceBuff> filteredList = new ArrayList<YCFGenKbGelSequenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelSequenceBuff ) ) {
					filteredList.add( (YCFGenKbGelSequenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelSequenceBuff[0] ) );
		}
	}

	public YCFGenKbGelSequenceBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelSequenceBuff> filteredList = new ArrayList<YCFGenKbGelSequenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelSequenceBuff ) ) {
					filteredList.add( (YCFGenKbGelSequenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelSequenceBuff[0] ) );
		}
	}

	public YCFGenKbGelSequenceBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelSequenceBuff> filteredList = new ArrayList<YCFGenKbGelSequenceBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelSequenceBuff ) ) {
					filteredList.add( (YCFGenKbGelSequenceBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelSequenceBuff[0] ) );
		}
	}

	public YCFGenKbGelSequenceBuff[] readDerivedByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readDerivedByFirstInstIdx";
		YCFGenKbGelSequenceByFirstInstIdxKey key = schema.getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( FirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( FirstInstGelCacheId );
		key.setOptionalFirstInstId( FirstInstId );

		YCFGenKbGelSequenceBuff[] recArray;
		if( dictByFirstInstIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff > subdictFirstInstIdx
				= dictByFirstInstIdx.get( key );
			recArray = new YCFGenKbGelSequenceBuff[ subdictFirstInstIdx.size() ];
			Iterator< YCFGenKbGelSequenceBuff > iter = subdictFirstInstIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff > subdictFirstInstIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff >();
			dictByFirstInstIdx.put( key, subdictFirstInstIdx );
			recArray = new YCFGenKbGelSequenceBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSequenceBuff[] readDerivedByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readDerivedByLastInstIdx";
		YCFGenKbGelSequenceByLastInstIdxKey key = schema.getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( LastInstTenantId );
		key.setOptionalLastInstGelCacheId( LastInstGelCacheId );
		key.setOptionalLastInstId( LastInstId );

		YCFGenKbGelSequenceBuff[] recArray;
		if( dictByLastInstIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff > subdictLastInstIdx
				= dictByLastInstIdx.get( key );
			recArray = new YCFGenKbGelSequenceBuff[ subdictLastInstIdx.size() ];
			Iterator< YCFGenKbGelSequenceBuff > iter = subdictLastInstIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff > subdictLastInstIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff >();
			dictByLastInstIdx.put( key, subdictLastInstIdx );
			recArray = new YCFGenKbGelSequenceBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSequenceBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByPIdx() ";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );

		YCFGenKbGelSequenceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSequenceBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readBuff";
		YCFGenKbGelSequenceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a91d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSequenceBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelSequenceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a91d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSequenceBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readAllBuff";
		YCFGenKbGelSequenceBuff buff;
		ArrayList<YCFGenKbGelSequenceBuff> filteredList = new ArrayList<YCFGenKbGelSequenceBuff>();
		YCFGenKbGelSequenceBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91d" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSequenceBuff[0] ) );
	}

	public YCFGenKbGelSequenceBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByPIdx() ";
		YCFGenKbGelSequenceBuff buff = readDerivedByPIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId );
		if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
			return( (YCFGenKbGelSequenceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelSequenceBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByTenantIdx() ";
		YCFGenKbGelSequenceBuff buff;
		ArrayList<YCFGenKbGelSequenceBuff> filteredList = new ArrayList<YCFGenKbGelSequenceBuff>();
		YCFGenKbGelSequenceBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelSequenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSequenceBuff[0] ) );
	}

	public YCFGenKbGelSequenceBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByGelCacheIdx() ";
		YCFGenKbGelSequenceBuff buff;
		ArrayList<YCFGenKbGelSequenceBuff> filteredList = new ArrayList<YCFGenKbGelSequenceBuff>();
		YCFGenKbGelSequenceBuff[] buffList = readDerivedByGelCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelSequenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSequenceBuff[0] ) );
	}

	public YCFGenKbGelSequenceBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByChainIdx() ";
		YCFGenKbGelSequenceBuff buff;
		ArrayList<YCFGenKbGelSequenceBuff> filteredList = new ArrayList<YCFGenKbGelSequenceBuff>();
		YCFGenKbGelSequenceBuff[] buffList = readDerivedByChainIdx( Authorization,
			ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelSequenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSequenceBuff[0] ) );
	}

	public YCFGenKbGelSequenceBuff[] readBuffByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readBuffByFirstInstIdx() ";
		YCFGenKbGelSequenceBuff buff;
		ArrayList<YCFGenKbGelSequenceBuff> filteredList = new ArrayList<YCFGenKbGelSequenceBuff>();
		YCFGenKbGelSequenceBuff[] buffList = readDerivedByFirstInstIdx( Authorization,
			FirstInstTenantId,
			FirstInstGelCacheId,
			FirstInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91d" ) ) {
				filteredList.add( (YCFGenKbGelSequenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSequenceBuff[0] ) );
	}

	public YCFGenKbGelSequenceBuff[] readBuffByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readBuffByLastInstIdx() ";
		YCFGenKbGelSequenceBuff buff;
		ArrayList<YCFGenKbGelSequenceBuff> filteredList = new ArrayList<YCFGenKbGelSequenceBuff>();
		YCFGenKbGelSequenceBuff[] buffList = readDerivedByLastInstIdx( Authorization,
			LastInstTenantId,
			LastInstGelCacheId,
			LastInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91d" ) ) {
				filteredList.add( (YCFGenKbGelSequenceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSequenceBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GelSequence buffer instances identified by the duplicate key FirstInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argFirstInstTenantId	The GelSequence key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstGelCacheId	The GelSequence key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstId	The GelSequence key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelSequenceBuff[] pageBuffByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByFirstInstIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelSequence buffer instances identified by the duplicate key LastInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLastInstTenantId	The GelSequence key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstGelCacheId	The GelSequence key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstId	The GelSequence key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelSequenceBuff[] pageBuffByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByLastInstIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateGelSequence( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSequenceBuff Buff )
	{
		schema.getTableGelInstruction().updateGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelSequenceBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelSequence",
				"Existing record not found",
				"GelSequence",
				pkey );
		}
		YCFGenKbGelSequenceByFirstInstIdxKey existingKeyFirstInstIdx = schema.getFactoryGelSequence().newFirstInstIdxKey();
		existingKeyFirstInstIdx.setOptionalFirstInstTenantId( existing.getOptionalFirstInstTenantId() );
		existingKeyFirstInstIdx.setOptionalFirstInstGelCacheId( existing.getOptionalFirstInstGelCacheId() );
		existingKeyFirstInstIdx.setOptionalFirstInstId( existing.getOptionalFirstInstId() );

		YCFGenKbGelSequenceByFirstInstIdxKey newKeyFirstInstIdx = schema.getFactoryGelSequence().newFirstInstIdxKey();
		newKeyFirstInstIdx.setOptionalFirstInstTenantId( Buff.getOptionalFirstInstTenantId() );
		newKeyFirstInstIdx.setOptionalFirstInstGelCacheId( Buff.getOptionalFirstInstGelCacheId() );
		newKeyFirstInstIdx.setOptionalFirstInstId( Buff.getOptionalFirstInstId() );

		YCFGenKbGelSequenceByLastInstIdxKey existingKeyLastInstIdx = schema.getFactoryGelSequence().newLastInstIdxKey();
		existingKeyLastInstIdx.setOptionalLastInstTenantId( existing.getOptionalLastInstTenantId() );
		existingKeyLastInstIdx.setOptionalLastInstGelCacheId( existing.getOptionalLastInstGelCacheId() );
		existingKeyLastInstIdx.setOptionalLastInstId( existing.getOptionalLastInstId() );

		YCFGenKbGelSequenceByLastInstIdxKey newKeyLastInstIdx = schema.getFactoryGelSequence().newLastInstIdxKey();
		newKeyLastInstIdx.setOptionalLastInstTenantId( Buff.getOptionalLastInstTenantId() );
		newKeyLastInstIdx.setOptionalLastInstGelCacheId( Buff.getOptionalLastInstGelCacheId() );
		newKeyLastInstIdx.setOptionalLastInstId( Buff.getOptionalLastInstId() );

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
						"updateGelSequence",
						"Superclass",
						"SuperClass",
						"GelInstruction",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByFirstInstIdx.get( existingKeyFirstInstIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByFirstInstIdx.containsKey( newKeyFirstInstIdx ) ) {
			subdict = dictByFirstInstIdx.get( newKeyFirstInstIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff >();
			dictByFirstInstIdx.put( newKeyFirstInstIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByLastInstIdx.get( existingKeyLastInstIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByLastInstIdx.containsKey( newKeyLastInstIdx ) ) {
			subdict = dictByLastInstIdx.get( newKeyLastInstIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff >();
			dictByLastInstIdx.put( newKeyLastInstIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGelSequence( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSequenceBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelSequenceTable.deleteGelSequence() ";
		String classCode;
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelSequenceBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelSequence",
				pkey );
		}
		YCFGenKbGelSequenceBuff editSubobj = schema.getTableGelSequence().readDerivedByPIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredGelCacheId(),
			existing.getRequiredGelInstId() );
			editSubobj.setOptionalFirstInstTenantId( null );
			editSubobj.setOptionalFirstInstGelCacheId( null );
			editSubobj.setOptionalFirstInstId( null );
			editSubobj.setOptionalLastInstTenantId( null );
			editSubobj.setOptionalLastInstGelCacheId( null );
			editSubobj.setOptionalLastInstId( null );
		classCode = editSubobj.getClassCode();
		if( classCode.equals( "a91d" ) ) {
			schema.getTableGelSequence().updateGelSequence( Authorization, editSubobj );
		}
		else if( classCode.equals( "a92e" ) ) {
			schema.getTableGelExecutable().updateGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)editSubobj );
		}
		else {
			new YCFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"Unrecognized ClassCode \"" + classCode + "\"" );
		}
		existing = editSubobj;
					schema.getTableGelCall().deleteGelCallBySeqIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredGelCacheId(),
						existing.getRequiredGelInstId() );
		YCFGenKbGelSequenceByFirstInstIdxKey keyFirstInstIdx = schema.getFactoryGelSequence().newFirstInstIdxKey();
		keyFirstInstIdx.setOptionalFirstInstTenantId( existing.getOptionalFirstInstTenantId() );
		keyFirstInstIdx.setOptionalFirstInstGelCacheId( existing.getOptionalFirstInstGelCacheId() );
		keyFirstInstIdx.setOptionalFirstInstId( existing.getOptionalFirstInstId() );

		YCFGenKbGelSequenceByLastInstIdxKey keyLastInstIdx = schema.getFactoryGelSequence().newLastInstIdxKey();
		keyLastInstIdx.setOptionalLastInstTenantId( existing.getOptionalLastInstTenantId() );
		keyLastInstIdx.setOptionalLastInstGelCacheId( existing.getOptionalLastInstGelCacheId() );
		keyLastInstIdx.setOptionalLastInstId( existing.getOptionalLastInstId() );

		// Validate reverse foreign keys

		if( schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredGelCacheId(),
					existing.getRequiredGelInstId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteGelSequence",
				"Superclass",
				"SuperClass",
				"GelExecutable",
				pkey );
		}

		// Delete is valid
		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSequenceBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByFirstInstIdx.get( keyFirstInstIdx );
		subdict.remove( pkey );

		subdict = dictByLastInstIdx.get( keyLastInstIdx );
		subdict.remove( pkey );

		schema.getTableGelInstruction().deleteGelInstruction( Authorization,
			Buff );
	}
	public void deleteGelSequenceByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long argFirstInstTenantId,
		Long argFirstInstGelCacheId,
		Long argFirstInstId )
	{
		YCFGenKbGelSequenceByFirstInstIdxKey key = schema.getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( argFirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( argFirstInstGelCacheId );
		key.setOptionalFirstInstId( argFirstInstId );
		deleteGelSequenceByFirstInstIdx( Authorization, key );
	}

	public void deleteGelSequenceByFirstInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSequenceByFirstInstIdxKey argKey )
	{
		final String S_ProcName = "deleteGelSequenceByFirstInstIdx";
		YCFGenKbGelSequenceBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalFirstInstTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalFirstInstGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalFirstInstId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSequenceBuff> matchSet = new LinkedList<YCFGenKbGelSequenceBuff>();
		Iterator<YCFGenKbGelSequenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSequenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSequence().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelSequence must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGelSequenceByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long argLastInstTenantId,
		Long argLastInstGelCacheId,
		Long argLastInstId )
	{
		YCFGenKbGelSequenceByLastInstIdxKey key = schema.getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( argLastInstTenantId );
		key.setOptionalLastInstGelCacheId( argLastInstGelCacheId );
		key.setOptionalLastInstId( argLastInstId );
		deleteGelSequenceByLastInstIdx( Authorization, key );
	}

	public void deleteGelSequenceByLastInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSequenceByLastInstIdxKey argKey )
	{
		final String S_ProcName = "deleteGelSequenceByLastInstIdx";
		YCFGenKbGelSequenceBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalLastInstTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalLastInstGelCacheId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalLastInstId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSequenceBuff> matchSet = new LinkedList<YCFGenKbGelSequenceBuff>();
		Iterator<YCFGenKbGelSequenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSequenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSequence().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelSequence must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGelSequenceByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId )
	{
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		deleteGelSequenceByPIdx( Authorization, key );
	}

	public void deleteGelSequenceByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey )
	{
		final String S_ProcName = "deleteGelSequenceByPIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelSequenceBuff cur;
		LinkedList<YCFGenKbGelSequenceBuff> matchSet = new LinkedList<YCFGenKbGelSequenceBuff>();
		Iterator<YCFGenKbGelSequenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSequenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSequence().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelSequence must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGelSequenceByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = schema.getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelSequenceByTenantIdx( Authorization, key );
	}

	public void deleteGelSequenceByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteGelSequenceByTenantIdx";
		YCFGenKbGelSequenceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSequenceBuff> matchSet = new LinkedList<YCFGenKbGelSequenceBuff>();
		Iterator<YCFGenKbGelSequenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSequenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSequence().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelSequence must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGelSequenceByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelSequenceByGelCacheIdx( Authorization, key );
	}

	public void deleteGelSequenceByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey )
	{
		final String S_ProcName = "deleteGelSequenceByGelCacheIdx";
		YCFGenKbGelSequenceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSequenceBuff> matchSet = new LinkedList<YCFGenKbGelSequenceBuff>();
		Iterator<YCFGenKbGelSequenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSequenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSequence().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelSequence must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteGelSequenceByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = schema.getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( argChainInstTenantId );
		key.setOptionalChainInstGelCacheId( argChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( argChainInstGelInstId );
		deleteGelSequenceByChainIdx( Authorization, key );
	}

	public void deleteGelSequenceByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey )
	{
		final String S_ProcName = "deleteGelSequenceByChainIdx";
		YCFGenKbGelSequenceBuff cur;
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
		LinkedList<YCFGenKbGelSequenceBuff> matchSet = new LinkedList<YCFGenKbGelSequenceBuff>();
		Iterator<YCFGenKbGelSequenceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSequenceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSequence().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			String subClassCode = cur.getClassCode();
			if( "a91d".equals( subClassCode ) ) {
				schema.getTableGelSequence().deleteGelSequence( Authorization, cur );
			}
			else if( "a92e".equals( subClassCode ) ) {
				schema.getTableGelExecutable().deleteGelExecutable( Authorization, (YCFGenKbGelExecutableBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of GelSequence must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
