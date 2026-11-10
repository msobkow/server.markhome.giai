
// Description: Java 11 in-memory RAM DbIO implementation for GelExecutable.

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
 *	YCFGenKbRamGelExecutableTable in-memory RAM DbIO implementation
 *	for GelExecutable.
 */
public class YCFGenKbRamGelExecutableTable
	implements IYCFGenKbGelExecutableTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelInstructionPKey,
				YCFGenKbGelExecutableBuff > dictByPKey
		= new HashMap< YCFGenKbGelInstructionPKey,
				YCFGenKbGelExecutableBuff >();
	private Map< YCFGenKbGelExecutableByGenItemIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelExecutableBuff >> dictByGenItemIdx
		= new HashMap< YCFGenKbGelExecutableByGenItemIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelExecutableBuff >>();

	public YCFGenKbRamGelExecutableTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelExecutable( YCFGenKbAuthorization Authorization,
		YCFGenKbGelExecutableBuff Buff )
	{
		final String S_ProcName = "createGelExecutable";
		schema.getTableGelSequence().createGelSequence( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx = schema.getFactoryGelExecutable().newGenItemIdxKey();
		keyGenItemIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyGenItemIdx.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );

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
				if( null == schema.getTableGelSequence().readDerivedByPIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredGelCacheId(),
						Buff.getRequiredGelInstId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"GelSequence",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelExecutableBuff > subdictGenItemIdx;
		if( dictByGenItemIdx.containsKey( keyGenItemIdx ) ) {
			subdictGenItemIdx = dictByGenItemIdx.get( keyGenItemIdx );
		}
		else {
			subdictGenItemIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelExecutableBuff >();
			dictByGenItemIdx.put( keyGenItemIdx, subdictGenItemIdx );
		}
		subdictGenItemIdx.put( pkey, Buff );

	}

	public YCFGenKbGelExecutableBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelExecutable.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelExecutableBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelExecutableBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelExecutable.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelExecutableBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelExecutableBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelExecutable.readAllDerived";
		YCFGenKbGelExecutableBuff[] retList = new YCFGenKbGelExecutableBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelExecutableBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelExecutableBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelExecutableBuff ) ) {
					filteredList.add( (YCFGenKbGelExecutableBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
		}
	}

	public YCFGenKbGelExecutableBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelExecutableBuff ) ) {
					filteredList.add( (YCFGenKbGelExecutableBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
		}
	}

	public YCFGenKbGelExecutableBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelExecutableBuff ) ) {
					filteredList.add( (YCFGenKbGelExecutableBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
		}
	}

	public YCFGenKbGelExecutableBuff[] readDerivedByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readDerivedByFirstInstIdx";
		YCFGenKbGelSequenceBuff buffList[] = schema.getTableGelSequence().readDerivedByFirstInstIdx( Authorization,
			FirstInstTenantId,
			FirstInstGelCacheId,
			FirstInstId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGelSequenceBuff buff;
			ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelExecutableBuff ) ) {
					filteredList.add( (YCFGenKbGelExecutableBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
		}
	}

	public YCFGenKbGelExecutableBuff[] readDerivedByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readDerivedByLastInstIdx";
		YCFGenKbGelSequenceBuff buffList[] = schema.getTableGelSequence().readDerivedByLastInstIdx( Authorization,
			LastInstTenantId,
			LastInstGelCacheId,
			LastInstId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFGenKbGelSequenceBuff buff;
			ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelExecutableBuff ) ) {
					filteredList.add( (YCFGenKbGelExecutableBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
		}
	}

	public YCFGenKbGelExecutableBuff[] readDerivedByGenItemIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelExecutable.readDerivedByGenItemIdx";
		YCFGenKbGelExecutableByGenItemIdxKey key = schema.getFactoryGelExecutable().newGenItemIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );

		YCFGenKbGelExecutableBuff[] recArray;
		if( dictByGenItemIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelExecutableBuff > subdictGenItemIdx
				= dictByGenItemIdx.get( key );
			recArray = new YCFGenKbGelExecutableBuff[ subdictGenItemIdx.size() ];
			Iterator< YCFGenKbGelExecutableBuff > iter = subdictGenItemIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelExecutableBuff > subdictGenItemIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelExecutableBuff >();
			dictByGenItemIdx.put( key, subdictGenItemIdx );
			recArray = new YCFGenKbGelExecutableBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelExecutableBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByPIdx() ";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );

		YCFGenKbGelExecutableBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelExecutableBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelExecutable.readBuff";
		YCFGenKbGelExecutableBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a92e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelExecutableBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelExecutableBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a92e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelExecutableBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelExecutable.readAllBuff";
		YCFGenKbGelExecutableBuff buff;
		ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
		YCFGenKbGelExecutableBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a92e" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
	}

	public YCFGenKbGelExecutableBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByPIdx() ";
		YCFGenKbGelExecutableBuff buff = readDerivedByPIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId );
		if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
			return( (YCFGenKbGelExecutableBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelExecutableBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByTenantIdx() ";
		YCFGenKbGelExecutableBuff buff;
		ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
		YCFGenKbGelExecutableBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelExecutableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
	}

	public YCFGenKbGelExecutableBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByGelCacheIdx() ";
		YCFGenKbGelExecutableBuff buff;
		ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
		YCFGenKbGelExecutableBuff[] buffList = readDerivedByGelCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelExecutableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
	}

	public YCFGenKbGelExecutableBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByChainIdx() ";
		YCFGenKbGelExecutableBuff buff;
		ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
		YCFGenKbGelExecutableBuff[] buffList = readDerivedByChainIdx( Authorization,
			ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelExecutableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
	}

	public YCFGenKbGelExecutableBuff[] readBuffByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readBuffByFirstInstIdx() ";
		YCFGenKbGelExecutableBuff buff;
		ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
		YCFGenKbGelExecutableBuff[] buffList = readDerivedByFirstInstIdx( Authorization,
			FirstInstTenantId,
			FirstInstGelCacheId,
			FirstInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91d" ) ) {
				filteredList.add( (YCFGenKbGelExecutableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
	}

	public YCFGenKbGelExecutableBuff[] readBuffByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelSequence.readBuffByLastInstIdx() ";
		YCFGenKbGelExecutableBuff buff;
		ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
		YCFGenKbGelExecutableBuff[] buffList = readDerivedByLastInstIdx( Authorization,
			LastInstTenantId,
			LastInstGelCacheId,
			LastInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a91d" ) ) {
				filteredList.add( (YCFGenKbGelExecutableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
	}

	public YCFGenKbGelExecutableBuff[] readBuffByGenItemIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelExecutable.readBuffByGenItemIdx() ";
		YCFGenKbGelExecutableBuff buff;
		ArrayList<YCFGenKbGelExecutableBuff> filteredList = new ArrayList<YCFGenKbGelExecutableBuff>();
		YCFGenKbGelExecutableBuff[] buffList = readDerivedByGenItemIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a92e" ) ) {
				filteredList.add( (YCFGenKbGelExecutableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelExecutableBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GelExecutable buffer instances identified by the duplicate key FirstInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argFirstInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelExecutableBuff[] pageBuffByFirstInstIdx( YCFGenKbAuthorization Authorization,
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
	 *	Read a page array of the specific GelExecutable buffer instances identified by the duplicate key LastInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLastInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelExecutableBuff[] pageBuffByLastInstIdx( YCFGenKbAuthorization Authorization,
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

	/**
	 *	Read a page array of the specific GelExecutable buffer instances identified by the duplicate key GenItemIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelExecutableBuff[] pageBuffByGenItemIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByGenItemIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateGelExecutable( YCFGenKbAuthorization Authorization,
		YCFGenKbGelExecutableBuff Buff )
	{
		schema.getTableGelSequence().updateGelSequence( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelExecutableBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelExecutable",
				"Existing record not found",
				"GelExecutable",
				pkey );
		}
		YCFGenKbGelExecutableByGenItemIdxKey existingKeyGenItemIdx = schema.getFactoryGelExecutable().newGenItemIdxKey();
		existingKeyGenItemIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyGenItemIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );

		YCFGenKbGelExecutableByGenItemIdxKey newKeyGenItemIdx = schema.getFactoryGelExecutable().newGenItemIdxKey();
		newKeyGenItemIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyGenItemIdx.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableGelSequence().readDerivedByPIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredGelCacheId(),
						Buff.getRequiredGelInstId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGelExecutable",
						"Superclass",
						"SuperClass",
						"GelSequence",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelExecutableBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByGenItemIdx.get( existingKeyGenItemIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByGenItemIdx.containsKey( newKeyGenItemIdx ) ) {
			subdict = dictByGenItemIdx.get( newKeyGenItemIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelExecutableBuff >();
			dictByGenItemIdx.put( newKeyGenItemIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGelExecutable( YCFGenKbAuthorization Authorization,
		YCFGenKbGelExecutableBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelExecutableTable.deleteGelExecutable() ";
		String classCode;
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelExecutableBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelExecutable",
				pkey );
		}
		YCFGenKbGelExecutableBuff editSubobj = schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
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
		if( classCode.equals( "a92e" ) ) {
			schema.getTableGelExecutable().updateGelExecutable( Authorization, editSubobj );
		}
		else {
			new YCFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"Unrecognized ClassCode \"" + classCode + "\"" );
		}
		existing = editSubobj;
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckGelCalls[] = schema.getTableGelCall().readDerivedBySeqIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredGelCacheId(),
						existing.getRequiredGelInstId() );
		if( arrCheckGelCalls.length > 0 ) {
			schema.getTableGelCall().deleteGelCallBySeqIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredGelCacheId(),
						existing.getRequiredGelInstId() );
		}
		YCFGenKbGelExecutableByGenItemIdxKey keyGenItemIdx = schema.getFactoryGelExecutable().newGenItemIdxKey();
		keyGenItemIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGenItemIdx.setRequiredGelCacheId( existing.getRequiredGelCacheId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelExecutableBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByGenItemIdx.get( keyGenItemIdx );
		subdict.remove( pkey );

		schema.getTableGelSequence().deleteGelSequence( Authorization,
			Buff );
	}
	public void deleteGelExecutableByGenItemIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelExecutableByGenItemIdxKey key = schema.getFactoryGelExecutable().newGenItemIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelExecutableByGenItemIdx( Authorization, key );
	}

	public void deleteGelExecutableByGenItemIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelExecutableByGenItemIdxKey argKey )
	{
		YCFGenKbGelExecutableBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelExecutableBuff> matchSet = new LinkedList<YCFGenKbGelExecutableBuff>();
		Iterator<YCFGenKbGelExecutableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelExecutableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelExecutable( Authorization, cur );
		}
	}

	public void deleteGelExecutableByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long argFirstInstTenantId,
		Long argFirstInstGelCacheId,
		Long argFirstInstId )
	{
		YCFGenKbGelSequenceByFirstInstIdxKey key = schema.getFactoryGelSequence().newFirstInstIdxKey();
		key.setOptionalFirstInstTenantId( argFirstInstTenantId );
		key.setOptionalFirstInstGelCacheId( argFirstInstGelCacheId );
		key.setOptionalFirstInstId( argFirstInstId );
		deleteGelExecutableByFirstInstIdx( Authorization, key );
	}

	public void deleteGelExecutableByFirstInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSequenceByFirstInstIdxKey argKey )
	{
		YCFGenKbGelExecutableBuff cur;
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
		LinkedList<YCFGenKbGelExecutableBuff> matchSet = new LinkedList<YCFGenKbGelExecutableBuff>();
		Iterator<YCFGenKbGelExecutableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelExecutableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelExecutable( Authorization, cur );
		}
	}

	public void deleteGelExecutableByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long argLastInstTenantId,
		Long argLastInstGelCacheId,
		Long argLastInstId )
	{
		YCFGenKbGelSequenceByLastInstIdxKey key = schema.getFactoryGelSequence().newLastInstIdxKey();
		key.setOptionalLastInstTenantId( argLastInstTenantId );
		key.setOptionalLastInstGelCacheId( argLastInstGelCacheId );
		key.setOptionalLastInstId( argLastInstId );
		deleteGelExecutableByLastInstIdx( Authorization, key );
	}

	public void deleteGelExecutableByLastInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSequenceByLastInstIdxKey argKey )
	{
		YCFGenKbGelExecutableBuff cur;
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
		LinkedList<YCFGenKbGelExecutableBuff> matchSet = new LinkedList<YCFGenKbGelExecutableBuff>();
		Iterator<YCFGenKbGelExecutableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelExecutableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelExecutable( Authorization, cur );
		}
	}

	public void deleteGelExecutableByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId )
	{
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		deleteGelExecutableByPIdx( Authorization, key );
	}

	public void deleteGelExecutableByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelExecutableBuff cur;
		LinkedList<YCFGenKbGelExecutableBuff> matchSet = new LinkedList<YCFGenKbGelExecutableBuff>();
		Iterator<YCFGenKbGelExecutableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelExecutableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelExecutable( Authorization, cur );
		}
	}

	public void deleteGelExecutableByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = schema.getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelExecutableByTenantIdx( Authorization, key );
	}

	public void deleteGelExecutableByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey )
	{
		YCFGenKbGelExecutableBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelExecutableBuff> matchSet = new LinkedList<YCFGenKbGelExecutableBuff>();
		Iterator<YCFGenKbGelExecutableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelExecutableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelExecutable( Authorization, cur );
		}
	}

	public void deleteGelExecutableByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelExecutableByGelCacheIdx( Authorization, key );
	}

	public void deleteGelExecutableByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey )
	{
		YCFGenKbGelExecutableBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelExecutableBuff> matchSet = new LinkedList<YCFGenKbGelExecutableBuff>();
		Iterator<YCFGenKbGelExecutableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelExecutableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelExecutable( Authorization, cur );
		}
	}

	public void deleteGelExecutableByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = schema.getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( argChainInstTenantId );
		key.setOptionalChainInstGelCacheId( argChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( argChainInstGelInstId );
		deleteGelExecutableByChainIdx( Authorization, key );
	}

	public void deleteGelExecutableByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey )
	{
		YCFGenKbGelExecutableBuff cur;
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
		LinkedList<YCFGenKbGelExecutableBuff> matchSet = new LinkedList<YCFGenKbGelExecutableBuff>();
		Iterator<YCFGenKbGelExecutableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelExecutableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelExecutable().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelExecutable( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
