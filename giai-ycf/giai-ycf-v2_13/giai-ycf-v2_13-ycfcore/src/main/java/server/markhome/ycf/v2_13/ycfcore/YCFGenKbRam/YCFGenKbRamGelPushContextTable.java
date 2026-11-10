
// Description: Java 11 in-memory RAM DbIO implementation for GelPushContext.

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
 *	YCFGenKbRamGelPushContextTable in-memory RAM DbIO implementation
 *	for GelPushContext.
 */
public class YCFGenKbRamGelPushContextTable
	implements IYCFGenKbGelPushContextTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelInstructionPKey,
				YCFGenKbGelPushContextBuff > dictByPKey
		= new HashMap< YCFGenKbGelInstructionPKey,
				YCFGenKbGelPushContextBuff >();
	private Map< YCFGenKbGelPushContextByRemainderIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelPushContextBuff >> dictByRemainderIdx
		= new HashMap< YCFGenKbGelPushContextByRemainderIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelPushContextBuff >>();

	public YCFGenKbRamGelPushContextTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelPushContext( YCFGenKbAuthorization Authorization,
		YCFGenKbGelPushContextBuff Buff )
	{
		final String S_ProcName = "createGelPushContext";
		schema.getTableGelInstruction().createGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelPushContextByRemainderIdxKey keyRemainderIdx = schema.getFactoryGelPushContext().newRemainderIdxKey();
		keyRemainderIdx.setOptionalRemainderTenantId( Buff.getOptionalRemainderTenantId() );
		keyRemainderIdx.setRequiredRemainderGelCacheId( Buff.getRequiredRemainderGelCacheId() );
		keyRemainderIdx.setOptionalRemainderInstId( Buff.getOptionalRemainderInstId() );

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

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPushContextBuff > subdictRemainderIdx;
		if( dictByRemainderIdx.containsKey( keyRemainderIdx ) ) {
			subdictRemainderIdx = dictByRemainderIdx.get( keyRemainderIdx );
		}
		else {
			subdictRemainderIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelPushContextBuff >();
			dictByRemainderIdx.put( keyRemainderIdx, subdictRemainderIdx );
		}
		subdictRemainderIdx.put( pkey, Buff );

	}

	public YCFGenKbGelPushContextBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelPushContext.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelPushContextBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPushContextBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelPushContext.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelPushContextBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPushContextBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelPushContext.readAllDerived";
		YCFGenKbGelPushContextBuff[] retList = new YCFGenKbGelPushContextBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelPushContextBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelPushContextBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelPushContextBuff> filteredList = new ArrayList<YCFGenKbGelPushContextBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelPushContextBuff ) ) {
					filteredList.add( (YCFGenKbGelPushContextBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelPushContextBuff[0] ) );
		}
	}

	public YCFGenKbGelPushContextBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelPushContextBuff> filteredList = new ArrayList<YCFGenKbGelPushContextBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelPushContextBuff ) ) {
					filteredList.add( (YCFGenKbGelPushContextBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelPushContextBuff[0] ) );
		}
	}

	public YCFGenKbGelPushContextBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelPushContextBuff> filteredList = new ArrayList<YCFGenKbGelPushContextBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelPushContextBuff ) ) {
					filteredList.add( (YCFGenKbGelPushContextBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelPushContextBuff[0] ) );
		}
	}

	public YCFGenKbGelPushContextBuff[] readDerivedByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelPushContext.readDerivedByRemainderIdx";
		YCFGenKbGelPushContextByRemainderIdxKey key = schema.getFactoryGelPushContext().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( RemainderTenantId );
		key.setRequiredRemainderGelCacheId( RemainderGelCacheId );
		key.setOptionalRemainderInstId( RemainderInstId );

		YCFGenKbGelPushContextBuff[] recArray;
		if( dictByRemainderIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPushContextBuff > subdictRemainderIdx
				= dictByRemainderIdx.get( key );
			recArray = new YCFGenKbGelPushContextBuff[ subdictRemainderIdx.size() ];
			Iterator< YCFGenKbGelPushContextBuff > iter = subdictRemainderIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPushContextBuff > subdictRemainderIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelPushContextBuff >();
			dictByRemainderIdx.put( key, subdictRemainderIdx );
			recArray = new YCFGenKbGelPushContextBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelPushContextBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByPIdx() ";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );

		YCFGenKbGelPushContextBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPushContextBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelPushContext.readBuff";
		YCFGenKbGelPushContextBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a919" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPushContextBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelPushContextBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a919" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPushContextBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelPushContext.readAllBuff";
		YCFGenKbGelPushContextBuff buff;
		ArrayList<YCFGenKbGelPushContextBuff> filteredList = new ArrayList<YCFGenKbGelPushContextBuff>();
		YCFGenKbGelPushContextBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a919" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPushContextBuff[0] ) );
	}

	public YCFGenKbGelPushContextBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByPIdx() ";
		YCFGenKbGelPushContextBuff buff = readDerivedByPIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId );
		if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
			return( (YCFGenKbGelPushContextBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelPushContextBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByTenantIdx() ";
		YCFGenKbGelPushContextBuff buff;
		ArrayList<YCFGenKbGelPushContextBuff> filteredList = new ArrayList<YCFGenKbGelPushContextBuff>();
		YCFGenKbGelPushContextBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelPushContextBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPushContextBuff[0] ) );
	}

	public YCFGenKbGelPushContextBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByGelCacheIdx() ";
		YCFGenKbGelPushContextBuff buff;
		ArrayList<YCFGenKbGelPushContextBuff> filteredList = new ArrayList<YCFGenKbGelPushContextBuff>();
		YCFGenKbGelPushContextBuff[] buffList = readDerivedByGelCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelPushContextBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPushContextBuff[0] ) );
	}

	public YCFGenKbGelPushContextBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByChainIdx() ";
		YCFGenKbGelPushContextBuff buff;
		ArrayList<YCFGenKbGelPushContextBuff> filteredList = new ArrayList<YCFGenKbGelPushContextBuff>();
		YCFGenKbGelPushContextBuff[] buffList = readDerivedByChainIdx( Authorization,
			ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelPushContextBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPushContextBuff[0] ) );
	}

	public YCFGenKbGelPushContextBuff[] readBuffByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelPushContext.readBuffByRemainderIdx() ";
		YCFGenKbGelPushContextBuff buff;
		ArrayList<YCFGenKbGelPushContextBuff> filteredList = new ArrayList<YCFGenKbGelPushContextBuff>();
		YCFGenKbGelPushContextBuff[] buffList = readDerivedByRemainderIdx( Authorization,
			RemainderTenantId,
			RemainderGelCacheId,
			RemainderInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a919" ) ) {
				filteredList.add( (YCFGenKbGelPushContextBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPushContextBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GelPushContext buffer instances identified by the duplicate key RemainderIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRemainderTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelPushContextBuff[] pageBuffByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByRemainderIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateGelPushContext( YCFGenKbAuthorization Authorization,
		YCFGenKbGelPushContextBuff Buff )
	{
		schema.getTableGelInstruction().updateGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelPushContextBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelPushContext",
				"Existing record not found",
				"GelPushContext",
				pkey );
		}
		YCFGenKbGelPushContextByRemainderIdxKey existingKeyRemainderIdx = schema.getFactoryGelPushContext().newRemainderIdxKey();
		existingKeyRemainderIdx.setOptionalRemainderTenantId( existing.getOptionalRemainderTenantId() );
		existingKeyRemainderIdx.setRequiredRemainderGelCacheId( existing.getRequiredRemainderGelCacheId() );
		existingKeyRemainderIdx.setOptionalRemainderInstId( existing.getOptionalRemainderInstId() );

		YCFGenKbGelPushContextByRemainderIdxKey newKeyRemainderIdx = schema.getFactoryGelPushContext().newRemainderIdxKey();
		newKeyRemainderIdx.setOptionalRemainderTenantId( Buff.getOptionalRemainderTenantId() );
		newKeyRemainderIdx.setRequiredRemainderGelCacheId( Buff.getRequiredRemainderGelCacheId() );
		newKeyRemainderIdx.setOptionalRemainderInstId( Buff.getOptionalRemainderInstId() );

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
						"updateGelPushContext",
						"Superclass",
						"SuperClass",
						"GelInstruction",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPushContextBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByRemainderIdx.get( existingKeyRemainderIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRemainderIdx.containsKey( newKeyRemainderIdx ) ) {
			subdict = dictByRemainderIdx.get( newKeyRemainderIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelPushContextBuff >();
			dictByRemainderIdx.put( newKeyRemainderIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGelPushContext( YCFGenKbAuthorization Authorization,
		YCFGenKbGelPushContextBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelPushContextTable.deleteGelPushContext() ";
		String classCode;
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelPushContextBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelPushContext",
				pkey );
		}
					schema.getTableGelInstruction().deleteGelInstructionByPIdx( Authorization,
						existing.getOptionalRemainderTenantId(),
						existing.getRequiredRemainderGelCacheId(),
						existing.getOptionalRemainderInstId() );
		YCFGenKbGelPushContextByRemainderIdxKey keyRemainderIdx = schema.getFactoryGelPushContext().newRemainderIdxKey();
		keyRemainderIdx.setOptionalRemainderTenantId( existing.getOptionalRemainderTenantId() );
		keyRemainderIdx.setRequiredRemainderGelCacheId( existing.getRequiredRemainderGelCacheId() );
		keyRemainderIdx.setOptionalRemainderInstId( existing.getOptionalRemainderInstId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPushContextBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByRemainderIdx.get( keyRemainderIdx );
		subdict.remove( pkey );

		schema.getTableGelInstruction().deleteGelInstruction( Authorization,
			Buff );
	}
	public void deleteGelPushContextByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long argRemainderTenantId,
		long argRemainderGelCacheId,
		Long argRemainderInstId )
	{
		YCFGenKbGelPushContextByRemainderIdxKey key = schema.getFactoryGelPushContext().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( argRemainderTenantId );
		key.setRequiredRemainderGelCacheId( argRemainderGelCacheId );
		key.setOptionalRemainderInstId( argRemainderInstId );
		deleteGelPushContextByRemainderIdx( Authorization, key );
	}

	public void deleteGelPushContextByRemainderIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelPushContextByRemainderIdxKey argKey )
	{
		YCFGenKbGelPushContextBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalRemainderTenantId() != null ) {
			anyNotNull = true;
		}
		anyNotNull = true;
		if( argKey.getOptionalRemainderInstId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelPushContextBuff> matchSet = new LinkedList<YCFGenKbGelPushContextBuff>();
		Iterator<YCFGenKbGelPushContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPushContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPushContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPushContext( Authorization, cur );
		}
	}

	public void deleteGelPushContextByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId )
	{
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		deleteGelPushContextByPIdx( Authorization, key );
	}

	public void deleteGelPushContextByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelPushContextBuff cur;
		LinkedList<YCFGenKbGelPushContextBuff> matchSet = new LinkedList<YCFGenKbGelPushContextBuff>();
		Iterator<YCFGenKbGelPushContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPushContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPushContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPushContext( Authorization, cur );
		}
	}

	public void deleteGelPushContextByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = schema.getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelPushContextByTenantIdx( Authorization, key );
	}

	public void deleteGelPushContextByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey )
	{
		YCFGenKbGelPushContextBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelPushContextBuff> matchSet = new LinkedList<YCFGenKbGelPushContextBuff>();
		Iterator<YCFGenKbGelPushContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPushContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPushContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPushContext( Authorization, cur );
		}
	}

	public void deleteGelPushContextByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelPushContextByGelCacheIdx( Authorization, key );
	}

	public void deleteGelPushContextByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey )
	{
		YCFGenKbGelPushContextBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelPushContextBuff> matchSet = new LinkedList<YCFGenKbGelPushContextBuff>();
		Iterator<YCFGenKbGelPushContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPushContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPushContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPushContext( Authorization, cur );
		}
	}

	public void deleteGelPushContextByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = schema.getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( argChainInstTenantId );
		key.setOptionalChainInstGelCacheId( argChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( argChainInstGelInstId );
		deleteGelPushContextByChainIdx( Authorization, key );
	}

	public void deleteGelPushContextByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey )
	{
		YCFGenKbGelPushContextBuff cur;
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
		LinkedList<YCFGenKbGelPushContextBuff> matchSet = new LinkedList<YCFGenKbGelPushContextBuff>();
		Iterator<YCFGenKbGelPushContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPushContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPushContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPushContext( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
