
// Description: Java 11 in-memory RAM DbIO implementation for GelPopContext.

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
 *	YCFGenKbRamGelPopContextTable in-memory RAM DbIO implementation
 *	for GelPopContext.
 */
public class YCFGenKbRamGelPopContextTable
	implements IYCFGenKbGelPopContextTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelInstructionPKey,
				YCFGenKbGelPopContextBuff > dictByPKey
		= new HashMap< YCFGenKbGelInstructionPKey,
				YCFGenKbGelPopContextBuff >();
	private Map< YCFGenKbGelPopContextByRemainderIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelPopContextBuff >> dictByRemainderIdx
		= new HashMap< YCFGenKbGelPopContextByRemainderIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelPopContextBuff >>();

	public YCFGenKbRamGelPopContextTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelPopContext( YCFGenKbAuthorization Authorization,
		YCFGenKbGelPopContextBuff Buff )
	{
		final String S_ProcName = "createGelPopContext";
		schema.getTableGelInstruction().createGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelPopContextByRemainderIdxKey keyRemainderIdx = schema.getFactoryGelPopContext().newRemainderIdxKey();
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

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPopContextBuff > subdictRemainderIdx;
		if( dictByRemainderIdx.containsKey( keyRemainderIdx ) ) {
			subdictRemainderIdx = dictByRemainderIdx.get( keyRemainderIdx );
		}
		else {
			subdictRemainderIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelPopContextBuff >();
			dictByRemainderIdx.put( keyRemainderIdx, subdictRemainderIdx );
		}
		subdictRemainderIdx.put( pkey, Buff );

	}

	public YCFGenKbGelPopContextBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelPopContext.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelPopContextBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPopContextBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelPopContext.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelPopContextBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPopContextBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelPopContext.readAllDerived";
		YCFGenKbGelPopContextBuff[] retList = new YCFGenKbGelPopContextBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelPopContextBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelPopContextBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelPopContextBuff> filteredList = new ArrayList<YCFGenKbGelPopContextBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelPopContextBuff ) ) {
					filteredList.add( (YCFGenKbGelPopContextBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelPopContextBuff[0] ) );
		}
	}

	public YCFGenKbGelPopContextBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelPopContextBuff> filteredList = new ArrayList<YCFGenKbGelPopContextBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelPopContextBuff ) ) {
					filteredList.add( (YCFGenKbGelPopContextBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelPopContextBuff[0] ) );
		}
	}

	public YCFGenKbGelPopContextBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelPopContextBuff> filteredList = new ArrayList<YCFGenKbGelPopContextBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelPopContextBuff ) ) {
					filteredList.add( (YCFGenKbGelPopContextBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelPopContextBuff[0] ) );
		}
	}

	public YCFGenKbGelPopContextBuff[] readDerivedByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelPopContext.readDerivedByRemainderIdx";
		YCFGenKbGelPopContextByRemainderIdxKey key = schema.getFactoryGelPopContext().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( RemainderTenantId );
		key.setRequiredRemainderGelCacheId( RemainderGelCacheId );
		key.setOptionalRemainderInstId( RemainderInstId );

		YCFGenKbGelPopContextBuff[] recArray;
		if( dictByRemainderIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPopContextBuff > subdictRemainderIdx
				= dictByRemainderIdx.get( key );
			recArray = new YCFGenKbGelPopContextBuff[ subdictRemainderIdx.size() ];
			Iterator< YCFGenKbGelPopContextBuff > iter = subdictRemainderIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPopContextBuff > subdictRemainderIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelPopContextBuff >();
			dictByRemainderIdx.put( key, subdictRemainderIdx );
			recArray = new YCFGenKbGelPopContextBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelPopContextBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByPIdx() ";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );

		YCFGenKbGelPopContextBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPopContextBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelPopContext.readBuff";
		YCFGenKbGelPopContextBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a919" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPopContextBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelPopContextBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a919" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelPopContextBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelPopContext.readAllBuff";
		YCFGenKbGelPopContextBuff buff;
		ArrayList<YCFGenKbGelPopContextBuff> filteredList = new ArrayList<YCFGenKbGelPopContextBuff>();
		YCFGenKbGelPopContextBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a919" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPopContextBuff[0] ) );
	}

	public YCFGenKbGelPopContextBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByPIdx() ";
		YCFGenKbGelPopContextBuff buff = readDerivedByPIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId );
		if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
			return( (YCFGenKbGelPopContextBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelPopContextBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByTenantIdx() ";
		YCFGenKbGelPopContextBuff buff;
		ArrayList<YCFGenKbGelPopContextBuff> filteredList = new ArrayList<YCFGenKbGelPopContextBuff>();
		YCFGenKbGelPopContextBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelPopContextBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPopContextBuff[0] ) );
	}

	public YCFGenKbGelPopContextBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByGelCacheIdx() ";
		YCFGenKbGelPopContextBuff buff;
		ArrayList<YCFGenKbGelPopContextBuff> filteredList = new ArrayList<YCFGenKbGelPopContextBuff>();
		YCFGenKbGelPopContextBuff[] buffList = readDerivedByGelCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelPopContextBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPopContextBuff[0] ) );
	}

	public YCFGenKbGelPopContextBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByChainIdx() ";
		YCFGenKbGelPopContextBuff buff;
		ArrayList<YCFGenKbGelPopContextBuff> filteredList = new ArrayList<YCFGenKbGelPopContextBuff>();
		YCFGenKbGelPopContextBuff[] buffList = readDerivedByChainIdx( Authorization,
			ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelPopContextBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPopContextBuff[0] ) );
	}

	public YCFGenKbGelPopContextBuff[] readBuffByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelPopContext.readBuffByRemainderIdx() ";
		YCFGenKbGelPopContextBuff buff;
		ArrayList<YCFGenKbGelPopContextBuff> filteredList = new ArrayList<YCFGenKbGelPopContextBuff>();
		YCFGenKbGelPopContextBuff[] buffList = readDerivedByRemainderIdx( Authorization,
			RemainderTenantId,
			RemainderGelCacheId,
			RemainderInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a919" ) ) {
				filteredList.add( (YCFGenKbGelPopContextBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelPopContextBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GelPopContext buffer instances identified by the duplicate key RemainderIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRemainderTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelPopContextBuff[] pageBuffByRemainderIdx( YCFGenKbAuthorization Authorization,
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

	public void updateGelPopContext( YCFGenKbAuthorization Authorization,
		YCFGenKbGelPopContextBuff Buff )
	{
		schema.getTableGelInstruction().updateGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelPopContextBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelPopContext",
				"Existing record not found",
				"GelPopContext",
				pkey );
		}
		YCFGenKbGelPopContextByRemainderIdxKey existingKeyRemainderIdx = schema.getFactoryGelPopContext().newRemainderIdxKey();
		existingKeyRemainderIdx.setOptionalRemainderTenantId( existing.getOptionalRemainderTenantId() );
		existingKeyRemainderIdx.setRequiredRemainderGelCacheId( existing.getRequiredRemainderGelCacheId() );
		existingKeyRemainderIdx.setOptionalRemainderInstId( existing.getOptionalRemainderInstId() );

		YCFGenKbGelPopContextByRemainderIdxKey newKeyRemainderIdx = schema.getFactoryGelPopContext().newRemainderIdxKey();
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
						"updateGelPopContext",
						"Superclass",
						"SuperClass",
						"GelInstruction",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPopContextBuff > subdict;

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
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelPopContextBuff >();
			dictByRemainderIdx.put( newKeyRemainderIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGelPopContext( YCFGenKbAuthorization Authorization,
		YCFGenKbGelPopContextBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelPopContextTable.deleteGelPopContext() ";
		String classCode;
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelPopContextBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelPopContext",
				pkey );
		}
					schema.getTableGelInstruction().deleteGelInstructionByPIdx( Authorization,
						existing.getOptionalRemainderTenantId(),
						existing.getRequiredRemainderGelCacheId(),
						existing.getOptionalRemainderInstId() );
		YCFGenKbGelPopContextByRemainderIdxKey keyRemainderIdx = schema.getFactoryGelPopContext().newRemainderIdxKey();
		keyRemainderIdx.setOptionalRemainderTenantId( existing.getOptionalRemainderTenantId() );
		keyRemainderIdx.setRequiredRemainderGelCacheId( existing.getRequiredRemainderGelCacheId() );
		keyRemainderIdx.setOptionalRemainderInstId( existing.getOptionalRemainderInstId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelPopContextBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByRemainderIdx.get( keyRemainderIdx );
		subdict.remove( pkey );

		schema.getTableGelInstruction().deleteGelInstruction( Authorization,
			Buff );
	}
	public void deleteGelPopContextByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long argRemainderTenantId,
		long argRemainderGelCacheId,
		Long argRemainderInstId )
	{
		YCFGenKbGelPopContextByRemainderIdxKey key = schema.getFactoryGelPopContext().newRemainderIdxKey();
		key.setOptionalRemainderTenantId( argRemainderTenantId );
		key.setRequiredRemainderGelCacheId( argRemainderGelCacheId );
		key.setOptionalRemainderInstId( argRemainderInstId );
		deleteGelPopContextByRemainderIdx( Authorization, key );
	}

	public void deleteGelPopContextByRemainderIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelPopContextByRemainderIdxKey argKey )
	{
		YCFGenKbGelPopContextBuff cur;
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
		LinkedList<YCFGenKbGelPopContextBuff> matchSet = new LinkedList<YCFGenKbGelPopContextBuff>();
		Iterator<YCFGenKbGelPopContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPopContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPopContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPopContext( Authorization, cur );
		}
	}

	public void deleteGelPopContextByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId )
	{
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		deleteGelPopContextByPIdx( Authorization, key );
	}

	public void deleteGelPopContextByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelPopContextBuff cur;
		LinkedList<YCFGenKbGelPopContextBuff> matchSet = new LinkedList<YCFGenKbGelPopContextBuff>();
		Iterator<YCFGenKbGelPopContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPopContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPopContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPopContext( Authorization, cur );
		}
	}

	public void deleteGelPopContextByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = schema.getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelPopContextByTenantIdx( Authorization, key );
	}

	public void deleteGelPopContextByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey )
	{
		YCFGenKbGelPopContextBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelPopContextBuff> matchSet = new LinkedList<YCFGenKbGelPopContextBuff>();
		Iterator<YCFGenKbGelPopContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPopContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPopContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPopContext( Authorization, cur );
		}
	}

	public void deleteGelPopContextByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelPopContextByGelCacheIdx( Authorization, key );
	}

	public void deleteGelPopContextByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey )
	{
		YCFGenKbGelPopContextBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelPopContextBuff> matchSet = new LinkedList<YCFGenKbGelPopContextBuff>();
		Iterator<YCFGenKbGelPopContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPopContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPopContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPopContext( Authorization, cur );
		}
	}

	public void deleteGelPopContextByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = schema.getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( argChainInstTenantId );
		key.setOptionalChainInstGelCacheId( argChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( argChainInstGelInstId );
		deleteGelPopContextByChainIdx( Authorization, key );
	}

	public void deleteGelPopContextByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey )
	{
		YCFGenKbGelPopContextBuff cur;
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
		LinkedList<YCFGenKbGelPopContextBuff> matchSet = new LinkedList<YCFGenKbGelPopContextBuff>();
		Iterator<YCFGenKbGelPopContextBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelPopContextBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelPopContext().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelPopContext( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
