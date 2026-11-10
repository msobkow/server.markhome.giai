
// Description: Java 11 in-memory RAM DbIO implementation for GelIterator.

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
 *	YCFGenKbRamGelIteratorTable in-memory RAM DbIO implementation
 *	for GelIterator.
 */
public class YCFGenKbRamGelIteratorTable
	implements IYCFGenKbGelIteratorTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelInstructionPKey,
				YCFGenKbGelIteratorBuff > dictByPKey
		= new HashMap< YCFGenKbGelInstructionPKey,
				YCFGenKbGelIteratorBuff >();
	private Map< YCFGenKbGelIteratorByBeforeIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >> dictByBeforeIdx
		= new HashMap< YCFGenKbGelIteratorByBeforeIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >>();
	private Map< YCFGenKbGelIteratorByFirstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >> dictByFirstIdx
		= new HashMap< YCFGenKbGelIteratorByFirstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >>();
	private Map< YCFGenKbGelIteratorByEachIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >> dictByEachIdx
		= new HashMap< YCFGenKbGelIteratorByEachIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >>();
	private Map< YCFGenKbGelIteratorByLastIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >> dictByLastIdx
		= new HashMap< YCFGenKbGelIteratorByLastIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >>();
	private Map< YCFGenKbGelIteratorByLoneIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >> dictByLoneIdx
		= new HashMap< YCFGenKbGelIteratorByLoneIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >>();
	private Map< YCFGenKbGelIteratorByEmptyIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >> dictByEmptyIdx
		= new HashMap< YCFGenKbGelIteratorByEmptyIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelIteratorBuff >>();

	public YCFGenKbRamGelIteratorTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelIterator( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorBuff Buff )
	{
		final String S_ProcName = "createGelIterator";
		schema.getTableGelInstruction().createGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx = schema.getFactoryGelIterator().newBeforeIdxKey();
		keyBeforeIdx.setOptionalExpandBefore( Buff.getOptionalExpandBefore() );

		YCFGenKbGelIteratorByFirstIdxKey keyFirstIdx = schema.getFactoryGelIterator().newFirstIdxKey();
		keyFirstIdx.setOptionalExpandFirst( Buff.getOptionalExpandFirst() );

		YCFGenKbGelIteratorByEachIdxKey keyEachIdx = schema.getFactoryGelIterator().newEachIdxKey();
		keyEachIdx.setRequiredExpandEach( Buff.getRequiredExpandEach() );

		YCFGenKbGelIteratorByLastIdxKey keyLastIdx = schema.getFactoryGelIterator().newLastIdxKey();
		keyLastIdx.setOptionalExpandLast( Buff.getOptionalExpandLast() );

		YCFGenKbGelIteratorByLoneIdxKey keyLoneIdx = schema.getFactoryGelIterator().newLoneIdxKey();
		keyLoneIdx.setOptionalExpandLone( Buff.getOptionalExpandLone() );

		YCFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx = schema.getFactoryGelIterator().newEmptyIdxKey();
		keyEmptyIdx.setOptionalExpandEmpty( Buff.getOptionalExpandEmpty() );

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

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictBeforeIdx;
		if( dictByBeforeIdx.containsKey( keyBeforeIdx ) ) {
			subdictBeforeIdx = dictByBeforeIdx.get( keyBeforeIdx );
		}
		else {
			subdictBeforeIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByBeforeIdx.put( keyBeforeIdx, subdictBeforeIdx );
		}
		subdictBeforeIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictFirstIdx;
		if( dictByFirstIdx.containsKey( keyFirstIdx ) ) {
			subdictFirstIdx = dictByFirstIdx.get( keyFirstIdx );
		}
		else {
			subdictFirstIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByFirstIdx.put( keyFirstIdx, subdictFirstIdx );
		}
		subdictFirstIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictEachIdx;
		if( dictByEachIdx.containsKey( keyEachIdx ) ) {
			subdictEachIdx = dictByEachIdx.get( keyEachIdx );
		}
		else {
			subdictEachIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByEachIdx.put( keyEachIdx, subdictEachIdx );
		}
		subdictEachIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictLastIdx;
		if( dictByLastIdx.containsKey( keyLastIdx ) ) {
			subdictLastIdx = dictByLastIdx.get( keyLastIdx );
		}
		else {
			subdictLastIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByLastIdx.put( keyLastIdx, subdictLastIdx );
		}
		subdictLastIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictLoneIdx;
		if( dictByLoneIdx.containsKey( keyLoneIdx ) ) {
			subdictLoneIdx = dictByLoneIdx.get( keyLoneIdx );
		}
		else {
			subdictLoneIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByLoneIdx.put( keyLoneIdx, subdictLoneIdx );
		}
		subdictLoneIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictEmptyIdx;
		if( dictByEmptyIdx.containsKey( keyEmptyIdx ) ) {
			subdictEmptyIdx = dictByEmptyIdx.get( keyEmptyIdx );
		}
		else {
			subdictEmptyIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByEmptyIdx.put( keyEmptyIdx, subdictEmptyIdx );
		}
		subdictEmptyIdx.put( pkey, Buff );

	}

	public YCFGenKbGelIteratorBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelIteratorBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelIteratorBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelIteratorBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelIteratorBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelIterator.readAllDerived";
		YCFGenKbGelIteratorBuff[] retList = new YCFGenKbGelIteratorBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelIteratorBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelIteratorBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGelIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGelIteratorBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGelIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGelIteratorBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelIteratorBuff ) ) {
					filteredList.add( (YCFGenKbGelIteratorBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
		}
	}

	public YCFGenKbGelIteratorBuff[] readDerivedByBeforeIdx( YCFGenKbAuthorization Authorization,
		String ExpandBefore )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readDerivedByBeforeIdx";
		YCFGenKbGelIteratorByBeforeIdxKey key = schema.getFactoryGelIterator().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );

		YCFGenKbGelIteratorBuff[] recArray;
		if( dictByBeforeIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictBeforeIdx
				= dictByBeforeIdx.get( key );
			recArray = new YCFGenKbGelIteratorBuff[ subdictBeforeIdx.size() ];
			Iterator< YCFGenKbGelIteratorBuff > iter = subdictBeforeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictBeforeIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByBeforeIdx.put( key, subdictBeforeIdx );
			recArray = new YCFGenKbGelIteratorBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelIteratorBuff[] readDerivedByFirstIdx( YCFGenKbAuthorization Authorization,
		String ExpandFirst )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readDerivedByFirstIdx";
		YCFGenKbGelIteratorByFirstIdxKey key = schema.getFactoryGelIterator().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );

		YCFGenKbGelIteratorBuff[] recArray;
		if( dictByFirstIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictFirstIdx
				= dictByFirstIdx.get( key );
			recArray = new YCFGenKbGelIteratorBuff[ subdictFirstIdx.size() ];
			Iterator< YCFGenKbGelIteratorBuff > iter = subdictFirstIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictFirstIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByFirstIdx.put( key, subdictFirstIdx );
			recArray = new YCFGenKbGelIteratorBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelIteratorBuff[] readDerivedByEachIdx( YCFGenKbAuthorization Authorization,
		String ExpandEach )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readDerivedByEachIdx";
		YCFGenKbGelIteratorByEachIdxKey key = schema.getFactoryGelIterator().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );

		YCFGenKbGelIteratorBuff[] recArray;
		if( dictByEachIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictEachIdx
				= dictByEachIdx.get( key );
			recArray = new YCFGenKbGelIteratorBuff[ subdictEachIdx.size() ];
			Iterator< YCFGenKbGelIteratorBuff > iter = subdictEachIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictEachIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByEachIdx.put( key, subdictEachIdx );
			recArray = new YCFGenKbGelIteratorBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelIteratorBuff[] readDerivedByLastIdx( YCFGenKbAuthorization Authorization,
		String ExpandLast )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readDerivedByLastIdx";
		YCFGenKbGelIteratorByLastIdxKey key = schema.getFactoryGelIterator().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );

		YCFGenKbGelIteratorBuff[] recArray;
		if( dictByLastIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictLastIdx
				= dictByLastIdx.get( key );
			recArray = new YCFGenKbGelIteratorBuff[ subdictLastIdx.size() ];
			Iterator< YCFGenKbGelIteratorBuff > iter = subdictLastIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictLastIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByLastIdx.put( key, subdictLastIdx );
			recArray = new YCFGenKbGelIteratorBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelIteratorBuff[] readDerivedByLoneIdx( YCFGenKbAuthorization Authorization,
		String ExpandLone )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readDerivedByLoneIdx";
		YCFGenKbGelIteratorByLoneIdxKey key = schema.getFactoryGelIterator().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );

		YCFGenKbGelIteratorBuff[] recArray;
		if( dictByLoneIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictLoneIdx
				= dictByLoneIdx.get( key );
			recArray = new YCFGenKbGelIteratorBuff[ subdictLoneIdx.size() ];
			Iterator< YCFGenKbGelIteratorBuff > iter = subdictLoneIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictLoneIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByLoneIdx.put( key, subdictLoneIdx );
			recArray = new YCFGenKbGelIteratorBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelIteratorBuff[] readDerivedByEmptyIdx( YCFGenKbAuthorization Authorization,
		String ExpandEmpty )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readDerivedByEmptyIdx";
		YCFGenKbGelIteratorByEmptyIdxKey key = schema.getFactoryGelIterator().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );

		YCFGenKbGelIteratorBuff[] recArray;
		if( dictByEmptyIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictEmptyIdx
				= dictByEmptyIdx.get( key );
			recArray = new YCFGenKbGelIteratorBuff[ subdictEmptyIdx.size() ];
			Iterator< YCFGenKbGelIteratorBuff > iter = subdictEmptyIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdictEmptyIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByEmptyIdx.put( key, subdictEmptyIdx );
			recArray = new YCFGenKbGelIteratorBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelIteratorBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByPIdx() ";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );

		YCFGenKbGelIteratorBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelIteratorBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readBuff";
		YCFGenKbGelIteratorBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a917" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelIteratorBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelIteratorBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a917" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelIteratorBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readAllBuff";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a917" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	public YCFGenKbGelIteratorBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByPIdx() ";
		YCFGenKbGelIteratorBuff buff = readDerivedByPIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId );
		if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
			return( (YCFGenKbGelIteratorBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelIteratorBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByTenantIdx() ";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	public YCFGenKbGelIteratorBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByGelCacheIdx() ";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readDerivedByGelCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	public YCFGenKbGelIteratorBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByChainIdx() ";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readDerivedByChainIdx( Authorization,
			ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	public YCFGenKbGelIteratorBuff[] readBuffByBeforeIdx( YCFGenKbAuthorization Authorization,
		String ExpandBefore )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readBuffByBeforeIdx() ";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readDerivedByBeforeIdx( Authorization,
			ExpandBefore );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a917" ) ) {
				filteredList.add( (YCFGenKbGelIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	public YCFGenKbGelIteratorBuff[] readBuffByFirstIdx( YCFGenKbAuthorization Authorization,
		String ExpandFirst )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readBuffByFirstIdx() ";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readDerivedByFirstIdx( Authorization,
			ExpandFirst );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a917" ) ) {
				filteredList.add( (YCFGenKbGelIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	public YCFGenKbGelIteratorBuff[] readBuffByEachIdx( YCFGenKbAuthorization Authorization,
		String ExpandEach )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readBuffByEachIdx() ";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readDerivedByEachIdx( Authorization,
			ExpandEach );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a917" ) ) {
				filteredList.add( (YCFGenKbGelIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	public YCFGenKbGelIteratorBuff[] readBuffByLastIdx( YCFGenKbAuthorization Authorization,
		String ExpandLast )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readBuffByLastIdx() ";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readDerivedByLastIdx( Authorization,
			ExpandLast );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a917" ) ) {
				filteredList.add( (YCFGenKbGelIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	public YCFGenKbGelIteratorBuff[] readBuffByLoneIdx( YCFGenKbAuthorization Authorization,
		String ExpandLone )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readBuffByLoneIdx() ";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readDerivedByLoneIdx( Authorization,
			ExpandLone );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a917" ) ) {
				filteredList.add( (YCFGenKbGelIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	public YCFGenKbGelIteratorBuff[] readBuffByEmptyIdx( YCFGenKbAuthorization Authorization,
		String ExpandEmpty )
	{
		final String S_ProcName = "YCFGenKbRamGelIterator.readBuffByEmptyIdx() ";
		YCFGenKbGelIteratorBuff buff;
		ArrayList<YCFGenKbGelIteratorBuff> filteredList = new ArrayList<YCFGenKbGelIteratorBuff>();
		YCFGenKbGelIteratorBuff[] buffList = readDerivedByEmptyIdx( Authorization,
			ExpandEmpty );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a917" ) ) {
				filteredList.add( (YCFGenKbGelIteratorBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelIteratorBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GelIterator buffer instances identified by the duplicate key BeforeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelIteratorBuff[] pageBuffByBeforeIdx( YCFGenKbAuthorization Authorization,
		String ExpandBefore,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByBeforeIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelIterator buffer instances identified by the duplicate key FirstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelIteratorBuff[] pageBuffByFirstIdx( YCFGenKbAuthorization Authorization,
		String ExpandFirst,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByFirstIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelIterator buffer instances identified by the duplicate key EachIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelIteratorBuff[] pageBuffByEachIdx( YCFGenKbAuthorization Authorization,
		String ExpandEach,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByEachIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelIterator buffer instances identified by the duplicate key LastIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelIteratorBuff[] pageBuffByLastIdx( YCFGenKbAuthorization Authorization,
		String ExpandLast,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByLastIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelIterator buffer instances identified by the duplicate key LoneIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelIteratorBuff[] pageBuffByLoneIdx( YCFGenKbAuthorization Authorization,
		String ExpandLone,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByLoneIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelIterator buffer instances identified by the duplicate key EmptyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelIteratorBuff[] pageBuffByEmptyIdx( YCFGenKbAuthorization Authorization,
		String ExpandEmpty,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByEmptyIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateGelIterator( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorBuff Buff )
	{
		schema.getTableGelInstruction().updateGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelIteratorBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelIterator",
				"Existing record not found",
				"GelIterator",
				pkey );
		}
		YCFGenKbGelIteratorByBeforeIdxKey existingKeyBeforeIdx = schema.getFactoryGelIterator().newBeforeIdxKey();
		existingKeyBeforeIdx.setOptionalExpandBefore( existing.getOptionalExpandBefore() );

		YCFGenKbGelIteratorByBeforeIdxKey newKeyBeforeIdx = schema.getFactoryGelIterator().newBeforeIdxKey();
		newKeyBeforeIdx.setOptionalExpandBefore( Buff.getOptionalExpandBefore() );

		YCFGenKbGelIteratorByFirstIdxKey existingKeyFirstIdx = schema.getFactoryGelIterator().newFirstIdxKey();
		existingKeyFirstIdx.setOptionalExpandFirst( existing.getOptionalExpandFirst() );

		YCFGenKbGelIteratorByFirstIdxKey newKeyFirstIdx = schema.getFactoryGelIterator().newFirstIdxKey();
		newKeyFirstIdx.setOptionalExpandFirst( Buff.getOptionalExpandFirst() );

		YCFGenKbGelIteratorByEachIdxKey existingKeyEachIdx = schema.getFactoryGelIterator().newEachIdxKey();
		existingKeyEachIdx.setRequiredExpandEach( existing.getRequiredExpandEach() );

		YCFGenKbGelIteratorByEachIdxKey newKeyEachIdx = schema.getFactoryGelIterator().newEachIdxKey();
		newKeyEachIdx.setRequiredExpandEach( Buff.getRequiredExpandEach() );

		YCFGenKbGelIteratorByLastIdxKey existingKeyLastIdx = schema.getFactoryGelIterator().newLastIdxKey();
		existingKeyLastIdx.setOptionalExpandLast( existing.getOptionalExpandLast() );

		YCFGenKbGelIteratorByLastIdxKey newKeyLastIdx = schema.getFactoryGelIterator().newLastIdxKey();
		newKeyLastIdx.setOptionalExpandLast( Buff.getOptionalExpandLast() );

		YCFGenKbGelIteratorByLoneIdxKey existingKeyLoneIdx = schema.getFactoryGelIterator().newLoneIdxKey();
		existingKeyLoneIdx.setOptionalExpandLone( existing.getOptionalExpandLone() );

		YCFGenKbGelIteratorByLoneIdxKey newKeyLoneIdx = schema.getFactoryGelIterator().newLoneIdxKey();
		newKeyLoneIdx.setOptionalExpandLone( Buff.getOptionalExpandLone() );

		YCFGenKbGelIteratorByEmptyIdxKey existingKeyEmptyIdx = schema.getFactoryGelIterator().newEmptyIdxKey();
		existingKeyEmptyIdx.setOptionalExpandEmpty( existing.getOptionalExpandEmpty() );

		YCFGenKbGelIteratorByEmptyIdxKey newKeyEmptyIdx = schema.getFactoryGelIterator().newEmptyIdxKey();
		newKeyEmptyIdx.setOptionalExpandEmpty( Buff.getOptionalExpandEmpty() );

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
						"updateGelIterator",
						"Superclass",
						"SuperClass",
						"GelInstruction",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByBeforeIdx.get( existingKeyBeforeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByBeforeIdx.containsKey( newKeyBeforeIdx ) ) {
			subdict = dictByBeforeIdx.get( newKeyBeforeIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByBeforeIdx.put( newKeyBeforeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByFirstIdx.get( existingKeyFirstIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByFirstIdx.containsKey( newKeyFirstIdx ) ) {
			subdict = dictByFirstIdx.get( newKeyFirstIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByFirstIdx.put( newKeyFirstIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByEachIdx.get( existingKeyEachIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByEachIdx.containsKey( newKeyEachIdx ) ) {
			subdict = dictByEachIdx.get( newKeyEachIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByEachIdx.put( newKeyEachIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByLastIdx.get( existingKeyLastIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByLastIdx.containsKey( newKeyLastIdx ) ) {
			subdict = dictByLastIdx.get( newKeyLastIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByLastIdx.put( newKeyLastIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByLoneIdx.get( existingKeyLoneIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByLoneIdx.containsKey( newKeyLoneIdx ) ) {
			subdict = dictByLoneIdx.get( newKeyLoneIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByLoneIdx.put( newKeyLoneIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByEmptyIdx.get( existingKeyEmptyIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByEmptyIdx.containsKey( newKeyEmptyIdx ) ) {
			subdict = dictByEmptyIdx.get( newKeyEmptyIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff >();
			dictByEmptyIdx.put( newKeyEmptyIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGelIterator( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelIteratorTable.deleteGelIterator() ";
		String classCode;
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelIteratorBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelIterator",
				pkey );
		}
		YCFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx = schema.getFactoryGelIterator().newBeforeIdxKey();
		keyBeforeIdx.setOptionalExpandBefore( existing.getOptionalExpandBefore() );

		YCFGenKbGelIteratorByFirstIdxKey keyFirstIdx = schema.getFactoryGelIterator().newFirstIdxKey();
		keyFirstIdx.setOptionalExpandFirst( existing.getOptionalExpandFirst() );

		YCFGenKbGelIteratorByEachIdxKey keyEachIdx = schema.getFactoryGelIterator().newEachIdxKey();
		keyEachIdx.setRequiredExpandEach( existing.getRequiredExpandEach() );

		YCFGenKbGelIteratorByLastIdxKey keyLastIdx = schema.getFactoryGelIterator().newLastIdxKey();
		keyLastIdx.setOptionalExpandLast( existing.getOptionalExpandLast() );

		YCFGenKbGelIteratorByLoneIdxKey keyLoneIdx = schema.getFactoryGelIterator().newLoneIdxKey();
		keyLoneIdx.setOptionalExpandLone( existing.getOptionalExpandLone() );

		YCFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx = schema.getFactoryGelIterator().newEmptyIdxKey();
		keyEmptyIdx.setOptionalExpandEmpty( existing.getOptionalExpandEmpty() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelIteratorBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByBeforeIdx.get( keyBeforeIdx );
		subdict.remove( pkey );

		subdict = dictByFirstIdx.get( keyFirstIdx );
		subdict.remove( pkey );

		subdict = dictByEachIdx.get( keyEachIdx );
		subdict.remove( pkey );

		subdict = dictByLastIdx.get( keyLastIdx );
		subdict.remove( pkey );

		subdict = dictByLoneIdx.get( keyLoneIdx );
		subdict.remove( pkey );

		subdict = dictByEmptyIdx.get( keyEmptyIdx );
		subdict.remove( pkey );

		schema.getTableGelInstruction().deleteGelInstruction( Authorization,
			Buff );
	}
	public void deleteGelIteratorByBeforeIdx( YCFGenKbAuthorization Authorization,
		String argExpandBefore )
	{
		YCFGenKbGelIteratorByBeforeIdxKey key = schema.getFactoryGelIterator().newBeforeIdxKey();
		key.setOptionalExpandBefore( argExpandBefore );
		deleteGelIteratorByBeforeIdx( Authorization, key );
	}

	public void deleteGelIteratorByBeforeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByBeforeIdxKey argKey )
	{
		YCFGenKbGelIteratorBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandBefore() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void deleteGelIteratorByFirstIdx( YCFGenKbAuthorization Authorization,
		String argExpandFirst )
	{
		YCFGenKbGelIteratorByFirstIdxKey key = schema.getFactoryGelIterator().newFirstIdxKey();
		key.setOptionalExpandFirst( argExpandFirst );
		deleteGelIteratorByFirstIdx( Authorization, key );
	}

	public void deleteGelIteratorByFirstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByFirstIdxKey argKey )
	{
		YCFGenKbGelIteratorBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandFirst() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void deleteGelIteratorByEachIdx( YCFGenKbAuthorization Authorization,
		String argExpandEach )
	{
		YCFGenKbGelIteratorByEachIdxKey key = schema.getFactoryGelIterator().newEachIdxKey();
		key.setRequiredExpandEach( argExpandEach );
		deleteGelIteratorByEachIdx( Authorization, key );
	}

	public void deleteGelIteratorByEachIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByEachIdxKey argKey )
	{
		YCFGenKbGelIteratorBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void deleteGelIteratorByLastIdx( YCFGenKbAuthorization Authorization,
		String argExpandLast )
	{
		YCFGenKbGelIteratorByLastIdxKey key = schema.getFactoryGelIterator().newLastIdxKey();
		key.setOptionalExpandLast( argExpandLast );
		deleteGelIteratorByLastIdx( Authorization, key );
	}

	public void deleteGelIteratorByLastIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByLastIdxKey argKey )
	{
		YCFGenKbGelIteratorBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandLast() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void deleteGelIteratorByLoneIdx( YCFGenKbAuthorization Authorization,
		String argExpandLone )
	{
		YCFGenKbGelIteratorByLoneIdxKey key = schema.getFactoryGelIterator().newLoneIdxKey();
		key.setOptionalExpandLone( argExpandLone );
		deleteGelIteratorByLoneIdx( Authorization, key );
	}

	public void deleteGelIteratorByLoneIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByLoneIdxKey argKey )
	{
		YCFGenKbGelIteratorBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandLone() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void deleteGelIteratorByEmptyIdx( YCFGenKbAuthorization Authorization,
		String argExpandEmpty )
	{
		YCFGenKbGelIteratorByEmptyIdxKey key = schema.getFactoryGelIterator().newEmptyIdxKey();
		key.setOptionalExpandEmpty( argExpandEmpty );
		deleteGelIteratorByEmptyIdx( Authorization, key );
	}

	public void deleteGelIteratorByEmptyIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByEmptyIdxKey argKey )
	{
		YCFGenKbGelIteratorBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandEmpty() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void deleteGelIteratorByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId )
	{
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		deleteGelIteratorByPIdx( Authorization, key );
	}

	public void deleteGelIteratorByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelIteratorBuff cur;
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void deleteGelIteratorByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = schema.getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelIteratorByTenantIdx( Authorization, key );
	}

	public void deleteGelIteratorByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey )
	{
		YCFGenKbGelIteratorBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void deleteGelIteratorByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelIteratorByGelCacheIdx( Authorization, key );
	}

	public void deleteGelIteratorByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey )
	{
		YCFGenKbGelIteratorBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void deleteGelIteratorByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = schema.getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( argChainInstTenantId );
		key.setOptionalChainInstGelCacheId( argChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( argChainInstGelInstId );
		deleteGelIteratorByChainIdx( Authorization, key );
	}

	public void deleteGelIteratorByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey )
	{
		YCFGenKbGelIteratorBuff cur;
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
		LinkedList<YCFGenKbGelIteratorBuff> matchSet = new LinkedList<YCFGenKbGelIteratorBuff>();
		Iterator<YCFGenKbGelIteratorBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelIteratorBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelIterator().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelIterator( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
